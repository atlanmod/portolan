/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml.impl;

import java.util.Collection;

import kml.AltitudeMode;
import kml.Coordinate;
import kml.KmlPackage;
import kml.LineString;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line String</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kml.impl.LineStringImpl#isExtrude <em>Extrude</em>}</li>
 *   <li>{@link kml.impl.LineStringImpl#isTessellate <em>Tessellate</em>}</li>
 *   <li>{@link kml.impl.LineStringImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link kml.impl.LineStringImpl#getCoordinates <em>Coordinates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LineStringImpl extends GeometryImpl implements LineString {
	/**
	 * The default value of the '{@link #isExtrude() <em>Extrude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExtrude()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTRUDE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExtrude() <em>Extrude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExtrude()
	 * @generated
	 * @ordered
	 */
	protected boolean extrude = EXTRUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #isTessellate() <em>Tessellate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTessellate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TESSELLATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTessellate() <em>Tessellate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTessellate()
	 * @generated
	 * @ordered
	 */
	protected boolean tessellate = TESSELLATE_EDEFAULT;

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
	 * The cached value of the '{@link #getCoordinates() <em>Coordinates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinates()
	 * @generated
	 * @ordered
	 */
	protected EList<Coordinate> coordinates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineStringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmlPackage.Literals.LINE_STRING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExtrude() {
		return extrude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrude(boolean newExtrude) {
		boolean oldExtrude = extrude;
		extrude = newExtrude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.LINE_STRING__EXTRUDE, oldExtrude, extrude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTessellate() {
		return tessellate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTessellate(boolean newTessellate) {
		boolean oldTessellate = tessellate;
		tessellate = newTessellate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.LINE_STRING__TESSELLATE, oldTessellate, tessellate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.LINE_STRING__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coordinate> getCoordinates() {
		if (coordinates == null) {
			coordinates = new EObjectContainmentEList<Coordinate>(Coordinate.class, this, KmlPackage.LINE_STRING__COORDINATES);
		}
		return coordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmlPackage.LINE_STRING__COORDINATES:
				return ((InternalEList<?>)getCoordinates()).basicRemove(otherEnd, msgs);
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
			case KmlPackage.LINE_STRING__EXTRUDE:
				return isExtrude();
			case KmlPackage.LINE_STRING__TESSELLATE:
				return isTessellate();
			case KmlPackage.LINE_STRING__MODE:
				return getMode();
			case KmlPackage.LINE_STRING__COORDINATES:
				return getCoordinates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KmlPackage.LINE_STRING__EXTRUDE:
				setExtrude((Boolean)newValue);
				return;
			case KmlPackage.LINE_STRING__TESSELLATE:
				setTessellate((Boolean)newValue);
				return;
			case KmlPackage.LINE_STRING__MODE:
				setMode((AltitudeMode)newValue);
				return;
			case KmlPackage.LINE_STRING__COORDINATES:
				getCoordinates().clear();
				getCoordinates().addAll((Collection<? extends Coordinate>)newValue);
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
			case KmlPackage.LINE_STRING__EXTRUDE:
				setExtrude(EXTRUDE_EDEFAULT);
				return;
			case KmlPackage.LINE_STRING__TESSELLATE:
				setTessellate(TESSELLATE_EDEFAULT);
				return;
			case KmlPackage.LINE_STRING__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case KmlPackage.LINE_STRING__COORDINATES:
				getCoordinates().clear();
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
			case KmlPackage.LINE_STRING__EXTRUDE:
				return extrude != EXTRUDE_EDEFAULT;
			case KmlPackage.LINE_STRING__TESSELLATE:
				return tessellate != TESSELLATE_EDEFAULT;
			case KmlPackage.LINE_STRING__MODE:
				return mode != MODE_EDEFAULT;
			case KmlPackage.LINE_STRING__COORDINATES:
				return coordinates != null && !coordinates.isEmpty();
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
		result.append(" (extrude: ");
		result.append(extrude);
		result.append(", tessellate: ");
		result.append(tessellate);
		result.append(", mode: ");
		result.append(mode);
		result.append(')');
		return result.toString();
	}

} //LineStringImpl
