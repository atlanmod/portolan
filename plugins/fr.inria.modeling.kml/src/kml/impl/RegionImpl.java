/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml.impl;

import kml.KmlPackage;
import kml.LatLonAltBox;
import kml.Lod;
import kml.Region;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kml.impl.RegionImpl#getLatLonAltBox <em>Lat Lon Alt Box</em>}</li>
 *   <li>{@link kml.impl.RegionImpl#getLod <em>Lod</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegionImpl extends ObjectImpl implements Region {
	/**
	 * The cached value of the '{@link #getLatLonAltBox() <em>Lat Lon Alt Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatLonAltBox()
	 * @generated
	 * @ordered
	 */
	protected LatLonAltBox latLonAltBox;

	/**
	 * The cached value of the '{@link #getLod() <em>Lod</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod()
	 * @generated
	 * @ordered
	 */
	protected Lod lod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmlPackage.Literals.REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatLonAltBox getLatLonAltBox() {
		return latLonAltBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLatLonAltBox(LatLonAltBox newLatLonAltBox, NotificationChain msgs) {
		LatLonAltBox oldLatLonAltBox = latLonAltBox;
		latLonAltBox = newLatLonAltBox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmlPackage.REGION__LAT_LON_ALT_BOX, oldLatLonAltBox, newLatLonAltBox);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatLonAltBox(LatLonAltBox newLatLonAltBox) {
		if (newLatLonAltBox != latLonAltBox) {
			NotificationChain msgs = null;
			if (latLonAltBox != null)
				msgs = ((InternalEObject)latLonAltBox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmlPackage.REGION__LAT_LON_ALT_BOX, null, msgs);
			if (newLatLonAltBox != null)
				msgs = ((InternalEObject)newLatLonAltBox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmlPackage.REGION__LAT_LON_ALT_BOX, null, msgs);
			msgs = basicSetLatLonAltBox(newLatLonAltBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.REGION__LAT_LON_ALT_BOX, newLatLonAltBox, newLatLonAltBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lod getLod() {
		return lod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod(Lod newLod, NotificationChain msgs) {
		Lod oldLod = lod;
		lod = newLod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmlPackage.REGION__LOD, oldLod, newLod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod(Lod newLod) {
		if (newLod != lod) {
			NotificationChain msgs = null;
			if (lod != null)
				msgs = ((InternalEObject)lod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmlPackage.REGION__LOD, null, msgs);
			if (newLod != null)
				msgs = ((InternalEObject)newLod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmlPackage.REGION__LOD, null, msgs);
			msgs = basicSetLod(newLod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.REGION__LOD, newLod, newLod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmlPackage.REGION__LAT_LON_ALT_BOX:
				return basicSetLatLonAltBox(null, msgs);
			case KmlPackage.REGION__LOD:
				return basicSetLod(null, msgs);
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
			case KmlPackage.REGION__LAT_LON_ALT_BOX:
				return getLatLonAltBox();
			case KmlPackage.REGION__LOD:
				return getLod();
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
			case KmlPackage.REGION__LAT_LON_ALT_BOX:
				setLatLonAltBox((LatLonAltBox)newValue);
				return;
			case KmlPackage.REGION__LOD:
				setLod((Lod)newValue);
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
			case KmlPackage.REGION__LAT_LON_ALT_BOX:
				setLatLonAltBox((LatLonAltBox)null);
				return;
			case KmlPackage.REGION__LOD:
				setLod((Lod)null);
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
			case KmlPackage.REGION__LAT_LON_ALT_BOX:
				return latLonAltBox != null;
			case KmlPackage.REGION__LOD:
				return lod != null;
		}
		return super.eIsSet(featureID);
	}

} //RegionImpl
