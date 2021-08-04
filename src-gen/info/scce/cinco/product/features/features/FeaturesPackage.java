/**
 */
package info.scce.cinco.product.features.features;

import graphmodel.GraphmodelPackage;

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
 * @see info.scce.cinco.product.features.features.FeaturesFactory
 * @model kind="package"
 * @generated
 */
public interface FeaturesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "features";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cinco.scce.info/product/features";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "features";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeaturesPackage eINSTANCE = info.scce.cinco.product.features.features.impl.FeaturesPackageImpl.init();

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.features.features.impl.StartNodeImpl <em>Start Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.features.features.impl.StartNodeImpl
	 * @see info.scce.cinco.product.features.features.impl.FeaturesPackageImpl#getStartNode()
	 * @generated
	 */
	int START_NODE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE__ID = GraphmodelPackage.NODE__ID;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE__INTERNAL_ELEMENT = GraphmodelPackage.NODE__INTERNAL_ELEMENT;

	/**
	 * The number of structural features of the '<em>Start Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE_FEATURE_COUNT = GraphmodelPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___EQUALS__OBJECT = GraphmodelPackage.NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___HASH_CODE = GraphmodelPackage.NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___SAVE = GraphmodelPackage.NODE___SAVE;

	/**
	 * The operation id for the '<em>Get Internal Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___GET_INTERNAL_ELEMENT = GraphmodelPackage.NODE___GET_INTERNAL_ELEMENT;

	/**
	 * The operation id for the '<em>Transact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___TRANSACT__STRING_RUNNABLE = GraphmodelPackage.NODE___TRANSACT__STRING_RUNNABLE;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___GET_CONTAINER = GraphmodelPackage.NODE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Highlight</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___HIGHLIGHT = GraphmodelPackage.NODE___HIGHLIGHT;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___UPDATE = GraphmodelPackage.NODE___UPDATE;

	/**
	 * The operation id for the '<em>Update Graph Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___UPDATE_GRAPH_MODEL = GraphmodelPackage.NODE___UPDATE_GRAPH_MODEL;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___GET_SUCCESSORS__CLASS = GraphmodelPackage.NODE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___GET_PREDECESSORS = GraphmodelPackage.NODE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___GET_PREDECESSORS__CLASS = GraphmodelPackage.NODE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___GET_INCOMING__CLASS = GraphmodelPackage.NODE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___GET_OUTGOING__CLASS = GraphmodelPackage.NODE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___CAN_CONNECT__EDGE_NODE = GraphmodelPackage.NODE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___GET_OUTGOING_CONSTRAINTS = GraphmodelPackage.NODE___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___GET_INCOMING_CONSTRAINTS = GraphmodelPackage.NODE___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___CAN_START__CLASS = GraphmodelPackage.NODE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___CAN_END__CLASS = GraphmodelPackage.NODE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___MOVE__INT_INT = GraphmodelPackage.NODE___MOVE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___RESIZE__INT_INT = GraphmodelPackage.NODE___RESIZE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___RESIZE__INT_INT_INT_INT = GraphmodelPackage.NODE___RESIZE__INT_INT_INT_INT;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___DELETE = GraphmodelPackage.NODE___DELETE;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___CAN_MOVE_TO__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CAN_MOVE_TO__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT;

	/**
	 * The operation id for the '<em>Can Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___CAN_CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CAN_CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Get X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___GET_X = GraphmodelPackage.NODE___GET_X;

	/**
	 * The operation id for the '<em>Get Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___GET_Y = GraphmodelPackage.NODE___GET_Y;

	/**
	 * The operation id for the '<em>Get Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___GET_WIDTH = GraphmodelPackage.NODE___GET_WIDTH;

	/**
	 * The operation id for the '<em>Get Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___GET_HEIGHT = GraphmodelPackage.NODE___GET_HEIGHT;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___COPY__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___COPY__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Set X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___SET_X__INT = GraphmodelPackage.NODE___SET_X__INT;

	/**
	 * The operation id for the '<em>Set Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___SET_Y__INT = GraphmodelPackage.NODE___SET_Y__INT;

	/**
	 * The operation id for the '<em>Set Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___SET_WIDTH__INT = GraphmodelPackage.NODE___SET_WIDTH__INT;

	/**
	 * The operation id for the '<em>Set Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___SET_HEIGHT__INT = GraphmodelPackage.NODE___SET_HEIGHT__INT;

	/**
	 * The operation id for the '<em>Get Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___GET_LAYER = GraphmodelPackage.NODE___GET_LAYER;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___GET_INCOMING = GraphmodelPackage.NODE___GET_INCOMING;

	/**
	 * The operation id for the '<em>Get Untyped Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___GET_UNTYPED_INCOMING = GraphmodelPackage.NODE___GET_UNTYPED_INCOMING;

	/**
	 * The operation id for the '<em>Get Untyped Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___GET_UNTYPED_OUTGOING = GraphmodelPackage.NODE___GET_UNTYPED_OUTGOING;

	/**
	 * The operation id for the '<em>Get Internal Start Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___GET_INTERNAL_START_NODE = GraphmodelPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Exactly Start Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___IS_EXACTLY_START_NODE = GraphmodelPackage.NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Pre Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___PRE_DELETE = GraphmodelPackage.NODE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Post Delete Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___GET_POST_DELETE_FUNCTION = GraphmodelPackage.NODE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Post Delete Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___GET_POST_DELETE_EVENT = GraphmodelPackage.NODE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Pre Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___PRE_SAVE = GraphmodelPackage.NODE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Post Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___POST_SAVE = GraphmodelPackage.NODE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___GET_ROOT_ELEMENT = GraphmodelPackage.NODE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___GET_OUTGOING = GraphmodelPackage.NODE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___GET_SUCCESSORS = GraphmodelPackage.NODE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Pre Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Post Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Pre Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.NODE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Post Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.NODE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Outgoing Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___GET_OUTGOING_EDGES = GraphmodelPackage.NODE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Outgoing Labeled Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___GET_OUTGOING_LABELED_EDGES = GraphmodelPackage.NODE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get End Node Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___GET_END_NODE_SUCCESSORS = GraphmodelPackage.NODE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Get Feature Container Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___GET_FEATURE_CONTAINER_SUCCESSORS = GraphmodelPackage.NODE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Get Doc Node Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___GET_DOC_NODE_SUCCESSORS = GraphmodelPackage.NODE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Can New Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___CAN_NEW_EDGE__DOCNODE = GraphmodelPackage.NODE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>New Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___NEW_EDGE__DOCNODE = GraphmodelPackage.NODE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>New Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___NEW_EDGE__DOCNODE_STRING = GraphmodelPackage.NODE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Can New Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___CAN_NEW_EDGE__FEATURECONTAINER = GraphmodelPackage.NODE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>New Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___NEW_EDGE__FEATURECONTAINER = GraphmodelPackage.NODE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>New Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___NEW_EDGE__FEATURECONTAINER_STRING = GraphmodelPackage.NODE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Can New Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___CAN_NEW_EDGE__ENDNODE = GraphmodelPackage.NODE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>New Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___NEW_EDGE__ENDNODE = GraphmodelPackage.NODE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>New Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___NEW_EDGE__ENDNODE_STRING = GraphmodelPackage.NODE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Can New Labeled Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___CAN_NEW_LABELED_EDGE__DOCNODE = GraphmodelPackage.NODE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>New Labeled Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___NEW_LABELED_EDGE__DOCNODE = GraphmodelPackage.NODE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>New Labeled Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___NEW_LABELED_EDGE__DOCNODE_STRING = GraphmodelPackage.NODE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Can New Labeled Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___CAN_NEW_LABELED_EDGE__FEATURECONTAINER = GraphmodelPackage.NODE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>New Labeled Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___NEW_LABELED_EDGE__FEATURECONTAINER = GraphmodelPackage.NODE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>New Labeled Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___NEW_LABELED_EDGE__FEATURECONTAINER_STRING = GraphmodelPackage.NODE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Can New Labeled Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___CAN_NEW_LABELED_EDGE__ENDNODE = GraphmodelPackage.NODE_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>New Labeled Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___NEW_LABELED_EDGE__ENDNODE = GraphmodelPackage.NODE_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>New Labeled Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___NEW_LABELED_EDGE__ENDNODE_STRING = GraphmodelPackage.NODE_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___CAN_MOVE_TO__FEATURESGRAPHMODEL_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___MOVE_TO__FEATURESGRAPHMODEL_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___SMOVE_TO__FEATURESGRAPHMODEL_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___CAN_MOVE_TO__FEATURECONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___MOVE_TO__FEATURECONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 42;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___SMOVE_TO__FEATURECONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 43;

	/**
	 * The operation id for the '<em>Get Start Node View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE___GET_START_NODE_VIEW = GraphmodelPackage.NODE_OPERATION_COUNT + 44;

	/**
	 * The number of operations of the '<em>Start Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE_OPERATION_COUNT = GraphmodelPackage.NODE_OPERATION_COUNT + 45;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.features.features.impl.EndNodeImpl <em>End Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.features.features.impl.EndNodeImpl
	 * @see info.scce.cinco.product.features.features.impl.FeaturesPackageImpl#getEndNode()
	 * @generated
	 */
	int END_NODE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE__ID = GraphmodelPackage.NODE__ID;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE__INTERNAL_ELEMENT = GraphmodelPackage.NODE__INTERNAL_ELEMENT;

	/**
	 * The number of structural features of the '<em>End Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE_FEATURE_COUNT = GraphmodelPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___EQUALS__OBJECT = GraphmodelPackage.NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___HASH_CODE = GraphmodelPackage.NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___SAVE = GraphmodelPackage.NODE___SAVE;

	/**
	 * The operation id for the '<em>Get Internal Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___GET_INTERNAL_ELEMENT = GraphmodelPackage.NODE___GET_INTERNAL_ELEMENT;

	/**
	 * The operation id for the '<em>Transact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___TRANSACT__STRING_RUNNABLE = GraphmodelPackage.NODE___TRANSACT__STRING_RUNNABLE;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___GET_CONTAINER = GraphmodelPackage.NODE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Highlight</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___HIGHLIGHT = GraphmodelPackage.NODE___HIGHLIGHT;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___UPDATE = GraphmodelPackage.NODE___UPDATE;

	/**
	 * The operation id for the '<em>Update Graph Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___UPDATE_GRAPH_MODEL = GraphmodelPackage.NODE___UPDATE_GRAPH_MODEL;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___GET_SUCCESSORS = GraphmodelPackage.NODE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___GET_SUCCESSORS__CLASS = GraphmodelPackage.NODE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___GET_PREDECESSORS__CLASS = GraphmodelPackage.NODE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___GET_INCOMING__CLASS = GraphmodelPackage.NODE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___GET_OUTGOING__CLASS = GraphmodelPackage.NODE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___CAN_CONNECT__EDGE_NODE = GraphmodelPackage.NODE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___GET_OUTGOING_CONSTRAINTS = GraphmodelPackage.NODE___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___GET_INCOMING_CONSTRAINTS = GraphmodelPackage.NODE___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___CAN_START__CLASS = GraphmodelPackage.NODE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___CAN_END__CLASS = GraphmodelPackage.NODE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___MOVE__INT_INT = GraphmodelPackage.NODE___MOVE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___RESIZE__INT_INT = GraphmodelPackage.NODE___RESIZE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___RESIZE__INT_INT_INT_INT = GraphmodelPackage.NODE___RESIZE__INT_INT_INT_INT;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___DELETE = GraphmodelPackage.NODE___DELETE;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___CAN_MOVE_TO__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CAN_MOVE_TO__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT;

	/**
	 * The operation id for the '<em>Can Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___CAN_CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CAN_CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Get X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___GET_X = GraphmodelPackage.NODE___GET_X;

	/**
	 * The operation id for the '<em>Get Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___GET_Y = GraphmodelPackage.NODE___GET_Y;

	/**
	 * The operation id for the '<em>Get Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___GET_WIDTH = GraphmodelPackage.NODE___GET_WIDTH;

	/**
	 * The operation id for the '<em>Get Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___GET_HEIGHT = GraphmodelPackage.NODE___GET_HEIGHT;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___COPY__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___COPY__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Set X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___SET_X__INT = GraphmodelPackage.NODE___SET_X__INT;

	/**
	 * The operation id for the '<em>Set Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___SET_Y__INT = GraphmodelPackage.NODE___SET_Y__INT;

	/**
	 * The operation id for the '<em>Set Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___SET_WIDTH__INT = GraphmodelPackage.NODE___SET_WIDTH__INT;

	/**
	 * The operation id for the '<em>Set Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___SET_HEIGHT__INT = GraphmodelPackage.NODE___SET_HEIGHT__INT;

	/**
	 * The operation id for the '<em>Get Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___GET_LAYER = GraphmodelPackage.NODE___GET_LAYER;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___GET_OUTGOING = GraphmodelPackage.NODE___GET_OUTGOING;

	/**
	 * The operation id for the '<em>Get Untyped Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___GET_UNTYPED_INCOMING = GraphmodelPackage.NODE___GET_UNTYPED_INCOMING;

	/**
	 * The operation id for the '<em>Get Untyped Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___GET_UNTYPED_OUTGOING = GraphmodelPackage.NODE___GET_UNTYPED_OUTGOING;

	/**
	 * The operation id for the '<em>Get Internal End Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___GET_INTERNAL_END_NODE = GraphmodelPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Exactly End Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___IS_EXACTLY_END_NODE = GraphmodelPackage.NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Pre Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___PRE_DELETE = GraphmodelPackage.NODE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Post Delete Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___GET_POST_DELETE_FUNCTION = GraphmodelPackage.NODE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Post Delete Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___GET_POST_DELETE_EVENT = GraphmodelPackage.NODE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Pre Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___PRE_SAVE = GraphmodelPackage.NODE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Post Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___POST_SAVE = GraphmodelPackage.NODE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___GET_ROOT_ELEMENT = GraphmodelPackage.NODE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___GET_INCOMING = GraphmodelPackage.NODE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___GET_PREDECESSORS = GraphmodelPackage.NODE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Pre Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Post Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Pre Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.NODE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Post Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.NODE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Incoming Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___GET_INCOMING_EDGES = GraphmodelPackage.NODE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Incoming Labeled Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___GET_INCOMING_LABELED_EDGES = GraphmodelPackage.NODE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Start Node Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___GET_START_NODE_PREDECESSORS = GraphmodelPackage.NODE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Get Feature Container Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___GET_FEATURE_CONTAINER_PREDECESSORS = GraphmodelPackage.NODE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Get Doc Node Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___GET_DOC_NODE_PREDECESSORS = GraphmodelPackage.NODE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___CAN_MOVE_TO__FEATURESGRAPHMODEL_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___MOVE_TO__FEATURESGRAPHMODEL_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___SMOVE_TO__FEATURESGRAPHMODEL_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___CAN_MOVE_TO__FEATURECONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___MOVE_TO__FEATURECONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___SMOVE_TO__FEATURECONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Get End Node View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE___GET_END_NODE_VIEW = GraphmodelPackage.NODE_OPERATION_COUNT + 26;

	/**
	 * The number of operations of the '<em>End Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE_OPERATION_COUNT = GraphmodelPackage.NODE_OPERATION_COUNT + 27;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.features.features.impl.FeatureContainerImpl <em>Feature Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.features.features.impl.FeatureContainerImpl
	 * @see info.scce.cinco.product.features.features.impl.FeaturesPackageImpl#getFeatureContainer()
	 * @generated
	 */
	int FEATURE_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER__ID = GraphmodelPackage.CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER__INTERNAL_ELEMENT = GraphmodelPackage.CONTAINER__INTERNAL_ELEMENT;

	/**
	 * The number of structural features of the '<em>Feature Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER_FEATURE_COUNT = GraphmodelPackage.CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___EQUALS__OBJECT = GraphmodelPackage.CONTAINER___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___HASH_CODE = GraphmodelPackage.CONTAINER___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___SAVE = GraphmodelPackage.CONTAINER___SAVE;

	/**
	 * The operation id for the '<em>Get Internal Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_INTERNAL_ELEMENT = GraphmodelPackage.CONTAINER___GET_INTERNAL_ELEMENT;

	/**
	 * The operation id for the '<em>Transact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___TRANSACT__STRING_RUNNABLE = GraphmodelPackage.CONTAINER___TRANSACT__STRING_RUNNABLE;

	/**
	 * The operation id for the '<em>Get Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_MODEL_ELEMENTS__CLASS = GraphmodelPackage.CONTAINER___GET_MODEL_ELEMENTS__CLASS;

	/**
	 * The operation id for the '<em>Get All Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_ALL_NODES = GraphmodelPackage.CONTAINER___GET_ALL_NODES;

	/**
	 * The operation id for the '<em>Get All Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_ALL_EDGES = GraphmodelPackage.CONTAINER___GET_ALL_EDGES;

	/**
	 * The operation id for the '<em>Get All Containers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_ALL_CONTAINERS = GraphmodelPackage.CONTAINER___GET_ALL_CONTAINERS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___CAN_CONTAIN__ELIST = GraphmodelPackage.CONTAINER___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___CAN_CONTAIN__CLASS = GraphmodelPackage.CONTAINER___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Get Containable Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_CONTAINABLE_TYPES = GraphmodelPackage.CONTAINER___GET_CONTAINABLE_TYPES;

	/**
	 * The operation id for the '<em>Get Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_MODEL_ELEMENTS = GraphmodelPackage.CONTAINER___GET_MODEL_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_EDGES__CLASS = GraphmodelPackage.CONTAINER___GET_EDGES__CLASS;

	/**
	 * The operation id for the '<em>Get Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_NODES__CLASS = GraphmodelPackage.CONTAINER___GET_NODES__CLASS;

	/**
	 * The operation id for the '<em>Update Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___UPDATE_MODEL_ELEMENTS = GraphmodelPackage.CONTAINER___UPDATE_MODEL_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_CONTAINER = GraphmodelPackage.CONTAINER___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Highlight</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___HIGHLIGHT = GraphmodelPackage.CONTAINER___HIGHLIGHT;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___UPDATE = GraphmodelPackage.CONTAINER___UPDATE;

	/**
	 * The operation id for the '<em>Update Graph Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___UPDATE_GRAPH_MODEL = GraphmodelPackage.CONTAINER___UPDATE_GRAPH_MODEL;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_SUCCESSORS__CLASS = GraphmodelPackage.CONTAINER___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_PREDECESSORS__CLASS = GraphmodelPackage.CONTAINER___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_INCOMING__CLASS = GraphmodelPackage.CONTAINER___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_OUTGOING__CLASS = GraphmodelPackage.CONTAINER___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___CAN_CONNECT__EDGE_NODE = GraphmodelPackage.CONTAINER___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_OUTGOING_CONSTRAINTS = GraphmodelPackage.CONTAINER___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_INCOMING_CONSTRAINTS = GraphmodelPackage.CONTAINER___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___CAN_START__CLASS = GraphmodelPackage.CONTAINER___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___CAN_END__CLASS = GraphmodelPackage.CONTAINER___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___MOVE__INT_INT = GraphmodelPackage.CONTAINER___MOVE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___RESIZE__INT_INT = GraphmodelPackage.CONTAINER___RESIZE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___RESIZE__INT_INT_INT_INT = GraphmodelPackage.CONTAINER___RESIZE__INT_INT_INT_INT;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___CAN_MOVE_TO__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___CAN_MOVE_TO__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___MOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.CONTAINER___MOVE_TO__MODELELEMENTCONTAINER_INT_INT;

	/**
	 * The operation id for the '<em>Can Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___CAN_CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___CAN_CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Get X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_X = GraphmodelPackage.CONTAINER___GET_X;

	/**
	 * The operation id for the '<em>Get Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_Y = GraphmodelPackage.CONTAINER___GET_Y;

	/**
	 * The operation id for the '<em>Get Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_WIDTH = GraphmodelPackage.CONTAINER___GET_WIDTH;

	/**
	 * The operation id for the '<em>Get Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_HEIGHT = GraphmodelPackage.CONTAINER___GET_HEIGHT;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___COPY__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___COPY__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Set X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___SET_X__INT = GraphmodelPackage.CONTAINER___SET_X__INT;

	/**
	 * The operation id for the '<em>Set Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___SET_Y__INT = GraphmodelPackage.CONTAINER___SET_Y__INT;

	/**
	 * The operation id for the '<em>Set Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___SET_WIDTH__INT = GraphmodelPackage.CONTAINER___SET_WIDTH__INT;

	/**
	 * The operation id for the '<em>Set Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___SET_HEIGHT__INT = GraphmodelPackage.CONTAINER___SET_HEIGHT__INT;

	/**
	 * The operation id for the '<em>Get Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_LAYER = GraphmodelPackage.CONTAINER___GET_LAYER;

	/**
	 * The operation id for the '<em>Get Untyped Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_UNTYPED_INCOMING = GraphmodelPackage.CONTAINER___GET_UNTYPED_INCOMING;

	/**
	 * The operation id for the '<em>Get Untyped Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_UNTYPED_OUTGOING = GraphmodelPackage.CONTAINER___GET_UNTYPED_OUTGOING;

	/**
	 * The operation id for the '<em>Get Internal Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_INTERNAL_CONTAINER_ELEMENT = GraphmodelPackage.CONTAINER___GET_INTERNAL_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___DELETE = GraphmodelPackage.CONTAINER___DELETE;

	/**
	 * The operation id for the '<em>Get Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_TITLE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___SET_TITLE__STRING = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Internal Feature Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_INTERNAL_FEATURE_CONTAINER = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Exactly Feature Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___IS_EXACTLY_FEATURE_CONTAINER = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Pre Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___PRE_DELETE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Post Delete Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_POST_DELETE_FUNCTION = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Post Delete Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_POST_DELETE_EVENT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Pre Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___PRE_SAVE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Post Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___POST_SAVE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_ROOT_ELEMENT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_NODES = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Start Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_START_NODES = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Can New Start Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___CAN_NEW_START_NODE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>New Start Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___NEW_START_NODE__INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>New Start Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___NEW_START_NODE__STRING_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>New Start Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___NEW_START_NODE__INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>New Start Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___NEW_START_NODE__STRING_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Doc Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_DOC_NODES = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Can New Doc Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___CAN_NEW_DOC_NODE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>New Doc Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___NEW_DOC_NODE__EOBJECT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>New Doc Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___NEW_DOC_NODE__EOBJECT_STRING_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>New Doc Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___NEW_DOC_NODE__EOBJECT_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>New Doc Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___NEW_DOC_NODE__EOBJECT_STRING_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Get Feature Containers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_FEATURE_CONTAINERS = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Can New Feature Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___CAN_NEW_FEATURE_CONTAINER = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>New Feature Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___NEW_FEATURE_CONTAINER__INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>New Feature Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___NEW_FEATURE_CONTAINER__STRING_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>New Feature Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___NEW_FEATURE_CONTAINER__INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>New Feature Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___NEW_FEATURE_CONTAINER__STRING_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Get End Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_END_NODES = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Can New End Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___CAN_NEW_END_NODE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>New End Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___NEW_END_NODE__INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>New End Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___NEW_END_NODE__STRING_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>New End Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___NEW_END_NODE__INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>New End Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___NEW_END_NODE__STRING_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_OUTGOING = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_SUCCESSORS = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_INCOMING = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_PREDECESSORS = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Pre Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Post Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Pre Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___PRE_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 42;

	/**
	 * The operation id for the '<em>Post Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___POST_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 43;

	/**
	 * The operation id for the '<em>Get Outgoing Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_OUTGOING_EDGES = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 44;

	/**
	 * The operation id for the '<em>Get Outgoing Labeled Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_OUTGOING_LABELED_EDGES = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 45;

	/**
	 * The operation id for the '<em>Get Incoming Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_INCOMING_EDGES = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 46;

	/**
	 * The operation id for the '<em>Get Incoming Labeled Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_INCOMING_LABELED_EDGES = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 47;

	/**
	 * The operation id for the '<em>Get Start Node Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_START_NODE_PREDECESSORS = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 48;

	/**
	 * The operation id for the '<em>Get Feature Container Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_FEATURE_CONTAINER_PREDECESSORS = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 49;

	/**
	 * The operation id for the '<em>Get Doc Node Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_DOC_NODE_PREDECESSORS = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 50;

	/**
	 * The operation id for the '<em>Get End Node Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_END_NODE_SUCCESSORS = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 51;

	/**
	 * The operation id for the '<em>Get Feature Container Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_FEATURE_CONTAINER_SUCCESSORS = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 52;

	/**
	 * The operation id for the '<em>Get Doc Node Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_DOC_NODE_SUCCESSORS = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 53;

	/**
	 * The operation id for the '<em>Can New Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___CAN_NEW_EDGE__DOCNODE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 54;

	/**
	 * The operation id for the '<em>New Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___NEW_EDGE__DOCNODE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 55;

	/**
	 * The operation id for the '<em>New Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___NEW_EDGE__DOCNODE_STRING = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 56;

	/**
	 * The operation id for the '<em>Can New Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___CAN_NEW_EDGE__FEATURECONTAINER = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 57;

	/**
	 * The operation id for the '<em>New Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___NEW_EDGE__FEATURECONTAINER = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 58;

	/**
	 * The operation id for the '<em>New Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___NEW_EDGE__FEATURECONTAINER_STRING = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 59;

	/**
	 * The operation id for the '<em>Can New Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___CAN_NEW_EDGE__ENDNODE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 60;

	/**
	 * The operation id for the '<em>New Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___NEW_EDGE__ENDNODE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 61;

	/**
	 * The operation id for the '<em>New Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___NEW_EDGE__ENDNODE_STRING = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 62;

	/**
	 * The operation id for the '<em>Can New Labeled Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___CAN_NEW_LABELED_EDGE__DOCNODE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 63;

	/**
	 * The operation id for the '<em>New Labeled Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___NEW_LABELED_EDGE__DOCNODE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 64;

	/**
	 * The operation id for the '<em>New Labeled Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___NEW_LABELED_EDGE__DOCNODE_STRING = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 65;

	/**
	 * The operation id for the '<em>Can New Labeled Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___CAN_NEW_LABELED_EDGE__FEATURECONTAINER = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 66;

	/**
	 * The operation id for the '<em>New Labeled Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___NEW_LABELED_EDGE__FEATURECONTAINER = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 67;

	/**
	 * The operation id for the '<em>New Labeled Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___NEW_LABELED_EDGE__FEATURECONTAINER_STRING = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 68;

	/**
	 * The operation id for the '<em>Can New Labeled Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___CAN_NEW_LABELED_EDGE__ENDNODE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 69;

	/**
	 * The operation id for the '<em>New Labeled Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___NEW_LABELED_EDGE__ENDNODE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 70;

	/**
	 * The operation id for the '<em>New Labeled Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___NEW_LABELED_EDGE__ENDNODE_STRING = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 71;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___CAN_MOVE_TO__FEATURESGRAPHMODEL_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 72;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___MOVE_TO__FEATURESGRAPHMODEL_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 73;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___SMOVE_TO__FEATURESGRAPHMODEL_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 74;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___CAN_MOVE_TO__FEATURECONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 75;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___MOVE_TO__FEATURECONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 76;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___SMOVE_TO__FEATURECONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 77;

	/**
	 * The operation id for the '<em>Get Feature Container View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER___GET_FEATURE_CONTAINER_VIEW = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 78;

	/**
	 * The number of operations of the '<em>Feature Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTAINER_OPERATION_COUNT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 79;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.features.features.impl.DocNodeImpl <em>Doc Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.features.features.impl.DocNodeImpl
	 * @see info.scce.cinco.product.features.features.impl.FeaturesPackageImpl#getDocNode()
	 * @generated
	 */
	int DOC_NODE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE__ID = GraphmodelPackage.NODE__ID;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE__INTERNAL_ELEMENT = GraphmodelPackage.NODE__INTERNAL_ELEMENT;

	/**
	 * The number of structural features of the '<em>Doc Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE_FEATURE_COUNT = GraphmodelPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___EQUALS__OBJECT = GraphmodelPackage.NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___HASH_CODE = GraphmodelPackage.NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___SAVE = GraphmodelPackage.NODE___SAVE;

	/**
	 * The operation id for the '<em>Get Internal Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_INTERNAL_ELEMENT = GraphmodelPackage.NODE___GET_INTERNAL_ELEMENT;

	/**
	 * The operation id for the '<em>Transact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___TRANSACT__STRING_RUNNABLE = GraphmodelPackage.NODE___TRANSACT__STRING_RUNNABLE;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_CONTAINER = GraphmodelPackage.NODE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Highlight</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___HIGHLIGHT = GraphmodelPackage.NODE___HIGHLIGHT;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___UPDATE = GraphmodelPackage.NODE___UPDATE;

	/**
	 * The operation id for the '<em>Update Graph Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___UPDATE_GRAPH_MODEL = GraphmodelPackage.NODE___UPDATE_GRAPH_MODEL;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_SUCCESSORS__CLASS = GraphmodelPackage.NODE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_PREDECESSORS__CLASS = GraphmodelPackage.NODE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_INCOMING__CLASS = GraphmodelPackage.NODE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_OUTGOING__CLASS = GraphmodelPackage.NODE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___CAN_CONNECT__EDGE_NODE = GraphmodelPackage.NODE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_OUTGOING_CONSTRAINTS = GraphmodelPackage.NODE___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_INCOMING_CONSTRAINTS = GraphmodelPackage.NODE___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___CAN_START__CLASS = GraphmodelPackage.NODE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___CAN_END__CLASS = GraphmodelPackage.NODE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___MOVE__INT_INT = GraphmodelPackage.NODE___MOVE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___RESIZE__INT_INT = GraphmodelPackage.NODE___RESIZE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___RESIZE__INT_INT_INT_INT = GraphmodelPackage.NODE___RESIZE__INT_INT_INT_INT;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___DELETE = GraphmodelPackage.NODE___DELETE;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___CAN_MOVE_TO__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CAN_MOVE_TO__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT;

	/**
	 * The operation id for the '<em>Can Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___CAN_CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CAN_CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Get X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_X = GraphmodelPackage.NODE___GET_X;

	/**
	 * The operation id for the '<em>Get Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_Y = GraphmodelPackage.NODE___GET_Y;

	/**
	 * The operation id for the '<em>Get Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_WIDTH = GraphmodelPackage.NODE___GET_WIDTH;

	/**
	 * The operation id for the '<em>Get Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_HEIGHT = GraphmodelPackage.NODE___GET_HEIGHT;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___COPY__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___COPY__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Set X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___SET_X__INT = GraphmodelPackage.NODE___SET_X__INT;

	/**
	 * The operation id for the '<em>Set Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___SET_Y__INT = GraphmodelPackage.NODE___SET_Y__INT;

	/**
	 * The operation id for the '<em>Set Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___SET_WIDTH__INT = GraphmodelPackage.NODE___SET_WIDTH__INT;

	/**
	 * The operation id for the '<em>Set Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___SET_HEIGHT__INT = GraphmodelPackage.NODE___SET_HEIGHT__INT;

	/**
	 * The operation id for the '<em>Get Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_LAYER = GraphmodelPackage.NODE___GET_LAYER;

	/**
	 * The operation id for the '<em>Get Untyped Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_UNTYPED_INCOMING = GraphmodelPackage.NODE___GET_UNTYPED_INCOMING;

	/**
	 * The operation id for the '<em>Get Untyped Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_UNTYPED_OUTGOING = GraphmodelPackage.NODE___GET_UNTYPED_OUTGOING;

	/**
	 * The operation id for the '<em>Is Create Screenshots</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___IS_CREATE_SCREENSHOTS = GraphmodelPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Create Screenshots</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___SET_CREATE_SCREENSHOTS__BOOLEAN = GraphmodelPackage.NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Internal Doc Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_INTERNAL_DOC_NODE = GraphmodelPackage.NODE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Exactly Doc Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___IS_EXACTLY_DOC_NODE = GraphmodelPackage.NODE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Pre Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___PRE_DELETE = GraphmodelPackage.NODE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Post Delete Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_POST_DELETE_FUNCTION = GraphmodelPackage.NODE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Post Delete Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_POST_DELETE_EVENT = GraphmodelPackage.NODE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Pre Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___PRE_SAVE = GraphmodelPackage.NODE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Post Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___POST_SAVE = GraphmodelPackage.NODE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_ROOT_ELEMENT = GraphmodelPackage.NODE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_OUTGOING = GraphmodelPackage.NODE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_SUCCESSORS = GraphmodelPackage.NODE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_INCOMING = GraphmodelPackage.NODE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_PREDECESSORS = GraphmodelPackage.NODE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Pre Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Post Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Pre Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.NODE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Post Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.NODE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Get Outgoing Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_OUTGOING_EDGES = GraphmodelPackage.NODE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Get Outgoing Labeled Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_OUTGOING_LABELED_EDGES = GraphmodelPackage.NODE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Get Incoming Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_INCOMING_EDGES = GraphmodelPackage.NODE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Get Incoming Labeled Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_INCOMING_LABELED_EDGES = GraphmodelPackage.NODE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Get Start Node Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_START_NODE_PREDECESSORS = GraphmodelPackage.NODE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Get Feature Container Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_FEATURE_CONTAINER_PREDECESSORS = GraphmodelPackage.NODE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Get Doc Node Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_DOC_NODE_PREDECESSORS = GraphmodelPackage.NODE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Get End Node Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_END_NODE_SUCCESSORS = GraphmodelPackage.NODE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Get Feature Container Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_FEATURE_CONTAINER_SUCCESSORS = GraphmodelPackage.NODE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Get Doc Node Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_DOC_NODE_SUCCESSORS = GraphmodelPackage.NODE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Can New Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___CAN_NEW_EDGE__DOCNODE = GraphmodelPackage.NODE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>New Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___NEW_EDGE__DOCNODE = GraphmodelPackage.NODE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>New Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___NEW_EDGE__DOCNODE_STRING = GraphmodelPackage.NODE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Can New Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___CAN_NEW_EDGE__FEATURECONTAINER = GraphmodelPackage.NODE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>New Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___NEW_EDGE__FEATURECONTAINER = GraphmodelPackage.NODE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>New Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___NEW_EDGE__FEATURECONTAINER_STRING = GraphmodelPackage.NODE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Can New Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___CAN_NEW_EDGE__ENDNODE = GraphmodelPackage.NODE_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>New Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___NEW_EDGE__ENDNODE = GraphmodelPackage.NODE_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>New Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___NEW_EDGE__ENDNODE_STRING = GraphmodelPackage.NODE_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Can New Labeled Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___CAN_NEW_LABELED_EDGE__DOCNODE = GraphmodelPackage.NODE_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>New Labeled Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___NEW_LABELED_EDGE__DOCNODE = GraphmodelPackage.NODE_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>New Labeled Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___NEW_LABELED_EDGE__DOCNODE_STRING = GraphmodelPackage.NODE_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Can New Labeled Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___CAN_NEW_LABELED_EDGE__FEATURECONTAINER = GraphmodelPackage.NODE_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>New Labeled Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___NEW_LABELED_EDGE__FEATURECONTAINER = GraphmodelPackage.NODE_OPERATION_COUNT + 42;

	/**
	 * The operation id for the '<em>New Labeled Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___NEW_LABELED_EDGE__FEATURECONTAINER_STRING = GraphmodelPackage.NODE_OPERATION_COUNT + 43;

	/**
	 * The operation id for the '<em>Can New Labeled Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___CAN_NEW_LABELED_EDGE__ENDNODE = GraphmodelPackage.NODE_OPERATION_COUNT + 44;

	/**
	 * The operation id for the '<em>New Labeled Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___NEW_LABELED_EDGE__ENDNODE = GraphmodelPackage.NODE_OPERATION_COUNT + 45;

	/**
	 * The operation id for the '<em>New Labeled Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___NEW_LABELED_EDGE__ENDNODE_STRING = GraphmodelPackage.NODE_OPERATION_COUNT + 46;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___CAN_MOVE_TO__FEATURESGRAPHMODEL_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 47;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___MOVE_TO__FEATURESGRAPHMODEL_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 48;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___SMOVE_TO__FEATURESGRAPHMODEL_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 49;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___CAN_MOVE_TO__FEATURECONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 50;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___MOVE_TO__FEATURECONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 51;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___SMOVE_TO__FEATURECONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 52;

	/**
	 * The operation id for the '<em>Get Mgl</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_MGL = GraphmodelPackage.NODE_OPERATION_COUNT + 53;

	/**
	 * The operation id for the '<em>Get Library Component UID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_LIBRARY_COMPONENT_UID = GraphmodelPackage.NODE_OPERATION_COUNT + 54;

	/**
	 * The operation id for the '<em>Set Library Component UID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___SET_LIBRARY_COMPONENT_UID__STRING = GraphmodelPackage.NODE_OPERATION_COUNT + 55;

	/**
	 * The operation id for the '<em>Get Doc Node View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE___GET_DOC_NODE_VIEW = GraphmodelPackage.NODE_OPERATION_COUNT + 56;

	/**
	 * The number of operations of the '<em>Doc Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_NODE_OPERATION_COUNT = GraphmodelPackage.NODE_OPERATION_COUNT + 57;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.features.features.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.features.features.impl.EdgeImpl
	 * @see info.scce.cinco.product.features.features.impl.FeaturesPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ID = GraphmodelPackage.EDGE__ID;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__INTERNAL_ELEMENT = GraphmodelPackage.EDGE__INTERNAL_ELEMENT;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = GraphmodelPackage.EDGE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___EQUALS__OBJECT = GraphmodelPackage.EDGE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___HASH_CODE = GraphmodelPackage.EDGE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___SAVE = GraphmodelPackage.EDGE___SAVE;

	/**
	 * The operation id for the '<em>Get Internal Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___GET_INTERNAL_ELEMENT = GraphmodelPackage.EDGE___GET_INTERNAL_ELEMENT;

	/**
	 * The operation id for the '<em>Transact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___TRANSACT__STRING_RUNNABLE = GraphmodelPackage.EDGE___TRANSACT__STRING_RUNNABLE;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___GET_CONTAINER = GraphmodelPackage.EDGE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Highlight</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___HIGHLIGHT = GraphmodelPackage.EDGE___HIGHLIGHT;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___UPDATE = GraphmodelPackage.EDGE___UPDATE;

	/**
	 * The operation id for the '<em>Update Graph Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___UPDATE_GRAPH_MODEL = GraphmodelPackage.EDGE___UPDATE_GRAPH_MODEL;

	/**
	 * The operation id for the '<em>Set Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___SET_SOURCE_ELEMENT__NODE = GraphmodelPackage.EDGE___SET_SOURCE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Set Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___SET_TARGET_ELEMENT__NODE = GraphmodelPackage.EDGE___SET_TARGET_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___DELETE = GraphmodelPackage.EDGE___DELETE;

	/**
	 * The operation id for the '<em>Can Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___CAN_CLONE__NODE_NODE = GraphmodelPackage.EDGE___CAN_CLONE__NODE_NODE;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___CLONE__NODE_NODE = GraphmodelPackage.EDGE___CLONE__NODE_NODE;

	/**
	 * The operation id for the '<em>Reconnect Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___RECONNECT_SOURCE__NODE = GraphmodelPackage.EDGE___RECONNECT_SOURCE__NODE;

	/**
	 * The operation id for the '<em>Reconnect Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___RECONNECT_TARGET__NODE = GraphmodelPackage.EDGE___RECONNECT_TARGET__NODE;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___COPY__NODE_NODE = GraphmodelPackage.EDGE___COPY__NODE_NODE;

	/**
	 * The operation id for the '<em>Add Bendpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___ADD_BENDPOINT__INT_INT = GraphmodelPackage.EDGE___ADD_BENDPOINT__INT_INT;

	/**
	 * The operation id for the '<em>Get Internal Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___GET_INTERNAL_EDGE = GraphmodelPackage.EDGE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Exactly Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___IS_EXACTLY_EDGE = GraphmodelPackage.EDGE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Pre Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___PRE_DELETE = GraphmodelPackage.EDGE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Post Delete Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___GET_POST_DELETE_FUNCTION = GraphmodelPackage.EDGE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Post Delete Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___GET_POST_DELETE_EVENT = GraphmodelPackage.EDGE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Pre Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___PRE_SAVE = GraphmodelPackage.EDGE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Post Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___POST_SAVE = GraphmodelPackage.EDGE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___GET_ROOT_ELEMENT = GraphmodelPackage.EDGE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___GET_SOURCE_ELEMENT = GraphmodelPackage.EDGE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___GET_TARGET_ELEMENT = GraphmodelPackage.EDGE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Can Reconnect Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___CAN_RECONNECT_SOURCE__STARTNODE = GraphmodelPackage.EDGE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Reconnect Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___RECONNECT_SOURCE__STARTNODE = GraphmodelPackage.EDGE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Can Reconnect Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___CAN_RECONNECT_SOURCE__FEATURECONTAINER = GraphmodelPackage.EDGE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Reconnect Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___RECONNECT_SOURCE__FEATURECONTAINER = GraphmodelPackage.EDGE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Can Reconnect Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___CAN_RECONNECT_SOURCE__DOCNODE = GraphmodelPackage.EDGE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Reconnect Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___RECONNECT_SOURCE__DOCNODE = GraphmodelPackage.EDGE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Can Reconnect Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___CAN_RECONNECT_TARGET__DOCNODE = GraphmodelPackage.EDGE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Reconnect Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___RECONNECT_TARGET__DOCNODE = GraphmodelPackage.EDGE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Can Reconnect Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___CAN_RECONNECT_TARGET__FEATURECONTAINER = GraphmodelPackage.EDGE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Reconnect Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___RECONNECT_TARGET__FEATURECONTAINER = GraphmodelPackage.EDGE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Can Reconnect Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___CAN_RECONNECT_TARGET__ENDNODE = GraphmodelPackage.EDGE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Reconnect Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___RECONNECT_TARGET__ENDNODE = GraphmodelPackage.EDGE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Get Edge View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___GET_EDGE_VIEW = GraphmodelPackage.EDGE_OPERATION_COUNT + 22;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = GraphmodelPackage.EDGE_OPERATION_COUNT + 23;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.features.features.impl.LabeledEdgeImpl <em>Labeled Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.features.features.impl.LabeledEdgeImpl
	 * @see info.scce.cinco.product.features.features.impl.FeaturesPackageImpl#getLabeledEdge()
	 * @generated
	 */
	int LABELED_EDGE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE__ID = GraphmodelPackage.EDGE__ID;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE__INTERNAL_ELEMENT = GraphmodelPackage.EDGE__INTERNAL_ELEMENT;

	/**
	 * The number of structural features of the '<em>Labeled Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE_FEATURE_COUNT = GraphmodelPackage.EDGE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___EQUALS__OBJECT = GraphmodelPackage.EDGE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___HASH_CODE = GraphmodelPackage.EDGE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___SAVE = GraphmodelPackage.EDGE___SAVE;

	/**
	 * The operation id for the '<em>Get Internal Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___GET_INTERNAL_ELEMENT = GraphmodelPackage.EDGE___GET_INTERNAL_ELEMENT;

	/**
	 * The operation id for the '<em>Transact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___TRANSACT__STRING_RUNNABLE = GraphmodelPackage.EDGE___TRANSACT__STRING_RUNNABLE;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___GET_CONTAINER = GraphmodelPackage.EDGE___GET_CONTAINER;

	/**
	 * The operation id for the '<em>Highlight</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___HIGHLIGHT = GraphmodelPackage.EDGE___HIGHLIGHT;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___UPDATE = GraphmodelPackage.EDGE___UPDATE;

	/**
	 * The operation id for the '<em>Update Graph Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___UPDATE_GRAPH_MODEL = GraphmodelPackage.EDGE___UPDATE_GRAPH_MODEL;

	/**
	 * The operation id for the '<em>Set Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___SET_SOURCE_ELEMENT__NODE = GraphmodelPackage.EDGE___SET_SOURCE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Set Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___SET_TARGET_ELEMENT__NODE = GraphmodelPackage.EDGE___SET_TARGET_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___DELETE = GraphmodelPackage.EDGE___DELETE;

	/**
	 * The operation id for the '<em>Can Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___CAN_CLONE__NODE_NODE = GraphmodelPackage.EDGE___CAN_CLONE__NODE_NODE;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___CLONE__NODE_NODE = GraphmodelPackage.EDGE___CLONE__NODE_NODE;

	/**
	 * The operation id for the '<em>Reconnect Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___RECONNECT_SOURCE__NODE = GraphmodelPackage.EDGE___RECONNECT_SOURCE__NODE;

	/**
	 * The operation id for the '<em>Reconnect Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___RECONNECT_TARGET__NODE = GraphmodelPackage.EDGE___RECONNECT_TARGET__NODE;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___COPY__NODE_NODE = GraphmodelPackage.EDGE___COPY__NODE_NODE;

	/**
	 * The operation id for the '<em>Add Bendpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___ADD_BENDPOINT__INT_INT = GraphmodelPackage.EDGE___ADD_BENDPOINT__INT_INT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___GET_LABEL = GraphmodelPackage.EDGE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___SET_LABEL__STRING = GraphmodelPackage.EDGE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Internal Labeled Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___GET_INTERNAL_LABELED_EDGE = GraphmodelPackage.EDGE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Exactly Labeled Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___IS_EXACTLY_LABELED_EDGE = GraphmodelPackage.EDGE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Pre Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___PRE_DELETE = GraphmodelPackage.EDGE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Post Delete Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___GET_POST_DELETE_FUNCTION = GraphmodelPackage.EDGE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Post Delete Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___GET_POST_DELETE_EVENT = GraphmodelPackage.EDGE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Pre Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___PRE_SAVE = GraphmodelPackage.EDGE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Post Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___POST_SAVE = GraphmodelPackage.EDGE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___GET_ROOT_ELEMENT = GraphmodelPackage.EDGE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___GET_SOURCE_ELEMENT = GraphmodelPackage.EDGE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___GET_TARGET_ELEMENT = GraphmodelPackage.EDGE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Can Reconnect Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___CAN_RECONNECT_SOURCE__STARTNODE = GraphmodelPackage.EDGE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Reconnect Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___RECONNECT_SOURCE__STARTNODE = GraphmodelPackage.EDGE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Can Reconnect Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___CAN_RECONNECT_SOURCE__FEATURECONTAINER = GraphmodelPackage.EDGE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Reconnect Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___RECONNECT_SOURCE__FEATURECONTAINER = GraphmodelPackage.EDGE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Can Reconnect Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___CAN_RECONNECT_SOURCE__DOCNODE = GraphmodelPackage.EDGE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Reconnect Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___RECONNECT_SOURCE__DOCNODE = GraphmodelPackage.EDGE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Can Reconnect Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___CAN_RECONNECT_TARGET__DOCNODE = GraphmodelPackage.EDGE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Reconnect Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___RECONNECT_TARGET__DOCNODE = GraphmodelPackage.EDGE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Can Reconnect Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___CAN_RECONNECT_TARGET__FEATURECONTAINER = GraphmodelPackage.EDGE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Reconnect Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___RECONNECT_TARGET__FEATURECONTAINER = GraphmodelPackage.EDGE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Can Reconnect Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___CAN_RECONNECT_TARGET__ENDNODE = GraphmodelPackage.EDGE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Reconnect Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___RECONNECT_TARGET__ENDNODE = GraphmodelPackage.EDGE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Get Labeled Edge View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE___GET_LABELED_EDGE_VIEW = GraphmodelPackage.EDGE_OPERATION_COUNT + 24;

	/**
	 * The number of operations of the '<em>Labeled Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE_OPERATION_COUNT = GraphmodelPackage.EDGE_OPERATION_COUNT + 25;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.features.features.impl.FeaturesGraphModelImpl <em>Graph Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.features.features.impl.FeaturesGraphModelImpl
	 * @see info.scce.cinco.product.features.features.impl.FeaturesPackageImpl#getFeaturesGraphModel()
	 * @generated
	 */
	int FEATURES_GRAPH_MODEL = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL__ID = GraphmodelPackage.GRAPH_MODEL__ID;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL__INTERNAL_ELEMENT = GraphmodelPackage.GRAPH_MODEL__INTERNAL_ELEMENT;

	/**
	 * The number of structural features of the '<em>Graph Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL_FEATURE_COUNT = GraphmodelPackage.GRAPH_MODEL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___EQUALS__OBJECT = GraphmodelPackage.GRAPH_MODEL___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___HASH_CODE = GraphmodelPackage.GRAPH_MODEL___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___SAVE = GraphmodelPackage.GRAPH_MODEL___SAVE;

	/**
	 * The operation id for the '<em>Get Internal Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___GET_INTERNAL_ELEMENT = GraphmodelPackage.GRAPH_MODEL___GET_INTERNAL_ELEMENT;

	/**
	 * The operation id for the '<em>Transact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___TRANSACT__STRING_RUNNABLE = GraphmodelPackage.GRAPH_MODEL___TRANSACT__STRING_RUNNABLE;

	/**
	 * The operation id for the '<em>Get Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___GET_MODEL_ELEMENTS__CLASS = GraphmodelPackage.GRAPH_MODEL___GET_MODEL_ELEMENTS__CLASS;

	/**
	 * The operation id for the '<em>Get All Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___GET_ALL_NODES = GraphmodelPackage.GRAPH_MODEL___GET_ALL_NODES;

	/**
	 * The operation id for the '<em>Get All Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___GET_ALL_EDGES = GraphmodelPackage.GRAPH_MODEL___GET_ALL_EDGES;

	/**
	 * The operation id for the '<em>Get All Containers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___GET_ALL_CONTAINERS = GraphmodelPackage.GRAPH_MODEL___GET_ALL_CONTAINERS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___CAN_CONTAIN__ELIST = GraphmodelPackage.GRAPH_MODEL___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___CAN_CONTAIN__CLASS = GraphmodelPackage.GRAPH_MODEL___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Get Containable Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___GET_CONTAINABLE_TYPES = GraphmodelPackage.GRAPH_MODEL___GET_CONTAINABLE_TYPES;

	/**
	 * The operation id for the '<em>Get Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___GET_MODEL_ELEMENTS = GraphmodelPackage.GRAPH_MODEL___GET_MODEL_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___GET_EDGES__CLASS = GraphmodelPackage.GRAPH_MODEL___GET_EDGES__CLASS;

	/**
	 * The operation id for the '<em>Get Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___GET_NODES__CLASS = GraphmodelPackage.GRAPH_MODEL___GET_NODES__CLASS;

	/**
	 * The operation id for the '<em>Update Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___UPDATE_MODEL_ELEMENTS = GraphmodelPackage.GRAPH_MODEL___UPDATE_MODEL_ELEMENTS;

	/**
	 * The operation id for the '<em>Get All Node Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___GET_ALL_NODE_TYPES = GraphmodelPackage.GRAPH_MODEL___GET_ALL_NODE_TYPES;

	/**
	 * The operation id for the '<em>Get Internal Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___GET_INTERNAL_CONTAINER_ELEMENT = GraphmodelPackage.GRAPH_MODEL___GET_INTERNAL_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Clear Graph Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___CLEAR_GRAPH_MODEL = GraphmodelPackage.GRAPH_MODEL___CLEAR_GRAPH_MODEL;

	/**
	 * The operation id for the '<em>Delete Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___DELETE_NODE__NODE = GraphmodelPackage.GRAPH_MODEL___DELETE_NODE__NODE;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___GET_NAME = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___SET_NAME__STRING = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Internal Features Graph Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___GET_INTERNAL_FEATURES_GRAPH_MODEL = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Exactly Features Graph Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___IS_EXACTLY_FEATURES_GRAPH_MODEL = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Pre Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___PRE_DELETE = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Post Delete Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___GET_POST_DELETE_FUNCTION = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Post Delete Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___GET_POST_DELETE_EVENT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Pre Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___PRE_SAVE = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Post Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___POST_SAVE = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___GET_ROOT_ELEMENT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___GET_NODES = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Start Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___GET_START_NODES = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Can New Start Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___CAN_NEW_START_NODE = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>New Start Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___NEW_START_NODE__INT_INT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>New Start Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___NEW_START_NODE__STRING_INT_INT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>New Start Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___NEW_START_NODE__INT_INT_INT_INT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>New Start Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___NEW_START_NODE__STRING_INT_INT_INT_INT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Doc Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___GET_DOC_NODES = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Can New Doc Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___CAN_NEW_DOC_NODE = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>New Doc Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___NEW_DOC_NODE__EOBJECT_INT_INT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>New Doc Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___NEW_DOC_NODE__EOBJECT_STRING_INT_INT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>New Doc Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___NEW_DOC_NODE__EOBJECT_INT_INT_INT_INT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>New Doc Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___NEW_DOC_NODE__EOBJECT_STRING_INT_INT_INT_INT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Get Feature Containers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___GET_FEATURE_CONTAINERS = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Can New Feature Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___CAN_NEW_FEATURE_CONTAINER = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>New Feature Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___NEW_FEATURE_CONTAINER__INT_INT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>New Feature Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___NEW_FEATURE_CONTAINER__STRING_INT_INT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>New Feature Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___NEW_FEATURE_CONTAINER__INT_INT_INT_INT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>New Feature Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___NEW_FEATURE_CONTAINER__STRING_INT_INT_INT_INT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Get End Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___GET_END_NODES = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Can New End Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___CAN_NEW_END_NODE = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>New End Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___NEW_END_NODE__INT_INT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>New End Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___NEW_END_NODE__STRING_INT_INT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>New End Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___NEW_END_NODE__INT_INT_INT_INT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>New End Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___NEW_END_NODE__STRING_INT_INT_INT_INT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>New Features Graph Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___NEW_FEATURES_GRAPH_MODEL__STRING_STRING_BOOLEAN = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Get Features Graph Model View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL___GET_FEATURES_GRAPH_MODEL_VIEW = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 36;

	/**
	 * The number of operations of the '<em>Graph Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_GRAPH_MODEL_OPERATION_COUNT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 37;


	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.features.features.StartNode <em>Start Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Node</em>'.
	 * @see info.scce.cinco.product.features.features.StartNode
	 * @generated
	 */
	EClass getStartNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#getInternalStartNode() <em>Get Internal Start Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Internal Start Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#getInternalStartNode()
	 * @generated
	 */
	EOperation getStartNode__GetInternalStartNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#isExactlyStartNode() <em>Is Exactly Start Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Exactly Start Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#isExactlyStartNode()
	 * @generated
	 */
	EOperation getStartNode__IsExactlyStartNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#preDelete() <em>Pre Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Delete</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#preDelete()
	 * @generated
	 */
	EOperation getStartNode__PreDelete();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#getPostDeleteFunction() <em>Get Post Delete Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Function</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#getPostDeleteFunction()
	 * @generated
	 */
	EOperation getStartNode__GetPostDeleteFunction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#getPostDeleteEvent() <em>Get Post Delete Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Event</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#getPostDeleteEvent()
	 * @generated
	 */
	EOperation getStartNode__GetPostDeleteEvent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#preSave() <em>Pre Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Save</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#preSave()
	 * @generated
	 */
	EOperation getStartNode__PreSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#postSave() <em>Post Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Save</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#postSave()
	 * @generated
	 */
	EOperation getStartNode__PostSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#getRootElement() <em>Get Root Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root Element</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#getRootElement()
	 * @generated
	 */
	EOperation getStartNode__GetRootElement();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#getOutgoing() <em>Get Outgoing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#getOutgoing()
	 * @generated
	 */
	EOperation getStartNode__GetOutgoing();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#getSuccessors() <em>Get Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Successors</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#getSuccessors()
	 * @generated
	 */
	EOperation getStartNode__GetSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#s_moveTo(graphmodel.ModelElementContainer, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#s_moveTo(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getStartNode__S_moveTo__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#preMove(graphmodel.ModelElementContainer, int, int) <em>Pre Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Move</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#preMove(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getStartNode__PreMove__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int) <em>Post Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Move</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int)
	 * @generated
	 */
	EOperation getStartNode__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#preResize(int, int, int, int, graphmodel.Direction) <em>Pre Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Resize</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#preResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getStartNode__PreResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#postResize(int, int, int, int, graphmodel.Direction) <em>Post Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Resize</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#postResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getStartNode__PostResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#getOutgoingEdges() <em>Get Outgoing Edges</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Edges</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#getOutgoingEdges()
	 * @generated
	 */
	EOperation getStartNode__GetOutgoingEdges();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#getOutgoingLabeledEdges() <em>Get Outgoing Labeled Edges</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Labeled Edges</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#getOutgoingLabeledEdges()
	 * @generated
	 */
	EOperation getStartNode__GetOutgoingLabeledEdges();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#getEndNodeSuccessors() <em>Get End Node Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get End Node Successors</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#getEndNodeSuccessors()
	 * @generated
	 */
	EOperation getStartNode__GetEndNodeSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#getFeatureContainerSuccessors() <em>Get Feature Container Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feature Container Successors</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#getFeatureContainerSuccessors()
	 * @generated
	 */
	EOperation getStartNode__GetFeatureContainerSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#getDocNodeSuccessors() <em>Get Doc Node Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Doc Node Successors</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#getDocNodeSuccessors()
	 * @generated
	 */
	EOperation getStartNode__GetDocNodeSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#canNewEdge(info.scce.cinco.product.features.features.DocNode) <em>Can New Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#canNewEdge(info.scce.cinco.product.features.features.DocNode)
	 * @generated
	 */
	EOperation getStartNode__CanNewEdge__DocNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#newEdge(info.scce.cinco.product.features.features.DocNode) <em>New Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#newEdge(info.scce.cinco.product.features.features.DocNode)
	 * @generated
	 */
	EOperation getStartNode__NewEdge__DocNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#newEdge(info.scce.cinco.product.features.features.DocNode, java.lang.String) <em>New Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#newEdge(info.scce.cinco.product.features.features.DocNode, java.lang.String)
	 * @generated
	 */
	EOperation getStartNode__NewEdge__DocNode_String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#canNewEdge(info.scce.cinco.product.features.features.FeatureContainer) <em>Can New Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#canNewEdge(info.scce.cinco.product.features.features.FeatureContainer)
	 * @generated
	 */
	EOperation getStartNode__CanNewEdge__FeatureContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#newEdge(info.scce.cinco.product.features.features.FeatureContainer) <em>New Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#newEdge(info.scce.cinco.product.features.features.FeatureContainer)
	 * @generated
	 */
	EOperation getStartNode__NewEdge__FeatureContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#newEdge(info.scce.cinco.product.features.features.FeatureContainer, java.lang.String) <em>New Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#newEdge(info.scce.cinco.product.features.features.FeatureContainer, java.lang.String)
	 * @generated
	 */
	EOperation getStartNode__NewEdge__FeatureContainer_String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#canNewEdge(info.scce.cinco.product.features.features.EndNode) <em>Can New Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#canNewEdge(info.scce.cinco.product.features.features.EndNode)
	 * @generated
	 */
	EOperation getStartNode__CanNewEdge__EndNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#newEdge(info.scce.cinco.product.features.features.EndNode) <em>New Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#newEdge(info.scce.cinco.product.features.features.EndNode)
	 * @generated
	 */
	EOperation getStartNode__NewEdge__EndNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#newEdge(info.scce.cinco.product.features.features.EndNode, java.lang.String) <em>New Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#newEdge(info.scce.cinco.product.features.features.EndNode, java.lang.String)
	 * @generated
	 */
	EOperation getStartNode__NewEdge__EndNode_String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#canNewLabeledEdge(info.scce.cinco.product.features.features.DocNode) <em>Can New Labeled Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New Labeled Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#canNewLabeledEdge(info.scce.cinco.product.features.features.DocNode)
	 * @generated
	 */
	EOperation getStartNode__CanNewLabeledEdge__DocNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#newLabeledEdge(info.scce.cinco.product.features.features.DocNode) <em>New Labeled Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Labeled Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#newLabeledEdge(info.scce.cinco.product.features.features.DocNode)
	 * @generated
	 */
	EOperation getStartNode__NewLabeledEdge__DocNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#newLabeledEdge(info.scce.cinco.product.features.features.DocNode, java.lang.String) <em>New Labeled Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Labeled Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#newLabeledEdge(info.scce.cinco.product.features.features.DocNode, java.lang.String)
	 * @generated
	 */
	EOperation getStartNode__NewLabeledEdge__DocNode_String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#canNewLabeledEdge(info.scce.cinco.product.features.features.FeatureContainer) <em>Can New Labeled Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New Labeled Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#canNewLabeledEdge(info.scce.cinco.product.features.features.FeatureContainer)
	 * @generated
	 */
	EOperation getStartNode__CanNewLabeledEdge__FeatureContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#newLabeledEdge(info.scce.cinco.product.features.features.FeatureContainer) <em>New Labeled Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Labeled Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#newLabeledEdge(info.scce.cinco.product.features.features.FeatureContainer)
	 * @generated
	 */
	EOperation getStartNode__NewLabeledEdge__FeatureContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#newLabeledEdge(info.scce.cinco.product.features.features.FeatureContainer, java.lang.String) <em>New Labeled Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Labeled Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#newLabeledEdge(info.scce.cinco.product.features.features.FeatureContainer, java.lang.String)
	 * @generated
	 */
	EOperation getStartNode__NewLabeledEdge__FeatureContainer_String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#canNewLabeledEdge(info.scce.cinco.product.features.features.EndNode) <em>Can New Labeled Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New Labeled Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#canNewLabeledEdge(info.scce.cinco.product.features.features.EndNode)
	 * @generated
	 */
	EOperation getStartNode__CanNewLabeledEdge__EndNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#newLabeledEdge(info.scce.cinco.product.features.features.EndNode) <em>New Labeled Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Labeled Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#newLabeledEdge(info.scce.cinco.product.features.features.EndNode)
	 * @generated
	 */
	EOperation getStartNode__NewLabeledEdge__EndNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#newLabeledEdge(info.scce.cinco.product.features.features.EndNode, java.lang.String) <em>New Labeled Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Labeled Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#newLabeledEdge(info.scce.cinco.product.features.features.EndNode, java.lang.String)
	 * @generated
	 */
	EOperation getStartNode__NewLabeledEdge__EndNode_String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#canMoveTo(info.scce.cinco.product.features.features.FeaturesGraphModel, int, int) <em>Can Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Move To</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#canMoveTo(info.scce.cinco.product.features.features.FeaturesGraphModel, int, int)
	 * @generated
	 */
	EOperation getStartNode__CanMoveTo__FeaturesGraphModel_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#moveTo(info.scce.cinco.product.features.features.FeaturesGraphModel, int, int) <em>Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#moveTo(info.scce.cinco.product.features.features.FeaturesGraphModel, int, int)
	 * @generated
	 */
	EOperation getStartNode__MoveTo__FeaturesGraphModel_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#s_moveTo(info.scce.cinco.product.features.features.FeaturesGraphModel, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#s_moveTo(info.scce.cinco.product.features.features.FeaturesGraphModel, int, int)
	 * @generated
	 */
	EOperation getStartNode__S_moveTo__FeaturesGraphModel_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#canMoveTo(info.scce.cinco.product.features.features.FeatureContainer, int, int) <em>Can Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Move To</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#canMoveTo(info.scce.cinco.product.features.features.FeatureContainer, int, int)
	 * @generated
	 */
	EOperation getStartNode__CanMoveTo__FeatureContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#moveTo(info.scce.cinco.product.features.features.FeatureContainer, int, int) <em>Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#moveTo(info.scce.cinco.product.features.features.FeatureContainer, int, int)
	 * @generated
	 */
	EOperation getStartNode__MoveTo__FeatureContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#s_moveTo(info.scce.cinco.product.features.features.FeatureContainer, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#s_moveTo(info.scce.cinco.product.features.features.FeatureContainer, int, int)
	 * @generated
	 */
	EOperation getStartNode__S_moveTo__FeatureContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.StartNode#getStartNodeView() <em>Get Start Node View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Start Node View</em>' operation.
	 * @see info.scce.cinco.product.features.features.StartNode#getStartNodeView()
	 * @generated
	 */
	EOperation getStartNode__GetStartNodeView();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.features.features.EndNode <em>End Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Node</em>'.
	 * @see info.scce.cinco.product.features.features.EndNode
	 * @generated
	 */
	EClass getEndNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.EndNode#getInternalEndNode() <em>Get Internal End Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Internal End Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.EndNode#getInternalEndNode()
	 * @generated
	 */
	EOperation getEndNode__GetInternalEndNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.EndNode#isExactlyEndNode() <em>Is Exactly End Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Exactly End Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.EndNode#isExactlyEndNode()
	 * @generated
	 */
	EOperation getEndNode__IsExactlyEndNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.EndNode#preDelete() <em>Pre Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Delete</em>' operation.
	 * @see info.scce.cinco.product.features.features.EndNode#preDelete()
	 * @generated
	 */
	EOperation getEndNode__PreDelete();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.EndNode#getPostDeleteFunction() <em>Get Post Delete Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Function</em>' operation.
	 * @see info.scce.cinco.product.features.features.EndNode#getPostDeleteFunction()
	 * @generated
	 */
	EOperation getEndNode__GetPostDeleteFunction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.EndNode#getPostDeleteEvent() <em>Get Post Delete Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Event</em>' operation.
	 * @see info.scce.cinco.product.features.features.EndNode#getPostDeleteEvent()
	 * @generated
	 */
	EOperation getEndNode__GetPostDeleteEvent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.EndNode#preSave() <em>Pre Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Save</em>' operation.
	 * @see info.scce.cinco.product.features.features.EndNode#preSave()
	 * @generated
	 */
	EOperation getEndNode__PreSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.EndNode#postSave() <em>Post Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Save</em>' operation.
	 * @see info.scce.cinco.product.features.features.EndNode#postSave()
	 * @generated
	 */
	EOperation getEndNode__PostSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.EndNode#getRootElement() <em>Get Root Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root Element</em>' operation.
	 * @see info.scce.cinco.product.features.features.EndNode#getRootElement()
	 * @generated
	 */
	EOperation getEndNode__GetRootElement();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.EndNode#getIncoming() <em>Get Incoming</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming</em>' operation.
	 * @see info.scce.cinco.product.features.features.EndNode#getIncoming()
	 * @generated
	 */
	EOperation getEndNode__GetIncoming();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.EndNode#getPredecessors() <em>Get Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Predecessors</em>' operation.
	 * @see info.scce.cinco.product.features.features.EndNode#getPredecessors()
	 * @generated
	 */
	EOperation getEndNode__GetPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.EndNode#s_moveTo(graphmodel.ModelElementContainer, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.features.features.EndNode#s_moveTo(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getEndNode__S_moveTo__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.EndNode#preMove(graphmodel.ModelElementContainer, int, int) <em>Pre Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Move</em>' operation.
	 * @see info.scce.cinco.product.features.features.EndNode#preMove(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getEndNode__PreMove__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.EndNode#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int) <em>Post Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Move</em>' operation.
	 * @see info.scce.cinco.product.features.features.EndNode#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int)
	 * @generated
	 */
	EOperation getEndNode__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.EndNode#preResize(int, int, int, int, graphmodel.Direction) <em>Pre Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Resize</em>' operation.
	 * @see info.scce.cinco.product.features.features.EndNode#preResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getEndNode__PreResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.EndNode#postResize(int, int, int, int, graphmodel.Direction) <em>Post Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Resize</em>' operation.
	 * @see info.scce.cinco.product.features.features.EndNode#postResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getEndNode__PostResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.EndNode#getIncomingEdges() <em>Get Incoming Edges</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Edges</em>' operation.
	 * @see info.scce.cinco.product.features.features.EndNode#getIncomingEdges()
	 * @generated
	 */
	EOperation getEndNode__GetIncomingEdges();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.EndNode#getIncomingLabeledEdges() <em>Get Incoming Labeled Edges</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Labeled Edges</em>' operation.
	 * @see info.scce.cinco.product.features.features.EndNode#getIncomingLabeledEdges()
	 * @generated
	 */
	EOperation getEndNode__GetIncomingLabeledEdges();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.EndNode#getStartNodePredecessors() <em>Get Start Node Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Start Node Predecessors</em>' operation.
	 * @see info.scce.cinco.product.features.features.EndNode#getStartNodePredecessors()
	 * @generated
	 */
	EOperation getEndNode__GetStartNodePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.EndNode#getFeatureContainerPredecessors() <em>Get Feature Container Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feature Container Predecessors</em>' operation.
	 * @see info.scce.cinco.product.features.features.EndNode#getFeatureContainerPredecessors()
	 * @generated
	 */
	EOperation getEndNode__GetFeatureContainerPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.EndNode#getDocNodePredecessors() <em>Get Doc Node Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Doc Node Predecessors</em>' operation.
	 * @see info.scce.cinco.product.features.features.EndNode#getDocNodePredecessors()
	 * @generated
	 */
	EOperation getEndNode__GetDocNodePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.EndNode#canMoveTo(info.scce.cinco.product.features.features.FeaturesGraphModel, int, int) <em>Can Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Move To</em>' operation.
	 * @see info.scce.cinco.product.features.features.EndNode#canMoveTo(info.scce.cinco.product.features.features.FeaturesGraphModel, int, int)
	 * @generated
	 */
	EOperation getEndNode__CanMoveTo__FeaturesGraphModel_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.EndNode#moveTo(info.scce.cinco.product.features.features.FeaturesGraphModel, int, int) <em>Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To</em>' operation.
	 * @see info.scce.cinco.product.features.features.EndNode#moveTo(info.scce.cinco.product.features.features.FeaturesGraphModel, int, int)
	 * @generated
	 */
	EOperation getEndNode__MoveTo__FeaturesGraphModel_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.EndNode#s_moveTo(info.scce.cinco.product.features.features.FeaturesGraphModel, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.features.features.EndNode#s_moveTo(info.scce.cinco.product.features.features.FeaturesGraphModel, int, int)
	 * @generated
	 */
	EOperation getEndNode__S_moveTo__FeaturesGraphModel_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.EndNode#canMoveTo(info.scce.cinco.product.features.features.FeatureContainer, int, int) <em>Can Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Move To</em>' operation.
	 * @see info.scce.cinco.product.features.features.EndNode#canMoveTo(info.scce.cinco.product.features.features.FeatureContainer, int, int)
	 * @generated
	 */
	EOperation getEndNode__CanMoveTo__FeatureContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.EndNode#moveTo(info.scce.cinco.product.features.features.FeatureContainer, int, int) <em>Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To</em>' operation.
	 * @see info.scce.cinco.product.features.features.EndNode#moveTo(info.scce.cinco.product.features.features.FeatureContainer, int, int)
	 * @generated
	 */
	EOperation getEndNode__MoveTo__FeatureContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.EndNode#s_moveTo(info.scce.cinco.product.features.features.FeatureContainer, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.features.features.EndNode#s_moveTo(info.scce.cinco.product.features.features.FeatureContainer, int, int)
	 * @generated
	 */
	EOperation getEndNode__S_moveTo__FeatureContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.EndNode#getEndNodeView() <em>Get End Node View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get End Node View</em>' operation.
	 * @see info.scce.cinco.product.features.features.EndNode#getEndNodeView()
	 * @generated
	 */
	EOperation getEndNode__GetEndNodeView();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.features.features.FeatureContainer <em>Feature Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Container</em>'.
	 * @see info.scce.cinco.product.features.features.FeatureContainer
	 * @generated
	 */
	EClass getFeatureContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#getTitle() <em>Get Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Title</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#getTitle()
	 * @generated
	 */
	EOperation getFeatureContainer__GetTitle();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#setTitle(java.lang.String) <em>Set Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Title</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#setTitle(java.lang.String)
	 * @generated
	 */
	EOperation getFeatureContainer__SetTitle__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#getInternalFeatureContainer() <em>Get Internal Feature Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Internal Feature Container</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#getInternalFeatureContainer()
	 * @generated
	 */
	EOperation getFeatureContainer__GetInternalFeatureContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#isExactlyFeatureContainer() <em>Is Exactly Feature Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Exactly Feature Container</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#isExactlyFeatureContainer()
	 * @generated
	 */
	EOperation getFeatureContainer__IsExactlyFeatureContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#preDelete() <em>Pre Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Delete</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#preDelete()
	 * @generated
	 */
	EOperation getFeatureContainer__PreDelete();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#getPostDeleteFunction() <em>Get Post Delete Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Function</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#getPostDeleteFunction()
	 * @generated
	 */
	EOperation getFeatureContainer__GetPostDeleteFunction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#getPostDeleteEvent() <em>Get Post Delete Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Event</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#getPostDeleteEvent()
	 * @generated
	 */
	EOperation getFeatureContainer__GetPostDeleteEvent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#preSave() <em>Pre Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Save</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#preSave()
	 * @generated
	 */
	EOperation getFeatureContainer__PreSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#postSave() <em>Post Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Save</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#postSave()
	 * @generated
	 */
	EOperation getFeatureContainer__PostSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#getRootElement() <em>Get Root Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root Element</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#getRootElement()
	 * @generated
	 */
	EOperation getFeatureContainer__GetRootElement();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#getNodes() <em>Get Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nodes</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#getNodes()
	 * @generated
	 */
	EOperation getFeatureContainer__GetNodes();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#getStartNodes() <em>Get Start Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Start Nodes</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#getStartNodes()
	 * @generated
	 */
	EOperation getFeatureContainer__GetStartNodes();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#canNewStartNode() <em>Can New Start Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New Start Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#canNewStartNode()
	 * @generated
	 */
	EOperation getFeatureContainer__CanNewStartNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#newStartNode(int, int) <em>New Start Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Start Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#newStartNode(int, int)
	 * @generated
	 */
	EOperation getFeatureContainer__NewStartNode__int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#newStartNode(java.lang.String, int, int) <em>New Start Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Start Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#newStartNode(java.lang.String, int, int)
	 * @generated
	 */
	EOperation getFeatureContainer__NewStartNode__String_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#newStartNode(int, int, int, int) <em>New Start Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Start Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#newStartNode(int, int, int, int)
	 * @generated
	 */
	EOperation getFeatureContainer__NewStartNode__int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#newStartNode(java.lang.String, int, int, int, int) <em>New Start Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Start Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#newStartNode(java.lang.String, int, int, int, int)
	 * @generated
	 */
	EOperation getFeatureContainer__NewStartNode__String_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#getDocNodes() <em>Get Doc Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Doc Nodes</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#getDocNodes()
	 * @generated
	 */
	EOperation getFeatureContainer__GetDocNodes();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#canNewDocNode() <em>Can New Doc Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New Doc Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#canNewDocNode()
	 * @generated
	 */
	EOperation getFeatureContainer__CanNewDocNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#newDocNode(org.eclipse.emf.ecore.EObject, int, int) <em>New Doc Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Doc Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#newDocNode(org.eclipse.emf.ecore.EObject, int, int)
	 * @generated
	 */
	EOperation getFeatureContainer__NewDocNode__EObject_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#newDocNode(org.eclipse.emf.ecore.EObject, java.lang.String, int, int) <em>New Doc Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Doc Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#newDocNode(org.eclipse.emf.ecore.EObject, java.lang.String, int, int)
	 * @generated
	 */
	EOperation getFeatureContainer__NewDocNode__EObject_String_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#newDocNode(org.eclipse.emf.ecore.EObject, int, int, int, int) <em>New Doc Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Doc Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#newDocNode(org.eclipse.emf.ecore.EObject, int, int, int, int)
	 * @generated
	 */
	EOperation getFeatureContainer__NewDocNode__EObject_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#newDocNode(org.eclipse.emf.ecore.EObject, java.lang.String, int, int, int, int) <em>New Doc Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Doc Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#newDocNode(org.eclipse.emf.ecore.EObject, java.lang.String, int, int, int, int)
	 * @generated
	 */
	EOperation getFeatureContainer__NewDocNode__EObject_String_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#getFeatureContainers() <em>Get Feature Containers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feature Containers</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#getFeatureContainers()
	 * @generated
	 */
	EOperation getFeatureContainer__GetFeatureContainers();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#canNewFeatureContainer() <em>Can New Feature Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New Feature Container</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#canNewFeatureContainer()
	 * @generated
	 */
	EOperation getFeatureContainer__CanNewFeatureContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#newFeatureContainer(int, int) <em>New Feature Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Feature Container</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#newFeatureContainer(int, int)
	 * @generated
	 */
	EOperation getFeatureContainer__NewFeatureContainer__int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#newFeatureContainer(java.lang.String, int, int) <em>New Feature Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Feature Container</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#newFeatureContainer(java.lang.String, int, int)
	 * @generated
	 */
	EOperation getFeatureContainer__NewFeatureContainer__String_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#newFeatureContainer(int, int, int, int) <em>New Feature Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Feature Container</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#newFeatureContainer(int, int, int, int)
	 * @generated
	 */
	EOperation getFeatureContainer__NewFeatureContainer__int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#newFeatureContainer(java.lang.String, int, int, int, int) <em>New Feature Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Feature Container</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#newFeatureContainer(java.lang.String, int, int, int, int)
	 * @generated
	 */
	EOperation getFeatureContainer__NewFeatureContainer__String_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#getEndNodes() <em>Get End Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get End Nodes</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#getEndNodes()
	 * @generated
	 */
	EOperation getFeatureContainer__GetEndNodes();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#canNewEndNode() <em>Can New End Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New End Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#canNewEndNode()
	 * @generated
	 */
	EOperation getFeatureContainer__CanNewEndNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#newEndNode(int, int) <em>New End Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New End Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#newEndNode(int, int)
	 * @generated
	 */
	EOperation getFeatureContainer__NewEndNode__int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#newEndNode(java.lang.String, int, int) <em>New End Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New End Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#newEndNode(java.lang.String, int, int)
	 * @generated
	 */
	EOperation getFeatureContainer__NewEndNode__String_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#newEndNode(int, int, int, int) <em>New End Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New End Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#newEndNode(int, int, int, int)
	 * @generated
	 */
	EOperation getFeatureContainer__NewEndNode__int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#newEndNode(java.lang.String, int, int, int, int) <em>New End Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New End Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#newEndNode(java.lang.String, int, int, int, int)
	 * @generated
	 */
	EOperation getFeatureContainer__NewEndNode__String_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#getOutgoing() <em>Get Outgoing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#getOutgoing()
	 * @generated
	 */
	EOperation getFeatureContainer__GetOutgoing();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#getSuccessors() <em>Get Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Successors</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#getSuccessors()
	 * @generated
	 */
	EOperation getFeatureContainer__GetSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#getIncoming() <em>Get Incoming</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#getIncoming()
	 * @generated
	 */
	EOperation getFeatureContainer__GetIncoming();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#getPredecessors() <em>Get Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Predecessors</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#getPredecessors()
	 * @generated
	 */
	EOperation getFeatureContainer__GetPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#s_moveTo(graphmodel.ModelElementContainer, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#s_moveTo(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getFeatureContainer__S_moveTo__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#preMove(graphmodel.ModelElementContainer, int, int) <em>Pre Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Move</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#preMove(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getFeatureContainer__PreMove__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int) <em>Post Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Move</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int)
	 * @generated
	 */
	EOperation getFeatureContainer__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#preResize(int, int, int, int, graphmodel.Direction) <em>Pre Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Resize</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#preResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getFeatureContainer__PreResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#postResize(int, int, int, int, graphmodel.Direction) <em>Post Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Resize</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#postResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getFeatureContainer__PostResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#getOutgoingEdges() <em>Get Outgoing Edges</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Edges</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#getOutgoingEdges()
	 * @generated
	 */
	EOperation getFeatureContainer__GetOutgoingEdges();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#getOutgoingLabeledEdges() <em>Get Outgoing Labeled Edges</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Labeled Edges</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#getOutgoingLabeledEdges()
	 * @generated
	 */
	EOperation getFeatureContainer__GetOutgoingLabeledEdges();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#getIncomingEdges() <em>Get Incoming Edges</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Edges</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#getIncomingEdges()
	 * @generated
	 */
	EOperation getFeatureContainer__GetIncomingEdges();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#getIncomingLabeledEdges() <em>Get Incoming Labeled Edges</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Labeled Edges</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#getIncomingLabeledEdges()
	 * @generated
	 */
	EOperation getFeatureContainer__GetIncomingLabeledEdges();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#getStartNodePredecessors() <em>Get Start Node Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Start Node Predecessors</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#getStartNodePredecessors()
	 * @generated
	 */
	EOperation getFeatureContainer__GetStartNodePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#getFeatureContainerPredecessors() <em>Get Feature Container Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feature Container Predecessors</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#getFeatureContainerPredecessors()
	 * @generated
	 */
	EOperation getFeatureContainer__GetFeatureContainerPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#getDocNodePredecessors() <em>Get Doc Node Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Doc Node Predecessors</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#getDocNodePredecessors()
	 * @generated
	 */
	EOperation getFeatureContainer__GetDocNodePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#getEndNodeSuccessors() <em>Get End Node Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get End Node Successors</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#getEndNodeSuccessors()
	 * @generated
	 */
	EOperation getFeatureContainer__GetEndNodeSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#getFeatureContainerSuccessors() <em>Get Feature Container Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feature Container Successors</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#getFeatureContainerSuccessors()
	 * @generated
	 */
	EOperation getFeatureContainer__GetFeatureContainerSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#getDocNodeSuccessors() <em>Get Doc Node Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Doc Node Successors</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#getDocNodeSuccessors()
	 * @generated
	 */
	EOperation getFeatureContainer__GetDocNodeSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#canNewEdge(info.scce.cinco.product.features.features.DocNode) <em>Can New Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#canNewEdge(info.scce.cinco.product.features.features.DocNode)
	 * @generated
	 */
	EOperation getFeatureContainer__CanNewEdge__DocNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#newEdge(info.scce.cinco.product.features.features.DocNode) <em>New Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#newEdge(info.scce.cinco.product.features.features.DocNode)
	 * @generated
	 */
	EOperation getFeatureContainer__NewEdge__DocNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#newEdge(info.scce.cinco.product.features.features.DocNode, java.lang.String) <em>New Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#newEdge(info.scce.cinco.product.features.features.DocNode, java.lang.String)
	 * @generated
	 */
	EOperation getFeatureContainer__NewEdge__DocNode_String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#canNewEdge(info.scce.cinco.product.features.features.FeatureContainer) <em>Can New Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#canNewEdge(info.scce.cinco.product.features.features.FeatureContainer)
	 * @generated
	 */
	EOperation getFeatureContainer__CanNewEdge__FeatureContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#newEdge(info.scce.cinco.product.features.features.FeatureContainer) <em>New Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#newEdge(info.scce.cinco.product.features.features.FeatureContainer)
	 * @generated
	 */
	EOperation getFeatureContainer__NewEdge__FeatureContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#newEdge(info.scce.cinco.product.features.features.FeatureContainer, java.lang.String) <em>New Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#newEdge(info.scce.cinco.product.features.features.FeatureContainer, java.lang.String)
	 * @generated
	 */
	EOperation getFeatureContainer__NewEdge__FeatureContainer_String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#canNewEdge(info.scce.cinco.product.features.features.EndNode) <em>Can New Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#canNewEdge(info.scce.cinco.product.features.features.EndNode)
	 * @generated
	 */
	EOperation getFeatureContainer__CanNewEdge__EndNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#newEdge(info.scce.cinco.product.features.features.EndNode) <em>New Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#newEdge(info.scce.cinco.product.features.features.EndNode)
	 * @generated
	 */
	EOperation getFeatureContainer__NewEdge__EndNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#newEdge(info.scce.cinco.product.features.features.EndNode, java.lang.String) <em>New Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#newEdge(info.scce.cinco.product.features.features.EndNode, java.lang.String)
	 * @generated
	 */
	EOperation getFeatureContainer__NewEdge__EndNode_String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#canNewLabeledEdge(info.scce.cinco.product.features.features.DocNode) <em>Can New Labeled Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New Labeled Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#canNewLabeledEdge(info.scce.cinco.product.features.features.DocNode)
	 * @generated
	 */
	EOperation getFeatureContainer__CanNewLabeledEdge__DocNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#newLabeledEdge(info.scce.cinco.product.features.features.DocNode) <em>New Labeled Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Labeled Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#newLabeledEdge(info.scce.cinco.product.features.features.DocNode)
	 * @generated
	 */
	EOperation getFeatureContainer__NewLabeledEdge__DocNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#newLabeledEdge(info.scce.cinco.product.features.features.DocNode, java.lang.String) <em>New Labeled Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Labeled Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#newLabeledEdge(info.scce.cinco.product.features.features.DocNode, java.lang.String)
	 * @generated
	 */
	EOperation getFeatureContainer__NewLabeledEdge__DocNode_String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#canNewLabeledEdge(info.scce.cinco.product.features.features.FeatureContainer) <em>Can New Labeled Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New Labeled Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#canNewLabeledEdge(info.scce.cinco.product.features.features.FeatureContainer)
	 * @generated
	 */
	EOperation getFeatureContainer__CanNewLabeledEdge__FeatureContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#newLabeledEdge(info.scce.cinco.product.features.features.FeatureContainer) <em>New Labeled Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Labeled Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#newLabeledEdge(info.scce.cinco.product.features.features.FeatureContainer)
	 * @generated
	 */
	EOperation getFeatureContainer__NewLabeledEdge__FeatureContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#newLabeledEdge(info.scce.cinco.product.features.features.FeatureContainer, java.lang.String) <em>New Labeled Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Labeled Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#newLabeledEdge(info.scce.cinco.product.features.features.FeatureContainer, java.lang.String)
	 * @generated
	 */
	EOperation getFeatureContainer__NewLabeledEdge__FeatureContainer_String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#canNewLabeledEdge(info.scce.cinco.product.features.features.EndNode) <em>Can New Labeled Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New Labeled Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#canNewLabeledEdge(info.scce.cinco.product.features.features.EndNode)
	 * @generated
	 */
	EOperation getFeatureContainer__CanNewLabeledEdge__EndNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#newLabeledEdge(info.scce.cinco.product.features.features.EndNode) <em>New Labeled Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Labeled Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#newLabeledEdge(info.scce.cinco.product.features.features.EndNode)
	 * @generated
	 */
	EOperation getFeatureContainer__NewLabeledEdge__EndNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#newLabeledEdge(info.scce.cinco.product.features.features.EndNode, java.lang.String) <em>New Labeled Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Labeled Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#newLabeledEdge(info.scce.cinco.product.features.features.EndNode, java.lang.String)
	 * @generated
	 */
	EOperation getFeatureContainer__NewLabeledEdge__EndNode_String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#canMoveTo(info.scce.cinco.product.features.features.FeaturesGraphModel, int, int) <em>Can Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Move To</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#canMoveTo(info.scce.cinco.product.features.features.FeaturesGraphModel, int, int)
	 * @generated
	 */
	EOperation getFeatureContainer__CanMoveTo__FeaturesGraphModel_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#moveTo(info.scce.cinco.product.features.features.FeaturesGraphModel, int, int) <em>Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#moveTo(info.scce.cinco.product.features.features.FeaturesGraphModel, int, int)
	 * @generated
	 */
	EOperation getFeatureContainer__MoveTo__FeaturesGraphModel_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#s_moveTo(info.scce.cinco.product.features.features.FeaturesGraphModel, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#s_moveTo(info.scce.cinco.product.features.features.FeaturesGraphModel, int, int)
	 * @generated
	 */
	EOperation getFeatureContainer__S_moveTo__FeaturesGraphModel_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#canMoveTo(info.scce.cinco.product.features.features.FeatureContainer, int, int) <em>Can Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Move To</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#canMoveTo(info.scce.cinco.product.features.features.FeatureContainer, int, int)
	 * @generated
	 */
	EOperation getFeatureContainer__CanMoveTo__FeatureContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#moveTo(info.scce.cinco.product.features.features.FeatureContainer, int, int) <em>Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#moveTo(info.scce.cinco.product.features.features.FeatureContainer, int, int)
	 * @generated
	 */
	EOperation getFeatureContainer__MoveTo__FeatureContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#s_moveTo(info.scce.cinco.product.features.features.FeatureContainer, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#s_moveTo(info.scce.cinco.product.features.features.FeatureContainer, int, int)
	 * @generated
	 */
	EOperation getFeatureContainer__S_moveTo__FeatureContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeatureContainer#getFeatureContainerView() <em>Get Feature Container View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feature Container View</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeatureContainer#getFeatureContainerView()
	 * @generated
	 */
	EOperation getFeatureContainer__GetFeatureContainerView();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.features.features.DocNode <em>Doc Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doc Node</em>'.
	 * @see info.scce.cinco.product.features.features.DocNode
	 * @generated
	 */
	EClass getDocNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#isCreateScreenshots() <em>Is Create Screenshots</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Create Screenshots</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#isCreateScreenshots()
	 * @generated
	 */
	EOperation getDocNode__IsCreateScreenshots();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#setCreateScreenshots(boolean) <em>Set Create Screenshots</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Create Screenshots</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#setCreateScreenshots(boolean)
	 * @generated
	 */
	EOperation getDocNode__SetCreateScreenshots__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#getInternalDocNode() <em>Get Internal Doc Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Internal Doc Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#getInternalDocNode()
	 * @generated
	 */
	EOperation getDocNode__GetInternalDocNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#isExactlyDocNode() <em>Is Exactly Doc Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Exactly Doc Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#isExactlyDocNode()
	 * @generated
	 */
	EOperation getDocNode__IsExactlyDocNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#preDelete() <em>Pre Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Delete</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#preDelete()
	 * @generated
	 */
	EOperation getDocNode__PreDelete();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#getPostDeleteFunction() <em>Get Post Delete Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Function</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#getPostDeleteFunction()
	 * @generated
	 */
	EOperation getDocNode__GetPostDeleteFunction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#getPostDeleteEvent() <em>Get Post Delete Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Event</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#getPostDeleteEvent()
	 * @generated
	 */
	EOperation getDocNode__GetPostDeleteEvent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#preSave() <em>Pre Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Save</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#preSave()
	 * @generated
	 */
	EOperation getDocNode__PreSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#postSave() <em>Post Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Save</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#postSave()
	 * @generated
	 */
	EOperation getDocNode__PostSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#getRootElement() <em>Get Root Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root Element</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#getRootElement()
	 * @generated
	 */
	EOperation getDocNode__GetRootElement();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#getOutgoing() <em>Get Outgoing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#getOutgoing()
	 * @generated
	 */
	EOperation getDocNode__GetOutgoing();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#getSuccessors() <em>Get Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Successors</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#getSuccessors()
	 * @generated
	 */
	EOperation getDocNode__GetSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#getIncoming() <em>Get Incoming</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#getIncoming()
	 * @generated
	 */
	EOperation getDocNode__GetIncoming();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#getPredecessors() <em>Get Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Predecessors</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#getPredecessors()
	 * @generated
	 */
	EOperation getDocNode__GetPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#s_moveTo(graphmodel.ModelElementContainer, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#s_moveTo(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getDocNode__S_moveTo__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#preMove(graphmodel.ModelElementContainer, int, int) <em>Pre Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Move</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#preMove(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getDocNode__PreMove__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int) <em>Post Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Move</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int)
	 * @generated
	 */
	EOperation getDocNode__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#preResize(int, int, int, int, graphmodel.Direction) <em>Pre Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Resize</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#preResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getDocNode__PreResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#postResize(int, int, int, int, graphmodel.Direction) <em>Post Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Resize</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#postResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getDocNode__PostResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#getOutgoingEdges() <em>Get Outgoing Edges</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Edges</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#getOutgoingEdges()
	 * @generated
	 */
	EOperation getDocNode__GetOutgoingEdges();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#getOutgoingLabeledEdges() <em>Get Outgoing Labeled Edges</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Labeled Edges</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#getOutgoingLabeledEdges()
	 * @generated
	 */
	EOperation getDocNode__GetOutgoingLabeledEdges();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#getIncomingEdges() <em>Get Incoming Edges</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Edges</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#getIncomingEdges()
	 * @generated
	 */
	EOperation getDocNode__GetIncomingEdges();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#getIncomingLabeledEdges() <em>Get Incoming Labeled Edges</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Labeled Edges</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#getIncomingLabeledEdges()
	 * @generated
	 */
	EOperation getDocNode__GetIncomingLabeledEdges();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#getStartNodePredecessors() <em>Get Start Node Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Start Node Predecessors</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#getStartNodePredecessors()
	 * @generated
	 */
	EOperation getDocNode__GetStartNodePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#getFeatureContainerPredecessors() <em>Get Feature Container Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feature Container Predecessors</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#getFeatureContainerPredecessors()
	 * @generated
	 */
	EOperation getDocNode__GetFeatureContainerPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#getDocNodePredecessors() <em>Get Doc Node Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Doc Node Predecessors</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#getDocNodePredecessors()
	 * @generated
	 */
	EOperation getDocNode__GetDocNodePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#getEndNodeSuccessors() <em>Get End Node Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get End Node Successors</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#getEndNodeSuccessors()
	 * @generated
	 */
	EOperation getDocNode__GetEndNodeSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#getFeatureContainerSuccessors() <em>Get Feature Container Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feature Container Successors</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#getFeatureContainerSuccessors()
	 * @generated
	 */
	EOperation getDocNode__GetFeatureContainerSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#getDocNodeSuccessors() <em>Get Doc Node Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Doc Node Successors</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#getDocNodeSuccessors()
	 * @generated
	 */
	EOperation getDocNode__GetDocNodeSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#canNewEdge(info.scce.cinco.product.features.features.DocNode) <em>Can New Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#canNewEdge(info.scce.cinco.product.features.features.DocNode)
	 * @generated
	 */
	EOperation getDocNode__CanNewEdge__DocNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#newEdge(info.scce.cinco.product.features.features.DocNode) <em>New Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#newEdge(info.scce.cinco.product.features.features.DocNode)
	 * @generated
	 */
	EOperation getDocNode__NewEdge__DocNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#newEdge(info.scce.cinco.product.features.features.DocNode, java.lang.String) <em>New Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#newEdge(info.scce.cinco.product.features.features.DocNode, java.lang.String)
	 * @generated
	 */
	EOperation getDocNode__NewEdge__DocNode_String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#canNewEdge(info.scce.cinco.product.features.features.FeatureContainer) <em>Can New Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#canNewEdge(info.scce.cinco.product.features.features.FeatureContainer)
	 * @generated
	 */
	EOperation getDocNode__CanNewEdge__FeatureContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#newEdge(info.scce.cinco.product.features.features.FeatureContainer) <em>New Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#newEdge(info.scce.cinco.product.features.features.FeatureContainer)
	 * @generated
	 */
	EOperation getDocNode__NewEdge__FeatureContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#newEdge(info.scce.cinco.product.features.features.FeatureContainer, java.lang.String) <em>New Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#newEdge(info.scce.cinco.product.features.features.FeatureContainer, java.lang.String)
	 * @generated
	 */
	EOperation getDocNode__NewEdge__FeatureContainer_String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#canNewEdge(info.scce.cinco.product.features.features.EndNode) <em>Can New Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#canNewEdge(info.scce.cinco.product.features.features.EndNode)
	 * @generated
	 */
	EOperation getDocNode__CanNewEdge__EndNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#newEdge(info.scce.cinco.product.features.features.EndNode) <em>New Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#newEdge(info.scce.cinco.product.features.features.EndNode)
	 * @generated
	 */
	EOperation getDocNode__NewEdge__EndNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#newEdge(info.scce.cinco.product.features.features.EndNode, java.lang.String) <em>New Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#newEdge(info.scce.cinco.product.features.features.EndNode, java.lang.String)
	 * @generated
	 */
	EOperation getDocNode__NewEdge__EndNode_String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#canNewLabeledEdge(info.scce.cinco.product.features.features.DocNode) <em>Can New Labeled Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New Labeled Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#canNewLabeledEdge(info.scce.cinco.product.features.features.DocNode)
	 * @generated
	 */
	EOperation getDocNode__CanNewLabeledEdge__DocNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#newLabeledEdge(info.scce.cinco.product.features.features.DocNode) <em>New Labeled Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Labeled Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#newLabeledEdge(info.scce.cinco.product.features.features.DocNode)
	 * @generated
	 */
	EOperation getDocNode__NewLabeledEdge__DocNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#newLabeledEdge(info.scce.cinco.product.features.features.DocNode, java.lang.String) <em>New Labeled Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Labeled Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#newLabeledEdge(info.scce.cinco.product.features.features.DocNode, java.lang.String)
	 * @generated
	 */
	EOperation getDocNode__NewLabeledEdge__DocNode_String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#canNewLabeledEdge(info.scce.cinco.product.features.features.FeatureContainer) <em>Can New Labeled Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New Labeled Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#canNewLabeledEdge(info.scce.cinco.product.features.features.FeatureContainer)
	 * @generated
	 */
	EOperation getDocNode__CanNewLabeledEdge__FeatureContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#newLabeledEdge(info.scce.cinco.product.features.features.FeatureContainer) <em>New Labeled Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Labeled Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#newLabeledEdge(info.scce.cinco.product.features.features.FeatureContainer)
	 * @generated
	 */
	EOperation getDocNode__NewLabeledEdge__FeatureContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#newLabeledEdge(info.scce.cinco.product.features.features.FeatureContainer, java.lang.String) <em>New Labeled Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Labeled Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#newLabeledEdge(info.scce.cinco.product.features.features.FeatureContainer, java.lang.String)
	 * @generated
	 */
	EOperation getDocNode__NewLabeledEdge__FeatureContainer_String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#canNewLabeledEdge(info.scce.cinco.product.features.features.EndNode) <em>Can New Labeled Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New Labeled Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#canNewLabeledEdge(info.scce.cinco.product.features.features.EndNode)
	 * @generated
	 */
	EOperation getDocNode__CanNewLabeledEdge__EndNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#newLabeledEdge(info.scce.cinco.product.features.features.EndNode) <em>New Labeled Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Labeled Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#newLabeledEdge(info.scce.cinco.product.features.features.EndNode)
	 * @generated
	 */
	EOperation getDocNode__NewLabeledEdge__EndNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#newLabeledEdge(info.scce.cinco.product.features.features.EndNode, java.lang.String) <em>New Labeled Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Labeled Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#newLabeledEdge(info.scce.cinco.product.features.features.EndNode, java.lang.String)
	 * @generated
	 */
	EOperation getDocNode__NewLabeledEdge__EndNode_String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#canMoveTo(info.scce.cinco.product.features.features.FeaturesGraphModel, int, int) <em>Can Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Move To</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#canMoveTo(info.scce.cinco.product.features.features.FeaturesGraphModel, int, int)
	 * @generated
	 */
	EOperation getDocNode__CanMoveTo__FeaturesGraphModel_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#moveTo(info.scce.cinco.product.features.features.FeaturesGraphModel, int, int) <em>Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#moveTo(info.scce.cinco.product.features.features.FeaturesGraphModel, int, int)
	 * @generated
	 */
	EOperation getDocNode__MoveTo__FeaturesGraphModel_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#s_moveTo(info.scce.cinco.product.features.features.FeaturesGraphModel, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#s_moveTo(info.scce.cinco.product.features.features.FeaturesGraphModel, int, int)
	 * @generated
	 */
	EOperation getDocNode__S_moveTo__FeaturesGraphModel_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#canMoveTo(info.scce.cinco.product.features.features.FeatureContainer, int, int) <em>Can Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Move To</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#canMoveTo(info.scce.cinco.product.features.features.FeatureContainer, int, int)
	 * @generated
	 */
	EOperation getDocNode__CanMoveTo__FeatureContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#moveTo(info.scce.cinco.product.features.features.FeatureContainer, int, int) <em>Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#moveTo(info.scce.cinco.product.features.features.FeatureContainer, int, int)
	 * @generated
	 */
	EOperation getDocNode__MoveTo__FeatureContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#s_moveTo(info.scce.cinco.product.features.features.FeatureContainer, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#s_moveTo(info.scce.cinco.product.features.features.FeatureContainer, int, int)
	 * @generated
	 */
	EOperation getDocNode__S_moveTo__FeatureContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#getMgl() <em>Get Mgl</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Mgl</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#getMgl()
	 * @generated
	 */
	EOperation getDocNode__GetMgl();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#getLibraryComponentUID() <em>Get Library Component UID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Library Component UID</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#getLibraryComponentUID()
	 * @generated
	 */
	EOperation getDocNode__GetLibraryComponentUID();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#setLibraryComponentUID(java.lang.String) <em>Set Library Component UID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Library Component UID</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#setLibraryComponentUID(java.lang.String)
	 * @generated
	 */
	EOperation getDocNode__SetLibraryComponentUID__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.DocNode#getDocNodeView() <em>Get Doc Node View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Doc Node View</em>' operation.
	 * @see info.scce.cinco.product.features.features.DocNode#getDocNodeView()
	 * @generated
	 */
	EOperation getDocNode__GetDocNodeView();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.features.features.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see info.scce.cinco.product.features.features.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.Edge#getInternalEdge() <em>Get Internal Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Internal Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.Edge#getInternalEdge()
	 * @generated
	 */
	EOperation getEdge__GetInternalEdge();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.Edge#isExactlyEdge() <em>Is Exactly Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Exactly Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.Edge#isExactlyEdge()
	 * @generated
	 */
	EOperation getEdge__IsExactlyEdge();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.Edge#preDelete() <em>Pre Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Delete</em>' operation.
	 * @see info.scce.cinco.product.features.features.Edge#preDelete()
	 * @generated
	 */
	EOperation getEdge__PreDelete();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.Edge#getPostDeleteFunction() <em>Get Post Delete Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Function</em>' operation.
	 * @see info.scce.cinco.product.features.features.Edge#getPostDeleteFunction()
	 * @generated
	 */
	EOperation getEdge__GetPostDeleteFunction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.Edge#getPostDeleteEvent() <em>Get Post Delete Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Event</em>' operation.
	 * @see info.scce.cinco.product.features.features.Edge#getPostDeleteEvent()
	 * @generated
	 */
	EOperation getEdge__GetPostDeleteEvent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.Edge#preSave() <em>Pre Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Save</em>' operation.
	 * @see info.scce.cinco.product.features.features.Edge#preSave()
	 * @generated
	 */
	EOperation getEdge__PreSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.Edge#postSave() <em>Post Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Save</em>' operation.
	 * @see info.scce.cinco.product.features.features.Edge#postSave()
	 * @generated
	 */
	EOperation getEdge__PostSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.Edge#getRootElement() <em>Get Root Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root Element</em>' operation.
	 * @see info.scce.cinco.product.features.features.Edge#getRootElement()
	 * @generated
	 */
	EOperation getEdge__GetRootElement();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.Edge#getSourceElement() <em>Get Source Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Source Element</em>' operation.
	 * @see info.scce.cinco.product.features.features.Edge#getSourceElement()
	 * @generated
	 */
	EOperation getEdge__GetSourceElement();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.Edge#getTargetElement() <em>Get Target Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Target Element</em>' operation.
	 * @see info.scce.cinco.product.features.features.Edge#getTargetElement()
	 * @generated
	 */
	EOperation getEdge__GetTargetElement();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.Edge#canReconnectSource(info.scce.cinco.product.features.features.StartNode) <em>Can Reconnect Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Reconnect Source</em>' operation.
	 * @see info.scce.cinco.product.features.features.Edge#canReconnectSource(info.scce.cinco.product.features.features.StartNode)
	 * @generated
	 */
	EOperation getEdge__CanReconnectSource__StartNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.Edge#reconnectSource(info.scce.cinco.product.features.features.StartNode) <em>Reconnect Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reconnect Source</em>' operation.
	 * @see info.scce.cinco.product.features.features.Edge#reconnectSource(info.scce.cinco.product.features.features.StartNode)
	 * @generated
	 */
	EOperation getEdge__ReconnectSource__StartNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.Edge#canReconnectSource(info.scce.cinco.product.features.features.FeatureContainer) <em>Can Reconnect Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Reconnect Source</em>' operation.
	 * @see info.scce.cinco.product.features.features.Edge#canReconnectSource(info.scce.cinco.product.features.features.FeatureContainer)
	 * @generated
	 */
	EOperation getEdge__CanReconnectSource__FeatureContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.Edge#reconnectSource(info.scce.cinco.product.features.features.FeatureContainer) <em>Reconnect Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reconnect Source</em>' operation.
	 * @see info.scce.cinco.product.features.features.Edge#reconnectSource(info.scce.cinco.product.features.features.FeatureContainer)
	 * @generated
	 */
	EOperation getEdge__ReconnectSource__FeatureContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.Edge#canReconnectSource(info.scce.cinco.product.features.features.DocNode) <em>Can Reconnect Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Reconnect Source</em>' operation.
	 * @see info.scce.cinco.product.features.features.Edge#canReconnectSource(info.scce.cinco.product.features.features.DocNode)
	 * @generated
	 */
	EOperation getEdge__CanReconnectSource__DocNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.Edge#reconnectSource(info.scce.cinco.product.features.features.DocNode) <em>Reconnect Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reconnect Source</em>' operation.
	 * @see info.scce.cinco.product.features.features.Edge#reconnectSource(info.scce.cinco.product.features.features.DocNode)
	 * @generated
	 */
	EOperation getEdge__ReconnectSource__DocNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.Edge#canReconnectTarget(info.scce.cinco.product.features.features.DocNode) <em>Can Reconnect Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Reconnect Target</em>' operation.
	 * @see info.scce.cinco.product.features.features.Edge#canReconnectTarget(info.scce.cinco.product.features.features.DocNode)
	 * @generated
	 */
	EOperation getEdge__CanReconnectTarget__DocNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.Edge#reconnectTarget(info.scce.cinco.product.features.features.DocNode) <em>Reconnect Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reconnect Target</em>' operation.
	 * @see info.scce.cinco.product.features.features.Edge#reconnectTarget(info.scce.cinco.product.features.features.DocNode)
	 * @generated
	 */
	EOperation getEdge__ReconnectTarget__DocNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.Edge#canReconnectTarget(info.scce.cinco.product.features.features.FeatureContainer) <em>Can Reconnect Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Reconnect Target</em>' operation.
	 * @see info.scce.cinco.product.features.features.Edge#canReconnectTarget(info.scce.cinco.product.features.features.FeatureContainer)
	 * @generated
	 */
	EOperation getEdge__CanReconnectTarget__FeatureContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.Edge#reconnectTarget(info.scce.cinco.product.features.features.FeatureContainer) <em>Reconnect Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reconnect Target</em>' operation.
	 * @see info.scce.cinco.product.features.features.Edge#reconnectTarget(info.scce.cinco.product.features.features.FeatureContainer)
	 * @generated
	 */
	EOperation getEdge__ReconnectTarget__FeatureContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.Edge#canReconnectTarget(info.scce.cinco.product.features.features.EndNode) <em>Can Reconnect Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Reconnect Target</em>' operation.
	 * @see info.scce.cinco.product.features.features.Edge#canReconnectTarget(info.scce.cinco.product.features.features.EndNode)
	 * @generated
	 */
	EOperation getEdge__CanReconnectTarget__EndNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.Edge#reconnectTarget(info.scce.cinco.product.features.features.EndNode) <em>Reconnect Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reconnect Target</em>' operation.
	 * @see info.scce.cinco.product.features.features.Edge#reconnectTarget(info.scce.cinco.product.features.features.EndNode)
	 * @generated
	 */
	EOperation getEdge__ReconnectTarget__EndNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.Edge#getEdgeView() <em>Get Edge View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge View</em>' operation.
	 * @see info.scce.cinco.product.features.features.Edge#getEdgeView()
	 * @generated
	 */
	EOperation getEdge__GetEdgeView();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.features.features.LabeledEdge <em>Labeled Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labeled Edge</em>'.
	 * @see info.scce.cinco.product.features.features.LabeledEdge
	 * @generated
	 */
	EClass getLabeledEdge();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.LabeledEdge#getLabel() <em>Get Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Label</em>' operation.
	 * @see info.scce.cinco.product.features.features.LabeledEdge#getLabel()
	 * @generated
	 */
	EOperation getLabeledEdge__GetLabel();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.LabeledEdge#setLabel(java.lang.String) <em>Set Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Label</em>' operation.
	 * @see info.scce.cinco.product.features.features.LabeledEdge#setLabel(java.lang.String)
	 * @generated
	 */
	EOperation getLabeledEdge__SetLabel__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.LabeledEdge#getInternalLabeledEdge() <em>Get Internal Labeled Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Internal Labeled Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.LabeledEdge#getInternalLabeledEdge()
	 * @generated
	 */
	EOperation getLabeledEdge__GetInternalLabeledEdge();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.LabeledEdge#isExactlyLabeledEdge() <em>Is Exactly Labeled Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Exactly Labeled Edge</em>' operation.
	 * @see info.scce.cinco.product.features.features.LabeledEdge#isExactlyLabeledEdge()
	 * @generated
	 */
	EOperation getLabeledEdge__IsExactlyLabeledEdge();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.LabeledEdge#preDelete() <em>Pre Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Delete</em>' operation.
	 * @see info.scce.cinco.product.features.features.LabeledEdge#preDelete()
	 * @generated
	 */
	EOperation getLabeledEdge__PreDelete();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.LabeledEdge#getPostDeleteFunction() <em>Get Post Delete Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Function</em>' operation.
	 * @see info.scce.cinco.product.features.features.LabeledEdge#getPostDeleteFunction()
	 * @generated
	 */
	EOperation getLabeledEdge__GetPostDeleteFunction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.LabeledEdge#getPostDeleteEvent() <em>Get Post Delete Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Event</em>' operation.
	 * @see info.scce.cinco.product.features.features.LabeledEdge#getPostDeleteEvent()
	 * @generated
	 */
	EOperation getLabeledEdge__GetPostDeleteEvent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.LabeledEdge#preSave() <em>Pre Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Save</em>' operation.
	 * @see info.scce.cinco.product.features.features.LabeledEdge#preSave()
	 * @generated
	 */
	EOperation getLabeledEdge__PreSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.LabeledEdge#postSave() <em>Post Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Save</em>' operation.
	 * @see info.scce.cinco.product.features.features.LabeledEdge#postSave()
	 * @generated
	 */
	EOperation getLabeledEdge__PostSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.LabeledEdge#getRootElement() <em>Get Root Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root Element</em>' operation.
	 * @see info.scce.cinco.product.features.features.LabeledEdge#getRootElement()
	 * @generated
	 */
	EOperation getLabeledEdge__GetRootElement();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.LabeledEdge#getSourceElement() <em>Get Source Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Source Element</em>' operation.
	 * @see info.scce.cinco.product.features.features.LabeledEdge#getSourceElement()
	 * @generated
	 */
	EOperation getLabeledEdge__GetSourceElement();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.LabeledEdge#getTargetElement() <em>Get Target Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Target Element</em>' operation.
	 * @see info.scce.cinco.product.features.features.LabeledEdge#getTargetElement()
	 * @generated
	 */
	EOperation getLabeledEdge__GetTargetElement();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.LabeledEdge#canReconnectSource(info.scce.cinco.product.features.features.StartNode) <em>Can Reconnect Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Reconnect Source</em>' operation.
	 * @see info.scce.cinco.product.features.features.LabeledEdge#canReconnectSource(info.scce.cinco.product.features.features.StartNode)
	 * @generated
	 */
	EOperation getLabeledEdge__CanReconnectSource__StartNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.LabeledEdge#reconnectSource(info.scce.cinco.product.features.features.StartNode) <em>Reconnect Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reconnect Source</em>' operation.
	 * @see info.scce.cinco.product.features.features.LabeledEdge#reconnectSource(info.scce.cinco.product.features.features.StartNode)
	 * @generated
	 */
	EOperation getLabeledEdge__ReconnectSource__StartNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.LabeledEdge#canReconnectSource(info.scce.cinco.product.features.features.FeatureContainer) <em>Can Reconnect Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Reconnect Source</em>' operation.
	 * @see info.scce.cinco.product.features.features.LabeledEdge#canReconnectSource(info.scce.cinco.product.features.features.FeatureContainer)
	 * @generated
	 */
	EOperation getLabeledEdge__CanReconnectSource__FeatureContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.LabeledEdge#reconnectSource(info.scce.cinco.product.features.features.FeatureContainer) <em>Reconnect Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reconnect Source</em>' operation.
	 * @see info.scce.cinco.product.features.features.LabeledEdge#reconnectSource(info.scce.cinco.product.features.features.FeatureContainer)
	 * @generated
	 */
	EOperation getLabeledEdge__ReconnectSource__FeatureContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.LabeledEdge#canReconnectSource(info.scce.cinco.product.features.features.DocNode) <em>Can Reconnect Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Reconnect Source</em>' operation.
	 * @see info.scce.cinco.product.features.features.LabeledEdge#canReconnectSource(info.scce.cinco.product.features.features.DocNode)
	 * @generated
	 */
	EOperation getLabeledEdge__CanReconnectSource__DocNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.LabeledEdge#reconnectSource(info.scce.cinco.product.features.features.DocNode) <em>Reconnect Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reconnect Source</em>' operation.
	 * @see info.scce.cinco.product.features.features.LabeledEdge#reconnectSource(info.scce.cinco.product.features.features.DocNode)
	 * @generated
	 */
	EOperation getLabeledEdge__ReconnectSource__DocNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.LabeledEdge#canReconnectTarget(info.scce.cinco.product.features.features.DocNode) <em>Can Reconnect Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Reconnect Target</em>' operation.
	 * @see info.scce.cinco.product.features.features.LabeledEdge#canReconnectTarget(info.scce.cinco.product.features.features.DocNode)
	 * @generated
	 */
	EOperation getLabeledEdge__CanReconnectTarget__DocNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.LabeledEdge#reconnectTarget(info.scce.cinco.product.features.features.DocNode) <em>Reconnect Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reconnect Target</em>' operation.
	 * @see info.scce.cinco.product.features.features.LabeledEdge#reconnectTarget(info.scce.cinco.product.features.features.DocNode)
	 * @generated
	 */
	EOperation getLabeledEdge__ReconnectTarget__DocNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.LabeledEdge#canReconnectTarget(info.scce.cinco.product.features.features.FeatureContainer) <em>Can Reconnect Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Reconnect Target</em>' operation.
	 * @see info.scce.cinco.product.features.features.LabeledEdge#canReconnectTarget(info.scce.cinco.product.features.features.FeatureContainer)
	 * @generated
	 */
	EOperation getLabeledEdge__CanReconnectTarget__FeatureContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.LabeledEdge#reconnectTarget(info.scce.cinco.product.features.features.FeatureContainer) <em>Reconnect Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reconnect Target</em>' operation.
	 * @see info.scce.cinco.product.features.features.LabeledEdge#reconnectTarget(info.scce.cinco.product.features.features.FeatureContainer)
	 * @generated
	 */
	EOperation getLabeledEdge__ReconnectTarget__FeatureContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.LabeledEdge#canReconnectTarget(info.scce.cinco.product.features.features.EndNode) <em>Can Reconnect Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Reconnect Target</em>' operation.
	 * @see info.scce.cinco.product.features.features.LabeledEdge#canReconnectTarget(info.scce.cinco.product.features.features.EndNode)
	 * @generated
	 */
	EOperation getLabeledEdge__CanReconnectTarget__EndNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.LabeledEdge#reconnectTarget(info.scce.cinco.product.features.features.EndNode) <em>Reconnect Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reconnect Target</em>' operation.
	 * @see info.scce.cinco.product.features.features.LabeledEdge#reconnectTarget(info.scce.cinco.product.features.features.EndNode)
	 * @generated
	 */
	EOperation getLabeledEdge__ReconnectTarget__EndNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.LabeledEdge#getLabeledEdgeView() <em>Get Labeled Edge View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Labeled Edge View</em>' operation.
	 * @see info.scce.cinco.product.features.features.LabeledEdge#getLabeledEdgeView()
	 * @generated
	 */
	EOperation getLabeledEdge__GetLabeledEdgeView();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.features.features.FeaturesGraphModel <em>Graph Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Model</em>'.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel
	 * @generated
	 */
	EClass getFeaturesGraphModel();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#getName()
	 * @generated
	 */
	EOperation getFeaturesGraphModel__GetName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#setName(java.lang.String)
	 * @generated
	 */
	EOperation getFeaturesGraphModel__SetName__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#getInternalFeaturesGraphModel() <em>Get Internal Features Graph Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Internal Features Graph Model</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#getInternalFeaturesGraphModel()
	 * @generated
	 */
	EOperation getFeaturesGraphModel__GetInternalFeaturesGraphModel();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#isExactlyFeaturesGraphModel() <em>Is Exactly Features Graph Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Exactly Features Graph Model</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#isExactlyFeaturesGraphModel()
	 * @generated
	 */
	EOperation getFeaturesGraphModel__IsExactlyFeaturesGraphModel();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#preDelete() <em>Pre Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Delete</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#preDelete()
	 * @generated
	 */
	EOperation getFeaturesGraphModel__PreDelete();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#getPostDeleteFunction() <em>Get Post Delete Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Function</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#getPostDeleteFunction()
	 * @generated
	 */
	EOperation getFeaturesGraphModel__GetPostDeleteFunction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#getPostDeleteEvent() <em>Get Post Delete Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Event</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#getPostDeleteEvent()
	 * @generated
	 */
	EOperation getFeaturesGraphModel__GetPostDeleteEvent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#preSave() <em>Pre Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Save</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#preSave()
	 * @generated
	 */
	EOperation getFeaturesGraphModel__PreSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#postSave() <em>Post Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Save</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#postSave()
	 * @generated
	 */
	EOperation getFeaturesGraphModel__PostSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#getRootElement() <em>Get Root Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root Element</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#getRootElement()
	 * @generated
	 */
	EOperation getFeaturesGraphModel__GetRootElement();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#getNodes() <em>Get Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nodes</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#getNodes()
	 * @generated
	 */
	EOperation getFeaturesGraphModel__GetNodes();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#getStartNodes() <em>Get Start Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Start Nodes</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#getStartNodes()
	 * @generated
	 */
	EOperation getFeaturesGraphModel__GetStartNodes();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#canNewStartNode() <em>Can New Start Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New Start Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#canNewStartNode()
	 * @generated
	 */
	EOperation getFeaturesGraphModel__CanNewStartNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#newStartNode(int, int) <em>New Start Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Start Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#newStartNode(int, int)
	 * @generated
	 */
	EOperation getFeaturesGraphModel__NewStartNode__int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#newStartNode(java.lang.String, int, int) <em>New Start Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Start Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#newStartNode(java.lang.String, int, int)
	 * @generated
	 */
	EOperation getFeaturesGraphModel__NewStartNode__String_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#newStartNode(int, int, int, int) <em>New Start Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Start Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#newStartNode(int, int, int, int)
	 * @generated
	 */
	EOperation getFeaturesGraphModel__NewStartNode__int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#newStartNode(java.lang.String, int, int, int, int) <em>New Start Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Start Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#newStartNode(java.lang.String, int, int, int, int)
	 * @generated
	 */
	EOperation getFeaturesGraphModel__NewStartNode__String_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#getDocNodes() <em>Get Doc Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Doc Nodes</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#getDocNodes()
	 * @generated
	 */
	EOperation getFeaturesGraphModel__GetDocNodes();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#canNewDocNode() <em>Can New Doc Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New Doc Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#canNewDocNode()
	 * @generated
	 */
	EOperation getFeaturesGraphModel__CanNewDocNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#newDocNode(org.eclipse.emf.ecore.EObject, int, int) <em>New Doc Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Doc Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#newDocNode(org.eclipse.emf.ecore.EObject, int, int)
	 * @generated
	 */
	EOperation getFeaturesGraphModel__NewDocNode__EObject_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#newDocNode(org.eclipse.emf.ecore.EObject, java.lang.String, int, int) <em>New Doc Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Doc Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#newDocNode(org.eclipse.emf.ecore.EObject, java.lang.String, int, int)
	 * @generated
	 */
	EOperation getFeaturesGraphModel__NewDocNode__EObject_String_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#newDocNode(org.eclipse.emf.ecore.EObject, int, int, int, int) <em>New Doc Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Doc Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#newDocNode(org.eclipse.emf.ecore.EObject, int, int, int, int)
	 * @generated
	 */
	EOperation getFeaturesGraphModel__NewDocNode__EObject_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#newDocNode(org.eclipse.emf.ecore.EObject, java.lang.String, int, int, int, int) <em>New Doc Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Doc Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#newDocNode(org.eclipse.emf.ecore.EObject, java.lang.String, int, int, int, int)
	 * @generated
	 */
	EOperation getFeaturesGraphModel__NewDocNode__EObject_String_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#getFeatureContainers() <em>Get Feature Containers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feature Containers</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#getFeatureContainers()
	 * @generated
	 */
	EOperation getFeaturesGraphModel__GetFeatureContainers();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#canNewFeatureContainer() <em>Can New Feature Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New Feature Container</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#canNewFeatureContainer()
	 * @generated
	 */
	EOperation getFeaturesGraphModel__CanNewFeatureContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#newFeatureContainer(int, int) <em>New Feature Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Feature Container</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#newFeatureContainer(int, int)
	 * @generated
	 */
	EOperation getFeaturesGraphModel__NewFeatureContainer__int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#newFeatureContainer(java.lang.String, int, int) <em>New Feature Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Feature Container</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#newFeatureContainer(java.lang.String, int, int)
	 * @generated
	 */
	EOperation getFeaturesGraphModel__NewFeatureContainer__String_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#newFeatureContainer(int, int, int, int) <em>New Feature Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Feature Container</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#newFeatureContainer(int, int, int, int)
	 * @generated
	 */
	EOperation getFeaturesGraphModel__NewFeatureContainer__int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#newFeatureContainer(java.lang.String, int, int, int, int) <em>New Feature Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Feature Container</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#newFeatureContainer(java.lang.String, int, int, int, int)
	 * @generated
	 */
	EOperation getFeaturesGraphModel__NewFeatureContainer__String_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#getEndNodes() <em>Get End Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get End Nodes</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#getEndNodes()
	 * @generated
	 */
	EOperation getFeaturesGraphModel__GetEndNodes();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#canNewEndNode() <em>Can New End Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New End Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#canNewEndNode()
	 * @generated
	 */
	EOperation getFeaturesGraphModel__CanNewEndNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#newEndNode(int, int) <em>New End Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New End Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#newEndNode(int, int)
	 * @generated
	 */
	EOperation getFeaturesGraphModel__NewEndNode__int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#newEndNode(java.lang.String, int, int) <em>New End Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New End Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#newEndNode(java.lang.String, int, int)
	 * @generated
	 */
	EOperation getFeaturesGraphModel__NewEndNode__String_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#newEndNode(int, int, int, int) <em>New End Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New End Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#newEndNode(int, int, int, int)
	 * @generated
	 */
	EOperation getFeaturesGraphModel__NewEndNode__int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#newEndNode(java.lang.String, int, int, int, int) <em>New End Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New End Node</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#newEndNode(java.lang.String, int, int, int, int)
	 * @generated
	 */
	EOperation getFeaturesGraphModel__NewEndNode__String_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#newFeaturesGraphModel(java.lang.String, java.lang.String, boolean) <em>New Features Graph Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Features Graph Model</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#newFeaturesGraphModel(java.lang.String, java.lang.String, boolean)
	 * @generated
	 */
	EOperation getFeaturesGraphModel__NewFeaturesGraphModel__String_String_boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.features.features.FeaturesGraphModel#getFeaturesGraphModelView() <em>Get Features Graph Model View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Features Graph Model View</em>' operation.
	 * @see info.scce.cinco.product.features.features.FeaturesGraphModel#getFeaturesGraphModelView()
	 * @generated
	 */
	EOperation getFeaturesGraphModel__GetFeaturesGraphModelView();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FeaturesFactory getFeaturesFactory();

} //FeaturesPackage
