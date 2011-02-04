/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kml.Region#getLatLonAltBox <em>Lat Lon Alt Box</em>}</li>
 *   <li>{@link kml.Region#getLod <em>Lod</em>}</li>
 * </ul>
 * </p>
 *
 * @see kml.KmlPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends kml.Object {
	/**
	 * Returns the value of the '<em><b>Lat Lon Alt Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lat Lon Alt Box</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat Lon Alt Box</em>' containment reference.
	 * @see #setLatLonAltBox(LatLonAltBox)
	 * @see kml.KmlPackage#getRegion_LatLonAltBox()
	 * @model containment="true"
	 * @generated
	 */
	LatLonAltBox getLatLonAltBox();

	/**
	 * Sets the value of the '{@link kml.Region#getLatLonAltBox <em>Lat Lon Alt Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lat Lon Alt Box</em>' containment reference.
	 * @see #getLatLonAltBox()
	 * @generated
	 */
	void setLatLonAltBox(LatLonAltBox value);

	/**
	 * Returns the value of the '<em><b>Lod</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod</em>' containment reference.
	 * @see #setLod(Lod)
	 * @see kml.KmlPackage#getRegion_Lod()
	 * @model containment="true"
	 * @generated
	 */
	Lod getLod();

	/**
	 * Sets the value of the '{@link kml.Region#getLod <em>Lod</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod</em>' containment reference.
	 * @see #getLod()
	 * @generated
	 */
	void setLod(Lod value);

} // Region
