/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml.impl;

import atom.Author;
import atom.Link;

import java.util.Collection;

import kml.AbstractView;
import kml.ExtendedData;
import kml.Feature;
import kml.KmlPackage;
import kml.Region;
import kml.StyleSelector;
import kml.TimePrimitive;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import xAL.AddressDetails;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kml.impl.FeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link kml.impl.FeatureImpl#isVisibility <em>Visibility</em>}</li>
 *   <li>{@link kml.impl.FeatureImpl#isOpen <em>Open</em>}</li>
 *   <li>{@link kml.impl.FeatureImpl#getAtomAuthor <em>Atom Author</em>}</li>
 *   <li>{@link kml.impl.FeatureImpl#getAtomLink <em>Atom Link</em>}</li>
 *   <li>{@link kml.impl.FeatureImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link kml.impl.FeatureImpl#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link kml.impl.FeatureImpl#getXalAddressDetails <em>Xal Address Details</em>}</li>
 *   <li>{@link kml.impl.FeatureImpl#getSnippet <em>Snippet</em>}</li>
 *   <li>{@link kml.impl.FeatureImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link kml.impl.FeatureImpl#getAbstractView <em>Abstract View</em>}</li>
 *   <li>{@link kml.impl.FeatureImpl#getTimePrimitive <em>Time Primitive</em>}</li>
 *   <li>{@link kml.impl.FeatureImpl#getStyleUrl <em>Style Url</em>}</li>
 *   <li>{@link kml.impl.FeatureImpl#getStyleSelectors <em>Style Selectors</em>}</li>
 *   <li>{@link kml.impl.FeatureImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link kml.impl.FeatureImpl#getExtendedData <em>Extended Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FeatureImpl extends ObjectImpl implements Feature {
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
	 * The default value of the '{@link #isVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBILITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisibility()
	 * @generated
	 * @ordered
	 */
	protected boolean visibility = VISIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isOpen() <em>Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOpen() <em>Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpen()
	 * @generated
	 * @ordered
	 */
	protected boolean open = OPEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAtomAuthor() <em>Atom Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtomAuthor()
	 * @generated
	 * @ordered
	 */
	protected Author atomAuthor;

	/**
	 * The cached value of the '{@link #getAtomLink() <em>Atom Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtomLink()
	 * @generated
	 * @ordered
	 */
	protected Link atomLink;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected String phoneNumber = PHONE_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getXalAddressDetails() <em>Xal Address Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXalAddressDetails()
	 * @generated
	 * @ordered
	 */
	protected AddressDetails xalAddressDetails;

	/**
	 * The default value of the '{@link #getSnippet() <em>Snippet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnippet()
	 * @generated
	 * @ordered
	 */
	protected static final String SNIPPET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSnippet() <em>Snippet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnippet()
	 * @generated
	 * @ordered
	 */
	protected String snippet = SNIPPET_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAbstractView() <em>Abstract View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractView()
	 * @generated
	 * @ordered
	 */
	protected AbstractView abstractView;

	/**
	 * The cached value of the '{@link #getTimePrimitive() <em>Time Primitive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePrimitive()
	 * @generated
	 * @ordered
	 */
	protected TimePrimitive timePrimitive;

	/**
	 * The default value of the '{@link #getStyleUrl() <em>Style Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyleUrl() <em>Style Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleUrl()
	 * @generated
	 * @ordered
	 */
	protected String styleUrl = STYLE_URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStyleSelectors() <em>Style Selectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleSelectors()
	 * @generated
	 * @ordered
	 */
	protected EList<StyleSelector> styleSelectors;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected Region region;

	/**
	 * The cached value of the '{@link #getExtendedData() <em>Extended Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedData()
	 * @generated
	 * @ordered
	 */
	protected ExtendedData extendedData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmlPackage.Literals.FEATURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.FEATURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(boolean newVisibility) {
		boolean oldVisibility = visibility;
		visibility = newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.FEATURE__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOpen() {
		return open;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpen(boolean newOpen) {
		boolean oldOpen = open;
		open = newOpen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.FEATURE__OPEN, oldOpen, open));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Author getAtomAuthor() {
		return atomAuthor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAtomAuthor(Author newAtomAuthor, NotificationChain msgs) {
		Author oldAtomAuthor = atomAuthor;
		atomAuthor = newAtomAuthor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmlPackage.FEATURE__ATOM_AUTHOR, oldAtomAuthor, newAtomAuthor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtomAuthor(Author newAtomAuthor) {
		if (newAtomAuthor != atomAuthor) {
			NotificationChain msgs = null;
			if (atomAuthor != null)
				msgs = ((InternalEObject)atomAuthor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmlPackage.FEATURE__ATOM_AUTHOR, null, msgs);
			if (newAtomAuthor != null)
				msgs = ((InternalEObject)newAtomAuthor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmlPackage.FEATURE__ATOM_AUTHOR, null, msgs);
			msgs = basicSetAtomAuthor(newAtomAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.FEATURE__ATOM_AUTHOR, newAtomAuthor, newAtomAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link getAtomLink() {
		return atomLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAtomLink(Link newAtomLink, NotificationChain msgs) {
		Link oldAtomLink = atomLink;
		atomLink = newAtomLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmlPackage.FEATURE__ATOM_LINK, oldAtomLink, newAtomLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtomLink(Link newAtomLink) {
		if (newAtomLink != atomLink) {
			NotificationChain msgs = null;
			if (atomLink != null)
				msgs = ((InternalEObject)atomLink).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmlPackage.FEATURE__ATOM_LINK, null, msgs);
			if (newAtomLink != null)
				msgs = ((InternalEObject)newAtomLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmlPackage.FEATURE__ATOM_LINK, null, msgs);
			msgs = basicSetAtomLink(newAtomLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.FEATURE__ATOM_LINK, newAtomLink, newAtomLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.FEATURE__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhoneNumber(String newPhoneNumber) {
		String oldPhoneNumber = phoneNumber;
		phoneNumber = newPhoneNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.FEATURE__PHONE_NUMBER, oldPhoneNumber, phoneNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressDetails getXalAddressDetails() {
		return xalAddressDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXalAddressDetails(AddressDetails newXalAddressDetails, NotificationChain msgs) {
		AddressDetails oldXalAddressDetails = xalAddressDetails;
		xalAddressDetails = newXalAddressDetails;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmlPackage.FEATURE__XAL_ADDRESS_DETAILS, oldXalAddressDetails, newXalAddressDetails);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXalAddressDetails(AddressDetails newXalAddressDetails) {
		if (newXalAddressDetails != xalAddressDetails) {
			NotificationChain msgs = null;
			if (xalAddressDetails != null)
				msgs = ((InternalEObject)xalAddressDetails).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmlPackage.FEATURE__XAL_ADDRESS_DETAILS, null, msgs);
			if (newXalAddressDetails != null)
				msgs = ((InternalEObject)newXalAddressDetails).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmlPackage.FEATURE__XAL_ADDRESS_DETAILS, null, msgs);
			msgs = basicSetXalAddressDetails(newXalAddressDetails, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.FEATURE__XAL_ADDRESS_DETAILS, newXalAddressDetails, newXalAddressDetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSnippet() {
		return snippet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSnippet(String newSnippet) {
		String oldSnippet = snippet;
		snippet = newSnippet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.FEATURE__SNIPPET, oldSnippet, snippet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.FEATURE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractView getAbstractView() {
		return abstractView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractView(AbstractView newAbstractView, NotificationChain msgs) {
		AbstractView oldAbstractView = abstractView;
		abstractView = newAbstractView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmlPackage.FEATURE__ABSTRACT_VIEW, oldAbstractView, newAbstractView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractView(AbstractView newAbstractView) {
		if (newAbstractView != abstractView) {
			NotificationChain msgs = null;
			if (abstractView != null)
				msgs = ((InternalEObject)abstractView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmlPackage.FEATURE__ABSTRACT_VIEW, null, msgs);
			if (newAbstractView != null)
				msgs = ((InternalEObject)newAbstractView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmlPackage.FEATURE__ABSTRACT_VIEW, null, msgs);
			msgs = basicSetAbstractView(newAbstractView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.FEATURE__ABSTRACT_VIEW, newAbstractView, newAbstractView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePrimitive getTimePrimitive() {
		return timePrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimePrimitive(TimePrimitive newTimePrimitive, NotificationChain msgs) {
		TimePrimitive oldTimePrimitive = timePrimitive;
		timePrimitive = newTimePrimitive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmlPackage.FEATURE__TIME_PRIMITIVE, oldTimePrimitive, newTimePrimitive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimePrimitive(TimePrimitive newTimePrimitive) {
		if (newTimePrimitive != timePrimitive) {
			NotificationChain msgs = null;
			if (timePrimitive != null)
				msgs = ((InternalEObject)timePrimitive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmlPackage.FEATURE__TIME_PRIMITIVE, null, msgs);
			if (newTimePrimitive != null)
				msgs = ((InternalEObject)newTimePrimitive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmlPackage.FEATURE__TIME_PRIMITIVE, null, msgs);
			msgs = basicSetTimePrimitive(newTimePrimitive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.FEATURE__TIME_PRIMITIVE, newTimePrimitive, newTimePrimitive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleUrl() {
		return styleUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleUrl(String newStyleUrl) {
		String oldStyleUrl = styleUrl;
		styleUrl = newStyleUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.FEATURE__STYLE_URL, oldStyleUrl, styleUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StyleSelector> getStyleSelectors() {
		if (styleSelectors == null) {
			styleSelectors = new EObjectContainmentEList<StyleSelector>(StyleSelector.class, this, KmlPackage.FEATURE__STYLE_SELECTORS);
		}
		return styleSelectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getRegion() {
		if (region != null && region.eIsProxy()) {
			InternalEObject oldRegion = (InternalEObject)region;
			region = (Region)eResolveProxy(oldRegion);
			if (region != oldRegion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KmlPackage.FEATURE__REGION, oldRegion, region));
			}
		}
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region basicGetRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(Region newRegion) {
		Region oldRegion = region;
		region = newRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.FEATURE__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedData getExtendedData() {
		return extendedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtendedData(ExtendedData newExtendedData, NotificationChain msgs) {
		ExtendedData oldExtendedData = extendedData;
		extendedData = newExtendedData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmlPackage.FEATURE__EXTENDED_DATA, oldExtendedData, newExtendedData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedData(ExtendedData newExtendedData) {
		if (newExtendedData != extendedData) {
			NotificationChain msgs = null;
			if (extendedData != null)
				msgs = ((InternalEObject)extendedData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmlPackage.FEATURE__EXTENDED_DATA, null, msgs);
			if (newExtendedData != null)
				msgs = ((InternalEObject)newExtendedData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmlPackage.FEATURE__EXTENDED_DATA, null, msgs);
			msgs = basicSetExtendedData(newExtendedData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.FEATURE__EXTENDED_DATA, newExtendedData, newExtendedData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmlPackage.FEATURE__ATOM_AUTHOR:
				return basicSetAtomAuthor(null, msgs);
			case KmlPackage.FEATURE__ATOM_LINK:
				return basicSetAtomLink(null, msgs);
			case KmlPackage.FEATURE__XAL_ADDRESS_DETAILS:
				return basicSetXalAddressDetails(null, msgs);
			case KmlPackage.FEATURE__ABSTRACT_VIEW:
				return basicSetAbstractView(null, msgs);
			case KmlPackage.FEATURE__TIME_PRIMITIVE:
				return basicSetTimePrimitive(null, msgs);
			case KmlPackage.FEATURE__STYLE_SELECTORS:
				return ((InternalEList<?>)getStyleSelectors()).basicRemove(otherEnd, msgs);
			case KmlPackage.FEATURE__EXTENDED_DATA:
				return basicSetExtendedData(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KmlPackage.FEATURE__NAME:
				return getName();
			case KmlPackage.FEATURE__VISIBILITY:
				return isVisibility();
			case KmlPackage.FEATURE__OPEN:
				return isOpen();
			case KmlPackage.FEATURE__ATOM_AUTHOR:
				return getAtomAuthor();
			case KmlPackage.FEATURE__ATOM_LINK:
				return getAtomLink();
			case KmlPackage.FEATURE__ADDRESS:
				return getAddress();
			case KmlPackage.FEATURE__PHONE_NUMBER:
				return getPhoneNumber();
			case KmlPackage.FEATURE__XAL_ADDRESS_DETAILS:
				return getXalAddressDetails();
			case KmlPackage.FEATURE__SNIPPET:
				return getSnippet();
			case KmlPackage.FEATURE__DESCRIPTION:
				return getDescription();
			case KmlPackage.FEATURE__ABSTRACT_VIEW:
				return getAbstractView();
			case KmlPackage.FEATURE__TIME_PRIMITIVE:
				return getTimePrimitive();
			case KmlPackage.FEATURE__STYLE_URL:
				return getStyleUrl();
			case KmlPackage.FEATURE__STYLE_SELECTORS:
				return getStyleSelectors();
			case KmlPackage.FEATURE__REGION:
				if (resolve) return getRegion();
				return basicGetRegion();
			case KmlPackage.FEATURE__EXTENDED_DATA:
				return getExtendedData();
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
			case KmlPackage.FEATURE__NAME:
				setName((String)newValue);
				return;
			case KmlPackage.FEATURE__VISIBILITY:
				setVisibility((Boolean)newValue);
				return;
			case KmlPackage.FEATURE__OPEN:
				setOpen((Boolean)newValue);
				return;
			case KmlPackage.FEATURE__ATOM_AUTHOR:
				setAtomAuthor((Author)newValue);
				return;
			case KmlPackage.FEATURE__ATOM_LINK:
				setAtomLink((Link)newValue);
				return;
			case KmlPackage.FEATURE__ADDRESS:
				setAddress((String)newValue);
				return;
			case KmlPackage.FEATURE__PHONE_NUMBER:
				setPhoneNumber((String)newValue);
				return;
			case KmlPackage.FEATURE__XAL_ADDRESS_DETAILS:
				setXalAddressDetails((AddressDetails)newValue);
				return;
			case KmlPackage.FEATURE__SNIPPET:
				setSnippet((String)newValue);
				return;
			case KmlPackage.FEATURE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case KmlPackage.FEATURE__ABSTRACT_VIEW:
				setAbstractView((AbstractView)newValue);
				return;
			case KmlPackage.FEATURE__TIME_PRIMITIVE:
				setTimePrimitive((TimePrimitive)newValue);
				return;
			case KmlPackage.FEATURE__STYLE_URL:
				setStyleUrl((String)newValue);
				return;
			case KmlPackage.FEATURE__STYLE_SELECTORS:
				getStyleSelectors().clear();
				getStyleSelectors().addAll((Collection<? extends StyleSelector>)newValue);
				return;
			case KmlPackage.FEATURE__REGION:
				setRegion((Region)newValue);
				return;
			case KmlPackage.FEATURE__EXTENDED_DATA:
				setExtendedData((ExtendedData)newValue);
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
			case KmlPackage.FEATURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case KmlPackage.FEATURE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case KmlPackage.FEATURE__OPEN:
				setOpen(OPEN_EDEFAULT);
				return;
			case KmlPackage.FEATURE__ATOM_AUTHOR:
				setAtomAuthor((Author)null);
				return;
			case KmlPackage.FEATURE__ATOM_LINK:
				setAtomLink((Link)null);
				return;
			case KmlPackage.FEATURE__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case KmlPackage.FEATURE__PHONE_NUMBER:
				setPhoneNumber(PHONE_NUMBER_EDEFAULT);
				return;
			case KmlPackage.FEATURE__XAL_ADDRESS_DETAILS:
				setXalAddressDetails((AddressDetails)null);
				return;
			case KmlPackage.FEATURE__SNIPPET:
				setSnippet(SNIPPET_EDEFAULT);
				return;
			case KmlPackage.FEATURE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case KmlPackage.FEATURE__ABSTRACT_VIEW:
				setAbstractView((AbstractView)null);
				return;
			case KmlPackage.FEATURE__TIME_PRIMITIVE:
				setTimePrimitive((TimePrimitive)null);
				return;
			case KmlPackage.FEATURE__STYLE_URL:
				setStyleUrl(STYLE_URL_EDEFAULT);
				return;
			case KmlPackage.FEATURE__STYLE_SELECTORS:
				getStyleSelectors().clear();
				return;
			case KmlPackage.FEATURE__REGION:
				setRegion((Region)null);
				return;
			case KmlPackage.FEATURE__EXTENDED_DATA:
				setExtendedData((ExtendedData)null);
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
			case KmlPackage.FEATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case KmlPackage.FEATURE__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case KmlPackage.FEATURE__OPEN:
				return open != OPEN_EDEFAULT;
			case KmlPackage.FEATURE__ATOM_AUTHOR:
				return atomAuthor != null;
			case KmlPackage.FEATURE__ATOM_LINK:
				return atomLink != null;
			case KmlPackage.FEATURE__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case KmlPackage.FEATURE__PHONE_NUMBER:
				return PHONE_NUMBER_EDEFAULT == null ? phoneNumber != null : !PHONE_NUMBER_EDEFAULT.equals(phoneNumber);
			case KmlPackage.FEATURE__XAL_ADDRESS_DETAILS:
				return xalAddressDetails != null;
			case KmlPackage.FEATURE__SNIPPET:
				return SNIPPET_EDEFAULT == null ? snippet != null : !SNIPPET_EDEFAULT.equals(snippet);
			case KmlPackage.FEATURE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case KmlPackage.FEATURE__ABSTRACT_VIEW:
				return abstractView != null;
			case KmlPackage.FEATURE__TIME_PRIMITIVE:
				return timePrimitive != null;
			case KmlPackage.FEATURE__STYLE_URL:
				return STYLE_URL_EDEFAULT == null ? styleUrl != null : !STYLE_URL_EDEFAULT.equals(styleUrl);
			case KmlPackage.FEATURE__STYLE_SELECTORS:
				return styleSelectors != null && !styleSelectors.isEmpty();
			case KmlPackage.FEATURE__REGION:
				return region != null;
			case KmlPackage.FEATURE__EXTENDED_DATA:
				return extendedData != null;
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
		result.append(", visibility: ");
		result.append(visibility);
		result.append(", open: ");
		result.append(open);
		result.append(", address: ");
		result.append(address);
		result.append(", phoneNumber: ");
		result.append(phoneNumber);
		result.append(", snippet: ");
		result.append(snippet);
		result.append(", description: ");
		result.append(description);
		result.append(", styleUrl: ");
		result.append(styleUrl);
		result.append(')');
		return result.toString();
	}

} //FeatureImpl
