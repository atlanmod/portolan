/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml.impl;

import kml.GridOrigin;
import kml.ImagePyramid;
import kml.KmlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Pyramid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kml.impl.ImagePyramidImpl#getTileSize <em>Tile Size</em>}</li>
 *   <li>{@link kml.impl.ImagePyramidImpl#getMaxWidth <em>Max Width</em>}</li>
 *   <li>{@link kml.impl.ImagePyramidImpl#getMaxHeight <em>Max Height</em>}</li>
 *   <li>{@link kml.impl.ImagePyramidImpl#getGridOrigin <em>Grid Origin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImagePyramidImpl extends EObjectImpl implements ImagePyramid {
	/**
	 * The default value of the '{@link #getTileSize() <em>Tile Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTileSize()
	 * @generated
	 * @ordered
	 */
	protected static final int TILE_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTileSize() <em>Tile Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTileSize()
	 * @generated
	 * @ordered
	 */
	protected int tileSize = TILE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxWidth() <em>Max Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxWidth() <em>Max Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxWidth()
	 * @generated
	 * @ordered
	 */
	protected int maxWidth = MAX_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxHeight() <em>Max Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxHeight() <em>Max Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHeight()
	 * @generated
	 * @ordered
	 */
	protected int maxHeight = MAX_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGridOrigin() <em>Grid Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final GridOrigin GRID_ORIGIN_EDEFAULT = GridOrigin.LOWER_LEFT;

	/**
	 * The cached value of the '{@link #getGridOrigin() <em>Grid Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridOrigin()
	 * @generated
	 * @ordered
	 */
	protected GridOrigin gridOrigin = GRID_ORIGIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImagePyramidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmlPackage.Literals.IMAGE_PYRAMID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTileSize() {
		return tileSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTileSize(int newTileSize) {
		int oldTileSize = tileSize;
		tileSize = newTileSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.IMAGE_PYRAMID__TILE_SIZE, oldTileSize, tileSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxWidth() {
		return maxWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxWidth(int newMaxWidth) {
		int oldMaxWidth = maxWidth;
		maxWidth = newMaxWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.IMAGE_PYRAMID__MAX_WIDTH, oldMaxWidth, maxWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxHeight() {
		return maxHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxHeight(int newMaxHeight) {
		int oldMaxHeight = maxHeight;
		maxHeight = newMaxHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.IMAGE_PYRAMID__MAX_HEIGHT, oldMaxHeight, maxHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridOrigin getGridOrigin() {
		return gridOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGridOrigin(GridOrigin newGridOrigin) {
		GridOrigin oldGridOrigin = gridOrigin;
		gridOrigin = newGridOrigin == null ? GRID_ORIGIN_EDEFAULT : newGridOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.IMAGE_PYRAMID__GRID_ORIGIN, oldGridOrigin, gridOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KmlPackage.IMAGE_PYRAMID__TILE_SIZE:
				return getTileSize();
			case KmlPackage.IMAGE_PYRAMID__MAX_WIDTH:
				return getMaxWidth();
			case KmlPackage.IMAGE_PYRAMID__MAX_HEIGHT:
				return getMaxHeight();
			case KmlPackage.IMAGE_PYRAMID__GRID_ORIGIN:
				return getGridOrigin();
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
			case KmlPackage.IMAGE_PYRAMID__TILE_SIZE:
				setTileSize((Integer)newValue);
				return;
			case KmlPackage.IMAGE_PYRAMID__MAX_WIDTH:
				setMaxWidth((Integer)newValue);
				return;
			case KmlPackage.IMAGE_PYRAMID__MAX_HEIGHT:
				setMaxHeight((Integer)newValue);
				return;
			case KmlPackage.IMAGE_PYRAMID__GRID_ORIGIN:
				setGridOrigin((GridOrigin)newValue);
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
			case KmlPackage.IMAGE_PYRAMID__TILE_SIZE:
				setTileSize(TILE_SIZE_EDEFAULT);
				return;
			case KmlPackage.IMAGE_PYRAMID__MAX_WIDTH:
				setMaxWidth(MAX_WIDTH_EDEFAULT);
				return;
			case KmlPackage.IMAGE_PYRAMID__MAX_HEIGHT:
				setMaxHeight(MAX_HEIGHT_EDEFAULT);
				return;
			case KmlPackage.IMAGE_PYRAMID__GRID_ORIGIN:
				setGridOrigin(GRID_ORIGIN_EDEFAULT);
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
			case KmlPackage.IMAGE_PYRAMID__TILE_SIZE:
				return tileSize != TILE_SIZE_EDEFAULT;
			case KmlPackage.IMAGE_PYRAMID__MAX_WIDTH:
				return maxWidth != MAX_WIDTH_EDEFAULT;
			case KmlPackage.IMAGE_PYRAMID__MAX_HEIGHT:
				return maxHeight != MAX_HEIGHT_EDEFAULT;
			case KmlPackage.IMAGE_PYRAMID__GRID_ORIGIN:
				return gridOrigin != GRID_ORIGIN_EDEFAULT;
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
		result.append(" (tileSize: ");
		result.append(tileSize);
		result.append(", maxWidth: ");
		result.append(maxWidth);
		result.append(", maxHeight: ");
		result.append(maxHeight);
		result.append(", gridOrigin: ");
		result.append(gridOrigin);
		result.append(')');
		return result.toString();
	}

} //ImagePyramidImpl
