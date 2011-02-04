/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml.impl;

import kml.Icon;
import kml.IconStyle;
import kml.KmlPackage;
import kml.Vec2Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Icon Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kml.impl.IconStyleImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link kml.impl.IconStyleImpl#getHeading <em>Heading</em>}</li>
 *   <li>{@link kml.impl.IconStyleImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link kml.impl.IconStyleImpl#getHotSpot <em>Hot Spot</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IconStyleImpl extends ColorStyleImpl implements IconStyle {
	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final double SCALE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected double scale = SCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeading() <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeading()
	 * @generated
	 * @ordered
	 */
	protected static final double HEADING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHeading() <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeading()
	 * @generated
	 * @ordered
	 */
	protected double heading = HEADING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected Icon icon;

	/**
	 * The cached value of the '{@link #getHotSpot() <em>Hot Spot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotSpot()
	 * @generated
	 * @ordered
	 */
	protected Vec2Type hotSpot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IconStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmlPackage.Literals.ICON_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(double newScale) {
		double oldScale = scale;
		scale = newScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.ICON_STYLE__SCALE, oldScale, scale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHeading() {
		return heading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeading(double newHeading) {
		double oldHeading = heading;
		heading = newHeading;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.ICON_STYLE__HEADING, oldHeading, heading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Icon getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIcon(Icon newIcon, NotificationChain msgs) {
		Icon oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmlPackage.ICON_STYLE__ICON, oldIcon, newIcon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(Icon newIcon) {
		if (newIcon != icon) {
			NotificationChain msgs = null;
			if (icon != null)
				msgs = ((InternalEObject)icon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmlPackage.ICON_STYLE__ICON, null, msgs);
			if (newIcon != null)
				msgs = ((InternalEObject)newIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmlPackage.ICON_STYLE__ICON, null, msgs);
			msgs = basicSetIcon(newIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.ICON_STYLE__ICON, newIcon, newIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vec2Type getHotSpot() {
		return hotSpot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHotSpot(Vec2Type newHotSpot, NotificationChain msgs) {
		Vec2Type oldHotSpot = hotSpot;
		hotSpot = newHotSpot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmlPackage.ICON_STYLE__HOT_SPOT, oldHotSpot, newHotSpot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHotSpot(Vec2Type newHotSpot) {
		if (newHotSpot != hotSpot) {
			NotificationChain msgs = null;
			if (hotSpot != null)
				msgs = ((InternalEObject)hotSpot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmlPackage.ICON_STYLE__HOT_SPOT, null, msgs);
			if (newHotSpot != null)
				msgs = ((InternalEObject)newHotSpot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmlPackage.ICON_STYLE__HOT_SPOT, null, msgs);
			msgs = basicSetHotSpot(newHotSpot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.ICON_STYLE__HOT_SPOT, newHotSpot, newHotSpot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmlPackage.ICON_STYLE__ICON:
				return basicSetIcon(null, msgs);
			case KmlPackage.ICON_STYLE__HOT_SPOT:
				return basicSetHotSpot(null, msgs);
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
			case KmlPackage.ICON_STYLE__SCALE:
				return getScale();
			case KmlPackage.ICON_STYLE__HEADING:
				return getHeading();
			case KmlPackage.ICON_STYLE__ICON:
				return getIcon();
			case KmlPackage.ICON_STYLE__HOT_SPOT:
				return getHotSpot();
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
			case KmlPackage.ICON_STYLE__SCALE:
				setScale((Double)newValue);
				return;
			case KmlPackage.ICON_STYLE__HEADING:
				setHeading((Double)newValue);
				return;
			case KmlPackage.ICON_STYLE__ICON:
				setIcon((Icon)newValue);
				return;
			case KmlPackage.ICON_STYLE__HOT_SPOT:
				setHotSpot((Vec2Type)newValue);
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
			case KmlPackage.ICON_STYLE__SCALE:
				setScale(SCALE_EDEFAULT);
				return;
			case KmlPackage.ICON_STYLE__HEADING:
				setHeading(HEADING_EDEFAULT);
				return;
			case KmlPackage.ICON_STYLE__ICON:
				setIcon((Icon)null);
				return;
			case KmlPackage.ICON_STYLE__HOT_SPOT:
				setHotSpot((Vec2Type)null);
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
			case KmlPackage.ICON_STYLE__SCALE:
				return scale != SCALE_EDEFAULT;
			case KmlPackage.ICON_STYLE__HEADING:
				return heading != HEADING_EDEFAULT;
			case KmlPackage.ICON_STYLE__ICON:
				return icon != null;
			case KmlPackage.ICON_STYLE__HOT_SPOT:
				return hotSpot != null;
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
		result.append(" (scale: ");
		result.append(scale);
		result.append(", heading: ");
		result.append(heading);
		result.append(')');
		return result.toString();
	}

} //IconStyleImpl
