/**
 */
package info.scce.cinco.product.usersequence.usersequence.views.impl;

import info.scce.cinco.product.usersequence.usersequence.Screenshot;

import info.scce.cinco.product.usersequence.usersequence.internal.InternalComment;

import info.scce.cinco.product.usersequence.usersequence.views.CommentView;
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
 * An implementation of the model object '<em><b>Comment View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.usersequence.usersequence.views.impl.CommentViewImpl#getInternalComment <em>Internal Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommentViewImpl extends EObjectImpl implements CommentView {
	/**
	 * The cached value of the '{@link #getInternalComment() <em>Internal Comment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalComment()
	 * @generated
	 * @ordered
	 */
	protected InternalComment internalComment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.COMMENT_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalComment getInternalComment() {
		if (internalComment != null && internalComment.eIsProxy()) {
			InternalEObject oldInternalComment = (InternalEObject)internalComment;
			internalComment = (InternalComment)eResolveProxy(oldInternalComment);
			if (internalComment != oldInternalComment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.COMMENT_VIEW__INTERNAL_COMMENT, oldInternalComment, internalComment));
			}
		}
		return internalComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalComment basicGetInternalComment() {
		return internalComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalComment(InternalComment newInternalComment) {
		InternalComment oldInternalComment = internalComment;
		internalComment = newInternalComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.COMMENT_VIEW__INTERNAL_COMMENT, oldInternalComment, internalComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContent() {
		return getInternalComment().getContent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(final String _arg) {
		getInternalComment().getElement().transact("Set Content", () -> {
			getInternalComment().setContent(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Screenshot getReferenceTo() {
		return getInternalComment().getReferenceTo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferenceTo(final Screenshot _arg) {
		getInternalComment().getElement().transact("Set ReferenceTo", () -> {
			getInternalComment().setReferenceTo(_arg);
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
			case ViewsPackage.COMMENT_VIEW__INTERNAL_COMMENT:
				if (resolve) return getInternalComment();
				return basicGetInternalComment();
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
			case ViewsPackage.COMMENT_VIEW__INTERNAL_COMMENT:
				setInternalComment((InternalComment)newValue);
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
			case ViewsPackage.COMMENT_VIEW__INTERNAL_COMMENT:
				setInternalComment((InternalComment)null);
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
			case ViewsPackage.COMMENT_VIEW__INTERNAL_COMMENT:
				return internalComment != null;
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
			case ViewsPackage.COMMENT_VIEW___GET_CONTENT:
				return getContent();
			case ViewsPackage.COMMENT_VIEW___SET_CONTENT__STRING:
				setContent((String)arguments.get(0));
				return null;
			case ViewsPackage.COMMENT_VIEW___GET_REFERENCE_TO:
				return getReferenceTo();
			case ViewsPackage.COMMENT_VIEW___SET_REFERENCE_TO__SCREENSHOT:
				setReferenceTo((Screenshot)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //CommentViewImpl
