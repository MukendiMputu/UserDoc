/**
 */
package info.scce.cinco.product.features.features.views;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.features.features.views.ViewsFactory
 * @model kind="package"
 * @generated
 */
public interface ViewsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "views";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cinco.scce.info/product/features/views";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "features-views";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViewsPackage eINSTANCE = info.scce.cinco.product.features.features.views.impl.ViewsPackageImpl.init();

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.features.features.views.impl.StartNodeViewImpl <em>Start Node View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.features.features.views.impl.StartNodeViewImpl
	 * @see info.scce.cinco.product.features.features.views.impl.ViewsPackageImpl#getStartNodeView()
	 * @generated
	 */
	int START_NODE_VIEW = 0;

	/**
	 * The feature id for the '<em><b>Internal Start Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE_VIEW__INTERNAL_START_NODE = 0;

	/**
	 * The number of structural features of the '<em>Start Node View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE_VIEW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Start Node View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE_VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.features.features.views.impl.EndNodeViewImpl <em>End Node View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.features.features.views.impl.EndNodeViewImpl
	 * @see info.scce.cinco.product.features.features.views.impl.ViewsPackageImpl#getEndNodeView()
	 * @generated
	 */
	int END_NODE_VIEW = 1;

	/**
	 * The feature id for the '<em><b>Internal End Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE_VIEW__INTERNAL_END_NODE = 0;

	/**
	 * The number of structural features of the '<em>End Node View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE_VIEW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>End Node View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE_VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.features.features.views.impl.FeatureContainerViewImpl <em>Feature Container View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.features.features.views.impl.FeatureContainerViewImpl
	 * @see info.scce.cinco.product.features.features.views.impl.ViewsPackageImpl#getFeatureContainerView()
	 * @generated
	 */
	int FEATURE_CONTAINER_VIEW = 2;

	/**
	 * The feature id for the '<em><b>Internal Feature Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER_VIEW__INTERNAL_FEATURE_CONTAINER = 0;

	/**
	 * The number of structural features of the '<em>Feature Container View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER_VIEW___GET_TITLE = 0;

	/**
	 * The operation id for the '<em>Set Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER_VIEW___SET_TITLE__STRING = 1;

	/**
	 * The number of operations of the '<em>Feature Container View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER_VIEW_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.features.features.views.impl.DocNodeViewImpl <em>Doc Node View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.features.features.views.impl.DocNodeViewImpl
	 * @see info.scce.cinco.product.features.features.views.impl.ViewsPackageImpl#getDocNodeView()
	 * @generated
	 */
	int DOC_NODE_VIEW = 3;

	/**
	 * The feature id for the '<em><b>Internal Doc Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE_VIEW__INTERNAL_DOC_NODE = 0;

	/**
	 * The number of structural features of the '<em>Doc Node View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Is Create Screenshots</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE_VIEW___IS_CREATE_SCREENSHOTS = 0;

	/**
	 * The operation id for the '<em>Set Create Screenshots</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE_VIEW___SET_CREATE_SCREENSHOTS__BOOLEAN = 1;

	/**
	 * The number of operations of the '<em>Doc Node View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE_VIEW_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.features.features.views.impl.EdgeViewImpl <em>Edge View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.features.features.views.impl.EdgeViewImpl
	 * @see info.scce.cinco.product.features.features.views.impl.ViewsPackageImpl#getEdgeView()
	 * @generated
	 */
	int EDGE_VIEW = 4;

	/**
	 * The feature id for the '<em><b>Internal Edge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_VIEW__INTERNAL_EDGE = 0;

	/**
	 * The number of structural features of the '<em>Edge View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_VIEW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Edge View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.features.features.views.impl.LabeledEdgeViewImpl <em>Labeled Edge View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.features.features.views.impl.LabeledEdgeViewImpl
	 * @see info.scce.cinco.product.features.features.views.impl.ViewsPackageImpl#getLabeledEdgeView()
	 * @generated
	 */
	int LABELED_EDGE_VIEW = 5;

	/**
	 * The feature id for the '<em><b>Internal Labeled Edge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE_VIEW__INTERNAL_LABELED_EDGE = 0;

	/**
	 * The number of structural features of the '<em>Labeled Edge View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE_VIEW___GET_LABEL = 0;

	/**
	 * The operation id for the '<em>Set Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE_VIEW___SET_LABEL__STRING = 1;

	/**
	 * The number of operations of the '<em>Labeled Edge View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE_VIEW_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.features.features.views.impl.FeaturesGraphModelViewImpl <em>Features Graph Model View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.features.features.views.impl.FeaturesGraphModelViewImpl
	 * @see info.scce.cinco.product.features.features.views.impl.ViewsPackageImpl#getFeaturesGraphModelView()
	 * @generated
	 */
	int FEATURES_GRAPH_MODEL_VIEW = 6;

	/**
	 * The feature id for the '<em><b>Internal Features Graph Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL_VIEW__INTERNAL_FEATURES_GRAPH_MODEL = 0;

	/**
	 * The number of structural features of the '<em>Features Graph Model View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL_VIEW___GET_NAME = 0;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL_VIEW___SET_NAME__STRING = 1;

	/**
	 * The number of operations of the '<em>Features Graph Model View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL_VIEW_OPERATION_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.features.features.views.StartNodeView <em>Start Node View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Node View</em>'.
	 * @see info.scce.cinco.product.features.features.views.StartNodeView
	 * @generated
	 */
	EClass getStartNodeView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.features.features.views.StartNodeView#getInternalStartNode <em>Internal Start Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Start Node</em>'.
	 * @see info.scce.cinco.product.features.features.views.StartNodeView#getInternalStartNode()
	 * @see #getStartNodeView()
	 * @generated
	 */
	EReference getStartNodeView_InternalStartNode();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.features.features.views.EndNodeView <em>End Node View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Node View</em>'.
	 * @see info.scce.cinco.product.features.features.views.EndNodeView
	 * @generated
	 */
	EClass getEndNodeView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.features.features.views.EndNodeView#getInternalEndNode <em>Internal End Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal End Node</em>'.
	 * @see info.scce.cinco.product.features.features.views.EndNodeView#getInternalEndNode()
	 * @see #getEndNodeView()
	 * @generated
	 */
	EReference getEndNodeView_InternalEndNode();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.features.features.views.FeatureContainerView <em>Feature Container View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Container View</em>'.
	 * @see info.scce.cinco.product.features.features.views.FeatureContainerView
	 * @generated
	 */
	EClass getFeatureContainerView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.features.features.views.FeatureContainerView#getInternalFeatureContainer <em>Internal Feature Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Feature Container</em>'.
	 * @see info.scce.cinco.product.features.features.views.FeatureContainerView#getInternalFeatureContainer()
	 * @see #getFeatureContainerView()
	 * @generated
	 */
	EReference getFeatureContainerView_InternalFeatureContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.views.FeatureContainerView#getTitle() <em>Get Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Title</em>' operation.
	 * @see info.scce.cinco.product.features.features.views.FeatureContainerView#getTitle()
	 * @generated
	 */
	EOperation getFeatureContainerView__GetTitle();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.views.FeatureContainerView#setTitle(java.lang.String) <em>Set Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Title</em>' operation.
	 * @see info.scce.cinco.product.features.features.views.FeatureContainerView#setTitle(java.lang.String)
	 * @generated
	 */
	EOperation getFeatureContainerView__SetTitle__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.features.features.views.DocNodeView <em>Doc Node View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doc Node View</em>'.
	 * @see info.scce.cinco.product.features.features.views.DocNodeView
	 * @generated
	 */
	EClass getDocNodeView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.features.features.views.DocNodeView#getInternalDocNode <em>Internal Doc Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Doc Node</em>'.
	 * @see info.scce.cinco.product.features.features.views.DocNodeView#getInternalDocNode()
	 * @see #getDocNodeView()
	 * @generated
	 */
	EReference getDocNodeView_InternalDocNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.views.DocNodeView#isCreateScreenshots() <em>Is Create Screenshots</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Create Screenshots</em>' operation.
	 * @see info.scce.cinco.product.features.features.views.DocNodeView#isCreateScreenshots()
	 * @generated
	 */
	EOperation getDocNodeView__IsCreateScreenshots();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.views.DocNodeView#setCreateScreenshots(boolean) <em>Set Create Screenshots</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Create Screenshots</em>' operation.
	 * @see info.scce.cinco.product.features.features.views.DocNodeView#setCreateScreenshots(boolean)
	 * @generated
	 */
	EOperation getDocNodeView__SetCreateScreenshots__boolean();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.features.features.views.EdgeView <em>Edge View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge View</em>'.
	 * @see info.scce.cinco.product.features.features.views.EdgeView
	 * @generated
	 */
	EClass getEdgeView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.features.features.views.EdgeView#getInternalEdge <em>Internal Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Edge</em>'.
	 * @see info.scce.cinco.product.features.features.views.EdgeView#getInternalEdge()
	 * @see #getEdgeView()
	 * @generated
	 */
	EReference getEdgeView_InternalEdge();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.features.features.views.LabeledEdgeView <em>Labeled Edge View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labeled Edge View</em>'.
	 * @see info.scce.cinco.product.features.features.views.LabeledEdgeView
	 * @generated
	 */
	EClass getLabeledEdgeView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.features.features.views.LabeledEdgeView#getInternalLabeledEdge <em>Internal Labeled Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Labeled Edge</em>'.
	 * @see info.scce.cinco.product.features.features.views.LabeledEdgeView#getInternalLabeledEdge()
	 * @see #getLabeledEdgeView()
	 * @generated
	 */
	EReference getLabeledEdgeView_InternalLabeledEdge();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.views.LabeledEdgeView#getLabel() <em>Get Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Label</em>' operation.
	 * @see info.scce.cinco.product.features.features.views.LabeledEdgeView#getLabel()
	 * @generated
	 */
	EOperation getLabeledEdgeView__GetLabel();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.views.LabeledEdgeView#setLabel(java.lang.String) <em>Set Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Label</em>' operation.
	 * @see info.scce.cinco.product.features.features.views.LabeledEdgeView#setLabel(java.lang.String)
	 * @generated
	 */
	EOperation getLabeledEdgeView__SetLabel__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.features.features.views.FeaturesGraphModelView <em>Features Graph Model View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Features Graph Model View</em>'.
	 * @see info.scce.cinco.product.features.features.views.FeaturesGraphModelView
	 * @generated
	 */
	EClass getFeaturesGraphModelView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.features.features.views.FeaturesGraphModelView#getInternalFeaturesGraphModel <em>Internal Features Graph Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Features Graph Model</em>'.
	 * @see info.scce.cinco.product.features.features.views.FeaturesGraphModelView#getInternalFeaturesGraphModel()
	 * @see #getFeaturesGraphModelView()
	 * @generated
	 */
	EReference getFeaturesGraphModelView_InternalFeaturesGraphModel();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.views.FeaturesGraphModelView#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see info.scce.cinco.product.features.features.views.FeaturesGraphModelView#getName()
	 * @generated
	 */
	EOperation getFeaturesGraphModelView__GetName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.views.FeaturesGraphModelView#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see info.scce.cinco.product.features.features.views.FeaturesGraphModelView#setName(java.lang.String)
	 * @generated
	 */
	EOperation getFeaturesGraphModelView__SetName__String();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ViewsFactory getViewsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.features.features.views.impl.StartNodeViewImpl <em>Start Node View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.features.features.views.impl.StartNodeViewImpl
		 * @see info.scce.cinco.product.features.features.views.impl.ViewsPackageImpl#getStartNodeView()
		 * @generated
		 */
		EClass START_NODE_VIEW = eINSTANCE.getStartNodeView();

		/**
		 * The meta object literal for the '<em><b>Internal Start Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_NODE_VIEW__INTERNAL_START_NODE = eINSTANCE.getStartNodeView_InternalStartNode();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.features.features.views.impl.EndNodeViewImpl <em>End Node View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.features.features.views.impl.EndNodeViewImpl
		 * @see info.scce.cinco.product.features.features.views.impl.ViewsPackageImpl#getEndNodeView()
		 * @generated
		 */
		EClass END_NODE_VIEW = eINSTANCE.getEndNodeView();

		/**
		 * The meta object literal for the '<em><b>Internal End Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_NODE_VIEW__INTERNAL_END_NODE = eINSTANCE.getEndNodeView_InternalEndNode();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.features.features.views.impl.FeatureContainerViewImpl <em>Feature Container View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.features.features.views.impl.FeatureContainerViewImpl
		 * @see info.scce.cinco.product.features.features.views.impl.ViewsPackageImpl#getFeatureContainerView()
		 * @generated
		 */
		EClass FEATURE_CONTAINER_VIEW = eINSTANCE.getFeatureContainerView();

		/**
		 * The meta object literal for the '<em><b>Internal Feature Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_CONTAINER_VIEW__INTERNAL_FEATURE_CONTAINER = eINSTANCE.getFeatureContainerView_InternalFeatureContainer();

		/**
		 * The meta object literal for the '<em><b>Get Title</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEATURE_CONTAINER_VIEW___GET_TITLE = eINSTANCE.getFeatureContainerView__GetTitle();

		/**
		 * The meta object literal for the '<em><b>Set Title</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEATURE_CONTAINER_VIEW___SET_TITLE__STRING = eINSTANCE.getFeatureContainerView__SetTitle__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.features.features.views.impl.DocNodeViewImpl <em>Doc Node View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.features.features.views.impl.DocNodeViewImpl
		 * @see info.scce.cinco.product.features.features.views.impl.ViewsPackageImpl#getDocNodeView()
		 * @generated
		 */
		EClass DOC_NODE_VIEW = eINSTANCE.getDocNodeView();

		/**
		 * The meta object literal for the '<em><b>Internal Doc Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_NODE_VIEW__INTERNAL_DOC_NODE = eINSTANCE.getDocNodeView_InternalDocNode();

		/**
		 * The meta object literal for the '<em><b>Is Create Screenshots</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOC_NODE_VIEW___IS_CREATE_SCREENSHOTS = eINSTANCE.getDocNodeView__IsCreateScreenshots();

		/**
		 * The meta object literal for the '<em><b>Set Create Screenshots</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOC_NODE_VIEW___SET_CREATE_SCREENSHOTS__BOOLEAN = eINSTANCE.getDocNodeView__SetCreateScreenshots__boolean();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.features.features.views.impl.EdgeViewImpl <em>Edge View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.features.features.views.impl.EdgeViewImpl
		 * @see info.scce.cinco.product.features.features.views.impl.ViewsPackageImpl#getEdgeView()
		 * @generated
		 */
		EClass EDGE_VIEW = eINSTANCE.getEdgeView();

		/**
		 * The meta object literal for the '<em><b>Internal Edge</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_VIEW__INTERNAL_EDGE = eINSTANCE.getEdgeView_InternalEdge();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.features.features.views.impl.LabeledEdgeViewImpl <em>Labeled Edge View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.features.features.views.impl.LabeledEdgeViewImpl
		 * @see info.scce.cinco.product.features.features.views.impl.ViewsPackageImpl#getLabeledEdgeView()
		 * @generated
		 */
		EClass LABELED_EDGE_VIEW = eINSTANCE.getLabeledEdgeView();

		/**
		 * The meta object literal for the '<em><b>Internal Labeled Edge</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABELED_EDGE_VIEW__INTERNAL_LABELED_EDGE = eINSTANCE.getLabeledEdgeView_InternalLabeledEdge();

		/**
		 * The meta object literal for the '<em><b>Get Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LABELED_EDGE_VIEW___GET_LABEL = eINSTANCE.getLabeledEdgeView__GetLabel();

		/**
		 * The meta object literal for the '<em><b>Set Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LABELED_EDGE_VIEW___SET_LABEL__STRING = eINSTANCE.getLabeledEdgeView__SetLabel__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.features.features.views.impl.FeaturesGraphModelViewImpl <em>Features Graph Model View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.features.features.views.impl.FeaturesGraphModelViewImpl
		 * @see info.scce.cinco.product.features.features.views.impl.ViewsPackageImpl#getFeaturesGraphModelView()
		 * @generated
		 */
		EClass FEATURES_GRAPH_MODEL_VIEW = eINSTANCE.getFeaturesGraphModelView();

		/**
		 * The meta object literal for the '<em><b>Internal Features Graph Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURES_GRAPH_MODEL_VIEW__INTERNAL_FEATURES_GRAPH_MODEL = eINSTANCE.getFeaturesGraphModelView_InternalFeaturesGraphModel();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEATURES_GRAPH_MODEL_VIEW___GET_NAME = eINSTANCE.getFeaturesGraphModelView__GetName();

		/**
		 * The meta object literal for the '<em><b>Set Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEATURES_GRAPH_MODEL_VIEW___SET_NAME__STRING = eINSTANCE.getFeaturesGraphModelView__SetName__String();

	}

} //ViewsPackage
