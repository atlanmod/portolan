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
package fr.inria.modeling.kml.utils.popup.actions;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.core.service.CoreService;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

/**
 * @author <a href="mailto:Vincent.Mahe@inria.fr">Vincent Mahe</a>
 *
 */
public class KMLModel2XMLModelAction implements IObjectActionDelegate {

	private static IInjector xmiInjector;
	private static IExtractor xmiExtractor;
	private static URL transfoURL;

	private static String BUNDLE_NAME	= "fr.inria.modeling.kml.utils";
	private static String VM_NAME		= "EMF-specific VM";
	private static String MODEL_KIND	= "EMF";
	private static String XML_MM_URI	= "http://www.eclipse.org/XML";
	private static String XML_MM_ID		= "XML";
	private static String KML_MM_URI	= "http://www.opengis.net/kml/2.2";
	private static String KML_MM_ID		= "KML";
	private static String ATL_BIN		= "KML2XML.asm";

	private IFile inputFile;

	/**
	 * Constructor for Action1.
	 */
	public KMLModel2XMLModelAction() {
		super();
	}
	
	static {
		transfoURL = Platform.getBundle(BUNDLE_NAME).getEntry("transformation/" + ATL_BIN);

		try {
			xmiInjector = CoreService.getInjector(MODEL_KIND);
			xmiExtractor = CoreService.getExtractor(MODEL_KIND);
			
		} catch (ATLCoreException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		String destDir = inputFile.getFullPath()
									.removeLastSegments(1)
									.toString();
		perform(inputFile, destDir, "xmi");

		try {
			inputFile.getParent().refreshLocal(IResource.DEPTH_ONE, null);
			
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	public IFile perform(IFile inFile, String destDir, String extension) {
		String outFileName = inFile.getFullPath()
									.removeFileExtension()
									.lastSegment()
									+ "_XML"
									+ "." + extension;

		String outFileUri = destDir
							+ "/"
							+ outFileName;

		try {
			ModelFactory factory = CoreService.getModelFactory(MODEL_KIND);
			
			ILauncher launcher = CoreService.getLauncher(VM_NAME);
			launcher.initialize(Collections.<String, Object> emptyMap()) ;

			IReferenceModel kmlMetamodel = factory.newReferenceModel();
			xmiInjector.inject(kmlMetamodel, KML_MM_URI);

			IModel kmlModel = factory.newModel(kmlMetamodel);
			xmiInjector.inject(kmlModel, inFile.getFullPath().toString());

			IReferenceModel xmlMetamodel = factory.newReferenceModel();
			xmiInjector.inject(xmlMetamodel, XML_MM_URI);

			IModel xmlModel = factory.newModel(xmlMetamodel);
			
			launcher.addInModel(kmlModel, "IN", KML_MM_ID);
			launcher.addOutModel(xmlModel, "OUT", XML_MM_ID);
			
			// some interesting options
			Map<String, Object> options = new HashMap<String, Object>();
			options.put("continueAfterError", "true");
			options.put("printExecutionTime", "true");
			
			// launch the transformation
			InputStream is = transfoURL.openStream();
			launcher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(),
							options, is);

			xmiExtractor.extract(xmlModel, outFileUri);

		} catch (ATLCoreException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(outFileUri));
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		IStructuredSelection currentSelection = (IStructuredSelection)selection;
		inputFile = (IFile) currentSelection.getFirstElement();
	}

}
