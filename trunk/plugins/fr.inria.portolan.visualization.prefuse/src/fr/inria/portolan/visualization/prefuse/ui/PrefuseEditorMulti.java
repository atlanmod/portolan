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
package fr.inria.portolan.visualization.prefuse.ui;

import javax.swing.JPanel;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.EditorPart;

import fr.inria.portolan.common.exceptions.PortolanException;
import fr.inria.portolan.common.ui.editors.ModelEditorInput;
import fr.inria.portolan.visualization.prefuse.transformations.ChainFromCartographyToGraphMLMulti;

import prefuse.data.Graph;
import prefuse.data.io.DataIOException;
import prefuse.data.io.GraphMLReader;

/**
 * @author <a href="mailto:Vincent.Mahe@inria.fr">Vincent Mahe</a>
 *
 */
public class PrefuseEditorMulti extends EditorPart {
	
	public static final String ID = "fr.inria.portolan.visualization.prefuse.ui.PrefuseEditorMulti";

	protected GraphInput input;

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IEditorPart#init(org.eclipse.ui.IEditorSite, org.eclipse.ui.IEditorInput)
	 */
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		
		this.setSite(site);
		this.setPartName(input.getName());
		
		if (input instanceof ModelEditorInput) {
			// get the progress monitor of Eclipse status bar (not possible to use a Job)
			IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			IWorkbenchPart part = window.getActivePage().getActivePart();
			IStatusLineManager manager = null;
			if (part.getSite() instanceof IViewSite){
				manager = ((IViewSite) (part.getSite())).getActionBars().getStatusLineManager();
			}else{
				manager = ((IEditorSite)(part.getSite())).getActionBars().getStatusLineManager();
			}
			IProgressMonitor monitor = manager.getProgressMonitor();
			manager.update(true);
			try {
				IFile model = ((ModelEditorInput) input).getModelFile();
				String metamodelURI = ((ModelEditorInput) input).getMetamodelURI();
				monitor.beginTask("Cartography to GraphML: "+ model.getName(), IProgressMonitor.UNKNOWN);
				monitor.worked(1);
				IFile graphml = ChainFromCartographyToGraphMLMulti.processModel(model, metamodelURI,
						new SubProgressMonitor(monitor, IProgressMonitor.UNKNOWN));
				GraphInput graphInput = new GraphInput(graphml);
				this.input = graphInput;
				this.setInput(graphInput);

			} catch (PortolanException e) {
				throw new PartInitException("Lacking some of Portolan preferences or project properties");
			} finally {
				monitor.done();
			}
		}
		else if (input instanceof GraphInput) {
			this.input = (GraphInput) input;
			this.setInput(input);
		}
		else if (input instanceof IFileEditorInput) {
			GraphInput graphInput = new GraphInput(((IFileEditorInput) input).getFile());
			this.input = graphInput;
			this.setInput(graphInput);
		}
		else throw new PartInitException("Input should be a GraphML XML file");
	}


	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		if (this.input != null) {
			Graph graph;
			String graphUri = ResourcesPlugin.getWorkspace().getRoot().getLocation()
								+ input.getGraphMLFile().getFullPath().toString();
			try {
				graph = new GraphMLReader().readGraph(graphUri);
			} catch (DataIOException e) {
				MessageDialog.openError(
						parent.getShell(),
						"Prefuse graph loading...",
						"Error loading graph: " + graphUri + "!");
				return;
			}
			
			JPanel panel = PrefuseContainer.getInstance().initializeGraph(graph);
			PrefuseContainer.getInstance().createPartControl(parent, panel);
		}
	}


	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#doSave(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void doSave(IProgressMonitor monitor) {
	}


	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#doSaveAs()
	 */
	@Override
	public void doSaveAs() {
	}


	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#isDirty()
	 */
	@Override
	public boolean isDirty() {
		return false;
	}


	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#isSaveAsAllowed()
	 */
	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}


	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
	}

}
