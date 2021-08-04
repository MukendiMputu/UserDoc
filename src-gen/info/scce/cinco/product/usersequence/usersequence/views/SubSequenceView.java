/**
 */
package info.scce.cinco.product.usersequence.usersequence.views;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalSubSequence;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Sequence View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.SubSequenceView#getInternalSubSequence <em>Internal Sub Sequence</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getSubSequenceView()
 * @model
 * @generated
 */
public interface SubSequenceView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Sub Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Sub Sequence</em>' reference.
	 * @see #setInternalSubSequence(InternalSubSequence)
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getSubSequenceView_InternalSubSequence()
	 * @model
	 * @generated
	 */
	InternalSubSequence getInternalSubSequence();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.usersequence.usersequence.views.SubSequenceView#getInternalSubSequence <em>Internal Sub Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Sub Sequence</em>' reference.
	 * @see #getInternalSubSequence()
	 * @generated
	 */
	void setInternalSubSequence(InternalSubSequence value);

} // SubSequenceView
