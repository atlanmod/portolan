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
 * A representation of the model object '<em><b>Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kml.Pair#getId <em>Id</em>}</li>
 *   <li>{@link kml.Pair#getKey <em>Key</em>}</li>
 *   <li>{@link kml.Pair#getStyleUrl <em>Style Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see kml.KmlPackage#getPair()
 * @model
 * @generated
 */
public interface Pair extends EObject {
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
	 * @see kml.KmlPackage#getPair_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link kml.Pair#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * The literals are from the enumeration {@link kml.StyleState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see kml.StyleState
	 * @see #setKey(StyleState)
	 * @see kml.KmlPackage#getPair_Key()
	 * @model
	 * @generated
	 */
	StyleState getKey();

	/**
	 * Sets the value of the '{@link kml.Pair#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see kml.StyleState
	 * @see #getKey()
	 * @generated
	 */
	void setKey(StyleState value);

	/**
	 * Returns the value of the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Url</em>' attribute.
	 * @see #setStyleUrl(String)
	 * @see kml.KmlPackage#getPair_StyleUrl()
	 * @model
	 * @generated
	 */
	String getStyleUrl();

	/**
	 * Sets the value of the '{@link kml.Pair#getStyleUrl <em>Style Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Url</em>' attribute.
	 * @see #getStyleUrl()
	 * @generated
	 */
	void setStyleUrl(String value);

} // Pair
