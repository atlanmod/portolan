/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Balloon Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kml.BalloonStyle#getBgColor <em>Bg Color</em>}</li>
 *   <li>{@link kml.BalloonStyle#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link kml.BalloonStyle#getText <em>Text</em>}</li>
 *   <li>{@link kml.BalloonStyle#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see kml.KmlPackage#getBalloonStyle()
 * @model
 * @generated
 */
public interface BalloonStyle extends AbstractStyle {
	/**
	 * Returns the value of the '<em><b>Bg Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bg Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bg Color</em>' attribute.
	 * @see #setBgColor(String)
	 * @see kml.KmlPackage#getBalloonStyle_BgColor()
	 * @model dataType="kml.Color"
	 * @generated
	 */
	String getBgColor();

	/**
	 * Sets the value of the '{@link kml.BalloonStyle#getBgColor <em>Bg Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bg Color</em>' attribute.
	 * @see #getBgColor()
	 * @generated
	 */
	void setBgColor(String value);

	/**
	 * Returns the value of the '<em><b>Text Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Color</em>' attribute.
	 * @see #setTextColor(String)
	 * @see kml.KmlPackage#getBalloonStyle_TextColor()
	 * @model dataType="kml.Color"
	 * @generated
	 */
	String getTextColor();

	/**
	 * Sets the value of the '{@link kml.BalloonStyle#getTextColor <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Color</em>' attribute.
	 * @see #getTextColor()
	 * @generated
	 */
	void setTextColor(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see kml.KmlPackage#getBalloonStyle_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link kml.BalloonStyle#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link kml.DisplayMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see kml.DisplayMode
	 * @see #setMode(DisplayMode)
	 * @see kml.KmlPackage#getBalloonStyle_Mode()
	 * @model
	 * @generated
	 */
	DisplayMode getMode();

	/**
	 * Sets the value of the '{@link kml.BalloonStyle#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see kml.DisplayMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(DisplayMode value);

} // BalloonStyle
