/**
 */
package info.scce.cinco.product.usersequence.usersequence.impl;

import graphmodel.Direction;
import graphmodel.GraphModel;
import graphmodel.GraphmodelPackage;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.ModelElementContainer;
import graphmodel.Node;

import graphmodel.impl.NodeImpl;

import info.scce.cinco.product.usersequence.usersequence.Domain;
import info.scce.cinco.product.usersequence.usersequence.UserSequenceGraphModel;
import info.scce.cinco.product.usersequence.usersequence.UsersequencePackage;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalDomain;

import info.scce.cinco.product.usersequence.usersequence.views.DomainView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DomainImpl extends NodeImpl implements Domain {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsersequencePackage.eINSTANCE.getDomain();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContent() {
		return getInternalDomain().getContent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(final String _arg) {
		getInternalDomain().getElement().transact("Set Content", () -> {
			getInternalDomain().setContent(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalDomain getInternalDomain() {
		return (info.scce.cinco.product.usersequence.usersequence.internal.InternalDomain) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyDomain() {
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
	public boolean canMoveTo(final UserSequenceGraphModel userSequenceGraphModel, final int x, final int y) {
		return userSequenceGraphModel.canContain(info.scce.cinco.product.usersequence.usersequence.Domain.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void moveTo(final UserSequenceGraphModel userSequenceGraphModel, final int x, final int y) {
		transact("Move to", () -> {
			graphmodel.ModelElementContainer sourceContainer = this.getContainer();
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			s_moveTo(userSequenceGraphModel, x, y);
			userSequenceGraphModel.getInternalContainerElement().getModelElements().add(ime);
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
	public void s_moveTo(final UserSequenceGraphModel userSequenceGraphModel, final int x, final int y) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserSequenceGraphModel getContainer() {
		return (info.scce.cinco.product.usersequence.usersequence.UserSequenceGraphModel)getInternalElement().getContainer().getContainerElement();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainView getDomainView() {
		DomainView domainView = info.scce.cinco.product.usersequence.usersequence.views.ViewsFactory.eINSTANCE.createDomainView();
		domainView.setInternalDomain((info.scce.cinco.product.usersequence.usersequence.internal.InternalDomain)getInternalElement());
		return domainView;
		
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return UsersequencePackage.DOMAIN___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return UsersequencePackage.DOMAIN___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_CONTAINER: return UsersequencePackage.DOMAIN___GET_CONTAINER;
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return UsersequencePackage.DOMAIN___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___PRE_SAVE: return UsersequencePackage.DOMAIN___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT___POST_SAVE: return UsersequencePackage.DOMAIN___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Node.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return UsersequencePackage.DOMAIN___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return UsersequencePackage.DOMAIN___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case GraphmodelPackage.NODE___GET_POST_DELETE_FUNCTION: return UsersequencePackage.DOMAIN___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.NODE___GET_POST_DELETE_EVENT: return UsersequencePackage.DOMAIN___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.NODE___PRE_DELETE: return UsersequencePackage.DOMAIN___PRE_DELETE;
				case GraphmodelPackage.NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return UsersequencePackage.DOMAIN___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return UsersequencePackage.DOMAIN___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return UsersequencePackage.DOMAIN___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
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
			case UsersequencePackage.DOMAIN___GET_CONTENT:
				return getContent();
			case UsersequencePackage.DOMAIN___SET_CONTENT__STRING:
				setContent((String)arguments.get(0));
				return null;
			case UsersequencePackage.DOMAIN___GET_INTERNAL_DOMAIN:
				return getInternalDomain();
			case UsersequencePackage.DOMAIN___IS_EXACTLY_DOMAIN:
				return isExactlyDomain();
			case UsersequencePackage.DOMAIN___PRE_DELETE:
				preDelete();
				return null;
			case UsersequencePackage.DOMAIN___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case UsersequencePackage.DOMAIN___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case UsersequencePackage.DOMAIN___PRE_SAVE:
				preSave();
				return null;
			case UsersequencePackage.DOMAIN___POST_SAVE:
				postSave();
				return null;
			case UsersequencePackage.DOMAIN___GET_ROOT_ELEMENT:
				return getRootElement();
			case UsersequencePackage.DOMAIN___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT:
				s_moveTo((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case UsersequencePackage.DOMAIN___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT:
				preMove((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case UsersequencePackage.DOMAIN___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT:
				postMove((ModelElementContainer)arguments.get(0), (ModelElementContainer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
				return null;
			case UsersequencePackage.DOMAIN___PRE_RESIZE__INT_INT_INT_INT_DIRECTION:
				preResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case UsersequencePackage.DOMAIN___POST_RESIZE__INT_INT_INT_INT_DIRECTION:
				postResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case UsersequencePackage.DOMAIN___CAN_MOVE_TO__USERSEQUENCEGRAPHMODEL_INT_INT:
				return canMoveTo((UserSequenceGraphModel)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case UsersequencePackage.DOMAIN___MOVE_TO__USERSEQUENCEGRAPHMODEL_INT_INT:
				moveTo((UserSequenceGraphModel)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case UsersequencePackage.DOMAIN___SMOVE_TO__USERSEQUENCEGRAPHMODEL_INT_INT:
				s_moveTo((UserSequenceGraphModel)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case UsersequencePackage.DOMAIN___GET_CONTAINER:
				return getContainer();
			case UsersequencePackage.DOMAIN___GET_DOMAIN_VIEW:
				return getDomainView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //DomainImpl
