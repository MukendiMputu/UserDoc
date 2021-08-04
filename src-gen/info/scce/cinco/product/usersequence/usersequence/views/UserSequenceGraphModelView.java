/**
 */
package info.scce.cinco.product.usersequence.usersequence.views;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalUserSequenceGraphModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Sequence Graph Model View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.UserSequenceGraphModelView#getInternalUserSequenceGraphModel <em>Internal User Sequence Graph Model</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getUserSequenceGraphModelView()
 * @model
 * @generated
 */
public interface UserSequenceGraphModelView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal User Sequence Graph Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal User Sequence Graph Model</em>' reference.
	 * @see #setInternalUserSequenceGraphModel(InternalUserSequenceGraphModel)
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getUserSequenceGraphModelView_InternalUserSequenceGraphModel()
	 * @model
	 * @generated
	 */
	InternalUserSequenceGraphModel getInternalUserSequenceGraphModel();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.usersequence.usersequence.views.UserSequenceGraphModelView#getInternalUserSequenceGraphModel <em>Internal User Sequence Graph Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal User Sequence Graph Model</em>' reference.
	 * @see #getInternalUserSequenceGraphModel()
	 * @generated
	 */
	void setInternalUserSequenceGraphModel(InternalUserSequenceGraphModel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getModelName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setModelName(String _arg);

} // UserSequenceGraphModelView
