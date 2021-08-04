/**
 */
package info.scce.cinco.product.usersequence.usersequence;

import graphmodel.GraphModel;
import graphmodel.Node;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalUserSequenceGraphModel;

import info.scce.cinco.product.usersequence.usersequence.views.UserSequenceGraphModelView;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Sequence Graph Model</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see info.scce.cinco.product.usersequence.usersequence.UsersequencePackage#getUserSequenceGraphModel()
 * @model
 * @generated
 */
public interface UserSequenceGraphModel extends GraphModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getModelName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setModelName(String _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	InternalUserSequenceGraphModel getInternalUserSequenceGraphModel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isExactlyUserSequenceGraphModel();

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
	UserSequenceGraphModel getRootElement();

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
	EList<P> getPs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewP();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	P newP(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	P newP(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	P newP(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	P newP(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Textarea> getTextareas();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewTextarea();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Textarea newTextarea(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Textarea newTextarea(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Textarea newTextarea(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Textarea newTextarea(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<TableBody> getTableBodys();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewTableBody();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	TableBody newTableBody(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	TableBody newTableBody(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	TableBody newTableBody(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	TableBody newTableBody(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Screenshot> getScreenshots();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewScreenshot();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Screenshot newScreenshot(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Screenshot newScreenshot(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Screenshot newScreenshot(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Screenshot newScreenshot(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Comment> getComments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewComment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Comment newComment(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Comment newComment(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Comment newComment(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Comment newComment(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Navigation> getNavigations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewNavigation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Navigation newNavigation(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Navigation newNavigation(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Navigation newNavigation(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Navigation newNavigation(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<SubSequence> getSubSequences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewSubSequence();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" subSequenceRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	SubSequence newSubSequence(EObject subSequence, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" subSequenceRequired="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	SubSequence newSubSequence(EObject subSequence, String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" subSequenceRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	SubSequence newSubSequence(EObject subSequence, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" subSequenceRequired="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	SubSequence newSubSequence(EObject subSequence, String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Stop> getStops();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewStop();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Stop newStop(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Stop newStop(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Stop newStop(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Stop newStop(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<SelectBox> getSelectBoxs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewSelectBox();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	SelectBox newSelectBox(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	SelectBox newSelectBox(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	SelectBox newSelectBox(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	SelectBox newSelectBox(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Th> getThs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewTh();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Th newTh(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Th newTh(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Th newTh(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Th newTh(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<BaseURL> getBaseURLs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewBaseURL();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	BaseURL newBaseURL(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	BaseURL newBaseURL(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	BaseURL newBaseURL(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	BaseURL newBaseURL(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Input> getInputs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewInput();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Input newInput(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Input newInput(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Input newInput(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Input newInput(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<TableData> getTableDatas();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewTableData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	TableData newTableData(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	TableData newTableData(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	TableData newTableData(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	TableData newTableData(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Div> getDivs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewDiv();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Div newDiv(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Div newDiv(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Div newDiv(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Div newDiv(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<H> getHs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewH();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	H newH(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	H newH(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	H newH(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	H newH(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<TableHead> getTableHeads();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewTableHead();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	TableHead newTableHead(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	TableHead newTableHead(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	TableHead newTableHead(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	TableHead newTableHead(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Domain> getDomains();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewDomain();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Domain newDomain(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Domain newDomain(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Domain newDomain(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Domain newDomain(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Span> getSpans();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewSpan();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Span newSpan(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Span newSpan(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Span newSpan(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Span newSpan(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Form> getForms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewForm();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Form newForm(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Form newForm(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Form newForm(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Form newForm(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Table> getTables();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewTable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Table newTable(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Table newTable(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Table newTable(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Table newTable(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Label> getLabels();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewLabel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Label newLabel(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Label newLabel(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Label newLabel(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Label newLabel(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<TableRow> getTableRows();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewTableRow();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	TableRow newTableRow(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	TableRow newTableRow(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	TableRow newTableRow(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	TableRow newTableRow(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<KeyValue> getKeyValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewKeyValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	KeyValue newKeyValue(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	KeyValue newKeyValue(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	KeyValue newKeyValue(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	KeyValue newKeyValue(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<SelectBoxOption> getSelectBoxOptions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewSelectBoxOption();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	SelectBoxOption newSelectBoxOption(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	SelectBoxOption newSelectBoxOption(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	SelectBoxOption newSelectBoxOption(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	SelectBoxOption newSelectBoxOption(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Start> getStarts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewStart();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Start newStart(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Start newStart(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Start newStart(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Start newStart(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<WebElement> getWebElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewWebElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	WebElement newWebElement(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	WebElement newWebElement(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	WebElement newWebElement(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	WebElement newWebElement(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Button> getButtons();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewButton();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Button newButton(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Button newButton(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Button newButton(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Button newButton(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<SectionNode> getSectionNodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewSectionNode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	SectionNode newSectionNode(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	SectionNode newSectionNode(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	SectionNode newSectionNode(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	SectionNode newSectionNode(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Section> getSections();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Section newSection(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Section newSection(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Section newSection(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Section newSection(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" pathRequired="true" fileNameRequired="true" postCreateHookRequired="true"
	 * @generated
	 */
	UserSequenceGraphModel newUserSequenceGraphModel(String path, String fileName, boolean postCreateHook);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	UserSequenceGraphModelView getUserSequenceGraphModelView();

} // UserSequenceGraphModel
