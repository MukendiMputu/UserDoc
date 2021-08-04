/**
 */
package info.scce.cinco.product.features.features;

import graphmodel.Direction;
import graphmodel.Edge;
import graphmodel.GraphModel;
import graphmodel.ModelElementContainer;
import graphmodel.Node;

import info.scce.cinco.product.features.features.internal.InternalEndNode;

import info.scce.cinco.product.features.features.views.EndNodeView;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Node</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see info.scce.cinco.product.features.features.FeaturesPackage#getEndNode()
 * @model
 * @generated
 */
public interface EndNode extends Node {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	InternalEndNode getInternalEndNode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isExactlyEndNode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void preDelete();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="graphmodel.Runnable" required="true"
	 * @generated
	 */
	Runnable getPostDeleteFunction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="graphmodel.Runnable" required="true"
	 * @generated
	 */
	Runnable getPostDeleteEvent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void preSave();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void postSave();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	GraphModel getRootElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 * @generated
	 */
	EList<? extends Edge> getIncoming();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 * @generated
	 */
	EList<? extends Node> getPredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model containerRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void s_moveTo(ModelElementContainer container, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model newContainerRequired="true" newXRequired="true" newYRequired="true"
	 * @generated
	 */
	void preMove(ModelElementContainer newContainer, int newX, int newY);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sourceRequired="true" targetRequired="true" xRequired="true" yRequired="true" deltaXRequired="true" deltaYRequired="true"
	 * @generated
	 */
	void postMove(ModelElementContainer source, ModelElementContainer target, int x, int y, int deltaX, int deltaY);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model newWidthRequired="true" newHeightRequired="true" newXRequired="true" newYRequired="true" directionRequired="true"
	 * @generated
	 */
	void preResize(int newWidth, int newHeight, int newX, int newY, Direction direction);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model oldWidthRequired="true" oldHeightRequired="true" oldXRequired="true" oldYRequired="true" directionRequired="true"
	 * @generated
	 */
	void postResize(int oldWidth, int oldHeight, int oldX, int oldY, Direction direction);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<info.scce.cinco.product.features.features.Edge> getIncomingEdges();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<LabeledEdge> getIncomingLabeledEdges();

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
	 * @model required="true" featuresGraphModelRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	boolean canMoveTo(FeaturesGraphModel featuresGraphModel, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model featuresGraphModelRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void moveTo(FeaturesGraphModel featuresGraphModel, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model featuresGraphModelRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void s_moveTo(FeaturesGraphModel featuresGraphModel, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" featureContainerRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	boolean canMoveTo(FeatureContainer featureContainer, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model featureContainerRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void moveTo(FeatureContainer featureContainer, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model featureContainerRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void s_moveTo(FeatureContainer featureContainer, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EndNodeView getEndNodeView();

} // EndNode
