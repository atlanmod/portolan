/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package atom.impl;

import atom.AtomPackage;
import atom.Element;
import atom.EmailAddress;
import atom.PersonConstruct;
import atom.Uri;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person Construct</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link atom.impl.PersonConstructImpl#getName <em>Name</em>}</li>
 *   <li>{@link atom.impl.PersonConstructImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link atom.impl.PersonConstructImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link atom.impl.PersonConstructImpl#getExtension <em>Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonConstructImpl extends ElementImpl implements PersonConstruct {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected Uri uri;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected EmailAddress email;

	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> extension;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonConstructImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtomPackage.Literals.PERSON_CONSTRUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomPackage.PERSON_CONSTRUCT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getUri() {
		if (uri != null && uri.eIsProxy()) {
			InternalEObject oldUri = (InternalEObject)uri;
			uri = (Uri)eResolveProxy(oldUri);
			if (uri != oldUri) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtomPackage.PERSON_CONSTRUCT__URI, oldUri, uri));
			}
		}
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(Uri newUri) {
		Uri oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomPackage.PERSON_CONSTRUCT__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmailAddress getEmail() {
		if (email != null && email.eIsProxy()) {
			InternalEObject oldEmail = (InternalEObject)email;
			email = (EmailAddress)eResolveProxy(oldEmail);
			if (email != oldEmail) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtomPackage.PERSON_CONSTRUCT__EMAIL, oldEmail, email));
			}
		}
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmailAddress basicGetEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(EmailAddress newEmail) {
		EmailAddress oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomPackage.PERSON_CONSTRUCT__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getExtension() {
		if (extension == null) {
			extension = new EObjectResolvingEList<Element>(Element.class, this, AtomPackage.PERSON_CONSTRUCT__EXTENSION);
		}
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AtomPackage.PERSON_CONSTRUCT__NAME:
				return getName();
			case AtomPackage.PERSON_CONSTRUCT__URI:
				if (resolve) return getUri();
				return basicGetUri();
			case AtomPackage.PERSON_CONSTRUCT__EMAIL:
				if (resolve) return getEmail();
				return basicGetEmail();
			case AtomPackage.PERSON_CONSTRUCT__EXTENSION:
				return getExtension();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AtomPackage.PERSON_CONSTRUCT__NAME:
				setName((String)newValue);
				return;
			case AtomPackage.PERSON_CONSTRUCT__URI:
				setUri((Uri)newValue);
				return;
			case AtomPackage.PERSON_CONSTRUCT__EMAIL:
				setEmail((EmailAddress)newValue);
				return;
			case AtomPackage.PERSON_CONSTRUCT__EXTENSION:
				getExtension().clear();
				getExtension().addAll((Collection<? extends Element>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AtomPackage.PERSON_CONSTRUCT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AtomPackage.PERSON_CONSTRUCT__URI:
				setUri((Uri)null);
				return;
			case AtomPackage.PERSON_CONSTRUCT__EMAIL:
				setEmail((EmailAddress)null);
				return;
			case AtomPackage.PERSON_CONSTRUCT__EXTENSION:
				getExtension().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AtomPackage.PERSON_CONSTRUCT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AtomPackage.PERSON_CONSTRUCT__URI:
				return uri != null;
			case AtomPackage.PERSON_CONSTRUCT__EMAIL:
				return email != null;
			case AtomPackage.PERSON_CONSTRUCT__EXTENSION:
				return extension != null && !extension.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PersonConstructImpl
