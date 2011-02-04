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

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

import fr.inria.portolan.common.exceptions.PortolanInitializationException;
import fr.inria.portolan.common.utils.CommonUtils;

/**
 * @author <a href="mailto:Vincent.Mahe@inria.fr">Vincent Mahe</a>
 *
 */
public class NewProjectWizardPage extends WizardNewProjectCreationPage implements Listener {

	private Button checkBoxReferent;
	
	/**
	 * @param pageName
	 */
	public NewProjectWizardPage(String pageName) {
		super(pageName);
	}
	
	public void createControl(Composite parent) {
		
		super.createControl(parent);
		Composite container = (Composite)getControl();
	 	
		
		
		// if no referent project, the new one must be referent
		Group referentGroup = new Group(container, SWT.NONE);
		referentGroup.setLayout(new GridLayout());
		referentGroup.setText("Portolan referent project");
		referentGroup.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL |
	         GridData.HORIZONTAL_ALIGN_FILL));
		checkBoxReferent = new Button(referentGroup, SWT.CHECK);
		checkBoxReferent.setText("This project is Portolan referent project");
		checkBoxReferent.setSelection(true);
		try {
			if (CommonUtils.getWorkspaceReferencedProjectPath().isEmpty()) {
				checkBoxReferent.setEnabled(false);
			}
		} catch (PortolanInitializationException e) {
			checkBoxReferent.setEnabled(false);
		}
		
		validate();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.swt.widgets.Listener#handleEvent(org.eclipse.swt.widgets.Event)
	 */
	public void handleEvent(Event event) {
		// TODO Auto-generated method stub
		
	}

	public boolean isReferentProject() {
		return checkBoxReferent.getSelection();
	}
	
	private void validate() {
		if (true)
			setError("error message");
		
		
		
		setError(null);
	}
	private void setError(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}
}
