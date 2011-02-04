/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml.impl;

import kml.KmlPackage;
import kml.LatLonBox;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lat Lon Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kml.impl.LatLonBoxImpl#getNorth <em>North</em>}</li>
 *   <li>{@link kml.impl.LatLonBoxImpl#getSouth <em>South</em>}</li>
 *   <li>{@link kml.impl.LatLonBoxImpl#getEast <em>East</em>}</li>
 *   <li>{@link kml.impl.LatLonBoxImpl#getWest <em>West</em>}</li>
 *   <li>{@link kml.impl.LatLonBoxImpl#getRotation <em>Rotation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LatLonBoxImpl extends ObjectImpl implements LatLonBox {
	/**
	 * The default value of the '{@link #getNorth() <em>North</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNorth()
	 * @generated
	 * @ordered
	 */
	protected static final double NORTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNorth() <em>North</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNorth()
	 * @generated
	 * @ordered
	 */
	protected double north = NORTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSouth() <em>South</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSouth()
	 * @generated
	 * @ordered
	 */
	protected static final double SOUTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSouth() <em>South</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSouth()
	 * @generated
	 * @ordered
	 */
	protected double south = SOUTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getEast() <em>East</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEast()
	 * @generated
	 * @ordered
	 */
	protected static final double EAST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEast() <em>East</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEast()
	 * @generated
	 * @ordered
	 */
	protected double east = EAST_EDEFAULT;

	/**
	 * The default value of the '{@link #getWest() <em>West</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWest()
	 * @generated
	 * @ordered
	 */
	protected static final double WEST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWest() <em>West</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWest()
	 * @generated
	 * @ordered
	 */
	protected double west = WEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected static final double ROTATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected double rotation = ROTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LatLonBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmlPackage.Literals.LAT_LON_BOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNorth() {
		return north;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNorth(double newNorth) {
		double oldNorth = north;
		north = newNorth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.LAT_LON_BOX__NORTH, oldNorth, north));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSouth() {
		return south;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSouth(double newSouth) {
		double oldSouth = south;
		south = newSouth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.LAT_LON_BOX__SOUTH, oldSouth, south));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEast() {
		return east;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEast(double newEast) {
		double oldEast = east;
		east = newEast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.LAT_LON_BOX__EAST, oldEast, east));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWest() {
		return west;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWest(double newWest) {
		double oldWest = west;
		west = newWest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.LAT_LON_BOX__WEST, oldWest, west));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotation(double newRotation) {
		double oldRotation = rotation;
		rotation = newRotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.LAT_LON_BOX__ROTATION, oldRotation, rotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KmlPackage.LAT_LON_BOX__NORTH:
				return getNorth();
			case KmlPackage.LAT_LON_BOX__SOUTH:
				return getSouth();
			case KmlPackage.LAT_LON_BOX__EAST:
				return getEast();
			case KmlPackage.LAT_LON_BOX__WEST:
				return getWest();
			case KmlPackage.LAT_LON_BOX__ROTATION:
				return getRotation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KmlPackage.LAT_LON_BOX__NORTH:
				setNorth((Double)newValue);
				return;
			case KmlPackage.LAT_LON_BOX__SOUTH:
				setSouth((Double)newValue);
				return;
			case KmlPackage.LAT_LON_BOX__EAST:
				setEast((Double)newValue);
				return;
			case KmlPackage.LAT_LON_BOX__WEST:
				setWest((Double)newValue);
				return;
			case KmlPackage.LAT_LON_BOX__ROTATION:
				setRotation((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case KmlPackage.LAT_LON_BOX__NORTH:
				setNorth(NORTH_EDEFAULT);
				return;
			case KmlPackage.LAT_LON_BOX__SOUTH:
				setSouth(SOUTH_EDEFAULT);
				return;
			case KmlPackage.LAT_LON_BOX__EAST:
				setEast(EAST_EDEFAULT);
				return;
			case KmlPackage.LAT_LON_BOX__WEST:
				setWest(WEST_EDEFAULT);
				return;
			case KmlPackage.LAT_LON_BOX__ROTATION:
				setRotation(ROTATION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case KmlPackage.LAT_LON_BOX__NORTH:
				return north != NORTH_EDEFAULT;
			case KmlPackage.LAT_LON_BOX__SOUTH:
				return south != SOUTH_EDEFAULT;
			case KmlPackage.LAT_LON_BOX__EAST:
				return east != EAST_EDEFAULT;
			case KmlPackage.LAT_LON_BOX__WEST:
				return west != WEST_EDEFAULT;
			case KmlPackage.LAT_LON_BOX__ROTATION:
				return rotation != ROTATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (north: ");
		result.append(north);
		result.append(", south: ");
		result.append(south);
		result.append(", east: ");
		result.append(east);
		result.append(", west: ");
		result.append(west);
		result.append(", rotation: ");
		result.append(rotation);
		result.append(')');
		return result.toString();
	}

} //LatLonBoxImpl
