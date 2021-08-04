/**
 */
package info.scce.cinco.product.features.features.views;

import info.scce.cinco.product.features.features.internal.InternalLabeledEdge;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labeled Edge View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.features.features.views.LabeledEdgeView#getInternalLabeledEdge <em>Internal Labeled Edge</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.features.features.views.ViewsPackage#getLabeledEdgeView()
 * @model
 * @generated
 */
public interface LabeledEdgeView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Labeled Edge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Labeled Edge</em>' reference.
	 * @see #setInternalLabeledEdge(InternalLabeledEdge)
	 * @see info.scce.cinco.product.features.features.views.ViewsPackage#getLabeledEdgeView_InternalLabeledEdge()
	 * @model
	 * @generated
	 */
	InternalLabeledEdge getInternalLabeledEdge();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.features.features.views.LabeledEdgeView#getInternalLabeledEdge <em>Internal Labeled Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Labeled Edge</em>' reference.
	 * @see #getInternalLabeledEdge()
	 * @generated
	 */
	void setInternalLabeledEdge(InternalLabeledEdge value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getLabel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setLabel(String _arg);

} // LabeledEdgeView
