/**
 */
package info.scce.cinco.product.usersequence.usersequence.views;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalTableHead;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Head View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.TableHeadView#getInternalTableHead <em>Internal Table Head</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getTableHeadView()
 * @model
 * @generated
 */
public interface TableHeadView extends WebElementView {
	/**
	 * Returns the value of the '<em><b>Internal Table Head</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Table Head</em>' reference.
	 * @see #setInternalTableHead(InternalTableHead)
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getTableHeadView_InternalTableHead()
	 * @model
	 * @generated
	 */
	InternalTableHead getInternalTableHead();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableHeadView#getInternalTableHead <em>Internal Table Head</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Table Head</em>' reference.
	 * @see #getInternalTableHead()
	 * @generated
	 */
	void setInternalTableHead(InternalTableHead value);

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

} // TableHeadView
