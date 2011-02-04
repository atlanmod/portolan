/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml.impl;

import kml.KmlPackage;
import kml.Link;
import kml.NetworkLink;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kml.impl.NetworkLinkImpl#isRefreshVisibility <em>Refresh Visibility</em>}</li>
 *   <li>{@link kml.impl.NetworkLinkImpl#isFlyToView <em>Fly To View</em>}</li>
 *   <li>{@link kml.impl.NetworkLinkImpl#getLink <em>Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NetworkLinkImpl extends FeatureImpl implements NetworkLink {
	/**
	 * The default value of the '{@link #isRefreshVisibility() <em>Refresh Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRefreshVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REFRESH_VISIBILITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRefreshVisibility() <em>Refresh Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRefreshVisibility()
	 * @generated
	 * @ordered
	 */
	protected boolean refreshVisibility = REFRESH_VISIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isFlyToView() <em>Fly To View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFlyToView()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FLY_TO_VIEW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFlyToView() <em>Fly To View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFlyToView()
	 * @generated
	 * @ordered
	 */
	protected boolean flyToView = FLY_TO_VIEW_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected Link link;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmlPackage.Literals.NETWORK_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRefreshVisibility() {
		return refreshVisibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefreshVisibility(boolean newRefreshVisibility) {
		boolean oldRefreshVisibility = refreshVisibility;
		refreshVisibility = newRefreshVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.NETWORK_LINK__REFRESH_VISIBILITY, oldRefreshVisibility, refreshVisibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFlyToView() {
		return flyToView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlyToView(boolean newFlyToView) {
		boolean oldFlyToView = flyToView;
		flyToView = newFlyToView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.NETWORK_LINK__FLY_TO_VIEW, oldFlyToView, flyToView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link getLink() {
		if (link != null && link.eIsProxy()) {
			InternalEObject oldLink = (InternalEObject)link;
			link = (Link)eResolveProxy(oldLink);
			if (link != oldLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KmlPackage.NETWORK_LINK__LINK, oldLink, link));
			}
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link basicGetLink() {
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(Link newLink) {
		Link oldLink = link;
		link = newLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.NETWORK_LINK__LINK, oldLink, link));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KmlPackage.NETWORK_LINK__REFRESH_VISIBILITY:
				return isRefreshVisibility();
			case KmlPackage.NETWORK_LINK__FLY_TO_VIEW:
				return isFlyToView();
			case KmlPackage.NETWORK_LINK__LINK:
				if (resolve) return getLink();
				return basicGetLink();
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
			case KmlPackage.NETWORK_LINK__REFRESH_VISIBILITY:
				setRefreshVisibility((Boolean)newValue);
				return;
			case KmlPackage.NETWORK_LINK__FLY_TO_VIEW:
				setFlyToView((Boolean)newValue);
				return;
			case KmlPackage.NETWORK_LINK__LINK:
				setLink((Link)newValue);
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
			case KmlPackage.NETWORK_LINK__REFRESH_VISIBILITY:
				setRefreshVisibility(REFRESH_VISIBILITY_EDEFAULT);
				return;
			case KmlPackage.NETWORK_LINK__FLY_TO_VIEW:
				setFlyToView(FLY_TO_VIEW_EDEFAULT);
				return;
			case KmlPackage.NETWORK_LINK__LINK:
				setLink((Link)null);
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
			case KmlPackage.NETWORK_LINK__REFRESH_VISIBILITY:
				return refreshVisibility != REFRESH_VISIBILITY_EDEFAULT;
			case KmlPackage.NETWORK_LINK__FLY_TO_VIEW:
				return flyToView != FLY_TO_VIEW_EDEFAULT;
			case KmlPackage.NETWORK_LINK__LINK:
				return link != null;
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
		result.append(" (refreshVisibility: ");
		result.append(refreshVisibility);
		result.append(", flyToView: ");
		result.append(flyToView);
		result.append(')');
		return result.toString();
	}

} //NetworkLinkImpl
