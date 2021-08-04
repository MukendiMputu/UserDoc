/**
 */
package info.scce.cinco.product.usersequence.usersequence.views.impl;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalSelectBox;

import info.scce.cinco.product.usersequence.usersequence.views.SelectBoxView;
import info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Box View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.impl.SelectBoxViewImpl#getInternalSelectBox <em>Internal Select Box</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectBoxViewImpl extends WebElementViewImpl implements SelectBoxView {
	/**
	 * The cached value of the '{@link #getInternalSelectBox() <em>Internal Select Box</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalSelectBox()
	 * @generated
	 * @ordered
	 */
	protected InternalSelectBox internalSelectBox;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectBoxViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.SELECT_BOX_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSelectBox getInternalSelectBox() {
		if (internalSelectBox != null && internalSelectBox.eIsProxy()) {
			InternalEObject oldInternalSelectBox = (InternalEObject)internalSelectBox;
			internalSelectBox = (InternalSelectBox)eResolveProxy(oldInternalSelectBox);
			if (internalSelectBox != oldInternalSelectBox) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.SELECT_BOX_VIEW__INTERNAL_SELECT_BOX, oldInternalSelectBox, internalSelectBox));
			}
		}
		return internalSelectBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalSelectBox basicGetInternalSelectBox() {
		return internalSelectBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalSelectBox(InternalSelectBox newInternalSelectBox) {
		InternalSelectBox oldInternalSelectBox = internalSelectBox;
		internalSelectBox = newInternalSelectBox;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.SELECT_BOX_VIEW__INTERNAL_SELECT_BOX, oldInternalSelectBox, internalSelectBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHighlighted() {
		return getInternalSelectBox().isHighlighted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHighlighted(final boolean _arg) {
		getInternalSelectBox().getElement().transact("Set Highlighted", () -> {
			getInternalSelectBox().setHighlighted(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSelector() {
		return getInternalSelectBox().getSelector();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelector(final String _arg) {
		getInternalSelectBox().getElement().transact("Set Selector", () -> {
			getInternalSelectBox().setSelector(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return getInternalSelectBox().getValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(final String _arg) {
		getInternalSelectBox().getElement().transact("Set Value", () -> {
			getInternalSelectBox().setValue(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContent() {
		return getInternalSelectBox().getContent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(final String _arg) {
		getInternalSelectBox().getElement().transact("Set Content", () -> {
			getInternalSelectBox().setContent(_arg);
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
			case ViewsPackage.SELECT_BOX_VIEW__INTERNAL_SELECT_BOX:
				if (resolve) return getInternalSelectBox();
				return basicGetInternalSelectBox();
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
			case ViewsPackage.SELECT_BOX_VIEW__INTERNAL_SELECT_BOX:
				setInternalSelectBox((InternalSelectBox)newValue);
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
			case ViewsPackage.SELECT_BOX_VIEW__INTERNAL_SELECT_BOX:
				setInternalSelectBox((InternalSelectBox)null);
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
			case ViewsPackage.SELECT_BOX_VIEW__INTERNAL_SELECT_BOX:
				return internalSelectBox != null;
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
			case ViewsPackage.SELECT_BOX_VIEW___IS_HIGHLIGHTED:
				return isHighlighted();
			case ViewsPackage.SELECT_BOX_VIEW___SET_HIGHLIGHTED__BOOLEAN:
				setHighlighted((Boolean)arguments.get(0));
				return null;
			case ViewsPackage.SELECT_BOX_VIEW___GET_SELECTOR:
				return getSelector();
			case ViewsPackage.SELECT_BOX_VIEW___SET_SELECTOR__STRING:
				setSelector((String)arguments.get(0));
				return null;
			case ViewsPackage.SELECT_BOX_VIEW___GET_VALUE:
				return getValue();
			case ViewsPackage.SELECT_BOX_VIEW___SET_VALUE__STRING:
				setValue((String)arguments.get(0));
				return null;
			case ViewsPackage.SELECT_BOX_VIEW___GET_CONTENT:
				return getContent();
			case ViewsPackage.SELECT_BOX_VIEW___SET_CONTENT__STRING:
				setContent((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SelectBoxViewImpl
