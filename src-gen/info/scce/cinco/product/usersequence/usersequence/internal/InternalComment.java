/**
 */
package info.scce.cinco.product.usersequence.usersequence.internal;

import de.jabc.cinco.meta.core.mgl.model.constraints.ConnectionConstraint;

import graphmodel.internal.InternalNode;

import info.scce.cinco.product.usersequence.usersequence.Button;
import info.scce.cinco.product.usersequence.usersequence.Div;
import info.scce.cinco.product.usersequence.usersequence.Form;
import info.scce.cinco.product.usersequence.usersequence.H;
import info.scce.cinco.product.usersequence.usersequence.Input;
import info.scce.cinco.product.usersequence.usersequence.Label;
import info.scce.cinco.product.usersequence.usersequence.Navigation;
import info.scce.cinco.product.usersequence.usersequence.P;
import info.scce.cinco.product.usersequence.usersequence.Screenshot;
import info.scce.cinco.product.usersequence.usersequence.Section;
import info.scce.cinco.product.usersequence.usersequence.SectionNode;
import info.scce.cinco.product.usersequence.usersequence.SelectBox;
import info.scce.cinco.product.usersequence.usersequence.SelectBoxOption;
import info.scce.cinco.product.usersequence.usersequence.Span;
import info.scce.cinco.product.usersequence.usersequence.SubSequence;
import info.scce.cinco.product.usersequence.usersequence.Table;
import info.scce.cinco.product.usersequence.usersequence.TableBody;
import info.scce.cinco.product.usersequence.usersequence.TableData;
import info.scce.cinco.product.usersequence.usersequence.TableHead;
import info.scce.cinco.product.usersequence.usersequence.TableRow;
import info.scce.cinco.product.usersequence.usersequence.Textarea;
import info.scce.cinco.product.usersequence.usersequence.Th;
import info.scce.cinco.product.usersequence.usersequence.WebElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalComment#getContent <em>Content</em>}</li>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalComment#getReferenceTo <em>Reference To</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalPackage#getInternalComment()
 * @model
 * @generated
 */
public interface InternalComment extends InternalNode {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalPackage#getInternalComment_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalComment#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Reference To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference To</em>' reference.
	 * @see #setReferenceTo(Screenshot)
	 * @see info.scce.cinco.product.usersequence.usersequence.internal.InternalPackage#getInternalComment_ReferenceTo()
	 * @model
	 * @generated
	 */
	Screenshot getReferenceTo();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.usersequence.usersequence.internal.InternalComment#getReferenceTo <em>Reference To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference To</em>' reference.
	 * @see #getReferenceTo()
	 * @generated
	 */
	void setReferenceTo(Screenshot value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="graphmodel.ConnectionConstraint"
	 * @generated
	 */
	EList<ConnectionConstraint> getOutgoingConstraints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<SubSequence> getSubSequenceSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Screenshot> getScreenshotSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<SectionNode> getSectionNodeSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Navigation> getNavigationSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<WebElement> getWebElementSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Div> getDivSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<H> getHSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<P> getPSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Span> getSpanSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Label> getLabelSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Form> getFormSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Input> getInputSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Textarea> getTextareaSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Button> getButtonSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<SelectBox> getSelectBoxSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<SelectBoxOption> getSelectBoxOptionSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Table> getTableSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<TableHead> getTableHeadSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Th> getThSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<TableRow> getTableRowSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<TableBody> getTableBodySuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<TableData> getTableDataSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Section> getSectionSuccessors();

} // InternalComment
