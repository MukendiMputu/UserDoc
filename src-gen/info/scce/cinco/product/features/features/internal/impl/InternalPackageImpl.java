/**
 */
package info.scce.cinco.product.features.features.internal.impl;

import graphmodel.GraphmodelPackage;

import info.scce.cinco.product.features.features.FeaturesPackage;

import info.scce.cinco.product.features.features.impl.FeaturesPackageImpl;

import info.scce.cinco.product.features.features.internal.InternalFactory;
import info.scce.cinco.product.features.features.internal.InternalPackage;

import info.scce.cinco.product.features.features.views.ViewsPackage;

import info.scce.cinco.product.features.features.views.impl.ViewsPackageImpl;

import info.scce.cinco.product.usersequence.usersequence.UsersequencePackage;

import info.scce.cinco.product.usersequence.usersequence.impl.UsersequencePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InternalPackageImpl extends EPackageImpl implements InternalPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalStartNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalEndNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalFeatureContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalDocNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalLabeledEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalFeaturesGraphModelEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see info.scce.cinco.product.features.features.internal.InternalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InternalPackageImpl() {
		super(eNS_URI, InternalFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link InternalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static InternalPackage init() {
		if (isInited) return (InternalPackage)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredInternalPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		InternalPackageImpl theInternalPackage = registeredInternalPackage instanceof InternalPackageImpl ? (InternalPackageImpl)registeredInternalPackage : new InternalPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		GraphmodelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FeaturesPackage.eNS_URI);
		FeaturesPackageImpl theFeaturesPackage = (FeaturesPackageImpl)(registeredPackage instanceof FeaturesPackageImpl ? registeredPackage : FeaturesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI);
		ViewsPackageImpl theViewsPackage = (ViewsPackageImpl)(registeredPackage instanceof ViewsPackageImpl ? registeredPackage : ViewsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UsersequencePackage.eNS_URI);
		UsersequencePackageImpl theUsersequencePackage = (UsersequencePackageImpl)(registeredPackage instanceof UsersequencePackageImpl ? registeredPackage : UsersequencePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(info.scce.cinco.product.usersequence.usersequence.internal.InternalPackage.eNS_URI);
		info.scce.cinco.product.usersequence.usersequence.internal.impl.InternalPackageImpl theInternalPackage_1 = (info.scce.cinco.product.usersequence.usersequence.internal.impl.InternalPackageImpl)(registeredPackage instanceof info.scce.cinco.product.usersequence.usersequence.internal.impl.InternalPackageImpl ? registeredPackage : info.scce.cinco.product.usersequence.usersequence.internal.InternalPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage.eNS_URI);
		info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl theViewsPackage_1 = (info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl)(registeredPackage instanceof info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl ? registeredPackage : info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage.eINSTANCE);

		// Load packages
		theFeaturesPackage.loadPackage();
		theUsersequencePackage.loadPackage();

		// Fix loaded packages
		theInternalPackage.fixPackageContents();
		theFeaturesPackage.fixPackageContents();
		theViewsPackage.fixPackageContents();
		theUsersequencePackage.fixPackageContents();
		theInternalPackage_1.fixPackageContents();
		theViewsPackage_1.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theInternalPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InternalPackage.eNS_URI, theInternalPackage);
		return theInternalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalStartNode() {
		if (internalStartNodeEClass == null) {
			internalStartNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(0);
		}
		return internalStartNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalStartNode__GetOutgoingConstraints() {
        return getInternalStartNode().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalStartNode__GetEndNodeSuccessors() {
        return getInternalStartNode().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalStartNode__GetFeatureContainerSuccessors() {
        return getInternalStartNode().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalStartNode__GetDocNodeSuccessors() {
        return getInternalStartNode().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalEndNode() {
		if (internalEndNodeEClass == null) {
			internalEndNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(1);
		}
		return internalEndNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalEndNode__GetIncomingConstraints() {
        return getInternalEndNode().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalEndNode__GetStartNodePredecessors() {
        return getInternalEndNode().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalEndNode__GetFeatureContainerPredecessors() {
        return getInternalEndNode().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalEndNode__GetDocNodePredecessors() {
        return getInternalEndNode().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalFeatureContainer() {
		if (internalFeatureContainerEClass == null) {
			internalFeatureContainerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(2);
		}
		return internalFeatureContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalFeatureContainer_Title() {
        return (EAttribute)getInternalFeatureContainer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFeatureContainer__GetContainmentConstraints() {
        return getInternalFeatureContainer().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFeatureContainer__GetIncomingConstraints() {
        return getInternalFeatureContainer().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFeatureContainer__GetOutgoingConstraints() {
        return getInternalFeatureContainer().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFeatureContainer__GetStartNodePredecessors() {
        return getInternalFeatureContainer().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFeatureContainer__GetFeatureContainerPredecessors() {
        return getInternalFeatureContainer().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFeatureContainer__GetDocNodePredecessors() {
        return getInternalFeatureContainer().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFeatureContainer__GetEndNodeSuccessors() {
        return getInternalFeatureContainer().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFeatureContainer__GetFeatureContainerSuccessors() {
        return getInternalFeatureContainer().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFeatureContainer__GetDocNodeSuccessors() {
        return getInternalFeatureContainer().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalDocNode() {
		if (internalDocNodeEClass == null) {
			internalDocNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(3);
		}
		return internalDocNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalDocNode_CreateScreenshots() {
        return (EAttribute)getInternalDocNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalDocNode_LibraryComponentUID() {
        return (EAttribute)getInternalDocNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalDocNode__GetIncomingConstraints() {
        return getInternalDocNode().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalDocNode__GetOutgoingConstraints() {
        return getInternalDocNode().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalDocNode__GetStartNodePredecessors() {
        return getInternalDocNode().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalDocNode__GetFeatureContainerPredecessors() {
        return getInternalDocNode().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalDocNode__GetDocNodePredecessors() {
        return getInternalDocNode().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalDocNode__GetEndNodeSuccessors() {
        return getInternalDocNode().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalDocNode__GetFeatureContainerSuccessors() {
        return getInternalDocNode().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalDocNode__GetDocNodeSuccessors() {
        return getInternalDocNode().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalDocNode__GetMgl() {
        return getInternalDocNode().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalEdge() {
		if (internalEdgeEClass == null) {
			internalEdgeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(4);
		}
		return internalEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalLabeledEdge() {
		if (internalLabeledEdgeEClass == null) {
			internalLabeledEdgeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(5);
		}
		return internalLabeledEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalLabeledEdge_Label() {
        return (EAttribute)getInternalLabeledEdge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalFeaturesGraphModel() {
		if (internalFeaturesGraphModelEClass == null) {
			internalFeaturesGraphModelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(6);
		}
		return internalFeaturesGraphModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalFeaturesGraphModel_Name() {
        return (EAttribute)getInternalFeaturesGraphModel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFeaturesGraphModel__GetContainmentConstraints() {
        return getInternalFeaturesGraphModel().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalFactory getInternalFactory() {
		return (InternalFactory)getEFactoryInstance();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("info.scce.cinco.product.features.features.internal." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //InternalPackageImpl
