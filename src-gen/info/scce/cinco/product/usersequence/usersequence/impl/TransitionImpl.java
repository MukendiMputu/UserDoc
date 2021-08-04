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
import info.scce.cinco.product.usersequence.usersequence.UsersequencePackage;
import info.scce.cinco.product.usersequence.usersequence.WebElement;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalTransition;

import info.scce.cinco.product.usersequence.usersequence.views.TransitionView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TransitionImpl extends EdgeImpl implements Transition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsersequencePackage.eINSTANCE.getTransition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalTransition getInternalTransition() {
		return (info.scce.cinco.product.usersequence.usersequence.internal.InternalTransition) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyTransition() {
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
	public boolean canReconnectSource(final Start source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final Start source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final SubSequence source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final SubSequence source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final Screenshot source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final Screenshot source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final SectionNode source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final SectionNode source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final Navigation source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final Navigation source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final WebElement source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final WebElement source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final Div source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final Div source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final H source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final H source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final P source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final P source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final Span source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final Span source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final Label source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final Label source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final Form source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final Form source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final Input source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final Input source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final Textarea source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final Textarea source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final Button source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final Button source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final SelectBox source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final SelectBox source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final SelectBoxOption source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final SelectBoxOption source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final Table source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final Table source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final TableHead source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final TableHead source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final Th source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final Th source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final TableRow source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final TableRow source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final TableBody source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final TableBody source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final TableData source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final TableData source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final Section source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final Section source) {
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
	public boolean canReconnectTarget(final Stop target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final Stop target) {
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
	public TransitionView getTransitionView() {
		TransitionView transitionView = info.scce.cinco.product.usersequence.usersequence.views.ViewsFactory.eINSTANCE.createTransitionView();
		transitionView.setInternalTransition((info.scce.cinco.product.usersequence.usersequence.internal.InternalTransition)getInternalElement());
		return transitionView;
		
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return UsersequencePackage.TRANSITION___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return UsersequencePackage.TRANSITION___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return UsersequencePackage.TRANSITION___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___PRE_SAVE: return UsersequencePackage.TRANSITION___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT___POST_SAVE: return UsersequencePackage.TRANSITION___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Edge.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.EDGE___GET_SOURCE_ELEMENT: return UsersequencePackage.TRANSITION___GET_SOURCE_ELEMENT;
				case GraphmodelPackage.EDGE___GET_TARGET_ELEMENT: return UsersequencePackage.TRANSITION___GET_TARGET_ELEMENT;
				case GraphmodelPackage.EDGE___GET_POST_DELETE_FUNCTION: return UsersequencePackage.TRANSITION___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.EDGE___GET_POST_DELETE_EVENT: return UsersequencePackage.TRANSITION___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.EDGE___PRE_DELETE: return UsersequencePackage.TRANSITION___PRE_DELETE;
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
			case UsersequencePackage.TRANSITION___GET_INTERNAL_TRANSITION:
				return getInternalTransition();
			case UsersequencePackage.TRANSITION___IS_EXACTLY_TRANSITION:
				return isExactlyTransition();
			case UsersequencePackage.TRANSITION___PRE_DELETE:
				preDelete();
				return null;
			case UsersequencePackage.TRANSITION___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case UsersequencePackage.TRANSITION___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case UsersequencePackage.TRANSITION___PRE_SAVE:
				preSave();
				return null;
			case UsersequencePackage.TRANSITION___POST_SAVE:
				postSave();
				return null;
			case UsersequencePackage.TRANSITION___GET_ROOT_ELEMENT:
				return getRootElement();
			case UsersequencePackage.TRANSITION___GET_SOURCE_ELEMENT:
				return getSourceElement();
			case UsersequencePackage.TRANSITION___GET_TARGET_ELEMENT:
				return getTargetElement();
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_SOURCE__START:
				return canReconnectSource((Start)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_SOURCE__START:
				reconnectSource((Start)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_SOURCE__SUBSEQUENCE:
				return canReconnectSource((SubSequence)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_SOURCE__SUBSEQUENCE:
				reconnectSource((SubSequence)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_SOURCE__SCREENSHOT:
				return canReconnectSource((Screenshot)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_SOURCE__SCREENSHOT:
				reconnectSource((Screenshot)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_SOURCE__SECTIONNODE:
				return canReconnectSource((SectionNode)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_SOURCE__SECTIONNODE:
				reconnectSource((SectionNode)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_SOURCE__NAVIGATION:
				return canReconnectSource((Navigation)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_SOURCE__NAVIGATION:
				reconnectSource((Navigation)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_SOURCE__WEBELEMENT:
				return canReconnectSource((WebElement)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_SOURCE__WEBELEMENT:
				reconnectSource((WebElement)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_SOURCE__DIV:
				return canReconnectSource((Div)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_SOURCE__DIV:
				reconnectSource((Div)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_SOURCE__H:
				return canReconnectSource((H)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_SOURCE__H:
				reconnectSource((H)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_SOURCE__P:
				return canReconnectSource((P)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_SOURCE__P:
				reconnectSource((P)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_SOURCE__SPAN:
				return canReconnectSource((Span)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_SOURCE__SPAN:
				reconnectSource((Span)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_SOURCE__LABEL:
				return canReconnectSource((Label)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_SOURCE__LABEL:
				reconnectSource((Label)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_SOURCE__FORM:
				return canReconnectSource((Form)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_SOURCE__FORM:
				reconnectSource((Form)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_SOURCE__INPUT:
				return canReconnectSource((Input)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_SOURCE__INPUT:
				reconnectSource((Input)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_SOURCE__TEXTAREA:
				return canReconnectSource((Textarea)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_SOURCE__TEXTAREA:
				reconnectSource((Textarea)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_SOURCE__BUTTON:
				return canReconnectSource((Button)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_SOURCE__BUTTON:
				reconnectSource((Button)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_SOURCE__SELECTBOX:
				return canReconnectSource((SelectBox)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_SOURCE__SELECTBOX:
				reconnectSource((SelectBox)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_SOURCE__SELECTBOXOPTION:
				return canReconnectSource((SelectBoxOption)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_SOURCE__SELECTBOXOPTION:
				reconnectSource((SelectBoxOption)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_SOURCE__TABLE:
				return canReconnectSource((Table)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_SOURCE__TABLE:
				reconnectSource((Table)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_SOURCE__TABLEHEAD:
				return canReconnectSource((TableHead)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_SOURCE__TABLEHEAD:
				reconnectSource((TableHead)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_SOURCE__TH:
				return canReconnectSource((Th)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_SOURCE__TH:
				reconnectSource((Th)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_SOURCE__TABLEROW:
				return canReconnectSource((TableRow)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_SOURCE__TABLEROW:
				reconnectSource((TableRow)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_SOURCE__TABLEBODY:
				return canReconnectSource((TableBody)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_SOURCE__TABLEBODY:
				reconnectSource((TableBody)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_SOURCE__TABLEDATA:
				return canReconnectSource((TableData)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_SOURCE__TABLEDATA:
				reconnectSource((TableData)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_SOURCE__SECTION:
				return canReconnectSource((Section)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_SOURCE__SECTION:
				reconnectSource((Section)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_TARGET__P:
				return canReconnectTarget((P)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_TARGET__P:
				reconnectTarget((P)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_TARGET__TEXTAREA:
				return canReconnectTarget((Textarea)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_TARGET__TEXTAREA:
				reconnectTarget((Textarea)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_TARGET__SPAN:
				return canReconnectTarget((Span)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_TARGET__SPAN:
				reconnectTarget((Span)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_TARGET__TABLEBODY:
				return canReconnectTarget((TableBody)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_TARGET__TABLEBODY:
				reconnectTarget((TableBody)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_TARGET__SCREENSHOT:
				return canReconnectTarget((Screenshot)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_TARGET__SCREENSHOT:
				reconnectTarget((Screenshot)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_TARGET__FORM:
				return canReconnectTarget((Form)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_TARGET__FORM:
				reconnectTarget((Form)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_TARGET__NAVIGATION:
				return canReconnectTarget((Navigation)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_TARGET__NAVIGATION:
				reconnectTarget((Navigation)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_TARGET__SUBSEQUENCE:
				return canReconnectTarget((SubSequence)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_TARGET__SUBSEQUENCE:
				reconnectTarget((SubSequence)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_TARGET__STOP:
				return canReconnectTarget((Stop)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_TARGET__STOP:
				reconnectTarget((Stop)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_TARGET__TABLE:
				return canReconnectTarget((Table)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_TARGET__TABLE:
				reconnectTarget((Table)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_TARGET__LABEL:
				return canReconnectTarget((Label)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_TARGET__LABEL:
				reconnectTarget((Label)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_TARGET__TABLEROW:
				return canReconnectTarget((TableRow)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_TARGET__TABLEROW:
				reconnectTarget((TableRow)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_TARGET__SELECTBOX:
				return canReconnectTarget((SelectBox)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_TARGET__SELECTBOX:
				reconnectTarget((SelectBox)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_TARGET__TH:
				return canReconnectTarget((Th)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_TARGET__TH:
				reconnectTarget((Th)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_TARGET__SELECTBOXOPTION:
				return canReconnectTarget((SelectBoxOption)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_TARGET__SELECTBOXOPTION:
				reconnectTarget((SelectBoxOption)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_TARGET__INPUT:
				return canReconnectTarget((Input)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_TARGET__INPUT:
				reconnectTarget((Input)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_TARGET__TABLEDATA:
				return canReconnectTarget((TableData)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_TARGET__TABLEDATA:
				reconnectTarget((TableData)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_TARGET__WEBELEMENT:
				return canReconnectTarget((WebElement)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_TARGET__WEBELEMENT:
				reconnectTarget((WebElement)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_TARGET__DIV:
				return canReconnectTarget((Div)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_TARGET__DIV:
				reconnectTarget((Div)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_TARGET__BUTTON:
				return canReconnectTarget((Button)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_TARGET__BUTTON:
				reconnectTarget((Button)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_TARGET__SECTIONNODE:
				return canReconnectTarget((SectionNode)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_TARGET__SECTIONNODE:
				reconnectTarget((SectionNode)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_TARGET__H:
				return canReconnectTarget((H)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_TARGET__H:
				reconnectTarget((H)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_TARGET__TABLEHEAD:
				return canReconnectTarget((TableHead)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_TARGET__TABLEHEAD:
				reconnectTarget((TableHead)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___CAN_RECONNECT_TARGET__SECTION:
				return canReconnectTarget((Section)arguments.get(0));
			case UsersequencePackage.TRANSITION___RECONNECT_TARGET__SECTION:
				reconnectTarget((Section)arguments.get(0));
				return null;
			case UsersequencePackage.TRANSITION___GET_TRANSITION_VIEW:
				return getTransitionView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TransitionImpl
