/**
 */
package info.scce.cinco.product.usersequence.usersequence.views;

import info.scce.cinco.product.usersequence.usersequence.Screenshot;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalComment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.CommentView#getInternalComment <em>Internal Comment</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getCommentView()
 * @model
 * @generated
 */
public interface CommentView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Comment</em>' reference.
	 * @see #setInternalComment(InternalComment)
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getCommentView_InternalComment()
	 * @model
	 * @generated
	 */
	InternalComment getInternalComment();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.usersequence.usersequence.views.CommentView#getInternalComment <em>Internal Comment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Comment</em>' reference.
	 * @see #getInternalComment()
	 * @generated
	 */
	void setInternalComment(InternalComment value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getContent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setContent(String _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Screenshot getReferenceTo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setReferenceTo(Screenshot _arg);

} // CommentView
