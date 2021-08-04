/**
 */
package info.scce.cinco.product.usersequence.usersequence.views.impl;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalWebElement;

import info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage;
import info.scce.cinco.product.usersequence.usersequence.views.WebElementView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Element View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.impl.WebElementViewImpl#getInternalWebElement <em>Internal Web Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebElementViewImpl extends EObjectImpl implements WebElementView {
	/**
	 * The cached value of the '{@link #getInternalWebElement() <em>Internal Web Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalWebElement()
	 * @generated
	 * @ordered
	 */
	protected InternalWebElement internalWebElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebElementViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.WEB_ELEMENT_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalWebElement getInternalWebElement() {
		if (internalWebElement != null && internalWebElement.eIsProxy()) {
			InternalEObject oldInternalWebElement = (InternalEObject)internalWebElement;
			internalWebElement = (InternalWebElement)eResolveProxy(oldInternalWebElement);
			if (internalWebElement != oldInternalWebElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.WEB_ELEMENT_VIEW__INTERNAL_WEB_ELEMENT, oldInternalWebElement, internalWebElement));
			}
		}
		return internalWebElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalWebElement basicGetInternalWebElement() {
		return internalWebElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalWebElement(InternalWebElement newInternalWebElement) {
		InternalWebElement oldInternalWebElement = internalWebElement;
		internalWebElement = newInternalWebElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.WEB_ELEMENT_VIEW__INTERNAL_WEB_ELEMENT, oldInternalWebElement, internalWebElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsHighlighted() {
		return getInternalWebElement().isIsHighlighted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsHighlighted(final boolean _arg) {
		getInternalWebElement().getElement().transact("Set IsHighlighted", () -> {
			getInternalWebElement().setIsHighlighted(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentText() {
		return getInternalWebElement().getContentText();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentText(final String _arg) {
		getInternalWebElement().getElement().transact("Set ContentText", () -> {
			getInternalWebElement().setContentText(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttribute() {
		return getInternalWebElement().getAttribute();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttribute(final String _arg) {
		getInternalWebElement().getElement().transact("Set Attribute", () -> {
			getInternalWebElement().setAttribute(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttrValue() {
		return getInternalWebElement().getAttrValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttrValue(final String _arg) {
		getInternalWebElement().getElement().transact("Set AttrValue", () -> {
			getInternalWebElement().setAttrValue(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTagName() {
		return getInternalWebElement().getTagName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTagName(final String _arg) {
		getInternalWebElement().getElement().transact("Set TagName", () -> {
			getInternalWebElement().setTagName(_arg);
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
			case ViewsPackage.WEB_ELEMENT_VIEW__INTERNAL_WEB_ELEMENT:
				if (resolve) return getInternalWebElement();
				return basicGetInternalWebElement();
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
			case ViewsPackage.WEB_ELEMENT_VIEW__INTERNAL_WEB_ELEMENT:
				setInternalWebElement((InternalWebElement)newValue);
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
			case ViewsPackage.WEB_ELEMENT_VIEW__INTERNAL_WEB_ELEMENT:
				setInternalWebElement((InternalWebElement)null);
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
			case ViewsPackage.WEB_ELEMENT_VIEW__INTERNAL_WEB_ELEMENT:
				return internalWebElement != null;
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
			case ViewsPackage.WEB_ELEMENT_VIEW___IS_IS_HIGHLIGHTED:
				return isIsHighlighted();
			case ViewsPackage.WEB_ELEMENT_VIEW___SET_IS_HIGHLIGHTED__BOOLEAN:
				setIsHighlighted((Boolean)arguments.get(0));
				return null;
			case ViewsPackage.WEB_ELEMENT_VIEW___GET_CONTENT_TEXT:
				return getContentText();
			case ViewsPackage.WEB_ELEMENT_VIEW___SET_CONTENT_TEXT__STRING:
				setContentText((String)arguments.get(0));
				return null;
			case ViewsPackage.WEB_ELEMENT_VIEW___GET_ATTRIBUTE:
				return getAttribute();
			case ViewsPackage.WEB_ELEMENT_VIEW___SET_ATTRIBUTE__STRING:
				setAttribute((String)arguments.get(0));
				return null;
			case ViewsPackage.WEB_ELEMENT_VIEW___GET_ATTR_VALUE:
				return getAttrValue();
			case ViewsPackage.WEB_ELEMENT_VIEW___SET_ATTR_VALUE__STRING:
				setAttrValue((String)arguments.get(0));
				return null;
			case ViewsPackage.WEB_ELEMENT_VIEW___GET_TAG_NAME:
				return getTagName();
			case ViewsPackage.WEB_ELEMENT_VIEW___SET_TAG_NAME__STRING:
				setTagName((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //WebElementViewImpl
