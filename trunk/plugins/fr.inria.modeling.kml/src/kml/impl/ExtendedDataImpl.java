/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml.impl;

import java.util.Collection;

import kml.Data;
import kml.ExtendedData;
import kml.KmlPackage;
import kml.SchemaData;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kml.impl.ExtendedDataImpl#getData <em>Data</em>}</li>
 *   <li>{@link kml.impl.ExtendedDataImpl#getSchemaData <em>Schema Data</em>}</li>
 *   <li>{@link kml.impl.ExtendedDataImpl#getXmlContent <em>Xml Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendedDataImpl extends EObjectImpl implements ExtendedData {
	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> data;

	/**
	 * The cached value of the '{@link #getSchemaData() <em>Schema Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaData()
	 * @generated
	 * @ordered
	 */
	protected EList<SchemaData> schemaData;

	/**
	 * The default value of the '{@link #getXmlContent() <em>Xml Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlContent()
	 * @generated
	 * @ordered
	 */
	protected static final String XML_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXmlContent() <em>Xml Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlContent()
	 * @generated
	 * @ordered
	 */
	protected String xmlContent = XML_CONTENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmlPackage.Literals.EXTENDED_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<Data>(Data.class, this, KmlPackage.EXTENDED_DATA__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SchemaData> getSchemaData() {
		if (schemaData == null) {
			schemaData = new EObjectContainmentEList<SchemaData>(SchemaData.class, this, KmlPackage.EXTENDED_DATA__SCHEMA_DATA);
		}
		return schemaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXmlContent() {
		return xmlContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXmlContent(String newXmlContent) {
		String oldXmlContent = xmlContent;
		xmlContent = newXmlContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.EXTENDED_DATA__XML_CONTENT, oldXmlContent, xmlContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmlPackage.EXTENDED_DATA__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
			case KmlPackage.EXTENDED_DATA__SCHEMA_DATA:
				return ((InternalEList<?>)getSchemaData()).basicRemove(otherEnd, msgs);
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
			case KmlPackage.EXTENDED_DATA__DATA:
				return getData();
			case KmlPackage.EXTENDED_DATA__SCHEMA_DATA:
				return getSchemaData();
			case KmlPackage.EXTENDED_DATA__XML_CONTENT:
				return getXmlContent();
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
			case KmlPackage.EXTENDED_DATA__DATA:
				getData().clear();
				getData().addAll((Collection<? extends Data>)newValue);
				return;
			case KmlPackage.EXTENDED_DATA__SCHEMA_DATA:
				getSchemaData().clear();
				getSchemaData().addAll((Collection<? extends SchemaData>)newValue);
				return;
			case KmlPackage.EXTENDED_DATA__XML_CONTENT:
				setXmlContent((String)newValue);
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
			case KmlPackage.EXTENDED_DATA__DATA:
				getData().clear();
				return;
			case KmlPackage.EXTENDED_DATA__SCHEMA_DATA:
				getSchemaData().clear();
				return;
			case KmlPackage.EXTENDED_DATA__XML_CONTENT:
				setXmlContent(XML_CONTENT_EDEFAULT);
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
			case KmlPackage.EXTENDED_DATA__DATA:
				return data != null && !data.isEmpty();
			case KmlPackage.EXTENDED_DATA__SCHEMA_DATA:
				return schemaData != null && !schemaData.isEmpty();
			case KmlPackage.EXTENDED_DATA__XML_CONTENT:
				return XML_CONTENT_EDEFAULT == null ? xmlContent != null : !XML_CONTENT_EDEFAULT.equals(xmlContent);
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
		result.append(" (xmlContent: ");
		result.append(xmlContent);
		result.append(')');
		return result.toString();
	}

} //ExtendedDataImpl
