/**
 */
package info.scce.cinco.product.usersequence.usersequence.views.impl;

import info.scce.cinco.product.usersequence.usersequence.views.*;

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
			case ViewsPackage.START_VIEW: return createStartView();
			case ViewsPackage.STOP_VIEW: return createStopView();
			case ViewsPackage.SUB_SEQUENCE_VIEW: return createSubSequenceView();
			case ViewsPackage.BASE_URL_VIEW: return createBaseURLView();
			case ViewsPackage.DOMAIN_VIEW: return createDomainView();
			case ViewsPackage.KEY_VALUE_VIEW: return createKeyValueView();
			case ViewsPackage.SCREENSHOT_VIEW: return createScreenshotView();
			case ViewsPackage.SECTION_NODE_VIEW: return createSectionNodeView();
			case ViewsPackage.NAVIGATION_VIEW: return createNavigationView();
			case ViewsPackage.WEB_ELEMENT_VIEW: return createWebElementView();
			case ViewsPackage.DIV_VIEW: return createDivView();
			case ViewsPackage.HVIEW: return createHView();
			case ViewsPackage.PVIEW: return createPView();
			case ViewsPackage.SPAN_VIEW: return createSpanView();
			case ViewsPackage.LABEL_VIEW: return createLabelView();
			case ViewsPackage.FORM_VIEW: return createFormView();
			case ViewsPackage.INPUT_VIEW: return createInputView();
			case ViewsPackage.TEXTAREA_VIEW: return createTextareaView();
			case ViewsPackage.BUTTON_VIEW: return createButtonView();
			case ViewsPackage.SELECT_BOX_VIEW: return createSelectBoxView();
			case ViewsPackage.SELECT_BOX_OPTION_VIEW: return createSelectBoxOptionView();
			case ViewsPackage.TABLE_VIEW: return createTableView();
			case ViewsPackage.TABLE_HEAD_VIEW: return createTableHeadView();
			case ViewsPackage.TH_VIEW: return createThView();
			case ViewsPackage.TABLE_ROW_VIEW: return createTableRowView();
			case ViewsPackage.TABLE_BODY_VIEW: return createTableBodyView();
			case ViewsPackage.TABLE_DATA_VIEW: return createTableDataView();
			case ViewsPackage.SECTION_VIEW: return createSectionView();
			case ViewsPackage.COMMENT_VIEW: return createCommentView();
			case ViewsPackage.TRANSITION_VIEW: return createTransitionView();
			case ViewsPackage.LABELED_TRANSITION_VIEW: return createLabeledTransitionView();
			case ViewsPackage.ANCHOR_VIEW: return createAnchorView();
			case ViewsPackage.USER_SEQUENCE_GRAPH_MODEL_VIEW: return createUserSequenceGraphModelView();
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
	public StartView createStartView() {
		StartViewImpl startView = new StartViewImpl();
		return startView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StopView createStopView() {
		StopViewImpl stopView = new StopViewImpl();
		return stopView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubSequenceView createSubSequenceView() {
		SubSequenceViewImpl subSequenceView = new SubSequenceViewImpl();
		return subSequenceView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseURLView createBaseURLView() {
		BaseURLViewImpl baseURLView = new BaseURLViewImpl();
		return baseURLView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainView createDomainView() {
		DomainViewImpl domainView = new DomainViewImpl();
		return domainView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyValueView createKeyValueView() {
		KeyValueViewImpl keyValueView = new KeyValueViewImpl();
		return keyValueView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScreenshotView createScreenshotView() {
		ScreenshotViewImpl screenshotView = new ScreenshotViewImpl();
		return screenshotView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SectionNodeView createSectionNodeView() {
		SectionNodeViewImpl sectionNodeView = new SectionNodeViewImpl();
		return sectionNodeView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NavigationView createNavigationView() {
		NavigationViewImpl navigationView = new NavigationViewImpl();
		return navigationView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebElementView createWebElementView() {
		WebElementViewImpl webElementView = new WebElementViewImpl();
		return webElementView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DivView createDivView() {
		DivViewImpl divView = new DivViewImpl();
		return divView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HView createHView() {
		HViewImpl hView = new HViewImpl();
		return hView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PView createPView() {
		PViewImpl pView = new PViewImpl();
		return pView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpanView createSpanView() {
		SpanViewImpl spanView = new SpanViewImpl();
		return spanView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelView createLabelView() {
		LabelViewImpl labelView = new LabelViewImpl();
		return labelView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormView createFormView() {
		FormViewImpl formView = new FormViewImpl();
		return formView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputView createInputView() {
		InputViewImpl inputView = new InputViewImpl();
		return inputView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextareaView createTextareaView() {
		TextareaViewImpl textareaView = new TextareaViewImpl();
		return textareaView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ButtonView createButtonView() {
		ButtonViewImpl buttonView = new ButtonViewImpl();
		return buttonView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelectBoxView createSelectBoxView() {
		SelectBoxViewImpl selectBoxView = new SelectBoxViewImpl();
		return selectBoxView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelectBoxOptionView createSelectBoxOptionView() {
		SelectBoxOptionViewImpl selectBoxOptionView = new SelectBoxOptionViewImpl();
		return selectBoxOptionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableView createTableView() {
		TableViewImpl tableView = new TableViewImpl();
		return tableView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableHeadView createTableHeadView() {
		TableHeadViewImpl tableHeadView = new TableHeadViewImpl();
		return tableHeadView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThView createThView() {
		ThViewImpl thView = new ThViewImpl();
		return thView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableRowView createTableRowView() {
		TableRowViewImpl tableRowView = new TableRowViewImpl();
		return tableRowView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableBodyView createTableBodyView() {
		TableBodyViewImpl tableBodyView = new TableBodyViewImpl();
		return tableBodyView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableDataView createTableDataView() {
		TableDataViewImpl tableDataView = new TableDataViewImpl();
		return tableDataView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SectionView createSectionView() {
		SectionViewImpl sectionView = new SectionViewImpl();
		return sectionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommentView createCommentView() {
		CommentViewImpl commentView = new CommentViewImpl();
		return commentView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransitionView createTransitionView() {
		TransitionViewImpl transitionView = new TransitionViewImpl();
		return transitionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledTransitionView createLabeledTransitionView() {
		LabeledTransitionViewImpl labeledTransitionView = new LabeledTransitionViewImpl();
		return labeledTransitionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnchorView createAnchorView() {
		AnchorViewImpl anchorView = new AnchorViewImpl();
		return anchorView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserSequenceGraphModelView createUserSequenceGraphModelView() {
		UserSequenceGraphModelViewImpl userSequenceGraphModelView = new UserSequenceGraphModelViewImpl();
		return userSequenceGraphModelView;
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
