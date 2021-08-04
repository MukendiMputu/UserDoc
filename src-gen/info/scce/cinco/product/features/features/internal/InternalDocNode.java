/**
 */
package info.scce.cinco.product.features.features.internal;

import de.jabc.cinco.meta.core.mgl.model.constraints.ConnectionConstraint;

import graphmodel.internal.InternalNode;

import info.scce.cinco.product.features.features.DocNode;
import info.scce.cinco.product.features.features.EndNode;
import info.scce.cinco.product.features.features.FeatureContainer;
import info.scce.cinco.product.features.features.StartNode;

import info.scce.cinco.product.usersequence.usersequence.UserSequenceGraphModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.features.features.internal.InternalDocNode#isCreateScreenshots <em>Create Screenshots</em>}</li>
 *   <li>{@link info.scce.cinco.product.features.features.internal.InternalDocNode#getLibraryComponentUID <em>Library Component UID</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.features.features.internal.InternalPackage#getInternalDocNode()
 * @model
 * @generated
 */
public interface InternalDocNode extends InternalNode {
	/**
	 * Returns the value of the '<em><b>Create Screenshots</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Screenshots</em>' attribute.
	 * @see #setCreateScreenshots(boolean)
	 * @see info.scce.cinco.product.features.features.internal.InternalPackage#getInternalDocNode_CreateScreenshots()
	 * @model default="true"
	 * @generated
	 */
	boolean isCreateScreenshots();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.features.features.internal.InternalDocNode#isCreateScreenshots <em>Create Screenshots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Screenshots</em>' attribute.
	 * @see #isCreateScreenshots()
	 * @generated
	 */
	void setCreateScreenshots(boolean value);

	/**
	 * Returns the value of the '<em><b>Library Component UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library Component UID</em>' attribute.
	 * @see #setLibraryComponentUID(String)
	 * @see info.scce.cinco.product.features.features.internal.InternalPackage#getInternalDocNode_LibraryComponentUID()
	 * @model
	 * @generated
	 */
	String getLibraryComponentUID();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.features.features.internal.InternalDocNode#getLibraryComponentUID <em>Library Component UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library Component UID</em>' attribute.
	 * @see #getLibraryComponentUID()
	 * @generated
	 */
	void setLibraryComponentUID(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="graphmodel.ConnectionConstraint"
	 * @generated
	 */
	EList<ConnectionConstraint> getIncomingConstraints();

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
	EList<StartNode> getStartNodePredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<FeatureContainer> getFeatureContainerPredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<DocNode> getDocNodePredecessors();

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	UserSequenceGraphModel getMgl();

} // InternalDocNode
