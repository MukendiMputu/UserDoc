/**
 */
package info.scce.cinco.product.usersequence.usersequence.views.impl;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalSubSequence;

import info.scce.cinco.product.usersequence.usersequence.views.SubSequenceView;
import info.scce.cinco.product.usersequence.usersequence.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Sequence View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.impl.SubSequenceViewImpl#getInternalSubSequence <em>Internal Sub Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubSequenceViewImpl extends EObjectImpl implements SubSequenceView {
	/**
	 * The cached value of the '{@link #getInternalSubSequence() <em>Internal Sub Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalSubSequence()
	 * @generated
	 * @ordered
	 */
	protected InternalSubSequence internalSubSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubSequenceViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.SUB_SEQUENCE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSubSequence getInternalSubSequence() {
		if (internalSubSequence != null && internalSubSequence.eIsProxy()) {
			InternalEObject oldInternalSubSequence = (InternalEObject)internalSubSequence;
			internalSubSequence = (InternalSubSequence)eResolveProxy(oldInternalSubSequence);
			if (internalSubSequence != oldInternalSubSequence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.SUB_SEQUENCE_VIEW__INTERNAL_SUB_SEQUENCE, oldInternalSubSequence, internalSubSequence));
			}
		}
		return internalSubSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalSubSequence basicGetInternalSubSequence() {
		return internalSubSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalSubSequence(InternalSubSequence newInternalSubSequence) {
		InternalSubSequence oldInternalSubSequence = internalSubSequence;
		internalSubSequence = newInternalSubSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.SUB_SEQUENCE_VIEW__INTERNAL_SUB_SEQUENCE, oldInternalSubSequence, internalSubSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.SUB_SEQUENCE_VIEW__INTERNAL_SUB_SEQUENCE:
				if (resolve) return getInternalSubSequence();
				return basicGetInternalSubSequence();
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
			case ViewsPackage.SUB_SEQUENCE_VIEW__INTERNAL_SUB_SEQUENCE:
				setInternalSubSequence((InternalSubSequence)newValue);
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
			case ViewsPackage.SUB_SEQUENCE_VIEW__INTERNAL_SUB_SEQUENCE:
				setInternalSubSequence((InternalSubSequence)null);
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
			case ViewsPackage.SUB_SEQUENCE_VIEW__INTERNAL_SUB_SEQUENCE:
				return internalSubSequence != null;
		}
		return super.eIsSet(featureID);
	}

} //SubSequenceViewImpl
