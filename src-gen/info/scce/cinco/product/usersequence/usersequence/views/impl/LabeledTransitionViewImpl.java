/**
 */
package info.scce.cinco.product.usersequence.usersequence.views.impl;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalLabeledTransition;

import info.scce.cinco.product.usersequence.usersequence.views.LabeledTransitionView;
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
 * An implementation of the model object '<em><b>Labeled Transition View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.impl.LabeledTransitionViewImpl#getInternalLabeledTransition <em>Internal Labeled Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabeledTransitionViewImpl extends EObjectImpl implements LabeledTransitionView {
	/**
	 * The cached value of the '{@link #getInternalLabeledTransition() <em>Internal Labeled Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalLabeledTransition()
	 * @generated
	 * @ordered
	 */
	protected InternalLabeledTransition internalLabeledTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabeledTransitionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.LABELED_TRANSITION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalLabeledTransition getInternalLabeledTransition() {
		if (internalLabeledTransition != null && internalLabeledTransition.eIsProxy()) {
			InternalEObject oldInternalLabeledTransition = (InternalEObject)internalLabeledTransition;
			internalLabeledTransition = (InternalLabeledTransition)eResolveProxy(oldInternalLabeledTransition);
			if (internalLabeledTransition != oldInternalLabeledTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.LABELED_TRANSITION_VIEW__INTERNAL_LABELED_TRANSITION, oldInternalLabeledTransition, internalLabeledTransition));
			}
		}
		return internalLabeledTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalLabeledTransition basicGetInternalLabeledTransition() {
		return internalLabeledTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalLabeledTransition(InternalLabeledTransition newInternalLabeledTransition) {
		InternalLabeledTransition oldInternalLabeledTransition = internalLabeledTransition;
		internalLabeledTransition = newInternalLabeledTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.LABELED_TRANSITION_VIEW__INTERNAL_LABELED_TRANSITION, oldInternalLabeledTransition, internalLabeledTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return getInternalLabeledTransition().getLabel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(final String _arg) {
		getInternalLabeledTransition().getElement().transact("Set Label", () -> {
			getInternalLabeledTransition().setLabel(_arg);
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
			case ViewsPackage.LABELED_TRANSITION_VIEW__INTERNAL_LABELED_TRANSITION:
				if (resolve) return getInternalLabeledTransition();
				return basicGetInternalLabeledTransition();
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
			case ViewsPackage.LABELED_TRANSITION_VIEW__INTERNAL_LABELED_TRANSITION:
				setInternalLabeledTransition((InternalLabeledTransition)newValue);
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
			case ViewsPackage.LABELED_TRANSITION_VIEW__INTERNAL_LABELED_TRANSITION:
				setInternalLabeledTransition((InternalLabeledTransition)null);
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
			case ViewsPackage.LABELED_TRANSITION_VIEW__INTERNAL_LABELED_TRANSITION:
				return internalLabeledTransition != null;
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
			case ViewsPackage.LABELED_TRANSITION_VIEW___GET_LABEL:
				return getLabel();
			case ViewsPackage.LABELED_TRANSITION_VIEW___SET_LABEL__STRING:
				setLabel((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //LabeledTransitionViewImpl
