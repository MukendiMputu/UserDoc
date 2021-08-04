/**
 */
package info.scce.cinco.product.usersequence.usersequence.views;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalBaseURL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base URL View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.BaseURLView#getInternalBaseURL <em>Internal Base URL</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getBaseURLView()
 * @model
 * @generated
 */
public interface BaseURLView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Base URL</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Base URL</em>' reference.
	 * @see #setInternalBaseURL(InternalBaseURL)
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getBaseURLView_InternalBaseURL()
	 * @model
	 * @generated
	 */
	InternalBaseURL getInternalBaseURL();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.usersequence.usersequence.views.BaseURLView#getInternalBaseURL <em>Internal Base URL</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Base URL</em>' reference.
	 * @see #getInternalBaseURL()
	 * @generated
	 */
	void setInternalBaseURL(InternalBaseURL value);

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

} // BaseURLView
