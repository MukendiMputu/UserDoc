/**
 */
package info.scce.cinco.product.usersequence.usersequence.views;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalTableBody;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Body View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.TableBodyView#getInternalTableBody <em>Internal Table Body</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getTableBodyView()
 * @model
 * @generated
 */
public interface TableBodyView extends WebElementView {
	/**
	 * Returns the value of the '<em><b>Internal Table Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Table Body</em>' reference.
	 * @see #setInternalTableBody(InternalTableBody)
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getTableBodyView_InternalTableBody()
	 * @model
	 * @generated
	 */
	InternalTableBody getInternalTableBody();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableBodyView#getInternalTableBody <em>Internal Table Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Table Body</em>' reference.
	 * @see #getInternalTableBody()
	 * @generated
	 */
	void setInternalTableBody(InternalTableBody value);

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

} // TableBodyView
