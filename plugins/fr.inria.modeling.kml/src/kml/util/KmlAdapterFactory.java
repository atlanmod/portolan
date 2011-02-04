/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml.util;

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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see kml.KmlPackage
 * @generated
 */
public class KmlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KmlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KmlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = KmlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KmlSwitch<Adapter> modelSwitch =
		new KmlSwitch<Adapter>() {
			@Override
			public Adapter caseObject(kml.Object object) {
				return createObjectAdapter();
			}
			@Override
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseAbstractView(AbstractView object) {
				return createAbstractViewAdapter();
			}
			@Override
			public Adapter caseTimePrimitive(TimePrimitive object) {
				return createTimePrimitiveAdapter();
			}
			@Override
			public Adapter caseTimeSpan(TimeSpan object) {
				return createTimeSpanAdapter();
			}
			@Override
			public Adapter caseTimeStamp(TimeStamp object) {
				return createTimeStampAdapter();
			}
			@Override
			public Adapter caseCamera(Camera object) {
				return createCameraAdapter();
			}
			@Override
			public Adapter caseLookAt(LookAt object) {
				return createLookAtAdapter();
			}
			@Override
			public Adapter caseStyleSelector(StyleSelector object) {
				return createStyleSelectorAdapter();
			}
			@Override
			public Adapter caseStyle(Style object) {
				return createStyleAdapter();
			}
			@Override
			public Adapter caseStyleMap(StyleMap object) {
				return createStyleMapAdapter();
			}
			@Override
			public Adapter caseRegion(Region object) {
				return createRegionAdapter();
			}
			@Override
			public Adapter caseLatLonAltBox(LatLonAltBox object) {
				return createLatLonAltBoxAdapter();
			}
			@Override
			public Adapter caseLod(Lod object) {
				return createLodAdapter();
			}
			@Override
			public Adapter caseExtendedData(ExtendedData object) {
				return createExtendedDataAdapter();
			}
			@Override
			public Adapter caseData(Data object) {
				return createDataAdapter();
			}
			@Override
			public Adapter caseSchemaData(SchemaData object) {
				return createSchemaDataAdapter();
			}
			@Override
			public Adapter caseSimpleData(SimpleData object) {
				return createSimpleDataAdapter();
			}
			@Override
			public Adapter caseOverlay(Overlay object) {
				return createOverlayAdapter();
			}
			@Override
			public Adapter caseContainer(Container object) {
				return createContainerAdapter();
			}
			@Override
			public Adapter casePlacemark(Placemark object) {
				return createPlacemarkAdapter();
			}
			@Override
			public Adapter caseNetworkLink(NetworkLink object) {
				return createNetworkLinkAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseIcon(Icon object) {
				return createIconAdapter();
			}
			@Override
			public Adapter caseGroundOverlay(GroundOverlay object) {
				return createGroundOverlayAdapter();
			}
			@Override
			public Adapter caseLatLonBox(LatLonBox object) {
				return createLatLonBoxAdapter();
			}
			@Override
			public Adapter casePhotoOverlay(PhotoOverlay object) {
				return createPhotoOverlayAdapter();
			}
			@Override
			public Adapter caseViewVolume(ViewVolume object) {
				return createViewVolumeAdapter();
			}
			@Override
			public Adapter caseImagePyramid(ImagePyramid object) {
				return createImagePyramidAdapter();
			}
			@Override
			public Adapter casePoint(Point object) {
				return createPointAdapter();
			}
			@Override
			public Adapter caseScreenOverlay(ScreenOverlay object) {
				return createScreenOverlayAdapter();
			}
			@Override
			public Adapter caseVec2Type(Vec2Type object) {
				return createVec2TypeAdapter();
			}
			@Override
			public Adapter caseFolder(Folder object) {
				return createFolderAdapter();
			}
			@Override
			public Adapter caseDocument(Document object) {
				return createDocumentAdapter();
			}
			@Override
			public Adapter caseSchema(Schema object) {
				return createSchemaAdapter();
			}
			@Override
			public Adapter caseSimpleField(SimpleField object) {
				return createSimpleFieldAdapter();
			}
			@Override
			public Adapter caseGeometry(Geometry object) {
				return createGeometryAdapter();
			}
			@Override
			public Adapter caseLineString(LineString object) {
				return createLineStringAdapter();
			}
			@Override
			public Adapter caseCoordinate(Coordinate object) {
				return createCoordinateAdapter();
			}
			@Override
			public Adapter caseLinearRing(LinearRing object) {
				return createLinearRingAdapter();
			}
			@Override
			public Adapter casePolygon(Polygon object) {
				return createPolygonAdapter();
			}
			@Override
			public Adapter caseMultiGeometry(MultiGeometry object) {
				return createMultiGeometryAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter caseOrientation(Orientation object) {
				return createOrientationAdapter();
			}
			@Override
			public Adapter caseScale(Scale object) {
				return createScaleAdapter();
			}
			@Override
			public Adapter caseResourceMap(ResourceMap object) {
				return createResourceMapAdapter();
			}
			@Override
			public Adapter caseAlias(Alias object) {
				return createAliasAdapter();
			}
			@Override
			public Adapter caseColorStyle(ColorStyle object) {
				return createColorStyleAdapter();
			}
			@Override
			public Adapter caseIconStyle(IconStyle object) {
				return createIconStyleAdapter();
			}
			@Override
			public Adapter caseLabelStyle(LabelStyle object) {
				return createLabelStyleAdapter();
			}
			@Override
			public Adapter caseLineStyle(LineStyle object) {
				return createLineStyleAdapter();
			}
			@Override
			public Adapter casePolyStyle(PolyStyle object) {
				return createPolyStyleAdapter();
			}
			@Override
			public Adapter caseBalloonStyle(BalloonStyle object) {
				return createBalloonStyleAdapter();
			}
			@Override
			public Adapter casePair(Pair object) {
				return createPairAdapter();
			}
			@Override
			public Adapter caseListStyle(ListStyle object) {
				return createListStyleAdapter();
			}
			@Override
			public Adapter caseItemIcon(ItemIcon object) {
				return createItemIconAdapter();
			}
			@Override
			public Adapter caseAbstractStyle(AbstractStyle object) {
				return createAbstractStyleAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link kml.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.AbstractView <em>Abstract View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.AbstractView
	 * @generated
	 */
	public Adapter createAbstractViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.TimePrimitive <em>Time Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.TimePrimitive
	 * @generated
	 */
	public Adapter createTimePrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.TimeSpan <em>Time Span</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.TimeSpan
	 * @generated
	 */
	public Adapter createTimeSpanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.TimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.TimeStamp
	 * @generated
	 */
	public Adapter createTimeStampAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.Camera <em>Camera</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.Camera
	 * @generated
	 */
	public Adapter createCameraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.LookAt <em>Look At</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.LookAt
	 * @generated
	 */
	public Adapter createLookAtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.StyleSelector <em>Style Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.StyleSelector
	 * @generated
	 */
	public Adapter createStyleSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.Style <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.Style
	 * @generated
	 */
	public Adapter createStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.StyleMap <em>Style Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.StyleMap
	 * @generated
	 */
	public Adapter createStyleMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.Region
	 * @generated
	 */
	public Adapter createRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.LatLonAltBox <em>Lat Lon Alt Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.LatLonAltBox
	 * @generated
	 */
	public Adapter createLatLonAltBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.Lod <em>Lod</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.Lod
	 * @generated
	 */
	public Adapter createLodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.ExtendedData <em>Extended Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.ExtendedData
	 * @generated
	 */
	public Adapter createExtendedDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.SchemaData <em>Schema Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.SchemaData
	 * @generated
	 */
	public Adapter createSchemaDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.SimpleData <em>Simple Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.SimpleData
	 * @generated
	 */
	public Adapter createSimpleDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.Overlay <em>Overlay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.Overlay
	 * @generated
	 */
	public Adapter createOverlayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.Placemark <em>Placemark</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.Placemark
	 * @generated
	 */
	public Adapter createPlacemarkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.NetworkLink <em>Network Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.NetworkLink
	 * @generated
	 */
	public Adapter createNetworkLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.Icon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.Icon
	 * @generated
	 */
	public Adapter createIconAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.GroundOverlay <em>Ground Overlay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.GroundOverlay
	 * @generated
	 */
	public Adapter createGroundOverlayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.LatLonBox <em>Lat Lon Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.LatLonBox
	 * @generated
	 */
	public Adapter createLatLonBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.PhotoOverlay <em>Photo Overlay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.PhotoOverlay
	 * @generated
	 */
	public Adapter createPhotoOverlayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.ViewVolume <em>View Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.ViewVolume
	 * @generated
	 */
	public Adapter createViewVolumeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.ImagePyramid <em>Image Pyramid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.ImagePyramid
	 * @generated
	 */
	public Adapter createImagePyramidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.Point
	 * @generated
	 */
	public Adapter createPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.ScreenOverlay <em>Screen Overlay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.ScreenOverlay
	 * @generated
	 */
	public Adapter createScreenOverlayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.Vec2Type <em>Vec2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.Vec2Type
	 * @generated
	 */
	public Adapter createVec2TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.Folder
	 * @generated
	 */
	public Adapter createFolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.Document
	 * @generated
	 */
	public Adapter createDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.Schema
	 * @generated
	 */
	public Adapter createSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.SimpleField <em>Simple Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.SimpleField
	 * @generated
	 */
	public Adapter createSimpleFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.Geometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.Geometry
	 * @generated
	 */
	public Adapter createGeometryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.LineString <em>Line String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.LineString
	 * @generated
	 */
	public Adapter createLineStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.Coordinate <em>Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.Coordinate
	 * @generated
	 */
	public Adapter createCoordinateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.LinearRing <em>Linear Ring</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.LinearRing
	 * @generated
	 */
	public Adapter createLinearRingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.Polygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.Polygon
	 * @generated
	 */
	public Adapter createPolygonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.MultiGeometry <em>Multi Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.MultiGeometry
	 * @generated
	 */
	public Adapter createMultiGeometryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.Orientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.Orientation
	 * @generated
	 */
	public Adapter createOrientationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.Scale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.Scale
	 * @generated
	 */
	public Adapter createScaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.ResourceMap <em>Resource Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.ResourceMap
	 * @generated
	 */
	public Adapter createResourceMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.Alias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.Alias
	 * @generated
	 */
	public Adapter createAliasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.ColorStyle <em>Color Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.ColorStyle
	 * @generated
	 */
	public Adapter createColorStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.IconStyle <em>Icon Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.IconStyle
	 * @generated
	 */
	public Adapter createIconStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.LabelStyle <em>Label Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.LabelStyle
	 * @generated
	 */
	public Adapter createLabelStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.LineStyle <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.LineStyle
	 * @generated
	 */
	public Adapter createLineStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.PolyStyle <em>Poly Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.PolyStyle
	 * @generated
	 */
	public Adapter createPolyStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.BalloonStyle <em>Balloon Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.BalloonStyle
	 * @generated
	 */
	public Adapter createBalloonStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.Pair <em>Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.Pair
	 * @generated
	 */
	public Adapter createPairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.ListStyle <em>List Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.ListStyle
	 * @generated
	 */
	public Adapter createListStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.ItemIcon <em>Item Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.ItemIcon
	 * @generated
	 */
	public Adapter createItemIconAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kml.AbstractStyle <em>Abstract Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kml.AbstractStyle
	 * @generated
	 */
	public Adapter createAbstractStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //KmlAdapterFactory
