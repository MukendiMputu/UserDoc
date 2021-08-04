/**
 */
package info.scce.cinco.product.usersequence.usersequence.impl;

import graphmodel.Direction;
import graphmodel.Edge;
import graphmodel.GraphModel;
import graphmodel.GraphmodelPackage;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.ModelElementContainer;
import graphmodel.Node;

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

import info.scce.cinco.product.usersequence.usersequence.internal.InternalP;

import info.scce.cinco.product.usersequence.usersequence.views.PView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>P</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PImpl extends WebElementImpl implements P {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsersequencePackage.eINSTANCE.getP();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHighlighted() {
		return getInternalP().isHighlighted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHighlighted(final boolean _arg) {
		getInternalP().getElement().transact("Set Highlighted", () -> {
			getInternalP().setHighlighted(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSelector() {
		return getInternalP().getSelector();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelector(final String _arg) {
		getInternalP().getElement().transact("Set Selector", () -> {
			getInternalP().setSelector(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return getInternalP().getValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(final String _arg) {
		getInternalP().getElement().transact("Set Value", () -> {
			getInternalP().setValue(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContent() {
		return getInternalP().getContent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(final String _arg) {
		getInternalP().getElement().transact("Set Content", () -> {
			getInternalP().setContent(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalP getInternalP() {
		return (info.scce.cinco.product.usersequence.usersequence.internal.InternalP) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyP() {
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
	public EList<? extends Transition> getOutgoing() {
		EList<graphmodel.internal.InternalEdge> out = ((graphmodel.internal.InternalNode)getInternalElement()).getOutgoing();
		return org.eclipse.emf.common.util.ECollections.unmodifiableEList(out
			.stream().map(me -> (info.scce.cinco.product.usersequence.usersequence.Transition)me.getElement()).
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
		return userSequenceGraphModel.canContain(info.scce.cinco.product.usersequence.usersequence.P.class);
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
	public PView getPView() {
		PView pView = info.scce.cinco.product.usersequence.usersequence.views.ViewsFactory.eINSTANCE.createPView();
		pView.setInternalP((info.scce.cinco.product.usersequence.usersequence.internal.InternalP)getInternalElement());
		return pView;
		
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return UsersequencePackage.P___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return UsersequencePackage.P___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_CONTAINER: return UsersequencePackage.P___GET_CONTAINER;
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return UsersequencePackage.P___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___PRE_SAVE: return UsersequencePackage.P___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT___POST_SAVE: return UsersequencePackage.P___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Node.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.NODE___GET_SUCCESSORS: return UsersequencePackage.P___GET_SUCCESSORS;
				case GraphmodelPackage.NODE___GET_PREDECESSORS: return UsersequencePackage.P___GET_PREDECESSORS;
				case GraphmodelPackage.NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return UsersequencePackage.P___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return UsersequencePackage.P___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case GraphmodelPackage.NODE___GET_POST_DELETE_FUNCTION: return UsersequencePackage.P___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.NODE___GET_POST_DELETE_EVENT: return UsersequencePackage.P___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.NODE___PRE_DELETE: return UsersequencePackage.P___PRE_DELETE;
				case GraphmodelPackage.NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return UsersequencePackage.P___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return UsersequencePackage.P___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return UsersequencePackage.P___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___GET_INCOMING: return UsersequencePackage.P___GET_INCOMING;
				case GraphmodelPackage.NODE___GET_OUTGOING: return UsersequencePackage.P___GET_OUTGOING;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == WebElement.class) {
			switch (baseOperationID) {
				case UsersequencePackage.WEB_ELEMENT___PRE_DELETE: return UsersequencePackage.P___PRE_DELETE;
				case UsersequencePackage.WEB_ELEMENT___GET_POST_DELETE_FUNCTION: return UsersequencePackage.P___GET_POST_DELETE_FUNCTION;
				case UsersequencePackage.WEB_ELEMENT___GET_POST_DELETE_EVENT: return UsersequencePackage.P___GET_POST_DELETE_EVENT;
				case UsersequencePackage.WEB_ELEMENT___PRE_SAVE: return UsersequencePackage.P___PRE_SAVE;
				case UsersequencePackage.WEB_ELEMENT___POST_SAVE: return UsersequencePackage.P___POST_SAVE;
				case UsersequencePackage.WEB_ELEMENT___GET_ROOT_ELEMENT: return UsersequencePackage.P___GET_ROOT_ELEMENT;
				case UsersequencePackage.WEB_ELEMENT___GET_OUTGOING: return UsersequencePackage.P___GET_OUTGOING;
				case UsersequencePackage.WEB_ELEMENT___GET_SUCCESSORS: return UsersequencePackage.P___GET_SUCCESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_INCOMING: return UsersequencePackage.P___GET_INCOMING;
				case UsersequencePackage.WEB_ELEMENT___GET_PREDECESSORS: return UsersequencePackage.P___GET_PREDECESSORS;
				case UsersequencePackage.WEB_ELEMENT___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return UsersequencePackage.P___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case UsersequencePackage.WEB_ELEMENT___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return UsersequencePackage.P___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case UsersequencePackage.WEB_ELEMENT___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return UsersequencePackage.P___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case UsersequencePackage.WEB_ELEMENT___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return UsersequencePackage.P___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case UsersequencePackage.WEB_ELEMENT___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return UsersequencePackage.P___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case UsersequencePackage.WEB_ELEMENT___GET_OUTGOING_TRANSITIONS: return UsersequencePackage.P___GET_OUTGOING_TRANSITIONS;
				case UsersequencePackage.WEB_ELEMENT___GET_INCOMING_ANCHORS: return UsersequencePackage.P___GET_INCOMING_ANCHORS;
				case UsersequencePackage.WEB_ELEMENT___GET_INCOMING_LABELED_TRANSITIONS: return UsersequencePackage.P___GET_INCOMING_LABELED_TRANSITIONS;
				case UsersequencePackage.WEB_ELEMENT___GET_INCOMING_TRANSITIONS: return UsersequencePackage.P___GET_INCOMING_TRANSITIONS;
				case UsersequencePackage.WEB_ELEMENT___GET_START_PREDECESSORS: return UsersequencePackage.P___GET_START_PREDECESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_SUB_SEQUENCE_PREDECESSORS: return UsersequencePackage.P___GET_SUB_SEQUENCE_PREDECESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_SCREENSHOT_PREDECESSORS: return UsersequencePackage.P___GET_SCREENSHOT_PREDECESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_SECTION_NODE_PREDECESSORS: return UsersequencePackage.P___GET_SECTION_NODE_PREDECESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_NAVIGATION_PREDECESSORS: return UsersequencePackage.P___GET_NAVIGATION_PREDECESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_WEB_ELEMENT_PREDECESSORS: return UsersequencePackage.P___GET_WEB_ELEMENT_PREDECESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_DIV_PREDECESSORS: return UsersequencePackage.P___GET_DIV_PREDECESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_HPREDECESSORS: return UsersequencePackage.P___GET_HPREDECESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_PPREDECESSORS: return UsersequencePackage.P___GET_PPREDECESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_SPAN_PREDECESSORS: return UsersequencePackage.P___GET_SPAN_PREDECESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_LABEL_PREDECESSORS: return UsersequencePackage.P___GET_LABEL_PREDECESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_FORM_PREDECESSORS: return UsersequencePackage.P___GET_FORM_PREDECESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_INPUT_PREDECESSORS: return UsersequencePackage.P___GET_INPUT_PREDECESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_TEXTAREA_PREDECESSORS: return UsersequencePackage.P___GET_TEXTAREA_PREDECESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_BUTTON_PREDECESSORS: return UsersequencePackage.P___GET_BUTTON_PREDECESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_SELECT_BOX_PREDECESSORS: return UsersequencePackage.P___GET_SELECT_BOX_PREDECESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_SELECT_BOX_OPTION_PREDECESSORS: return UsersequencePackage.P___GET_SELECT_BOX_OPTION_PREDECESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_TABLE_PREDECESSORS: return UsersequencePackage.P___GET_TABLE_PREDECESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_TABLE_HEAD_PREDECESSORS: return UsersequencePackage.P___GET_TABLE_HEAD_PREDECESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_TH_PREDECESSORS: return UsersequencePackage.P___GET_TH_PREDECESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_TABLE_ROW_PREDECESSORS: return UsersequencePackage.P___GET_TABLE_ROW_PREDECESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_TABLE_BODY_PREDECESSORS: return UsersequencePackage.P___GET_TABLE_BODY_PREDECESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_TABLE_DATA_PREDECESSORS: return UsersequencePackage.P___GET_TABLE_DATA_PREDECESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_SECTION_PREDECESSORS: return UsersequencePackage.P___GET_SECTION_PREDECESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_COMMENT_PREDECESSORS: return UsersequencePackage.P___GET_COMMENT_PREDECESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_STOP_SUCCESSORS: return UsersequencePackage.P___GET_STOP_SUCCESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_SUB_SEQUENCE_SUCCESSORS: return UsersequencePackage.P___GET_SUB_SEQUENCE_SUCCESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_SCREENSHOT_SUCCESSORS: return UsersequencePackage.P___GET_SCREENSHOT_SUCCESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_SECTION_NODE_SUCCESSORS: return UsersequencePackage.P___GET_SECTION_NODE_SUCCESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_NAVIGATION_SUCCESSORS: return UsersequencePackage.P___GET_NAVIGATION_SUCCESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_WEB_ELEMENT_SUCCESSORS: return UsersequencePackage.P___GET_WEB_ELEMENT_SUCCESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_DIV_SUCCESSORS: return UsersequencePackage.P___GET_DIV_SUCCESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_HSUCCESSORS: return UsersequencePackage.P___GET_HSUCCESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_PSUCCESSORS: return UsersequencePackage.P___GET_PSUCCESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_SPAN_SUCCESSORS: return UsersequencePackage.P___GET_SPAN_SUCCESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_LABEL_SUCCESSORS: return UsersequencePackage.P___GET_LABEL_SUCCESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_FORM_SUCCESSORS: return UsersequencePackage.P___GET_FORM_SUCCESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_INPUT_SUCCESSORS: return UsersequencePackage.P___GET_INPUT_SUCCESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_TEXTAREA_SUCCESSORS: return UsersequencePackage.P___GET_TEXTAREA_SUCCESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_BUTTON_SUCCESSORS: return UsersequencePackage.P___GET_BUTTON_SUCCESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_SELECT_BOX_SUCCESSORS: return UsersequencePackage.P___GET_SELECT_BOX_SUCCESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_SELECT_BOX_OPTION_SUCCESSORS: return UsersequencePackage.P___GET_SELECT_BOX_OPTION_SUCCESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_TABLE_SUCCESSORS: return UsersequencePackage.P___GET_TABLE_SUCCESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_TABLE_HEAD_SUCCESSORS: return UsersequencePackage.P___GET_TABLE_HEAD_SUCCESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_TH_SUCCESSORS: return UsersequencePackage.P___GET_TH_SUCCESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_TABLE_ROW_SUCCESSORS: return UsersequencePackage.P___GET_TABLE_ROW_SUCCESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_TABLE_BODY_SUCCESSORS: return UsersequencePackage.P___GET_TABLE_BODY_SUCCESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_TABLE_DATA_SUCCESSORS: return UsersequencePackage.P___GET_TABLE_DATA_SUCCESSORS;
				case UsersequencePackage.WEB_ELEMENT___GET_SECTION_SUCCESSORS: return UsersequencePackage.P___GET_SECTION_SUCCESSORS;
				case UsersequencePackage.WEB_ELEMENT___CAN_NEW_TRANSITION__P: return UsersequencePackage.P___CAN_NEW_TRANSITION__P;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__P: return UsersequencePackage.P___NEW_TRANSITION__P;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__P_STRING: return UsersequencePackage.P___NEW_TRANSITION__P_STRING;
				case UsersequencePackage.WEB_ELEMENT___CAN_NEW_TRANSITION__TEXTAREA: return UsersequencePackage.P___CAN_NEW_TRANSITION__TEXTAREA;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__TEXTAREA: return UsersequencePackage.P___NEW_TRANSITION__TEXTAREA;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__TEXTAREA_STRING: return UsersequencePackage.P___NEW_TRANSITION__TEXTAREA_STRING;
				case UsersequencePackage.WEB_ELEMENT___CAN_NEW_TRANSITION__SPAN: return UsersequencePackage.P___CAN_NEW_TRANSITION__SPAN;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__SPAN: return UsersequencePackage.P___NEW_TRANSITION__SPAN;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__SPAN_STRING: return UsersequencePackage.P___NEW_TRANSITION__SPAN_STRING;
				case UsersequencePackage.WEB_ELEMENT___CAN_NEW_TRANSITION__TABLEBODY: return UsersequencePackage.P___CAN_NEW_TRANSITION__TABLEBODY;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__TABLEBODY: return UsersequencePackage.P___NEW_TRANSITION__TABLEBODY;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__TABLEBODY_STRING: return UsersequencePackage.P___NEW_TRANSITION__TABLEBODY_STRING;
				case UsersequencePackage.WEB_ELEMENT___CAN_NEW_TRANSITION__SCREENSHOT: return UsersequencePackage.P___CAN_NEW_TRANSITION__SCREENSHOT;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__SCREENSHOT: return UsersequencePackage.P___NEW_TRANSITION__SCREENSHOT;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__SCREENSHOT_STRING: return UsersequencePackage.P___NEW_TRANSITION__SCREENSHOT_STRING;
				case UsersequencePackage.WEB_ELEMENT___CAN_NEW_TRANSITION__FORM: return UsersequencePackage.P___CAN_NEW_TRANSITION__FORM;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__FORM: return UsersequencePackage.P___NEW_TRANSITION__FORM;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__FORM_STRING: return UsersequencePackage.P___NEW_TRANSITION__FORM_STRING;
				case UsersequencePackage.WEB_ELEMENT___CAN_NEW_TRANSITION__NAVIGATION: return UsersequencePackage.P___CAN_NEW_TRANSITION__NAVIGATION;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__NAVIGATION: return UsersequencePackage.P___NEW_TRANSITION__NAVIGATION;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__NAVIGATION_STRING: return UsersequencePackage.P___NEW_TRANSITION__NAVIGATION_STRING;
				case UsersequencePackage.WEB_ELEMENT___CAN_NEW_TRANSITION__SUBSEQUENCE: return UsersequencePackage.P___CAN_NEW_TRANSITION__SUBSEQUENCE;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__SUBSEQUENCE: return UsersequencePackage.P___NEW_TRANSITION__SUBSEQUENCE;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__SUBSEQUENCE_STRING: return UsersequencePackage.P___NEW_TRANSITION__SUBSEQUENCE_STRING;
				case UsersequencePackage.WEB_ELEMENT___CAN_NEW_TRANSITION__STOP: return UsersequencePackage.P___CAN_NEW_TRANSITION__STOP;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__STOP: return UsersequencePackage.P___NEW_TRANSITION__STOP;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__STOP_STRING: return UsersequencePackage.P___NEW_TRANSITION__STOP_STRING;
				case UsersequencePackage.WEB_ELEMENT___CAN_NEW_TRANSITION__TABLE: return UsersequencePackage.P___CAN_NEW_TRANSITION__TABLE;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__TABLE: return UsersequencePackage.P___NEW_TRANSITION__TABLE;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__TABLE_STRING: return UsersequencePackage.P___NEW_TRANSITION__TABLE_STRING;
				case UsersequencePackage.WEB_ELEMENT___CAN_NEW_TRANSITION__LABEL: return UsersequencePackage.P___CAN_NEW_TRANSITION__LABEL;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__LABEL: return UsersequencePackage.P___NEW_TRANSITION__LABEL;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__LABEL_STRING: return UsersequencePackage.P___NEW_TRANSITION__LABEL_STRING;
				case UsersequencePackage.WEB_ELEMENT___CAN_NEW_TRANSITION__TABLEROW: return UsersequencePackage.P___CAN_NEW_TRANSITION__TABLEROW;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__TABLEROW: return UsersequencePackage.P___NEW_TRANSITION__TABLEROW;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__TABLEROW_STRING: return UsersequencePackage.P___NEW_TRANSITION__TABLEROW_STRING;
				case UsersequencePackage.WEB_ELEMENT___CAN_NEW_TRANSITION__SELECTBOX: return UsersequencePackage.P___CAN_NEW_TRANSITION__SELECTBOX;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__SELECTBOX: return UsersequencePackage.P___NEW_TRANSITION__SELECTBOX;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__SELECTBOX_STRING: return UsersequencePackage.P___NEW_TRANSITION__SELECTBOX_STRING;
				case UsersequencePackage.WEB_ELEMENT___CAN_NEW_TRANSITION__TH: return UsersequencePackage.P___CAN_NEW_TRANSITION__TH;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__TH: return UsersequencePackage.P___NEW_TRANSITION__TH;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__TH_STRING: return UsersequencePackage.P___NEW_TRANSITION__TH_STRING;
				case UsersequencePackage.WEB_ELEMENT___CAN_NEW_TRANSITION__SELECTBOXOPTION: return UsersequencePackage.P___CAN_NEW_TRANSITION__SELECTBOXOPTION;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__SELECTBOXOPTION: return UsersequencePackage.P___NEW_TRANSITION__SELECTBOXOPTION;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__SELECTBOXOPTION_STRING: return UsersequencePackage.P___NEW_TRANSITION__SELECTBOXOPTION_STRING;
				case UsersequencePackage.WEB_ELEMENT___CAN_NEW_TRANSITION__INPUT: return UsersequencePackage.P___CAN_NEW_TRANSITION__INPUT;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__INPUT: return UsersequencePackage.P___NEW_TRANSITION__INPUT;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__INPUT_STRING: return UsersequencePackage.P___NEW_TRANSITION__INPUT_STRING;
				case UsersequencePackage.WEB_ELEMENT___CAN_NEW_TRANSITION__TABLEDATA: return UsersequencePackage.P___CAN_NEW_TRANSITION__TABLEDATA;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__TABLEDATA: return UsersequencePackage.P___NEW_TRANSITION__TABLEDATA;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__TABLEDATA_STRING: return UsersequencePackage.P___NEW_TRANSITION__TABLEDATA_STRING;
				case UsersequencePackage.WEB_ELEMENT___CAN_NEW_TRANSITION__WEBELEMENT: return UsersequencePackage.P___CAN_NEW_TRANSITION__WEBELEMENT;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__WEBELEMENT: return UsersequencePackage.P___NEW_TRANSITION__WEBELEMENT;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__WEBELEMENT_STRING: return UsersequencePackage.P___NEW_TRANSITION__WEBELEMENT_STRING;
				case UsersequencePackage.WEB_ELEMENT___CAN_NEW_TRANSITION__DIV: return UsersequencePackage.P___CAN_NEW_TRANSITION__DIV;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__DIV: return UsersequencePackage.P___NEW_TRANSITION__DIV;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__DIV_STRING: return UsersequencePackage.P___NEW_TRANSITION__DIV_STRING;
				case UsersequencePackage.WEB_ELEMENT___CAN_NEW_TRANSITION__BUTTON: return UsersequencePackage.P___CAN_NEW_TRANSITION__BUTTON;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__BUTTON: return UsersequencePackage.P___NEW_TRANSITION__BUTTON;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__BUTTON_STRING: return UsersequencePackage.P___NEW_TRANSITION__BUTTON_STRING;
				case UsersequencePackage.WEB_ELEMENT___CAN_NEW_TRANSITION__SECTIONNODE: return UsersequencePackage.P___CAN_NEW_TRANSITION__SECTIONNODE;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__SECTIONNODE: return UsersequencePackage.P___NEW_TRANSITION__SECTIONNODE;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__SECTIONNODE_STRING: return UsersequencePackage.P___NEW_TRANSITION__SECTIONNODE_STRING;
				case UsersequencePackage.WEB_ELEMENT___CAN_NEW_TRANSITION__H: return UsersequencePackage.P___CAN_NEW_TRANSITION__H;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__H: return UsersequencePackage.P___NEW_TRANSITION__H;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__H_STRING: return UsersequencePackage.P___NEW_TRANSITION__H_STRING;
				case UsersequencePackage.WEB_ELEMENT___CAN_NEW_TRANSITION__TABLEHEAD: return UsersequencePackage.P___CAN_NEW_TRANSITION__TABLEHEAD;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__TABLEHEAD: return UsersequencePackage.P___NEW_TRANSITION__TABLEHEAD;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__TABLEHEAD_STRING: return UsersequencePackage.P___NEW_TRANSITION__TABLEHEAD_STRING;
				case UsersequencePackage.WEB_ELEMENT___CAN_NEW_TRANSITION__SECTION: return UsersequencePackage.P___CAN_NEW_TRANSITION__SECTION;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__SECTION: return UsersequencePackage.P___NEW_TRANSITION__SECTION;
				case UsersequencePackage.WEB_ELEMENT___NEW_TRANSITION__SECTION_STRING: return UsersequencePackage.P___NEW_TRANSITION__SECTION_STRING;
				case UsersequencePackage.WEB_ELEMENT___CAN_MOVE_TO__USERSEQUENCEGRAPHMODEL_INT_INT: return UsersequencePackage.P___CAN_MOVE_TO__USERSEQUENCEGRAPHMODEL_INT_INT;
				case UsersequencePackage.WEB_ELEMENT___MOVE_TO__USERSEQUENCEGRAPHMODEL_INT_INT: return UsersequencePackage.P___MOVE_TO__USERSEQUENCEGRAPHMODEL_INT_INT;
				case UsersequencePackage.WEB_ELEMENT___SMOVE_TO__USERSEQUENCEGRAPHMODEL_INT_INT: return UsersequencePackage.P___SMOVE_TO__USERSEQUENCEGRAPHMODEL_INT_INT;
				case UsersequencePackage.WEB_ELEMENT___GET_CONTAINER: return UsersequencePackage.P___GET_CONTAINER;
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
			case UsersequencePackage.P___IS_HIGHLIGHTED:
				return isHighlighted();
			case UsersequencePackage.P___SET_HIGHLIGHTED__BOOLEAN:
				setHighlighted((Boolean)arguments.get(0));
				return null;
			case UsersequencePackage.P___GET_SELECTOR:
				return getSelector();
			case UsersequencePackage.P___SET_SELECTOR__STRING:
				setSelector((String)arguments.get(0));
				return null;
			case UsersequencePackage.P___GET_VALUE:
				return getValue();
			case UsersequencePackage.P___SET_VALUE__STRING:
				setValue((String)arguments.get(0));
				return null;
			case UsersequencePackage.P___GET_CONTENT:
				return getContent();
			case UsersequencePackage.P___SET_CONTENT__STRING:
				setContent((String)arguments.get(0));
				return null;
			case UsersequencePackage.P___GET_INTERNAL_P:
				return getInternalP();
			case UsersequencePackage.P___IS_EXACTLY_P:
				return isExactlyP();
			case UsersequencePackage.P___PRE_DELETE:
				preDelete();
				return null;
			case UsersequencePackage.P___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case UsersequencePackage.P___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case UsersequencePackage.P___PRE_SAVE:
				preSave();
				return null;
			case UsersequencePackage.P___POST_SAVE:
				postSave();
				return null;
			case UsersequencePackage.P___GET_ROOT_ELEMENT:
				return getRootElement();
			case UsersequencePackage.P___GET_OUTGOING:
				return getOutgoing();
			case UsersequencePackage.P___GET_SUCCESSORS:
				return getSuccessors();
			case UsersequencePackage.P___GET_INCOMING:
				return getIncoming();
			case UsersequencePackage.P___GET_PREDECESSORS:
				return getPredecessors();
			case UsersequencePackage.P___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT:
				s_moveTo((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case UsersequencePackage.P___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT:
				preMove((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case UsersequencePackage.P___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT:
				postMove((ModelElementContainer)arguments.get(0), (ModelElementContainer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
				return null;
			case UsersequencePackage.P___PRE_RESIZE__INT_INT_INT_INT_DIRECTION:
				preResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case UsersequencePackage.P___POST_RESIZE__INT_INT_INT_INT_DIRECTION:
				postResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case UsersequencePackage.P___GET_OUTGOING_TRANSITIONS:
				return getOutgoingTransitions();
			case UsersequencePackage.P___GET_INCOMING_ANCHORS:
				return getIncomingAnchors();
			case UsersequencePackage.P___GET_INCOMING_LABELED_TRANSITIONS:
				return getIncomingLabeledTransitions();
			case UsersequencePackage.P___GET_INCOMING_TRANSITIONS:
				return getIncomingTransitions();
			case UsersequencePackage.P___GET_START_PREDECESSORS:
				return getStartPredecessors();
			case UsersequencePackage.P___GET_SUB_SEQUENCE_PREDECESSORS:
				return getSubSequencePredecessors();
			case UsersequencePackage.P___GET_SCREENSHOT_PREDECESSORS:
				return getScreenshotPredecessors();
			case UsersequencePackage.P___GET_SECTION_NODE_PREDECESSORS:
				return getSectionNodePredecessors();
			case UsersequencePackage.P___GET_NAVIGATION_PREDECESSORS:
				return getNavigationPredecessors();
			case UsersequencePackage.P___GET_WEB_ELEMENT_PREDECESSORS:
				return getWebElementPredecessors();
			case UsersequencePackage.P___GET_DIV_PREDECESSORS:
				return getDivPredecessors();
			case UsersequencePackage.P___GET_HPREDECESSORS:
				return getHPredecessors();
			case UsersequencePackage.P___GET_PPREDECESSORS:
				return getPPredecessors();
			case UsersequencePackage.P___GET_SPAN_PREDECESSORS:
				return getSpanPredecessors();
			case UsersequencePackage.P___GET_LABEL_PREDECESSORS:
				return getLabelPredecessors();
			case UsersequencePackage.P___GET_FORM_PREDECESSORS:
				return getFormPredecessors();
			case UsersequencePackage.P___GET_INPUT_PREDECESSORS:
				return getInputPredecessors();
			case UsersequencePackage.P___GET_TEXTAREA_PREDECESSORS:
				return getTextareaPredecessors();
			case UsersequencePackage.P___GET_BUTTON_PREDECESSORS:
				return getButtonPredecessors();
			case UsersequencePackage.P___GET_SELECT_BOX_PREDECESSORS:
				return getSelectBoxPredecessors();
			case UsersequencePackage.P___GET_SELECT_BOX_OPTION_PREDECESSORS:
				return getSelectBoxOptionPredecessors();
			case UsersequencePackage.P___GET_TABLE_PREDECESSORS:
				return getTablePredecessors();
			case UsersequencePackage.P___GET_TABLE_HEAD_PREDECESSORS:
				return getTableHeadPredecessors();
			case UsersequencePackage.P___GET_TH_PREDECESSORS:
				return getThPredecessors();
			case UsersequencePackage.P___GET_TABLE_ROW_PREDECESSORS:
				return getTableRowPredecessors();
			case UsersequencePackage.P___GET_TABLE_BODY_PREDECESSORS:
				return getTableBodyPredecessors();
			case UsersequencePackage.P___GET_TABLE_DATA_PREDECESSORS:
				return getTableDataPredecessors();
			case UsersequencePackage.P___GET_SECTION_PREDECESSORS:
				return getSectionPredecessors();
			case UsersequencePackage.P___GET_COMMENT_PREDECESSORS:
				return getCommentPredecessors();
			case UsersequencePackage.P___GET_STOP_SUCCESSORS:
				return getStopSuccessors();
			case UsersequencePackage.P___GET_SUB_SEQUENCE_SUCCESSORS:
				return getSubSequenceSuccessors();
			case UsersequencePackage.P___GET_SCREENSHOT_SUCCESSORS:
				return getScreenshotSuccessors();
			case UsersequencePackage.P___GET_SECTION_NODE_SUCCESSORS:
				return getSectionNodeSuccessors();
			case UsersequencePackage.P___GET_NAVIGATION_SUCCESSORS:
				return getNavigationSuccessors();
			case UsersequencePackage.P___GET_WEB_ELEMENT_SUCCESSORS:
				return getWebElementSuccessors();
			case UsersequencePackage.P___GET_DIV_SUCCESSORS:
				return getDivSuccessors();
			case UsersequencePackage.P___GET_HSUCCESSORS:
				return getHSuccessors();
			case UsersequencePackage.P___GET_PSUCCESSORS:
				return getPSuccessors();
			case UsersequencePackage.P___GET_SPAN_SUCCESSORS:
				return getSpanSuccessors();
			case UsersequencePackage.P___GET_LABEL_SUCCESSORS:
				return getLabelSuccessors();
			case UsersequencePackage.P___GET_FORM_SUCCESSORS:
				return getFormSuccessors();
			case UsersequencePackage.P___GET_INPUT_SUCCESSORS:
				return getInputSuccessors();
			case UsersequencePackage.P___GET_TEXTAREA_SUCCESSORS:
				return getTextareaSuccessors();
			case UsersequencePackage.P___GET_BUTTON_SUCCESSORS:
				return getButtonSuccessors();
			case UsersequencePackage.P___GET_SELECT_BOX_SUCCESSORS:
				return getSelectBoxSuccessors();
			case UsersequencePackage.P___GET_SELECT_BOX_OPTION_SUCCESSORS:
				return getSelectBoxOptionSuccessors();
			case UsersequencePackage.P___GET_TABLE_SUCCESSORS:
				return getTableSuccessors();
			case UsersequencePackage.P___GET_TABLE_HEAD_SUCCESSORS:
				return getTableHeadSuccessors();
			case UsersequencePackage.P___GET_TH_SUCCESSORS:
				return getThSuccessors();
			case UsersequencePackage.P___GET_TABLE_ROW_SUCCESSORS:
				return getTableRowSuccessors();
			case UsersequencePackage.P___GET_TABLE_BODY_SUCCESSORS:
				return getTableBodySuccessors();
			case UsersequencePackage.P___GET_TABLE_DATA_SUCCESSORS:
				return getTableDataSuccessors();
			case UsersequencePackage.P___GET_SECTION_SUCCESSORS:
				return getSectionSuccessors();
			case UsersequencePackage.P___CAN_NEW_TRANSITION__P:
				return canNewTransition((P)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__P:
				return newTransition((P)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__P_STRING:
				return newTransition((P)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.P___CAN_NEW_TRANSITION__TEXTAREA:
				return canNewTransition((Textarea)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__TEXTAREA:
				return newTransition((Textarea)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__TEXTAREA_STRING:
				return newTransition((Textarea)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.P___CAN_NEW_TRANSITION__SPAN:
				return canNewTransition((Span)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__SPAN:
				return newTransition((Span)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__SPAN_STRING:
				return newTransition((Span)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.P___CAN_NEW_TRANSITION__TABLEBODY:
				return canNewTransition((TableBody)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__TABLEBODY:
				return newTransition((TableBody)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__TABLEBODY_STRING:
				return newTransition((TableBody)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.P___CAN_NEW_TRANSITION__SCREENSHOT:
				return canNewTransition((Screenshot)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__SCREENSHOT:
				return newTransition((Screenshot)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__SCREENSHOT_STRING:
				return newTransition((Screenshot)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.P___CAN_NEW_TRANSITION__FORM:
				return canNewTransition((Form)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__FORM:
				return newTransition((Form)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__FORM_STRING:
				return newTransition((Form)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.P___CAN_NEW_TRANSITION__NAVIGATION:
				return canNewTransition((Navigation)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__NAVIGATION:
				return newTransition((Navigation)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__NAVIGATION_STRING:
				return newTransition((Navigation)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.P___CAN_NEW_TRANSITION__SUBSEQUENCE:
				return canNewTransition((SubSequence)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__SUBSEQUENCE:
				return newTransition((SubSequence)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__SUBSEQUENCE_STRING:
				return newTransition((SubSequence)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.P___CAN_NEW_TRANSITION__STOP:
				return canNewTransition((Stop)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__STOP:
				return newTransition((Stop)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__STOP_STRING:
				return newTransition((Stop)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.P___CAN_NEW_TRANSITION__TABLE:
				return canNewTransition((Table)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__TABLE:
				return newTransition((Table)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__TABLE_STRING:
				return newTransition((Table)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.P___CAN_NEW_TRANSITION__LABEL:
				return canNewTransition((Label)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__LABEL:
				return newTransition((Label)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__LABEL_STRING:
				return newTransition((Label)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.P___CAN_NEW_TRANSITION__TABLEROW:
				return canNewTransition((TableRow)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__TABLEROW:
				return newTransition((TableRow)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__TABLEROW_STRING:
				return newTransition((TableRow)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.P___CAN_NEW_TRANSITION__SELECTBOX:
				return canNewTransition((SelectBox)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__SELECTBOX:
				return newTransition((SelectBox)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__SELECTBOX_STRING:
				return newTransition((SelectBox)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.P___CAN_NEW_TRANSITION__TH:
				return canNewTransition((Th)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__TH:
				return newTransition((Th)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__TH_STRING:
				return newTransition((Th)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.P___CAN_NEW_TRANSITION__SELECTBOXOPTION:
				return canNewTransition((SelectBoxOption)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__SELECTBOXOPTION:
				return newTransition((SelectBoxOption)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__SELECTBOXOPTION_STRING:
				return newTransition((SelectBoxOption)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.P___CAN_NEW_TRANSITION__INPUT:
				return canNewTransition((Input)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__INPUT:
				return newTransition((Input)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__INPUT_STRING:
				return newTransition((Input)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.P___CAN_NEW_TRANSITION__TABLEDATA:
				return canNewTransition((TableData)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__TABLEDATA:
				return newTransition((TableData)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__TABLEDATA_STRING:
				return newTransition((TableData)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.P___CAN_NEW_TRANSITION__WEBELEMENT:
				return canNewTransition((WebElement)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__WEBELEMENT:
				return newTransition((WebElement)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__WEBELEMENT_STRING:
				return newTransition((WebElement)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.P___CAN_NEW_TRANSITION__DIV:
				return canNewTransition((Div)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__DIV:
				return newTransition((Div)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__DIV_STRING:
				return newTransition((Div)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.P___CAN_NEW_TRANSITION__BUTTON:
				return canNewTransition((Button)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__BUTTON:
				return newTransition((Button)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__BUTTON_STRING:
				return newTransition((Button)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.P___CAN_NEW_TRANSITION__SECTIONNODE:
				return canNewTransition((SectionNode)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__SECTIONNODE:
				return newTransition((SectionNode)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__SECTIONNODE_STRING:
				return newTransition((SectionNode)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.P___CAN_NEW_TRANSITION__H:
				return canNewTransition((H)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__H:
				return newTransition((H)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__H_STRING:
				return newTransition((H)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.P___CAN_NEW_TRANSITION__TABLEHEAD:
				return canNewTransition((TableHead)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__TABLEHEAD:
				return newTransition((TableHead)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__TABLEHEAD_STRING:
				return newTransition((TableHead)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.P___CAN_NEW_TRANSITION__SECTION:
				return canNewTransition((Section)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__SECTION:
				return newTransition((Section)arguments.get(0));
			case UsersequencePackage.P___NEW_TRANSITION__SECTION_STRING:
				return newTransition((Section)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.P___CAN_MOVE_TO__USERSEQUENCEGRAPHMODEL_INT_INT:
				return canMoveTo((UserSequenceGraphModel)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case UsersequencePackage.P___MOVE_TO__USERSEQUENCEGRAPHMODEL_INT_INT:
				moveTo((UserSequenceGraphModel)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case UsersequencePackage.P___SMOVE_TO__USERSEQUENCEGRAPHMODEL_INT_INT:
				s_moveTo((UserSequenceGraphModel)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case UsersequencePackage.P___GET_CONTAINER:
				return getContainer();
			case UsersequencePackage.P___GET_PVIEW:
				return getPView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //PImpl
