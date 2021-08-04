/**
 */
package info.scce.cinco.product.usersequence.usersequence.internal.impl;

import de.jabc.cinco.meta.core.mgl.model.constraints.ConnectionConstraint;

import graphmodel.internal.InternalNode;

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

import info.scce.cinco.product.usersequence.usersequence.internal.InternalInput;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalPackage;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalWebElement;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.internal.impl.InternalInputImpl#isHighlighted <em>Highlighted</em>}</li>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.internal.impl.InternalInputImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.internal.impl.InternalInputImpl#getValue <em>Value</em>}</li>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.internal.impl.InternalInputImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalInputImpl extends InternalWebElementImpl implements InternalInput {
	/**
	 * The default value of the '{@link #isHighlighted() <em>Highlighted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHighlighted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIGHLIGHTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHighlighted() <em>Highlighted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHighlighted()
	 * @generated
	 * @ordered
	 */
	protected boolean highlighted = HIGHLIGHTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelector() <em>Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelector()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelector() <em>Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelector()
	 * @generated
	 * @ordered
	 */
	protected String selector = SELECTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InternalPackage.eINSTANCE.getInternalInput();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHighlighted() {
		return highlighted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHighlighted(boolean newHighlighted) {
		boolean oldHighlighted = highlighted;
		highlighted = newHighlighted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_INPUT__HIGHLIGHTED, oldHighlighted, highlighted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSelector() {
		return selector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelector(String newSelector) {
		String oldSelector = selector;
		selector = newSelector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_INPUT__SELECTOR, oldSelector, selector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_INPUT__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_INPUT__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectionConstraint> getIncomingConstraints() {
		ConnectionConstraint cons0 = new ConnectionConstraint(false, 1, -1, info.scce.cinco.product.usersequence.usersequence.Transition.class,info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class,info.scce.cinco.product.usersequence.usersequence.Anchor.class);
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
		ConnectionConstraint cons0 = new ConnectionConstraint(true, 1, -1, info.scce.cinco.product.usersequence.usersequence.Transition.class,info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class);
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
			case InternalPackage.INTERNAL_INPUT__HIGHLIGHTED:
				return isHighlighted();
			case InternalPackage.INTERNAL_INPUT__SELECTOR:
				return getSelector();
			case InternalPackage.INTERNAL_INPUT__VALUE:
				return getValue();
			case InternalPackage.INTERNAL_INPUT__CONTENT:
				return getContent();
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
			case InternalPackage.INTERNAL_INPUT__HIGHLIGHTED:
				setHighlighted((Boolean)newValue);
				return;
			case InternalPackage.INTERNAL_INPUT__SELECTOR:
				setSelector((String)newValue);
				return;
			case InternalPackage.INTERNAL_INPUT__VALUE:
				setValue((String)newValue);
				return;
			case InternalPackage.INTERNAL_INPUT__CONTENT:
				setContent((String)newValue);
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
			case InternalPackage.INTERNAL_INPUT__HIGHLIGHTED:
				setHighlighted(HIGHLIGHTED_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_INPUT__SELECTOR:
				setSelector(SELECTOR_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_INPUT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_INPUT__CONTENT:
				setContent(CONTENT_EDEFAULT);
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
			case InternalPackage.INTERNAL_INPUT__HIGHLIGHTED:
				return highlighted != HIGHLIGHTED_EDEFAULT;
			case InternalPackage.INTERNAL_INPUT__SELECTOR:
				return SELECTOR_EDEFAULT == null ? selector != null : !SELECTOR_EDEFAULT.equals(selector);
			case InternalPackage.INTERNAL_INPUT__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case InternalPackage.INTERNAL_INPUT__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
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
				case graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING_CONSTRAINTS: return InternalPackage.INTERNAL_INPUT___GET_OUTGOING_CONSTRAINTS;
				case graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING_CONSTRAINTS: return InternalPackage.INTERNAL_INPUT___GET_INCOMING_CONSTRAINTS;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == InternalWebElement.class) {
			switch (baseOperationID) {
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_INCOMING_CONSTRAINTS: return InternalPackage.INTERNAL_INPUT___GET_INCOMING_CONSTRAINTS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_OUTGOING_CONSTRAINTS: return InternalPackage.INTERNAL_INPUT___GET_OUTGOING_CONSTRAINTS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_START_PREDECESSORS: return InternalPackage.INTERNAL_INPUT___GET_START_PREDECESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_SUB_SEQUENCE_PREDECESSORS: return InternalPackage.INTERNAL_INPUT___GET_SUB_SEQUENCE_PREDECESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_SCREENSHOT_PREDECESSORS: return InternalPackage.INTERNAL_INPUT___GET_SCREENSHOT_PREDECESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_SECTION_NODE_PREDECESSORS: return InternalPackage.INTERNAL_INPUT___GET_SECTION_NODE_PREDECESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_NAVIGATION_PREDECESSORS: return InternalPackage.INTERNAL_INPUT___GET_NAVIGATION_PREDECESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_WEB_ELEMENT_PREDECESSORS: return InternalPackage.INTERNAL_INPUT___GET_WEB_ELEMENT_PREDECESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_DIV_PREDECESSORS: return InternalPackage.INTERNAL_INPUT___GET_DIV_PREDECESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_HPREDECESSORS: return InternalPackage.INTERNAL_INPUT___GET_HPREDECESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_PPREDECESSORS: return InternalPackage.INTERNAL_INPUT___GET_PPREDECESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_SPAN_PREDECESSORS: return InternalPackage.INTERNAL_INPUT___GET_SPAN_PREDECESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_LABEL_PREDECESSORS: return InternalPackage.INTERNAL_INPUT___GET_LABEL_PREDECESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_FORM_PREDECESSORS: return InternalPackage.INTERNAL_INPUT___GET_FORM_PREDECESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_INPUT_PREDECESSORS: return InternalPackage.INTERNAL_INPUT___GET_INPUT_PREDECESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_TEXTAREA_PREDECESSORS: return InternalPackage.INTERNAL_INPUT___GET_TEXTAREA_PREDECESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_BUTTON_PREDECESSORS: return InternalPackage.INTERNAL_INPUT___GET_BUTTON_PREDECESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_SELECT_BOX_PREDECESSORS: return InternalPackage.INTERNAL_INPUT___GET_SELECT_BOX_PREDECESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_SELECT_BOX_OPTION_PREDECESSORS: return InternalPackage.INTERNAL_INPUT___GET_SELECT_BOX_OPTION_PREDECESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_TABLE_PREDECESSORS: return InternalPackage.INTERNAL_INPUT___GET_TABLE_PREDECESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_TABLE_HEAD_PREDECESSORS: return InternalPackage.INTERNAL_INPUT___GET_TABLE_HEAD_PREDECESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_TH_PREDECESSORS: return InternalPackage.INTERNAL_INPUT___GET_TH_PREDECESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_TABLE_ROW_PREDECESSORS: return InternalPackage.INTERNAL_INPUT___GET_TABLE_ROW_PREDECESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_TABLE_BODY_PREDECESSORS: return InternalPackage.INTERNAL_INPUT___GET_TABLE_BODY_PREDECESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_TABLE_DATA_PREDECESSORS: return InternalPackage.INTERNAL_INPUT___GET_TABLE_DATA_PREDECESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_SECTION_PREDECESSORS: return InternalPackage.INTERNAL_INPUT___GET_SECTION_PREDECESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_COMMENT_PREDECESSORS: return InternalPackage.INTERNAL_INPUT___GET_COMMENT_PREDECESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_STOP_SUCCESSORS: return InternalPackage.INTERNAL_INPUT___GET_STOP_SUCCESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_SUB_SEQUENCE_SUCCESSORS: return InternalPackage.INTERNAL_INPUT___GET_SUB_SEQUENCE_SUCCESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_SCREENSHOT_SUCCESSORS: return InternalPackage.INTERNAL_INPUT___GET_SCREENSHOT_SUCCESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_SECTION_NODE_SUCCESSORS: return InternalPackage.INTERNAL_INPUT___GET_SECTION_NODE_SUCCESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_NAVIGATION_SUCCESSORS: return InternalPackage.INTERNAL_INPUT___GET_NAVIGATION_SUCCESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_WEB_ELEMENT_SUCCESSORS: return InternalPackage.INTERNAL_INPUT___GET_WEB_ELEMENT_SUCCESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_DIV_SUCCESSORS: return InternalPackage.INTERNAL_INPUT___GET_DIV_SUCCESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_HSUCCESSORS: return InternalPackage.INTERNAL_INPUT___GET_HSUCCESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_PSUCCESSORS: return InternalPackage.INTERNAL_INPUT___GET_PSUCCESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_SPAN_SUCCESSORS: return InternalPackage.INTERNAL_INPUT___GET_SPAN_SUCCESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_LABEL_SUCCESSORS: return InternalPackage.INTERNAL_INPUT___GET_LABEL_SUCCESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_FORM_SUCCESSORS: return InternalPackage.INTERNAL_INPUT___GET_FORM_SUCCESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_INPUT_SUCCESSORS: return InternalPackage.INTERNAL_INPUT___GET_INPUT_SUCCESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_TEXTAREA_SUCCESSORS: return InternalPackage.INTERNAL_INPUT___GET_TEXTAREA_SUCCESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_BUTTON_SUCCESSORS: return InternalPackage.INTERNAL_INPUT___GET_BUTTON_SUCCESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_SELECT_BOX_SUCCESSORS: return InternalPackage.INTERNAL_INPUT___GET_SELECT_BOX_SUCCESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_SELECT_BOX_OPTION_SUCCESSORS: return InternalPackage.INTERNAL_INPUT___GET_SELECT_BOX_OPTION_SUCCESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_TABLE_SUCCESSORS: return InternalPackage.INTERNAL_INPUT___GET_TABLE_SUCCESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_TABLE_HEAD_SUCCESSORS: return InternalPackage.INTERNAL_INPUT___GET_TABLE_HEAD_SUCCESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_TH_SUCCESSORS: return InternalPackage.INTERNAL_INPUT___GET_TH_SUCCESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_TABLE_ROW_SUCCESSORS: return InternalPackage.INTERNAL_INPUT___GET_TABLE_ROW_SUCCESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_TABLE_BODY_SUCCESSORS: return InternalPackage.INTERNAL_INPUT___GET_TABLE_BODY_SUCCESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_TABLE_DATA_SUCCESSORS: return InternalPackage.INTERNAL_INPUT___GET_TABLE_DATA_SUCCESSORS;
				case InternalPackage.INTERNAL_WEB_ELEMENT___GET_SECTION_SUCCESSORS: return InternalPackage.INTERNAL_INPUT___GET_SECTION_SUCCESSORS;
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
			case InternalPackage.INTERNAL_INPUT___GET_INCOMING_CONSTRAINTS:
				return getIncomingConstraints();
			case InternalPackage.INTERNAL_INPUT___GET_OUTGOING_CONSTRAINTS:
				return getOutgoingConstraints();
			case InternalPackage.INTERNAL_INPUT___GET_START_PREDECESSORS:
				return getStartPredecessors();
			case InternalPackage.INTERNAL_INPUT___GET_SUB_SEQUENCE_PREDECESSORS:
				return getSubSequencePredecessors();
			case InternalPackage.INTERNAL_INPUT___GET_SCREENSHOT_PREDECESSORS:
				return getScreenshotPredecessors();
			case InternalPackage.INTERNAL_INPUT___GET_SECTION_NODE_PREDECESSORS:
				return getSectionNodePredecessors();
			case InternalPackage.INTERNAL_INPUT___GET_NAVIGATION_PREDECESSORS:
				return getNavigationPredecessors();
			case InternalPackage.INTERNAL_INPUT___GET_WEB_ELEMENT_PREDECESSORS:
				return getWebElementPredecessors();
			case InternalPackage.INTERNAL_INPUT___GET_DIV_PREDECESSORS:
				return getDivPredecessors();
			case InternalPackage.INTERNAL_INPUT___GET_HPREDECESSORS:
				return getHPredecessors();
			case InternalPackage.INTERNAL_INPUT___GET_PPREDECESSORS:
				return getPPredecessors();
			case InternalPackage.INTERNAL_INPUT___GET_SPAN_PREDECESSORS:
				return getSpanPredecessors();
			case InternalPackage.INTERNAL_INPUT___GET_LABEL_PREDECESSORS:
				return getLabelPredecessors();
			case InternalPackage.INTERNAL_INPUT___GET_FORM_PREDECESSORS:
				return getFormPredecessors();
			case InternalPackage.INTERNAL_INPUT___GET_INPUT_PREDECESSORS:
				return getInputPredecessors();
			case InternalPackage.INTERNAL_INPUT___GET_TEXTAREA_PREDECESSORS:
				return getTextareaPredecessors();
			case InternalPackage.INTERNAL_INPUT___GET_BUTTON_PREDECESSORS:
				return getButtonPredecessors();
			case InternalPackage.INTERNAL_INPUT___GET_SELECT_BOX_PREDECESSORS:
				return getSelectBoxPredecessors();
			case InternalPackage.INTERNAL_INPUT___GET_SELECT_BOX_OPTION_PREDECESSORS:
				return getSelectBoxOptionPredecessors();
			case InternalPackage.INTERNAL_INPUT___GET_TABLE_PREDECESSORS:
				return getTablePredecessors();
			case InternalPackage.INTERNAL_INPUT___GET_TABLE_HEAD_PREDECESSORS:
				return getTableHeadPredecessors();
			case InternalPackage.INTERNAL_INPUT___GET_TH_PREDECESSORS:
				return getThPredecessors();
			case InternalPackage.INTERNAL_INPUT___GET_TABLE_ROW_PREDECESSORS:
				return getTableRowPredecessors();
			case InternalPackage.INTERNAL_INPUT___GET_TABLE_BODY_PREDECESSORS:
				return getTableBodyPredecessors();
			case InternalPackage.INTERNAL_INPUT___GET_TABLE_DATA_PREDECESSORS:
				return getTableDataPredecessors();
			case InternalPackage.INTERNAL_INPUT___GET_SECTION_PREDECESSORS:
				return getSectionPredecessors();
			case InternalPackage.INTERNAL_INPUT___GET_COMMENT_PREDECESSORS:
				return getCommentPredecessors();
			case InternalPackage.INTERNAL_INPUT___GET_STOP_SUCCESSORS:
				return getStopSuccessors();
			case InternalPackage.INTERNAL_INPUT___GET_SUB_SEQUENCE_SUCCESSORS:
				return getSubSequenceSuccessors();
			case InternalPackage.INTERNAL_INPUT___GET_SCREENSHOT_SUCCESSORS:
				return getScreenshotSuccessors();
			case InternalPackage.INTERNAL_INPUT___GET_SECTION_NODE_SUCCESSORS:
				return getSectionNodeSuccessors();
			case InternalPackage.INTERNAL_INPUT___GET_NAVIGATION_SUCCESSORS:
				return getNavigationSuccessors();
			case InternalPackage.INTERNAL_INPUT___GET_WEB_ELEMENT_SUCCESSORS:
				return getWebElementSuccessors();
			case InternalPackage.INTERNAL_INPUT___GET_DIV_SUCCESSORS:
				return getDivSuccessors();
			case InternalPackage.INTERNAL_INPUT___GET_HSUCCESSORS:
				return getHSuccessors();
			case InternalPackage.INTERNAL_INPUT___GET_PSUCCESSORS:
				return getPSuccessors();
			case InternalPackage.INTERNAL_INPUT___GET_SPAN_SUCCESSORS:
				return getSpanSuccessors();
			case InternalPackage.INTERNAL_INPUT___GET_LABEL_SUCCESSORS:
				return getLabelSuccessors();
			case InternalPackage.INTERNAL_INPUT___GET_FORM_SUCCESSORS:
				return getFormSuccessors();
			case InternalPackage.INTERNAL_INPUT___GET_INPUT_SUCCESSORS:
				return getInputSuccessors();
			case InternalPackage.INTERNAL_INPUT___GET_TEXTAREA_SUCCESSORS:
				return getTextareaSuccessors();
			case InternalPackage.INTERNAL_INPUT___GET_BUTTON_SUCCESSORS:
				return getButtonSuccessors();
			case InternalPackage.INTERNAL_INPUT___GET_SELECT_BOX_SUCCESSORS:
				return getSelectBoxSuccessors();
			case InternalPackage.INTERNAL_INPUT___GET_SELECT_BOX_OPTION_SUCCESSORS:
				return getSelectBoxOptionSuccessors();
			case InternalPackage.INTERNAL_INPUT___GET_TABLE_SUCCESSORS:
				return getTableSuccessors();
			case InternalPackage.INTERNAL_INPUT___GET_TABLE_HEAD_SUCCESSORS:
				return getTableHeadSuccessors();
			case InternalPackage.INTERNAL_INPUT___GET_TH_SUCCESSORS:
				return getThSuccessors();
			case InternalPackage.INTERNAL_INPUT___GET_TABLE_ROW_SUCCESSORS:
				return getTableRowSuccessors();
			case InternalPackage.INTERNAL_INPUT___GET_TABLE_BODY_SUCCESSORS:
				return getTableBodySuccessors();
			case InternalPackage.INTERNAL_INPUT___GET_TABLE_DATA_SUCCESSORS:
				return getTableDataSuccessors();
			case InternalPackage.INTERNAL_INPUT___GET_SECTION_SUCCESSORS:
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
		result.append(" (highlighted: ");
		result.append(highlighted);
		result.append(", selector: ");
		result.append(selector);
		result.append(", value: ");
		result.append(value);
		result.append(", content: ");
		result.append(content);
		result.append(')');
		return result.toString();
	}

} //InternalInputImpl
