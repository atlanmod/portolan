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
 * A representation of the model object '<em><b>Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kml.Style#getStyles <em>Styles</em>}</li>
 * </ul>
 * </p>
 *
 * @see kml.KmlPackage#getStyle()
 * @model
 * @generated
 */
public interface Style extends StyleSelector {
	/**
	 * Returns the value of the '<em><b>Styles</b></em>' containment reference list.
	 * The list contents are of type {@link kml.AbstractStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Styles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Styles</em>' containment reference list.
	 * @see kml.KmlPackage#getStyle_Styles()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractStyle> getStyles();

} // Style
