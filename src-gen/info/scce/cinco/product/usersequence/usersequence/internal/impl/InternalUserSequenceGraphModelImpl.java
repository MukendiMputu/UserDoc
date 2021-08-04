/**
 */
package info.scce.cinco.product.usersequence.usersequence.internal.impl;

import de.jabc.cinco.meta.core.mgl.model.constraints.ContainmentConstraint;

import graphmodel.internal.InternalGraphModel;
import graphmodel.internal.InternalModelElementContainer;

import graphmodel.internal.impl.InternalGraphModelImpl;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalPackage;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalUserSequenceGraphModel;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Sequence Graph Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.internal.impl.InternalUserSequenceGraphModelImpl#getModelName <em>Model Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalUserSequenceGraphModelImpl extends InternalGraphModelImpl implements InternalUserSequenceGraphModel {
	/**
	 * The default value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected String modelName = MODEL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalUserSequenceGraphModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InternalPackage.eINSTANCE.getInternalUserSequenceGraphModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModelName() {
		return modelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelName(String newModelName) {
		String oldModelName = modelName;
		modelName = newModelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_USER_SEQUENCE_GRAPH_MODEL__MODEL_NAME, oldModelName, modelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContainmentConstraint> getContainmentConstraints() {
		 org.eclipse.emf.common.util.BasicEList<ContainmentConstraint>constraints =
			new org.eclipse.emf.common.util.BasicEList<ContainmentConstraint>();
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.usersequence.usersequence.Start.class,info.scce.cinco.product.usersequence.usersequence.Stop.class,info.scce.cinco.product.usersequence.usersequence.SubSequence.class,info.scce.cinco.product.usersequence.usersequence.BaseURL.class,info.scce.cinco.product.usersequence.usersequence.Domain.class,info.scce.cinco.product.usersequence.usersequence.KeyValue.class,info.scce.cinco.product.usersequence.usersequence.Screenshot.class,info.scce.cinco.product.usersequence.usersequence.SectionNode.class,info.scce.cinco.product.usersequence.usersequence.Navigation.class,info.scce.cinco.product.usersequence.usersequence.WebElement.class,info.scce.cinco.product.usersequence.usersequence.Div.class,info.scce.cinco.product.usersequence.usersequence.H.class,info.scce.cinco.product.usersequence.usersequence.P.class,info.scce.cinco.product.usersequence.usersequence.Span.class,info.scce.cinco.product.usersequence.usersequence.Label.class,info.scce.cinco.product.usersequence.usersequence.Form.class,info.scce.cinco.product.usersequence.usersequence.Input.class,info.scce.cinco.product.usersequence.usersequence.Textarea.class,info.scce.cinco.product.usersequence.usersequence.Button.class,info.scce.cinco.product.usersequence.usersequence.SelectBox.class,info.scce.cinco.product.usersequence.usersequence.SelectBoxOption.class,info.scce.cinco.product.usersequence.usersequence.Table.class,info.scce.cinco.product.usersequence.usersequence.TableHead.class,info.scce.cinco.product.usersequence.usersequence.Th.class,info.scce.cinco.product.usersequence.usersequence.TableRow.class,info.scce.cinco.product.usersequence.usersequence.TableBody.class,info.scce.cinco.product.usersequence.usersequence.TableData.class,info.scce.cinco.product.usersequence.usersequence.Section.class,info.scce.cinco.product.usersequence.usersequence.Comment.class));
		return constraints;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InternalPackage.INTERNAL_USER_SEQUENCE_GRAPH_MODEL__MODEL_NAME:
				return getModelName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InternalPackage.INTERNAL_USER_SEQUENCE_GRAPH_MODEL__MODEL_NAME:
				setModelName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InternalPackage.INTERNAL_USER_SEQUENCE_GRAPH_MODEL__MODEL_NAME:
				setModelName(MODEL_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InternalPackage.INTERNAL_USER_SEQUENCE_GRAPH_MODEL__MODEL_NAME:
				return MODEL_NAME_EDEFAULT == null ? modelName != null : !MODEL_NAME_EDEFAULT.equals(modelName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == InternalModelElementContainer.class) {
			switch (baseOperationID) {
				case graphmodel.internal.InternalPackage.INTERNAL_MODEL_ELEMENT_CONTAINER___GET_CONTAINMENT_CONSTRAINTS: return InternalPackage.INTERNAL_USER_SEQUENCE_GRAPH_MODEL___GET_CONTAINMENT_CONSTRAINTS;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == InternalGraphModel.class) {
			switch (baseOperationID) {
				case graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL___GET_CONTAINMENT_CONSTRAINTS: return InternalPackage.INTERNAL_USER_SEQUENCE_GRAPH_MODEL___GET_CONTAINMENT_CONSTRAINTS;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case InternalPackage.INTERNAL_USER_SEQUENCE_GRAPH_MODEL___GET_CONTAINMENT_CONSTRAINTS:
				return getContainmentConstraints();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (modelName: ");
		result.append(modelName);
		result.append(')');
		return result.toString();
	}

} //InternalUserSequenceGraphModelImpl
