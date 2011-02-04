/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camera</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kml.Camera#getTilt <em>Tilt</em>}</li>
 *   <li>{@link kml.Camera#getRoll <em>Roll</em>}</li>
 * </ul>
 * </p>
 *
 * @see kml.KmlPackage#getCamera()
 * @model
 * @generated
 */
public interface Camera extends AbstractView {
	/**
	 * Returns the value of the '<em><b>Tilt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tilt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tilt</em>' attribute.
	 * @see #setTilt(double)
	 * @see kml.KmlPackage#getCamera_Tilt()
	 * @model dataType="kml.AnglePos180"
	 * @generated
	 */
	double getTilt();

	/**
	 * Sets the value of the '{@link kml.Camera#getTilt <em>Tilt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tilt</em>' attribute.
	 * @see #getTilt()
	 * @generated
	 */
	void setTilt(double value);

	/**
	 * Returns the value of the '<em><b>Roll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roll</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roll</em>' attribute.
	 * @see #setRoll(double)
	 * @see kml.KmlPackage#getCamera_Roll()
	 * @model dataType="kml.Angle180"
	 * @generated
	 */
	double getRoll();

	/**
	 * Sets the value of the '{@link kml.Camera#getRoll <em>Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll</em>' attribute.
	 * @see #getRoll()
	 * @generated
	 */
	void setRoll(double value);

} // Camera
