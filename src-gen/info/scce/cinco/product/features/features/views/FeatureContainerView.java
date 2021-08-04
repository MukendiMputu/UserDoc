/**
 */
package info.scce.cinco.product.features.features.views;

import info.scce.cinco.product.features.features.internal.InternalFeatureContainer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Container View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.features.features.views.FeatureContainerView#getInternalFeatureContainer <em>Internal Feature Container</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.features.features.views.ViewsPackage#getFeatureContainerView()
 * @model
 * @generated
 */
public interface FeatureContainerView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Feature Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Feature Container</em>' reference.
	 * @see #setInternalFeatureContainer(InternalFeatureContainer)
	 * @see info.scce.cinco.product.features.features.views.ViewsPackage#getFeatureContainerView_InternalFeatureContainer()
	 * @model
	 * @generated
	 */
	InternalFeatureContainer getInternalFeatureContainer();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.features.features.views.FeatureContainerView#getInternalFeatureContainer <em>Internal Feature Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Feature Container</em>' reference.
	 * @see #getInternalFeatureContainer()
	 * @generated
	 */
	void setInternalFeatureContainer(InternalFeatureContainer value);

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

} // FeatureContainerView
