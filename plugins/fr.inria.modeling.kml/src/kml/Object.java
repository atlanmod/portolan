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
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kml.Object#getId <em>Id</em>}</li>
 *   <li>{@link kml.Object#getTargetId <em>Target Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see kml.KmlPackage#getObject()
 * @model abstract="true"
 * @generated
 */
public interface Object extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see kml.KmlPackage#getObject_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link kml.Object#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Id</em>' attribute.
	 * @see #setTargetId(String)
	 * @see kml.KmlPackage#getObject_TargetId()
	 * @model
	 * @generated
	 */
	String getTargetId();

	/**
	 * Sets the value of the '{@link kml.Object#getTargetId <em>Target Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Id</em>' attribute.
	 * @see #getTargetId()
	 * @generated
	 */
	void setTargetId(String value);

} // Object
