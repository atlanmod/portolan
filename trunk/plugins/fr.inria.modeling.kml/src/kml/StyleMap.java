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
 * A representation of the model object '<em><b>Style Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kml.StyleMap#getPairs <em>Pairs</em>}</li>
 * </ul>
 * </p>
 *
 * @see kml.KmlPackage#getStyleMap()
 * @model
 * @generated
 */
public interface StyleMap extends StyleSelector {
	/**
	 * Returns the value of the '<em><b>Pairs</b></em>' containment reference list.
	 * The list contents are of type {@link kml.Pair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pairs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pairs</em>' containment reference list.
	 * @see kml.KmlPackage#getStyleMap_Pairs()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Pair> getPairs();

} // StyleMap
