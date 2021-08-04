/**
 */
package info.scce.cinco.product.usersequence.usersequence.views;

import info.scce.cinco.product.usersequence.usersequence.Input;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalForm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.FormView#getInternalForm <em>Internal Form</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getFormView()
 * @model
 * @generated
 */
public interface FormView extends WebElementView {
	/**
	 * Returns the value of the '<em><b>Internal Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Form</em>' reference.
	 * @see #setInternalForm(InternalForm)
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getFormView_InternalForm()
	 * @model
	 * @generated
	 */
	InternalForm getInternalForm();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.usersequence.usersequence.views.FormView#getInternalForm <em>Internal Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Form</em>' reference.
	 * @see #getInternalForm()
	 * @generated
	 */
	void setInternalForm(InternalForm value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getMethod();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setMethod(String _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Input> getField();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model _argMany="true"
	 * @generated
	 */
	void setField(EList<Input> _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addField(Input _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeField(Input field);

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
	String getAction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setAction(String _arg);

} // FormView
