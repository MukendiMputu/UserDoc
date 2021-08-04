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
import info.scce.cinco.product.usersequence.usersequence.UserSequenceGraphModel;
import info.scce.cinco.product.usersequence.usersequence.UsersequencePackage;
import info.scce.cinco.product.usersequence.usersequence.WebElement;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalComment;

import info.scce.cinco.product.usersequence.usersequence.views.CommentView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CommentImpl extends NodeImpl implements Comment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsersequencePackage.eINSTANCE.getComment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContent() {
		return getInternalComment().getContent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(final String _arg) {
		getInternalComment().getElement().transact("Set Content", () -> {
			getInternalComment().setContent(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Screenshot getReferenceTo() {
		return getInternalComment().getReferenceTo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferenceTo(final Screenshot _arg) {
		getInternalComment().getElement().transact("Set ReferenceTo", () -> {
			getInternalComment().setReferenceTo(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalComment getInternalComment() {
		return (info.scce.cinco.product.usersequence.usersequence.internal.InternalComment) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyComment() {
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
	public EList<? extends Anchor> getOutgoing() {
		EList<graphmodel.internal.InternalEdge> out = ((graphmodel.internal.InternalNode)getInternalElement()).getOutgoing();
		return org.eclipse.emf.common.util.ECollections.unmodifiableEList(out
			.stream().map(me -> (info.scce.cinco.product.usersequence.usersequence.Anchor)me.getElement()).
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
	public EList<Anchor> getOutgoingAnchors() {
		return this.getOutgoing(info.scce.cinco.product.usersequence.usersequence.Anchor.class);
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
	public boolean canNewAnchor(final P target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anchor newAnchor(final P target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Anchor newAnchor(final P target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewAnchor(final Textarea target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anchor newAnchor(final Textarea target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Anchor newAnchor(final Textarea target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewAnchor(final Span target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anchor newAnchor(final Span target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Anchor newAnchor(final Span target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewAnchor(final TableBody target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anchor newAnchor(final TableBody target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Anchor newAnchor(final TableBody target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewAnchor(final Screenshot target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anchor newAnchor(final Screenshot target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Anchor newAnchor(final Screenshot target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewAnchor(final Form target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anchor newAnchor(final Form target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Anchor newAnchor(final Form target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewAnchor(final Navigation target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anchor newAnchor(final Navigation target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Anchor newAnchor(final Navigation target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewAnchor(final SubSequence target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anchor newAnchor(final SubSequence target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Anchor newAnchor(final SubSequence target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewAnchor(final Table target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anchor newAnchor(final Table target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Anchor newAnchor(final Table target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewAnchor(final Label target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anchor newAnchor(final Label target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Anchor newAnchor(final Label target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewAnchor(final TableRow target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anchor newAnchor(final TableRow target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Anchor newAnchor(final TableRow target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewAnchor(final SelectBox target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anchor newAnchor(final SelectBox target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Anchor newAnchor(final SelectBox target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewAnchor(final Th target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anchor newAnchor(final Th target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Anchor newAnchor(final Th target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewAnchor(final SelectBoxOption target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anchor newAnchor(final SelectBoxOption target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Anchor newAnchor(final SelectBoxOption target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewAnchor(final Input target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anchor newAnchor(final Input target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Anchor newAnchor(final Input target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewAnchor(final TableData target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anchor newAnchor(final TableData target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Anchor newAnchor(final TableData target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewAnchor(final WebElement target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anchor newAnchor(final WebElement target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Anchor newAnchor(final WebElement target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewAnchor(final Div target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anchor newAnchor(final Div target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Anchor newAnchor(final Div target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewAnchor(final Button target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anchor newAnchor(final Button target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Anchor newAnchor(final Button target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewAnchor(final SectionNode target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anchor newAnchor(final SectionNode target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Anchor newAnchor(final SectionNode target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewAnchor(final H target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anchor newAnchor(final H target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Anchor newAnchor(final H target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewAnchor(final TableHead target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anchor newAnchor(final TableHead target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Anchor newAnchor(final TableHead target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewAnchor(final Section target) {
		return this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class) && target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anchor newAnchor(final Section target) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.usersequence.usersequence.Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Anchor newAnchor(final Section target, final String id) {
		if (!this.canStart(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Anchor.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.usersequence.usersequence.Anchor.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Anchor.class, target.getClass()));
		else {
			info.scce.cinco.product.usersequence.usersequence.Anchor edge = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createAnchor(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		return userSequenceGraphModel.canContain(info.scce.cinco.product.usersequence.usersequence.Comment.class);
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
	public CommentView getCommentView() {
		CommentView commentView = info.scce.cinco.product.usersequence.usersequence.views.ViewsFactory.eINSTANCE.createCommentView();
		commentView.setInternalComment((info.scce.cinco.product.usersequence.usersequence.internal.InternalComment)getInternalElement());
		return commentView;
		
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return UsersequencePackage.COMMENT___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return UsersequencePackage.COMMENT___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_CONTAINER: return UsersequencePackage.COMMENT___GET_CONTAINER;
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return UsersequencePackage.COMMENT___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___PRE_SAVE: return UsersequencePackage.COMMENT___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT___POST_SAVE: return UsersequencePackage.COMMENT___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Node.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.NODE___GET_SUCCESSORS: return UsersequencePackage.COMMENT___GET_SUCCESSORS;
				case GraphmodelPackage.NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return UsersequencePackage.COMMENT___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return UsersequencePackage.COMMENT___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case GraphmodelPackage.NODE___GET_POST_DELETE_FUNCTION: return UsersequencePackage.COMMENT___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.NODE___GET_POST_DELETE_EVENT: return UsersequencePackage.COMMENT___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.NODE___PRE_DELETE: return UsersequencePackage.COMMENT___PRE_DELETE;
				case GraphmodelPackage.NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return UsersequencePackage.COMMENT___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return UsersequencePackage.COMMENT___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return UsersequencePackage.COMMENT___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___GET_OUTGOING: return UsersequencePackage.COMMENT___GET_OUTGOING;
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
			case UsersequencePackage.COMMENT___GET_CONTENT:
				return getContent();
			case UsersequencePackage.COMMENT___SET_CONTENT__STRING:
				setContent((String)arguments.get(0));
				return null;
			case UsersequencePackage.COMMENT___GET_REFERENCE_TO:
				return getReferenceTo();
			case UsersequencePackage.COMMENT___SET_REFERENCE_TO__SCREENSHOT:
				setReferenceTo((Screenshot)arguments.get(0));
				return null;
			case UsersequencePackage.COMMENT___GET_INTERNAL_COMMENT:
				return getInternalComment();
			case UsersequencePackage.COMMENT___IS_EXACTLY_COMMENT:
				return isExactlyComment();
			case UsersequencePackage.COMMENT___PRE_DELETE:
				preDelete();
				return null;
			case UsersequencePackage.COMMENT___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case UsersequencePackage.COMMENT___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case UsersequencePackage.COMMENT___PRE_SAVE:
				preSave();
				return null;
			case UsersequencePackage.COMMENT___POST_SAVE:
				postSave();
				return null;
			case UsersequencePackage.COMMENT___GET_ROOT_ELEMENT:
				return getRootElement();
			case UsersequencePackage.COMMENT___GET_OUTGOING:
				return getOutgoing();
			case UsersequencePackage.COMMENT___GET_SUCCESSORS:
				return getSuccessors();
			case UsersequencePackage.COMMENT___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT:
				s_moveTo((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case UsersequencePackage.COMMENT___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT:
				preMove((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case UsersequencePackage.COMMENT___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT:
				postMove((ModelElementContainer)arguments.get(0), (ModelElementContainer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
				return null;
			case UsersequencePackage.COMMENT___PRE_RESIZE__INT_INT_INT_INT_DIRECTION:
				preResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case UsersequencePackage.COMMENT___POST_RESIZE__INT_INT_INT_INT_DIRECTION:
				postResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case UsersequencePackage.COMMENT___GET_OUTGOING_ANCHORS:
				return getOutgoingAnchors();
			case UsersequencePackage.COMMENT___GET_SUB_SEQUENCE_SUCCESSORS:
				return getSubSequenceSuccessors();
			case UsersequencePackage.COMMENT___GET_SCREENSHOT_SUCCESSORS:
				return getScreenshotSuccessors();
			case UsersequencePackage.COMMENT___GET_SECTION_NODE_SUCCESSORS:
				return getSectionNodeSuccessors();
			case UsersequencePackage.COMMENT___GET_NAVIGATION_SUCCESSORS:
				return getNavigationSuccessors();
			case UsersequencePackage.COMMENT___GET_WEB_ELEMENT_SUCCESSORS:
				return getWebElementSuccessors();
			case UsersequencePackage.COMMENT___GET_DIV_SUCCESSORS:
				return getDivSuccessors();
			case UsersequencePackage.COMMENT___GET_HSUCCESSORS:
				return getHSuccessors();
			case UsersequencePackage.COMMENT___GET_PSUCCESSORS:
				return getPSuccessors();
			case UsersequencePackage.COMMENT___GET_SPAN_SUCCESSORS:
				return getSpanSuccessors();
			case UsersequencePackage.COMMENT___GET_LABEL_SUCCESSORS:
				return getLabelSuccessors();
			case UsersequencePackage.COMMENT___GET_FORM_SUCCESSORS:
				return getFormSuccessors();
			case UsersequencePackage.COMMENT___GET_INPUT_SUCCESSORS:
				return getInputSuccessors();
			case UsersequencePackage.COMMENT___GET_TEXTAREA_SUCCESSORS:
				return getTextareaSuccessors();
			case UsersequencePackage.COMMENT___GET_BUTTON_SUCCESSORS:
				return getButtonSuccessors();
			case UsersequencePackage.COMMENT___GET_SELECT_BOX_SUCCESSORS:
				return getSelectBoxSuccessors();
			case UsersequencePackage.COMMENT___GET_SELECT_BOX_OPTION_SUCCESSORS:
				return getSelectBoxOptionSuccessors();
			case UsersequencePackage.COMMENT___GET_TABLE_SUCCESSORS:
				return getTableSuccessors();
			case UsersequencePackage.COMMENT___GET_TABLE_HEAD_SUCCESSORS:
				return getTableHeadSuccessors();
			case UsersequencePackage.COMMENT___GET_TH_SUCCESSORS:
				return getThSuccessors();
			case UsersequencePackage.COMMENT___GET_TABLE_ROW_SUCCESSORS:
				return getTableRowSuccessors();
			case UsersequencePackage.COMMENT___GET_TABLE_BODY_SUCCESSORS:
				return getTableBodySuccessors();
			case UsersequencePackage.COMMENT___GET_TABLE_DATA_SUCCESSORS:
				return getTableDataSuccessors();
			case UsersequencePackage.COMMENT___GET_SECTION_SUCCESSORS:
				return getSectionSuccessors();
			case UsersequencePackage.COMMENT___CAN_NEW_ANCHOR__P:
				return canNewAnchor((P)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__P:
				return newAnchor((P)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__P_STRING:
				return newAnchor((P)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.COMMENT___CAN_NEW_ANCHOR__TEXTAREA:
				return canNewAnchor((Textarea)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__TEXTAREA:
				return newAnchor((Textarea)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__TEXTAREA_STRING:
				return newAnchor((Textarea)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.COMMENT___CAN_NEW_ANCHOR__SPAN:
				return canNewAnchor((Span)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__SPAN:
				return newAnchor((Span)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__SPAN_STRING:
				return newAnchor((Span)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.COMMENT___CAN_NEW_ANCHOR__TABLEBODY:
				return canNewAnchor((TableBody)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__TABLEBODY:
				return newAnchor((TableBody)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__TABLEBODY_STRING:
				return newAnchor((TableBody)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.COMMENT___CAN_NEW_ANCHOR__SCREENSHOT:
				return canNewAnchor((Screenshot)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__SCREENSHOT:
				return newAnchor((Screenshot)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__SCREENSHOT_STRING:
				return newAnchor((Screenshot)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.COMMENT___CAN_NEW_ANCHOR__FORM:
				return canNewAnchor((Form)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__FORM:
				return newAnchor((Form)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__FORM_STRING:
				return newAnchor((Form)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.COMMENT___CAN_NEW_ANCHOR__NAVIGATION:
				return canNewAnchor((Navigation)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__NAVIGATION:
				return newAnchor((Navigation)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__NAVIGATION_STRING:
				return newAnchor((Navigation)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.COMMENT___CAN_NEW_ANCHOR__SUBSEQUENCE:
				return canNewAnchor((SubSequence)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__SUBSEQUENCE:
				return newAnchor((SubSequence)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__SUBSEQUENCE_STRING:
				return newAnchor((SubSequence)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.COMMENT___CAN_NEW_ANCHOR__TABLE:
				return canNewAnchor((Table)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__TABLE:
				return newAnchor((Table)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__TABLE_STRING:
				return newAnchor((Table)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.COMMENT___CAN_NEW_ANCHOR__LABEL:
				return canNewAnchor((Label)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__LABEL:
				return newAnchor((Label)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__LABEL_STRING:
				return newAnchor((Label)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.COMMENT___CAN_NEW_ANCHOR__TABLEROW:
				return canNewAnchor((TableRow)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__TABLEROW:
				return newAnchor((TableRow)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__TABLEROW_STRING:
				return newAnchor((TableRow)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.COMMENT___CAN_NEW_ANCHOR__SELECTBOX:
				return canNewAnchor((SelectBox)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__SELECTBOX:
				return newAnchor((SelectBox)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__SELECTBOX_STRING:
				return newAnchor((SelectBox)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.COMMENT___CAN_NEW_ANCHOR__TH:
				return canNewAnchor((Th)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__TH:
				return newAnchor((Th)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__TH_STRING:
				return newAnchor((Th)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.COMMENT___CAN_NEW_ANCHOR__SELECTBOXOPTION:
				return canNewAnchor((SelectBoxOption)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__SELECTBOXOPTION:
				return newAnchor((SelectBoxOption)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__SELECTBOXOPTION_STRING:
				return newAnchor((SelectBoxOption)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.COMMENT___CAN_NEW_ANCHOR__INPUT:
				return canNewAnchor((Input)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__INPUT:
				return newAnchor((Input)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__INPUT_STRING:
				return newAnchor((Input)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.COMMENT___CAN_NEW_ANCHOR__TABLEDATA:
				return canNewAnchor((TableData)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__TABLEDATA:
				return newAnchor((TableData)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__TABLEDATA_STRING:
				return newAnchor((TableData)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.COMMENT___CAN_NEW_ANCHOR__WEBELEMENT:
				return canNewAnchor((WebElement)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__WEBELEMENT:
				return newAnchor((WebElement)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__WEBELEMENT_STRING:
				return newAnchor((WebElement)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.COMMENT___CAN_NEW_ANCHOR__DIV:
				return canNewAnchor((Div)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__DIV:
				return newAnchor((Div)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__DIV_STRING:
				return newAnchor((Div)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.COMMENT___CAN_NEW_ANCHOR__BUTTON:
				return canNewAnchor((Button)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__BUTTON:
				return newAnchor((Button)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__BUTTON_STRING:
				return newAnchor((Button)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.COMMENT___CAN_NEW_ANCHOR__SECTIONNODE:
				return canNewAnchor((SectionNode)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__SECTIONNODE:
				return newAnchor((SectionNode)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__SECTIONNODE_STRING:
				return newAnchor((SectionNode)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.COMMENT___CAN_NEW_ANCHOR__H:
				return canNewAnchor((H)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__H:
				return newAnchor((H)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__H_STRING:
				return newAnchor((H)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.COMMENT___CAN_NEW_ANCHOR__TABLEHEAD:
				return canNewAnchor((TableHead)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__TABLEHEAD:
				return newAnchor((TableHead)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__TABLEHEAD_STRING:
				return newAnchor((TableHead)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.COMMENT___CAN_NEW_ANCHOR__SECTION:
				return canNewAnchor((Section)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__SECTION:
				return newAnchor((Section)arguments.get(0));
			case UsersequencePackage.COMMENT___NEW_ANCHOR__SECTION_STRING:
				return newAnchor((Section)arguments.get(0), (String)arguments.get(1));
			case UsersequencePackage.COMMENT___CAN_MOVE_TO__USERSEQUENCEGRAPHMODEL_INT_INT:
				return canMoveTo((UserSequenceGraphModel)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case UsersequencePackage.COMMENT___MOVE_TO__USERSEQUENCEGRAPHMODEL_INT_INT:
				moveTo((UserSequenceGraphModel)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case UsersequencePackage.COMMENT___SMOVE_TO__USERSEQUENCEGRAPHMODEL_INT_INT:
				s_moveTo((UserSequenceGraphModel)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case UsersequencePackage.COMMENT___GET_CONTAINER:
				return getContainer();
			case UsersequencePackage.COMMENT___GET_COMMENT_VIEW:
				return getCommentView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //CommentImpl
