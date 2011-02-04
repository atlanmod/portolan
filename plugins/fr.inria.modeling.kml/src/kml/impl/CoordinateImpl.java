/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml.impl;

import kml.Coordinate;
import kml.KmlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordinate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kml.impl.CoordinateImpl#getLon <em>Lon</em>}</li>
 *   <li>{@link kml.impl.CoordinateImpl#getLat <em>Lat</em>}</li>
 *   <li>{@link kml.impl.CoordinateImpl#getAlt <em>Alt</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoordinateImpl extends EObjectImpl implements Coordinate {
	/**
	 * The default value of the '{@link #getLon() <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLon()
	 * @generated
	 * @ordered
	 */
	protected static final double LON_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLon() <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLon()
	 * @generated
	 * @ordered
	 */
	protected double lon = LON_EDEFAULT;

	/**
	 * The default value of the '{@link #getLat() <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLat()
	 * @generated
	 * @ordered
	 */
	protected static final double LAT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLat() <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLat()
	 * @generated
	 * @ordered
	 */
	protected double lat = LAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlt() <em>Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlt()
	 * @generated
	 * @ordered
	 */
	protected static final double ALT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAlt() <em>Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlt()
	 * @generated
	 * @ordered
	 */
	protected double alt = ALT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmlPackage.Literals.COORDINATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLon() {
		return lon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLon(double newLon) {
		double oldLon = lon;
		lon = newLon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.COORDINATE__LON, oldLon, lon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLat() {
		return lat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLat(double newLat) {
		double oldLat = lat;
		lat = newLat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.COORDINATE__LAT, oldLat, lat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAlt() {
		return alt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlt(double newAlt) {
		double oldAlt = alt;
		alt = newAlt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.COORDINATE__ALT, oldAlt, alt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KmlPackage.COORDINATE__LON:
				return getLon();
			case KmlPackage.COORDINATE__LAT:
				return getLat();
			case KmlPackage.COORDINATE__ALT:
				return getAlt();
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
			case KmlPackage.COORDINATE__LON:
				setLon((Double)newValue);
				return;
			case KmlPackage.COORDINATE__LAT:
				setLat((Double)newValue);
				return;
			case KmlPackage.COORDINATE__ALT:
				setAlt((Double)newValue);
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
			case KmlPackage.COORDINATE__LON:
				setLon(LON_EDEFAULT);
				return;
			case KmlPackage.COORDINATE__LAT:
				setLat(LAT_EDEFAULT);
				return;
			case KmlPackage.COORDINATE__ALT:
				setAlt(ALT_EDEFAULT);
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
			case KmlPackage.COORDINATE__LON:
				return lon != LON_EDEFAULT;
			case KmlPackage.COORDINATE__LAT:
				return lat != LAT_EDEFAULT;
			case KmlPackage.COORDINATE__ALT:
				return alt != ALT_EDEFAULT;
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
		result.append(" (lon: ");
		result.append(lon);
		result.append(", lat: ");
		result.append(lat);
		result.append(", alt: ");
		result.append(alt);
		result.append(')');
		return result.toString();
	}

} //CoordinateImpl
