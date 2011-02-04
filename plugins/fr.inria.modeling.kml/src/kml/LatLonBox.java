/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lat Lon Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kml.LatLonBox#getNorth <em>North</em>}</li>
 *   <li>{@link kml.LatLonBox#getSouth <em>South</em>}</li>
 *   <li>{@link kml.LatLonBox#getEast <em>East</em>}</li>
 *   <li>{@link kml.LatLonBox#getWest <em>West</em>}</li>
 *   <li>{@link kml.LatLonBox#getRotation <em>Rotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see kml.KmlPackage#getLatLonBox()
 * @model
 * @generated
 */
public interface LatLonBox extends kml.Object {
	/**
	 * Returns the value of the '<em><b>North</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>North</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>North</em>' attribute.
	 * @see #setNorth(double)
	 * @see kml.KmlPackage#getLatLonBox_North()
	 * @model dataType="kml.Angle90"
	 * @generated
	 */
	double getNorth();

	/**
	 * Sets the value of the '{@link kml.LatLonBox#getNorth <em>North</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>North</em>' attribute.
	 * @see #getNorth()
	 * @generated
	 */
	void setNorth(double value);

	/**
	 * Returns the value of the '<em><b>South</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>South</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>South</em>' attribute.
	 * @see #setSouth(double)
	 * @see kml.KmlPackage#getLatLonBox_South()
	 * @model dataType="kml.Angle90"
	 * @generated
	 */
	double getSouth();

	/**
	 * Sets the value of the '{@link kml.LatLonBox#getSouth <em>South</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>South</em>' attribute.
	 * @see #getSouth()
	 * @generated
	 */
	void setSouth(double value);

	/**
	 * Returns the value of the '<em><b>East</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>East</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>East</em>' attribute.
	 * @see #setEast(double)
	 * @see kml.KmlPackage#getLatLonBox_East()
	 * @model dataType="kml.Angle180"
	 * @generated
	 */
	double getEast();

	/**
	 * Sets the value of the '{@link kml.LatLonBox#getEast <em>East</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>East</em>' attribute.
	 * @see #getEast()
	 * @generated
	 */
	void setEast(double value);

	/**
	 * Returns the value of the '<em><b>West</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>West</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>West</em>' attribute.
	 * @see #setWest(double)
	 * @see kml.KmlPackage#getLatLonBox_West()
	 * @model dataType="kml.Angle180"
	 * @generated
	 */
	double getWest();

	/**
	 * Sets the value of the '{@link kml.LatLonBox#getWest <em>West</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>West</em>' attribute.
	 * @see #getWest()
	 * @generated
	 */
	void setWest(double value);

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' attribute.
	 * @see #setRotation(double)
	 * @see kml.KmlPackage#getLatLonBox_Rotation()
	 * @model dataType="kml.Angle180"
	 * @generated
	 */
	double getRotation();

	/**
	 * Sets the value of the '{@link kml.LatLonBox#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' attribute.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(double value);

} // LatLonBox
