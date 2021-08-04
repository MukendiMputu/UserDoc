/**
 */
package info.scce.cinco.product.usersequence.usersequence.internal;

import graphmodel.internal.InternalEdge;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labeled Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalLabeledTransition#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalPackage#getInternalLabeledTransition()
 * @model
 * @generated
 */
public interface InternalLabeledTransition extends InternalEdge {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalPackage#getInternalLabeledTransition_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalLabeledTransition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // InternalLabeledTransition
