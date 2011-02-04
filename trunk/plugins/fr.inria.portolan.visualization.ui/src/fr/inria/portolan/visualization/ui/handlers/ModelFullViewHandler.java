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


/**
 * @author <a href="mailto:Vincent.Mahe@inria.fr">Vincent Mahe</a>
 *
 */
public class ModelFullViewHandler extends AbstractHandler {

	public static final String ID = "fr.inria.portolan.visualization.ui.handlers.ModelFullViewHandler";

	// values from the Full View declaration
	private String editorId;
	
	public ModelFullViewHandler(String editorId) {
		this.editorId		= editorId;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// get the default values and items
		IFile model;
		try {
			model = CommonUtils.getReferentProjectModel();
		} catch (PortolanException e) {
			Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
			MessageDialog.openError(shell, "Portolan Initialization",
					"Some of Portolan preferences or project properties need to be set!");
			return null;
		}
		
		// then launch the given visualization editor
		final ModelEditorInput modelInput = new ModelEditorInput(model);
		
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
