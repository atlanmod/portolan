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
package fr.inria.portolan.visualization.ui.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

/**
 * @author <a href="mailto:Vincent.Mahe@inria.fr">Vincent Mahe</a>
 *
 */
public class VisualizationView extends ViewPart{

	public static final String ID = "fr.inria.portolan.visualization.ui.views.VisualizationView";
	
	private Canvas panel;
	
	public void createPartControl(Composite parent) {
		panel = new Canvas(parent, SWT.EMBEDDED);
		panel.setEnabled(true);
		panel.setVisible(true);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPart#setFocus()
	 */
	public void setFocus() {
		panel.setFocus();
	}

	/**
	 * @return
	 */
	public Composite getPanel() {
		return panel;
	}
}
