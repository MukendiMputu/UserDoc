/**
 */
package info.scce.cinco.product.usersequence.usersequence.views.impl;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalDiv;

import info.scce.cinco.product.usersequence.usersequence.views.DivView;
import info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Div View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.impl.DivViewImpl#getInternalDiv <em>Internal Div</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DivViewImpl extends WebElementViewImpl implements DivView {
	/**
	 * The cached value of the '{@link #getInternalDiv() <em>Internal Div</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalDiv()
	 * @generated
	 * @ordered
	 */
	protected InternalDiv internalDiv;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DivViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.DIV_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalDiv getInternalDiv() {
		if (internalDiv != null && internalDiv.eIsProxy()) {
			InternalEObject oldInternalDiv = (InternalEObject)internalDiv;
			internalDiv = (InternalDiv)eResolveProxy(oldInternalDiv);
			if (internalDiv != oldInternalDiv) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.DIV_VIEW__INTERNAL_DIV, oldInternalDiv, internalDiv));
			}
		}
		return internalDiv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalDiv basicGetInternalDiv() {
		return internalDiv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalDiv(InternalDiv newInternalDiv) {
		InternalDiv oldInternalDiv = internalDiv;
		internalDiv = newInternalDiv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.DIV_VIEW__INTERNAL_DIV, oldInternalDiv, internalDiv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.DIV_VIEW__INTERNAL_DIV:
				if (resolve) return getInternalDiv();
				return basicGetInternalDiv();
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
			case ViewsPackage.DIV_VIEW__INTERNAL_DIV:
				setInternalDiv((InternalDiv)newValue);
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
			case ViewsPackage.DIV_VIEW__INTERNAL_DIV:
				setInternalDiv((InternalDiv)null);
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
			case ViewsPackage.DIV_VIEW__INTERNAL_DIV:
				return internalDiv != null;
		}
		return super.eIsSet(featureID);
	}

} //DivViewImpl
