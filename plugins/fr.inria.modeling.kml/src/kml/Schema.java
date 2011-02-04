/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kml.Schema#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see kml.KmlPackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends kml.Object {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' reference list.
	 * The list contents are of type {@link kml.SimpleField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' reference list.
	 * @see kml.KmlPackage#getSchema_Fields()
	 * @model
	 * @generated
	 */
	EList<SimpleField> getFields();

} // Schema
