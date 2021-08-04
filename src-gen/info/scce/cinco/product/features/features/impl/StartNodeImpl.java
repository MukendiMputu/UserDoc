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

import info.scce.cinco.product.features.features.internal.InternalStartNode;

import info.scce.cinco.product.features.features.views.StartNodeView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StartNodeImpl extends NodeImpl implements StartNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturesPackage.eINSTANCE.getStartNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalStartNode getInternalStartNode() {
		return (info.scce.cinco.product.features.features.internal.InternalStartNode) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyStartNode() {
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
	public EList<? extends Edge> getOutgoing() {
		EList<graphmodel.internal.InternalEdge> out = ((graphmodel.internal.InternalNode)getInternalElement()).getOutgoing();
		return org.eclipse.emf.common.util.ECollections.unmodifiableEList(out
			.stream().map(me -> (graphmodel.Edge)me.getElement()).
				collect(java.util.stream.Collectors.toList()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<? extends Node> getSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(graphmodel.Node.class);
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
	public EList<info.scce.cinco.product.features.features.Edge> getOutgoingEdges() {
		return this.getOutgoing(info.scce.cinco.product.features.features.Edge.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LabeledEdge> getOutgoingLabeledEdges() {
		return this.getOutgoing(info.scce.cinco.product.features.features.LabeledEdge.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EndNode> getEndNodeSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.features.features.EndNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeatureContainer> getFeatureContainerSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.features.features.FeatureContainer.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DocNode> getDocNodeSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.features.features.DocNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewEdge(final DocNode target) {
		return this.canStart(info.scce.cinco.product.features.features.Edge.class) && target.canEnd(info.scce.cinco.product.features.features.Edge.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public info.scce.cinco.product.features.features.Edge newEdge(final DocNode target) {
		if (!this.canStart(info.scce.cinco.product.features.features.Edge.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.features.features.Edge.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.features.features.Edge.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.features.features.Edge.class, target.getClass()));
		else {
			info.scce.cinco.product.features.features.Edge edge = info.scce.cinco.product.features.factory.FeaturesFactory.eINSTANCE.createEdge((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public info.scce.cinco.product.features.features.Edge newEdge(final DocNode target, final String id) {
		if (!this.canStart(info.scce.cinco.product.features.features.Edge.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Edge.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.features.features.Edge.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Edge.class, target.getClass()));
		else {
			info.scce.cinco.product.features.features.Edge edge = info.scce.cinco.product.features.factory.FeaturesFactory.eINSTANCE.createEdge(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewEdge(final FeatureContainer target) {
		return this.canStart(info.scce.cinco.product.features.features.Edge.class) && target.canEnd(info.scce.cinco.product.features.features.Edge.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public info.scce.cinco.product.features.features.Edge newEdge(final FeatureContainer target) {
		if (!this.canStart(info.scce.cinco.product.features.features.Edge.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.features.features.Edge.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.features.features.Edge.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.features.features.Edge.class, target.getClass()));
		else {
			info.scce.cinco.product.features.features.Edge edge = info.scce.cinco.product.features.factory.FeaturesFactory.eINSTANCE.createEdge((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public info.scce.cinco.product.features.features.Edge newEdge(final FeatureContainer target, final String id) {
		if (!this.canStart(info.scce.cinco.product.features.features.Edge.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Edge.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.features.features.Edge.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Edge.class, target.getClass()));
		else {
			info.scce.cinco.product.features.features.Edge edge = info.scce.cinco.product.features.factory.FeaturesFactory.eINSTANCE.createEdge(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewEdge(final EndNode target) {
		return this.canStart(info.scce.cinco.product.features.features.Edge.class) && target.canEnd(info.scce.cinco.product.features.features.Edge.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public info.scce.cinco.product.features.features.Edge newEdge(final EndNode target) {
		if (!this.canStart(info.scce.cinco.product.features.features.Edge.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.features.features.Edge.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.features.features.Edge.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.features.features.Edge.class, target.getClass()));
		else {
			info.scce.cinco.product.features.features.Edge edge = info.scce.cinco.product.features.factory.FeaturesFactory.eINSTANCE.createEdge((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public info.scce.cinco.product.features.features.Edge newEdge(final EndNode target, final String id) {
		if (!this.canStart(info.scce.cinco.product.features.features.Edge.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Edge.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.features.features.Edge.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Edge.class, target.getClass()));
		else {
			info.scce.cinco.product.features.features.Edge edge = info.scce.cinco.product.features.factory.FeaturesFactory.eINSTANCE.createEdge(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewLabeledEdge(final DocNode target) {
		return this.canStart(info.scce.cinco.product.features.features.LabeledEdge.class) && target.canEnd(info.scce.cinco.product.features.features.LabeledEdge.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledEdge newLabeledEdge(final DocNode target) {
		if (!this.canStart(info.scce.cinco.product.features.features.LabeledEdge.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.features.features.LabeledEdge.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.features.features.LabeledEdge.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.features.features.LabeledEdge.class, target.getClass()));
		else {
			info.scce.cinco.product.features.features.LabeledEdge edge = info.scce.cinco.product.features.factory.FeaturesFactory.eINSTANCE.createLabeledEdge((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledEdge newLabeledEdge(final DocNode target, final String id) {
		if (!this.canStart(info.scce.cinco.product.features.features.LabeledEdge.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", LabeledEdge.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.features.features.LabeledEdge.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", LabeledEdge.class, target.getClass()));
		else {
			info.scce.cinco.product.features.features.LabeledEdge edge = info.scce.cinco.product.features.factory.FeaturesFactory.eINSTANCE.createLabeledEdge(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewLabeledEdge(final FeatureContainer target) {
		return this.canStart(info.scce.cinco.product.features.features.LabeledEdge.class) && target.canEnd(info.scce.cinco.product.features.features.LabeledEdge.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledEdge newLabeledEdge(final FeatureContainer target) {
		if (!this.canStart(info.scce.cinco.product.features.features.LabeledEdge.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.features.features.LabeledEdge.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.features.features.LabeledEdge.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.features.features.LabeledEdge.class, target.getClass()));
		else {
			info.scce.cinco.product.features.features.LabeledEdge edge = info.scce.cinco.product.features.factory.FeaturesFactory.eINSTANCE.createLabeledEdge((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledEdge newLabeledEdge(final FeatureContainer target, final String id) {
		if (!this.canStart(info.scce.cinco.product.features.features.LabeledEdge.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", LabeledEdge.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.features.features.LabeledEdge.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", LabeledEdge.class, target.getClass()));
		else {
			info.scce.cinco.product.features.features.LabeledEdge edge = info.scce.cinco.product.features.factory.FeaturesFactory.eINSTANCE.createLabeledEdge(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewLabeledEdge(final EndNode target) {
		return this.canStart(info.scce.cinco.product.features.features.LabeledEdge.class) && target.canEnd(info.scce.cinco.product.features.features.LabeledEdge.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledEdge newLabeledEdge(final EndNode target) {
		if (!this.canStart(info.scce.cinco.product.features.features.LabeledEdge.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.features.features.LabeledEdge.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.features.features.LabeledEdge.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.features.features.LabeledEdge.class, target.getClass()));
		else {
			info.scce.cinco.product.features.features.LabeledEdge edge = info.scce.cinco.product.features.factory.FeaturesFactory.eINSTANCE.createLabeledEdge((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledEdge newLabeledEdge(final EndNode target, final String id) {
		if (!this.canStart(info.scce.cinco.product.features.features.LabeledEdge.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", LabeledEdge.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.features.features.LabeledEdge.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", LabeledEdge.class, target.getClass()));
		else {
			info.scce.cinco.product.features.features.LabeledEdge edge = info.scce.cinco.product.features.factory.FeaturesFactory.eINSTANCE.createLabeledEdge(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canMoveTo(final FeaturesGraphModel featuresGraphModel, final int x, final int y) {
		return featuresGraphModel.canContain(info.scce.cinco.product.features.features.StartNode.class);
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
		return featureContainer.canContain(info.scce.cinco.product.features.features.StartNode.class);
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
	public StartNodeView getStartNodeView() {
		StartNodeView startNodeView = info.scce.cinco.product.features.features.views.ViewsFactory.eINSTANCE.createStartNodeView();
		startNodeView.setInternalStartNode((info.scce.cinco.product.features.features.internal.InternalStartNode)getInternalElement());
		return startNodeView;
		
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return FeaturesPackage.START_NODE___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return FeaturesPackage.START_NODE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return FeaturesPackage.START_NODE___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___PRE_SAVE: return FeaturesPackage.START_NODE___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT___POST_SAVE: return FeaturesPackage.START_NODE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Node.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.NODE___GET_SUCCESSORS: return FeaturesPackage.START_NODE___GET_SUCCESSORS;
				case GraphmodelPackage.NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return FeaturesPackage.START_NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return FeaturesPackage.START_NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case GraphmodelPackage.NODE___GET_POST_DELETE_FUNCTION: return FeaturesPackage.START_NODE___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.NODE___GET_POST_DELETE_EVENT: return FeaturesPackage.START_NODE___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.NODE___PRE_DELETE: return FeaturesPackage.START_NODE___PRE_DELETE;
				case GraphmodelPackage.NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return FeaturesPackage.START_NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return FeaturesPackage.START_NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return FeaturesPackage.START_NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___GET_OUTGOING: return FeaturesPackage.START_NODE___GET_OUTGOING;
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
			case FeaturesPackage.START_NODE___GET_INTERNAL_START_NODE:
				return getInternalStartNode();
			case FeaturesPackage.START_NODE___IS_EXACTLY_START_NODE:
				return isExactlyStartNode();
			case FeaturesPackage.START_NODE___PRE_DELETE:
				preDelete();
				return null;
			case FeaturesPackage.START_NODE___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case FeaturesPackage.START_NODE___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case FeaturesPackage.START_NODE___PRE_SAVE:
				preSave();
				return null;
			case FeaturesPackage.START_NODE___POST_SAVE:
				postSave();
				return null;
			case FeaturesPackage.START_NODE___GET_ROOT_ELEMENT:
				return getRootElement();
			case FeaturesPackage.START_NODE___GET_OUTGOING:
				return getOutgoing();
			case FeaturesPackage.START_NODE___GET_SUCCESSORS:
				return getSuccessors();
			case FeaturesPackage.START_NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT:
				s_moveTo((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case FeaturesPackage.START_NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT:
				preMove((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case FeaturesPackage.START_NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT:
				postMove((ModelElementContainer)arguments.get(0), (ModelElementContainer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
				return null;
			case FeaturesPackage.START_NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION:
				preResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case FeaturesPackage.START_NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION:
				postResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case FeaturesPackage.START_NODE___GET_OUTGOING_EDGES:
				return getOutgoingEdges();
			case FeaturesPackage.START_NODE___GET_OUTGOING_LABELED_EDGES:
				return getOutgoingLabeledEdges();
			case FeaturesPackage.START_NODE___GET_END_NODE_SUCCESSORS:
				return getEndNodeSuccessors();
			case FeaturesPackage.START_NODE___GET_FEATURE_CONTAINER_SUCCESSORS:
				return getFeatureContainerSuccessors();
			case FeaturesPackage.START_NODE___GET_DOC_NODE_SUCCESSORS:
				return getDocNodeSuccessors();
			case FeaturesPackage.START_NODE___CAN_NEW_EDGE__DOCNODE:
				return canNewEdge((DocNode)arguments.get(0));
			case FeaturesPackage.START_NODE___NEW_EDGE__DOCNODE:
				return newEdge((DocNode)arguments.get(0));
			case FeaturesPackage.START_NODE___NEW_EDGE__DOCNODE_STRING:
				return newEdge((DocNode)arguments.get(0), (String)arguments.get(1));
			case FeaturesPackage.START_NODE___CAN_NEW_EDGE__FEATURECONTAINER:
				return canNewEdge((FeatureContainer)arguments.get(0));
			case FeaturesPackage.START_NODE___NEW_EDGE__FEATURECONTAINER:
				return newEdge((FeatureContainer)arguments.get(0));
			case FeaturesPackage.START_NODE___NEW_EDGE__FEATURECONTAINER_STRING:
				return newEdge((FeatureContainer)arguments.get(0), (String)arguments.get(1));
			case FeaturesPackage.START_NODE___CAN_NEW_EDGE__ENDNODE:
				return canNewEdge((EndNode)arguments.get(0));
			case FeaturesPackage.START_NODE___NEW_EDGE__ENDNODE:
				return newEdge((EndNode)arguments.get(0));
			case FeaturesPackage.START_NODE___NEW_EDGE__ENDNODE_STRING:
				return newEdge((EndNode)arguments.get(0), (String)arguments.get(1));
			case FeaturesPackage.START_NODE___CAN_NEW_LABELED_EDGE__DOCNODE:
				return canNewLabeledEdge((DocNode)arguments.get(0));
			case FeaturesPackage.START_NODE___NEW_LABELED_EDGE__DOCNODE:
				return newLabeledEdge((DocNode)arguments.get(0));
			case FeaturesPackage.START_NODE___NEW_LABELED_EDGE__DOCNODE_STRING:
				return newLabeledEdge((DocNode)arguments.get(0), (String)arguments.get(1));
			case FeaturesPackage.START_NODE___CAN_NEW_LABELED_EDGE__FEATURECONTAINER:
				return canNewLabeledEdge((FeatureContainer)arguments.get(0));
			case FeaturesPackage.START_NODE___NEW_LABELED_EDGE__FEATURECONTAINER:
				return newLabeledEdge((FeatureContainer)arguments.get(0));
			case FeaturesPackage.START_NODE___NEW_LABELED_EDGE__FEATURECONTAINER_STRING:
				return newLabeledEdge((FeatureContainer)arguments.get(0), (String)arguments.get(1));
			case FeaturesPackage.START_NODE___CAN_NEW_LABELED_EDGE__ENDNODE:
				return canNewLabeledEdge((EndNode)arguments.get(0));
			case FeaturesPackage.START_NODE___NEW_LABELED_EDGE__ENDNODE:
				return newLabeledEdge((EndNode)arguments.get(0));
			case FeaturesPackage.START_NODE___NEW_LABELED_EDGE__ENDNODE_STRING:
				return newLabeledEdge((EndNode)arguments.get(0), (String)arguments.get(1));
			case FeaturesPackage.START_NODE___CAN_MOVE_TO__FEATURESGRAPHMODEL_INT_INT:
				return canMoveTo((FeaturesGraphModel)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case FeaturesPackage.START_NODE___MOVE_TO__FEATURESGRAPHMODEL_INT_INT:
				moveTo((FeaturesGraphModel)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case FeaturesPackage.START_NODE___SMOVE_TO__FEATURESGRAPHMODEL_INT_INT:
				s_moveTo((FeaturesGraphModel)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case FeaturesPackage.START_NODE___CAN_MOVE_TO__FEATURECONTAINER_INT_INT:
				return canMoveTo((FeatureContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case FeaturesPackage.START_NODE___MOVE_TO__FEATURECONTAINER_INT_INT:
				moveTo((FeatureContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case FeaturesPackage.START_NODE___SMOVE_TO__FEATURECONTAINER_INT_INT:
				s_moveTo((FeatureContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case FeaturesPackage.START_NODE___GET_START_NODE_VIEW:
				return getStartNodeView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //StartNodeImpl
