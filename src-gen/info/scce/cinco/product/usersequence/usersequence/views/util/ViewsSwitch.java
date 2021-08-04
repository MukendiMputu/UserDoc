/**
 */
package info.scce.cinco.product.usersequence.usersequence.views.util;

import info.scce.cinco.product.usersequence.usersequence.views.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage
 * @generated
 */
public class ViewsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ViewsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsSwitch() {
		if (modelPackage == null) {
			modelPackage = ViewsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ViewsPackage.START_VIEW: {
				StartView startView = (StartView)theEObject;
				T result = caseStartView(startView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.STOP_VIEW: {
				StopView stopView = (StopView)theEObject;
				T result = caseStopView(stopView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.SUB_SEQUENCE_VIEW: {
				SubSequenceView subSequenceView = (SubSequenceView)theEObject;
				T result = caseSubSequenceView(subSequenceView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.BASE_URL_VIEW: {
				BaseURLView baseURLView = (BaseURLView)theEObject;
				T result = caseBaseURLView(baseURLView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.DOMAIN_VIEW: {
				DomainView domainView = (DomainView)theEObject;
				T result = caseDomainView(domainView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.KEY_VALUE_VIEW: {
				KeyValueView keyValueView = (KeyValueView)theEObject;
				T result = caseKeyValueView(keyValueView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.SCREENSHOT_VIEW: {
				ScreenshotView screenshotView = (ScreenshotView)theEObject;
				T result = caseScreenshotView(screenshotView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.SECTION_NODE_VIEW: {
				SectionNodeView sectionNodeView = (SectionNodeView)theEObject;
				T result = caseSectionNodeView(sectionNodeView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.NAVIGATION_VIEW: {
				NavigationView navigationView = (NavigationView)theEObject;
				T result = caseNavigationView(navigationView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.WEB_ELEMENT_VIEW: {
				WebElementView webElementView = (WebElementView)theEObject;
				T result = caseWebElementView(webElementView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.DIV_VIEW: {
				DivView divView = (DivView)theEObject;
				T result = caseDivView(divView);
				if (result == null) result = caseWebElementView(divView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.HVIEW: {
				HView hView = (HView)theEObject;
				T result = caseHView(hView);
				if (result == null) result = caseWebElementView(hView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.PVIEW: {
				PView pView = (PView)theEObject;
				T result = casePView(pView);
				if (result == null) result = caseWebElementView(pView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.SPAN_VIEW: {
				SpanView spanView = (SpanView)theEObject;
				T result = caseSpanView(spanView);
				if (result == null) result = caseWebElementView(spanView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.LABEL_VIEW: {
				LabelView labelView = (LabelView)theEObject;
				T result = caseLabelView(labelView);
				if (result == null) result = caseWebElementView(labelView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.FORM_VIEW: {
				FormView formView = (FormView)theEObject;
				T result = caseFormView(formView);
				if (result == null) result = caseWebElementView(formView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.INPUT_VIEW: {
				InputView inputView = (InputView)theEObject;
				T result = caseInputView(inputView);
				if (result == null) result = caseWebElementView(inputView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.TEXTAREA_VIEW: {
				TextareaView textareaView = (TextareaView)theEObject;
				T result = caseTextareaView(textareaView);
				if (result == null) result = caseWebElementView(textareaView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.BUTTON_VIEW: {
				ButtonView buttonView = (ButtonView)theEObject;
				T result = caseButtonView(buttonView);
				if (result == null) result = caseWebElementView(buttonView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.SELECT_BOX_VIEW: {
				SelectBoxView selectBoxView = (SelectBoxView)theEObject;
				T result = caseSelectBoxView(selectBoxView);
				if (result == null) result = caseWebElementView(selectBoxView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.SELECT_BOX_OPTION_VIEW: {
				SelectBoxOptionView selectBoxOptionView = (SelectBoxOptionView)theEObject;
				T result = caseSelectBoxOptionView(selectBoxOptionView);
				if (result == null) result = caseWebElementView(selectBoxOptionView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.TABLE_VIEW: {
				TableView tableView = (TableView)theEObject;
				T result = caseTableView(tableView);
				if (result == null) result = caseWebElementView(tableView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.TABLE_HEAD_VIEW: {
				TableHeadView tableHeadView = (TableHeadView)theEObject;
				T result = caseTableHeadView(tableHeadView);
				if (result == null) result = caseWebElementView(tableHeadView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.TH_VIEW: {
				ThView thView = (ThView)theEObject;
				T result = caseThView(thView);
				if (result == null) result = caseWebElementView(thView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.TABLE_ROW_VIEW: {
				TableRowView tableRowView = (TableRowView)theEObject;
				T result = caseTableRowView(tableRowView);
				if (result == null) result = caseWebElementView(tableRowView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.TABLE_BODY_VIEW: {
				TableBodyView tableBodyView = (TableBodyView)theEObject;
				T result = caseTableBodyView(tableBodyView);
				if (result == null) result = caseWebElementView(tableBodyView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.TABLE_DATA_VIEW: {
				TableDataView tableDataView = (TableDataView)theEObject;
				T result = caseTableDataView(tableDataView);
				if (result == null) result = caseWebElementView(tableDataView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.SECTION_VIEW: {
				SectionView sectionView = (SectionView)theEObject;
				T result = caseSectionView(sectionView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.COMMENT_VIEW: {
				CommentView commentView = (CommentView)theEObject;
				T result = caseCommentView(commentView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.TRANSITION_VIEW: {
				TransitionView transitionView = (TransitionView)theEObject;
				T result = caseTransitionView(transitionView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.LABELED_TRANSITION_VIEW: {
				LabeledTransitionView labeledTransitionView = (LabeledTransitionView)theEObject;
				T result = caseLabeledTransitionView(labeledTransitionView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.ANCHOR_VIEW: {
				AnchorView anchorView = (AnchorView)theEObject;
				T result = caseAnchorView(anchorView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.USER_SEQUENCE_GRAPH_MODEL_VIEW: {
				UserSequenceGraphModelView userSequenceGraphModelView = (UserSequenceGraphModelView)theEObject;
				T result = caseUserSequenceGraphModelView(userSequenceGraphModelView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartView(StartView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopView(StopView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Sequence View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Sequence View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubSequenceView(SubSequenceView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base URL View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base URL View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseURLView(BaseURLView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainView(DomainView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Value View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Value View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyValueView(KeyValueView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screenshot View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screenshot View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScreenshotView(ScreenshotView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section Node View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section Node View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSectionNodeView(SectionNodeView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigationView(NavigationView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Element View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Element View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebElementView(WebElementView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Div View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Div View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivView(DivView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HView</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HView</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHView(HView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PView</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PView</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePView(PView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Span View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Span View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpanView(SpanView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelView(LabelView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormView(FormView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputView(InputView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Textarea View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Textarea View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextareaView(TextareaView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButtonView(ButtonView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select Box View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select Box View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectBoxView(SelectBoxView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select Box Option View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select Box Option View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectBoxOptionView(SelectBoxOptionView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableView(TableView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Head View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Head View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableHeadView(TableHeadView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Th View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Th View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThView(ThView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Row View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Row View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableRowView(TableRowView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Body View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Body View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableBodyView(TableBodyView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Data View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Data View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableDataView(TableDataView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSectionView(SectionView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentView(CommentView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionView(TransitionView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labeled Transition View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labeled Transition View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabeledTransitionView(LabeledTransitionView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anchor View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anchor View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnchorView(AnchorView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Sequence Graph Model View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Sequence Graph Model View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserSequenceGraphModelView(UserSequenceGraphModelView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ViewsSwitch
