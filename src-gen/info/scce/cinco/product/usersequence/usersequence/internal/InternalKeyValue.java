/**
 */
package info.scce.cinco.product.usersequence.usersequence.internal;

import graphmodel.internal.InternalNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalKeyValue#getValue <em>Value</em>}</li>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalKeyValue#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalPackage#getInternalKeyValue()
 * @model
 * @generated
 */
public interface InternalKeyValue extends InternalNode {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"value"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalPackage#getInternalKeyValue_Value()
	 * @model default="value"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalKeyValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * The default value is <code>"key"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalPackage#getInternalKeyValue_Key()
	 * @model default="key"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalKeyValue#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

} // InternalKeyValue
