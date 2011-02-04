/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Screen Overlay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kml.ScreenOverlay#getOverlayXY <em>Overlay XY</em>}</li>
 *   <li>{@link kml.ScreenOverlay#getScreenXY <em>Screen XY</em>}</li>
 *   <li>{@link kml.ScreenOverlay#getRotation <em>Rotation</em>}</li>
 *   <li>{@link kml.ScreenOverlay#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see kml.KmlPackage#getScreenOverlay()
 * @model
 * @generated
 */
public interface ScreenOverlay extends Overlay {
	/**
	 * Returns the value of the '<em><b>Overlay XY</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overlay XY</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overlay XY</em>' containment reference.
	 * @see #setOverlayXY(Vec2Type)
	 * @see kml.KmlPackage#getScreenOverlay_OverlayXY()
	 * @model containment="true"
	 * @generated
	 */
	Vec2Type getOverlayXY();

	/**
	 * Sets the value of the '{@link kml.ScreenOverlay#getOverlayXY <em>Overlay XY</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overlay XY</em>' containment reference.
	 * @see #getOverlayXY()
	 * @generated
	 */
	void setOverlayXY(Vec2Type value);

	/**
	 * Returns the value of the '<em><b>Screen XY</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screen XY</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screen XY</em>' containment reference.
	 * @see #setScreenXY(Vec2Type)
	 * @see kml.KmlPackage#getScreenOverlay_ScreenXY()
	 * @model containment="true"
	 * @generated
	 */
	Vec2Type getScreenXY();

	/**
	 * Sets the value of the '{@link kml.ScreenOverlay#getScreenXY <em>Screen XY</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screen XY</em>' containment reference.
	 * @see #getScreenXY()
	 * @generated
	 */
	void setScreenXY(Vec2Type value);

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' containment reference.
	 * @see #setRotation(Vec2Type)
	 * @see kml.KmlPackage#getScreenOverlay_Rotation()
	 * @model containment="true"
	 * @generated
	 */
	Vec2Type getRotation();

	/**
	 * Sets the value of the '{@link kml.ScreenOverlay#getRotation <em>Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' containment reference.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(Vec2Type value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(Vec2Type)
	 * @see kml.KmlPackage#getScreenOverlay_Size()
	 * @model containment="true"
	 * @generated
	 */
	Vec2Type getSize();

	/**
	 * Sets the value of the '{@link kml.ScreenOverlay#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Vec2Type value);

} // ScreenOverlay
