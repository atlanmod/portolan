/*******************************************************************************
 * Copyright (c) 2009, 2011 INRIA Rennes Bretagne-Atlantique and others.
 *
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   INRIA Rennes Bretagne-Atlantique - Initial API and implementation
 ******************************************************************************/

package fr.inria.portolan.visualization.prefuse.actions;

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
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.presentation.EcoreActionBarContributor.ExtendedLoadResourceAction.ExtendedLoadResourceDialog;
import org.eclipse.emf.common.util.URI;
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
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class Cartography2GraphMLAction implements IObjectActionDelegate {

	private Shell shell;
	
	private static IInjector xmiInjector;
	private static IExtractor xmiExtractor;
	private static URL transfoURL;

	private static String BUNDLE_NAME		= "fr.inria.portolan.visualization.prefuse";
	private static String VM_NAME			= "EMF-specific VM";
	private static String MODEL_KIND		= "EMF";
	private static String CARTO_MM_ID		= "Cartography";
	private static String GRAPHML_MM_URI	= "http://modeling.inria.fr/GraphML";
	private static String GRAPHML_MM_ID		= "GraphML";
	private static String ATL_BIN			= "Cartography2GraphMLSingle.asm";

	private IFile inputFile;

	/**
	 * Constructor for Action1.
	 */
	public Cartography2GraphMLAction() {
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

	public class URIDialog extends ExtendedLoadResourceDialog {

		public URIDialog(Shell parent) {
			super(parent, null);
		}
	}
	
	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		String destDir = inputFile.getFullPath()
									.removeLastSegments(1)
									.toString();
		
		String cartoMetamodelUri = "";
		URIDialog dialog = new URIDialog(shell);
	    if (dialog.open() == URIDialog.CANCEL)
	    	return;
	    URI modelUri = dialog.getURIs().get(0);
	    cartoMetamodelUri = modelUri.toString();

		perform(inputFile, cartoMetamodelUri, destDir, "xmi", new NullProgressMonitor());

		try {
			inputFile.getParent().refreshLocal(IResource.DEPTH_ONE, null);
			
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	public IFile perform(IFile inFile,
						String cartoMetamodelUri,
						String destDir,
						String extension,
						IProgressMonitor monitor) {
		String outFileName = inFile.getFullPath()
									.removeFileExtension()
									.lastSegment()
									+ "_GraphML"
									+ "." + extension;

		String outFileUri = destDir
							+ System.getProperty("file.separator")
							+ outFileName;

		try {
			ModelFactory factory = CoreService.getModelFactory(MODEL_KIND);
			
			ILauncher launcher = CoreService.getLauncher(VM_NAME);
			launcher.initialize(Collections.<String, Object> emptyMap()) ;
			
			IReferenceModel cartoMetamodel = factory.newReferenceModel();
			xmiInjector.inject(cartoMetamodel, cartoMetamodelUri);

			IModel cartoModel = factory.newModel(cartoMetamodel);
			xmiInjector.inject(cartoModel, inFile.getFullPath().toString());

			IReferenceModel graphmlMetamodel = factory.newReferenceModel();
			xmiInjector.inject(graphmlMetamodel, GRAPHML_MM_URI);

			IModel graphmlModel = factory.newModel(graphmlMetamodel);
			
			launcher.addInModel(cartoModel, "IN", CARTO_MM_ID);
			launcher.addOutModel(graphmlModel, "OUT", GRAPHML_MM_ID);
			
			// some interesting options
			Map<String, Object> options = new HashMap<String, Object>();
			options.put("continueAfterError", "true");
			options.put("printExecutionTime", "true");
			
			// launch the transformation
			InputStream is = transfoURL.openStream();
			launcher.launch(ILauncher.RUN_MODE, monitor,
							options, is);

			xmiExtractor.extract(graphmlModel, outFileUri);
			monitor.worked(1);

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
