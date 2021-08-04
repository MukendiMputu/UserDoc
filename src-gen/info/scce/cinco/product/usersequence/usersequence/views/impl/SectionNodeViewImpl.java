/**
 */
package info.scce.cinco.product.usersequence.usersequence.views.impl;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalSectionNode;

import info.scce.cinco.product.usersequence.usersequence.views.SectionNodeView;
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
 * An implementation of the model object '<em><b>Section Node View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.impl.SectionNodeViewImpl#getInternalSectionNode <em>Internal Section Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionNodeViewImpl extends EObjectImpl implements SectionNodeView {
	/**
	 * The cached value of the '{@link #getInternalSectionNode() <em>Internal Section Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalSectionNode()
	 * @generated
	 * @ordered
	 */
	protected InternalSectionNode internalSectionNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionNodeViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.SECTION_NODE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSectionNode getInternalSectionNode() {
		if (internalSectionNode != null && internalSectionNode.eIsProxy()) {
			InternalEObject oldInternalSectionNode = (InternalEObject)internalSectionNode;
			internalSectionNode = (InternalSectionNode)eResolveProxy(oldInternalSectionNode);
			if (internalSectionNode != oldInternalSectionNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.SECTION_NODE_VIEW__INTERNAL_SECTION_NODE, oldInternalSectionNode, internalSectionNode));
			}
		}
		return internalSectionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalSectionNode basicGetInternalSectionNode() {
		return internalSectionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalSectionNode(InternalSectionNode newInternalSectionNode) {
		InternalSectionNode oldInternalSectionNode = internalSectionNode;
		internalSectionNode = newInternalSectionNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.SECTION_NODE_VIEW__INTERNAL_SECTION_NODE, oldInternalSectionNode, internalSectionNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return getInternalSectionNode().getTitle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(final String _arg) {
		getInternalSectionNode().getElement().transact("Set Title", () -> {
			getInternalSectionNode().setTitle(_arg);
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
			case ViewsPackage.SECTION_NODE_VIEW__INTERNAL_SECTION_NODE:
				if (resolve) return getInternalSectionNode();
				return basicGetInternalSectionNode();
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
			case ViewsPackage.SECTION_NODE_VIEW__INTERNAL_SECTION_NODE:
				setInternalSectionNode((InternalSectionNode)newValue);
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
			case ViewsPackage.SECTION_NODE_VIEW__INTERNAL_SECTION_NODE:
				setInternalSectionNode((InternalSectionNode)null);
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
			case ViewsPackage.SECTION_NODE_VIEW__INTERNAL_SECTION_NODE:
				return internalSectionNode != null;
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
			case ViewsPackage.SECTION_NODE_VIEW___GET_TITLE:
				return getTitle();
			case ViewsPackage.SECTION_NODE_VIEW___SET_TITLE__STRING:
				setTitle((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SectionNodeViewImpl
