/**
 */
package info.scce.cinco.product.usersequence.usersequence.views;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalDomain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.DomainView#getInternalDomain <em>Internal Domain</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getDomainView()
 * @model
 * @generated
 */
public interface DomainView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Domain</em>' reference.
	 * @see #setInternalDomain(InternalDomain)
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getDomainView_InternalDomain()
	 * @model
	 * @generated
	 */
	InternalDomain getInternalDomain();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.usersequence.usersequence.views.DomainView#getInternalDomain <em>Internal Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Domain</em>' reference.
	 * @see #getInternalDomain()
	 * @generated
	 */
	void setInternalDomain(InternalDomain value);

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

} // DomainView
