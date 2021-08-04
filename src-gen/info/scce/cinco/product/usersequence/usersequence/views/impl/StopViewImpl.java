/**
 */
package info.scce.cinco.product.usersequence.usersequence.views.impl;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalStop;

import info.scce.cinco.product.usersequence.usersequence.views.StopView;
import info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stop View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.impl.StopViewImpl#getInternalStop <em>Internal Stop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StopViewImpl extends EObjectImpl implements StopView {
	/**
	 * The cached value of the '{@link #getInternalStop() <em>Internal Stop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalStop()
	 * @generated
	 * @ordered
	 */
	protected InternalStop internalStop;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StopViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.STOP_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalStop getInternalStop() {
		if (internalStop != null && internalStop.eIsProxy()) {
			InternalEObject oldInternalStop = (InternalEObject)internalStop;
			internalStop = (InternalStop)eResolveProxy(oldInternalStop);
			if (internalStop != oldInternalStop) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.STOP_VIEW__INTERNAL_STOP, oldInternalStop, internalStop));
			}
		}
		return internalStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalStop basicGetInternalStop() {
		return internalStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalStop(InternalStop newInternalStop) {
		InternalStop oldInternalStop = internalStop;
		internalStop = newInternalStop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.STOP_VIEW__INTERNAL_STOP, oldInternalStop, internalStop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.STOP_VIEW__INTERNAL_STOP:
				if (resolve) return getInternalStop();
				return basicGetInternalStop();
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
			case ViewsPackage.STOP_VIEW__INTERNAL_STOP:
				setInternalStop((InternalStop)newValue);
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
			case ViewsPackage.STOP_VIEW__INTERNAL_STOP:
				setInternalStop((InternalStop)null);
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
			case ViewsPackage.STOP_VIEW__INTERNAL_STOP:
				return internalStop != null;
		}
		return super.eIsSet(featureID);
	}

} //StopViewImpl
