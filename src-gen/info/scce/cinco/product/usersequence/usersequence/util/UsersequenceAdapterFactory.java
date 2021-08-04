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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.usersequence.usersequence.UsersequencePackage
 * @generated
 */
public class UsersequenceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UsersequencePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsersequenceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UsersequencePackage.eINSTANCE;
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
	protected UsersequenceSwitch<Adapter> modelSwitch =
		new UsersequenceSwitch<Adapter>() {
			@Override
			public Adapter caseStart(Start object) {
				return createStartAdapter();
			}
			@Override
			public Adapter caseStop(Stop object) {
				return createStopAdapter();
			}
			@Override
			public Adapter caseSubSequence(SubSequence object) {
				return createSubSequenceAdapter();
			}
			@Override
			public Adapter caseBaseURL(BaseURL object) {
				return createBaseURLAdapter();
			}
			@Override
			public Adapter caseDomain(Domain object) {
				return createDomainAdapter();
			}
			@Override
			public Adapter caseKeyValue(KeyValue object) {
				return createKeyValueAdapter();
			}
			@Override
			public Adapter caseScreenshot(Screenshot object) {
				return createScreenshotAdapter();
			}
			@Override
			public Adapter caseSectionNode(SectionNode object) {
				return createSectionNodeAdapter();
			}
			@Override
			public Adapter caseNavigation(Navigation object) {
				return createNavigationAdapter();
			}
			@Override
			public Adapter caseWebElement(WebElement object) {
				return createWebElementAdapter();
			}
			@Override
			public Adapter caseDiv(Div object) {
				return createDivAdapter();
			}
			@Override
			public Adapter caseH(H object) {
				return createHAdapter();
			}
			@Override
			public Adapter caseP(P object) {
				return createPAdapter();
			}
			@Override
			public Adapter caseSpan(Span object) {
				return createSpanAdapter();
			}
			@Override
			public Adapter caseLabel(Label object) {
				return createLabelAdapter();
			}
			@Override
			public Adapter caseForm(Form object) {
				return createFormAdapter();
			}
			@Override
			public Adapter caseInput(Input object) {
				return createInputAdapter();
			}
			@Override
			public Adapter caseTextarea(Textarea object) {
				return createTextareaAdapter();
			}
			@Override
			public Adapter caseButton(Button object) {
				return createButtonAdapter();
			}
			@Override
			public Adapter caseSelectBox(SelectBox object) {
				return createSelectBoxAdapter();
			}
			@Override
			public Adapter caseSelectBoxOption(SelectBoxOption object) {
				return createSelectBoxOptionAdapter();
			}
			@Override
			public Adapter caseTable(Table object) {
				return createTableAdapter();
			}
			@Override
			public Adapter caseTableHead(TableHead object) {
				return createTableHeadAdapter();
			}
			@Override
			public Adapter caseTh(Th object) {
				return createThAdapter();
			}
			@Override
			public Adapter caseTableRow(TableRow object) {
				return createTableRowAdapter();
			}
			@Override
			public Adapter caseTableBody(TableBody object) {
				return createTableBodyAdapter();
			}
			@Override
			public Adapter caseTableData(TableData object) {
				return createTableDataAdapter();
			}
			@Override
			public Adapter caseSection(Section object) {
				return createSectionAdapter();
			}
			@Override
			public Adapter caseComment(Comment object) {
				return createCommentAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseLabeledTransition(LabeledTransition object) {
				return createLabeledTransitionAdapter();
			}
			@Override
			public Adapter caseAnchor(Anchor object) {
				return createAnchorAdapter();
			}
			@Override
			public Adapter caseUserSequenceGraphModel(UserSequenceGraphModel object) {
				return createUserSequenceGraphModelAdapter();
			}
			@Override
			public Adapter caseIdentifiableElement(IdentifiableElement object) {
				return createIdentifiableElementAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseModelElementContainer(ModelElementContainer object) {
				return createModelElementContainerAdapter();
			}
			@Override
			public Adapter caseContainer(Container object) {
				return createContainerAdapter();
			}
			@Override
			public Adapter caseEdge(Edge object) {
				return createEdgeAdapter();
			}
			@Override
			public Adapter caseGraphModel(GraphModel object) {
				return createGraphModelAdapter();
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
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.Start
	 * @generated
	 */
	public Adapter createStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.Stop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.Stop
	 * @generated
	 */
	public Adapter createStopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.SubSequence <em>Sub Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.SubSequence
	 * @generated
	 */
	public Adapter createSubSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.BaseURL <em>Base URL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.BaseURL
	 * @generated
	 */
	public Adapter createBaseURLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.Domain
	 * @generated
	 */
	public Adapter createDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.KeyValue <em>Key Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.KeyValue
	 * @generated
	 */
	public Adapter createKeyValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.Screenshot <em>Screenshot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.Screenshot
	 * @generated
	 */
	public Adapter createScreenshotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.SectionNode <em>Section Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.SectionNode
	 * @generated
	 */
	public Adapter createSectionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.Navigation <em>Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.Navigation
	 * @generated
	 */
	public Adapter createNavigationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.WebElement <em>Web Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.WebElement
	 * @generated
	 */
	public Adapter createWebElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.Div <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.Div
	 * @generated
	 */
	public Adapter createDivAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.H <em>H</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.H
	 * @generated
	 */
	public Adapter createHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.P <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.P
	 * @generated
	 */
	public Adapter createPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.Span <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.Span
	 * @generated
	 */
	public Adapter createSpanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.Form
	 * @generated
	 */
	public Adapter createFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.Input
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.Textarea <em>Textarea</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.Textarea
	 * @generated
	 */
	public Adapter createTextareaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.Button
	 * @generated
	 */
	public Adapter createButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.SelectBox <em>Select Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.SelectBox
	 * @generated
	 */
	public Adapter createSelectBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.SelectBoxOption <em>Select Box Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.SelectBoxOption
	 * @generated
	 */
	public Adapter createSelectBoxOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.TableHead <em>Table Head</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.TableHead
	 * @generated
	 */
	public Adapter createTableHeadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.Th <em>Th</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.Th
	 * @generated
	 */
	public Adapter createThAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.TableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.TableRow
	 * @generated
	 */
	public Adapter createTableRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.TableBody <em>Table Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.TableBody
	 * @generated
	 */
	public Adapter createTableBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.TableData <em>Table Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.TableData
	 * @generated
	 */
	public Adapter createTableDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.Section
	 * @generated
	 */
	public Adapter createSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.LabeledTransition <em>Labeled Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.LabeledTransition
	 * @generated
	 */
	public Adapter createLabeledTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.Anchor <em>Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.Anchor
	 * @generated
	 */
	public Adapter createAnchorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.usersequence.usersequence.UserSequenceGraphModel <em>User Sequence Graph Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.usersequence.usersequence.UserSequenceGraphModel
	 * @generated
	 */
	public Adapter createUserSequenceGraphModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.IdentifiableElement <em>Identifiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.IdentifiableElement
	 * @generated
	 */
	public Adapter createIdentifiableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.ModelElementContainer <em>Model Element Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.ModelElementContainer
	 * @generated
	 */
	public Adapter createModelElementContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.Edge
	 * @generated
	 */
	public Adapter createEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.GraphModel <em>Graph Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.GraphModel
	 * @generated
	 */
	public Adapter createGraphModelAdapter() {
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

} //UsersequenceAdapterFactory
