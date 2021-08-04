/**
 */
package info.scce.cinco.product.usersequence.usersequence.views;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalLabeledTransition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labeled Transition View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.LabeledTransitionView#getInternalLabeledTransition <em>Internal Labeled Transition</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getLabeledTransitionView()
 * @model
 * @generated
 */
public interface LabeledTransitionView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Labeled Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Labeled Transition</em>' reference.
	 * @see #setInternalLabeledTransition(InternalLabeledTransition)
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getLabeledTransitionView_InternalLabeledTransition()
	 * @model
	 * @generated
	 */
	InternalLabeledTransition getInternalLabeledTransition();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.usersequence.usersequence.views.LabeledTransitionView#getInternalLabeledTransition <em>Internal Labeled Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Labeled Transition</em>' reference.
	 * @see #getInternalLabeledTransition()
	 * @generated
	 */
	void setInternalLabeledTransition(InternalLabeledTransition value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getLabel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setLabel(String _arg);

} // LabeledTransitionView
