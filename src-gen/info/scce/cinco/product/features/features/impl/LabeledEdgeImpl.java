/**
 */
package info.scce.cinco.product.features.features.impl;

import graphmodel.Edge;
import graphmodel.GraphModel;
import graphmodel.GraphmodelPackage;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.Node;

import graphmodel.impl.EdgeImpl;

import info.scce.cinco.product.features.features.DocNode;
import info.scce.cinco.product.features.features.EndNode;
import info.scce.cinco.product.features.features.FeatureContainer;
import info.scce.cinco.product.features.features.FeaturesPackage;
import info.scce.cinco.product.features.features.LabeledEdge;
import info.scce.cinco.product.features.features.StartNode;

import info.scce.cinco.product.features.features.internal.InternalLabeledEdge;

import info.scce.cinco.product.features.features.views.LabeledEdgeView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Labeled Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LabeledEdgeImpl extends EdgeImpl implements LabeledEdge {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabeledEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturesPackage.eINSTANCE.getLabeledEdge();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return getInternalLabeledEdge().getLabel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(final String _arg) {
		getInternalLabeledEdge().getElement().transact("Set Label", () -> {
			getInternalLabeledEdge().setLabel(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalLabeledEdge getInternalLabeledEdge() {
		return (info.scce.cinco.product.features.features.internal.InternalLabeledEdge) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyLabeledEdge() {
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
	public LabeledEdgeView getLabeledEdgeView() {
		LabeledEdgeView labeledEdgeView = info.scce.cinco.product.features.features.views.ViewsFactory.eINSTANCE.createLabeledEdgeView();
		labeledEdgeView.setInternalLabeledEdge((info.scce.cinco.product.features.features.internal.InternalLabeledEdge)getInternalElement());
		return labeledEdgeView;
		
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return FeaturesPackage.LABELED_EDGE___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return FeaturesPackage.LABELED_EDGE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return FeaturesPackage.LABELED_EDGE___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___PRE_SAVE: return FeaturesPackage.LABELED_EDGE___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT___POST_SAVE: return FeaturesPackage.LABELED_EDGE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Edge.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.EDGE___GET_SOURCE_ELEMENT: return FeaturesPackage.LABELED_EDGE___GET_SOURCE_ELEMENT;
				case GraphmodelPackage.EDGE___GET_TARGET_ELEMENT: return FeaturesPackage.LABELED_EDGE___GET_TARGET_ELEMENT;
				case GraphmodelPackage.EDGE___GET_POST_DELETE_FUNCTION: return FeaturesPackage.LABELED_EDGE___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.EDGE___GET_POST_DELETE_EVENT: return FeaturesPackage.LABELED_EDGE___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.EDGE___PRE_DELETE: return FeaturesPackage.LABELED_EDGE___PRE_DELETE;
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
			case FeaturesPackage.LABELED_EDGE___GET_LABEL:
				return getLabel();
			case FeaturesPackage.LABELED_EDGE___SET_LABEL__STRING:
				setLabel((String)arguments.get(0));
				return null;
			case FeaturesPackage.LABELED_EDGE___GET_INTERNAL_LABELED_EDGE:
				return getInternalLabeledEdge();
			case FeaturesPackage.LABELED_EDGE___IS_EXACTLY_LABELED_EDGE:
				return isExactlyLabeledEdge();
			case FeaturesPackage.LABELED_EDGE___PRE_DELETE:
				preDelete();
				return null;
			case FeaturesPackage.LABELED_EDGE___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case FeaturesPackage.LABELED_EDGE___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case FeaturesPackage.LABELED_EDGE___PRE_SAVE:
				preSave();
				return null;
			case FeaturesPackage.LABELED_EDGE___POST_SAVE:
				postSave();
				return null;
			case FeaturesPackage.LABELED_EDGE___GET_ROOT_ELEMENT:
				return getRootElement();
			case FeaturesPackage.LABELED_EDGE___GET_SOURCE_ELEMENT:
				return getSourceElement();
			case FeaturesPackage.LABELED_EDGE___GET_TARGET_ELEMENT:
				return getTargetElement();
			case FeaturesPackage.LABELED_EDGE___CAN_RECONNECT_SOURCE__STARTNODE:
				return canReconnectSource((StartNode)arguments.get(0));
			case FeaturesPackage.LABELED_EDGE___RECONNECT_SOURCE__STARTNODE:
				reconnectSource((StartNode)arguments.get(0));
				return null;
			case FeaturesPackage.LABELED_EDGE___CAN_RECONNECT_SOURCE__FEATURECONTAINER:
				return canReconnectSource((FeatureContainer)arguments.get(0));
			case FeaturesPackage.LABELED_EDGE___RECONNECT_SOURCE__FEATURECONTAINER:
				reconnectSource((FeatureContainer)arguments.get(0));
				return null;
			case FeaturesPackage.LABELED_EDGE___CAN_RECONNECT_SOURCE__DOCNODE:
				return canReconnectSource((DocNode)arguments.get(0));
			case FeaturesPackage.LABELED_EDGE___RECONNECT_SOURCE__DOCNODE:
				reconnectSource((DocNode)arguments.get(0));
				return null;
			case FeaturesPackage.LABELED_EDGE___CAN_RECONNECT_TARGET__DOCNODE:
				return canReconnectTarget((DocNode)arguments.get(0));
			case FeaturesPackage.LABELED_EDGE___RECONNECT_TARGET__DOCNODE:
				reconnectTarget((DocNode)arguments.get(0));
				return null;
			case FeaturesPackage.LABELED_EDGE___CAN_RECONNECT_TARGET__FEATURECONTAINER:
				return canReconnectTarget((FeatureContainer)arguments.get(0));
			case FeaturesPackage.LABELED_EDGE___RECONNECT_TARGET__FEATURECONTAINER:
				reconnectTarget((FeatureContainer)arguments.get(0));
				return null;
			case FeaturesPackage.LABELED_EDGE___CAN_RECONNECT_TARGET__ENDNODE:
				return canReconnectTarget((EndNode)arguments.get(0));
			case FeaturesPackage.LABELED_EDGE___RECONNECT_TARGET__ENDNODE:
				reconnectTarget((EndNode)arguments.get(0));
				return null;
			case FeaturesPackage.LABELED_EDGE___GET_LABELED_EDGE_VIEW:
				return getLabeledEdgeView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //LabeledEdgeImpl
