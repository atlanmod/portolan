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
 
package fr.inria.portolan.common.ui.preferences;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

import fr.inria.portolan.common.build.PortolanNature;
import fr.inria.portolan.common.exceptions.PortolanInitializationException;
import fr.inria.portolan.common.utils.CommonUtils;

public class PortolanPreferencePage extends PreferencePage implements
		IWorkbenchPreferencePage {

	public static final String ID = "fr.inria.portolan.common.ui.preferences.PortolanPreferencePage";
	
	public static final String PAGE_TITLE = "Portolan Visualization Preferences";

	private static final int PATH_FIELD_WIDTH = 75;

	private static final String DEFAULT_PROJECT_PATH = "";
	public static final String PROJECT_PATH_LABEL = "Cartography project";
	protected static final String PROJECT_SELECTION_LABEL = "Select the Active Portolan Project";

	private Shell shell;
	static Text projectPathText;
	
	public PortolanPreferencePage() {
		super();
		setDescription(PAGE_TITLE);
	}

	public void init(IWorkbench workbench) {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.PreferencePage#createContents(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createContents(Composite parent) {
		noDefaultAndApplyButton();
		
		shell = parent.getShell();
		
		Composite panel = new Composite(parent, SWT.NONE);
		
		GridLayout layout = new GridLayout();
		panel.setLayout(layout);
		
		GridData dataLayout = new GridData(GridData.FILL);
		dataLayout.grabExcessHorizontalSpace = true;
		panel.setLayoutData(dataLayout);
		
		addPortolanProjectPath(panel);
		
		return null;
	}

	/**
	 * @param parent
	 */
	private void addPortolanProjectPath(Composite parent) {
		Composite line = createLabelTextLine(parent);

		Label projectPathLabel = new Label(line, SWT.NONE);
		projectPathLabel.setText(PROJECT_PATH_LABEL);

		projectPathText = new Text(line, SWT.READ_ONLY);
		GridData layoutData = new GridData();
		layoutData.widthHint = convertWidthInCharsToPixels(PATH_FIELD_WIDTH);
		projectPathText.setLayoutData(layoutData);
		projectPathText.setVisible(true);
		String projectPathValue;
		try {
			projectPathValue = CommonUtils.getWorkspaceReferencedProjectPath();
			projectPathText.setText(projectPathValue);
		} catch (PortolanInitializationException e1) {
			projectPathText.setText(DEFAULT_PROJECT_PATH);
		}
		
        Button projectPathButton = new Button(line, SWT.PUSH);
		projectPathButton.setText("...");
		projectPathButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				selectProjectPath(PROJECT_SELECTION_LABEL);
			}
		});
		projectPathButton.setEnabled(isValid());
	}

	private Composite createLabelTextLine(Composite parent) {
		Composite composite = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		composite.setLayout(layout);

		GridData data = new GridData();
		data.verticalAlignment = GridData.FILL;
		data.horizontalAlignment = GridData.FILL;
		composite.setLayoutData(data);

		return composite;
	}

	protected void selectProjectPath(String projectSelectionLabel) {
		ElementTreeSelectionDialog dialog;
		
		dialog = new ElementTreeSelectionDialog(shell,
				new WorkbenchLabelProvider(),
				new BaseWorkbenchContentProvider());
		dialog.setTitle(projectSelectionLabel);
		dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
		
		int result = dialog.open();
		if (result == ElementTreeSelectionDialog.OK)
			projectPathText.setText(((IProject) dialog.getResult()[0]).getFullPath().toString());
	}

	public boolean performOk() {
		try {
			CommonUtils.setWorkspaceProperty(
					CommonUtils.PROJECT_PATH_FIELD,
					projectPathText.getText());
			
			// now the new project is stored, we must clean up view definitions from former project
			// and then build the new project to get its own view definitions
			IProject project = CommonUtils.getWorkspaceReferencedProject();
			
			// add it the Portolan nature if not present
			if (project.getNature(PortolanNature.ID) == null)
				CommonUtils.togglePortolanNature(project);
			
			project.build(IncrementalProjectBuilder.CLEAN_BUILD, null);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
}
