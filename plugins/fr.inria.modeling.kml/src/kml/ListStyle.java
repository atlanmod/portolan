/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kml.ListStyle#getBgColor <em>Bg Color</em>}</li>
 *   <li>{@link kml.ListStyle#getItemType <em>Item Type</em>}</li>
 *   <li>{@link kml.ListStyle#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see kml.KmlPackage#getListStyle()
 * @model
 * @generated
 */
public interface ListStyle extends AbstractStyle {
	/**
	 * Returns the value of the '<em><b>Bg Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bg Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bg Color</em>' attribute.
	 * @see #setBgColor(String)
	 * @see kml.KmlPackage#getListStyle_BgColor()
	 * @model dataType="kml.Color"
	 * @generated
	 */
	String getBgColor();

	/**
	 * Sets the value of the '{@link kml.ListStyle#getBgColor <em>Bg Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bg Color</em>' attribute.
	 * @see #getBgColor()
	 * @generated
	 */
	void setBgColor(String value);

	/**
	 * Returns the value of the '<em><b>Item Type</b></em>' attribute.
	 * The literals are from the enumeration {@link kml.ListeItemType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Type</em>' attribute.
	 * @see kml.ListeItemType
	 * @see #setItemType(ListeItemType)
	 * @see kml.KmlPackage#getListStyle_ItemType()
	 * @model
	 * @generated
	 */
	ListeItemType getItemType();

	/**
	 * Sets the value of the '{@link kml.ListStyle#getItemType <em>Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Type</em>' attribute.
	 * @see kml.ListeItemType
	 * @see #getItemType()
	 * @generated
	 */
	void setItemType(ListeItemType value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link kml.ItemIcon}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see kml.KmlPackage#getListStyle_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<ItemIcon> getItems();

} // ListStyle
