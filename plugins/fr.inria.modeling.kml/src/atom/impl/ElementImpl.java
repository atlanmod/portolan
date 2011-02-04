/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package atom.impl;

import atom.AtomPackage;
import atom.Element;
import atom.LanguageTag;
import atom.Uri;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link atom.impl.ElementImpl#getBase <em>Base</em>}</li>
 *   <li>{@link atom.impl.ElementImpl#getLang <em>Lang</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementImpl extends EObjectImpl implements Element {
	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected Uri base;

	/**
	 * The cached value of the '{@link #getLang() <em>Lang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected LanguageTag lang;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtomPackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getBase() {
		if (base != null && base.eIsProxy()) {
			InternalEObject oldBase = (InternalEObject)base;
			base = (Uri)eResolveProxy(oldBase);
			if (base != oldBase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtomPackage.ELEMENT__BASE, oldBase, base));
			}
		}
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase(Uri newBase) {
		Uri oldBase = base;
		base = newBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomPackage.ELEMENT__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageTag getLang() {
		if (lang != null && lang.eIsProxy()) {
			InternalEObject oldLang = (InternalEObject)lang;
			lang = (LanguageTag)eResolveProxy(oldLang);
			if (lang != oldLang) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtomPackage.ELEMENT__LANG, oldLang, lang));
			}
		}
		return lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageTag basicGetLang() {
		return lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLang(LanguageTag newLang) {
		LanguageTag oldLang = lang;
		lang = newLang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomPackage.ELEMENT__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AtomPackage.ELEMENT__BASE:
				if (resolve) return getBase();
				return basicGetBase();
			case AtomPackage.ELEMENT__LANG:
				if (resolve) return getLang();
				return basicGetLang();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AtomPackage.ELEMENT__BASE:
				setBase((Uri)newValue);
				return;
			case AtomPackage.ELEMENT__LANG:
				setLang((LanguageTag)newValue);
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
			case AtomPackage.ELEMENT__BASE:
				setBase((Uri)null);
				return;
			case AtomPackage.ELEMENT__LANG:
				setLang((LanguageTag)null);
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
			case AtomPackage.ELEMENT__BASE:
				return base != null;
			case AtomPackage.ELEMENT__LANG:
				return lang != null;
		}
		return super.eIsSet(featureID);
	}

} //ElementImpl
