/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml;

import atom.Author;
import atom.Link;

import org.eclipse.emf.common.util.EList;

import xAL.AddressDetails;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kml.Feature#getName <em>Name</em>}</li>
 *   <li>{@link kml.Feature#isVisibility <em>Visibility</em>}</li>
 *   <li>{@link kml.Feature#isOpen <em>Open</em>}</li>
 *   <li>{@link kml.Feature#getAtomAuthor <em>Atom Author</em>}</li>
 *   <li>{@link kml.Feature#getAtomLink <em>Atom Link</em>}</li>
 *   <li>{@link kml.Feature#getAddress <em>Address</em>}</li>
 *   <li>{@link kml.Feature#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link kml.Feature#getXalAddressDetails <em>Xal Address Details</em>}</li>
 *   <li>{@link kml.Feature#getSnippet <em>Snippet</em>}</li>
 *   <li>{@link kml.Feature#getDescription <em>Description</em>}</li>
 *   <li>{@link kml.Feature#getAbstractView <em>Abstract View</em>}</li>
 *   <li>{@link kml.Feature#getTimePrimitive <em>Time Primitive</em>}</li>
 *   <li>{@link kml.Feature#getStyleUrl <em>Style Url</em>}</li>
 *   <li>{@link kml.Feature#getStyleSelectors <em>Style Selectors</em>}</li>
 *   <li>{@link kml.Feature#getRegion <em>Region</em>}</li>
 *   <li>{@link kml.Feature#getExtendedData <em>Extended Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see kml.KmlPackage#getFeature()
 * @model abstract="true"
 * @generated
 */
public interface Feature extends kml.Object {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see kml.KmlPackage#getFeature_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kml.Feature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see #setVisibility(boolean)
	 * @see kml.KmlPackage#getFeature_Visibility()
	 * @model
	 * @generated
	 */
	boolean isVisibility();

	/**
	 * Sets the value of the '{@link kml.Feature#isVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see #isVisibility()
	 * @generated
	 */
	void setVisibility(boolean value);

	/**
	 * Returns the value of the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Open</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open</em>' attribute.
	 * @see #setOpen(boolean)
	 * @see kml.KmlPackage#getFeature_Open()
	 * @model
	 * @generated
	 */
	boolean isOpen();

	/**
	 * Sets the value of the '{@link kml.Feature#isOpen <em>Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open</em>' attribute.
	 * @see #isOpen()
	 * @generated
	 */
	void setOpen(boolean value);

	/**
	 * Returns the value of the '<em><b>Atom Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atom Author</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atom Author</em>' containment reference.
	 * @see #setAtomAuthor(Author)
	 * @see kml.KmlPackage#getFeature_AtomAuthor()
	 * @model containment="true"
	 * @generated
	 */
	Author getAtomAuthor();

	/**
	 * Sets the value of the '{@link kml.Feature#getAtomAuthor <em>Atom Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atom Author</em>' containment reference.
	 * @see #getAtomAuthor()
	 * @generated
	 */
	void setAtomAuthor(Author value);

	/**
	 * Returns the value of the '<em><b>Atom Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atom Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atom Link</em>' containment reference.
	 * @see #setAtomLink(Link)
	 * @see kml.KmlPackage#getFeature_AtomLink()
	 * @model containment="true"
	 * @generated
	 */
	Link getAtomLink();

	/**
	 * Sets the value of the '{@link kml.Feature#getAtomLink <em>Atom Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atom Link</em>' containment reference.
	 * @see #getAtomLink()
	 * @generated
	 */
	void setAtomLink(Link value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see kml.KmlPackage#getFeature_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link kml.Feature#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone Number</em>' attribute.
	 * @see #setPhoneNumber(String)
	 * @see kml.KmlPackage#getFeature_PhoneNumber()
	 * @model
	 * @generated
	 */
	String getPhoneNumber();

	/**
	 * Sets the value of the '{@link kml.Feature#getPhoneNumber <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone Number</em>' attribute.
	 * @see #getPhoneNumber()
	 * @generated
	 */
	void setPhoneNumber(String value);

	/**
	 * Returns the value of the '<em><b>Xal Address Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xal Address Details</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xal Address Details</em>' containment reference.
	 * @see #setXalAddressDetails(AddressDetails)
	 * @see kml.KmlPackage#getFeature_XalAddressDetails()
	 * @model containment="true"
	 * @generated
	 */
	AddressDetails getXalAddressDetails();

	/**
	 * Sets the value of the '{@link kml.Feature#getXalAddressDetails <em>Xal Address Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xal Address Details</em>' containment reference.
	 * @see #getXalAddressDetails()
	 * @generated
	 */
	void setXalAddressDetails(AddressDetails value);

	/**
	 * Returns the value of the '<em><b>Snippet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Snippet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Snippet</em>' attribute.
	 * @see #setSnippet(String)
	 * @see kml.KmlPackage#getFeature_Snippet()
	 * @model
	 * @generated
	 */
	String getSnippet();

	/**
	 * Sets the value of the '{@link kml.Feature#getSnippet <em>Snippet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Snippet</em>' attribute.
	 * @see #getSnippet()
	 * @generated
	 */
	void setSnippet(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see kml.KmlPackage#getFeature_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link kml.Feature#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Abstract View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract View</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract View</em>' containment reference.
	 * @see #setAbstractView(AbstractView)
	 * @see kml.KmlPackage#getFeature_AbstractView()
	 * @model containment="true"
	 * @generated
	 */
	AbstractView getAbstractView();

	/**
	 * Sets the value of the '{@link kml.Feature#getAbstractView <em>Abstract View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract View</em>' containment reference.
	 * @see #getAbstractView()
	 * @generated
	 */
	void setAbstractView(AbstractView value);

	/**
	 * Returns the value of the '<em><b>Time Primitive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Primitive</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Primitive</em>' containment reference.
	 * @see #setTimePrimitive(TimePrimitive)
	 * @see kml.KmlPackage#getFeature_TimePrimitive()
	 * @model containment="true"
	 * @generated
	 */
	TimePrimitive getTimePrimitive();

	/**
	 * Sets the value of the '{@link kml.Feature#getTimePrimitive <em>Time Primitive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Primitive</em>' containment reference.
	 * @see #getTimePrimitive()
	 * @generated
	 */
	void setTimePrimitive(TimePrimitive value);

	/**
	 * Returns the value of the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Url</em>' attribute.
	 * @see #setStyleUrl(String)
	 * @see kml.KmlPackage#getFeature_StyleUrl()
	 * @model
	 * @generated
	 */
	String getStyleUrl();

	/**
	 * Sets the value of the '{@link kml.Feature#getStyleUrl <em>Style Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Url</em>' attribute.
	 * @see #getStyleUrl()
	 * @generated
	 */
	void setStyleUrl(String value);

	/**
	 * Returns the value of the '<em><b>Style Selectors</b></em>' containment reference list.
	 * The list contents are of type {@link kml.StyleSelector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Selectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Selectors</em>' containment reference list.
	 * @see kml.KmlPackage#getFeature_StyleSelectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<StyleSelector> getStyleSelectors();

	/**
	 * Returns the value of the '<em><b>Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' reference.
	 * @see #setRegion(Region)
	 * @see kml.KmlPackage#getFeature_Region()
	 * @model
	 * @generated
	 */
	Region getRegion();

	/**
	 * Sets the value of the '{@link kml.Feature#getRegion <em>Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' reference.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(Region value);

	/**
	 * Returns the value of the '<em><b>Extended Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Data</em>' containment reference.
	 * @see #setExtendedData(ExtendedData)
	 * @see kml.KmlPackage#getFeature_ExtendedData()
	 * @model containment="true"
	 * @generated
	 */
	ExtendedData getExtendedData();

	/**
	 * Sets the value of the '{@link kml.Feature#getExtendedData <em>Extended Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Data</em>' containment reference.
	 * @see #getExtendedData()
	 * @generated
	 */
	void setExtendedData(ExtendedData value);

} // Feature
