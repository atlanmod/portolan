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
package fr.inria.portolan.visualization.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

import fr.inria.portolan.common.exceptions.PortolanException;
import fr.inria.portolan.common.ui.editors.ModelEditorInput;
import fr.inria.portolan.common.utils.CommonUtils;
import fr.inria.portolan.visualization.ui.transformations.ViewDefinitionProcessor;


/**
 * @author <a href="mailto:Vincent.Mahe@inria.fr">Vincent Mahe</a>
 *
 */
public class ModelViewDefinitionHandler extends AbstractHandler {

	public static final String ID = "fr.inria.portolan.common.ui.handlers.ModelViewDefinitionHandler";

	// values from the View Definition declaration
	private String editorId;
	private String metamodelId;
	private String postName;
	private String transfoPath;
	private String pluginId;
	
	public ModelViewDefinitionHandler(String pluginId,
									  String editorId,
									  String metamodelId,
									  String postName,
									  String transfoPath) {
		this.editorId		= editorId;
		this.metamodelId	= metamodelId;
		this.postName		= postName;
		this.transfoPath	= transfoPath;
		this.pluginId		= pluginId;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// catch the corresponding ViewDef extension declaration
		/*
		 * This handler has been registered when the VDsBar has detected
		 * the corresponding View Definition, so it should have stored its
		 * extension somewhere....
		 */
		
		
		// get the default values and items
		IFile model;
		IFile outModel;
		try {
			model = CommonUtils.getReferentProjectModel();
			String metamodelUri = CommonUtils.getReferentProjectMetamodelPath();
			
			// we use the .tmp folder despite editor will add a "/.tmp" subfolder
			IPath tempFolder = model.getFullPath().removeLastSegments(1);
//			String tmpFolder = tempFolder.toString() + "/.tmp";
			String tmpFolder = tempFolder.toString() + "/tmp";
			
			// run the transformation
			ViewDefinitionProcessor processor = new ViewDefinitionProcessor();
			outModel = processor.perform(model,
												metamodelUri,
												metamodelId,
												tmpFolder,
												postName,
												transfoPath,
												pluginId);
		} catch (PortolanException e1) {
			Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
			MessageDialog.openError(shell, "Portolan Initialization",
					"Some of Portolan preferences or project properties need to be set!");
			return null;
		}
		
		// then launch the given visualization editor
		final ModelEditorInput modelInput = new ModelEditorInput(outModel);
		
		Display.getDefault().asyncExec(new Runnable() {
			
			public void run() {
				try {
					IWorkbenchPage page = PlatformUI.getWorkbench()
							.getActiveWorkbenchWindow().getActivePage();
					IDE.openEditor(page, modelInput, editorId, true);
				} catch (PartInitException e) {
					e.printStackTrace();
				}
			}
		});
		
		return null;
	}

}
