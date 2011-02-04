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
package fr.inria.portolan.visualization.prefuse.viewer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import prefuse.action.layout.Layout;
import prefuse.data.Graph;
import prefuse.util.PrefuseLib;

import com.google.code.linloglayout.Edge;
import com.google.code.linloglayout.MinimizerBarnesHut;
import com.google.code.linloglayout.Node;

/**
 * @author <a href="mailto:Vincent.Mahe@inria.fr">Vincent Mahe</a>
 *
 */
public class LinLogClustersLayout extends Layout {
	
	private Map<String, Node> m_nodes;
	private Map<Node, prefuse.visual.NodeItem> m_nodeItems;
	private Map<String, Edge> m_edges;
	private Map<Node, double[]> m_positions;
    protected String m_nodeGroup;
    protected String m_edgeGroup;

	public LinLogClustersLayout(String group) {
        super();
        this.m_nodeGroup = PrefuseLib.getGroupName(group, Graph.NODES);
        this.m_edgeGroup = PrefuseLib.getGroupName(group, Graph.EDGES);
	}
    
    /**
     * Explicitly sets the node and edge groups to use for this layout,
     * overriding the group setting passed to the constructor.
     * @param nodeGroup the node data group
     * @param edgeGroup the edge data group
     */
    public void setDataGroups(String nodeGroup, String edgeGroup) {
        this.m_nodeGroup = nodeGroup;
        this.m_edgeGroup = edgeGroup;
    }

	/* (non-Javadoc)
	 * @see prefuse.action.GroupAction#run(double)
	 */
	@Override
	public void run(double frac) {
		//TODO
		makeNodes();
		makeEdges();
		makeInitialPositions();
		
        List<Node> nodes = new ArrayList<Node>(m_nodes.values());
        List<Edge> edges = new ArrayList<Edge>(m_edges.values());
		new MinimizerBarnesHut(nodes, edges, 0.0, 1.0, 0.05).minimizeEnergy(m_positions, 5);
//        new OptimizerModularity().execute(nodes, edges, false);
		
        // change the place of items
        for (Iterator<Node> iterator = nodes.iterator(); iterator.hasNext();) {
			Node node = (Node) iterator.next();
			prefuse.visual.NodeItem item = m_nodeItems.get(node);
			double[] position = m_positions.get(node);
            setX(item, null, position[0]);
            setY(item, null, position[1]);
		}
	}

	private void makeNodes() {
		m_nodes = new HashMap<String, Node>();
		for (@SuppressWarnings("rawtypes")
		Iterator iterator = this.m_vis.visibleItems(this.m_nodeGroup); iterator.hasNext();) {
			prefuse.data.Node n = (prefuse.data.Node) iterator.next();
			m_nodes.put(""+n.getRow(), new Node(""+n.getRow(), n.getDegree()));
		}
	}

	private void makeEdges() {
		m_edges = new HashMap<String, Edge>();
		for (@SuppressWarnings("rawtypes")
		Iterator iterator = this.m_vis.visibleItems(this.m_edgeGroup); iterator.hasNext();) {
			prefuse.data.Edge e = (prefuse.data.Edge) iterator.next();
			Node source = m_nodes.get(e.getSourceNode().getRow());
			Node target = m_nodes.get(e.getTargetNode().getRow());
			if (source != null && target != null)
				m_edges.put(""+e.getRow(), new Edge(source, target, source.weight + target.weight));
		}
	}
	
	private void makeInitialPositions() {
		m_nodeItems = new HashMap<Node, prefuse.visual.NodeItem>();
		m_positions = new HashMap<Node, double[]>();
		for (@SuppressWarnings("rawtypes")
		Iterator iterator = this.m_vis.visibleItems(this.m_nodeGroup); iterator.hasNext();) {
			prefuse.visual.NodeItem n = (prefuse.visual.NodeItem) iterator.next();
			Node node = m_nodes.get(n.getRow()+"");
			m_nodeItems.put(node, n);
			double[] position = {
					n.getX(),
					n.getY(),
//					Math.random() - 0.5,
//                    Math.random() - 0.5,
					0.0
			};
			m_positions.put(node, position);
		}
	}
}
