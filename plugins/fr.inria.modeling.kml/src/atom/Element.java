/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package atom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link atom.Element#getBase <em>Base</em>}</li>
 *   <li>{@link atom.Element#getLang <em>Lang</em>}</li>
 * </ul>
 * </p>
 *
 * @see atom.AtomPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' reference.
	 * @see #setBase(Uri)
	 * @see atom.AtomPackage#getElement_Base()
	 * @model
	 * @generated
	 */
	Uri getBase();

	/**
	 * Sets the value of the '{@link atom.Element#getBase <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(Uri value);

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lang</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' reference.
	 * @see #setLang(LanguageTag)
	 * @see atom.AtomPackage#getElement_Lang()
	 * @model
	 * @generated
	 */
	LanguageTag getLang();

	/**
	 * Sets the value of the '{@link atom.Element#getLang <em>Lang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' reference.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(LanguageTag value);

} // Element
