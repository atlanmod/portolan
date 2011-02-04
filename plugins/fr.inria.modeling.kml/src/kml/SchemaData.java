/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kml.SchemaData#getSchemaUrl <em>Schema Url</em>}</li>
 *   <li>{@link kml.SchemaData#getSimpledata <em>Simpledata</em>}</li>
 * </ul>
 * </p>
 *
 * @see kml.KmlPackage#getSchemaData()
 * @model
 * @generated
 */
public interface SchemaData extends EObject {
	/**
	 * Returns the value of the '<em><b>Schema Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Url</em>' attribute.
	 * @see #setSchemaUrl(String)
	 * @see kml.KmlPackage#getSchemaData_SchemaUrl()
	 * @model required="true"
	 * @generated
	 */
	String getSchemaUrl();

	/**
	 * Sets the value of the '{@link kml.SchemaData#getSchemaUrl <em>Schema Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Url</em>' attribute.
	 * @see #getSchemaUrl()
	 * @generated
	 */
	void setSchemaUrl(String value);

	/**
	 * Returns the value of the '<em><b>Simpledata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simpledata</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simpledata</em>' containment reference.
	 * @see #setSimpledata(SimpleData)
	 * @see kml.KmlPackage#getSchemaData_Simpledata()
	 * @model containment="true"
	 * @generated
	 */
	SimpleData getSimpledata();

	/**
	 * Sets the value of the '{@link kml.SchemaData#getSimpledata <em>Simpledata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simpledata</em>' containment reference.
	 * @see #getSimpledata()
	 * @generated
	 */
	void setSimpledata(SimpleData value);

} // SchemaData
