/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Volume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kml.ViewVolume#getLeftFov <em>Left Fov</em>}</li>
 *   <li>{@link kml.ViewVolume#getRightFov <em>Right Fov</em>}</li>
 *   <li>{@link kml.ViewVolume#getBottomFov <em>Bottom Fov</em>}</li>
 *   <li>{@link kml.ViewVolume#getTopFov <em>Top Fov</em>}</li>
 *   <li>{@link kml.ViewVolume#getNear <em>Near</em>}</li>
 * </ul>
 * </p>
 *
 * @see kml.KmlPackage#getViewVolume()
 * @model
 * @generated
 */
public interface ViewVolume extends EObject {
	/**
	 * Returns the value of the '<em><b>Left Fov</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Fov</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Fov</em>' attribute.
	 * @see #setLeftFov(double)
	 * @see kml.KmlPackage#getViewVolume_LeftFov()
	 * @model dataType="kml.Angle180"
	 * @generated
	 */
	double getLeftFov();

	/**
	 * Sets the value of the '{@link kml.ViewVolume#getLeftFov <em>Left Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Fov</em>' attribute.
	 * @see #getLeftFov()
	 * @generated
	 */
	void setLeftFov(double value);

	/**
	 * Returns the value of the '<em><b>Right Fov</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Fov</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Fov</em>' attribute.
	 * @see #setRightFov(double)
	 * @see kml.KmlPackage#getViewVolume_RightFov()
	 * @model dataType="kml.Angle180"
	 * @generated
	 */
	double getRightFov();

	/**
	 * Sets the value of the '{@link kml.ViewVolume#getRightFov <em>Right Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Fov</em>' attribute.
	 * @see #getRightFov()
	 * @generated
	 */
	void setRightFov(double value);

	/**
	 * Returns the value of the '<em><b>Bottom Fov</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bottom Fov</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom Fov</em>' attribute.
	 * @see #setBottomFov(double)
	 * @see kml.KmlPackage#getViewVolume_BottomFov()
	 * @model dataType="kml.Angle90"
	 * @generated
	 */
	double getBottomFov();

	/**
	 * Sets the value of the '{@link kml.ViewVolume#getBottomFov <em>Bottom Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottom Fov</em>' attribute.
	 * @see #getBottomFov()
	 * @generated
	 */
	void setBottomFov(double value);

	/**
	 * Returns the value of the '<em><b>Top Fov</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Fov</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Fov</em>' attribute.
	 * @see #setTopFov(double)
	 * @see kml.KmlPackage#getViewVolume_TopFov()
	 * @model dataType="kml.Angle90"
	 * @generated
	 */
	double getTopFov();

	/**
	 * Sets the value of the '{@link kml.ViewVolume#getTopFov <em>Top Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Fov</em>' attribute.
	 * @see #getTopFov()
	 * @generated
	 */
	void setTopFov(double value);

	/**
	 * Returns the value of the '<em><b>Near</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Near</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Near</em>' attribute.
	 * @see #setNear(double)
	 * @see kml.KmlPackage#getViewVolume_Near()
	 * @model
	 * @generated
	 */
	double getNear();

	/**
	 * Sets the value of the '{@link kml.ViewVolume#getNear <em>Near</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Near</em>' attribute.
	 * @see #getNear()
	 * @generated
	 */
	void setNear(double value);

} // ViewVolume
