/**
 */
package info.scce.cinco.product.usersequence.usersequence.views.impl;

import info.scce.cinco.product.usersequence.usersequence.Comment;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalScreenshot;

import info.scce.cinco.product.usersequence.usersequence.views.ScreenshotView;
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
 * An implementation of the model object '<em><b>Screenshot View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.impl.ScreenshotViewImpl#getInternalScreenshot <em>Internal Screenshot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScreenshotViewImpl extends EObjectImpl implements ScreenshotView {
	/**
	 * The cached value of the '{@link #getInternalScreenshot() <em>Internal Screenshot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalScreenshot()
	 * @generated
	 * @ordered
	 */
	protected InternalScreenshot internalScreenshot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScreenshotViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.SCREENSHOT_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalScreenshot getInternalScreenshot() {
		if (internalScreenshot != null && internalScreenshot.eIsProxy()) {
			InternalEObject oldInternalScreenshot = (InternalEObject)internalScreenshot;
			internalScreenshot = (InternalScreenshot)eResolveProxy(oldInternalScreenshot);
			if (internalScreenshot != oldInternalScreenshot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.SCREENSHOT_VIEW__INTERNAL_SCREENSHOT, oldInternalScreenshot, internalScreenshot));
			}
		}
		return internalScreenshot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalScreenshot basicGetInternalScreenshot() {
		return internalScreenshot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalScreenshot(InternalScreenshot newInternalScreenshot) {
		InternalScreenshot oldInternalScreenshot = internalScreenshot;
		internalScreenshot = newInternalScreenshot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.SCREENSHOT_VIEW__INTERNAL_SCREENSHOT, oldInternalScreenshot, internalScreenshot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comment getDescription() {
		return getInternalScreenshot().getDescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(final Comment _arg) {
		getInternalScreenshot().getElement().transact("Set Description", () -> {
			getInternalScreenshot().setDescription(_arg);
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
			case ViewsPackage.SCREENSHOT_VIEW__INTERNAL_SCREENSHOT:
				if (resolve) return getInternalScreenshot();
				return basicGetInternalScreenshot();
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
			case ViewsPackage.SCREENSHOT_VIEW__INTERNAL_SCREENSHOT:
				setInternalScreenshot((InternalScreenshot)newValue);
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
			case ViewsPackage.SCREENSHOT_VIEW__INTERNAL_SCREENSHOT:
				setInternalScreenshot((InternalScreenshot)null);
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
			case ViewsPackage.SCREENSHOT_VIEW__INTERNAL_SCREENSHOT:
				return internalScreenshot != null;
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
			case ViewsPackage.SCREENSHOT_VIEW___GET_DESCRIPTION:
				return getDescription();
			case ViewsPackage.SCREENSHOT_VIEW___SET_DESCRIPTION__COMMENT:
				setDescription((Comment)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ScreenshotViewImpl
