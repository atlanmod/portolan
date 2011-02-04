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

import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.NewWizardMenu;

public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

	private IAction printAction;
	private IAction exitAction;
	
	private NewWizardMenu newWizardMenu;
	
	public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
		super(configurer);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.application.ActionBarAdvisor#makeActions(org.eclipse.ui.IWorkbenchWindow)
	 */
	@Override
	protected void makeActions(IWorkbenchWindow window) {
		super.makeActions(window);
		printAction = ActionFactory.PRINT.create(window);
		register(printAction);
		
		exitAction = ActionFactory.QUIT.create(window);
		
		newWizardMenu = new NewWizardMenu(window);
	}
	
	protected void fillMenuBar(IMenuManager menuBar) {
		// add menu File & Edit (needed by Ecore Diagram Editor: it inserts entries in Edit and Print submenus)
		MenuManager fileMenu = new MenuManager("File", IWorkbenchActionConstants.M_FILE);
		menuBar.add(fileMenu);
        {
            // create the New submenu, using the same id for it as the New action
            String newId = ActionFactory.NEW.getId();
            MenuManager newMenu = new MenuManager("&New...", newId);
            newMenu.setActionDefinitionId("org.eclipse.ui.file.newQuickMenu");
            newMenu.add(this.newWizardMenu);
            fileMenu.add(newMenu);
        }
//		fileMenu.add(newWizardMenu);
		fileMenu.add(printAction);
		fileMenu.add(exitAction);
		
		MenuManager editMenu = new MenuManager("Edit", IWorkbenchActionConstants.M_EDIT);
		menuBar.add(editMenu);
	}
}
