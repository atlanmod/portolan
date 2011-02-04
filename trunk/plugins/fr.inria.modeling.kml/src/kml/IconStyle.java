/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Icon Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kml.IconStyle#getScale <em>Scale</em>}</li>
 *   <li>{@link kml.IconStyle#getHeading <em>Heading</em>}</li>
 *   <li>{@link kml.IconStyle#getIcon <em>Icon</em>}</li>
 *   <li>{@link kml.IconStyle#getHotSpot <em>Hot Spot</em>}</li>
 * </ul>
 * </p>
 *
 * @see kml.KmlPackage#getIconStyle()
 * @model
 * @generated
 */
public interface IconStyle extends ColorStyle {
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
	 * @see kml.KmlPackage#getIconStyle_Scale()
	 * @model
	 * @generated
	 */
	double getScale();

	/**
	 * Sets the value of the '{@link kml.IconStyle#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(double value);

	/**
	 * Returns the value of the '<em><b>Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heading</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heading</em>' attribute.
	 * @see #setHeading(double)
	 * @see kml.KmlPackage#getIconStyle_Heading()
	 * @model
	 * @generated
	 */
	double getHeading();

	/**
	 * Sets the value of the '{@link kml.IconStyle#getHeading <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heading</em>' attribute.
	 * @see #getHeading()
	 * @generated
	 */
	void setHeading(double value);

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
	 * @see kml.KmlPackage#getIconStyle_Icon()
	 * @model containment="true"
	 * @generated
	 */
	Icon getIcon();

	/**
	 * Sets the value of the '{@link kml.IconStyle#getIcon <em>Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' containment reference.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(Icon value);

	/**
	 * Returns the value of the '<em><b>Hot Spot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hot Spot</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hot Spot</em>' containment reference.
	 * @see #setHotSpot(Vec2Type)
	 * @see kml.KmlPackage#getIconStyle_HotSpot()
	 * @model containment="true"
	 * @generated
	 */
	Vec2Type getHotSpot();

	/**
	 * Sets the value of the '{@link kml.IconStyle#getHotSpot <em>Hot Spot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hot Spot</em>' containment reference.
	 * @see #getHotSpot()
	 * @generated
	 */
	void setHotSpot(Vec2Type value);

} // IconStyle
