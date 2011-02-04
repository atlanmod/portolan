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
 * A representation of the model object '<em><b>Multi Geometry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kml.MultiGeometry#getGeometries <em>Geometries</em>}</li>
 * </ul>
 * </p>
 *
 * @see kml.KmlPackage#getMultiGeometry()
 * @model
 * @generated
 */
public interface MultiGeometry extends Geometry {
	/**
	 * Returns the value of the '<em><b>Geometries</b></em>' reference list.
	 * The list contents are of type {@link kml.Geometry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geometries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometries</em>' reference list.
	 * @see kml.KmlPackage#getMultiGeometry_Geometries()
	 * @model
	 * @generated
	 */
	EList<Geometry> getGeometries();

} // MultiGeometry
