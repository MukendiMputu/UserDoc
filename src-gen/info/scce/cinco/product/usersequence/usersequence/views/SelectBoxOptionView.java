/**
 */
package info.scce.cinco.product.usersequence.usersequence.views;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalSelectBoxOption;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Box Option View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.SelectBoxOptionView#getInternalSelectBoxOption <em>Internal Select Box Option</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getSelectBoxOptionView()
 * @model
 * @generated
 */
public interface SelectBoxOptionView extends WebElementView {
	/**
	 * Returns the value of the '<em><b>Internal Select Box Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Select Box Option</em>' reference.
	 * @see #setInternalSelectBoxOption(InternalSelectBoxOption)
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getSelectBoxOptionView_InternalSelectBoxOption()
	 * @model
	 * @generated
	 */
	InternalSelectBoxOption getInternalSelectBoxOption();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.usersequence.usersequence.views.SelectBoxOptionView#getInternalSelectBoxOption <em>Internal Select Box Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Select Box Option</em>' reference.
	 * @see #getInternalSelectBoxOption()
	 * @generated
	 */
	void setInternalSelectBoxOption(InternalSelectBoxOption value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isHighlighted();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setHighlighted(boolean _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getSelector();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setSelector(String _arg);

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
	String getContent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setContent(String _arg);

} // SelectBoxOptionView
