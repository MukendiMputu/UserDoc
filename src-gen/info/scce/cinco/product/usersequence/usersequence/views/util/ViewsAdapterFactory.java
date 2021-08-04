/**
 */
package info.scce.cinco.product.usersequence.usersequence.views.util;

import info.scce.cinco.product.usersequence.usersequence.views.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage
 * @generated
 */
public class ViewsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ViewsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ViewsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewsSwitch<Adapter> modelSwitch =
		new ViewsSwitch<Adapter>() {
			@Override
			public Adapter caseStartView(StartView object) {
				return createStartViewAdapter();
			}
			@Override
			public Adapter caseStopView(StopView object) {
				return createStopViewAdapter();
			}
			@Override
			public Adapter caseSubSequenceView(SubSequenceView object) {
				return createSubSequenceViewAdapter();
			}
			@Override
			public Adapter caseBaseURLView(BaseURLView object) {
				return createBaseURLViewAdapter();
			}
			@Override
			public Adapter caseDomainView(DomainView object) {
				return createDomainViewAdapter();
			}
			@Override
			public Adapter caseKeyValueView(KeyValueView object) {
				return createKeyValueViewAdapter();
			}
			@Override
			public Adapter caseScreenshotView(ScreenshotView object) {
				return createScreenshotViewAdapter();
			}
			@Override
			public Adapter caseSectionNodeView(SectionNodeView object) {
				return createSectionNodeViewAdapter();
			}
			@Override
			public Adapter caseNavigationView(NavigationView object) {
				return createNavigationViewAdapter();
			}
			@Override
			public Adapter caseWebElementView(WebElementView object) {
				return createWebElementViewAdapter();
			}
			@Override
			public Adapter caseDivView(DivView object) {
				return createDivViewAdapter();
			}
			@Override
			public Adapter caseHView(HView object) {
				return createHViewAdapter();
			}
			@Override
			public Adapter casePView(PView object) {
				return createPViewAdapter();
			}
			@Override
			public Adapter caseSpanView(SpanView object) {
				return createSpanViewAdapter();
			}
			@Override
			public Adapter caseLabelView(LabelView object) {
				return createLabelViewAdapter();
			}
			@Override
			public Adapter caseFormView(FormView object) {
				return createFormViewAdapter();
			}
			@Override
			public Adapter caseInputView(InputView object) {
				return createInputViewAdapter();
			}
			@Override
			public Adapter caseTextareaView(TextareaView object) {
				return createTextareaViewAdapter();
			}
			@Override
			public Adapter caseButtonView(ButtonView object) {
				return createButtonViewAdapter();
			}
			@Override
			public Adapter caseSelectBoxView(SelectBoxView object) {
				return createSelectBoxViewAdapter();
			}
			@Override
			public Adapter caseSelectBoxOptionView(SelectBoxOptionView object) {
				return createSelectBoxOptionViewAdapter();
			}
			@Override
			public Adapter caseTableView(TableView object) {
				return createTableViewAdapter();
			}
			@Override
			public Adapter caseTableHeadView(TableHeadView object) {
				return createTableHeadViewAdapter();
			}
			@Override
			public Adapter caseThView(ThView object) {
				return createThViewAdapter();
			}
			@Override
			public Adapter caseTableRowView(TableRowView object) {
				return createTableRowViewAdapter();
			}
			@Override
			public Adapter caseTableBodyView(TableBodyView object) {
				return createTableBodyViewAdapter();
			}
			@Override
			public Adapter caseTableDataView(TableDataView object) {
				return createTableDataViewAdapter();
			}
			@Override
			public Adapter caseSectionView(SectionView object) {
				return createSectionViewAdapter();
			}
			@Override
			public Adapter caseCommentView(CommentView object) {
				return createCommentViewAdapter();
			}
			@Override
			public Adapter caseTransitionView(TransitionView object) {
				return createTransitionViewAdapter();
			}
			@Override
			public Adapter caseLabeledTransitionView(LabeledTransitionView object) {
				return createLabeledTransitionViewAdapter();
			}
			@Override
			public Adapter caseAnchorView(AnchorView object) {
				return createAnchorViewAdapter();
			}
			@Override
			public Adapter caseUserSequenceGraphModelView(UserSequenceGraphModelView object) {
				return createUserSequenceGraphModelViewAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.views.StartView <em>Start View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.StartView
	 * @generated
	 */
	public Adapter createStartViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.views.StopView <em>Stop View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.StopView
	 * @generated
	 */
	public Adapter createStopViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.views.SubSequenceView <em>Sub Sequence View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SubSequenceView
	 * @generated
	 */
	public Adapter createSubSequenceViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.views.BaseURLView <em>Base URL View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.BaseURLView
	 * @generated
	 */
	public Adapter createBaseURLViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.views.DomainView <em>Domain View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.DomainView
	 * @generated
	 */
	public Adapter createDomainViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.views.KeyValueView <em>Key Value View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.KeyValueView
	 * @generated
	 */
	public Adapter createKeyValueViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.views.ScreenshotView <em>Screenshot View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ScreenshotView
	 * @generated
	 */
	public Adapter createScreenshotViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.views.SectionNodeView <em>Section Node View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SectionNodeView
	 * @generated
	 */
	public Adapter createSectionNodeViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.views.NavigationView <em>Navigation View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.NavigationView
	 * @generated
	 */
	public Adapter createNavigationViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.views.WebElementView <em>Web Element View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.WebElementView
	 * @generated
	 */
	public Adapter createWebElementViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.views.DivView <em>Div View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.DivView
	 * @generated
	 */
	public Adapter createDivViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.views.HView <em>HView</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.HView
	 * @generated
	 */
	public Adapter createHViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.views.PView <em>PView</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.PView
	 * @generated
	 */
	public Adapter createPViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.views.SpanView <em>Span View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SpanView
	 * @generated
	 */
	public Adapter createSpanViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.views.LabelView <em>Label View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.LabelView
	 * @generated
	 */
	public Adapter createLabelViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.views.FormView <em>Form View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.FormView
	 * @generated
	 */
	public Adapter createFormViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.views.InputView <em>Input View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.InputView
	 * @generated
	 */
	public Adapter createInputViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.views.TextareaView <em>Textarea View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TextareaView
	 * @generated
	 */
	public Adapter createTextareaViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.views.ButtonView <em>Button View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ButtonView
	 * @generated
	 */
	public Adapter createButtonViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.views.SelectBoxView <em>Select Box View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SelectBoxView
	 * @generated
	 */
	public Adapter createSelectBoxViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.views.SelectBoxOptionView <em>Select Box Option View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SelectBoxOptionView
	 * @generated
	 */
	public Adapter createSelectBoxOptionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.views.TableView <em>Table View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableView
	 * @generated
	 */
	public Adapter createTableViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.views.TableHeadView <em>Table Head View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableHeadView
	 * @generated
	 */
	public Adapter createTableHeadViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.views.ThView <em>Th View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ThView
	 * @generated
	 */
	public Adapter createThViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.views.TableRowView <em>Table Row View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableRowView
	 * @generated
	 */
	public Adapter createTableRowViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.views.TableBodyView <em>Table Body View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableBodyView
	 * @generated
	 */
	public Adapter createTableBodyViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.views.TableDataView <em>Table Data View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableDataView
	 * @generated
	 */
	public Adapter createTableDataViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.views.SectionView <em>Section View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SectionView
	 * @generated
	 */
	public Adapter createSectionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.views.CommentView <em>Comment View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.CommentView
	 * @generated
	 */
	public Adapter createCommentViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.views.TransitionView <em>Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TransitionView
	 * @generated
	 */
	public Adapter createTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.views.LabeledTransitionView <em>Labeled Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.LabeledTransitionView
	 * @generated
	 */
	public Adapter createLabeledTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.views.AnchorView <em>Anchor View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.AnchorView
	 * @generated
	 */
	public Adapter createAnchorViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.views.UserSequenceGraphModelView <em>User Sequence Graph Model View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.UserSequenceGraphModelView
	 * @generated
	 */
	public Adapter createUserSequenceGraphModelViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ViewsAdapterFactory
