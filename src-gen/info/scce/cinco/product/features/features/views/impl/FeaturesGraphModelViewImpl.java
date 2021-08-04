/**
 */
package info.scce.cinco.product.features.features.views.impl;

import info.scce.cinco.product.features.features.internal.InternalFeaturesGraphModel;

import info.scce.cinco.product.features.features.views.FeaturesGraphModelView;
import info.scce.cinco.product.features.features.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Features Graph Model View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.features.features.views.impl.FeaturesGraphModelViewImpl#getInternalFeaturesGraphModel <em>Internal Features Graph Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeaturesGraphModelViewImpl extends EObjectImpl implements FeaturesGraphModelView {
	/**
	 * The cached value of the '{@link #getInternalFeaturesGraphModel() <em>Internal Features Graph Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalFeaturesGraphModel()
	 * @generated
	 * @ordered
	 */
	protected InternalFeaturesGraphModel internalFeaturesGraphModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeaturesGraphModelViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.FEATURES_GRAPH_MODEL_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalFeaturesGraphModel getInternalFeaturesGraphModel() {
		if (internalFeaturesGraphModel != null && internalFeaturesGraphModel.eIsProxy()) {
			InternalEObject oldInternalFeaturesGraphModel = (InternalEObject)internalFeaturesGraphModel;
			internalFeaturesGraphModel = (InternalFeaturesGraphModel)eResolveProxy(oldInternalFeaturesGraphModel);
			if (internalFeaturesGraphModel != oldInternalFeaturesGraphModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.FEATURES_GRAPH_MODEL_VIEW__INTERNAL_FEATURES_GRAPH_MODEL, oldInternalFeaturesGraphModel, internalFeaturesGraphModel));
			}
		}
		return internalFeaturesGraphModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalFeaturesGraphModel basicGetInternalFeaturesGraphModel() {
		return internalFeaturesGraphModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalFeaturesGraphModel(InternalFeaturesGraphModel newInternalFeaturesGraphModel) {
		InternalFeaturesGraphModel oldInternalFeaturesGraphModel = internalFeaturesGraphModel;
		internalFeaturesGraphModel = newInternalFeaturesGraphModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.FEATURES_GRAPH_MODEL_VIEW__INTERNAL_FEATURES_GRAPH_MODEL, oldInternalFeaturesGraphModel, internalFeaturesGraphModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return getInternalFeaturesGraphModel().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(final String _arg) {
		getInternalFeaturesGraphModel().getElement().transact("Set Name", () -> {
			getInternalFeaturesGraphModel().setName(_arg);
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
			case ViewsPackage.FEATURES_GRAPH_MODEL_VIEW__INTERNAL_FEATURES_GRAPH_MODEL:
				if (resolve) return getInternalFeaturesGraphModel();
				return basicGetInternalFeaturesGraphModel();
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
			case ViewsPackage.FEATURES_GRAPH_MODEL_VIEW__INTERNAL_FEATURES_GRAPH_MODEL:
				setInternalFeaturesGraphModel((InternalFeaturesGraphModel)newValue);
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
			case ViewsPackage.FEATURES_GRAPH_MODEL_VIEW__INTERNAL_FEATURES_GRAPH_MODEL:
				setInternalFeaturesGraphModel((InternalFeaturesGraphModel)null);
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
			case ViewsPackage.FEATURES_GRAPH_MODEL_VIEW__INTERNAL_FEATURES_GRAPH_MODEL:
				return internalFeaturesGraphModel != null;
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
			case ViewsPackage.FEATURES_GRAPH_MODEL_VIEW___GET_NAME:
				return getName();
			case ViewsPackage.FEATURES_GRAPH_MODEL_VIEW___SET_NAME__STRING:
				setName((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //FeaturesGraphModelViewImpl
