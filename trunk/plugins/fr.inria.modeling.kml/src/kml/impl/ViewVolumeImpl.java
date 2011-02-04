/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml.impl;

import kml.KmlPackage;
import kml.ViewVolume;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Volume</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kml.impl.ViewVolumeImpl#getLeftFov <em>Left Fov</em>}</li>
 *   <li>{@link kml.impl.ViewVolumeImpl#getRightFov <em>Right Fov</em>}</li>
 *   <li>{@link kml.impl.ViewVolumeImpl#getBottomFov <em>Bottom Fov</em>}</li>
 *   <li>{@link kml.impl.ViewVolumeImpl#getTopFov <em>Top Fov</em>}</li>
 *   <li>{@link kml.impl.ViewVolumeImpl#getNear <em>Near</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewVolumeImpl extends EObjectImpl implements ViewVolume {
	/**
	 * The default value of the '{@link #getLeftFov() <em>Left Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftFov()
	 * @generated
	 * @ordered
	 */
	protected static final double LEFT_FOV_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLeftFov() <em>Left Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftFov()
	 * @generated
	 * @ordered
	 */
	protected double leftFov = LEFT_FOV_EDEFAULT;

	/**
	 * The default value of the '{@link #getRightFov() <em>Right Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightFov()
	 * @generated
	 * @ordered
	 */
	protected static final double RIGHT_FOV_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRightFov() <em>Right Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightFov()
	 * @generated
	 * @ordered
	 */
	protected double rightFov = RIGHT_FOV_EDEFAULT;

	/**
	 * The default value of the '{@link #getBottomFov() <em>Bottom Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottomFov()
	 * @generated
	 * @ordered
	 */
	protected static final double BOTTOM_FOV_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBottomFov() <em>Bottom Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottomFov()
	 * @generated
	 * @ordered
	 */
	protected double bottomFov = BOTTOM_FOV_EDEFAULT;

	/**
	 * The default value of the '{@link #getTopFov() <em>Top Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopFov()
	 * @generated
	 * @ordered
	 */
	protected static final double TOP_FOV_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTopFov() <em>Top Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopFov()
	 * @generated
	 * @ordered
	 */
	protected double topFov = TOP_FOV_EDEFAULT;

	/**
	 * The default value of the '{@link #getNear() <em>Near</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNear()
	 * @generated
	 * @ordered
	 */
	protected static final double NEAR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNear() <em>Near</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNear()
	 * @generated
	 * @ordered
	 */
	protected double near = NEAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewVolumeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmlPackage.Literals.VIEW_VOLUME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLeftFov() {
		return leftFov;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftFov(double newLeftFov) {
		double oldLeftFov = leftFov;
		leftFov = newLeftFov;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.VIEW_VOLUME__LEFT_FOV, oldLeftFov, leftFov));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRightFov() {
		return rightFov;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightFov(double newRightFov) {
		double oldRightFov = rightFov;
		rightFov = newRightFov;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.VIEW_VOLUME__RIGHT_FOV, oldRightFov, rightFov));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBottomFov() {
		return bottomFov;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBottomFov(double newBottomFov) {
		double oldBottomFov = bottomFov;
		bottomFov = newBottomFov;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.VIEW_VOLUME__BOTTOM_FOV, oldBottomFov, bottomFov));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTopFov() {
		return topFov;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopFov(double newTopFov) {
		double oldTopFov = topFov;
		topFov = newTopFov;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.VIEW_VOLUME__TOP_FOV, oldTopFov, topFov));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNear() {
		return near;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNear(double newNear) {
		double oldNear = near;
		near = newNear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.VIEW_VOLUME__NEAR, oldNear, near));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KmlPackage.VIEW_VOLUME__LEFT_FOV:
				return getLeftFov();
			case KmlPackage.VIEW_VOLUME__RIGHT_FOV:
				return getRightFov();
			case KmlPackage.VIEW_VOLUME__BOTTOM_FOV:
				return getBottomFov();
			case KmlPackage.VIEW_VOLUME__TOP_FOV:
				return getTopFov();
			case KmlPackage.VIEW_VOLUME__NEAR:
				return getNear();
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
			case KmlPackage.VIEW_VOLUME__LEFT_FOV:
				setLeftFov((Double)newValue);
				return;
			case KmlPackage.VIEW_VOLUME__RIGHT_FOV:
				setRightFov((Double)newValue);
				return;
			case KmlPackage.VIEW_VOLUME__BOTTOM_FOV:
				setBottomFov((Double)newValue);
				return;
			case KmlPackage.VIEW_VOLUME__TOP_FOV:
				setTopFov((Double)newValue);
				return;
			case KmlPackage.VIEW_VOLUME__NEAR:
				setNear((Double)newValue);
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
			case KmlPackage.VIEW_VOLUME__LEFT_FOV:
				setLeftFov(LEFT_FOV_EDEFAULT);
				return;
			case KmlPackage.VIEW_VOLUME__RIGHT_FOV:
				setRightFov(RIGHT_FOV_EDEFAULT);
				return;
			case KmlPackage.VIEW_VOLUME__BOTTOM_FOV:
				setBottomFov(BOTTOM_FOV_EDEFAULT);
				return;
			case KmlPackage.VIEW_VOLUME__TOP_FOV:
				setTopFov(TOP_FOV_EDEFAULT);
				return;
			case KmlPackage.VIEW_VOLUME__NEAR:
				setNear(NEAR_EDEFAULT);
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
			case KmlPackage.VIEW_VOLUME__LEFT_FOV:
				return leftFov != LEFT_FOV_EDEFAULT;
			case KmlPackage.VIEW_VOLUME__RIGHT_FOV:
				return rightFov != RIGHT_FOV_EDEFAULT;
			case KmlPackage.VIEW_VOLUME__BOTTOM_FOV:
				return bottomFov != BOTTOM_FOV_EDEFAULT;
			case KmlPackage.VIEW_VOLUME__TOP_FOV:
				return topFov != TOP_FOV_EDEFAULT;
			case KmlPackage.VIEW_VOLUME__NEAR:
				return near != NEAR_EDEFAULT;
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
		result.append(" (leftFov: ");
		result.append(leftFov);
		result.append(", rightFov: ");
		result.append(rightFov);
		result.append(", bottomFov: ");
		result.append(bottomFov);
		result.append(", topFov: ");
		result.append(topFov);
		result.append(", near: ");
		result.append(near);
		result.append(')');
		return result.toString();
	}

} //ViewVolumeImpl
