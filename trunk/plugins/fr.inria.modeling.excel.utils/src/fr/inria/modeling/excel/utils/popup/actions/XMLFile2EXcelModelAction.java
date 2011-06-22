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
package fr.inria.modeling.excel.utils.popup.actions;

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
import org.eclipse.m2m.atl.projectors.xml.XMLInjector;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

/**
 * @author <a href="mailto:Vincent.Mahe@inria.fr">Vincent Mahe</a>
 *
 */
public class XMLFile2EXcelModelAction implements IObjectActionDelegate {

	private IInjector xmiInjector;
	private IExtractor xmiExtractor;
	private IInjector xmlInjector;
	
	private static String MODEL_KIND = "EMF";
	private static String XML_MM_URI = "http://www.eclipse.org/XML";
	
	private IFile inputFile;
	
	/**
	 * Constructor.
	 */
	public XMLFile2EXcelModelAction() {
		super();
		try {
			xmiInjector = CoreService.getInjector(MODEL_KIND);
			xmiExtractor = CoreService.getExtractor(MODEL_KIND);
			xmlInjector = new XMLInjector();
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
									.toString();
		
		IFile xmlModel = perform(inputFile, destDir);
		
		XMLModel2ExcelModelAction xml2excel = new XMLModel2ExcelModelAction();
		xml2excel.perform(xmlModel, destDir, "xmi");
		
		try {
			inputFile.getParent().refreshLocal(IResource.DEPTH_ONE, null);
		
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Perform XML model injection from given XML file
	 * @param inFile
	 * @param destDir
	 * @return corresponding model
	 */
	public IFile perform(IFile inFile, String destDir) {
		String outFileName = inFile.getFullPath()
									.removeFileExtension()
									.lastSegment()
							+ "_XML"
							+ ".xmi";
		
		String outFileUri = destDir
							+ System.getProperty("file.separator")
							+ outFileName;
		
		try {
			ModelFactory factory = CoreService.getModelFactory(MODEL_KIND);
			
			IReferenceModel xmlMetamodel = factory.newReferenceModel();
			xmiInjector.inject(xmlMetamodel, XML_MM_URI);
			
			IModel xmlModel = factory.newModel(xmlMetamodel);
			
			// XML injector considers only root filesystem
			xmlInjector.inject(xmlModel, inFile.getLocation().toString());
			
			xmiExtractor.extract(xmlModel, outFileUri);
			
		} catch (ATLCoreException e) {
			e.printStackTrace();
		}
		
		return ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(outFileUri));
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

}
