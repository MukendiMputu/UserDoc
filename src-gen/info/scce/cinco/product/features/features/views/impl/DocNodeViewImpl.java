/**
 */
package info.scce.cinco.product.features.features.views.impl;

import info.scce.cinco.product.features.features.internal.InternalDocNode;

import info.scce.cinco.product.features.features.views.DocNodeView;
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
 * An implementation of the model object '<em><b>Doc Node View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.features.features.views.impl.DocNodeViewImpl#getInternalDocNode <em>Internal Doc Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocNodeViewImpl extends EObjectImpl implements DocNodeView {
	/**
	 * The cached value of the '{@link #getInternalDocNode() <em>Internal Doc Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalDocNode()
	 * @generated
	 * @ordered
	 */
	protected InternalDocNode internalDocNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocNodeViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.DOC_NODE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalDocNode getInternalDocNode() {
		if (internalDocNode != null && internalDocNode.eIsProxy()) {
			InternalEObject oldInternalDocNode = (InternalEObject)internalDocNode;
			internalDocNode = (InternalDocNode)eResolveProxy(oldInternalDocNode);
			if (internalDocNode != oldInternalDocNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.DOC_NODE_VIEW__INTERNAL_DOC_NODE, oldInternalDocNode, internalDocNode));
			}
		}
		return internalDocNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalDocNode basicGetInternalDocNode() {
		return internalDocNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalDocNode(InternalDocNode newInternalDocNode) {
		InternalDocNode oldInternalDocNode = internalDocNode;
		internalDocNode = newInternalDocNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.DOC_NODE_VIEW__INTERNAL_DOC_NODE, oldInternalDocNode, internalDocNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCreateScreenshots() {
		return getInternalDocNode().isCreateScreenshots();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreateScreenshots(final boolean _arg) {
		getInternalDocNode().getElement().transact("Set CreateScreenshots", () -> {
			getInternalDocNode().setCreateScreenshots(_arg);
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
			case ViewsPackage.DOC_NODE_VIEW__INTERNAL_DOC_NODE:
				if (resolve) return getInternalDocNode();
				return basicGetInternalDocNode();
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
			case ViewsPackage.DOC_NODE_VIEW__INTERNAL_DOC_NODE:
				setInternalDocNode((InternalDocNode)newValue);
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
			case ViewsPackage.DOC_NODE_VIEW__INTERNAL_DOC_NODE:
				setInternalDocNode((InternalDocNode)null);
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
			case ViewsPackage.DOC_NODE_VIEW__INTERNAL_DOC_NODE:
				return internalDocNode != null;
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
			case ViewsPackage.DOC_NODE_VIEW___IS_CREATE_SCREENSHOTS:
				return isCreateScreenshots();
			case ViewsPackage.DOC_NODE_VIEW___SET_CREATE_SCREENSHOTS__BOOLEAN:
				setCreateScreenshots((Boolean)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DocNodeViewImpl
