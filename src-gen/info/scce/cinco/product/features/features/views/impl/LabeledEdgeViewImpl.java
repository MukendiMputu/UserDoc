/**
 */
package info.scce.cinco.product.features.features.views.impl;

import info.scce.cinco.product.features.features.internal.InternalLabeledEdge;

import info.scce.cinco.product.features.features.views.LabeledEdgeView;
import info.scce.cinco.product.features.features.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Labeled Edge View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.features.features.views.impl.LabeledEdgeViewImpl#getInternalLabeledEdge <em>Internal Labeled Edge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabeledEdgeViewImpl extends EObjectImpl implements LabeledEdgeView {
	/**
	 * The cached value of the '{@link #getInternalLabeledEdge() <em>Internal Labeled Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalLabeledEdge()
	 * @generated
	 * @ordered
	 */
	protected InternalLabeledEdge internalLabeledEdge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabeledEdgeViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.LABELED_EDGE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalLabeledEdge getInternalLabeledEdge() {
		if (internalLabeledEdge != null && internalLabeledEdge.eIsProxy()) {
			InternalEObject oldInternalLabeledEdge = (InternalEObject)internalLabeledEdge;
			internalLabeledEdge = (InternalLabeledEdge)eResolveProxy(oldInternalLabeledEdge);
			if (internalLabeledEdge != oldInternalLabeledEdge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.LABELED_EDGE_VIEW__INTERNAL_LABELED_EDGE, oldInternalLabeledEdge, internalLabeledEdge));
			}
		}
		return internalLabeledEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalLabeledEdge basicGetInternalLabeledEdge() {
		return internalLabeledEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalLabeledEdge(InternalLabeledEdge newInternalLabeledEdge) {
		InternalLabeledEdge oldInternalLabeledEdge = internalLabeledEdge;
		internalLabeledEdge = newInternalLabeledEdge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.LABELED_EDGE_VIEW__INTERNAL_LABELED_EDGE, oldInternalLabeledEdge, internalLabeledEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return getInternalLabeledEdge().getLabel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(final String _arg) {
		getInternalLabeledEdge().getElement().transact("Set Label", () -> {
			getInternalLabeledEdge().setLabel(_arg);
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
			case ViewsPackage.LABELED_EDGE_VIEW__INTERNAL_LABELED_EDGE:
				if (resolve) return getInternalLabeledEdge();
				return basicGetInternalLabeledEdge();
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
			case ViewsPackage.LABELED_EDGE_VIEW__INTERNAL_LABELED_EDGE:
				setInternalLabeledEdge((InternalLabeledEdge)newValue);
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
			case ViewsPackage.LABELED_EDGE_VIEW__INTERNAL_LABELED_EDGE:
				setInternalLabeledEdge((InternalLabeledEdge)null);
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
			case ViewsPackage.LABELED_EDGE_VIEW__INTERNAL_LABELED_EDGE:
				return internalLabeledEdge != null;
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
			case ViewsPackage.LABELED_EDGE_VIEW___GET_LABEL:
				return getLabel();
			case ViewsPackage.LABELED_EDGE_VIEW___SET_LABEL__STRING:
				setLabel((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //LabeledEdgeViewImpl
