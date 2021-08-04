/**
 */
package info.scce.cinco.product.features.features;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.features.features.FeaturesPackage
 * @generated
 */
public interface FeaturesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeaturesFactory eINSTANCE = info.scce.cinco.product.features.features.impl.FeaturesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Start Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Node</em>'.
	 * @generated
	 */
	StartNode createStartNode();

	/**
	 * Returns a new object of class '<em>End Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Node</em>'.
	 * @generated
	 */
	EndNode createEndNode();

	/**
	 * Returns a new object of class '<em>Feature Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Container</em>'.
	 * @generated
	 */
	FeatureContainer createFeatureContainer();

	/**
	 * Returns a new object of class '<em>Doc Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Doc Node</em>'.
	 * @generated
	 */
	DocNode createDocNode();

	/**
	 * Returns a new object of class '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge</em>'.
	 * @generated
	 */
	Edge createEdge();

	/**
	 * Returns a new object of class '<em>Labeled Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Labeled Edge</em>'.
	 * @generated
	 */
	LabeledEdge createLabeledEdge();

	/**
	 * Returns a new object of class '<em>Graph Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graph Model</em>'.
	 * @generated
	 */
	FeaturesGraphModel createFeaturesGraphModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FeaturesPackage getFeaturesPackage();

} //FeaturesFactory
