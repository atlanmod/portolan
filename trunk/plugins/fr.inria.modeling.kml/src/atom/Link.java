/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package atom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link atom.Link#getTitle <em>Title</em>}</li>
 *   <li>{@link atom.Link#getLength <em>Length</em>}</li>
 *   <li>{@link atom.Link#getHref <em>Href</em>}</li>
 *   <li>{@link atom.Link#getRel <em>Rel</em>}</li>
 *   <li>{@link atom.Link#getType <em>Type</em>}</li>
 *   <li>{@link atom.Link#getHreflang <em>Hreflang</em>}</li>
 * </ul>
 * </p>
 *
 * @see atom.AtomPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends Element {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see atom.AtomPackage#getLink_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link atom.Link#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(String)
	 * @see atom.AtomPackage#getLink_Length()
	 * @model
	 * @generated
	 */
	String getLength();

	/**
	 * Sets the value of the '{@link atom.Link#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(String value);

	/**
	 * Returns the value of the '<em><b>Href</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Href</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' reference.
	 * @see #setHref(Uri)
	 * @see atom.AtomPackage#getLink_Href()
	 * @model required="true"
	 * @generated
	 */
	Uri getHref();

	/**
	 * Sets the value of the '{@link atom.Link#getHref <em>Href</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' reference.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(Uri value);

	/**
	 * Returns the value of the '<em><b>Rel</b></em>' attribute.
	 * The literals are from the enumeration {@link atom.LinkRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rel</em>' attribute.
	 * @see atom.LinkRelation
	 * @see #setRel(LinkRelation)
	 * @see atom.AtomPackage#getLink_Rel()
	 * @model
	 * @generated
	 */
	LinkRelation getRel();

	/**
	 * Sets the value of the '{@link atom.Link#getRel <em>Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel</em>' attribute.
	 * @see atom.LinkRelation
	 * @see #getRel()
	 * @generated
	 */
	void setRel(LinkRelation value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see atom.AtomPackage#getLink_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link atom.Link#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Hreflang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hreflang</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hreflang</em>' reference.
	 * @see #setHreflang(LanguageTag)
	 * @see atom.AtomPackage#getLink_Hreflang()
	 * @model
	 * @generated
	 */
	LanguageTag getHreflang();

	/**
	 * Sets the value of the '{@link atom.Link#getHreflang <em>Hreflang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hreflang</em>' reference.
	 * @see #getHreflang()
	 * @generated
	 */
	void setHreflang(LanguageTag value);

} // Link
