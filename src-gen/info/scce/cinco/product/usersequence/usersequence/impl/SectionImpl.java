/**
 */
package info.scce.cinco.product.usersequence.usersequence.impl;

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

import info.scce.cinco.product.usersequence.usersequence.Anchor;
import info.scce.cinco.product.usersequence.usersequence.Button;
import info.scce.cinco.product.usersequence.usersequence.Comment;
import info.scce.cinco.product.usersequence.usersequence.Div;
import info.scce.cinco.product.usersequence.usersequence.Form;
import info.scce.cinco.product.usersequence.usersequence.H;
import info.scce.cinco.product.usersequence.usersequence.Input;
import info.scce.cinco.product.usersequence.usersequence.Label;
import info.scce.cinco.product.usersequence.usersequence.LabeledTransition;
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
import info.scce.cinco.product.usersequence.usersequence.Transition;
import info.scce.cinco.product.usersequence.usersequence.UserSequenceGraphModel;
import info.scce.cinco.product.usersequence.usersequence.UsersequencePackage;
import info.scce.cinco.product.usersequence.usersequence.WebElement;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalSection;

import info.scce.cinco.product.usersequence.usersequence.views.SectionView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.impl.SectionImpl#getInternalElement <em>Internal Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionImpl extends ModelElementContainerImpl implements Section {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsersequencePackage.eINSTANCE.getSection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalModelElement getInternalElement() {
		if (eContainerFeatureID() != UsersequencePackage.SECTION__INTERNAL_ELEMENT) return null;
		return (InternalModelElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInternalElement(InternalModelElement newInternalElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInternalElement, UsersequencePackage.SECTION__INTERNAL_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalElement(InternalModelElement newInternalElement) {
		if (newInternalElement != eInternalContainer() || (eContainerFeatureID() != UsersequencePackage.SECTION__INTERNAL_ELEMENT && newInternalElement != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, UsersequencePackage.SECTION__INTERNAL_ELEMENT, newInternalElement, newInternalElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHighlighted() {
		return getInternalSection().isHighlighted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHighlighted(final boolean _arg) {
		getInternalSection().getElement().transact("Set Highlighted", () -> {
			getInternalSection().setHighlighted(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return getInternalSection().getTitle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(final String _arg) {
		getInternalSection().getElement().transact("Set Title", () -> {
			getInternalSection().setTitle(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSection getInternalSection() {
		return (info.scce.cinco.product.usersequence.usersequence.internal.InternalSection) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlySection() {
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
	public EList<LabeledTransition> getOutgoingLabeledTransitions() {
		return this.getOutgoing(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transition> getOutgoingTransitions() {
		return this.getOutgoing(info.scce.cinco.product.usersequence.usersequence.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Anchor> getIncomingAnchors() {
		return this.getIncoming(info.scce.cinco.product.usersequence.usersequence.Anchor.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LabeledTransition> getIncomingLabeledTransitions() {
		return this.getIncoming(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transition> getIncomingTransitions() {
		return this.getIncoming(info.scce.cinco.product.usersequence.usersequence.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Start> getStartPredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.usersequence.usersequence.Start.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubSequence> getSubSequencePredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.usersequence.usersequence.SubSequence.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Screenshot> getScreenshotPredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.usersequence.usersequence.Screenshot.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SectionNode> getSectionNodePredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.usersequence.usersequence.SectionNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Navigation> getNavigationPredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.usersequence.usersequence.Navigation.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WebElement> getWebElementPredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.usersequence.usersequence.WebElement.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Div> getDivPredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.usersequence.usersequence.Div.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<H> getHPredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.usersequence.usersequence.H.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<P> getPPredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.usersequence.usersequence.P.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Span> getSpanPredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.usersequence.usersequence.Span.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Label> getLabelPredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.usersequence.usersequence.Label.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Form> getFormPredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.usersequence.usersequence.Form.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Input> getInputPredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.usersequence.usersequence.Input.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Textarea> getTextareaPredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.usersequence.usersequence.Textarea.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Button> getButtonPredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.usersequence.usersequence.Button.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SelectBox> getSelectBoxPredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.usersequence.usersequence.SelectBox.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SelectBoxOption> getSelectBoxOptionPredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.usersequence.usersequence.SelectBoxOption.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Table> getTablePredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.usersequence.usersequence.Table.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableHead> getTableHeadPredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.usersequence.usersequence.TableHead.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Th> getThPredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.usersequence.usersequence.Th.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableRow> getTableRowPredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.usersequence.usersequence.TableRow.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableBody> getTableBodyPredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.usersequence.usersequence.TableBody.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableData> getTableDataPredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.usersequence.usersequence.TableData.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Section> getSectionPredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.usersequence.usersequence.Section.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getCommentPredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.usersequence.usersequence.Comment.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Stop> getStopSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.usersequence.usersequence.Stop.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubSequence> getSubSequenceSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.usersequence.usersequence.SubSequence.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Screenshot> getScreenshotSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.usersequence.usersequence.Screenshot.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SectionNode> getSectionNodeSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.usersequence.usersequence.SectionNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Navigation> getNavigationSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.usersequence.usersequence.Navigation.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WebElement> getWebElementSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.usersequence.usersequence.WebElement.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Div> getDivSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.usersequence.usersequence.Div.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<H> getHSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.usersequence.usersequence.H.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<P> getPSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.usersequence.usersequence.P.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Span> getSpanSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.usersequence.usersequence.Span.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Label> getLabelSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.usersequence.usersequence.Label.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Form> getFormSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.usersequence.usersequence.Form.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Input> getInputSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.usersequence.usersequence.Input.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Textarea> getTextareaSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.usersequence.usersequence.Textarea.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Button> getButtonSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.usersequence.usersequence.Button.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SelectBox> getSelectBoxSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.usersequence.usersequence.SelectBox.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SelectBoxOption> getSelectBoxOptionSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.usersequence.usersequence.SelectBoxOption.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Table> getTableSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.usersequence.usersequence.Table.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableHead> getTableHeadSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.usersequence.usersequence.TableHead.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Th> getThSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.usersequence.usersequence.Th.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableRow> getTableRowSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.usersequence.usersequence.TableRow.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableBody> getTableBodySuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.usersequence.usersequence.TableBody.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableData> getTableDataSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.usersequence.usersequence.TableData.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Section> getSectionSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.usersequence.usersequence.Section.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewLabeledTransition(final P target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledTransition newLabeledTransition(final P target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public LabeledTransition newLabeledTransition(final P target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewLabeledTransition(final Textarea target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledTransition newLabeledTransition(final Textarea target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public LabeledTransition newLabeledTransition(final Textarea target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewLabeledTransition(final Span target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledTransition newLabeledTransition(final Span target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public LabeledTransition newLabeledTransition(final Span target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewLabeledTransition(final TableBody target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledTransition newLabeledTransition(final TableBody target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public LabeledTransition newLabeledTransition(final TableBody target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewLabeledTransition(final Screenshot target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledTransition newLabeledTransition(final Screenshot target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public LabeledTransition newLabeledTransition(final Screenshot target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewLabeledTransition(final Form target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledTransition newLabeledTransition(final Form target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public LabeledTransition newLabeledTransition(final Form target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewLabeledTransition(final Navigation target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledTransition newLabeledTransition(final Navigation target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public LabeledTransition newLabeledTransition(final Navigation target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewLabeledTransition(final SubSequence target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledTransition newLabeledTransition(final SubSequence target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public LabeledTransition newLabeledTransition(final SubSequence target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewLabeledTransition(final Stop target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledTransition newLabeledTransition(final Stop target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public LabeledTransition newLabeledTransition(final Stop target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewLabeledTransition(final Table target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledTransition newLabeledTransition(final Table target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public LabeledTransition newLabeledTransition(final Table target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewLabeledTransition(final Label target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledTransition newLabeledTransition(final Label target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public LabeledTransition newLabeledTransition(final Label target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewLabeledTransition(final TableRow target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledTransition newLabeledTransition(final TableRow target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public LabeledTransition newLabeledTransition(final TableRow target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewLabeledTransition(final SelectBox target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledTransition newLabeledTransition(final SelectBox target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public LabeledTransition newLabeledTransition(final SelectBox target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewLabeledTransition(final Th target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledTransition newLabeledTransition(final Th target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public LabeledTransition newLabeledTransition(final Th target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewLabeledTransition(final SelectBoxOption target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledTransition newLabeledTransition(final SelectBoxOption target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public LabeledTransition newLabeledTransition(final SelectBoxOption target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewLabeledTransition(final Input target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledTransition newLabeledTransition(final Input target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public LabeledTransition newLabeledTransition(final Input target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewLabeledTransition(final TableData target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledTransition newLabeledTransition(final TableData target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public LabeledTransition newLabeledTransition(final TableData target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewLabeledTransition(final WebElement target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledTransition newLabeledTransition(final WebElement target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public LabeledTransition newLabeledTransition(final WebElement target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewLabeledTransition(final Div target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledTransition newLabeledTransition(final Div target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public LabeledTransition newLabeledTransition(final Div target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewLabeledTransition(final Button target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledTransition newLabeledTransition(final Button target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public LabeledTransition newLabeledTransition(final Button target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewLabeledTransition(final SectionNode target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledTransition newLabeledTransition(final SectionNode target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public LabeledTransition newLabeledTransition(final SectionNode target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewLabeledTransition(final H target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledTransition newLabeledTransition(final H target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public LabeledTransition newLabeledTransition(final H target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewLabeledTransition(final TableHead target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledTransition newLabeledTransition(final TableHead target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public LabeledTransition newLabeledTransition(final TableHead target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewLabeledTransition(final Section target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledTransition newLabeledTransition(final Section target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public LabeledTransition newLabeledTransition(final Section target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", LabeledTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.LabeledTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", LabeledTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.LabeledTransition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabeledTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTransition(final P target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final P target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Transition newTransition(final P target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTransition(final Textarea target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final Textarea target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Transition newTransition(final Textarea target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTransition(final Span target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final Span target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Transition newTransition(final Span target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTransition(final TableBody target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final TableBody target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Transition newTransition(final TableBody target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTransition(final Screenshot target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final Screenshot target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Transition newTransition(final Screenshot target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTransition(final Form target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final Form target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Transition newTransition(final Form target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTransition(final Navigation target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final Navigation target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Transition newTransition(final Navigation target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTransition(final SubSequence target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final SubSequence target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Transition newTransition(final SubSequence target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTransition(final Stop target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final Stop target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Transition newTransition(final Stop target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTransition(final Table target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final Table target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Transition newTransition(final Table target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTransition(final Label target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final Label target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Transition newTransition(final Label target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTransition(final TableRow target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final TableRow target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Transition newTransition(final TableRow target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTransition(final SelectBox target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final SelectBox target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Transition newTransition(final SelectBox target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTransition(final Th target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final Th target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Transition newTransition(final Th target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTransition(final SelectBoxOption target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final SelectBoxOption target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Transition newTransition(final SelectBoxOption target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTransition(final Input target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final Input target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Transition newTransition(final Input target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTransition(final TableData target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final TableData target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Transition newTransition(final TableData target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTransition(final WebElement target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final WebElement target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Transition newTransition(final WebElement target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTransition(final Div target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final Div target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Transition newTransition(final Div target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTransition(final Button target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final Button target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Transition newTransition(final Button target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTransition(final SectionNode target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final SectionNode target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Transition newTransition(final SectionNode target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTransition(final H target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final H target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Transition newTransition(final H target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTransition(final TableHead target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final TableHead target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Transition newTransition(final TableHead target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTransition(final Section target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final Section target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Transition newTransition(final Section target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Transition edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canMoveTo(final UserSequenceGraphModel userSequenceGraphModel, final int x, final int y) {
		return userSequenceGraphModel.canContain(info.scce.cinco.product.usersequence.usersequence.Section.class);
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
	public SectionView getSectionView() {
		SectionView sectionView = info.scce.cinco.product.usersequence.usersequence.views.ViewsFactory.eINSTANCE.createSectionView();
		sectionView.setInternalSection((info.scce.cinco.product.usersequence.usersequence.internal.InternalSection)getInternalElement());
		return sectionView;
		
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
			case UsersequencePackage.SECTION__INTERNAL_ELEMENT:
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
			case UsersequencePackage.SECTION__INTERNAL_ELEMENT:
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
			case UsersequencePackage.SECTION__INTERNAL_ELEMENT:
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
			case UsersequencePackage.SECTION__INTERNAL_ELEMENT:
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
			case UsersequencePackage.SECTION__INTERNAL_ELEMENT:
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
			case UsersequencePackage.SECTION__INTERNAL_ELEMENT:
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
			case UsersequencePackage.SECTION__INTERNAL_ELEMENT:
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
				case UsersequencePackage.SECTION__INTERNAL_ELEMENT: return GraphmodelPackage.MODEL_ELEMENT__INTERNAL_ELEMENT;
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
				case GraphmodelPackage.MODEL_ELEMENT__INTERNAL_ELEMENT: return UsersequencePackage.SECTION__INTERNAL_ELEMENT;
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return UsersequencePackage.SECTION___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return UsersequencePackage.SECTION___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElementContainer.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___GET_INTERNAL_CONTAINER_ELEMENT: return UsersequencePackage.SECTION___GET_INTERNAL_CONTAINER_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___GET_NODES: return UsersequencePackage.SECTION___GET_NODES;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___PRE_SAVE: return UsersequencePackage.SECTION___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___POST_SAVE: return UsersequencePackage.SECTION___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_CONTAINER: return UsersequencePackage.SECTION___GET_CONTAINER;
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return UsersequencePackage.SECTION___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___HIGHLIGHT: return UsersequencePackage.SECTION___HIGHLIGHT;
				case GraphmodelPackage.MODEL_ELEMENT___UPDATE: return UsersequencePackage.SECTION___UPDATE;
				case GraphmodelPackage.MODEL_ELEMENT___UPDATE_GRAPH_MODEL: return UsersequencePackage.SECTION___UPDATE_GRAPH_MODEL;
				default: return -1;
			}
		}
		if (baseClass == Node.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.NODE___GET_SUCCESSORS: return UsersequencePackage.SECTION___GET_SUCCESSORS;
				case GraphmodelPackage.NODE___GET_SUCCESSORS__CLASS: return UsersequencePackage.SECTION___GET_SUCCESSORS__CLASS;
				case GraphmodelPackage.NODE___GET_PREDECESSORS: return UsersequencePackage.SECTION___GET_PREDECESSORS;
				case GraphmodelPackage.NODE___GET_PREDECESSORS__CLASS: return UsersequencePackage.SECTION___GET_PREDECESSORS__CLASS;
				case GraphmodelPackage.NODE___GET_INCOMING__CLASS: return UsersequencePackage.SECTION___GET_INCOMING__CLASS;
				case GraphmodelPackage.NODE___GET_OUTGOING__CLASS: return UsersequencePackage.SECTION___GET_OUTGOING__CLASS;
				case GraphmodelPackage.NODE___CAN_CONNECT__EDGE_NODE: return UsersequencePackage.SECTION___CAN_CONNECT__EDGE_NODE;
				case GraphmodelPackage.NODE___GET_OUTGOING_CONSTRAINTS: return UsersequencePackage.SECTION___GET_OUTGOING_CONSTRAINTS;
				case GraphmodelPackage.NODE___GET_INCOMING_CONSTRAINTS: return UsersequencePackage.SECTION___GET_INCOMING_CONSTRAINTS;
				case GraphmodelPackage.NODE___CAN_START__CLASS: return UsersequencePackage.SECTION___CAN_START__CLASS;
				case GraphmodelPackage.NODE___CAN_END__CLASS: return UsersequencePackage.SECTION___CAN_END__CLASS;
				case GraphmodelPackage.NODE___MOVE__INT_INT: return UsersequencePackage.SECTION___MOVE__INT_INT;
				case GraphmodelPackage.NODE___RESIZE__INT_INT: return UsersequencePackage.SECTION___RESIZE__INT_INT;
				case GraphmodelPackage.NODE___RESIZE__INT_INT_INT_INT: return UsersequencePackage.SECTION___RESIZE__INT_INT_INT_INT;
				case GraphmodelPackage.NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return UsersequencePackage.SECTION___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return UsersequencePackage.SECTION___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case GraphmodelPackage.NODE___DELETE: return UsersequencePackage.SECTION___DELETE;
				case GraphmodelPackage.NODE___GET_POST_DELETE_FUNCTION: return UsersequencePackage.SECTION___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.NODE___GET_POST_DELETE_EVENT: return UsersequencePackage.SECTION___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.NODE___PRE_DELETE: return UsersequencePackage.SECTION___PRE_DELETE;
				case GraphmodelPackage.NODE___CAN_MOVE_TO__MODELELEMENTCONTAINER: return UsersequencePackage.SECTION___CAN_MOVE_TO__MODELELEMENTCONTAINER;
				case GraphmodelPackage.NODE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT: return UsersequencePackage.SECTION___MOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___CAN_CLONE__MODELELEMENTCONTAINER: return UsersequencePackage.SECTION___CAN_CLONE__MODELELEMENTCONTAINER;
				case GraphmodelPackage.NODE___CLONE__MODELELEMENTCONTAINER: return UsersequencePackage.SECTION___CLONE__MODELELEMENTCONTAINER;
				case GraphmodelPackage.NODE___GET_X: return UsersequencePackage.SECTION___GET_X;
				case GraphmodelPackage.NODE___GET_Y: return UsersequencePackage.SECTION___GET_Y;
				case GraphmodelPackage.NODE___GET_WIDTH: return UsersequencePackage.SECTION___GET_WIDTH;
				case GraphmodelPackage.NODE___GET_HEIGHT: return UsersequencePackage.SECTION___GET_HEIGHT;
				case GraphmodelPackage.NODE___COPY__MODELELEMENTCONTAINER: return UsersequencePackage.SECTION___COPY__MODELELEMENTCONTAINER;
				case GraphmodelPackage.NODE___SET_X__INT: return UsersequencePackage.SECTION___SET_X__INT;
				case GraphmodelPackage.NODE___SET_Y__INT: return UsersequencePackage.SECTION___SET_Y__INT;
				case GraphmodelPackage.NODE___SET_WIDTH__INT: return UsersequencePackage.SECTION___SET_WIDTH__INT;
				case GraphmodelPackage.NODE___SET_HEIGHT__INT: return UsersequencePackage.SECTION___SET_HEIGHT__INT;
				case GraphmodelPackage.NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return UsersequencePackage.SECTION___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return UsersequencePackage.SECTION___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___GET_LAYER: return UsersequencePackage.SECTION___GET_LAYER;
				case GraphmodelPackage.NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return UsersequencePackage.SECTION___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___GET_INCOMING: return UsersequencePackage.SECTION___GET_INCOMING;
				case GraphmodelPackage.NODE___GET_OUTGOING: return UsersequencePackage.SECTION___GET_OUTGOING;
				case GraphmodelPackage.NODE___GET_UNTYPED_INCOMING: return UsersequencePackage.SECTION___GET_UNTYPED_INCOMING;
				case GraphmodelPackage.NODE___GET_UNTYPED_OUTGOING: return UsersequencePackage.SECTION___GET_UNTYPED_OUTGOING;
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
			case UsersequencePackage.SECTION___IS_HIGHLIGHTED:
				return isHighlighted();
			case UsersequencePackage.SECTION___SET_HIGHLIGHTED__BOOLEAN:
				setHighlighted((Boolean)arguments.get(0));
				return null;
			case UsersequencePackage.SECTION___GET_TITLE:
				return getTitle();
			case UsersequencePackage.SECTION___SET_TITLE__STRING:
				setTitle((String)arguments.get(0));
				return null;
			case UsersequencePackage.SECTION___GET_INTERNAL_SECTION:
				return getInternalSection();
			case UsersequencePackage.SECTION___IS_EXACTLY_SECTION:
				return isExactlySection();
			case UsersequencePackage.SECTION___PRE_DELETE:
				preDelete();
				return null;
			case UsersequencePackage.SECTION___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case UsersequencePackage.SECTION___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case UsersequencePackage.SECTION___PRE_SAVE:
				preSave();
				return null;
			case UsersequencePackage.SECTION___POST_SAVE:
				postSave();
				return null;
			case UsersequencePackage.SECTION___GET_ROOT_ELEMENT:
				return getRootElement();
			case UsersequencePackage.SECTION___GET_NODES:
				return getNodes();
			case UsersequencePackage.SECTION___GET_OUTGOING:
				return getOutgoing();
			case UsersequencePackage.SECTION___GET_SUCCESSORS:
				return getSuccessors();
			case UsersequencePackage.SECTION___GET_INCOMING:
				return getIncoming();
			case UsersequencePackage.SECTION___GET_PREDECESSORS:
				return getPredecessors();
			case UsersequencePackage.SECTION___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT:
				s_moveTo((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case UsersequencePackage.SECTION___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT:
				preMove((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case UsersequencePackage.SECTION___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT:
				postMove((ModelElementContainer)arguments.get(0), (ModelElementContainer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
				return null;
			case UsersequencePackage.SECTION___PRE_RESIZE__INT_INT_INT_INT_DIRECTION:
				preResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case UsersequencePackage.SECTION___POST_RESIZE__INT_INT_INT_INT_DIRECTION:
				postResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case UsersequencePackage.SECTION___GET_OUTGOING_LABELED_TRANSITIONS:
				return getOutgoingLabeledTransitions();
			case UsersequencePackage.SECTION___GET_OUTGOING_TRANSITIONS:
				return getOutgoingTransitions();
			case UsersequencePackage.SECTION___GET_INCOMING_ANCHORS:
				return getIncomingAnchors();
			case UsersequencePackage.SECTION___GET_INCOMING_LABELED_TRANSITIONS:
				return getIncomingLabeledTransitions();
			case UsersequencePackage.SECTION___GET_INCOMING_TRANSITIONS:
				return getIncomingTransitions();
			case UsersequencePackage.SECTION___GET_START_PREDECESSORS:
				return getStartPredecessors();
			case UsersequencePackage.SECTION___GET_SUB_SEQUENCE_PREDECESSORS:
				return getSubSequencePredecessors();
			case UsersequencePackage.SECTION___GET_SCREENSHOT_PREDECESSORS:
				return getScreenshotPredecessors();
			case UsersequencePackage.SECTION___GET_SECTION_NODE_PREDECESSORS:
				return getSectionNodePredecessors();
			case UsersequencePackage.SECTION___GET_NAVIGATION_PREDECESSORS:
				return getNavigationPredecessors();
			case UsersequencePackage.SECTION___GET_WEB_ELEMENT_PREDECESSORS:
				return getWebElementPredecessors();
			case UsersequencePackage.SECTION___GET_DIV_PREDECESSORS:
				return getDivPredecessors();
			case UsersequencePackage.SECTION___GET_HPREDECESSORS:
				return getHPredecessors();
			case UsersequencePackage.SECTION___GET_PPREDECESSORS:
				return getPPredecessors();
			case UsersequencePackage.SECTION___GET_SPAN_PREDECESSORS:
				return getSpanPredecessors();
			case UsersequencePackage.SECTION___GET_LABEL_PREDECESSORS:
				return getLabelPredecessors();
			case UsersequencePackage.SECTION___GET_FORM_PREDECESSORS:
				return getFormPredecessors();
			case UsersequencePackage.SECTION___GET_INPUT_PREDECESSORS:
				return getInputPredecessors();
			case UsersequencePackage.SECTION___GET_TEXTAREA_PREDECESSORS:
				return getTextareaPredecessors();
			case UsersequencePackage.SECTION___GET_BUTTON_PREDECESSORS:
				return getButtonPredecessors();
			case UsersequencePackage.SECTION___GET_SELECT_BOX_PREDECESSORS:
				return getSelectBoxPredecessors();
			case UsersequencePackage.SECTION___GET_SELECT_BOX_OPTION_PREDECESSORS:
				return getSelectBoxOptionPredecessors();
			case UsersequencePackage.SECTION___GET_TABLE_PREDECESSORS:
				return getTablePredecessors();
			case UsersequencePackage.SECTION___GET_TABLE_HEAD_PREDECESSORS:
				return getTableHeadPredecessors();
			case UsersequencePackage.SECTION___GET_TH_PREDECESSORS:
				return getThPredecessors();
			case UsersequencePackage.SECTION___GET_TABLE_ROW_PREDECESSORS:
				return getTableRowPredecessors();
			case UsersequencePackage.SECTION___GET_TABLE_BODY_PREDECESSORS:
				return getTableBodyPredecessors();
			case UsersequencePackage.SECTION___GET_TABLE_DATA_PREDECESSORS:
				return getTableDataPredecessors();
			case UsersequencePackage.SECTION___GET_SECTION_PREDECESSORS:
				return getSectionPredecessors();
			case UsersequencePackage.SECTION___GET_COMMENT_PREDECESSORS:
				return getCommentPredecessors();
			case UsersequencePackage.SECTION___GET_STOP_SUCCESSORS:
				return getStopSuccessors();
			case UsersequencePackage.SECTION___GET_SUB_SEQUENCE_SUCCESSORS:
				return getSubSequenceSuccessors();
			case UsersequencePackage.SECTION___GET_SCREENSHOT_SUCCESSORS:
				return getScreenshotSuccessors();
			case UsersequencePackage.SECTION___GET_SECTION_NODE_SUCCESSORS:
				return getSectionNodeSuccessors();
			case UsersequencePackage.SECTION___GET_NAVIGATION_SUCCESSORS:
				return getNavigationSuccessors();
			case UsersequencePackage.SECTION___GET_WEB_ELEMENT_SUCCESSORS:
				return getWebElementSuccessors();
			case UsersequencePackage.SECTION___GET_DIV_SUCCESSORS:
				return getDivSuccessors();
			case UsersequencePackage.SECTION___GET_HSUCCESSORS:
				return getHSuccessors();
			case UsersequencePackage.SECTION___GET_PSUCCESSORS:
				return getPSuccessors();
			case UsersequencePackage.SECTION___GET_SPAN_SUCCESSORS:
				return getSpanSuccessors();
			case UsersequencePackage.SECTION___GET_LABEL_SUCCESSORS:
				return getLabelSuccessors();
			case UsersequencePackage.SECTION___GET_FORM_SUCCESSORS:
				return getFormSuccessors();
			case UsersequencePackage.SECTION___GET_INPUT_SUCCESSORS:
				return getInputSuccessors();
			case UsersequencePackage.SECTION___GET_TEXTAREA_SUCCESSORS:
				return getTextareaSuccessors();
			case UsersequencePackage.SECTION___GET_BUTTON_SUCCESSORS:
				return getButtonSuccessors();
			case UsersequencePackage.SECTION___GET_SELECT_BOX_SUCCESSORS:
				return getSelectBoxSuccessors();
			case UsersequencePackage.SECTION___GET_SELECT_BOX_OPTION_SUCCESSORS:
				return getSelectBoxOptionSuccessors();
			case UsersequencePackage.SECTION___GET_TABLE_SUCCESSORS:
				return getTableSuccessors();
			case UsersequencePackage.SECTION___GET_TABLE_HEAD_SUCCESSORS:
				return getTableHeadSuccessors();
			case UsersequencePackage.SECTION___GET_TH_SUCCESSORS:
				return getThSuccessors();
			case UsersequencePackage.SECTION___GET_TABLE_ROW_SUCCESSORS:
				return getTableRowSuccessors();
			case UsersequencePackage.SECTION___GET_TABLE_BODY_SUCCESSORS:
				return getTableBodySuccessors();
			case UsersequencePackage.SECTION___GET_TABLE_DATA_SUCCESSORS:
				return getTableDataSuccessors();
			case UsersequencePackage.SECTION___GET_SECTION_SUCCESSORS:
				return getSectionSuccessors();
			case UsersequencePackage.SECTION___CAN_NEW_LABELED_TRANSITION__P:
				return canNewLabeledTransition((P)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__P:
				return newLabeledTransition((P)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__P_STRING:
				return newLabeledTransition((P)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_LABELED_TRANSITION__TEXTAREA:
				return canNewLabeledTransition((Textarea)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__TEXTAREA:
				return newLabeledTransition((Textarea)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__TEXTAREA_STRING:
				return newLabeledTransition((Textarea)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_LABELED_TRANSITION__SPAN:
				return canNewLabeledTransition((Span)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__SPAN:
				return newLabeledTransition((Span)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__SPAN_STRING:
				return newLabeledTransition((Span)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_LABELED_TRANSITION__TABLEBODY:
				return canNewLabeledTransition((TableBody)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__TABLEBODY:
				return newLabeledTransition((TableBody)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__TABLEBODY_STRING:
				return newLabeledTransition((TableBody)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_LABELED_TRANSITION__SCREENSHOT:
				return canNewLabeledTransition((Screenshot)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__SCREENSHOT:
				return newLabeledTransition((Screenshot)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__SCREENSHOT_STRING:
				return newLabeledTransition((Screenshot)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_LABELED_TRANSITION__FORM:
				return canNewLabeledTransition((Form)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__FORM:
				return newLabeledTransition((Form)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__FORM_STRING:
				return newLabeledTransition((Form)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_LABELED_TRANSITION__NAVIGATION:
				return canNewLabeledTransition((Navigation)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__NAVIGATION:
				return newLabeledTransition((Navigation)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__NAVIGATION_STRING:
				return newLabeledTransition((Navigation)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_LABELED_TRANSITION__SUBSEQUENCE:
				return canNewLabeledTransition((SubSequence)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__SUBSEQUENCE:
				return newLabeledTransition((SubSequence)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__SUBSEQUENCE_STRING:
				return newLabeledTransition((SubSequence)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_LABELED_TRANSITION__STOP:
				return canNewLabeledTransition((Stop)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__STOP:
				return newLabeledTransition((Stop)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__STOP_STRING:
				return newLabeledTransition((Stop)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_LABELED_TRANSITION__TABLE:
				return canNewLabeledTransition((Table)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__TABLE:
				return newLabeledTransition((Table)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__TABLE_STRING:
				return newLabeledTransition((Table)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_LABELED_TRANSITION__LABEL:
				return canNewLabeledTransition((Label)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__LABEL:
				return newLabeledTransition((Label)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__LABEL_STRING:
				return newLabeledTransition((Label)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_LABELED_TRANSITION__TABLEROW:
				return canNewLabeledTransition((TableRow)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__TABLEROW:
				return newLabeledTransition((TableRow)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__TABLEROW_STRING:
				return newLabeledTransition((TableRow)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_LABELED_TRANSITION__SELECTBOX:
				return canNewLabeledTransition((SelectBox)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__SELECTBOX:
				return newLabeledTransition((SelectBox)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__SELECTBOX_STRING:
				return newLabeledTransition((SelectBox)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_LABELED_TRANSITION__TH:
				return canNewLabeledTransition((Th)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__TH:
				return newLabeledTransition((Th)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__TH_STRING:
				return newLabeledTransition((Th)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_LABELED_TRANSITION__SELECTBOXOPTION:
				return canNewLabeledTransition((SelectBoxOption)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__SELECTBOXOPTION:
				return newLabeledTransition((SelectBoxOption)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__SELECTBOXOPTION_STRING:
				return newLabeledTransition((SelectBoxOption)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_LABELED_TRANSITION__INPUT:
				return canNewLabeledTransition((Input)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__INPUT:
				return newLabeledTransition((Input)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__INPUT_STRING:
				return newLabeledTransition((Input)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_LABELED_TRANSITION__TABLEDATA:
				return canNewLabeledTransition((TableData)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__TABLEDATA:
				return newLabeledTransition((TableData)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__TABLEDATA_STRING:
				return newLabeledTransition((TableData)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_LABELED_TRANSITION__WEBELEMENT:
				return canNewLabeledTransition((WebElement)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__WEBELEMENT:
				return newLabeledTransition((WebElement)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__WEBELEMENT_STRING:
				return newLabeledTransition((WebElement)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_LABELED_TRANSITION__DIV:
				return canNewLabeledTransition((Div)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__DIV:
				return newLabeledTransition((Div)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__DIV_STRING:
				return newLabeledTransition((Div)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_LABELED_TRANSITION__BUTTON:
				return canNewLabeledTransition((Button)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__BUTTON:
				return newLabeledTransition((Button)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__BUTTON_STRING:
				return newLabeledTransition((Button)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_LABELED_TRANSITION__SECTIONNODE:
				return canNewLabeledTransition((SectionNode)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__SECTIONNODE:
				return newLabeledTransition((SectionNode)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__SECTIONNODE_STRING:
				return newLabeledTransition((SectionNode)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_LABELED_TRANSITION__H:
				return canNewLabeledTransition((H)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__H:
				return newLabeledTransition((H)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__H_STRING:
				return newLabeledTransition((H)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_LABELED_TRANSITION__TABLEHEAD:
				return canNewLabeledTransition((TableHead)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__TABLEHEAD:
				return newLabeledTransition((TableHead)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__TABLEHEAD_STRING:
				return newLabeledTransition((TableHead)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_LABELED_TRANSITION__SECTION:
				return canNewLabeledTransition((Section)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__SECTION:
				return newLabeledTransition((Section)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_LABELED_TRANSITION__SECTION_STRING:
				return newLabeledTransition((Section)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_TRANSITION__P:
				return canNewTransition((P)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__P:
				return newTransition((P)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__P_STRING:
				return newTransition((P)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_TRANSITION__TEXTAREA:
				return canNewTransition((Textarea)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__TEXTAREA:
				return newTransition((Textarea)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__TEXTAREA_STRING:
				return newTransition((Textarea)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_TRANSITION__SPAN:
				return canNewTransition((Span)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__SPAN:
				return newTransition((Span)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__SPAN_STRING:
				return newTransition((Span)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_TRANSITION__TABLEBODY:
				return canNewTransition((TableBody)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__TABLEBODY:
				return newTransition((TableBody)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__TABLEBODY_STRING:
				return newTransition((TableBody)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_TRANSITION__SCREENSHOT:
				return canNewTransition((Screenshot)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__SCREENSHOT:
				return newTransition((Screenshot)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__SCREENSHOT_STRING:
				return newTransition((Screenshot)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_TRANSITION__FORM:
				return canNewTransition((Form)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__FORM:
				return newTransition((Form)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__FORM_STRING:
				return newTransition((Form)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_TRANSITION__NAVIGATION:
				return canNewTransition((Navigation)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__NAVIGATION:
				return newTransition((Navigation)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__NAVIGATION_STRING:
				return newTransition((Navigation)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_TRANSITION__SUBSEQUENCE:
				return canNewTransition((SubSequence)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__SUBSEQUENCE:
				return newTransition((SubSequence)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__SUBSEQUENCE_STRING:
				return newTransition((SubSequence)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_TRANSITION__STOP:
				return canNewTransition((Stop)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__STOP:
				return newTransition((Stop)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__STOP_STRING:
				return newTransition((Stop)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_TRANSITION__TABLE:
				return canNewTransition((Table)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__TABLE:
				return newTransition((Table)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__TABLE_STRING:
				return newTransition((Table)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_TRANSITION__LABEL:
				return canNewTransition((Label)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__LABEL:
				return newTransition((Label)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__LABEL_STRING:
				return newTransition((Label)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_TRANSITION__TABLEROW:
				return canNewTransition((TableRow)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__TABLEROW:
				return newTransition((TableRow)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__TABLEROW_STRING:
				return newTransition((TableRow)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_TRANSITION__SELECTBOX:
				return canNewTransition((SelectBox)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__SELECTBOX:
				return newTransition((SelectBox)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__SELECTBOX_STRING:
				return newTransition((SelectBox)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_TRANSITION__TH:
				return canNewTransition((Th)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__TH:
				return newTransition((Th)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__TH_STRING:
				return newTransition((Th)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_TRANSITION__SELECTBOXOPTION:
				return canNewTransition((SelectBoxOption)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__SELECTBOXOPTION:
				return newTransition((SelectBoxOption)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__SELECTBOXOPTION_STRING:
				return newTransition((SelectBoxOption)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_TRANSITION__INPUT:
				return canNewTransition((Input)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__INPUT:
				return newTransition((Input)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__INPUT_STRING:
				return newTransition((Input)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_TRANSITION__TABLEDATA:
				return canNewTransition((TableData)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__TABLEDATA:
				return newTransition((TableData)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__TABLEDATA_STRING:
				return newTransition((TableData)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_TRANSITION__WEBELEMENT:
				return canNewTransition((WebElement)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__WEBELEMENT:
				return newTransition((WebElement)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__WEBELEMENT_STRING:
				return newTransition((WebElement)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_TRANSITION__DIV:
				return canNewTransition((Div)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__DIV:
				return newTransition((Div)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__DIV_STRING:
				return newTransition((Div)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_TRANSITION__BUTTON:
				return canNewTransition((Button)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__BUTTON:
				return newTransition((Button)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__BUTTON_STRING:
				return newTransition((Button)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_TRANSITION__SECTIONNODE:
				return canNewTransition((SectionNode)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__SECTIONNODE:
				return newTransition((SectionNode)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__SECTIONNODE_STRING:
				return newTransition((SectionNode)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_TRANSITION__H:
				return canNewTransition((H)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__H:
				return newTransition((H)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__H_STRING:
				return newTransition((H)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_TRANSITION__TABLEHEAD:
				return canNewTransition((TableHead)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__TABLEHEAD:
				return newTransition((TableHead)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__TABLEHEAD_STRING:
				return newTransition((TableHead)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_NEW_TRANSITION__SECTION:
				return canNewTransition((Section)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__SECTION:
				return newTransition((Section)arguments.get(0));
			case UsersequencePackage.SECTION___NEW_TRANSITION__SECTION_STRING:
				return newTransition((Section)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.SECTION___CAN_MOVE_TO__USERSEQUENCEGRAPHMODEL_INT_INT:
				return canMoveTo((UserSequenceGraphModel)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case UsersequencePackage.SECTION___MOVE_TO__USERSEQUENCEGRAPHMODEL_INT_INT:
				moveTo((UserSequenceGraphModel)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case UsersequencePackage.SECTION___SMOVE_TO__USERSEQUENCEGRAPHMODEL_INT_INT:
				s_moveTo((UserSequenceGraphModel)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case UsersequencePackage.SECTION___GET_CONTAINER:
				return getContainer();
			case UsersequencePackage.SECTION___GET_SECTION_VIEW:
				return getSectionView();
			case UsersequencePackage.SECTION___GET_INTERNAL_CONTAINER_ELEMENT:
				return getInternalContainerElement();
			case UsersequencePackage.SECTION___DELETE:
				delete();
				return null;
			case UsersequencePackage.SECTION___GET_SUCCESSORS__CLASS:
				return getSuccessors((Class)arguments.get(0));
			case UsersequencePackage.SECTION___GET_PREDECESSORS__CLASS:
				return getPredecessors((Class)arguments.get(0));
			case UsersequencePackage.SECTION___GET_INCOMING__CLASS:
				return getIncoming((Class)arguments.get(0));
			case UsersequencePackage.SECTION___GET_OUTGOING__CLASS:
				return getOutgoing((Class)arguments.get(0));
			case UsersequencePackage.SECTION___CAN_CONNECT__EDGE_NODE:
				return canConnect((Edge)arguments.get(0), (Node)arguments.get(1));
			case UsersequencePackage.SECTION___GET_OUTGOING_CONSTRAINTS:
				return getOutgoingConstraints();
			case UsersequencePackage.SECTION___GET_INCOMING_CONSTRAINTS:
				return getIncomingConstraints();
			case UsersequencePackage.SECTION___CAN_START__CLASS:
				return canStart((Class<? extends Edge>)arguments.get(0));
			case UsersequencePackage.SECTION___CAN_END__CLASS:
				return canEnd((Class<? extends Edge>)arguments.get(0));
			case UsersequencePackage.SECTION___MOVE__INT_INT:
				move((Integer)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case UsersequencePackage.SECTION___RESIZE__INT_INT:
				resize((Integer)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case UsersequencePackage.SECTION___RESIZE__INT_INT_INT_INT:
				resize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
				return null;
			case UsersequencePackage.SECTION___CAN_MOVE_TO__MODELELEMENTCONTAINER:
				return canMoveTo((ModelElementContainer)arguments.get(0));
			case UsersequencePackage.SECTION___MOVE_TO__MODELELEMENTCONTAINER_INT_INT:
				moveTo((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case UsersequencePackage.SECTION___CAN_CLONE__MODELELEMENTCONTAINER:
				return canClone((ModelElementContainer)arguments.get(0));
			case UsersequencePackage.SECTION___CLONE__MODELELEMENTCONTAINER:
				return clone((ModelElementContainer)arguments.get(0));
			case UsersequencePackage.SECTION___GET_X:
				return getX();
			case UsersequencePackage.SECTION___GET_Y:
				return getY();
			case UsersequencePackage.SECTION___GET_WIDTH:
				return getWidth();
			case UsersequencePackage.SECTION___GET_HEIGHT:
				return getHeight();
			case UsersequencePackage.SECTION___COPY__MODELELEMENTCONTAINER:
				return copy((ModelElementContainer)arguments.get(0));
			case UsersequencePackage.SECTION___SET_X__INT:
				setX((Integer)arguments.get(0));
				return null;
			case UsersequencePackage.SECTION___SET_Y__INT:
				setY((Integer)arguments.get(0));
				return null;
			case UsersequencePackage.SECTION___SET_WIDTH__INT:
				setWidth((Integer)arguments.get(0));
				return null;
			case UsersequencePackage.SECTION___SET_HEIGHT__INT:
				setHeight((Integer)arguments.get(0));
				return null;
			case UsersequencePackage.SECTION___GET_LAYER:
				return getLayer();
			case UsersequencePackage.SECTION___GET_UNTYPED_INCOMING:
				return getUntypedIncoming();
			case UsersequencePackage.SECTION___GET_UNTYPED_OUTGOING:
				return getUntypedOutgoing();
			case UsersequencePackage.SECTION___HIGHLIGHT:
				highlight();
				return null;
			case UsersequencePackage.SECTION___UPDATE:
				update();
				return null;
			case UsersequencePackage.SECTION___UPDATE_GRAPH_MODEL:
				updateGraphModel();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SectionImpl
