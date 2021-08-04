/**
 */
package info.scce.cinco.product.usersequence.usersequence.views;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalSelectBox;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Box View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.SelectBoxView#getInternalSelectBox <em>Internal Select Box</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getSelectBoxView()
 * @model
 * @generated
 */
public interface SelectBoxView extends WebElementView {
	/**
	 * Returns the value of the '<em><b>Internal Select Box</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Select Box</em>' reference.
	 * @see #setInternalSelectBox(InternalSelectBox)
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getSelectBoxView_InternalSelectBox()
	 * @model
	 * @generated
	 */
	InternalSelectBox getInternalSelectBox();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.usersequence.usersequence.views.SelectBoxView#getInternalSelectBox <em>Internal Select Box</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Select Box</em>' reference.
	 * @see #getInternalSelectBox()
	 * @generated
	 */
	void setInternalSelectBox(InternalSelectBox value);

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

} // SelectBoxView
