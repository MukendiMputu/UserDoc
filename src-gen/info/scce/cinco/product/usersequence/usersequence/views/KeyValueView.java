/**
 */
package info.scce.cinco.product.usersequence.usersequence.views;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalKeyValue;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Value View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.KeyValueView#getInternalKeyValue <em>Internal Key Value</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getKeyValueView()
 * @model
 * @generated
 */
public interface KeyValueView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Key Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Key Value</em>' reference.
	 * @see #setInternalKeyValue(InternalKeyValue)
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getKeyValueView_InternalKeyValue()
	 * @model
	 * @generated
	 */
	InternalKeyValue getInternalKeyValue();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.usersequence.usersequence.views.KeyValueView#getInternalKeyValue <em>Internal Key Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Key Value</em>' reference.
	 * @see #getInternalKeyValue()
	 * @generated
	 */
	void setInternalKeyValue(InternalKeyValue value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setValue(String _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getKey();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setKey(String _arg);

} // KeyValueView
