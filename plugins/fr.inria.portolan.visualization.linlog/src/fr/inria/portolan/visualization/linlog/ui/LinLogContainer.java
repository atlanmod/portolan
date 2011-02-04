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

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.resources.IFile;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.widgets.Composite;

import com.google.code.linloglayout.Edge;
import com.google.code.linloglayout.GraphCanvas;
import com.google.code.linloglayout.LinLogLayout;
import com.google.code.linloglayout.MinimizerBarnesHut;
import com.google.code.linloglayout.Node;
import com.google.code.linloglayout.OptimizerModularity;

/**
 * @author <a href="mailto:Vincent.Mahe@inria.fr">Vincent Mahe</a>
 *
 */
public class LinLogContainer {
	
	// Singleton design pattern
	private static LinLogContainer instance = new LinLogContainer();
	protected LinLogContainer() {
	}
	public static LinLogContainer getInstance() {
		return LinLogContainer.instance;
	}

	public void createPartControl(Composite parent, JPanel panel) {
		Composite container = new Composite(parent, SWT.EMBEDDED | SWT.NO_BACKGROUND);
		Frame awtFrame = SWT_AWT.new_Frame(container);
		
		awtFrame.add(panel);
	}
	
	public JPanel initializeFile(IFile l3File) {
		Color BACKGROUND = Color.WHITE;
		Color FOREGROUND = Color.BLACK;

		// manage the input data
//		String outputFileName = l3File.getFullPath().removeFileExtension().toString() + ".lc";
		Map<String,Map<String,Double>> graph = LinLogLayout.readGraph(l3File.getLocation().toString());
		graph = LinLogLayout.makeSymmetricGraph(graph);
        Map<String,Node> nameToNode = LinLogLayout.makeNodes(graph);
        List<Node> nodes = new ArrayList<Node>(nameToNode.values());
        List<Edge> edges = LinLogLayout.makeEdges(graph,nameToNode);
		Map<Node,double[]> nodeToPosition = LinLogLayout.makeInitialPositions(nodes, false);
		// see class MinimizerBarnesHut for a description of the parameters;
		// for classical "nice" layout (uniformly distributed nodes), use
		//new MinimizerBarnesHut(nodes, edges, -1.0, 2.0, 0.05).minimizeEnergy(nodeToPosition, 100);
		new MinimizerBarnesHut(nodes, edges, 0.0, 1.0, 0.05).minimizeEnergy(nodeToPosition, 100);
        // see class OptimizerModularity for a description of the parameters
        Map<Node,Integer> nodeToCluster = 
            new OptimizerModularity().execute(nodes, edges, false);
//        LinLogLayout.writePositions(nodeToPosition, nodeToCluster, outputFileName);
		
		
		// add the visual display to the viewer
        final GraphCanvas canvas = new GraphCanvas(nodeToPosition, nodeToCluster);

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
		
		// main AWT container for all
		JPanel awtPanel = new JPanel(new BorderLayout());
		awtPanel.setBackground(BACKGROUND);
		awtPanel.setForeground(FOREGROUND);
		
		awtPanel.add(BorderLayout.CENTER, canvas);
        awtPanel.add(BorderLayout.SOUTH, southPanel);
		
		return awtPanel;
	}
//
//	protected SwitchableDisplay getDisplay(Graph graph) {
//		// default display
//		return new SwitchableDisplay(graph);
//	}
}
