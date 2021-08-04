/**
 */
package info.scce.cinco.product.usersequence.usersequence.views.impl;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalSection;

import info.scce.cinco.product.usersequence.usersequence.views.SectionView;
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
 * An implementation of the model object '<em><b>Section View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.impl.SectionViewImpl#getInternalSection <em>Internal Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionViewImpl extends EObjectImpl implements SectionView {
	/**
	 * The cached value of the '{@link #getInternalSection() <em>Internal Section</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalSection()
	 * @generated
	 * @ordered
	 */
	protected InternalSection internalSection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.SECTION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSection getInternalSection() {
		if (internalSection != null && internalSection.eIsProxy()) {
			InternalEObject oldInternalSection = (InternalEObject)internalSection;
			internalSection = (InternalSection)eResolveProxy(oldInternalSection);
			if (internalSection != oldInternalSection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.SECTION_VIEW__INTERNAL_SECTION, oldInternalSection, internalSection));
			}
		}
		return internalSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalSection basicGetInternalSection() {
		return internalSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalSection(InternalSection newInternalSection) {
		InternalSection oldInternalSection = internalSection;
		internalSection = newInternalSection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.SECTION_VIEW__INTERNAL_SECTION, oldInternalSection, internalSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHighlighted() {
		return getInternalSection().isHighlighted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHighlighted(final boolean _arg) {
		getInternalSection().getElement().transact("Set Highlighted", () -> {
			getInternalSection().setHighlighted(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return getInternalSection().getTitle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(final String _arg) {
		getInternalSection().getElement().transact("Set Title", () -> {
			getInternalSection().setTitle(_arg);
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
			case ViewsPackage.SECTION_VIEW__INTERNAL_SECTION:
				if (resolve) return getInternalSection();
				return basicGetInternalSection();
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
			case ViewsPackage.SECTION_VIEW__INTERNAL_SECTION:
				setInternalSection((InternalSection)newValue);
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
			case ViewsPackage.SECTION_VIEW__INTERNAL_SECTION:
				setInternalSection((InternalSection)null);
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
			case ViewsPackage.SECTION_VIEW__INTERNAL_SECTION:
				return internalSection != null;
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
			case ViewsPackage.SECTION_VIEW___IS_HIGHLIGHTED:
				return isHighlighted();
			case ViewsPackage.SECTION_VIEW___SET_HIGHLIGHTED__BOOLEAN:
				setHighlighted((Boolean)arguments.get(0));
				return null;
			case ViewsPackage.SECTION_VIEW___GET_TITLE:
				return getTitle();
			case ViewsPackage.SECTION_VIEW___SET_TITLE__STRING:
				setTitle((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SectionViewImpl
