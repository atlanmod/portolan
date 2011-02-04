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
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.atl.projectors.ui.xml.popup.actions.ExtractorAction;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

/**
 * @author <a href="mailto:Vincent.Mahe@inria.fr">Vincent Mahe</a>
 *
 */
public class KMLModel2XMLFileAction implements IObjectActionDelegate {

	private IFile inputFile;

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
		KMLModel2XMLModelAction kml2xml = new KMLModel2XMLModelAction();
		IFile xmlModel = kml2xml.perform(inFile, destDir, "xmi");
		
		ExtractorAction xmlExtraction = new ExtractorAction();
		return xmlExtraction.perform(xmlModel, destDir, extension);
	}

}
