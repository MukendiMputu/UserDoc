/**
 */
package info.scce.cinco.product.usersequence.usersequence.views;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalStop;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stop View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.StopView#getInternalStop <em>Internal Stop</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getStopView()
 * @model
 * @generated
 */
public interface StopView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Stop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Stop</em>' reference.
	 * @see #setInternalStop(InternalStop)
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getStopView_InternalStop()
	 * @model
	 * @generated
	 */
	InternalStop getInternalStop();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.usersequence.usersequence.views.StopView#getInternalStop <em>Internal Stop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Stop</em>' reference.
	 * @see #getInternalStop()
	 * @generated
	 */
	void setInternalStop(InternalStop value);

} // StopView
