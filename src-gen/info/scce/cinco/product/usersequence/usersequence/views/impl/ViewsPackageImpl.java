/**
 */
package info.scce.cinco.product.usersequence.usersequence.views.impl;

import graphmodel.GraphmodelPackage;

import info.scce.cinco.product.features.features.FeaturesPackage;

import info.scce.cinco.product.features.features.impl.FeaturesPackageImpl;

import info.scce.cinco.product.features.features.internal.InternalPackage;

import info.scce.cinco.product.features.features.internal.impl.InternalPackageImpl;

import info.scce.cinco.product.usersequence.usersequence.UsersequencePackage;

import info.scce.cinco.product.usersequence.usersequence.impl.UsersequencePackageImpl;

import info.scce.cinco.product.usersequence.usersequence.views.ViewsFactory;
import info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage;

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
	private EClass startViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subSequenceViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseURLViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyValueViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screenshotViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionNodeViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webElementViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spanViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textareaViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectBoxViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectBoxOptionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableHeadViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableRowViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableBodyViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableDataViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labeledTransitionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anchorViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userSequenceGraphModelViewEClass = null;

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
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage#eNS_URI
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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(info.scce.cinco.product.features.features.views.ViewsPackage.eNS_URI);
		info.scce.cinco.product.features.features.views.impl.ViewsPackageImpl theViewsPackage_1 = (info.scce.cinco.product.features.features.views.impl.ViewsPackageImpl)(registeredPackage instanceof info.scce.cinco.product.features.features.views.impl.ViewsPackageImpl ? registeredPackage : info.scce.cinco.product.features.features.views.ViewsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UsersequencePackage.eNS_URI);
		UsersequencePackageImpl theUsersequencePackage = (UsersequencePackageImpl)(registeredPackage instanceof UsersequencePackageImpl ? registeredPackage : UsersequencePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(info.scce.cinco.product.usersequence.usersequence.internal.InternalPackage.eNS_URI);
		info.scce.cinco.product.usersequence.usersequence.internal.impl.InternalPackageImpl theInternalPackage_1 = (info.scce.cinco.product.usersequence.usersequence.internal.impl.InternalPackageImpl)(registeredPackage instanceof info.scce.cinco.product.usersequence.usersequence.internal.impl.InternalPackageImpl ? registeredPackage : info.scce.cinco.product.usersequence.usersequence.internal.InternalPackage.eINSTANCE);

		// Load packages
		theFeaturesPackage.loadPackage();
		theUsersequencePackage.loadPackage();

		// Fix loaded packages
		theViewsPackage.fixPackageContents();
		theFeaturesPackage.fixPackageContents();
		theInternalPackage.fixPackageContents();
		theViewsPackage_1.fixPackageContents();
		theUsersequencePackage.fixPackageContents();
		theInternalPackage_1.fixPackageContents();

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
	public EClass getStartView() {
		if (startViewEClass == null) {
			startViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(0);
		}
		return startViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStartView_InternalStart() {
        return (EReference)getStartView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStopView() {
		if (stopViewEClass == null) {
			stopViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(1);
		}
		return stopViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopView_InternalStop() {
        return (EReference)getStopView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubSequenceView() {
		if (subSequenceViewEClass == null) {
			subSequenceViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(2);
		}
		return subSequenceViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubSequenceView_InternalSubSequence() {
        return (EReference)getSubSequenceView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBaseURLView() {
		if (baseURLViewEClass == null) {
			baseURLViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(3);
		}
		return baseURLViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBaseURLView_InternalBaseURL() {
        return (EReference)getBaseURLView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBaseURLView__GetContent() {
        return getBaseURLView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBaseURLView__SetContent__String() {
        return getBaseURLView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainView() {
		if (domainViewEClass == null) {
			domainViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(4);
		}
		return domainViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainView_InternalDomain() {
        return (EReference)getDomainView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDomainView__GetContent() {
        return getDomainView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDomainView__SetContent__String() {
        return getDomainView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKeyValueView() {
		if (keyValueViewEClass == null) {
			keyValueViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(5);
		}
		return keyValueViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKeyValueView_InternalKeyValue() {
        return (EReference)getKeyValueView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getKeyValueView__GetValue() {
        return getKeyValueView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getKeyValueView__SetValue__String() {
        return getKeyValueView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getKeyValueView__GetKey() {
        return getKeyValueView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getKeyValueView__SetKey__String() {
        return getKeyValueView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScreenshotView() {
		if (screenshotViewEClass == null) {
			screenshotViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(6);
		}
		return screenshotViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScreenshotView_InternalScreenshot() {
        return (EReference)getScreenshotView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getScreenshotView__GetDescription() {
        return getScreenshotView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getScreenshotView__SetDescription__Comment() {
        return getScreenshotView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSectionNodeView() {
		if (sectionNodeViewEClass == null) {
			sectionNodeViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(7);
		}
		return sectionNodeViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSectionNodeView_InternalSectionNode() {
        return (EReference)getSectionNodeView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSectionNodeView__GetTitle() {
        return getSectionNodeView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSectionNodeView__SetTitle__String() {
        return getSectionNodeView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNavigationView() {
		if (navigationViewEClass == null) {
			navigationViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(8);
		}
		return navigationViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNavigationView_InternalNavigation() {
        return (EReference)getNavigationView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNavigationView__GetLink() {
        return getNavigationView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNavigationView__SetLink__String() {
        return getNavigationView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWebElementView() {
		if (webElementViewEClass == null) {
			webElementViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(9);
		}
		return webElementViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWebElementView_InternalWebElement() {
        return (EReference)getWebElementView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWebElementView__IsIsHighlighted() {
        return getWebElementView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWebElementView__SetIsHighlighted__boolean() {
        return getWebElementView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWebElementView__GetContentText() {
        return getWebElementView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWebElementView__SetContentText__String() {
        return getWebElementView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWebElementView__GetAttribute() {
        return getWebElementView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWebElementView__SetAttribute__String() {
        return getWebElementView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWebElementView__GetAttrValue() {
        return getWebElementView().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWebElementView__SetAttrValue__String() {
        return getWebElementView().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWebElementView__GetTagName() {
        return getWebElementView().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWebElementView__SetTagName__String() {
        return getWebElementView().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDivView() {
		if (divViewEClass == null) {
			divViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(10);
		}
		return divViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDivView_InternalDiv() {
        return (EReference)getDivView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHView() {
		if (hViewEClass == null) {
			hViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(11);
		}
		return hViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHView_InternalH() {
        return (EReference)getHView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHView__IsHighlighted() {
        return getHView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHView__SetHighlighted__boolean() {
        return getHView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHView__GetRanking() {
        return getHView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHView__SetRanking__int() {
        return getHView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHView__GetSelector() {
        return getHView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHView__SetSelector__String() {
        return getHView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHView__GetValue() {
        return getHView().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHView__SetValue__String() {
        return getHView().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHView__GetContent() {
        return getHView().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHView__SetContent__String() {
        return getHView().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPView() {
		if (pViewEClass == null) {
			pViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(12);
		}
		return pViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPView_InternalP() {
        return (EReference)getPView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPView__IsHighlighted() {
        return getPView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPView__SetHighlighted__boolean() {
        return getPView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPView__GetSelector() {
        return getPView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPView__SetSelector__String() {
        return getPView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPView__GetValue() {
        return getPView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPView__SetValue__String() {
        return getPView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPView__GetContent() {
        return getPView().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPView__SetContent__String() {
        return getPView().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpanView() {
		if (spanViewEClass == null) {
			spanViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(13);
		}
		return spanViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpanView_InternalSpan() {
        return (EReference)getSpanView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpanView__IsHighlighted() {
        return getSpanView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpanView__SetHighlighted__boolean() {
        return getSpanView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpanView__GetSelector() {
        return getSpanView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpanView__SetSelector__String() {
        return getSpanView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpanView__GetValue() {
        return getSpanView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpanView__SetValue__String() {
        return getSpanView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpanView__GetContent() {
        return getSpanView().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpanView__SetContent__String() {
        return getSpanView().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabelView() {
		if (labelViewEClass == null) {
			labelViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(14);
		}
		return labelViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabelView_InternalLabel() {
        return (EReference)getLabelView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLabelView__IsHighlighted() {
        return getLabelView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLabelView__SetHighlighted__boolean() {
        return getLabelView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLabelView__GetSelector() {
        return getLabelView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLabelView__SetSelector__String() {
        return getLabelView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLabelView__GetValue() {
        return getLabelView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLabelView__SetValue__String() {
        return getLabelView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLabelView__GetContent() {
        return getLabelView().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLabelView__SetContent__String() {
        return getLabelView().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFormView() {
		if (formViewEClass == null) {
			formViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(15);
		}
		return formViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFormView_InternalForm() {
        return (EReference)getFormView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFormView__GetMethod() {
        return getFormView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFormView__SetMethod__String() {
        return getFormView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFormView__GetField() {
        return getFormView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFormView__SetField__EList() {
        return getFormView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFormView__AddField__Input() {
        return getFormView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFormView__RemoveField__Input() {
        return getFormView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFormView__IsHighlighted() {
        return getFormView().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFormView__SetHighlighted__boolean() {
        return getFormView().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFormView__GetAction() {
        return getFormView().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFormView__SetAction__String() {
        return getFormView().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputView() {
		if (inputViewEClass == null) {
			inputViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(16);
		}
		return inputViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInputView_InternalInput() {
        return (EReference)getInputView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInputView__IsHighlighted() {
        return getInputView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInputView__SetHighlighted__boolean() {
        return getInputView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInputView__GetSelector() {
        return getInputView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInputView__SetSelector__String() {
        return getInputView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInputView__GetValue() {
        return getInputView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInputView__SetValue__String() {
        return getInputView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInputView__GetContent() {
        return getInputView().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInputView__SetContent__String() {
        return getInputView().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextareaView() {
		if (textareaViewEClass == null) {
			textareaViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(17);
		}
		return textareaViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTextareaView_InternalTextarea() {
        return (EReference)getTextareaView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getButtonView() {
		if (buttonViewEClass == null) {
			buttonViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(18);
		}
		return buttonViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getButtonView_InternalButton() {
        return (EReference)getButtonView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getButtonView__IsHighlighted() {
        return getButtonView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getButtonView__SetHighlighted__boolean() {
        return getButtonView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getButtonView__GetAction() {
        return getButtonView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getButtonView__SetAction__ButtonAction() {
        return getButtonView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getButtonView__GetSelector() {
        return getButtonView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getButtonView__SetSelector__String() {
        return getButtonView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getButtonView__GetValue() {
        return getButtonView().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getButtonView__SetValue__String() {
        return getButtonView().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getButtonView__GetContent() {
        return getButtonView().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getButtonView__SetContent__String() {
        return getButtonView().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSelectBoxView() {
		if (selectBoxViewEClass == null) {
			selectBoxViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(19);
		}
		return selectBoxViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelectBoxView_InternalSelectBox() {
        return (EReference)getSelectBoxView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSelectBoxView__IsHighlighted() {
        return getSelectBoxView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSelectBoxView__SetHighlighted__boolean() {
        return getSelectBoxView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSelectBoxView__GetSelector() {
        return getSelectBoxView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSelectBoxView__SetSelector__String() {
        return getSelectBoxView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSelectBoxView__GetValue() {
        return getSelectBoxView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSelectBoxView__SetValue__String() {
        return getSelectBoxView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSelectBoxView__GetContent() {
        return getSelectBoxView().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSelectBoxView__SetContent__String() {
        return getSelectBoxView().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSelectBoxOptionView() {
		if (selectBoxOptionViewEClass == null) {
			selectBoxOptionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(20);
		}
		return selectBoxOptionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelectBoxOptionView_InternalSelectBoxOption() {
        return (EReference)getSelectBoxOptionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSelectBoxOptionView__IsHighlighted() {
        return getSelectBoxOptionView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSelectBoxOptionView__SetHighlighted__boolean() {
        return getSelectBoxOptionView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSelectBoxOptionView__GetSelector() {
        return getSelectBoxOptionView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSelectBoxOptionView__SetSelector__String() {
        return getSelectBoxOptionView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSelectBoxOptionView__GetValue() {
        return getSelectBoxOptionView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSelectBoxOptionView__SetValue__String() {
        return getSelectBoxOptionView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSelectBoxOptionView__GetContent() {
        return getSelectBoxOptionView().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSelectBoxOptionView__SetContent__String() {
        return getSelectBoxOptionView().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableView() {
		if (tableViewEClass == null) {
			tableViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(21);
		}
		return tableViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTableView_InternalTable() {
        return (EReference)getTableView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableView__IsHighlighted() {
        return getTableView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableView__SetHighlighted__boolean() {
        return getTableView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableView__GetSelector() {
        return getTableView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableView__SetSelector__String() {
        return getTableView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableView__GetValue() {
        return getTableView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableView__SetValue__String() {
        return getTableView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableView__GetContent() {
        return getTableView().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableView__SetContent__String() {
        return getTableView().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableHeadView() {
		if (tableHeadViewEClass == null) {
			tableHeadViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(22);
		}
		return tableHeadViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTableHeadView_InternalTableHead() {
        return (EReference)getTableHeadView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableHeadView__IsHighlighted() {
        return getTableHeadView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableHeadView__SetHighlighted__boolean() {
        return getTableHeadView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableHeadView__GetSelector() {
        return getTableHeadView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableHeadView__SetSelector__String() {
        return getTableHeadView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableHeadView__GetValue() {
        return getTableHeadView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableHeadView__SetValue__String() {
        return getTableHeadView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableHeadView__GetContent() {
        return getTableHeadView().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableHeadView__SetContent__String() {
        return getTableHeadView().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThView() {
		if (thViewEClass == null) {
			thViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(23);
		}
		return thViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThView_InternalTh() {
        return (EReference)getThView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getThView__IsHighlighted() {
        return getThView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getThView__SetHighlighted__boolean() {
        return getThView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getThView__GetSelector() {
        return getThView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getThView__SetSelector__String() {
        return getThView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getThView__GetValue() {
        return getThView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getThView__SetValue__String() {
        return getThView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getThView__GetContent() {
        return getThView().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getThView__SetContent__String() {
        return getThView().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableRowView() {
		if (tableRowViewEClass == null) {
			tableRowViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(24);
		}
		return tableRowViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTableRowView_InternalTableRow() {
        return (EReference)getTableRowView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableRowView__IsHighlighted() {
        return getTableRowView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableRowView__SetHighlighted__boolean() {
        return getTableRowView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableRowView__GetSelector() {
        return getTableRowView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableRowView__SetSelector__String() {
        return getTableRowView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableRowView__GetValue() {
        return getTableRowView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableRowView__SetValue__String() {
        return getTableRowView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableRowView__GetContent() {
        return getTableRowView().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableRowView__SetContent__String() {
        return getTableRowView().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableBodyView() {
		if (tableBodyViewEClass == null) {
			tableBodyViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(25);
		}
		return tableBodyViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTableBodyView_InternalTableBody() {
        return (EReference)getTableBodyView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableBodyView__IsHighlighted() {
        return getTableBodyView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableBodyView__SetHighlighted__boolean() {
        return getTableBodyView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableBodyView__GetSelector() {
        return getTableBodyView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableBodyView__SetSelector__String() {
        return getTableBodyView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableBodyView__GetValue() {
        return getTableBodyView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableBodyView__SetValue__String() {
        return getTableBodyView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableBodyView__GetContent() {
        return getTableBodyView().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableBodyView__SetContent__String() {
        return getTableBodyView().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableDataView() {
		if (tableDataViewEClass == null) {
			tableDataViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(26);
		}
		return tableDataViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTableDataView_InternalTableData() {
        return (EReference)getTableDataView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableDataView__IsHighlighted() {
        return getTableDataView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableDataView__SetHighlighted__boolean() {
        return getTableDataView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableDataView__GetSelector() {
        return getTableDataView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableDataView__SetSelector__String() {
        return getTableDataView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableDataView__GetValue() {
        return getTableDataView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableDataView__SetValue__String() {
        return getTableDataView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableDataView__GetContent() {
        return getTableDataView().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTableDataView__SetContent__String() {
        return getTableDataView().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSectionView() {
		if (sectionViewEClass == null) {
			sectionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(27);
		}
		return sectionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSectionView_InternalSection() {
        return (EReference)getSectionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSectionView__IsHighlighted() {
        return getSectionView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSectionView__SetHighlighted__boolean() {
        return getSectionView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSectionView__GetTitle() {
        return getSectionView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSectionView__SetTitle__String() {
        return getSectionView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommentView() {
		if (commentViewEClass == null) {
			commentViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(28);
		}
		return commentViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommentView_InternalComment() {
        return (EReference)getCommentView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCommentView__GetContent() {
        return getCommentView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCommentView__SetContent__String() {
        return getCommentView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCommentView__GetReferenceTo() {
        return getCommentView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCommentView__SetReferenceTo__Screenshot() {
        return getCommentView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransitionView() {
		if (transitionViewEClass == null) {
			transitionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(29);
		}
		return transitionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransitionView_InternalTransition() {
        return (EReference)getTransitionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabeledTransitionView() {
		if (labeledTransitionViewEClass == null) {
			labeledTransitionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(30);
		}
		return labeledTransitionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabeledTransitionView_InternalLabeledTransition() {
        return (EReference)getLabeledTransitionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLabeledTransitionView__GetLabel() {
        return getLabeledTransitionView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLabeledTransitionView__SetLabel__String() {
        return getLabeledTransitionView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnchorView() {
		if (anchorViewEClass == null) {
			anchorViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(31);
		}
		return anchorViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnchorView_InternalAnchor() {
        return (EReference)getAnchorView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUserSequenceGraphModelView() {
		if (userSequenceGraphModelViewEClass == null) {
			userSequenceGraphModelViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(32);
		}
		return userSequenceGraphModelViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUserSequenceGraphModelView_InternalUserSequenceGraphModel() {
        return (EReference)getUserSequenceGraphModelView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUserSequenceGraphModelView__GetModelName() {
        return getUserSequenceGraphModelView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUserSequenceGraphModelView__SetModelName__String() {
        return getUserSequenceGraphModelView().getEOperations().get(1);
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
			eClassifier.setInstanceClassName("info.scce.cinco.product.usersequence.usersequence.views." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //ViewsPackageImpl
