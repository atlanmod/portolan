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
 
package fr.inria.portolan.common.ui.properties;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.ui.dialogs.ResourceDialog;
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
import org.eclipse.ui.dialogs.PropertyPage;
import org.eclipse.emf.ecore.presentation.EcoreActionBarContributor.ExtendedLoadResourceAction.ExtendedLoadResourceDialog;
import org.eclipse.emf.edit.domain.EditingDomain;

import fr.inria.portolan.common.exceptions.PortolanInitializationException;
import fr.inria.portolan.common.exceptions.ProjectInitializationException;
import fr.inria.portolan.common.utils.CommonUtils;

public class ProjectPropertyPage extends PropertyPage {
	
	public static final String ID = "fr.inria.portolan.common.ui.properties.ProjectPropertyPage";
	
	private static final String METAMODEL_PATH_LABEL		= "Metamodel:";
	private static final String METAMODEL_SELECTION_LABEL	= "Select your Cartography Metamodel";
	private static final String DEFAULT_METAMODEL_PATH		= "";
	private static final String MODEL_PATH_LABEL			= "Model:";
	private static final String MODEL_SELECTION_LABEL		= "Select your Cartography Model";
	private static final String DEFAULT_MODEL_PATH			= "";
	
	private static final int PATH_FIELD_WIDTH = 75;
	
	static Text mmPathText;
	static Button mmPathButton;
	static Text mPathText;
	static Button mPathButton;
	
	private Shell shell;

	public ProjectPropertyPage() {
		super();
	}

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
		
		addCartographyMetamodelPath(panel);
		addCartographyModelPath(panel);
		
		return panel;
	}

	private void addCartographyMetamodelPath(Composite parent) {
		Composite line = createLabelTextLine(parent);

		Label mmPathLabel = new Label(line, SWT.NONE);
		mmPathLabel.setText(METAMODEL_PATH_LABEL);

		mmPathText = new Text(line, SWT.READ_ONLY);
		GridData layoutData = new GridData();
		layoutData.widthHint = convertWidthInCharsToPixels(PATH_FIELD_WIDTH);
		mmPathText.setLayoutData(layoutData);
		mmPathText.setVisible(true);
		try {
			String mmPathValue = CommonUtils.getProjectProperty(
					getCurrentProject(), CommonUtils.METAMODEL_PATH_PROPERTY);
			if (mmPathValue != null)
				mmPathText.setText(mmPathValue);
			else
				mmPathText.setText(DEFAULT_METAMODEL_PATH);
		} catch (PortolanInitializationException e) {
			mmPathText.setText(DEFAULT_METAMODEL_PATH);
		} catch (ProjectInitializationException e) {
			mmPathText.setText(DEFAULT_METAMODEL_PATH);
		}
		
        Button mmPathButton = new Button(line, SWT.PUSH);
		mmPathButton.setText("...");
		mmPathButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				selectMetamodelPath(METAMODEL_SELECTION_LABEL);
			}
		});
		mmPathButton.setEnabled(isValid());
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

	/**
	 * @param metamodelSelectionLabel
	 */
	protected void selectMetamodelPath(String metamodelSelectionLabel) {
//		MetamodelURIDialog dialog = new MetamodelURIDialog(shell, metamodelSelectionLabel, SWT.OPEN | SWT.SINGLE);
		MetamodelURIDialog dialog = new MetamodelURIDialog(shell, null);
		dialog.open();
	}
	public class MetamodelURIDialog extends ExtendedLoadResourceDialog {

//		public MetamodelURIDialog(Shell parent, String title, int style) {
//			super(parent, title, style);
//		}
		
		public MetamodelURIDialog(Shell parent, EditingDomain domain) {
			super(parent, domain);
		}
		
		protected boolean processResources() {
			String uri = getURIs().get(0).toString();
			mmPathText.setText(uri);
			
			return true;
		}
	}

	private void addCartographyModelPath(Composite parent) {
		Composite line = createLabelTextLine(parent);
		
		Label mPathLabel = new Label(line, SWT.NONE);
		mPathLabel.setText(MODEL_PATH_LABEL);
		
		mPathText = new Text(line, SWT.READ_ONLY);
		GridData layoutData = new GridData();
		layoutData.widthHint = convertWidthInCharsToPixels(PATH_FIELD_WIDTH);
		mPathText.setLayoutData(layoutData);
		mPathText.setVisible(true);
		try {
			String mPathValue = CommonUtils.getProjectProperty(
					getCurrentProject(), CommonUtils.MODEL_PATH_PROPERTY);
			if (mPathValue != null)
				mPathText.setText(mPathValue);
			else
				mPathText.setText(DEFAULT_MODEL_PATH);
		} catch (PortolanInitializationException e) {
			mPathText.setText(DEFAULT_MODEL_PATH);
		} catch (ProjectInitializationException e) {
			mPathText.setText(DEFAULT_MODEL_PATH);
		}
		
        mPathButton = new Button(line, SWT.PUSH);
        mPathButton.setText("...");
		mPathButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				selectModelPath(MODEL_SELECTION_LABEL);
			}
		});
		mPathButton.setEnabled(isValid());
	}

	/**
	 * @param modelSelectionLabel
	 */
	protected void selectModelPath(String modelSelectionLabel) {
		ModelURIDialog dialog = new ModelURIDialog(shell, modelSelectionLabel, SWT.OPEN | SWT.SINGLE);
		dialog.open();
	}

	public class ModelURIDialog extends ResourceDialog {

		public ModelURIDialog(Shell parent, String title, int style) {
			super(parent, title, style);
		}
		
		protected boolean processResources() {
			mPathText.setText(getURIs().get(0).toPlatformString(true));
			return true;
		}
	}
	
	public boolean performOk() {
		try {
			CommonUtils.setProjectProperty(getCurrentProject(),
					CommonUtils.METAMODEL_PATH_PROPERTY,
					mmPathText.getText());
			CommonUtils.setProjectProperty(getCurrentProject(),
					CommonUtils.MODEL_PATH_PROPERTY,
					mPathText.getText());
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	private IProject getCurrentProject() throws PortolanInitializationException {
		IProject project = (IProject) getElement();
		
		if (project != null)
			return project;
		else
			throw new PortolanInitializationException(
					"The current project is not reachable!");
	}
}
