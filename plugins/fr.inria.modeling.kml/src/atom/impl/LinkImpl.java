/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package atom.impl;

import atom.AtomPackage;
import atom.LanguageTag;
import atom.Link;
import atom.LinkRelation;
import atom.Uri;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link atom.impl.LinkImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link atom.impl.LinkImpl#getLength <em>Length</em>}</li>
 *   <li>{@link atom.impl.LinkImpl#getHref <em>Href</em>}</li>
 *   <li>{@link atom.impl.LinkImpl#getRel <em>Rel</em>}</li>
 *   <li>{@link atom.impl.LinkImpl#getType <em>Type</em>}</li>
 *   <li>{@link atom.impl.LinkImpl#getHreflang <em>Hreflang</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkImpl extends ElementImpl implements Link {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final String LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected String length = LENGTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected Uri href;

	/**
	 * The default value of the '{@link #getRel() <em>Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRel()
	 * @generated
	 * @ordered
	 */
	protected static final LinkRelation REL_EDEFAULT = LinkRelation.ALTERNATE;

	/**
	 * The cached value of the '{@link #getRel() <em>Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRel()
	 * @generated
	 * @ordered
	 */
	protected LinkRelation rel = REL_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHreflang() <em>Hreflang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHreflang()
	 * @generated
	 * @ordered
	 */
	protected LanguageTag hreflang;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtomPackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomPackage.LINK__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(String newLength) {
		String oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomPackage.LINK__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getHref() {
		if (href != null && href.eIsProxy()) {
			InternalEObject oldHref = (InternalEObject)href;
			href = (Uri)eResolveProxy(oldHref);
			if (href != oldHref) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtomPackage.LINK__HREF, oldHref, href));
			}
		}
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHref(Uri newHref) {
		Uri oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomPackage.LINK__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkRelation getRel() {
		return rel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRel(LinkRelation newRel) {
		LinkRelation oldRel = rel;
		rel = newRel == null ? REL_EDEFAULT : newRel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomPackage.LINK__REL, oldRel, rel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomPackage.LINK__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageTag getHreflang() {
		if (hreflang != null && hreflang.eIsProxy()) {
			InternalEObject oldHreflang = (InternalEObject)hreflang;
			hreflang = (LanguageTag)eResolveProxy(oldHreflang);
			if (hreflang != oldHreflang) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtomPackage.LINK__HREFLANG, oldHreflang, hreflang));
			}
		}
		return hreflang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageTag basicGetHreflang() {
		return hreflang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHreflang(LanguageTag newHreflang) {
		LanguageTag oldHreflang = hreflang;
		hreflang = newHreflang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomPackage.LINK__HREFLANG, oldHreflang, hreflang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AtomPackage.LINK__TITLE:
				return getTitle();
			case AtomPackage.LINK__LENGTH:
				return getLength();
			case AtomPackage.LINK__HREF:
				if (resolve) return getHref();
				return basicGetHref();
			case AtomPackage.LINK__REL:
				return getRel();
			case AtomPackage.LINK__TYPE:
				return getType();
			case AtomPackage.LINK__HREFLANG:
				if (resolve) return getHreflang();
				return basicGetHreflang();
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
			case AtomPackage.LINK__TITLE:
				setTitle((String)newValue);
				return;
			case AtomPackage.LINK__LENGTH:
				setLength((String)newValue);
				return;
			case AtomPackage.LINK__HREF:
				setHref((Uri)newValue);
				return;
			case AtomPackage.LINK__REL:
				setRel((LinkRelation)newValue);
				return;
			case AtomPackage.LINK__TYPE:
				setType((String)newValue);
				return;
			case AtomPackage.LINK__HREFLANG:
				setHreflang((LanguageTag)newValue);
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
			case AtomPackage.LINK__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case AtomPackage.LINK__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case AtomPackage.LINK__HREF:
				setHref((Uri)null);
				return;
			case AtomPackage.LINK__REL:
				setRel(REL_EDEFAULT);
				return;
			case AtomPackage.LINK__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case AtomPackage.LINK__HREFLANG:
				setHreflang((LanguageTag)null);
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
			case AtomPackage.LINK__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case AtomPackage.LINK__LENGTH:
				return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
			case AtomPackage.LINK__HREF:
				return href != null;
			case AtomPackage.LINK__REL:
				return rel != REL_EDEFAULT;
			case AtomPackage.LINK__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case AtomPackage.LINK__HREFLANG:
				return hreflang != null;
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
		result.append(" (title: ");
		result.append(title);
		result.append(", length: ");
		result.append(length);
		result.append(", rel: ");
		result.append(rel);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //LinkImpl
