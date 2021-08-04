/**
 */
package info.scce.cinco.product.usersequence.usersequence.views;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalNavigation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.NavigationView#getInternalNavigation <em>Internal Navigation</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getNavigationView()
 * @model
 * @generated
 */
public interface NavigationView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Navigation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Navigation</em>' reference.
	 * @see #setInternalNavigation(InternalNavigation)
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getNavigationView_InternalNavigation()
	 * @model
	 * @generated
	 */
	InternalNavigation getInternalNavigation();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.usersequence.usersequence.views.NavigationView#getInternalNavigation <em>Internal Navigation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Navigation</em>' reference.
	 * @see #getInternalNavigation()
	 * @generated
	 */
	void setInternalNavigation(InternalNavigation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getLink();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setLink(String _arg);

} // NavigationView
