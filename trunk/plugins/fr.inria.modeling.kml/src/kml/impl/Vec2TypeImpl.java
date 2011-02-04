/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml.impl;

import kml.KmlPackage;
import kml.Units;
import kml.Vec2Type;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vec2 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kml.impl.Vec2TypeImpl#getX <em>X</em>}</li>
 *   <li>{@link kml.impl.Vec2TypeImpl#getY <em>Y</em>}</li>
 *   <li>{@link kml.impl.Vec2TypeImpl#getXunits <em>Xunits</em>}</li>
 *   <li>{@link kml.impl.Vec2TypeImpl#getYunits <em>Yunits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Vec2TypeImpl extends EObjectImpl implements Vec2Type {
	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final double X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected double x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final double Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected double y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getXunits() <em>Xunits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXunits()
	 * @generated
	 * @ordered
	 */
	protected static final Units XUNITS_EDEFAULT = Units.FRACTION;

	/**
	 * The cached value of the '{@link #getXunits() <em>Xunits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXunits()
	 * @generated
	 * @ordered
	 */
	protected Units xunits = XUNITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getYunits() <em>Yunits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYunits()
	 * @generated
	 * @ordered
	 */
	protected static final Units YUNITS_EDEFAULT = Units.FRACTION;

	/**
	 * The cached value of the '{@link #getYunits() <em>Yunits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYunits()
	 * @generated
	 * @ordered
	 */
	protected Units yunits = YUNITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Vec2TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmlPackage.Literals.VEC2_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(double newX) {
		double oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.VEC2_TYPE__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(double newY) {
		double oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.VEC2_TYPE__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Units getXunits() {
		return xunits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXunits(Units newXunits) {
		Units oldXunits = xunits;
		xunits = newXunits == null ? XUNITS_EDEFAULT : newXunits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.VEC2_TYPE__XUNITS, oldXunits, xunits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Units getYunits() {
		return yunits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYunits(Units newYunits) {
		Units oldYunits = yunits;
		yunits = newYunits == null ? YUNITS_EDEFAULT : newYunits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.VEC2_TYPE__YUNITS, oldYunits, yunits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KmlPackage.VEC2_TYPE__X:
				return getX();
			case KmlPackage.VEC2_TYPE__Y:
				return getY();
			case KmlPackage.VEC2_TYPE__XUNITS:
				return getXunits();
			case KmlPackage.VEC2_TYPE__YUNITS:
				return getYunits();
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
			case KmlPackage.VEC2_TYPE__X:
				setX((Double)newValue);
				return;
			case KmlPackage.VEC2_TYPE__Y:
				setY((Double)newValue);
				return;
			case KmlPackage.VEC2_TYPE__XUNITS:
				setXunits((Units)newValue);
				return;
			case KmlPackage.VEC2_TYPE__YUNITS:
				setYunits((Units)newValue);
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
			case KmlPackage.VEC2_TYPE__X:
				setX(X_EDEFAULT);
				return;
			case KmlPackage.VEC2_TYPE__Y:
				setY(Y_EDEFAULT);
				return;
			case KmlPackage.VEC2_TYPE__XUNITS:
				setXunits(XUNITS_EDEFAULT);
				return;
			case KmlPackage.VEC2_TYPE__YUNITS:
				setYunits(YUNITS_EDEFAULT);
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
			case KmlPackage.VEC2_TYPE__X:
				return x != X_EDEFAULT;
			case KmlPackage.VEC2_TYPE__Y:
				return y != Y_EDEFAULT;
			case KmlPackage.VEC2_TYPE__XUNITS:
				return xunits != XUNITS_EDEFAULT;
			case KmlPackage.VEC2_TYPE__YUNITS:
				return yunits != YUNITS_EDEFAULT;
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
		result.append(" (x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", xunits: ");
		result.append(xunits);
		result.append(", yunits: ");
		result.append(yunits);
		result.append(')');
		return result.toString();
	}

} //Vec2TypeImpl
