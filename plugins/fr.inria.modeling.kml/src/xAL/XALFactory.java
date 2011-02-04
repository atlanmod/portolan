/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package xAL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see xAL.XALPackage
 * @generated
 */
public interface XALFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XALFactory eINSTANCE = xAL.impl.XALFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Address Details</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address Details</em>'.
	 * @generated
	 */
	AddressDetails createAddressDetails();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XALPackage getXALPackage();

} //XALFactory
