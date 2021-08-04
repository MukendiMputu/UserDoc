/**
 */
package info.scce.cinco.product.usersequence.usersequence.impl;

import info.scce.cinco.product.usersequence.usersequence.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class UsersequenceFactoryImpl extends EFactoryImpl implements UsersequenceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UsersequenceFactory init() {
		try {
			UsersequenceFactory theUsersequenceFactory = (UsersequenceFactory)EPackage.Registry.INSTANCE.getEFactory(UsersequencePackage.eNS_URI);
			if (theUsersequenceFactory != null) {
				return theUsersequenceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UsersequenceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsersequenceFactoryImpl() {
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
			case UsersequencePackage.START: return createStart();
			case UsersequencePackage.STOP: return createStop();
			case UsersequencePackage.SUB_SEQUENCE: return createSubSequence();
			case UsersequencePackage.BASE_URL: return createBaseURL();
			case UsersequencePackage.DOMAIN: return createDomain();
			case UsersequencePackage.KEY_VALUE: return createKeyValue();
			case UsersequencePackage.SCREENSHOT: return createScreenshot();
			case UsersequencePackage.SECTION_NODE: return createSectionNode();
			case UsersequencePackage.NAVIGATION: return createNavigation();
			case UsersequencePackage.WEB_ELEMENT: return createWebElement();
			case UsersequencePackage.DIV: return createDiv();
			case UsersequencePackage.H: return createH();
			case UsersequencePackage.P: return createP();
			case UsersequencePackage.SPAN: return createSpan();
			case UsersequencePackage.LABEL: return createLabel();
			case UsersequencePackage.FORM: return createForm();
			case UsersequencePackage.INPUT: return createInput();
			case UsersequencePackage.TEXTAREA: return createTextarea();
			case UsersequencePackage.BUTTON: return createButton();
			case UsersequencePackage.SELECT_BOX: return createSelectBox();
			case UsersequencePackage.SELECT_BOX_OPTION: return createSelectBoxOption();
			case UsersequencePackage.TABLE: return createTable();
			case UsersequencePackage.TABLE_HEAD: return createTableHead();
			case UsersequencePackage.TH: return createTh();
			case UsersequencePackage.TABLE_ROW: return createTableRow();
			case UsersequencePackage.TABLE_BODY: return createTableBody();
			case UsersequencePackage.TABLE_DATA: return createTableData();
			case UsersequencePackage.SECTION: return createSection();
			case UsersequencePackage.COMMENT: return createComment();
			case UsersequencePackage.TRANSITION: return createTransition();
			case UsersequencePackage.LABELED_TRANSITION: return createLabeledTransition();
			case UsersequencePackage.ANCHOR: return createAnchor();
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL: return createUserSequenceGraphModel();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case UsersequencePackage.BUTTON_ACTION:
				return createButtonActionFromString(eDataType, initialValue);
			case UsersequencePackage.ACTIONS:
				return createActionsFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case UsersequencePackage.BUTTON_ACTION:
				return convertButtonActionToString(eDataType, instanceValue);
			case UsersequencePackage.ACTIONS:
				return convertActionsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Start createStart() {
		StartImpl start = new StartImpl();
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stop createStop() {
		StopImpl stop = new StopImpl();
		return stop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubSequence createSubSequence() {
		SubSequenceImpl subSequence = new SubSequenceImpl();
		return subSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseURL createBaseURL() {
		BaseURLImpl baseURL = new BaseURLImpl();
		return baseURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Domain createDomain() {
		DomainImpl domain = new DomainImpl();
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyValue createKeyValue() {
		KeyValueImpl keyValue = new KeyValueImpl();
		return keyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Screenshot createScreenshot() {
		ScreenshotImpl screenshot = new ScreenshotImpl();
		return screenshot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SectionNode createSectionNode() {
		SectionNodeImpl sectionNode = new SectionNodeImpl();
		return sectionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Navigation createNavigation() {
		NavigationImpl navigation = new NavigationImpl();
		return navigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebElement createWebElement() {
		WebElementImpl webElement = new WebElementImpl();
		return webElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Div createDiv() {
		DivImpl div = new DivImpl();
		return div;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public H createH() {
		HImpl h = new HImpl();
		return h;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public P createP() {
		PImpl p = new PImpl();
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Span createSpan() {
		SpanImpl span = new SpanImpl();
		return span;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Form createForm() {
		FormImpl form = new FormImpl();
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Textarea createTextarea() {
		TextareaImpl textarea = new TextareaImpl();
		return textarea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelectBox createSelectBox() {
		SelectBoxImpl selectBox = new SelectBoxImpl();
		return selectBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelectBoxOption createSelectBoxOption() {
		SelectBoxOptionImpl selectBoxOption = new SelectBoxOptionImpl();
		return selectBoxOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableHead createTableHead() {
		TableHeadImpl tableHead = new TableHeadImpl();
		return tableHead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Th createTh() {
		ThImpl th = new ThImpl();
		return th;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableRow createTableRow() {
		TableRowImpl tableRow = new TableRowImpl();
		return tableRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableBody createTableBody() {
		TableBodyImpl tableBody = new TableBodyImpl();
		return tableBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableData createTableData() {
		TableDataImpl tableData = new TableDataImpl();
		return tableData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Section createSection() {
		SectionImpl section = new SectionImpl();
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledTransition createLabeledTransition() {
		LabeledTransitionImpl labeledTransition = new LabeledTransitionImpl();
		return labeledTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anchor createAnchor() {
		AnchorImpl anchor = new AnchorImpl();
		return anchor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserSequenceGraphModel createUserSequenceGraphModel() {
		UserSequenceGraphModelImpl userSequenceGraphModel = new UserSequenceGraphModelImpl();
		return userSequenceGraphModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonAction createButtonActionFromString(EDataType eDataType, String initialValue) {
		ButtonAction result = ButtonAction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertButtonActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actions createActionsFromString(EDataType eDataType, String initialValue) {
		Actions result = Actions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsersequencePackage getUsersequencePackage() {
		return (UsersequencePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UsersequencePackage getPackage() {
		return UsersequencePackage.eINSTANCE;
	}

} //UsersequenceFactoryImpl
