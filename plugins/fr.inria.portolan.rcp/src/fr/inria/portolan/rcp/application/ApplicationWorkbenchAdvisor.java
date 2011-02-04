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

package fr.inria.portolan.rcp.application;

import java.net.URL;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.IWorkbenchConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
import org.eclipse.ui.internal.ide.model.WorkbenchAdapterBuilder;
import org.eclipse.ui.navigator.resources.ProjectExplorer;
import org.osgi.framework.Bundle;

public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor {

	// the default perspective is the Portolan Visualization perspective
	private static final String PERSPECTIVE_ID = "fr.inria.portolan.visualization.ui.perspective";
//	private static final String PERSPECTIVE_ID = "org.eclipse.m2m.atl.adt.ui.atlPerspective";

	public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(
				IWorkbenchWindowConfigurer configurer) {
		return new ApplicationWorkbenchWindowAdvisor(configurer);
	}
    
	public void initialize(IWorkbenchConfigurer configurer) {
		super.initialize(configurer);
		
		configurer.setSaveAndRestore(true);

		// activate IDE actions (SAVE, OPEN_WORKSPACE,...)
		IDE.registerAdapters();
		
		// all this stuff to get proper icons in project Explorer
		final String ICONS_PATH = "icons/full/";
		final String PATH_OBJECT = ICONS_PATH + "obj16/";
		@SuppressWarnings("restriction")
		Bundle ideBundle = Platform.getBundle(IDEWorkbenchPlugin.IDE_WORKBENCH);
		declareWorkbenchImage(configurer, ideBundle,
				IDE.SharedImages.IMG_OBJ_PROJECT, PATH_OBJECT + "prj_obj.gif",
				true);
		declareWorkbenchImage(configurer, ideBundle,
				IDE.SharedImages.IMG_OBJ_PROJECT_CLOSED, PATH_OBJECT
						+ "cprj_obj.gif", true);

	}

	private void declareWorkbenchImage(IWorkbenchConfigurer configurer_p,
			Bundle ideBundle, String symbolicName, String path, boolean shared) {
		URL url = ideBundle.getEntry(path);
		ImageDescriptor desc = ImageDescriptor.createFromURL(url);
		configurer_p.declareImage(symbolicName, desc, shared);
	}

	public void preStartup() {
		// activate IDE actions (SAVE, OPEN_WORKSPACE,...)
		IDE.registerAdapters();
	}
	
	public String getInitialWindowPerspectiveId() {
		return PERSPECTIVE_ID;
	}
	
	@Override
	public void postStartup() {

		super.postStartup();
		IWorkbenchWindow[] workbenchs =
		PlatformUI.getWorkbench().getWorkbenchWindows();
	
		ProjectExplorer view = null;
		for (IWorkbenchWindow workbench : workbenchs) {
			for (IWorkbenchPage page : workbench.getPages()) {
				view = (ProjectExplorer)
				page.findView("org.eclipse.ui.navigator.ProjectExplorer");
				break;
			}
		}
	
		if (view == null) {
			return;
		}
	
		view.getCommonViewer().setInput(ResourcesPlugin.getWorkspace ().getRoot());

	}
}
