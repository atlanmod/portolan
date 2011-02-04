/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml.util;

import java.util.List;

import kml.AbstractStyle;
import kml.AbstractView;
import kml.Alias;
import kml.BalloonStyle;
import kml.Camera;
import kml.ColorStyle;
import kml.Container;
import kml.Coordinate;
import kml.Data;
import kml.Document;
import kml.ExtendedData;
import kml.Feature;
import kml.Folder;
import kml.Geometry;
import kml.GroundOverlay;
import kml.Icon;
import kml.IconStyle;
import kml.ImagePyramid;
import kml.ItemIcon;
import kml.KmlPackage;
import kml.LabelStyle;
import kml.LatLonAltBox;
import kml.LatLonBox;
import kml.LineString;
import kml.LineStyle;
import kml.LinearRing;
import kml.Link;
import kml.ListStyle;
import kml.Location;
import kml.Lod;
import kml.LookAt;
import kml.Model;
import kml.MultiGeometry;
import kml.NetworkLink;
import kml.Orientation;
import kml.Overlay;
import kml.Pair;
import kml.PhotoOverlay;
import kml.Placemark;
import kml.Point;
import kml.PolyStyle;
import kml.Polygon;
import kml.Region;
import kml.ResourceMap;
import kml.Scale;
import kml.Schema;
import kml.SchemaData;
import kml.ScreenOverlay;
import kml.SimpleData;
import kml.SimpleField;
import kml.Style;
import kml.StyleMap;
import kml.StyleSelector;
import kml.TimePrimitive;
import kml.TimeSpan;
import kml.TimeStamp;
import kml.Vec2Type;
import kml.ViewVolume;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see kml.KmlPackage
 * @generated
 */
public class KmlSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KmlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KmlSwitch() {
		if (modelPackage == null) {
			modelPackage = KmlPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case KmlPackage.OBJECT: {
				kml.Object object = (kml.Object)theEObject;
				T result = caseObject(object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseObject(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.ABSTRACT_VIEW: {
				AbstractView abstractView = (AbstractView)theEObject;
				T result = caseAbstractView(abstractView);
				if (result == null) result = caseObject(abstractView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.TIME_PRIMITIVE: {
				TimePrimitive timePrimitive = (TimePrimitive)theEObject;
				T result = caseTimePrimitive(timePrimitive);
				if (result == null) result = caseObject(timePrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.TIME_SPAN: {
				TimeSpan timeSpan = (TimeSpan)theEObject;
				T result = caseTimeSpan(timeSpan);
				if (result == null) result = caseTimePrimitive(timeSpan);
				if (result == null) result = caseObject(timeSpan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.TIME_STAMP: {
				TimeStamp timeStamp = (TimeStamp)theEObject;
				T result = caseTimeStamp(timeStamp);
				if (result == null) result = caseTimePrimitive(timeStamp);
				if (result == null) result = caseObject(timeStamp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.CAMERA: {
				Camera camera = (Camera)theEObject;
				T result = caseCamera(camera);
				if (result == null) result = caseAbstractView(camera);
				if (result == null) result = caseObject(camera);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.LOOK_AT: {
				LookAt lookAt = (LookAt)theEObject;
				T result = caseLookAt(lookAt);
				if (result == null) result = caseAbstractView(lookAt);
				if (result == null) result = caseObject(lookAt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.STYLE_SELECTOR: {
				StyleSelector styleSelector = (StyleSelector)theEObject;
				T result = caseStyleSelector(styleSelector);
				if (result == null) result = caseObject(styleSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.STYLE: {
				Style style = (Style)theEObject;
				T result = caseStyle(style);
				if (result == null) result = caseStyleSelector(style);
				if (result == null) result = caseObject(style);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.STYLE_MAP: {
				StyleMap styleMap = (StyleMap)theEObject;
				T result = caseStyleMap(styleMap);
				if (result == null) result = caseStyleSelector(styleMap);
				if (result == null) result = caseObject(styleMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.REGION: {
				Region region = (Region)theEObject;
				T result = caseRegion(region);
				if (result == null) result = caseObject(region);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.LAT_LON_ALT_BOX: {
				LatLonAltBox latLonAltBox = (LatLonAltBox)theEObject;
				T result = caseLatLonAltBox(latLonAltBox);
				if (result == null) result = caseLatLonBox(latLonAltBox);
				if (result == null) result = caseObject(latLonAltBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.LOD: {
				Lod lod = (Lod)theEObject;
				T result = caseLod(lod);
				if (result == null) result = caseObject(lod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.EXTENDED_DATA: {
				ExtendedData extendedData = (ExtendedData)theEObject;
				T result = caseExtendedData(extendedData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.DATA: {
				Data data = (Data)theEObject;
				T result = caseData(data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.SCHEMA_DATA: {
				SchemaData schemaData = (SchemaData)theEObject;
				T result = caseSchemaData(schemaData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.SIMPLE_DATA: {
				SimpleData simpleData = (SimpleData)theEObject;
				T result = caseSimpleData(simpleData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.OVERLAY: {
				Overlay overlay = (Overlay)theEObject;
				T result = caseOverlay(overlay);
				if (result == null) result = caseFeature(overlay);
				if (result == null) result = caseObject(overlay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.CONTAINER: {
				Container container = (Container)theEObject;
				T result = caseContainer(container);
				if (result == null) result = caseFeature(container);
				if (result == null) result = caseObject(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.PLACEMARK: {
				Placemark placemark = (Placemark)theEObject;
				T result = casePlacemark(placemark);
				if (result == null) result = caseFeature(placemark);
				if (result == null) result = caseObject(placemark);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.NETWORK_LINK: {
				NetworkLink networkLink = (NetworkLink)theEObject;
				T result = caseNetworkLink(networkLink);
				if (result == null) result = caseFeature(networkLink);
				if (result == null) result = caseObject(networkLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = caseObject(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.ICON: {
				Icon icon = (Icon)theEObject;
				T result = caseIcon(icon);
				if (result == null) result = caseLink(icon);
				if (result == null) result = caseObject(icon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.GROUND_OVERLAY: {
				GroundOverlay groundOverlay = (GroundOverlay)theEObject;
				T result = caseGroundOverlay(groundOverlay);
				if (result == null) result = caseOverlay(groundOverlay);
				if (result == null) result = caseFeature(groundOverlay);
				if (result == null) result = caseObject(groundOverlay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.LAT_LON_BOX: {
				LatLonBox latLonBox = (LatLonBox)theEObject;
				T result = caseLatLonBox(latLonBox);
				if (result == null) result = caseObject(latLonBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.PHOTO_OVERLAY: {
				PhotoOverlay photoOverlay = (PhotoOverlay)theEObject;
				T result = casePhotoOverlay(photoOverlay);
				if (result == null) result = caseOverlay(photoOverlay);
				if (result == null) result = caseFeature(photoOverlay);
				if (result == null) result = caseObject(photoOverlay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.VIEW_VOLUME: {
				ViewVolume viewVolume = (ViewVolume)theEObject;
				T result = caseViewVolume(viewVolume);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.IMAGE_PYRAMID: {
				ImagePyramid imagePyramid = (ImagePyramid)theEObject;
				T result = caseImagePyramid(imagePyramid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.POINT: {
				Point point = (Point)theEObject;
				T result = casePoint(point);
				if (result == null) result = caseGeometry(point);
				if (result == null) result = caseObject(point);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.SCREEN_OVERLAY: {
				ScreenOverlay screenOverlay = (ScreenOverlay)theEObject;
				T result = caseScreenOverlay(screenOverlay);
				if (result == null) result = caseOverlay(screenOverlay);
				if (result == null) result = caseFeature(screenOverlay);
				if (result == null) result = caseObject(screenOverlay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.VEC2_TYPE: {
				Vec2Type vec2Type = (Vec2Type)theEObject;
				T result = caseVec2Type(vec2Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.FOLDER: {
				Folder folder = (Folder)theEObject;
				T result = caseFolder(folder);
				if (result == null) result = caseContainer(folder);
				if (result == null) result = caseFeature(folder);
				if (result == null) result = caseObject(folder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.DOCUMENT: {
				Document document = (Document)theEObject;
				T result = caseDocument(document);
				if (result == null) result = caseContainer(document);
				if (result == null) result = caseFeature(document);
				if (result == null) result = caseObject(document);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.SCHEMA: {
				Schema schema = (Schema)theEObject;
				T result = caseSchema(schema);
				if (result == null) result = caseObject(schema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.SIMPLE_FIELD: {
				SimpleField simpleField = (SimpleField)theEObject;
				T result = caseSimpleField(simpleField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.GEOMETRY: {
				Geometry geometry = (Geometry)theEObject;
				T result = caseGeometry(geometry);
				if (result == null) result = caseObject(geometry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.LINE_STRING: {
				LineString lineString = (LineString)theEObject;
				T result = caseLineString(lineString);
				if (result == null) result = caseGeometry(lineString);
				if (result == null) result = caseObject(lineString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.COORDINATE: {
				Coordinate coordinate = (Coordinate)theEObject;
				T result = caseCoordinate(coordinate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.LINEAR_RING: {
				LinearRing linearRing = (LinearRing)theEObject;
				T result = caseLinearRing(linearRing);
				if (result == null) result = caseGeometry(linearRing);
				if (result == null) result = caseObject(linearRing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.POLYGON: {
				Polygon polygon = (Polygon)theEObject;
				T result = casePolygon(polygon);
				if (result == null) result = caseGeometry(polygon);
				if (result == null) result = caseObject(polygon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.MULTI_GEOMETRY: {
				MultiGeometry multiGeometry = (MultiGeometry)theEObject;
				T result = caseMultiGeometry(multiGeometry);
				if (result == null) result = caseGeometry(multiGeometry);
				if (result == null) result = caseObject(multiGeometry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = caseGeometry(model);
				if (result == null) result = caseObject(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.LOCATION: {
				Location location = (Location)theEObject;
				T result = caseLocation(location);
				if (result == null) result = caseObject(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.ORIENTATION: {
				Orientation orientation = (Orientation)theEObject;
				T result = caseOrientation(orientation);
				if (result == null) result = caseObject(orientation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.SCALE: {
				Scale scale = (Scale)theEObject;
				T result = caseScale(scale);
				if (result == null) result = caseObject(scale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.RESOURCE_MAP: {
				ResourceMap resourceMap = (ResourceMap)theEObject;
				T result = caseResourceMap(resourceMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.ALIAS: {
				Alias alias = (Alias)theEObject;
				T result = caseAlias(alias);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.COLOR_STYLE: {
				ColorStyle colorStyle = (ColorStyle)theEObject;
				T result = caseColorStyle(colorStyle);
				if (result == null) result = caseAbstractStyle(colorStyle);
				if (result == null) result = caseObject(colorStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.ICON_STYLE: {
				IconStyle iconStyle = (IconStyle)theEObject;
				T result = caseIconStyle(iconStyle);
				if (result == null) result = caseColorStyle(iconStyle);
				if (result == null) result = caseAbstractStyle(iconStyle);
				if (result == null) result = caseObject(iconStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.LABEL_STYLE: {
				LabelStyle labelStyle = (LabelStyle)theEObject;
				T result = caseLabelStyle(labelStyle);
				if (result == null) result = caseColorStyle(labelStyle);
				if (result == null) result = caseAbstractStyle(labelStyle);
				if (result == null) result = caseObject(labelStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.LINE_STYLE: {
				LineStyle lineStyle = (LineStyle)theEObject;
				T result = caseLineStyle(lineStyle);
				if (result == null) result = caseColorStyle(lineStyle);
				if (result == null) result = caseAbstractStyle(lineStyle);
				if (result == null) result = caseObject(lineStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.POLY_STYLE: {
				PolyStyle polyStyle = (PolyStyle)theEObject;
				T result = casePolyStyle(polyStyle);
				if (result == null) result = caseColorStyle(polyStyle);
				if (result == null) result = caseAbstractStyle(polyStyle);
				if (result == null) result = caseObject(polyStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.BALLOON_STYLE: {
				BalloonStyle balloonStyle = (BalloonStyle)theEObject;
				T result = caseBalloonStyle(balloonStyle);
				if (result == null) result = caseAbstractStyle(balloonStyle);
				if (result == null) result = caseObject(balloonStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.PAIR: {
				Pair pair = (Pair)theEObject;
				T result = casePair(pair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.LIST_STYLE: {
				ListStyle listStyle = (ListStyle)theEObject;
				T result = caseListStyle(listStyle);
				if (result == null) result = caseAbstractStyle(listStyle);
				if (result == null) result = caseObject(listStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.ITEM_ICON: {
				ItemIcon itemIcon = (ItemIcon)theEObject;
				T result = caseItemIcon(itemIcon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmlPackage.ABSTRACT_STYLE: {
				AbstractStyle abstractStyle = (AbstractStyle)theEObject;
				T result = caseAbstractStyle(abstractStyle);
				if (result == null) result = caseObject(abstractStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(kml.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractView(AbstractView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimePrimitive(TimePrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Span</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Span</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeSpan(TimeSpan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Stamp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Stamp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeStamp(TimeStamp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Camera</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camera</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCamera(Camera object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Look At</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Look At</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLookAt(LookAt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleSelector(StyleSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyle(Style object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleMap(StyleMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegion(Region object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lat Lon Alt Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lat Lon Alt Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLatLonAltBox(LatLonAltBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lod</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lod</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLod(Lod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedData(ExtendedData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchemaData(SchemaData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleData(SimpleData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Overlay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Overlay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverlay(Overlay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Placemark</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Placemark</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlacemark(Placemark object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkLink(NetworkLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Icon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Icon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIcon(Icon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ground Overlay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ground Overlay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroundOverlay(GroundOverlay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lat Lon Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lat Lon Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLatLonBox(LatLonBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Photo Overlay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Photo Overlay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhotoOverlay(PhotoOverlay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Volume</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Volume</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewVolume(ViewVolume object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Pyramid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Pyramid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagePyramid(ImagePyramid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoint(Point object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screen Overlay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screen Overlay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScreenOverlay(ScreenOverlay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vec2 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vec2 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVec2Type(Vec2Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Folder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Folder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFolder(Folder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocument(Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchema(Schema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleField(SimpleField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geometry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geometry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeometry(Geometry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineString(LineString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinate(Coordinate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linear Ring</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linear Ring</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinearRing(LinearRing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolygon(Polygon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Geometry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Geometry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiGeometry(MultiGeometry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orientation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orientation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrientation(Orientation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScale(Scale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceMap(ResourceMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alias</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alias</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlias(Alias object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorStyle(ColorStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Icon Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Icon Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIconStyle(IconStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelStyle(LabelStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineStyle(LineStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Poly Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Poly Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolyStyle(PolyStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Balloon Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Balloon Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBalloonStyle(BalloonStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePair(Pair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListStyle(ListStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Icon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Icon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemIcon(ItemIcon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractStyle(AbstractStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //KmlSwitch
