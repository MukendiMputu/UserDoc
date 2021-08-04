/**
 */
package info.scce.cinco.product.usersequence.usersequence.views.impl;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalNavigation;

import info.scce.cinco.product.usersequence.usersequence.views.NavigationView;
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
 * An implementation of the model object '<em><b>Navigation View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.impl.NavigationViewImpl#getInternalNavigation <em>Internal Navigation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NavigationViewImpl extends EObjectImpl implements NavigationView {
	/**
	 * The cached value of the '{@link #getInternalNavigation() <em>Internal Navigation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalNavigation()
	 * @generated
	 * @ordered
	 */
	protected InternalNavigation internalNavigation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigationViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.NAVIGATION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalNavigation getInternalNavigation() {
		if (internalNavigation != null && internalNavigation.eIsProxy()) {
			InternalEObject oldInternalNavigation = (InternalEObject)internalNavigation;
			internalNavigation = (InternalNavigation)eResolveProxy(oldInternalNavigation);
			if (internalNavigation != oldInternalNavigation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.NAVIGATION_VIEW__INTERNAL_NAVIGATION, oldInternalNavigation, internalNavigation));
			}
		}
		return internalNavigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalNavigation basicGetInternalNavigation() {
		return internalNavigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalNavigation(InternalNavigation newInternalNavigation) {
		InternalNavigation oldInternalNavigation = internalNavigation;
		internalNavigation = newInternalNavigation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.NAVIGATION_VIEW__INTERNAL_NAVIGATION, oldInternalNavigation, internalNavigation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLink() {
		return getInternalNavigation().getLink();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLink(final String _arg) {
		getInternalNavigation().getElement().transact("Set Link", () -> {
			getInternalNavigation().setLink(_arg);
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
			case ViewsPackage.NAVIGATION_VIEW__INTERNAL_NAVIGATION:
				if (resolve) return getInternalNavigation();
				return basicGetInternalNavigation();
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
			case ViewsPackage.NAVIGATION_VIEW__INTERNAL_NAVIGATION:
				setInternalNavigation((InternalNavigation)newValue);
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
			case ViewsPackage.NAVIGATION_VIEW__INTERNAL_NAVIGATION:
				setInternalNavigation((InternalNavigation)null);
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
			case ViewsPackage.NAVIGATION_VIEW__INTERNAL_NAVIGATION:
				return internalNavigation != null;
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
			case ViewsPackage.NAVIGATION_VIEW___GET_LINK:
				return getLink();
			case ViewsPackage.NAVIGATION_VIEW___SET_LINK__STRING:
				setLink((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //NavigationViewImpl
