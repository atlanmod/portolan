/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml.impl;

import kml.Alias;
import kml.AltitudeMode;
import kml.BalloonStyle;
import kml.Camera;
import kml.ColorMode;
import kml.Coordinate;
import kml.Data;
import kml.DisplayMode;
import kml.Document;
import kml.ExtendedData;
import kml.Folder;
import kml.GridOrigin;
import kml.GroundOverlay;
import kml.Icon;
import kml.IconStyle;
import kml.ImagePyramid;
import kml.ItemIcon;
import kml.KmlFactory;
import kml.KmlPackage;
import kml.LabelStyle;
import kml.LatLonAltBox;
import kml.LatLonBox;
import kml.LineString;
import kml.LineStyle;
import kml.LinearRing;
import kml.Link;
import kml.ListStyle;
import kml.ListeItemType;
import kml.Location;
import kml.Lod;
import kml.LookAt;
import kml.Model;
import kml.MultiGeometry;
import kml.NetworkLink;
import kml.Orientation;
import kml.Pair;
import kml.PhotoOverlay;
import kml.Placemark;
import kml.Point;
import kml.PolyStyle;
import kml.Polygon;
import kml.RefreshMode;
import kml.Region;
import kml.ResourceMap;
import kml.Scale;
import kml.Schema;
import kml.SchemaData;
import kml.SchemaType;
import kml.ScreenOverlay;
import kml.Shape;
import kml.SimpleData;
import kml.SimpleField;
import kml.State;
import kml.Style;
import kml.StyleMap;
import kml.StyleState;
import kml.TimeSpan;
import kml.TimeStamp;
import kml.Units;
import kml.Vec2Type;
import kml.ViewRefreshMode;
import kml.ViewVolume;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KmlFactoryImpl extends EFactoryImpl implements KmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KmlFactory init() {
		try {
			KmlFactory theKmlFactory = (KmlFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.opengis.net/kml/2.2"); 
			if (theKmlFactory != null) {
				return theKmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case KmlPackage.TIME_SPAN: return createTimeSpan();
			case KmlPackage.TIME_STAMP: return createTimeStamp();
			case KmlPackage.CAMERA: return createCamera();
			case KmlPackage.LOOK_AT: return createLookAt();
			case KmlPackage.STYLE: return createStyle();
			case KmlPackage.STYLE_MAP: return createStyleMap();
			case KmlPackage.REGION: return createRegion();
			case KmlPackage.LAT_LON_ALT_BOX: return createLatLonAltBox();
			case KmlPackage.LOD: return createLod();
			case KmlPackage.EXTENDED_DATA: return createExtendedData();
			case KmlPackage.DATA: return createData();
			case KmlPackage.SCHEMA_DATA: return createSchemaData();
			case KmlPackage.SIMPLE_DATA: return createSimpleData();
			case KmlPackage.PLACEMARK: return createPlacemark();
			case KmlPackage.NETWORK_LINK: return createNetworkLink();
			case KmlPackage.LINK: return createLink();
			case KmlPackage.ICON: return createIcon();
			case KmlPackage.GROUND_OVERLAY: return createGroundOverlay();
			case KmlPackage.LAT_LON_BOX: return createLatLonBox();
			case KmlPackage.PHOTO_OVERLAY: return createPhotoOverlay();
			case KmlPackage.VIEW_VOLUME: return createViewVolume();
			case KmlPackage.IMAGE_PYRAMID: return createImagePyramid();
			case KmlPackage.POINT: return createPoint();
			case KmlPackage.SCREEN_OVERLAY: return createScreenOverlay();
			case KmlPackage.VEC2_TYPE: return createVec2Type();
			case KmlPackage.FOLDER: return createFolder();
			case KmlPackage.DOCUMENT: return createDocument();
			case KmlPackage.SCHEMA: return createSchema();
			case KmlPackage.SIMPLE_FIELD: return createSimpleField();
			case KmlPackage.LINE_STRING: return createLineString();
			case KmlPackage.COORDINATE: return createCoordinate();
			case KmlPackage.LINEAR_RING: return createLinearRing();
			case KmlPackage.POLYGON: return createPolygon();
			case KmlPackage.MULTI_GEOMETRY: return createMultiGeometry();
			case KmlPackage.MODEL: return createModel();
			case KmlPackage.LOCATION: return createLocation();
			case KmlPackage.ORIENTATION: return createOrientation();
			case KmlPackage.SCALE: return createScale();
			case KmlPackage.RESOURCE_MAP: return createResourceMap();
			case KmlPackage.ALIAS: return createAlias();
			case KmlPackage.ICON_STYLE: return createIconStyle();
			case KmlPackage.LABEL_STYLE: return createLabelStyle();
			case KmlPackage.LINE_STYLE: return createLineStyle();
			case KmlPackage.POLY_STYLE: return createPolyStyle();
			case KmlPackage.BALLOON_STYLE: return createBalloonStyle();
			case KmlPackage.PAIR: return createPair();
			case KmlPackage.LIST_STYLE: return createListStyle();
			case KmlPackage.ITEM_ICON: return createItemIcon();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case KmlPackage.ALTITUDE_MODE:
				return createAltitudeModeFromString(eDataType, initialValue);
			case KmlPackage.REFRESH_MODE:
				return createRefreshModeFromString(eDataType, initialValue);
			case KmlPackage.VIEW_REFRESH_MODE:
				return createViewRefreshModeFromString(eDataType, initialValue);
			case KmlPackage.SHAPE:
				return createShapeFromString(eDataType, initialValue);
			case KmlPackage.GRID_ORIGIN:
				return createGridOriginFromString(eDataType, initialValue);
			case KmlPackage.UNITS:
				return createUnitsFromString(eDataType, initialValue);
			case KmlPackage.SCHEMA_TYPE:
				return createSchemaTypeFromString(eDataType, initialValue);
			case KmlPackage.COLOR_MODE:
				return createColorModeFromString(eDataType, initialValue);
			case KmlPackage.DISPLAY_MODE:
				return createDisplayModeFromString(eDataType, initialValue);
			case KmlPackage.STYLE_STATE:
				return createStyleStateFromString(eDataType, initialValue);
			case KmlPackage.LISTE_ITEM_TYPE:
				return createListeItemTypeFromString(eDataType, initialValue);
			case KmlPackage.STATE:
				return createStateFromString(eDataType, initialValue);
			case KmlPackage.COLOR:
				return createColorFromString(eDataType, initialValue);
			case KmlPackage.ANGLE90:
				return createAngle90FromString(eDataType, initialValue);
			case KmlPackage.ANGLE180:
				return createAngle180FromString(eDataType, initialValue);
			case KmlPackage.ANGLE360:
				return createAngle360FromString(eDataType, initialValue);
			case KmlPackage.ANGLE_POS90:
				return createAnglePos90FromString(eDataType, initialValue);
			case KmlPackage.ANGLE_POS180:
				return createAnglePos180FromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case KmlPackage.ALTITUDE_MODE:
				return convertAltitudeModeToString(eDataType, instanceValue);
			case KmlPackage.REFRESH_MODE:
				return convertRefreshModeToString(eDataType, instanceValue);
			case KmlPackage.VIEW_REFRESH_MODE:
				return convertViewRefreshModeToString(eDataType, instanceValue);
			case KmlPackage.SHAPE:
				return convertShapeToString(eDataType, instanceValue);
			case KmlPackage.GRID_ORIGIN:
				return convertGridOriginToString(eDataType, instanceValue);
			case KmlPackage.UNITS:
				return convertUnitsToString(eDataType, instanceValue);
			case KmlPackage.SCHEMA_TYPE:
				return convertSchemaTypeToString(eDataType, instanceValue);
			case KmlPackage.COLOR_MODE:
				return convertColorModeToString(eDataType, instanceValue);
			case KmlPackage.DISPLAY_MODE:
				return convertDisplayModeToString(eDataType, instanceValue);
			case KmlPackage.STYLE_STATE:
				return convertStyleStateToString(eDataType, instanceValue);
			case KmlPackage.LISTE_ITEM_TYPE:
				return convertListeItemTypeToString(eDataType, instanceValue);
			case KmlPackage.STATE:
				return convertStateToString(eDataType, instanceValue);
			case KmlPackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
			case KmlPackage.ANGLE90:
				return convertAngle90ToString(eDataType, instanceValue);
			case KmlPackage.ANGLE180:
				return convertAngle180ToString(eDataType, instanceValue);
			case KmlPackage.ANGLE360:
				return convertAngle360ToString(eDataType, instanceValue);
			case KmlPackage.ANGLE_POS90:
				return convertAnglePos90ToString(eDataType, instanceValue);
			case KmlPackage.ANGLE_POS180:
				return convertAnglePos180ToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSpan createTimeSpan() {
		TimeSpanImpl timeSpan = new TimeSpanImpl();
		return timeSpan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeStamp createTimeStamp() {
		TimeStampImpl timeStamp = new TimeStampImpl();
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Camera createCamera() {
		CameraImpl camera = new CameraImpl();
		return camera;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookAt createLookAt() {
		LookAtImpl lookAt = new LookAtImpl();
		return lookAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Style createStyle() {
		StyleImpl style = new StyleImpl();
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleMap createStyleMap() {
		StyleMapImpl styleMap = new StyleMapImpl();
		return styleMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region createRegion() {
		RegionImpl region = new RegionImpl();
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatLonAltBox createLatLonAltBox() {
		LatLonAltBoxImpl latLonAltBox = new LatLonAltBoxImpl();
		return latLonAltBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lod createLod() {
		LodImpl lod = new LodImpl();
		return lod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedData createExtendedData() {
		ExtendedDataImpl extendedData = new ExtendedDataImpl();
		return extendedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaData createSchemaData() {
		SchemaDataImpl schemaData = new SchemaDataImpl();
		return schemaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleData createSimpleData() {
		SimpleDataImpl simpleData = new SimpleDataImpl();
		return simpleData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Placemark createPlacemark() {
		PlacemarkImpl placemark = new PlacemarkImpl();
		return placemark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkLink createNetworkLink() {
		NetworkLinkImpl networkLink = new NetworkLinkImpl();
		return networkLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Icon createIcon() {
		IconImpl icon = new IconImpl();
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroundOverlay createGroundOverlay() {
		GroundOverlayImpl groundOverlay = new GroundOverlayImpl();
		return groundOverlay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatLonBox createLatLonBox() {
		LatLonBoxImpl latLonBox = new LatLonBoxImpl();
		return latLonBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhotoOverlay createPhotoOverlay() {
		PhotoOverlayImpl photoOverlay = new PhotoOverlayImpl();
		return photoOverlay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewVolume createViewVolume() {
		ViewVolumeImpl viewVolume = new ViewVolumeImpl();
		return viewVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagePyramid createImagePyramid() {
		ImagePyramidImpl imagePyramid = new ImagePyramidImpl();
		return imagePyramid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point createPoint() {
		PointImpl point = new PointImpl();
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScreenOverlay createScreenOverlay() {
		ScreenOverlayImpl screenOverlay = new ScreenOverlayImpl();
		return screenOverlay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vec2Type createVec2Type() {
		Vec2TypeImpl vec2Type = new Vec2TypeImpl();
		return vec2Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Folder createFolder() {
		FolderImpl folder = new FolderImpl();
		return folder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema createSchema() {
		SchemaImpl schema = new SchemaImpl();
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleField createSimpleField() {
		SimpleFieldImpl simpleField = new SimpleFieldImpl();
		return simpleField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineString createLineString() {
		LineStringImpl lineString = new LineStringImpl();
		return lineString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordinate createCoordinate() {
		CoordinateImpl coordinate = new CoordinateImpl();
		return coordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearRing createLinearRing() {
		LinearRingImpl linearRing = new LinearRingImpl();
		return linearRing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Polygon createPolygon() {
		PolygonImpl polygon = new PolygonImpl();
		return polygon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiGeometry createMultiGeometry() {
		MultiGeometryImpl multiGeometry = new MultiGeometryImpl();
		return multiGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orientation createOrientation() {
		OrientationImpl orientation = new OrientationImpl();
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scale createScale() {
		ScaleImpl scale = new ScaleImpl();
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceMap createResourceMap() {
		ResourceMapImpl resourceMap = new ResourceMapImpl();
		return resourceMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alias createAlias() {
		AliasImpl alias = new AliasImpl();
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IconStyle createIconStyle() {
		IconStyleImpl iconStyle = new IconStyleImpl();
		return iconStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelStyle createLabelStyle() {
		LabelStyleImpl labelStyle = new LabelStyleImpl();
		return labelStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineStyle createLineStyle() {
		LineStyleImpl lineStyle = new LineStyleImpl();
		return lineStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolyStyle createPolyStyle() {
		PolyStyleImpl polyStyle = new PolyStyleImpl();
		return polyStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BalloonStyle createBalloonStyle() {
		BalloonStyleImpl balloonStyle = new BalloonStyleImpl();
		return balloonStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pair createPair() {
		PairImpl pair = new PairImpl();
		return pair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListStyle createListStyle() {
		ListStyleImpl listStyle = new ListStyleImpl();
		return listStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemIcon createItemIcon() {
		ItemIconImpl itemIcon = new ItemIconImpl();
		return itemIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltitudeMode createAltitudeModeFromString(EDataType eDataType, String initialValue) {
		AltitudeMode result = AltitudeMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAltitudeModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefreshMode createRefreshModeFromString(EDataType eDataType, String initialValue) {
		RefreshMode result = RefreshMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRefreshModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewRefreshMode createViewRefreshModeFromString(EDataType eDataType, String initialValue) {
		ViewRefreshMode result = ViewRefreshMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertViewRefreshModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape createShapeFromString(EDataType eDataType, String initialValue) {
		Shape result = Shape.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShapeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridOrigin createGridOriginFromString(EDataType eDataType, String initialValue) {
		GridOrigin result = GridOrigin.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGridOriginToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Units createUnitsFromString(EDataType eDataType, String initialValue) {
		Units result = Units.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaType createSchemaTypeFromString(EDataType eDataType, String initialValue) {
		SchemaType result = SchemaType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchemaTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorMode createColorModeFromString(EDataType eDataType, String initialValue) {
		ColorMode result = ColorMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayMode createDisplayModeFromString(EDataType eDataType, String initialValue) {
		DisplayMode result = DisplayMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplayModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleState createStyleStateFromString(EDataType eDataType, String initialValue) {
		StyleState result = StyleState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListeItemType createListeItemTypeFromString(EDataType eDataType, String initialValue) {
		ListeItemType result = ListeItemType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListeItemTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createStateFromString(EDataType eDataType, String initialValue) {
		State result = State.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createColorFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createAngle90FromString(EDataType eDataType, String initialValue) {
		return (Double)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAngle90ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createAngle180FromString(EDataType eDataType, String initialValue) {
		return (Double)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAngle180ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createAngle360FromString(EDataType eDataType, String initialValue) {
		return (Double)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAngle360ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createAnglePos90FromString(EDataType eDataType, String initialValue) {
		return (Double)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnglePos90ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createAnglePos180FromString(EDataType eDataType, String initialValue) {
		return (Double)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnglePos180ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KmlPackage getKmlPackage() {
		return (KmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KmlPackage getPackage() {
		return KmlPackage.eINSTANCE;
	}

} //KmlFactoryImpl
