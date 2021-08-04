/**
 */
package info.scce.cinco.product.features.features.impl;

import graphmodel.GraphModel;
import graphmodel.GraphmodelPackage;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.Node;

import info.scce.cinco.product.features.features.DocNode;
import info.scce.cinco.product.features.features.Edge;
import info.scce.cinco.product.features.features.EndNode;
import info.scce.cinco.product.features.features.FeatureContainer;
import info.scce.cinco.product.features.features.FeaturesPackage;
import info.scce.cinco.product.features.features.StartNode;

import info.scce.cinco.product.features.features.internal.InternalEdge;

import info.scce.cinco.product.features.features.views.EdgeView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EdgeImpl extends graphmodel.impl.EdgeImpl implements Edge {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturesPackage.eINSTANCE.getEdge();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalEdge getInternalEdge() {
		return (info.scce.cinco.product.features.features.internal.InternalEdge) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyEdge() {
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
	public Node getSourceElement() {
		return(graphmodel.Node)super.getSourceElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getTargetElement() {
		return(graphmodel.Node)super.getTargetElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final StartNode source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final StartNode source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final FeatureContainer source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final FeatureContainer source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final DocNode source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final DocNode source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final DocNode target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final DocNode target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final FeatureContainer target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final FeatureContainer target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final EndNode target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final EndNode target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EdgeView getEdgeView() {
		EdgeView edgeView = info.scce.cinco.product.features.features.views.ViewsFactory.eINSTANCE.createEdgeView();
		edgeView.setInternalEdge((info.scce.cinco.product.features.features.internal.InternalEdge)getInternalElement());
		return edgeView;
		
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return FeaturesPackage.EDGE___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return FeaturesPackage.EDGE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return FeaturesPackage.EDGE___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___PRE_SAVE: return FeaturesPackage.EDGE___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT___POST_SAVE: return FeaturesPackage.EDGE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == graphmodel.Edge.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.EDGE___GET_SOURCE_ELEMENT: return FeaturesPackage.EDGE___GET_SOURCE_ELEMENT;
				case GraphmodelPackage.EDGE___GET_TARGET_ELEMENT: return FeaturesPackage.EDGE___GET_TARGET_ELEMENT;
				case GraphmodelPackage.EDGE___GET_POST_DELETE_FUNCTION: return FeaturesPackage.EDGE___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.EDGE___GET_POST_DELETE_EVENT: return FeaturesPackage.EDGE___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.EDGE___PRE_DELETE: return FeaturesPackage.EDGE___PRE_DELETE;
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
			case FeaturesPackage.EDGE___GET_INTERNAL_EDGE:
				return getInternalEdge();
			case FeaturesPackage.EDGE___IS_EXACTLY_EDGE:
				return isExactlyEdge();
			case FeaturesPackage.EDGE___PRE_DELETE:
				preDelete();
				return null;
			case FeaturesPackage.EDGE___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case FeaturesPackage.EDGE___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case FeaturesPackage.EDGE___PRE_SAVE:
				preSave();
				return null;
			case FeaturesPackage.EDGE___POST_SAVE:
				postSave();
				return null;
			case FeaturesPackage.EDGE___GET_ROOT_ELEMENT:
				return getRootElement();
			case FeaturesPackage.EDGE___GET_SOURCE_ELEMENT:
				return getSourceElement();
			case FeaturesPackage.EDGE___GET_TARGET_ELEMENT:
				return getTargetElement();
			case FeaturesPackage.EDGE___CAN_RECONNECT_SOURCE__STARTNODE:
				return canReconnectSource((StartNode)arguments.get(0));
			case FeaturesPackage.EDGE___RECONNECT_SOURCE__STARTNODE:
				reconnectSource((StartNode)arguments.get(0));
				return null;
			case FeaturesPackage.EDGE___CAN_RECONNECT_SOURCE__FEATURECONTAINER:
				return canReconnectSource((FeatureContainer)arguments.get(0));
			case FeaturesPackage.EDGE___RECONNECT_SOURCE__FEATURECONTAINER:
				reconnectSource((FeatureContainer)arguments.get(0));
				return null;
			case FeaturesPackage.EDGE___CAN_RECONNECT_SOURCE__DOCNODE:
				return canReconnectSource((DocNode)arguments.get(0));
			case FeaturesPackage.EDGE___RECONNECT_SOURCE__DOCNODE:
				reconnectSource((DocNode)arguments.get(0));
				return null;
			case FeaturesPackage.EDGE___CAN_RECONNECT_TARGET__DOCNODE:
				return canReconnectTarget((DocNode)arguments.get(0));
			case FeaturesPackage.EDGE___RECONNECT_TARGET__DOCNODE:
				reconnectTarget((DocNode)arguments.get(0));
				return null;
			case FeaturesPackage.EDGE___CAN_RECONNECT_TARGET__FEATURECONTAINER:
				return canReconnectTarget((FeatureContainer)arguments.get(0));
			case FeaturesPackage.EDGE___RECONNECT_TARGET__FEATURECONTAINER:
				reconnectTarget((FeatureContainer)arguments.get(0));
				return null;
			case FeaturesPackage.EDGE___CAN_RECONNECT_TARGET__ENDNODE:
				return canReconnectTarget((EndNode)arguments.get(0));
			case FeaturesPackage.EDGE___RECONNECT_TARGET__ENDNODE:
				reconnectTarget((EndNode)arguments.get(0));
				return null;
			case FeaturesPackage.EDGE___GET_EDGE_VIEW:
				return getEdgeView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //EdgeImpl
