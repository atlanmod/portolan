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
package fr.inria.portolan.visualization.linlog.ui;

import javax.swing.JPanel;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;

import fr.inria.portolan.common.exceptions.PortolanException;
import fr.inria.portolan.common.ui.editors.ModelEditorInput;
import fr.inria.portolan.visualization.linlog.transformations.ChainFromCartographyToL3;

/**
 * @author <a href="mailto:Vincent.Mahe@inria.fr">Vincent Mahe</a>
 *
 */
public class LinLogLayoutEditor extends EditorPart {
	
	public static final String ID = "fr.inria.portolan.visualization.linlog.ui.LinLogLayoutEditor";

	protected GraphInput input;

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IEditorPart#init(org.eclipse.ui.IEditorSite, org.eclipse.ui.IEditorInput)
	 */
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		
		this.setSite(site);
		this.setPartName(input.getName());
		
		if (input instanceof ModelEditorInput) {
			try {
				IFile model = ((ModelEditorInput) input).getModelFile();
				String metamodelURI = ((ModelEditorInput) input).getMetamodelURI();
				IFile graphml = ChainFromCartographyToL3.processModel(model, metamodelURI);
				GraphInput graphInput = new GraphInput(graphml);
				this.input = graphInput;
				this.setInput(graphInput);

			} catch (PortolanException e) {
				throw new PartInitException("Lacking some of Portolan preferences or project properties");
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
			JPanel panel = LinLogContainer.getInstance().initializeFile(input.getL3File());
			LinLogContainer.getInstance().createPartControl(parent, panel);
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
