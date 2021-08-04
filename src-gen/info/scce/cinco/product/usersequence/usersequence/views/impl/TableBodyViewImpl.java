/**
 */
package info.scce.cinco.product.usersequence.usersequence.views.impl;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalTableBody;

import info.scce.cinco.product.usersequence.usersequence.views.TableBodyView;
import info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Body View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.impl.TableBodyViewImpl#getInternalTableBody <em>Internal Table Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableBodyViewImpl extends WebElementViewImpl implements TableBodyView {
	/**
	 * The cached value of the '{@link #getInternalTableBody() <em>Internal Table Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalTableBody()
	 * @generated
	 * @ordered
	 */
	protected InternalTableBody internalTableBody;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableBodyViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.TABLE_BODY_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalTableBody getInternalTableBody() {
		if (internalTableBody != null && internalTableBody.eIsProxy()) {
			InternalEObject oldInternalTableBody = (InternalEObject)internalTableBody;
			internalTableBody = (InternalTableBody)eResolveProxy(oldInternalTableBody);
			if (internalTableBody != oldInternalTableBody) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.TABLE_BODY_VIEW__INTERNAL_TABLE_BODY, oldInternalTableBody, internalTableBody));
			}
		}
		return internalTableBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalTableBody basicGetInternalTableBody() {
		return internalTableBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalTableBody(InternalTableBody newInternalTableBody) {
		InternalTableBody oldInternalTableBody = internalTableBody;
		internalTableBody = newInternalTableBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.TABLE_BODY_VIEW__INTERNAL_TABLE_BODY, oldInternalTableBody, internalTableBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHighlighted() {
		return getInternalTableBody().isHighlighted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHighlighted(final boolean _arg) {
		getInternalTableBody().getElement().transact("Set Highlighted", () -> {
			getInternalTableBody().setHighlighted(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSelector() {
		return getInternalTableBody().getSelector();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelector(final String _arg) {
		getInternalTableBody().getElement().transact("Set Selector", () -> {
			getInternalTableBody().setSelector(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return getInternalTableBody().getValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(final String _arg) {
		getInternalTableBody().getElement().transact("Set Value", () -> {
			getInternalTableBody().setValue(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContent() {
		return getInternalTableBody().getContent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(final String _arg) {
		getInternalTableBody().getElement().transact("Set Content", () -> {
			getInternalTableBody().setContent(_arg);
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
			case ViewsPackage.TABLE_BODY_VIEW__INTERNAL_TABLE_BODY:
				if (resolve) return getInternalTableBody();
				return basicGetInternalTableBody();
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
			case ViewsPackage.TABLE_BODY_VIEW__INTERNAL_TABLE_BODY:
				setInternalTableBody((InternalTableBody)newValue);
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
			case ViewsPackage.TABLE_BODY_VIEW__INTERNAL_TABLE_BODY:
				setInternalTableBody((InternalTableBody)null);
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
			case ViewsPackage.TABLE_BODY_VIEW__INTERNAL_TABLE_BODY:
				return internalTableBody != null;
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
			case ViewsPackage.TABLE_BODY_VIEW___IS_HIGHLIGHTED:
				return isHighlighted();
			case ViewsPackage.TABLE_BODY_VIEW___SET_HIGHLIGHTED__BOOLEAN:
				setHighlighted((Boolean)arguments.get(0));
				return null;
			case ViewsPackage.TABLE_BODY_VIEW___GET_SELECTOR:
				return getSelector();
			case ViewsPackage.TABLE_BODY_VIEW___SET_SELECTOR__STRING:
				setSelector((String)arguments.get(0));
				return null;
			case ViewsPackage.TABLE_BODY_VIEW___GET_VALUE:
				return getValue();
			case ViewsPackage.TABLE_BODY_VIEW___SET_VALUE__STRING:
				setValue((String)arguments.get(0));
				return null;
			case ViewsPackage.TABLE_BODY_VIEW___GET_CONTENT:
				return getContent();
			case ViewsPackage.TABLE_BODY_VIEW___SET_CONTENT__STRING:
				setContent((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //TableBodyViewImpl
