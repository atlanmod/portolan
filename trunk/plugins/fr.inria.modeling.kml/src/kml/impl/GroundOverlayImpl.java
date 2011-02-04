/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml.impl;

import kml.AltitudeMode;
import kml.GroundOverlay;
import kml.KmlPackage;
import kml.LatLonBox;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ground Overlay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kml.impl.GroundOverlayImpl#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link kml.impl.GroundOverlayImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link kml.impl.GroundOverlayImpl#getLatLonBox <em>Lat Lon Box</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroundOverlayImpl extends OverlayImpl implements GroundOverlay {
	/**
	 * The default value of the '{@link #getAltitude() <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected static final double ALTITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAltitude() <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected double altitude = ALTITUDE_EDEFAULT;

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
	 * The cached value of the '{@link #getLatLonBox() <em>Lat Lon Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatLonBox()
	 * @generated
	 * @ordered
	 */
	protected LatLonBox latLonBox;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroundOverlayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmlPackage.Literals.GROUND_OVERLAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAltitude() {
		return altitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltitude(double newAltitude) {
		double oldAltitude = altitude;
		altitude = newAltitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.GROUND_OVERLAY__ALTITUDE, oldAltitude, altitude));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.GROUND_OVERLAY__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatLonBox getLatLonBox() {
		return latLonBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLatLonBox(LatLonBox newLatLonBox, NotificationChain msgs) {
		LatLonBox oldLatLonBox = latLonBox;
		latLonBox = newLatLonBox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmlPackage.GROUND_OVERLAY__LAT_LON_BOX, oldLatLonBox, newLatLonBox);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatLonBox(LatLonBox newLatLonBox) {
		if (newLatLonBox != latLonBox) {
			NotificationChain msgs = null;
			if (latLonBox != null)
				msgs = ((InternalEObject)latLonBox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmlPackage.GROUND_OVERLAY__LAT_LON_BOX, null, msgs);
			if (newLatLonBox != null)
				msgs = ((InternalEObject)newLatLonBox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmlPackage.GROUND_OVERLAY__LAT_LON_BOX, null, msgs);
			msgs = basicSetLatLonBox(newLatLonBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.GROUND_OVERLAY__LAT_LON_BOX, newLatLonBox, newLatLonBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmlPackage.GROUND_OVERLAY__LAT_LON_BOX:
				return basicSetLatLonBox(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KmlPackage.GROUND_OVERLAY__ALTITUDE:
				return getAltitude();
			case KmlPackage.GROUND_OVERLAY__MODE:
				return getMode();
			case KmlPackage.GROUND_OVERLAY__LAT_LON_BOX:
				return getLatLonBox();
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
			case KmlPackage.GROUND_OVERLAY__ALTITUDE:
				setAltitude((Double)newValue);
				return;
			case KmlPackage.GROUND_OVERLAY__MODE:
				setMode((AltitudeMode)newValue);
				return;
			case KmlPackage.GROUND_OVERLAY__LAT_LON_BOX:
				setLatLonBox((LatLonBox)newValue);
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
			case KmlPackage.GROUND_OVERLAY__ALTITUDE:
				setAltitude(ALTITUDE_EDEFAULT);
				return;
			case KmlPackage.GROUND_OVERLAY__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case KmlPackage.GROUND_OVERLAY__LAT_LON_BOX:
				setLatLonBox((LatLonBox)null);
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
			case KmlPackage.GROUND_OVERLAY__ALTITUDE:
				return altitude != ALTITUDE_EDEFAULT;
			case KmlPackage.GROUND_OVERLAY__MODE:
				return mode != MODE_EDEFAULT;
			case KmlPackage.GROUND_OVERLAY__LAT_LON_BOX:
				return latLonBox != null;
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
		result.append(" (altitude: ");
		result.append(altitude);
		result.append(", mode: ");
		result.append(mode);
		result.append(')');
		return result.toString();
	}

} //GroundOverlayImpl
