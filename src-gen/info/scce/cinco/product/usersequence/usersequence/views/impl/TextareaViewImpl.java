/**
 */
package info.scce.cinco.product.usersequence.usersequence.views.impl;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalTextarea;

import info.scce.cinco.product.usersequence.usersequence.views.TextareaView;
import info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Textarea View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.impl.TextareaViewImpl#getInternalTextarea <em>Internal Textarea</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextareaViewImpl extends WebElementViewImpl implements TextareaView {
	/**
	 * The cached value of the '{@link #getInternalTextarea() <em>Internal Textarea</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalTextarea()
	 * @generated
	 * @ordered
	 */
	protected InternalTextarea internalTextarea;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextareaViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.TEXTAREA_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalTextarea getInternalTextarea() {
		if (internalTextarea != null && internalTextarea.eIsProxy()) {
			InternalEObject oldInternalTextarea = (InternalEObject)internalTextarea;
			internalTextarea = (InternalTextarea)eResolveProxy(oldInternalTextarea);
			if (internalTextarea != oldInternalTextarea) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.TEXTAREA_VIEW__INTERNAL_TEXTAREA, oldInternalTextarea, internalTextarea));
			}
		}
		return internalTextarea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalTextarea basicGetInternalTextarea() {
		return internalTextarea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalTextarea(InternalTextarea newInternalTextarea) {
		InternalTextarea oldInternalTextarea = internalTextarea;
		internalTextarea = newInternalTextarea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.TEXTAREA_VIEW__INTERNAL_TEXTAREA, oldInternalTextarea, internalTextarea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.TEXTAREA_VIEW__INTERNAL_TEXTAREA:
				if (resolve) return getInternalTextarea();
				return basicGetInternalTextarea();
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
			case ViewsPackage.TEXTAREA_VIEW__INTERNAL_TEXTAREA:
				setInternalTextarea((InternalTextarea)newValue);
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
			case ViewsPackage.TEXTAREA_VIEW__INTERNAL_TEXTAREA:
				setInternalTextarea((InternalTextarea)null);
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
			case ViewsPackage.TEXTAREA_VIEW__INTERNAL_TEXTAREA:
				return internalTextarea != null;
		}
		return super.eIsSet(featureID);
	}

} //TextareaViewImpl
