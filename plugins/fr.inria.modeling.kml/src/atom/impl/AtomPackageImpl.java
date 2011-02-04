/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package atom.impl;

import atom.AtomFactory;
import atom.AtomPackage;
import atom.Author;
import atom.Element;
import atom.EmailAddress;
import atom.LanguageTag;
import atom.Link;
import atom.LinkRelation;
import atom.PersonConstruct;
import atom.Uri;

import kml.KmlPackage;

import kml.impl.KmlPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import xAL.XALPackage;

import xAL.impl.XALPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtomPackageImpl extends EPackageImpl implements AtomPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personConstructEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uriEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emailAddressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum linkRelationEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see atom.AtomPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AtomPackageImpl() {
		super(eNS_URI, AtomFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AtomPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AtomPackage init() {
		if (isInited) return (AtomPackage)EPackage.Registry.INSTANCE.getEPackage(AtomPackage.eNS_URI);

		// Obtain or create and register package
		AtomPackageImpl theAtomPackage = (AtomPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AtomPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AtomPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		KmlPackageImpl theKmlPackage = (KmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KmlPackage.eNS_URI) instanceof KmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KmlPackage.eNS_URI) : KmlPackage.eINSTANCE);
		XALPackageImpl theXALPackage = (XALPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI) instanceof XALPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI) : XALPackage.eINSTANCE);

		// Create package meta-data objects
		theAtomPackage.createPackageContents();
		theKmlPackage.createPackageContents();
		theXALPackage.createPackageContents();

		// Initialize created meta-data
		theAtomPackage.initializePackageContents();
		theKmlPackage.initializePackageContents();
		theXALPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAtomPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AtomPackage.eNS_URI, theAtomPackage);
		return theAtomPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonConstruct() {
		return personConstructEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonConstruct_Name() {
		return (EAttribute)personConstructEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonConstruct_Uri() {
		return (EReference)personConstructEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonConstruct_Email() {
		return (EReference)personConstructEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonConstruct_Extension() {
		return (EReference)personConstructEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUri() {
		return uriEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUri_Value() {
		return (EAttribute)uriEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmailAddress() {
		return emailAddressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmailAddress_Value() {
		return (EAttribute)emailAddressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Base() {
		return (EReference)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Lang() {
		return (EReference)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthor() {
		return authorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Title() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Length() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Href() {
		return (EReference)linkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Rel() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Type() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Hreflang() {
		return (EReference)linkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguageTag() {
		return languageTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguageTag_Value() {
		return (EAttribute)languageTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLinkRelation() {
		return linkRelationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomFactory getAtomFactory() {
		return (AtomFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		personConstructEClass = createEClass(PERSON_CONSTRUCT);
		createEAttribute(personConstructEClass, PERSON_CONSTRUCT__NAME);
		createEReference(personConstructEClass, PERSON_CONSTRUCT__URI);
		createEReference(personConstructEClass, PERSON_CONSTRUCT__EMAIL);
		createEReference(personConstructEClass, PERSON_CONSTRUCT__EXTENSION);

		uriEClass = createEClass(URI);
		createEAttribute(uriEClass, URI__VALUE);

		emailAddressEClass = createEClass(EMAIL_ADDRESS);
		createEAttribute(emailAddressEClass, EMAIL_ADDRESS__VALUE);

		elementEClass = createEClass(ELEMENT);
		createEReference(elementEClass, ELEMENT__BASE);
		createEReference(elementEClass, ELEMENT__LANG);

		authorEClass = createEClass(AUTHOR);

		linkEClass = createEClass(LINK);
		createEAttribute(linkEClass, LINK__TITLE);
		createEAttribute(linkEClass, LINK__LENGTH);
		createEReference(linkEClass, LINK__HREF);
		createEAttribute(linkEClass, LINK__REL);
		createEAttribute(linkEClass, LINK__TYPE);
		createEReference(linkEClass, LINK__HREFLANG);

		languageTagEClass = createEClass(LANGUAGE_TAG);
		createEAttribute(languageTagEClass, LANGUAGE_TAG__VALUE);

		// Create enums
		linkRelationEEnum = createEEnum(LINK_RELATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		personConstructEClass.getESuperTypes().add(this.getElement());
		uriEClass.getESuperTypes().add(this.getElement());
		emailAddressEClass.getESuperTypes().add(this.getElement());
		authorEClass.getESuperTypes().add(this.getPersonConstruct());
		linkEClass.getESuperTypes().add(this.getElement());
		languageTagEClass.getESuperTypes().add(this.getElement());

		// Initialize classes and features; add operations and parameters
		initEClass(personConstructEClass, PersonConstruct.class, "PersonConstruct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonConstruct_Name(), ecorePackage.getEString(), "name", null, 1, 1, PersonConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonConstruct_Uri(), this.getUri(), null, "uri", null, 0, 1, PersonConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonConstruct_Email(), this.getEmailAddress(), null, "email", null, 0, 1, PersonConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonConstruct_Extension(), this.getElement(), null, "extension", null, 0, -1, PersonConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uriEClass, Uri.class, "Uri", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUri_Value(), ecorePackage.getEString(), "value", null, 1, 1, Uri.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emailAddressEClass, EmailAddress.class, "EmailAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmailAddress_Value(), ecorePackage.getEString(), "value", null, 1, 1, EmailAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_Base(), this.getUri(), null, "base", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Lang(), this.getLanguageTag(), null, "lang", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authorEClass, Author.class, "Author", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink_Title(), ecorePackage.getEString(), "title", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Length(), ecorePackage.getEString(), "length", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Href(), this.getUri(), null, "href", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Rel(), this.getLinkRelation(), "rel", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Type(), ecorePackage.getEString(), "type", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Hreflang(), this.getLanguageTag(), null, "hreflang", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageTagEClass, LanguageTag.class, "LanguageTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLanguageTag_Value(), ecorePackage.getEString(), "value", null, 1, 1, LanguageTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(linkRelationEEnum, LinkRelation.class, "LinkRelation");
		addEEnumLiteral(linkRelationEEnum, LinkRelation.ALTERNATE);
		addEEnumLiteral(linkRelationEEnum, LinkRelation.RELATED);
		addEEnumLiteral(linkRelationEEnum, LinkRelation.SELF);
		addEEnumLiteral(linkRelationEEnum, LinkRelation.ENCLOSURE);
		addEEnumLiteral(linkRelationEEnum, LinkRelation.VIA);

		// Create resource
		createResource(eNS_URI);
	}

} //AtomPackageImpl
