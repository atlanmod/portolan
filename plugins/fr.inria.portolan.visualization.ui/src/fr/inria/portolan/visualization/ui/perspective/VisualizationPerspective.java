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

package fr.inria.portolan.visualization.ui.perspective;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import fr.inria.portolan.visualization.ui.bar.VDsSideBar;

public class VisualizationPerspective implements IPerspectiveFactory {
	
	public static final String ID = "fr.inria.portolan.visualization.ui.perspective";

	public void createInitialLayout(IPageLayout layout) {
		defineActions(layout);
		defineLayout(layout);
	}
	
	public void defineActions(IPageLayout layout) {
		layout.addNewWizardShortcut("fr.inria.portolan.common.ui.wizards.NewProjectWizard");
		layout.addNewWizardShortcut("fr.inria.portolan.extensions.examples.tools.cartography.wizard");
	}
	
	public void defineLayout(IPageLayout layout) {
		layout.addStandaloneView(
				VDsSideBar.ID,
				false,				// no title => no handles
				IPageLayout.LEFT,
				0.15f, 				// no way to set the bar's width
				layout.getEditorArea());
		
		layout.addNewWizardShortcut("fr.inria.portolan.common.ui.wizards.NewProjectWizard");
		layout.addNewWizardShortcut("fr.inria.portolan.extensions.examples.tools.cartography.wizard");
		
		layout.setFixed(true);
	}
}
