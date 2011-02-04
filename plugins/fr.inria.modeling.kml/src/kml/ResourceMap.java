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
 * A representation of the model object '<em><b>Resource Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kml.ResourceMap#getAliases <em>Aliases</em>}</li>
 * </ul>
 * </p>
 *
 * @see kml.KmlPackage#getResourceMap()
 * @model
 * @generated
 */
public interface ResourceMap extends EObject {
	/**
	 * Returns the value of the '<em><b>Aliases</b></em>' containment reference list.
	 * The list contents are of type {@link kml.Alias}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aliases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aliases</em>' containment reference list.
	 * @see kml.KmlPackage#getResourceMap_Aliases()
	 * @model containment="true"
	 * @generated
	 */
	EList<Alias> getAliases();

} // ResourceMap
