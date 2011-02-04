/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lat Lon Alt Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kml.LatLonAltBox#getMinAltitude <em>Min Altitude</em>}</li>
 *   <li>{@link kml.LatLonAltBox#getMaxAltitude <em>Max Altitude</em>}</li>
 *   <li>{@link kml.LatLonAltBox#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see kml.KmlPackage#getLatLonAltBox()
 * @model
 * @generated
 */
public interface LatLonAltBox extends LatLonBox {
	/**
	 * Returns the value of the '<em><b>Min Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Altitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Altitude</em>' attribute.
	 * @see #setMinAltitude(double)
	 * @see kml.KmlPackage#getLatLonAltBox_MinAltitude()
	 * @model
	 * @generated
	 */
	double getMinAltitude();

	/**
	 * Sets the value of the '{@link kml.LatLonAltBox#getMinAltitude <em>Min Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Altitude</em>' attribute.
	 * @see #getMinAltitude()
	 * @generated
	 */
	void setMinAltitude(double value);

	/**
	 * Returns the value of the '<em><b>Max Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Altitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Altitude</em>' attribute.
	 * @see #setMaxAltitude(double)
	 * @see kml.KmlPackage#getLatLonAltBox_MaxAltitude()
	 * @model
	 * @generated
	 */
	double getMaxAltitude();

	/**
	 * Sets the value of the '{@link kml.LatLonAltBox#getMaxAltitude <em>Max Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Altitude</em>' attribute.
	 * @see #getMaxAltitude()
	 * @generated
	 */
	void setMaxAltitude(double value);

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
	 * @see kml.KmlPackage#getLatLonAltBox_Mode()
	 * @model
	 * @generated
	 */
	AltitudeMode getMode();

	/**
	 * Sets the value of the '{@link kml.LatLonAltBox#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see kml.AltitudeMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(AltitudeMode value);

} // LatLonAltBox
