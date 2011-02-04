/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Photo Overlay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kml.PhotoOverlay#getShape <em>Shape</em>}</li>
 *   <li>{@link kml.PhotoOverlay#getViewVolume <em>View Volume</em>}</li>
 *   <li>{@link kml.PhotoOverlay#getRoll <em>Roll</em>}</li>
 *   <li>{@link kml.PhotoOverlay#getPoint <em>Point</em>}</li>
 *   <li>{@link kml.PhotoOverlay#getImagePyramid <em>Image Pyramid</em>}</li>
 * </ul>
 * </p>
 *
 * @see kml.KmlPackage#getPhotoOverlay()
 * @model
 * @generated
 */
public interface PhotoOverlay extends Overlay {
	/**
	 * Returns the value of the '<em><b>Shape</b></em>' attribute.
	 * The literals are from the enumeration {@link kml.Shape}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' attribute.
	 * @see kml.Shape
	 * @see #setShape(Shape)
	 * @see kml.KmlPackage#getPhotoOverlay_Shape()
	 * @model
	 * @generated
	 */
	Shape getShape();

	/**
	 * Sets the value of the '{@link kml.PhotoOverlay#getShape <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape</em>' attribute.
	 * @see kml.Shape
	 * @see #getShape()
	 * @generated
	 */
	void setShape(Shape value);

	/**
	 * Returns the value of the '<em><b>View Volume</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Volume</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Volume</em>' reference.
	 * @see #setViewVolume(ViewVolume)
	 * @see kml.KmlPackage#getPhotoOverlay_ViewVolume()
	 * @model
	 * @generated
	 */
	ViewVolume getViewVolume();

	/**
	 * Sets the value of the '{@link kml.PhotoOverlay#getViewVolume <em>View Volume</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Volume</em>' reference.
	 * @see #getViewVolume()
	 * @generated
	 */
	void setViewVolume(ViewVolume value);

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
	 * @see kml.KmlPackage#getPhotoOverlay_Roll()
	 * @model dataType="kml.Angle180"
	 * @generated
	 */
	double getRoll();

	/**
	 * Sets the value of the '{@link kml.PhotoOverlay#getRoll <em>Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll</em>' attribute.
	 * @see #getRoll()
	 * @generated
	 */
	void setRoll(double value);

	/**
	 * Returns the value of the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point</em>' containment reference.
	 * @see #setPoint(Point)
	 * @see kml.KmlPackage#getPhotoOverlay_Point()
	 * @model containment="true"
	 * @generated
	 */
	Point getPoint();

	/**
	 * Sets the value of the '{@link kml.PhotoOverlay#getPoint <em>Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point</em>' containment reference.
	 * @see #getPoint()
	 * @generated
	 */
	void setPoint(Point value);

	/**
	 * Returns the value of the '<em><b>Image Pyramid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Pyramid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Pyramid</em>' containment reference.
	 * @see #setImagePyramid(ImagePyramid)
	 * @see kml.KmlPackage#getPhotoOverlay_ImagePyramid()
	 * @model containment="true"
	 * @generated
	 */
	ImagePyramid getImagePyramid();

	/**
	 * Sets the value of the '{@link kml.PhotoOverlay#getImagePyramid <em>Image Pyramid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Pyramid</em>' containment reference.
	 * @see #getImagePyramid()
	 * @generated
	 */
	void setImagePyramid(ImagePyramid value);

} // PhotoOverlay
