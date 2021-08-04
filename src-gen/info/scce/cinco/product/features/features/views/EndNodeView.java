/**
 */
package info.scce.cinco.product.features.features.views;

import info.scce.cinco.product.features.features.internal.InternalEndNode;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Node View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.features.features.views.EndNodeView#getInternalEndNode <em>Internal End Node</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.features.features.views.ViewsPackage#getEndNodeView()
 * @model
 * @generated
 */
public interface EndNodeView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal End Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal End Node</em>' reference.
	 * @see #setInternalEndNode(InternalEndNode)
	 * @see info.scce.cinco.product.features.features.views.ViewsPackage#getEndNodeView_InternalEndNode()
	 * @model
	 * @generated
	 */
	InternalEndNode getInternalEndNode();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.features.features.views.EndNodeView#getInternalEndNode <em>Internal End Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal End Node</em>' reference.
	 * @see #getInternalEndNode()
	 * @generated
	 */
	void setInternalEndNode(InternalEndNode value);

} // EndNodeView
