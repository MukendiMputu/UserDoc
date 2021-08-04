/**
 */
package info.scce.cinco.product.usersequence.usersequence.impl;

import graphmodel.GraphModel;
import graphmodel.GraphmodelPackage;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElementContainer;
import graphmodel.Node;

import graphmodel.impl.GraphModelImpl;

import info.scce.cinco.product.usersequence.usersequence.BaseURL;
import info.scce.cinco.product.usersequence.usersequence.Button;
import info.scce.cinco.product.usersequence.usersequence.Comment;
import info.scce.cinco.product.usersequence.usersequence.Div;
import info.scce.cinco.product.usersequence.usersequence.Domain;
import info.scce.cinco.product.usersequence.usersequence.Form;
import info.scce.cinco.product.usersequence.usersequence.H;
import info.scce.cinco.product.usersequence.usersequence.Input;
import info.scce.cinco.product.usersequence.usersequence.KeyValue;
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
import info.scce.cinco.product.usersequence.usersequence.UserSequenceGraphModel;
import info.scce.cinco.product.usersequence.usersequence.UsersequencePackage;
import info.scce.cinco.product.usersequence.usersequence.WebElement;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalUserSequenceGraphModel;

import info.scce.cinco.product.usersequence.usersequence.views.UserSequenceGraphModelView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Sequence Graph Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class UserSequenceGraphModelImpl extends GraphModelImpl implements UserSequenceGraphModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserSequenceGraphModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsersequencePackage.eINSTANCE.getUserSequenceGraphModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModelName() {
		return getInternalUserSequenceGraphModel().getModelName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelName(final String _arg) {
		getInternalUserSequenceGraphModel().getElement().transact("Set ModelName", () -> {
			getInternalUserSequenceGraphModel().setModelName(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalUserSequenceGraphModel getInternalUserSequenceGraphModel() {
		return (info.scce.cinco.product.usersequence.usersequence.internal.InternalUserSequenceGraphModel) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyUserSequenceGraphModel() {
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
	public UserSequenceGraphModel getRootElement() {
		return this;
		
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
	public EList<P> getPs() {
		return getModelElements(info.scce.cinco.product.usersequence.usersequence.P.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewP() {
		return this.canContain(info.scce.cinco.product.usersequence.usersequence.P.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public P newP(final int x, final int y) {
		return newP(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public P newP(final String id, final int x, final int y) {
		return newP(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public P newP(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.P.class)) {
			info.scce.cinco.product.usersequence.usersequence.P node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createP((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.P.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public P newP(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.P.class)) {
			info.scce.cinco.product.usersequence.usersequence.P node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createP((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.P.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Textarea> getTextareas() {
		return getModelElements(info.scce.cinco.product.usersequence.usersequence.Textarea.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTextarea() {
		return this.canContain(info.scce.cinco.product.usersequence.usersequence.Textarea.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Textarea newTextarea(final int x, final int y) {
		return newTextarea(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Textarea newTextarea(final String id, final int x, final int y) {
		return newTextarea(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Textarea newTextarea(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.Textarea.class)) {
			info.scce.cinco.product.usersequence.usersequence.Textarea node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTextarea((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.Textarea.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Textarea newTextarea(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.Textarea.class)) {
			info.scce.cinco.product.usersequence.usersequence.Textarea node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTextarea((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.Textarea.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableBody> getTableBodys() {
		return getModelElements(info.scce.cinco.product.usersequence.usersequence.TableBody.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTableBody() {
		return this.canContain(info.scce.cinco.product.usersequence.usersequence.TableBody.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableBody newTableBody(final int x, final int y) {
		return newTableBody(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableBody newTableBody(final String id, final int x, final int y) {
		return newTableBody(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableBody newTableBody(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.TableBody.class)) {
			info.scce.cinco.product.usersequence.usersequence.TableBody node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTableBody((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.TableBody.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableBody newTableBody(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.TableBody.class)) {
			info.scce.cinco.product.usersequence.usersequence.TableBody node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTableBody((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.TableBody.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Screenshot> getScreenshots() {
		return getModelElements(info.scce.cinco.product.usersequence.usersequence.Screenshot.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewScreenshot() {
		return this.canContain(info.scce.cinco.product.usersequence.usersequence.Screenshot.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Screenshot newScreenshot(final int x, final int y) {
		return newScreenshot(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Screenshot newScreenshot(final String id, final int x, final int y) {
		return newScreenshot(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Screenshot newScreenshot(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.Screenshot.class)) {
			info.scce.cinco.product.usersequence.usersequence.Screenshot node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createScreenshot((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.Screenshot.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Screenshot newScreenshot(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.Screenshot.class)) {
			info.scce.cinco.product.usersequence.usersequence.Screenshot node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createScreenshot((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.Screenshot.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		return getModelElements(info.scce.cinco.product.usersequence.usersequence.Comment.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewComment() {
		return this.canContain(info.scce.cinco.product.usersequence.usersequence.Comment.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comment newComment(final int x, final int y) {
		return newComment(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comment newComment(final String id, final int x, final int y) {
		return newComment(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comment newComment(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.Comment.class)) {
			info.scce.cinco.product.usersequence.usersequence.Comment node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createComment((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.Comment.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comment newComment(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.Comment.class)) {
			info.scce.cinco.product.usersequence.usersequence.Comment node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createComment((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.Comment.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Navigation> getNavigations() {
		return getModelElements(info.scce.cinco.product.usersequence.usersequence.Navigation.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewNavigation() {
		return this.canContain(info.scce.cinco.product.usersequence.usersequence.Navigation.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Navigation newNavigation(final int x, final int y) {
		return newNavigation(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Navigation newNavigation(final String id, final int x, final int y) {
		return newNavigation(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Navigation newNavigation(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.Navigation.class)) {
			info.scce.cinco.product.usersequence.usersequence.Navigation node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createNavigation((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.Navigation.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Navigation newNavigation(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.Navigation.class)) {
			info.scce.cinco.product.usersequence.usersequence.Navigation node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createNavigation((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.Navigation.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubSequence> getSubSequences() {
		return getModelElements(info.scce.cinco.product.usersequence.usersequence.SubSequence.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewSubSequence() {
		return this.canContain(info.scce.cinco.product.usersequence.usersequence.SubSequence.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubSequence newSubSequence(final EObject subSequence, final int x, final int y) {
		return newSubSequence(subSequence,x,y,-1,-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubSequence newSubSequence(final EObject subSequence, final String id, final int x, final int y) {
		return newSubSequence(subSequence,x,y,-1,-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubSequence newSubSequence(final EObject subSequence, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.SubSequence.class)) {
			info.scce.cinco.product.usersequence.usersequence.SubSequence node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createSubSequence();
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			((info.scce.cinco.product.usersequence.usersequence.internal.InternalSubSequence) node.getInternalElement())
				.setLibraryComponentUID(org.eclipse.emf.ecore.util.EcoreUtil.getID(subSequence));
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", SubSequence.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubSequence newSubSequence(final EObject subSequence, final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.SubSequence.class)) {
			info.scce.cinco.product.usersequence.usersequence.SubSequence node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createSubSequence();
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			((info.scce.cinco.product.usersequence.usersequence.internal.InternalSubSequence) node.getInternalElement())
				.setLibraryComponentUID(org.eclipse.emf.ecore.util.EcoreUtil.getID(subSequence));
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", SubSequence.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Stop> getStops() {
		return getModelElements(info.scce.cinco.product.usersequence.usersequence.Stop.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStop() {
		return this.canContain(info.scce.cinco.product.usersequence.usersequence.Stop.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stop newStop(final int x, final int y) {
		return newStop(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stop newStop(final String id, final int x, final int y) {
		return newStop(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stop newStop(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.Stop.class)) {
			info.scce.cinco.product.usersequence.usersequence.Stop node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createStop((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.Stop.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stop newStop(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.Stop.class)) {
			info.scce.cinco.product.usersequence.usersequence.Stop node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createStop((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.Stop.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SelectBox> getSelectBoxs() {
		return getModelElements(info.scce.cinco.product.usersequence.usersequence.SelectBox.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewSelectBox() {
		return this.canContain(info.scce.cinco.product.usersequence.usersequence.SelectBox.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelectBox newSelectBox(final int x, final int y) {
		return newSelectBox(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelectBox newSelectBox(final String id, final int x, final int y) {
		return newSelectBox(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelectBox newSelectBox(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.SelectBox.class)) {
			info.scce.cinco.product.usersequence.usersequence.SelectBox node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createSelectBox((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.SelectBox.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelectBox newSelectBox(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.SelectBox.class)) {
			info.scce.cinco.product.usersequence.usersequence.SelectBox node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createSelectBox((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.SelectBox.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Th> getThs() {
		return getModelElements(info.scce.cinco.product.usersequence.usersequence.Th.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTh() {
		return this.canContain(info.scce.cinco.product.usersequence.usersequence.Th.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Th newTh(final int x, final int y) {
		return newTh(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Th newTh(final String id, final int x, final int y) {
		return newTh(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Th newTh(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.Th.class)) {
			info.scce.cinco.product.usersequence.usersequence.Th node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTh((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.Th.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Th newTh(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.Th.class)) {
			info.scce.cinco.product.usersequence.usersequence.Th node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTh((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.Th.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BaseURL> getBaseURLs() {
		return getModelElements(info.scce.cinco.product.usersequence.usersequence.BaseURL.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewBaseURL() {
		return this.canContain(info.scce.cinco.product.usersequence.usersequence.BaseURL.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseURL newBaseURL(final int x, final int y) {
		return newBaseURL(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseURL newBaseURL(final String id, final int x, final int y) {
		return newBaseURL(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseURL newBaseURL(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.BaseURL.class)) {
			info.scce.cinco.product.usersequence.usersequence.BaseURL node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createBaseURL((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.BaseURL.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseURL newBaseURL(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.BaseURL.class)) {
			info.scce.cinco.product.usersequence.usersequence.BaseURL node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createBaseURL((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.BaseURL.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Input> getInputs() {
		return getModelElements(info.scce.cinco.product.usersequence.usersequence.Input.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewInput() {
		return this.canContain(info.scce.cinco.product.usersequence.usersequence.Input.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Input newInput(final int x, final int y) {
		return newInput(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Input newInput(final String id, final int x, final int y) {
		return newInput(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Input newInput(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.Input.class)) {
			info.scce.cinco.product.usersequence.usersequence.Input node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createInput((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.Input.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Input newInput(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.Input.class)) {
			info.scce.cinco.product.usersequence.usersequence.Input node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createInput((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.Input.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableData> getTableDatas() {
		return getModelElements(info.scce.cinco.product.usersequence.usersequence.TableData.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTableData() {
		return this.canContain(info.scce.cinco.product.usersequence.usersequence.TableData.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableData newTableData(final int x, final int y) {
		return newTableData(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableData newTableData(final String id, final int x, final int y) {
		return newTableData(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableData newTableData(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.TableData.class)) {
			info.scce.cinco.product.usersequence.usersequence.TableData node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTableData((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.TableData.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableData newTableData(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.TableData.class)) {
			info.scce.cinco.product.usersequence.usersequence.TableData node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTableData((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.TableData.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Div> getDivs() {
		return getModelElements(info.scce.cinco.product.usersequence.usersequence.Div.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewDiv() {
		return this.canContain(info.scce.cinco.product.usersequence.usersequence.Div.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Div newDiv(final int x, final int y) {
		return newDiv(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Div newDiv(final String id, final int x, final int y) {
		return newDiv(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Div newDiv(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.Div.class)) {
			info.scce.cinco.product.usersequence.usersequence.Div node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createDiv((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.Div.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Div newDiv(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.Div.class)) {
			info.scce.cinco.product.usersequence.usersequence.Div node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createDiv((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.Div.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<H> getHs() {
		return getModelElements(info.scce.cinco.product.usersequence.usersequence.H.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewH() {
		return this.canContain(info.scce.cinco.product.usersequence.usersequence.H.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public H newH(final int x, final int y) {
		return newH(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public H newH(final String id, final int x, final int y) {
		return newH(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public H newH(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.H.class)) {
			info.scce.cinco.product.usersequence.usersequence.H node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createH((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.H.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public H newH(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.H.class)) {
			info.scce.cinco.product.usersequence.usersequence.H node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createH((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.H.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableHead> getTableHeads() {
		return getModelElements(info.scce.cinco.product.usersequence.usersequence.TableHead.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTableHead() {
		return this.canContain(info.scce.cinco.product.usersequence.usersequence.TableHead.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableHead newTableHead(final int x, final int y) {
		return newTableHead(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableHead newTableHead(final String id, final int x, final int y) {
		return newTableHead(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableHead newTableHead(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.TableHead.class)) {
			info.scce.cinco.product.usersequence.usersequence.TableHead node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTableHead((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.TableHead.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableHead newTableHead(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.TableHead.class)) {
			info.scce.cinco.product.usersequence.usersequence.TableHead node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTableHead((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.TableHead.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Domain> getDomains() {
		return getModelElements(info.scce.cinco.product.usersequence.usersequence.Domain.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewDomain() {
		return this.canContain(info.scce.cinco.product.usersequence.usersequence.Domain.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Domain newDomain(final int x, final int y) {
		return newDomain(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Domain newDomain(final String id, final int x, final int y) {
		return newDomain(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Domain newDomain(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.Domain.class)) {
			info.scce.cinco.product.usersequence.usersequence.Domain node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createDomain((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.Domain.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Domain newDomain(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.Domain.class)) {
			info.scce.cinco.product.usersequence.usersequence.Domain node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createDomain((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.Domain.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Span> getSpans() {
		return getModelElements(info.scce.cinco.product.usersequence.usersequence.Span.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewSpan() {
		return this.canContain(info.scce.cinco.product.usersequence.usersequence.Span.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Span newSpan(final int x, final int y) {
		return newSpan(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Span newSpan(final String id, final int x, final int y) {
		return newSpan(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Span newSpan(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.Span.class)) {
			info.scce.cinco.product.usersequence.usersequence.Span node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createSpan((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.Span.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Span newSpan(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.Span.class)) {
			info.scce.cinco.product.usersequence.usersequence.Span node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createSpan((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.Span.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Form> getForms() {
		return getModelElements(info.scce.cinco.product.usersequence.usersequence.Form.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewForm() {
		return this.canContain(info.scce.cinco.product.usersequence.usersequence.Form.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Form newForm(final int x, final int y) {
		return newForm(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Form newForm(final String id, final int x, final int y) {
		return newForm(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Form newForm(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.Form.class)) {
			info.scce.cinco.product.usersequence.usersequence.Form node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createForm((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.Form.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Form newForm(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.Form.class)) {
			info.scce.cinco.product.usersequence.usersequence.Form node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createForm((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.Form.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Table> getTables() {
		return getModelElements(info.scce.cinco.product.usersequence.usersequence.Table.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTable() {
		return this.canContain(info.scce.cinco.product.usersequence.usersequence.Table.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table newTable(final int x, final int y) {
		return newTable(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table newTable(final String id, final int x, final int y) {
		return newTable(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table newTable(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.Table.class)) {
			info.scce.cinco.product.usersequence.usersequence.Table node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTable((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.Table.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table newTable(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.Table.class)) {
			info.scce.cinco.product.usersequence.usersequence.Table node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTable((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.Table.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Label> getLabels() {
		return getModelElements(info.scce.cinco.product.usersequence.usersequence.Label.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewLabel() {
		return this.canContain(info.scce.cinco.product.usersequence.usersequence.Label.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Label newLabel(final int x, final int y) {
		return newLabel(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Label newLabel(final String id, final int x, final int y) {
		return newLabel(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Label newLabel(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.Label.class)) {
			info.scce.cinco.product.usersequence.usersequence.Label node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabel((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.Label.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Label newLabel(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.Label.class)) {
			info.scce.cinco.product.usersequence.usersequence.Label node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createLabel((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.Label.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableRow> getTableRows() {
		return getModelElements(info.scce.cinco.product.usersequence.usersequence.TableRow.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewTableRow() {
		return this.canContain(info.scce.cinco.product.usersequence.usersequence.TableRow.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableRow newTableRow(final int x, final int y) {
		return newTableRow(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableRow newTableRow(final String id, final int x, final int y) {
		return newTableRow(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableRow newTableRow(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.TableRow.class)) {
			info.scce.cinco.product.usersequence.usersequence.TableRow node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTableRow((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.TableRow.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableRow newTableRow(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.TableRow.class)) {
			info.scce.cinco.product.usersequence.usersequence.TableRow node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createTableRow((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.TableRow.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KeyValue> getKeyValues() {
		return getModelElements(info.scce.cinco.product.usersequence.usersequence.KeyValue.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewKeyValue() {
		return this.canContain(info.scce.cinco.product.usersequence.usersequence.KeyValue.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyValue newKeyValue(final int x, final int y) {
		return newKeyValue(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyValue newKeyValue(final String id, final int x, final int y) {
		return newKeyValue(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyValue newKeyValue(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.KeyValue.class)) {
			info.scce.cinco.product.usersequence.usersequence.KeyValue node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createKeyValue((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.KeyValue.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyValue newKeyValue(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.KeyValue.class)) {
			info.scce.cinco.product.usersequence.usersequence.KeyValue node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createKeyValue((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.KeyValue.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SelectBoxOption> getSelectBoxOptions() {
		return getModelElements(info.scce.cinco.product.usersequence.usersequence.SelectBoxOption.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewSelectBoxOption() {
		return this.canContain(info.scce.cinco.product.usersequence.usersequence.SelectBoxOption.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelectBoxOption newSelectBoxOption(final int x, final int y) {
		return newSelectBoxOption(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelectBoxOption newSelectBoxOption(final String id, final int x, final int y) {
		return newSelectBoxOption(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelectBoxOption newSelectBoxOption(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.SelectBoxOption.class)) {
			info.scce.cinco.product.usersequence.usersequence.SelectBoxOption node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createSelectBoxOption((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.SelectBoxOption.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelectBoxOption newSelectBoxOption(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.SelectBoxOption.class)) {
			info.scce.cinco.product.usersequence.usersequence.SelectBoxOption node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createSelectBoxOption((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.SelectBoxOption.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Start> getStarts() {
		return getModelElements(info.scce.cinco.product.usersequence.usersequence.Start.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStart() {
		return this.canContain(info.scce.cinco.product.usersequence.usersequence.Start.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Start newStart(final int x, final int y) {
		return newStart(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Start newStart(final String id, final int x, final int y) {
		return newStart(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Start newStart(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.Start.class)) {
			info.scce.cinco.product.usersequence.usersequence.Start node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createStart((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.Start.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Start newStart(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.Start.class)) {
			info.scce.cinco.product.usersequence.usersequence.Start node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createStart((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.Start.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WebElement> getWebElements() {
		return getModelElements(info.scce.cinco.product.usersequence.usersequence.WebElement.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewWebElement() {
		return this.canContain(info.scce.cinco.product.usersequence.usersequence.WebElement.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebElement newWebElement(final int x, final int y) {
		return newWebElement(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebElement newWebElement(final String id, final int x, final int y) {
		return newWebElement(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebElement newWebElement(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.WebElement.class)) {
			info.scce.cinco.product.usersequence.usersequence.WebElement node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createWebElement((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.WebElement.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebElement newWebElement(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.WebElement.class)) {
			info.scce.cinco.product.usersequence.usersequence.WebElement node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createWebElement((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.WebElement.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Button> getButtons() {
		return getModelElements(info.scce.cinco.product.usersequence.usersequence.Button.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewButton() {
		return this.canContain(info.scce.cinco.product.usersequence.usersequence.Button.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Button newButton(final int x, final int y) {
		return newButton(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Button newButton(final String id, final int x, final int y) {
		return newButton(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Button newButton(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.Button.class)) {
			info.scce.cinco.product.usersequence.usersequence.Button node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createButton((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.Button.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Button newButton(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.Button.class)) {
			info.scce.cinco.product.usersequence.usersequence.Button node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createButton((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.Button.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SectionNode> getSectionNodes() {
		return getModelElements(info.scce.cinco.product.usersequence.usersequence.SectionNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewSectionNode() {
		return this.canContain(info.scce.cinco.product.usersequence.usersequence.SectionNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SectionNode newSectionNode(final int x, final int y) {
		return newSectionNode(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SectionNode newSectionNode(final String id, final int x, final int y) {
		return newSectionNode(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SectionNode newSectionNode(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.SectionNode.class)) {
			info.scce.cinco.product.usersequence.usersequence.SectionNode node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createSectionNode((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.SectionNode.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SectionNode newSectionNode(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.SectionNode.class)) {
			info.scce.cinco.product.usersequence.usersequence.SectionNode node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createSectionNode((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.SectionNode.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Section> getSections() {
		return getModelElements(info.scce.cinco.product.usersequence.usersequence.Section.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewSection() {
		return this.canContain(info.scce.cinco.product.usersequence.usersequence.Section.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Section newSection(final int x, final int y) {
		return newSection(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Section newSection(final String id, final int x, final int y) {
		return newSection(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Section newSection(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.Section.class)) {
			info.scce.cinco.product.usersequence.usersequence.Section node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createSection((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.Section.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Section newSection(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.usersequence.usersequence.Section.class)) {
			info.scce.cinco.product.usersequence.usersequence.Section node = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createSection((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.usersequence.usersequence.Section.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserSequenceGraphModel newUserSequenceGraphModel(final String path, final String fileName, final boolean postCreateHook) {
		org.eclipse.core.runtime.IPath filePath = new org.eclipse.core.runtime.Path(path).append(fileName).addFileExtension("usersequencegraphmodel");
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createPlatformResourceURI(filePath.toOSString(), true);
		org.eclipse.core.resources.IFile file = org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRoot().getFile(filePath);
		org.eclipse.emf.ecore.resource.Resource res = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl().createResource(uri);
		info.scce.cinco.product.usersequence.usersequence.UserSequenceGraphModel graph = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createUserSequenceGraphModel();
		
		org.eclipse.emf.ecore.util.EcoreUtil.setID(graph, org.eclipse.emf.ecore.util.EcoreUtil.generateUUID());
		
		res.getContents().add(graph.getInternalElement());
		
		try {
			res.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
		
		return graph;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserSequenceGraphModelView getUserSequenceGraphModelView() {
		UserSequenceGraphModelView userSequenceGraphModelView = info.scce.cinco.product.usersequence.usersequence.views.ViewsFactory.eINSTANCE.createUserSequenceGraphModelView();
		userSequenceGraphModelView.setInternalUserSequenceGraphModel((info.scce.cinco.product.usersequence.usersequence.internal.InternalUserSequenceGraphModel)getInternalElement());
		return userSequenceGraphModelView;
		
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElementContainer.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___GET_NODES: return UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_NODES;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___PRE_SAVE: return UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___POST_SAVE: return UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == GraphModel.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.GRAPH_MODEL___GET_ROOT_ELEMENT: return UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_ROOT_ELEMENT;
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
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_MODEL_NAME:
				return getModelName();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___SET_MODEL_NAME__STRING:
				setModelName((String)arguments.get(0));
				return null;
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_INTERNAL_USER_SEQUENCE_GRAPH_MODEL:
				return getInternalUserSequenceGraphModel();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___IS_EXACTLY_USER_SEQUENCE_GRAPH_MODEL:
				return isExactlyUserSequenceGraphModel();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___PRE_DELETE:
				preDelete();
				return null;
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___PRE_SAVE:
				preSave();
				return null;
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___POST_SAVE:
				postSave();
				return null;
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_ROOT_ELEMENT:
				return getRootElement();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_NODES:
				return getNodes();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_PS:
				return getPs();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___CAN_NEW_P:
				return canNewP();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_P__INT_INT:
				return newP((Integer)arguments.get(0), (Integer)arguments.get(1));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_P__STRING_INT_INT:
				return newP((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_P__INT_INT_INT_INT:
				return newP((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_P__STRING_INT_INT_INT_INT:
				return newP((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_TEXTAREAS:
				return getTextareas();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___CAN_NEW_TEXTAREA:
				return canNewTextarea();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_TEXTAREA__INT_INT:
				return newTextarea((Integer)arguments.get(0), (Integer)arguments.get(1));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_TEXTAREA__STRING_INT_INT:
				return newTextarea((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_TEXTAREA__INT_INT_INT_INT:
				return newTextarea((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_TEXTAREA__STRING_INT_INT_INT_INT:
				return newTextarea((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_TABLE_BODYS:
				return getTableBodys();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___CAN_NEW_TABLE_BODY:
				return canNewTableBody();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_TABLE_BODY__INT_INT:
				return newTableBody((Integer)arguments.get(0), (Integer)arguments.get(1));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_TABLE_BODY__STRING_INT_INT:
				return newTableBody((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_TABLE_BODY__INT_INT_INT_INT:
				return newTableBody((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_TABLE_BODY__STRING_INT_INT_INT_INT:
				return newTableBody((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_SCREENSHOTS:
				return getScreenshots();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___CAN_NEW_SCREENSHOT:
				return canNewScreenshot();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_SCREENSHOT__INT_INT:
				return newScreenshot((Integer)arguments.get(0), (Integer)arguments.get(1));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_SCREENSHOT__STRING_INT_INT:
				return newScreenshot((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_SCREENSHOT__INT_INT_INT_INT:
				return newScreenshot((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_SCREENSHOT__STRING_INT_INT_INT_INT:
				return newScreenshot((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_COMMENTS:
				return getComments();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___CAN_NEW_COMMENT:
				return canNewComment();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_COMMENT__INT_INT:
				return newComment((Integer)arguments.get(0), (Integer)arguments.get(1));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_COMMENT__STRING_INT_INT:
				return newComment((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_COMMENT__INT_INT_INT_INT:
				return newComment((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_COMMENT__STRING_INT_INT_INT_INT:
				return newComment((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_NAVIGATIONS:
				return getNavigations();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___CAN_NEW_NAVIGATION:
				return canNewNavigation();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_NAVIGATION__INT_INT:
				return newNavigation((Integer)arguments.get(0), (Integer)arguments.get(1));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_NAVIGATION__STRING_INT_INT:
				return newNavigation((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_NAVIGATION__INT_INT_INT_INT:
				return newNavigation((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_NAVIGATION__STRING_INT_INT_INT_INT:
				return newNavigation((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_SUB_SEQUENCES:
				return getSubSequences();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___CAN_NEW_SUB_SEQUENCE:
				return canNewSubSequence();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_SUB_SEQUENCE__EOBJECT_INT_INT:
				return newSubSequence((EObject)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_SUB_SEQUENCE__EOBJECT_STRING_INT_INT:
				return newSubSequence((EObject)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_SUB_SEQUENCE__EOBJECT_INT_INT_INT_INT:
				return newSubSequence((EObject)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_SUB_SEQUENCE__EOBJECT_STRING_INT_INT_INT_INT:
				return newSubSequence((EObject)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_STOPS:
				return getStops();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___CAN_NEW_STOP:
				return canNewStop();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_STOP__INT_INT:
				return newStop((Integer)arguments.get(0), (Integer)arguments.get(1));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_STOP__STRING_INT_INT:
				return newStop((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_STOP__INT_INT_INT_INT:
				return newStop((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_STOP__STRING_INT_INT_INT_INT:
				return newStop((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_SELECT_BOXS:
				return getSelectBoxs();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___CAN_NEW_SELECT_BOX:
				return canNewSelectBox();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_SELECT_BOX__INT_INT:
				return newSelectBox((Integer)arguments.get(0), (Integer)arguments.get(1));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_SELECT_BOX__STRING_INT_INT:
				return newSelectBox((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_SELECT_BOX__INT_INT_INT_INT:
				return newSelectBox((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_SELECT_BOX__STRING_INT_INT_INT_INT:
				return newSelectBox((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_THS:
				return getThs();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___CAN_NEW_TH:
				return canNewTh();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_TH__INT_INT:
				return newTh((Integer)arguments.get(0), (Integer)arguments.get(1));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_TH__STRING_INT_INT:
				return newTh((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_TH__INT_INT_INT_INT:
				return newTh((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_TH__STRING_INT_INT_INT_INT:
				return newTh((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_BASE_UR_LS:
				return getBaseURLs();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___CAN_NEW_BASE_URL:
				return canNewBaseURL();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_BASE_URL__INT_INT:
				return newBaseURL((Integer)arguments.get(0), (Integer)arguments.get(1));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_BASE_URL__STRING_INT_INT:
				return newBaseURL((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_BASE_URL__INT_INT_INT_INT:
				return newBaseURL((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_BASE_URL__STRING_INT_INT_INT_INT:
				return newBaseURL((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_INPUTS:
				return getInputs();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___CAN_NEW_INPUT:
				return canNewInput();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_INPUT__INT_INT:
				return newInput((Integer)arguments.get(0), (Integer)arguments.get(1));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_INPUT__STRING_INT_INT:
				return newInput((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_INPUT__INT_INT_INT_INT:
				return newInput((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_INPUT__STRING_INT_INT_INT_INT:
				return newInput((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_TABLE_DATAS:
				return getTableDatas();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___CAN_NEW_TABLE_DATA:
				return canNewTableData();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_TABLE_DATA__INT_INT:
				return newTableData((Integer)arguments.get(0), (Integer)arguments.get(1));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_TABLE_DATA__STRING_INT_INT:
				return newTableData((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_TABLE_DATA__INT_INT_INT_INT:
				return newTableData((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_TABLE_DATA__STRING_INT_INT_INT_INT:
				return newTableData((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_DIVS:
				return getDivs();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___CAN_NEW_DIV:
				return canNewDiv();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_DIV__INT_INT:
				return newDiv((Integer)arguments.get(0), (Integer)arguments.get(1));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_DIV__STRING_INT_INT:
				return newDiv((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_DIV__INT_INT_INT_INT:
				return newDiv((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_DIV__STRING_INT_INT_INT_INT:
				return newDiv((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_HS:
				return getHs();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___CAN_NEW_H:
				return canNewH();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_H__INT_INT:
				return newH((Integer)arguments.get(0), (Integer)arguments.get(1));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_H__STRING_INT_INT:
				return newH((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_H__INT_INT_INT_INT:
				return newH((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_H__STRING_INT_INT_INT_INT:
				return newH((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_TABLE_HEADS:
				return getTableHeads();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___CAN_NEW_TABLE_HEAD:
				return canNewTableHead();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_TABLE_HEAD__INT_INT:
				return newTableHead((Integer)arguments.get(0), (Integer)arguments.get(1));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_TABLE_HEAD__STRING_INT_INT:
				return newTableHead((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_TABLE_HEAD__INT_INT_INT_INT:
				return newTableHead((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_TABLE_HEAD__STRING_INT_INT_INT_INT:
				return newTableHead((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_DOMAINS:
				return getDomains();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___CAN_NEW_DOMAIN:
				return canNewDomain();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_DOMAIN__INT_INT:
				return newDomain((Integer)arguments.get(0), (Integer)arguments.get(1));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_DOMAIN__STRING_INT_INT:
				return newDomain((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_DOMAIN__INT_INT_INT_INT:
				return newDomain((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_DOMAIN__STRING_INT_INT_INT_INT:
				return newDomain((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_SPANS:
				return getSpans();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___CAN_NEW_SPAN:
				return canNewSpan();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_SPAN__INT_INT:
				return newSpan((Integer)arguments.get(0), (Integer)arguments.get(1));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_SPAN__STRING_INT_INT:
				return newSpan((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_SPAN__INT_INT_INT_INT:
				return newSpan((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_SPAN__STRING_INT_INT_INT_INT:
				return newSpan((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_FORMS:
				return getForms();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___CAN_NEW_FORM:
				return canNewForm();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_FORM__INT_INT:
				return newForm((Integer)arguments.get(0), (Integer)arguments.get(1));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_FORM__STRING_INT_INT:
				return newForm((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_FORM__INT_INT_INT_INT:
				return newForm((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_FORM__STRING_INT_INT_INT_INT:
				return newForm((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_TABLES:
				return getTables();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___CAN_NEW_TABLE:
				return canNewTable();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_TABLE__INT_INT:
				return newTable((Integer)arguments.get(0), (Integer)arguments.get(1));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_TABLE__STRING_INT_INT:
				return newTable((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_TABLE__INT_INT_INT_INT:
				return newTable((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_TABLE__STRING_INT_INT_INT_INT:
				return newTable((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_LABELS:
				return getLabels();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___CAN_NEW_LABEL:
				return canNewLabel();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_LABEL__INT_INT:
				return newLabel((Integer)arguments.get(0), (Integer)arguments.get(1));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_LABEL__STRING_INT_INT:
				return newLabel((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_LABEL__INT_INT_INT_INT:
				return newLabel((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_LABEL__STRING_INT_INT_INT_INT:
				return newLabel((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_TABLE_ROWS:
				return getTableRows();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___CAN_NEW_TABLE_ROW:
				return canNewTableRow();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_TABLE_ROW__INT_INT:
				return newTableRow((Integer)arguments.get(0), (Integer)arguments.get(1));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_TABLE_ROW__STRING_INT_INT:
				return newTableRow((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_TABLE_ROW__INT_INT_INT_INT:
				return newTableRow((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_TABLE_ROW__STRING_INT_INT_INT_INT:
				return newTableRow((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_KEY_VALUES:
				return getKeyValues();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___CAN_NEW_KEY_VALUE:
				return canNewKeyValue();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_KEY_VALUE__INT_INT:
				return newKeyValue((Integer)arguments.get(0), (Integer)arguments.get(1));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_KEY_VALUE__STRING_INT_INT:
				return newKeyValue((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_KEY_VALUE__INT_INT_INT_INT:
				return newKeyValue((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_KEY_VALUE__STRING_INT_INT_INT_INT:
				return newKeyValue((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_SELECT_BOX_OPTIONS:
				return getSelectBoxOptions();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___CAN_NEW_SELECT_BOX_OPTION:
				return canNewSelectBoxOption();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_SELECT_BOX_OPTION__INT_INT:
				return newSelectBoxOption((Integer)arguments.get(0), (Integer)arguments.get(1));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_SELECT_BOX_OPTION__STRING_INT_INT:
				return newSelectBoxOption((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_SELECT_BOX_OPTION__INT_INT_INT_INT:
				return newSelectBoxOption((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_SELECT_BOX_OPTION__STRING_INT_INT_INT_INT:
				return newSelectBoxOption((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_STARTS:
				return getStarts();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___CAN_NEW_START:
				return canNewStart();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_START__INT_INT:
				return newStart((Integer)arguments.get(0), (Integer)arguments.get(1));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_START__STRING_INT_INT:
				return newStart((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_START__INT_INT_INT_INT:
				return newStart((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_START__STRING_INT_INT_INT_INT:
				return newStart((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_WEB_ELEMENTS:
				return getWebElements();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___CAN_NEW_WEB_ELEMENT:
				return canNewWebElement();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_WEB_ELEMENT__INT_INT:
				return newWebElement((Integer)arguments.get(0), (Integer)arguments.get(1));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_WEB_ELEMENT__STRING_INT_INT:
				return newWebElement((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_WEB_ELEMENT__INT_INT_INT_INT:
				return newWebElement((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_WEB_ELEMENT__STRING_INT_INT_INT_INT:
				return newWebElement((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_BUTTONS:
				return getButtons();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___CAN_NEW_BUTTON:
				return canNewButton();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_BUTTON__INT_INT:
				return newButton((Integer)arguments.get(0), (Integer)arguments.get(1));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_BUTTON__STRING_INT_INT:
				return newButton((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_BUTTON__INT_INT_INT_INT:
				return newButton((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_BUTTON__STRING_INT_INT_INT_INT:
				return newButton((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_SECTION_NODES:
				return getSectionNodes();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___CAN_NEW_SECTION_NODE:
				return canNewSectionNode();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_SECTION_NODE__INT_INT:
				return newSectionNode((Integer)arguments.get(0), (Integer)arguments.get(1));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_SECTION_NODE__STRING_INT_INT:
				return newSectionNode((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_SECTION_NODE__INT_INT_INT_INT:
				return newSectionNode((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_SECTION_NODE__STRING_INT_INT_INT_INT:
				return newSectionNode((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_SECTIONS:
				return getSections();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___CAN_NEW_SECTION:
				return canNewSection();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_SECTION__INT_INT:
				return newSection((Integer)arguments.get(0), (Integer)arguments.get(1));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_SECTION__STRING_INT_INT:
				return newSection((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_SECTION__INT_INT_INT_INT:
				return newSection((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_SECTION__STRING_INT_INT_INT_INT:
				return newSection((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___NEW_USER_SEQUENCE_GRAPH_MODEL__STRING_STRING_BOOLEAN:
				return newUserSequenceGraphModel((String)arguments.get(0), (String)arguments.get(1), (Boolean)arguments.get(2));
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL___GET_USER_SEQUENCE_GRAPH_MODEL_VIEW:
				return getUserSequenceGraphModelView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //UserSequenceGraphModelImpl
