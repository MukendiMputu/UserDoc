/**
 */
package info.scce.cinco.product.usersequence.usersequence.views;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalTableRow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Row View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.TableRowView#getInternalTableRow <em>Internal Table Row</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getTableRowView()
 * @model
 * @generated
 */
public interface TableRowView extends WebElementView {
	/**
	 * Returns the value of the '<em><b>Internal Table Row</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Table Row</em>' reference.
	 * @see #setInternalTableRow(InternalTableRow)
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getTableRowView_InternalTableRow()
	 * @model
	 * @generated
	 */
	InternalTableRow getInternalTableRow();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableRowView#getInternalTableRow <em>Internal Table Row</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Table Row</em>' reference.
	 * @see #getInternalTableRow()
	 * @generated
	 */
	void setInternalTableRow(InternalTableRow value);

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

} // TableRowView
