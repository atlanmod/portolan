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

package fr.inria.portolan.visualization.prefuse.ui;

import java.awt.event.MouseEvent;

import prefuse.visual.VisualItem;

/**
 * This class overwrite Swing tooltip in order to display multi-lines tooltips
 * 
 * @author <a href="mailto:Vincent.Mahe@inria.fr">Vincent Mahe</a>
 *
 */
public class ToolTipsControl extends prefuse.controls.ToolTipControl {

	private String[] tttFields;
	/**
	 * @param field
	 */
	public ToolTipsControl(String field) {
        this(new String[] {field});
	}

	/**
	 * @param fields
	 */
	public ToolTipsControl(String[] fields) {
		super(fields);
		tttFields = fields;
	}
	
    public void itemEntered(VisualItem item, MouseEvent e) {
    	PrefuseContainer.tooltipArea.setText("");
    	for (int i = 0; i < this.tttFields.length; i++) {
    		PrefuseContainer.tooltipArea.append(item.getString(this.tttFields[i]));
			if (i - 1 < this.tttFields.length)
				PrefuseContainer.tooltipArea.append("\n");
		}
    }

    public void itemExited(VisualItem item, MouseEvent e) {
    }
}