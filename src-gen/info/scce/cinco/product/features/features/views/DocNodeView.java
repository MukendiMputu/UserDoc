/**
 */
package info.scce.cinco.product.features.features.views;

import info.scce.cinco.product.features.features.internal.InternalDocNode;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc Node View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.features.features.views.DocNodeView#getInternalDocNode <em>Internal Doc Node</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.features.features.views.ViewsPackage#getDocNodeView()
 * @model
 * @generated
 */
public interface DocNodeView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Doc Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Doc Node</em>' reference.
	 * @see #setInternalDocNode(InternalDocNode)
	 * @see info.scce.cinco.product.features.features.views.ViewsPackage#getDocNodeView_InternalDocNode()
	 * @model
	 * @generated
	 */
	InternalDocNode getInternalDocNode();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.features.features.views.DocNodeView#getInternalDocNode <em>Internal Doc Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Doc Node</em>' reference.
	 * @see #getInternalDocNode()
	 * @generated
	 */
	void setInternalDocNode(InternalDocNode value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isCreateScreenshots();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setCreateScreenshots(boolean _arg);

} // DocNodeView
