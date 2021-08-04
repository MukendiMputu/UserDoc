/**
 */
package info.scce.cinco.product.usersequence.usersequence.views;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalAnchor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anchor View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.AnchorView#getInternalAnchor <em>Internal Anchor</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getAnchorView()
 * @model
 * @generated
 */
public interface AnchorView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Anchor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Anchor</em>' reference.
	 * @see #setInternalAnchor(InternalAnchor)
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getAnchorView_InternalAnchor()
	 * @model
	 * @generated
	 */
	InternalAnchor getInternalAnchor();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.usersequence.usersequence.views.AnchorView#getInternalAnchor <em>Internal Anchor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Anchor</em>' reference.
	 * @see #getInternalAnchor()
	 * @generated
	 */
	void setInternalAnchor(InternalAnchor value);

} // AnchorView
