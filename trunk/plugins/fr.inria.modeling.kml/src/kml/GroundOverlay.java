/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ground Overlay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kml.GroundOverlay#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link kml.GroundOverlay#getMode <em>Mode</em>}</li>
 *   <li>{@link kml.GroundOverlay#getLatLonBox <em>Lat Lon Box</em>}</li>
 * </ul>
 * </p>
 *
 * @see kml.KmlPackage#getGroundOverlay()
 * @model
 * @generated
 */
public interface GroundOverlay extends Overlay {
	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude</em>' attribute.
	 * @see #setAltitude(double)
	 * @see kml.KmlPackage#getGroundOverlay_Altitude()
	 * @model
	 * @generated
	 */
	double getAltitude();

	/**
	 * Sets the value of the '{@link kml.GroundOverlay#getAltitude <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' attribute.
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(double value);

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
	 * @see kml.KmlPackage#getGroundOverlay_Mode()
	 * @model
	 * @generated
	 */
	AltitudeMode getMode();

	/**
	 * Sets the value of the '{@link kml.GroundOverlay#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see kml.AltitudeMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(AltitudeMode value);

	/**
	 * Returns the value of the '<em><b>Lat Lon Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lat Lon Box</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat Lon Box</em>' containment reference.
	 * @see #setLatLonBox(LatLonBox)
	 * @see kml.KmlPackage#getGroundOverlay_LatLonBox()
	 * @model containment="true"
	 * @generated
	 */
	LatLonBox getLatLonBox();

	/**
	 * Sets the value of the '{@link kml.GroundOverlay#getLatLonBox <em>Lat Lon Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lat Lon Box</em>' containment reference.
	 * @see #getLatLonBox()
	 * @generated
	 */
	void setLatLonBox(LatLonBox value);

} // GroundOverlay
