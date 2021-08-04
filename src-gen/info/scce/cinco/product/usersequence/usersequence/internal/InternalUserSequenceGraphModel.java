/**
 */
package info.scce.cinco.product.usersequence.usersequence.internal;

import de.jabc.cinco.meta.core.mgl.model.constraints.ContainmentConstraint;

import graphmodel.internal.InternalGraphModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Sequence Graph Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalUserSequenceGraphModel#getModelName <em>Model Name</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalPackage#getInternalUserSequenceGraphModel()
 * @model
 * @generated
 */
public interface InternalUserSequenceGraphModel extends InternalGraphModel {
	/**
	 * Returns the value of the '<em><b>Model Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Name</em>' attribute.
	 * @see #setModelName(String)
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalPackage#getInternalUserSequenceGraphModel_ModelName()
	 * @model default=""
	 * @generated
	 */
	String getModelName();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalUserSequenceGraphModel#getModelName <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Name</em>' attribute.
	 * @see #getModelName()
	 * @generated
	 */
	void setModelName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="graphmodel.ContainmentConstraint"
	 * @generated
	 */
	EList<ContainmentConstraint> getContainmentConstraints();

} // InternalUserSequenceGraphModel
