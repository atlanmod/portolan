/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml.impl;

import kml.Alias;
import kml.KmlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alias</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kml.impl.AliasImpl#getTargetHref <em>Target Href</em>}</li>
 *   <li>{@link kml.impl.AliasImpl#getSourceHref <em>Source Href</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AliasImpl extends EObjectImpl implements Alias {
	/**
	 * The default value of the '{@link #getTargetHref() <em>Target Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetHref()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetHref() <em>Target Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetHref()
	 * @generated
	 * @ordered
	 */
	protected String targetHref = TARGET_HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceHref() <em>Source Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceHref()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceHref() <em>Source Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceHref()
	 * @generated
	 * @ordered
	 */
	protected String sourceHref = SOURCE_HREF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AliasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmlPackage.Literals.ALIAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetHref() {
		return targetHref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetHref(String newTargetHref) {
		String oldTargetHref = targetHref;
		targetHref = newTargetHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.ALIAS__TARGET_HREF, oldTargetHref, targetHref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceHref() {
		return sourceHref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceHref(String newSourceHref) {
		String oldSourceHref = sourceHref;
		sourceHref = newSourceHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.ALIAS__SOURCE_HREF, oldSourceHref, sourceHref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KmlPackage.ALIAS__TARGET_HREF:
				return getTargetHref();
			case KmlPackage.ALIAS__SOURCE_HREF:
				return getSourceHref();
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
			case KmlPackage.ALIAS__TARGET_HREF:
				setTargetHref((String)newValue);
				return;
			case KmlPackage.ALIAS__SOURCE_HREF:
				setSourceHref((String)newValue);
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
			case KmlPackage.ALIAS__TARGET_HREF:
				setTargetHref(TARGET_HREF_EDEFAULT);
				return;
			case KmlPackage.ALIAS__SOURCE_HREF:
				setSourceHref(SOURCE_HREF_EDEFAULT);
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
			case KmlPackage.ALIAS__TARGET_HREF:
				return TARGET_HREF_EDEFAULT == null ? targetHref != null : !TARGET_HREF_EDEFAULT.equals(targetHref);
			case KmlPackage.ALIAS__SOURCE_HREF:
				return SOURCE_HREF_EDEFAULT == null ? sourceHref != null : !SOURCE_HREF_EDEFAULT.equals(sourceHref);
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
		result.append(" (targetHref: ");
		result.append(targetHref);
		result.append(", sourceHref: ");
		result.append(sourceHref);
		result.append(')');
		return result.toString();
	}

} //AliasImpl
