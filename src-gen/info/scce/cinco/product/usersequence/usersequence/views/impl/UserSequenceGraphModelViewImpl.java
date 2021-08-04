/**
 */
package info.scce.cinco.product.usersequence.usersequence.views.impl;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalUserSequenceGraphModel;

import info.scce.cinco.product.usersequence.usersequence.views.UserSequenceGraphModelView;
import info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Sequence Graph Model View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.impl.UserSequenceGraphModelViewImpl#getInternalUserSequenceGraphModel <em>Internal User Sequence Graph Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserSequenceGraphModelViewImpl extends EObjectImpl implements UserSequenceGraphModelView {
	/**
	 * The cached value of the '{@link #getInternalUserSequenceGraphModel() <em>Internal User Sequence Graph Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalUserSequenceGraphModel()
	 * @generated
	 * @ordered
	 */
	protected InternalUserSequenceGraphModel internalUserSequenceGraphModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserSequenceGraphModelViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.USER_SEQUENCE_GRAPH_MODEL_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalUserSequenceGraphModel getInternalUserSequenceGraphModel() {
		if (internalUserSequenceGraphModel != null && internalUserSequenceGraphModel.eIsProxy()) {
			InternalEObject oldInternalUserSequenceGraphModel = (InternalEObject)internalUserSequenceGraphModel;
			internalUserSequenceGraphModel = (InternalUserSequenceGraphModel)eResolveProxy(oldInternalUserSequenceGraphModel);
			if (internalUserSequenceGraphModel != oldInternalUserSequenceGraphModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.USER_SEQUENCE_GRAPH_MODEL_VIEW__INTERNAL_USER_SEQUENCE_GRAPH_MODEL, oldInternalUserSequenceGraphModel, internalUserSequenceGraphModel));
			}
		}
		return internalUserSequenceGraphModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalUserSequenceGraphModel basicGetInternalUserSequenceGraphModel() {
		return internalUserSequenceGraphModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalUserSequenceGraphModel(InternalUserSequenceGraphModel newInternalUserSequenceGraphModel) {
		InternalUserSequenceGraphModel oldInternalUserSequenceGraphModel = internalUserSequenceGraphModel;
		internalUserSequenceGraphModel = newInternalUserSequenceGraphModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.USER_SEQUENCE_GRAPH_MODEL_VIEW__INTERNAL_USER_SEQUENCE_GRAPH_MODEL, oldInternalUserSequenceGraphModel, internalUserSequenceGraphModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModelName() {
		return getInternalUserSequenceGraphModel().getModelName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelName(final String _arg) {
		getInternalUserSequenceGraphModel().getElement().transact("Set ModelName", () -> {
			getInternalUserSequenceGraphModel().setModelName(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.USER_SEQUENCE_GRAPH_MODEL_VIEW__INTERNAL_USER_SEQUENCE_GRAPH_MODEL:
				if (resolve) return getInternalUserSequenceGraphModel();
				return basicGetInternalUserSequenceGraphModel();
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
			case ViewsPackage.USER_SEQUENCE_GRAPH_MODEL_VIEW__INTERNAL_USER_SEQUENCE_GRAPH_MODEL:
				setInternalUserSequenceGraphModel((InternalUserSequenceGraphModel)newValue);
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
			case ViewsPackage.USER_SEQUENCE_GRAPH_MODEL_VIEW__INTERNAL_USER_SEQUENCE_GRAPH_MODEL:
				setInternalUserSequenceGraphModel((InternalUserSequenceGraphModel)null);
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
			case ViewsPackage.USER_SEQUENCE_GRAPH_MODEL_VIEW__INTERNAL_USER_SEQUENCE_GRAPH_MODEL:
				return internalUserSequenceGraphModel != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ViewsPackage.USER_SEQUENCE_GRAPH_MODEL_VIEW___GET_MODEL_NAME:
				return getModelName();
			case ViewsPackage.USER_SEQUENCE_GRAPH_MODEL_VIEW___SET_MODEL_NAME__STRING:
				setModelName((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //UserSequenceGraphModelViewImpl
