/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml.impl;

import java.util.Collection;

import kml.ItemIcon;
import kml.KmlPackage;
import kml.ListStyle;
import kml.ListeItemType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kml.impl.ListStyleImpl#getBgColor <em>Bg Color</em>}</li>
 *   <li>{@link kml.impl.ListStyleImpl#getItemType <em>Item Type</em>}</li>
 *   <li>{@link kml.impl.ListStyleImpl#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListStyleImpl extends AbstractStyleImpl implements ListStyle {
	/**
	 * The default value of the '{@link #getBgColor() <em>Bg Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBgColor()
	 * @generated
	 * @ordered
	 */
	protected static final String BG_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBgColor() <em>Bg Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBgColor()
	 * @generated
	 * @ordered
	 */
	protected String bgColor = BG_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getItemType() <em>Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemType()
	 * @generated
	 * @ordered
	 */
	protected static final ListeItemType ITEM_TYPE_EDEFAULT = ListeItemType.CHECK;

	/**
	 * The cached value of the '{@link #getItemType() <em>Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemType()
	 * @generated
	 * @ordered
	 */
	protected ListeItemType itemType = ITEM_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemIcon> items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmlPackage.Literals.LIST_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBgColor() {
		return bgColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBgColor(String newBgColor) {
		String oldBgColor = bgColor;
		bgColor = newBgColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.LIST_STYLE__BG_COLOR, oldBgColor, bgColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListeItemType getItemType() {
		return itemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemType(ListeItemType newItemType) {
		ListeItemType oldItemType = itemType;
		itemType = newItemType == null ? ITEM_TYPE_EDEFAULT : newItemType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.LIST_STYLE__ITEM_TYPE, oldItemType, itemType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemIcon> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<ItemIcon>(ItemIcon.class, this, KmlPackage.LIST_STYLE__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmlPackage.LIST_STYLE__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
			case KmlPackage.LIST_STYLE__BG_COLOR:
				return getBgColor();
			case KmlPackage.LIST_STYLE__ITEM_TYPE:
				return getItemType();
			case KmlPackage.LIST_STYLE__ITEMS:
				return getItems();
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
			case KmlPackage.LIST_STYLE__BG_COLOR:
				setBgColor((String)newValue);
				return;
			case KmlPackage.LIST_STYLE__ITEM_TYPE:
				setItemType((ListeItemType)newValue);
				return;
			case KmlPackage.LIST_STYLE__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends ItemIcon>)newValue);
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
			case KmlPackage.LIST_STYLE__BG_COLOR:
				setBgColor(BG_COLOR_EDEFAULT);
				return;
			case KmlPackage.LIST_STYLE__ITEM_TYPE:
				setItemType(ITEM_TYPE_EDEFAULT);
				return;
			case KmlPackage.LIST_STYLE__ITEMS:
				getItems().clear();
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
			case KmlPackage.LIST_STYLE__BG_COLOR:
				return BG_COLOR_EDEFAULT == null ? bgColor != null : !BG_COLOR_EDEFAULT.equals(bgColor);
			case KmlPackage.LIST_STYLE__ITEM_TYPE:
				return itemType != ITEM_TYPE_EDEFAULT;
			case KmlPackage.LIST_STYLE__ITEMS:
				return items != null && !items.isEmpty();
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
		result.append(" (bgColor: ");
		result.append(bgColor);
		result.append(", itemType: ");
		result.append(itemType);
		result.append(')');
		return result.toString();
	}

} //ListStyleImpl
