/**
 */
package info.scce.cinco.product.usersequence.usersequence.views.impl;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalKeyValue;

import info.scce.cinco.product.usersequence.usersequence.views.KeyValueView;
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
 * An implementation of the model object '<em><b>Key Value View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.impl.KeyValueViewImpl#getInternalKeyValue <em>Internal Key Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KeyValueViewImpl extends EObjectImpl implements KeyValueView {
	/**
	 * The cached value of the '{@link #getInternalKeyValue() <em>Internal Key Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalKeyValue()
	 * @generated
	 * @ordered
	 */
	protected InternalKeyValue internalKeyValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyValueViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.KEY_VALUE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalKeyValue getInternalKeyValue() {
		if (internalKeyValue != null && internalKeyValue.eIsProxy()) {
			InternalEObject oldInternalKeyValue = (InternalEObject)internalKeyValue;
			internalKeyValue = (InternalKeyValue)eResolveProxy(oldInternalKeyValue);
			if (internalKeyValue != oldInternalKeyValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.KEY_VALUE_VIEW__INTERNAL_KEY_VALUE, oldInternalKeyValue, internalKeyValue));
			}
		}
		return internalKeyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalKeyValue basicGetInternalKeyValue() {
		return internalKeyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalKeyValue(InternalKeyValue newInternalKeyValue) {
		InternalKeyValue oldInternalKeyValue = internalKeyValue;
		internalKeyValue = newInternalKeyValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.KEY_VALUE_VIEW__INTERNAL_KEY_VALUE, oldInternalKeyValue, internalKeyValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return getInternalKeyValue().getValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(final String _arg) {
		getInternalKeyValue().getElement().transact("Set Value", () -> {
			getInternalKeyValue().setValue(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKey() {
		return getInternalKeyValue().getKey();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKey(final String _arg) {
		getInternalKeyValue().getElement().transact("Set Key", () -> {
			getInternalKeyValue().setKey(_arg);
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
			case ViewsPackage.KEY_VALUE_VIEW__INTERNAL_KEY_VALUE:
				if (resolve) return getInternalKeyValue();
				return basicGetInternalKeyValue();
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
			case ViewsPackage.KEY_VALUE_VIEW__INTERNAL_KEY_VALUE:
				setInternalKeyValue((InternalKeyValue)newValue);
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
			case ViewsPackage.KEY_VALUE_VIEW__INTERNAL_KEY_VALUE:
				setInternalKeyValue((InternalKeyValue)null);
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
			case ViewsPackage.KEY_VALUE_VIEW__INTERNAL_KEY_VALUE:
				return internalKeyValue != null;
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
			case ViewsPackage.KEY_VALUE_VIEW___GET_VALUE:
				return getValue();
			case ViewsPackage.KEY_VALUE_VIEW___SET_VALUE__STRING:
				setValue((String)arguments.get(0));
				return null;
			case ViewsPackage.KEY_VALUE_VIEW___GET_KEY:
				return getKey();
			case ViewsPackage.KEY_VALUE_VIEW___SET_KEY__STRING:
				setKey((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //KeyValueViewImpl
