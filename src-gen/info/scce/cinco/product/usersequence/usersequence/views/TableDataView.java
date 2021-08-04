/**
 */
package info.scce.cinco.product.usersequence.usersequence.views;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalTableData;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Data View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.TableDataView#getInternalTableData <em>Internal Table Data</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getTableDataView()
 * @model
 * @generated
 */
public interface TableDataView extends WebElementView {
	/**
	 * Returns the value of the '<em><b>Internal Table Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Table Data</em>' reference.
	 * @see #setInternalTableData(InternalTableData)
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getTableDataView_InternalTableData()
	 * @model
	 * @generated
	 */
	InternalTableData getInternalTableData();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableDataView#getInternalTableData <em>Internal Table Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Table Data</em>' reference.
	 * @see #getInternalTableData()
	 * @generated
	 */
	void setInternalTableData(InternalTableData value);

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

} // TableDataView
