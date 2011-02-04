/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Look At</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kml.LookAt#getTilt <em>Tilt</em>}</li>
 *   <li>{@link kml.LookAt#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see kml.KmlPackage#getLookAt()
 * @model
 * @generated
 */
public interface LookAt extends AbstractView {
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
	 * @see kml.KmlPackage#getLookAt_Tilt()
	 * @model dataType="kml.AnglePos90"
	 * @generated
	 */
	double getTilt();

	/**
	 * Sets the value of the '{@link kml.LookAt#getTilt <em>Tilt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tilt</em>' attribute.
	 * @see #getTilt()
	 * @generated
	 */
	void setTilt(double value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' attribute.
	 * @see #setRange(double)
	 * @see kml.KmlPackage#getLookAt_Range()
	 * @model
	 * @generated
	 */
	double getRange();

	/**
	 * Sets the value of the '{@link kml.LookAt#getRange <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' attribute.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(double value);

} // LookAt
