/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>View Refresh Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see kml.KmlPackage#getViewRefreshMode()
 * @model
 * @generated
 */
public enum ViewRefreshMode implements Enumerator {
	/**
	 * The '<em><b>Never</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEVER_VALUE
	 * @generated
	 * @ordered
	 */
	NEVER(0, "never", "never"),

	/**
	 * The '<em><b>On Stop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_STOP_VALUE
	 * @generated
	 * @ordered
	 */
	ON_STOP(1, "onStop", "onStop"),

	/**
	 * The '<em><b>On Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	ON_REQUEST(2, "onRequest", "onRequest"),

	/**
	 * The '<em><b>On Region</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_REGION_VALUE
	 * @generated
	 * @ordered
	 */
	ON_REGION(3, "onRegion", "onRegion");

	/**
	 * The '<em><b>Never</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Never</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEVER
	 * @model name="never"
	 * @generated
	 * @ordered
	 */
	public static final int NEVER_VALUE = 0;

	/**
	 * The '<em><b>On Stop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>On Stop</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ON_STOP
	 * @model name="onStop"
	 * @generated
	 * @ordered
	 */
	public static final int ON_STOP_VALUE = 1;

	/**
	 * The '<em><b>On Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>On Request</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ON_REQUEST
	 * @model name="onRequest"
	 * @generated
	 * @ordered
	 */
	public static final int ON_REQUEST_VALUE = 2;

	/**
	 * The '<em><b>On Region</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>On Region</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ON_REGION
	 * @model name="onRegion"
	 * @generated
	 * @ordered
	 */
	public static final int ON_REGION_VALUE = 3;

	/**
	 * An array of all the '<em><b>View Refresh Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ViewRefreshMode[] VALUES_ARRAY =
		new ViewRefreshMode[] {
			NEVER,
			ON_STOP,
			ON_REQUEST,
			ON_REGION,
		};

	/**
	 * A public read-only list of all the '<em><b>View Refresh Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ViewRefreshMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>View Refresh Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ViewRefreshMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ViewRefreshMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>View Refresh Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ViewRefreshMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ViewRefreshMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>View Refresh Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ViewRefreshMode get(int value) {
		switch (value) {
			case NEVER_VALUE: return NEVER;
			case ON_STOP_VALUE: return ON_STOP;
			case ON_REQUEST_VALUE: return ON_REQUEST;
			case ON_REGION_VALUE: return ON_REGION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ViewRefreshMode(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ViewRefreshMode
