/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kml.Link#getUrlRef <em>Url Ref</em>}</li>
 *   <li>{@link kml.Link#getRefreshMode <em>Refresh Mode</em>}</li>
 *   <li>{@link kml.Link#getRefreshInterval <em>Refresh Interval</em>}</li>
 *   <li>{@link kml.Link#getViewRefreshMode <em>View Refresh Mode</em>}</li>
 *   <li>{@link kml.Link#getViewRefreshTime <em>View Refresh Time</em>}</li>
 *   <li>{@link kml.Link#getViewBoundScale <em>View Bound Scale</em>}</li>
 *   <li>{@link kml.Link#getViewFormat <em>View Format</em>}</li>
 *   <li>{@link kml.Link#getHttpQuery <em>Http Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see kml.KmlPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends kml.Object {
	/**
	 * Returns the value of the '<em><b>Url Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url Ref</em>' attribute.
	 * @see #setUrlRef(String)
	 * @see kml.KmlPackage#getLink_UrlRef()
	 * @model
	 * @generated
	 */
	String getUrlRef();

	/**
	 * Sets the value of the '{@link kml.Link#getUrlRef <em>Url Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url Ref</em>' attribute.
	 * @see #getUrlRef()
	 * @generated
	 */
	void setUrlRef(String value);

	/**
	 * Returns the value of the '<em><b>Refresh Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link kml.RefreshMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refresh Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh Mode</em>' attribute.
	 * @see kml.RefreshMode
	 * @see #setRefreshMode(RefreshMode)
	 * @see kml.KmlPackage#getLink_RefreshMode()
	 * @model
	 * @generated
	 */
	RefreshMode getRefreshMode();

	/**
	 * Sets the value of the '{@link kml.Link#getRefreshMode <em>Refresh Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Mode</em>' attribute.
	 * @see kml.RefreshMode
	 * @see #getRefreshMode()
	 * @generated
	 */
	void setRefreshMode(RefreshMode value);

	/**
	 * Returns the value of the '<em><b>Refresh Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refresh Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh Interval</em>' attribute.
	 * @see #setRefreshInterval(double)
	 * @see kml.KmlPackage#getLink_RefreshInterval()
	 * @model
	 * @generated
	 */
	double getRefreshInterval();

	/**
	 * Sets the value of the '{@link kml.Link#getRefreshInterval <em>Refresh Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Interval</em>' attribute.
	 * @see #getRefreshInterval()
	 * @generated
	 */
	void setRefreshInterval(double value);

	/**
	 * Returns the value of the '<em><b>View Refresh Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link kml.ViewRefreshMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Refresh Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Refresh Mode</em>' attribute.
	 * @see kml.ViewRefreshMode
	 * @see #setViewRefreshMode(ViewRefreshMode)
	 * @see kml.KmlPackage#getLink_ViewRefreshMode()
	 * @model
	 * @generated
	 */
	ViewRefreshMode getViewRefreshMode();

	/**
	 * Sets the value of the '{@link kml.Link#getViewRefreshMode <em>View Refresh Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Refresh Mode</em>' attribute.
	 * @see kml.ViewRefreshMode
	 * @see #getViewRefreshMode()
	 * @generated
	 */
	void setViewRefreshMode(ViewRefreshMode value);

	/**
	 * Returns the value of the '<em><b>View Refresh Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Refresh Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Refresh Time</em>' attribute.
	 * @see #setViewRefreshTime(double)
	 * @see kml.KmlPackage#getLink_ViewRefreshTime()
	 * @model
	 * @generated
	 */
	double getViewRefreshTime();

	/**
	 * Sets the value of the '{@link kml.Link#getViewRefreshTime <em>View Refresh Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Refresh Time</em>' attribute.
	 * @see #getViewRefreshTime()
	 * @generated
	 */
	void setViewRefreshTime(double value);

	/**
	 * Returns the value of the '<em><b>View Bound Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Bound Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Bound Scale</em>' attribute.
	 * @see #setViewBoundScale(double)
	 * @see kml.KmlPackage#getLink_ViewBoundScale()
	 * @model
	 * @generated
	 */
	double getViewBoundScale();

	/**
	 * Sets the value of the '{@link kml.Link#getViewBoundScale <em>View Bound Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Bound Scale</em>' attribute.
	 * @see #getViewBoundScale()
	 * @generated
	 */
	void setViewBoundScale(double value);

	/**
	 * Returns the value of the '<em><b>View Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Format</em>' attribute.
	 * @see #setViewFormat(String)
	 * @see kml.KmlPackage#getLink_ViewFormat()
	 * @model
	 * @generated
	 */
	String getViewFormat();

	/**
	 * Sets the value of the '{@link kml.Link#getViewFormat <em>View Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Format</em>' attribute.
	 * @see #getViewFormat()
	 * @generated
	 */
	void setViewFormat(String value);

	/**
	 * Returns the value of the '<em><b>Http Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Http Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Query</em>' attribute.
	 * @see #setHttpQuery(String)
	 * @see kml.KmlPackage#getLink_HttpQuery()
	 * @model
	 * @generated
	 */
	String getHttpQuery();

	/**
	 * Sets the value of the '{@link kml.Link#getHttpQuery <em>Http Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Query</em>' attribute.
	 * @see #getHttpQuery()
	 * @generated
	 */
	void setHttpQuery(String value);

} // Link
