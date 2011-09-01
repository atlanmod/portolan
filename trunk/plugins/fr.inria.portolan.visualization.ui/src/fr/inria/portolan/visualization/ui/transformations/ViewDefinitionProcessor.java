/*******************************************************************************
 * Copyright (c) 2010 INRIA Rennes Bretagne-Atlantique.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     INRIA Rennes Bretagne-Atlantique - initial API and implementation
 *******************************************************************************/
package fr.inria.portolan.visualization.ui.transformations;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.core.service.CoreService;

import fr.inria.portolan.common.exceptions.PortolanException;
import fr.inria.portolan.common.utils.CommonUtils;

/**
 * @author <a href="mailto:Vincent.Mahe@inria.fr">Vincent Mahe</a>
 *
 */
public class ViewDefinitionProcessor {
	
	private static IInjector xmiInjector;
	private static IExtractor xmiExtractor;

	private static String VM_NAME			= "EMF-specific VM";
	private static String MODEL_KIND		= "EMF";
	
	public ViewDefinitionProcessor() {
		super();
	}
	
	static {

		try {
			xmiInjector = CoreService.getInjector(MODEL_KIND);
			xmiExtractor = CoreService.getExtractor(MODEL_KIND);
			
		} catch (ATLCoreException e) {
			e.printStackTrace();
		}
	}

	public IFile perform(IFile inFile,
						 String cartoMetamodelUri,
						 String metamodelID,
						 String destDir,
						 String postName,
						 String transfoPath, 
						 String pluginId)
			throws PortolanException {
		
		String inFileName = inFile.getFullPath()
									.removeFileExtension()
									.lastSegment();
		String extension = inFile.getFullPath().getFileExtension();
		String outFileName = inFileName
									+ postName
									+ "." + extension;

		String outFileUri = destDir
							+ System.getProperty("file.separator")
							+ outFileName;
		
		// process successive transformations (composite filter)
		String[] transformations = transfoPath.split(",");
		int n = transformations.length;
		String tmpFilePath = destDir
							+ System.getProperty("file.separator")
							+ inFileName + postName;

		try {
	
			for (int i = 0; i < n; i++) {
				String inModelPath = ( i == 0 ? inFile.getFullPath().toString()
											: tmpFilePath+ (i - 1) + "." + extension);
				String outModelPath = ( i != (n - 1) ? tmpFilePath + i + "." + extension
											: outFileUri);
				
				ModelFactory factory = CoreService.getModelFactory(MODEL_KIND);
				
				ILauncher launcher = CoreService.getLauncher(VM_NAME);
				launcher.initialize(Collections.<String, Object> emptyMap()) ;
				
				IReferenceModel cartoMetamodel = factory.newReferenceModel();
				xmiInjector.inject(cartoMetamodel, cartoMetamodelUri);

				IModel inModel = factory.newModel(cartoMetamodel);
				xmiInjector.inject(inModel, inModelPath);
	
				IModel outModel = factory.newModel(cartoMetamodel);
				
				launcher.addInModel(inModel, "IN", metamodelID);
				launcher.addOutModel(outModel, "OUT", metamodelID);
				
				// some interesting options
				Map<String, Object> options = new HashMap<String, Object>();
				options.put("continueAfterError", "true");
				options.put("printExecutionTime", "true");
//				options.put("allowInterModelReferences", "true");
				
				// manage also refining transformations
				IReferenceModel refiningTraceMetamodel = 
					factory.getBuiltInResource("RefiningTrace.ecore");
				IModel refiningTraceModel = factory.newModel(refiningTraceMetamodel);
				launcher.addOutModel(refiningTraceModel, "refiningTrace", "RefiningTrace");
				
				// launch the transformation
				// if pluginId == null then the transformation is embedded in a project
				URL transfoURL =null;
				if (pluginId == null){
					IProject project = CommonUtils.getWorkspaceReferencedProject();
					IFile transfo = project.getFile(transformations[i]);
					transfoURL = transfo.getLocationURI().toURL();
				}else{
					transfoURL = Platform.getBundle(pluginId).getEntry(transfoPath);
				}
				
				InputStream is = transfoURL.openStream();
				launcher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(),
								options, is);
	
				xmiExtractor.extract(outModel, outModelPath);
			}

		} catch (ATLCoreException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(outFileUri));
	}
}
