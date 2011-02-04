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

package fr.inria.portolan.visualization.googlemaps.ui;

import java.util.Iterator;

import kml.Document;
import kml.Feature;
import kml.Folder;
import kml.Geometry;
import kml.Placemark;
import kml.Point;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;

import fr.inria.portolan.common.exceptions.PortolanException;
import fr.inria.portolan.common.ui.editors.ModelEditorInput;
import fr.inria.portolan.visualization.googlemaps.transformation.ChainFromCartographyToKML;

public class GoogleMapsEditor extends EditorPart {

	public static final String ID = "fr.inria.portolan.visualization.googlemaps.ui.GoogleMapsEditor";

//	protected KMLInput input;
	protected KMLModelInput input;
	
	private double _centerLatitude = 0;
	private double _centerLongitude = 0;
	private int _zoomLevel = 10;

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		
		this.setSite(site);
		this.setPartName(input.getName());
		
		//TODO manage .kml and generic models into KML .xmi model
		if (input instanceof ModelEditorInput) {
			try {
				IFile model = ((ModelEditorInput) input).getModelFile();
				String metamodelURI = ((ModelEditorInput) input).getMetamodelURI();
				IFile kml = ChainFromCartographyToKML.processModel(model, metamodelURI);
				KMLModelInput kmlInput = new KMLModelInput(kml);
				this.input = kmlInput;
				this.setInput(kmlInput);

			} catch (PortolanException e) {
				throw new PartInitException("Lacking some of Portolan preferences or project properties");
			}
		}
		else 
//		if (input instanceof KMLInput) {
//			this.input = (KMLInput) input;
//			this.setInput(input);
//		}
//		else if (input instanceof IFileEditorInput) {
//			KMLInput kmlInput = new KMLInput(((IFileEditorInput) input).getFile());
//			this.input = kmlInput;
//			this.setInput(kmlInput);
//		}
//		else throw new PartInitException("Input should be a KML XML file");

		if (input instanceof KMLModelInput) {
			this.input = (KMLModelInput) input;
			this.setInput(input);
		}
		else if (input instanceof IFileEditorInput) {
			KMLModelInput kmlInput = new KMLModelInput(((IFileEditorInput) input).getFile());
			this.input = kmlInput;
			this.setInput(kmlInput);
		}
		else throw new PartInitException("Input should be a KML model (.xmi) file");
	}

	@Override
	public void createPartControl(Composite parent) {
		Browser browser = new Browser(parent, SWT.NONE);
		browser.setText(createHmtlPage());
	}

	private String createHmtlPage() {
		
		String sourceMarkers = computeValues();
		
		String sourceHead = 
			"<html>\n"+
			"  <head>\n"+
			"    <title>Google Maps v3</title>\n"+
			"    <meta name=\"viewport\" content=\"initial-scale=1.0, user-scalable=no\" />\n"+
			"    <script type=\"text/javascript\" src=\"http://maps.google.com/maps/api/js?sensor=true\"></script>\n"+
			"    <script type=\"text/javascript\">\n"+
			"      function init_map()\n"+
			"        {\n"+
			"        var latlngCenter = new google.maps.LatLng("+ _centerLatitude + ", "+ _centerLongitude + ");\n";
		
		String sourceOptions = 
			"        var myOptions =\n"+
			"          {\n"+
			"          zoom: 5,\n"+		// West Europe zoom
//			"          zoom: "+ _zoomLevel +",\n"+
			"          center: latlngCenter,\n"+
			"          mapTypeId: google.maps.MapTypeId.ROADMAP\n"+ // kinds: ROADMAP, SATELLITE, HYBRID, TERRAIN
			"          };\n"+
			"        var map = new google.maps.Map(document.getElementById(\"my_map\"), myOptions);\n";
		
		String sourceTail = 
			"        }\n"+
			"    </script>\n"+
			"  </head>\n"+
			"  <body onload=\"init_map()\">\n"+
			"    <div id=\"my_map\" style=\"width: 100%; height: 100%\"></div>\n"+
			"  </body>\n"+
			"</html>";
		return sourceHead + sourceOptions + sourceMarkers + sourceTail;
	}
	
	/**
	 * @return
	 */
	private EList<Placemark> getGeoNodes() {
		EList<EObject> model = input.getKMLModel();
		
		
		EList<Placemark> placemarks = new BasicEList<Placemark>();
		
		
		for (Iterator<EObject> iterator = model.iterator(); iterator.hasNext();) {
			EObject eObject = (EObject) iterator.next();
			if (eObject instanceof Document) {
				Document document = (Document) eObject;
				EList<Feature> features = document.getFeatures();
				for (Iterator<Feature> iterator2 = features.iterator(); iterator2
						.hasNext();) {
					Feature feature = (Feature) iterator2.next();
					if (feature instanceof Placemark) {
						placemarks.add((Placemark) feature);
					}
					if (feature instanceof Folder) {
						Folder folder = (Folder) feature;
						EList<Feature>subFeatures = folder.getFeatures();
						for (Iterator<Feature> iterator3 = subFeatures.iterator(); iterator3
								.hasNext();) {
							Feature subFeature = (Feature) iterator3.next();
							if (subFeature instanceof Placemark) {
								placemarks.add((Placemark) subFeature);
							}
						}
					}
				}
			} else 
				if (eObject instanceof Placemark) {
					placemarks.add((Placemark) eObject);
				}
		}
		return placemarks;
	}

	private String computeValues() {
		EList<Placemark> nodes = getGeoNodes();
		
		String sourceMarkers = "";
		
		// maximum values to compute center + zoom
		double wester = 0, easter = 0, norther = 0, souther = 0;
		boolean firstPoint = true;
		
		int num = 0;
		for (Iterator<Placemark> iterator = nodes.iterator(); iterator.hasNext();) {
			Placemark placemark = (Placemark) iterator.next();
			Geometry geometry = placemark.getGeometry();
			if (geometry != null) {
				if (geometry instanceof Point) {
					Point point = (Point) geometry;
					double lat = point.getCoordinates().getLat();
					double lon = point.getCoordinates().getLon();
					
					if (firstPoint) {
						wester = lon;
						easter = lon;
						norther = lat;
						souther = lat;
						firstPoint = false;
					} else {
						if (lon < wester)
							wester = lon;
						if (lon > easter)
							easter = lon;
						if (lat < souther)
							souther = lat;
						if (lat > norther)
							norther = lat;
					}
					sourceMarkers += 
						"        var marker"+ num +" = new google.maps.Marker({\n" +
						"          position: new google.maps.LatLng("+ lat + ", "+lon + "),\n"+
						"          map: map,\n" +
						"          title: \""+ placemark.getName() +"\"\n" +
						"        });\n";
					num++;
				}
			}
		}
		// compute center of map
		double width = 0;
		double height = 0;
		_centerLongitude = (wester + easter) / 2;
		_centerLatitude = (souther + norther) / 2;
		width = easter - wester;
		height = norther - souther;
		_zoomLevel = (int) (360 / Math.max(width, height));
		if (_zoomLevel > 10)
			_zoomLevel = 10;
		if (_zoomLevel < 1)
			_zoomLevel = 1;
		
		return sourceMarkers;
	}
	
	@Override
	public void doSave(IProgressMonitor monitor) {
	}

	@Override
	public void doSaveAs() {
	}

	@Override
	public boolean isDirty() {
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	@Override
	public void setFocus() {
	}

}
