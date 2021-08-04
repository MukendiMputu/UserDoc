/**
 */
package info.scce.cinco.product.usersequence.usersequence.views;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalSection;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.SectionView#getInternalSection <em>Internal Section</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getSectionView()
 * @model
 * @generated
 */
public interface SectionView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Section</em>' reference.
	 * @see #setInternalSection(InternalSection)
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#getSectionView_InternalSection()
	 * @model
	 * @generated
	 */
	InternalSection getInternalSection();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.usersequence.usersequence.views.SectionView#getInternalSection <em>Internal Section</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Section</em>' reference.
	 * @see #getInternalSection()
	 * @generated
	 */
	void setInternalSection(InternalSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isHighlighted();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setHighlighted(boolean _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getTitle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setTitle(String _arg);

} // SectionView
