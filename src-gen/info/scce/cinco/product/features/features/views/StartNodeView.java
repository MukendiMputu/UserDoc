/**
 */
package info.scce.cinco.product.features.features.views;

import info.scce.cinco.product.features.features.internal.InternalStartNode;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Node View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.features.features.views.StartNodeView#getInternalStartNode <em>Internal Start Node</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.features.features.views.ViewsPackage#getStartNodeView()
 * @model
 * @generated
 */
public interface StartNodeView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Start Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Start Node</em>' reference.
	 * @see #setInternalStartNode(InternalStartNode)
	 * @see info.scce.cinco.product.features.features.views.ViewsPackage#getStartNodeView_InternalStartNode()
	 * @model
	 * @generated
	 */
	InternalStartNode getInternalStartNode();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.features.features.views.StartNodeView#getInternalStartNode <em>Internal Start Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Start Node</em>' reference.
	 * @see #getInternalStartNode()
	 * @generated
	 */
	void setInternalStartNode(InternalStartNode value);

} // StartNodeView
