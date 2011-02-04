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
 * A representation of the model object '<em><b>Vec2 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kml.Vec2Type#getX <em>X</em>}</li>
 *   <li>{@link kml.Vec2Type#getY <em>Y</em>}</li>
 *   <li>{@link kml.Vec2Type#getXunits <em>Xunits</em>}</li>
 *   <li>{@link kml.Vec2Type#getYunits <em>Yunits</em>}</li>
 * </ul>
 * </p>
 *
 * @see kml.KmlPackage#getVec2Type()
 * @model
 * @generated
 */
public interface Vec2Type extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(double)
	 * @see kml.KmlPackage#getVec2Type_X()
	 * @model required="true"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link kml.Vec2Type#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(double value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(double)
	 * @see kml.KmlPackage#getVec2Type_Y()
	 * @model required="true"
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link kml.Vec2Type#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(double value);

	/**
	 * Returns the value of the '<em><b>Xunits</b></em>' attribute.
	 * The literals are from the enumeration {@link kml.Units}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xunits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xunits</em>' attribute.
	 * @see kml.Units
	 * @see #setXunits(Units)
	 * @see kml.KmlPackage#getVec2Type_Xunits()
	 * @model
	 * @generated
	 */
	Units getXunits();

	/**
	 * Sets the value of the '{@link kml.Vec2Type#getXunits <em>Xunits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xunits</em>' attribute.
	 * @see kml.Units
	 * @see #getXunits()
	 * @generated
	 */
	void setXunits(Units value);

	/**
	 * Returns the value of the '<em><b>Yunits</b></em>' attribute.
	 * The literals are from the enumeration {@link kml.Units}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Yunits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yunits</em>' attribute.
	 * @see kml.Units
	 * @see #setYunits(Units)
	 * @see kml.KmlPackage#getVec2Type_Yunits()
	 * @model
	 * @generated
	 */
	Units getYunits();

	/**
	 * Sets the value of the '{@link kml.Vec2Type#getYunits <em>Yunits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yunits</em>' attribute.
	 * @see kml.Units
	 * @see #getYunits()
	 * @generated
	 */
	void setYunits(Units value);

} // Vec2Type
