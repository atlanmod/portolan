/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml.impl;

import kml.Camera;
import kml.KmlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camera</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kml.impl.CameraImpl#getTilt <em>Tilt</em>}</li>
 *   <li>{@link kml.impl.CameraImpl#getRoll <em>Roll</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CameraImpl extends AbstractViewImpl implements Camera {
	/**
	 * The default value of the '{@link #getTilt() <em>Tilt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTilt()
	 * @generated
	 * @ordered
	 */
	protected static final double TILT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTilt() <em>Tilt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTilt()
	 * @generated
	 * @ordered
	 */
	protected double tilt = TILT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoll() <em>Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoll()
	 * @generated
	 * @ordered
	 */
	protected static final double ROLL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRoll() <em>Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoll()
	 * @generated
	 * @ordered
	 */
	protected double roll = ROLL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CameraImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmlPackage.Literals.CAMERA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTilt() {
		return tilt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTilt(double newTilt) {
		double oldTilt = tilt;
		tilt = newTilt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.CAMERA__TILT, oldTilt, tilt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRoll() {
		return roll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoll(double newRoll) {
		double oldRoll = roll;
		roll = newRoll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.CAMERA__ROLL, oldRoll, roll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KmlPackage.CAMERA__TILT:
				return getTilt();
			case KmlPackage.CAMERA__ROLL:
				return getRoll();
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
			case KmlPackage.CAMERA__TILT:
				setTilt((Double)newValue);
				return;
			case KmlPackage.CAMERA__ROLL:
				setRoll((Double)newValue);
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
			case KmlPackage.CAMERA__TILT:
				setTilt(TILT_EDEFAULT);
				return;
			case KmlPackage.CAMERA__ROLL:
				setRoll(ROLL_EDEFAULT);
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
			case KmlPackage.CAMERA__TILT:
				return tilt != TILT_EDEFAULT;
			case KmlPackage.CAMERA__ROLL:
				return roll != ROLL_EDEFAULT;
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
		result.append(" (tilt: ");
		result.append(tilt);
		result.append(", roll: ");
		result.append(roll);
		result.append(')');
		return result.toString();
	}

} //CameraImpl
