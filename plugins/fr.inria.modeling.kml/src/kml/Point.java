/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kml.Point#isExtrude <em>Extrude</em>}</li>
 *   <li>{@link kml.Point#getMode <em>Mode</em>}</li>
 *   <li>{@link kml.Point#getCoordinates <em>Coordinates</em>}</li>
 * </ul>
 * </p>
 *
 * @see kml.KmlPackage#getPoint()
 * @model
 * @generated
 */
public interface Point extends Geometry {
	/**
	 * Returns the value of the '<em><b>Extrude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrude</em>' attribute.
	 * @see #setExtrude(boolean)
	 * @see kml.KmlPackage#getPoint_Extrude()
	 * @model
	 * @generated
	 */
	boolean isExtrude();

	/**
	 * Sets the value of the '{@link kml.Point#isExtrude <em>Extrude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrude</em>' attribute.
	 * @see #isExtrude()
	 * @generated
	 */
	void setExtrude(boolean value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link kml.AltitudeMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see kml.AltitudeMode
	 * @see #setMode(AltitudeMode)
	 * @see kml.KmlPackage#getPoint_Mode()
	 * @model
	 * @generated
	 */
	AltitudeMode getMode();

	/**
	 * Sets the value of the '{@link kml.Point#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see kml.AltitudeMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(AltitudeMode value);

	/**
	 * Returns the value of the '<em><b>Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinates</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates</em>' containment reference.
	 * @see #setCoordinates(Coordinate)
	 * @see kml.KmlPackage#getPoint_Coordinates()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Coordinate getCoordinates();

	/**
	 * Sets the value of the '{@link kml.Point#getCoordinates <em>Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinates</em>' containment reference.
	 * @see #getCoordinates()
	 * @generated
	 */
	void setCoordinates(Coordinate value);

} // Point
