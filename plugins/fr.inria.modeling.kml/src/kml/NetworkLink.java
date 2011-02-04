/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kml.NetworkLink#isRefreshVisibility <em>Refresh Visibility</em>}</li>
 *   <li>{@link kml.NetworkLink#isFlyToView <em>Fly To View</em>}</li>
 *   <li>{@link kml.NetworkLink#getLink <em>Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see kml.KmlPackage#getNetworkLink()
 * @model
 * @generated
 */
public interface NetworkLink extends Feature {
	/**
	 * Returns the value of the '<em><b>Refresh Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refresh Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh Visibility</em>' attribute.
	 * @see #setRefreshVisibility(boolean)
	 * @see kml.KmlPackage#getNetworkLink_RefreshVisibility()
	 * @model
	 * @generated
	 */
	boolean isRefreshVisibility();

	/**
	 * Sets the value of the '{@link kml.NetworkLink#isRefreshVisibility <em>Refresh Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Visibility</em>' attribute.
	 * @see #isRefreshVisibility()
	 * @generated
	 */
	void setRefreshVisibility(boolean value);

	/**
	 * Returns the value of the '<em><b>Fly To View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fly To View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fly To View</em>' attribute.
	 * @see #setFlyToView(boolean)
	 * @see kml.KmlPackage#getNetworkLink_FlyToView()
	 * @model
	 * @generated
	 */
	boolean isFlyToView();

	/**
	 * Sets the value of the '{@link kml.NetworkLink#isFlyToView <em>Fly To View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fly To View</em>' attribute.
	 * @see #isFlyToView()
	 * @generated
	 */
	void setFlyToView(boolean value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' reference.
	 * @see #setLink(Link)
	 * @see kml.KmlPackage#getNetworkLink_Link()
	 * @model
	 * @generated
	 */
	Link getLink();

	/**
	 * Sets the value of the '{@link kml.NetworkLink#getLink <em>Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(Link value);

} // NetworkLink
