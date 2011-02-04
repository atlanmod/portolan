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

package fr.inria.portolan.visualization.linlog.actions;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
import org.eclipse.emf.common.ui.dialogs.ResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.core.service.CoreService;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class Cartography2L3Action implements IObjectActionDelegate {

	private Shell shell;
	
	private static IInjector xmiInjector;
//	private static IExtractor xmiExtractor;
	private static URL transfoURL;

	private static String BUNDLE_NAME		= "fr.inria.portolan.visualization.linlog";
	private static String VM_NAME			= "EMF-specific VM";
	private static String MODEL_KIND		= "EMF";
	private static String CARTO_MM_ID		= "Cartography";
//	private static String GRAPHML_MM_URI	= "http://modeling.inria.fr/GraphML";
//	private static String GRAPHML_MM_ID		= "GraphML";
	private static String ATL_BIN			= "Cartography2L3.asm";

	private IFile inputFile;

	/**
	 * Constructor for Action1.
	 */
	public Cartography2L3Action() {
		super();
	}
	
	static {
		transfoURL = Platform.getBundle(BUNDLE_NAME).getEntry("transformation/" + ATL_BIN);

		try {
			xmiInjector = CoreService.getInjector(MODEL_KIND);
//			xmiExtractor = CoreService.getExtractor(MODEL_KIND);
			
		} catch (ATLCoreException e) {
			e.printStackTrace();
		}
	}

	public class URIDialog extends ResourceDialog {

		public URIDialog(Shell parent, String title, int style) {
			super(parent, title, style);
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
									.toOSString();
		
		String cartoMetamodelUri = "";
		ResourceDialog dialog = new ResourceDialog(shell, "Select your Cartography metamodel", SWT.OPEN | SWT.SINGLE);
	    if (dialog.open() == ResourceDialog.CANCEL)
	    	return;
	    URI modelUri = dialog.getURIs().get(0);
	    cartoMetamodelUri = modelUri.toPlatformString(true);

		perform(inputFile, cartoMetamodelUri, destDir, "l3");

		try {
			inputFile.getParent().refreshLocal(IResource.DEPTH_ONE, null);
			
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	public IFile perform(IFile inFile, String cartoMetamodelUri, String destDir, String extension) {
		String outFileName = inFile.getFullPath()
									.removeFileExtension()
									.lastSegment()
									+ "_LinLog"
									+ "." + extension;

		String outFileUri = destDir
							+ System.getProperty("file.separator")
							+ outFileName;

		IFile outFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(outFileUri));
		
		try {
			ModelFactory factory = CoreService.getModelFactory(MODEL_KIND);
			
			ILauncher launcher = CoreService.getLauncher(VM_NAME);
			launcher.initialize(Collections.<String, Object> emptyMap()) ;
			
			IReferenceModel cartoMetamodel = factory.newReferenceModel();
			xmiInjector.inject(cartoMetamodel, cartoMetamodelUri);

			IModel cartoModel = factory.newModel(cartoMetamodel);
			xmiInjector.inject(cartoModel, inFile.getFullPath().toString());

//			IReferenceModel graphmlMetamodel = factory.newReferenceModel();
//			xmiInjector.inject(graphmlMetamodel, GRAPHML_MM_URI);
//
//			IModel graphmlModel = factory.newModel(graphmlMetamodel);
			
			launcher.addInModel(cartoModel, "IN", CARTO_MM_ID);
//			launcher.addOutModel(graphmlModel, "OUT", GRAPHML_MM_ID);
			
			// some interesting options
			Map<String, Object> options = new HashMap<String, Object>();
			options.put("continueAfterError", "true");
			options.put("printExecutionTime", "true");
			
			// launch the transformation
			InputStream is = transfoURL.openStream();
			Object transfoReturn = launcher.launch(ILauncher.RUN_MODE,
							new NullProgressMonitor(),
							options, is);
			
			// save the result in text file
			PrintWriter outFileWriter = new PrintWriter(outFile.getLocation().toString());
			outFileWriter.print((String)transfoReturn);
			outFileWriter.close();

		} catch (ATLCoreException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return outFile;
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		IStructuredSelection currentSelection = (IStructuredSelection)selection;
		inputFile = (IFile) currentSelection.getFirstElement();
	}

}
