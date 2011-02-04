/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml.impl;

import kml.KmlPackage;
import kml.LookAt;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Look At</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kml.impl.LookAtImpl#getTilt <em>Tilt</em>}</li>
 *   <li>{@link kml.impl.LookAtImpl#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LookAtImpl extends AbstractViewImpl implements LookAt {
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
	 * The default value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected static final double RANGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected double range = RANGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LookAtImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmlPackage.Literals.LOOK_AT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.LOOK_AT__TILT, oldTilt, tilt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(double newRange) {
		double oldRange = range;
		range = newRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.LOOK_AT__RANGE, oldRange, range));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KmlPackage.LOOK_AT__TILT:
				return getTilt();
			case KmlPackage.LOOK_AT__RANGE:
				return getRange();
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
			case KmlPackage.LOOK_AT__TILT:
				setTilt((Double)newValue);
				return;
			case KmlPackage.LOOK_AT__RANGE:
				setRange((Double)newValue);
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
			case KmlPackage.LOOK_AT__TILT:
				setTilt(TILT_EDEFAULT);
				return;
			case KmlPackage.LOOK_AT__RANGE:
				setRange(RANGE_EDEFAULT);
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
			case KmlPackage.LOOK_AT__TILT:
				return tilt != TILT_EDEFAULT;
			case KmlPackage.LOOK_AT__RANGE:
				return range != RANGE_EDEFAULT;
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
		result.append(", range: ");
		result.append(range);
		result.append(')');
		return result.toString();
	}

} //LookAtImpl
