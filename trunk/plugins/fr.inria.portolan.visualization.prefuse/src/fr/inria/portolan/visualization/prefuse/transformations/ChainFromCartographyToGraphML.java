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
package fr.inria.portolan.visualization.prefuse.transformations;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;

import fr.inria.modeling.graphml.utils.popup.actions.GraphMLModel2XMLFileAction;
import fr.inria.portolan.visualization.prefuse.actions.Cartography2GraphMLAction;

/**
 * Takes a cartography model and generates corresponding GraphML textual XML file 
 * @author <a href="mailto:Vincent.Mahe@inria.fr">Vincent Mahe</a>
 *
 */
public class ChainFromCartographyToGraphML {

	public static IFile processModel(IFile model,
									String metamodelURI,
									IProgressMonitor monitor) {
		IPath tempFolder = model.getFullPath().removeLastSegments(1);
//		String tmpFolder = tempFolder.toString() + "/.tmp";
		String tmpFolder = tempFolder.toString() + "/tmp";
		
		Cartography2GraphMLAction carto2Graph = new Cartography2GraphMLAction();
		IFile graphModel = carto2Graph.perform(model, metamodelURI, tmpFolder, "xmi",
				new SubProgressMonitor(monitor, 1));
		
		GraphMLModel2XMLFileAction graph2xml = new GraphMLModel2XMLFileAction();
		IFile graphXmlFile = graph2xml.perform(graphModel, tmpFolder, "graphml",
				new SubProgressMonitor(monitor, 1));
		
		return graphXmlFile;
	}
}
