/**
 */
package info.scce.cinco.product.features.features;

import graphmodel.GraphModel;
import graphmodel.Node;

import info.scce.cinco.product.features.features.internal.InternalFeaturesGraphModel;

import info.scce.cinco.product.features.features.views.FeaturesGraphModelView;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Model</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see info.scce.cinco.product.features.features.FeaturesPackage#getFeaturesGraphModel()
 * @model
 * @generated
 */
public interface FeaturesGraphModel extends GraphModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setName(String _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	InternalFeaturesGraphModel getInternalFeaturesGraphModel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isExactlyFeaturesGraphModel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void preDelete();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="graphmodel.Runnable" required="true"
	 * @generated
	 */
	Runnable getPostDeleteFunction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="graphmodel.Runnable" required="true"
	 * @generated
	 */
	Runnable getPostDeleteEvent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void preSave();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void postSave();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	FeaturesGraphModel getRootElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 * @generated
	 */
	EList<? extends Node> getNodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<StartNode> getStartNodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewStartNode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	StartNode newStartNode(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	StartNode newStartNode(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	StartNode newStartNode(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	StartNode newStartNode(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<DocNode> getDocNodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewDocNode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" mglRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	DocNode newDocNode(EObject mgl, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" mglRequired="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	DocNode newDocNode(EObject mgl, String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" mglRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	DocNode newDocNode(EObject mgl, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" mglRequired="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	DocNode newDocNode(EObject mgl, String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<FeatureContainer> getFeatureContainers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewFeatureContainer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	FeatureContainer newFeatureContainer(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	FeatureContainer newFeatureContainer(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	FeatureContainer newFeatureContainer(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	FeatureContainer newFeatureContainer(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<EndNode> getEndNodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewEndNode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	EndNode newEndNode(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	EndNode newEndNode(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	EndNode newEndNode(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	EndNode newEndNode(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" pathRequired="true" fileNameRequired="true" postCreateHookRequired="true"
	 * @generated
	 */
	FeaturesGraphModel newFeaturesGraphModel(String path, String fileName, boolean postCreateHook);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	FeaturesGraphModelView getFeaturesGraphModelView();

} // FeaturesGraphModel
