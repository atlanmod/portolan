/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package atom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Construct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link atom.PersonConstruct#getName <em>Name</em>}</li>
 *   <li>{@link atom.PersonConstruct#getUri <em>Uri</em>}</li>
 *   <li>{@link atom.PersonConstruct#getEmail <em>Email</em>}</li>
 *   <li>{@link atom.PersonConstruct#getExtension <em>Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @see atom.AtomPackage#getPersonConstruct()
 * @model
 * @generated
 */
public interface PersonConstruct extends Element {
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
	 * @see atom.AtomPackage#getPersonConstruct_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link atom.PersonConstruct#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' reference.
	 * @see #setUri(Uri)
	 * @see atom.AtomPackage#getPersonConstruct_Uri()
	 * @model
	 * @generated
	 */
	Uri getUri();

	/**
	 * Sets the value of the '{@link atom.PersonConstruct#getUri <em>Uri</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' reference.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' reference.
	 * @see #setEmail(EmailAddress)
	 * @see atom.AtomPackage#getPersonConstruct_Email()
	 * @model
	 * @generated
	 */
	EmailAddress getEmail();

	/**
	 * Sets the value of the '{@link atom.PersonConstruct#getEmail <em>Email</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' reference.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(EmailAddress value);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' reference list.
	 * The list contents are of type {@link atom.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' reference list.
	 * @see atom.AtomPackage#getPersonConstruct_Extension()
	 * @model
	 * @generated
	 */
	EList<Element> getExtension();

} // PersonConstruct
