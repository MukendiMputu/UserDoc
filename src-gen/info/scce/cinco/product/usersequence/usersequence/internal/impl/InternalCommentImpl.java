/**
 */
package info.scce.cinco.product.usersequence.usersequence.internal.impl;

import de.jabc.cinco.meta.core.mgl.model.constraints.ConnectionConstraint;

import graphmodel.internal.InternalNode;

import graphmodel.internal.impl.InternalNodeImpl;

import info.scce.cinco.product.usersequence.usersequence.Button;
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
import info.scce.cinco.product.usersequence.usersequence.WebElement;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalComment;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.internal.impl.InternalCommentImpl#getContent <em>Content</em>}</li>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.internal.impl.InternalCommentImpl#getReferenceTo <em>Reference To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalCommentImpl extends InternalNodeImpl implements InternalComment {
	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferenceTo() <em>Reference To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceTo()
	 * @generated
	 * @ordered
	 */
	protected Screenshot referenceTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalCommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InternalPackage.eINSTANCE.getInternalComment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_COMMENT__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Screenshot getReferenceTo() {
		if (referenceTo != null && referenceTo.eIsProxy()) {
			InternalEObject oldReferenceTo = (InternalEObject)referenceTo;
			referenceTo = (Screenshot)eResolveProxy(oldReferenceTo);
			if (referenceTo != oldReferenceTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InternalPackage.INTERNAL_COMMENT__REFERENCE_TO, oldReferenceTo, referenceTo));
			}
		}
		return referenceTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screenshot basicGetReferenceTo() {
		return referenceTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferenceTo(Screenshot newReferenceTo) {
		Screenshot oldReferenceTo = referenceTo;
		referenceTo = newReferenceTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_COMMENT__REFERENCE_TO, oldReferenceTo, referenceTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectionConstraint> getOutgoingConstraints() {
		ConnectionConstraint cons0 = new ConnectionConstraint(true, 1, -1, info.scce.cinco.product.usersequence.usersequence.Anchor.class);
		org.eclipse.emf.common.util.BasicEList<ConnectionConstraint>eList = new org.eclipse.emf.common.util.BasicEList<ConnectionConstraint>();
		eList.addAll(com.google.common.collect.Lists.newArrayList(cons0));
		eList.addAll(super.getOutgoingConstraints());
		return eList;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubSequence> getSubSequenceSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.usersequence.usersequence.SubSequence.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Screenshot> getScreenshotSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.usersequence.usersequence.Screenshot.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SectionNode> getSectionNodeSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.usersequence.usersequence.SectionNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Navigation> getNavigationSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.usersequence.usersequence.Navigation.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WebElement> getWebElementSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.usersequence.usersequence.WebElement.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Div> getDivSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.usersequence.usersequence.Div.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<H> getHSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.usersequence.usersequence.H.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<P> getPSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.usersequence.usersequence.P.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Span> getSpanSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.usersequence.usersequence.Span.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Label> getLabelSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.usersequence.usersequence.Label.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Form> getFormSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.usersequence.usersequence.Form.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Input> getInputSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.usersequence.usersequence.Input.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Textarea> getTextareaSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.usersequence.usersequence.Textarea.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Button> getButtonSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.usersequence.usersequence.Button.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SelectBox> getSelectBoxSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.usersequence.usersequence.SelectBox.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SelectBoxOption> getSelectBoxOptionSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.usersequence.usersequence.SelectBoxOption.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Table> getTableSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.usersequence.usersequence.Table.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableHead> getTableHeadSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.usersequence.usersequence.TableHead.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Th> getThSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.usersequence.usersequence.Th.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableRow> getTableRowSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.usersequence.usersequence.TableRow.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableBody> getTableBodySuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.usersequence.usersequence.TableBody.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableData> getTableDataSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.usersequence.usersequence.TableData.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Section> getSectionSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.usersequence.usersequence.Section.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InternalPackage.INTERNAL_COMMENT__CONTENT:
				return getContent();
			case InternalPackage.INTERNAL_COMMENT__REFERENCE_TO:
				if (resolve) return getReferenceTo();
				return basicGetReferenceTo();
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
			case InternalPackage.INTERNAL_COMMENT__CONTENT:
				setContent((String)newValue);
				return;
			case InternalPackage.INTERNAL_COMMENT__REFERENCE_TO:
				setReferenceTo((Screenshot)newValue);
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
			case InternalPackage.INTERNAL_COMMENT__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_COMMENT__REFERENCE_TO:
				setReferenceTo((Screenshot)null);
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
			case InternalPackage.INTERNAL_COMMENT__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case InternalPackage.INTERNAL_COMMENT__REFERENCE_TO:
				return referenceTo != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == InternalNode.class) {
			switch (baseOperationID) {
				case graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING_CONSTRAINTS: return InternalPackage.INTERNAL_COMMENT___GET_OUTGOING_CONSTRAINTS;
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
			case InternalPackage.INTERNAL_COMMENT___GET_OUTGOING_CONSTRAINTS:
				return getOutgoingConstraints();
			case InternalPackage.INTERNAL_COMMENT___GET_SUB_SEQUENCE_SUCCESSORS:
				return getSubSequenceSuccessors();
			case InternalPackage.INTERNAL_COMMENT___GET_SCREENSHOT_SUCCESSORS:
				return getScreenshotSuccessors();
			case InternalPackage.INTERNAL_COMMENT___GET_SECTION_NODE_SUCCESSORS:
				return getSectionNodeSuccessors();
			case InternalPackage.INTERNAL_COMMENT___GET_NAVIGATION_SUCCESSORS:
				return getNavigationSuccessors();
			case InternalPackage.INTERNAL_COMMENT___GET_WEB_ELEMENT_SUCCESSORS:
				return getWebElementSuccessors();
			case InternalPackage.INTERNAL_COMMENT___GET_DIV_SUCCESSORS:
				return getDivSuccessors();
			case InternalPackage.INTERNAL_COMMENT___GET_HSUCCESSORS:
				return getHSuccessors();
			case InternalPackage.INTERNAL_COMMENT___GET_PSUCCESSORS:
				return getPSuccessors();
			case InternalPackage.INTERNAL_COMMENT___GET_SPAN_SUCCESSORS:
				return getSpanSuccessors();
			case InternalPackage.INTERNAL_COMMENT___GET_LABEL_SUCCESSORS:
				return getLabelSuccessors();
			case InternalPackage.INTERNAL_COMMENT___GET_FORM_SUCCESSORS:
				return getFormSuccessors();
			case InternalPackage.INTERNAL_COMMENT___GET_INPUT_SUCCESSORS:
				return getInputSuccessors();
			case InternalPackage.INTERNAL_COMMENT___GET_TEXTAREA_SUCCESSORS:
				return getTextareaSuccessors();
			case InternalPackage.INTERNAL_COMMENT___GET_BUTTON_SUCCESSORS:
				return getButtonSuccessors();
			case InternalPackage.INTERNAL_COMMENT___GET_SELECT_BOX_SUCCESSORS:
				return getSelectBoxSuccessors();
			case InternalPackage.INTERNAL_COMMENT___GET_SELECT_BOX_OPTION_SUCCESSORS:
				return getSelectBoxOptionSuccessors();
			case InternalPackage.INTERNAL_COMMENT___GET_TABLE_SUCCESSORS:
				return getTableSuccessors();
			case InternalPackage.INTERNAL_COMMENT___GET_TABLE_HEAD_SUCCESSORS:
				return getTableHeadSuccessors();
			case InternalPackage.INTERNAL_COMMENT___GET_TH_SUCCESSORS:
				return getThSuccessors();
			case InternalPackage.INTERNAL_COMMENT___GET_TABLE_ROW_SUCCESSORS:
				return getTableRowSuccessors();
			case InternalPackage.INTERNAL_COMMENT___GET_TABLE_BODY_SUCCESSORS:
				return getTableBodySuccessors();
			case InternalPackage.INTERNAL_COMMENT___GET_TABLE_DATA_SUCCESSORS:
				return getTableDataSuccessors();
			case InternalPackage.INTERNAL_COMMENT___GET_SECTION_SUCCESSORS:
				return getSectionSuccessors();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (content: ");
		result.append(content);
		result.append(')');
		return result.toString();
	}

} //InternalCommentImpl
