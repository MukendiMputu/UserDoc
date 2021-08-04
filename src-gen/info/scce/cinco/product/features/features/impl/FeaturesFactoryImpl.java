/**
 */
package info.scce.cinco.product.features.features.impl;

import info.scce.cinco.product.features.features.*;

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
public class FeaturesFactoryImpl extends EFactoryImpl implements FeaturesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FeaturesFactory init() {
		try {
			FeaturesFactory theFeaturesFactory = (FeaturesFactory)EPackage.Registry.INSTANCE.getEFactory(FeaturesPackage.eNS_URI);
			if (theFeaturesFactory != null) {
				return theFeaturesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FeaturesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturesFactoryImpl() {
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
			case FeaturesPackage.START_NODE: return createStartNode();
			case FeaturesPackage.END_NODE: return createEndNode();
			case FeaturesPackage.FEATURE_CONTAINER: return createFeatureContainer();
			case FeaturesPackage.DOC_NODE: return createDocNode();
			case FeaturesPackage.EDGE: return createEdge();
			case FeaturesPackage.LABELED_EDGE: return createLabeledEdge();
			case FeaturesPackage.FEATURES_GRAPH_MODEL: return createFeaturesGraphModel();
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
	public StartNode createStartNode() {
		StartNodeImpl startNode = new StartNodeImpl();
		return startNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndNode createEndNode() {
		EndNodeImpl endNode = new EndNodeImpl();
		return endNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureContainer createFeatureContainer() {
		FeatureContainerImpl featureContainer = new FeatureContainerImpl();
		return featureContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocNode createDocNode() {
		DocNodeImpl docNode = new DocNodeImpl();
		return docNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Edge createEdge() {
		EdgeImpl edge = new EdgeImpl();
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledEdge createLabeledEdge() {
		LabeledEdgeImpl labeledEdge = new LabeledEdgeImpl();
		return labeledEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeaturesGraphModel createFeaturesGraphModel() {
		FeaturesGraphModelImpl featuresGraphModel = new FeaturesGraphModelImpl();
		return featuresGraphModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeaturesPackage getFeaturesPackage() {
		return (FeaturesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FeaturesPackage getPackage() {
		return FeaturesPackage.eINSTANCE;
	}

} //FeaturesFactoryImpl
