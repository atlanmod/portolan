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
 * A representation of the model object '<em><b>Alias</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kml.Alias#getTargetHref <em>Target Href</em>}</li>
 *   <li>{@link kml.Alias#getSourceHref <em>Source Href</em>}</li>
 * </ul>
 * </p>
 *
 * @see kml.KmlPackage#getAlias()
 * @model
 * @generated
 */
public interface Alias extends EObject {
	/**
	 * Returns the value of the '<em><b>Target Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Href</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Href</em>' attribute.
	 * @see #setTargetHref(String)
	 * @see kml.KmlPackage#getAlias_TargetHref()
	 * @model required="true"
	 * @generated
	 */
	String getTargetHref();

	/**
	 * Sets the value of the '{@link kml.Alias#getTargetHref <em>Target Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Href</em>' attribute.
	 * @see #getTargetHref()
	 * @generated
	 */
	void setTargetHref(String value);

	/**
	 * Returns the value of the '<em><b>Source Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Href</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Href</em>' attribute.
	 * @see #setSourceHref(String)
	 * @see kml.KmlPackage#getAlias_SourceHref()
	 * @model required="true"
	 * @generated
	 */
	String getSourceHref();

	/**
	 * Sets the value of the '{@link kml.Alias#getSourceHref <em>Source Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Href</em>' attribute.
	 * @see #getSourceHref()
	 * @generated
	 */
	void setSourceHref(String value);

} // Alias
