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
 * A representation of the model object '<em><b>Image Pyramid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kml.ImagePyramid#getTileSize <em>Tile Size</em>}</li>
 *   <li>{@link kml.ImagePyramid#getMaxWidth <em>Max Width</em>}</li>
 *   <li>{@link kml.ImagePyramid#getMaxHeight <em>Max Height</em>}</li>
 *   <li>{@link kml.ImagePyramid#getGridOrigin <em>Grid Origin</em>}</li>
 * </ul>
 * </p>
 *
 * @see kml.KmlPackage#getImagePyramid()
 * @model
 * @generated
 */
public interface ImagePyramid extends EObject {
	/**
	 * Returns the value of the '<em><b>Tile Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tile Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tile Size</em>' attribute.
	 * @see #setTileSize(int)
	 * @see kml.KmlPackage#getImagePyramid_TileSize()
	 * @model
	 * @generated
	 */
	int getTileSize();

	/**
	 * Sets the value of the '{@link kml.ImagePyramid#getTileSize <em>Tile Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tile Size</em>' attribute.
	 * @see #getTileSize()
	 * @generated
	 */
	void setTileSize(int value);

	/**
	 * Returns the value of the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Width</em>' attribute.
	 * @see #setMaxWidth(int)
	 * @see kml.KmlPackage#getImagePyramid_MaxWidth()
	 * @model
	 * @generated
	 */
	int getMaxWidth();

	/**
	 * Sets the value of the '{@link kml.ImagePyramid#getMaxWidth <em>Max Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Width</em>' attribute.
	 * @see #getMaxWidth()
	 * @generated
	 */
	void setMaxWidth(int value);

	/**
	 * Returns the value of the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Height</em>' attribute.
	 * @see #setMaxHeight(int)
	 * @see kml.KmlPackage#getImagePyramid_MaxHeight()
	 * @model
	 * @generated
	 */
	int getMaxHeight();

	/**
	 * Sets the value of the '{@link kml.ImagePyramid#getMaxHeight <em>Max Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Height</em>' attribute.
	 * @see #getMaxHeight()
	 * @generated
	 */
	void setMaxHeight(int value);

	/**
	 * Returns the value of the '<em><b>Grid Origin</b></em>' attribute.
	 * The literals are from the enumeration {@link kml.GridOrigin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid Origin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid Origin</em>' attribute.
	 * @see kml.GridOrigin
	 * @see #setGridOrigin(GridOrigin)
	 * @see kml.KmlPackage#getImagePyramid_GridOrigin()
	 * @model
	 * @generated
	 */
	GridOrigin getGridOrigin();

	/**
	 * Sets the value of the '{@link kml.ImagePyramid#getGridOrigin <em>Grid Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid Origin</em>' attribute.
	 * @see kml.GridOrigin
	 * @see #getGridOrigin()
	 * @generated
	 */
	void setGridOrigin(GridOrigin value);

} // ImagePyramid
