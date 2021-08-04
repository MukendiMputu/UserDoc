/**
 */
package info.scce.cinco.product.usersequence.usersequence.internal;

import graphmodel.internal.InternalNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalDomain#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalPackage#getInternalDomain()
 * @model
 * @generated
 */
public interface InternalDomain extends InternalNode {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * The default value is <code>"com.example"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalPackage#getInternalDomain_Content()
	 * @model default="com.example"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalDomain#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

} // InternalDomain
