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
package fr.inria.portolan.extensions.examples;

import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

import fr.inria.portolan.common.ui.handlers.SwitchPortolanNature;
import fr.inria.portolan.common.ui.wizards.AbstractNewProjectWizard;
import fr.inria.portolan.common.utils.CommonUtils;

/**
 * @author <a href="mailto:Vincent.Mahe@inria.fr">Vincent Mahe</a>
 *
 */
public class ToolCartographyNewWizard extends AbstractNewProjectWizard {

	private static final String BUNDLE_ID = "fr.inria.portolan.extensions.examples";
	private static final String ZIP_LOCATION = "zip/fr.inria.portolan.example.toolcartography.zip";
	private static final String PROJECT_NAME = "fr.inria.portolan.example.toolcartography";


	public boolean performFinish() {
		descriptor = new ProjectDescriptor(BUNDLE_ID, ZIP_LOCATION);
		
		project = ResourcesPlugin.getWorkspace().getRoot().getProject(PROJECT_NAME);
		
		super.performFinish();
		
		// enforce this example as the referent project
		CommonUtils.setWorkspaceReferencedProjectPath(project.getFullPath().toString());
		
		// add Portolan nature (was not restored from .project file)
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
}
