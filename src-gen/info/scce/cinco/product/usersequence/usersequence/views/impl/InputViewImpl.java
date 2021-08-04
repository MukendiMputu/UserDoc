/**
 */
package info.scce.cinco.product.usersequence.usersequence.views.impl;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalInput;

import info.scce.cinco.product.usersequence.usersequence.views.InputView;
import info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.impl.InputViewImpl#getInternalInput <em>Internal Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputViewImpl extends WebElementViewImpl implements InputView {
	/**
	 * The cached value of the '{@link #getInternalInput() <em>Internal Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalInput()
	 * @generated
	 * @ordered
	 */
	protected InternalInput internalInput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.INPUT_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalInput getInternalInput() {
		if (internalInput != null && internalInput.eIsProxy()) {
			InternalEObject oldInternalInput = (InternalEObject)internalInput;
			internalInput = (InternalInput)eResolveProxy(oldInternalInput);
			if (internalInput != oldInternalInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.INPUT_VIEW__INTERNAL_INPUT, oldInternalInput, internalInput));
			}
		}
		return internalInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalInput basicGetInternalInput() {
		return internalInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalInput(InternalInput newInternalInput) {
		InternalInput oldInternalInput = internalInput;
		internalInput = newInternalInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.INPUT_VIEW__INTERNAL_INPUT, oldInternalInput, internalInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHighlighted() {
		return getInternalInput().isHighlighted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHighlighted(final boolean _arg) {
		getInternalInput().getElement().transact("Set Highlighted", () -> {
			getInternalInput().setHighlighted(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSelector() {
		return getInternalInput().getSelector();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelector(final String _arg) {
		getInternalInput().getElement().transact("Set Selector", () -> {
			getInternalInput().setSelector(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return getInternalInput().getValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(final String _arg) {
		getInternalInput().getElement().transact("Set Value", () -> {
			getInternalInput().setValue(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContent() {
		return getInternalInput().getContent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(final String _arg) {
		getInternalInput().getElement().transact("Set Content", () -> {
			getInternalInput().setContent(_arg);
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
			case ViewsPackage.INPUT_VIEW__INTERNAL_INPUT:
				if (resolve) return getInternalInput();
				return basicGetInternalInput();
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
			case ViewsPackage.INPUT_VIEW__INTERNAL_INPUT:
				setInternalInput((InternalInput)newValue);
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
			case ViewsPackage.INPUT_VIEW__INTERNAL_INPUT:
				setInternalInput((InternalInput)null);
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
			case ViewsPackage.INPUT_VIEW__INTERNAL_INPUT:
				return internalInput != null;
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
			case ViewsPackage.INPUT_VIEW___IS_HIGHLIGHTED:
				return isHighlighted();
			case ViewsPackage.INPUT_VIEW___SET_HIGHLIGHTED__BOOLEAN:
				setHighlighted((Boolean)arguments.get(0));
				return null;
			case ViewsPackage.INPUT_VIEW___GET_SELECTOR:
				return getSelector();
			case ViewsPackage.INPUT_VIEW___SET_SELECTOR__STRING:
				setSelector((String)arguments.get(0));
				return null;
			case ViewsPackage.INPUT_VIEW___GET_VALUE:
				return getValue();
			case ViewsPackage.INPUT_VIEW___SET_VALUE__STRING:
				setValue((String)arguments.get(0));
				return null;
			case ViewsPackage.INPUT_VIEW___GET_CONTENT:
				return getContent();
			case ViewsPackage.INPUT_VIEW___SET_CONTENT__STRING:
				setContent((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //InputViewImpl
