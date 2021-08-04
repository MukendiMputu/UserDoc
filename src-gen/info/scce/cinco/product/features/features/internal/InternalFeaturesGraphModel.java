/**
 */
package info.scce.cinco.product.features.features.internal;

import de.jabc.cinco.meta.core.mgl.model.constraints.ContainmentConstraint;

import graphmodel.internal.InternalGraphModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Features Graph Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.features.features.internal.InternalFeaturesGraphModel#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.features.features.internal.InternalPackage#getInternalFeaturesGraphModel()
 * @model
 * @generated
 */
public interface InternalFeaturesGraphModel extends InternalGraphModel {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see info.scce.cinco.product.features.features.internal.InternalPackage#getInternalFeaturesGraphModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.features.features.internal.InternalFeaturesGraphModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="graphmodel.ContainmentConstraint"
	 * @generated
	 */
	EList<ContainmentConstraint> getContainmentConstraints();

} // InternalFeaturesGraphModel
