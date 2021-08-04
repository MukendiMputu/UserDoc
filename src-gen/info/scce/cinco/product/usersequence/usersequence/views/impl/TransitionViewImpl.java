/**
 */
package info.scce.cinco.product.usersequence.usersequence.views.impl;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalTransition;

import info.scce.cinco.product.usersequence.usersequence.views.TransitionView;
import info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.impl.TransitionViewImpl#getInternalTransition <em>Internal Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionViewImpl extends EObjectImpl implements TransitionView {
	/**
	 * The cached value of the '{@link #getInternalTransition() <em>Internal Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalTransition()
	 * @generated
	 * @ordered
	 */
	protected InternalTransition internalTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.TRANSITION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalTransition getInternalTransition() {
		if (internalTransition != null && internalTransition.eIsProxy()) {
			InternalEObject oldInternalTransition = (InternalEObject)internalTransition;
			internalTransition = (InternalTransition)eResolveProxy(oldInternalTransition);
			if (internalTransition != oldInternalTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.TRANSITION_VIEW__INTERNAL_TRANSITION, oldInternalTransition, internalTransition));
			}
		}
		return internalTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalTransition basicGetInternalTransition() {
		return internalTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalTransition(InternalTransition newInternalTransition) {
		InternalTransition oldInternalTransition = internalTransition;
		internalTransition = newInternalTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.TRANSITION_VIEW__INTERNAL_TRANSITION, oldInternalTransition, internalTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.TRANSITION_VIEW__INTERNAL_TRANSITION:
				if (resolve) return getInternalTransition();
				return basicGetInternalTransition();
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
			case ViewsPackage.TRANSITION_VIEW__INTERNAL_TRANSITION:
				setInternalTransition((InternalTransition)newValue);
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
			case ViewsPackage.TRANSITION_VIEW__INTERNAL_TRANSITION:
				setInternalTransition((InternalTransition)null);
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
			case ViewsPackage.TRANSITION_VIEW__INTERNAL_TRANSITION:
				return internalTransition != null;
		}
		return super.eIsSet(featureID);
	}

} //TransitionViewImpl
