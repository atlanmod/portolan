/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml.impl;

import kml.KmlPackage;
import kml.Lod;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lod</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kml.impl.LodImpl#getMinLodPixels <em>Min Lod Pixels</em>}</li>
 *   <li>{@link kml.impl.LodImpl#getMaxLodPixels <em>Max Lod Pixels</em>}</li>
 *   <li>{@link kml.impl.LodImpl#getMinFadeExtent <em>Min Fade Extent</em>}</li>
 *   <li>{@link kml.impl.LodImpl#getMaxFadeExtent <em>Max Fade Extent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LodImpl extends ObjectImpl implements Lod {
	/**
	 * The default value of the '{@link #getMinLodPixels() <em>Min Lod Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLodPixels()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_LOD_PIXELS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinLodPixels() <em>Min Lod Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLodPixels()
	 * @generated
	 * @ordered
	 */
	protected double minLodPixels = MIN_LOD_PIXELS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLodPixels() <em>Max Lod Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLodPixels()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_LOD_PIXELS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxLodPixels() <em>Max Lod Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLodPixels()
	 * @generated
	 * @ordered
	 */
	protected double maxLodPixels = MAX_LOD_PIXELS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinFadeExtent() <em>Min Fade Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinFadeExtent()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_FADE_EXTENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinFadeExtent() <em>Min Fade Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinFadeExtent()
	 * @generated
	 * @ordered
	 */
	protected double minFadeExtent = MIN_FADE_EXTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxFadeExtent() <em>Max Fade Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFadeExtent()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_FADE_EXTENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxFadeExtent() <em>Max Fade Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFadeExtent()
	 * @generated
	 * @ordered
	 */
	protected double maxFadeExtent = MAX_FADE_EXTENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmlPackage.Literals.LOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinLodPixels() {
		return minLodPixels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinLodPixels(double newMinLodPixels) {
		double oldMinLodPixels = minLodPixels;
		minLodPixels = newMinLodPixels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.LOD__MIN_LOD_PIXELS, oldMinLodPixels, minLodPixels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxLodPixels() {
		return maxLodPixels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLodPixels(double newMaxLodPixels) {
		double oldMaxLodPixels = maxLodPixels;
		maxLodPixels = newMaxLodPixels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.LOD__MAX_LOD_PIXELS, oldMaxLodPixels, maxLodPixels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinFadeExtent() {
		return minFadeExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinFadeExtent(double newMinFadeExtent) {
		double oldMinFadeExtent = minFadeExtent;
		minFadeExtent = newMinFadeExtent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.LOD__MIN_FADE_EXTENT, oldMinFadeExtent, minFadeExtent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxFadeExtent() {
		return maxFadeExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxFadeExtent(double newMaxFadeExtent) {
		double oldMaxFadeExtent = maxFadeExtent;
		maxFadeExtent = newMaxFadeExtent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.LOD__MAX_FADE_EXTENT, oldMaxFadeExtent, maxFadeExtent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KmlPackage.LOD__MIN_LOD_PIXELS:
				return getMinLodPixels();
			case KmlPackage.LOD__MAX_LOD_PIXELS:
				return getMaxLodPixels();
			case KmlPackage.LOD__MIN_FADE_EXTENT:
				return getMinFadeExtent();
			case KmlPackage.LOD__MAX_FADE_EXTENT:
				return getMaxFadeExtent();
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
			case KmlPackage.LOD__MIN_LOD_PIXELS:
				setMinLodPixels((Double)newValue);
				return;
			case KmlPackage.LOD__MAX_LOD_PIXELS:
				setMaxLodPixels((Double)newValue);
				return;
			case KmlPackage.LOD__MIN_FADE_EXTENT:
				setMinFadeExtent((Double)newValue);
				return;
			case KmlPackage.LOD__MAX_FADE_EXTENT:
				setMaxFadeExtent((Double)newValue);
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
			case KmlPackage.LOD__MIN_LOD_PIXELS:
				setMinLodPixels(MIN_LOD_PIXELS_EDEFAULT);
				return;
			case KmlPackage.LOD__MAX_LOD_PIXELS:
				setMaxLodPixels(MAX_LOD_PIXELS_EDEFAULT);
				return;
			case KmlPackage.LOD__MIN_FADE_EXTENT:
				setMinFadeExtent(MIN_FADE_EXTENT_EDEFAULT);
				return;
			case KmlPackage.LOD__MAX_FADE_EXTENT:
				setMaxFadeExtent(MAX_FADE_EXTENT_EDEFAULT);
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
			case KmlPackage.LOD__MIN_LOD_PIXELS:
				return minLodPixels != MIN_LOD_PIXELS_EDEFAULT;
			case KmlPackage.LOD__MAX_LOD_PIXELS:
				return maxLodPixels != MAX_LOD_PIXELS_EDEFAULT;
			case KmlPackage.LOD__MIN_FADE_EXTENT:
				return minFadeExtent != MIN_FADE_EXTENT_EDEFAULT;
			case KmlPackage.LOD__MAX_FADE_EXTENT:
				return maxFadeExtent != MAX_FADE_EXTENT_EDEFAULT;
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
		result.append(" (minLodPixels: ");
		result.append(minLodPixels);
		result.append(", maxLodPixels: ");
		result.append(maxLodPixels);
		result.append(", minFadeExtent: ");
		result.append(minFadeExtent);
		result.append(", maxFadeExtent: ");
		result.append(maxFadeExtent);
		result.append(')');
		return result.toString();
	}

} //LodImpl
