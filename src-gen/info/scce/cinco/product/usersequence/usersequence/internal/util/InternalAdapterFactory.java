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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalPackage
 * @generated
 */
public class InternalAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InternalPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = InternalPackage.eINSTANCE;
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
	protected InternalSwitch<Adapter> modelSwitch =
		new InternalSwitch<Adapter>() {
			@Override
			public Adapter caseInternalStart(InternalStart object) {
				return createInternalStartAdapter();
			}
			@Override
			public Adapter caseInternalStop(InternalStop object) {
				return createInternalStopAdapter();
			}
			@Override
			public Adapter caseInternalSubSequence(InternalSubSequence object) {
				return createInternalSubSequenceAdapter();
			}
			@Override
			public Adapter caseInternalBaseURL(InternalBaseURL object) {
				return createInternalBaseURLAdapter();
			}
			@Override
			public Adapter caseInternalDomain(InternalDomain object) {
				return createInternalDomainAdapter();
			}
			@Override
			public Adapter caseInternalKeyValue(InternalKeyValue object) {
				return createInternalKeyValueAdapter();
			}
			@Override
			public Adapter caseInternalScreenshot(InternalScreenshot object) {
				return createInternalScreenshotAdapter();
			}
			@Override
			public Adapter caseInternalSectionNode(InternalSectionNode object) {
				return createInternalSectionNodeAdapter();
			}
			@Override
			public Adapter caseInternalNavigation(InternalNavigation object) {
				return createInternalNavigationAdapter();
			}
			@Override
			public Adapter caseInternalWebElement(InternalWebElement object) {
				return createInternalWebElementAdapter();
			}
			@Override
			public Adapter caseInternalDiv(InternalDiv object) {
				return createInternalDivAdapter();
			}
			@Override
			public Adapter caseInternalH(InternalH object) {
				return createInternalHAdapter();
			}
			@Override
			public Adapter caseInternalP(InternalP object) {
				return createInternalPAdapter();
			}
			@Override
			public Adapter caseInternalSpan(InternalSpan object) {
				return createInternalSpanAdapter();
			}
			@Override
			public Adapter caseInternalLabel(InternalLabel object) {
				return createInternalLabelAdapter();
			}
			@Override
			public Adapter caseInternalForm(InternalForm object) {
				return createInternalFormAdapter();
			}
			@Override
			public Adapter caseInternalInput(InternalInput object) {
				return createInternalInputAdapter();
			}
			@Override
			public Adapter caseInternalTextarea(InternalTextarea object) {
				return createInternalTextareaAdapter();
			}
			@Override
			public Adapter caseInternalButton(InternalButton object) {
				return createInternalButtonAdapter();
			}
			@Override
			public Adapter caseInternalSelectBox(InternalSelectBox object) {
				return createInternalSelectBoxAdapter();
			}
			@Override
			public Adapter caseInternalSelectBoxOption(InternalSelectBoxOption object) {
				return createInternalSelectBoxOptionAdapter();
			}
			@Override
			public Adapter caseInternalTable(InternalTable object) {
				return createInternalTableAdapter();
			}
			@Override
			public Adapter caseInternalTableHead(InternalTableHead object) {
				return createInternalTableHeadAdapter();
			}
			@Override
			public Adapter caseInternalTh(InternalTh object) {
				return createInternalThAdapter();
			}
			@Override
			public Adapter caseInternalTableRow(InternalTableRow object) {
				return createInternalTableRowAdapter();
			}
			@Override
			public Adapter caseInternalTableBody(InternalTableBody object) {
				return createInternalTableBodyAdapter();
			}
			@Override
			public Adapter caseInternalTableData(InternalTableData object) {
				return createInternalTableDataAdapter();
			}
			@Override
			public Adapter caseInternalSection(InternalSection object) {
				return createInternalSectionAdapter();
			}
			@Override
			public Adapter caseInternalComment(InternalComment object) {
				return createInternalCommentAdapter();
			}
			@Override
			public Adapter caseInternalTransition(InternalTransition object) {
				return createInternalTransitionAdapter();
			}
			@Override
			public Adapter caseInternalLabeledTransition(InternalLabeledTransition object) {
				return createInternalLabeledTransitionAdapter();
			}
			@Override
			public Adapter caseInternalAnchor(InternalAnchor object) {
				return createInternalAnchorAdapter();
			}
			@Override
			public Adapter caseInternalUserSequenceGraphModel(InternalUserSequenceGraphModel object) {
				return createInternalUserSequenceGraphModelAdapter();
			}
			@Override
			public Adapter caseInternalIdentifiableElement(InternalIdentifiableElement object) {
				return createInternalIdentifiableElementAdapter();
			}
			@Override
			public Adapter caseInternalModelElement(InternalModelElement object) {
				return createInternalModelElementAdapter();
			}
			@Override
			public Adapter caseInternalNode(InternalNode object) {
				return createInternalNodeAdapter();
			}
			@Override
			public Adapter caseInternalModelElementContainer(InternalModelElementContainer object) {
				return createInternalModelElementContainerAdapter();
			}
			@Override
			public Adapter caseInternalContainer(InternalContainer object) {
				return createInternalContainerAdapter();
			}
			@Override
			public Adapter caseInternalEdge(InternalEdge object) {
				return createInternalEdgeAdapter();
			}
			@Override
			public Adapter caseInternalGraphModel(InternalGraphModel object) {
				return createInternalGraphModelAdapter();
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
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalStart
	 * @generated
	 */
	public Adapter createInternalStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalStop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalStop
	 * @generated
	 */
	public Adapter createInternalStopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalSubSequence <em>Sub Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalSubSequence
	 * @generated
	 */
	public Adapter createInternalSubSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalBaseURL <em>Base URL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalBaseURL
	 * @generated
	 */
	public Adapter createInternalBaseURLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalDomain
	 * @generated
	 */
	public Adapter createInternalDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalKeyValue <em>Key Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalKeyValue
	 * @generated
	 */
	public Adapter createInternalKeyValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalScreenshot <em>Screenshot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalScreenshot
	 * @generated
	 */
	public Adapter createInternalScreenshotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalSectionNode <em>Section Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalSectionNode
	 * @generated
	 */
	public Adapter createInternalSectionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalNavigation <em>Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalNavigation
	 * @generated
	 */
	public Adapter createInternalNavigationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalWebElement <em>Web Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalWebElement
	 * @generated
	 */
	public Adapter createInternalWebElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalDiv
	 * @generated
	 */
	public Adapter createInternalDivAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalH <em>H</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalH
	 * @generated
	 */
	public Adapter createInternalHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalP
	 * @generated
	 */
	public Adapter createInternalPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalSpan
	 * @generated
	 */
	public Adapter createInternalSpanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalLabel
	 * @generated
	 */
	public Adapter createInternalLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalForm
	 * @generated
	 */
	public Adapter createInternalFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalInput
	 * @generated
	 */
	public Adapter createInternalInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalTextarea <em>Textarea</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalTextarea
	 * @generated
	 */
	public Adapter createInternalTextareaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalButton <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalButton
	 * @generated
	 */
	public Adapter createInternalButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalSelectBox <em>Select Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalSelectBox
	 * @generated
	 */
	public Adapter createInternalSelectBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalSelectBoxOption <em>Select Box Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalSelectBoxOption
	 * @generated
	 */
	public Adapter createInternalSelectBoxOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalTable
	 * @generated
	 */
	public Adapter createInternalTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalTableHead <em>Table Head</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalTableHead
	 * @generated
	 */
	public Adapter createInternalTableHeadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalTh <em>Th</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalTh
	 * @generated
	 */
	public Adapter createInternalThAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalTableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalTableRow
	 * @generated
	 */
	public Adapter createInternalTableRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalTableBody <em>Table Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalTableBody
	 * @generated
	 */
	public Adapter createInternalTableBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalTableData <em>Table Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalTableData
	 * @generated
	 */
	public Adapter createInternalTableDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalSection
	 * @generated
	 */
	public Adapter createInternalSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalComment
	 * @generated
	 */
	public Adapter createInternalCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalTransition
	 * @generated
	 */
	public Adapter createInternalTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalLabeledTransition <em>Labeled Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalLabeledTransition
	 * @generated
	 */
	public Adapter createInternalLabeledTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalAnchor <em>Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalAnchor
	 * @generated
	 */
	public Adapter createInternalAnchorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalUserSequenceGraphModel <em>User Sequence Graph Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalUserSequenceGraphModel
	 * @generated
	 */
	public Adapter createInternalUserSequenceGraphModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.internal.InternalIdentifiableElement <em>Identifiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.internal.InternalIdentifiableElement
	 * @generated
	 */
	public Adapter createInternalIdentifiableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.internal.InternalModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.internal.InternalModelElement
	 * @generated
	 */
	public Adapter createInternalModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.internal.InternalNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.internal.InternalNode
	 * @generated
	 */
	public Adapter createInternalNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.internal.InternalModelElementContainer <em>Model Element Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.internal.InternalModelElementContainer
	 * @generated
	 */
	public Adapter createInternalModelElementContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.internal.InternalContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.internal.InternalContainer
	 * @generated
	 */
	public Adapter createInternalContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.internal.InternalEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.internal.InternalEdge
	 * @generated
	 */
	public Adapter createInternalEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.internal.InternalGraphModel <em>Graph Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.internal.InternalGraphModel
	 * @generated
	 */
	public Adapter createInternalGraphModelAdapter() {
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

} //InternalAdapterFactory
