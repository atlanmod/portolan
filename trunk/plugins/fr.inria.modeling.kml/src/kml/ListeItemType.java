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
 * A representation of the literals of the enumeration '<em><b>Liste Item Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see kml.KmlPackage#getListeItemType()
 * @model
 * @generated
 */
public enum ListeItemType implements Enumerator {
	/**
	 * The '<em><b>Check</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECK_VALUE
	 * @generated
	 * @ordered
	 */
	CHECK(0, "check", "check"),

	/**
	 * The '<em><b>Check Off Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECK_OFF_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	CHECK_OFF_ONLY(1, "checkOffOnly", "checkOffOnly"),

	/**
	 * The '<em><b>Check Hide Children</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECK_HIDE_CHILDREN_VALUE
	 * @generated
	 * @ordered
	 */
	CHECK_HIDE_CHILDREN(2, "checkHideChildren", "checkHideChildren"),

	/**
	 * The '<em><b>Radio Folder</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADIO_FOLDER_VALUE
	 * @generated
	 * @ordered
	 */
	RADIO_FOLDER(3, "radioFolder", "radioFolder");

	/**
	 * The '<em><b>Check</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Check</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHECK
	 * @model name="check"
	 * @generated
	 * @ordered
	 */
	public static final int CHECK_VALUE = 0;

	/**
	 * The '<em><b>Check Off Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Check Off Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHECK_OFF_ONLY
	 * @model name="checkOffOnly"
	 * @generated
	 * @ordered
	 */
	public static final int CHECK_OFF_ONLY_VALUE = 1;

	/**
	 * The '<em><b>Check Hide Children</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Check Hide Children</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHECK_HIDE_CHILDREN
	 * @model name="checkHideChildren"
	 * @generated
	 * @ordered
	 */
	public static final int CHECK_HIDE_CHILDREN_VALUE = 2;

	/**
	 * The '<em><b>Radio Folder</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Radio Folder</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RADIO_FOLDER
	 * @model name="radioFolder"
	 * @generated
	 * @ordered
	 */
	public static final int RADIO_FOLDER_VALUE = 3;

	/**
	 * An array of all the '<em><b>Liste Item Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ListeItemType[] VALUES_ARRAY =
		new ListeItemType[] {
			CHECK,
			CHECK_OFF_ONLY,
			CHECK_HIDE_CHILDREN,
			RADIO_FOLDER,
		};

	/**
	 * A public read-only list of all the '<em><b>Liste Item Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ListeItemType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Liste Item Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ListeItemType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ListeItemType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Liste Item Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ListeItemType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ListeItemType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Liste Item Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ListeItemType get(int value) {
		switch (value) {
			case CHECK_VALUE: return CHECK;
			case CHECK_OFF_ONLY_VALUE: return CHECK_OFF_ONLY;
			case CHECK_HIDE_CHILDREN_VALUE: return CHECK_HIDE_CHILDREN;
			case RADIO_FOLDER_VALUE: return RADIO_FOLDER;
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
	private ListeItemType(int value, String name, String literal) {
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
	
} //ListeItemType
