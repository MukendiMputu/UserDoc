/**
 */
package info.scce.cinco.product.usersequence.usersequence.views.impl;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalSelectBoxOption;

import info.scce.cinco.product.usersequence.usersequence.views.SelectBoxOptionView;
import info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Box Option View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.impl.SelectBoxOptionViewImpl#getInternalSelectBoxOption <em>Internal Select Box Option</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectBoxOptionViewImpl extends WebElementViewImpl implements SelectBoxOptionView {
	/**
	 * The cached value of the '{@link #getInternalSelectBoxOption() <em>Internal Select Box Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalSelectBoxOption()
	 * @generated
	 * @ordered
	 */
	protected InternalSelectBoxOption internalSelectBoxOption;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectBoxOptionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.SELECT_BOX_OPTION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSelectBoxOption getInternalSelectBoxOption() {
		if (internalSelectBoxOption != null && internalSelectBoxOption.eIsProxy()) {
			InternalEObject oldInternalSelectBoxOption = (InternalEObject)internalSelectBoxOption;
			internalSelectBoxOption = (InternalSelectBoxOption)eResolveProxy(oldInternalSelectBoxOption);
			if (internalSelectBoxOption != oldInternalSelectBoxOption) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.SELECT_BOX_OPTION_VIEW__INTERNAL_SELECT_BOX_OPTION, oldInternalSelectBoxOption, internalSelectBoxOption));
			}
		}
		return internalSelectBoxOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalSelectBoxOption basicGetInternalSelectBoxOption() {
		return internalSelectBoxOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalSelectBoxOption(InternalSelectBoxOption newInternalSelectBoxOption) {
		InternalSelectBoxOption oldInternalSelectBoxOption = internalSelectBoxOption;
		internalSelectBoxOption = newInternalSelectBoxOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.SELECT_BOX_OPTION_VIEW__INTERNAL_SELECT_BOX_OPTION, oldInternalSelectBoxOption, internalSelectBoxOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHighlighted() {
		return getInternalSelectBoxOption().isHighlighted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHighlighted(final boolean _arg) {
		getInternalSelectBoxOption().getElement().transact("Set Highlighted", () -> {
			getInternalSelectBoxOption().setHighlighted(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSelector() {
		return getInternalSelectBoxOption().getSelector();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelector(final String _arg) {
		getInternalSelectBoxOption().getElement().transact("Set Selector", () -> {
			getInternalSelectBoxOption().setSelector(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return getInternalSelectBoxOption().getValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(final String _arg) {
		getInternalSelectBoxOption().getElement().transact("Set Value", () -> {
			getInternalSelectBoxOption().setValue(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContent() {
		return getInternalSelectBoxOption().getContent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(final String _arg) {
		getInternalSelectBoxOption().getElement().transact("Set Content", () -> {
			getInternalSelectBoxOption().setContent(_arg);
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
			case ViewsPackage.SELECT_BOX_OPTION_VIEW__INTERNAL_SELECT_BOX_OPTION:
				if (resolve) return getInternalSelectBoxOption();
				return basicGetInternalSelectBoxOption();
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
			case ViewsPackage.SELECT_BOX_OPTION_VIEW__INTERNAL_SELECT_BOX_OPTION:
				setInternalSelectBoxOption((InternalSelectBoxOption)newValue);
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
			case ViewsPackage.SELECT_BOX_OPTION_VIEW__INTERNAL_SELECT_BOX_OPTION:
				setInternalSelectBoxOption((InternalSelectBoxOption)null);
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
			case ViewsPackage.SELECT_BOX_OPTION_VIEW__INTERNAL_SELECT_BOX_OPTION:
				return internalSelectBoxOption != null;
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
			case ViewsPackage.SELECT_BOX_OPTION_VIEW___IS_HIGHLIGHTED:
				return isHighlighted();
			case ViewsPackage.SELECT_BOX_OPTION_VIEW___SET_HIGHLIGHTED__BOOLEAN:
				setHighlighted((Boolean)arguments.get(0));
				return null;
			case ViewsPackage.SELECT_BOX_OPTION_VIEW___GET_SELECTOR:
				return getSelector();
			case ViewsPackage.SELECT_BOX_OPTION_VIEW___SET_SELECTOR__STRING:
				setSelector((String)arguments.get(0));
				return null;
			case ViewsPackage.SELECT_BOX_OPTION_VIEW___GET_VALUE:
				return getValue();
			case ViewsPackage.SELECT_BOX_OPTION_VIEW___SET_VALUE__STRING:
				setValue((String)arguments.get(0));
				return null;
			case ViewsPackage.SELECT_BOX_OPTION_VIEW___GET_CONTENT:
				return getContent();
			case ViewsPackage.SELECT_BOX_OPTION_VIEW___SET_CONTENT__STRING:
				setContent((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SelectBoxOptionViewImpl
