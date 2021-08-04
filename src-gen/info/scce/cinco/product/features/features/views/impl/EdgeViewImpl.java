/**
 */
package info.scce.cinco.product.features.features.views.impl;

import info.scce.cinco.product.features.features.internal.InternalEdge;

import info.scce.cinco.product.features.features.views.EdgeView;
import info.scce.cinco.product.features.features.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.features.features.views.impl.EdgeViewImpl#getInternalEdge <em>Internal Edge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeViewImpl extends EObjectImpl implements EdgeView {
	/**
	 * The cached value of the '{@link #getInternalEdge() <em>Internal Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalEdge()
	 * @generated
	 * @ordered
	 */
	protected InternalEdge internalEdge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.EDGE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalEdge getInternalEdge() {
		if (internalEdge != null && internalEdge.eIsProxy()) {
			InternalEObject oldInternalEdge = (InternalEObject)internalEdge;
			internalEdge = (InternalEdge)eResolveProxy(oldInternalEdge);
			if (internalEdge != oldInternalEdge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.EDGE_VIEW__INTERNAL_EDGE, oldInternalEdge, internalEdge));
			}
		}
		return internalEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalEdge basicGetInternalEdge() {
		return internalEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalEdge(InternalEdge newInternalEdge) {
		InternalEdge oldInternalEdge = internalEdge;
		internalEdge = newInternalEdge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.EDGE_VIEW__INTERNAL_EDGE, oldInternalEdge, internalEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.EDGE_VIEW__INTERNAL_EDGE:
				if (resolve) return getInternalEdge();
				return basicGetInternalEdge();
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
			case ViewsPackage.EDGE_VIEW__INTERNAL_EDGE:
				setInternalEdge((InternalEdge)newValue);
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
			case ViewsPackage.EDGE_VIEW__INTERNAL_EDGE:
				setInternalEdge((InternalEdge)null);
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
			case ViewsPackage.EDGE_VIEW__INTERNAL_EDGE:
				return internalEdge != null;
		}
		return super.eIsSet(featureID);
	}

} //EdgeViewImpl
