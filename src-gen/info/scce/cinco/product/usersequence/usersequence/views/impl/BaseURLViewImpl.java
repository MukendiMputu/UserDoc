/**
 */
package info.scce.cinco.product.usersequence.usersequence.views.impl;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalBaseURL;

import info.scce.cinco.product.usersequence.usersequence.views.BaseURLView;
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
 * An implementation of the model object '<em><b>Base URL View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.impl.BaseURLViewImpl#getInternalBaseURL <em>Internal Base URL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BaseURLViewImpl extends EObjectImpl implements BaseURLView {
	/**
	 * The cached value of the '{@link #getInternalBaseURL() <em>Internal Base URL</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalBaseURL()
	 * @generated
	 * @ordered
	 */
	protected InternalBaseURL internalBaseURL;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseURLViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.BASE_URL_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalBaseURL getInternalBaseURL() {
		if (internalBaseURL != null && internalBaseURL.eIsProxy()) {
			InternalEObject oldInternalBaseURL = (InternalEObject)internalBaseURL;
			internalBaseURL = (InternalBaseURL)eResolveProxy(oldInternalBaseURL);
			if (internalBaseURL != oldInternalBaseURL) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.BASE_URL_VIEW__INTERNAL_BASE_URL, oldInternalBaseURL, internalBaseURL));
			}
		}
		return internalBaseURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalBaseURL basicGetInternalBaseURL() {
		return internalBaseURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalBaseURL(InternalBaseURL newInternalBaseURL) {
		InternalBaseURL oldInternalBaseURL = internalBaseURL;
		internalBaseURL = newInternalBaseURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.BASE_URL_VIEW__INTERNAL_BASE_URL, oldInternalBaseURL, internalBaseURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContent() {
		return getInternalBaseURL().getContent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(final String _arg) {
		getInternalBaseURL().getElement().transact("Set Content", () -> {
			getInternalBaseURL().setContent(_arg);
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
			case ViewsPackage.BASE_URL_VIEW__INTERNAL_BASE_URL:
				if (resolve) return getInternalBaseURL();
				return basicGetInternalBaseURL();
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
			case ViewsPackage.BASE_URL_VIEW__INTERNAL_BASE_URL:
				setInternalBaseURL((InternalBaseURL)newValue);
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
			case ViewsPackage.BASE_URL_VIEW__INTERNAL_BASE_URL:
				setInternalBaseURL((InternalBaseURL)null);
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
			case ViewsPackage.BASE_URL_VIEW__INTERNAL_BASE_URL:
				return internalBaseURL != null;
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
			case ViewsPackage.BASE_URL_VIEW___GET_CONTENT:
				return getContent();
			case ViewsPackage.BASE_URL_VIEW___SET_CONTENT__STRING:
				setContent((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BaseURLViewImpl
