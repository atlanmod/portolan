/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package atom;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see atom.AtomFactory
 * @model kind="package"
 * @generated
 */
public interface AtomPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "atom";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://atom/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "atom";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AtomPackage eINSTANCE = atom.impl.AtomPackageImpl.init();

	/**
	 * The meta object id for the '{@link atom.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atom.impl.ElementImpl
	 * @see atom.impl.AtomPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__BASE = 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__LANG = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link atom.impl.PersonConstructImpl <em>Person Construct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atom.impl.PersonConstructImpl
	 * @see atom.impl.AtomPackageImpl#getPersonConstruct()
	 * @generated
	 */
	int PERSON_CONSTRUCT = 0;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_CONSTRUCT__BASE = ELEMENT__BASE;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_CONSTRUCT__LANG = ELEMENT__LANG;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_CONSTRUCT__NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_CONSTRUCT__URI = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_CONSTRUCT__EMAIL = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_CONSTRUCT__EXTENSION = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Person Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_CONSTRUCT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link atom.impl.UriImpl <em>Uri</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atom.impl.UriImpl
	 * @see atom.impl.AtomPackageImpl#getUri()
	 * @generated
	 */
	int URI = 1;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI__BASE = ELEMENT__BASE;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI__LANG = ELEMENT__LANG;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Uri</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link atom.impl.EmailAddressImpl <em>Email Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atom.impl.EmailAddressImpl
	 * @see atom.impl.AtomPackageImpl#getEmailAddress()
	 * @generated
	 */
	int EMAIL_ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS__BASE = ELEMENT__BASE;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS__LANG = ELEMENT__LANG;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Email Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link atom.impl.AuthorImpl <em>Author</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atom.impl.AuthorImpl
	 * @see atom.impl.AtomPackageImpl#getAuthor()
	 * @generated
	 */
	int AUTHOR = 4;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__BASE = PERSON_CONSTRUCT__BASE;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__LANG = PERSON_CONSTRUCT__LANG;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__NAME = PERSON_CONSTRUCT__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__URI = PERSON_CONSTRUCT__URI;

	/**
	 * The feature id for the '<em><b>Email</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__EMAIL = PERSON_CONSTRUCT__EMAIL;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__EXTENSION = PERSON_CONSTRUCT__EXTENSION;

	/**
	 * The number of structural features of the '<em>Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_FEATURE_COUNT = PERSON_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link atom.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atom.impl.LinkImpl
	 * @see atom.impl.AtomPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 5;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__BASE = ELEMENT__BASE;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LANG = ELEMENT__LANG;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TITLE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LENGTH = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Href</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__HREF = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__REL = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TYPE = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Hreflang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__HREFLANG = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link atom.impl.LanguageTagImpl <em>Language Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atom.impl.LanguageTagImpl
	 * @see atom.impl.AtomPackageImpl#getLanguageTag()
	 * @generated
	 */
	int LANGUAGE_TAG = 6;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TAG__BASE = ELEMENT__BASE;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TAG__LANG = ELEMENT__LANG;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TAG__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Language Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TAG_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link atom.LinkRelation <em>Link Relation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atom.LinkRelation
	 * @see atom.impl.AtomPackageImpl#getLinkRelation()
	 * @generated
	 */
	int LINK_RELATION = 7;


	/**
	 * Returns the meta object for class '{@link atom.PersonConstruct <em>Person Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Construct</em>'.
	 * @see atom.PersonConstruct
	 * @generated
	 */
	EClass getPersonConstruct();

	/**
	 * Returns the meta object for the attribute '{@link atom.PersonConstruct#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see atom.PersonConstruct#getName()
	 * @see #getPersonConstruct()
	 * @generated
	 */
	EAttribute getPersonConstruct_Name();

	/**
	 * Returns the meta object for the reference '{@link atom.PersonConstruct#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uri</em>'.
	 * @see atom.PersonConstruct#getUri()
	 * @see #getPersonConstruct()
	 * @generated
	 */
	EReference getPersonConstruct_Uri();

	/**
	 * Returns the meta object for the reference '{@link atom.PersonConstruct#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Email</em>'.
	 * @see atom.PersonConstruct#getEmail()
	 * @see #getPersonConstruct()
	 * @generated
	 */
	EReference getPersonConstruct_Email();

	/**
	 * Returns the meta object for the reference list '{@link atom.PersonConstruct#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extension</em>'.
	 * @see atom.PersonConstruct#getExtension()
	 * @see #getPersonConstruct()
	 * @generated
	 */
	EReference getPersonConstruct_Extension();

	/**
	 * Returns the meta object for class '{@link atom.Uri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uri</em>'.
	 * @see atom.Uri
	 * @generated
	 */
	EClass getUri();

	/**
	 * Returns the meta object for the attribute '{@link atom.Uri#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see atom.Uri#getValue()
	 * @see #getUri()
	 * @generated
	 */
	EAttribute getUri_Value();

	/**
	 * Returns the meta object for class '{@link atom.EmailAddress <em>Email Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Email Address</em>'.
	 * @see atom.EmailAddress
	 * @generated
	 */
	EClass getEmailAddress();

	/**
	 * Returns the meta object for the attribute '{@link atom.EmailAddress#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see atom.EmailAddress#getValue()
	 * @see #getEmailAddress()
	 * @generated
	 */
	EAttribute getEmailAddress_Value();

	/**
	 * Returns the meta object for class '{@link atom.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see atom.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the reference '{@link atom.Element#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base</em>'.
	 * @see atom.Element#getBase()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Base();

	/**
	 * Returns the meta object for the reference '{@link atom.Element#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lang</em>'.
	 * @see atom.Element#getLang()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Lang();

	/**
	 * Returns the meta object for class '{@link atom.Author <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Author</em>'.
	 * @see atom.Author
	 * @generated
	 */
	EClass getAuthor();

	/**
	 * Returns the meta object for class '{@link atom.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see atom.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link atom.Link#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see atom.Link#getTitle()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Title();

	/**
	 * Returns the meta object for the attribute '{@link atom.Link#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see atom.Link#getLength()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Length();

	/**
	 * Returns the meta object for the reference '{@link atom.Link#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Href</em>'.
	 * @see atom.Link#getHref()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Href();

	/**
	 * Returns the meta object for the attribute '{@link atom.Link#getRel <em>Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rel</em>'.
	 * @see atom.Link#getRel()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Rel();

	/**
	 * Returns the meta object for the attribute '{@link atom.Link#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see atom.Link#getType()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Type();

	/**
	 * Returns the meta object for the reference '{@link atom.Link#getHreflang <em>Hreflang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hreflang</em>'.
	 * @see atom.Link#getHreflang()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Hreflang();

	/**
	 * Returns the meta object for class '{@link atom.LanguageTag <em>Language Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language Tag</em>'.
	 * @see atom.LanguageTag
	 * @generated
	 */
	EClass getLanguageTag();

	/**
	 * Returns the meta object for the attribute '{@link atom.LanguageTag#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see atom.LanguageTag#getValue()
	 * @see #getLanguageTag()
	 * @generated
	 */
	EAttribute getLanguageTag_Value();

	/**
	 * Returns the meta object for enum '{@link atom.LinkRelation <em>Link Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Link Relation</em>'.
	 * @see atom.LinkRelation
	 * @generated
	 */
	EEnum getLinkRelation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AtomFactory getAtomFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link atom.impl.PersonConstructImpl <em>Person Construct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atom.impl.PersonConstructImpl
		 * @see atom.impl.AtomPackageImpl#getPersonConstruct()
		 * @generated
		 */
		EClass PERSON_CONSTRUCT = eINSTANCE.getPersonConstruct();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_CONSTRUCT__NAME = eINSTANCE.getPersonConstruct_Name();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_CONSTRUCT__URI = eINSTANCE.getPersonConstruct_Uri();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_CONSTRUCT__EMAIL = eINSTANCE.getPersonConstruct_Email();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_CONSTRUCT__EXTENSION = eINSTANCE.getPersonConstruct_Extension();

		/**
		 * The meta object literal for the '{@link atom.impl.UriImpl <em>Uri</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atom.impl.UriImpl
		 * @see atom.impl.AtomPackageImpl#getUri()
		 * @generated
		 */
		EClass URI = eINSTANCE.getUri();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URI__VALUE = eINSTANCE.getUri_Value();

		/**
		 * The meta object literal for the '{@link atom.impl.EmailAddressImpl <em>Email Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atom.impl.EmailAddressImpl
		 * @see atom.impl.AtomPackageImpl#getEmailAddress()
		 * @generated
		 */
		EClass EMAIL_ADDRESS = eINSTANCE.getEmailAddress();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_ADDRESS__VALUE = eINSTANCE.getEmailAddress_Value();

		/**
		 * The meta object literal for the '{@link atom.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atom.impl.ElementImpl
		 * @see atom.impl.AtomPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__BASE = eINSTANCE.getElement_Base();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__LANG = eINSTANCE.getElement_Lang();

		/**
		 * The meta object literal for the '{@link atom.impl.AuthorImpl <em>Author</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atom.impl.AuthorImpl
		 * @see atom.impl.AtomPackageImpl#getAuthor()
		 * @generated
		 */
		EClass AUTHOR = eINSTANCE.getAuthor();

		/**
		 * The meta object literal for the '{@link atom.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atom.impl.LinkImpl
		 * @see atom.impl.AtomPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__TITLE = eINSTANCE.getLink_Title();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__LENGTH = eINSTANCE.getLink_Length();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__HREF = eINSTANCE.getLink_Href();

		/**
		 * The meta object literal for the '<em><b>Rel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__REL = eINSTANCE.getLink_Rel();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__TYPE = eINSTANCE.getLink_Type();

		/**
		 * The meta object literal for the '<em><b>Hreflang</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__HREFLANG = eINSTANCE.getLink_Hreflang();

		/**
		 * The meta object literal for the '{@link atom.impl.LanguageTagImpl <em>Language Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atom.impl.LanguageTagImpl
		 * @see atom.impl.AtomPackageImpl#getLanguageTag()
		 * @generated
		 */
		EClass LANGUAGE_TAG = eINSTANCE.getLanguageTag();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE_TAG__VALUE = eINSTANCE.getLanguageTag_Value();

		/**
		 * The meta object literal for the '{@link atom.LinkRelation <em>Link Relation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atom.LinkRelation
		 * @see atom.impl.AtomPackageImpl#getLinkRelation()
		 * @generated
		 */
		EEnum LINK_RELATION = eINSTANCE.getLinkRelation();

	}

} //AtomPackage
