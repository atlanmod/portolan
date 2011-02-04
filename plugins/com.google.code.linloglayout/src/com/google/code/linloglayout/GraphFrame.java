package com.google.code.linloglayout;

//Copyright (C) 2008 Andreas Noack
//
//This library is free software; you can redistribute it and/or
//modify it under the terms of the GNU Lesser General Public
//License as published by the Free Software Foundation; either
//version 2.1 of the License, or (at your option) any later version.
//
//This library is distributed in the hope that it will be useful,
//but WITHOUT ANY WARRANTY; without even the implied warranty of
//MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
//Lesser General Public License for more details.
//
//You should have received a copy of the GNU Lesser General Public
//License along with this library; if not, write to the Free Software
//Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA 


import java.awt.BorderLayout;
import java.util.Map;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * Dialog with a simple graph visualization, displaying graph nodes
 * as circles of specified sizes and colors at specified positions.  
 * 
 * @author Andreas Noack
 * @version 21.01.2008
 */
public class GraphFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructs the dialog.
	 * 
	 * @param nodeToPosition map from each graph node to its position.
	 *   Each position array must have at least two elements, 
	 * 	 one for the horizontal position and one for the vertical position.
	 * @param nodeToCluster  map from each graph node to its cluster,
     *   which is used as color (hue) of its representing circle.
     *   The diameter of the circle is the square root of the node weight,
     *   thus the circle areas are proportional to the node weights. 
	 */
	public GraphFrame(Map<Node,double[]> nodeToPosition, Map<Node,Integer> nodeToCluster) {
		setTitle("LinLogLayout");
        setSize(getToolkit().getScreenSize().width/2, getToolkit().getScreenSize().height/2);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());
        
        final GraphCanvas canvas = new GraphCanvas(nodeToPosition, nodeToCluster);
		getContentPane().add(BorderLayout.CENTER, canvas);

        JPanel southPanel = new JPanel(new BorderLayout());
        final JLabel commentLabel = new JLabel(
                "Click right to search. " +
                "Move the mouse cursor over a node to display its name.");
        southPanel.add(BorderLayout.CENTER, commentLabel);
        final JCheckBox labelBox = new JCheckBox("Show all names.", false);
        labelBox.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                canvas.setLabelEnabled(labelBox.isSelected());
            }
        });
        southPanel.add(BorderLayout.EAST, labelBox);
        getContentPane().add(BorderLayout.SOUTH, southPanel);
	}	
}