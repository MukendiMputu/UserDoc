/**
 */
package info.scce.cinco.product.usersequence.usersequence.internal;

import graphmodel.internal.InternalNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base URL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalBaseURL#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalPackage#getInternalBaseURL()
 * @model
 * @generated
 */
public interface InternalBaseURL extends InternalNode {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * The default value is <code>"http://localhost"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalPackage#getInternalBaseURL_Content()
	 * @model default="http://localhost"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalBaseURL#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

} // InternalBaseURL
