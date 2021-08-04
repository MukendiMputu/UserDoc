/**
 */
package info.scce.cinco.product.features.features.internal;

import de.jabc.cinco.meta.core.mgl.model.constraints.ConnectionConstraint;

import graphmodel.internal.InternalNode;

import info.scce.cinco.product.features.features.DocNode;
import info.scce.cinco.product.features.features.EndNode;
import info.scce.cinco.product.features.features.FeatureContainer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Node</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see info.scce.cinco.product.features.features.internal.InternalPackage#getInternalStartNode()
 * @model
 * @generated
 */
public interface InternalStartNode extends InternalNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="graphmodel.ConnectionConstraint"
	 * @generated
	 */
	EList<ConnectionConstraint> getOutgoingConstraints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<EndNode> getEndNodeSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<FeatureContainer> getFeatureContainerSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<DocNode> getDocNodeSuccessors();

} // InternalStartNode
