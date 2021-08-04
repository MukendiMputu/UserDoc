/**
 */
package info.scce.cinco.product.usersequence.usersequence.internal.impl;

import info.scce.cinco.product.usersequence.usersequence.internal.*;

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
			case InternalPackage.INTERNAL_START: return createInternalStart();
			case InternalPackage.INTERNAL_STOP: return createInternalStop();
			case InternalPackage.INTERNAL_SUB_SEQUENCE: return createInternalSubSequence();
			case InternalPackage.INTERNAL_BASE_URL: return createInternalBaseURL();
			case InternalPackage.INTERNAL_DOMAIN: return createInternalDomain();
			case InternalPackage.INTERNAL_KEY_VALUE: return createInternalKeyValue();
			case InternalPackage.INTERNAL_SCREENSHOT: return createInternalScreenshot();
			case InternalPackage.INTERNAL_SECTION_NODE: return createInternalSectionNode();
			case InternalPackage.INTERNAL_NAVIGATION: return createInternalNavigation();
			case InternalPackage.INTERNAL_WEB_ELEMENT: return createInternalWebElement();
			case InternalPackage.INTERNAL_DIV: return createInternalDiv();
			case InternalPackage.INTERNAL_H: return createInternalH();
			case InternalPackage.INTERNAL_P: return createInternalP();
			case InternalPackage.INTERNAL_SPAN: return createInternalSpan();
			case InternalPackage.INTERNAL_LABEL: return createInternalLabel();
			case InternalPackage.INTERNAL_FORM: return createInternalForm();
			case InternalPackage.INTERNAL_INPUT: return createInternalInput();
			case InternalPackage.INTERNAL_TEXTAREA: return createInternalTextarea();
			case InternalPackage.INTERNAL_BUTTON: return createInternalButton();
			case InternalPackage.INTERNAL_SELECT_BOX: return createInternalSelectBox();
			case InternalPackage.INTERNAL_SELECT_BOX_OPTION: return createInternalSelectBoxOption();
			case InternalPackage.INTERNAL_TABLE: return createInternalTable();
			case InternalPackage.INTERNAL_TABLE_HEAD: return createInternalTableHead();
			case InternalPackage.INTERNAL_TH: return createInternalTh();
			case InternalPackage.INTERNAL_TABLE_ROW: return createInternalTableRow();
			case InternalPackage.INTERNAL_TABLE_BODY: return createInternalTableBody();
			case InternalPackage.INTERNAL_TABLE_DATA: return createInternalTableData();
			case InternalPackage.INTERNAL_SECTION: return createInternalSection();
			case InternalPackage.INTERNAL_COMMENT: return createInternalComment();
			case InternalPackage.INTERNAL_TRANSITION: return createInternalTransition();
			case InternalPackage.INTERNAL_LABELED_TRANSITION: return createInternalLabeledTransition();
			case InternalPackage.INTERNAL_ANCHOR: return createInternalAnchor();
			case InternalPackage.INTERNAL_USER_SEQUENCE_GRAPH_MODEL: return createInternalUserSequenceGraphModel();
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
	public InternalStart createInternalStart() {
		InternalStartImpl internalStart = new InternalStartImpl();
		return internalStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalStop createInternalStop() {
		InternalStopImpl internalStop = new InternalStopImpl();
		return internalStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSubSequence createInternalSubSequence() {
		InternalSubSequenceImpl internalSubSequence = new InternalSubSequenceImpl();
		return internalSubSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalBaseURL createInternalBaseURL() {
		InternalBaseURLImpl internalBaseURL = new InternalBaseURLImpl();
		return internalBaseURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalDomain createInternalDomain() {
		InternalDomainImpl internalDomain = new InternalDomainImpl();
		return internalDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalKeyValue createInternalKeyValue() {
		InternalKeyValueImpl internalKeyValue = new InternalKeyValueImpl();
		return internalKeyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalScreenshot createInternalScreenshot() {
		InternalScreenshotImpl internalScreenshot = new InternalScreenshotImpl();
		return internalScreenshot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSectionNode createInternalSectionNode() {
		InternalSectionNodeImpl internalSectionNode = new InternalSectionNodeImpl();
		return internalSectionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalNavigation createInternalNavigation() {
		InternalNavigationImpl internalNavigation = new InternalNavigationImpl();
		return internalNavigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalWebElement createInternalWebElement() {
		InternalWebElementImpl internalWebElement = new InternalWebElementImpl();
		return internalWebElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalDiv createInternalDiv() {
		InternalDivImpl internalDiv = new InternalDivImpl();
		return internalDiv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalH createInternalH() {
		InternalHImpl internalH = new InternalHImpl();
		return internalH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalP createInternalP() {
		InternalPImpl internalP = new InternalPImpl();
		return internalP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSpan createInternalSpan() {
		InternalSpanImpl internalSpan = new InternalSpanImpl();
		return internalSpan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalLabel createInternalLabel() {
		InternalLabelImpl internalLabel = new InternalLabelImpl();
		return internalLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalForm createInternalForm() {
		InternalFormImpl internalForm = new InternalFormImpl();
		return internalForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalInput createInternalInput() {
		InternalInputImpl internalInput = new InternalInputImpl();
		return internalInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalTextarea createInternalTextarea() {
		InternalTextareaImpl internalTextarea = new InternalTextareaImpl();
		return internalTextarea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalButton createInternalButton() {
		InternalButtonImpl internalButton = new InternalButtonImpl();
		return internalButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSelectBox createInternalSelectBox() {
		InternalSelectBoxImpl internalSelectBox = new InternalSelectBoxImpl();
		return internalSelectBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSelectBoxOption createInternalSelectBoxOption() {
		InternalSelectBoxOptionImpl internalSelectBoxOption = new InternalSelectBoxOptionImpl();
		return internalSelectBoxOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalTable createInternalTable() {
		InternalTableImpl internalTable = new InternalTableImpl();
		return internalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalTableHead createInternalTableHead() {
		InternalTableHeadImpl internalTableHead = new InternalTableHeadImpl();
		return internalTableHead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalTh createInternalTh() {
		InternalThImpl internalTh = new InternalThImpl();
		return internalTh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalTableRow createInternalTableRow() {
		InternalTableRowImpl internalTableRow = new InternalTableRowImpl();
		return internalTableRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalTableBody createInternalTableBody() {
		InternalTableBodyImpl internalTableBody = new InternalTableBodyImpl();
		return internalTableBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalTableData createInternalTableData() {
		InternalTableDataImpl internalTableData = new InternalTableDataImpl();
		return internalTableData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSection createInternalSection() {
		InternalSectionImpl internalSection = new InternalSectionImpl();
		return internalSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalComment createInternalComment() {
		InternalCommentImpl internalComment = new InternalCommentImpl();
		return internalComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalTransition createInternalTransition() {
		InternalTransitionImpl internalTransition = new InternalTransitionImpl();
		return internalTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalLabeledTransition createInternalLabeledTransition() {
		InternalLabeledTransitionImpl internalLabeledTransition = new InternalLabeledTransitionImpl();
		return internalLabeledTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalAnchor createInternalAnchor() {
		InternalAnchorImpl internalAnchor = new InternalAnchorImpl();
		return internalAnchor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalUserSequenceGraphModel createInternalUserSequenceGraphModel() {
		InternalUserSequenceGraphModelImpl internalUserSequenceGraphModel = new InternalUserSequenceGraphModelImpl();
		return internalUserSequenceGraphModel;
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
