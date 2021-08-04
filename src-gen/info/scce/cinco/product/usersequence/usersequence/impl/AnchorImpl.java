/**
 */
package info.scce.cinco.product.usersequence.usersequence.impl;

import graphmodel.Edge;
import graphmodel.GraphModel;
import graphmodel.GraphmodelPackage;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.Node;

import graphmodel.impl.EdgeImpl;

import info.scce.cinco.product.usersequence.usersequence.Anchor;
import info.scce.cinco.product.usersequence.usersequence.Button;
import info.scce.cinco.product.usersequence.usersequence.Comment;
import info.scce.cinco.product.usersequence.usersequence.Div;
import info.scce.cinco.product.usersequence.usersequence.Form;
import info.scce.cinco.product.usersequence.usersequence.H;
import info.scce.cinco.product.usersequence.usersequence.Input;
import info.scce.cinco.product.usersequence.usersequence.Label;
import info.scce.cinco.product.usersequence.usersequence.Navigation;
import info.scce.cinco.product.usersequence.usersequence.P;
import info.scce.cinco.product.usersequence.usersequence.Screenshot;
import info.scce.cinco.product.usersequence.usersequence.Section;
import info.scce.cinco.product.usersequence.usersequence.SectionNode;
import info.scce.cinco.product.usersequence.usersequence.SelectBox;
import info.scce.cinco.product.usersequence.usersequence.SelectBoxOption;
import info.scce.cinco.product.usersequence.usersequence.Span;
import info.scce.cinco.product.usersequence.usersequence.SubSequence;
import info.scce.cinco.product.usersequence.usersequence.Table;
import info.scce.cinco.product.usersequence.usersequence.TableBody;
import info.scce.cinco.product.usersequence.usersequence.TableData;
import info.scce.cinco.product.usersequence.usersequence.TableHead;
import info.scce.cinco.product.usersequence.usersequence.TableRow;
import info.scce.cinco.product.usersequence.usersequence.Textarea;
import info.scce.cinco.product.usersequence.usersequence.Th;
import info.scce.cinco.product.usersequence.usersequence.UsersequencePackage;
import info.scce.cinco.product.usersequence.usersequence.WebElement;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalAnchor;

import info.scce.cinco.product.usersequence.usersequence.views.AnchorView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anchor</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AnchorImpl extends EdgeImpl implements Anchor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnchorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsersequencePackage.eINSTANCE.getAnchor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalAnchor getInternalAnchor() {
		return (info.scce.cinco.product.usersequence.usersequence.internal.InternalAnchor) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyAnchor() {
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
	public Comment getSourceElement() {
		return(info.scce.cinco.product.usersequence.usersequence.Comment)super.getSourceElement();
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
	public boolean canReconnectSource(final Comment source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final Comment source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final P target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final P target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final Textarea target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final Textarea target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final Span target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final Span target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final TableBody target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final TableBody target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final Screenshot target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final Screenshot target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final Form target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final Form target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final Navigation target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final Navigation target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final SubSequence target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final SubSequence target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final Table target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final Table target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final Label target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final Label target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final TableRow target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final TableRow target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final SelectBox target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final SelectBox target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final Th target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final Th target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final SelectBoxOption target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final SelectBoxOption target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final Input target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final Input target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final TableData target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final TableData target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final WebElement target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final WebElement target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final Div target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final Div target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final Button target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final Button target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final SectionNode target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final SectionNode target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final H target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final H target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final TableHead target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final TableHead target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final Section target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final Section target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnchorView getAnchorView() {
		AnchorView anchorView = info.scce.cinco.product.usersequence.usersequence.views.ViewsFactory.eINSTANCE.createAnchorView();
		anchorView.setInternalAnchor((info.scce.cinco.product.usersequence.usersequence.internal.InternalAnchor)getInternalElement());
		return anchorView;
		
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return UsersequencePackage.ANCHOR___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return UsersequencePackage.ANCHOR___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return UsersequencePackage.ANCHOR___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___PRE_SAVE: return UsersequencePackage.ANCHOR___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT___POST_SAVE: return UsersequencePackage.ANCHOR___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Edge.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.EDGE___GET_SOURCE_ELEMENT: return UsersequencePackage.ANCHOR___GET_SOURCE_ELEMENT;
				case GraphmodelPackage.EDGE___GET_TARGET_ELEMENT: return UsersequencePackage.ANCHOR___GET_TARGET_ELEMENT;
				case GraphmodelPackage.EDGE___GET_POST_DELETE_FUNCTION: return UsersequencePackage.ANCHOR___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.EDGE___GET_POST_DELETE_EVENT: return UsersequencePackage.ANCHOR___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.EDGE___PRE_DELETE: return UsersequencePackage.ANCHOR___PRE_DELETE;
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
			case UsersequencePackage.ANCHOR___GET_INTERNAL_ANCHOR:
				return getInternalAnchor();
			case UsersequencePackage.ANCHOR___IS_EXACTLY_ANCHOR:
				return isExactlyAnchor();
			case UsersequencePackage.ANCHOR___PRE_DELETE:
				preDelete();
				return null;
			case UsersequencePackage.ANCHOR___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case UsersequencePackage.ANCHOR___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case UsersequencePackage.ANCHOR___PRE_SAVE:
				preSave();
				return null;
			case UsersequencePackage.ANCHOR___POST_SAVE:
				postSave();
				return null;
			case UsersequencePackage.ANCHOR___GET_ROOT_ELEMENT:
				return getRootElement();
			case UsersequencePackage.ANCHOR___GET_SOURCE_ELEMENT:
				return getSourceElement();
			case UsersequencePackage.ANCHOR___GET_TARGET_ELEMENT:
				return getTargetElement();
			case UsersequencePackage.ANCHOR___CAN_RECONNECT_SOURCE__COMMENT:
				return canReconnectSource((Comment)arguments.get(0));
			case UsersequencePackage.ANCHOR___RECONNECT_SOURCE__COMMENT:
				reconnectSource((Comment)arguments.get(0));
				return null;
			case UsersequencePackage.ANCHOR___CAN_RECONNECT_TARGET__P:
				return canReconnectTarget((P)arguments.get(0));
			case UsersequencePackage.ANCHOR___RECONNECT_TARGET__P:
				reconnectTarget((P)arguments.get(0));
				return null;
			case UsersequencePackage.ANCHOR___CAN_RECONNECT_TARGET__TEXTAREA:
				return canReconnectTarget((Textarea)arguments.get(0));
			case UsersequencePackage.ANCHOR___RECONNECT_TARGET__TEXTAREA:
				reconnectTarget((Textarea)arguments.get(0));
				return null;
			case UsersequencePackage.ANCHOR___CAN_RECONNECT_TARGET__SPAN:
				return canReconnectTarget((Span)arguments.get(0));
			case UsersequencePackage.ANCHOR___RECONNECT_TARGET__SPAN:
				reconnectTarget((Span)arguments.get(0));
				return null;
			case UsersequencePackage.ANCHOR___CAN_RECONNECT_TARGET__TABLEBODY:
				return canReconnectTarget((TableBody)arguments.get(0));
			case UsersequencePackage.ANCHOR___RECONNECT_TARGET__TABLEBODY:
				reconnectTarget((TableBody)arguments.get(0));
				return null;
			case UsersequencePackage.ANCHOR___CAN_RECONNECT_TARGET__SCREENSHOT:
				return canReconnectTarget((Screenshot)arguments.get(0));
			case UsersequencePackage.ANCHOR___RECONNECT_TARGET__SCREENSHOT:
				reconnectTarget((Screenshot)arguments.get(0));
				return null;
			case UsersequencePackage.ANCHOR___CAN_RECONNECT_TARGET__FORM:
				return canReconnectTarget((Form)arguments.get(0));
			case UsersequencePackage.ANCHOR___RECONNECT_TARGET__FORM:
				reconnectTarget((Form)arguments.get(0));
				return null;
			case UsersequencePackage.ANCHOR___CAN_RECONNECT_TARGET__NAVIGATION:
				return canReconnectTarget((Navigation)arguments.get(0));
			case UsersequencePackage.ANCHOR___RECONNECT_TARGET__NAVIGATION:
				reconnectTarget((Navigation)arguments.get(0));
				return null;
			case UsersequencePackage.ANCHOR___CAN_RECONNECT_TARGET__SUBSEQUENCE:
				return canReconnectTarget((SubSequence)arguments.get(0));
			case UsersequencePackage.ANCHOR___RECONNECT_TARGET__SUBSEQUENCE:
				reconnectTarget((SubSequence)arguments.get(0));
				return null;
			case UsersequencePackage.ANCHOR___CAN_RECONNECT_TARGET__TABLE:
				return canReconnectTarget((Table)arguments.get(0));
			case UsersequencePackage.ANCHOR___RECONNECT_TARGET__TABLE:
				reconnectTarget((Table)arguments.get(0));
				return null;
			case UsersequencePackage.ANCHOR___CAN_RECONNECT_TARGET__LABEL:
				return canReconnectTarget((Label)arguments.get(0));
			case UsersequencePackage.ANCHOR___RECONNECT_TARGET__LABEL:
				reconnectTarget((Label)arguments.get(0));
				return null;
			case UsersequencePackage.ANCHOR___CAN_RECONNECT_TARGET__TABLEROW:
				return canReconnectTarget((TableRow)arguments.get(0));
			case UsersequencePackage.ANCHOR___RECONNECT_TARGET__TABLEROW:
				reconnectTarget((TableRow)arguments.get(0));
				return null;
			case UsersequencePackage.ANCHOR___CAN_RECONNECT_TARGET__SELECTBOX:
				return canReconnectTarget((SelectBox)arguments.get(0));
			case UsersequencePackage.ANCHOR___RECONNECT_TARGET__SELECTBOX:
				reconnectTarget((SelectBox)arguments.get(0));
				return null;
			case UsersequencePackage.ANCHOR___CAN_RECONNECT_TARGET__TH:
				return canReconnectTarget((Th)arguments.get(0));
			case UsersequencePackage.ANCHOR___RECONNECT_TARGET__TH:
				reconnectTarget((Th)arguments.get(0));
				return null;
			case UsersequencePackage.ANCHOR___CAN_RECONNECT_TARGET__SELECTBOXOPTION:
				return canReconnectTarget((SelectBoxOption)arguments.get(0));
			case UsersequencePackage.ANCHOR___RECONNECT_TARGET__SELECTBOXOPTION:
				reconnectTarget((SelectBoxOption)arguments.get(0));
				return null;
			case UsersequencePackage.ANCHOR___CAN_RECONNECT_TARGET__INPUT:
				return canReconnectTarget((Input)arguments.get(0));
			case UsersequencePackage.ANCHOR___RECONNECT_TARGET__INPUT:
				reconnectTarget((Input)arguments.get(0));
				return null;
			case UsersequencePackage.ANCHOR___CAN_RECONNECT_TARGET__TABLEDATA:
				return canReconnectTarget((TableData)arguments.get(0));
			case UsersequencePackage.ANCHOR___RECONNECT_TARGET__TABLEDATA:
				reconnectTarget((TableData)arguments.get(0));
				return null;
			case UsersequencePackage.ANCHOR___CAN_RECONNECT_TARGET__WEBELEMENT:
				return canReconnectTarget((WebElement)arguments.get(0));
			case UsersequencePackage.ANCHOR___RECONNECT_TARGET__WEBELEMENT:
				reconnectTarget((WebElement)arguments.get(0));
				return null;
			case UsersequencePackage.ANCHOR___CAN_RECONNECT_TARGET__DIV:
				return canReconnectTarget((Div)arguments.get(0));
			case UsersequencePackage.ANCHOR___RECONNECT_TARGET__DIV:
				reconnectTarget((Div)arguments.get(0));
				return null;
			case UsersequencePackage.ANCHOR___CAN_RECONNECT_TARGET__BUTTON:
				return canReconnectTarget((Button)arguments.get(0));
			case UsersequencePackage.ANCHOR___RECONNECT_TARGET__BUTTON:
				reconnectTarget((Button)arguments.get(0));
				return null;
			case UsersequencePackage.ANCHOR___CAN_RECONNECT_TARGET__SECTIONNODE:
				return canReconnectTarget((SectionNode)arguments.get(0));
			case UsersequencePackage.ANCHOR___RECONNECT_TARGET__SECTIONNODE:
				reconnectTarget((SectionNode)arguments.get(0));
				return null;
			case UsersequencePackage.ANCHOR___CAN_RECONNECT_TARGET__H:
				return canReconnectTarget((H)arguments.get(0));
			case UsersequencePackage.ANCHOR___RECONNECT_TARGET__H:
				reconnectTarget((H)arguments.get(0));
				return null;
			case UsersequencePackage.ANCHOR___CAN_RECONNECT_TARGET__TABLEHEAD:
				return canReconnectTarget((TableHead)arguments.get(0));
			case UsersequencePackage.ANCHOR___RECONNECT_TARGET__TABLEHEAD:
				reconnectTarget((TableHead)arguments.get(0));
				return null;
			case UsersequencePackage.ANCHOR___CAN_RECONNECT_TARGET__SECTION:
				return canReconnectTarget((Section)arguments.get(0));
			case UsersequencePackage.ANCHOR___RECONNECT_TARGET__SECTION:
				reconnectTarget((Section)arguments.get(0));
				return null;
			case UsersequencePackage.ANCHOR___GET_ANCHOR_VIEW:
				return getAnchorView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AnchorImpl
