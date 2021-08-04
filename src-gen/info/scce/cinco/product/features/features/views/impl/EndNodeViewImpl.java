/**
 */
package info.scce.cinco.product.features.features.views.impl;

import info.scce.cinco.product.features.features.internal.InternalEndNode;

import info.scce.cinco.product.features.features.views.EndNodeView;
import info.scce.cinco.product.features.features.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Node View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.features.features.views.impl.EndNodeViewImpl#getInternalEndNode <em>Internal End Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndNodeViewImpl extends EObjectImpl implements EndNodeView {
	/**
	 * The cached value of the '{@link #getInternalEndNode() <em>Internal End Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalEndNode()
	 * @generated
	 * @ordered
	 */
	protected InternalEndNode internalEndNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndNodeViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.END_NODE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalEndNode getInternalEndNode() {
		if (internalEndNode != null && internalEndNode.eIsProxy()) {
			InternalEObject oldInternalEndNode = (InternalEObject)internalEndNode;
			internalEndNode = (InternalEndNode)eResolveProxy(oldInternalEndNode);
			if (internalEndNode != oldInternalEndNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.END_NODE_VIEW__INTERNAL_END_NODE, oldInternalEndNode, internalEndNode));
			}
		}
		return internalEndNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalEndNode basicGetInternalEndNode() {
		return internalEndNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalEndNode(InternalEndNode newInternalEndNode) {
		InternalEndNode oldInternalEndNode = internalEndNode;
		internalEndNode = newInternalEndNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.END_NODE_VIEW__INTERNAL_END_NODE, oldInternalEndNode, internalEndNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.END_NODE_VIEW__INTERNAL_END_NODE:
				if (resolve) return getInternalEndNode();
				return basicGetInternalEndNode();
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
			case ViewsPackage.END_NODE_VIEW__INTERNAL_END_NODE:
				setInternalEndNode((InternalEndNode)newValue);
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
			case ViewsPackage.END_NODE_VIEW__INTERNAL_END_NODE:
				setInternalEndNode((InternalEndNode)null);
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
			case ViewsPackage.END_NODE_VIEW__INTERNAL_END_NODE:
				return internalEndNode != null;
		}
		return super.eIsSet(featureID);
	}

} //EndNodeViewImpl
