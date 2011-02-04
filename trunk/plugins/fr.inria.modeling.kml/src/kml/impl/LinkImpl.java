/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml.impl;

import kml.KmlPackage;
import kml.Link;
import kml.RefreshMode;
import kml.ViewRefreshMode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kml.impl.LinkImpl#getUrlRef <em>Url Ref</em>}</li>
 *   <li>{@link kml.impl.LinkImpl#getRefreshMode <em>Refresh Mode</em>}</li>
 *   <li>{@link kml.impl.LinkImpl#getRefreshInterval <em>Refresh Interval</em>}</li>
 *   <li>{@link kml.impl.LinkImpl#getViewRefreshMode <em>View Refresh Mode</em>}</li>
 *   <li>{@link kml.impl.LinkImpl#getViewRefreshTime <em>View Refresh Time</em>}</li>
 *   <li>{@link kml.impl.LinkImpl#getViewBoundScale <em>View Bound Scale</em>}</li>
 *   <li>{@link kml.impl.LinkImpl#getViewFormat <em>View Format</em>}</li>
 *   <li>{@link kml.impl.LinkImpl#getHttpQuery <em>Http Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkImpl extends ObjectImpl implements Link {
	/**
	 * The default value of the '{@link #getUrlRef() <em>Url Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlRef()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrlRef() <em>Url Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlRef()
	 * @generated
	 * @ordered
	 */
	protected String urlRef = URL_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefreshMode() <em>Refresh Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshMode()
	 * @generated
	 * @ordered
	 */
	protected static final RefreshMode REFRESH_MODE_EDEFAULT = RefreshMode.ON_CHANGE;

	/**
	 * The cached value of the '{@link #getRefreshMode() <em>Refresh Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshMode()
	 * @generated
	 * @ordered
	 */
	protected RefreshMode refreshMode = REFRESH_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefreshInterval() <em>Refresh Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshInterval()
	 * @generated
	 * @ordered
	 */
	protected static final double REFRESH_INTERVAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRefreshInterval() <em>Refresh Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshInterval()
	 * @generated
	 * @ordered
	 */
	protected double refreshInterval = REFRESH_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getViewRefreshMode() <em>View Refresh Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewRefreshMode()
	 * @generated
	 * @ordered
	 */
	protected static final ViewRefreshMode VIEW_REFRESH_MODE_EDEFAULT = ViewRefreshMode.NEVER;

	/**
	 * The cached value of the '{@link #getViewRefreshMode() <em>View Refresh Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewRefreshMode()
	 * @generated
	 * @ordered
	 */
	protected ViewRefreshMode viewRefreshMode = VIEW_REFRESH_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getViewRefreshTime() <em>View Refresh Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewRefreshTime()
	 * @generated
	 * @ordered
	 */
	protected static final double VIEW_REFRESH_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getViewRefreshTime() <em>View Refresh Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewRefreshTime()
	 * @generated
	 * @ordered
	 */
	protected double viewRefreshTime = VIEW_REFRESH_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getViewBoundScale() <em>View Bound Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewBoundScale()
	 * @generated
	 * @ordered
	 */
	protected static final double VIEW_BOUND_SCALE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getViewBoundScale() <em>View Bound Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewBoundScale()
	 * @generated
	 * @ordered
	 */
	protected double viewBoundScale = VIEW_BOUND_SCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getViewFormat() <em>View Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEW_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViewFormat() <em>View Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewFormat()
	 * @generated
	 * @ordered
	 */
	protected String viewFormat = VIEW_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHttpQuery() <em>Http Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String HTTP_QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHttpQuery() <em>Http Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpQuery()
	 * @generated
	 * @ordered
	 */
	protected String httpQuery = HTTP_QUERY_EDEFAULT;

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
		return KmlPackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrlRef() {
		return urlRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrlRef(String newUrlRef) {
		String oldUrlRef = urlRef;
		urlRef = newUrlRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.LINK__URL_REF, oldUrlRef, urlRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefreshMode getRefreshMode() {
		return refreshMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefreshMode(RefreshMode newRefreshMode) {
		RefreshMode oldRefreshMode = refreshMode;
		refreshMode = newRefreshMode == null ? REFRESH_MODE_EDEFAULT : newRefreshMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.LINK__REFRESH_MODE, oldRefreshMode, refreshMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRefreshInterval() {
		return refreshInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefreshInterval(double newRefreshInterval) {
		double oldRefreshInterval = refreshInterval;
		refreshInterval = newRefreshInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.LINK__REFRESH_INTERVAL, oldRefreshInterval, refreshInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewRefreshMode getViewRefreshMode() {
		return viewRefreshMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewRefreshMode(ViewRefreshMode newViewRefreshMode) {
		ViewRefreshMode oldViewRefreshMode = viewRefreshMode;
		viewRefreshMode = newViewRefreshMode == null ? VIEW_REFRESH_MODE_EDEFAULT : newViewRefreshMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.LINK__VIEW_REFRESH_MODE, oldViewRefreshMode, viewRefreshMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getViewRefreshTime() {
		return viewRefreshTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewRefreshTime(double newViewRefreshTime) {
		double oldViewRefreshTime = viewRefreshTime;
		viewRefreshTime = newViewRefreshTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.LINK__VIEW_REFRESH_TIME, oldViewRefreshTime, viewRefreshTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getViewBoundScale() {
		return viewBoundScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewBoundScale(double newViewBoundScale) {
		double oldViewBoundScale = viewBoundScale;
		viewBoundScale = newViewBoundScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.LINK__VIEW_BOUND_SCALE, oldViewBoundScale, viewBoundScale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getViewFormat() {
		return viewFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewFormat(String newViewFormat) {
		String oldViewFormat = viewFormat;
		viewFormat = newViewFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.LINK__VIEW_FORMAT, oldViewFormat, viewFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHttpQuery() {
		return httpQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpQuery(String newHttpQuery) {
		String oldHttpQuery = httpQuery;
		httpQuery = newHttpQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.LINK__HTTP_QUERY, oldHttpQuery, httpQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KmlPackage.LINK__URL_REF:
				return getUrlRef();
			case KmlPackage.LINK__REFRESH_MODE:
				return getRefreshMode();
			case KmlPackage.LINK__REFRESH_INTERVAL:
				return getRefreshInterval();
			case KmlPackage.LINK__VIEW_REFRESH_MODE:
				return getViewRefreshMode();
			case KmlPackage.LINK__VIEW_REFRESH_TIME:
				return getViewRefreshTime();
			case KmlPackage.LINK__VIEW_BOUND_SCALE:
				return getViewBoundScale();
			case KmlPackage.LINK__VIEW_FORMAT:
				return getViewFormat();
			case KmlPackage.LINK__HTTP_QUERY:
				return getHttpQuery();
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
			case KmlPackage.LINK__URL_REF:
				setUrlRef((String)newValue);
				return;
			case KmlPackage.LINK__REFRESH_MODE:
				setRefreshMode((RefreshMode)newValue);
				return;
			case KmlPackage.LINK__REFRESH_INTERVAL:
				setRefreshInterval((Double)newValue);
				return;
			case KmlPackage.LINK__VIEW_REFRESH_MODE:
				setViewRefreshMode((ViewRefreshMode)newValue);
				return;
			case KmlPackage.LINK__VIEW_REFRESH_TIME:
				setViewRefreshTime((Double)newValue);
				return;
			case KmlPackage.LINK__VIEW_BOUND_SCALE:
				setViewBoundScale((Double)newValue);
				return;
			case KmlPackage.LINK__VIEW_FORMAT:
				setViewFormat((String)newValue);
				return;
			case KmlPackage.LINK__HTTP_QUERY:
				setHttpQuery((String)newValue);
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
			case KmlPackage.LINK__URL_REF:
				setUrlRef(URL_REF_EDEFAULT);
				return;
			case KmlPackage.LINK__REFRESH_MODE:
				setRefreshMode(REFRESH_MODE_EDEFAULT);
				return;
			case KmlPackage.LINK__REFRESH_INTERVAL:
				setRefreshInterval(REFRESH_INTERVAL_EDEFAULT);
				return;
			case KmlPackage.LINK__VIEW_REFRESH_MODE:
				setViewRefreshMode(VIEW_REFRESH_MODE_EDEFAULT);
				return;
			case KmlPackage.LINK__VIEW_REFRESH_TIME:
				setViewRefreshTime(VIEW_REFRESH_TIME_EDEFAULT);
				return;
			case KmlPackage.LINK__VIEW_BOUND_SCALE:
				setViewBoundScale(VIEW_BOUND_SCALE_EDEFAULT);
				return;
			case KmlPackage.LINK__VIEW_FORMAT:
				setViewFormat(VIEW_FORMAT_EDEFAULT);
				return;
			case KmlPackage.LINK__HTTP_QUERY:
				setHttpQuery(HTTP_QUERY_EDEFAULT);
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
			case KmlPackage.LINK__URL_REF:
				return URL_REF_EDEFAULT == null ? urlRef != null : !URL_REF_EDEFAULT.equals(urlRef);
			case KmlPackage.LINK__REFRESH_MODE:
				return refreshMode != REFRESH_MODE_EDEFAULT;
			case KmlPackage.LINK__REFRESH_INTERVAL:
				return refreshInterval != REFRESH_INTERVAL_EDEFAULT;
			case KmlPackage.LINK__VIEW_REFRESH_MODE:
				return viewRefreshMode != VIEW_REFRESH_MODE_EDEFAULT;
			case KmlPackage.LINK__VIEW_REFRESH_TIME:
				return viewRefreshTime != VIEW_REFRESH_TIME_EDEFAULT;
			case KmlPackage.LINK__VIEW_BOUND_SCALE:
				return viewBoundScale != VIEW_BOUND_SCALE_EDEFAULT;
			case KmlPackage.LINK__VIEW_FORMAT:
				return VIEW_FORMAT_EDEFAULT == null ? viewFormat != null : !VIEW_FORMAT_EDEFAULT.equals(viewFormat);
			case KmlPackage.LINK__HTTP_QUERY:
				return HTTP_QUERY_EDEFAULT == null ? httpQuery != null : !HTTP_QUERY_EDEFAULT.equals(httpQuery);
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
		result.append(" (urlRef: ");
		result.append(urlRef);
		result.append(", refreshMode: ");
		result.append(refreshMode);
		result.append(", refreshInterval: ");
		result.append(refreshInterval);
		result.append(", viewRefreshMode: ");
		result.append(viewRefreshMode);
		result.append(", viewRefreshTime: ");
		result.append(viewRefreshTime);
		result.append(", viewBoundScale: ");
		result.append(viewBoundScale);
		result.append(", viewFormat: ");
		result.append(viewFormat);
		result.append(", httpQuery: ");
		result.append(httpQuery);
		result.append(')');
		return result.toString();
	}

} //LinkImpl
