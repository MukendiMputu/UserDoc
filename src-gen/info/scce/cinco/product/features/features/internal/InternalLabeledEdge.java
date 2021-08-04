/**
 */
package info.scce.cinco.product.features.features.internal;

import graphmodel.internal.InternalEdge;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labeled Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.features.features.internal.InternalLabeledEdge#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.features.features.internal.InternalPackage#getInternalLabeledEdge()
 * @model
 * @generated
 */
public interface InternalLabeledEdge extends InternalEdge {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see info.scce.cinco.product.features.features.internal.InternalPackage#getInternalLabeledEdge_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.features.features.internal.InternalLabeledEdge#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // InternalLabeledEdge
