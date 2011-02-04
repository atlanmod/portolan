/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kml.Lod#getMinLodPixels <em>Min Lod Pixels</em>}</li>
 *   <li>{@link kml.Lod#getMaxLodPixels <em>Max Lod Pixels</em>}</li>
 *   <li>{@link kml.Lod#getMinFadeExtent <em>Min Fade Extent</em>}</li>
 *   <li>{@link kml.Lod#getMaxFadeExtent <em>Max Fade Extent</em>}</li>
 * </ul>
 * </p>
 *
 * @see kml.KmlPackage#getLod()
 * @model
 * @generated
 */
public interface Lod extends kml.Object {
	/**
	 * Returns the value of the '<em><b>Min Lod Pixels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Lod Pixels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Lod Pixels</em>' attribute.
	 * @see #setMinLodPixels(double)
	 * @see kml.KmlPackage#getLod_MinLodPixels()
	 * @model
	 * @generated
	 */
	double getMinLodPixels();

	/**
	 * Sets the value of the '{@link kml.Lod#getMinLodPixels <em>Min Lod Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Lod Pixels</em>' attribute.
	 * @see #getMinLodPixels()
	 * @generated
	 */
	void setMinLodPixels(double value);

	/**
	 * Returns the value of the '<em><b>Max Lod Pixels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Lod Pixels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Lod Pixels</em>' attribute.
	 * @see #setMaxLodPixels(double)
	 * @see kml.KmlPackage#getLod_MaxLodPixels()
	 * @model
	 * @generated
	 */
	double getMaxLodPixels();

	/**
	 * Sets the value of the '{@link kml.Lod#getMaxLodPixels <em>Max Lod Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Lod Pixels</em>' attribute.
	 * @see #getMaxLodPixels()
	 * @generated
	 */
	void setMaxLodPixels(double value);

	/**
	 * Returns the value of the '<em><b>Min Fade Extent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Fade Extent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Fade Extent</em>' attribute.
	 * @see #setMinFadeExtent(double)
	 * @see kml.KmlPackage#getLod_MinFadeExtent()
	 * @model
	 * @generated
	 */
	double getMinFadeExtent();

	/**
	 * Sets the value of the '{@link kml.Lod#getMinFadeExtent <em>Min Fade Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Fade Extent</em>' attribute.
	 * @see #getMinFadeExtent()
	 * @generated
	 */
	void setMinFadeExtent(double value);

	/**
	 * Returns the value of the '<em><b>Max Fade Extent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Fade Extent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Fade Extent</em>' attribute.
	 * @see #setMaxFadeExtent(double)
	 * @see kml.KmlPackage#getLod_MaxFadeExtent()
	 * @model
	 * @generated
	 */
	double getMaxFadeExtent();

	/**
	 * Sets the value of the '{@link kml.Lod#getMaxFadeExtent <em>Max Fade Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Fade Extent</em>' attribute.
	 * @see #getMaxFadeExtent()
	 * @generated
	 */
	void setMaxFadeExtent(double value);

} // Lod
