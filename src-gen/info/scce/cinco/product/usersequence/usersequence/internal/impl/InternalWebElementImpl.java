/**
 */
package info.scce.cinco.product.usersequence.usersequence.internal.impl;

import de.jabc.cinco.meta.core.mgl.model.constraints.ConnectionConstraint;

import graphmodel.internal.InternalNode;

import graphmodel.internal.impl.InternalNodeImpl;

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
import info.scce.cinco.product.usersequence.usersequence.Start;
import info.scce.cinco.product.usersequence.usersequence.Stop;
import info.scce.cinco.product.usersequence.usersequence.SubSequence;
import info.scce.cinco.product.usersequence.usersequence.Table;
import info.scce.cinco.product.usersequence.usersequence.TableBody;
import info.scce.cinco.product.usersequence.usersequence.TableData;
import info.scce.cinco.product.usersequence.usersequence.TableHead;
import info.scce.cinco.product.usersequence.usersequence.TableRow;
import info.scce.cinco.product.usersequence.usersequence.Textarea;
import info.scce.cinco.product.usersequence.usersequence.Th;
import info.scce.cinco.product.usersequence.usersequence.WebElement;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalPackage;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalWebElement;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.internal.impl.InternalWebElementImpl#isIsHighlighted <em>Is Highlighted</em>}</li>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.internal.impl.InternalWebElementImpl#getContentText <em>Content Text</em>}</li>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.internal.impl.InternalWebElementImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.internal.impl.InternalWebElementImpl#getAttrValue <em>Attr Value</em>}</li>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.internal.impl.InternalWebElementImpl#getTagName <em>Tag Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalWebElementImpl extends InternalNodeImpl implements InternalWebElement {
	/**
	 * The default value of the '{@link #isIsHighlighted() <em>Is Highlighted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHighlighted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_HIGHLIGHTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsHighlighted() <em>Is Highlighted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHighlighted()
	 * @generated
	 * @ordered
	 */
	protected boolean isHighlighted = IS_HIGHLIGHTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentText() <em>Content Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentText()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_TEXT_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getContentText() <em>Content Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentText()
	 * @generated
	 * @ordered
	 */
	protected String contentText = CONTENT_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_EDEFAULT = "id";

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected String attribute = ATTRIBUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttrValue() <em>Attr Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrValue()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTR_VALUE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getAttrValue() <em>Attr Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrValue()
	 * @generated
	 * @ordered
	 */
	protected String attrValue = ATTR_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTagName() <em>Tag Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagName()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTagName() <em>Tag Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagName()
	 * @generated
	 * @ordered
	 */
	protected String tagName = TAG_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalWebElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InternalPackage.eINSTANCE.getInternalWebElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsHighlighted() {
		return isHighlighted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsHighlighted(boolean newIsHighlighted) {
		boolean oldIsHighlighted = isHighlighted;
		isHighlighted = newIsHighlighted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_WEB_ELEMENT__IS_HIGHLIGHTED, oldIsHighlighted, isHighlighted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentText() {
		return contentText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentText(String newContentText) {
		String oldContentText = contentText;
		contentText = newContentText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_WEB_ELEMENT__CONTENT_TEXT, oldContentText, contentText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttribute(String newAttribute) {
		String oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_WEB_ELEMENT__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttrValue() {
		return attrValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttrValue(String newAttrValue) {
		String oldAttrValue = attrValue;
		attrValue = newAttrValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_WEB_ELEMENT__ATTR_VALUE, oldAttrValue, attrValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTagName() {
		return tagName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTagName(String newTagName) {
		String oldTagName = tagName;
		tagName = newTagName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_WEB_ELEMENT__TAG_NAME, oldTagName, tagName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectionConstraint> getIncomingConstraints() {
		ConnectionConstraint cons0 = new ConnectionConstraint(false, 1, 1, info.scce.cinco.product.usersequence.usersequence.Transition.class,info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class,info.scce.cinco.product.usersequence.usersequence.Anchor.class);
		org.eclipse.emf.common.util.BasicEList<ConnectionConstraint>eList = new org.eclipse.emf.common.util.BasicEList<ConnectionConstraint>();
		eList.addAll(com.google.common.collect.Lists.newArrayList(cons0));
		eList.addAll(super.getIncomingConstraints());
		return eList;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectionConstraint> getOutgoingConstraints() {
		ConnectionConstraint cons0 = new ConnectionConstraint(true, 1, 1, info.scce.cinco.product.usersequence.usersequence.Transition.class);
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
	public EList<Start> getStartPredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.usersequence.usersequence.Start.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubSequence> getSubSequencePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.usersequence.usersequence.SubSequence.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Screenshot> getScreenshotPredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.usersequence.usersequence.Screenshot.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SectionNode> getSectionNodePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.usersequence.usersequence.SectionNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Navigation> getNavigationPredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.usersequence.usersequence.Navigation.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WebElement> getWebElementPredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.usersequence.usersequence.WebElement.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Div> getDivPredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.usersequence.usersequence.Div.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<H> getHPredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.usersequence.usersequence.H.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<P> getPPredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.usersequence.usersequence.P.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Span> getSpanPredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.usersequence.usersequence.Span.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Label> getLabelPredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.usersequence.usersequence.Label.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Form> getFormPredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.usersequence.usersequence.Form.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Input> getInputPredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.usersequence.usersequence.Input.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Textarea> getTextareaPredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.usersequence.usersequence.Textarea.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Button> getButtonPredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.usersequence.usersequence.Button.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SelectBox> getSelectBoxPredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.usersequence.usersequence.SelectBox.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SelectBoxOption> getSelectBoxOptionPredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.usersequence.usersequence.SelectBoxOption.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Table> getTablePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.usersequence.usersequence.Table.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableHead> getTableHeadPredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.usersequence.usersequence.TableHead.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Th> getThPredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.usersequence.usersequence.Th.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableRow> getTableRowPredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.usersequence.usersequence.TableRow.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableBody> getTableBodyPredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.usersequence.usersequence.TableBody.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableData> getTableDataPredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.usersequence.usersequence.TableData.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Section> getSectionPredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.usersequence.usersequence.Section.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getCommentPredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.usersequence.usersequence.Comment.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Stop> getStopSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.usersequence.usersequence.Stop.class);
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
			case InternalPackage.INTERNAL_WEB_ELEMENT__IS_HIGHLIGHTED:
				return isIsHighlighted();
			case InternalPackage.INTERNAL_WEB_ELEMENT__CONTENT_TEXT:
				return getContentText();
			case InternalPackage.INTERNAL_WEB_ELEMENT__ATTRIBUTE:
				return getAttribute();
			case InternalPackage.INTERNAL_WEB_ELEMENT__ATTR_VALUE:
				return getAttrValue();
			case InternalPackage.INTERNAL_WEB_ELEMENT__TAG_NAME:
				return getTagName();
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
			case InternalPackage.INTERNAL_WEB_ELEMENT__IS_HIGHLIGHTED:
				setIsHighlighted((Boolean)newValue);
				return;
			case InternalPackage.INTERNAL_WEB_ELEMENT__CONTENT_TEXT:
				setContentText((String)newValue);
				return;
			case InternalPackage.INTERNAL_WEB_ELEMENT__ATTRIBUTE:
				setAttribute((String)newValue);
				return;
			case InternalPackage.INTERNAL_WEB_ELEMENT__ATTR_VALUE:
				setAttrValue((String)newValue);
				return;
			case InternalPackage.INTERNAL_WEB_ELEMENT__TAG_NAME:
				setTagName((String)newValue);
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
			case InternalPackage.INTERNAL_WEB_ELEMENT__IS_HIGHLIGHTED:
				setIsHighlighted(IS_HIGHLIGHTED_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_WEB_ELEMENT__CONTENT_TEXT:
				setContentText(CONTENT_TEXT_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_WEB_ELEMENT__ATTRIBUTE:
				setAttribute(ATTRIBUTE_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_WEB_ELEMENT__ATTR_VALUE:
				setAttrValue(ATTR_VALUE_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_WEB_ELEMENT__TAG_NAME:
				setTagName(TAG_NAME_EDEFAULT);
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
			case InternalPackage.INTERNAL_WEB_ELEMENT__IS_HIGHLIGHTED:
				return isHighlighted != IS_HIGHLIGHTED_EDEFAULT;
			case InternalPackage.INTERNAL_WEB_ELEMENT__CONTENT_TEXT:
				return CONTENT_TEXT_EDEFAULT == null ? contentText != null : !CONTENT_TEXT_EDEFAULT.equals(contentText);
			case InternalPackage.INTERNAL_WEB_ELEMENT__ATTRIBUTE:
				return ATTRIBUTE_EDEFAULT == null ? attribute != null : !ATTRIBUTE_EDEFAULT.equals(attribute);
			case InternalPackage.INTERNAL_WEB_ELEMENT__ATTR_VALUE:
				return ATTR_VALUE_EDEFAULT == null ? attrValue != null : !ATTR_VALUE_EDEFAULT.equals(attrValue);
			case InternalPackage.INTERNAL_WEB_ELEMENT__TAG_NAME:
				return TAG_NAME_EDEFAULT == null ? tagName != null : !TAG_NAME_EDEFAULT.equals(tagName);
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
				case graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING_CONSTRAINTS: return InternalPackage.INTERNAL_WEB_ELEMENT___GET_OUTGOING_CONSTRAINTS;
				case graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING_CONSTRAINTS: return InternalPackage.INTERNAL_WEB_ELEMENT___GET_INCOMING_CONSTRAINTS;
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
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_INCOMING_CONSTRAINTS:
				return getIncomingConstraints();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_OUTGOING_CONSTRAINTS:
				return getOutgoingConstraints();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_START_PREDECESSORS:
				return getStartPredecessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_SUB_SEQUENCE_PREDECESSORS:
				return getSubSequencePredecessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_SCREENSHOT_PREDECESSORS:
				return getScreenshotPredecessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_SECTION_NODE_PREDECESSORS:
				return getSectionNodePredecessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_NAVIGATION_PREDECESSORS:
				return getNavigationPredecessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_WEB_ELEMENT_PREDECESSORS:
				return getWebElementPredecessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_DIV_PREDECESSORS:
				return getDivPredecessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_HPREDECESSORS:
				return getHPredecessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_PPREDECESSORS:
				return getPPredecessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_SPAN_PREDECESSORS:
				return getSpanPredecessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_LABEL_PREDECESSORS:
				return getLabelPredecessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_FORM_PREDECESSORS:
				return getFormPredecessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_INPUT_PREDECESSORS:
				return getInputPredecessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_TEXTAREA_PREDECESSORS:
				return getTextareaPredecessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_BUTTON_PREDECESSORS:
				return getButtonPredecessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_SELECT_BOX_PREDECESSORS:
				return getSelectBoxPredecessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_SELECT_BOX_OPTION_PREDECESSORS:
				return getSelectBoxOptionPredecessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_TABLE_PREDECESSORS:
				return getTablePredecessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_TABLE_HEAD_PREDECESSORS:
				return getTableHeadPredecessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_TH_PREDECESSORS:
				return getThPredecessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_TABLE_ROW_PREDECESSORS:
				return getTableRowPredecessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_TABLE_BODY_PREDECESSORS:
				return getTableBodyPredecessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_TABLE_DATA_PREDECESSORS:
				return getTableDataPredecessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_SECTION_PREDECESSORS:
				return getSectionPredecessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_COMMENT_PREDECESSORS:
				return getCommentPredecessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_STOP_SUCCESSORS:
				return getStopSuccessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_SUB_SEQUENCE_SUCCESSORS:
				return getSubSequenceSuccessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_SCREENSHOT_SUCCESSORS:
				return getScreenshotSuccessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_SECTION_NODE_SUCCESSORS:
				return getSectionNodeSuccessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_NAVIGATION_SUCCESSORS:
				return getNavigationSuccessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_WEB_ELEMENT_SUCCESSORS:
				return getWebElementSuccessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_DIV_SUCCESSORS:
				return getDivSuccessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_HSUCCESSORS:
				return getHSuccessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_PSUCCESSORS:
				return getPSuccessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_SPAN_SUCCESSORS:
				return getSpanSuccessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_LABEL_SUCCESSORS:
				return getLabelSuccessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_FORM_SUCCESSORS:
				return getFormSuccessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_INPUT_SUCCESSORS:
				return getInputSuccessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_TEXTAREA_SUCCESSORS:
				return getTextareaSuccessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_BUTTON_SUCCESSORS:
				return getButtonSuccessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_SELECT_BOX_SUCCESSORS:
				return getSelectBoxSuccessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_SELECT_BOX_OPTION_SUCCESSORS:
				return getSelectBoxOptionSuccessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_TABLE_SUCCESSORS:
				return getTableSuccessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_TABLE_HEAD_SUCCESSORS:
				return getTableHeadSuccessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_TH_SUCCESSORS:
				return getThSuccessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_TABLE_ROW_SUCCESSORS:
				return getTableRowSuccessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_TABLE_BODY_SUCCESSORS:
				return getTableBodySuccessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_TABLE_DATA_SUCCESSORS:
				return getTableDataSuccessors();
			case InternalPackage.INTERNAL_WEB_ELEMENT___GET_SECTION_SUCCESSORS:
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
		result.append(" (isHighlighted: ");
		result.append(isHighlighted);
		result.append(", contentText: ");
		result.append(contentText);
		result.append(", attribute: ");
		result.append(attribute);
		result.append(", attrValue: ");
		result.append(attrValue);
		result.append(", tagName: ");
		result.append(tagName);
		result.append(')');
		return result.toString();
	}

} //InternalWebElementImpl
