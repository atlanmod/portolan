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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import fr.inria.portolan.visualization.prefuse.viewer.LayoutsParams;
import fr.inria.portolan.visualization.prefuse.viewer.SwitchableDisplay;

public class GraphLayoutControl extends JPanel
								implements ActionListener {

	private static final long serialVersionUID = 4498015820801359117L;
	
	private SwitchableDisplay display;
	private static JPanel params;
	
	public GraphLayoutControl(SwitchableDisplay display) {
		this.display = display;
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		// buttons group title
		JLabel title = new JLabel("LAYOUT");
//		title.setAlignmentX(CENTER_ALIGNMENT);
		title.setBorder(new EmptyBorder(15, 5, 5, 5));
		this.add(title);
//		this.add(new JSeparator());
		
		ButtonGroup layoutsGroup = new ButtonGroup();
		
		// select layout with radio buttons
		JRadioButton btButton = new JRadioButton("Balloon Tree");
		btButton.setActionCommand("BalloonTree");
		btButton.addActionListener(this);
		layoutsGroup.add(btButton);
		
		JRadioButton fdButton = new JRadioButton("Force Directed");
		fdButton.setActionCommand("ForceDirected");
		fdButton.addActionListener(this);
		layoutsGroup.add(fdButton);
		
		JRadioButton frButton = new JRadioButton("Fruchterman Reingold");
		frButton.setActionCommand("FruchtermanReingold");
		frButton.addActionListener(this);
		layoutsGroup.add(frButton);
		
		JRadioButton llButton = new JRadioButton("LinLog Clusters");
		llButton.setActionCommand("LinLog");
		llButton.addActionListener(this);
		layoutsGroup.add(llButton);
		
		JRadioButton nltButton = new JRadioButton("Node Link Tree");
		nltButton.setActionCommand("NodeLinkTree");
		nltButton.addActionListener(this);
		layoutsGroup.add(nltButton);
		
		JRadioButton rtButton = new JRadioButton("Radial Tree");
		rtButton.setActionCommand("RadialTree");
		rtButton.addActionListener(this);
		layoutsGroup.add(rtButton);
		rtButton.setSelected(true);		// SwitchableDisplay default layout
		
		JPanel paramsPanel = new JPanel();
		paramsPanel.setLayout(new BoxLayout(paramsPanel, BoxLayout.Y_AXIS));
		JLabel paramsTitle = new JLabel("Parameters");
		params = new JPanel();
		params.setLayout(new BoxLayout(params, BoxLayout.Y_AXIS));
		buildParams();
		paramsPanel.add(paramsTitle);
		paramsPanel.add(params);
		
		this.add(btButton);
		this.add(fdButton);
		this.add(frButton);
		this.add(llButton);
		this.add(nltButton);
		this.add(rtButton);
		this.add(paramsPanel);
	}
	
	public enum GraphLayout {
		BalloonTree,
		ForceDirected,
		FruchtermanReingold,
		LinLog,
		NodeLinkTree,
		RadialTree,
		SquarifiedTreeMap
	}
	
	public void setLayout(GraphLayout layout) {
		switch (layout) {
		case BalloonTree:
			display.setBalloonTreeLayout();
			break;

		case ForceDirected:
			display.setForceDirectedLayout();
			break;

		case FruchtermanReingold:
			display.setFruchtermanReingoldLayout();
			break;

		case LinLog:
			display.setLinLogLayout();
			break;

		case NodeLinkTree:
			display.setNodeLinkTreeLayout();
			break;

		case RadialTree:
			display.setRadialTreeLayout();
			break;
		}
	}

	/**
	 * add the parameters to the panel
	 */
	private void buildParams() {
		final JSlider massSlider = new JSlider(1, 20);
		massSlider.setValue((int) LayoutsParams.getMassValue());
		massSlider.setToolTipText("Force Directed - Mass");
		massSlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				massSlider.setToolTipText("Force Directed - Mass: "+ massSlider.getValue());
				if (!massSlider.getValueIsAdjusting())
					LayoutsParams.setMassValue(massSlider.getValue());
			}
		});
		params.add(massSlider);
	}

	public void actionPerformed(ActionEvent e) {
		// we get the enum value from the choosen button
		GraphLayout layout = GraphLayout.valueOf(e.getActionCommand());
		setLayout(layout);
	}
}
