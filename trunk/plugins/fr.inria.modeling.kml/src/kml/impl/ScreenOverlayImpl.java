/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml.impl;

import kml.KmlPackage;
import kml.ScreenOverlay;
import kml.Vec2Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Screen Overlay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kml.impl.ScreenOverlayImpl#getOverlayXY <em>Overlay XY</em>}</li>
 *   <li>{@link kml.impl.ScreenOverlayImpl#getScreenXY <em>Screen XY</em>}</li>
 *   <li>{@link kml.impl.ScreenOverlayImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link kml.impl.ScreenOverlayImpl#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScreenOverlayImpl extends OverlayImpl implements ScreenOverlay {
	/**
	 * The cached value of the '{@link #getOverlayXY() <em>Overlay XY</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverlayXY()
	 * @generated
	 * @ordered
	 */
	protected Vec2Type overlayXY;

	/**
	 * The cached value of the '{@link #getScreenXY() <em>Screen XY</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreenXY()
	 * @generated
	 * @ordered
	 */
	protected Vec2Type screenXY;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected Vec2Type rotation;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Vec2Type size;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScreenOverlayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmlPackage.Literals.SCREEN_OVERLAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vec2Type getOverlayXY() {
		return overlayXY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverlayXY(Vec2Type newOverlayXY, NotificationChain msgs) {
		Vec2Type oldOverlayXY = overlayXY;
		overlayXY = newOverlayXY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmlPackage.SCREEN_OVERLAY__OVERLAY_XY, oldOverlayXY, newOverlayXY);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverlayXY(Vec2Type newOverlayXY) {
		if (newOverlayXY != overlayXY) {
			NotificationChain msgs = null;
			if (overlayXY != null)
				msgs = ((InternalEObject)overlayXY).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmlPackage.SCREEN_OVERLAY__OVERLAY_XY, null, msgs);
			if (newOverlayXY != null)
				msgs = ((InternalEObject)newOverlayXY).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmlPackage.SCREEN_OVERLAY__OVERLAY_XY, null, msgs);
			msgs = basicSetOverlayXY(newOverlayXY, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.SCREEN_OVERLAY__OVERLAY_XY, newOverlayXY, newOverlayXY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vec2Type getScreenXY() {
		return screenXY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScreenXY(Vec2Type newScreenXY, NotificationChain msgs) {
		Vec2Type oldScreenXY = screenXY;
		screenXY = newScreenXY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmlPackage.SCREEN_OVERLAY__SCREEN_XY, oldScreenXY, newScreenXY);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScreenXY(Vec2Type newScreenXY) {
		if (newScreenXY != screenXY) {
			NotificationChain msgs = null;
			if (screenXY != null)
				msgs = ((InternalEObject)screenXY).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmlPackage.SCREEN_OVERLAY__SCREEN_XY, null, msgs);
			if (newScreenXY != null)
				msgs = ((InternalEObject)newScreenXY).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmlPackage.SCREEN_OVERLAY__SCREEN_XY, null, msgs);
			msgs = basicSetScreenXY(newScreenXY, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.SCREEN_OVERLAY__SCREEN_XY, newScreenXY, newScreenXY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vec2Type getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotation(Vec2Type newRotation, NotificationChain msgs) {
		Vec2Type oldRotation = rotation;
		rotation = newRotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmlPackage.SCREEN_OVERLAY__ROTATION, oldRotation, newRotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotation(Vec2Type newRotation) {
		if (newRotation != rotation) {
			NotificationChain msgs = null;
			if (rotation != null)
				msgs = ((InternalEObject)rotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmlPackage.SCREEN_OVERLAY__ROTATION, null, msgs);
			if (newRotation != null)
				msgs = ((InternalEObject)newRotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmlPackage.SCREEN_OVERLAY__ROTATION, null, msgs);
			msgs = basicSetRotation(newRotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.SCREEN_OVERLAY__ROTATION, newRotation, newRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vec2Type getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSize(Vec2Type newSize, NotificationChain msgs) {
		Vec2Type oldSize = size;
		size = newSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmlPackage.SCREEN_OVERLAY__SIZE, oldSize, newSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Vec2Type newSize) {
		if (newSize != size) {
			NotificationChain msgs = null;
			if (size != null)
				msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmlPackage.SCREEN_OVERLAY__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmlPackage.SCREEN_OVERLAY__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.SCREEN_OVERLAY__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmlPackage.SCREEN_OVERLAY__OVERLAY_XY:
				return basicSetOverlayXY(null, msgs);
			case KmlPackage.SCREEN_OVERLAY__SCREEN_XY:
				return basicSetScreenXY(null, msgs);
			case KmlPackage.SCREEN_OVERLAY__ROTATION:
				return basicSetRotation(null, msgs);
			case KmlPackage.SCREEN_OVERLAY__SIZE:
				return basicSetSize(null, msgs);
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
			case KmlPackage.SCREEN_OVERLAY__OVERLAY_XY:
				return getOverlayXY();
			case KmlPackage.SCREEN_OVERLAY__SCREEN_XY:
				return getScreenXY();
			case KmlPackage.SCREEN_OVERLAY__ROTATION:
				return getRotation();
			case KmlPackage.SCREEN_OVERLAY__SIZE:
				return getSize();
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
			case KmlPackage.SCREEN_OVERLAY__OVERLAY_XY:
				setOverlayXY((Vec2Type)newValue);
				return;
			case KmlPackage.SCREEN_OVERLAY__SCREEN_XY:
				setScreenXY((Vec2Type)newValue);
				return;
			case KmlPackage.SCREEN_OVERLAY__ROTATION:
				setRotation((Vec2Type)newValue);
				return;
			case KmlPackage.SCREEN_OVERLAY__SIZE:
				setSize((Vec2Type)newValue);
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
			case KmlPackage.SCREEN_OVERLAY__OVERLAY_XY:
				setOverlayXY((Vec2Type)null);
				return;
			case KmlPackage.SCREEN_OVERLAY__SCREEN_XY:
				setScreenXY((Vec2Type)null);
				return;
			case KmlPackage.SCREEN_OVERLAY__ROTATION:
				setRotation((Vec2Type)null);
				return;
			case KmlPackage.SCREEN_OVERLAY__SIZE:
				setSize((Vec2Type)null);
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
			case KmlPackage.SCREEN_OVERLAY__OVERLAY_XY:
				return overlayXY != null;
			case KmlPackage.SCREEN_OVERLAY__SCREEN_XY:
				return screenXY != null;
			case KmlPackage.SCREEN_OVERLAY__ROTATION:
				return rotation != null;
			case KmlPackage.SCREEN_OVERLAY__SIZE:
				return size != null;
		}
		return super.eIsSet(featureID);
	}

} //ScreenOverlayImpl
