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
package fr.inria.portolan.visualization.linlog.transformations;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;

import fr.inria.portolan.visualization.linlog.actions.Cartography2L3Action;

/**
 * Takes a cartography model and generates corresponding GraphML textual XML file 
 * @author <a href="mailto:Vincent.Mahe@inria.fr">Vincent Mahe</a>
 *
 */
public class ChainFromCartographyToL3 {

	public static IFile processModel(IFile model, String metamodelURI) {
		IPath tempFolder = model.getFullPath().removeLastSegments(1);
//		String tmpFolder = tempFolder.toString() + "/.tmp";
		String tmpFolder = tempFolder.toString() + "/tmp";
		
		Cartography2L3Action carto2L3 = new Cartography2L3Action();
		IFile l3File = carto2L3.perform(model, metamodelURI, tmpFolder, "xmi");
		
		return l3File;
	}
}
