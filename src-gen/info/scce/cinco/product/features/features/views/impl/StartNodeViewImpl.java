/**
 */
package info.scce.cinco.product.features.features.views.impl;

import info.scce.cinco.product.features.features.internal.InternalStartNode;

import info.scce.cinco.product.features.features.views.StartNodeView;
import info.scce.cinco.product.features.features.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Node View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.features.features.views.impl.StartNodeViewImpl#getInternalStartNode <em>Internal Start Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StartNodeViewImpl extends EObjectImpl implements StartNodeView {
	/**
	 * The cached value of the '{@link #getInternalStartNode() <em>Internal Start Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalStartNode()
	 * @generated
	 * @ordered
	 */
	protected InternalStartNode internalStartNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartNodeViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.START_NODE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalStartNode getInternalStartNode() {
		if (internalStartNode != null && internalStartNode.eIsProxy()) {
			InternalEObject oldInternalStartNode = (InternalEObject)internalStartNode;
			internalStartNode = (InternalStartNode)eResolveProxy(oldInternalStartNode);
			if (internalStartNode != oldInternalStartNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.START_NODE_VIEW__INTERNAL_START_NODE, oldInternalStartNode, internalStartNode));
			}
		}
		return internalStartNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalStartNode basicGetInternalStartNode() {
		return internalStartNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalStartNode(InternalStartNode newInternalStartNode) {
		InternalStartNode oldInternalStartNode = internalStartNode;
		internalStartNode = newInternalStartNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.START_NODE_VIEW__INTERNAL_START_NODE, oldInternalStartNode, internalStartNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.START_NODE_VIEW__INTERNAL_START_NODE:
				if (resolve) return getInternalStartNode();
				return basicGetInternalStartNode();
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
			case ViewsPackage.START_NODE_VIEW__INTERNAL_START_NODE:
				setInternalStartNode((InternalStartNode)newValue);
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
			case ViewsPackage.START_NODE_VIEW__INTERNAL_START_NODE:
				setInternalStartNode((InternalStartNode)null);
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
			case ViewsPackage.START_NODE_VIEW__INTERNAL_START_NODE:
				return internalStartNode != null;
		}
		return super.eIsSet(featureID);
	}

} //StartNodeViewImpl
