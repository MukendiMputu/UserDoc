/**
 */
package info.scce.cinco.product.features.features.views;

import info.scce.cinco.product.features.features.internal.InternalFeaturesGraphModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Features Graph Model View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.features.features.views.FeaturesGraphModelView#getInternalFeaturesGraphModel <em>Internal Features Graph Model</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.features.features.views.ViewsPackage#getFeaturesGraphModelView()
 * @model
 * @generated
 */
public interface FeaturesGraphModelView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Features Graph Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Features Graph Model</em>' reference.
	 * @see #setInternalFeaturesGraphModel(InternalFeaturesGraphModel)
	 * @see info.scce.cinco.product.features.features.views.ViewsPackage#getFeaturesGraphModelView_InternalFeaturesGraphModel()
	 * @model
	 * @generated
	 */
	InternalFeaturesGraphModel getInternalFeaturesGraphModel();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.features.features.views.FeaturesGraphModelView#getInternalFeaturesGraphModel <em>Internal Features Graph Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Features Graph Model</em>' reference.
	 * @see #getInternalFeaturesGraphModel()
	 * @generated
	 */
	void setInternalFeaturesGraphModel(InternalFeaturesGraphModel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setName(String _arg);

} // FeaturesGraphModelView
