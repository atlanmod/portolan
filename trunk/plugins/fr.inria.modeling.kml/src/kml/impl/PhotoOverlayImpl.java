/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml.impl;

import kml.ImagePyramid;
import kml.KmlPackage;
import kml.PhotoOverlay;
import kml.Point;
import kml.Shape;
import kml.ViewVolume;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Photo Overlay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kml.impl.PhotoOverlayImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link kml.impl.PhotoOverlayImpl#getViewVolume <em>View Volume</em>}</li>
 *   <li>{@link kml.impl.PhotoOverlayImpl#getRoll <em>Roll</em>}</li>
 *   <li>{@link kml.impl.PhotoOverlayImpl#getPoint <em>Point</em>}</li>
 *   <li>{@link kml.impl.PhotoOverlayImpl#getImagePyramid <em>Image Pyramid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhotoOverlayImpl extends OverlayImpl implements PhotoOverlay {
	/**
	 * The default value of the '{@link #getShape() <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected static final Shape SHAPE_EDEFAULT = Shape.CYLINDER;

	/**
	 * The cached value of the '{@link #getShape() <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected Shape shape = SHAPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getViewVolume() <em>View Volume</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewVolume()
	 * @generated
	 * @ordered
	 */
	protected ViewVolume viewVolume;

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
	 * The cached value of the '{@link #getPoint() <em>Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoint()
	 * @generated
	 * @ordered
	 */
	protected Point point;

	/**
	 * The cached value of the '{@link #getImagePyramid() <em>Image Pyramid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePyramid()
	 * @generated
	 * @ordered
	 */
	protected ImagePyramid imagePyramid;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhotoOverlayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmlPackage.Literals.PHOTO_OVERLAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape getShape() {
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShape(Shape newShape) {
		Shape oldShape = shape;
		shape = newShape == null ? SHAPE_EDEFAULT : newShape;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.PHOTO_OVERLAY__SHAPE, oldShape, shape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewVolume getViewVolume() {
		if (viewVolume != null && viewVolume.eIsProxy()) {
			InternalEObject oldViewVolume = (InternalEObject)viewVolume;
			viewVolume = (ViewVolume)eResolveProxy(oldViewVolume);
			if (viewVolume != oldViewVolume) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KmlPackage.PHOTO_OVERLAY__VIEW_VOLUME, oldViewVolume, viewVolume));
			}
		}
		return viewVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewVolume basicGetViewVolume() {
		return viewVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewVolume(ViewVolume newViewVolume) {
		ViewVolume oldViewVolume = viewVolume;
		viewVolume = newViewVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.PHOTO_OVERLAY__VIEW_VOLUME, oldViewVolume, viewVolume));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.PHOTO_OVERLAY__ROLL, oldRoll, roll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getPoint() {
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPoint(Point newPoint, NotificationChain msgs) {
		Point oldPoint = point;
		point = newPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmlPackage.PHOTO_OVERLAY__POINT, oldPoint, newPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoint(Point newPoint) {
		if (newPoint != point) {
			NotificationChain msgs = null;
			if (point != null)
				msgs = ((InternalEObject)point).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmlPackage.PHOTO_OVERLAY__POINT, null, msgs);
			if (newPoint != null)
				msgs = ((InternalEObject)newPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmlPackage.PHOTO_OVERLAY__POINT, null, msgs);
			msgs = basicSetPoint(newPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.PHOTO_OVERLAY__POINT, newPoint, newPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagePyramid getImagePyramid() {
		return imagePyramid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImagePyramid(ImagePyramid newImagePyramid, NotificationChain msgs) {
		ImagePyramid oldImagePyramid = imagePyramid;
		imagePyramid = newImagePyramid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmlPackage.PHOTO_OVERLAY__IMAGE_PYRAMID, oldImagePyramid, newImagePyramid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImagePyramid(ImagePyramid newImagePyramid) {
		if (newImagePyramid != imagePyramid) {
			NotificationChain msgs = null;
			if (imagePyramid != null)
				msgs = ((InternalEObject)imagePyramid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmlPackage.PHOTO_OVERLAY__IMAGE_PYRAMID, null, msgs);
			if (newImagePyramid != null)
				msgs = ((InternalEObject)newImagePyramid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmlPackage.PHOTO_OVERLAY__IMAGE_PYRAMID, null, msgs);
			msgs = basicSetImagePyramid(newImagePyramid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.PHOTO_OVERLAY__IMAGE_PYRAMID, newImagePyramid, newImagePyramid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmlPackage.PHOTO_OVERLAY__POINT:
				return basicSetPoint(null, msgs);
			case KmlPackage.PHOTO_OVERLAY__IMAGE_PYRAMID:
				return basicSetImagePyramid(null, msgs);
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
			case KmlPackage.PHOTO_OVERLAY__SHAPE:
				return getShape();
			case KmlPackage.PHOTO_OVERLAY__VIEW_VOLUME:
				if (resolve) return getViewVolume();
				return basicGetViewVolume();
			case KmlPackage.PHOTO_OVERLAY__ROLL:
				return getRoll();
			case KmlPackage.PHOTO_OVERLAY__POINT:
				return getPoint();
			case KmlPackage.PHOTO_OVERLAY__IMAGE_PYRAMID:
				return getImagePyramid();
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
			case KmlPackage.PHOTO_OVERLAY__SHAPE:
				setShape((Shape)newValue);
				return;
			case KmlPackage.PHOTO_OVERLAY__VIEW_VOLUME:
				setViewVolume((ViewVolume)newValue);
				return;
			case KmlPackage.PHOTO_OVERLAY__ROLL:
				setRoll((Double)newValue);
				return;
			case KmlPackage.PHOTO_OVERLAY__POINT:
				setPoint((Point)newValue);
				return;
			case KmlPackage.PHOTO_OVERLAY__IMAGE_PYRAMID:
				setImagePyramid((ImagePyramid)newValue);
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
			case KmlPackage.PHOTO_OVERLAY__SHAPE:
				setShape(SHAPE_EDEFAULT);
				return;
			case KmlPackage.PHOTO_OVERLAY__VIEW_VOLUME:
				setViewVolume((ViewVolume)null);
				return;
			case KmlPackage.PHOTO_OVERLAY__ROLL:
				setRoll(ROLL_EDEFAULT);
				return;
			case KmlPackage.PHOTO_OVERLAY__POINT:
				setPoint((Point)null);
				return;
			case KmlPackage.PHOTO_OVERLAY__IMAGE_PYRAMID:
				setImagePyramid((ImagePyramid)null);
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
			case KmlPackage.PHOTO_OVERLAY__SHAPE:
				return shape != SHAPE_EDEFAULT;
			case KmlPackage.PHOTO_OVERLAY__VIEW_VOLUME:
				return viewVolume != null;
			case KmlPackage.PHOTO_OVERLAY__ROLL:
				return roll != ROLL_EDEFAULT;
			case KmlPackage.PHOTO_OVERLAY__POINT:
				return point != null;
			case KmlPackage.PHOTO_OVERLAY__IMAGE_PYRAMID:
				return imagePyramid != null;
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
		result.append(" (shape: ");
		result.append(shape);
		result.append(", roll: ");
		result.append(roll);
		result.append(')');
		return result.toString();
	}

} //PhotoOverlayImpl
