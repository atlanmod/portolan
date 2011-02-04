/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kml.KmlPackage
 * @generated
 */
public interface KmlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KmlFactory eINSTANCE = kml.impl.KmlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Time Span</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Span</em>'.
	 * @generated
	 */
	TimeSpan createTimeSpan();

	/**
	 * Returns a new object of class '<em>Time Stamp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Stamp</em>'.
	 * @generated
	 */
	TimeStamp createTimeStamp();

	/**
	 * Returns a new object of class '<em>Camera</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camera</em>'.
	 * @generated
	 */
	Camera createCamera();

	/**
	 * Returns a new object of class '<em>Look At</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Look At</em>'.
	 * @generated
	 */
	LookAt createLookAt();

	/**
	 * Returns a new object of class '<em>Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Style</em>'.
	 * @generated
	 */
	Style createStyle();

	/**
	 * Returns a new object of class '<em>Style Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Style Map</em>'.
	 * @generated
	 */
	StyleMap createStyleMap();

	/**
	 * Returns a new object of class '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Region</em>'.
	 * @generated
	 */
	Region createRegion();

	/**
	 * Returns a new object of class '<em>Lat Lon Alt Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lat Lon Alt Box</em>'.
	 * @generated
	 */
	LatLonAltBox createLatLonAltBox();

	/**
	 * Returns a new object of class '<em>Lod</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lod</em>'.
	 * @generated
	 */
	Lod createLod();

	/**
	 * Returns a new object of class '<em>Extended Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extended Data</em>'.
	 * @generated
	 */
	ExtendedData createExtendedData();

	/**
	 * Returns a new object of class '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data</em>'.
	 * @generated
	 */
	Data createData();

	/**
	 * Returns a new object of class '<em>Schema Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schema Data</em>'.
	 * @generated
	 */
	SchemaData createSchemaData();

	/**
	 * Returns a new object of class '<em>Simple Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Data</em>'.
	 * @generated
	 */
	SimpleData createSimpleData();

	/**
	 * Returns a new object of class '<em>Placemark</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Placemark</em>'.
	 * @generated
	 */
	Placemark createPlacemark();

	/**
	 * Returns a new object of class '<em>Network Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Link</em>'.
	 * @generated
	 */
	NetworkLink createNetworkLink();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	Link createLink();

	/**
	 * Returns a new object of class '<em>Icon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Icon</em>'.
	 * @generated
	 */
	Icon createIcon();

	/**
	 * Returns a new object of class '<em>Ground Overlay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ground Overlay</em>'.
	 * @generated
	 */
	GroundOverlay createGroundOverlay();

	/**
	 * Returns a new object of class '<em>Lat Lon Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lat Lon Box</em>'.
	 * @generated
	 */
	LatLonBox createLatLonBox();

	/**
	 * Returns a new object of class '<em>Photo Overlay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Photo Overlay</em>'.
	 * @generated
	 */
	PhotoOverlay createPhotoOverlay();

	/**
	 * Returns a new object of class '<em>View Volume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Volume</em>'.
	 * @generated
	 */
	ViewVolume createViewVolume();

	/**
	 * Returns a new object of class '<em>Image Pyramid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Pyramid</em>'.
	 * @generated
	 */
	ImagePyramid createImagePyramid();

	/**
	 * Returns a new object of class '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point</em>'.
	 * @generated
	 */
	Point createPoint();

	/**
	 * Returns a new object of class '<em>Screen Overlay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Screen Overlay</em>'.
	 * @generated
	 */
	ScreenOverlay createScreenOverlay();

	/**
	 * Returns a new object of class '<em>Vec2 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vec2 Type</em>'.
	 * @generated
	 */
	Vec2Type createVec2Type();

	/**
	 * Returns a new object of class '<em>Folder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Folder</em>'.
	 * @generated
	 */
	Folder createFolder();

	/**
	 * Returns a new object of class '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document</em>'.
	 * @generated
	 */
	Document createDocument();

	/**
	 * Returns a new object of class '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schema</em>'.
	 * @generated
	 */
	Schema createSchema();

	/**
	 * Returns a new object of class '<em>Simple Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Field</em>'.
	 * @generated
	 */
	SimpleField createSimpleField();

	/**
	 * Returns a new object of class '<em>Line String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line String</em>'.
	 * @generated
	 */
	LineString createLineString();

	/**
	 * Returns a new object of class '<em>Coordinate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordinate</em>'.
	 * @generated
	 */
	Coordinate createCoordinate();

	/**
	 * Returns a new object of class '<em>Linear Ring</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linear Ring</em>'.
	 * @generated
	 */
	LinearRing createLinearRing();

	/**
	 * Returns a new object of class '<em>Polygon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polygon</em>'.
	 * @generated
	 */
	Polygon createPolygon();

	/**
	 * Returns a new object of class '<em>Multi Geometry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Geometry</em>'.
	 * @generated
	 */
	MultiGeometry createMultiGeometry();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Orientation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orientation</em>'.
	 * @generated
	 */
	Orientation createOrientation();

	/**
	 * Returns a new object of class '<em>Scale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scale</em>'.
	 * @generated
	 */
	Scale createScale();

	/**
	 * Returns a new object of class '<em>Resource Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Map</em>'.
	 * @generated
	 */
	ResourceMap createResourceMap();

	/**
	 * Returns a new object of class '<em>Alias</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alias</em>'.
	 * @generated
	 */
	Alias createAlias();

	/**
	 * Returns a new object of class '<em>Icon Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Icon Style</em>'.
	 * @generated
	 */
	IconStyle createIconStyle();

	/**
	 * Returns a new object of class '<em>Label Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Style</em>'.
	 * @generated
	 */
	LabelStyle createLabelStyle();

	/**
	 * Returns a new object of class '<em>Line Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line Style</em>'.
	 * @generated
	 */
	LineStyle createLineStyle();

	/**
	 * Returns a new object of class '<em>Poly Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Poly Style</em>'.
	 * @generated
	 */
	PolyStyle createPolyStyle();

	/**
	 * Returns a new object of class '<em>Balloon Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Balloon Style</em>'.
	 * @generated
	 */
	BalloonStyle createBalloonStyle();

	/**
	 * Returns a new object of class '<em>Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pair</em>'.
	 * @generated
	 */
	Pair createPair();

	/**
	 * Returns a new object of class '<em>List Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Style</em>'.
	 * @generated
	 */
	ListStyle createListStyle();

	/**
	 * Returns a new object of class '<em>Item Icon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Icon</em>'.
	 * @generated
	 */
	ItemIcon createItemIcon();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	KmlPackage getKmlPackage();

} //KmlFactory
