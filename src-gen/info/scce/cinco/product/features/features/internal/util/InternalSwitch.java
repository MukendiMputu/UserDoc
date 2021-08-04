/**
 */
package info.scce.cinco.product.features.features.internal.util;

import graphmodel.internal.InternalContainer;
import graphmodel.internal.InternalGraphModel;
import graphmodel.internal.InternalIdentifiableElement;
import graphmodel.internal.InternalModelElement;
import graphmodel.internal.InternalModelElementContainer;
import graphmodel.internal.InternalNode;

import info.scce.cinco.product.features.features.internal.*;

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
 * @see info.scce.cinco.product.features.features.internal.InternalPackage
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
			case InternalPackage.INTERNAL_START_NODE: {
				InternalStartNode internalStartNode = (InternalStartNode)theEObject;
				T result = caseInternalStartNode(internalStartNode);
				if (result == null) result = caseInternalNode(internalStartNode);
				if (result == null) result = caseInternalModelElement(internalStartNode);
				if (result == null) result = caseInternalIdentifiableElement(internalStartNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_END_NODE: {
				InternalEndNode internalEndNode = (InternalEndNode)theEObject;
				T result = caseInternalEndNode(internalEndNode);
				if (result == null) result = caseInternalNode(internalEndNode);
				if (result == null) result = caseInternalModelElement(internalEndNode);
				if (result == null) result = caseInternalIdentifiableElement(internalEndNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_FEATURE_CONTAINER: {
				InternalFeatureContainer internalFeatureContainer = (InternalFeatureContainer)theEObject;
				T result = caseInternalFeatureContainer(internalFeatureContainer);
				if (result == null) result = caseInternalContainer(internalFeatureContainer);
				if (result == null) result = caseInternalNode(internalFeatureContainer);
				if (result == null) result = caseInternalModelElementContainer(internalFeatureContainer);
				if (result == null) result = caseInternalModelElement(internalFeatureContainer);
				if (result == null) result = caseInternalIdentifiableElement(internalFeatureContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_DOC_NODE: {
				InternalDocNode internalDocNode = (InternalDocNode)theEObject;
				T result = caseInternalDocNode(internalDocNode);
				if (result == null) result = caseInternalNode(internalDocNode);
				if (result == null) result = caseInternalModelElement(internalDocNode);
				if (result == null) result = caseInternalIdentifiableElement(internalDocNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_EDGE: {
				InternalEdge internalEdge = (InternalEdge)theEObject;
				T result = caseInternalEdge(internalEdge);
				if (result == null) result = caseInternal_InternalEdge(internalEdge);
				if (result == null) result = caseInternalModelElement(internalEdge);
				if (result == null) result = caseInternalIdentifiableElement(internalEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_LABELED_EDGE: {
				InternalLabeledEdge internalLabeledEdge = (InternalLabeledEdge)theEObject;
				T result = caseInternalLabeledEdge(internalLabeledEdge);
				if (result == null) result = caseInternal_InternalEdge(internalLabeledEdge);
				if (result == null) result = caseInternalModelElement(internalLabeledEdge);
				if (result == null) result = caseInternalIdentifiableElement(internalLabeledEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_FEATURES_GRAPH_MODEL: {
				InternalFeaturesGraphModel internalFeaturesGraphModel = (InternalFeaturesGraphModel)theEObject;
				T result = caseInternalFeaturesGraphModel(internalFeaturesGraphModel);
				if (result == null) result = caseInternalGraphModel(internalFeaturesGraphModel);
				if (result == null) result = caseInternalModelElementContainer(internalFeaturesGraphModel);
				if (result == null) result = caseInternalIdentifiableElement(internalFeaturesGraphModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalStartNode(InternalStartNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalEndNode(InternalEndNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalFeatureContainer(InternalFeatureContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Doc Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Doc Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalDocNode(InternalDocNode object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Labeled Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labeled Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalLabeledEdge(InternalLabeledEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Features Graph Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Features Graph Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalFeaturesGraphModel(InternalFeaturesGraphModel object) {
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
	public T caseInternal_InternalEdge(graphmodel.internal.InternalEdge object) {
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
