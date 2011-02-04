/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Overlay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kml.Overlay#getColor <em>Color</em>}</li>
 *   <li>{@link kml.Overlay#getDrawOrder <em>Draw Order</em>}</li>
 *   <li>{@link kml.Overlay#getIcon <em>Icon</em>}</li>
 * </ul>
 * </p>
 *
 * @see kml.KmlPackage#getOverlay()
 * @model abstract="true"
 * @generated
 */
public interface Overlay extends Feature {
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
	 * @see kml.KmlPackage#getOverlay_Color()
	 * @model dataType="kml.Color"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link kml.Overlay#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Draw Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Draw Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Draw Order</em>' attribute.
	 * @see #setDrawOrder(int)
	 * @see kml.KmlPackage#getOverlay_DrawOrder()
	 * @model
	 * @generated
	 */
	int getDrawOrder();

	/**
	 * Sets the value of the '{@link kml.Overlay#getDrawOrder <em>Draw Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Draw Order</em>' attribute.
	 * @see #getDrawOrder()
	 * @generated
	 */
	void setDrawOrder(int value);

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' containment reference.
	 * @see #setIcon(Icon)
	 * @see kml.KmlPackage#getOverlay_Icon()
	 * @model containment="true"
	 * @generated
	 */
	Icon getIcon();

	/**
	 * Sets the value of the '{@link kml.Overlay#getIcon <em>Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' containment reference.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(Icon value);

} // Overlay
