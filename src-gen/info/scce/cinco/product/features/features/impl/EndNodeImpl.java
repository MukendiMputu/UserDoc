/**
 */
package info.scce.cinco.product.features.features.impl;

import graphmodel.Direction;
import graphmodel.Edge;
import graphmodel.GraphModel;
import graphmodel.GraphmodelPackage;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.ModelElementContainer;
import graphmodel.Node;

import graphmodel.impl.NodeImpl;

import info.scce.cinco.product.features.features.DocNode;
import info.scce.cinco.product.features.features.EndNode;
import info.scce.cinco.product.features.features.FeatureContainer;
import info.scce.cinco.product.features.features.FeaturesGraphModel;
import info.scce.cinco.product.features.features.FeaturesPackage;
import info.scce.cinco.product.features.features.LabeledEdge;
import info.scce.cinco.product.features.features.StartNode;

import info.scce.cinco.product.features.features.internal.InternalEndNode;

import info.scce.cinco.product.features.features.views.EndNodeView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EndNodeImpl extends NodeImpl implements EndNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturesPackage.eINSTANCE.getEndNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalEndNode getInternalEndNode() {
		return (info.scce.cinco.product.features.features.internal.InternalEndNode) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyEndNode() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preDelete() {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Runnable getPostDeleteFunction() {
		return () -> {};
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Runnable getPostDeleteEvent() {
		return () -> {};
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preSave() {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void postSave() {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphModel getRootElement() {
							if (this.getInternalElement() != null && this.getInternalElement().getRootElement() != null) {
		return (graphmodel.GraphModel) this.getInternalElement().getRootElement().getElement();
								}
								return null;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<? extends Edge> getIncoming() {
		EList<graphmodel.internal.InternalEdge> in = ((graphmodel.internal.InternalNode)getInternalElement()).getIncoming();
		return org.eclipse.emf.common.util.ECollections.unmodifiableEList(in
			.stream().map(me -> (graphmodel.Edge)me.getElement()).
				collect(java.util.stream.Collectors.toList()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<? extends Node> getPredecessors() {
		return ((graphmodel.Node)this).getPredecessors(graphmodel.Node.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void s_moveTo(final ModelElementContainer container, final int x, final int y) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preMove(final ModelElementContainer newContainer, final int newX, final int newY) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void postMove(final ModelElementContainer source, final ModelElementContainer target, final int x, final int y, final int deltaX, final int deltaY) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preResize(final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void postResize(final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<info.scce.cinco.product.features.features.Edge> getIncomingEdges() {
		return this.getIncoming(info.scce.cinco.product.features.features.Edge.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LabeledEdge> getIncomingLabeledEdges() {
		return this.getIncoming(info.scce.cinco.product.features.features.LabeledEdge.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StartNode> getStartNodePredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.features.features.StartNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeatureContainer> getFeatureContainerPredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.features.features.FeatureContainer.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DocNode> getDocNodePredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.features.features.DocNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canMoveTo(final FeaturesGraphModel featuresGraphModel, final int x, final int y) {
		return featuresGraphModel.canContain(info.scce.cinco.product.features.features.EndNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void moveTo(final FeaturesGraphModel featuresGraphModel, final int x, final int y) {
		transact("Move to", () -> {
			graphmodel.ModelElementContainer sourceContainer = this.getContainer();
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			s_moveTo(featuresGraphModel, x, y);
			featuresGraphModel.getInternalContainerElement().getModelElements().add(ime);
			ime.setX(x);
			ime.setY(y);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void s_moveTo(final FeaturesGraphModel featuresGraphModel, final int x, final int y) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canMoveTo(final FeatureContainer featureContainer, final int x, final int y) {
		return featureContainer.canContain(info.scce.cinco.product.features.features.EndNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void moveTo(final FeatureContainer featureContainer, final int x, final int y) {
		transact("Move to", () -> {
			graphmodel.ModelElementContainer sourceContainer = this.getContainer();
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			s_moveTo(featureContainer, x, y);
			featureContainer.getInternalContainerElement().getModelElements().add(ime);
			ime.setX(x);
			ime.setY(y);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void s_moveTo(final FeatureContainer featureContainer, final int x, final int y) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndNodeView getEndNodeView() {
		EndNodeView endNodeView = info.scce.cinco.product.features.features.views.ViewsFactory.eINSTANCE.createEndNodeView();
		endNodeView.setInternalEndNode((info.scce.cinco.product.features.features.internal.InternalEndNode)getInternalElement());
		return endNodeView;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == IdentifiableElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return FeaturesPackage.END_NODE___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return FeaturesPackage.END_NODE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return FeaturesPackage.END_NODE___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___PRE_SAVE: return FeaturesPackage.END_NODE___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT___POST_SAVE: return FeaturesPackage.END_NODE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Node.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.NODE___GET_PREDECESSORS: return FeaturesPackage.END_NODE___GET_PREDECESSORS;
				case GraphmodelPackage.NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return FeaturesPackage.END_NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return FeaturesPackage.END_NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case GraphmodelPackage.NODE___GET_POST_DELETE_FUNCTION: return FeaturesPackage.END_NODE___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.NODE___GET_POST_DELETE_EVENT: return FeaturesPackage.END_NODE___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.NODE___PRE_DELETE: return FeaturesPackage.END_NODE___PRE_DELETE;
				case GraphmodelPackage.NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return FeaturesPackage.END_NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return FeaturesPackage.END_NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return FeaturesPackage.END_NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___GET_INCOMING: return FeaturesPackage.END_NODE___GET_INCOMING;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FeaturesPackage.END_NODE___GET_INTERNAL_END_NODE:
				return getInternalEndNode();
			case FeaturesPackage.END_NODE___IS_EXACTLY_END_NODE:
				return isExactlyEndNode();
			case FeaturesPackage.END_NODE___PRE_DELETE:
				preDelete();
				return null;
			case FeaturesPackage.END_NODE___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case FeaturesPackage.END_NODE___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case FeaturesPackage.END_NODE___PRE_SAVE:
				preSave();
				return null;
			case FeaturesPackage.END_NODE___POST_SAVE:
				postSave();
				return null;
			case FeaturesPackage.END_NODE___GET_ROOT_ELEMENT:
				return getRootElement();
			case FeaturesPackage.END_NODE___GET_INCOMING:
				return getIncoming();
			case FeaturesPackage.END_NODE___GET_PREDECESSORS:
				return getPredecessors();
			case FeaturesPackage.END_NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT:
				s_moveTo((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case FeaturesPackage.END_NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT:
				preMove((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case FeaturesPackage.END_NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT:
				postMove((ModelElementContainer)arguments.get(0), (ModelElementContainer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
				return null;
			case FeaturesPackage.END_NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION:
				preResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case FeaturesPackage.END_NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION:
				postResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case FeaturesPackage.END_NODE___GET_INCOMING_EDGES:
				return getIncomingEdges();
			case FeaturesPackage.END_NODE___GET_INCOMING_LABELED_EDGES:
				return getIncomingLabeledEdges();
			case FeaturesPackage.END_NODE___GET_START_NODE_PREDECESSORS:
				return getStartNodePredecessors();
			case FeaturesPackage.END_NODE___GET_FEATURE_CONTAINER_PREDECESSORS:
				return getFeatureContainerPredecessors();
			case FeaturesPackage.END_NODE___GET_DOC_NODE_PREDECESSORS:
				return getDocNodePredecessors();
			case FeaturesPackage.END_NODE___CAN_MOVE_TO__FEATURESGRAPHMODEL_INT_INT:
				return canMoveTo((FeaturesGraphModel)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case FeaturesPackage.END_NODE___MOVE_TO__FEATURESGRAPHMODEL_INT_INT:
				moveTo((FeaturesGraphModel)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case FeaturesPackage.END_NODE___SMOVE_TO__FEATURESGRAPHMODEL_INT_INT:
				s_moveTo((FeaturesGraphModel)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case FeaturesPackage.END_NODE___CAN_MOVE_TO__FEATURECONTAINER_INT_INT:
				return canMoveTo((FeatureContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case FeaturesPackage.END_NODE___MOVE_TO__FEATURECONTAINER_INT_INT:
				moveTo((FeatureContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case FeaturesPackage.END_NODE___SMOVE_TO__FEATURECONTAINER_INT_INT:
				s_moveTo((FeatureContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case FeaturesPackage.END_NODE___GET_END_NODE_VIEW:
				return getEndNodeView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //EndNodeImpl
