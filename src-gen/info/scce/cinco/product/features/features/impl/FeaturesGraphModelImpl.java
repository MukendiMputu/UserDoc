/**
 */
package info.scce.cinco.product.features.features.impl;

import graphmodel.GraphModel;
import graphmodel.GraphmodelPackage;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElementContainer;
import graphmodel.Node;

import graphmodel.impl.GraphModelImpl;

import info.scce.cinco.product.features.features.DocNode;
import info.scce.cinco.product.features.features.EndNode;
import info.scce.cinco.product.features.features.FeatureContainer;
import info.scce.cinco.product.features.features.FeaturesGraphModel;
import info.scce.cinco.product.features.features.FeaturesPackage;
import info.scce.cinco.product.features.features.StartNode;

import info.scce.cinco.product.features.features.internal.InternalFeaturesGraphModel;

import info.scce.cinco.product.features.features.views.FeaturesGraphModelView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FeaturesGraphModelImpl extends GraphModelImpl implements FeaturesGraphModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeaturesGraphModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturesPackage.eINSTANCE.getFeaturesGraphModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return getInternalFeaturesGraphModel().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(final String _arg) {
		getInternalFeaturesGraphModel().getElement().transact("Set Name", () -> {
			getInternalFeaturesGraphModel().setName(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalFeaturesGraphModel getInternalFeaturesGraphModel() {
		return (info.scce.cinco.product.features.features.internal.InternalFeaturesGraphModel) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyFeaturesGraphModel() {
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
	public FeaturesGraphModel getRootElement() {
		return this;
		
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
	public FeaturesGraphModel newFeaturesGraphModel(final String path, final String fileName, final boolean postCreateHook) {
		org.eclipse.core.runtime.IPath filePath = new org.eclipse.core.runtime.Path(path).append(fileName).addFileExtension("featuresgraphmodel");
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createPlatformResourceURI(filePath.toOSString(), true);
		org.eclipse.core.resources.IFile file = org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRoot().getFile(filePath);
		org.eclipse.emf.ecore.resource.Resource res = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl().createResource(uri);
		info.scce.cinco.product.features.features.FeaturesGraphModel graph = info.scce.cinco.product.features.factory.FeaturesFactory.eINSTANCE.createFeaturesGraphModel();
		
		org.eclipse.emf.ecore.util.EcoreUtil.setID(graph, org.eclipse.emf.ecore.util.EcoreUtil.generateUUID());
		
		res.getContents().add(graph.getInternalElement());
		
		try {
			res.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
		
		return graph;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeaturesGraphModelView getFeaturesGraphModelView() {
		FeaturesGraphModelView featuresGraphModelView = info.scce.cinco.product.features.features.views.ViewsFactory.eINSTANCE.createFeaturesGraphModelView();
		featuresGraphModelView.setInternalFeaturesGraphModel((info.scce.cinco.product.features.features.internal.InternalFeaturesGraphModel)getInternalElement());
		return featuresGraphModelView;
		
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return FeaturesPackage.FEATURES_GRAPH_MODEL___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return FeaturesPackage.FEATURES_GRAPH_MODEL___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElementContainer.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___GET_NODES: return FeaturesPackage.FEATURES_GRAPH_MODEL___GET_NODES;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___PRE_SAVE: return FeaturesPackage.FEATURES_GRAPH_MODEL___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___POST_SAVE: return FeaturesPackage.FEATURES_GRAPH_MODEL___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == GraphModel.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.GRAPH_MODEL___GET_ROOT_ELEMENT: return FeaturesPackage.FEATURES_GRAPH_MODEL___GET_ROOT_ELEMENT;
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
			case FeaturesPackage.FEATURES_GRAPH_MODEL___GET_NAME:
				return getName();
			case FeaturesPackage.FEATURES_GRAPH_MODEL___SET_NAME__STRING:
				setName((String)arguments.get(0));
				return null;
			case FeaturesPackage.FEATURES_GRAPH_MODEL___GET_INTERNAL_FEATURES_GRAPH_MODEL:
				return getInternalFeaturesGraphModel();
			case FeaturesPackage.FEATURES_GRAPH_MODEL___IS_EXACTLY_FEATURES_GRAPH_MODEL:
				return isExactlyFeaturesGraphModel();
			case FeaturesPackage.FEATURES_GRAPH_MODEL___PRE_DELETE:
				preDelete();
				return null;
			case FeaturesPackage.FEATURES_GRAPH_MODEL___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case FeaturesPackage.FEATURES_GRAPH_MODEL___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case FeaturesPackage.FEATURES_GRAPH_MODEL___PRE_SAVE:
				preSave();
				return null;
			case FeaturesPackage.FEATURES_GRAPH_MODEL___POST_SAVE:
				postSave();
				return null;
			case FeaturesPackage.FEATURES_GRAPH_MODEL___GET_ROOT_ELEMENT:
				return getRootElement();
			case FeaturesPackage.FEATURES_GRAPH_MODEL___GET_NODES:
				return getNodes();
			case FeaturesPackage.FEATURES_GRAPH_MODEL___GET_START_NODES:
				return getStartNodes();
			case FeaturesPackage.FEATURES_GRAPH_MODEL___CAN_NEW_START_NODE:
				return canNewStartNode();
			case FeaturesPackage.FEATURES_GRAPH_MODEL___NEW_START_NODE__INT_INT:
				return newStartNode((Integer)arguments.get(0), (Integer)arguments.get(1));
			case FeaturesPackage.FEATURES_GRAPH_MODEL___NEW_START_NODE__STRING_INT_INT:
				return newStartNode((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case FeaturesPackage.FEATURES_GRAPH_MODEL___NEW_START_NODE__INT_INT_INT_INT:
				return newStartNode((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case FeaturesPackage.FEATURES_GRAPH_MODEL___NEW_START_NODE__STRING_INT_INT_INT_INT:
				return newStartNode((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case FeaturesPackage.FEATURES_GRAPH_MODEL___GET_DOC_NODES:
				return getDocNodes();
			case FeaturesPackage.FEATURES_GRAPH_MODEL___CAN_NEW_DOC_NODE:
				return canNewDocNode();
			case FeaturesPackage.FEATURES_GRAPH_MODEL___NEW_DOC_NODE__EOBJECT_INT_INT:
				return newDocNode((EObject)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case FeaturesPackage.FEATURES_GRAPH_MODEL___NEW_DOC_NODE__EOBJECT_STRING_INT_INT:
				return newDocNode((EObject)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case FeaturesPackage.FEATURES_GRAPH_MODEL___NEW_DOC_NODE__EOBJECT_INT_INT_INT_INT:
				return newDocNode((EObject)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case FeaturesPackage.FEATURES_GRAPH_MODEL___NEW_DOC_NODE__EOBJECT_STRING_INT_INT_INT_INT:
				return newDocNode((EObject)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
			case FeaturesPackage.FEATURES_GRAPH_MODEL___GET_FEATURE_CONTAINERS:
				return getFeatureContainers();
			case FeaturesPackage.FEATURES_GRAPH_MODEL___CAN_NEW_FEATURE_CONTAINER:
				return canNewFeatureContainer();
			case FeaturesPackage.FEATURES_GRAPH_MODEL___NEW_FEATURE_CONTAINER__INT_INT:
				return newFeatureContainer((Integer)arguments.get(0), (Integer)arguments.get(1));
			case FeaturesPackage.FEATURES_GRAPH_MODEL___NEW_FEATURE_CONTAINER__STRING_INT_INT:
				return newFeatureContainer((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case FeaturesPackage.FEATURES_GRAPH_MODEL___NEW_FEATURE_CONTAINER__INT_INT_INT_INT:
				return newFeatureContainer((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case FeaturesPackage.FEATURES_GRAPH_MODEL___NEW_FEATURE_CONTAINER__STRING_INT_INT_INT_INT:
				return newFeatureContainer((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case FeaturesPackage.FEATURES_GRAPH_MODEL___GET_END_NODES:
				return getEndNodes();
			case FeaturesPackage.FEATURES_GRAPH_MODEL___CAN_NEW_END_NODE:
				return canNewEndNode();
			case FeaturesPackage.FEATURES_GRAPH_MODEL___NEW_END_NODE__INT_INT:
				return newEndNode((Integer)arguments.get(0), (Integer)arguments.get(1));
			case FeaturesPackage.FEATURES_GRAPH_MODEL___NEW_END_NODE__STRING_INT_INT:
				return newEndNode((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case FeaturesPackage.FEATURES_GRAPH_MODEL___NEW_END_NODE__INT_INT_INT_INT:
				return newEndNode((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case FeaturesPackage.FEATURES_GRAPH_MODEL___NEW_END_NODE__STRING_INT_INT_INT_INT:
				return newEndNode((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case FeaturesPackage.FEATURES_GRAPH_MODEL___NEW_FEATURES_GRAPH_MODEL__STRING_STRING_BOOLEAN:
				return newFeaturesGraphModel((String)arguments.get(0), (String)arguments.get(1), (Boolean)arguments.get(2));
			case FeaturesPackage.FEATURES_GRAPH_MODEL___GET_FEATURES_GRAPH_MODEL_VIEW:
				return getFeaturesGraphModelView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //FeaturesGraphModelImpl
