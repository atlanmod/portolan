/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see kml.KmlFactory
 * @model kind="package"
 * @generated
 */
public interface KmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "kml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opengis.net/kml/2.2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "kml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KmlPackage eINSTANCE = kml.impl.KmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link kml.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.ObjectImpl
	 * @see kml.impl.KmlPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__ID = 0;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__TARGET_ID = 1;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link kml.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.FeatureImpl
	 * @see kml.impl.KmlPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ID = OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__TARGET_ID = OBJECT__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__VISIBILITY = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OPEN = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Atom Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ATOM_AUTHOR = OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Atom Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ATOM_LINK = OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ADDRESS = OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__PHONE_NUMBER = OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Xal Address Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__XAL_ADDRESS_DETAILS = OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Snippet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SNIPPET = OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DESCRIPTION = OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Abstract View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ABSTRACT_VIEW = OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Time Primitive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__TIME_PRIMITIVE = OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__STYLE_URL = OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Style Selectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__STYLE_SELECTORS = OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REGION = OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Extended Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__EXTENDED_DATA = OBJECT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link kml.impl.AbstractViewImpl <em>Abstract View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.AbstractViewImpl
	 * @see kml.impl.KmlPackageImpl#getAbstractView()
	 * @generated
	 */
	int ABSTRACT_VIEW = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VIEW__ID = OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VIEW__TARGET_ID = OBJECT__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VIEW__LONGITUDE = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VIEW__LATITUDE = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VIEW__ALTITUDE = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VIEW__HEADING = OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VIEW__MODE = OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Abstract View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VIEW_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link kml.impl.TimePrimitiveImpl <em>Time Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.TimePrimitiveImpl
	 * @see kml.impl.KmlPackageImpl#getTimePrimitive()
	 * @generated
	 */
	int TIME_PRIMITIVE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PRIMITIVE__ID = OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PRIMITIVE__TARGET_ID = OBJECT__TARGET_ID;

	/**
	 * The number of structural features of the '<em>Time Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PRIMITIVE_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kml.impl.TimeSpanImpl <em>Time Span</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.TimeSpanImpl
	 * @see kml.impl.KmlPackageImpl#getTimeSpan()
	 * @generated
	 */
	int TIME_SPAN = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN__ID = TIME_PRIMITIVE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN__TARGET_ID = TIME_PRIMITIVE__TARGET_ID;

	/**
	 * The number of structural features of the '<em>Time Span</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN_FEATURE_COUNT = TIME_PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kml.impl.TimeStampImpl <em>Time Stamp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.TimeStampImpl
	 * @see kml.impl.KmlPackageImpl#getTimeStamp()
	 * @generated
	 */
	int TIME_STAMP = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP__ID = TIME_PRIMITIVE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP__TARGET_ID = TIME_PRIMITIVE__TARGET_ID;

	/**
	 * The number of structural features of the '<em>Time Stamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_FEATURE_COUNT = TIME_PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kml.impl.CameraImpl <em>Camera</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.CameraImpl
	 * @see kml.impl.KmlPackageImpl#getCamera()
	 * @generated
	 */
	int CAMERA = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__ID = ABSTRACT_VIEW__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__TARGET_ID = ABSTRACT_VIEW__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__LONGITUDE = ABSTRACT_VIEW__LONGITUDE;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__LATITUDE = ABSTRACT_VIEW__LATITUDE;

	/**
	 * The feature id for the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__ALTITUDE = ABSTRACT_VIEW__ALTITUDE;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__HEADING = ABSTRACT_VIEW__HEADING;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__MODE = ABSTRACT_VIEW__MODE;

	/**
	 * The feature id for the '<em><b>Tilt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__TILT = ABSTRACT_VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Roll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__ROLL = ABSTRACT_VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Camera</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_FEATURE_COUNT = ABSTRACT_VIEW_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kml.impl.LookAtImpl <em>Look At</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.LookAtImpl
	 * @see kml.impl.KmlPackageImpl#getLookAt()
	 * @generated
	 */
	int LOOK_AT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT__ID = ABSTRACT_VIEW__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT__TARGET_ID = ABSTRACT_VIEW__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT__LONGITUDE = ABSTRACT_VIEW__LONGITUDE;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT__LATITUDE = ABSTRACT_VIEW__LATITUDE;

	/**
	 * The feature id for the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT__ALTITUDE = ABSTRACT_VIEW__ALTITUDE;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT__HEADING = ABSTRACT_VIEW__HEADING;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT__MODE = ABSTRACT_VIEW__MODE;

	/**
	 * The feature id for the '<em><b>Tilt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT__TILT = ABSTRACT_VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT__RANGE = ABSTRACT_VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Look At</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT_FEATURE_COUNT = ABSTRACT_VIEW_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kml.impl.StyleSelectorImpl <em>Style Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.StyleSelectorImpl
	 * @see kml.impl.KmlPackageImpl#getStyleSelector()
	 * @generated
	 */
	int STYLE_SELECTOR = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SELECTOR__ID = OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SELECTOR__TARGET_ID = OBJECT__TARGET_ID;

	/**
	 * The number of structural features of the '<em>Style Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SELECTOR_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kml.impl.StyleImpl <em>Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.StyleImpl
	 * @see kml.impl.KmlPackageImpl#getStyle()
	 * @generated
	 */
	int STYLE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__ID = STYLE_SELECTOR__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__TARGET_ID = STYLE_SELECTOR__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__STYLES = STYLE_SELECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_FEATURE_COUNT = STYLE_SELECTOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kml.impl.StyleMapImpl <em>Style Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.StyleMapImpl
	 * @see kml.impl.KmlPackageImpl#getStyleMap()
	 * @generated
	 */
	int STYLE_MAP = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MAP__ID = STYLE_SELECTOR__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MAP__TARGET_ID = STYLE_SELECTOR__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Pairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MAP__PAIRS = STYLE_SELECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Style Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MAP_FEATURE_COUNT = STYLE_SELECTOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kml.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.RegionImpl
	 * @see kml.impl.KmlPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__ID = OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__TARGET_ID = OBJECT__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Lat Lon Alt Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__LAT_LON_ALT_BOX = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lod</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__LOD = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kml.impl.LatLonBoxImpl <em>Lat Lon Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.LatLonBoxImpl
	 * @see kml.impl.KmlPackageImpl#getLatLonBox()
	 * @generated
	 */
	int LAT_LON_BOX = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_BOX__ID = OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_BOX__TARGET_ID = OBJECT__TARGET_ID;

	/**
	 * The feature id for the '<em><b>North</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_BOX__NORTH = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>South</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_BOX__SOUTH = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>East</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_BOX__EAST = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>West</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_BOX__WEST = OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_BOX__ROTATION = OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Lat Lon Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_BOX_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link kml.impl.LatLonAltBoxImpl <em>Lat Lon Alt Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.LatLonAltBoxImpl
	 * @see kml.impl.KmlPackageImpl#getLatLonAltBox()
	 * @generated
	 */
	int LAT_LON_ALT_BOX = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX__ID = LAT_LON_BOX__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX__TARGET_ID = LAT_LON_BOX__TARGET_ID;

	/**
	 * The feature id for the '<em><b>North</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX__NORTH = LAT_LON_BOX__NORTH;

	/**
	 * The feature id for the '<em><b>South</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX__SOUTH = LAT_LON_BOX__SOUTH;

	/**
	 * The feature id for the '<em><b>East</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX__EAST = LAT_LON_BOX__EAST;

	/**
	 * The feature id for the '<em><b>West</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX__WEST = LAT_LON_BOX__WEST;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX__ROTATION = LAT_LON_BOX__ROTATION;

	/**
	 * The feature id for the '<em><b>Min Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX__MIN_ALTITUDE = LAT_LON_BOX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX__MAX_ALTITUDE = LAT_LON_BOX_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX__MODE = LAT_LON_BOX_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Lat Lon Alt Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX_FEATURE_COUNT = LAT_LON_BOX_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link kml.impl.LodImpl <em>Lod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.LodImpl
	 * @see kml.impl.KmlPackageImpl#getLod()
	 * @generated
	 */
	int LOD = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOD__ID = OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOD__TARGET_ID = OBJECT__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Min Lod Pixels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOD__MIN_LOD_PIXELS = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Lod Pixels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOD__MAX_LOD_PIXELS = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Fade Extent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOD__MIN_FADE_EXTENT = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Fade Extent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOD__MAX_FADE_EXTENT = OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Lod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOD_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link kml.impl.ExtendedDataImpl <em>Extended Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.ExtendedDataImpl
	 * @see kml.impl.KmlPackageImpl#getExtendedData()
	 * @generated
	 */
	int EXTENDED_DATA = 14;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_DATA__DATA = 0;

	/**
	 * The feature id for the '<em><b>Schema Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_DATA__SCHEMA_DATA = 1;

	/**
	 * The feature id for the '<em><b>Xml Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_DATA__XML_CONTENT = 2;

	/**
	 * The number of structural features of the '<em>Extended Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_DATA_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link kml.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.DataImpl
	 * @see kml.impl.KmlPackageImpl#getData()
	 * @generated
	 */
	int DATA = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DISPLAY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link kml.impl.SchemaDataImpl <em>Schema Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.SchemaDataImpl
	 * @see kml.impl.KmlPackageImpl#getSchemaData()
	 * @generated
	 */
	int SCHEMA_DATA = 16;

	/**
	 * The feature id for the '<em><b>Schema Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DATA__SCHEMA_URL = 0;

	/**
	 * The feature id for the '<em><b>Simpledata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DATA__SIMPLEDATA = 1;

	/**
	 * The number of structural features of the '<em>Schema Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DATA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link kml.impl.SimpleDataImpl <em>Simple Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.SimpleDataImpl
	 * @see kml.impl.KmlPackageImpl#getSimpleData()
	 * @generated
	 */
	int SIMPLE_DATA = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DATA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DATA__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Simple Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DATA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link kml.impl.OverlayImpl <em>Overlay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.OverlayImpl
	 * @see kml.impl.KmlPackageImpl#getOverlay()
	 * @generated
	 */
	int OVERLAY = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY__ID = FEATURE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY__TARGET_ID = FEATURE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY__VISIBILITY = FEATURE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY__OPEN = FEATURE__OPEN;

	/**
	 * The feature id for the '<em><b>Atom Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY__ATOM_AUTHOR = FEATURE__ATOM_AUTHOR;

	/**
	 * The feature id for the '<em><b>Atom Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY__ATOM_LINK = FEATURE__ATOM_LINK;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY__ADDRESS = FEATURE__ADDRESS;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY__PHONE_NUMBER = FEATURE__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Xal Address Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY__XAL_ADDRESS_DETAILS = FEATURE__XAL_ADDRESS_DETAILS;

	/**
	 * The feature id for the '<em><b>Snippet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY__SNIPPET = FEATURE__SNIPPET;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY__DESCRIPTION = FEATURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Abstract View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY__ABSTRACT_VIEW = FEATURE__ABSTRACT_VIEW;

	/**
	 * The feature id for the '<em><b>Time Primitive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY__TIME_PRIMITIVE = FEATURE__TIME_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY__STYLE_URL = FEATURE__STYLE_URL;

	/**
	 * The feature id for the '<em><b>Style Selectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY__STYLE_SELECTORS = FEATURE__STYLE_SELECTORS;

	/**
	 * The feature id for the '<em><b>Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY__REGION = FEATURE__REGION;

	/**
	 * The feature id for the '<em><b>Extended Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY__EXTENDED_DATA = FEATURE__EXTENDED_DATA;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY__COLOR = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Draw Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY__DRAW_ORDER = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY__ICON = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Overlay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link kml.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.ContainerImpl
	 * @see kml.impl.KmlPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ID = FEATURE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__TARGET_ID = FEATURE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__VISIBILITY = FEATURE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__OPEN = FEATURE__OPEN;

	/**
	 * The feature id for the '<em><b>Atom Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ATOM_AUTHOR = FEATURE__ATOM_AUTHOR;

	/**
	 * The feature id for the '<em><b>Atom Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ATOM_LINK = FEATURE__ATOM_LINK;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ADDRESS = FEATURE__ADDRESS;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PHONE_NUMBER = FEATURE__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Xal Address Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__XAL_ADDRESS_DETAILS = FEATURE__XAL_ADDRESS_DETAILS;

	/**
	 * The feature id for the '<em><b>Snippet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__SNIPPET = FEATURE__SNIPPET;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DESCRIPTION = FEATURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Abstract View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ABSTRACT_VIEW = FEATURE__ABSTRACT_VIEW;

	/**
	 * The feature id for the '<em><b>Time Primitive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__TIME_PRIMITIVE = FEATURE__TIME_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__STYLE_URL = FEATURE__STYLE_URL;

	/**
	 * The feature id for the '<em><b>Style Selectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__STYLE_SELECTORS = FEATURE__STYLE_SELECTORS;

	/**
	 * The feature id for the '<em><b>Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__REGION = FEATURE__REGION;

	/**
	 * The feature id for the '<em><b>Extended Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__EXTENDED_DATA = FEATURE__EXTENDED_DATA;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__FEATURES = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kml.impl.PlacemarkImpl <em>Placemark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.PlacemarkImpl
	 * @see kml.impl.KmlPackageImpl#getPlacemark()
	 * @generated
	 */
	int PLACEMARK = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK__ID = FEATURE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK__TARGET_ID = FEATURE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK__VISIBILITY = FEATURE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK__OPEN = FEATURE__OPEN;

	/**
	 * The feature id for the '<em><b>Atom Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK__ATOM_AUTHOR = FEATURE__ATOM_AUTHOR;

	/**
	 * The feature id for the '<em><b>Atom Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK__ATOM_LINK = FEATURE__ATOM_LINK;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK__ADDRESS = FEATURE__ADDRESS;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK__PHONE_NUMBER = FEATURE__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Xal Address Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK__XAL_ADDRESS_DETAILS = FEATURE__XAL_ADDRESS_DETAILS;

	/**
	 * The feature id for the '<em><b>Snippet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK__SNIPPET = FEATURE__SNIPPET;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK__DESCRIPTION = FEATURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Abstract View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK__ABSTRACT_VIEW = FEATURE__ABSTRACT_VIEW;

	/**
	 * The feature id for the '<em><b>Time Primitive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK__TIME_PRIMITIVE = FEATURE__TIME_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK__STYLE_URL = FEATURE__STYLE_URL;

	/**
	 * The feature id for the '<em><b>Style Selectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK__STYLE_SELECTORS = FEATURE__STYLE_SELECTORS;

	/**
	 * The feature id for the '<em><b>Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK__REGION = FEATURE__REGION;

	/**
	 * The feature id for the '<em><b>Extended Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK__EXTENDED_DATA = FEATURE__EXTENDED_DATA;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK__GEOMETRY = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Placemark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kml.impl.NetworkLinkImpl <em>Network Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.NetworkLinkImpl
	 * @see kml.impl.KmlPackageImpl#getNetworkLink()
	 * @generated
	 */
	int NETWORK_LINK = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__ID = FEATURE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__TARGET_ID = FEATURE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__VISIBILITY = FEATURE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__OPEN = FEATURE__OPEN;

	/**
	 * The feature id for the '<em><b>Atom Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__ATOM_AUTHOR = FEATURE__ATOM_AUTHOR;

	/**
	 * The feature id for the '<em><b>Atom Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__ATOM_LINK = FEATURE__ATOM_LINK;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__ADDRESS = FEATURE__ADDRESS;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__PHONE_NUMBER = FEATURE__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Xal Address Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__XAL_ADDRESS_DETAILS = FEATURE__XAL_ADDRESS_DETAILS;

	/**
	 * The feature id for the '<em><b>Snippet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__SNIPPET = FEATURE__SNIPPET;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__DESCRIPTION = FEATURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Abstract View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__ABSTRACT_VIEW = FEATURE__ABSTRACT_VIEW;

	/**
	 * The feature id for the '<em><b>Time Primitive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__TIME_PRIMITIVE = FEATURE__TIME_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__STYLE_URL = FEATURE__STYLE_URL;

	/**
	 * The feature id for the '<em><b>Style Selectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__STYLE_SELECTORS = FEATURE__STYLE_SELECTORS;

	/**
	 * The feature id for the '<em><b>Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__REGION = FEATURE__REGION;

	/**
	 * The feature id for the '<em><b>Extended Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__EXTENDED_DATA = FEATURE__EXTENDED_DATA;

	/**
	 * The feature id for the '<em><b>Refresh Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__REFRESH_VISIBILITY = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fly To View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__FLY_TO_VIEW = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__LINK = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Network Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link kml.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.LinkImpl
	 * @see kml.impl.KmlPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ID = OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TARGET_ID = OBJECT__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Url Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__URL_REF = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refresh Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__REFRESH_MODE = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Refresh Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__REFRESH_INTERVAL = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>View Refresh Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__VIEW_REFRESH_MODE = OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>View Refresh Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__VIEW_REFRESH_TIME = OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>View Bound Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__VIEW_BOUND_SCALE = OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>View Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__VIEW_FORMAT = OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Http Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__HTTP_QUERY = OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link kml.impl.IconImpl <em>Icon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.IconImpl
	 * @see kml.impl.KmlPackageImpl#getIcon()
	 * @generated
	 */
	int ICON = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__ID = LINK__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__TARGET_ID = LINK__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Url Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__URL_REF = LINK__URL_REF;

	/**
	 * The feature id for the '<em><b>Refresh Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__REFRESH_MODE = LINK__REFRESH_MODE;

	/**
	 * The feature id for the '<em><b>Refresh Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__REFRESH_INTERVAL = LINK__REFRESH_INTERVAL;

	/**
	 * The feature id for the '<em><b>View Refresh Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__VIEW_REFRESH_MODE = LINK__VIEW_REFRESH_MODE;

	/**
	 * The feature id for the '<em><b>View Refresh Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__VIEW_REFRESH_TIME = LINK__VIEW_REFRESH_TIME;

	/**
	 * The feature id for the '<em><b>View Bound Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__VIEW_BOUND_SCALE = LINK__VIEW_BOUND_SCALE;

	/**
	 * The feature id for the '<em><b>View Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__VIEW_FORMAT = LINK__VIEW_FORMAT;

	/**
	 * The feature id for the '<em><b>Http Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__HTTP_QUERY = LINK__HTTP_QUERY;

	/**
	 * The number of structural features of the '<em>Icon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_FEATURE_COUNT = LINK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kml.impl.GroundOverlayImpl <em>Ground Overlay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.GroundOverlayImpl
	 * @see kml.impl.KmlPackageImpl#getGroundOverlay()
	 * @generated
	 */
	int GROUND_OVERLAY = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY__ID = OVERLAY__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY__TARGET_ID = OVERLAY__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY__NAME = OVERLAY__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY__VISIBILITY = OVERLAY__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY__OPEN = OVERLAY__OPEN;

	/**
	 * The feature id for the '<em><b>Atom Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY__ATOM_AUTHOR = OVERLAY__ATOM_AUTHOR;

	/**
	 * The feature id for the '<em><b>Atom Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY__ATOM_LINK = OVERLAY__ATOM_LINK;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY__ADDRESS = OVERLAY__ADDRESS;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY__PHONE_NUMBER = OVERLAY__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Xal Address Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY__XAL_ADDRESS_DETAILS = OVERLAY__XAL_ADDRESS_DETAILS;

	/**
	 * The feature id for the '<em><b>Snippet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY__SNIPPET = OVERLAY__SNIPPET;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY__DESCRIPTION = OVERLAY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Abstract View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY__ABSTRACT_VIEW = OVERLAY__ABSTRACT_VIEW;

	/**
	 * The feature id for the '<em><b>Time Primitive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY__TIME_PRIMITIVE = OVERLAY__TIME_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY__STYLE_URL = OVERLAY__STYLE_URL;

	/**
	 * The feature id for the '<em><b>Style Selectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY__STYLE_SELECTORS = OVERLAY__STYLE_SELECTORS;

	/**
	 * The feature id for the '<em><b>Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY__REGION = OVERLAY__REGION;

	/**
	 * The feature id for the '<em><b>Extended Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY__EXTENDED_DATA = OVERLAY__EXTENDED_DATA;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY__COLOR = OVERLAY__COLOR;

	/**
	 * The feature id for the '<em><b>Draw Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY__DRAW_ORDER = OVERLAY__DRAW_ORDER;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY__ICON = OVERLAY__ICON;

	/**
	 * The feature id for the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY__ALTITUDE = OVERLAY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY__MODE = OVERLAY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lat Lon Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY__LAT_LON_BOX = OVERLAY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ground Overlay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_FEATURE_COUNT = OVERLAY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link kml.impl.PhotoOverlayImpl <em>Photo Overlay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.PhotoOverlayImpl
	 * @see kml.impl.KmlPackageImpl#getPhotoOverlay()
	 * @generated
	 */
	int PHOTO_OVERLAY = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY__ID = OVERLAY__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY__TARGET_ID = OVERLAY__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY__NAME = OVERLAY__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY__VISIBILITY = OVERLAY__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY__OPEN = OVERLAY__OPEN;

	/**
	 * The feature id for the '<em><b>Atom Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY__ATOM_AUTHOR = OVERLAY__ATOM_AUTHOR;

	/**
	 * The feature id for the '<em><b>Atom Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY__ATOM_LINK = OVERLAY__ATOM_LINK;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY__ADDRESS = OVERLAY__ADDRESS;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY__PHONE_NUMBER = OVERLAY__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Xal Address Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY__XAL_ADDRESS_DETAILS = OVERLAY__XAL_ADDRESS_DETAILS;

	/**
	 * The feature id for the '<em><b>Snippet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY__SNIPPET = OVERLAY__SNIPPET;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY__DESCRIPTION = OVERLAY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Abstract View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY__ABSTRACT_VIEW = OVERLAY__ABSTRACT_VIEW;

	/**
	 * The feature id for the '<em><b>Time Primitive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY__TIME_PRIMITIVE = OVERLAY__TIME_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY__STYLE_URL = OVERLAY__STYLE_URL;

	/**
	 * The feature id for the '<em><b>Style Selectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY__STYLE_SELECTORS = OVERLAY__STYLE_SELECTORS;

	/**
	 * The feature id for the '<em><b>Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY__REGION = OVERLAY__REGION;

	/**
	 * The feature id for the '<em><b>Extended Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY__EXTENDED_DATA = OVERLAY__EXTENDED_DATA;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY__COLOR = OVERLAY__COLOR;

	/**
	 * The feature id for the '<em><b>Draw Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY__DRAW_ORDER = OVERLAY__DRAW_ORDER;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY__ICON = OVERLAY__ICON;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY__SHAPE = OVERLAY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>View Volume</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY__VIEW_VOLUME = OVERLAY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Roll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY__ROLL = OVERLAY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY__POINT = OVERLAY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Image Pyramid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY__IMAGE_PYRAMID = OVERLAY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Photo Overlay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_FEATURE_COUNT = OVERLAY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link kml.impl.ViewVolumeImpl <em>View Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.ViewVolumeImpl
	 * @see kml.impl.KmlPackageImpl#getViewVolume()
	 * @generated
	 */
	int VIEW_VOLUME = 27;

	/**
	 * The feature id for the '<em><b>Left Fov</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_VOLUME__LEFT_FOV = 0;

	/**
	 * The feature id for the '<em><b>Right Fov</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_VOLUME__RIGHT_FOV = 1;

	/**
	 * The feature id for the '<em><b>Bottom Fov</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_VOLUME__BOTTOM_FOV = 2;

	/**
	 * The feature id for the '<em><b>Top Fov</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_VOLUME__TOP_FOV = 3;

	/**
	 * The feature id for the '<em><b>Near</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_VOLUME__NEAR = 4;

	/**
	 * The number of structural features of the '<em>View Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_VOLUME_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link kml.impl.ImagePyramidImpl <em>Image Pyramid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.ImagePyramidImpl
	 * @see kml.impl.KmlPackageImpl#getImagePyramid()
	 * @generated
	 */
	int IMAGE_PYRAMID = 28;

	/**
	 * The feature id for the '<em><b>Tile Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PYRAMID__TILE_SIZE = 0;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PYRAMID__MAX_WIDTH = 1;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PYRAMID__MAX_HEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Grid Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PYRAMID__GRID_ORIGIN = 3;

	/**
	 * The number of structural features of the '<em>Image Pyramid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PYRAMID_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link kml.impl.GeometryImpl <em>Geometry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.GeometryImpl
	 * @see kml.impl.KmlPackageImpl#getGeometry()
	 * @generated
	 */
	int GEOMETRY = 36;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY__ID = OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY__TARGET_ID = OBJECT__TARGET_ID;

	/**
	 * The number of structural features of the '<em>Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kml.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.PointImpl
	 * @see kml.impl.KmlPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__ID = GEOMETRY__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__TARGET_ID = GEOMETRY__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Extrude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__EXTRUDE = GEOMETRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__MODE = GEOMETRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__COORDINATES = GEOMETRY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = GEOMETRY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link kml.impl.ScreenOverlayImpl <em>Screen Overlay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.ScreenOverlayImpl
	 * @see kml.impl.KmlPackageImpl#getScreenOverlay()
	 * @generated
	 */
	int SCREEN_OVERLAY = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY__ID = OVERLAY__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY__TARGET_ID = OVERLAY__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY__NAME = OVERLAY__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY__VISIBILITY = OVERLAY__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY__OPEN = OVERLAY__OPEN;

	/**
	 * The feature id for the '<em><b>Atom Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY__ATOM_AUTHOR = OVERLAY__ATOM_AUTHOR;

	/**
	 * The feature id for the '<em><b>Atom Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY__ATOM_LINK = OVERLAY__ATOM_LINK;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY__ADDRESS = OVERLAY__ADDRESS;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY__PHONE_NUMBER = OVERLAY__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Xal Address Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY__XAL_ADDRESS_DETAILS = OVERLAY__XAL_ADDRESS_DETAILS;

	/**
	 * The feature id for the '<em><b>Snippet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY__SNIPPET = OVERLAY__SNIPPET;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY__DESCRIPTION = OVERLAY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Abstract View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY__ABSTRACT_VIEW = OVERLAY__ABSTRACT_VIEW;

	/**
	 * The feature id for the '<em><b>Time Primitive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY__TIME_PRIMITIVE = OVERLAY__TIME_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY__STYLE_URL = OVERLAY__STYLE_URL;

	/**
	 * The feature id for the '<em><b>Style Selectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY__STYLE_SELECTORS = OVERLAY__STYLE_SELECTORS;

	/**
	 * The feature id for the '<em><b>Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY__REGION = OVERLAY__REGION;

	/**
	 * The feature id for the '<em><b>Extended Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY__EXTENDED_DATA = OVERLAY__EXTENDED_DATA;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY__COLOR = OVERLAY__COLOR;

	/**
	 * The feature id for the '<em><b>Draw Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY__DRAW_ORDER = OVERLAY__DRAW_ORDER;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY__ICON = OVERLAY__ICON;

	/**
	 * The feature id for the '<em><b>Overlay XY</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY__OVERLAY_XY = OVERLAY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Screen XY</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY__SCREEN_XY = OVERLAY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY__ROTATION = OVERLAY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY__SIZE = OVERLAY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Screen Overlay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_FEATURE_COUNT = OVERLAY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link kml.impl.Vec2TypeImpl <em>Vec2 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.Vec2TypeImpl
	 * @see kml.impl.KmlPackageImpl#getVec2Type()
	 * @generated
	 */
	int VEC2_TYPE = 31;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEC2_TYPE__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEC2_TYPE__Y = 1;

	/**
	 * The feature id for the '<em><b>Xunits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEC2_TYPE__XUNITS = 2;

	/**
	 * The feature id for the '<em><b>Yunits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEC2_TYPE__YUNITS = 3;

	/**
	 * The number of structural features of the '<em>Vec2 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEC2_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link kml.impl.FolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.FolderImpl
	 * @see kml.impl.KmlPackageImpl#getFolder()
	 * @generated
	 */
	int FOLDER = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__TARGET_ID = CONTAINER__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__VISIBILITY = CONTAINER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__OPEN = CONTAINER__OPEN;

	/**
	 * The feature id for the '<em><b>Atom Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__ATOM_AUTHOR = CONTAINER__ATOM_AUTHOR;

	/**
	 * The feature id for the '<em><b>Atom Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__ATOM_LINK = CONTAINER__ATOM_LINK;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__ADDRESS = CONTAINER__ADDRESS;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__PHONE_NUMBER = CONTAINER__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Xal Address Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__XAL_ADDRESS_DETAILS = CONTAINER__XAL_ADDRESS_DETAILS;

	/**
	 * The feature id for the '<em><b>Snippet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__SNIPPET = CONTAINER__SNIPPET;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__DESCRIPTION = CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Abstract View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__ABSTRACT_VIEW = CONTAINER__ABSTRACT_VIEW;

	/**
	 * The feature id for the '<em><b>Time Primitive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__TIME_PRIMITIVE = CONTAINER__TIME_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__STYLE_URL = CONTAINER__STYLE_URL;

	/**
	 * The feature id for the '<em><b>Style Selectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__STYLE_SELECTORS = CONTAINER__STYLE_SELECTORS;

	/**
	 * The feature id for the '<em><b>Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__REGION = CONTAINER__REGION;

	/**
	 * The feature id for the '<em><b>Extended Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__EXTENDED_DATA = CONTAINER__EXTENDED_DATA;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__FEATURES = CONTAINER__FEATURES;

	/**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kml.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.DocumentImpl
	 * @see kml.impl.KmlPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__TARGET_ID = CONTAINER__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__VISIBILITY = CONTAINER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__OPEN = CONTAINER__OPEN;

	/**
	 * The feature id for the '<em><b>Atom Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ATOM_AUTHOR = CONTAINER__ATOM_AUTHOR;

	/**
	 * The feature id for the '<em><b>Atom Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ATOM_LINK = CONTAINER__ATOM_LINK;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ADDRESS = CONTAINER__ADDRESS;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__PHONE_NUMBER = CONTAINER__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Xal Address Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__XAL_ADDRESS_DETAILS = CONTAINER__XAL_ADDRESS_DETAILS;

	/**
	 * The feature id for the '<em><b>Snippet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__SNIPPET = CONTAINER__SNIPPET;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DESCRIPTION = CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Abstract View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ABSTRACT_VIEW = CONTAINER__ABSTRACT_VIEW;

	/**
	 * The feature id for the '<em><b>Time Primitive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__TIME_PRIMITIVE = CONTAINER__TIME_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__STYLE_URL = CONTAINER__STYLE_URL;

	/**
	 * The feature id for the '<em><b>Style Selectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__STYLE_SELECTORS = CONTAINER__STYLE_SELECTORS;

	/**
	 * The feature id for the '<em><b>Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__REGION = CONTAINER__REGION;

	/**
	 * The feature id for the '<em><b>Extended Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__EXTENDED_DATA = CONTAINER__EXTENDED_DATA;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__FEATURES = CONTAINER__FEATURES;

	/**
	 * The feature id for the '<em><b>Schemas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__SCHEMAS = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kml.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.SchemaImpl
	 * @see kml.impl.KmlPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ID = OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__TARGET_ID = OBJECT__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__FIELDS = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kml.impl.SimpleFieldImpl <em>Simple Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.SimpleFieldImpl
	 * @see kml.impl.KmlPackageImpl#getSimpleField()
	 * @generated
	 */
	int SIMPLE_FIELD = 35;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__NAME = 1;

	/**
	 * The number of structural features of the '<em>Simple Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link kml.impl.LineStringImpl <em>Line String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.LineStringImpl
	 * @see kml.impl.KmlPackageImpl#getLineString()
	 * @generated
	 */
	int LINE_STRING = 37;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING__ID = GEOMETRY__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING__TARGET_ID = GEOMETRY__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Extrude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING__EXTRUDE = GEOMETRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tessellate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING__TESSELLATE = GEOMETRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING__MODE = GEOMETRY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING__COORDINATES = GEOMETRY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Line String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_FEATURE_COUNT = GEOMETRY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link kml.impl.CoordinateImpl <em>Coordinate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.CoordinateImpl
	 * @see kml.impl.KmlPackageImpl#getCoordinate()
	 * @generated
	 */
	int COORDINATE = 38;

	/**
	 * The feature id for the '<em><b>Lon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE__LON = 0;

	/**
	 * The feature id for the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE__LAT = 1;

	/**
	 * The feature id for the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE__ALT = 2;

	/**
	 * The number of structural features of the '<em>Coordinate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link kml.impl.LinearRingImpl <em>Linear Ring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.LinearRingImpl
	 * @see kml.impl.KmlPackageImpl#getLinearRing()
	 * @generated
	 */
	int LINEAR_RING = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING__ID = GEOMETRY__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING__TARGET_ID = GEOMETRY__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Extrude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING__EXTRUDE = GEOMETRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tessellate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING__TESSELLATE = GEOMETRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING__MODE = GEOMETRY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING__COORDINATES = GEOMETRY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Linear Ring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING_FEATURE_COUNT = GEOMETRY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link kml.impl.PolygonImpl <em>Polygon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.PolygonImpl
	 * @see kml.impl.KmlPackageImpl#getPolygon()
	 * @generated
	 */
	int POLYGON = 40;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__ID = GEOMETRY__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__TARGET_ID = GEOMETRY__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Extrude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__EXTRUDE = GEOMETRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tessellate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__TESSELLATE = GEOMETRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__MODE = GEOMETRY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inner Boundary Is</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__INNER_BOUNDARY_IS = GEOMETRY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Outer Boundary Is</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__OUTER_BOUNDARY_IS = GEOMETRY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_FEATURE_COUNT = GEOMETRY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link kml.impl.MultiGeometryImpl <em>Multi Geometry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.MultiGeometryImpl
	 * @see kml.impl.KmlPackageImpl#getMultiGeometry()
	 * @generated
	 */
	int MULTI_GEOMETRY = 41;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GEOMETRY__ID = GEOMETRY__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GEOMETRY__TARGET_ID = GEOMETRY__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Geometries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GEOMETRY__GEOMETRIES = GEOMETRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GEOMETRY_FEATURE_COUNT = GEOMETRY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kml.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.ModelImpl
	 * @see kml.impl.KmlPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 42;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ID = GEOMETRY__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TARGET_ID = GEOMETRY__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MODE = GEOMETRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__LOCATION = GEOMETRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ORIENTATION = GEOMETRY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SCALE = GEOMETRY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resource Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__RESOURCE_MAP = GEOMETRY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__LINK = GEOMETRY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = GEOMETRY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link kml.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.LocationImpl
	 * @see kml.impl.KmlPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 43;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ID = OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__TARGET_ID = OBJECT__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LONGITUDE = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LATITUDE = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ALTITUDE = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link kml.impl.OrientationImpl <em>Orientation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.OrientationImpl
	 * @see kml.impl.KmlPackageImpl#getOrientation()
	 * @generated
	 */
	int ORIENTATION = 44;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION__ID = OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION__TARGET_ID = OBJECT__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION__HEADING = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tilt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION__TILT = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Roll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION__ROLL = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Orientation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link kml.impl.ScaleImpl <em>Scale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.ScaleImpl
	 * @see kml.impl.KmlPackageImpl#getScale()
	 * @generated
	 */
	int SCALE = 45;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE__ID = OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE__TARGET_ID = OBJECT__TARGET_ID;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE__X = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE__Y = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE__Z = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link kml.impl.ResourceMapImpl <em>Resource Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.ResourceMapImpl
	 * @see kml.impl.KmlPackageImpl#getResourceMap()
	 * @generated
	 */
	int RESOURCE_MAP = 46;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MAP__ALIASES = 0;

	/**
	 * The number of structural features of the '<em>Resource Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MAP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link kml.impl.AliasImpl <em>Alias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.AliasImpl
	 * @see kml.impl.KmlPackageImpl#getAlias()
	 * @generated
	 */
	int ALIAS = 47;

	/**
	 * The feature id for the '<em><b>Target Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS__TARGET_HREF = 0;

	/**
	 * The feature id for the '<em><b>Source Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS__SOURCE_HREF = 1;

	/**
	 * The number of structural features of the '<em>Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link kml.impl.AbstractStyleImpl <em>Abstract Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.AbstractStyleImpl
	 * @see kml.impl.KmlPackageImpl#getAbstractStyle()
	 * @generated
	 */
	int ABSTRACT_STYLE = 57;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STYLE__ID = OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STYLE__TARGET_ID = OBJECT__TARGET_ID;

	/**
	 * The number of structural features of the '<em>Abstract Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STYLE_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kml.impl.ColorStyleImpl <em>Color Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.ColorStyleImpl
	 * @see kml.impl.KmlPackageImpl#getColorStyle()
	 * @generated
	 */
	int COLOR_STYLE = 48;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_STYLE__ID = ABSTRACT_STYLE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_STYLE__TARGET_ID = ABSTRACT_STYLE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_STYLE__COLOR = ABSTRACT_STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_STYLE__MODE = ABSTRACT_STYLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Color Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_STYLE_FEATURE_COUNT = ABSTRACT_STYLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kml.impl.IconStyleImpl <em>Icon Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.IconStyleImpl
	 * @see kml.impl.KmlPackageImpl#getIconStyle()
	 * @generated
	 */
	int ICON_STYLE = 49;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE__ID = COLOR_STYLE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE__TARGET_ID = COLOR_STYLE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE__COLOR = COLOR_STYLE__COLOR;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE__MODE = COLOR_STYLE__MODE;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE__SCALE = COLOR_STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE__HEADING = COLOR_STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE__ICON = COLOR_STYLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hot Spot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE__HOT_SPOT = COLOR_STYLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Icon Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_FEATURE_COUNT = COLOR_STYLE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link kml.impl.LabelStyleImpl <em>Label Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.LabelStyleImpl
	 * @see kml.impl.KmlPackageImpl#getLabelStyle()
	 * @generated
	 */
	int LABEL_STYLE = 50;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE__ID = COLOR_STYLE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE__TARGET_ID = COLOR_STYLE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE__COLOR = COLOR_STYLE__COLOR;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE__MODE = COLOR_STYLE__MODE;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE__SCALE = COLOR_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Label Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE_FEATURE_COUNT = COLOR_STYLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kml.impl.LineStyleImpl <em>Line Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.LineStyleImpl
	 * @see kml.impl.KmlPackageImpl#getLineStyle()
	 * @generated
	 */
	int LINE_STYLE = 51;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__ID = COLOR_STYLE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__TARGET_ID = COLOR_STYLE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__COLOR = COLOR_STYLE__COLOR;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__MODE = COLOR_STYLE__MODE;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__WIDTH = COLOR_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Line Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_FEATURE_COUNT = COLOR_STYLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kml.impl.PolyStyleImpl <em>Poly Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.PolyStyleImpl
	 * @see kml.impl.KmlPackageImpl#getPolyStyle()
	 * @generated
	 */
	int POLY_STYLE = 52;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE__ID = COLOR_STYLE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE__TARGET_ID = COLOR_STYLE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE__COLOR = COLOR_STYLE__COLOR;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE__MODE = COLOR_STYLE__MODE;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE__FILL = COLOR_STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE__OUTLINE = COLOR_STYLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Poly Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE_FEATURE_COUNT = COLOR_STYLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kml.impl.BalloonStyleImpl <em>Balloon Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.BalloonStyleImpl
	 * @see kml.impl.KmlPackageImpl#getBalloonStyle()
	 * @generated
	 */
	int BALLOON_STYLE = 53;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOON_STYLE__ID = ABSTRACT_STYLE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOON_STYLE__TARGET_ID = ABSTRACT_STYLE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Bg Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOON_STYLE__BG_COLOR = ABSTRACT_STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOON_STYLE__TEXT_COLOR = ABSTRACT_STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOON_STYLE__TEXT = ABSTRACT_STYLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOON_STYLE__MODE = ABSTRACT_STYLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Balloon Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOON_STYLE_FEATURE_COUNT = ABSTRACT_STYLE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link kml.impl.PairImpl <em>Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.PairImpl
	 * @see kml.impl.KmlPackageImpl#getPair()
	 * @generated
	 */
	int PAIR = 54;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR__ID = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR__KEY = 1;

	/**
	 * The feature id for the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR__STYLE_URL = 2;

	/**
	 * The number of structural features of the '<em>Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link kml.impl.ListStyleImpl <em>List Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.ListStyleImpl
	 * @see kml.impl.KmlPackageImpl#getListStyle()
	 * @generated
	 */
	int LIST_STYLE = 55;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__ID = ABSTRACT_STYLE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__TARGET_ID = ABSTRACT_STYLE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Bg Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__BG_COLOR = ABSTRACT_STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__ITEM_TYPE = ABSTRACT_STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE__ITEMS = ABSTRACT_STYLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>List Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE_FEATURE_COUNT = ABSTRACT_STYLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link kml.impl.ItemIconImpl <em>Item Icon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.ItemIconImpl
	 * @see kml.impl.KmlPackageImpl#getItemIcon()
	 * @generated
	 */
	int ITEM_ICON = 56;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ICON__STATE = 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ICON__HREF = 1;

	/**
	 * The number of structural features of the '<em>Item Icon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ICON_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link kml.AltitudeMode <em>Altitude Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.AltitudeMode
	 * @see kml.impl.KmlPackageImpl#getAltitudeMode()
	 * @generated
	 */
	int ALTITUDE_MODE = 58;

	/**
	 * The meta object id for the '{@link kml.RefreshMode <em>Refresh Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.RefreshMode
	 * @see kml.impl.KmlPackageImpl#getRefreshMode()
	 * @generated
	 */
	int REFRESH_MODE = 59;

	/**
	 * The meta object id for the '{@link kml.ViewRefreshMode <em>View Refresh Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.ViewRefreshMode
	 * @see kml.impl.KmlPackageImpl#getViewRefreshMode()
	 * @generated
	 */
	int VIEW_REFRESH_MODE = 60;

	/**
	 * The meta object id for the '{@link kml.Shape <em>Shape</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.Shape
	 * @see kml.impl.KmlPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 61;

	/**
	 * The meta object id for the '{@link kml.GridOrigin <em>Grid Origin</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.GridOrigin
	 * @see kml.impl.KmlPackageImpl#getGridOrigin()
	 * @generated
	 */
	int GRID_ORIGIN = 62;

	/**
	 * The meta object id for the '{@link kml.Units <em>Units</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.Units
	 * @see kml.impl.KmlPackageImpl#getUnits()
	 * @generated
	 */
	int UNITS = 63;

	/**
	 * The meta object id for the '{@link kml.SchemaType <em>Schema Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.SchemaType
	 * @see kml.impl.KmlPackageImpl#getSchemaType()
	 * @generated
	 */
	int SCHEMA_TYPE = 64;

	/**
	 * The meta object id for the '{@link kml.ColorMode <em>Color Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.ColorMode
	 * @see kml.impl.KmlPackageImpl#getColorMode()
	 * @generated
	 */
	int COLOR_MODE = 65;

	/**
	 * The meta object id for the '{@link kml.DisplayMode <em>Display Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.DisplayMode
	 * @see kml.impl.KmlPackageImpl#getDisplayMode()
	 * @generated
	 */
	int DISPLAY_MODE = 66;

	/**
	 * The meta object id for the '{@link kml.StyleState <em>Style State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.StyleState
	 * @see kml.impl.KmlPackageImpl#getStyleState()
	 * @generated
	 */
	int STYLE_STATE = 67;

	/**
	 * The meta object id for the '{@link kml.ListeItemType <em>Liste Item Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.ListeItemType
	 * @see kml.impl.KmlPackageImpl#getListeItemType()
	 * @generated
	 */
	int LISTE_ITEM_TYPE = 68;

	/**
	 * The meta object id for the '{@link kml.State <em>State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.State
	 * @see kml.impl.KmlPackageImpl#getState()
	 * @generated
	 */
	int STATE = 69;

	/**
	 * The meta object id for the '<em>Color</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see kml.impl.KmlPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 70;

	/**
	 * The meta object id for the '<em>Angle90</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.KmlPackageImpl#getAngle90()
	 * @generated
	 */
	int ANGLE90 = 71;

	/**
	 * The meta object id for the '<em>Angle180</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.KmlPackageImpl#getAngle180()
	 * @generated
	 */
	int ANGLE180 = 72;

	/**
	 * The meta object id for the '<em>Angle360</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.KmlPackageImpl#getAngle360()
	 * @generated
	 */
	int ANGLE360 = 73;

	/**
	 * The meta object id for the '<em>Angle Pos90</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.KmlPackageImpl#getAnglePos90()
	 * @generated
	 */
	int ANGLE_POS90 = 74;

	/**
	 * The meta object id for the '<em>Angle Pos180</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kml.impl.KmlPackageImpl#getAnglePos180()
	 * @generated
	 */
	int ANGLE_POS180 = 75;


	/**
	 * Returns the meta object for class '{@link kml.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see kml.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the attribute '{@link kml.Object#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see kml.Object#getId()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_Id();

	/**
	 * Returns the meta object for the attribute '{@link kml.Object#getTargetId <em>Target Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Id</em>'.
	 * @see kml.Object#getTargetId()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_TargetId();

	/**
	 * Returns the meta object for class '{@link kml.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see kml.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link kml.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kml.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for the attribute '{@link kml.Feature#isVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see kml.Feature#isVisibility()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link kml.Feature#isOpen <em>Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open</em>'.
	 * @see kml.Feature#isOpen()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Open();

	/**
	 * Returns the meta object for the containment reference '{@link kml.Feature#getAtomAuthor <em>Atom Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Atom Author</em>'.
	 * @see kml.Feature#getAtomAuthor()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_AtomAuthor();

	/**
	 * Returns the meta object for the containment reference '{@link kml.Feature#getAtomLink <em>Atom Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Atom Link</em>'.
	 * @see kml.Feature#getAtomLink()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_AtomLink();

	/**
	 * Returns the meta object for the attribute '{@link kml.Feature#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see kml.Feature#getAddress()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Address();

	/**
	 * Returns the meta object for the attribute '{@link kml.Feature#getPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Number</em>'.
	 * @see kml.Feature#getPhoneNumber()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_PhoneNumber();

	/**
	 * Returns the meta object for the containment reference '{@link kml.Feature#getXalAddressDetails <em>Xal Address Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xal Address Details</em>'.
	 * @see kml.Feature#getXalAddressDetails()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_XalAddressDetails();

	/**
	 * Returns the meta object for the attribute '{@link kml.Feature#getSnippet <em>Snippet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Snippet</em>'.
	 * @see kml.Feature#getSnippet()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Snippet();

	/**
	 * Returns the meta object for the attribute '{@link kml.Feature#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see kml.Feature#getDescription()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Description();

	/**
	 * Returns the meta object for the containment reference '{@link kml.Feature#getAbstractView <em>Abstract View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract View</em>'.
	 * @see kml.Feature#getAbstractView()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_AbstractView();

	/**
	 * Returns the meta object for the containment reference '{@link kml.Feature#getTimePrimitive <em>Time Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Primitive</em>'.
	 * @see kml.Feature#getTimePrimitive()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_TimePrimitive();

	/**
	 * Returns the meta object for the attribute '{@link kml.Feature#getStyleUrl <em>Style Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Url</em>'.
	 * @see kml.Feature#getStyleUrl()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_StyleUrl();

	/**
	 * Returns the meta object for the containment reference list '{@link kml.Feature#getStyleSelectors <em>Style Selectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Style Selectors</em>'.
	 * @see kml.Feature#getStyleSelectors()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_StyleSelectors();

	/**
	 * Returns the meta object for the reference '{@link kml.Feature#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Region</em>'.
	 * @see kml.Feature#getRegion()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Region();

	/**
	 * Returns the meta object for the containment reference '{@link kml.Feature#getExtendedData <em>Extended Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extended Data</em>'.
	 * @see kml.Feature#getExtendedData()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_ExtendedData();

	/**
	 * Returns the meta object for class '{@link kml.AbstractView <em>Abstract View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract View</em>'.
	 * @see kml.AbstractView
	 * @generated
	 */
	EClass getAbstractView();

	/**
	 * Returns the meta object for the attribute '{@link kml.AbstractView#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see kml.AbstractView#getLongitude()
	 * @see #getAbstractView()
	 * @generated
	 */
	EAttribute getAbstractView_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link kml.AbstractView#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see kml.AbstractView#getLatitude()
	 * @see #getAbstractView()
	 * @generated
	 */
	EAttribute getAbstractView_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link kml.AbstractView#getAltitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude</em>'.
	 * @see kml.AbstractView#getAltitude()
	 * @see #getAbstractView()
	 * @generated
	 */
	EAttribute getAbstractView_Altitude();

	/**
	 * Returns the meta object for the attribute '{@link kml.AbstractView#getHeading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heading</em>'.
	 * @see kml.AbstractView#getHeading()
	 * @see #getAbstractView()
	 * @generated
	 */
	EAttribute getAbstractView_Heading();

	/**
	 * Returns the meta object for the attribute '{@link kml.AbstractView#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see kml.AbstractView#getMode()
	 * @see #getAbstractView()
	 * @generated
	 */
	EAttribute getAbstractView_Mode();

	/**
	 * Returns the meta object for class '{@link kml.TimePrimitive <em>Time Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Primitive</em>'.
	 * @see kml.TimePrimitive
	 * @generated
	 */
	EClass getTimePrimitive();

	/**
	 * Returns the meta object for class '{@link kml.TimeSpan <em>Time Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Span</em>'.
	 * @see kml.TimeSpan
	 * @generated
	 */
	EClass getTimeSpan();

	/**
	 * Returns the meta object for class '{@link kml.TimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Stamp</em>'.
	 * @see kml.TimeStamp
	 * @generated
	 */
	EClass getTimeStamp();

	/**
	 * Returns the meta object for class '{@link kml.Camera <em>Camera</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Camera</em>'.
	 * @see kml.Camera
	 * @generated
	 */
	EClass getCamera();

	/**
	 * Returns the meta object for the attribute '{@link kml.Camera#getTilt <em>Tilt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tilt</em>'.
	 * @see kml.Camera#getTilt()
	 * @see #getCamera()
	 * @generated
	 */
	EAttribute getCamera_Tilt();

	/**
	 * Returns the meta object for the attribute '{@link kml.Camera#getRoll <em>Roll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roll</em>'.
	 * @see kml.Camera#getRoll()
	 * @see #getCamera()
	 * @generated
	 */
	EAttribute getCamera_Roll();

	/**
	 * Returns the meta object for class '{@link kml.LookAt <em>Look At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Look At</em>'.
	 * @see kml.LookAt
	 * @generated
	 */
	EClass getLookAt();

	/**
	 * Returns the meta object for the attribute '{@link kml.LookAt#getTilt <em>Tilt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tilt</em>'.
	 * @see kml.LookAt#getTilt()
	 * @see #getLookAt()
	 * @generated
	 */
	EAttribute getLookAt_Tilt();

	/**
	 * Returns the meta object for the attribute '{@link kml.LookAt#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see kml.LookAt#getRange()
	 * @see #getLookAt()
	 * @generated
	 */
	EAttribute getLookAt_Range();

	/**
	 * Returns the meta object for class '{@link kml.StyleSelector <em>Style Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style Selector</em>'.
	 * @see kml.StyleSelector
	 * @generated
	 */
	EClass getStyleSelector();

	/**
	 * Returns the meta object for class '{@link kml.Style <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style</em>'.
	 * @see kml.Style
	 * @generated
	 */
	EClass getStyle();

	/**
	 * Returns the meta object for the containment reference list '{@link kml.Style#getStyles <em>Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Styles</em>'.
	 * @see kml.Style#getStyles()
	 * @see #getStyle()
	 * @generated
	 */
	EReference getStyle_Styles();

	/**
	 * Returns the meta object for class '{@link kml.StyleMap <em>Style Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style Map</em>'.
	 * @see kml.StyleMap
	 * @generated
	 */
	EClass getStyleMap();

	/**
	 * Returns the meta object for the containment reference list '{@link kml.StyleMap#getPairs <em>Pairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pairs</em>'.
	 * @see kml.StyleMap#getPairs()
	 * @see #getStyleMap()
	 * @generated
	 */
	EReference getStyleMap_Pairs();

	/**
	 * Returns the meta object for class '{@link kml.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see kml.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for the containment reference '{@link kml.Region#getLatLonAltBox <em>Lat Lon Alt Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lat Lon Alt Box</em>'.
	 * @see kml.Region#getLatLonAltBox()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_LatLonAltBox();

	/**
	 * Returns the meta object for the containment reference '{@link kml.Region#getLod <em>Lod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod</em>'.
	 * @see kml.Region#getLod()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Lod();

	/**
	 * Returns the meta object for class '{@link kml.LatLonAltBox <em>Lat Lon Alt Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lat Lon Alt Box</em>'.
	 * @see kml.LatLonAltBox
	 * @generated
	 */
	EClass getLatLonAltBox();

	/**
	 * Returns the meta object for the attribute '{@link kml.LatLonAltBox#getMinAltitude <em>Min Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Altitude</em>'.
	 * @see kml.LatLonAltBox#getMinAltitude()
	 * @see #getLatLonAltBox()
	 * @generated
	 */
	EAttribute getLatLonAltBox_MinAltitude();

	/**
	 * Returns the meta object for the attribute '{@link kml.LatLonAltBox#getMaxAltitude <em>Max Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Altitude</em>'.
	 * @see kml.LatLonAltBox#getMaxAltitude()
	 * @see #getLatLonAltBox()
	 * @generated
	 */
	EAttribute getLatLonAltBox_MaxAltitude();

	/**
	 * Returns the meta object for the attribute '{@link kml.LatLonAltBox#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see kml.LatLonAltBox#getMode()
	 * @see #getLatLonAltBox()
	 * @generated
	 */
	EAttribute getLatLonAltBox_Mode();

	/**
	 * Returns the meta object for class '{@link kml.Lod <em>Lod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lod</em>'.
	 * @see kml.Lod
	 * @generated
	 */
	EClass getLod();

	/**
	 * Returns the meta object for the attribute '{@link kml.Lod#getMinLodPixels <em>Min Lod Pixels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Lod Pixels</em>'.
	 * @see kml.Lod#getMinLodPixels()
	 * @see #getLod()
	 * @generated
	 */
	EAttribute getLod_MinLodPixels();

	/**
	 * Returns the meta object for the attribute '{@link kml.Lod#getMaxLodPixels <em>Max Lod Pixels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Lod Pixels</em>'.
	 * @see kml.Lod#getMaxLodPixels()
	 * @see #getLod()
	 * @generated
	 */
	EAttribute getLod_MaxLodPixels();

	/**
	 * Returns the meta object for the attribute '{@link kml.Lod#getMinFadeExtent <em>Min Fade Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Fade Extent</em>'.
	 * @see kml.Lod#getMinFadeExtent()
	 * @see #getLod()
	 * @generated
	 */
	EAttribute getLod_MinFadeExtent();

	/**
	 * Returns the meta object for the attribute '{@link kml.Lod#getMaxFadeExtent <em>Max Fade Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Fade Extent</em>'.
	 * @see kml.Lod#getMaxFadeExtent()
	 * @see #getLod()
	 * @generated
	 */
	EAttribute getLod_MaxFadeExtent();

	/**
	 * Returns the meta object for class '{@link kml.ExtendedData <em>Extended Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Data</em>'.
	 * @see kml.ExtendedData
	 * @generated
	 */
	EClass getExtendedData();

	/**
	 * Returns the meta object for the containment reference list '{@link kml.ExtendedData#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see kml.ExtendedData#getData()
	 * @see #getExtendedData()
	 * @generated
	 */
	EReference getExtendedData_Data();

	/**
	 * Returns the meta object for the containment reference list '{@link kml.ExtendedData#getSchemaData <em>Schema Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schema Data</em>'.
	 * @see kml.ExtendedData#getSchemaData()
	 * @see #getExtendedData()
	 * @generated
	 */
	EReference getExtendedData_SchemaData();

	/**
	 * Returns the meta object for the attribute '{@link kml.ExtendedData#getXmlContent <em>Xml Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xml Content</em>'.
	 * @see kml.ExtendedData#getXmlContent()
	 * @see #getExtendedData()
	 * @generated
	 */
	EAttribute getExtendedData_XmlContent();

	/**
	 * Returns the meta object for class '{@link kml.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see kml.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link kml.Data#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kml.Data#getName()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Name();

	/**
	 * Returns the meta object for the attribute '{@link kml.Data#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see kml.Data#getDisplayName()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link kml.Data#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see kml.Data#getValue()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Value();

	/**
	 * Returns the meta object for class '{@link kml.SchemaData <em>Schema Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Data</em>'.
	 * @see kml.SchemaData
	 * @generated
	 */
	EClass getSchemaData();

	/**
	 * Returns the meta object for the attribute '{@link kml.SchemaData#getSchemaUrl <em>Schema Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Url</em>'.
	 * @see kml.SchemaData#getSchemaUrl()
	 * @see #getSchemaData()
	 * @generated
	 */
	EAttribute getSchemaData_SchemaUrl();

	/**
	 * Returns the meta object for the containment reference '{@link kml.SchemaData#getSimpledata <em>Simpledata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simpledata</em>'.
	 * @see kml.SchemaData#getSimpledata()
	 * @see #getSchemaData()
	 * @generated
	 */
	EReference getSchemaData_Simpledata();

	/**
	 * Returns the meta object for class '{@link kml.SimpleData <em>Simple Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Data</em>'.
	 * @see kml.SimpleData
	 * @generated
	 */
	EClass getSimpleData();

	/**
	 * Returns the meta object for the attribute '{@link kml.SimpleData#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kml.SimpleData#getName()
	 * @see #getSimpleData()
	 * @generated
	 */
	EAttribute getSimpleData_Name();

	/**
	 * Returns the meta object for the attribute '{@link kml.SimpleData#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see kml.SimpleData#getValue()
	 * @see #getSimpleData()
	 * @generated
	 */
	EAttribute getSimpleData_Value();

	/**
	 * Returns the meta object for class '{@link kml.Overlay <em>Overlay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overlay</em>'.
	 * @see kml.Overlay
	 * @generated
	 */
	EClass getOverlay();

	/**
	 * Returns the meta object for the attribute '{@link kml.Overlay#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see kml.Overlay#getColor()
	 * @see #getOverlay()
	 * @generated
	 */
	EAttribute getOverlay_Color();

	/**
	 * Returns the meta object for the attribute '{@link kml.Overlay#getDrawOrder <em>Draw Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Draw Order</em>'.
	 * @see kml.Overlay#getDrawOrder()
	 * @see #getOverlay()
	 * @generated
	 */
	EAttribute getOverlay_DrawOrder();

	/**
	 * Returns the meta object for the containment reference '{@link kml.Overlay#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon</em>'.
	 * @see kml.Overlay#getIcon()
	 * @see #getOverlay()
	 * @generated
	 */
	EReference getOverlay_Icon();

	/**
	 * Returns the meta object for class '{@link kml.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see kml.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link kml.Container#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see kml.Container#getFeatures()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Features();

	/**
	 * Returns the meta object for class '{@link kml.Placemark <em>Placemark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Placemark</em>'.
	 * @see kml.Placemark
	 * @generated
	 */
	EClass getPlacemark();

	/**
	 * Returns the meta object for the containment reference '{@link kml.Placemark#getGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geometry</em>'.
	 * @see kml.Placemark#getGeometry()
	 * @see #getPlacemark()
	 * @generated
	 */
	EReference getPlacemark_Geometry();

	/**
	 * Returns the meta object for class '{@link kml.NetworkLink <em>Network Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Link</em>'.
	 * @see kml.NetworkLink
	 * @generated
	 */
	EClass getNetworkLink();

	/**
	 * Returns the meta object for the attribute '{@link kml.NetworkLink#isRefreshVisibility <em>Refresh Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refresh Visibility</em>'.
	 * @see kml.NetworkLink#isRefreshVisibility()
	 * @see #getNetworkLink()
	 * @generated
	 */
	EAttribute getNetworkLink_RefreshVisibility();

	/**
	 * Returns the meta object for the attribute '{@link kml.NetworkLink#isFlyToView <em>Fly To View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fly To View</em>'.
	 * @see kml.NetworkLink#isFlyToView()
	 * @see #getNetworkLink()
	 * @generated
	 */
	EAttribute getNetworkLink_FlyToView();

	/**
	 * Returns the meta object for the reference '{@link kml.NetworkLink#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link</em>'.
	 * @see kml.NetworkLink#getLink()
	 * @see #getNetworkLink()
	 * @generated
	 */
	EReference getNetworkLink_Link();

	/**
	 * Returns the meta object for class '{@link kml.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see kml.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link kml.Link#getUrlRef <em>Url Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url Ref</em>'.
	 * @see kml.Link#getUrlRef()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_UrlRef();

	/**
	 * Returns the meta object for the attribute '{@link kml.Link#getRefreshMode <em>Refresh Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refresh Mode</em>'.
	 * @see kml.Link#getRefreshMode()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_RefreshMode();

	/**
	 * Returns the meta object for the attribute '{@link kml.Link#getRefreshInterval <em>Refresh Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refresh Interval</em>'.
	 * @see kml.Link#getRefreshInterval()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_RefreshInterval();

	/**
	 * Returns the meta object for the attribute '{@link kml.Link#getViewRefreshMode <em>View Refresh Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Refresh Mode</em>'.
	 * @see kml.Link#getViewRefreshMode()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_ViewRefreshMode();

	/**
	 * Returns the meta object for the attribute '{@link kml.Link#getViewRefreshTime <em>View Refresh Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Refresh Time</em>'.
	 * @see kml.Link#getViewRefreshTime()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_ViewRefreshTime();

	/**
	 * Returns the meta object for the attribute '{@link kml.Link#getViewBoundScale <em>View Bound Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Bound Scale</em>'.
	 * @see kml.Link#getViewBoundScale()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_ViewBoundScale();

	/**
	 * Returns the meta object for the attribute '{@link kml.Link#getViewFormat <em>View Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Format</em>'.
	 * @see kml.Link#getViewFormat()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_ViewFormat();

	/**
	 * Returns the meta object for the attribute '{@link kml.Link#getHttpQuery <em>Http Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Query</em>'.
	 * @see kml.Link#getHttpQuery()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_HttpQuery();

	/**
	 * Returns the meta object for class '{@link kml.Icon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon</em>'.
	 * @see kml.Icon
	 * @generated
	 */
	EClass getIcon();

	/**
	 * Returns the meta object for class '{@link kml.GroundOverlay <em>Ground Overlay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ground Overlay</em>'.
	 * @see kml.GroundOverlay
	 * @generated
	 */
	EClass getGroundOverlay();

	/**
	 * Returns the meta object for the attribute '{@link kml.GroundOverlay#getAltitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude</em>'.
	 * @see kml.GroundOverlay#getAltitude()
	 * @see #getGroundOverlay()
	 * @generated
	 */
	EAttribute getGroundOverlay_Altitude();

	/**
	 * Returns the meta object for the attribute '{@link kml.GroundOverlay#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see kml.GroundOverlay#getMode()
	 * @see #getGroundOverlay()
	 * @generated
	 */
	EAttribute getGroundOverlay_Mode();

	/**
	 * Returns the meta object for the containment reference '{@link kml.GroundOverlay#getLatLonBox <em>Lat Lon Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lat Lon Box</em>'.
	 * @see kml.GroundOverlay#getLatLonBox()
	 * @see #getGroundOverlay()
	 * @generated
	 */
	EReference getGroundOverlay_LatLonBox();

	/**
	 * Returns the meta object for class '{@link kml.LatLonBox <em>Lat Lon Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lat Lon Box</em>'.
	 * @see kml.LatLonBox
	 * @generated
	 */
	EClass getLatLonBox();

	/**
	 * Returns the meta object for the attribute '{@link kml.LatLonBox#getNorth <em>North</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>North</em>'.
	 * @see kml.LatLonBox#getNorth()
	 * @see #getLatLonBox()
	 * @generated
	 */
	EAttribute getLatLonBox_North();

	/**
	 * Returns the meta object for the attribute '{@link kml.LatLonBox#getSouth <em>South</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>South</em>'.
	 * @see kml.LatLonBox#getSouth()
	 * @see #getLatLonBox()
	 * @generated
	 */
	EAttribute getLatLonBox_South();

	/**
	 * Returns the meta object for the attribute '{@link kml.LatLonBox#getEast <em>East</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>East</em>'.
	 * @see kml.LatLonBox#getEast()
	 * @see #getLatLonBox()
	 * @generated
	 */
	EAttribute getLatLonBox_East();

	/**
	 * Returns the meta object for the attribute '{@link kml.LatLonBox#getWest <em>West</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>West</em>'.
	 * @see kml.LatLonBox#getWest()
	 * @see #getLatLonBox()
	 * @generated
	 */
	EAttribute getLatLonBox_West();

	/**
	 * Returns the meta object for the attribute '{@link kml.LatLonBox#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see kml.LatLonBox#getRotation()
	 * @see #getLatLonBox()
	 * @generated
	 */
	EAttribute getLatLonBox_Rotation();

	/**
	 * Returns the meta object for class '{@link kml.PhotoOverlay <em>Photo Overlay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Photo Overlay</em>'.
	 * @see kml.PhotoOverlay
	 * @generated
	 */
	EClass getPhotoOverlay();

	/**
	 * Returns the meta object for the attribute '{@link kml.PhotoOverlay#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see kml.PhotoOverlay#getShape()
	 * @see #getPhotoOverlay()
	 * @generated
	 */
	EAttribute getPhotoOverlay_Shape();

	/**
	 * Returns the meta object for the reference '{@link kml.PhotoOverlay#getViewVolume <em>View Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>View Volume</em>'.
	 * @see kml.PhotoOverlay#getViewVolume()
	 * @see #getPhotoOverlay()
	 * @generated
	 */
	EReference getPhotoOverlay_ViewVolume();

	/**
	 * Returns the meta object for the attribute '{@link kml.PhotoOverlay#getRoll <em>Roll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roll</em>'.
	 * @see kml.PhotoOverlay#getRoll()
	 * @see #getPhotoOverlay()
	 * @generated
	 */
	EAttribute getPhotoOverlay_Roll();

	/**
	 * Returns the meta object for the containment reference '{@link kml.PhotoOverlay#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Point</em>'.
	 * @see kml.PhotoOverlay#getPoint()
	 * @see #getPhotoOverlay()
	 * @generated
	 */
	EReference getPhotoOverlay_Point();

	/**
	 * Returns the meta object for the containment reference '{@link kml.PhotoOverlay#getImagePyramid <em>Image Pyramid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image Pyramid</em>'.
	 * @see kml.PhotoOverlay#getImagePyramid()
	 * @see #getPhotoOverlay()
	 * @generated
	 */
	EReference getPhotoOverlay_ImagePyramid();

	/**
	 * Returns the meta object for class '{@link kml.ViewVolume <em>View Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Volume</em>'.
	 * @see kml.ViewVolume
	 * @generated
	 */
	EClass getViewVolume();

	/**
	 * Returns the meta object for the attribute '{@link kml.ViewVolume#getLeftFov <em>Left Fov</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Fov</em>'.
	 * @see kml.ViewVolume#getLeftFov()
	 * @see #getViewVolume()
	 * @generated
	 */
	EAttribute getViewVolume_LeftFov();

	/**
	 * Returns the meta object for the attribute '{@link kml.ViewVolume#getRightFov <em>Right Fov</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Fov</em>'.
	 * @see kml.ViewVolume#getRightFov()
	 * @see #getViewVolume()
	 * @generated
	 */
	EAttribute getViewVolume_RightFov();

	/**
	 * Returns the meta object for the attribute '{@link kml.ViewVolume#getBottomFov <em>Bottom Fov</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bottom Fov</em>'.
	 * @see kml.ViewVolume#getBottomFov()
	 * @see #getViewVolume()
	 * @generated
	 */
	EAttribute getViewVolume_BottomFov();

	/**
	 * Returns the meta object for the attribute '{@link kml.ViewVolume#getTopFov <em>Top Fov</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Fov</em>'.
	 * @see kml.ViewVolume#getTopFov()
	 * @see #getViewVolume()
	 * @generated
	 */
	EAttribute getViewVolume_TopFov();

	/**
	 * Returns the meta object for the attribute '{@link kml.ViewVolume#getNear <em>Near</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Near</em>'.
	 * @see kml.ViewVolume#getNear()
	 * @see #getViewVolume()
	 * @generated
	 */
	EAttribute getViewVolume_Near();

	/**
	 * Returns the meta object for class '{@link kml.ImagePyramid <em>Image Pyramid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Pyramid</em>'.
	 * @see kml.ImagePyramid
	 * @generated
	 */
	EClass getImagePyramid();

	/**
	 * Returns the meta object for the attribute '{@link kml.ImagePyramid#getTileSize <em>Tile Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tile Size</em>'.
	 * @see kml.ImagePyramid#getTileSize()
	 * @see #getImagePyramid()
	 * @generated
	 */
	EAttribute getImagePyramid_TileSize();

	/**
	 * Returns the meta object for the attribute '{@link kml.ImagePyramid#getMaxWidth <em>Max Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Width</em>'.
	 * @see kml.ImagePyramid#getMaxWidth()
	 * @see #getImagePyramid()
	 * @generated
	 */
	EAttribute getImagePyramid_MaxWidth();

	/**
	 * Returns the meta object for the attribute '{@link kml.ImagePyramid#getMaxHeight <em>Max Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Height</em>'.
	 * @see kml.ImagePyramid#getMaxHeight()
	 * @see #getImagePyramid()
	 * @generated
	 */
	EAttribute getImagePyramid_MaxHeight();

	/**
	 * Returns the meta object for the attribute '{@link kml.ImagePyramid#getGridOrigin <em>Grid Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Origin</em>'.
	 * @see kml.ImagePyramid#getGridOrigin()
	 * @see #getImagePyramid()
	 * @generated
	 */
	EAttribute getImagePyramid_GridOrigin();

	/**
	 * Returns the meta object for class '{@link kml.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see kml.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link kml.Point#isExtrude <em>Extrude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrude</em>'.
	 * @see kml.Point#isExtrude()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Extrude();

	/**
	 * Returns the meta object for the attribute '{@link kml.Point#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see kml.Point#getMode()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Mode();

	/**
	 * Returns the meta object for the containment reference '{@link kml.Point#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coordinates</em>'.
	 * @see kml.Point#getCoordinates()
	 * @see #getPoint()
	 * @generated
	 */
	EReference getPoint_Coordinates();

	/**
	 * Returns the meta object for class '{@link kml.ScreenOverlay <em>Screen Overlay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screen Overlay</em>'.
	 * @see kml.ScreenOverlay
	 * @generated
	 */
	EClass getScreenOverlay();

	/**
	 * Returns the meta object for the containment reference '{@link kml.ScreenOverlay#getOverlayXY <em>Overlay XY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Overlay XY</em>'.
	 * @see kml.ScreenOverlay#getOverlayXY()
	 * @see #getScreenOverlay()
	 * @generated
	 */
	EReference getScreenOverlay_OverlayXY();

	/**
	 * Returns the meta object for the containment reference '{@link kml.ScreenOverlay#getScreenXY <em>Screen XY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Screen XY</em>'.
	 * @see kml.ScreenOverlay#getScreenXY()
	 * @see #getScreenOverlay()
	 * @generated
	 */
	EReference getScreenOverlay_ScreenXY();

	/**
	 * Returns the meta object for the containment reference '{@link kml.ScreenOverlay#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rotation</em>'.
	 * @see kml.ScreenOverlay#getRotation()
	 * @see #getScreenOverlay()
	 * @generated
	 */
	EReference getScreenOverlay_Rotation();

	/**
	 * Returns the meta object for the containment reference '{@link kml.ScreenOverlay#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see kml.ScreenOverlay#getSize()
	 * @see #getScreenOverlay()
	 * @generated
	 */
	EReference getScreenOverlay_Size();

	/**
	 * Returns the meta object for class '{@link kml.Vec2Type <em>Vec2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vec2 Type</em>'.
	 * @see kml.Vec2Type
	 * @generated
	 */
	EClass getVec2Type();

	/**
	 * Returns the meta object for the attribute '{@link kml.Vec2Type#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see kml.Vec2Type#getX()
	 * @see #getVec2Type()
	 * @generated
	 */
	EAttribute getVec2Type_X();

	/**
	 * Returns the meta object for the attribute '{@link kml.Vec2Type#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see kml.Vec2Type#getY()
	 * @see #getVec2Type()
	 * @generated
	 */
	EAttribute getVec2Type_Y();

	/**
	 * Returns the meta object for the attribute '{@link kml.Vec2Type#getXunits <em>Xunits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xunits</em>'.
	 * @see kml.Vec2Type#getXunits()
	 * @see #getVec2Type()
	 * @generated
	 */
	EAttribute getVec2Type_Xunits();

	/**
	 * Returns the meta object for the attribute '{@link kml.Vec2Type#getYunits <em>Yunits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yunits</em>'.
	 * @see kml.Vec2Type#getYunits()
	 * @see #getVec2Type()
	 * @generated
	 */
	EAttribute getVec2Type_Yunits();

	/**
	 * Returns the meta object for class '{@link kml.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see kml.Folder
	 * @generated
	 */
	EClass getFolder();

	/**
	 * Returns the meta object for class '{@link kml.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see kml.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the containment reference list '{@link kml.Document#getSchemas <em>Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schemas</em>'.
	 * @see kml.Document#getSchemas()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Schemas();

	/**
	 * Returns the meta object for class '{@link kml.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see kml.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the reference list '{@link kml.Schema#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fields</em>'.
	 * @see kml.Schema#getFields()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Fields();

	/**
	 * Returns the meta object for class '{@link kml.SimpleField <em>Simple Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Field</em>'.
	 * @see kml.SimpleField
	 * @generated
	 */
	EClass getSimpleField();

	/**
	 * Returns the meta object for the attribute '{@link kml.SimpleField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see kml.SimpleField#getType()
	 * @see #getSimpleField()
	 * @generated
	 */
	EAttribute getSimpleField_Type();

	/**
	 * Returns the meta object for the attribute '{@link kml.SimpleField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kml.SimpleField#getName()
	 * @see #getSimpleField()
	 * @generated
	 */
	EAttribute getSimpleField_Name();

	/**
	 * Returns the meta object for class '{@link kml.Geometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometry</em>'.
	 * @see kml.Geometry
	 * @generated
	 */
	EClass getGeometry();

	/**
	 * Returns the meta object for class '{@link kml.LineString <em>Line String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line String</em>'.
	 * @see kml.LineString
	 * @generated
	 */
	EClass getLineString();

	/**
	 * Returns the meta object for the attribute '{@link kml.LineString#isExtrude <em>Extrude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrude</em>'.
	 * @see kml.LineString#isExtrude()
	 * @see #getLineString()
	 * @generated
	 */
	EAttribute getLineString_Extrude();

	/**
	 * Returns the meta object for the attribute '{@link kml.LineString#isTessellate <em>Tessellate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tessellate</em>'.
	 * @see kml.LineString#isTessellate()
	 * @see #getLineString()
	 * @generated
	 */
	EAttribute getLineString_Tessellate();

	/**
	 * Returns the meta object for the attribute '{@link kml.LineString#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see kml.LineString#getMode()
	 * @see #getLineString()
	 * @generated
	 */
	EAttribute getLineString_Mode();

	/**
	 * Returns the meta object for the containment reference list '{@link kml.LineString#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coordinates</em>'.
	 * @see kml.LineString#getCoordinates()
	 * @see #getLineString()
	 * @generated
	 */
	EReference getLineString_Coordinates();

	/**
	 * Returns the meta object for class '{@link kml.Coordinate <em>Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinate</em>'.
	 * @see kml.Coordinate
	 * @generated
	 */
	EClass getCoordinate();

	/**
	 * Returns the meta object for the attribute '{@link kml.Coordinate#getLon <em>Lon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lon</em>'.
	 * @see kml.Coordinate#getLon()
	 * @see #getCoordinate()
	 * @generated
	 */
	EAttribute getCoordinate_Lon();

	/**
	 * Returns the meta object for the attribute '{@link kml.Coordinate#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see kml.Coordinate#getLat()
	 * @see #getCoordinate()
	 * @generated
	 */
	EAttribute getCoordinate_Lat();

	/**
	 * Returns the meta object for the attribute '{@link kml.Coordinate#getAlt <em>Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt</em>'.
	 * @see kml.Coordinate#getAlt()
	 * @see #getCoordinate()
	 * @generated
	 */
	EAttribute getCoordinate_Alt();

	/**
	 * Returns the meta object for class '{@link kml.LinearRing <em>Linear Ring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Ring</em>'.
	 * @see kml.LinearRing
	 * @generated
	 */
	EClass getLinearRing();

	/**
	 * Returns the meta object for the attribute '{@link kml.LinearRing#isExtrude <em>Extrude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrude</em>'.
	 * @see kml.LinearRing#isExtrude()
	 * @see #getLinearRing()
	 * @generated
	 */
	EAttribute getLinearRing_Extrude();

	/**
	 * Returns the meta object for the attribute '{@link kml.LinearRing#isTessellate <em>Tessellate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tessellate</em>'.
	 * @see kml.LinearRing#isTessellate()
	 * @see #getLinearRing()
	 * @generated
	 */
	EAttribute getLinearRing_Tessellate();

	/**
	 * Returns the meta object for the attribute '{@link kml.LinearRing#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see kml.LinearRing#getMode()
	 * @see #getLinearRing()
	 * @generated
	 */
	EAttribute getLinearRing_Mode();

	/**
	 * Returns the meta object for the containment reference list '{@link kml.LinearRing#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coordinates</em>'.
	 * @see kml.LinearRing#getCoordinates()
	 * @see #getLinearRing()
	 * @generated
	 */
	EReference getLinearRing_Coordinates();

	/**
	 * Returns the meta object for class '{@link kml.Polygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygon</em>'.
	 * @see kml.Polygon
	 * @generated
	 */
	EClass getPolygon();

	/**
	 * Returns the meta object for the attribute '{@link kml.Polygon#isExtrude <em>Extrude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrude</em>'.
	 * @see kml.Polygon#isExtrude()
	 * @see #getPolygon()
	 * @generated
	 */
	EAttribute getPolygon_Extrude();

	/**
	 * Returns the meta object for the attribute '{@link kml.Polygon#isTessellate <em>Tessellate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tessellate</em>'.
	 * @see kml.Polygon#isTessellate()
	 * @see #getPolygon()
	 * @generated
	 */
	EAttribute getPolygon_Tessellate();

	/**
	 * Returns the meta object for the attribute '{@link kml.Polygon#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see kml.Polygon#getMode()
	 * @see #getPolygon()
	 * @generated
	 */
	EAttribute getPolygon_Mode();

	/**
	 * Returns the meta object for the containment reference '{@link kml.Polygon#getInnerBoundaryIs <em>Inner Boundary Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inner Boundary Is</em>'.
	 * @see kml.Polygon#getInnerBoundaryIs()
	 * @see #getPolygon()
	 * @generated
	 */
	EReference getPolygon_InnerBoundaryIs();

	/**
	 * Returns the meta object for the containment reference '{@link kml.Polygon#getOuterBoundaryIs <em>Outer Boundary Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outer Boundary Is</em>'.
	 * @see kml.Polygon#getOuterBoundaryIs()
	 * @see #getPolygon()
	 * @generated
	 */
	EReference getPolygon_OuterBoundaryIs();

	/**
	 * Returns the meta object for class '{@link kml.MultiGeometry <em>Multi Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Geometry</em>'.
	 * @see kml.MultiGeometry
	 * @generated
	 */
	EClass getMultiGeometry();

	/**
	 * Returns the meta object for the reference list '{@link kml.MultiGeometry#getGeometries <em>Geometries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Geometries</em>'.
	 * @see kml.MultiGeometry#getGeometries()
	 * @see #getMultiGeometry()
	 * @generated
	 */
	EReference getMultiGeometry_Geometries();

	/**
	 * Returns the meta object for class '{@link kml.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see kml.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link kml.Model#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see kml.Model#getMode()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Mode();

	/**
	 * Returns the meta object for the containment reference '{@link kml.Model#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see kml.Model#getLocation()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Location();

	/**
	 * Returns the meta object for the containment reference '{@link kml.Model#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Orientation</em>'.
	 * @see kml.Model#getOrientation()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Orientation();

	/**
	 * Returns the meta object for the containment reference '{@link kml.Model#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scale</em>'.
	 * @see kml.Model#getScale()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Scale();

	/**
	 * Returns the meta object for the containment reference '{@link kml.Model#getResourceMap <em>Resource Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Map</em>'.
	 * @see kml.Model#getResourceMap()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_ResourceMap();

	/**
	 * Returns the meta object for the containment reference '{@link kml.Model#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link</em>'.
	 * @see kml.Model#getLink()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Link();

	/**
	 * Returns the meta object for class '{@link kml.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see kml.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link kml.Location#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see kml.Location#getLongitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link kml.Location#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see kml.Location#getLatitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link kml.Location#getAltitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude</em>'.
	 * @see kml.Location#getAltitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Altitude();

	/**
	 * Returns the meta object for class '{@link kml.Orientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orientation</em>'.
	 * @see kml.Orientation
	 * @generated
	 */
	EClass getOrientation();

	/**
	 * Returns the meta object for the attribute '{@link kml.Orientation#getHeading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heading</em>'.
	 * @see kml.Orientation#getHeading()
	 * @see #getOrientation()
	 * @generated
	 */
	EAttribute getOrientation_Heading();

	/**
	 * Returns the meta object for the attribute '{@link kml.Orientation#getTilt <em>Tilt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tilt</em>'.
	 * @see kml.Orientation#getTilt()
	 * @see #getOrientation()
	 * @generated
	 */
	EAttribute getOrientation_Tilt();

	/**
	 * Returns the meta object for the attribute '{@link kml.Orientation#getRoll <em>Roll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roll</em>'.
	 * @see kml.Orientation#getRoll()
	 * @see #getOrientation()
	 * @generated
	 */
	EAttribute getOrientation_Roll();

	/**
	 * Returns the meta object for class '{@link kml.Scale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scale</em>'.
	 * @see kml.Scale
	 * @generated
	 */
	EClass getScale();

	/**
	 * Returns the meta object for the attribute '{@link kml.Scale#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see kml.Scale#getX()
	 * @see #getScale()
	 * @generated
	 */
	EAttribute getScale_X();

	/**
	 * Returns the meta object for the attribute '{@link kml.Scale#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see kml.Scale#getY()
	 * @see #getScale()
	 * @generated
	 */
	EAttribute getScale_Y();

	/**
	 * Returns the meta object for the attribute '{@link kml.Scale#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see kml.Scale#getZ()
	 * @see #getScale()
	 * @generated
	 */
	EAttribute getScale_Z();

	/**
	 * Returns the meta object for class '{@link kml.ResourceMap <em>Resource Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Map</em>'.
	 * @see kml.ResourceMap
	 * @generated
	 */
	EClass getResourceMap();

	/**
	 * Returns the meta object for the containment reference list '{@link kml.ResourceMap#getAliases <em>Aliases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aliases</em>'.
	 * @see kml.ResourceMap#getAliases()
	 * @see #getResourceMap()
	 * @generated
	 */
	EReference getResourceMap_Aliases();

	/**
	 * Returns the meta object for class '{@link kml.Alias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alias</em>'.
	 * @see kml.Alias
	 * @generated
	 */
	EClass getAlias();

	/**
	 * Returns the meta object for the attribute '{@link kml.Alias#getTargetHref <em>Target Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Href</em>'.
	 * @see kml.Alias#getTargetHref()
	 * @see #getAlias()
	 * @generated
	 */
	EAttribute getAlias_TargetHref();

	/**
	 * Returns the meta object for the attribute '{@link kml.Alias#getSourceHref <em>Source Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Href</em>'.
	 * @see kml.Alias#getSourceHref()
	 * @see #getAlias()
	 * @generated
	 */
	EAttribute getAlias_SourceHref();

	/**
	 * Returns the meta object for class '{@link kml.ColorStyle <em>Color Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Style</em>'.
	 * @see kml.ColorStyle
	 * @generated
	 */
	EClass getColorStyle();

	/**
	 * Returns the meta object for the attribute '{@link kml.ColorStyle#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see kml.ColorStyle#getColor()
	 * @see #getColorStyle()
	 * @generated
	 */
	EAttribute getColorStyle_Color();

	/**
	 * Returns the meta object for the attribute '{@link kml.ColorStyle#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see kml.ColorStyle#getMode()
	 * @see #getColorStyle()
	 * @generated
	 */
	EAttribute getColorStyle_Mode();

	/**
	 * Returns the meta object for class '{@link kml.IconStyle <em>Icon Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon Style</em>'.
	 * @see kml.IconStyle
	 * @generated
	 */
	EClass getIconStyle();

	/**
	 * Returns the meta object for the attribute '{@link kml.IconStyle#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see kml.IconStyle#getScale()
	 * @see #getIconStyle()
	 * @generated
	 */
	EAttribute getIconStyle_Scale();

	/**
	 * Returns the meta object for the attribute '{@link kml.IconStyle#getHeading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heading</em>'.
	 * @see kml.IconStyle#getHeading()
	 * @see #getIconStyle()
	 * @generated
	 */
	EAttribute getIconStyle_Heading();

	/**
	 * Returns the meta object for the containment reference '{@link kml.IconStyle#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon</em>'.
	 * @see kml.IconStyle#getIcon()
	 * @see #getIconStyle()
	 * @generated
	 */
	EReference getIconStyle_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link kml.IconStyle#getHotSpot <em>Hot Spot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hot Spot</em>'.
	 * @see kml.IconStyle#getHotSpot()
	 * @see #getIconStyle()
	 * @generated
	 */
	EReference getIconStyle_HotSpot();

	/**
	 * Returns the meta object for class '{@link kml.LabelStyle <em>Label Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Style</em>'.
	 * @see kml.LabelStyle
	 * @generated
	 */
	EClass getLabelStyle();

	/**
	 * Returns the meta object for the attribute '{@link kml.LabelStyle#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see kml.LabelStyle#getScale()
	 * @see #getLabelStyle()
	 * @generated
	 */
	EAttribute getLabelStyle_Scale();

	/**
	 * Returns the meta object for class '{@link kml.LineStyle <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Style</em>'.
	 * @see kml.LineStyle
	 * @generated
	 */
	EClass getLineStyle();

	/**
	 * Returns the meta object for the attribute '{@link kml.LineStyle#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see kml.LineStyle#getWidth()
	 * @see #getLineStyle()
	 * @generated
	 */
	EAttribute getLineStyle_Width();

	/**
	 * Returns the meta object for class '{@link kml.PolyStyle <em>Poly Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Poly Style</em>'.
	 * @see kml.PolyStyle
	 * @generated
	 */
	EClass getPolyStyle();

	/**
	 * Returns the meta object for the attribute '{@link kml.PolyStyle#isFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see kml.PolyStyle#isFill()
	 * @see #getPolyStyle()
	 * @generated
	 */
	EAttribute getPolyStyle_Fill();

	/**
	 * Returns the meta object for the attribute '{@link kml.PolyStyle#isOutline <em>Outline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outline</em>'.
	 * @see kml.PolyStyle#isOutline()
	 * @see #getPolyStyle()
	 * @generated
	 */
	EAttribute getPolyStyle_Outline();

	/**
	 * Returns the meta object for class '{@link kml.BalloonStyle <em>Balloon Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Balloon Style</em>'.
	 * @see kml.BalloonStyle
	 * @generated
	 */
	EClass getBalloonStyle();

	/**
	 * Returns the meta object for the attribute '{@link kml.BalloonStyle#getBgColor <em>Bg Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bg Color</em>'.
	 * @see kml.BalloonStyle#getBgColor()
	 * @see #getBalloonStyle()
	 * @generated
	 */
	EAttribute getBalloonStyle_BgColor();

	/**
	 * Returns the meta object for the attribute '{@link kml.BalloonStyle#getTextColor <em>Text Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Color</em>'.
	 * @see kml.BalloonStyle#getTextColor()
	 * @see #getBalloonStyle()
	 * @generated
	 */
	EAttribute getBalloonStyle_TextColor();

	/**
	 * Returns the meta object for the attribute '{@link kml.BalloonStyle#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see kml.BalloonStyle#getText()
	 * @see #getBalloonStyle()
	 * @generated
	 */
	EAttribute getBalloonStyle_Text();

	/**
	 * Returns the meta object for the attribute '{@link kml.BalloonStyle#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see kml.BalloonStyle#getMode()
	 * @see #getBalloonStyle()
	 * @generated
	 */
	EAttribute getBalloonStyle_Mode();

	/**
	 * Returns the meta object for class '{@link kml.Pair <em>Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pair</em>'.
	 * @see kml.Pair
	 * @generated
	 */
	EClass getPair();

	/**
	 * Returns the meta object for the attribute '{@link kml.Pair#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see kml.Pair#getId()
	 * @see #getPair()
	 * @generated
	 */
	EAttribute getPair_Id();

	/**
	 * Returns the meta object for the attribute '{@link kml.Pair#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see kml.Pair#getKey()
	 * @see #getPair()
	 * @generated
	 */
	EAttribute getPair_Key();

	/**
	 * Returns the meta object for the attribute '{@link kml.Pair#getStyleUrl <em>Style Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Url</em>'.
	 * @see kml.Pair#getStyleUrl()
	 * @see #getPair()
	 * @generated
	 */
	EAttribute getPair_StyleUrl();

	/**
	 * Returns the meta object for class '{@link kml.ListStyle <em>List Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Style</em>'.
	 * @see kml.ListStyle
	 * @generated
	 */
	EClass getListStyle();

	/**
	 * Returns the meta object for the attribute '{@link kml.ListStyle#getBgColor <em>Bg Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bg Color</em>'.
	 * @see kml.ListStyle#getBgColor()
	 * @see #getListStyle()
	 * @generated
	 */
	EAttribute getListStyle_BgColor();

	/**
	 * Returns the meta object for the attribute '{@link kml.ListStyle#getItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Type</em>'.
	 * @see kml.ListStyle#getItemType()
	 * @see #getListStyle()
	 * @generated
	 */
	EAttribute getListStyle_ItemType();

	/**
	 * Returns the meta object for the containment reference list '{@link kml.ListStyle#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see kml.ListStyle#getItems()
	 * @see #getListStyle()
	 * @generated
	 */
	EReference getListStyle_Items();

	/**
	 * Returns the meta object for class '{@link kml.ItemIcon <em>Item Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Icon</em>'.
	 * @see kml.ItemIcon
	 * @generated
	 */
	EClass getItemIcon();

	/**
	 * Returns the meta object for the attribute '{@link kml.ItemIcon#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see kml.ItemIcon#getState()
	 * @see #getItemIcon()
	 * @generated
	 */
	EAttribute getItemIcon_State();

	/**
	 * Returns the meta object for the attribute '{@link kml.ItemIcon#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see kml.ItemIcon#getHref()
	 * @see #getItemIcon()
	 * @generated
	 */
	EAttribute getItemIcon_Href();

	/**
	 * Returns the meta object for class '{@link kml.AbstractStyle <em>Abstract Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Style</em>'.
	 * @see kml.AbstractStyle
	 * @generated
	 */
	EClass getAbstractStyle();

	/**
	 * Returns the meta object for enum '{@link kml.AltitudeMode <em>Altitude Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Altitude Mode</em>'.
	 * @see kml.AltitudeMode
	 * @generated
	 */
	EEnum getAltitudeMode();

	/**
	 * Returns the meta object for enum '{@link kml.RefreshMode <em>Refresh Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Refresh Mode</em>'.
	 * @see kml.RefreshMode
	 * @generated
	 */
	EEnum getRefreshMode();

	/**
	 * Returns the meta object for enum '{@link kml.ViewRefreshMode <em>View Refresh Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>View Refresh Mode</em>'.
	 * @see kml.ViewRefreshMode
	 * @generated
	 */
	EEnum getViewRefreshMode();

	/**
	 * Returns the meta object for enum '{@link kml.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Shape</em>'.
	 * @see kml.Shape
	 * @generated
	 */
	EEnum getShape();

	/**
	 * Returns the meta object for enum '{@link kml.GridOrigin <em>Grid Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Grid Origin</em>'.
	 * @see kml.GridOrigin
	 * @generated
	 */
	EEnum getGridOrigin();

	/**
	 * Returns the meta object for enum '{@link kml.Units <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Units</em>'.
	 * @see kml.Units
	 * @generated
	 */
	EEnum getUnits();

	/**
	 * Returns the meta object for enum '{@link kml.SchemaType <em>Schema Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Schema Type</em>'.
	 * @see kml.SchemaType
	 * @generated
	 */
	EEnum getSchemaType();

	/**
	 * Returns the meta object for enum '{@link kml.ColorMode <em>Color Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color Mode</em>'.
	 * @see kml.ColorMode
	 * @generated
	 */
	EEnum getColorMode();

	/**
	 * Returns the meta object for enum '{@link kml.DisplayMode <em>Display Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Display Mode</em>'.
	 * @see kml.DisplayMode
	 * @generated
	 */
	EEnum getDisplayMode();

	/**
	 * Returns the meta object for enum '{@link kml.StyleState <em>Style State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Style State</em>'.
	 * @see kml.StyleState
	 * @generated
	 */
	EEnum getStyleState();

	/**
	 * Returns the meta object for enum '{@link kml.ListeItemType <em>Liste Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Liste Item Type</em>'.
	 * @see kml.ListeItemType
	 * @generated
	 */
	EEnum getListeItemType();

	/**
	 * Returns the meta object for enum '{@link kml.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State</em>'.
	 * @see kml.State
	 * @generated
	 */
	EEnum getState();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getColor();

	/**
	 * Returns the meta object for data type '<em>Angle90</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Angle90</em>'.
	 * @model instanceClass="double"
	 * @generated
	 */
	EDataType getAngle90();

	/**
	 * Returns the meta object for data type '<em>Angle180</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Angle180</em>'.
	 * @model instanceClass="double"
	 * @generated
	 */
	EDataType getAngle180();

	/**
	 * Returns the meta object for data type '<em>Angle360</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Angle360</em>'.
	 * @model instanceClass="double"
	 * @generated
	 */
	EDataType getAngle360();

	/**
	 * Returns the meta object for data type '<em>Angle Pos90</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Angle Pos90</em>'.
	 * @model instanceClass="double"
	 * @generated
	 */
	EDataType getAnglePos90();

	/**
	 * Returns the meta object for data type '<em>Angle Pos180</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Angle Pos180</em>'.
	 * @model instanceClass="double"
	 * @generated
	 */
	EDataType getAnglePos180();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KmlFactory getKmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link kml.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.ObjectImpl
		 * @see kml.impl.KmlPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__ID = eINSTANCE.getObject_Id();

		/**
		 * The meta object literal for the '<em><b>Target Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__TARGET_ID = eINSTANCE.getObject_TargetId();

		/**
		 * The meta object literal for the '{@link kml.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.FeatureImpl
		 * @see kml.impl.KmlPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__VISIBILITY = eINSTANCE.getFeature_Visibility();

		/**
		 * The meta object literal for the '<em><b>Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__OPEN = eINSTANCE.getFeature_Open();

		/**
		 * The meta object literal for the '<em><b>Atom Author</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__ATOM_AUTHOR = eINSTANCE.getFeature_AtomAuthor();

		/**
		 * The meta object literal for the '<em><b>Atom Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__ATOM_LINK = eINSTANCE.getFeature_AtomLink();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__ADDRESS = eINSTANCE.getFeature_Address();

		/**
		 * The meta object literal for the '<em><b>Phone Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__PHONE_NUMBER = eINSTANCE.getFeature_PhoneNumber();

		/**
		 * The meta object literal for the '<em><b>Xal Address Details</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__XAL_ADDRESS_DETAILS = eINSTANCE.getFeature_XalAddressDetails();

		/**
		 * The meta object literal for the '<em><b>Snippet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__SNIPPET = eINSTANCE.getFeature_Snippet();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__DESCRIPTION = eINSTANCE.getFeature_Description();

		/**
		 * The meta object literal for the '<em><b>Abstract View</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__ABSTRACT_VIEW = eINSTANCE.getFeature_AbstractView();

		/**
		 * The meta object literal for the '<em><b>Time Primitive</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__TIME_PRIMITIVE = eINSTANCE.getFeature_TimePrimitive();

		/**
		 * The meta object literal for the '<em><b>Style Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__STYLE_URL = eINSTANCE.getFeature_StyleUrl();

		/**
		 * The meta object literal for the '<em><b>Style Selectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__STYLE_SELECTORS = eINSTANCE.getFeature_StyleSelectors();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__REGION = eINSTANCE.getFeature_Region();

		/**
		 * The meta object literal for the '<em><b>Extended Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__EXTENDED_DATA = eINSTANCE.getFeature_ExtendedData();

		/**
		 * The meta object literal for the '{@link kml.impl.AbstractViewImpl <em>Abstract View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.AbstractViewImpl
		 * @see kml.impl.KmlPackageImpl#getAbstractView()
		 * @generated
		 */
		EClass ABSTRACT_VIEW = eINSTANCE.getAbstractView();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_VIEW__LONGITUDE = eINSTANCE.getAbstractView_Longitude();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_VIEW__LATITUDE = eINSTANCE.getAbstractView_Latitude();

		/**
		 * The meta object literal for the '<em><b>Altitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_VIEW__ALTITUDE = eINSTANCE.getAbstractView_Altitude();

		/**
		 * The meta object literal for the '<em><b>Heading</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_VIEW__HEADING = eINSTANCE.getAbstractView_Heading();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_VIEW__MODE = eINSTANCE.getAbstractView_Mode();

		/**
		 * The meta object literal for the '{@link kml.impl.TimePrimitiveImpl <em>Time Primitive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.TimePrimitiveImpl
		 * @see kml.impl.KmlPackageImpl#getTimePrimitive()
		 * @generated
		 */
		EClass TIME_PRIMITIVE = eINSTANCE.getTimePrimitive();

		/**
		 * The meta object literal for the '{@link kml.impl.TimeSpanImpl <em>Time Span</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.TimeSpanImpl
		 * @see kml.impl.KmlPackageImpl#getTimeSpan()
		 * @generated
		 */
		EClass TIME_SPAN = eINSTANCE.getTimeSpan();

		/**
		 * The meta object literal for the '{@link kml.impl.TimeStampImpl <em>Time Stamp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.TimeStampImpl
		 * @see kml.impl.KmlPackageImpl#getTimeStamp()
		 * @generated
		 */
		EClass TIME_STAMP = eINSTANCE.getTimeStamp();

		/**
		 * The meta object literal for the '{@link kml.impl.CameraImpl <em>Camera</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.CameraImpl
		 * @see kml.impl.KmlPackageImpl#getCamera()
		 * @generated
		 */
		EClass CAMERA = eINSTANCE.getCamera();

		/**
		 * The meta object literal for the '<em><b>Tilt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMERA__TILT = eINSTANCE.getCamera_Tilt();

		/**
		 * The meta object literal for the '<em><b>Roll</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMERA__ROLL = eINSTANCE.getCamera_Roll();

		/**
		 * The meta object literal for the '{@link kml.impl.LookAtImpl <em>Look At</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.LookAtImpl
		 * @see kml.impl.KmlPackageImpl#getLookAt()
		 * @generated
		 */
		EClass LOOK_AT = eINSTANCE.getLookAt();

		/**
		 * The meta object literal for the '<em><b>Tilt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOK_AT__TILT = eINSTANCE.getLookAt_Tilt();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOK_AT__RANGE = eINSTANCE.getLookAt_Range();

		/**
		 * The meta object literal for the '{@link kml.impl.StyleSelectorImpl <em>Style Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.StyleSelectorImpl
		 * @see kml.impl.KmlPackageImpl#getStyleSelector()
		 * @generated
		 */
		EClass STYLE_SELECTOR = eINSTANCE.getStyleSelector();

		/**
		 * The meta object literal for the '{@link kml.impl.StyleImpl <em>Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.StyleImpl
		 * @see kml.impl.KmlPackageImpl#getStyle()
		 * @generated
		 */
		EClass STYLE = eINSTANCE.getStyle();

		/**
		 * The meta object literal for the '<em><b>Styles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE__STYLES = eINSTANCE.getStyle_Styles();

		/**
		 * The meta object literal for the '{@link kml.impl.StyleMapImpl <em>Style Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.StyleMapImpl
		 * @see kml.impl.KmlPackageImpl#getStyleMap()
		 * @generated
		 */
		EClass STYLE_MAP = eINSTANCE.getStyleMap();

		/**
		 * The meta object literal for the '<em><b>Pairs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_MAP__PAIRS = eINSTANCE.getStyleMap_Pairs();

		/**
		 * The meta object literal for the '{@link kml.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.RegionImpl
		 * @see kml.impl.KmlPackageImpl#getRegion()
		 * @generated
		 */
		EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '<em><b>Lat Lon Alt Box</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__LAT_LON_ALT_BOX = eINSTANCE.getRegion_LatLonAltBox();

		/**
		 * The meta object literal for the '<em><b>Lod</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__LOD = eINSTANCE.getRegion_Lod();

		/**
		 * The meta object literal for the '{@link kml.impl.LatLonAltBoxImpl <em>Lat Lon Alt Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.LatLonAltBoxImpl
		 * @see kml.impl.KmlPackageImpl#getLatLonAltBox()
		 * @generated
		 */
		EClass LAT_LON_ALT_BOX = eINSTANCE.getLatLonAltBox();

		/**
		 * The meta object literal for the '<em><b>Min Altitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAT_LON_ALT_BOX__MIN_ALTITUDE = eINSTANCE.getLatLonAltBox_MinAltitude();

		/**
		 * The meta object literal for the '<em><b>Max Altitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAT_LON_ALT_BOX__MAX_ALTITUDE = eINSTANCE.getLatLonAltBox_MaxAltitude();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAT_LON_ALT_BOX__MODE = eINSTANCE.getLatLonAltBox_Mode();

		/**
		 * The meta object literal for the '{@link kml.impl.LodImpl <em>Lod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.LodImpl
		 * @see kml.impl.KmlPackageImpl#getLod()
		 * @generated
		 */
		EClass LOD = eINSTANCE.getLod();

		/**
		 * The meta object literal for the '<em><b>Min Lod Pixels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOD__MIN_LOD_PIXELS = eINSTANCE.getLod_MinLodPixels();

		/**
		 * The meta object literal for the '<em><b>Max Lod Pixels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOD__MAX_LOD_PIXELS = eINSTANCE.getLod_MaxLodPixels();

		/**
		 * The meta object literal for the '<em><b>Min Fade Extent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOD__MIN_FADE_EXTENT = eINSTANCE.getLod_MinFadeExtent();

		/**
		 * The meta object literal for the '<em><b>Max Fade Extent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOD__MAX_FADE_EXTENT = eINSTANCE.getLod_MaxFadeExtent();

		/**
		 * The meta object literal for the '{@link kml.impl.ExtendedDataImpl <em>Extended Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.ExtendedDataImpl
		 * @see kml.impl.KmlPackageImpl#getExtendedData()
		 * @generated
		 */
		EClass EXTENDED_DATA = eINSTANCE.getExtendedData();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_DATA__DATA = eINSTANCE.getExtendedData_Data();

		/**
		 * The meta object literal for the '<em><b>Schema Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_DATA__SCHEMA_DATA = eINSTANCE.getExtendedData_SchemaData();

		/**
		 * The meta object literal for the '<em><b>Xml Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_DATA__XML_CONTENT = eINSTANCE.getExtendedData_XmlContent();

		/**
		 * The meta object literal for the '{@link kml.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.DataImpl
		 * @see kml.impl.KmlPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__NAME = eINSTANCE.getData_Name();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__DISPLAY_NAME = eINSTANCE.getData_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__VALUE = eINSTANCE.getData_Value();

		/**
		 * The meta object literal for the '{@link kml.impl.SchemaDataImpl <em>Schema Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.SchemaDataImpl
		 * @see kml.impl.KmlPackageImpl#getSchemaData()
		 * @generated
		 */
		EClass SCHEMA_DATA = eINSTANCE.getSchemaData();

		/**
		 * The meta object literal for the '<em><b>Schema Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_DATA__SCHEMA_URL = eINSTANCE.getSchemaData_SchemaUrl();

		/**
		 * The meta object literal for the '<em><b>Simpledata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_DATA__SIMPLEDATA = eINSTANCE.getSchemaData_Simpledata();

		/**
		 * The meta object literal for the '{@link kml.impl.SimpleDataImpl <em>Simple Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.SimpleDataImpl
		 * @see kml.impl.KmlPackageImpl#getSimpleData()
		 * @generated
		 */
		EClass SIMPLE_DATA = eINSTANCE.getSimpleData();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DATA__NAME = eINSTANCE.getSimpleData_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DATA__VALUE = eINSTANCE.getSimpleData_Value();

		/**
		 * The meta object literal for the '{@link kml.impl.OverlayImpl <em>Overlay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.OverlayImpl
		 * @see kml.impl.KmlPackageImpl#getOverlay()
		 * @generated
		 */
		EClass OVERLAY = eINSTANCE.getOverlay();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERLAY__COLOR = eINSTANCE.getOverlay_Color();

		/**
		 * The meta object literal for the '<em><b>Draw Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERLAY__DRAW_ORDER = eINSTANCE.getOverlay_DrawOrder();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OVERLAY__ICON = eINSTANCE.getOverlay_Icon();

		/**
		 * The meta object literal for the '{@link kml.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.ContainerImpl
		 * @see kml.impl.KmlPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__FEATURES = eINSTANCE.getContainer_Features();

		/**
		 * The meta object literal for the '{@link kml.impl.PlacemarkImpl <em>Placemark</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.PlacemarkImpl
		 * @see kml.impl.KmlPackageImpl#getPlacemark()
		 * @generated
		 */
		EClass PLACEMARK = eINSTANCE.getPlacemark();

		/**
		 * The meta object literal for the '<em><b>Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACEMARK__GEOMETRY = eINSTANCE.getPlacemark_Geometry();

		/**
		 * The meta object literal for the '{@link kml.impl.NetworkLinkImpl <em>Network Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.NetworkLinkImpl
		 * @see kml.impl.KmlPackageImpl#getNetworkLink()
		 * @generated
		 */
		EClass NETWORK_LINK = eINSTANCE.getNetworkLink();

		/**
		 * The meta object literal for the '<em><b>Refresh Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_LINK__REFRESH_VISIBILITY = eINSTANCE.getNetworkLink_RefreshVisibility();

		/**
		 * The meta object literal for the '<em><b>Fly To View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_LINK__FLY_TO_VIEW = eINSTANCE.getNetworkLink_FlyToView();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_LINK__LINK = eINSTANCE.getNetworkLink_Link();

		/**
		 * The meta object literal for the '{@link kml.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.LinkImpl
		 * @see kml.impl.KmlPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Url Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__URL_REF = eINSTANCE.getLink_UrlRef();

		/**
		 * The meta object literal for the '<em><b>Refresh Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__REFRESH_MODE = eINSTANCE.getLink_RefreshMode();

		/**
		 * The meta object literal for the '<em><b>Refresh Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__REFRESH_INTERVAL = eINSTANCE.getLink_RefreshInterval();

		/**
		 * The meta object literal for the '<em><b>View Refresh Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__VIEW_REFRESH_MODE = eINSTANCE.getLink_ViewRefreshMode();

		/**
		 * The meta object literal for the '<em><b>View Refresh Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__VIEW_REFRESH_TIME = eINSTANCE.getLink_ViewRefreshTime();

		/**
		 * The meta object literal for the '<em><b>View Bound Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__VIEW_BOUND_SCALE = eINSTANCE.getLink_ViewBoundScale();

		/**
		 * The meta object literal for the '<em><b>View Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__VIEW_FORMAT = eINSTANCE.getLink_ViewFormat();

		/**
		 * The meta object literal for the '<em><b>Http Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__HTTP_QUERY = eINSTANCE.getLink_HttpQuery();

		/**
		 * The meta object literal for the '{@link kml.impl.IconImpl <em>Icon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.IconImpl
		 * @see kml.impl.KmlPackageImpl#getIcon()
		 * @generated
		 */
		EClass ICON = eINSTANCE.getIcon();

		/**
		 * The meta object literal for the '{@link kml.impl.GroundOverlayImpl <em>Ground Overlay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.GroundOverlayImpl
		 * @see kml.impl.KmlPackageImpl#getGroundOverlay()
		 * @generated
		 */
		EClass GROUND_OVERLAY = eINSTANCE.getGroundOverlay();

		/**
		 * The meta object literal for the '<em><b>Altitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUND_OVERLAY__ALTITUDE = eINSTANCE.getGroundOverlay_Altitude();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUND_OVERLAY__MODE = eINSTANCE.getGroundOverlay_Mode();

		/**
		 * The meta object literal for the '<em><b>Lat Lon Box</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUND_OVERLAY__LAT_LON_BOX = eINSTANCE.getGroundOverlay_LatLonBox();

		/**
		 * The meta object literal for the '{@link kml.impl.LatLonBoxImpl <em>Lat Lon Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.LatLonBoxImpl
		 * @see kml.impl.KmlPackageImpl#getLatLonBox()
		 * @generated
		 */
		EClass LAT_LON_BOX = eINSTANCE.getLatLonBox();

		/**
		 * The meta object literal for the '<em><b>North</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAT_LON_BOX__NORTH = eINSTANCE.getLatLonBox_North();

		/**
		 * The meta object literal for the '<em><b>South</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAT_LON_BOX__SOUTH = eINSTANCE.getLatLonBox_South();

		/**
		 * The meta object literal for the '<em><b>East</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAT_LON_BOX__EAST = eINSTANCE.getLatLonBox_East();

		/**
		 * The meta object literal for the '<em><b>West</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAT_LON_BOX__WEST = eINSTANCE.getLatLonBox_West();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAT_LON_BOX__ROTATION = eINSTANCE.getLatLonBox_Rotation();

		/**
		 * The meta object literal for the '{@link kml.impl.PhotoOverlayImpl <em>Photo Overlay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.PhotoOverlayImpl
		 * @see kml.impl.KmlPackageImpl#getPhotoOverlay()
		 * @generated
		 */
		EClass PHOTO_OVERLAY = eINSTANCE.getPhotoOverlay();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHOTO_OVERLAY__SHAPE = eINSTANCE.getPhotoOverlay_Shape();

		/**
		 * The meta object literal for the '<em><b>View Volume</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHOTO_OVERLAY__VIEW_VOLUME = eINSTANCE.getPhotoOverlay_ViewVolume();

		/**
		 * The meta object literal for the '<em><b>Roll</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHOTO_OVERLAY__ROLL = eINSTANCE.getPhotoOverlay_Roll();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHOTO_OVERLAY__POINT = eINSTANCE.getPhotoOverlay_Point();

		/**
		 * The meta object literal for the '<em><b>Image Pyramid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHOTO_OVERLAY__IMAGE_PYRAMID = eINSTANCE.getPhotoOverlay_ImagePyramid();

		/**
		 * The meta object literal for the '{@link kml.impl.ViewVolumeImpl <em>View Volume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.ViewVolumeImpl
		 * @see kml.impl.KmlPackageImpl#getViewVolume()
		 * @generated
		 */
		EClass VIEW_VOLUME = eINSTANCE.getViewVolume();

		/**
		 * The meta object literal for the '<em><b>Left Fov</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_VOLUME__LEFT_FOV = eINSTANCE.getViewVolume_LeftFov();

		/**
		 * The meta object literal for the '<em><b>Right Fov</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_VOLUME__RIGHT_FOV = eINSTANCE.getViewVolume_RightFov();

		/**
		 * The meta object literal for the '<em><b>Bottom Fov</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_VOLUME__BOTTOM_FOV = eINSTANCE.getViewVolume_BottomFov();

		/**
		 * The meta object literal for the '<em><b>Top Fov</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_VOLUME__TOP_FOV = eINSTANCE.getViewVolume_TopFov();

		/**
		 * The meta object literal for the '<em><b>Near</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_VOLUME__NEAR = eINSTANCE.getViewVolume_Near();

		/**
		 * The meta object literal for the '{@link kml.impl.ImagePyramidImpl <em>Image Pyramid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.ImagePyramidImpl
		 * @see kml.impl.KmlPackageImpl#getImagePyramid()
		 * @generated
		 */
		EClass IMAGE_PYRAMID = eINSTANCE.getImagePyramid();

		/**
		 * The meta object literal for the '<em><b>Tile Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_PYRAMID__TILE_SIZE = eINSTANCE.getImagePyramid_TileSize();

		/**
		 * The meta object literal for the '<em><b>Max Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_PYRAMID__MAX_WIDTH = eINSTANCE.getImagePyramid_MaxWidth();

		/**
		 * The meta object literal for the '<em><b>Max Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_PYRAMID__MAX_HEIGHT = eINSTANCE.getImagePyramid_MaxHeight();

		/**
		 * The meta object literal for the '<em><b>Grid Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_PYRAMID__GRID_ORIGIN = eINSTANCE.getImagePyramid_GridOrigin();

		/**
		 * The meta object literal for the '{@link kml.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.PointImpl
		 * @see kml.impl.KmlPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>Extrude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__EXTRUDE = eINSTANCE.getPoint_Extrude();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__MODE = eINSTANCE.getPoint_Mode();

		/**
		 * The meta object literal for the '<em><b>Coordinates</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT__COORDINATES = eINSTANCE.getPoint_Coordinates();

		/**
		 * The meta object literal for the '{@link kml.impl.ScreenOverlayImpl <em>Screen Overlay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.ScreenOverlayImpl
		 * @see kml.impl.KmlPackageImpl#getScreenOverlay()
		 * @generated
		 */
		EClass SCREEN_OVERLAY = eINSTANCE.getScreenOverlay();

		/**
		 * The meta object literal for the '<em><b>Overlay XY</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCREEN_OVERLAY__OVERLAY_XY = eINSTANCE.getScreenOverlay_OverlayXY();

		/**
		 * The meta object literal for the '<em><b>Screen XY</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCREEN_OVERLAY__SCREEN_XY = eINSTANCE.getScreenOverlay_ScreenXY();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCREEN_OVERLAY__ROTATION = eINSTANCE.getScreenOverlay_Rotation();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCREEN_OVERLAY__SIZE = eINSTANCE.getScreenOverlay_Size();

		/**
		 * The meta object literal for the '{@link kml.impl.Vec2TypeImpl <em>Vec2 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.Vec2TypeImpl
		 * @see kml.impl.KmlPackageImpl#getVec2Type()
		 * @generated
		 */
		EClass VEC2_TYPE = eINSTANCE.getVec2Type();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEC2_TYPE__X = eINSTANCE.getVec2Type_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEC2_TYPE__Y = eINSTANCE.getVec2Type_Y();

		/**
		 * The meta object literal for the '<em><b>Xunits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEC2_TYPE__XUNITS = eINSTANCE.getVec2Type_Xunits();

		/**
		 * The meta object literal for the '<em><b>Yunits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEC2_TYPE__YUNITS = eINSTANCE.getVec2Type_Yunits();

		/**
		 * The meta object literal for the '{@link kml.impl.FolderImpl <em>Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.FolderImpl
		 * @see kml.impl.KmlPackageImpl#getFolder()
		 * @generated
		 */
		EClass FOLDER = eINSTANCE.getFolder();

		/**
		 * The meta object literal for the '{@link kml.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.DocumentImpl
		 * @see kml.impl.KmlPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Schemas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__SCHEMAS = eINSTANCE.getDocument_Schemas();

		/**
		 * The meta object literal for the '{@link kml.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.SchemaImpl
		 * @see kml.impl.KmlPackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__FIELDS = eINSTANCE.getSchema_Fields();

		/**
		 * The meta object literal for the '{@link kml.impl.SimpleFieldImpl <em>Simple Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.SimpleFieldImpl
		 * @see kml.impl.KmlPackageImpl#getSimpleField()
		 * @generated
		 */
		EClass SIMPLE_FIELD = eINSTANCE.getSimpleField();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_FIELD__TYPE = eINSTANCE.getSimpleField_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_FIELD__NAME = eINSTANCE.getSimpleField_Name();

		/**
		 * The meta object literal for the '{@link kml.impl.GeometryImpl <em>Geometry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.GeometryImpl
		 * @see kml.impl.KmlPackageImpl#getGeometry()
		 * @generated
		 */
		EClass GEOMETRY = eINSTANCE.getGeometry();

		/**
		 * The meta object literal for the '{@link kml.impl.LineStringImpl <em>Line String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.LineStringImpl
		 * @see kml.impl.KmlPackageImpl#getLineString()
		 * @generated
		 */
		EClass LINE_STRING = eINSTANCE.getLineString();

		/**
		 * The meta object literal for the '<em><b>Extrude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_STRING__EXTRUDE = eINSTANCE.getLineString_Extrude();

		/**
		 * The meta object literal for the '<em><b>Tessellate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_STRING__TESSELLATE = eINSTANCE.getLineString_Tessellate();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_STRING__MODE = eINSTANCE.getLineString_Mode();

		/**
		 * The meta object literal for the '<em><b>Coordinates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_STRING__COORDINATES = eINSTANCE.getLineString_Coordinates();

		/**
		 * The meta object literal for the '{@link kml.impl.CoordinateImpl <em>Coordinate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.CoordinateImpl
		 * @see kml.impl.KmlPackageImpl#getCoordinate()
		 * @generated
		 */
		EClass COORDINATE = eINSTANCE.getCoordinate();

		/**
		 * The meta object literal for the '<em><b>Lon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATE__LON = eINSTANCE.getCoordinate_Lon();

		/**
		 * The meta object literal for the '<em><b>Lat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATE__LAT = eINSTANCE.getCoordinate_Lat();

		/**
		 * The meta object literal for the '<em><b>Alt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATE__ALT = eINSTANCE.getCoordinate_Alt();

		/**
		 * The meta object literal for the '{@link kml.impl.LinearRingImpl <em>Linear Ring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.LinearRingImpl
		 * @see kml.impl.KmlPackageImpl#getLinearRing()
		 * @generated
		 */
		EClass LINEAR_RING = eINSTANCE.getLinearRing();

		/**
		 * The meta object literal for the '<em><b>Extrude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_RING__EXTRUDE = eINSTANCE.getLinearRing_Extrude();

		/**
		 * The meta object literal for the '<em><b>Tessellate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_RING__TESSELLATE = eINSTANCE.getLinearRing_Tessellate();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_RING__MODE = eINSTANCE.getLinearRing_Mode();

		/**
		 * The meta object literal for the '<em><b>Coordinates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINEAR_RING__COORDINATES = eINSTANCE.getLinearRing_Coordinates();

		/**
		 * The meta object literal for the '{@link kml.impl.PolygonImpl <em>Polygon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.PolygonImpl
		 * @see kml.impl.KmlPackageImpl#getPolygon()
		 * @generated
		 */
		EClass POLYGON = eINSTANCE.getPolygon();

		/**
		 * The meta object literal for the '<em><b>Extrude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLYGON__EXTRUDE = eINSTANCE.getPolygon_Extrude();

		/**
		 * The meta object literal for the '<em><b>Tessellate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLYGON__TESSELLATE = eINSTANCE.getPolygon_Tessellate();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLYGON__MODE = eINSTANCE.getPolygon_Mode();

		/**
		 * The meta object literal for the '<em><b>Inner Boundary Is</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLYGON__INNER_BOUNDARY_IS = eINSTANCE.getPolygon_InnerBoundaryIs();

		/**
		 * The meta object literal for the '<em><b>Outer Boundary Is</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLYGON__OUTER_BOUNDARY_IS = eINSTANCE.getPolygon_OuterBoundaryIs();

		/**
		 * The meta object literal for the '{@link kml.impl.MultiGeometryImpl <em>Multi Geometry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.MultiGeometryImpl
		 * @see kml.impl.KmlPackageImpl#getMultiGeometry()
		 * @generated
		 */
		EClass MULTI_GEOMETRY = eINSTANCE.getMultiGeometry();

		/**
		 * The meta object literal for the '<em><b>Geometries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_GEOMETRY__GEOMETRIES = eINSTANCE.getMultiGeometry_Geometries();

		/**
		 * The meta object literal for the '{@link kml.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.ModelImpl
		 * @see kml.impl.KmlPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__MODE = eINSTANCE.getModel_Mode();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__LOCATION = eINSTANCE.getModel_Location();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ORIENTATION = eINSTANCE.getModel_Orientation();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__SCALE = eINSTANCE.getModel_Scale();

		/**
		 * The meta object literal for the '<em><b>Resource Map</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__RESOURCE_MAP = eINSTANCE.getModel_ResourceMap();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__LINK = eINSTANCE.getModel_Link();

		/**
		 * The meta object literal for the '{@link kml.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.LocationImpl
		 * @see kml.impl.KmlPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LONGITUDE = eINSTANCE.getLocation_Longitude();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LATITUDE = eINSTANCE.getLocation_Latitude();

		/**
		 * The meta object literal for the '<em><b>Altitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__ALTITUDE = eINSTANCE.getLocation_Altitude();

		/**
		 * The meta object literal for the '{@link kml.impl.OrientationImpl <em>Orientation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.OrientationImpl
		 * @see kml.impl.KmlPackageImpl#getOrientation()
		 * @generated
		 */
		EClass ORIENTATION = eINSTANCE.getOrientation();

		/**
		 * The meta object literal for the '<em><b>Heading</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORIENTATION__HEADING = eINSTANCE.getOrientation_Heading();

		/**
		 * The meta object literal for the '<em><b>Tilt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORIENTATION__TILT = eINSTANCE.getOrientation_Tilt();

		/**
		 * The meta object literal for the '<em><b>Roll</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORIENTATION__ROLL = eINSTANCE.getOrientation_Roll();

		/**
		 * The meta object literal for the '{@link kml.impl.ScaleImpl <em>Scale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.ScaleImpl
		 * @see kml.impl.KmlPackageImpl#getScale()
		 * @generated
		 */
		EClass SCALE = eINSTANCE.getScale();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALE__X = eINSTANCE.getScale_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALE__Y = eINSTANCE.getScale_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALE__Z = eINSTANCE.getScale_Z();

		/**
		 * The meta object literal for the '{@link kml.impl.ResourceMapImpl <em>Resource Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.ResourceMapImpl
		 * @see kml.impl.KmlPackageImpl#getResourceMap()
		 * @generated
		 */
		EClass RESOURCE_MAP = eINSTANCE.getResourceMap();

		/**
		 * The meta object literal for the '<em><b>Aliases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_MAP__ALIASES = eINSTANCE.getResourceMap_Aliases();

		/**
		 * The meta object literal for the '{@link kml.impl.AliasImpl <em>Alias</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.AliasImpl
		 * @see kml.impl.KmlPackageImpl#getAlias()
		 * @generated
		 */
		EClass ALIAS = eINSTANCE.getAlias();

		/**
		 * The meta object literal for the '<em><b>Target Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALIAS__TARGET_HREF = eINSTANCE.getAlias_TargetHref();

		/**
		 * The meta object literal for the '<em><b>Source Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALIAS__SOURCE_HREF = eINSTANCE.getAlias_SourceHref();

		/**
		 * The meta object literal for the '{@link kml.impl.ColorStyleImpl <em>Color Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.ColorStyleImpl
		 * @see kml.impl.KmlPackageImpl#getColorStyle()
		 * @generated
		 */
		EClass COLOR_STYLE = eINSTANCE.getColorStyle();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_STYLE__COLOR = eINSTANCE.getColorStyle_Color();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_STYLE__MODE = eINSTANCE.getColorStyle_Mode();

		/**
		 * The meta object literal for the '{@link kml.impl.IconStyleImpl <em>Icon Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.IconStyleImpl
		 * @see kml.impl.KmlPackageImpl#getIconStyle()
		 * @generated
		 */
		EClass ICON_STYLE = eINSTANCE.getIconStyle();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON_STYLE__SCALE = eINSTANCE.getIconStyle_Scale();

		/**
		 * The meta object literal for the '<em><b>Heading</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON_STYLE__HEADING = eINSTANCE.getIconStyle_Heading();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICON_STYLE__ICON = eINSTANCE.getIconStyle_Icon();

		/**
		 * The meta object literal for the '<em><b>Hot Spot</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICON_STYLE__HOT_SPOT = eINSTANCE.getIconStyle_HotSpot();

		/**
		 * The meta object literal for the '{@link kml.impl.LabelStyleImpl <em>Label Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.LabelStyleImpl
		 * @see kml.impl.KmlPackageImpl#getLabelStyle()
		 * @generated
		 */
		EClass LABEL_STYLE = eINSTANCE.getLabelStyle();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_STYLE__SCALE = eINSTANCE.getLabelStyle_Scale();

		/**
		 * The meta object literal for the '{@link kml.impl.LineStyleImpl <em>Line Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.LineStyleImpl
		 * @see kml.impl.KmlPackageImpl#getLineStyle()
		 * @generated
		 */
		EClass LINE_STYLE = eINSTANCE.getLineStyle();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_STYLE__WIDTH = eINSTANCE.getLineStyle_Width();

		/**
		 * The meta object literal for the '{@link kml.impl.PolyStyleImpl <em>Poly Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.PolyStyleImpl
		 * @see kml.impl.KmlPackageImpl#getPolyStyle()
		 * @generated
		 */
		EClass POLY_STYLE = eINSTANCE.getPolyStyle();

		/**
		 * The meta object literal for the '<em><b>Fill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLY_STYLE__FILL = eINSTANCE.getPolyStyle_Fill();

		/**
		 * The meta object literal for the '<em><b>Outline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLY_STYLE__OUTLINE = eINSTANCE.getPolyStyle_Outline();

		/**
		 * The meta object literal for the '{@link kml.impl.BalloonStyleImpl <em>Balloon Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.BalloonStyleImpl
		 * @see kml.impl.KmlPackageImpl#getBalloonStyle()
		 * @generated
		 */
		EClass BALLOON_STYLE = eINSTANCE.getBalloonStyle();

		/**
		 * The meta object literal for the '<em><b>Bg Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BALLOON_STYLE__BG_COLOR = eINSTANCE.getBalloonStyle_BgColor();

		/**
		 * The meta object literal for the '<em><b>Text Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BALLOON_STYLE__TEXT_COLOR = eINSTANCE.getBalloonStyle_TextColor();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BALLOON_STYLE__TEXT = eINSTANCE.getBalloonStyle_Text();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BALLOON_STYLE__MODE = eINSTANCE.getBalloonStyle_Mode();

		/**
		 * The meta object literal for the '{@link kml.impl.PairImpl <em>Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.PairImpl
		 * @see kml.impl.KmlPackageImpl#getPair()
		 * @generated
		 */
		EClass PAIR = eINSTANCE.getPair();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAIR__ID = eINSTANCE.getPair_Id();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAIR__KEY = eINSTANCE.getPair_Key();

		/**
		 * The meta object literal for the '<em><b>Style Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAIR__STYLE_URL = eINSTANCE.getPair_StyleUrl();

		/**
		 * The meta object literal for the '{@link kml.impl.ListStyleImpl <em>List Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.ListStyleImpl
		 * @see kml.impl.KmlPackageImpl#getListStyle()
		 * @generated
		 */
		EClass LIST_STYLE = eINSTANCE.getListStyle();

		/**
		 * The meta object literal for the '<em><b>Bg Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_STYLE__BG_COLOR = eINSTANCE.getListStyle_BgColor();

		/**
		 * The meta object literal for the '<em><b>Item Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_STYLE__ITEM_TYPE = eINSTANCE.getListStyle_ItemType();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_STYLE__ITEMS = eINSTANCE.getListStyle_Items();

		/**
		 * The meta object literal for the '{@link kml.impl.ItemIconImpl <em>Item Icon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.ItemIconImpl
		 * @see kml.impl.KmlPackageImpl#getItemIcon()
		 * @generated
		 */
		EClass ITEM_ICON = eINSTANCE.getItemIcon();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_ICON__STATE = eINSTANCE.getItemIcon_State();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_ICON__HREF = eINSTANCE.getItemIcon_Href();

		/**
		 * The meta object literal for the '{@link kml.impl.AbstractStyleImpl <em>Abstract Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.AbstractStyleImpl
		 * @see kml.impl.KmlPackageImpl#getAbstractStyle()
		 * @generated
		 */
		EClass ABSTRACT_STYLE = eINSTANCE.getAbstractStyle();

		/**
		 * The meta object literal for the '{@link kml.AltitudeMode <em>Altitude Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.AltitudeMode
		 * @see kml.impl.KmlPackageImpl#getAltitudeMode()
		 * @generated
		 */
		EEnum ALTITUDE_MODE = eINSTANCE.getAltitudeMode();

		/**
		 * The meta object literal for the '{@link kml.RefreshMode <em>Refresh Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.RefreshMode
		 * @see kml.impl.KmlPackageImpl#getRefreshMode()
		 * @generated
		 */
		EEnum REFRESH_MODE = eINSTANCE.getRefreshMode();

		/**
		 * The meta object literal for the '{@link kml.ViewRefreshMode <em>View Refresh Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.ViewRefreshMode
		 * @see kml.impl.KmlPackageImpl#getViewRefreshMode()
		 * @generated
		 */
		EEnum VIEW_REFRESH_MODE = eINSTANCE.getViewRefreshMode();

		/**
		 * The meta object literal for the '{@link kml.Shape <em>Shape</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.Shape
		 * @see kml.impl.KmlPackageImpl#getShape()
		 * @generated
		 */
		EEnum SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '{@link kml.GridOrigin <em>Grid Origin</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.GridOrigin
		 * @see kml.impl.KmlPackageImpl#getGridOrigin()
		 * @generated
		 */
		EEnum GRID_ORIGIN = eINSTANCE.getGridOrigin();

		/**
		 * The meta object literal for the '{@link kml.Units <em>Units</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.Units
		 * @see kml.impl.KmlPackageImpl#getUnits()
		 * @generated
		 */
		EEnum UNITS = eINSTANCE.getUnits();

		/**
		 * The meta object literal for the '{@link kml.SchemaType <em>Schema Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.SchemaType
		 * @see kml.impl.KmlPackageImpl#getSchemaType()
		 * @generated
		 */
		EEnum SCHEMA_TYPE = eINSTANCE.getSchemaType();

		/**
		 * The meta object literal for the '{@link kml.ColorMode <em>Color Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.ColorMode
		 * @see kml.impl.KmlPackageImpl#getColorMode()
		 * @generated
		 */
		EEnum COLOR_MODE = eINSTANCE.getColorMode();

		/**
		 * The meta object literal for the '{@link kml.DisplayMode <em>Display Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.DisplayMode
		 * @see kml.impl.KmlPackageImpl#getDisplayMode()
		 * @generated
		 */
		EEnum DISPLAY_MODE = eINSTANCE.getDisplayMode();

		/**
		 * The meta object literal for the '{@link kml.StyleState <em>Style State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.StyleState
		 * @see kml.impl.KmlPackageImpl#getStyleState()
		 * @generated
		 */
		EEnum STYLE_STATE = eINSTANCE.getStyleState();

		/**
		 * The meta object literal for the '{@link kml.ListeItemType <em>Liste Item Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.ListeItemType
		 * @see kml.impl.KmlPackageImpl#getListeItemType()
		 * @generated
		 */
		EEnum LISTE_ITEM_TYPE = eINSTANCE.getListeItemType();

		/**
		 * The meta object literal for the '{@link kml.State <em>State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.State
		 * @see kml.impl.KmlPackageImpl#getState()
		 * @generated
		 */
		EEnum STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em>Color</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see kml.impl.KmlPackageImpl#getColor()
		 * @generated
		 */
		EDataType COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '<em>Angle90</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.KmlPackageImpl#getAngle90()
		 * @generated
		 */
		EDataType ANGLE90 = eINSTANCE.getAngle90();

		/**
		 * The meta object literal for the '<em>Angle180</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.KmlPackageImpl#getAngle180()
		 * @generated
		 */
		EDataType ANGLE180 = eINSTANCE.getAngle180();

		/**
		 * The meta object literal for the '<em>Angle360</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.KmlPackageImpl#getAngle360()
		 * @generated
		 */
		EDataType ANGLE360 = eINSTANCE.getAngle360();

		/**
		 * The meta object literal for the '<em>Angle Pos90</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.KmlPackageImpl#getAnglePos90()
		 * @generated
		 */
		EDataType ANGLE_POS90 = eINSTANCE.getAnglePos90();

		/**
		 * The meta object literal for the '<em>Angle Pos180</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kml.impl.KmlPackageImpl#getAnglePos180()
		 * @generated
		 */
		EDataType ANGLE_POS180 = eINSTANCE.getAnglePos180();

	}

} //KmlPackage
