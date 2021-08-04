/**
 */
package info.scce.cinco.product.usersequence.usersequence.util;

import graphmodel.Container;
import graphmodel.Edge;
import graphmodel.GraphModel;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.ModelElementContainer;
import graphmodel.Node;

import info.scce.cinco.product.usersequence.usersequence.*;

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
 * @see info.scce.cinco.product.usersequence.usersequence.UsersequencePackage
 * @generated
 */
public class UsersequenceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UsersequencePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsersequenceSwitch() {
		if (modelPackage == null) {
			modelPackage = UsersequencePackage.eINSTANCE;
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
			case UsersequencePackage.START: {
				Start start = (Start)theEObject;
				T result = caseStart(start);
				if (result == null) result = caseNode(start);
				if (result == null) result = caseModelElement(start);
				if (result == null) result = caseIdentifiableElement(start);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsersequencePackage.STOP: {
				Stop stop = (Stop)theEObject;
				T result = caseStop(stop);
				if (result == null) result = caseNode(stop);
				if (result == null) result = caseModelElement(stop);
				if (result == null) result = caseIdentifiableElement(stop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsersequencePackage.SUB_SEQUENCE: {
				SubSequence subSequence = (SubSequence)theEObject;
				T result = caseSubSequence(subSequence);
				if (result == null) result = caseNode(subSequence);
				if (result == null) result = caseModelElement(subSequence);
				if (result == null) result = caseIdentifiableElement(subSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsersequencePackage.BASE_URL: {
				BaseURL baseURL = (BaseURL)theEObject;
				T result = caseBaseURL(baseURL);
				if (result == null) result = caseNode(baseURL);
				if (result == null) result = caseModelElement(baseURL);
				if (result == null) result = caseIdentifiableElement(baseURL);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsersequencePackage.DOMAIN: {
				Domain domain = (Domain)theEObject;
				T result = caseDomain(domain);
				if (result == null) result = caseNode(domain);
				if (result == null) result = caseModelElement(domain);
				if (result == null) result = caseIdentifiableElement(domain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsersequencePackage.KEY_VALUE: {
				KeyValue keyValue = (KeyValue)theEObject;
				T result = caseKeyValue(keyValue);
				if (result == null) result = caseNode(keyValue);
				if (result == null) result = caseModelElement(keyValue);
				if (result == null) result = caseIdentifiableElement(keyValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsersequencePackage.SCREENSHOT: {
				Screenshot screenshot = (Screenshot)theEObject;
				T result = caseScreenshot(screenshot);
				if (result == null) result = caseNode(screenshot);
				if (result == null) result = caseModelElement(screenshot);
				if (result == null) result = caseIdentifiableElement(screenshot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsersequencePackage.SECTION_NODE: {
				SectionNode sectionNode = (SectionNode)theEObject;
				T result = caseSectionNode(sectionNode);
				if (result == null) result = caseNode(sectionNode);
				if (result == null) result = caseModelElement(sectionNode);
				if (result == null) result = caseIdentifiableElement(sectionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsersequencePackage.NAVIGATION: {
				Navigation navigation = (Navigation)theEObject;
				T result = caseNavigation(navigation);
				if (result == null) result = caseNode(navigation);
				if (result == null) result = caseModelElement(navigation);
				if (result == null) result = caseIdentifiableElement(navigation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsersequencePackage.WEB_ELEMENT: {
				WebElement webElement = (WebElement)theEObject;
				T result = caseWebElement(webElement);
				if (result == null) result = caseNode(webElement);
				if (result == null) result = caseModelElement(webElement);
				if (result == null) result = caseIdentifiableElement(webElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsersequencePackage.DIV: {
				Div div = (Div)theEObject;
				T result = caseDiv(div);
				if (result == null) result = caseWebElement(div);
				if (result == null) result = caseNode(div);
				if (result == null) result = caseModelElement(div);
				if (result == null) result = caseIdentifiableElement(div);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsersequencePackage.H: {
				H h = (H)theEObject;
				T result = caseH(h);
				if (result == null) result = caseWebElement(h);
				if (result == null) result = caseNode(h);
				if (result == null) result = caseModelElement(h);
				if (result == null) result = caseIdentifiableElement(h);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsersequencePackage.P: {
				P p = (P)theEObject;
				T result = caseP(p);
				if (result == null) result = caseWebElement(p);
				if (result == null) result = caseNode(p);
				if (result == null) result = caseModelElement(p);
				if (result == null) result = caseIdentifiableElement(p);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsersequencePackage.SPAN: {
				Span span = (Span)theEObject;
				T result = caseSpan(span);
				if (result == null) result = caseWebElement(span);
				if (result == null) result = caseNode(span);
				if (result == null) result = caseModelElement(span);
				if (result == null) result = caseIdentifiableElement(span);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsersequencePackage.LABEL: {
				Label label = (Label)theEObject;
				T result = caseLabel(label);
				if (result == null) result = caseWebElement(label);
				if (result == null) result = caseNode(label);
				if (result == null) result = caseModelElement(label);
				if (result == null) result = caseIdentifiableElement(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsersequencePackage.FORM: {
				Form form = (Form)theEObject;
				T result = caseForm(form);
				if (result == null) result = caseWebElement(form);
				if (result == null) result = caseNode(form);
				if (result == null) result = caseModelElement(form);
				if (result == null) result = caseIdentifiableElement(form);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsersequencePackage.INPUT: {
				Input input = (Input)theEObject;
				T result = caseInput(input);
				if (result == null) result = caseWebElement(input);
				if (result == null) result = caseNode(input);
				if (result == null) result = caseModelElement(input);
				if (result == null) result = caseIdentifiableElement(input);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsersequencePackage.TEXTAREA: {
				Textarea textarea = (Textarea)theEObject;
				T result = caseTextarea(textarea);
				if (result == null) result = caseWebElement(textarea);
				if (result == null) result = caseNode(textarea);
				if (result == null) result = caseModelElement(textarea);
				if (result == null) result = caseIdentifiableElement(textarea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsersequencePackage.BUTTON: {
				Button button = (Button)theEObject;
				T result = caseButton(button);
				if (result == null) result = caseWebElement(button);
				if (result == null) result = caseNode(button);
				if (result == null) result = caseModelElement(button);
				if (result == null) result = caseIdentifiableElement(button);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsersequencePackage.SELECT_BOX: {
				SelectBox selectBox = (SelectBox)theEObject;
				T result = caseSelectBox(selectBox);
				if (result == null) result = caseWebElement(selectBox);
				if (result == null) result = caseNode(selectBox);
				if (result == null) result = caseModelElement(selectBox);
				if (result == null) result = caseIdentifiableElement(selectBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsersequencePackage.SELECT_BOX_OPTION: {
				SelectBoxOption selectBoxOption = (SelectBoxOption)theEObject;
				T result = caseSelectBoxOption(selectBoxOption);
				if (result == null) result = caseWebElement(selectBoxOption);
				if (result == null) result = caseNode(selectBoxOption);
				if (result == null) result = caseModelElement(selectBoxOption);
				if (result == null) result = caseIdentifiableElement(selectBoxOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsersequencePackage.TABLE: {
				Table table = (Table)theEObject;
				T result = caseTable(table);
				if (result == null) result = caseWebElement(table);
				if (result == null) result = caseNode(table);
				if (result == null) result = caseModelElement(table);
				if (result == null) result = caseIdentifiableElement(table);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsersequencePackage.TABLE_HEAD: {
				TableHead tableHead = (TableHead)theEObject;
				T result = caseTableHead(tableHead);
				if (result == null) result = caseWebElement(tableHead);
				if (result == null) result = caseNode(tableHead);
				if (result == null) result = caseModelElement(tableHead);
				if (result == null) result = caseIdentifiableElement(tableHead);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsersequencePackage.TH: {
				Th th = (Th)theEObject;
				T result = caseTh(th);
				if (result == null) result = caseWebElement(th);
				if (result == null) result = caseNode(th);
				if (result == null) result = caseModelElement(th);
				if (result == null) result = caseIdentifiableElement(th);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsersequencePackage.TABLE_ROW: {
				TableRow tableRow = (TableRow)theEObject;
				T result = caseTableRow(tableRow);
				if (result == null) result = caseWebElement(tableRow);
				if (result == null) result = caseNode(tableRow);
				if (result == null) result = caseModelElement(tableRow);
				if (result == null) result = caseIdentifiableElement(tableRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsersequencePackage.TABLE_BODY: {
				TableBody tableBody = (TableBody)theEObject;
				T result = caseTableBody(tableBody);
				if (result == null) result = caseWebElement(tableBody);
				if (result == null) result = caseNode(tableBody);
				if (result == null) result = caseModelElement(tableBody);
				if (result == null) result = caseIdentifiableElement(tableBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsersequencePackage.TABLE_DATA: {
				TableData tableData = (TableData)theEObject;
				T result = caseTableData(tableData);
				if (result == null) result = caseWebElement(tableData);
				if (result == null) result = caseNode(tableData);
				if (result == null) result = caseModelElement(tableData);
				if (result == null) result = caseIdentifiableElement(tableData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsersequencePackage.SECTION: {
				Section section = (Section)theEObject;
				T result = caseSection(section);
				if (result == null) result = caseContainer(section);
				if (result == null) result = caseModelElementContainer(section);
				if (result == null) result = caseNode(section);
				if (result == null) result = caseModelElement(section);
				if (result == null) result = caseIdentifiableElement(section);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsersequencePackage.COMMENT: {
				Comment comment = (Comment)theEObject;
				T result = caseComment(comment);
				if (result == null) result = caseNode(comment);
				if (result == null) result = caseModelElement(comment);
				if (result == null) result = caseIdentifiableElement(comment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsersequencePackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseEdge(transition);
				if (result == null) result = caseModelElement(transition);
				if (result == null) result = caseIdentifiableElement(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsersequencePackage.LABELED_TRANSITION: {
				LabeledTransition labeledTransition = (LabeledTransition)theEObject;
				T result = caseLabeledTransition(labeledTransition);
				if (result == null) result = caseEdge(labeledTransition);
				if (result == null) result = caseModelElement(labeledTransition);
				if (result == null) result = caseIdentifiableElement(labeledTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsersequencePackage.ANCHOR: {
				Anchor anchor = (Anchor)theEObject;
				T result = caseAnchor(anchor);
				if (result == null) result = caseEdge(anchor);
				if (result == null) result = caseModelElement(anchor);
				if (result == null) result = caseIdentifiableElement(anchor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsersequencePackage.USER_SEQUENCE_GRAPH_MODEL: {
				UserSequenceGraphModel userSequenceGraphModel = (UserSequenceGraphModel)theEObject;
				T result = caseUserSequenceGraphModel(userSequenceGraphModel);
				if (result == null) result = caseGraphModel(userSequenceGraphModel);
				if (result == null) result = caseModelElementContainer(userSequenceGraphModel);
				if (result == null) result = caseIdentifiableElement(userSequenceGraphModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStart(Start object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStop(Stop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubSequence(SubSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base URL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base URL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseURL(BaseURL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomain(Domain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyValue(KeyValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screenshot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screenshot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScreenshot(Screenshot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSectionNode(SectionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigation(Navigation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebElement(WebElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Div</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Div</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiv(Div object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>H</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>H</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseH(H object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>P</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>P</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseP(P object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Span</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Span</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpan(Span object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForm(Form object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput(Input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Textarea</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Textarea</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextarea(Textarea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButton(Button object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectBox(SelectBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select Box Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select Box Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectBoxOption(SelectBoxOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Head</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Head</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableHead(TableHead object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Th</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Th</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTh(Th object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableRow(TableRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableBody(TableBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableData(TableData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection(Section object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment(Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labeled Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labeled Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabeledTransition(LabeledTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anchor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anchor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnchor(Anchor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Sequence Graph Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Sequence Graph Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserSequenceGraphModel(UserSequenceGraphModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiableElement(IdentifiableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElementContainer(ModelElementContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdge(Edge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphModel(GraphModel object) {
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

} //UsersequenceSwitch
