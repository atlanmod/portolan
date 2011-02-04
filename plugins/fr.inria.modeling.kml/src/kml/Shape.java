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
 * A representation of the literals of the enumeration '<em><b>Shape</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see kml.KmlPackage#getShape()
 * @model
 * @generated
 */
public enum Shape implements Enumerator {
	/**
	 * The '<em><b>Cylinder</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CYLINDER_VALUE
	 * @generated
	 * @ordered
	 */
	CYLINDER(1, "cylinder", "cylinder"),

	/**
	 * The '<em><b>Rectangle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECTANGLE_VALUE
	 * @generated
	 * @ordered
	 */
	RECTANGLE(0, "rectangle", "rectangle"),

	/**
	 * The '<em><b>Sphere</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPHERE_VALUE
	 * @generated
	 * @ordered
	 */
	SPHERE(2, "sphere", "sphere");

	/**
	 * The '<em><b>Cylinder</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cylinder</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CYLINDER
	 * @model name="cylinder"
	 * @generated
	 * @ordered
	 */
	public static final int CYLINDER_VALUE = 1;

	/**
	 * The '<em><b>Rectangle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rectangle</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECTANGLE
	 * @model name="rectangle"
	 * @generated
	 * @ordered
	 */
	public static final int RECTANGLE_VALUE = 0;

	/**
	 * The '<em><b>Sphere</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sphere</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPHERE
	 * @model name="sphere"
	 * @generated
	 * @ordered
	 */
	public static final int SPHERE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Shape</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Shape[] VALUES_ARRAY =
		new Shape[] {
			CYLINDER,
			RECTANGLE,
			SPHERE,
		};

	/**
	 * A public read-only list of all the '<em><b>Shape</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Shape> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Shape</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Shape get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Shape result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Shape</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Shape getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Shape result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Shape</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Shape get(int value) {
		switch (value) {
			case CYLINDER_VALUE: return CYLINDER;
			case RECTANGLE_VALUE: return RECTANGLE;
			case SPHERE_VALUE: return SPHERE;
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
	private Shape(int value, String name, String literal) {
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
	
} //Shape
