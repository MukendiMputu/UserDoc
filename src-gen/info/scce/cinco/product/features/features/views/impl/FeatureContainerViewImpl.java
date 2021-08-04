/**
 */
package info.scce.cinco.product.features.features.views.impl;

import info.scce.cinco.product.features.features.internal.InternalFeatureContainer;

import info.scce.cinco.product.features.features.views.FeatureContainerView;
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
 * An implementation of the model object '<em><b>Feature Container View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.features.features.views.impl.FeatureContainerViewImpl#getInternalFeatureContainer <em>Internal Feature Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureContainerViewImpl extends EObjectImpl implements FeatureContainerView {
	/**
	 * The cached value of the '{@link #getInternalFeatureContainer() <em>Internal Feature Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalFeatureContainer()
	 * @generated
	 * @ordered
	 */
	protected InternalFeatureContainer internalFeatureContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureContainerViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.FEATURE_CONTAINER_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalFeatureContainer getInternalFeatureContainer() {
		if (internalFeatureContainer != null && internalFeatureContainer.eIsProxy()) {
			InternalEObject oldInternalFeatureContainer = (InternalEObject)internalFeatureContainer;
			internalFeatureContainer = (InternalFeatureContainer)eResolveProxy(oldInternalFeatureContainer);
			if (internalFeatureContainer != oldInternalFeatureContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.FEATURE_CONTAINER_VIEW__INTERNAL_FEATURE_CONTAINER, oldInternalFeatureContainer, internalFeatureContainer));
			}
		}
		return internalFeatureContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalFeatureContainer basicGetInternalFeatureContainer() {
		return internalFeatureContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalFeatureContainer(InternalFeatureContainer newInternalFeatureContainer) {
		InternalFeatureContainer oldInternalFeatureContainer = internalFeatureContainer;
		internalFeatureContainer = newInternalFeatureContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.FEATURE_CONTAINER_VIEW__INTERNAL_FEATURE_CONTAINER, oldInternalFeatureContainer, internalFeatureContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return getInternalFeatureContainer().getTitle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(final String _arg) {
		getInternalFeatureContainer().getElement().transact("Set Title", () -> {
			getInternalFeatureContainer().setTitle(_arg);
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
			case ViewsPackage.FEATURE_CONTAINER_VIEW__INTERNAL_FEATURE_CONTAINER:
				if (resolve) return getInternalFeatureContainer();
				return basicGetInternalFeatureContainer();
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
			case ViewsPackage.FEATURE_CONTAINER_VIEW__INTERNAL_FEATURE_CONTAINER:
				setInternalFeatureContainer((InternalFeatureContainer)newValue);
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
			case ViewsPackage.FEATURE_CONTAINER_VIEW__INTERNAL_FEATURE_CONTAINER:
				setInternalFeatureContainer((InternalFeatureContainer)null);
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
			case ViewsPackage.FEATURE_CONTAINER_VIEW__INTERNAL_FEATURE_CONTAINER:
				return internalFeatureContainer != null;
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
			case ViewsPackage.FEATURE_CONTAINER_VIEW___GET_TITLE:
				return getTitle();
			case ViewsPackage.FEATURE_CONTAINER_VIEW___SET_TITLE__STRING:
				setTitle((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //FeatureContainerViewImpl
