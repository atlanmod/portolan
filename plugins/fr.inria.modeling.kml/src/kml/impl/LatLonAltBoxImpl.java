/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml.impl;

import kml.AltitudeMode;
import kml.KmlPackage;
import kml.LatLonAltBox;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lat Lon Alt Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kml.impl.LatLonAltBoxImpl#getMinAltitude <em>Min Altitude</em>}</li>
 *   <li>{@link kml.impl.LatLonAltBoxImpl#getMaxAltitude <em>Max Altitude</em>}</li>
 *   <li>{@link kml.impl.LatLonAltBoxImpl#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LatLonAltBoxImpl extends LatLonBoxImpl implements LatLonAltBox {
	/**
	 * The default value of the '{@link #getMinAltitude() <em>Min Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinAltitude()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_ALTITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinAltitude() <em>Min Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinAltitude()
	 * @generated
	 * @ordered
	 */
	protected double minAltitude = MIN_ALTITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxAltitude() <em>Max Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAltitude()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_ALTITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxAltitude() <em>Max Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAltitude()
	 * @generated
	 * @ordered
	 */
	protected double maxAltitude = MAX_ALTITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final AltitudeMode MODE_EDEFAULT = AltitudeMode.CLAMP_TO_GROUND;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected AltitudeMode mode = MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LatLonAltBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmlPackage.Literals.LAT_LON_ALT_BOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinAltitude() {
		return minAltitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinAltitude(double newMinAltitude) {
		double oldMinAltitude = minAltitude;
		minAltitude = newMinAltitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.LAT_LON_ALT_BOX__MIN_ALTITUDE, oldMinAltitude, minAltitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxAltitude() {
		return maxAltitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxAltitude(double newMaxAltitude) {
		double oldMaxAltitude = maxAltitude;
		maxAltitude = newMaxAltitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.LAT_LON_ALT_BOX__MAX_ALTITUDE, oldMaxAltitude, maxAltitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltitudeMode getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(AltitudeMode newMode) {
		AltitudeMode oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.LAT_LON_ALT_BOX__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KmlPackage.LAT_LON_ALT_BOX__MIN_ALTITUDE:
				return getMinAltitude();
			case KmlPackage.LAT_LON_ALT_BOX__MAX_ALTITUDE:
				return getMaxAltitude();
			case KmlPackage.LAT_LON_ALT_BOX__MODE:
				return getMode();
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
			case KmlPackage.LAT_LON_ALT_BOX__MIN_ALTITUDE:
				setMinAltitude((Double)newValue);
				return;
			case KmlPackage.LAT_LON_ALT_BOX__MAX_ALTITUDE:
				setMaxAltitude((Double)newValue);
				return;
			case KmlPackage.LAT_LON_ALT_BOX__MODE:
				setMode((AltitudeMode)newValue);
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
			case KmlPackage.LAT_LON_ALT_BOX__MIN_ALTITUDE:
				setMinAltitude(MIN_ALTITUDE_EDEFAULT);
				return;
			case KmlPackage.LAT_LON_ALT_BOX__MAX_ALTITUDE:
				setMaxAltitude(MAX_ALTITUDE_EDEFAULT);
				return;
			case KmlPackage.LAT_LON_ALT_BOX__MODE:
				setMode(MODE_EDEFAULT);
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
			case KmlPackage.LAT_LON_ALT_BOX__MIN_ALTITUDE:
				return minAltitude != MIN_ALTITUDE_EDEFAULT;
			case KmlPackage.LAT_LON_ALT_BOX__MAX_ALTITUDE:
				return maxAltitude != MAX_ALTITUDE_EDEFAULT;
			case KmlPackage.LAT_LON_ALT_BOX__MODE:
				return mode != MODE_EDEFAULT;
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
		result.append(" (minAltitude: ");
		result.append(minAltitude);
		result.append(", maxAltitude: ");
		result.append(maxAltitude);
		result.append(", mode: ");
		result.append(mode);
		result.append(')');
		return result.toString();
	}

} //LatLonAltBoxImpl
