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
package fr.inria.portolan.visualization.googlemaps.transformation;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
//import fr.inria.modeling.kml.utils.popup.actions.KMLModel2XMLFileAction;
import fr.inria.portolan.visualization.googlemaps.actions.Cartography2KMLAction;

/**
 * Takes a cartography model and generates corresponding KML textual XML file 
 * @author <a href="mailto:Vincent.Mahe@inria.fr">Vincent Mahe</a>
 *
 */
public class ChainFromCartographyToKML {

	public static IFile processModel(IFile model, String metamodelURI) {
		IPath tempFolder = model.getFullPath().removeLastSegments(1);
//		String tmpFolder = tempFolder.toString() + "/.tmp";
		String tmpFolder = tempFolder.toString() + "/tmp";
		
		Cartography2KMLAction carto2kml = new Cartography2KMLAction();
		IFile kmlModel = carto2kml.perform(model, metamodelURI, tmpFolder, "xmi");
		
		// as we use the XMI model in editor, we do not generate the XML files
//		KMLModel2XMLFileAction kml2xml = new KMLModel2XMLFileAction();
//		IFile kmlXmlFile = kml2xml.perform(kmlModel, tmpFolder, "kml");
		
//		return kmlXmlFile;
		return kmlModel;
	}
}
