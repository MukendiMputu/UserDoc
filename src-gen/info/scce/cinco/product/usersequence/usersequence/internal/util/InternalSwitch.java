/**
 */
package info.scce.cinco.product.usersequence.usersequence.internal.util;

import graphmodel.internal.InternalContainer;
import graphmodel.internal.InternalEdge;
import graphmodel.internal.InternalGraphModel;
import graphmodel.internal.InternalIdentifiableElement;
import graphmodel.internal.InternalModelElement;
import graphmodel.internal.InternalModelElementContainer;
import graphmodel.internal.InternalNode;

import info.scce.cinco.product.usersequence.usersequence.internal.*;

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
 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalPackage
 * @generated
 */
public class InternalSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InternalPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalSwitch() {
		if (modelPackage == null) {
			modelPackage = InternalPackage.eINSTANCE;
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
			case InternalPackage.INTERNAL_START: {
				InternalStart internalStart = (InternalStart)theEObject;
				T result = caseInternalStart(internalStart);
				if (result == null) result = caseInternalNode(internalStart);
				if (result == null) result = caseInternalModelElement(internalStart);
				if (result == null) result = caseInternalIdentifiableElement(internalStart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_STOP: {
				InternalStop internalStop = (InternalStop)theEObject;
				T result = caseInternalStop(internalStop);
				if (result == null) result = caseInternalNode(internalStop);
				if (result == null) result = caseInternalModelElement(internalStop);
				if (result == null) result = caseInternalIdentifiableElement(internalStop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_SUB_SEQUENCE: {
				InternalSubSequence internalSubSequence = (InternalSubSequence)theEObject;
				T result = caseInternalSubSequence(internalSubSequence);
				if (result == null) result = caseInternalNode(internalSubSequence);
				if (result == null) result = caseInternalModelElement(internalSubSequence);
				if (result == null) result = caseInternalIdentifiableElement(internalSubSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_BASE_URL: {
				InternalBaseURL internalBaseURL = (InternalBaseURL)theEObject;
				T result = caseInternalBaseURL(internalBaseURL);
				if (result == null) result = caseInternalNode(internalBaseURL);
				if (result == null) result = caseInternalModelElement(internalBaseURL);
				if (result == null) result = caseInternalIdentifiableElement(internalBaseURL);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_DOMAIN: {
				InternalDomain internalDomain = (InternalDomain)theEObject;
				T result = caseInternalDomain(internalDomain);
				if (result == null) result = caseInternalNode(internalDomain);
				if (result == null) result = caseInternalModelElement(internalDomain);
				if (result == null) result = caseInternalIdentifiableElement(internalDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_KEY_VALUE: {
				InternalKeyValue internalKeyValue = (InternalKeyValue)theEObject;
				T result = caseInternalKeyValue(internalKeyValue);
				if (result == null) result = caseInternalNode(internalKeyValue);
				if (result == null) result = caseInternalModelElement(internalKeyValue);
				if (result == null) result = caseInternalIdentifiableElement(internalKeyValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_SCREENSHOT: {
				InternalScreenshot internalScreenshot = (InternalScreenshot)theEObject;
				T result = caseInternalScreenshot(internalScreenshot);
				if (result == null) result = caseInternalNode(internalScreenshot);
				if (result == null) result = caseInternalModelElement(internalScreenshot);
				if (result == null) result = caseInternalIdentifiableElement(internalScreenshot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_SECTION_NODE: {
				InternalSectionNode internalSectionNode = (InternalSectionNode)theEObject;
				T result = caseInternalSectionNode(internalSectionNode);
				if (result == null) result = caseInternalNode(internalSectionNode);
				if (result == null) result = caseInternalModelElement(internalSectionNode);
				if (result == null) result = caseInternalIdentifiableElement(internalSectionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_NAVIGATION: {
				InternalNavigation internalNavigation = (InternalNavigation)theEObject;
				T result = caseInternalNavigation(internalNavigation);
				if (result == null) result = caseInternalNode(internalNavigation);
				if (result == null) result = caseInternalModelElement(internalNavigation);
				if (result == null) result = caseInternalIdentifiableElement(internalNavigation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_WEB_ELEMENT: {
				InternalWebElement internalWebElement = (InternalWebElement)theEObject;
				T result = caseInternalWebElement(internalWebElement);
				if (result == null) result = caseInternalNode(internalWebElement);
				if (result == null) result = caseInternalModelElement(internalWebElement);
				if (result == null) result = caseInternalIdentifiableElement(internalWebElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_DIV: {
				InternalDiv internalDiv = (InternalDiv)theEObject;
				T result = caseInternalDiv(internalDiv);
				if (result == null) result = caseInternalWebElement(internalDiv);
				if (result == null) result = caseInternalNode(internalDiv);
				if (result == null) result = caseInternalModelElement(internalDiv);
				if (result == null) result = caseInternalIdentifiableElement(internalDiv);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_H: {
				InternalH internalH = (InternalH)theEObject;
				T result = caseInternalH(internalH);
				if (result == null) result = caseInternalWebElement(internalH);
				if (result == null) result = caseInternalNode(internalH);
				if (result == null) result = caseInternalModelElement(internalH);
				if (result == null) result = caseInternalIdentifiableElement(internalH);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_P: {
				InternalP internalP = (InternalP)theEObject;
				T result = caseInternalP(internalP);
				if (result == null) result = caseInternalWebElement(internalP);
				if (result == null) result = caseInternalNode(internalP);
				if (result == null) result = caseInternalModelElement(internalP);
				if (result == null) result = caseInternalIdentifiableElement(internalP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_SPAN: {
				InternalSpan internalSpan = (InternalSpan)theEObject;
				T result = caseInternalSpan(internalSpan);
				if (result == null) result = caseInternalWebElement(internalSpan);
				if (result == null) result = caseInternalNode(internalSpan);
				if (result == null) result = caseInternalModelElement(internalSpan);
				if (result == null) result = caseInternalIdentifiableElement(internalSpan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_LABEL: {
				InternalLabel internalLabel = (InternalLabel)theEObject;
				T result = caseInternalLabel(internalLabel);
				if (result == null) result = caseInternalWebElement(internalLabel);
				if (result == null) result = caseInternalNode(internalLabel);
				if (result == null) result = caseInternalModelElement(internalLabel);
				if (result == null) result = caseInternalIdentifiableElement(internalLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_FORM: {
				InternalForm internalForm = (InternalForm)theEObject;
				T result = caseInternalForm(internalForm);
				if (result == null) result = caseInternalWebElement(internalForm);
				if (result == null) result = caseInternalNode(internalForm);
				if (result == null) result = caseInternalModelElement(internalForm);
				if (result == null) result = caseInternalIdentifiableElement(internalForm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_INPUT: {
				InternalInput internalInput = (InternalInput)theEObject;
				T result = caseInternalInput(internalInput);
				if (result == null) result = caseInternalWebElement(internalInput);
				if (result == null) result = caseInternalNode(internalInput);
				if (result == null) result = caseInternalModelElement(internalInput);
				if (result == null) result = caseInternalIdentifiableElement(internalInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_TEXTAREA: {
				InternalTextarea internalTextarea = (InternalTextarea)theEObject;
				T result = caseInternalTextarea(internalTextarea);
				if (result == null) result = caseInternalWebElement(internalTextarea);
				if (result == null) result = caseInternalNode(internalTextarea);
				if (result == null) result = caseInternalModelElement(internalTextarea);
				if (result == null) result = caseInternalIdentifiableElement(internalTextarea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_BUTTON: {
				InternalButton internalButton = (InternalButton)theEObject;
				T result = caseInternalButton(internalButton);
				if (result == null) result = caseInternalWebElement(internalButton);
				if (result == null) result = caseInternalNode(internalButton);
				if (result == null) result = caseInternalModelElement(internalButton);
				if (result == null) result = caseInternalIdentifiableElement(internalButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_SELECT_BOX: {
				InternalSelectBox internalSelectBox = (InternalSelectBox)theEObject;
				T result = caseInternalSelectBox(internalSelectBox);
				if (result == null) result = caseInternalWebElement(internalSelectBox);
				if (result == null) result = caseInternalNode(internalSelectBox);
				if (result == null) result = caseInternalModelElement(internalSelectBox);
				if (result == null) result = caseInternalIdentifiableElement(internalSelectBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_SELECT_BOX_OPTION: {
				InternalSelectBoxOption internalSelectBoxOption = (InternalSelectBoxOption)theEObject;
				T result = caseInternalSelectBoxOption(internalSelectBoxOption);
				if (result == null) result = caseInternalWebElement(internalSelectBoxOption);
				if (result == null) result = caseInternalNode(internalSelectBoxOption);
				if (result == null) result = caseInternalModelElement(internalSelectBoxOption);
				if (result == null) result = caseInternalIdentifiableElement(internalSelectBoxOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_TABLE: {
				InternalTable internalTable = (InternalTable)theEObject;
				T result = caseInternalTable(internalTable);
				if (result == null) result = caseInternalWebElement(internalTable);
				if (result == null) result = caseInternalNode(internalTable);
				if (result == null) result = caseInternalModelElement(internalTable);
				if (result == null) result = caseInternalIdentifiableElement(internalTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_TABLE_HEAD: {
				InternalTableHead internalTableHead = (InternalTableHead)theEObject;
				T result = caseInternalTableHead(internalTableHead);
				if (result == null) result = caseInternalWebElement(internalTableHead);
				if (result == null) result = caseInternalNode(internalTableHead);
				if (result == null) result = caseInternalModelElement(internalTableHead);
				if (result == null) result = caseInternalIdentifiableElement(internalTableHead);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_TH: {
				InternalTh internalTh = (InternalTh)theEObject;
				T result = caseInternalTh(internalTh);
				if (result == null) result = caseInternalWebElement(internalTh);
				if (result == null) result = caseInternalNode(internalTh);
				if (result == null) result = caseInternalModelElement(internalTh);
				if (result == null) result = caseInternalIdentifiableElement(internalTh);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_TABLE_ROW: {
				InternalTableRow internalTableRow = (InternalTableRow)theEObject;
				T result = caseInternalTableRow(internalTableRow);
				if (result == null) result = caseInternalWebElement(internalTableRow);
				if (result == null) result = caseInternalNode(internalTableRow);
				if (result == null) result = caseInternalModelElement(internalTableRow);
				if (result == null) result = caseInternalIdentifiableElement(internalTableRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_TABLE_BODY: {
				InternalTableBody internalTableBody = (InternalTableBody)theEObject;
				T result = caseInternalTableBody(internalTableBody);
				if (result == null) result = caseInternalWebElement(internalTableBody);
				if (result == null) result = caseInternalNode(internalTableBody);
				if (result == null) result = caseInternalModelElement(internalTableBody);
				if (result == null) result = caseInternalIdentifiableElement(internalTableBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_TABLE_DATA: {
				InternalTableData internalTableData = (InternalTableData)theEObject;
				T result = caseInternalTableData(internalTableData);
				if (result == null) result = caseInternalWebElement(internalTableData);
				if (result == null) result = caseInternalNode(internalTableData);
				if (result == null) result = caseInternalModelElement(internalTableData);
				if (result == null) result = caseInternalIdentifiableElement(internalTableData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_SECTION: {
				InternalSection internalSection = (InternalSection)theEObject;
				T result = caseInternalSection(internalSection);
				if (result == null) result = caseInternalContainer(internalSection);
				if (result == null) result = caseInternalNode(internalSection);
				if (result == null) result = caseInternalModelElementContainer(internalSection);
				if (result == null) result = caseInternalModelElement(internalSection);
				if (result == null) result = caseInternalIdentifiableElement(internalSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_COMMENT: {
				InternalComment internalComment = (InternalComment)theEObject;
				T result = caseInternalComment(internalComment);
				if (result == null) result = caseInternalNode(internalComment);
				if (result == null) result = caseInternalModelElement(internalComment);
				if (result == null) result = caseInternalIdentifiableElement(internalComment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_TRANSITION: {
				InternalTransition internalTransition = (InternalTransition)theEObject;
				T result = caseInternalTransition(internalTransition);
				if (result == null) result = caseInternalEdge(internalTransition);
				if (result == null) result = caseInternalModelElement(internalTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_LABELED_TRANSITION: {
				InternalLabeledTransition internalLabeledTransition = (InternalLabeledTransition)theEObject;
				T result = caseInternalLabeledTransition(internalLabeledTransition);
				if (result == null) result = caseInternalEdge(internalLabeledTransition);
				if (result == null) result = caseInternalModelElement(internalLabeledTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalLabeledTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_ANCHOR: {
				InternalAnchor internalAnchor = (InternalAnchor)theEObject;
				T result = caseInternalAnchor(internalAnchor);
				if (result == null) result = caseInternalEdge(internalAnchor);
				if (result == null) result = caseInternalModelElement(internalAnchor);
				if (result == null) result = caseInternalIdentifiableElement(internalAnchor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_USER_SEQUENCE_GRAPH_MODEL: {
				InternalUserSequenceGraphModel internalUserSequenceGraphModel = (InternalUserSequenceGraphModel)theEObject;
				T result = caseInternalUserSequenceGraphModel(internalUserSequenceGraphModel);
				if (result == null) result = caseInternalGraphModel(internalUserSequenceGraphModel);
				if (result == null) result = caseInternalModelElementContainer(internalUserSequenceGraphModel);
				if (result == null) result = caseInternalIdentifiableElement(internalUserSequenceGraphModel);
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
	public T caseInternalStart(InternalStart object) {
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
	public T caseInternalStop(InternalStop object) {
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
	public T caseInternalSubSequence(InternalSubSequence object) {
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
	public T caseInternalBaseURL(InternalBaseURL object) {
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
	public T caseInternalDomain(InternalDomain object) {
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
	public T caseInternalKeyValue(InternalKeyValue object) {
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
	public T caseInternalScreenshot(InternalScreenshot object) {
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
	public T caseInternalSectionNode(InternalSectionNode object) {
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
	public T caseInternalNavigation(InternalNavigation object) {
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
	public T caseInternalWebElement(InternalWebElement object) {
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
	public T caseInternalDiv(InternalDiv object) {
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
	public T caseInternalH(InternalH object) {
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
	public T caseInternalP(InternalP object) {
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
	public T caseInternalSpan(InternalSpan object) {
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
	public T caseInternalLabel(InternalLabel object) {
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
	public T caseInternalForm(InternalForm object) {
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
	public T caseInternalInput(InternalInput object) {
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
	public T caseInternalTextarea(InternalTextarea object) {
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
	public T caseInternalButton(InternalButton object) {
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
	public T caseInternalSelectBox(InternalSelectBox object) {
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
	public T caseInternalSelectBoxOption(InternalSelectBoxOption object) {
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
	public T caseInternalTable(InternalTable object) {
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
	public T caseInternalTableHead(InternalTableHead object) {
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
	public T caseInternalTh(InternalTh object) {
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
	public T caseInternalTableRow(InternalTableRow object) {
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
	public T caseInternalTableBody(InternalTableBody object) {
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
	public T caseInternalTableData(InternalTableData object) {
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
	public T caseInternalSection(InternalSection object) {
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
	public T caseInternalComment(InternalComment object) {
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
	public T caseInternalTransition(InternalTransition object) {
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
	public T caseInternalLabeledTransition(InternalLabeledTransition object) {
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
	public T caseInternalAnchor(InternalAnchor object) {
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
	public T caseInternalUserSequenceGraphModel(InternalUserSequenceGraphModel object) {
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
	public T caseInternalIdentifiableElement(InternalIdentifiableElement object) {
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
	public T caseInternalModelElement(InternalModelElement object) {
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
	public T caseInternalNode(InternalNode object) {
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
	public T caseInternalModelElementContainer(InternalModelElementContainer object) {
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
	public T caseInternalContainer(InternalContainer object) {
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
	public T caseInternalEdge(InternalEdge object) {
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
	public T caseInternalGraphModel(InternalGraphModel object) {
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

} //InternalSwitch
