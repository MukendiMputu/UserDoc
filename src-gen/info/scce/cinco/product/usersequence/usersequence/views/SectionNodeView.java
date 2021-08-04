/**
 */
package info.scce.cinco.product.usersequence.usersequence.views;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalSectionNode;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section Node View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.SectionNodeView#getInternalSectionNode <em>Internal Section Node</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getSectionNodeView()
 * @model
 * @generated
 */
public interface SectionNodeView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Section Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Section Node</em>' reference.
	 * @see #setInternalSectionNode(InternalSectionNode)
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getSectionNodeView_InternalSectionNode()
	 * @model
	 * @generated
	 */
	InternalSectionNode getInternalSectionNode();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.usersequence.usersequence.views.SectionNodeView#getInternalSectionNode <em>Internal Section Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Section Node</em>' reference.
	 * @see #getInternalSectionNode()
	 * @generated
	 */
	void setInternalSectionNode(InternalSectionNode value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getTitle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setTitle(String _arg);

} // SectionNodeView
