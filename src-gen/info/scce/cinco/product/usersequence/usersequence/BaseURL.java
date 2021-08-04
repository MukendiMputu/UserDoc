/**
 */
package info.scce.cinco.product.usersequence.usersequence;

import graphmodel.Direction;
import graphmodel.GraphModel;
import graphmodel.ModelElementContainer;
import graphmodel.Node;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalBaseURL;

import info.scce.cinco.product.usersequence.usersequence.views.BaseURLView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base URL</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see info.scce.cinco.product.usersequence.usersequence.UsersequencePackage#getBaseURL()
 * @model
 * @generated
 */
public interface BaseURL extends Node {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getContent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setContent(String _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	InternalBaseURL getInternalBaseURL();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isExactlyBaseURL();

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
	GraphModel getRootElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model containerRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void s_moveTo(ModelElementContainer container, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model newContainerRequired="true" newXRequired="true" newYRequired="true"
	 * @generated
	 */
	void preMove(ModelElementContainer newContainer, int newX, int newY);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sourceRequired="true" targetRequired="true" xRequired="true" yRequired="true" deltaXRequired="true" deltaYRequired="true"
	 * @generated
	 */
	void postMove(ModelElementContainer source, ModelElementContainer target, int x, int y, int deltaX, int deltaY);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model newWidthRequired="true" newHeightRequired="true" newXRequired="true" newYRequired="true" directionRequired="true"
	 * @generated
	 */
	void preResize(int newWidth, int newHeight, int newX, int newY, Direction direction);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model oldWidthRequired="true" oldHeightRequired="true" oldXRequired="true" oldYRequired="true" directionRequired="true"
	 * @generated
	 */
	void postResize(int oldWidth, int oldHeight, int oldX, int oldY, Direction direction);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" userSequenceGraphModelRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	boolean canMoveTo(UserSequenceGraphModel userSequenceGraphModel, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model userSequenceGraphModelRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void moveTo(UserSequenceGraphModel userSequenceGraphModel, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model userSequenceGraphModelRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void s_moveTo(UserSequenceGraphModel userSequenceGraphModel, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	UserSequenceGraphModel getContainer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	BaseURLView getBaseURLView();

} // BaseURL
