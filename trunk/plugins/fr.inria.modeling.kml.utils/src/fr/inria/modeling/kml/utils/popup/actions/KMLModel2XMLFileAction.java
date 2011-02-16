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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.service.CoreService;
import org.eclipse.m2m.atl.projectors.xml.XMLExtractor;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

/**
 * @author <a href="mailto:Vincent.Mahe@inria.fr">Vincent Mahe</a>
 *
 */
public class KMLModel2XMLFileAction implements IObjectActionDelegate {
	
	private IInjector xmiInjector;
	private IExtractor xmlExtractor;
	
	private static String MODEL_KIND = "EMF";
	private static String XML_MM_URI = "http://www.eclipse.org/XML";

	private IFile inputFile;
	
	/**
	 * Constructor.
	 */
	public KMLModel2XMLFileAction() {
		super();
		try {
			xmiInjector = CoreService.getInjector(MODEL_KIND);
			xmlExtractor = new XMLExtractor();
		} catch (ATLCoreException e) {
			e.printStackTrace();
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {
		String destDir = inputFile.getFullPath()
									.removeLastSegments(1)
									.toOSString();
		perform(inputFile, destDir, "graphml");
		
		try {
			inputFile.getParent().refreshLocal(IResource.DEPTH_ONE, null);
		
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		IStructuredSelection currentSelection = (IStructuredSelection)selection;
		inputFile = (IFile) currentSelection.getFirstElement();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IObjectActionDelegate#setActivePart(org.eclipse.jface.action.IAction, org.eclipse.ui.IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	/**
	 * @param inFile an EMF model conforming to the XML metamodel
	 * @param destDir
	 * @return the XML file corresponding to the GraphML model
	 */
	public IFile perform(IFile inFile, String destDir, String extension) {
		if (extension == null)
			extension = "xml";
		String outFileName = inFile.getFullPath()
									.removeFileExtension()
									.addFileExtension(extension)
									.lastSegment();
		
		String outFileUri = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString()
							+ destDir
							+ "/"
							+ outFileName;

		KMLModel2XMLModelAction kml2xml = new KMLModel2XMLModelAction();
		IFile xmlModelFile = kml2xml.perform(inFile, destDir, "xmi");
		
		// take file storing the XML model and transform it to textual XML
		try {
			ModelFactory factory = CoreService.getModelFactory(MODEL_KIND);
			
			IReferenceModel xmlMetamodel = factory.newReferenceModel();
			xmiInjector.inject(xmlMetamodel, XML_MM_URI);
			
			IModel xmlModel = factory.newModel(xmlMetamodel);
			
			xmiInjector.inject(xmlModel, xmlModelFile.getFullPath().toOSString());
			
			xmlExtractor.extract(xmlModel, outFileUri);
		} catch (ATLCoreException e) {
			e.printStackTrace();
		}
		
		return ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(outFileUri));
	}

}
