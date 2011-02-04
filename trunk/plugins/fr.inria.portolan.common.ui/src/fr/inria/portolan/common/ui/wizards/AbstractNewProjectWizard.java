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
package fr.inria.portolan.common.ui.wizards;

import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import fr.inria.portolan.common.ui.utils.ZipProjectContent;

/**
 * @author <a href="mailto:Vincent.Mahe@inria.fr">Vincent Mahe</a>
 *
 */
public class AbstractNewProjectWizard extends Wizard implements INewWizard {

	public class ProjectDescriptor {
		private String bundleID;
		private String zipPath;
		
		public ProjectDescriptor(String bundle, String zip) {
			bundleID = bundle;
			zipPath = zip;
		}
		
		public String getBundleID() {
			return bundleID;
		}
		
		public String getZipPath() {
			return zipPath;
		}
	}
	
	protected IProject project;
	protected ProjectDescriptor descriptor;
	
	/**
	 * 
	 */
	public AbstractNewProjectWizard() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	/**
	 * Any concrete NewWizard must affect the project and the descriptor
	 * and then run super.performFinish()
	 */
	@Override
	public boolean performFinish() {
		
		/*
		 * elements to manage in the wizard:
		 * 	- create folders
		 */
		
		try {
			NullProgressMonitor monitor = new NullProgressMonitor();
			project.create(monitor);
			project.open(monitor);
			
			// create default sample content
			ZipProjectContent content = new ZipProjectContent(
					descriptor.getBundleID(),
					descriptor.getZipPath());
			content.unZipContent(project);
			
			
		} catch (CoreException ce) {
			ce.printStackTrace();
			return true;
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return true;
		}
		return true;
	}
}
