/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml.impl;

import kml.AltitudeMode;
import kml.KmlPackage;
import kml.LinearRing;
import kml.Polygon;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polygon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kml.impl.PolygonImpl#isExtrude <em>Extrude</em>}</li>
 *   <li>{@link kml.impl.PolygonImpl#isTessellate <em>Tessellate</em>}</li>
 *   <li>{@link kml.impl.PolygonImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link kml.impl.PolygonImpl#getInnerBoundaryIs <em>Inner Boundary Is</em>}</li>
 *   <li>{@link kml.impl.PolygonImpl#getOuterBoundaryIs <em>Outer Boundary Is</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolygonImpl extends GeometryImpl implements Polygon {
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
	 * The cached value of the '{@link #getInnerBoundaryIs() <em>Inner Boundary Is</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerBoundaryIs()
	 * @generated
	 * @ordered
	 */
	protected LinearRing innerBoundaryIs;

	/**
	 * The cached value of the '{@link #getOuterBoundaryIs() <em>Outer Boundary Is</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterBoundaryIs()
	 * @generated
	 * @ordered
	 */
	protected LinearRing outerBoundaryIs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolygonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmlPackage.Literals.POLYGON;
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
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.POLYGON__EXTRUDE, oldExtrude, extrude));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.POLYGON__TESSELLATE, oldTessellate, tessellate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.POLYGON__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearRing getInnerBoundaryIs() {
		return innerBoundaryIs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInnerBoundaryIs(LinearRing newInnerBoundaryIs, NotificationChain msgs) {
		LinearRing oldInnerBoundaryIs = innerBoundaryIs;
		innerBoundaryIs = newInnerBoundaryIs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmlPackage.POLYGON__INNER_BOUNDARY_IS, oldInnerBoundaryIs, newInnerBoundaryIs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerBoundaryIs(LinearRing newInnerBoundaryIs) {
		if (newInnerBoundaryIs != innerBoundaryIs) {
			NotificationChain msgs = null;
			if (innerBoundaryIs != null)
				msgs = ((InternalEObject)innerBoundaryIs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmlPackage.POLYGON__INNER_BOUNDARY_IS, null, msgs);
			if (newInnerBoundaryIs != null)
				msgs = ((InternalEObject)newInnerBoundaryIs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmlPackage.POLYGON__INNER_BOUNDARY_IS, null, msgs);
			msgs = basicSetInnerBoundaryIs(newInnerBoundaryIs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.POLYGON__INNER_BOUNDARY_IS, newInnerBoundaryIs, newInnerBoundaryIs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearRing getOuterBoundaryIs() {
		return outerBoundaryIs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOuterBoundaryIs(LinearRing newOuterBoundaryIs, NotificationChain msgs) {
		LinearRing oldOuterBoundaryIs = outerBoundaryIs;
		outerBoundaryIs = newOuterBoundaryIs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmlPackage.POLYGON__OUTER_BOUNDARY_IS, oldOuterBoundaryIs, newOuterBoundaryIs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterBoundaryIs(LinearRing newOuterBoundaryIs) {
		if (newOuterBoundaryIs != outerBoundaryIs) {
			NotificationChain msgs = null;
			if (outerBoundaryIs != null)
				msgs = ((InternalEObject)outerBoundaryIs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmlPackage.POLYGON__OUTER_BOUNDARY_IS, null, msgs);
			if (newOuterBoundaryIs != null)
				msgs = ((InternalEObject)newOuterBoundaryIs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmlPackage.POLYGON__OUTER_BOUNDARY_IS, null, msgs);
			msgs = basicSetOuterBoundaryIs(newOuterBoundaryIs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.POLYGON__OUTER_BOUNDARY_IS, newOuterBoundaryIs, newOuterBoundaryIs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmlPackage.POLYGON__INNER_BOUNDARY_IS:
				return basicSetInnerBoundaryIs(null, msgs);
			case KmlPackage.POLYGON__OUTER_BOUNDARY_IS:
				return basicSetOuterBoundaryIs(null, msgs);
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
			case KmlPackage.POLYGON__EXTRUDE:
				return isExtrude();
			case KmlPackage.POLYGON__TESSELLATE:
				return isTessellate();
			case KmlPackage.POLYGON__MODE:
				return getMode();
			case KmlPackage.POLYGON__INNER_BOUNDARY_IS:
				return getInnerBoundaryIs();
			case KmlPackage.POLYGON__OUTER_BOUNDARY_IS:
				return getOuterBoundaryIs();
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
			case KmlPackage.POLYGON__EXTRUDE:
				setExtrude((Boolean)newValue);
				return;
			case KmlPackage.POLYGON__TESSELLATE:
				setTessellate((Boolean)newValue);
				return;
			case KmlPackage.POLYGON__MODE:
				setMode((AltitudeMode)newValue);
				return;
			case KmlPackage.POLYGON__INNER_BOUNDARY_IS:
				setInnerBoundaryIs((LinearRing)newValue);
				return;
			case KmlPackage.POLYGON__OUTER_BOUNDARY_IS:
				setOuterBoundaryIs((LinearRing)newValue);
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
			case KmlPackage.POLYGON__EXTRUDE:
				setExtrude(EXTRUDE_EDEFAULT);
				return;
			case KmlPackage.POLYGON__TESSELLATE:
				setTessellate(TESSELLATE_EDEFAULT);
				return;
			case KmlPackage.POLYGON__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case KmlPackage.POLYGON__INNER_BOUNDARY_IS:
				setInnerBoundaryIs((LinearRing)null);
				return;
			case KmlPackage.POLYGON__OUTER_BOUNDARY_IS:
				setOuterBoundaryIs((LinearRing)null);
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
			case KmlPackage.POLYGON__EXTRUDE:
				return extrude != EXTRUDE_EDEFAULT;
			case KmlPackage.POLYGON__TESSELLATE:
				return tessellate != TESSELLATE_EDEFAULT;
			case KmlPackage.POLYGON__MODE:
				return mode != MODE_EDEFAULT;
			case KmlPackage.POLYGON__INNER_BOUNDARY_IS:
				return innerBoundaryIs != null;
			case KmlPackage.POLYGON__OUTER_BOUNDARY_IS:
				return outerBoundaryIs != null;
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

} //PolygonImpl
