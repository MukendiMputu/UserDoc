/**
 */
package info.scce.cinco.product.usersequence.usersequence.views;

import info.scce.cinco.product.usersequence.usersequence.Comment;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalScreenshot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Screenshot View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.ScreenshotView#getInternalScreenshot <em>Internal Screenshot</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getScreenshotView()
 * @model
 * @generated
 */
public interface ScreenshotView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Screenshot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Screenshot</em>' reference.
	 * @see #setInternalScreenshot(InternalScreenshot)
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getScreenshotView_InternalScreenshot()
	 * @model
	 * @generated
	 */
	InternalScreenshot getInternalScreenshot();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.usersequence.usersequence.views.ScreenshotView#getInternalScreenshot <em>Internal Screenshot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Screenshot</em>' reference.
	 * @see #getInternalScreenshot()
	 * @generated
	 */
	void setInternalScreenshot(InternalScreenshot value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Comment getDescription();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setDescription(Comment _arg);

} // ScreenshotView
