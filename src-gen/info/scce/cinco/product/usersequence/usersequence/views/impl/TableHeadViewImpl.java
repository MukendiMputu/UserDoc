/**
 */
package info.scce.cinco.product.usersequence.usersequence.views.impl;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalTableHead;

import info.scce.cinco.product.usersequence.usersequence.views.TableHeadView;
import info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Head View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.impl.TableHeadViewImpl#getInternalTableHead <em>Internal Table Head</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableHeadViewImpl extends WebElementViewImpl implements TableHeadView {
	/**
	 * The cached value of the '{@link #getInternalTableHead() <em>Internal Table Head</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalTableHead()
	 * @generated
	 * @ordered
	 */
	protected InternalTableHead internalTableHead;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableHeadViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.TABLE_HEAD_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalTableHead getInternalTableHead() {
		if (internalTableHead != null && internalTableHead.eIsProxy()) {
			InternalEObject oldInternalTableHead = (InternalEObject)internalTableHead;
			internalTableHead = (InternalTableHead)eResolveProxy(oldInternalTableHead);
			if (internalTableHead != oldInternalTableHead) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.TABLE_HEAD_VIEW__INTERNAL_TABLE_HEAD, oldInternalTableHead, internalTableHead));
			}
		}
		return internalTableHead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalTableHead basicGetInternalTableHead() {
		return internalTableHead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalTableHead(InternalTableHead newInternalTableHead) {
		InternalTableHead oldInternalTableHead = internalTableHead;
		internalTableHead = newInternalTableHead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.TABLE_HEAD_VIEW__INTERNAL_TABLE_HEAD, oldInternalTableHead, internalTableHead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHighlighted() {
		return getInternalTableHead().isHighlighted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHighlighted(final boolean _arg) {
		getInternalTableHead().getElement().transact("Set Highlighted", () -> {
			getInternalTableHead().setHighlighted(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSelector() {
		return getInternalTableHead().getSelector();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelector(final String _arg) {
		getInternalTableHead().getElement().transact("Set Selector", () -> {
			getInternalTableHead().setSelector(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return getInternalTableHead().getValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(final String _arg) {
		getInternalTableHead().getElement().transact("Set Value", () -> {
			getInternalTableHead().setValue(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContent() {
		return getInternalTableHead().getContent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(final String _arg) {
		getInternalTableHead().getElement().transact("Set Content", () -> {
			getInternalTableHead().setContent(_arg);
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
			case ViewsPackage.TABLE_HEAD_VIEW__INTERNAL_TABLE_HEAD:
				if (resolve) return getInternalTableHead();
				return basicGetInternalTableHead();
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
			case ViewsPackage.TABLE_HEAD_VIEW__INTERNAL_TABLE_HEAD:
				setInternalTableHead((InternalTableHead)newValue);
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
			case ViewsPackage.TABLE_HEAD_VIEW__INTERNAL_TABLE_HEAD:
				setInternalTableHead((InternalTableHead)null);
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
			case ViewsPackage.TABLE_HEAD_VIEW__INTERNAL_TABLE_HEAD:
				return internalTableHead != null;
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
			case ViewsPackage.TABLE_HEAD_VIEW___IS_HIGHLIGHTED:
				return isHighlighted();
			case ViewsPackage.TABLE_HEAD_VIEW___SET_HIGHLIGHTED__BOOLEAN:
				setHighlighted((Boolean)arguments.get(0));
				return null;
			case ViewsPackage.TABLE_HEAD_VIEW___GET_SELECTOR:
				return getSelector();
			case ViewsPackage.TABLE_HEAD_VIEW___SET_SELECTOR__STRING:
				setSelector((String)arguments.get(0));
				return null;
			case ViewsPackage.TABLE_HEAD_VIEW___GET_VALUE:
				return getValue();
			case ViewsPackage.TABLE_HEAD_VIEW___SET_VALUE__STRING:
				setValue((String)arguments.get(0));
				return null;
			case ViewsPackage.TABLE_HEAD_VIEW___GET_CONTENT:
				return getContent();
			case ViewsPackage.TABLE_HEAD_VIEW___SET_CONTENT__STRING:
				setContent((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //TableHeadViewImpl
