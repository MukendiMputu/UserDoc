/**
 */
package info.scce.cinco.product.features.features.views;

import info.scce.cinco.product.features.features.internal.InternalEdge;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.features.features.views.EdgeView#getInternalEdge <em>Internal Edge</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.features.features.views.ViewsPackage#getEdgeView()
 * @model
 * @generated
 */
public interface EdgeView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Edge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Edge</em>' reference.
	 * @see #setInternalEdge(InternalEdge)
	 * @see info.scce.cinco.product.features.features.views.ViewsPackage#getEdgeView_InternalEdge()
	 * @model
	 * @generated
	 */
	InternalEdge getInternalEdge();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.features.features.views.EdgeView#getInternalEdge <em>Internal Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Edge</em>' reference.
	 * @see #getInternalEdge()
	 * @generated
	 */
	void setInternalEdge(InternalEdge value);

} // EdgeView
