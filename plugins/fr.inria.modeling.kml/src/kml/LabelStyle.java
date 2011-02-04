/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kml.LabelStyle#getScale <em>Scale</em>}</li>
 * </ul>
 * </p>
 *
 * @see kml.KmlPackage#getLabelStyle()
 * @model
 * @generated
 */
public interface LabelStyle extends ColorStyle {
	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(double)
	 * @see kml.KmlPackage#getLabelStyle_Scale()
	 * @model
	 * @generated
	 */
	double getScale();

	/**
	 * Sets the value of the '{@link kml.LabelStyle#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(double value);

} // LabelStyle
