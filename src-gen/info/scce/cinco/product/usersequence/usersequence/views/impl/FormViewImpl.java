/**
 */
package info.scce.cinco.product.usersequence.usersequence.views.impl;

import info.scce.cinco.product.usersequence.usersequence.Input;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalForm;

import info.scce.cinco.product.usersequence.usersequence.views.FormView;
import info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.impl.FormViewImpl#getInternalForm <em>Internal Form</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormViewImpl extends WebElementViewImpl implements FormView {
	/**
	 * The cached value of the '{@link #getInternalForm() <em>Internal Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalForm()
	 * @generated
	 * @ordered
	 */
	protected InternalForm internalForm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.FORM_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalForm getInternalForm() {
		if (internalForm != null && internalForm.eIsProxy()) {
			InternalEObject oldInternalForm = (InternalEObject)internalForm;
			internalForm = (InternalForm)eResolveProxy(oldInternalForm);
			if (internalForm != oldInternalForm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.FORM_VIEW__INTERNAL_FORM, oldInternalForm, internalForm));
			}
		}
		return internalForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalForm basicGetInternalForm() {
		return internalForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalForm(InternalForm newInternalForm) {
		InternalForm oldInternalForm = internalForm;
		internalForm = newInternalForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.FORM_VIEW__INTERNAL_FORM, oldInternalForm, internalForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMethod() {
		return getInternalForm().getMethod();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethod(final String _arg) {
		getInternalForm().getElement().transact("Set Method", () -> {
			getInternalForm().setMethod(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Input> getField() {
		return getInternalForm().getField();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setField(final EList<Input> _arg) {
		getInternalForm().getElement().transact("Set Field", () -> {
			getInternalForm().getField().clear();
			getInternalForm().getField().addAll(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addField(final Input _arg) {
		getInternalForm().getElement().transact("Set Field", () -> {
			getInternalForm().getField().add(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeField(final Input field) {
		getInternalForm().getElement().transact("Set Field", () -> {
			getInternalForm().getField().remove(field);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHighlighted() {
		return getInternalForm().isHighlighted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHighlighted(final boolean _arg) {
		getInternalForm().getElement().transact("Set Highlighted", () -> {
			getInternalForm().setHighlighted(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAction() {
		return getInternalForm().getAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAction(final String _arg) {
		getInternalForm().getElement().transact("Set Action", () -> {
			getInternalForm().setAction(_arg);
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
			case ViewsPackage.FORM_VIEW__INTERNAL_FORM:
				if (resolve) return getInternalForm();
				return basicGetInternalForm();
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
			case ViewsPackage.FORM_VIEW__INTERNAL_FORM:
				setInternalForm((InternalForm)newValue);
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
			case ViewsPackage.FORM_VIEW__INTERNAL_FORM:
				setInternalForm((InternalForm)null);
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
			case ViewsPackage.FORM_VIEW__INTERNAL_FORM:
				return internalForm != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ViewsPackage.FORM_VIEW___GET_METHOD:
				return getMethod();
			case ViewsPackage.FORM_VIEW___SET_METHOD__STRING:
				setMethod((String)arguments.get(0));
				return null;
			case ViewsPackage.FORM_VIEW___GET_FIELD:
				return getField();
			case ViewsPackage.FORM_VIEW___SET_FIELD__ELIST:
				setField((EList<Input>)arguments.get(0));
				return null;
			case ViewsPackage.FORM_VIEW___ADD_FIELD__INPUT:
				addField((Input)arguments.get(0));
				return null;
			case ViewsPackage.FORM_VIEW___REMOVE_FIELD__INPUT:
				removeField((Input)arguments.get(0));
				return null;
			case ViewsPackage.FORM_VIEW___IS_HIGHLIGHTED:
				return isHighlighted();
			case ViewsPackage.FORM_VIEW___SET_HIGHLIGHTED__BOOLEAN:
				setHighlighted((Boolean)arguments.get(0));
				return null;
			case ViewsPackage.FORM_VIEW___GET_ACTION:
				return getAction();
			case ViewsPackage.FORM_VIEW___SET_ACTION__STRING:
				setAction((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //FormViewImpl
