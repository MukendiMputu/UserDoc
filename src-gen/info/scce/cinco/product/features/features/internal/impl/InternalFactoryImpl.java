/**
 */
package info.scce.cinco.product.features.features.internal.impl;

import info.scce.cinco.product.features.features.internal.*;

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
public class InternalFactoryImpl extends EFactoryImpl implements InternalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InternalFactory init() {
		try {
			InternalFactory theInternalFactory = (InternalFactory)EPackage.Registry.INSTANCE.getEFactory(InternalPackage.eNS_URI);
			if (theInternalFactory != null) {
				return theInternalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InternalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalFactoryImpl() {
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
			case InternalPackage.INTERNAL_START_NODE: return createInternalStartNode();
			case InternalPackage.INTERNAL_END_NODE: return createInternalEndNode();
			case InternalPackage.INTERNAL_FEATURE_CONTAINER: return createInternalFeatureContainer();
			case InternalPackage.INTERNAL_DOC_NODE: return createInternalDocNode();
			case InternalPackage.INTERNAL_EDGE: return createInternalEdge();
			case InternalPackage.INTERNAL_LABELED_EDGE: return createInternalLabeledEdge();
			case InternalPackage.INTERNAL_FEATURES_GRAPH_MODEL: return createInternalFeaturesGraphModel();
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
	public InternalStartNode createInternalStartNode() {
		InternalStartNodeImpl internalStartNode = new InternalStartNodeImpl();
		return internalStartNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalEndNode createInternalEndNode() {
		InternalEndNodeImpl internalEndNode = new InternalEndNodeImpl();
		return internalEndNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalFeatureContainer createInternalFeatureContainer() {
		InternalFeatureContainerImpl internalFeatureContainer = new InternalFeatureContainerImpl();
		return internalFeatureContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalDocNode createInternalDocNode() {
		InternalDocNodeImpl internalDocNode = new InternalDocNodeImpl();
		return internalDocNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalEdge createInternalEdge() {
		InternalEdgeImpl internalEdge = new InternalEdgeImpl();
		return internalEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalLabeledEdge createInternalLabeledEdge() {
		InternalLabeledEdgeImpl internalLabeledEdge = new InternalLabeledEdgeImpl();
		return internalLabeledEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalFeaturesGraphModel createInternalFeaturesGraphModel() {
		InternalFeaturesGraphModelImpl internalFeaturesGraphModel = new InternalFeaturesGraphModelImpl();
		return internalFeaturesGraphModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalPackage getInternalPackage() {
		return (InternalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InternalPackage getPackage() {
		return InternalPackage.eINSTANCE;
	}

} //InternalFactoryImpl
