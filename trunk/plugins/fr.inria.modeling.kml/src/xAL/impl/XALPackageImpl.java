/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package xAL.impl;

import atom.AtomPackage;

import atom.impl.AtomPackageImpl;

import kml.KmlPackage;

import kml.impl.KmlPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import xAL.AddressDetails;
import xAL.XALFactory;
import xAL.XALPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XALPackageImpl extends EPackageImpl implements XALPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressDetailsEClass = null;

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
	 * @see xAL.XALPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XALPackageImpl() {
		super(eNS_URI, XALFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link XALPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XALPackage init() {
		if (isInited) return (XALPackage)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI);

		// Obtain or create and register package
		XALPackageImpl theXALPackage = (XALPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XALPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XALPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		KmlPackageImpl theKmlPackage = (KmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KmlPackage.eNS_URI) instanceof KmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KmlPackage.eNS_URI) : KmlPackage.eINSTANCE);
		AtomPackageImpl theAtomPackage = (AtomPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AtomPackage.eNS_URI) instanceof AtomPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AtomPackage.eNS_URI) : AtomPackage.eINSTANCE);

		// Create package meta-data objects
		theXALPackage.createPackageContents();
		theKmlPackage.createPackageContents();
		theAtomPackage.createPackageContents();

		// Initialize created meta-data
		theXALPackage.initializePackageContents();
		theKmlPackage.initializePackageContents();
		theAtomPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXALPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XALPackage.eNS_URI, theXALPackage);
		return theXALPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressDetails() {
		return addressDetailsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XALFactory getXALFactory() {
		return (XALFactory)getEFactoryInstance();
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
		addressDetailsEClass = createEClass(ADDRESS_DETAILS);
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

		// Initialize classes and features; add operations and parameters
		initEClass(addressDetailsEClass, AddressDetails.class, "AddressDetails", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //XALPackageImpl
