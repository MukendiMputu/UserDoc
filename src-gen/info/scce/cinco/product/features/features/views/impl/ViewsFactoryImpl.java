/**
 */
package info.scce.cinco.product.features.features.views.impl;

import info.scce.cinco.product.features.features.views.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewsFactoryImpl extends EFactoryImpl implements ViewsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ViewsFactory init() {
		try {
			ViewsFactory theViewsFactory = (ViewsFactory)EPackage.Registry.INSTANCE.getEFactory(ViewsPackage.eNS_URI);
			if (theViewsFactory != null) {
				return theViewsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ViewsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ViewsPackage.START_NODE_VIEW: return createStartNodeView();
			case ViewsPackage.END_NODE_VIEW: return createEndNodeView();
			case ViewsPackage.FEATURE_CONTAINER_VIEW: return createFeatureContainerView();
			case ViewsPackage.DOC_NODE_VIEW: return createDocNodeView();
			case ViewsPackage.EDGE_VIEW: return createEdgeView();
			case ViewsPackage.LABELED_EDGE_VIEW: return createLabeledEdgeView();
			case ViewsPackage.FEATURES_GRAPH_MODEL_VIEW: return createFeaturesGraphModelView();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StartNodeView createStartNodeView() {
		StartNodeViewImpl startNodeView = new StartNodeViewImpl();
		return startNodeView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndNodeView createEndNodeView() {
		EndNodeViewImpl endNodeView = new EndNodeViewImpl();
		return endNodeView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureContainerView createFeatureContainerView() {
		FeatureContainerViewImpl featureContainerView = new FeatureContainerViewImpl();
		return featureContainerView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocNodeView createDocNodeView() {
		DocNodeViewImpl docNodeView = new DocNodeViewImpl();
		return docNodeView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EdgeView createEdgeView() {
		EdgeViewImpl edgeView = new EdgeViewImpl();
		return edgeView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledEdgeView createLabeledEdgeView() {
		LabeledEdgeViewImpl labeledEdgeView = new LabeledEdgeViewImpl();
		return labeledEdgeView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeaturesGraphModelView createFeaturesGraphModelView() {
		FeaturesGraphModelViewImpl featuresGraphModelView = new FeaturesGraphModelViewImpl();
		return featuresGraphModelView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewsPackage getViewsPackage() {
		return (ViewsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ViewsPackage getPackage() {
		return ViewsPackage.eINSTANCE;
	}

} //ViewsFactoryImpl
