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

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;

import fr.inria.portolan.common.ui.Activator;
import fr.inria.portolan.common.ui.handlers.SwitchPortolanNature;
import fr.inria.portolan.common.utils.CommonUtils;

/**
 * @author <a href="mailto:Vincent.Mahe@inria.fr">Vincent Mahe</a>
 *
 */
public class NewPortolanProjectWizard extends AbstractNewProjectWizard {

	public final static String ID = "fr.inria.portolan.common.ui.wizards.NewProjectWizard";
	public static final String ZIP_LOCATION = "zip/fr.inria.portolan.usecase.template.project.zip";
	
	private NewProjectWizardPage page;
	public final static String PAGE_NAME = "NewPortolanProjectPage";
	private final static String PAGE_TITLE = "New Portolan Project";
	private final static String PAGE_DESCR = "Create a new project in workspace with Portolan parameters";
	
	public NewPortolanProjectWizard() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		descriptor = new ProjectDescriptor(Activator.ID, ZIP_LOCATION);
		
		/*
		 * elements to manage in the wizard:
		 * 	- ask if it is the referenced project -> set preferences	DONE
		 * 		(mandatory if no project has been referenced)
		 * 	- add Portolan nature
		 * 	- install sample MM + M
		 * 	- set MM + M in project properties
		 * 	- ask if MM(s) should be registered at build -> set properties
		 * 	- install sample view def
		 */
		project = page.getProjectHandle();
		
		// run the Abstract perform()
		super.performFinish();
		
		// manage referent project
		if (page.isReferentProject())
			CommonUtils.setWorkspaceReferencedProjectPath(project.getFullPath().toString());

		// manage project properties
		try {
			IResource metamodel = null;
			IResource model = null;
			IResource[] mmMembers = project.getFolder("Metamodel").members();
			for (int i = 0; i < mmMembers.length; i++) {
				if (mmMembers[i].getFileExtension().equals("ecore")) {
					metamodel = mmMembers[i];
					break;
				}
			}
			IResource[] mMembers = project.getFolder("Model").members();
			for (int i = 0; i < mMembers.length; i++) {
				if (mMembers[i].getFileExtension().equals("xmi")) {
					model = mMembers[i];
					break;
				}
			}
			CommonUtils.setReferentProjectMetamodelPath(metamodel.getFullPath().toString());
			CommonUtils.setReferentProjectModelPath(model.getFullPath().toString());
		} catch (Exception e) { }
		
		// add Portolan nature
		SwitchPortolanNature switchNature = new SwitchPortolanNature();
		switchNature.toggle(project);
		
		// then force a refresh of View Definitions in VDsBar
		try {
			project.build(IncrementalProjectBuilder.CLEAN_BUILD, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
		return true;
	}

	public void addPages() {
		page = new NewProjectWizardPage(PAGE_NAME);
		page.setTitle(PAGE_TITLE);
		page.setDescription(PAGE_DESCR);
		addPage(page);
	}
}
