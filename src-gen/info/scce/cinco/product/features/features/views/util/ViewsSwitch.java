/**
 */
package info.scce.cinco.product.features.features.views.util;

import info.scce.cinco.product.features.features.views.*;

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
 * @see info.scce.cinco.product.features.features.views.ViewsPackage
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
			case ViewsPackage.START_NODE_VIEW: {
				StartNodeView startNodeView = (StartNodeView)theEObject;
				T result = caseStartNodeView(startNodeView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.END_NODE_VIEW: {
				EndNodeView endNodeView = (EndNodeView)theEObject;
				T result = caseEndNodeView(endNodeView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.FEATURE_CONTAINER_VIEW: {
				FeatureContainerView featureContainerView = (FeatureContainerView)theEObject;
				T result = caseFeatureContainerView(featureContainerView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.DOC_NODE_VIEW: {
				DocNodeView docNodeView = (DocNodeView)theEObject;
				T result = caseDocNodeView(docNodeView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.EDGE_VIEW: {
				EdgeView edgeView = (EdgeView)theEObject;
				T result = caseEdgeView(edgeView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.LABELED_EDGE_VIEW: {
				LabeledEdgeView labeledEdgeView = (LabeledEdgeView)theEObject;
				T result = caseLabeledEdgeView(labeledEdgeView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.FEATURES_GRAPH_MODEL_VIEW: {
				FeaturesGraphModelView featuresGraphModelView = (FeaturesGraphModelView)theEObject;
				T result = caseFeaturesGraphModelView(featuresGraphModelView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Node View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Node View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartNodeView(StartNodeView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Node View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Node View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndNodeView(EndNodeView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Container View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Container View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureContainerView(FeatureContainerView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Doc Node View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Doc Node View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocNodeView(DocNodeView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdgeView(EdgeView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labeled Edge View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labeled Edge View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabeledEdgeView(LabeledEdgeView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Features Graph Model View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Features Graph Model View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeaturesGraphModelView(FeaturesGraphModelView object) {
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
