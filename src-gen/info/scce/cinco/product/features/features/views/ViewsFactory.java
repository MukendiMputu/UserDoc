/**
 */
package info.scce.cinco.product.features.features.views;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.features.features.views.ViewsPackage
 * @generated
 */
public interface ViewsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViewsFactory eINSTANCE = info.scce.cinco.product.features.features.views.impl.ViewsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Start Node View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Node View</em>'.
	 * @generated
	 */
	StartNodeView createStartNodeView();

	/**
	 * Returns a new object of class '<em>End Node View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Node View</em>'.
	 * @generated
	 */
	EndNodeView createEndNodeView();

	/**
	 * Returns a new object of class '<em>Feature Container View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Container View</em>'.
	 * @generated
	 */
	FeatureContainerView createFeatureContainerView();

	/**
	 * Returns a new object of class '<em>Doc Node View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Doc Node View</em>'.
	 * @generated
	 */
	DocNodeView createDocNodeView();

	/**
	 * Returns a new object of class '<em>Edge View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge View</em>'.
	 * @generated
	 */
	EdgeView createEdgeView();

	/**
	 * Returns a new object of class '<em>Labeled Edge View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Labeled Edge View</em>'.
	 * @generated
	 */
	LabeledEdgeView createLabeledEdgeView();

	/**
	 * Returns a new object of class '<em>Features Graph Model View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Features Graph Model View</em>'.
	 * @generated
	 */
	FeaturesGraphModelView createFeaturesGraphModelView();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ViewsPackage getViewsPackage();

} //ViewsFactory
