/**
 */
package info.scce.cinco.product.usersequence.usersequence;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Actions</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.usersequence.usersequence.UsersequencePackage#getActions()
 * @model
 * @generated
 */
public enum Actions implements Enumerator {
	/**
	 * The '<em><b>Goto</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOTO_VALUE
	 * @generated
	 * @ordered
	 */
	GOTO(0, "goto", "goto"),

	/**
	 * The '<em><b>Click</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLICK_VALUE
	 * @generated
	 * @ordered
	 */
	CLICK(1, "click", "click"),

	/**
	 * The '<em><b>Select</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECT_VALUE
	 * @generated
	 * @ordered
	 */
	SELECT(2, "select", "select"),

	/**
	 * The '<em><b>Enter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTER_VALUE
	 * @generated
	 * @ordered
	 */
	ENTER(3, "enter", "enter"),

	/**
	 * The '<em><b>Check</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECK_VALUE
	 * @generated
	 * @ordered
	 */
	CHECK(4, "check", "check"),

	/**
	 * The '<em><b>Submit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBMIT_VALUE
	 * @generated
	 * @ordered
	 */
	SUBMIT(5, "submit", "submit"),

	/**
	 * The '<em><b>Clear</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLEAR_VALUE
	 * @generated
	 * @ordered
	 */
	CLEAR(6, "clear", "clear");

	/**
	 * The '<em><b>Goto</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOTO
	 * @model name="goto"
	 * @generated
	 * @ordered
	 */
	public static final int GOTO_VALUE = 0;

	/**
	 * The '<em><b>Click</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLICK
	 * @model name="click"
	 * @generated
	 * @ordered
	 */
	public static final int CLICK_VALUE = 1;

	/**
	 * The '<em><b>Select</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECT
	 * @model name="select"
	 * @generated
	 * @ordered
	 */
	public static final int SELECT_VALUE = 2;

	/**
	 * The '<em><b>Enter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTER
	 * @model name="enter"
	 * @generated
	 * @ordered
	 */
	public static final int ENTER_VALUE = 3;

	/**
	 * The '<em><b>Check</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECK
	 * @model name="check"
	 * @generated
	 * @ordered
	 */
	public static final int CHECK_VALUE = 4;

	/**
	 * The '<em><b>Submit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBMIT
	 * @model name="submit"
	 * @generated
	 * @ordered
	 */
	public static final int SUBMIT_VALUE = 5;

	/**
	 * The '<em><b>Clear</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLEAR
	 * @model name="clear"
	 * @generated
	 * @ordered
	 */
	public static final int CLEAR_VALUE = 6;

	/**
	 * An array of all the '<em><b>Actions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Actions[] VALUES_ARRAY =
		new Actions[] {
			GOTO,
			CLICK,
			SELECT,
			ENTER,
			CHECK,
			SUBMIT,
			CLEAR,
		};

	/**
	 * A public read-only list of all the '<em><b>Actions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Actions> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Actions</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Actions get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Actions result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Actions</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Actions getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Actions result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Actions</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Actions get(int value) {
		switch (value) {
			case GOTO_VALUE: return GOTO;
			case CLICK_VALUE: return CLICK;
			case SELECT_VALUE: return SELECT;
			case ENTER_VALUE: return ENTER;
			case CHECK_VALUE: return CHECK;
			case SUBMIT_VALUE: return SUBMIT;
			case CLEAR_VALUE: return CLEAR;
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
	private Actions(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //Actions
