/**
 */
package info.scce.cinco.product.usersequence.usersequence.views.impl;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalAnchor;

import info.scce.cinco.product.usersequence.usersequence.views.AnchorView;
import info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anchor View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.impl.AnchorViewImpl#getInternalAnchor <em>Internal Anchor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnchorViewImpl extends EObjectImpl implements AnchorView {
	/**
	 * The cached value of the '{@link #getInternalAnchor() <em>Internal Anchor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalAnchor()
	 * @generated
	 * @ordered
	 */
	protected InternalAnchor internalAnchor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnchorViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.ANCHOR_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalAnchor getInternalAnchor() {
		if (internalAnchor != null && internalAnchor.eIsProxy()) {
			InternalEObject oldInternalAnchor = (InternalEObject)internalAnchor;
			internalAnchor = (InternalAnchor)eResolveProxy(oldInternalAnchor);
			if (internalAnchor != oldInternalAnchor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.ANCHOR_VIEW__INTERNAL_ANCHOR, oldInternalAnchor, internalAnchor));
			}
		}
		return internalAnchor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalAnchor basicGetInternalAnchor() {
		return internalAnchor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalAnchor(InternalAnchor newInternalAnchor) {
		InternalAnchor oldInternalAnchor = internalAnchor;
		internalAnchor = newInternalAnchor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.ANCHOR_VIEW__INTERNAL_ANCHOR, oldInternalAnchor, internalAnchor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.ANCHOR_VIEW__INTERNAL_ANCHOR:
				if (resolve) return getInternalAnchor();
				return basicGetInternalAnchor();
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
			case ViewsPackage.ANCHOR_VIEW__INTERNAL_ANCHOR:
				setInternalAnchor((InternalAnchor)newValue);
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
			case ViewsPackage.ANCHOR_VIEW__INTERNAL_ANCHOR:
				setInternalAnchor((InternalAnchor)null);
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
			case ViewsPackage.ANCHOR_VIEW__INTERNAL_ANCHOR:
				return internalAnchor != null;
		}
		return super.eIsSet(featureID);
	}

} //AnchorViewImpl
