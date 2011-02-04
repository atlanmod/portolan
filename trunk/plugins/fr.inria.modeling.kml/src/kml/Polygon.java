/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polygon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kml.Polygon#isExtrude <em>Extrude</em>}</li>
 *   <li>{@link kml.Polygon#isTessellate <em>Tessellate</em>}</li>
 *   <li>{@link kml.Polygon#getMode <em>Mode</em>}</li>
 *   <li>{@link kml.Polygon#getInnerBoundaryIs <em>Inner Boundary Is</em>}</li>
 *   <li>{@link kml.Polygon#getOuterBoundaryIs <em>Outer Boundary Is</em>}</li>
 * </ul>
 * </p>
 *
 * @see kml.KmlPackage#getPolygon()
 * @model
 * @generated
 */
public interface Polygon extends Geometry {
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
	 * @see kml.KmlPackage#getPolygon_Extrude()
	 * @model
	 * @generated
	 */
	boolean isExtrude();

	/**
	 * Sets the value of the '{@link kml.Polygon#isExtrude <em>Extrude</em>}' attribute.
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
	 * @see kml.KmlPackage#getPolygon_Tessellate()
	 * @model
	 * @generated
	 */
	boolean isTessellate();

	/**
	 * Sets the value of the '{@link kml.Polygon#isTessellate <em>Tessellate</em>}' attribute.
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
	 * @see kml.KmlPackage#getPolygon_Mode()
	 * @model
	 * @generated
	 */
	AltitudeMode getMode();

	/**
	 * Sets the value of the '{@link kml.Polygon#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see kml.AltitudeMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(AltitudeMode value);

	/**
	 * Returns the value of the '<em><b>Inner Boundary Is</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Boundary Is</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Boundary Is</em>' containment reference.
	 * @see #setInnerBoundaryIs(LinearRing)
	 * @see kml.KmlPackage#getPolygon_InnerBoundaryIs()
	 * @model containment="true"
	 * @generated
	 */
	LinearRing getInnerBoundaryIs();

	/**
	 * Sets the value of the '{@link kml.Polygon#getInnerBoundaryIs <em>Inner Boundary Is</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Boundary Is</em>' containment reference.
	 * @see #getInnerBoundaryIs()
	 * @generated
	 */
	void setInnerBoundaryIs(LinearRing value);

	/**
	 * Returns the value of the '<em><b>Outer Boundary Is</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outer Boundary Is</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Boundary Is</em>' containment reference.
	 * @see #setOuterBoundaryIs(LinearRing)
	 * @see kml.KmlPackage#getPolygon_OuterBoundaryIs()
	 * @model containment="true"
	 * @generated
	 */
	LinearRing getOuterBoundaryIs();

	/**
	 * Sets the value of the '{@link kml.Polygon#getOuterBoundaryIs <em>Outer Boundary Is</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Boundary Is</em>' containment reference.
	 * @see #getOuterBoundaryIs()
	 * @generated
	 */
	void setOuterBoundaryIs(LinearRing value);

} // Polygon
