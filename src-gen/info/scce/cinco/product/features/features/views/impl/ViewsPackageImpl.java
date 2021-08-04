/**
 */
package info.scce.cinco.product.features.features.views.impl;

import graphmodel.GraphmodelPackage;

import info.scce.cinco.product.features.features.FeaturesPackage;

import info.scce.cinco.product.features.features.impl.FeaturesPackageImpl;

import info.scce.cinco.product.features.features.internal.InternalPackage;

import info.scce.cinco.product.features.features.internal.impl.InternalPackageImpl;

import info.scce.cinco.product.features.features.views.ViewsFactory;
import info.scce.cinco.product.features.features.views.ViewsPackage;

import info.scce.cinco.product.usersequence.usersequence.UsersequencePackage;

import info.scce.cinco.product.usersequence.usersequence.impl.UsersequencePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewsPackageImpl extends EPackageImpl implements ViewsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startNodeViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endNodeViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureContainerViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass docNodeViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labeledEdgeViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featuresGraphModelViewEClass = null;

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
	 * @see info.scce.cinco.product.features.features.views.ViewsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ViewsPackageImpl() {
		super(eNS_URI, ViewsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ViewsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static ViewsPackage init() {
		if (isInited) return (ViewsPackage)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredViewsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ViewsPackageImpl theViewsPackage = registeredViewsPackage instanceof ViewsPackageImpl ? (ViewsPackageImpl)registeredViewsPackage : new ViewsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		GraphmodelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FeaturesPackage.eNS_URI);
		FeaturesPackageImpl theFeaturesPackage = (FeaturesPackageImpl)(registeredPackage instanceof FeaturesPackageImpl ? registeredPackage : FeaturesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI);
		InternalPackageImpl theInternalPackage = (InternalPackageImpl)(registeredPackage instanceof InternalPackageImpl ? registeredPackage : InternalPackage.eINSTANCE);
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
		theViewsPackage.fixPackageContents();
		theFeaturesPackage.fixPackageContents();
		theInternalPackage.fixPackageContents();
		theUsersequencePackage.fixPackageContents();
		theInternalPackage_1.fixPackageContents();
		theViewsPackage_1.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theViewsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ViewsPackage.eNS_URI, theViewsPackage);
		return theViewsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStartNodeView() {
		if (startNodeViewEClass == null) {
			startNodeViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(0);
		}
		return startNodeViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStartNodeView_InternalStartNode() {
        return (EReference)getStartNodeView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEndNodeView() {
		if (endNodeViewEClass == null) {
			endNodeViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(1);
		}
		return endNodeViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEndNodeView_InternalEndNode() {
        return (EReference)getEndNodeView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureContainerView() {
		if (featureContainerViewEClass == null) {
			featureContainerViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(2);
		}
		return featureContainerViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureContainerView_InternalFeatureContainer() {
        return (EReference)getFeatureContainerView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFeatureContainerView__GetTitle() {
        return getFeatureContainerView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFeatureContainerView__SetTitle__String() {
        return getFeatureContainerView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocNodeView() {
		if (docNodeViewEClass == null) {
			docNodeViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(3);
		}
		return docNodeViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocNodeView_InternalDocNode() {
        return (EReference)getDocNodeView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDocNodeView__IsCreateScreenshots() {
        return getDocNodeView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDocNodeView__SetCreateScreenshots__boolean() {
        return getDocNodeView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEdgeView() {
		if (edgeViewEClass == null) {
			edgeViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(4);
		}
		return edgeViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdgeView_InternalEdge() {
        return (EReference)getEdgeView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabeledEdgeView() {
		if (labeledEdgeViewEClass == null) {
			labeledEdgeViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(5);
		}
		return labeledEdgeViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabeledEdgeView_InternalLabeledEdge() {
        return (EReference)getLabeledEdgeView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLabeledEdgeView__GetLabel() {
        return getLabeledEdgeView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLabeledEdgeView__SetLabel__String() {
        return getLabeledEdgeView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeaturesGraphModelView() {
		if (featuresGraphModelViewEClass == null) {
			featuresGraphModelViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(6);
		}
		return featuresGraphModelViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeaturesGraphModelView_InternalFeaturesGraphModel() {
        return (EReference)getFeaturesGraphModelView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFeaturesGraphModelView__GetName() {
        return getFeaturesGraphModelView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFeaturesGraphModelView__SetName__String() {
        return getFeaturesGraphModelView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewsFactory getViewsFactory() {
		return (ViewsFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("info.scce.cinco.product.features.features.views." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //ViewsPackageImpl
