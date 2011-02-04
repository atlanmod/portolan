/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orientation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kml.Orientation#getHeading <em>Heading</em>}</li>
 *   <li>{@link kml.Orientation#getTilt <em>Tilt</em>}</li>
 *   <li>{@link kml.Orientation#getRoll <em>Roll</em>}</li>
 * </ul>
 * </p>
 *
 * @see kml.KmlPackage#getOrientation()
 * @model
 * @generated
 */
public interface Orientation extends kml.Object {
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
	 * @see kml.KmlPackage#getOrientation_Heading()
	 * @model dataType="kml.Angle360" required="true"
	 * @generated
	 */
	double getHeading();

	/**
	 * Sets the value of the '{@link kml.Orientation#getHeading <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heading</em>' attribute.
	 * @see #getHeading()
	 * @generated
	 */
	void setHeading(double value);

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
	 * @see kml.KmlPackage#getOrientation_Tilt()
	 * @model dataType="kml.Angle360" required="true"
	 * @generated
	 */
	double getTilt();

	/**
	 * Sets the value of the '{@link kml.Orientation#getTilt <em>Tilt</em>}' attribute.
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
	 * @see kml.KmlPackage#getOrientation_Roll()
	 * @model dataType="kml.Angle360" required="true"
	 * @generated
	 */
	double getRoll();

	/**
	 * Sets the value of the '{@link kml.Orientation#getRoll <em>Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll</em>' attribute.
	 * @see #getRoll()
	 * @generated
	 */
	void setRoll(double value);

} // Orientation
