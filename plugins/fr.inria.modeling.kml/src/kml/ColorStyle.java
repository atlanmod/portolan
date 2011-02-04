/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kml.ColorStyle#getColor <em>Color</em>}</li>
 *   <li>{@link kml.ColorStyle#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see kml.KmlPackage#getColorStyle()
 * @model abstract="true"
 * @generated
 */
public interface ColorStyle extends AbstractStyle {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see kml.KmlPackage#getColorStyle_Color()
	 * @model dataType="kml.Color"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link kml.ColorStyle#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link kml.ColorMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see kml.ColorMode
	 * @see #setMode(ColorMode)
	 * @see kml.KmlPackage#getColorStyle_Mode()
	 * @model
	 * @generated
	 */
	ColorMode getMode();

	/**
	 * Sets the value of the '{@link kml.ColorStyle#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see kml.ColorMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ColorMode value);

} // ColorStyle
