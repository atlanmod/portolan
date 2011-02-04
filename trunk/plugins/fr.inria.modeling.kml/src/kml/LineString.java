/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kml.LineString#isExtrude <em>Extrude</em>}</li>
 *   <li>{@link kml.LineString#isTessellate <em>Tessellate</em>}</li>
 *   <li>{@link kml.LineString#getMode <em>Mode</em>}</li>
 *   <li>{@link kml.LineString#getCoordinates <em>Coordinates</em>}</li>
 * </ul>
 * </p>
 *
 * @see kml.KmlPackage#getLineString()
 * @model
 * @generated
 */
public interface LineString extends Geometry {
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
	 * @see kml.KmlPackage#getLineString_Extrude()
	 * @model
	 * @generated
	 */
	boolean isExtrude();

	/**
	 * Sets the value of the '{@link kml.LineString#isExtrude <em>Extrude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrude</em>' attribute.
	 * @see #isExtrude()
	 * @generated
	 */
	void setExtrude(boolean value);

	/**
	 * Returns the value of the '<em><b>Tessellate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tessellate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tessellate</em>' attribute.
	 * @see #setTessellate(boolean)
	 * @see kml.KmlPackage#getLineString_Tessellate()
	 * @model
	 * @generated
	 */
	boolean isTessellate();

	/**
	 * Sets the value of the '{@link kml.LineString#isTessellate <em>Tessellate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tessellate</em>' attribute.
	 * @see #isTessellate()
	 * @generated
	 */
	void setTessellate(boolean value);

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
	 * @see kml.KmlPackage#getLineString_Mode()
	 * @model
	 * @generated
	 */
	AltitudeMode getMode();

	/**
	 * Sets the value of the '{@link kml.LineString#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see kml.AltitudeMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(AltitudeMode value);

	/**
	 * Returns the value of the '<em><b>Coordinates</b></em>' containment reference list.
	 * The list contents are of type {@link kml.Coordinate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates</em>' containment reference list.
	 * @see kml.KmlPackage#getLineString_Coordinates()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Coordinate> getCoordinates();

} // LineString
