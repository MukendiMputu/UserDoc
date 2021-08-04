/**
 */
package info.scce.cinco.product.features.features.impl;

import de.jabc.cinco.meta.core.mgl.model.constraints.ConnectionConstraint;

import graphmodel.Direction;
import graphmodel.Edge;
import graphmodel.GraphModel;
import graphmodel.GraphmodelPackage;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.ModelElementContainer;
import graphmodel.Node;

import graphmodel.impl.ModelElementContainerImpl;

import graphmodel.internal.InternalModelElement;
import graphmodel.internal.InternalModelElementContainer;
import graphmodel.internal.InternalPackage;

import info.scce.cinco.product.features.features.DocNode;
import info.scce.cinco.product.features.features.EndNode;
import info.scce.cinco.product.features.features.FeatureContainer;
import info.scce.cinco.product.features.features.FeaturesGraphModel;
import info.scce.cinco.product.features.features.FeaturesPackage;
import info.scce.cinco.product.features.features.LabeledEdge;
import info.scce.cinco.product.features.features.StartNode;

import info.scce.cinco.product.features.features.internal.InternalFeatureContainer;

import info.scce.cinco.product.features.features.views.FeatureContainerView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.features.features.impl.FeatureContainerImpl#getInternalElement <em>Internal Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureContainerImpl extends ModelElementContainerImpl implements FeatureContainer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturesPackage.eINSTANCE.getFeatureContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalModelElement getInternalElement() {
		if (eContainerFeatureID() != FeaturesPackage.FEATURE_CONTAINER__INTERNAL_ELEMENT) return null;
		return (InternalModelElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInternalElement(InternalModelElement newInternalElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInternalElement, FeaturesPackage.FEATURE_CONTAINER__INTERNAL_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalElement(InternalModelElement newInternalElement) {
		if (newInternalElement != eInternalContainer() || (eContainerFeatureID() != FeaturesPackage.FEATURE_CONTAINER__INTERNAL_ELEMENT && newInternalElement != null)) {
			if (EcoreUtil.isAncestor(this, newInternalElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInternalElement != null)
				msgs = ((InternalEObject)newInternalElement).eInverseAdd(this, InternalPackage.INTERNAL_MODEL_ELEMENT__ELEMENT, InternalModelElement.class, msgs);
			msgs = basicSetInternalElement(newInternalElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturesPackage.FEATURE_CONTAINER__INTERNAL_ELEMENT, newInternalElement, newInternalElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return getInternalFeatureContainer().getTitle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(final String _arg) {
		getInternalFeatureContainer().getElement().transact("Set Title", () -> {
			getInternalFeatureContainer().setTitle(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalFeatureContainer getInternalFeatureContainer() {
		return (info.scce.cinco.product.features.features.internal.InternalFeatureContainer) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyFeatureContainer() {
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
	public EList<? extends Node> getNodes() {
		return org.eclipse.emf.common.util.ECollections.unmodifiableEList(getInternalContainerElement().getModelElements()
				.stream().filter(me -> me instanceof graphmodel.internal.InternalNode).map(me -> (graphmodel.Node)me.getElement()).
					collect(java.util.stream.Collectors.toList()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StartNode> getStartNodes() {
		return getModelElements(info.scce.cinco.product.features.features.StartNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStartNode() {
		return this.canContain(info.scce.cinco.product.features.features.StartNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StartNode newStartNode(final int x, final int y) {
		return newStartNode(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StartNode newStartNode(final String id, final int x, final int y) {
		return newStartNode(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StartNode newStartNode(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.features.features.StartNode.class)) {
			info.scce.cinco.product.features.features.StartNode node = info.scce.cinco.product.features.factory.FeaturesFactory.eINSTANCE.createStartNode((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.features.features.StartNode.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StartNode newStartNode(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.features.features.StartNode.class)) {
			info.scce.cinco.product.features.features.StartNode node = info.scce.cinco.product.features.factory.FeaturesFactory.eINSTANCE.createStartNode((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.features.features.StartNode.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DocNode> getDocNodes() {
		return getModelElements(info.scce.cinco.product.features.features.DocNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewDocNode() {
		return this.canContain(info.scce.cinco.product.features.features.DocNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocNode newDocNode(final EObject mgl, final int x, final int y) {
		return newDocNode(mgl,x,y,-1,-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocNode newDocNode(final EObject mgl, final String id, final int x, final int y) {
		return newDocNode(mgl,x,y,-1,-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocNode newDocNode(final EObject mgl, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.features.features.DocNode.class)) {
			info.scce.cinco.product.features.features.DocNode node = info.scce.cinco.product.features.factory.FeaturesFactory.eINSTANCE.createDocNode();
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			((info.scce.cinco.product.features.features.internal.InternalDocNode) node.getInternalElement())
				.setLibraryComponentUID(org.eclipse.emf.ecore.util.EcoreUtil.getID(mgl));
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", DocNode.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocNode newDocNode(final EObject mgl, final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.features.features.DocNode.class)) {
			info.scce.cinco.product.features.features.DocNode node = info.scce.cinco.product.features.factory.FeaturesFactory.eINSTANCE.createDocNode();
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			((info.scce.cinco.product.features.features.internal.InternalDocNode) node.getInternalElement())
				.setLibraryComponentUID(org.eclipse.emf.ecore.util.EcoreUtil.getID(mgl));
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", DocNode.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeatureContainer> getFeatureContainers() {
		return getModelElements(info.scce.cinco.product.features.features.FeatureContainer.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewFeatureContainer() {
		return this.canContain(info.scce.cinco.product.features.features.FeatureContainer.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureContainer newFeatureContainer(final int x, final int y) {
		return newFeatureContainer(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureContainer newFeatureContainer(final String id, final int x, final int y) {
		return newFeatureContainer(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureContainer newFeatureContainer(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.features.features.FeatureContainer.class)) {
			info.scce.cinco.product.features.features.FeatureContainer node = info.scce.cinco.product.features.factory.FeaturesFactory.eINSTANCE.createFeatureContainer((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.features.features.FeatureContainer.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureContainer newFeatureContainer(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.features.features.FeatureContainer.class)) {
			info.scce.cinco.product.features.features.FeatureContainer node = info.scce.cinco.product.features.factory.FeaturesFactory.eINSTANCE.createFeatureContainer((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.features.features.FeatureContainer.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EndNode> getEndNodes() {
		return getModelElements(info.scce.cinco.product.features.features.EndNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewEndNode() {
		return this.canContain(info.scce.cinco.product.features.features.EndNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndNode newEndNode(final int x, final int y) {
		return newEndNode(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndNode newEndNode(final String id, final int x, final int y) {
		return newEndNode(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndNode newEndNode(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.features.features.EndNode.class)) {
			info.scce.cinco.product.features.features.EndNode node = info.scce.cinco.product.features.factory.FeaturesFactory.eINSTANCE.createEndNode((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.features.features.EndNode.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndNode newEndNode(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.features.features.EndNode.class)) {
			info.scce.cinco.product.features.features.EndNode node = info.scce.cinco.product.features.factory.FeaturesFactory.eINSTANCE.createEndNode((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.features.features.EndNode.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<? extends Edge> getOutgoing() {
		EList<graphmodel.internal.InternalEdge> out = ((graphmodel.internal.InternalContainer)getInternalElement()).getOutgoing();
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
	public EList<? extends Edge> getIncoming() {
		EList<graphmodel.internal.InternalEdge> in = ((graphmodel.internal.InternalContainer)getInternalElement()).getIncoming();
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
		return featuresGraphModel.canContain(info.scce.cinco.product.features.features.FeatureContainer.class);
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
		return featureContainer.canContain(info.scce.cinco.product.features.features.FeatureContainer.class);
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
	public FeatureContainerView getFeatureContainerView() {
		FeatureContainerView featureContainerView = info.scce.cinco.product.features.features.views.ViewsFactory.eINSTANCE.createFeatureContainerView();
		featureContainerView.setInternalFeatureContainer((info.scce.cinco.product.features.features.internal.InternalFeatureContainer)getInternalElement());
		return featureContainerView;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalModelElementContainer getInternalContainerElement() {
		return (InternalModelElementContainer)getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void delete() {
		preDelete();
		Runnable postDeleteFunction = getPostDeleteFunction();
		Runnable postDeleteEvent = getPostDeleteEvent();
		for (graphmodel.Node child : getAllNodes())
			child.delete();
		if (getInternalElement() == null) return; //deleting children might have hook-deleted myself
		java.util.HashSet<graphmodel.Edge> allEdges = new java.util.HashSet<>();
		allEdges.addAll(getIncoming());
		allEdges.addAll(getOutgoing());
		for (graphmodel.Edge edge : allEdges)
			edge.delete();
		if (getInternalElement() == null) return; //deleting edges might have hook-deleted myself
		transact("Delete", () -> {
			org.eclipse.emf.ecore.util.EcoreUtil.delete(this.getInternalElement());
			org.eclipse.emf.ecore.util.EcoreUtil.delete(this);
		});
		postDeleteFunction.run();
		postDeleteEvent.run();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends Node> EList<T> getSuccessors(final Class<T> clazz) {
		@SuppressWarnings("all")
		java.util.List<T> successors =(java.util.List<T>) ((graphmodel.internal.InternalNode)this.getInternalElement()).
				getSuccessors().stream().
					map(me -> me.getElement()).
						filter(me -> clazz.isAssignableFrom(((Node)me).getClass())).
							collect(java.util.stream.Collectors.toList());
				
		EList<T> retval = new org.eclipse.emf.common.util.BasicEList<T>();
		retval.addAll(successors);
		return retval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends Node> EList<T> getPredecessors(final Class<T> clazz) {
		@SuppressWarnings("all")
		java.util.List<T> successors =(java.util.List<T>) ((graphmodel.internal.InternalNode)this.getInternalElement()).
				getPredecessors().stream().
					map(me -> me.getElement()).
						filter(me -> clazz.isAssignableFrom(((Node)me).getClass())).
							collect(java.util.stream.Collectors.toList());
				
		EList<T> retval = new org.eclipse.emf.common.util.BasicEList<T>();
		retval.addAll(successors);
		return retval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends Edge> EList<T> getIncoming(final Class<T> clazz) {
		java.util.List<T> it = ((graphmodel.internal.InternalNode) getInternalElement()).getIncoming().stream()
						.filter(iNode -> clazz.isInstance(iNode.getElement())).map(iNode -> clazz.cast(iNode.getElement()))
						.collect(java.util.stream.Collectors.toList());
				org.eclipse.emf.common.util.BasicEList<T> bl = new org.eclipse.emf.common.util.BasicEList<T>();
				bl.addAll(it);
				return bl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends Edge> EList<T> getOutgoing(final Class<T> clazz) {
		java.util.List<T> it = ((graphmodel.internal.InternalNode) getInternalElement()).getOutgoing().stream()
						.filter(iNode -> clazz.isInstance(iNode.getElement())).map(iNode -> clazz.cast(iNode.getElement()))
						.collect(java.util.stream.Collectors.toList());
				org.eclipse.emf.common.util.BasicEList<T> bl = new org.eclipse.emf.common.util.BasicEList<T>();
				bl.addAll(it);
				return bl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canConnect(final Edge with, final Node to) {
		return canStart(with.getClass())&& to.canEnd(with.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectionConstraint> getOutgoingConstraints() {
		return ((graphmodel.internal.InternalNode)getInternalElement()).getOutgoingConstraints();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectionConstraint> getIncomingConstraints() {
		return ((graphmodel.internal.InternalNode)getInternalElement()).getIncomingConstraints();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canStart(final Class<? extends Edge> edgeType) {
		return ((graphmodel.internal.InternalNode)getInternalElement()).canStart(edgeType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canEnd(final Class<? extends Edge> edgeType) {
		return ((graphmodel.internal.InternalNode)getInternalElement()).canEnd(edgeType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void move(final int x, final int y) {
		transact("Move", () -> {
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			if (deltaX != 0 || deltaY != 0)
				preMove(getContainer(), x, y);
			if (deltaX != 0)
				ime.setX(x);
			if (deltaY != 0)
				ime.setY(y);
			if (deltaX != 0 || deltaY != 0)
				postMove(getContainer(), getContainer(), x, y, deltaX, deltaY);
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void resize(final int width, final int height) {
		resize(width,  height, getX(), getY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void resize(final int width, final int height, final int x, final int y) {
		transact("Resize", () -> {
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) getInternalElement();
			int oldWidth  = ime.getWidth();
			int oldHeight = ime.getHeight();
			int oldX      = ime.getX();
			int oldY      = ime.getY();
			boolean widthChanged  = width  != oldWidth;
			boolean heightChanged = height != oldHeight;
			boolean xChanged      = x != oldX;
			boolean yChanged      = y != oldY;
			graphmodel.Direction direction = graphmodel.Direction.UNSPECIFIED;
			if (widthChanged || heightChanged || xChanged || yChanged) {
				boolean north = heightChanged &&  yChanged;
				boolean south = heightChanged && !yChanged;
				boolean west  = widthChanged  &&  xChanged;
				boolean east  = widthChanged  && !xChanged;
				direction =
					( north && !south && !west && !east) ? graphmodel.Direction.NORTH      :
					( north && !south && !west &&  east) ? graphmodel.Direction.NORTH_EAST :
					(!north && !south && !west &&  east) ? graphmodel.Direction.EAST       :
					(!north &&  south && !west &&  east) ? graphmodel.Direction.SOUTH_EAST :
					(!north &&  south && !west && !east) ? graphmodel.Direction.SOUTH      :
					(!north &&  south &&  west && !east) ? graphmodel.Direction.SOUTH_WEST :
					(!north && !south &&  west && !east) ? graphmodel.Direction.WEST       :
					( north && !south &&  west && !east) ? graphmodel.Direction.NORTH_WEST :
					                                       graphmodel.Direction.UNSPECIFIED;
				this.preResize(width, height, x, y, direction);
			}
			if (widthChanged)  ime.setWidth(width);
			if (heightChanged) ime.setHeight(height);
			if (xChanged)      ime.setX(x);
			if (yChanged)      ime.setY(y);
			if (widthChanged || heightChanged || xChanged || yChanged) {
				this.postResize(oldWidth, oldHeight, oldX, oldY, direction);
				this.update();
			}
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canMoveTo(final ModelElementContainer targetContainer) {
		return targetContainer.canContain(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void moveTo(final ModelElementContainer targetContainer, final int x, final int y) {
		transact("Move to", () -> {
			graphmodel.ModelElementContainer sourceContainer = this.getContainer();
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			preMove(targetContainer, x, y);
			s_moveTo(targetContainer, x, y);
			targetContainer.getInternalContainerElement().getModelElements().add(ime);
			ime.setX(x);
			ime.setY(y);
			postMove(sourceContainer, targetContainer, x, y, deltaX, deltaY);
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canClone(final ModelElementContainer targetContainer) {
		return targetContainer.canContain(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends Node> T clone(final ModelElementContainer targetContainer) {
		graphmodel.internal.InternalNode copy = (graphmodel.internal.InternalNode) org.eclipse.emf.ecore.util.EcoreUtil.copy(this.getInternalElement());
		org.eclipse.emf.ecore.util.EcoreUtil.setID(copy, getInternalElement().getId());
		org.eclipse.emf.ecore.util.EcoreUtil.setID(copy.getElement(), getId());
		targetContainer.getInternalContainerElement().getModelElements().add(copy);
		@SuppressWarnings("unchecked")
		T t = (T) copy.getElement();
		return t;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getX() {
		return ((graphmodel.internal.InternalNode) getInternalElement()).getX();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getY() {
		return ((graphmodel.internal.InternalNode) getInternalElement()).getY();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWidth() {
		return ((graphmodel.internal.InternalNode) getInternalElement()).getWidth();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHeight() {
		return ((graphmodel.internal.InternalNode) getInternalElement()).getHeight();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends Node> T copy(final ModelElementContainer targetContainer) {
		graphmodel.internal.InternalNode copy = (graphmodel.internal.InternalNode) org.eclipse.emf.ecore.util.EcoreUtil.copy(this.getInternalElement());
		org.eclipse.emf.ecore.util.EcoreUtil.setID(copy, org.eclipse.emf.ecore.util.EcoreUtil.generateUUID());
		targetContainer.getInternalContainerElement().getModelElements().add(copy);
		@SuppressWarnings("unchecked")
		T t = (T) copy.getElement();
		return t;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX(final int x) {
		transact("Set x", () -> {
		((graphmodel.internal.InternalNode) getInternalElement()).setX(x);
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setY(final int y) {
		transact("Set Y", () -> {
		((graphmodel.internal.InternalNode) getInternalElement()).setY(y);
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(final int width) {
		transact("Set width", () -> {
			((graphmodel.internal.InternalNode) getInternalElement()).setWidth(width);
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(final int height) {
		transact("Set height", () -> {
			((graphmodel.internal.InternalNode) getInternalElement()).setHeight(height);
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLayer() {
		return getContainer().getModelElements().indexOf(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Edge> getUntypedIncoming() {
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
	public EList<Edge> getUntypedOutgoing() {
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
	public ModelElementContainer getContainer() {
		return getInternalElement().getContainer().getContainerElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void highlight() {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void update() {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void updateGraphModel() {
		this.getRootElement().updateModelElements();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeaturesPackage.FEATURE_CONTAINER__INTERNAL_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInternalElement((InternalModelElement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeaturesPackage.FEATURE_CONTAINER__INTERNAL_ELEMENT:
				return basicSetInternalElement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case FeaturesPackage.FEATURE_CONTAINER__INTERNAL_ELEMENT:
				return eInternalContainer().eInverseRemove(this, InternalPackage.INTERNAL_MODEL_ELEMENT__ELEMENT, InternalModelElement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeaturesPackage.FEATURE_CONTAINER__INTERNAL_ELEMENT:
				return getInternalElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FeaturesPackage.FEATURE_CONTAINER__INTERNAL_ELEMENT:
				setInternalElement((InternalModelElement)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FeaturesPackage.FEATURE_CONTAINER__INTERNAL_ELEMENT:
				setInternalElement((InternalModelElement)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FeaturesPackage.FEATURE_CONTAINER__INTERNAL_ELEMENT:
				return getInternalElement() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ModelElement.class) {
			switch (derivedFeatureID) {
				case FeaturesPackage.FEATURE_CONTAINER__INTERNAL_ELEMENT: return GraphmodelPackage.MODEL_ELEMENT__INTERNAL_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == Node.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ModelElement.class) {
			switch (baseFeatureID) {
				case GraphmodelPackage.MODEL_ELEMENT__INTERNAL_ELEMENT: return FeaturesPackage.FEATURE_CONTAINER__INTERNAL_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == Node.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return FeaturesPackage.FEATURE_CONTAINER___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return FeaturesPackage.FEATURE_CONTAINER___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElementContainer.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___GET_INTERNAL_CONTAINER_ELEMENT: return FeaturesPackage.FEATURE_CONTAINER___GET_INTERNAL_CONTAINER_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___GET_NODES: return FeaturesPackage.FEATURE_CONTAINER___GET_NODES;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___PRE_SAVE: return FeaturesPackage.FEATURE_CONTAINER___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___POST_SAVE: return FeaturesPackage.FEATURE_CONTAINER___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_CONTAINER: return FeaturesPackage.FEATURE_CONTAINER___GET_CONTAINER;
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return FeaturesPackage.FEATURE_CONTAINER___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___HIGHLIGHT: return FeaturesPackage.FEATURE_CONTAINER___HIGHLIGHT;
				case GraphmodelPackage.MODEL_ELEMENT___UPDATE: return FeaturesPackage.FEATURE_CONTAINER___UPDATE;
				case GraphmodelPackage.MODEL_ELEMENT___UPDATE_GRAPH_MODEL: return FeaturesPackage.FEATURE_CONTAINER___UPDATE_GRAPH_MODEL;
				default: return -1;
			}
		}
		if (baseClass == Node.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.NODE___GET_SUCCESSORS: return FeaturesPackage.FEATURE_CONTAINER___GET_SUCCESSORS;
				case GraphmodelPackage.NODE___GET_SUCCESSORS__CLASS: return FeaturesPackage.FEATURE_CONTAINER___GET_SUCCESSORS__CLASS;
				case GraphmodelPackage.NODE___GET_PREDECESSORS: return FeaturesPackage.FEATURE_CONTAINER___GET_PREDECESSORS;
				case GraphmodelPackage.NODE___GET_PREDECESSORS__CLASS: return FeaturesPackage.FEATURE_CONTAINER___GET_PREDECESSORS__CLASS;
				case GraphmodelPackage.NODE___GET_INCOMING__CLASS: return FeaturesPackage.FEATURE_CONTAINER___GET_INCOMING__CLASS;
				case GraphmodelPackage.NODE___GET_OUTGOING__CLASS: return FeaturesPackage.FEATURE_CONTAINER___GET_OUTGOING__CLASS;
				case GraphmodelPackage.NODE___CAN_CONNECT__EDGE_NODE: return FeaturesPackage.FEATURE_CONTAINER___CAN_CONNECT__EDGE_NODE;
				case GraphmodelPackage.NODE___GET_OUTGOING_CONSTRAINTS: return FeaturesPackage.FEATURE_CONTAINER___GET_OUTGOING_CONSTRAINTS;
				case GraphmodelPackage.NODE___GET_INCOMING_CONSTRAINTS: return FeaturesPackage.FEATURE_CONTAINER___GET_INCOMING_CONSTRAINTS;
				case GraphmodelPackage.NODE___CAN_START__CLASS: return FeaturesPackage.FEATURE_CONTAINER___CAN_START__CLASS;
				case GraphmodelPackage.NODE___CAN_END__CLASS: return FeaturesPackage.FEATURE_CONTAINER___CAN_END__CLASS;
				case GraphmodelPackage.NODE___MOVE__INT_INT: return FeaturesPackage.FEATURE_CONTAINER___MOVE__INT_INT;
				case GraphmodelPackage.NODE___RESIZE__INT_INT: return FeaturesPackage.FEATURE_CONTAINER___RESIZE__INT_INT;
				case GraphmodelPackage.NODE___RESIZE__INT_INT_INT_INT: return FeaturesPackage.FEATURE_CONTAINER___RESIZE__INT_INT_INT_INT;
				case GraphmodelPackage.NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return FeaturesPackage.FEATURE_CONTAINER___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return FeaturesPackage.FEATURE_CONTAINER___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case GraphmodelPackage.NODE___DELETE: return FeaturesPackage.FEATURE_CONTAINER___DELETE;
				case GraphmodelPackage.NODE___GET_POST_DELETE_FUNCTION: return FeaturesPackage.FEATURE_CONTAINER___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.NODE___GET_POST_DELETE_EVENT: return FeaturesPackage.FEATURE_CONTAINER___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.NODE___PRE_DELETE: return FeaturesPackage.FEATURE_CONTAINER___PRE_DELETE;
				case GraphmodelPackage.NODE___CAN_MOVE_TO__MODELELEMENTCONTAINER: return FeaturesPackage.FEATURE_CONTAINER___CAN_MOVE_TO__MODELELEMENTCONTAINER;
				case GraphmodelPackage.NODE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT: return FeaturesPackage.FEATURE_CONTAINER___MOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___CAN_CLONE__MODELELEMENTCONTAINER: return FeaturesPackage.FEATURE_CONTAINER___CAN_CLONE__MODELELEMENTCONTAINER;
				case GraphmodelPackage.NODE___CLONE__MODELELEMENTCONTAINER: return FeaturesPackage.FEATURE_CONTAINER___CLONE__MODELELEMENTCONTAINER;
				case GraphmodelPackage.NODE___GET_X: return FeaturesPackage.FEATURE_CONTAINER___GET_X;
				case GraphmodelPackage.NODE___GET_Y: return FeaturesPackage.FEATURE_CONTAINER___GET_Y;
				case GraphmodelPackage.NODE___GET_WIDTH: return FeaturesPackage.FEATURE_CONTAINER___GET_WIDTH;
				case GraphmodelPackage.NODE___GET_HEIGHT: return FeaturesPackage.FEATURE_CONTAINER___GET_HEIGHT;
				case GraphmodelPackage.NODE___COPY__MODELELEMENTCONTAINER: return FeaturesPackage.FEATURE_CONTAINER___COPY__MODELELEMENTCONTAINER;
				case GraphmodelPackage.NODE___SET_X__INT: return FeaturesPackage.FEATURE_CONTAINER___SET_X__INT;
				case GraphmodelPackage.NODE___SET_Y__INT: return FeaturesPackage.FEATURE_CONTAINER___SET_Y__INT;
				case GraphmodelPackage.NODE___SET_WIDTH__INT: return FeaturesPackage.FEATURE_CONTAINER___SET_WIDTH__INT;
				case GraphmodelPackage.NODE___SET_HEIGHT__INT: return FeaturesPackage.FEATURE_CONTAINER___SET_HEIGHT__INT;
				case GraphmodelPackage.NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return FeaturesPackage.FEATURE_CONTAINER___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return FeaturesPackage.FEATURE_CONTAINER___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___GET_LAYER: return FeaturesPackage.FEATURE_CONTAINER___GET_LAYER;
				case GraphmodelPackage.NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return FeaturesPackage.FEATURE_CONTAINER___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___GET_INCOMING: return FeaturesPackage.FEATURE_CONTAINER___GET_INCOMING;
				case GraphmodelPackage.NODE___GET_OUTGOING: return FeaturesPackage.FEATURE_CONTAINER___GET_OUTGOING;
				case GraphmodelPackage.NODE___GET_UNTYPED_INCOMING: return FeaturesPackage.FEATURE_CONTAINER___GET_UNTYPED_INCOMING;
				case GraphmodelPackage.NODE___GET_UNTYPED_OUTGOING: return FeaturesPackage.FEATURE_CONTAINER___GET_UNTYPED_OUTGOING;
				default: return -1;
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
	@SuppressWarnings({"rawtypes", "unchecked" })
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FeaturesPackage.FEATURE_CONTAINER___GET_TITLE:
				return getTitle();
			case FeaturesPackage.FEATURE_CONTAINER___SET_TITLE__STRING:
				setTitle((String)arguments.get(0));
				return null;
			case FeaturesPackage.FEATURE_CONTAINER___GET_INTERNAL_FEATURE_CONTAINER:
				return getInternalFeatureContainer();
			case FeaturesPackage.FEATURE_CONTAINER___IS_EXACTLY_FEATURE_CONTAINER:
				return isExactlyFeatureContainer();
			case FeaturesPackage.FEATURE_CONTAINER___PRE_DELETE:
				preDelete();
				return null;
			case FeaturesPackage.FEATURE_CONTAINER___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case FeaturesPackage.FEATURE_CONTAINER___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case FeaturesPackage.FEATURE_CONTAINER___PRE_SAVE:
				preSave();
				return null;
			case FeaturesPackage.FEATURE_CONTAINER___POST_SAVE:
				postSave();
				return null;
			case FeaturesPackage.FEATURE_CONTAINER___GET_ROOT_ELEMENT:
				return getRootElement();
			case FeaturesPackage.FEATURE_CONTAINER___GET_NODES:
				return getNodes();
			case FeaturesPackage.FEATURE_CONTAINER___GET_START_NODES:
				return getStartNodes();
			case FeaturesPackage.FEATURE_CONTAINER___CAN_NEW_START_NODE:
				return canNewStartNode();
			case FeaturesPackage.FEATURE_CONTAINER___NEW_START_NODE__INT_INT:
				return newStartNode((Integer)arguments.get(0), (Integer)arguments.get(1));
			case FeaturesPackage.FEATURE_CONTAINER___NEW_START_NODE__STRING_INT_INT:
				return newStartNode((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case FeaturesPackage.FEATURE_CONTAINER___NEW_START_NODE__INT_INT_INT_INT:
				return newStartNode((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case FeaturesPackage.FEATURE_CONTAINER___NEW_START_NODE__STRING_INT_INT_INT_INT:
				return newStartNode((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case FeaturesPackage.FEATURE_CONTAINER___GET_DOC_NODES:
				return getDocNodes();
			case FeaturesPackage.FEATURE_CONTAINER___CAN_NEW_DOC_NODE:
				return canNewDocNode();
			case FeaturesPackage.FEATURE_CONTAINER___NEW_DOC_NODE__EOBJECT_INT_INT:
				return newDocNode((EObject)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case FeaturesPackage.FEATURE_CONTAINER___NEW_DOC_NODE__EOBJECT_STRING_INT_INT:
				return newDocNode((EObject)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case FeaturesPackage.FEATURE_CONTAINER___NEW_DOC_NODE__EOBJECT_INT_INT_INT_INT:
				return newDocNode((EObject)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case FeaturesPackage.FEATURE_CONTAINER___NEW_DOC_NODE__EOBJECT_STRING_INT_INT_INT_INT:
				return newDocNode((EObject)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
			case FeaturesPackage.FEATURE_CONTAINER___GET_FEATURE_CONTAINERS:
				return getFeatureContainers();
			case FeaturesPackage.FEATURE_CONTAINER___CAN_NEW_FEATURE_CONTAINER:
				return canNewFeatureContainer();
			case FeaturesPackage.FEATURE_CONTAINER___NEW_FEATURE_CONTAINER__INT_INT:
				return newFeatureContainer((Integer)arguments.get(0), (Integer)arguments.get(1));
			case FeaturesPackage.FEATURE_CONTAINER___NEW_FEATURE_CONTAINER__STRING_INT_INT:
				return newFeatureContainer((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case FeaturesPackage.FEATURE_CONTAINER___NEW_FEATURE_CONTAINER__INT_INT_INT_INT:
				return newFeatureContainer((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case FeaturesPackage.FEATURE_CONTAINER___NEW_FEATURE_CONTAINER__STRING_INT_INT_INT_INT:
				return newFeatureContainer((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case FeaturesPackage.FEATURE_CONTAINER___GET_END_NODES:
				return getEndNodes();
			case FeaturesPackage.FEATURE_CONTAINER___CAN_NEW_END_NODE:
				return canNewEndNode();
			case FeaturesPackage.FEATURE_CONTAINER___NEW_END_NODE__INT_INT:
				return newEndNode((Integer)arguments.get(0), (Integer)arguments.get(1));
			case FeaturesPackage.FEATURE_CONTAINER___NEW_END_NODE__STRING_INT_INT:
				return newEndNode((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case FeaturesPackage.FEATURE_CONTAINER___NEW_END_NODE__INT_INT_INT_INT:
				return newEndNode((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case FeaturesPackage.FEATURE_CONTAINER___NEW_END_NODE__STRING_INT_INT_INT_INT:
				return newEndNode((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case FeaturesPackage.FEATURE_CONTAINER___GET_OUTGOING:
				return getOutgoing();
			case FeaturesPackage.FEATURE_CONTAINER___GET_SUCCESSORS:
				return getSuccessors();
			case FeaturesPackage.FEATURE_CONTAINER___GET_INCOMING:
				return getIncoming();
			case FeaturesPackage.FEATURE_CONTAINER___GET_PREDECESSORS:
				return getPredecessors();
			case FeaturesPackage.FEATURE_CONTAINER___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT:
				s_moveTo((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case FeaturesPackage.FEATURE_CONTAINER___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT:
				preMove((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case FeaturesPackage.FEATURE_CONTAINER___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT:
				postMove((ModelElementContainer)arguments.get(0), (ModelElementContainer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
				return null;
			case FeaturesPackage.FEATURE_CONTAINER___PRE_RESIZE__INT_INT_INT_INT_DIRECTION:
				preResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case FeaturesPackage.FEATURE_CONTAINER___POST_RESIZE__INT_INT_INT_INT_DIRECTION:
				postResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case FeaturesPackage.FEATURE_CONTAINER___GET_OUTGOING_EDGES:
				return getOutgoingEdges();
			case FeaturesPackage.FEATURE_CONTAINER___GET_OUTGOING_LABELED_EDGES:
				return getOutgoingLabeledEdges();
			case FeaturesPackage.FEATURE_CONTAINER___GET_INCOMING_EDGES:
				return getIncomingEdges();
			case FeaturesPackage.FEATURE_CONTAINER___GET_INCOMING_LABELED_EDGES:
				return getIncomingLabeledEdges();
			case FeaturesPackage.FEATURE_CONTAINER___GET_START_NODE_PREDECESSORS:
				return getStartNodePredecessors();
			case FeaturesPackage.FEATURE_CONTAINER___GET_FEATURE_CONTAINER_PREDECESSORS:
				return getFeatureContainerPredecessors();
			case FeaturesPackage.FEATURE_CONTAINER___GET_DOC_NODE_PREDECESSORS:
				return getDocNodePredecessors();
			case FeaturesPackage.FEATURE_CONTAINER___GET_END_NODE_SUCCESSORS:
				return getEndNodeSuccessors();
			case FeaturesPackage.FEATURE_CONTAINER___GET_FEATURE_CONTAINER_SUCCESSORS:
				return getFeatureContainerSuccessors();
			case FeaturesPackage.FEATURE_CONTAINER___GET_DOC_NODE_SUCCESSORS:
				return getDocNodeSuccessors();
			case FeaturesPackage.FEATURE_CONTAINER___CAN_NEW_EDGE__DOCNODE:
				return canNewEdge((DocNode)arguments.get(0));
			case FeaturesPackage.FEATURE_CONTAINER___NEW_EDGE__DOCNODE:
				return newEdge((DocNode)arguments.get(0));
			case FeaturesPackage.FEATURE_CONTAINER___NEW_EDGE__DOCNODE_STRING:
				return newEdge((DocNode)arguments.get(0), (String)arguments.get(1));
			case FeaturesPackage.FEATURE_CONTAINER___CAN_NEW_EDGE__FEATURECONTAINER:
				return canNewEdge((FeatureContainer)arguments.get(0));
			case FeaturesPackage.FEATURE_CONTAINER___NEW_EDGE__FEATURECONTAINER:
				return newEdge((FeatureContainer)arguments.get(0));
			case FeaturesPackage.FEATURE_CONTAINER___NEW_EDGE__FEATURECONTAINER_STRING:
				return newEdge((FeatureContainer)arguments.get(0), (String)arguments.get(1));
			case FeaturesPackage.FEATURE_CONTAINER___CAN_NEW_EDGE__ENDNODE:
				return canNewEdge((EndNode)arguments.get(0));
			case FeaturesPackage.FEATURE_CONTAINER___NEW_EDGE__ENDNODE:
				return newEdge((EndNode)arguments.get(0));
			case FeaturesPackage.FEATURE_CONTAINER___NEW_EDGE__ENDNODE_STRING:
				return newEdge((EndNode)arguments.get(0), (String)arguments.get(1));
			case FeaturesPackage.FEATURE_CONTAINER___CAN_NEW_LABELED_EDGE__DOCNODE:
				return canNewLabeledEdge((DocNode)arguments.get(0));
			case FeaturesPackage.FEATURE_CONTAINER___NEW_LABELED_EDGE__DOCNODE:
				return newLabeledEdge((DocNode)arguments.get(0));
			case FeaturesPackage.FEATURE_CONTAINER___NEW_LABELED_EDGE__DOCNODE_STRING:
				return newLabeledEdge((DocNode)arguments.get(0), (String)arguments.get(1));
			case FeaturesPackage.FEATURE_CONTAINER___CAN_NEW_LABELED_EDGE__FEATURECONTAINER:
				return canNewLabeledEdge((FeatureContainer)arguments.get(0));
			case FeaturesPackage.FEATURE_CONTAINER___NEW_LABELED_EDGE__FEATURECONTAINER:
				return newLabeledEdge((FeatureContainer)arguments.get(0));
			case FeaturesPackage.FEATURE_CONTAINER___NEW_LABELED_EDGE__FEATURECONTAINER_STRING:
				return newLabeledEdge((FeatureContainer)arguments.get(0), (String)arguments.get(1));
			case FeaturesPackage.FEATURE_CONTAINER___CAN_NEW_LABELED_EDGE__ENDNODE:
				return canNewLabeledEdge((EndNode)arguments.get(0));
			case FeaturesPackage.FEATURE_CONTAINER___NEW_LABELED_EDGE__ENDNODE:
				return newLabeledEdge((EndNode)arguments.get(0));
			case FeaturesPackage.FEATURE_CONTAINER___NEW_LABELED_EDGE__ENDNODE_STRING:
				return newLabeledEdge((EndNode)arguments.get(0), (String)arguments.get(1));
			case FeaturesPackage.FEATURE_CONTAINER___CAN_MOVE_TO__FEATURESGRAPHMODEL_INT_INT:
				return canMoveTo((FeaturesGraphModel)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case FeaturesPackage.FEATURE_CONTAINER___MOVE_TO__FEATURESGRAPHMODEL_INT_INT:
				moveTo((FeaturesGraphModel)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case FeaturesPackage.FEATURE_CONTAINER___SMOVE_TO__FEATURESGRAPHMODEL_INT_INT:
				s_moveTo((FeaturesGraphModel)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case FeaturesPackage.FEATURE_CONTAINER___CAN_MOVE_TO__FEATURECONTAINER_INT_INT:
				return canMoveTo((FeatureContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case FeaturesPackage.FEATURE_CONTAINER___MOVE_TO__FEATURECONTAINER_INT_INT:
				moveTo((FeatureContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case FeaturesPackage.FEATURE_CONTAINER___SMOVE_TO__FEATURECONTAINER_INT_INT:
				s_moveTo((FeatureContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case FeaturesPackage.FEATURE_CONTAINER___GET_FEATURE_CONTAINER_VIEW:
				return getFeatureContainerView();
			case FeaturesPackage.FEATURE_CONTAINER___GET_INTERNAL_CONTAINER_ELEMENT:
				return getInternalContainerElement();
			case FeaturesPackage.FEATURE_CONTAINER___DELETE:
				delete();
				return null;
			case FeaturesPackage.FEATURE_CONTAINER___GET_SUCCESSORS__CLASS:
				return getSuccessors((Class)arguments.get(0));
			case FeaturesPackage.FEATURE_CONTAINER___GET_PREDECESSORS__CLASS:
				return getPredecessors((Class)arguments.get(0));
			case FeaturesPackage.FEATURE_CONTAINER___GET_INCOMING__CLASS:
				return getIncoming((Class)arguments.get(0));
			case FeaturesPackage.FEATURE_CONTAINER___GET_OUTGOING__CLASS:
				return getOutgoing((Class)arguments.get(0));
			case FeaturesPackage.FEATURE_CONTAINER___CAN_CONNECT__EDGE_NODE:
				return canConnect((Edge)arguments.get(0), (Node)arguments.get(1));
			case FeaturesPackage.FEATURE_CONTAINER___GET_OUTGOING_CONSTRAINTS:
				return getOutgoingConstraints();
			case FeaturesPackage.FEATURE_CONTAINER___GET_INCOMING_CONSTRAINTS:
				return getIncomingConstraints();
			case FeaturesPackage.FEATURE_CONTAINER___CAN_START__CLASS:
				return canStart((Class<? extends Edge>)arguments.get(0));
			case FeaturesPackage.FEATURE_CONTAINER___CAN_END__CLASS:
				return canEnd((Class<? extends Edge>)arguments.get(0));
			case FeaturesPackage.FEATURE_CONTAINER___MOVE__INT_INT:
				move((Integer)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case FeaturesPackage.FEATURE_CONTAINER___RESIZE__INT_INT:
				resize((Integer)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case FeaturesPackage.FEATURE_CONTAINER___RESIZE__INT_INT_INT_INT:
				resize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
				return null;
			case FeaturesPackage.FEATURE_CONTAINER___CAN_MOVE_TO__MODELELEMENTCONTAINER:
				return canMoveTo((ModelElementContainer)arguments.get(0));
			case FeaturesPackage.FEATURE_CONTAINER___MOVE_TO__MODELELEMENTCONTAINER_INT_INT:
				moveTo((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case FeaturesPackage.FEATURE_CONTAINER___CAN_CLONE__MODELELEMENTCONTAINER:
				return canClone((ModelElementContainer)arguments.get(0));
			case FeaturesPackage.FEATURE_CONTAINER___CLONE__MODELELEMENTCONTAINER:
				return clone((ModelElementContainer)arguments.get(0));
			case FeaturesPackage.FEATURE_CONTAINER___GET_X:
				return getX();
			case FeaturesPackage.FEATURE_CONTAINER___GET_Y:
				return getY();
			case FeaturesPackage.FEATURE_CONTAINER___GET_WIDTH:
				return getWidth();
			case FeaturesPackage.FEATURE_CONTAINER___GET_HEIGHT:
				return getHeight();
			case FeaturesPackage.FEATURE_CONTAINER___COPY__MODELELEMENTCONTAINER:
				return copy((ModelElementContainer)arguments.get(0));
			case FeaturesPackage.FEATURE_CONTAINER___SET_X__INT:
				setX((Integer)arguments.get(0));
				return null;
			case FeaturesPackage.FEATURE_CONTAINER___SET_Y__INT:
				setY((Integer)arguments.get(0));
				return null;
			case FeaturesPackage.FEATURE_CONTAINER___SET_WIDTH__INT:
				setWidth((Integer)arguments.get(0));
				return null;
			case FeaturesPackage.FEATURE_CONTAINER___SET_HEIGHT__INT:
				setHeight((Integer)arguments.get(0));
				return null;
			case FeaturesPackage.FEATURE_CONTAINER___GET_LAYER:
				return getLayer();
			case FeaturesPackage.FEATURE_CONTAINER___GET_UNTYPED_INCOMING:
				return getUntypedIncoming();
			case FeaturesPackage.FEATURE_CONTAINER___GET_UNTYPED_OUTGOING:
				return getUntypedOutgoing();
			case FeaturesPackage.FEATURE_CONTAINER___GET_CONTAINER:
				return getContainer();
			case FeaturesPackage.FEATURE_CONTAINER___HIGHLIGHT:
				highlight();
				return null;
			case FeaturesPackage.FEATURE_CONTAINER___UPDATE:
				update();
				return null;
			case FeaturesPackage.FEATURE_CONTAINER___UPDATE_GRAPH_MODEL:
				updateGraphModel();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //FeatureContainerImpl
