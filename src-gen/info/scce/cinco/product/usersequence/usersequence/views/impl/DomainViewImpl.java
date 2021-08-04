/**
 */
package info.scce.cinco.product.usersequence.usersequence.views.impl;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalDomain;

import info.scce.cinco.product.usersequence.usersequence.views.DomainView;
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
 * An implementation of the model object '<em><b>Domain View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.impl.DomainViewImpl#getInternalDomain <em>Internal Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainViewImpl extends EObjectImpl implements DomainView {
	/**
	 * The cached value of the '{@link #getInternalDomain() <em>Internal Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalDomain()
	 * @generated
	 * @ordered
	 */
	protected InternalDomain internalDomain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.DOMAIN_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalDomain getInternalDomain() {
		if (internalDomain != null && internalDomain.eIsProxy()) {
			InternalEObject oldInternalDomain = (InternalEObject)internalDomain;
			internalDomain = (InternalDomain)eResolveProxy(oldInternalDomain);
			if (internalDomain != oldInternalDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.DOMAIN_VIEW__INTERNAL_DOMAIN, oldInternalDomain, internalDomain));
			}
		}
		return internalDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalDomain basicGetInternalDomain() {
		return internalDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalDomain(InternalDomain newInternalDomain) {
		InternalDomain oldInternalDomain = internalDomain;
		internalDomain = newInternalDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.DOMAIN_VIEW__INTERNAL_DOMAIN, oldInternalDomain, internalDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContent() {
		return getInternalDomain().getContent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(final String _arg) {
		getInternalDomain().getElement().transact("Set Content", () -> {
			getInternalDomain().setContent(_arg);
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
			case ViewsPackage.DOMAIN_VIEW__INTERNAL_DOMAIN:
				if (resolve) return getInternalDomain();
				return basicGetInternalDomain();
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
			case ViewsPackage.DOMAIN_VIEW__INTERNAL_DOMAIN:
				setInternalDomain((InternalDomain)newValue);
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
			case ViewsPackage.DOMAIN_VIEW__INTERNAL_DOMAIN:
				setInternalDomain((InternalDomain)null);
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
			case ViewsPackage.DOMAIN_VIEW__INTERNAL_DOMAIN:
				return internalDomain != null;
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
			case ViewsPackage.DOMAIN_VIEW___GET_CONTENT:
				return getContent();
			case ViewsPackage.DOMAIN_VIEW___SET_CONTENT__STRING:
				setContent((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DomainViewImpl
