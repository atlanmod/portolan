/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml.impl;

import atom.AtomPackage;

import atom.impl.AtomPackageImpl;

import kml.AbstractStyle;
import kml.AbstractView;
import kml.Alias;
import kml.AltitudeMode;
import kml.BalloonStyle;
import kml.Camera;
import kml.ColorMode;
import kml.ColorStyle;
import kml.Coordinate;
import kml.Data;
import kml.DisplayMode;
import kml.Document;
import kml.ExtendedData;
import kml.Feature;
import kml.Folder;
import kml.Geometry;
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
import kml.Overlay;
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
import kml.StyleSelector;
import kml.StyleState;
import kml.TimePrimitive;
import kml.TimeSpan;
import kml.TimeStamp;
import kml.Units;
import kml.Vec2Type;
import kml.ViewRefreshMode;
import kml.ViewVolume;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import xAL.XALPackage;

import xAL.impl.XALPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KmlPackageImpl extends EPackageImpl implements KmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timePrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeSpanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeStampEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cameraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lookAtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass latLonAltBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overlayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placemarkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iconEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groundOverlayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass latLonBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass photoOverlayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewVolumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagePyramidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screenOverlayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vec2TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass folderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geometryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linearRingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiGeometryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orientationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aliasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iconStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polyStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass balloonStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemIconEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum altitudeModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum refreshModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum viewRefreshModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum shapeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gridOriginEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum schemaTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum displayModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum styleStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum listeItemTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType angle90EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType angle180EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType angle360EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType anglePos90EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType anglePos180EDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see kml.KmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KmlPackageImpl() {
		super(eNS_URI, KmlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link KmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static KmlPackage init() {
		if (isInited) return (KmlPackage)EPackage.Registry.INSTANCE.getEPackage(KmlPackage.eNS_URI);

		// Obtain or create and register package
		KmlPackageImpl theKmlPackage = (KmlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KmlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KmlPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AtomPackageImpl theAtomPackage = (AtomPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AtomPackage.eNS_URI) instanceof AtomPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AtomPackage.eNS_URI) : AtomPackage.eINSTANCE);
		XALPackageImpl theXALPackage = (XALPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI) instanceof XALPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI) : XALPackage.eINSTANCE);

		// Create package meta-data objects
		theKmlPackage.createPackageContents();
		theAtomPackage.createPackageContents();
		theXALPackage.createPackageContents();

		// Initialize created meta-data
		theKmlPackage.initializePackageContents();
		theAtomPackage.initializePackageContents();
		theXALPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKmlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(KmlPackage.eNS_URI, theKmlPackage);
		return theKmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject() {
		return objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObject_Id() {
		return (EAttribute)objectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObject_TargetId() {
		return (EAttribute)objectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Name() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Visibility() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Open() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_AtomAuthor() {
		return (EReference)featureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_AtomLink() {
		return (EReference)featureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Address() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_PhoneNumber() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_XalAddressDetails() {
		return (EReference)featureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Snippet() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Description() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_AbstractView() {
		return (EReference)featureEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_TimePrimitive() {
		return (EReference)featureEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_StyleUrl() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_StyleSelectors() {
		return (EReference)featureEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_Region() {
		return (EReference)featureEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_ExtendedData() {
		return (EReference)featureEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractView() {
		return abstractViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractView_Longitude() {
		return (EAttribute)abstractViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractView_Latitude() {
		return (EAttribute)abstractViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractView_Altitude() {
		return (EAttribute)abstractViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractView_Heading() {
		return (EAttribute)abstractViewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractView_Mode() {
		return (EAttribute)abstractViewEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimePrimitive() {
		return timePrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeSpan() {
		return timeSpanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeStamp() {
		return timeStampEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCamera() {
		return cameraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCamera_Tilt() {
		return (EAttribute)cameraEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCamera_Roll() {
		return (EAttribute)cameraEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLookAt() {
		return lookAtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLookAt_Tilt() {
		return (EAttribute)lookAtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLookAt_Range() {
		return (EAttribute)lookAtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleSelector() {
		return styleSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyle() {
		return styleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyle_Styles() {
		return (EReference)styleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleMap() {
		return styleMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleMap_Pairs() {
		return (EReference)styleMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegion() {
		return regionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_LatLonAltBox() {
		return (EReference)regionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_Lod() {
		return (EReference)regionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLatLonAltBox() {
		return latLonAltBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatLonAltBox_MinAltitude() {
		return (EAttribute)latLonAltBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatLonAltBox_MaxAltitude() {
		return (EAttribute)latLonAltBoxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatLonAltBox_Mode() {
		return (EAttribute)latLonAltBoxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLod() {
		return lodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLod_MinLodPixels() {
		return (EAttribute)lodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLod_MaxLodPixels() {
		return (EAttribute)lodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLod_MinFadeExtent() {
		return (EAttribute)lodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLod_MaxFadeExtent() {
		return (EAttribute)lodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedData() {
		return extendedDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedData_Data() {
		return (EReference)extendedDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedData_SchemaData() {
		return (EReference)extendedDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedData_XmlContent() {
		return (EAttribute)extendedDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_Name() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_DisplayName() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_Value() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchemaData() {
		return schemaDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchemaData_SchemaUrl() {
		return (EAttribute)schemaDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchemaData_Simpledata() {
		return (EReference)schemaDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleData() {
		return simpleDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleData_Name() {
		return (EAttribute)simpleDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleData_Value() {
		return (EAttribute)simpleDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOverlay() {
		return overlayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOverlay_Color() {
		return (EAttribute)overlayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOverlay_DrawOrder() {
		return (EAttribute)overlayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOverlay_Icon() {
		return (EReference)overlayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_Features() {
		return (EReference)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlacemark() {
		return placemarkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlacemark_Geometry() {
		return (EReference)placemarkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkLink() {
		return networkLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkLink_RefreshVisibility() {
		return (EAttribute)networkLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkLink_FlyToView() {
		return (EAttribute)networkLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkLink_Link() {
		return (EReference)networkLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_UrlRef() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_RefreshMode() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_RefreshInterval() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_ViewRefreshMode() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_ViewRefreshTime() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_ViewBoundScale() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_ViewFormat() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_HttpQuery() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIcon() {
		return iconEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroundOverlay() {
		return groundOverlayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroundOverlay_Altitude() {
		return (EAttribute)groundOverlayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroundOverlay_Mode() {
		return (EAttribute)groundOverlayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroundOverlay_LatLonBox() {
		return (EReference)groundOverlayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLatLonBox() {
		return latLonBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatLonBox_North() {
		return (EAttribute)latLonBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatLonBox_South() {
		return (EAttribute)latLonBoxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatLonBox_East() {
		return (EAttribute)latLonBoxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatLonBox_West() {
		return (EAttribute)latLonBoxEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatLonBox_Rotation() {
		return (EAttribute)latLonBoxEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhotoOverlay() {
		return photoOverlayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhotoOverlay_Shape() {
		return (EAttribute)photoOverlayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhotoOverlay_ViewVolume() {
		return (EReference)photoOverlayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhotoOverlay_Roll() {
		return (EAttribute)photoOverlayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhotoOverlay_Point() {
		return (EReference)photoOverlayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhotoOverlay_ImagePyramid() {
		return (EReference)photoOverlayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewVolume() {
		return viewVolumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewVolume_LeftFov() {
		return (EAttribute)viewVolumeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewVolume_RightFov() {
		return (EAttribute)viewVolumeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewVolume_BottomFov() {
		return (EAttribute)viewVolumeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewVolume_TopFov() {
		return (EAttribute)viewVolumeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewVolume_Near() {
		return (EAttribute)viewVolumeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagePyramid() {
		return imagePyramidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePyramid_TileSize() {
		return (EAttribute)imagePyramidEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePyramid_MaxWidth() {
		return (EAttribute)imagePyramidEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePyramid_MaxHeight() {
		return (EAttribute)imagePyramidEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePyramid_GridOrigin() {
		return (EAttribute)imagePyramidEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoint() {
		return pointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_Extrude() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_Mode() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPoint_Coordinates() {
		return (EReference)pointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScreenOverlay() {
		return screenOverlayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScreenOverlay_OverlayXY() {
		return (EReference)screenOverlayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScreenOverlay_ScreenXY() {
		return (EReference)screenOverlayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScreenOverlay_Rotation() {
		return (EReference)screenOverlayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScreenOverlay_Size() {
		return (EReference)screenOverlayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVec2Type() {
		return vec2TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVec2Type_X() {
		return (EAttribute)vec2TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVec2Type_Y() {
		return (EAttribute)vec2TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVec2Type_Xunits() {
		return (EAttribute)vec2TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVec2Type_Yunits() {
		return (EAttribute)vec2TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFolder() {
		return folderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocument() {
		return documentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_Schemas() {
		return (EReference)documentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchema() {
		return schemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_Fields() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleField() {
		return simpleFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleField_Type() {
		return (EAttribute)simpleFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleField_Name() {
		return (EAttribute)simpleFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeometry() {
		return geometryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineString() {
		return lineStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineString_Extrude() {
		return (EAttribute)lineStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineString_Tessellate() {
		return (EAttribute)lineStringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineString_Mode() {
		return (EAttribute)lineStringEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineString_Coordinates() {
		return (EReference)lineStringEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinate() {
		return coordinateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinate_Lon() {
		return (EAttribute)coordinateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinate_Lat() {
		return (EAttribute)coordinateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinate_Alt() {
		return (EAttribute)coordinateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinearRing() {
		return linearRingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearRing_Extrude() {
		return (EAttribute)linearRingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearRing_Tessellate() {
		return (EAttribute)linearRingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearRing_Mode() {
		return (EAttribute)linearRingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinearRing_Coordinates() {
		return (EReference)linearRingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolygon() {
		return polygonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygon_Extrude() {
		return (EAttribute)polygonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygon_Tessellate() {
		return (EAttribute)polygonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygon_Mode() {
		return (EAttribute)polygonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolygon_InnerBoundaryIs() {
		return (EReference)polygonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolygon_OuterBoundaryIs() {
		return (EReference)polygonEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiGeometry() {
		return multiGeometryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiGeometry_Geometries() {
		return (EReference)multiGeometryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Mode() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Location() {
		return (EReference)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Orientation() {
		return (EReference)modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Scale() {
		return (EReference)modelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_ResourceMap() {
		return (EReference)modelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Link() {
		return (EReference)modelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Longitude() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Latitude() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Altitude() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrientation() {
		return orientationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrientation_Heading() {
		return (EAttribute)orientationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrientation_Tilt() {
		return (EAttribute)orientationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrientation_Roll() {
		return (EAttribute)orientationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScale() {
		return scaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScale_X() {
		return (EAttribute)scaleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScale_Y() {
		return (EAttribute)scaleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScale_Z() {
		return (EAttribute)scaleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceMap() {
		return resourceMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceMap_Aliases() {
		return (EReference)resourceMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlias() {
		return aliasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlias_TargetHref() {
		return (EAttribute)aliasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlias_SourceHref() {
		return (EAttribute)aliasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorStyle() {
		return colorStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorStyle_Color() {
		return (EAttribute)colorStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorStyle_Mode() {
		return (EAttribute)colorStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIconStyle() {
		return iconStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIconStyle_Scale() {
		return (EAttribute)iconStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIconStyle_Heading() {
		return (EAttribute)iconStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIconStyle_Icon() {
		return (EReference)iconStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIconStyle_HotSpot() {
		return (EReference)iconStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelStyle() {
		return labelStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelStyle_Scale() {
		return (EAttribute)labelStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineStyle() {
		return lineStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineStyle_Width() {
		return (EAttribute)lineStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolyStyle() {
		return polyStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolyStyle_Fill() {
		return (EAttribute)polyStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolyStyle_Outline() {
		return (EAttribute)polyStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBalloonStyle() {
		return balloonStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBalloonStyle_BgColor() {
		return (EAttribute)balloonStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBalloonStyle_TextColor() {
		return (EAttribute)balloonStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBalloonStyle_Text() {
		return (EAttribute)balloonStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBalloonStyle_Mode() {
		return (EAttribute)balloonStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPair() {
		return pairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPair_Id() {
		return (EAttribute)pairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPair_Key() {
		return (EAttribute)pairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPair_StyleUrl() {
		return (EAttribute)pairEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListStyle() {
		return listStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListStyle_BgColor() {
		return (EAttribute)listStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListStyle_ItemType() {
		return (EAttribute)listStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListStyle_Items() {
		return (EReference)listStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemIcon() {
		return itemIconEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemIcon_State() {
		return (EAttribute)itemIconEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemIcon_Href() {
		return (EAttribute)itemIconEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractStyle() {
		return abstractStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAltitudeMode() {
		return altitudeModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRefreshMode() {
		return refreshModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getViewRefreshMode() {
		return viewRefreshModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getShape() {
		return shapeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGridOrigin() {
		return gridOriginEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnits() {
		return unitsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSchemaType() {
		return schemaTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColorMode() {
		return colorModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDisplayMode() {
		return displayModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStyleState() {
		return styleStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getListeItemType() {
		return listeItemTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getState() {
		return stateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColor() {
		return colorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAngle90() {
		return angle90EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAngle180() {
		return angle180EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAngle360() {
		return angle360EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAnglePos90() {
		return anglePos90EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAnglePos180() {
		return anglePos180EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KmlFactory getKmlFactory() {
		return (KmlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		objectEClass = createEClass(OBJECT);
		createEAttribute(objectEClass, OBJECT__ID);
		createEAttribute(objectEClass, OBJECT__TARGET_ID);

		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__NAME);
		createEAttribute(featureEClass, FEATURE__VISIBILITY);
		createEAttribute(featureEClass, FEATURE__OPEN);
		createEReference(featureEClass, FEATURE__ATOM_AUTHOR);
		createEReference(featureEClass, FEATURE__ATOM_LINK);
		createEAttribute(featureEClass, FEATURE__ADDRESS);
		createEAttribute(featureEClass, FEATURE__PHONE_NUMBER);
		createEReference(featureEClass, FEATURE__XAL_ADDRESS_DETAILS);
		createEAttribute(featureEClass, FEATURE__SNIPPET);
		createEAttribute(featureEClass, FEATURE__DESCRIPTION);
		createEReference(featureEClass, FEATURE__ABSTRACT_VIEW);
		createEReference(featureEClass, FEATURE__TIME_PRIMITIVE);
		createEAttribute(featureEClass, FEATURE__STYLE_URL);
		createEReference(featureEClass, FEATURE__STYLE_SELECTORS);
		createEReference(featureEClass, FEATURE__REGION);
		createEReference(featureEClass, FEATURE__EXTENDED_DATA);

		abstractViewEClass = createEClass(ABSTRACT_VIEW);
		createEAttribute(abstractViewEClass, ABSTRACT_VIEW__LONGITUDE);
		createEAttribute(abstractViewEClass, ABSTRACT_VIEW__LATITUDE);
		createEAttribute(abstractViewEClass, ABSTRACT_VIEW__ALTITUDE);
		createEAttribute(abstractViewEClass, ABSTRACT_VIEW__HEADING);
		createEAttribute(abstractViewEClass, ABSTRACT_VIEW__MODE);

		timePrimitiveEClass = createEClass(TIME_PRIMITIVE);

		timeSpanEClass = createEClass(TIME_SPAN);

		timeStampEClass = createEClass(TIME_STAMP);

		cameraEClass = createEClass(CAMERA);
		createEAttribute(cameraEClass, CAMERA__TILT);
		createEAttribute(cameraEClass, CAMERA__ROLL);

		lookAtEClass = createEClass(LOOK_AT);
		createEAttribute(lookAtEClass, LOOK_AT__TILT);
		createEAttribute(lookAtEClass, LOOK_AT__RANGE);

		styleSelectorEClass = createEClass(STYLE_SELECTOR);

		styleEClass = createEClass(STYLE);
		createEReference(styleEClass, STYLE__STYLES);

		styleMapEClass = createEClass(STYLE_MAP);
		createEReference(styleMapEClass, STYLE_MAP__PAIRS);

		regionEClass = createEClass(REGION);
		createEReference(regionEClass, REGION__LAT_LON_ALT_BOX);
		createEReference(regionEClass, REGION__LOD);

		latLonAltBoxEClass = createEClass(LAT_LON_ALT_BOX);
		createEAttribute(latLonAltBoxEClass, LAT_LON_ALT_BOX__MIN_ALTITUDE);
		createEAttribute(latLonAltBoxEClass, LAT_LON_ALT_BOX__MAX_ALTITUDE);
		createEAttribute(latLonAltBoxEClass, LAT_LON_ALT_BOX__MODE);

		lodEClass = createEClass(LOD);
		createEAttribute(lodEClass, LOD__MIN_LOD_PIXELS);
		createEAttribute(lodEClass, LOD__MAX_LOD_PIXELS);
		createEAttribute(lodEClass, LOD__MIN_FADE_EXTENT);
		createEAttribute(lodEClass, LOD__MAX_FADE_EXTENT);

		extendedDataEClass = createEClass(EXTENDED_DATA);
		createEReference(extendedDataEClass, EXTENDED_DATA__DATA);
		createEReference(extendedDataEClass, EXTENDED_DATA__SCHEMA_DATA);
		createEAttribute(extendedDataEClass, EXTENDED_DATA__XML_CONTENT);

		dataEClass = createEClass(DATA);
		createEAttribute(dataEClass, DATA__NAME);
		createEAttribute(dataEClass, DATA__DISPLAY_NAME);
		createEAttribute(dataEClass, DATA__VALUE);

		schemaDataEClass = createEClass(SCHEMA_DATA);
		createEAttribute(schemaDataEClass, SCHEMA_DATA__SCHEMA_URL);
		createEReference(schemaDataEClass, SCHEMA_DATA__SIMPLEDATA);

		simpleDataEClass = createEClass(SIMPLE_DATA);
		createEAttribute(simpleDataEClass, SIMPLE_DATA__NAME);
		createEAttribute(simpleDataEClass, SIMPLE_DATA__VALUE);

		overlayEClass = createEClass(OVERLAY);
		createEAttribute(overlayEClass, OVERLAY__COLOR);
		createEAttribute(overlayEClass, OVERLAY__DRAW_ORDER);
		createEReference(overlayEClass, OVERLAY__ICON);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__FEATURES);

		placemarkEClass = createEClass(PLACEMARK);
		createEReference(placemarkEClass, PLACEMARK__GEOMETRY);

		networkLinkEClass = createEClass(NETWORK_LINK);
		createEAttribute(networkLinkEClass, NETWORK_LINK__REFRESH_VISIBILITY);
		createEAttribute(networkLinkEClass, NETWORK_LINK__FLY_TO_VIEW);
		createEReference(networkLinkEClass, NETWORK_LINK__LINK);

		linkEClass = createEClass(LINK);
		createEAttribute(linkEClass, LINK__URL_REF);
		createEAttribute(linkEClass, LINK__REFRESH_MODE);
		createEAttribute(linkEClass, LINK__REFRESH_INTERVAL);
		createEAttribute(linkEClass, LINK__VIEW_REFRESH_MODE);
		createEAttribute(linkEClass, LINK__VIEW_REFRESH_TIME);
		createEAttribute(linkEClass, LINK__VIEW_BOUND_SCALE);
		createEAttribute(linkEClass, LINK__VIEW_FORMAT);
		createEAttribute(linkEClass, LINK__HTTP_QUERY);

		iconEClass = createEClass(ICON);

		groundOverlayEClass = createEClass(GROUND_OVERLAY);
		createEAttribute(groundOverlayEClass, GROUND_OVERLAY__ALTITUDE);
		createEAttribute(groundOverlayEClass, GROUND_OVERLAY__MODE);
		createEReference(groundOverlayEClass, GROUND_OVERLAY__LAT_LON_BOX);

		latLonBoxEClass = createEClass(LAT_LON_BOX);
		createEAttribute(latLonBoxEClass, LAT_LON_BOX__NORTH);
		createEAttribute(latLonBoxEClass, LAT_LON_BOX__SOUTH);
		createEAttribute(latLonBoxEClass, LAT_LON_BOX__EAST);
		createEAttribute(latLonBoxEClass, LAT_LON_BOX__WEST);
		createEAttribute(latLonBoxEClass, LAT_LON_BOX__ROTATION);

		photoOverlayEClass = createEClass(PHOTO_OVERLAY);
		createEAttribute(photoOverlayEClass, PHOTO_OVERLAY__SHAPE);
		createEReference(photoOverlayEClass, PHOTO_OVERLAY__VIEW_VOLUME);
		createEAttribute(photoOverlayEClass, PHOTO_OVERLAY__ROLL);
		createEReference(photoOverlayEClass, PHOTO_OVERLAY__POINT);
		createEReference(photoOverlayEClass, PHOTO_OVERLAY__IMAGE_PYRAMID);

		viewVolumeEClass = createEClass(VIEW_VOLUME);
		createEAttribute(viewVolumeEClass, VIEW_VOLUME__LEFT_FOV);
		createEAttribute(viewVolumeEClass, VIEW_VOLUME__RIGHT_FOV);
		createEAttribute(viewVolumeEClass, VIEW_VOLUME__BOTTOM_FOV);
		createEAttribute(viewVolumeEClass, VIEW_VOLUME__TOP_FOV);
		createEAttribute(viewVolumeEClass, VIEW_VOLUME__NEAR);

		imagePyramidEClass = createEClass(IMAGE_PYRAMID);
		createEAttribute(imagePyramidEClass, IMAGE_PYRAMID__TILE_SIZE);
		createEAttribute(imagePyramidEClass, IMAGE_PYRAMID__MAX_WIDTH);
		createEAttribute(imagePyramidEClass, IMAGE_PYRAMID__MAX_HEIGHT);
		createEAttribute(imagePyramidEClass, IMAGE_PYRAMID__GRID_ORIGIN);

		pointEClass = createEClass(POINT);
		createEAttribute(pointEClass, POINT__EXTRUDE);
		createEAttribute(pointEClass, POINT__MODE);
		createEReference(pointEClass, POINT__COORDINATES);

		screenOverlayEClass = createEClass(SCREEN_OVERLAY);
		createEReference(screenOverlayEClass, SCREEN_OVERLAY__OVERLAY_XY);
		createEReference(screenOverlayEClass, SCREEN_OVERLAY__SCREEN_XY);
		createEReference(screenOverlayEClass, SCREEN_OVERLAY__ROTATION);
		createEReference(screenOverlayEClass, SCREEN_OVERLAY__SIZE);

		vec2TypeEClass = createEClass(VEC2_TYPE);
		createEAttribute(vec2TypeEClass, VEC2_TYPE__X);
		createEAttribute(vec2TypeEClass, VEC2_TYPE__Y);
		createEAttribute(vec2TypeEClass, VEC2_TYPE__XUNITS);
		createEAttribute(vec2TypeEClass, VEC2_TYPE__YUNITS);

		folderEClass = createEClass(FOLDER);

		documentEClass = createEClass(DOCUMENT);
		createEReference(documentEClass, DOCUMENT__SCHEMAS);

		schemaEClass = createEClass(SCHEMA);
		createEReference(schemaEClass, SCHEMA__FIELDS);

		simpleFieldEClass = createEClass(SIMPLE_FIELD);
		createEAttribute(simpleFieldEClass, SIMPLE_FIELD__TYPE);
		createEAttribute(simpleFieldEClass, SIMPLE_FIELD__NAME);

		geometryEClass = createEClass(GEOMETRY);

		lineStringEClass = createEClass(LINE_STRING);
		createEAttribute(lineStringEClass, LINE_STRING__EXTRUDE);
		createEAttribute(lineStringEClass, LINE_STRING__TESSELLATE);
		createEAttribute(lineStringEClass, LINE_STRING__MODE);
		createEReference(lineStringEClass, LINE_STRING__COORDINATES);

		coordinateEClass = createEClass(COORDINATE);
		createEAttribute(coordinateEClass, COORDINATE__LON);
		createEAttribute(coordinateEClass, COORDINATE__LAT);
		createEAttribute(coordinateEClass, COORDINATE__ALT);

		linearRingEClass = createEClass(LINEAR_RING);
		createEAttribute(linearRingEClass, LINEAR_RING__EXTRUDE);
		createEAttribute(linearRingEClass, LINEAR_RING__TESSELLATE);
		createEAttribute(linearRingEClass, LINEAR_RING__MODE);
		createEReference(linearRingEClass, LINEAR_RING__COORDINATES);

		polygonEClass = createEClass(POLYGON);
		createEAttribute(polygonEClass, POLYGON__EXTRUDE);
		createEAttribute(polygonEClass, POLYGON__TESSELLATE);
		createEAttribute(polygonEClass, POLYGON__MODE);
		createEReference(polygonEClass, POLYGON__INNER_BOUNDARY_IS);
		createEReference(polygonEClass, POLYGON__OUTER_BOUNDARY_IS);

		multiGeometryEClass = createEClass(MULTI_GEOMETRY);
		createEReference(multiGeometryEClass, MULTI_GEOMETRY__GEOMETRIES);

		modelEClass = createEClass(MODEL);
		createEAttribute(modelEClass, MODEL__MODE);
		createEReference(modelEClass, MODEL__LOCATION);
		createEReference(modelEClass, MODEL__ORIENTATION);
		createEReference(modelEClass, MODEL__SCALE);
		createEReference(modelEClass, MODEL__RESOURCE_MAP);
		createEReference(modelEClass, MODEL__LINK);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__LONGITUDE);
		createEAttribute(locationEClass, LOCATION__LATITUDE);
		createEAttribute(locationEClass, LOCATION__ALTITUDE);

		orientationEClass = createEClass(ORIENTATION);
		createEAttribute(orientationEClass, ORIENTATION__HEADING);
		createEAttribute(orientationEClass, ORIENTATION__TILT);
		createEAttribute(orientationEClass, ORIENTATION__ROLL);

		scaleEClass = createEClass(SCALE);
		createEAttribute(scaleEClass, SCALE__X);
		createEAttribute(scaleEClass, SCALE__Y);
		createEAttribute(scaleEClass, SCALE__Z);

		resourceMapEClass = createEClass(RESOURCE_MAP);
		createEReference(resourceMapEClass, RESOURCE_MAP__ALIASES);

		aliasEClass = createEClass(ALIAS);
		createEAttribute(aliasEClass, ALIAS__TARGET_HREF);
		createEAttribute(aliasEClass, ALIAS__SOURCE_HREF);

		colorStyleEClass = createEClass(COLOR_STYLE);
		createEAttribute(colorStyleEClass, COLOR_STYLE__COLOR);
		createEAttribute(colorStyleEClass, COLOR_STYLE__MODE);

		iconStyleEClass = createEClass(ICON_STYLE);
		createEAttribute(iconStyleEClass, ICON_STYLE__SCALE);
		createEAttribute(iconStyleEClass, ICON_STYLE__HEADING);
		createEReference(iconStyleEClass, ICON_STYLE__ICON);
		createEReference(iconStyleEClass, ICON_STYLE__HOT_SPOT);

		labelStyleEClass = createEClass(LABEL_STYLE);
		createEAttribute(labelStyleEClass, LABEL_STYLE__SCALE);

		lineStyleEClass = createEClass(LINE_STYLE);
		createEAttribute(lineStyleEClass, LINE_STYLE__WIDTH);

		polyStyleEClass = createEClass(POLY_STYLE);
		createEAttribute(polyStyleEClass, POLY_STYLE__FILL);
		createEAttribute(polyStyleEClass, POLY_STYLE__OUTLINE);

		balloonStyleEClass = createEClass(BALLOON_STYLE);
		createEAttribute(balloonStyleEClass, BALLOON_STYLE__BG_COLOR);
		createEAttribute(balloonStyleEClass, BALLOON_STYLE__TEXT_COLOR);
		createEAttribute(balloonStyleEClass, BALLOON_STYLE__TEXT);
		createEAttribute(balloonStyleEClass, BALLOON_STYLE__MODE);

		pairEClass = createEClass(PAIR);
		createEAttribute(pairEClass, PAIR__ID);
		createEAttribute(pairEClass, PAIR__KEY);
		createEAttribute(pairEClass, PAIR__STYLE_URL);

		listStyleEClass = createEClass(LIST_STYLE);
		createEAttribute(listStyleEClass, LIST_STYLE__BG_COLOR);
		createEAttribute(listStyleEClass, LIST_STYLE__ITEM_TYPE);
		createEReference(listStyleEClass, LIST_STYLE__ITEMS);

		itemIconEClass = createEClass(ITEM_ICON);
		createEAttribute(itemIconEClass, ITEM_ICON__STATE);
		createEAttribute(itemIconEClass, ITEM_ICON__HREF);

		abstractStyleEClass = createEClass(ABSTRACT_STYLE);

		// Create enums
		altitudeModeEEnum = createEEnum(ALTITUDE_MODE);
		refreshModeEEnum = createEEnum(REFRESH_MODE);
		viewRefreshModeEEnum = createEEnum(VIEW_REFRESH_MODE);
		shapeEEnum = createEEnum(SHAPE);
		gridOriginEEnum = createEEnum(GRID_ORIGIN);
		unitsEEnum = createEEnum(UNITS);
		schemaTypeEEnum = createEEnum(SCHEMA_TYPE);
		colorModeEEnum = createEEnum(COLOR_MODE);
		displayModeEEnum = createEEnum(DISPLAY_MODE);
		styleStateEEnum = createEEnum(STYLE_STATE);
		listeItemTypeEEnum = createEEnum(LISTE_ITEM_TYPE);
		stateEEnum = createEEnum(STATE);

		// Create data types
		colorEDataType = createEDataType(COLOR);
		angle90EDataType = createEDataType(ANGLE90);
		angle180EDataType = createEDataType(ANGLE180);
		angle360EDataType = createEDataType(ANGLE360);
		anglePos90EDataType = createEDataType(ANGLE_POS90);
		anglePos180EDataType = createEDataType(ANGLE_POS180);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AtomPackage theAtomPackage = (AtomPackage)EPackage.Registry.INSTANCE.getEPackage(AtomPackage.eNS_URI);
		XALPackage theXALPackage = (XALPackage)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		featureEClass.getESuperTypes().add(this.getObject());
		abstractViewEClass.getESuperTypes().add(this.getObject());
		timePrimitiveEClass.getESuperTypes().add(this.getObject());
		timeSpanEClass.getESuperTypes().add(this.getTimePrimitive());
		timeStampEClass.getESuperTypes().add(this.getTimePrimitive());
		cameraEClass.getESuperTypes().add(this.getAbstractView());
		lookAtEClass.getESuperTypes().add(this.getAbstractView());
		styleSelectorEClass.getESuperTypes().add(this.getObject());
		styleEClass.getESuperTypes().add(this.getStyleSelector());
		styleMapEClass.getESuperTypes().add(this.getStyleSelector());
		regionEClass.getESuperTypes().add(this.getObject());
		latLonAltBoxEClass.getESuperTypes().add(this.getLatLonBox());
		lodEClass.getESuperTypes().add(this.getObject());
		overlayEClass.getESuperTypes().add(this.getFeature());
		containerEClass.getESuperTypes().add(this.getFeature());
		placemarkEClass.getESuperTypes().add(this.getFeature());
		networkLinkEClass.getESuperTypes().add(this.getFeature());
		linkEClass.getESuperTypes().add(this.getObject());
		iconEClass.getESuperTypes().add(this.getLink());
		groundOverlayEClass.getESuperTypes().add(this.getOverlay());
		latLonBoxEClass.getESuperTypes().add(this.getObject());
		photoOverlayEClass.getESuperTypes().add(this.getOverlay());
		pointEClass.getESuperTypes().add(this.getGeometry());
		screenOverlayEClass.getESuperTypes().add(this.getOverlay());
		folderEClass.getESuperTypes().add(this.getContainer());
		documentEClass.getESuperTypes().add(this.getContainer());
		schemaEClass.getESuperTypes().add(this.getObject());
		geometryEClass.getESuperTypes().add(this.getObject());
		lineStringEClass.getESuperTypes().add(this.getGeometry());
		linearRingEClass.getESuperTypes().add(this.getGeometry());
		polygonEClass.getESuperTypes().add(this.getGeometry());
		multiGeometryEClass.getESuperTypes().add(this.getGeometry());
		modelEClass.getESuperTypes().add(this.getGeometry());
		locationEClass.getESuperTypes().add(this.getObject());
		orientationEClass.getESuperTypes().add(this.getObject());
		scaleEClass.getESuperTypes().add(this.getObject());
		colorStyleEClass.getESuperTypes().add(this.getAbstractStyle());
		iconStyleEClass.getESuperTypes().add(this.getColorStyle());
		labelStyleEClass.getESuperTypes().add(this.getColorStyle());
		lineStyleEClass.getESuperTypes().add(this.getColorStyle());
		polyStyleEClass.getESuperTypes().add(this.getColorStyle());
		balloonStyleEClass.getESuperTypes().add(this.getAbstractStyle());
		listStyleEClass.getESuperTypes().add(this.getAbstractStyle());
		abstractStyleEClass.getESuperTypes().add(this.getObject());

		// Initialize classes and features; add operations and parameters
		initEClass(objectEClass, kml.Object.class, "Object", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObject_Id(), ecorePackage.getEString(), "id", null, 0, 1, kml.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObject_TargetId(), ecorePackage.getEString(), "targetId", null, 0, 1, kml.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Visibility(), ecorePackage.getEBoolean(), "visibility", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Open(), ecorePackage.getEBoolean(), "open", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_AtomAuthor(), theAtomPackage.getAuthor(), null, "atomAuthor", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_AtomLink(), theAtomPackage.getLink(), null, "atomLink", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Address(), ecorePackage.getEString(), "address", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_PhoneNumber(), ecorePackage.getEString(), "phoneNumber", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_XalAddressDetails(), theXALPackage.getAddressDetails(), null, "xalAddressDetails", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Snippet(), ecorePackage.getEString(), "snippet", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Description(), ecorePackage.getEString(), "description", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_AbstractView(), this.getAbstractView(), null, "abstractView", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_TimePrimitive(), this.getTimePrimitive(), null, "timePrimitive", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_StyleUrl(), ecorePackage.getEString(), "styleUrl", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_StyleSelectors(), this.getStyleSelector(), null, "styleSelectors", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_Region(), this.getRegion(), null, "region", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_ExtendedData(), this.getExtendedData(), null, "extendedData", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractViewEClass, AbstractView.class, "AbstractView", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractView_Longitude(), this.getAngle180(), "longitude", null, 0, 1, AbstractView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractView_Latitude(), this.getAngle90(), "latitude", null, 0, 1, AbstractView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractView_Altitude(), ecorePackage.getEDouble(), "altitude", null, 0, 1, AbstractView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractView_Heading(), this.getAngle360(), "heading", null, 0, 1, AbstractView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractView_Mode(), this.getAltitudeMode(), "mode", null, 0, 1, AbstractView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timePrimitiveEClass, TimePrimitive.class, "TimePrimitive", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeSpanEClass, TimeSpan.class, "TimeSpan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeStampEClass, TimeStamp.class, "TimeStamp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cameraEClass, Camera.class, "Camera", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCamera_Tilt(), this.getAnglePos180(), "tilt", null, 0, 1, Camera.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamera_Roll(), this.getAngle180(), "roll", null, 0, 1, Camera.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lookAtEClass, LookAt.class, "LookAt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLookAt_Tilt(), this.getAnglePos90(), "tilt", null, 0, 1, LookAt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLookAt_Range(), ecorePackage.getEDouble(), "range", null, 0, 1, LookAt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styleSelectorEClass, StyleSelector.class, "StyleSelector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(styleEClass, Style.class, "Style", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStyle_Styles(), this.getAbstractStyle(), null, "styles", null, 0, -1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styleMapEClass, StyleMap.class, "StyleMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStyleMap_Pairs(), this.getPair(), null, "pairs", null, 2, 2, StyleMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regionEClass, Region.class, "Region", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegion_LatLonAltBox(), this.getLatLonAltBox(), null, "latLonAltBox", null, 0, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegion_Lod(), this.getLod(), null, "lod", null, 0, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(latLonAltBoxEClass, LatLonAltBox.class, "LatLonAltBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLatLonAltBox_MinAltitude(), ecorePackage.getEDouble(), "minAltitude", null, 0, 1, LatLonAltBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLatLonAltBox_MaxAltitude(), ecorePackage.getEDouble(), "maxAltitude", null, 0, 1, LatLonAltBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLatLonAltBox_Mode(), this.getAltitudeMode(), "mode", null, 0, 1, LatLonAltBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lodEClass, Lod.class, "Lod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLod_MinLodPixels(), ecorePackage.getEDouble(), "minLodPixels", null, 0, 1, Lod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLod_MaxLodPixels(), ecorePackage.getEDouble(), "maxLodPixels", null, 0, 1, Lod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLod_MinFadeExtent(), ecorePackage.getEDouble(), "minFadeExtent", null, 0, 1, Lod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLod_MaxFadeExtent(), ecorePackage.getEDouble(), "maxFadeExtent", null, 0, 1, Lod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extendedDataEClass, ExtendedData.class, "ExtendedData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtendedData_Data(), this.getData(), null, "data", null, 0, -1, ExtendedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedData_SchemaData(), this.getSchemaData(), null, "schemaData", null, 0, -1, ExtendedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtendedData_XmlContent(), ecorePackage.getEString(), "xmlContent", null, 0, 1, ExtendedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getData_Name(), ecorePackage.getEString(), "name", null, 1, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getData_DisplayName(), ecorePackage.getEString(), "displayName", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getData_Value(), ecorePackage.getEString(), "value", null, 1, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schemaDataEClass, SchemaData.class, "SchemaData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchemaData_SchemaUrl(), ecorePackage.getEString(), "schemaUrl", null, 1, 1, SchemaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchemaData_Simpledata(), this.getSimpleData(), null, "simpledata", null, 0, 1, SchemaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleDataEClass, SimpleData.class, "SimpleData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleData_Name(), ecorePackage.getEString(), "name", null, 1, 1, SimpleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleData_Value(), ecorePackage.getEString(), "value", null, 1, 1, SimpleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(overlayEClass, Overlay.class, "Overlay", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOverlay_Color(), this.getColor(), "color", null, 0, 1, Overlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOverlay_DrawOrder(), ecorePackage.getEInt(), "drawOrder", null, 0, 1, Overlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOverlay_Icon(), this.getIcon(), null, "icon", null, 0, 1, Overlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, kml.Container.class, "Container", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Features(), this.getFeature(), null, "features", null, 0, -1, kml.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placemarkEClass, Placemark.class, "Placemark", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlacemark_Geometry(), this.getGeometry(), null, "geometry", null, 0, 1, Placemark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkLinkEClass, NetworkLink.class, "NetworkLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkLink_RefreshVisibility(), ecorePackage.getEBoolean(), "refreshVisibility", null, 0, 1, NetworkLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkLink_FlyToView(), ecorePackage.getEBoolean(), "flyToView", null, 0, 1, NetworkLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkLink_Link(), this.getLink(), null, "link", null, 0, 1, NetworkLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink_UrlRef(), ecorePackage.getEString(), "urlRef", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_RefreshMode(), this.getRefreshMode(), "refreshMode", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_RefreshInterval(), ecorePackage.getEDouble(), "refreshInterval", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_ViewRefreshMode(), this.getViewRefreshMode(), "viewRefreshMode", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_ViewRefreshTime(), ecorePackage.getEDouble(), "viewRefreshTime", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_ViewBoundScale(), ecorePackage.getEDouble(), "viewBoundScale", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_ViewFormat(), ecorePackage.getEString(), "viewFormat", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_HttpQuery(), ecorePackage.getEString(), "httpQuery", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iconEClass, Icon.class, "Icon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(groundOverlayEClass, GroundOverlay.class, "GroundOverlay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroundOverlay_Altitude(), ecorePackage.getEDouble(), "altitude", null, 0, 1, GroundOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroundOverlay_Mode(), this.getAltitudeMode(), "mode", null, 0, 1, GroundOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroundOverlay_LatLonBox(), this.getLatLonBox(), null, "latLonBox", null, 0, 1, GroundOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(latLonBoxEClass, LatLonBox.class, "LatLonBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLatLonBox_North(), this.getAngle90(), "north", null, 0, 1, LatLonBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLatLonBox_South(), this.getAngle90(), "south", null, 0, 1, LatLonBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLatLonBox_East(), this.getAngle180(), "east", null, 0, 1, LatLonBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLatLonBox_West(), this.getAngle180(), "west", null, 0, 1, LatLonBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLatLonBox_Rotation(), this.getAngle180(), "rotation", null, 0, 1, LatLonBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(photoOverlayEClass, PhotoOverlay.class, "PhotoOverlay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhotoOverlay_Shape(), this.getShape(), "shape", null, 0, 1, PhotoOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhotoOverlay_ViewVolume(), this.getViewVolume(), null, "viewVolume", null, 0, 1, PhotoOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhotoOverlay_Roll(), this.getAngle180(), "roll", null, 0, 1, PhotoOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhotoOverlay_Point(), this.getPoint(), null, "point", null, 0, 1, PhotoOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhotoOverlay_ImagePyramid(), this.getImagePyramid(), null, "imagePyramid", null, 0, 1, PhotoOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewVolumeEClass, ViewVolume.class, "ViewVolume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewVolume_LeftFov(), this.getAngle180(), "leftFov", null, 0, 1, ViewVolume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewVolume_RightFov(), this.getAngle180(), "rightFov", null, 0, 1, ViewVolume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewVolume_BottomFov(), this.getAngle90(), "bottomFov", null, 0, 1, ViewVolume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewVolume_TopFov(), this.getAngle90(), "topFov", null, 0, 1, ViewVolume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewVolume_Near(), ecorePackage.getEDouble(), "near", null, 0, 1, ViewVolume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imagePyramidEClass, ImagePyramid.class, "ImagePyramid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImagePyramid_TileSize(), ecorePackage.getEInt(), "tileSize", null, 0, 1, ImagePyramid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImagePyramid_MaxWidth(), ecorePackage.getEInt(), "maxWidth", null, 0, 1, ImagePyramid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImagePyramid_MaxHeight(), ecorePackage.getEInt(), "maxHeight", null, 0, 1, ImagePyramid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImagePyramid_GridOrigin(), this.getGridOrigin(), "gridOrigin", null, 0, 1, ImagePyramid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoint_Extrude(), ecorePackage.getEBoolean(), "extrude", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoint_Mode(), this.getAltitudeMode(), "mode", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPoint_Coordinates(), this.getCoordinate(), null, "coordinates", null, 1, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(screenOverlayEClass, ScreenOverlay.class, "ScreenOverlay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScreenOverlay_OverlayXY(), this.getVec2Type(), null, "overlayXY", null, 0, 1, ScreenOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScreenOverlay_ScreenXY(), this.getVec2Type(), null, "screenXY", null, 0, 1, ScreenOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScreenOverlay_Rotation(), this.getVec2Type(), null, "rotation", null, 0, 1, ScreenOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScreenOverlay_Size(), this.getVec2Type(), null, "size", null, 0, 1, ScreenOverlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vec2TypeEClass, Vec2Type.class, "Vec2Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVec2Type_X(), ecorePackage.getEDouble(), "x", null, 1, 1, Vec2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVec2Type_Y(), ecorePackage.getEDouble(), "y", null, 1, 1, Vec2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVec2Type_Xunits(), this.getUnits(), "xunits", null, 0, 1, Vec2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVec2Type_Yunits(), this.getUnits(), "yunits", null, 0, 1, Vec2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(folderEClass, Folder.class, "Folder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocument_Schemas(), this.getSchema(), null, "schemas", null, 0, -1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schemaEClass, Schema.class, "Schema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchema_Fields(), this.getSimpleField(), null, "fields", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleFieldEClass, SimpleField.class, "SimpleField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleField_Type(), this.getSchemaType(), "type", null, 1, 1, SimpleField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleField_Name(), ecorePackage.getEString(), "name", null, 1, 1, SimpleField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geometryEClass, Geometry.class, "Geometry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lineStringEClass, LineString.class, "LineString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLineString_Extrude(), ecorePackage.getEBoolean(), "extrude", null, 0, 1, LineString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineString_Tessellate(), ecorePackage.getEBoolean(), "tessellate", null, 0, 1, LineString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineString_Mode(), this.getAltitudeMode(), "mode", null, 0, 1, LineString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLineString_Coordinates(), this.getCoordinate(), null, "coordinates", null, 2, -1, LineString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coordinateEClass, Coordinate.class, "Coordinate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoordinate_Lon(), ecorePackage.getEDouble(), "lon", null, 1, 1, Coordinate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoordinate_Lat(), ecorePackage.getEDouble(), "lat", null, 1, 1, Coordinate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoordinate_Alt(), ecorePackage.getEDouble(), "alt", null, 0, 1, Coordinate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linearRingEClass, LinearRing.class, "LinearRing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinearRing_Extrude(), ecorePackage.getEBoolean(), "extrude", null, 0, 1, LinearRing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearRing_Tessellate(), ecorePackage.getEBoolean(), "tessellate", null, 0, 1, LinearRing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearRing_Mode(), this.getAltitudeMode(), "mode", null, 0, 1, LinearRing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinearRing_Coordinates(), this.getCoordinate(), null, "coordinates", null, 4, -1, LinearRing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(polygonEClass, Polygon.class, "Polygon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolygon_Extrude(), ecorePackage.getEBoolean(), "extrude", null, 0, 1, Polygon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolygon_Tessellate(), ecorePackage.getEBoolean(), "tessellate", null, 0, 1, Polygon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolygon_Mode(), this.getAltitudeMode(), "mode", null, 0, 1, Polygon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolygon_InnerBoundaryIs(), this.getLinearRing(), null, "innerBoundaryIs", null, 0, 1, Polygon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolygon_OuterBoundaryIs(), this.getLinearRing(), null, "outerBoundaryIs", null, 0, 1, Polygon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiGeometryEClass, MultiGeometry.class, "MultiGeometry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiGeometry_Geometries(), this.getGeometry(), null, "geometries", null, 0, -1, MultiGeometry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel_Mode(), this.getAltitudeMode(), "mode", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Location(), this.getLocation(), null, "location", null, 1, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Orientation(), this.getOrientation(), null, "orientation", null, 1, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Scale(), this.getScale(), null, "scale", null, 1, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_ResourceMap(), this.getResourceMap(), null, "resourceMap", null, 1, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Link(), this.getLink(), null, "link", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_Longitude(), this.getAngle180(), "longitude", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Latitude(), this.getAngle180(), "latitude", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Altitude(), ecorePackage.getEDouble(), "altitude", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orientationEClass, Orientation.class, "Orientation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrientation_Heading(), this.getAngle360(), "heading", null, 1, 1, Orientation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrientation_Tilt(), this.getAngle360(), "tilt", null, 1, 1, Orientation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrientation_Roll(), this.getAngle360(), "roll", null, 1, 1, Orientation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scaleEClass, Scale.class, "Scale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScale_X(), ecorePackage.getEDouble(), "x", null, 1, 1, Scale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScale_Y(), ecorePackage.getEDouble(), "y", null, 1, 1, Scale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScale_Z(), ecorePackage.getEDouble(), "z", null, 1, 1, Scale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceMapEClass, ResourceMap.class, "ResourceMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceMap_Aliases(), this.getAlias(), null, "aliases", null, 0, -1, ResourceMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aliasEClass, Alias.class, "Alias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlias_TargetHref(), ecorePackage.getEString(), "targetHref", null, 1, 1, Alias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlias_SourceHref(), ecorePackage.getEString(), "sourceHref", null, 1, 1, Alias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colorStyleEClass, ColorStyle.class, "ColorStyle", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColorStyle_Color(), this.getColor(), "color", null, 0, 1, ColorStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColorStyle_Mode(), this.getColorMode(), "mode", null, 0, 1, ColorStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iconStyleEClass, IconStyle.class, "IconStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIconStyle_Scale(), ecorePackage.getEDouble(), "scale", null, 0, 1, IconStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIconStyle_Heading(), ecorePackage.getEDouble(), "heading", null, 0, 1, IconStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIconStyle_Icon(), this.getIcon(), null, "icon", null, 0, 1, IconStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIconStyle_HotSpot(), this.getVec2Type(), null, "hotSpot", null, 0, 1, IconStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelStyleEClass, LabelStyle.class, "LabelStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabelStyle_Scale(), ecorePackage.getEDouble(), "scale", null, 0, 1, LabelStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineStyleEClass, LineStyle.class, "LineStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLineStyle_Width(), ecorePackage.getEDouble(), "width", null, 0, 1, LineStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(polyStyleEClass, PolyStyle.class, "PolyStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolyStyle_Fill(), ecorePackage.getEBoolean(), "fill", null, 0, 1, PolyStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolyStyle_Outline(), ecorePackage.getEBoolean(), "outline", null, 0, 1, PolyStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(balloonStyleEClass, BalloonStyle.class, "BalloonStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBalloonStyle_BgColor(), this.getColor(), "bgColor", null, 0, 1, BalloonStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBalloonStyle_TextColor(), this.getColor(), "textColor", null, 0, 1, BalloonStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBalloonStyle_Text(), ecorePackage.getEString(), "text", null, 0, 1, BalloonStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBalloonStyle_Mode(), this.getDisplayMode(), "mode", null, 0, 1, BalloonStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pairEClass, Pair.class, "Pair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPair_Id(), ecorePackage.getEString(), "id", null, 0, 1, Pair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPair_Key(), this.getStyleState(), "key", null, 0, 1, Pair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPair_StyleUrl(), ecorePackage.getEString(), "styleUrl", null, 0, 1, Pair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listStyleEClass, ListStyle.class, "ListStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListStyle_BgColor(), this.getColor(), "bgColor", null, 0, 1, ListStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListStyle_ItemType(), this.getListeItemType(), "itemType", null, 0, 1, ListStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListStyle_Items(), this.getItemIcon(), null, "items", null, 0, -1, ListStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemIconEClass, ItemIcon.class, "ItemIcon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItemIcon_State(), this.getState(), "state", null, 0, 1, ItemIcon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemIcon_Href(), ecorePackage.getEString(), "href", null, 0, 1, ItemIcon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractStyleEClass, AbstractStyle.class, "AbstractStyle", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(altitudeModeEEnum, AltitudeMode.class, "AltitudeMode");
		addEEnumLiteral(altitudeModeEEnum, AltitudeMode.CLAMP_TO_GROUND);
		addEEnumLiteral(altitudeModeEEnum, AltitudeMode.RELATIVE_TO_GROUND);
		addEEnumLiteral(altitudeModeEEnum, AltitudeMode.ABSOLUTE);

		initEEnum(refreshModeEEnum, RefreshMode.class, "RefreshMode");
		addEEnumLiteral(refreshModeEEnum, RefreshMode.ON_CHANGE);
		addEEnumLiteral(refreshModeEEnum, RefreshMode.ON_INTERVAL);
		addEEnumLiteral(refreshModeEEnum, RefreshMode.ON_EXPIRE);

		initEEnum(viewRefreshModeEEnum, ViewRefreshMode.class, "ViewRefreshMode");
		addEEnumLiteral(viewRefreshModeEEnum, ViewRefreshMode.NEVER);
		addEEnumLiteral(viewRefreshModeEEnum, ViewRefreshMode.ON_STOP);
		addEEnumLiteral(viewRefreshModeEEnum, ViewRefreshMode.ON_REQUEST);
		addEEnumLiteral(viewRefreshModeEEnum, ViewRefreshMode.ON_REGION);

		initEEnum(shapeEEnum, Shape.class, "Shape");
		addEEnumLiteral(shapeEEnum, Shape.CYLINDER);
		addEEnumLiteral(shapeEEnum, Shape.RECTANGLE);
		addEEnumLiteral(shapeEEnum, Shape.SPHERE);

		initEEnum(gridOriginEEnum, GridOrigin.class, "GridOrigin");
		addEEnumLiteral(gridOriginEEnum, GridOrigin.LOWER_LEFT);
		addEEnumLiteral(gridOriginEEnum, GridOrigin.UPPER_LEFT);

		initEEnum(unitsEEnum, Units.class, "Units");
		addEEnumLiteral(unitsEEnum, Units.FRACTION);
		addEEnumLiteral(unitsEEnum, Units.PIXELS);
		addEEnumLiteral(unitsEEnum, Units.INSET_PIXELS);

		initEEnum(schemaTypeEEnum, SchemaType.class, "SchemaType");
		addEEnumLiteral(schemaTypeEEnum, SchemaType.STRING);
		addEEnumLiteral(schemaTypeEEnum, SchemaType.INT);
		addEEnumLiteral(schemaTypeEEnum, SchemaType.UINT);
		addEEnumLiteral(schemaTypeEEnum, SchemaType.SHORT);
		addEEnumLiteral(schemaTypeEEnum, SchemaType.USHORT);
		addEEnumLiteral(schemaTypeEEnum, SchemaType.FLOAT);
		addEEnumLiteral(schemaTypeEEnum, SchemaType.DOUBLE);
		addEEnumLiteral(schemaTypeEEnum, SchemaType.BOOL);

		initEEnum(colorModeEEnum, ColorMode.class, "ColorMode");
		addEEnumLiteral(colorModeEEnum, ColorMode.NORMAL);
		addEEnumLiteral(colorModeEEnum, ColorMode.RANDOM);

		initEEnum(displayModeEEnum, DisplayMode.class, "DisplayMode");
		addEEnumLiteral(displayModeEEnum, DisplayMode.DEFAULT);
		addEEnumLiteral(displayModeEEnum, DisplayMode.HIDE);

		initEEnum(styleStateEEnum, StyleState.class, "StyleState");
		addEEnumLiteral(styleStateEEnum, StyleState.NORMAL);
		addEEnumLiteral(styleStateEEnum, StyleState.HIGHLIGHT);

		initEEnum(listeItemTypeEEnum, ListeItemType.class, "ListeItemType");
		addEEnumLiteral(listeItemTypeEEnum, ListeItemType.CHECK);
		addEEnumLiteral(listeItemTypeEEnum, ListeItemType.CHECK_OFF_ONLY);
		addEEnumLiteral(listeItemTypeEEnum, ListeItemType.CHECK_HIDE_CHILDREN);
		addEEnumLiteral(listeItemTypeEEnum, ListeItemType.RADIO_FOLDER);

		initEEnum(stateEEnum, State.class, "State");
		addEEnumLiteral(stateEEnum, State.OPEN);
		addEEnumLiteral(stateEEnum, State.CLOSE);
		addEEnumLiteral(stateEEnum, State.ERROR);
		addEEnumLiteral(stateEEnum, State.FETCHING0);
		addEEnumLiteral(stateEEnum, State.FETCHING1);
		addEEnumLiteral(stateEEnum, State.FETCHING2);

		// Initialize data types
		initEDataType(colorEDataType, String.class, "Color", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(angle90EDataType, double.class, "Angle90", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(angle180EDataType, double.class, "Angle180", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(angle360EDataType, double.class, "Angle360", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(anglePos90EDataType, double.class, "AnglePos90", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(anglePos180EDataType, double.class, "AnglePos180", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //KmlPackageImpl
