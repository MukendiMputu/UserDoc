/**
 */
package info.scce.cinco.product.features.features.internal.impl;

import de.jabc.cinco.meta.core.mgl.model.constraints.ConnectionConstraint;

import graphmodel.internal.InternalNode;

import graphmodel.internal.impl.InternalNodeImpl;

import info.scce.cinco.product.features.features.DocNode;
import info.scce.cinco.product.features.features.EndNode;
import info.scce.cinco.product.features.features.FeatureContainer;
import info.scce.cinco.product.features.features.StartNode;

import info.scce.cinco.product.features.features.internal.InternalDocNode;
import info.scce.cinco.product.features.features.internal.InternalPackage;

import info.scce.cinco.product.usersequence.usersequence.UserSequenceGraphModel;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doc Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.features.features.internal.impl.InternalDocNodeImpl#isCreateScreenshots <em>Create Screenshots</em>}</li>
 *   <li>{@link info.scce.cinco.product.features.features.internal.impl.InternalDocNodeImpl#getLibraryComponentUID <em>Library Component UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalDocNodeImpl extends InternalNodeImpl implements InternalDocNode {
	/**
	 * The default value of the '{@link #isCreateScreenshots() <em>Create Screenshots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreateScreenshots()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CREATE_SCREENSHOTS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCreateScreenshots() <em>Create Screenshots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreateScreenshots()
	 * @generated
	 * @ordered
	 */
	protected boolean createScreenshots = CREATE_SCREENSHOTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLibraryComponentUID() <em>Library Component UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryComponentUID()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBRARY_COMPONENT_UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibraryComponentUID() <em>Library Component UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryComponentUID()
	 * @generated
	 * @ordered
	 */
	protected String libraryComponentUID = LIBRARY_COMPONENT_UID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalDocNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InternalPackage.Literals.INTERNAL_DOC_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCreateScreenshots() {
		return createScreenshots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreateScreenshots(boolean newCreateScreenshots) {
		boolean oldCreateScreenshots = createScreenshots;
		createScreenshots = newCreateScreenshots;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_DOC_NODE__CREATE_SCREENSHOTS, oldCreateScreenshots, createScreenshots));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLibraryComponentUID() {
		return libraryComponentUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLibraryComponentUID(String newLibraryComponentUID) {
		String oldLibraryComponentUID = libraryComponentUID;
		libraryComponentUID = newLibraryComponentUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_DOC_NODE__LIBRARY_COMPONENT_UID, oldLibraryComponentUID, libraryComponentUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectionConstraint> getIncomingConstraints() {
		ConnectionConstraint cons0 = new ConnectionConstraint(false, 1, -1, info.scce.cinco.product.features.features.Edge.class,info.scce.cinco.product.features.features.LabeledEdge.class);
		org.eclipse.emf.common.util.BasicEList<ConnectionConstraint>eList = new org.eclipse.emf.common.util.BasicEList<ConnectionConstraint>();
		eList.addAll(com.google.common.collect.Lists.newArrayList(cons0));
		eList.addAll(super.getIncomingConstraints());
		return eList;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectionConstraint> getOutgoingConstraints() {
		ConnectionConstraint cons0 = new ConnectionConstraint(true, 1, -1, info.scce.cinco.product.features.features.Edge.class,info.scce.cinco.product.features.features.LabeledEdge.class);
		org.eclipse.emf.common.util.BasicEList<ConnectionConstraint>eList = new org.eclipse.emf.common.util.BasicEList<ConnectionConstraint>();
		eList.addAll(com.google.common.collect.Lists.newArrayList(cons0));
		eList.addAll(super.getOutgoingConstraints());
		return eList;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StartNode> getStartNodePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.features.features.StartNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeatureContainer> getFeatureContainerPredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.features.features.FeatureContainer.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DocNode> getDocNodePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.features.features.DocNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EndNode> getEndNodeSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.features.features.EndNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeatureContainer> getFeatureContainerSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.features.features.FeatureContainer.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DocNode> getDocNodeSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.features.features.DocNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserSequenceGraphModel getMgl() {
		String uid = getLibraryComponentUID();
		return (info.scce.cinco.product.usersequence.usersequence.UserSequenceGraphModel) de.jabc.cinco.meta.core.referenceregistry.ReferenceRegistry.getInstance().getEObject(uid);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InternalPackage.INTERNAL_DOC_NODE__CREATE_SCREENSHOTS:
				return isCreateScreenshots();
			case InternalPackage.INTERNAL_DOC_NODE__LIBRARY_COMPONENT_UID:
				return getLibraryComponentUID();
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
			case InternalPackage.INTERNAL_DOC_NODE__CREATE_SCREENSHOTS:
				setCreateScreenshots((Boolean)newValue);
				return;
			case InternalPackage.INTERNAL_DOC_NODE__LIBRARY_COMPONENT_UID:
				setLibraryComponentUID((String)newValue);
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
			case InternalPackage.INTERNAL_DOC_NODE__CREATE_SCREENSHOTS:
				setCreateScreenshots(CREATE_SCREENSHOTS_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_DOC_NODE__LIBRARY_COMPONENT_UID:
				setLibraryComponentUID(LIBRARY_COMPONENT_UID_EDEFAULT);
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
			case InternalPackage.INTERNAL_DOC_NODE__CREATE_SCREENSHOTS:
				return createScreenshots != CREATE_SCREENSHOTS_EDEFAULT;
			case InternalPackage.INTERNAL_DOC_NODE__LIBRARY_COMPONENT_UID:
				return LIBRARY_COMPONENT_UID_EDEFAULT == null ? libraryComponentUID != null : !LIBRARY_COMPONENT_UID_EDEFAULT.equals(libraryComponentUID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == InternalNode.class) {
			switch (baseOperationID) {
				case graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING_CONSTRAINTS: return InternalPackage.INTERNAL_DOC_NODE___GET_OUTGOING_CONSTRAINTS;
				case graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING_CONSTRAINTS: return InternalPackage.INTERNAL_DOC_NODE___GET_INCOMING_CONSTRAINTS;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case InternalPackage.INTERNAL_DOC_NODE___GET_INCOMING_CONSTRAINTS:
				return getIncomingConstraints();
			case InternalPackage.INTERNAL_DOC_NODE___GET_OUTGOING_CONSTRAINTS:
				return getOutgoingConstraints();
			case InternalPackage.INTERNAL_DOC_NODE___GET_START_NODE_PREDECESSORS:
				return getStartNodePredecessors();
			case InternalPackage.INTERNAL_DOC_NODE___GET_FEATURE_CONTAINER_PREDECESSORS:
				return getFeatureContainerPredecessors();
			case InternalPackage.INTERNAL_DOC_NODE___GET_DOC_NODE_PREDECESSORS:
				return getDocNodePredecessors();
			case InternalPackage.INTERNAL_DOC_NODE___GET_END_NODE_SUCCESSORS:
				return getEndNodeSuccessors();
			case InternalPackage.INTERNAL_DOC_NODE___GET_FEATURE_CONTAINER_SUCCESSORS:
				return getFeatureContainerSuccessors();
			case InternalPackage.INTERNAL_DOC_NODE___GET_DOC_NODE_SUCCESSORS:
				return getDocNodeSuccessors();
			case InternalPackage.INTERNAL_DOC_NODE___GET_MGL:
				return getMgl();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (createScreenshots: ");
		result.append(createScreenshots);
		result.append(", libraryComponentUID: ");
		result.append(libraryComponentUID);
		result.append(')');
		return result.toString();
	}

} //InternalDocNodeImpl
