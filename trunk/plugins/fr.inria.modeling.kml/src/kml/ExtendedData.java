/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kml.ExtendedData#getData <em>Data</em>}</li>
 *   <li>{@link kml.ExtendedData#getSchemaData <em>Schema Data</em>}</li>
 *   <li>{@link kml.ExtendedData#getXmlContent <em>Xml Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see kml.KmlPackage#getExtendedData()
 * @model
 * @generated
 */
public interface ExtendedData extends EObject {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link kml.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see kml.KmlPackage#getExtendedData_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getData();

	/**
	 * Returns the value of the '<em><b>Schema Data</b></em>' containment reference list.
	 * The list contents are of type {@link kml.SchemaData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Data</em>' containment reference list.
	 * @see kml.KmlPackage#getExtendedData_SchemaData()
	 * @model containment="true"
	 * @generated
	 */
	EList<SchemaData> getSchemaData();

	/**
	 * Returns the value of the '<em><b>Xml Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xml Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Content</em>' attribute.
	 * @see #setXmlContent(String)
	 * @see kml.KmlPackage#getExtendedData_XmlContent()
	 * @model
	 * @generated
	 */
	String getXmlContent();

	/**
	 * Sets the value of the '{@link kml.ExtendedData#getXmlContent <em>Xml Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Content</em>' attribute.
	 * @see #getXmlContent()
	 * @generated
	 */
	void setXmlContent(String value);

} // ExtendedData
