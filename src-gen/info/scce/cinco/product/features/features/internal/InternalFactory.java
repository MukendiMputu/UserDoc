/**
 */
package info.scce.cinco.product.features.features.internal;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.features.features.internal.InternalPackage
 * @generated
 */
public interface InternalFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InternalFactory eINSTANCE = info.scce.cinco.product.features.features.internal.impl.InternalFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Start Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Node</em>'.
	 * @generated
	 */
	InternalStartNode createInternalStartNode();

	/**
	 * Returns a new object of class '<em>End Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Node</em>'.
	 * @generated
	 */
	InternalEndNode createInternalEndNode();

	/**
	 * Returns a new object of class '<em>Feature Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Container</em>'.
	 * @generated
	 */
	InternalFeatureContainer createInternalFeatureContainer();

	/**
	 * Returns a new object of class '<em>Doc Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Doc Node</em>'.
	 * @generated
	 */
	InternalDocNode createInternalDocNode();

	/**
	 * Returns a new object of class '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge</em>'.
	 * @generated
	 */
	InternalEdge createInternalEdge();

	/**
	 * Returns a new object of class '<em>Labeled Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Labeled Edge</em>'.
	 * @generated
	 */
	InternalLabeledEdge createInternalLabeledEdge();

	/**
	 * Returns a new object of class '<em>Features Graph Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Features Graph Model</em>'.
	 * @generated
	 */
	InternalFeaturesGraphModel createInternalFeaturesGraphModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InternalPackage getInternalPackage();

} //InternalFactory
