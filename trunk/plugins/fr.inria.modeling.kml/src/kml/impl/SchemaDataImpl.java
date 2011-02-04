/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml.impl;

import kml.KmlPackage;
import kml.SchemaData;
import kml.SimpleData;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kml.impl.SchemaDataImpl#getSchemaUrl <em>Schema Url</em>}</li>
 *   <li>{@link kml.impl.SchemaDataImpl#getSimpledata <em>Simpledata</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchemaDataImpl extends EObjectImpl implements SchemaData {
	/**
	 * The default value of the '{@link #getSchemaUrl() <em>Schema Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchemaUrl() <em>Schema Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaUrl()
	 * @generated
	 * @ordered
	 */
	protected String schemaUrl = SCHEMA_URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSimpledata() <em>Simpledata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpledata()
	 * @generated
	 * @ordered
	 */
	protected SimpleData simpledata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmlPackage.Literals.SCHEMA_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchemaUrl() {
		return schemaUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemaUrl(String newSchemaUrl) {
		String oldSchemaUrl = schemaUrl;
		schemaUrl = newSchemaUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.SCHEMA_DATA__SCHEMA_URL, oldSchemaUrl, schemaUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleData getSimpledata() {
		return simpledata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimpledata(SimpleData newSimpledata, NotificationChain msgs) {
		SimpleData oldSimpledata = simpledata;
		simpledata = newSimpledata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmlPackage.SCHEMA_DATA__SIMPLEDATA, oldSimpledata, newSimpledata);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpledata(SimpleData newSimpledata) {
		if (newSimpledata != simpledata) {
			NotificationChain msgs = null;
			if (simpledata != null)
				msgs = ((InternalEObject)simpledata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmlPackage.SCHEMA_DATA__SIMPLEDATA, null, msgs);
			if (newSimpledata != null)
				msgs = ((InternalEObject)newSimpledata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmlPackage.SCHEMA_DATA__SIMPLEDATA, null, msgs);
			msgs = basicSetSimpledata(newSimpledata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.SCHEMA_DATA__SIMPLEDATA, newSimpledata, newSimpledata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmlPackage.SCHEMA_DATA__SIMPLEDATA:
				return basicSetSimpledata(null, msgs);
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
			case KmlPackage.SCHEMA_DATA__SCHEMA_URL:
				return getSchemaUrl();
			case KmlPackage.SCHEMA_DATA__SIMPLEDATA:
				return getSimpledata();
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
			case KmlPackage.SCHEMA_DATA__SCHEMA_URL:
				setSchemaUrl((String)newValue);
				return;
			case KmlPackage.SCHEMA_DATA__SIMPLEDATA:
				setSimpledata((SimpleData)newValue);
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
			case KmlPackage.SCHEMA_DATA__SCHEMA_URL:
				setSchemaUrl(SCHEMA_URL_EDEFAULT);
				return;
			case KmlPackage.SCHEMA_DATA__SIMPLEDATA:
				setSimpledata((SimpleData)null);
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
			case KmlPackage.SCHEMA_DATA__SCHEMA_URL:
				return SCHEMA_URL_EDEFAULT == null ? schemaUrl != null : !SCHEMA_URL_EDEFAULT.equals(schemaUrl);
			case KmlPackage.SCHEMA_DATA__SIMPLEDATA:
				return simpledata != null;
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
		result.append(" (schemaUrl: ");
		result.append(schemaUrl);
		result.append(')');
		return result.toString();
	}

} //SchemaDataImpl
