/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package xAL;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see xAL.XALFactory
 * @model kind="package"
 * @generated
 */
public interface XALPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xAL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://oasis.names.tc.ciq/xAL/2.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xal";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XALPackage eINSTANCE = xAL.impl.XALPackageImpl.init();

	/**
	 * The meta object id for the '{@link xAL.impl.AddressDetailsImpl <em>Address Details</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xAL.impl.AddressDetailsImpl
	 * @see xAL.impl.XALPackageImpl#getAddressDetails()
	 * @generated
	 */
	int ADDRESS_DETAILS = 0;

	/**
	 * The number of structural features of the '<em>Address Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link xAL.AddressDetails <em>Address Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Details</em>'.
	 * @see xAL.AddressDetails
	 * @generated
	 */
	EClass getAddressDetails();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XALFactory getXALFactory();

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
		 * The meta object literal for the '{@link xAL.impl.AddressDetailsImpl <em>Address Details</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xAL.impl.AddressDetailsImpl
		 * @see xAL.impl.XALPackageImpl#getAddressDetails()
		 * @generated
		 */
		EClass ADDRESS_DETAILS = eINSTANCE.getAddressDetails();

	}

} //XALPackage
