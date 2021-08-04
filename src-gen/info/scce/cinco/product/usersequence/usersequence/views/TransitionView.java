/**
 */
package info.scce.cinco.product.usersequence.usersequence.views;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalTransition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.TransitionView#getInternalTransition <em>Internal Transition</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getTransitionView()
 * @model
 * @generated
 */
public interface TransitionView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Transition</em>' reference.
	 * @see #setInternalTransition(InternalTransition)
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getTransitionView_InternalTransition()
	 * @model
	 * @generated
	 */
	InternalTransition getInternalTransition();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.usersequence.usersequence.views.TransitionView#getInternalTransition <em>Internal Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Transition</em>' reference.
	 * @see #getInternalTransition()
	 * @generated
	 */
	void setInternalTransition(InternalTransition value);

} // TransitionView
