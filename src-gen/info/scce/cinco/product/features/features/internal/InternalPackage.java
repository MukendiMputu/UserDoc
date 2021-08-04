/**
 */
package info.scce.cinco.product.features.features.internal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.features.features.internal.InternalFactory
 * @model kind="package"
 * @generated
 */
public interface InternalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "internal";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cinco.scce.info/product/features/internal";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "features-internal";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InternalPackage eINSTANCE = info.scce.cinco.product.features.features.internal.impl.InternalPackageImpl.init();

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.features.features.internal.impl.InternalStartNodeImpl <em>Start Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.features.features.internal.impl.InternalStartNodeImpl
	 * @see info.scce.cinco.product.features.features.internal.impl.InternalPackageImpl#getInternalStartNode()
	 * @generated
	 */
	int INTERNAL_START_NODE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_START_NODE__ID = graphmodel.internal.InternalPackage.INTERNAL_NODE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_START_NODE__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_NODE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_START_NODE__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_START_NODE__X = graphmodel.internal.InternalPackage.INTERNAL_NODE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_START_NODE__Y = graphmodel.internal.InternalPackage.INTERNAL_NODE__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_START_NODE__HEIGHT = graphmodel.internal.InternalPackage.INTERNAL_NODE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_START_NODE__WIDTH = graphmodel.internal.InternalPackage.INTERNAL_NODE__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_START_NODE__INCOMING = graphmodel.internal.InternalPackage.INTERNAL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_START_NODE__OUTGOING = graphmodel.internal.InternalPackage.INTERNAL_NODE__OUTGOING;

	/**
	 * The number of structural features of the '<em>Start Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_START_NODE_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_START_NODE___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_START_NODE___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_START_NODE___SAVE = graphmodel.internal.InternalPackage.INTERNAL_NODE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_START_NODE___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_START_NODE___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_START_NODE___GET_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_START_NODE___GET_SUCCESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_START_NODE___GET_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_START_NODE___GET_PREDECESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_START_NODE___GET_INCOMING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_START_NODE___GET_OUTGOING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_START_NODE___CAN_CONNECT__EDGE_NODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_START_NODE___GET_INCOMING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_START_NODE___CAN_START__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_START_NODE___CAN_END__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_START_NODE___GET_OUTGOING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get End Node Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_START_NODE___GET_END_NODE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Feature Container Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_START_NODE___GET_FEATURE_CONTAINER_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Doc Node Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_START_NODE___GET_DOC_NODE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Start Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_START_NODE_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.features.features.internal.impl.InternalEndNodeImpl <em>End Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.features.features.internal.impl.InternalEndNodeImpl
	 * @see info.scce.cinco.product.features.features.internal.impl.InternalPackageImpl#getInternalEndNode()
	 * @generated
	 */
	int INTERNAL_END_NODE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_END_NODE__ID = graphmodel.internal.InternalPackage.INTERNAL_NODE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_END_NODE__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_NODE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_END_NODE__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_END_NODE__X = graphmodel.internal.InternalPackage.INTERNAL_NODE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_END_NODE__Y = graphmodel.internal.InternalPackage.INTERNAL_NODE__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_END_NODE__HEIGHT = graphmodel.internal.InternalPackage.INTERNAL_NODE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_END_NODE__WIDTH = graphmodel.internal.InternalPackage.INTERNAL_NODE__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_END_NODE__INCOMING = graphmodel.internal.InternalPackage.INTERNAL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_END_NODE__OUTGOING = graphmodel.internal.InternalPackage.INTERNAL_NODE__OUTGOING;

	/**
	 * The number of structural features of the '<em>End Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_END_NODE_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_END_NODE___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_END_NODE___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_END_NODE___SAVE = graphmodel.internal.InternalPackage.INTERNAL_NODE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_END_NODE___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_END_NODE___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_END_NODE___GET_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_END_NODE___GET_SUCCESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_END_NODE___GET_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_END_NODE___GET_PREDECESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_END_NODE___GET_INCOMING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_END_NODE___GET_OUTGOING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_END_NODE___CAN_CONNECT__EDGE_NODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_END_NODE___GET_OUTGOING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_END_NODE___CAN_START__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_END_NODE___CAN_END__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_END_NODE___GET_INCOMING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Start Node Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_END_NODE___GET_START_NODE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Feature Container Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_END_NODE___GET_FEATURE_CONTAINER_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Doc Node Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_END_NODE___GET_DOC_NODE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>End Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_END_NODE_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.features.features.internal.impl.InternalFeatureContainerImpl <em>Feature Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.features.features.internal.impl.InternalFeatureContainerImpl
	 * @see info.scce.cinco.product.features.features.internal.impl.InternalPackageImpl#getInternalFeatureContainer()
	 * @generated
	 */
	int INTERNAL_FEATURE_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER__ID = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER__X = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER__Y = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER__HEIGHT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER__WIDTH = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER__INCOMING = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER__OUTGOING = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__OUTGOING;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER__MODEL_ELEMENTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER__TITLE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER___SAVE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER___GET_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER___GET_SUCCESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER___GET_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER___GET_PREDECESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER___GET_INCOMING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER___GET_OUTGOING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER___CAN_CONNECT__EDGE_NODE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER___CAN_START__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER___CAN_END__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER___CAN_CONTAIN__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Can Contain Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER___CAN_CONTAIN_NODES__ELIST = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN_NODES__ELIST;

	/**
	 * The operation id for the '<em>Get Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER___GET_CONTAINER_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER___CAN_CONTAIN__ELIST = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Get Containment Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER___GET_CONTAINMENT_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER___GET_INCOMING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER___GET_OUTGOING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Start Node Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER___GET_START_NODE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Feature Container Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER___GET_FEATURE_CONTAINER_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Doc Node Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER___GET_DOC_NODE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get End Node Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER___GET_END_NODE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Feature Container Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER___GET_FEATURE_CONTAINER_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Doc Node Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER___GET_DOC_NODE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 8;

	/**
	 * The number of operations of the '<em>Feature Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_CONTAINER_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 9;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.features.features.internal.impl.InternalDocNodeImpl <em>Doc Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.features.features.internal.impl.InternalDocNodeImpl
	 * @see info.scce.cinco.product.features.features.internal.impl.InternalPackageImpl#getInternalDocNode()
	 * @generated
	 */
	int INTERNAL_DOC_NODE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE__ID = graphmodel.internal.InternalPackage.INTERNAL_NODE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_NODE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE__X = graphmodel.internal.InternalPackage.INTERNAL_NODE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE__Y = graphmodel.internal.InternalPackage.INTERNAL_NODE__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE__HEIGHT = graphmodel.internal.InternalPackage.INTERNAL_NODE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE__WIDTH = graphmodel.internal.InternalPackage.INTERNAL_NODE__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE__INCOMING = graphmodel.internal.InternalPackage.INTERNAL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE__OUTGOING = graphmodel.internal.InternalPackage.INTERNAL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Create Screenshots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE__CREATE_SCREENSHOTS = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Library Component UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE__LIBRARY_COMPONENT_UID = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Doc Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE___SAVE = graphmodel.internal.InternalPackage.INTERNAL_NODE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE___GET_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE___GET_SUCCESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE___GET_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE___GET_PREDECESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE___GET_INCOMING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE___GET_OUTGOING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE___CAN_CONNECT__EDGE_NODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE___CAN_START__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE___CAN_END__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE___GET_INCOMING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE___GET_OUTGOING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Start Node Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE___GET_START_NODE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Feature Container Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE___GET_FEATURE_CONTAINER_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Doc Node Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE___GET_DOC_NODE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get End Node Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE___GET_END_NODE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Feature Container Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE___GET_FEATURE_CONTAINER_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Doc Node Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE___GET_DOC_NODE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Mgl</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE___GET_MGL = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 8;

	/**
	 * The number of operations of the '<em>Doc Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DOC_NODE_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 9;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.features.features.internal.impl.InternalEdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.features.features.internal.impl.InternalEdgeImpl
	 * @see info.scce.cinco.product.features.features.internal.impl.InternalPackageImpl#getInternalEdge()
	 * @generated
	 */
	int INTERNAL_EDGE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EDGE__ID = graphmodel.internal.InternalPackage.INTERNAL_EDGE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EDGE__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_EDGE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EDGE__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE__ELEMENT;

	/**
	 * The feature id for the '<em><b>source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EDGE__SOURCE_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EDGE__TARGET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE__TARGET_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EDGE__BENDPOINTS = graphmodel.internal.InternalPackage.INTERNAL_EDGE__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EDGE__DECORATORS = graphmodel.internal.InternalPackage.INTERNAL_EDGE__DECORATORS;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EDGE_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_EDGE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EDGE___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EDGE___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_EDGE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EDGE___SAVE = graphmodel.internal.InternalPackage.INTERNAL_EDGE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EDGE___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EDGE___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EDGE___GET_SOURCE_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___GET_SOURCE_ELEMENT;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EDGE___GET_TARGET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___GET_TARGET_ELEMENT;

	/**
	 * The operation id for the '<em>Set Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EDGE___SET_SOURCE_ELEMENT__NODE = graphmodel.internal.InternalPackage.INTERNAL_EDGE___SET_SOURCE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Set Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EDGE___SET_TARGET_ELEMENT__NODE = graphmodel.internal.InternalPackage.INTERNAL_EDGE___SET_TARGET_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Add Bendpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EDGE___ADD_BENDPOINT__INT_INT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___ADD_BENDPOINT__INT_INT;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EDGE_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.features.features.internal.impl.InternalLabeledEdgeImpl <em>Labeled Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.features.features.internal.impl.InternalLabeledEdgeImpl
	 * @see info.scce.cinco.product.features.features.internal.impl.InternalPackageImpl#getInternalLabeledEdge()
	 * @generated
	 */
	int INTERNAL_LABELED_EDGE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LABELED_EDGE__ID = graphmodel.internal.InternalPackage.INTERNAL_EDGE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LABELED_EDGE__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_EDGE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LABELED_EDGE__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE__ELEMENT;

	/**
	 * The feature id for the '<em><b>source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LABELED_EDGE__SOURCE_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LABELED_EDGE__TARGET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE__TARGET_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LABELED_EDGE__BENDPOINTS = graphmodel.internal.InternalPackage.INTERNAL_EDGE__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LABELED_EDGE__DECORATORS = graphmodel.internal.InternalPackage.INTERNAL_EDGE__DECORATORS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LABELED_EDGE__LABEL = graphmodel.internal.InternalPackage.INTERNAL_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Labeled Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LABELED_EDGE_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_EDGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LABELED_EDGE___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LABELED_EDGE___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_EDGE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LABELED_EDGE___SAVE = graphmodel.internal.InternalPackage.INTERNAL_EDGE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LABELED_EDGE___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LABELED_EDGE___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LABELED_EDGE___GET_SOURCE_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___GET_SOURCE_ELEMENT;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LABELED_EDGE___GET_TARGET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___GET_TARGET_ELEMENT;

	/**
	 * The operation id for the '<em>Set Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LABELED_EDGE___SET_SOURCE_ELEMENT__NODE = graphmodel.internal.InternalPackage.INTERNAL_EDGE___SET_SOURCE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Set Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LABELED_EDGE___SET_TARGET_ELEMENT__NODE = graphmodel.internal.InternalPackage.INTERNAL_EDGE___SET_TARGET_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Add Bendpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LABELED_EDGE___ADD_BENDPOINT__INT_INT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___ADD_BENDPOINT__INT_INT;

	/**
	 * The number of operations of the '<em>Labeled Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LABELED_EDGE_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.features.features.internal.impl.InternalFeaturesGraphModelImpl <em>Features Graph Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.features.features.internal.impl.InternalFeaturesGraphModelImpl
	 * @see info.scce.cinco.product.features.features.internal.impl.InternalPackageImpl#getInternalFeaturesGraphModel()
	 * @generated
	 */
	int INTERNAL_FEATURES_GRAPH_MODEL = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURES_GRAPH_MODEL__ID = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL__ID;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURES_GRAPH_MODEL__MODEL_ELEMENTS = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURES_GRAPH_MODEL__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL__ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURES_GRAPH_MODEL__NAME = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Features Graph Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURES_GRAPH_MODEL_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURES_GRAPH_MODEL___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURES_GRAPH_MODEL___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURES_GRAPH_MODEL___SAVE = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURES_GRAPH_MODEL___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURES_GRAPH_MODEL___CAN_CONTAIN__ELIST = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURES_GRAPH_MODEL___CAN_CONTAIN__CLASS = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Can Contain Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURES_GRAPH_MODEL___CAN_CONTAIN_NODES__ELIST = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL___CAN_CONTAIN_NODES__ELIST;

	/**
	 * The operation id for the '<em>Get Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURES_GRAPH_MODEL___GET_CONTAINER_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL___GET_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURES_GRAPH_MODEL___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Containment Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURES_GRAPH_MODEL___GET_CONTAINMENT_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Features Graph Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURES_GRAPH_MODEL_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.features.features.internal.InternalStartNode <em>Start Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Node</em>'.
	 * @see info.scce.cinco.product.features.features.internal.InternalStartNode
	 * @generated
	 */
	EClass getInternalStartNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.internal.InternalStartNode#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.features.features.internal.InternalStartNode#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalStartNode__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.internal.InternalStartNode#getEndNodeSuccessors() <em>Get End Node Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get End Node Successors</em>' operation.
	 * @see info.scce.cinco.product.features.features.internal.InternalStartNode#getEndNodeSuccessors()
	 * @generated
	 */
	EOperation getInternalStartNode__GetEndNodeSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.internal.InternalStartNode#getFeatureContainerSuccessors() <em>Get Feature Container Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feature Container Successors</em>' operation.
	 * @see info.scce.cinco.product.features.features.internal.InternalStartNode#getFeatureContainerSuccessors()
	 * @generated
	 */
	EOperation getInternalStartNode__GetFeatureContainerSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.internal.InternalStartNode#getDocNodeSuccessors() <em>Get Doc Node Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Doc Node Successors</em>' operation.
	 * @see info.scce.cinco.product.features.features.internal.InternalStartNode#getDocNodeSuccessors()
	 * @generated
	 */
	EOperation getInternalStartNode__GetDocNodeSuccessors();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.features.features.internal.InternalEndNode <em>End Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Node</em>'.
	 * @see info.scce.cinco.product.features.features.internal.InternalEndNode
	 * @generated
	 */
	EClass getInternalEndNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.internal.InternalEndNode#getIncomingConstraints() <em>Get Incoming Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Constraints</em>' operation.
	 * @see info.scce.cinco.product.features.features.internal.InternalEndNode#getIncomingConstraints()
	 * @generated
	 */
	EOperation getInternalEndNode__GetIncomingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.internal.InternalEndNode#getStartNodePredecessors() <em>Get Start Node Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Start Node Predecessors</em>' operation.
	 * @see info.scce.cinco.product.features.features.internal.InternalEndNode#getStartNodePredecessors()
	 * @generated
	 */
	EOperation getInternalEndNode__GetStartNodePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.internal.InternalEndNode#getFeatureContainerPredecessors() <em>Get Feature Container Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feature Container Predecessors</em>' operation.
	 * @see info.scce.cinco.product.features.features.internal.InternalEndNode#getFeatureContainerPredecessors()
	 * @generated
	 */
	EOperation getInternalEndNode__GetFeatureContainerPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.internal.InternalEndNode#getDocNodePredecessors() <em>Get Doc Node Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Doc Node Predecessors</em>' operation.
	 * @see info.scce.cinco.product.features.features.internal.InternalEndNode#getDocNodePredecessors()
	 * @generated
	 */
	EOperation getInternalEndNode__GetDocNodePredecessors();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.features.features.internal.InternalFeatureContainer <em>Feature Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Container</em>'.
	 * @see info.scce.cinco.product.features.features.internal.InternalFeatureContainer
	 * @generated
	 */
	EClass getInternalFeatureContainer();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.features.features.internal.InternalFeatureContainer#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see info.scce.cinco.product.features.features.internal.InternalFeatureContainer#getTitle()
	 * @see #getInternalFeatureContainer()
	 * @generated
	 */
	EAttribute getInternalFeatureContainer_Title();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.internal.InternalFeatureContainer#getContainmentConstraints() <em>Get Containment Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containment Constraints</em>' operation.
	 * @see info.scce.cinco.product.features.features.internal.InternalFeatureContainer#getContainmentConstraints()
	 * @generated
	 */
	EOperation getInternalFeatureContainer__GetContainmentConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.internal.InternalFeatureContainer#getIncomingConstraints() <em>Get Incoming Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Constraints</em>' operation.
	 * @see info.scce.cinco.product.features.features.internal.InternalFeatureContainer#getIncomingConstraints()
	 * @generated
	 */
	EOperation getInternalFeatureContainer__GetIncomingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.internal.InternalFeatureContainer#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.features.features.internal.InternalFeatureContainer#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalFeatureContainer__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.internal.InternalFeatureContainer#getStartNodePredecessors() <em>Get Start Node Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Start Node Predecessors</em>' operation.
	 * @see info.scce.cinco.product.features.features.internal.InternalFeatureContainer#getStartNodePredecessors()
	 * @generated
	 */
	EOperation getInternalFeatureContainer__GetStartNodePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.internal.InternalFeatureContainer#getFeatureContainerPredecessors() <em>Get Feature Container Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feature Container Predecessors</em>' operation.
	 * @see info.scce.cinco.product.features.features.internal.InternalFeatureContainer#getFeatureContainerPredecessors()
	 * @generated
	 */
	EOperation getInternalFeatureContainer__GetFeatureContainerPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.internal.InternalFeatureContainer#getDocNodePredecessors() <em>Get Doc Node Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Doc Node Predecessors</em>' operation.
	 * @see info.scce.cinco.product.features.features.internal.InternalFeatureContainer#getDocNodePredecessors()
	 * @generated
	 */
	EOperation getInternalFeatureContainer__GetDocNodePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.internal.InternalFeatureContainer#getEndNodeSuccessors() <em>Get End Node Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get End Node Successors</em>' operation.
	 * @see info.scce.cinco.product.features.features.internal.InternalFeatureContainer#getEndNodeSuccessors()
	 * @generated
	 */
	EOperation getInternalFeatureContainer__GetEndNodeSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.internal.InternalFeatureContainer#getFeatureContainerSuccessors() <em>Get Feature Container Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feature Container Successors</em>' operation.
	 * @see info.scce.cinco.product.features.features.internal.InternalFeatureContainer#getFeatureContainerSuccessors()
	 * @generated
	 */
	EOperation getInternalFeatureContainer__GetFeatureContainerSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.internal.InternalFeatureContainer#getDocNodeSuccessors() <em>Get Doc Node Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Doc Node Successors</em>' operation.
	 * @see info.scce.cinco.product.features.features.internal.InternalFeatureContainer#getDocNodeSuccessors()
	 * @generated
	 */
	EOperation getInternalFeatureContainer__GetDocNodeSuccessors();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.features.features.internal.InternalDocNode <em>Doc Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doc Node</em>'.
	 * @see info.scce.cinco.product.features.features.internal.InternalDocNode
	 * @generated
	 */
	EClass getInternalDocNode();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.features.features.internal.InternalDocNode#isCreateScreenshots <em>Create Screenshots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Screenshots</em>'.
	 * @see info.scce.cinco.product.features.features.internal.InternalDocNode#isCreateScreenshots()
	 * @see #getInternalDocNode()
	 * @generated
	 */
	EAttribute getInternalDocNode_CreateScreenshots();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.features.features.internal.InternalDocNode#getLibraryComponentUID <em>Library Component UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library Component UID</em>'.
	 * @see info.scce.cinco.product.features.features.internal.InternalDocNode#getLibraryComponentUID()
	 * @see #getInternalDocNode()
	 * @generated
	 */
	EAttribute getInternalDocNode_LibraryComponentUID();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.internal.InternalDocNode#getIncomingConstraints() <em>Get Incoming Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Constraints</em>' operation.
	 * @see info.scce.cinco.product.features.features.internal.InternalDocNode#getIncomingConstraints()
	 * @generated
	 */
	EOperation getInternalDocNode__GetIncomingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.internal.InternalDocNode#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.features.features.internal.InternalDocNode#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalDocNode__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.internal.InternalDocNode#getStartNodePredecessors() <em>Get Start Node Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Start Node Predecessors</em>' operation.
	 * @see info.scce.cinco.product.features.features.internal.InternalDocNode#getStartNodePredecessors()
	 * @generated
	 */
	EOperation getInternalDocNode__GetStartNodePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.internal.InternalDocNode#getFeatureContainerPredecessors() <em>Get Feature Container Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feature Container Predecessors</em>' operation.
	 * @see info.scce.cinco.product.features.features.internal.InternalDocNode#getFeatureContainerPredecessors()
	 * @generated
	 */
	EOperation getInternalDocNode__GetFeatureContainerPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.internal.InternalDocNode#getDocNodePredecessors() <em>Get Doc Node Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Doc Node Predecessors</em>' operation.
	 * @see info.scce.cinco.product.features.features.internal.InternalDocNode#getDocNodePredecessors()
	 * @generated
	 */
	EOperation getInternalDocNode__GetDocNodePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.internal.InternalDocNode#getEndNodeSuccessors() <em>Get End Node Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get End Node Successors</em>' operation.
	 * @see info.scce.cinco.product.features.features.internal.InternalDocNode#getEndNodeSuccessors()
	 * @generated
	 */
	EOperation getInternalDocNode__GetEndNodeSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.internal.InternalDocNode#getFeatureContainerSuccessors() <em>Get Feature Container Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feature Container Successors</em>' operation.
	 * @see info.scce.cinco.product.features.features.internal.InternalDocNode#getFeatureContainerSuccessors()
	 * @generated
	 */
	EOperation getInternalDocNode__GetFeatureContainerSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.internal.InternalDocNode#getDocNodeSuccessors() <em>Get Doc Node Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Doc Node Successors</em>' operation.
	 * @see info.scce.cinco.product.features.features.internal.InternalDocNode#getDocNodeSuccessors()
	 * @generated
	 */
	EOperation getInternalDocNode__GetDocNodeSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.internal.InternalDocNode#getMgl() <em>Get Mgl</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Mgl</em>' operation.
	 * @see info.scce.cinco.product.features.features.internal.InternalDocNode#getMgl()
	 * @generated
	 */
	EOperation getInternalDocNode__GetMgl();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.features.features.internal.InternalEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see info.scce.cinco.product.features.features.internal.InternalEdge
	 * @generated
	 */
	EClass getInternalEdge();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.features.features.internal.InternalLabeledEdge <em>Labeled Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labeled Edge</em>'.
	 * @see info.scce.cinco.product.features.features.internal.InternalLabeledEdge
	 * @generated
	 */
	EClass getInternalLabeledEdge();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.features.features.internal.InternalLabeledEdge#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see info.scce.cinco.product.features.features.internal.InternalLabeledEdge#getLabel()
	 * @see #getInternalLabeledEdge()
	 * @generated
	 */
	EAttribute getInternalLabeledEdge_Label();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.features.features.internal.InternalFeaturesGraphModel <em>Features Graph Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Features Graph Model</em>'.
	 * @see info.scce.cinco.product.features.features.internal.InternalFeaturesGraphModel
	 * @generated
	 */
	EClass getInternalFeaturesGraphModel();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.features.features.internal.InternalFeaturesGraphModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see info.scce.cinco.product.features.features.internal.InternalFeaturesGraphModel#getName()
	 * @see #getInternalFeaturesGraphModel()
	 * @generated
	 */
	EAttribute getInternalFeaturesGraphModel_Name();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.internal.InternalFeaturesGraphModel#getContainmentConstraints() <em>Get Containment Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containment Constraints</em>' operation.
	 * @see info.scce.cinco.product.features.features.internal.InternalFeaturesGraphModel#getContainmentConstraints()
	 * @generated
	 */
	EOperation getInternalFeaturesGraphModel__GetContainmentConstraints();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InternalFactory getInternalFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.features.features.internal.impl.InternalStartNodeImpl <em>Start Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.features.features.internal.impl.InternalStartNodeImpl
		 * @see info.scce.cinco.product.features.features.internal.impl.InternalPackageImpl#getInternalStartNode()
		 * @generated
		 */
		EClass INTERNAL_START_NODE = eINSTANCE.getInternalStartNode();

		/**
		 * The meta object literal for the '<em><b>Get Outgoing Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_START_NODE___GET_OUTGOING_CONSTRAINTS = eINSTANCE.getInternalStartNode__GetOutgoingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get End Node Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_START_NODE___GET_END_NODE_SUCCESSORS = eINSTANCE.getInternalStartNode__GetEndNodeSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Feature Container Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_START_NODE___GET_FEATURE_CONTAINER_SUCCESSORS = eINSTANCE.getInternalStartNode__GetFeatureContainerSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Doc Node Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_START_NODE___GET_DOC_NODE_SUCCESSORS = eINSTANCE.getInternalStartNode__GetDocNodeSuccessors();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.features.features.internal.impl.InternalEndNodeImpl <em>End Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.features.features.internal.impl.InternalEndNodeImpl
		 * @see info.scce.cinco.product.features.features.internal.impl.InternalPackageImpl#getInternalEndNode()
		 * @generated
		 */
		EClass INTERNAL_END_NODE = eINSTANCE.getInternalEndNode();

		/**
		 * The meta object literal for the '<em><b>Get Incoming Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_END_NODE___GET_INCOMING_CONSTRAINTS = eINSTANCE.getInternalEndNode__GetIncomingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Start Node Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_END_NODE___GET_START_NODE_PREDECESSORS = eINSTANCE.getInternalEndNode__GetStartNodePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Feature Container Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_END_NODE___GET_FEATURE_CONTAINER_PREDECESSORS = eINSTANCE.getInternalEndNode__GetFeatureContainerPredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Doc Node Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_END_NODE___GET_DOC_NODE_PREDECESSORS = eINSTANCE.getInternalEndNode__GetDocNodePredecessors();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.features.features.internal.impl.InternalFeatureContainerImpl <em>Feature Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.features.features.internal.impl.InternalFeatureContainerImpl
		 * @see info.scce.cinco.product.features.features.internal.impl.InternalPackageImpl#getInternalFeatureContainer()
		 * @generated
		 */
		EClass INTERNAL_FEATURE_CONTAINER = eINSTANCE.getInternalFeatureContainer();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_FEATURE_CONTAINER__TITLE = eINSTANCE.getInternalFeatureContainer_Title();

		/**
		 * The meta object literal for the '<em><b>Get Containment Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FEATURE_CONTAINER___GET_CONTAINMENT_CONSTRAINTS = eINSTANCE.getInternalFeatureContainer__GetContainmentConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Incoming Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FEATURE_CONTAINER___GET_INCOMING_CONSTRAINTS = eINSTANCE.getInternalFeatureContainer__GetIncomingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Outgoing Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FEATURE_CONTAINER___GET_OUTGOING_CONSTRAINTS = eINSTANCE.getInternalFeatureContainer__GetOutgoingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Start Node Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FEATURE_CONTAINER___GET_START_NODE_PREDECESSORS = eINSTANCE.getInternalFeatureContainer__GetStartNodePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Feature Container Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FEATURE_CONTAINER___GET_FEATURE_CONTAINER_PREDECESSORS = eINSTANCE.getInternalFeatureContainer__GetFeatureContainerPredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Doc Node Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FEATURE_CONTAINER___GET_DOC_NODE_PREDECESSORS = eINSTANCE.getInternalFeatureContainer__GetDocNodePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get End Node Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FEATURE_CONTAINER___GET_END_NODE_SUCCESSORS = eINSTANCE.getInternalFeatureContainer__GetEndNodeSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Feature Container Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FEATURE_CONTAINER___GET_FEATURE_CONTAINER_SUCCESSORS = eINSTANCE.getInternalFeatureContainer__GetFeatureContainerSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Doc Node Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FEATURE_CONTAINER___GET_DOC_NODE_SUCCESSORS = eINSTANCE.getInternalFeatureContainer__GetDocNodeSuccessors();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.features.features.internal.impl.InternalDocNodeImpl <em>Doc Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.features.features.internal.impl.InternalDocNodeImpl
		 * @see info.scce.cinco.product.features.features.internal.impl.InternalPackageImpl#getInternalDocNode()
		 * @generated
		 */
		EClass INTERNAL_DOC_NODE = eINSTANCE.getInternalDocNode();

		/**
		 * The meta object literal for the '<em><b>Create Screenshots</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_DOC_NODE__CREATE_SCREENSHOTS = eINSTANCE.getInternalDocNode_CreateScreenshots();

		/**
		 * The meta object literal for the '<em><b>Library Component UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_DOC_NODE__LIBRARY_COMPONENT_UID = eINSTANCE.getInternalDocNode_LibraryComponentUID();

		/**
		 * The meta object literal for the '<em><b>Get Incoming Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_DOC_NODE___GET_INCOMING_CONSTRAINTS = eINSTANCE.getInternalDocNode__GetIncomingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Outgoing Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_DOC_NODE___GET_OUTGOING_CONSTRAINTS = eINSTANCE.getInternalDocNode__GetOutgoingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Start Node Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_DOC_NODE___GET_START_NODE_PREDECESSORS = eINSTANCE.getInternalDocNode__GetStartNodePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Feature Container Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_DOC_NODE___GET_FEATURE_CONTAINER_PREDECESSORS = eINSTANCE.getInternalDocNode__GetFeatureContainerPredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Doc Node Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_DOC_NODE___GET_DOC_NODE_PREDECESSORS = eINSTANCE.getInternalDocNode__GetDocNodePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get End Node Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_DOC_NODE___GET_END_NODE_SUCCESSORS = eINSTANCE.getInternalDocNode__GetEndNodeSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Feature Container Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_DOC_NODE___GET_FEATURE_CONTAINER_SUCCESSORS = eINSTANCE.getInternalDocNode__GetFeatureContainerSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Doc Node Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_DOC_NODE___GET_DOC_NODE_SUCCESSORS = eINSTANCE.getInternalDocNode__GetDocNodeSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Mgl</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_DOC_NODE___GET_MGL = eINSTANCE.getInternalDocNode__GetMgl();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.features.features.internal.impl.InternalEdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.features.features.internal.impl.InternalEdgeImpl
		 * @see info.scce.cinco.product.features.features.internal.impl.InternalPackageImpl#getInternalEdge()
		 * @generated
		 */
		EClass INTERNAL_EDGE = eINSTANCE.getInternalEdge();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.features.features.internal.impl.InternalLabeledEdgeImpl <em>Labeled Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.features.features.internal.impl.InternalLabeledEdgeImpl
		 * @see info.scce.cinco.product.features.features.internal.impl.InternalPackageImpl#getInternalLabeledEdge()
		 * @generated
		 */
		EClass INTERNAL_LABELED_EDGE = eINSTANCE.getInternalLabeledEdge();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_LABELED_EDGE__LABEL = eINSTANCE.getInternalLabeledEdge_Label();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.features.features.internal.impl.InternalFeaturesGraphModelImpl <em>Features Graph Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.features.features.internal.impl.InternalFeaturesGraphModelImpl
		 * @see info.scce.cinco.product.features.features.internal.impl.InternalPackageImpl#getInternalFeaturesGraphModel()
		 * @generated
		 */
		EClass INTERNAL_FEATURES_GRAPH_MODEL = eINSTANCE.getInternalFeaturesGraphModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_FEATURES_GRAPH_MODEL__NAME = eINSTANCE.getInternalFeaturesGraphModel_Name();

		/**
		 * The meta object literal for the '<em><b>Get Containment Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FEATURES_GRAPH_MODEL___GET_CONTAINMENT_CONSTRAINTS = eINSTANCE.getInternalFeaturesGraphModel__GetContainmentConstraints();

	}

} //InternalPackage
