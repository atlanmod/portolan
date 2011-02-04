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
 * A representation of the literals of the enumeration '<em><b>Grid Origin</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see kml.KmlPackage#getGridOrigin()
 * @model
 * @generated
 */
public enum GridOrigin implements Enumerator {
	/**
	 * The '<em><b>Lower Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWER_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	LOWER_LEFT(0, "lowerLeft", "lowerLeft"),

	/**
	 * The '<em><b>Upper Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPPER_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	UPPER_LEFT(1, "upperLeft", "upperLeft");

	/**
	 * The '<em><b>Lower Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lower Left</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOWER_LEFT
	 * @model name="lowerLeft"
	 * @generated
	 * @ordered
	 */
	public static final int LOWER_LEFT_VALUE = 0;

	/**
	 * The '<em><b>Upper Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Upper Left</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPPER_LEFT
	 * @model name="upperLeft"
	 * @generated
	 * @ordered
	 */
	public static final int UPPER_LEFT_VALUE = 1;

	/**
	 * An array of all the '<em><b>Grid Origin</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GridOrigin[] VALUES_ARRAY =
		new GridOrigin[] {
			LOWER_LEFT,
			UPPER_LEFT,
		};

	/**
	 * A public read-only list of all the '<em><b>Grid Origin</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GridOrigin> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Grid Origin</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GridOrigin get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GridOrigin result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Grid Origin</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GridOrigin getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GridOrigin result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Grid Origin</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GridOrigin get(int value) {
		switch (value) {
			case LOWER_LEFT_VALUE: return LOWER_LEFT;
			case UPPER_LEFT_VALUE: return UPPER_LEFT;
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
	private GridOrigin(int value, String name, String literal) {
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
	
} //GridOrigin
