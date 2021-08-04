/**
 */
package info.scce.cinco.product.usersequence.usersequence.views.impl;

import info.scce.cinco.product.usersequence.usersequence.ButtonAction;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalButton;

import info.scce.cinco.product.usersequence.usersequence.views.ButtonView;
import info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.impl.ButtonViewImpl#getInternalButton <em>Internal Button</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ButtonViewImpl extends WebElementViewImpl implements ButtonView {
	/**
	 * The cached value of the '{@link #getInternalButton() <em>Internal Button</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalButton()
	 * @generated
	 * @ordered
	 */
	protected InternalButton internalButton;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.BUTTON_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalButton getInternalButton() {
		if (internalButton != null && internalButton.eIsProxy()) {
			InternalEObject oldInternalButton = (InternalEObject)internalButton;
			internalButton = (InternalButton)eResolveProxy(oldInternalButton);
			if (internalButton != oldInternalButton) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.BUTTON_VIEW__INTERNAL_BUTTON, oldInternalButton, internalButton));
			}
		}
		return internalButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalButton basicGetInternalButton() {
		return internalButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalButton(InternalButton newInternalButton) {
		InternalButton oldInternalButton = internalButton;
		internalButton = newInternalButton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.BUTTON_VIEW__INTERNAL_BUTTON, oldInternalButton, internalButton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHighlighted() {
		return getInternalButton().isHighlighted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHighlighted(final boolean _arg) {
		getInternalButton().getElement().transact("Set Highlighted", () -> {
			getInternalButton().setHighlighted(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ButtonAction getAction() {
		return getInternalButton().getAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAction(final ButtonAction _arg) {
		getInternalButton().getElement().transact("Set Action", () -> {
			getInternalButton().setAction(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSelector() {
		return getInternalButton().getSelector();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelector(final String _arg) {
		getInternalButton().getElement().transact("Set Selector", () -> {
			getInternalButton().setSelector(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return getInternalButton().getValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(final String _arg) {
		getInternalButton().getElement().transact("Set Value", () -> {
			getInternalButton().setValue(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContent() {
		return getInternalButton().getContent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(final String _arg) {
		getInternalButton().getElement().transact("Set Content", () -> {
			getInternalButton().setContent(_arg);
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
			case ViewsPackage.BUTTON_VIEW__INTERNAL_BUTTON:
				if (resolve) return getInternalButton();
				return basicGetInternalButton();
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
			case ViewsPackage.BUTTON_VIEW__INTERNAL_BUTTON:
				setInternalButton((InternalButton)newValue);
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
			case ViewsPackage.BUTTON_VIEW__INTERNAL_BUTTON:
				setInternalButton((InternalButton)null);
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
			case ViewsPackage.BUTTON_VIEW__INTERNAL_BUTTON:
				return internalButton != null;
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
			case ViewsPackage.BUTTON_VIEW___IS_HIGHLIGHTED:
				return isHighlighted();
			case ViewsPackage.BUTTON_VIEW___SET_HIGHLIGHTED__BOOLEAN:
				setHighlighted((Boolean)arguments.get(0));
				return null;
			case ViewsPackage.BUTTON_VIEW___GET_ACTION:
				return getAction();
			case ViewsPackage.BUTTON_VIEW___SET_ACTION__BUTTONACTION:
				setAction((ButtonAction)arguments.get(0));
				return null;
			case ViewsPackage.BUTTON_VIEW___GET_SELECTOR:
				return getSelector();
			case ViewsPackage.BUTTON_VIEW___SET_SELECTOR__STRING:
				setSelector((String)arguments.get(0));
				return null;
			case ViewsPackage.BUTTON_VIEW___GET_VALUE:
				return getValue();
			case ViewsPackage.BUTTON_VIEW___SET_VALUE__STRING:
				setValue((String)arguments.get(0));
				return null;
			case ViewsPackage.BUTTON_VIEW___GET_CONTENT:
				return getContent();
			case ViewsPackage.BUTTON_VIEW___SET_CONTENT__STRING:
				setContent((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ButtonViewImpl
