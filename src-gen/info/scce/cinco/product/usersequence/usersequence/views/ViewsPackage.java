/**
 */
package info.scce.cinco.product.usersequence.usersequence.views;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see info.scce.cinco.product.usersequence.usersequence.views.ViewsFactory
 * @model kind="package"
 * @generated
 */
public interface ViewsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "views";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cinco.scce.info/product/usersequence/views";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "usersequence-views";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViewsPackage eINSTANCE = info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl.init();

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.StartViewImpl <em>Start View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.StartViewImpl
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getStartView()
	 * @generated
	 */
	int START_VIEW = 0;

	/**
	 * The feature id for the '<em><b>Internal Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_VIEW__INTERNAL_START = 0;

	/**
	 * The number of structural features of the '<em>Start View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_VIEW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Start View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.StopViewImpl <em>Stop View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.StopViewImpl
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getStopView()
	 * @generated
	 */
	int STOP_VIEW = 1;

	/**
	 * The feature id for the '<em><b>Internal Stop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_VIEW__INTERNAL_STOP = 0;

	/**
	 * The number of structural features of the '<em>Stop View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_VIEW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Stop View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.SubSequenceViewImpl <em>Sub Sequence View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.SubSequenceViewImpl
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getSubSequenceView()
	 * @generated
	 */
	int SUB_SEQUENCE_VIEW = 2;

	/**
	 * The feature id for the '<em><b>Internal Sub Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SEQUENCE_VIEW__INTERNAL_SUB_SEQUENCE = 0;

	/**
	 * The number of structural features of the '<em>Sub Sequence View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SEQUENCE_VIEW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sub Sequence View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SEQUENCE_VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.BaseURLViewImpl <em>Base URL View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.BaseURLViewImpl
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getBaseURLView()
	 * @generated
	 */
	int BASE_URL_VIEW = 3;

	/**
	 * The feature id for the '<em><b>Internal Base URL</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_URL_VIEW__INTERNAL_BASE_URL = 0;

	/**
	 * The number of structural features of the '<em>Base URL View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_URL_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_URL_VIEW___GET_CONTENT = 0;

	/**
	 * The operation id for the '<em>Set Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_URL_VIEW___SET_CONTENT__STRING = 1;

	/**
	 * The number of operations of the '<em>Base URL View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_URL_VIEW_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.DomainViewImpl <em>Domain View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.DomainViewImpl
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getDomainView()
	 * @generated
	 */
	int DOMAIN_VIEW = 4;

	/**
	 * The feature id for the '<em><b>Internal Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_VIEW__INTERNAL_DOMAIN = 0;

	/**
	 * The number of structural features of the '<em>Domain View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_VIEW___GET_CONTENT = 0;

	/**
	 * The operation id for the '<em>Set Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_VIEW___SET_CONTENT__STRING = 1;

	/**
	 * The number of operations of the '<em>Domain View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_VIEW_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.KeyValueViewImpl <em>Key Value View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.KeyValueViewImpl
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getKeyValueView()
	 * @generated
	 */
	int KEY_VALUE_VIEW = 5;

	/**
	 * The feature id for the '<em><b>Internal Key Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_VIEW__INTERNAL_KEY_VALUE = 0;

	/**
	 * The number of structural features of the '<em>Key Value View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_VIEW___GET_VALUE = 0;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_VIEW___SET_VALUE__STRING = 1;

	/**
	 * The operation id for the '<em>Get Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_VIEW___GET_KEY = 2;

	/**
	 * The operation id for the '<em>Set Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_VIEW___SET_KEY__STRING = 3;

	/**
	 * The number of operations of the '<em>Key Value View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_VIEW_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.ScreenshotViewImpl <em>Screenshot View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ScreenshotViewImpl
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getScreenshotView()
	 * @generated
	 */
	int SCREENSHOT_VIEW = 6;

	/**
	 * The feature id for the '<em><b>Internal Screenshot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREENSHOT_VIEW__INTERNAL_SCREENSHOT = 0;

	/**
	 * The number of structural features of the '<em>Screenshot View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREENSHOT_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREENSHOT_VIEW___GET_DESCRIPTION = 0;

	/**
	 * The operation id for the '<em>Set Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREENSHOT_VIEW___SET_DESCRIPTION__COMMENT = 1;

	/**
	 * The number of operations of the '<em>Screenshot View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREENSHOT_VIEW_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.SectionNodeViewImpl <em>Section Node View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.SectionNodeViewImpl
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getSectionNodeView()
	 * @generated
	 */
	int SECTION_NODE_VIEW = 7;

	/**
	 * The feature id for the '<em><b>Internal Section Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_NODE_VIEW__INTERNAL_SECTION_NODE = 0;

	/**
	 * The number of structural features of the '<em>Section Node View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_NODE_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_NODE_VIEW___GET_TITLE = 0;

	/**
	 * The operation id for the '<em>Set Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_NODE_VIEW___SET_TITLE__STRING = 1;

	/**
	 * The number of operations of the '<em>Section Node View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_NODE_VIEW_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.NavigationViewImpl <em>Navigation View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.NavigationViewImpl
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getNavigationView()
	 * @generated
	 */
	int NAVIGATION_VIEW = 8;

	/**
	 * The feature id for the '<em><b>Internal Navigation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_VIEW__INTERNAL_NAVIGATION = 0;

	/**
	 * The number of structural features of the '<em>Navigation View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Link</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_VIEW___GET_LINK = 0;

	/**
	 * The operation id for the '<em>Set Link</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_VIEW___SET_LINK__STRING = 1;

	/**
	 * The number of operations of the '<em>Navigation View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_VIEW_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.WebElementViewImpl <em>Web Element View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.WebElementViewImpl
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getWebElementView()
	 * @generated
	 */
	int WEB_ELEMENT_VIEW = 9;

	/**
	 * The feature id for the '<em><b>Internal Web Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ELEMENT_VIEW__INTERNAL_WEB_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Web Element View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ELEMENT_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Is Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ELEMENT_VIEW___IS_IS_HIGHLIGHTED = 0;

	/**
	 * The operation id for the '<em>Set Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ELEMENT_VIEW___SET_IS_HIGHLIGHTED__BOOLEAN = 1;

	/**
	 * The operation id for the '<em>Get Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ELEMENT_VIEW___GET_CONTENT_TEXT = 2;

	/**
	 * The operation id for the '<em>Set Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ELEMENT_VIEW___SET_CONTENT_TEXT__STRING = 3;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ELEMENT_VIEW___GET_ATTRIBUTE = 4;

	/**
	 * The operation id for the '<em>Set Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ELEMENT_VIEW___SET_ATTRIBUTE__STRING = 5;

	/**
	 * The operation id for the '<em>Get Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ELEMENT_VIEW___GET_ATTR_VALUE = 6;

	/**
	 * The operation id for the '<em>Set Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ELEMENT_VIEW___SET_ATTR_VALUE__STRING = 7;

	/**
	 * The operation id for the '<em>Get Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ELEMENT_VIEW___GET_TAG_NAME = 8;

	/**
	 * The operation id for the '<em>Set Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ELEMENT_VIEW___SET_TAG_NAME__STRING = 9;

	/**
	 * The number of operations of the '<em>Web Element View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ELEMENT_VIEW_OPERATION_COUNT = 10;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.DivViewImpl <em>Div View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.DivViewImpl
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getDivView()
	 * @generated
	 */
	int DIV_VIEW = 10;

	/**
	 * The feature id for the '<em><b>Internal Web Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_VIEW__INTERNAL_WEB_ELEMENT = WEB_ELEMENT_VIEW__INTERNAL_WEB_ELEMENT;

	/**
	 * The feature id for the '<em><b>Internal Div</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_VIEW__INTERNAL_DIV = WEB_ELEMENT_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Div View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_VIEW_FEATURE_COUNT = WEB_ELEMENT_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_VIEW___IS_IS_HIGHLIGHTED = WEB_ELEMENT_VIEW___IS_IS_HIGHLIGHTED;

	/**
	 * The operation id for the '<em>Set Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_VIEW___SET_IS_HIGHLIGHTED__BOOLEAN = WEB_ELEMENT_VIEW___SET_IS_HIGHLIGHTED__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_VIEW___GET_CONTENT_TEXT = WEB_ELEMENT_VIEW___GET_CONTENT_TEXT;

	/**
	 * The operation id for the '<em>Set Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_VIEW___SET_CONTENT_TEXT__STRING = WEB_ELEMENT_VIEW___SET_CONTENT_TEXT__STRING;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_VIEW___GET_ATTRIBUTE = WEB_ELEMENT_VIEW___GET_ATTRIBUTE;

	/**
	 * The operation id for the '<em>Set Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_VIEW___SET_ATTRIBUTE__STRING = WEB_ELEMENT_VIEW___SET_ATTRIBUTE__STRING;

	/**
	 * The operation id for the '<em>Get Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_VIEW___GET_ATTR_VALUE = WEB_ELEMENT_VIEW___GET_ATTR_VALUE;

	/**
	 * The operation id for the '<em>Set Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_VIEW___SET_ATTR_VALUE__STRING = WEB_ELEMENT_VIEW___SET_ATTR_VALUE__STRING;

	/**
	 * The operation id for the '<em>Get Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_VIEW___GET_TAG_NAME = WEB_ELEMENT_VIEW___GET_TAG_NAME;

	/**
	 * The operation id for the '<em>Set Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_VIEW___SET_TAG_NAME__STRING = WEB_ELEMENT_VIEW___SET_TAG_NAME__STRING;

	/**
	 * The number of operations of the '<em>Div View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_VIEW_OPERATION_COUNT = WEB_ELEMENT_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.HViewImpl <em>HView</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.HViewImpl
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getHView()
	 * @generated
	 */
	int HVIEW = 11;

	/**
	 * The feature id for the '<em><b>Internal Web Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVIEW__INTERNAL_WEB_ELEMENT = WEB_ELEMENT_VIEW__INTERNAL_WEB_ELEMENT;

	/**
	 * The feature id for the '<em><b>Internal H</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVIEW__INTERNAL_H = WEB_ELEMENT_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HView</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVIEW_FEATURE_COUNT = WEB_ELEMENT_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVIEW___IS_IS_HIGHLIGHTED = WEB_ELEMENT_VIEW___IS_IS_HIGHLIGHTED;

	/**
	 * The operation id for the '<em>Set Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVIEW___SET_IS_HIGHLIGHTED__BOOLEAN = WEB_ELEMENT_VIEW___SET_IS_HIGHLIGHTED__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVIEW___GET_CONTENT_TEXT = WEB_ELEMENT_VIEW___GET_CONTENT_TEXT;

	/**
	 * The operation id for the '<em>Set Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVIEW___SET_CONTENT_TEXT__STRING = WEB_ELEMENT_VIEW___SET_CONTENT_TEXT__STRING;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVIEW___GET_ATTRIBUTE = WEB_ELEMENT_VIEW___GET_ATTRIBUTE;

	/**
	 * The operation id for the '<em>Set Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVIEW___SET_ATTRIBUTE__STRING = WEB_ELEMENT_VIEW___SET_ATTRIBUTE__STRING;

	/**
	 * The operation id for the '<em>Get Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVIEW___GET_ATTR_VALUE = WEB_ELEMENT_VIEW___GET_ATTR_VALUE;

	/**
	 * The operation id for the '<em>Set Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVIEW___SET_ATTR_VALUE__STRING = WEB_ELEMENT_VIEW___SET_ATTR_VALUE__STRING;

	/**
	 * The operation id for the '<em>Get Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVIEW___GET_TAG_NAME = WEB_ELEMENT_VIEW___GET_TAG_NAME;

	/**
	 * The operation id for the '<em>Set Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVIEW___SET_TAG_NAME__STRING = WEB_ELEMENT_VIEW___SET_TAG_NAME__STRING;

	/**
	 * The operation id for the '<em>Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVIEW___IS_HIGHLIGHTED = WEB_ELEMENT_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVIEW___SET_HIGHLIGHTED__BOOLEAN = WEB_ELEMENT_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Ranking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVIEW___GET_RANKING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Ranking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVIEW___SET_RANKING__INT = WEB_ELEMENT_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Selector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVIEW___GET_SELECTOR = WEB_ELEMENT_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Selector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVIEW___SET_SELECTOR__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVIEW___GET_VALUE = WEB_ELEMENT_VIEW_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVIEW___SET_VALUE__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVIEW___GET_CONTENT = WEB_ELEMENT_VIEW_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Set Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVIEW___SET_CONTENT__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 9;

	/**
	 * The number of operations of the '<em>HView</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVIEW_OPERATION_COUNT = WEB_ELEMENT_VIEW_OPERATION_COUNT + 10;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.PViewImpl <em>PView</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.PViewImpl
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getPView()
	 * @generated
	 */
	int PVIEW = 12;

	/**
	 * The feature id for the '<em><b>Internal Web Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVIEW__INTERNAL_WEB_ELEMENT = WEB_ELEMENT_VIEW__INTERNAL_WEB_ELEMENT;

	/**
	 * The feature id for the '<em><b>Internal P</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVIEW__INTERNAL_P = WEB_ELEMENT_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PView</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVIEW_FEATURE_COUNT = WEB_ELEMENT_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVIEW___IS_IS_HIGHLIGHTED = WEB_ELEMENT_VIEW___IS_IS_HIGHLIGHTED;

	/**
	 * The operation id for the '<em>Set Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVIEW___SET_IS_HIGHLIGHTED__BOOLEAN = WEB_ELEMENT_VIEW___SET_IS_HIGHLIGHTED__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVIEW___GET_CONTENT_TEXT = WEB_ELEMENT_VIEW___GET_CONTENT_TEXT;

	/**
	 * The operation id for the '<em>Set Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVIEW___SET_CONTENT_TEXT__STRING = WEB_ELEMENT_VIEW___SET_CONTENT_TEXT__STRING;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVIEW___GET_ATTRIBUTE = WEB_ELEMENT_VIEW___GET_ATTRIBUTE;

	/**
	 * The operation id for the '<em>Set Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVIEW___SET_ATTRIBUTE__STRING = WEB_ELEMENT_VIEW___SET_ATTRIBUTE__STRING;

	/**
	 * The operation id for the '<em>Get Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVIEW___GET_ATTR_VALUE = WEB_ELEMENT_VIEW___GET_ATTR_VALUE;

	/**
	 * The operation id for the '<em>Set Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVIEW___SET_ATTR_VALUE__STRING = WEB_ELEMENT_VIEW___SET_ATTR_VALUE__STRING;

	/**
	 * The operation id for the '<em>Get Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVIEW___GET_TAG_NAME = WEB_ELEMENT_VIEW___GET_TAG_NAME;

	/**
	 * The operation id for the '<em>Set Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVIEW___SET_TAG_NAME__STRING = WEB_ELEMENT_VIEW___SET_TAG_NAME__STRING;

	/**
	 * The operation id for the '<em>Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVIEW___IS_HIGHLIGHTED = WEB_ELEMENT_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVIEW___SET_HIGHLIGHTED__BOOLEAN = WEB_ELEMENT_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Selector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVIEW___GET_SELECTOR = WEB_ELEMENT_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Selector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVIEW___SET_SELECTOR__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVIEW___GET_VALUE = WEB_ELEMENT_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVIEW___SET_VALUE__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVIEW___GET_CONTENT = WEB_ELEMENT_VIEW_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVIEW___SET_CONTENT__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>PView</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVIEW_OPERATION_COUNT = WEB_ELEMENT_VIEW_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.SpanViewImpl <em>Span View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.SpanViewImpl
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getSpanView()
	 * @generated
	 */
	int SPAN_VIEW = 13;

	/**
	 * The feature id for the '<em><b>Internal Web Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_VIEW__INTERNAL_WEB_ELEMENT = WEB_ELEMENT_VIEW__INTERNAL_WEB_ELEMENT;

	/**
	 * The feature id for the '<em><b>Internal Span</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_VIEW__INTERNAL_SPAN = WEB_ELEMENT_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Span View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_VIEW_FEATURE_COUNT = WEB_ELEMENT_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_VIEW___IS_IS_HIGHLIGHTED = WEB_ELEMENT_VIEW___IS_IS_HIGHLIGHTED;

	/**
	 * The operation id for the '<em>Set Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_VIEW___SET_IS_HIGHLIGHTED__BOOLEAN = WEB_ELEMENT_VIEW___SET_IS_HIGHLIGHTED__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_VIEW___GET_CONTENT_TEXT = WEB_ELEMENT_VIEW___GET_CONTENT_TEXT;

	/**
	 * The operation id for the '<em>Set Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_VIEW___SET_CONTENT_TEXT__STRING = WEB_ELEMENT_VIEW___SET_CONTENT_TEXT__STRING;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_VIEW___GET_ATTRIBUTE = WEB_ELEMENT_VIEW___GET_ATTRIBUTE;

	/**
	 * The operation id for the '<em>Set Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_VIEW___SET_ATTRIBUTE__STRING = WEB_ELEMENT_VIEW___SET_ATTRIBUTE__STRING;

	/**
	 * The operation id for the '<em>Get Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_VIEW___GET_ATTR_VALUE = WEB_ELEMENT_VIEW___GET_ATTR_VALUE;

	/**
	 * The operation id for the '<em>Set Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_VIEW___SET_ATTR_VALUE__STRING = WEB_ELEMENT_VIEW___SET_ATTR_VALUE__STRING;

	/**
	 * The operation id for the '<em>Get Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_VIEW___GET_TAG_NAME = WEB_ELEMENT_VIEW___GET_TAG_NAME;

	/**
	 * The operation id for the '<em>Set Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_VIEW___SET_TAG_NAME__STRING = WEB_ELEMENT_VIEW___SET_TAG_NAME__STRING;

	/**
	 * The operation id for the '<em>Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_VIEW___IS_HIGHLIGHTED = WEB_ELEMENT_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_VIEW___SET_HIGHLIGHTED__BOOLEAN = WEB_ELEMENT_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Selector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_VIEW___GET_SELECTOR = WEB_ELEMENT_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Selector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_VIEW___SET_SELECTOR__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_VIEW___GET_VALUE = WEB_ELEMENT_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_VIEW___SET_VALUE__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_VIEW___GET_CONTENT = WEB_ELEMENT_VIEW_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_VIEW___SET_CONTENT__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Span View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_VIEW_OPERATION_COUNT = WEB_ELEMENT_VIEW_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.LabelViewImpl <em>Label View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.LabelViewImpl
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getLabelView()
	 * @generated
	 */
	int LABEL_VIEW = 14;

	/**
	 * The feature id for the '<em><b>Internal Web Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_VIEW__INTERNAL_WEB_ELEMENT = WEB_ELEMENT_VIEW__INTERNAL_WEB_ELEMENT;

	/**
	 * The feature id for the '<em><b>Internal Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_VIEW__INTERNAL_LABEL = WEB_ELEMENT_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Label View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_VIEW_FEATURE_COUNT = WEB_ELEMENT_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_VIEW___IS_IS_HIGHLIGHTED = WEB_ELEMENT_VIEW___IS_IS_HIGHLIGHTED;

	/**
	 * The operation id for the '<em>Set Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_VIEW___SET_IS_HIGHLIGHTED__BOOLEAN = WEB_ELEMENT_VIEW___SET_IS_HIGHLIGHTED__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_VIEW___GET_CONTENT_TEXT = WEB_ELEMENT_VIEW___GET_CONTENT_TEXT;

	/**
	 * The operation id for the '<em>Set Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_VIEW___SET_CONTENT_TEXT__STRING = WEB_ELEMENT_VIEW___SET_CONTENT_TEXT__STRING;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_VIEW___GET_ATTRIBUTE = WEB_ELEMENT_VIEW___GET_ATTRIBUTE;

	/**
	 * The operation id for the '<em>Set Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_VIEW___SET_ATTRIBUTE__STRING = WEB_ELEMENT_VIEW___SET_ATTRIBUTE__STRING;

	/**
	 * The operation id for the '<em>Get Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_VIEW___GET_ATTR_VALUE = WEB_ELEMENT_VIEW___GET_ATTR_VALUE;

	/**
	 * The operation id for the '<em>Set Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_VIEW___SET_ATTR_VALUE__STRING = WEB_ELEMENT_VIEW___SET_ATTR_VALUE__STRING;

	/**
	 * The operation id for the '<em>Get Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_VIEW___GET_TAG_NAME = WEB_ELEMENT_VIEW___GET_TAG_NAME;

	/**
	 * The operation id for the '<em>Set Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_VIEW___SET_TAG_NAME__STRING = WEB_ELEMENT_VIEW___SET_TAG_NAME__STRING;

	/**
	 * The operation id for the '<em>Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_VIEW___IS_HIGHLIGHTED = WEB_ELEMENT_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_VIEW___SET_HIGHLIGHTED__BOOLEAN = WEB_ELEMENT_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Selector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_VIEW___GET_SELECTOR = WEB_ELEMENT_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Selector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_VIEW___SET_SELECTOR__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_VIEW___GET_VALUE = WEB_ELEMENT_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_VIEW___SET_VALUE__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_VIEW___GET_CONTENT = WEB_ELEMENT_VIEW_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_VIEW___SET_CONTENT__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Label View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_VIEW_OPERATION_COUNT = WEB_ELEMENT_VIEW_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.FormViewImpl <em>Form View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.FormViewImpl
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getFormView()
	 * @generated
	 */
	int FORM_VIEW = 15;

	/**
	 * The feature id for the '<em><b>Internal Web Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_VIEW__INTERNAL_WEB_ELEMENT = WEB_ELEMENT_VIEW__INTERNAL_WEB_ELEMENT;

	/**
	 * The feature id for the '<em><b>Internal Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_VIEW__INTERNAL_FORM = WEB_ELEMENT_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Form View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_VIEW_FEATURE_COUNT = WEB_ELEMENT_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_VIEW___IS_IS_HIGHLIGHTED = WEB_ELEMENT_VIEW___IS_IS_HIGHLIGHTED;

	/**
	 * The operation id for the '<em>Set Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_VIEW___SET_IS_HIGHLIGHTED__BOOLEAN = WEB_ELEMENT_VIEW___SET_IS_HIGHLIGHTED__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_VIEW___GET_CONTENT_TEXT = WEB_ELEMENT_VIEW___GET_CONTENT_TEXT;

	/**
	 * The operation id for the '<em>Set Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_VIEW___SET_CONTENT_TEXT__STRING = WEB_ELEMENT_VIEW___SET_CONTENT_TEXT__STRING;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_VIEW___GET_ATTRIBUTE = WEB_ELEMENT_VIEW___GET_ATTRIBUTE;

	/**
	 * The operation id for the '<em>Set Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_VIEW___SET_ATTRIBUTE__STRING = WEB_ELEMENT_VIEW___SET_ATTRIBUTE__STRING;

	/**
	 * The operation id for the '<em>Get Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_VIEW___GET_ATTR_VALUE = WEB_ELEMENT_VIEW___GET_ATTR_VALUE;

	/**
	 * The operation id for the '<em>Set Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_VIEW___SET_ATTR_VALUE__STRING = WEB_ELEMENT_VIEW___SET_ATTR_VALUE__STRING;

	/**
	 * The operation id for the '<em>Get Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_VIEW___GET_TAG_NAME = WEB_ELEMENT_VIEW___GET_TAG_NAME;

	/**
	 * The operation id for the '<em>Set Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_VIEW___SET_TAG_NAME__STRING = WEB_ELEMENT_VIEW___SET_TAG_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Method</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_VIEW___GET_METHOD = WEB_ELEMENT_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Method</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_VIEW___SET_METHOD__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Field</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_VIEW___GET_FIELD = WEB_ELEMENT_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Field</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_VIEW___SET_FIELD__ELIST = WEB_ELEMENT_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Add Field</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_VIEW___ADD_FIELD__INPUT = WEB_ELEMENT_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Remove Field</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_VIEW___REMOVE_FIELD__INPUT = WEB_ELEMENT_VIEW_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_VIEW___IS_HIGHLIGHTED = WEB_ELEMENT_VIEW_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_VIEW___SET_HIGHLIGHTED__BOOLEAN = WEB_ELEMENT_VIEW_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_VIEW___GET_ACTION = WEB_ELEMENT_VIEW_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Set Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_VIEW___SET_ACTION__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 9;

	/**
	 * The number of operations of the '<em>Form View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_VIEW_OPERATION_COUNT = WEB_ELEMENT_VIEW_OPERATION_COUNT + 10;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.InputViewImpl <em>Input View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.InputViewImpl
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getInputView()
	 * @generated
	 */
	int INPUT_VIEW = 16;

	/**
	 * The feature id for the '<em><b>Internal Web Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VIEW__INTERNAL_WEB_ELEMENT = WEB_ELEMENT_VIEW__INTERNAL_WEB_ELEMENT;

	/**
	 * The feature id for the '<em><b>Internal Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VIEW__INTERNAL_INPUT = WEB_ELEMENT_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VIEW_FEATURE_COUNT = WEB_ELEMENT_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VIEW___IS_IS_HIGHLIGHTED = WEB_ELEMENT_VIEW___IS_IS_HIGHLIGHTED;

	/**
	 * The operation id for the '<em>Set Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VIEW___SET_IS_HIGHLIGHTED__BOOLEAN = WEB_ELEMENT_VIEW___SET_IS_HIGHLIGHTED__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VIEW___GET_CONTENT_TEXT = WEB_ELEMENT_VIEW___GET_CONTENT_TEXT;

	/**
	 * The operation id for the '<em>Set Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VIEW___SET_CONTENT_TEXT__STRING = WEB_ELEMENT_VIEW___SET_CONTENT_TEXT__STRING;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VIEW___GET_ATTRIBUTE = WEB_ELEMENT_VIEW___GET_ATTRIBUTE;

	/**
	 * The operation id for the '<em>Set Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VIEW___SET_ATTRIBUTE__STRING = WEB_ELEMENT_VIEW___SET_ATTRIBUTE__STRING;

	/**
	 * The operation id for the '<em>Get Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VIEW___GET_ATTR_VALUE = WEB_ELEMENT_VIEW___GET_ATTR_VALUE;

	/**
	 * The operation id for the '<em>Set Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VIEW___SET_ATTR_VALUE__STRING = WEB_ELEMENT_VIEW___SET_ATTR_VALUE__STRING;

	/**
	 * The operation id for the '<em>Get Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VIEW___GET_TAG_NAME = WEB_ELEMENT_VIEW___GET_TAG_NAME;

	/**
	 * The operation id for the '<em>Set Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VIEW___SET_TAG_NAME__STRING = WEB_ELEMENT_VIEW___SET_TAG_NAME__STRING;

	/**
	 * The operation id for the '<em>Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VIEW___IS_HIGHLIGHTED = WEB_ELEMENT_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VIEW___SET_HIGHLIGHTED__BOOLEAN = WEB_ELEMENT_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Selector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VIEW___GET_SELECTOR = WEB_ELEMENT_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Selector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VIEW___SET_SELECTOR__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VIEW___GET_VALUE = WEB_ELEMENT_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VIEW___SET_VALUE__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VIEW___GET_CONTENT = WEB_ELEMENT_VIEW_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VIEW___SET_CONTENT__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Input View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VIEW_OPERATION_COUNT = WEB_ELEMENT_VIEW_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.TextareaViewImpl <em>Textarea View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.TextareaViewImpl
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getTextareaView()
	 * @generated
	 */
	int TEXTAREA_VIEW = 17;

	/**
	 * The feature id for the '<em><b>Internal Web Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_VIEW__INTERNAL_WEB_ELEMENT = WEB_ELEMENT_VIEW__INTERNAL_WEB_ELEMENT;

	/**
	 * The feature id for the '<em><b>Internal Textarea</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_VIEW__INTERNAL_TEXTAREA = WEB_ELEMENT_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Textarea View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_VIEW_FEATURE_COUNT = WEB_ELEMENT_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_VIEW___IS_IS_HIGHLIGHTED = WEB_ELEMENT_VIEW___IS_IS_HIGHLIGHTED;

	/**
	 * The operation id for the '<em>Set Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_VIEW___SET_IS_HIGHLIGHTED__BOOLEAN = WEB_ELEMENT_VIEW___SET_IS_HIGHLIGHTED__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_VIEW___GET_CONTENT_TEXT = WEB_ELEMENT_VIEW___GET_CONTENT_TEXT;

	/**
	 * The operation id for the '<em>Set Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_VIEW___SET_CONTENT_TEXT__STRING = WEB_ELEMENT_VIEW___SET_CONTENT_TEXT__STRING;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_VIEW___GET_ATTRIBUTE = WEB_ELEMENT_VIEW___GET_ATTRIBUTE;

	/**
	 * The operation id for the '<em>Set Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_VIEW___SET_ATTRIBUTE__STRING = WEB_ELEMENT_VIEW___SET_ATTRIBUTE__STRING;

	/**
	 * The operation id for the '<em>Get Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_VIEW___GET_ATTR_VALUE = WEB_ELEMENT_VIEW___GET_ATTR_VALUE;

	/**
	 * The operation id for the '<em>Set Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_VIEW___SET_ATTR_VALUE__STRING = WEB_ELEMENT_VIEW___SET_ATTR_VALUE__STRING;

	/**
	 * The operation id for the '<em>Get Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_VIEW___GET_TAG_NAME = WEB_ELEMENT_VIEW___GET_TAG_NAME;

	/**
	 * The operation id for the '<em>Set Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_VIEW___SET_TAG_NAME__STRING = WEB_ELEMENT_VIEW___SET_TAG_NAME__STRING;

	/**
	 * The number of operations of the '<em>Textarea View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_VIEW_OPERATION_COUNT = WEB_ELEMENT_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.ButtonViewImpl <em>Button View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ButtonViewImpl
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getButtonView()
	 * @generated
	 */
	int BUTTON_VIEW = 18;

	/**
	 * The feature id for the '<em><b>Internal Web Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_VIEW__INTERNAL_WEB_ELEMENT = WEB_ELEMENT_VIEW__INTERNAL_WEB_ELEMENT;

	/**
	 * The feature id for the '<em><b>Internal Button</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_VIEW__INTERNAL_BUTTON = WEB_ELEMENT_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_VIEW_FEATURE_COUNT = WEB_ELEMENT_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_VIEW___IS_IS_HIGHLIGHTED = WEB_ELEMENT_VIEW___IS_IS_HIGHLIGHTED;

	/**
	 * The operation id for the '<em>Set Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_VIEW___SET_IS_HIGHLIGHTED__BOOLEAN = WEB_ELEMENT_VIEW___SET_IS_HIGHLIGHTED__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_VIEW___GET_CONTENT_TEXT = WEB_ELEMENT_VIEW___GET_CONTENT_TEXT;

	/**
	 * The operation id for the '<em>Set Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_VIEW___SET_CONTENT_TEXT__STRING = WEB_ELEMENT_VIEW___SET_CONTENT_TEXT__STRING;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_VIEW___GET_ATTRIBUTE = WEB_ELEMENT_VIEW___GET_ATTRIBUTE;

	/**
	 * The operation id for the '<em>Set Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_VIEW___SET_ATTRIBUTE__STRING = WEB_ELEMENT_VIEW___SET_ATTRIBUTE__STRING;

	/**
	 * The operation id for the '<em>Get Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_VIEW___GET_ATTR_VALUE = WEB_ELEMENT_VIEW___GET_ATTR_VALUE;

	/**
	 * The operation id for the '<em>Set Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_VIEW___SET_ATTR_VALUE__STRING = WEB_ELEMENT_VIEW___SET_ATTR_VALUE__STRING;

	/**
	 * The operation id for the '<em>Get Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_VIEW___GET_TAG_NAME = WEB_ELEMENT_VIEW___GET_TAG_NAME;

	/**
	 * The operation id for the '<em>Set Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_VIEW___SET_TAG_NAME__STRING = WEB_ELEMENT_VIEW___SET_TAG_NAME__STRING;

	/**
	 * The operation id for the '<em>Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_VIEW___IS_HIGHLIGHTED = WEB_ELEMENT_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_VIEW___SET_HIGHLIGHTED__BOOLEAN = WEB_ELEMENT_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_VIEW___GET_ACTION = WEB_ELEMENT_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_VIEW___SET_ACTION__BUTTONACTION = WEB_ELEMENT_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Selector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_VIEW___GET_SELECTOR = WEB_ELEMENT_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Selector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_VIEW___SET_SELECTOR__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_VIEW___GET_VALUE = WEB_ELEMENT_VIEW_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_VIEW___SET_VALUE__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_VIEW___GET_CONTENT = WEB_ELEMENT_VIEW_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Set Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_VIEW___SET_CONTENT__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 9;

	/**
	 * The number of operations of the '<em>Button View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_VIEW_OPERATION_COUNT = WEB_ELEMENT_VIEW_OPERATION_COUNT + 10;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.SelectBoxViewImpl <em>Select Box View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.SelectBoxViewImpl
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getSelectBoxView()
	 * @generated
	 */
	int SELECT_BOX_VIEW = 19;

	/**
	 * The feature id for the '<em><b>Internal Web Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_VIEW__INTERNAL_WEB_ELEMENT = WEB_ELEMENT_VIEW__INTERNAL_WEB_ELEMENT;

	/**
	 * The feature id for the '<em><b>Internal Select Box</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_VIEW__INTERNAL_SELECT_BOX = WEB_ELEMENT_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Select Box View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_VIEW_FEATURE_COUNT = WEB_ELEMENT_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_VIEW___IS_IS_HIGHLIGHTED = WEB_ELEMENT_VIEW___IS_IS_HIGHLIGHTED;

	/**
	 * The operation id for the '<em>Set Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_VIEW___SET_IS_HIGHLIGHTED__BOOLEAN = WEB_ELEMENT_VIEW___SET_IS_HIGHLIGHTED__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_VIEW___GET_CONTENT_TEXT = WEB_ELEMENT_VIEW___GET_CONTENT_TEXT;

	/**
	 * The operation id for the '<em>Set Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_VIEW___SET_CONTENT_TEXT__STRING = WEB_ELEMENT_VIEW___SET_CONTENT_TEXT__STRING;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_VIEW___GET_ATTRIBUTE = WEB_ELEMENT_VIEW___GET_ATTRIBUTE;

	/**
	 * The operation id for the '<em>Set Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_VIEW___SET_ATTRIBUTE__STRING = WEB_ELEMENT_VIEW___SET_ATTRIBUTE__STRING;

	/**
	 * The operation id for the '<em>Get Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_VIEW___GET_ATTR_VALUE = WEB_ELEMENT_VIEW___GET_ATTR_VALUE;

	/**
	 * The operation id for the '<em>Set Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_VIEW___SET_ATTR_VALUE__STRING = WEB_ELEMENT_VIEW___SET_ATTR_VALUE__STRING;

	/**
	 * The operation id for the '<em>Get Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_VIEW___GET_TAG_NAME = WEB_ELEMENT_VIEW___GET_TAG_NAME;

	/**
	 * The operation id for the '<em>Set Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_VIEW___SET_TAG_NAME__STRING = WEB_ELEMENT_VIEW___SET_TAG_NAME__STRING;

	/**
	 * The operation id for the '<em>Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_VIEW___IS_HIGHLIGHTED = WEB_ELEMENT_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_VIEW___SET_HIGHLIGHTED__BOOLEAN = WEB_ELEMENT_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Selector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_VIEW___GET_SELECTOR = WEB_ELEMENT_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Selector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_VIEW___SET_SELECTOR__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_VIEW___GET_VALUE = WEB_ELEMENT_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_VIEW___SET_VALUE__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_VIEW___GET_CONTENT = WEB_ELEMENT_VIEW_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_VIEW___SET_CONTENT__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Select Box View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_VIEW_OPERATION_COUNT = WEB_ELEMENT_VIEW_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.SelectBoxOptionViewImpl <em>Select Box Option View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.SelectBoxOptionViewImpl
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getSelectBoxOptionView()
	 * @generated
	 */
	int SELECT_BOX_OPTION_VIEW = 20;

	/**
	 * The feature id for the '<em><b>Internal Web Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_OPTION_VIEW__INTERNAL_WEB_ELEMENT = WEB_ELEMENT_VIEW__INTERNAL_WEB_ELEMENT;

	/**
	 * The feature id for the '<em><b>Internal Select Box Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_OPTION_VIEW__INTERNAL_SELECT_BOX_OPTION = WEB_ELEMENT_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Select Box Option View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_OPTION_VIEW_FEATURE_COUNT = WEB_ELEMENT_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_OPTION_VIEW___IS_IS_HIGHLIGHTED = WEB_ELEMENT_VIEW___IS_IS_HIGHLIGHTED;

	/**
	 * The operation id for the '<em>Set Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_OPTION_VIEW___SET_IS_HIGHLIGHTED__BOOLEAN = WEB_ELEMENT_VIEW___SET_IS_HIGHLIGHTED__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_OPTION_VIEW___GET_CONTENT_TEXT = WEB_ELEMENT_VIEW___GET_CONTENT_TEXT;

	/**
	 * The operation id for the '<em>Set Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_OPTION_VIEW___SET_CONTENT_TEXT__STRING = WEB_ELEMENT_VIEW___SET_CONTENT_TEXT__STRING;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_OPTION_VIEW___GET_ATTRIBUTE = WEB_ELEMENT_VIEW___GET_ATTRIBUTE;

	/**
	 * The operation id for the '<em>Set Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_OPTION_VIEW___SET_ATTRIBUTE__STRING = WEB_ELEMENT_VIEW___SET_ATTRIBUTE__STRING;

	/**
	 * The operation id for the '<em>Get Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_OPTION_VIEW___GET_ATTR_VALUE = WEB_ELEMENT_VIEW___GET_ATTR_VALUE;

	/**
	 * The operation id for the '<em>Set Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_OPTION_VIEW___SET_ATTR_VALUE__STRING = WEB_ELEMENT_VIEW___SET_ATTR_VALUE__STRING;

	/**
	 * The operation id for the '<em>Get Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_OPTION_VIEW___GET_TAG_NAME = WEB_ELEMENT_VIEW___GET_TAG_NAME;

	/**
	 * The operation id for the '<em>Set Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_OPTION_VIEW___SET_TAG_NAME__STRING = WEB_ELEMENT_VIEW___SET_TAG_NAME__STRING;

	/**
	 * The operation id for the '<em>Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_OPTION_VIEW___IS_HIGHLIGHTED = WEB_ELEMENT_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_OPTION_VIEW___SET_HIGHLIGHTED__BOOLEAN = WEB_ELEMENT_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Selector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_OPTION_VIEW___GET_SELECTOR = WEB_ELEMENT_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Selector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_OPTION_VIEW___SET_SELECTOR__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_OPTION_VIEW___GET_VALUE = WEB_ELEMENT_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_OPTION_VIEW___SET_VALUE__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_OPTION_VIEW___GET_CONTENT = WEB_ELEMENT_VIEW_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_OPTION_VIEW___SET_CONTENT__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Select Box Option View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BOX_OPTION_VIEW_OPERATION_COUNT = WEB_ELEMENT_VIEW_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.TableViewImpl <em>Table View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.TableViewImpl
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getTableView()
	 * @generated
	 */
	int TABLE_VIEW = 21;

	/**
	 * The feature id for the '<em><b>Internal Web Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW__INTERNAL_WEB_ELEMENT = WEB_ELEMENT_VIEW__INTERNAL_WEB_ELEMENT;

	/**
	 * The feature id for the '<em><b>Internal Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW__INTERNAL_TABLE = WEB_ELEMENT_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW_FEATURE_COUNT = WEB_ELEMENT_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW___IS_IS_HIGHLIGHTED = WEB_ELEMENT_VIEW___IS_IS_HIGHLIGHTED;

	/**
	 * The operation id for the '<em>Set Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW___SET_IS_HIGHLIGHTED__BOOLEAN = WEB_ELEMENT_VIEW___SET_IS_HIGHLIGHTED__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW___GET_CONTENT_TEXT = WEB_ELEMENT_VIEW___GET_CONTENT_TEXT;

	/**
	 * The operation id for the '<em>Set Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW___SET_CONTENT_TEXT__STRING = WEB_ELEMENT_VIEW___SET_CONTENT_TEXT__STRING;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW___GET_ATTRIBUTE = WEB_ELEMENT_VIEW___GET_ATTRIBUTE;

	/**
	 * The operation id for the '<em>Set Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW___SET_ATTRIBUTE__STRING = WEB_ELEMENT_VIEW___SET_ATTRIBUTE__STRING;

	/**
	 * The operation id for the '<em>Get Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW___GET_ATTR_VALUE = WEB_ELEMENT_VIEW___GET_ATTR_VALUE;

	/**
	 * The operation id for the '<em>Set Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW___SET_ATTR_VALUE__STRING = WEB_ELEMENT_VIEW___SET_ATTR_VALUE__STRING;

	/**
	 * The operation id for the '<em>Get Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW___GET_TAG_NAME = WEB_ELEMENT_VIEW___GET_TAG_NAME;

	/**
	 * The operation id for the '<em>Set Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW___SET_TAG_NAME__STRING = WEB_ELEMENT_VIEW___SET_TAG_NAME__STRING;

	/**
	 * The operation id for the '<em>Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW___IS_HIGHLIGHTED = WEB_ELEMENT_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW___SET_HIGHLIGHTED__BOOLEAN = WEB_ELEMENT_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Selector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW___GET_SELECTOR = WEB_ELEMENT_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Selector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW___SET_SELECTOR__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW___GET_VALUE = WEB_ELEMENT_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW___SET_VALUE__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW___GET_CONTENT = WEB_ELEMENT_VIEW_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW___SET_CONTENT__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Table View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW_OPERATION_COUNT = WEB_ELEMENT_VIEW_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.TableHeadViewImpl <em>Table Head View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.TableHeadViewImpl
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getTableHeadView()
	 * @generated
	 */
	int TABLE_HEAD_VIEW = 22;

	/**
	 * The feature id for the '<em><b>Internal Web Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD_VIEW__INTERNAL_WEB_ELEMENT = WEB_ELEMENT_VIEW__INTERNAL_WEB_ELEMENT;

	/**
	 * The feature id for the '<em><b>Internal Table Head</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD_VIEW__INTERNAL_TABLE_HEAD = WEB_ELEMENT_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Head View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD_VIEW_FEATURE_COUNT = WEB_ELEMENT_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD_VIEW___IS_IS_HIGHLIGHTED = WEB_ELEMENT_VIEW___IS_IS_HIGHLIGHTED;

	/**
	 * The operation id for the '<em>Set Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD_VIEW___SET_IS_HIGHLIGHTED__BOOLEAN = WEB_ELEMENT_VIEW___SET_IS_HIGHLIGHTED__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD_VIEW___GET_CONTENT_TEXT = WEB_ELEMENT_VIEW___GET_CONTENT_TEXT;

	/**
	 * The operation id for the '<em>Set Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD_VIEW___SET_CONTENT_TEXT__STRING = WEB_ELEMENT_VIEW___SET_CONTENT_TEXT__STRING;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD_VIEW___GET_ATTRIBUTE = WEB_ELEMENT_VIEW___GET_ATTRIBUTE;

	/**
	 * The operation id for the '<em>Set Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD_VIEW___SET_ATTRIBUTE__STRING = WEB_ELEMENT_VIEW___SET_ATTRIBUTE__STRING;

	/**
	 * The operation id for the '<em>Get Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD_VIEW___GET_ATTR_VALUE = WEB_ELEMENT_VIEW___GET_ATTR_VALUE;

	/**
	 * The operation id for the '<em>Set Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD_VIEW___SET_ATTR_VALUE__STRING = WEB_ELEMENT_VIEW___SET_ATTR_VALUE__STRING;

	/**
	 * The operation id for the '<em>Get Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD_VIEW___GET_TAG_NAME = WEB_ELEMENT_VIEW___GET_TAG_NAME;

	/**
	 * The operation id for the '<em>Set Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD_VIEW___SET_TAG_NAME__STRING = WEB_ELEMENT_VIEW___SET_TAG_NAME__STRING;

	/**
	 * The operation id for the '<em>Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD_VIEW___IS_HIGHLIGHTED = WEB_ELEMENT_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD_VIEW___SET_HIGHLIGHTED__BOOLEAN = WEB_ELEMENT_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Selector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD_VIEW___GET_SELECTOR = WEB_ELEMENT_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Selector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD_VIEW___SET_SELECTOR__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD_VIEW___GET_VALUE = WEB_ELEMENT_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD_VIEW___SET_VALUE__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD_VIEW___GET_CONTENT = WEB_ELEMENT_VIEW_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD_VIEW___SET_CONTENT__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Table Head View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD_VIEW_OPERATION_COUNT = WEB_ELEMENT_VIEW_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.ThViewImpl <em>Th View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ThViewImpl
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getThView()
	 * @generated
	 */
	int TH_VIEW = 23;

	/**
	 * The feature id for the '<em><b>Internal Web Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_VIEW__INTERNAL_WEB_ELEMENT = WEB_ELEMENT_VIEW__INTERNAL_WEB_ELEMENT;

	/**
	 * The feature id for the '<em><b>Internal Th</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_VIEW__INTERNAL_TH = WEB_ELEMENT_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Th View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_VIEW_FEATURE_COUNT = WEB_ELEMENT_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_VIEW___IS_IS_HIGHLIGHTED = WEB_ELEMENT_VIEW___IS_IS_HIGHLIGHTED;

	/**
	 * The operation id for the '<em>Set Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_VIEW___SET_IS_HIGHLIGHTED__BOOLEAN = WEB_ELEMENT_VIEW___SET_IS_HIGHLIGHTED__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_VIEW___GET_CONTENT_TEXT = WEB_ELEMENT_VIEW___GET_CONTENT_TEXT;

	/**
	 * The operation id for the '<em>Set Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_VIEW___SET_CONTENT_TEXT__STRING = WEB_ELEMENT_VIEW___SET_CONTENT_TEXT__STRING;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_VIEW___GET_ATTRIBUTE = WEB_ELEMENT_VIEW___GET_ATTRIBUTE;

	/**
	 * The operation id for the '<em>Set Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_VIEW___SET_ATTRIBUTE__STRING = WEB_ELEMENT_VIEW___SET_ATTRIBUTE__STRING;

	/**
	 * The operation id for the '<em>Get Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_VIEW___GET_ATTR_VALUE = WEB_ELEMENT_VIEW___GET_ATTR_VALUE;

	/**
	 * The operation id for the '<em>Set Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_VIEW___SET_ATTR_VALUE__STRING = WEB_ELEMENT_VIEW___SET_ATTR_VALUE__STRING;

	/**
	 * The operation id for the '<em>Get Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_VIEW___GET_TAG_NAME = WEB_ELEMENT_VIEW___GET_TAG_NAME;

	/**
	 * The operation id for the '<em>Set Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_VIEW___SET_TAG_NAME__STRING = WEB_ELEMENT_VIEW___SET_TAG_NAME__STRING;

	/**
	 * The operation id for the '<em>Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_VIEW___IS_HIGHLIGHTED = WEB_ELEMENT_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_VIEW___SET_HIGHLIGHTED__BOOLEAN = WEB_ELEMENT_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Selector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_VIEW___GET_SELECTOR = WEB_ELEMENT_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Selector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_VIEW___SET_SELECTOR__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_VIEW___GET_VALUE = WEB_ELEMENT_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_VIEW___SET_VALUE__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_VIEW___GET_CONTENT = WEB_ELEMENT_VIEW_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_VIEW___SET_CONTENT__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Th View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_VIEW_OPERATION_COUNT = WEB_ELEMENT_VIEW_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.TableRowViewImpl <em>Table Row View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.TableRowViewImpl
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getTableRowView()
	 * @generated
	 */
	int TABLE_ROW_VIEW = 24;

	/**
	 * The feature id for the '<em><b>Internal Web Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_VIEW__INTERNAL_WEB_ELEMENT = WEB_ELEMENT_VIEW__INTERNAL_WEB_ELEMENT;

	/**
	 * The feature id for the '<em><b>Internal Table Row</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_VIEW__INTERNAL_TABLE_ROW = WEB_ELEMENT_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Row View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_VIEW_FEATURE_COUNT = WEB_ELEMENT_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_VIEW___IS_IS_HIGHLIGHTED = WEB_ELEMENT_VIEW___IS_IS_HIGHLIGHTED;

	/**
	 * The operation id for the '<em>Set Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_VIEW___SET_IS_HIGHLIGHTED__BOOLEAN = WEB_ELEMENT_VIEW___SET_IS_HIGHLIGHTED__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_VIEW___GET_CONTENT_TEXT = WEB_ELEMENT_VIEW___GET_CONTENT_TEXT;

	/**
	 * The operation id for the '<em>Set Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_VIEW___SET_CONTENT_TEXT__STRING = WEB_ELEMENT_VIEW___SET_CONTENT_TEXT__STRING;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_VIEW___GET_ATTRIBUTE = WEB_ELEMENT_VIEW___GET_ATTRIBUTE;

	/**
	 * The operation id for the '<em>Set Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_VIEW___SET_ATTRIBUTE__STRING = WEB_ELEMENT_VIEW___SET_ATTRIBUTE__STRING;

	/**
	 * The operation id for the '<em>Get Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_VIEW___GET_ATTR_VALUE = WEB_ELEMENT_VIEW___GET_ATTR_VALUE;

	/**
	 * The operation id for the '<em>Set Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_VIEW___SET_ATTR_VALUE__STRING = WEB_ELEMENT_VIEW___SET_ATTR_VALUE__STRING;

	/**
	 * The operation id for the '<em>Get Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_VIEW___GET_TAG_NAME = WEB_ELEMENT_VIEW___GET_TAG_NAME;

	/**
	 * The operation id for the '<em>Set Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_VIEW___SET_TAG_NAME__STRING = WEB_ELEMENT_VIEW___SET_TAG_NAME__STRING;

	/**
	 * The operation id for the '<em>Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_VIEW___IS_HIGHLIGHTED = WEB_ELEMENT_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_VIEW___SET_HIGHLIGHTED__BOOLEAN = WEB_ELEMENT_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Selector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_VIEW___GET_SELECTOR = WEB_ELEMENT_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Selector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_VIEW___SET_SELECTOR__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_VIEW___GET_VALUE = WEB_ELEMENT_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_VIEW___SET_VALUE__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_VIEW___GET_CONTENT = WEB_ELEMENT_VIEW_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_VIEW___SET_CONTENT__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Table Row View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_VIEW_OPERATION_COUNT = WEB_ELEMENT_VIEW_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.TableBodyViewImpl <em>Table Body View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.TableBodyViewImpl
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getTableBodyView()
	 * @generated
	 */
	int TABLE_BODY_VIEW = 25;

	/**
	 * The feature id for the '<em><b>Internal Web Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY_VIEW__INTERNAL_WEB_ELEMENT = WEB_ELEMENT_VIEW__INTERNAL_WEB_ELEMENT;

	/**
	 * The feature id for the '<em><b>Internal Table Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY_VIEW__INTERNAL_TABLE_BODY = WEB_ELEMENT_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Body View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY_VIEW_FEATURE_COUNT = WEB_ELEMENT_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY_VIEW___IS_IS_HIGHLIGHTED = WEB_ELEMENT_VIEW___IS_IS_HIGHLIGHTED;

	/**
	 * The operation id for the '<em>Set Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY_VIEW___SET_IS_HIGHLIGHTED__BOOLEAN = WEB_ELEMENT_VIEW___SET_IS_HIGHLIGHTED__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY_VIEW___GET_CONTENT_TEXT = WEB_ELEMENT_VIEW___GET_CONTENT_TEXT;

	/**
	 * The operation id for the '<em>Set Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY_VIEW___SET_CONTENT_TEXT__STRING = WEB_ELEMENT_VIEW___SET_CONTENT_TEXT__STRING;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY_VIEW___GET_ATTRIBUTE = WEB_ELEMENT_VIEW___GET_ATTRIBUTE;

	/**
	 * The operation id for the '<em>Set Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY_VIEW___SET_ATTRIBUTE__STRING = WEB_ELEMENT_VIEW___SET_ATTRIBUTE__STRING;

	/**
	 * The operation id for the '<em>Get Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY_VIEW___GET_ATTR_VALUE = WEB_ELEMENT_VIEW___GET_ATTR_VALUE;

	/**
	 * The operation id for the '<em>Set Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY_VIEW___SET_ATTR_VALUE__STRING = WEB_ELEMENT_VIEW___SET_ATTR_VALUE__STRING;

	/**
	 * The operation id for the '<em>Get Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY_VIEW___GET_TAG_NAME = WEB_ELEMENT_VIEW___GET_TAG_NAME;

	/**
	 * The operation id for the '<em>Set Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY_VIEW___SET_TAG_NAME__STRING = WEB_ELEMENT_VIEW___SET_TAG_NAME__STRING;

	/**
	 * The operation id for the '<em>Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY_VIEW___IS_HIGHLIGHTED = WEB_ELEMENT_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY_VIEW___SET_HIGHLIGHTED__BOOLEAN = WEB_ELEMENT_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Selector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY_VIEW___GET_SELECTOR = WEB_ELEMENT_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Selector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY_VIEW___SET_SELECTOR__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY_VIEW___GET_VALUE = WEB_ELEMENT_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY_VIEW___SET_VALUE__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY_VIEW___GET_CONTENT = WEB_ELEMENT_VIEW_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY_VIEW___SET_CONTENT__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Table Body View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY_VIEW_OPERATION_COUNT = WEB_ELEMENT_VIEW_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.TableDataViewImpl <em>Table Data View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.TableDataViewImpl
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getTableDataView()
	 * @generated
	 */
	int TABLE_DATA_VIEW = 26;

	/**
	 * The feature id for the '<em><b>Internal Web Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DATA_VIEW__INTERNAL_WEB_ELEMENT = WEB_ELEMENT_VIEW__INTERNAL_WEB_ELEMENT;

	/**
	 * The feature id for the '<em><b>Internal Table Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DATA_VIEW__INTERNAL_TABLE_DATA = WEB_ELEMENT_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Data View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DATA_VIEW_FEATURE_COUNT = WEB_ELEMENT_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DATA_VIEW___IS_IS_HIGHLIGHTED = WEB_ELEMENT_VIEW___IS_IS_HIGHLIGHTED;

	/**
	 * The operation id for the '<em>Set Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DATA_VIEW___SET_IS_HIGHLIGHTED__BOOLEAN = WEB_ELEMENT_VIEW___SET_IS_HIGHLIGHTED__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DATA_VIEW___GET_CONTENT_TEXT = WEB_ELEMENT_VIEW___GET_CONTENT_TEXT;

	/**
	 * The operation id for the '<em>Set Content Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DATA_VIEW___SET_CONTENT_TEXT__STRING = WEB_ELEMENT_VIEW___SET_CONTENT_TEXT__STRING;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DATA_VIEW___GET_ATTRIBUTE = WEB_ELEMENT_VIEW___GET_ATTRIBUTE;

	/**
	 * The operation id for the '<em>Set Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DATA_VIEW___SET_ATTRIBUTE__STRING = WEB_ELEMENT_VIEW___SET_ATTRIBUTE__STRING;

	/**
	 * The operation id for the '<em>Get Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DATA_VIEW___GET_ATTR_VALUE = WEB_ELEMENT_VIEW___GET_ATTR_VALUE;

	/**
	 * The operation id for the '<em>Set Attr Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DATA_VIEW___SET_ATTR_VALUE__STRING = WEB_ELEMENT_VIEW___SET_ATTR_VALUE__STRING;

	/**
	 * The operation id for the '<em>Get Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DATA_VIEW___GET_TAG_NAME = WEB_ELEMENT_VIEW___GET_TAG_NAME;

	/**
	 * The operation id for the '<em>Set Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DATA_VIEW___SET_TAG_NAME__STRING = WEB_ELEMENT_VIEW___SET_TAG_NAME__STRING;

	/**
	 * The operation id for the '<em>Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DATA_VIEW___IS_HIGHLIGHTED = WEB_ELEMENT_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DATA_VIEW___SET_HIGHLIGHTED__BOOLEAN = WEB_ELEMENT_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Selector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DATA_VIEW___GET_SELECTOR = WEB_ELEMENT_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Selector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DATA_VIEW___SET_SELECTOR__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DATA_VIEW___GET_VALUE = WEB_ELEMENT_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DATA_VIEW___SET_VALUE__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DATA_VIEW___GET_CONTENT = WEB_ELEMENT_VIEW_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DATA_VIEW___SET_CONTENT__STRING = WEB_ELEMENT_VIEW_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Table Data View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DATA_VIEW_OPERATION_COUNT = WEB_ELEMENT_VIEW_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.SectionViewImpl <em>Section View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.SectionViewImpl
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getSectionView()
	 * @generated
	 */
	int SECTION_VIEW = 27;

	/**
	 * The feature id for the '<em><b>Internal Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_VIEW__INTERNAL_SECTION = 0;

	/**
	 * The number of structural features of the '<em>Section View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Is Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_VIEW___IS_HIGHLIGHTED = 0;

	/**
	 * The operation id for the '<em>Set Highlighted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_VIEW___SET_HIGHLIGHTED__BOOLEAN = 1;

	/**
	 * The operation id for the '<em>Get Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_VIEW___GET_TITLE = 2;

	/**
	 * The operation id for the '<em>Set Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_VIEW___SET_TITLE__STRING = 3;

	/**
	 * The number of operations of the '<em>Section View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_VIEW_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.CommentViewImpl <em>Comment View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.CommentViewImpl
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getCommentView()
	 * @generated
	 */
	int COMMENT_VIEW = 28;

	/**
	 * The feature id for the '<em><b>Internal Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_VIEW__INTERNAL_COMMENT = 0;

	/**
	 * The number of structural features of the '<em>Comment View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_VIEW___GET_CONTENT = 0;

	/**
	 * The operation id for the '<em>Set Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_VIEW___SET_CONTENT__STRING = 1;

	/**
	 * The operation id for the '<em>Get Reference To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_VIEW___GET_REFERENCE_TO = 2;

	/**
	 * The operation id for the '<em>Set Reference To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_VIEW___SET_REFERENCE_TO__SCREENSHOT = 3;

	/**
	 * The number of operations of the '<em>Comment View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_VIEW_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.TransitionViewImpl <em>Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.TransitionViewImpl
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getTransitionView()
	 * @generated
	 */
	int TRANSITION_VIEW = 29;

	/**
	 * The feature id for the '<em><b>Internal Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW__INTERNAL_TRANSITION = 0;

	/**
	 * The number of structural features of the '<em>Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.LabeledTransitionViewImpl <em>Labeled Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.LabeledTransitionViewImpl
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getLabeledTransitionView()
	 * @generated
	 */
	int LABELED_TRANSITION_VIEW = 30;

	/**
	 * The feature id for the '<em><b>Internal Labeled Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TRANSITION_VIEW__INTERNAL_LABELED_TRANSITION = 0;

	/**
	 * The number of structural features of the '<em>Labeled Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TRANSITION_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TRANSITION_VIEW___GET_LABEL = 0;

	/**
	 * The operation id for the '<em>Set Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TRANSITION_VIEW___SET_LABEL__STRING = 1;

	/**
	 * The number of operations of the '<em>Labeled Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TRANSITION_VIEW_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.AnchorViewImpl <em>Anchor View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.AnchorViewImpl
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getAnchorView()
	 * @generated
	 */
	int ANCHOR_VIEW = 31;

	/**
	 * The feature id for the '<em><b>Internal Anchor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR_VIEW__INTERNAL_ANCHOR = 0;

	/**
	 * The number of structural features of the '<em>Anchor View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR_VIEW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Anchor View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR_VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.UserSequenceGraphModelViewImpl <em>User Sequence Graph Model View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.UserSequenceGraphModelViewImpl
	 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getUserSequenceGraphModelView()
	 * @generated
	 */
	int USER_SEQUENCE_GRAPH_MODEL_VIEW = 32;

	/**
	 * The feature id for the '<em><b>Internal User Sequence Graph Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SEQUENCE_GRAPH_MODEL_VIEW__INTERNAL_USER_SEQUENCE_GRAPH_MODEL = 0;

	/**
	 * The number of structural features of the '<em>User Sequence Graph Model View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SEQUENCE_GRAPH_MODEL_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Model Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SEQUENCE_GRAPH_MODEL_VIEW___GET_MODEL_NAME = 0;

	/**
	 * The operation id for the '<em>Set Model Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SEQUENCE_GRAPH_MODEL_VIEW___SET_MODEL_NAME__STRING = 1;

	/**
	 * The number of operations of the '<em>User Sequence Graph Model View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SEQUENCE_GRAPH_MODEL_VIEW_OPERATION_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.usersequence.usersequence.views.StartView <em>Start View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start View</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.StartView
	 * @generated
	 */
	EClass getStartView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.usersequence.usersequence.views.StartView#getInternalStart <em>Internal Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Start</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.StartView#getInternalStart()
	 * @see #getStartView()
	 * @generated
	 */
	EReference getStartView_InternalStart();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.usersequence.usersequence.views.StopView <em>Stop View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop View</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.StopView
	 * @generated
	 */
	EClass getStopView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.usersequence.usersequence.views.StopView#getInternalStop <em>Internal Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Stop</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.StopView#getInternalStop()
	 * @see #getStopView()
	 * @generated
	 */
	EReference getStopView_InternalStop();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.usersequence.usersequence.views.SubSequenceView <em>Sub Sequence View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Sequence View</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SubSequenceView
	 * @generated
	 */
	EClass getSubSequenceView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.usersequence.usersequence.views.SubSequenceView#getInternalSubSequence <em>Internal Sub Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Sub Sequence</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SubSequenceView#getInternalSubSequence()
	 * @see #getSubSequenceView()
	 * @generated
	 */
	EReference getSubSequenceView_InternalSubSequence();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.usersequence.usersequence.views.BaseURLView <em>Base URL View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base URL View</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.BaseURLView
	 * @generated
	 */
	EClass getBaseURLView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.usersequence.usersequence.views.BaseURLView#getInternalBaseURL <em>Internal Base URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Base URL</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.BaseURLView#getInternalBaseURL()
	 * @see #getBaseURLView()
	 * @generated
	 */
	EReference getBaseURLView_InternalBaseURL();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.BaseURLView#getContent() <em>Get Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Content</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.BaseURLView#getContent()
	 * @generated
	 */
	EOperation getBaseURLView__GetContent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.BaseURLView#setContent(java.lang.String) <em>Set Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Content</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.BaseURLView#setContent(java.lang.String)
	 * @generated
	 */
	EOperation getBaseURLView__SetContent__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.usersequence.usersequence.views.DomainView <em>Domain View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain View</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.DomainView
	 * @generated
	 */
	EClass getDomainView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.usersequence.usersequence.views.DomainView#getInternalDomain <em>Internal Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Domain</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.DomainView#getInternalDomain()
	 * @see #getDomainView()
	 * @generated
	 */
	EReference getDomainView_InternalDomain();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.DomainView#getContent() <em>Get Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Content</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.DomainView#getContent()
	 * @generated
	 */
	EOperation getDomainView__GetContent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.DomainView#setContent(java.lang.String) <em>Set Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Content</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.DomainView#setContent(java.lang.String)
	 * @generated
	 */
	EOperation getDomainView__SetContent__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.usersequence.usersequence.views.KeyValueView <em>Key Value View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Value View</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.KeyValueView
	 * @generated
	 */
	EClass getKeyValueView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.usersequence.usersequence.views.KeyValueView#getInternalKeyValue <em>Internal Key Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Key Value</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.KeyValueView#getInternalKeyValue()
	 * @see #getKeyValueView()
	 * @generated
	 */
	EReference getKeyValueView_InternalKeyValue();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.KeyValueView#getValue() <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.KeyValueView#getValue()
	 * @generated
	 */
	EOperation getKeyValueView__GetValue();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.KeyValueView#setValue(java.lang.String) <em>Set Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.KeyValueView#setValue(java.lang.String)
	 * @generated
	 */
	EOperation getKeyValueView__SetValue__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.KeyValueView#getKey() <em>Get Key</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Key</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.KeyValueView#getKey()
	 * @generated
	 */
	EOperation getKeyValueView__GetKey();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.KeyValueView#setKey(java.lang.String) <em>Set Key</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Key</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.KeyValueView#setKey(java.lang.String)
	 * @generated
	 */
	EOperation getKeyValueView__SetKey__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.usersequence.usersequence.views.ScreenshotView <em>Screenshot View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screenshot View</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ScreenshotView
	 * @generated
	 */
	EClass getScreenshotView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.usersequence.usersequence.views.ScreenshotView#getInternalScreenshot <em>Internal Screenshot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Screenshot</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ScreenshotView#getInternalScreenshot()
	 * @see #getScreenshotView()
	 * @generated
	 */
	EReference getScreenshotView_InternalScreenshot();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.ScreenshotView#getDescription() <em>Get Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Description</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ScreenshotView#getDescription()
	 * @generated
	 */
	EOperation getScreenshotView__GetDescription();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.ScreenshotView#setDescription(info.scce.cinco.product.usersequence.usersequence.Comment) <em>Set Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Description</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ScreenshotView#setDescription(info.scce.cinco.product.usersequence.usersequence.Comment)
	 * @generated
	 */
	EOperation getScreenshotView__SetDescription__Comment();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.usersequence.usersequence.views.SectionNodeView <em>Section Node View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section Node View</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SectionNodeView
	 * @generated
	 */
	EClass getSectionNodeView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.usersequence.usersequence.views.SectionNodeView#getInternalSectionNode <em>Internal Section Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Section Node</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SectionNodeView#getInternalSectionNode()
	 * @see #getSectionNodeView()
	 * @generated
	 */
	EReference getSectionNodeView_InternalSectionNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.SectionNodeView#getTitle() <em>Get Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Title</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SectionNodeView#getTitle()
	 * @generated
	 */
	EOperation getSectionNodeView__GetTitle();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.SectionNodeView#setTitle(java.lang.String) <em>Set Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Title</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SectionNodeView#setTitle(java.lang.String)
	 * @generated
	 */
	EOperation getSectionNodeView__SetTitle__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.usersequence.usersequence.views.NavigationView <em>Navigation View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation View</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.NavigationView
	 * @generated
	 */
	EClass getNavigationView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.usersequence.usersequence.views.NavigationView#getInternalNavigation <em>Internal Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Navigation</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.NavigationView#getInternalNavigation()
	 * @see #getNavigationView()
	 * @generated
	 */
	EReference getNavigationView_InternalNavigation();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.NavigationView#getLink() <em>Get Link</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Link</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.NavigationView#getLink()
	 * @generated
	 */
	EOperation getNavigationView__GetLink();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.NavigationView#setLink(java.lang.String) <em>Set Link</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Link</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.NavigationView#setLink(java.lang.String)
	 * @generated
	 */
	EOperation getNavigationView__SetLink__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.usersequence.usersequence.views.WebElementView <em>Web Element View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Element View</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.WebElementView
	 * @generated
	 */
	EClass getWebElementView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.usersequence.usersequence.views.WebElementView#getInternalWebElement <em>Internal Web Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Web Element</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.WebElementView#getInternalWebElement()
	 * @see #getWebElementView()
	 * @generated
	 */
	EReference getWebElementView_InternalWebElement();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.WebElementView#isIsHighlighted() <em>Is Is Highlighted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Is Highlighted</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.WebElementView#isIsHighlighted()
	 * @generated
	 */
	EOperation getWebElementView__IsIsHighlighted();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.WebElementView#setIsHighlighted(boolean) <em>Set Is Highlighted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Is Highlighted</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.WebElementView#setIsHighlighted(boolean)
	 * @generated
	 */
	EOperation getWebElementView__SetIsHighlighted__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.WebElementView#getContentText() <em>Get Content Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Content Text</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.WebElementView#getContentText()
	 * @generated
	 */
	EOperation getWebElementView__GetContentText();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.WebElementView#setContentText(java.lang.String) <em>Set Content Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Content Text</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.WebElementView#setContentText(java.lang.String)
	 * @generated
	 */
	EOperation getWebElementView__SetContentText__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.WebElementView#getAttribute() <em>Get Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attribute</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.WebElementView#getAttribute()
	 * @generated
	 */
	EOperation getWebElementView__GetAttribute();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.WebElementView#setAttribute(java.lang.String) <em>Set Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Attribute</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.WebElementView#setAttribute(java.lang.String)
	 * @generated
	 */
	EOperation getWebElementView__SetAttribute__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.WebElementView#getAttrValue() <em>Get Attr Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attr Value</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.WebElementView#getAttrValue()
	 * @generated
	 */
	EOperation getWebElementView__GetAttrValue();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.WebElementView#setAttrValue(java.lang.String) <em>Set Attr Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Attr Value</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.WebElementView#setAttrValue(java.lang.String)
	 * @generated
	 */
	EOperation getWebElementView__SetAttrValue__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.WebElementView#getTagName() <em>Get Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tag Name</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.WebElementView#getTagName()
	 * @generated
	 */
	EOperation getWebElementView__GetTagName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.WebElementView#setTagName(java.lang.String) <em>Set Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Tag Name</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.WebElementView#setTagName(java.lang.String)
	 * @generated
	 */
	EOperation getWebElementView__SetTagName__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.usersequence.usersequence.views.DivView <em>Div View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Div View</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.DivView
	 * @generated
	 */
	EClass getDivView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.usersequence.usersequence.views.DivView#getInternalDiv <em>Internal Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Div</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.DivView#getInternalDiv()
	 * @see #getDivView()
	 * @generated
	 */
	EReference getDivView_InternalDiv();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.usersequence.usersequence.views.HView <em>HView</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HView</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.HView
	 * @generated
	 */
	EClass getHView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.usersequence.usersequence.views.HView#getInternalH <em>Internal H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal H</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.HView#getInternalH()
	 * @see #getHView()
	 * @generated
	 */
	EReference getHView_InternalH();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.HView#isHighlighted() <em>Is Highlighted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Highlighted</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.HView#isHighlighted()
	 * @generated
	 */
	EOperation getHView__IsHighlighted();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.HView#setHighlighted(boolean) <em>Set Highlighted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Highlighted</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.HView#setHighlighted(boolean)
	 * @generated
	 */
	EOperation getHView__SetHighlighted__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.HView#getRanking() <em>Get Ranking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Ranking</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.HView#getRanking()
	 * @generated
	 */
	EOperation getHView__GetRanking();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.HView#setRanking(int) <em>Set Ranking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Ranking</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.HView#setRanking(int)
	 * @generated
	 */
	EOperation getHView__SetRanking__int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.HView#getSelector() <em>Get Selector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Selector</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.HView#getSelector()
	 * @generated
	 */
	EOperation getHView__GetSelector();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.HView#setSelector(java.lang.String) <em>Set Selector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Selector</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.HView#setSelector(java.lang.String)
	 * @generated
	 */
	EOperation getHView__SetSelector__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.HView#getValue() <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.HView#getValue()
	 * @generated
	 */
	EOperation getHView__GetValue();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.HView#setValue(java.lang.String) <em>Set Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.HView#setValue(java.lang.String)
	 * @generated
	 */
	EOperation getHView__SetValue__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.HView#getContent() <em>Get Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Content</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.HView#getContent()
	 * @generated
	 */
	EOperation getHView__GetContent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.HView#setContent(java.lang.String) <em>Set Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Content</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.HView#setContent(java.lang.String)
	 * @generated
	 */
	EOperation getHView__SetContent__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.usersequence.usersequence.views.PView <em>PView</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PView</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.PView
	 * @generated
	 */
	EClass getPView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.usersequence.usersequence.views.PView#getInternalP <em>Internal P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal P</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.PView#getInternalP()
	 * @see #getPView()
	 * @generated
	 */
	EReference getPView_InternalP();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.PView#isHighlighted() <em>Is Highlighted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Highlighted</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.PView#isHighlighted()
	 * @generated
	 */
	EOperation getPView__IsHighlighted();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.PView#setHighlighted(boolean) <em>Set Highlighted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Highlighted</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.PView#setHighlighted(boolean)
	 * @generated
	 */
	EOperation getPView__SetHighlighted__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.PView#getSelector() <em>Get Selector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Selector</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.PView#getSelector()
	 * @generated
	 */
	EOperation getPView__GetSelector();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.PView#setSelector(java.lang.String) <em>Set Selector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Selector</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.PView#setSelector(java.lang.String)
	 * @generated
	 */
	EOperation getPView__SetSelector__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.PView#getValue() <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.PView#getValue()
	 * @generated
	 */
	EOperation getPView__GetValue();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.PView#setValue(java.lang.String) <em>Set Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.PView#setValue(java.lang.String)
	 * @generated
	 */
	EOperation getPView__SetValue__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.PView#getContent() <em>Get Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Content</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.PView#getContent()
	 * @generated
	 */
	EOperation getPView__GetContent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.PView#setContent(java.lang.String) <em>Set Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Content</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.PView#setContent(java.lang.String)
	 * @generated
	 */
	EOperation getPView__SetContent__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.usersequence.usersequence.views.SpanView <em>Span View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Span View</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SpanView
	 * @generated
	 */
	EClass getSpanView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.usersequence.usersequence.views.SpanView#getInternalSpan <em>Internal Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Span</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SpanView#getInternalSpan()
	 * @see #getSpanView()
	 * @generated
	 */
	EReference getSpanView_InternalSpan();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.SpanView#isHighlighted() <em>Is Highlighted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Highlighted</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SpanView#isHighlighted()
	 * @generated
	 */
	EOperation getSpanView__IsHighlighted();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.SpanView#setHighlighted(boolean) <em>Set Highlighted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Highlighted</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SpanView#setHighlighted(boolean)
	 * @generated
	 */
	EOperation getSpanView__SetHighlighted__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.SpanView#getSelector() <em>Get Selector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Selector</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SpanView#getSelector()
	 * @generated
	 */
	EOperation getSpanView__GetSelector();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.SpanView#setSelector(java.lang.String) <em>Set Selector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Selector</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SpanView#setSelector(java.lang.String)
	 * @generated
	 */
	EOperation getSpanView__SetSelector__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.SpanView#getValue() <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SpanView#getValue()
	 * @generated
	 */
	EOperation getSpanView__GetValue();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.SpanView#setValue(java.lang.String) <em>Set Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SpanView#setValue(java.lang.String)
	 * @generated
	 */
	EOperation getSpanView__SetValue__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.SpanView#getContent() <em>Get Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Content</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SpanView#getContent()
	 * @generated
	 */
	EOperation getSpanView__GetContent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.SpanView#setContent(java.lang.String) <em>Set Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Content</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SpanView#setContent(java.lang.String)
	 * @generated
	 */
	EOperation getSpanView__SetContent__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.usersequence.usersequence.views.LabelView <em>Label View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label View</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.LabelView
	 * @generated
	 */
	EClass getLabelView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.usersequence.usersequence.views.LabelView#getInternalLabel <em>Internal Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Label</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.LabelView#getInternalLabel()
	 * @see #getLabelView()
	 * @generated
	 */
	EReference getLabelView_InternalLabel();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.LabelView#isHighlighted() <em>Is Highlighted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Highlighted</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.LabelView#isHighlighted()
	 * @generated
	 */
	EOperation getLabelView__IsHighlighted();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.LabelView#setHighlighted(boolean) <em>Set Highlighted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Highlighted</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.LabelView#setHighlighted(boolean)
	 * @generated
	 */
	EOperation getLabelView__SetHighlighted__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.LabelView#getSelector() <em>Get Selector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Selector</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.LabelView#getSelector()
	 * @generated
	 */
	EOperation getLabelView__GetSelector();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.LabelView#setSelector(java.lang.String) <em>Set Selector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Selector</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.LabelView#setSelector(java.lang.String)
	 * @generated
	 */
	EOperation getLabelView__SetSelector__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.LabelView#getValue() <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.LabelView#getValue()
	 * @generated
	 */
	EOperation getLabelView__GetValue();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.LabelView#setValue(java.lang.String) <em>Set Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.LabelView#setValue(java.lang.String)
	 * @generated
	 */
	EOperation getLabelView__SetValue__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.LabelView#getContent() <em>Get Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Content</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.LabelView#getContent()
	 * @generated
	 */
	EOperation getLabelView__GetContent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.LabelView#setContent(java.lang.String) <em>Set Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Content</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.LabelView#setContent(java.lang.String)
	 * @generated
	 */
	EOperation getLabelView__SetContent__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.usersequence.usersequence.views.FormView <em>Form View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form View</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.FormView
	 * @generated
	 */
	EClass getFormView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.usersequence.usersequence.views.FormView#getInternalForm <em>Internal Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Form</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.FormView#getInternalForm()
	 * @see #getFormView()
	 * @generated
	 */
	EReference getFormView_InternalForm();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.FormView#getMethod() <em>Get Method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Method</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.FormView#getMethod()
	 * @generated
	 */
	EOperation getFormView__GetMethod();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.FormView#setMethod(java.lang.String) <em>Set Method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Method</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.FormView#setMethod(java.lang.String)
	 * @generated
	 */
	EOperation getFormView__SetMethod__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.FormView#getField() <em>Get Field</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Field</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.FormView#getField()
	 * @generated
	 */
	EOperation getFormView__GetField();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.FormView#setField(org.eclipse.emf.common.util.EList) <em>Set Field</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Field</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.FormView#setField(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getFormView__SetField__EList();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.FormView#addField(info.scce.cinco.product.usersequence.usersequence.Input) <em>Add Field</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Field</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.FormView#addField(info.scce.cinco.product.usersequence.usersequence.Input)
	 * @generated
	 */
	EOperation getFormView__AddField__Input();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.FormView#removeField(info.scce.cinco.product.usersequence.usersequence.Input) <em>Remove Field</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Field</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.FormView#removeField(info.scce.cinco.product.usersequence.usersequence.Input)
	 * @generated
	 */
	EOperation getFormView__RemoveField__Input();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.FormView#isHighlighted() <em>Is Highlighted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Highlighted</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.FormView#isHighlighted()
	 * @generated
	 */
	EOperation getFormView__IsHighlighted();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.FormView#setHighlighted(boolean) <em>Set Highlighted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Highlighted</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.FormView#setHighlighted(boolean)
	 * @generated
	 */
	EOperation getFormView__SetHighlighted__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.FormView#getAction() <em>Get Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Action</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.FormView#getAction()
	 * @generated
	 */
	EOperation getFormView__GetAction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.FormView#setAction(java.lang.String) <em>Set Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Action</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.FormView#setAction(java.lang.String)
	 * @generated
	 */
	EOperation getFormView__SetAction__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.usersequence.usersequence.views.InputView <em>Input View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input View</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.InputView
	 * @generated
	 */
	EClass getInputView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.usersequence.usersequence.views.InputView#getInternalInput <em>Internal Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Input</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.InputView#getInternalInput()
	 * @see #getInputView()
	 * @generated
	 */
	EReference getInputView_InternalInput();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.InputView#isHighlighted() <em>Is Highlighted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Highlighted</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.InputView#isHighlighted()
	 * @generated
	 */
	EOperation getInputView__IsHighlighted();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.InputView#setHighlighted(boolean) <em>Set Highlighted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Highlighted</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.InputView#setHighlighted(boolean)
	 * @generated
	 */
	EOperation getInputView__SetHighlighted__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.InputView#getSelector() <em>Get Selector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Selector</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.InputView#getSelector()
	 * @generated
	 */
	EOperation getInputView__GetSelector();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.InputView#setSelector(java.lang.String) <em>Set Selector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Selector</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.InputView#setSelector(java.lang.String)
	 * @generated
	 */
	EOperation getInputView__SetSelector__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.InputView#getValue() <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.InputView#getValue()
	 * @generated
	 */
	EOperation getInputView__GetValue();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.InputView#setValue(java.lang.String) <em>Set Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.InputView#setValue(java.lang.String)
	 * @generated
	 */
	EOperation getInputView__SetValue__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.InputView#getContent() <em>Get Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Content</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.InputView#getContent()
	 * @generated
	 */
	EOperation getInputView__GetContent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.InputView#setContent(java.lang.String) <em>Set Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Content</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.InputView#setContent(java.lang.String)
	 * @generated
	 */
	EOperation getInputView__SetContent__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.usersequence.usersequence.views.TextareaView <em>Textarea View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textarea View</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TextareaView
	 * @generated
	 */
	EClass getTextareaView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.usersequence.usersequence.views.TextareaView#getInternalTextarea <em>Internal Textarea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Textarea</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TextareaView#getInternalTextarea()
	 * @see #getTextareaView()
	 * @generated
	 */
	EReference getTextareaView_InternalTextarea();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.usersequence.usersequence.views.ButtonView <em>Button View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button View</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ButtonView
	 * @generated
	 */
	EClass getButtonView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.usersequence.usersequence.views.ButtonView#getInternalButton <em>Internal Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Button</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ButtonView#getInternalButton()
	 * @see #getButtonView()
	 * @generated
	 */
	EReference getButtonView_InternalButton();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.ButtonView#isHighlighted() <em>Is Highlighted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Highlighted</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ButtonView#isHighlighted()
	 * @generated
	 */
	EOperation getButtonView__IsHighlighted();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.ButtonView#setHighlighted(boolean) <em>Set Highlighted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Highlighted</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ButtonView#setHighlighted(boolean)
	 * @generated
	 */
	EOperation getButtonView__SetHighlighted__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.ButtonView#getAction() <em>Get Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Action</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ButtonView#getAction()
	 * @generated
	 */
	EOperation getButtonView__GetAction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.ButtonView#setAction(info.scce.cinco.product.usersequence.usersequence.ButtonAction) <em>Set Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Action</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ButtonView#setAction(info.scce.cinco.product.usersequence.usersequence.ButtonAction)
	 * @generated
	 */
	EOperation getButtonView__SetAction__ButtonAction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.ButtonView#getSelector() <em>Get Selector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Selector</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ButtonView#getSelector()
	 * @generated
	 */
	EOperation getButtonView__GetSelector();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.ButtonView#setSelector(java.lang.String) <em>Set Selector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Selector</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ButtonView#setSelector(java.lang.String)
	 * @generated
	 */
	EOperation getButtonView__SetSelector__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.ButtonView#getValue() <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ButtonView#getValue()
	 * @generated
	 */
	EOperation getButtonView__GetValue();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.ButtonView#setValue(java.lang.String) <em>Set Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ButtonView#setValue(java.lang.String)
	 * @generated
	 */
	EOperation getButtonView__SetValue__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.ButtonView#getContent() <em>Get Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Content</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ButtonView#getContent()
	 * @generated
	 */
	EOperation getButtonView__GetContent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.ButtonView#setContent(java.lang.String) <em>Set Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Content</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ButtonView#setContent(java.lang.String)
	 * @generated
	 */
	EOperation getButtonView__SetContent__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.usersequence.usersequence.views.SelectBoxView <em>Select Box View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Box View</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SelectBoxView
	 * @generated
	 */
	EClass getSelectBoxView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.usersequence.usersequence.views.SelectBoxView#getInternalSelectBox <em>Internal Select Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Select Box</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SelectBoxView#getInternalSelectBox()
	 * @see #getSelectBoxView()
	 * @generated
	 */
	EReference getSelectBoxView_InternalSelectBox();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.SelectBoxView#isHighlighted() <em>Is Highlighted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Highlighted</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SelectBoxView#isHighlighted()
	 * @generated
	 */
	EOperation getSelectBoxView__IsHighlighted();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.SelectBoxView#setHighlighted(boolean) <em>Set Highlighted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Highlighted</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SelectBoxView#setHighlighted(boolean)
	 * @generated
	 */
	EOperation getSelectBoxView__SetHighlighted__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.SelectBoxView#getSelector() <em>Get Selector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Selector</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SelectBoxView#getSelector()
	 * @generated
	 */
	EOperation getSelectBoxView__GetSelector();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.SelectBoxView#setSelector(java.lang.String) <em>Set Selector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Selector</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SelectBoxView#setSelector(java.lang.String)
	 * @generated
	 */
	EOperation getSelectBoxView__SetSelector__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.SelectBoxView#getValue() <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SelectBoxView#getValue()
	 * @generated
	 */
	EOperation getSelectBoxView__GetValue();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.SelectBoxView#setValue(java.lang.String) <em>Set Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SelectBoxView#setValue(java.lang.String)
	 * @generated
	 */
	EOperation getSelectBoxView__SetValue__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.SelectBoxView#getContent() <em>Get Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Content</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SelectBoxView#getContent()
	 * @generated
	 */
	EOperation getSelectBoxView__GetContent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.SelectBoxView#setContent(java.lang.String) <em>Set Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Content</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SelectBoxView#setContent(java.lang.String)
	 * @generated
	 */
	EOperation getSelectBoxView__SetContent__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.usersequence.usersequence.views.SelectBoxOptionView <em>Select Box Option View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Box Option View</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SelectBoxOptionView
	 * @generated
	 */
	EClass getSelectBoxOptionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.usersequence.usersequence.views.SelectBoxOptionView#getInternalSelectBoxOption <em>Internal Select Box Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Select Box Option</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SelectBoxOptionView#getInternalSelectBoxOption()
	 * @see #getSelectBoxOptionView()
	 * @generated
	 */
	EReference getSelectBoxOptionView_InternalSelectBoxOption();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.SelectBoxOptionView#isHighlighted() <em>Is Highlighted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Highlighted</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SelectBoxOptionView#isHighlighted()
	 * @generated
	 */
	EOperation getSelectBoxOptionView__IsHighlighted();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.SelectBoxOptionView#setHighlighted(boolean) <em>Set Highlighted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Highlighted</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SelectBoxOptionView#setHighlighted(boolean)
	 * @generated
	 */
	EOperation getSelectBoxOptionView__SetHighlighted__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.SelectBoxOptionView#getSelector() <em>Get Selector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Selector</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SelectBoxOptionView#getSelector()
	 * @generated
	 */
	EOperation getSelectBoxOptionView__GetSelector();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.SelectBoxOptionView#setSelector(java.lang.String) <em>Set Selector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Selector</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SelectBoxOptionView#setSelector(java.lang.String)
	 * @generated
	 */
	EOperation getSelectBoxOptionView__SetSelector__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.SelectBoxOptionView#getValue() <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SelectBoxOptionView#getValue()
	 * @generated
	 */
	EOperation getSelectBoxOptionView__GetValue();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.SelectBoxOptionView#setValue(java.lang.String) <em>Set Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SelectBoxOptionView#setValue(java.lang.String)
	 * @generated
	 */
	EOperation getSelectBoxOptionView__SetValue__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.SelectBoxOptionView#getContent() <em>Get Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Content</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SelectBoxOptionView#getContent()
	 * @generated
	 */
	EOperation getSelectBoxOptionView__GetContent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.SelectBoxOptionView#setContent(java.lang.String) <em>Set Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Content</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SelectBoxOptionView#setContent(java.lang.String)
	 * @generated
	 */
	EOperation getSelectBoxOptionView__SetContent__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.usersequence.usersequence.views.TableView <em>Table View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table View</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableView
	 * @generated
	 */
	EClass getTableView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.usersequence.usersequence.views.TableView#getInternalTable <em>Internal Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Table</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableView#getInternalTable()
	 * @see #getTableView()
	 * @generated
	 */
	EReference getTableView_InternalTable();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableView#isHighlighted() <em>Is Highlighted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Highlighted</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableView#isHighlighted()
	 * @generated
	 */
	EOperation getTableView__IsHighlighted();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableView#setHighlighted(boolean) <em>Set Highlighted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Highlighted</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableView#setHighlighted(boolean)
	 * @generated
	 */
	EOperation getTableView__SetHighlighted__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableView#getSelector() <em>Get Selector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Selector</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableView#getSelector()
	 * @generated
	 */
	EOperation getTableView__GetSelector();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableView#setSelector(java.lang.String) <em>Set Selector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Selector</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableView#setSelector(java.lang.String)
	 * @generated
	 */
	EOperation getTableView__SetSelector__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableView#getValue() <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableView#getValue()
	 * @generated
	 */
	EOperation getTableView__GetValue();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableView#setValue(java.lang.String) <em>Set Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableView#setValue(java.lang.String)
	 * @generated
	 */
	EOperation getTableView__SetValue__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableView#getContent() <em>Get Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Content</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableView#getContent()
	 * @generated
	 */
	EOperation getTableView__GetContent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableView#setContent(java.lang.String) <em>Set Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Content</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableView#setContent(java.lang.String)
	 * @generated
	 */
	EOperation getTableView__SetContent__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.usersequence.usersequence.views.TableHeadView <em>Table Head View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Head View</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableHeadView
	 * @generated
	 */
	EClass getTableHeadView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.usersequence.usersequence.views.TableHeadView#getInternalTableHead <em>Internal Table Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Table Head</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableHeadView#getInternalTableHead()
	 * @see #getTableHeadView()
	 * @generated
	 */
	EReference getTableHeadView_InternalTableHead();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableHeadView#isHighlighted() <em>Is Highlighted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Highlighted</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableHeadView#isHighlighted()
	 * @generated
	 */
	EOperation getTableHeadView__IsHighlighted();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableHeadView#setHighlighted(boolean) <em>Set Highlighted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Highlighted</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableHeadView#setHighlighted(boolean)
	 * @generated
	 */
	EOperation getTableHeadView__SetHighlighted__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableHeadView#getSelector() <em>Get Selector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Selector</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableHeadView#getSelector()
	 * @generated
	 */
	EOperation getTableHeadView__GetSelector();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableHeadView#setSelector(java.lang.String) <em>Set Selector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Selector</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableHeadView#setSelector(java.lang.String)
	 * @generated
	 */
	EOperation getTableHeadView__SetSelector__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableHeadView#getValue() <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableHeadView#getValue()
	 * @generated
	 */
	EOperation getTableHeadView__GetValue();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableHeadView#setValue(java.lang.String) <em>Set Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableHeadView#setValue(java.lang.String)
	 * @generated
	 */
	EOperation getTableHeadView__SetValue__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableHeadView#getContent() <em>Get Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Content</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableHeadView#getContent()
	 * @generated
	 */
	EOperation getTableHeadView__GetContent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableHeadView#setContent(java.lang.String) <em>Set Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Content</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableHeadView#setContent(java.lang.String)
	 * @generated
	 */
	EOperation getTableHeadView__SetContent__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.usersequence.usersequence.views.ThView <em>Th View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Th View</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ThView
	 * @generated
	 */
	EClass getThView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.usersequence.usersequence.views.ThView#getInternalTh <em>Internal Th</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Th</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ThView#getInternalTh()
	 * @see #getThView()
	 * @generated
	 */
	EReference getThView_InternalTh();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.ThView#isHighlighted() <em>Is Highlighted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Highlighted</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ThView#isHighlighted()
	 * @generated
	 */
	EOperation getThView__IsHighlighted();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.ThView#setHighlighted(boolean) <em>Set Highlighted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Highlighted</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ThView#setHighlighted(boolean)
	 * @generated
	 */
	EOperation getThView__SetHighlighted__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.ThView#getSelector() <em>Get Selector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Selector</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ThView#getSelector()
	 * @generated
	 */
	EOperation getThView__GetSelector();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.ThView#setSelector(java.lang.String) <em>Set Selector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Selector</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ThView#setSelector(java.lang.String)
	 * @generated
	 */
	EOperation getThView__SetSelector__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.ThView#getValue() <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ThView#getValue()
	 * @generated
	 */
	EOperation getThView__GetValue();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.ThView#setValue(java.lang.String) <em>Set Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ThView#setValue(java.lang.String)
	 * @generated
	 */
	EOperation getThView__SetValue__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.ThView#getContent() <em>Get Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Content</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ThView#getContent()
	 * @generated
	 */
	EOperation getThView__GetContent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.ThView#setContent(java.lang.String) <em>Set Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Content</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.ThView#setContent(java.lang.String)
	 * @generated
	 */
	EOperation getThView__SetContent__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.usersequence.usersequence.views.TableRowView <em>Table Row View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Row View</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableRowView
	 * @generated
	 */
	EClass getTableRowView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.usersequence.usersequence.views.TableRowView#getInternalTableRow <em>Internal Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Table Row</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableRowView#getInternalTableRow()
	 * @see #getTableRowView()
	 * @generated
	 */
	EReference getTableRowView_InternalTableRow();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableRowView#isHighlighted() <em>Is Highlighted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Highlighted</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableRowView#isHighlighted()
	 * @generated
	 */
	EOperation getTableRowView__IsHighlighted();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableRowView#setHighlighted(boolean) <em>Set Highlighted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Highlighted</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableRowView#setHighlighted(boolean)
	 * @generated
	 */
	EOperation getTableRowView__SetHighlighted__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableRowView#getSelector() <em>Get Selector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Selector</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableRowView#getSelector()
	 * @generated
	 */
	EOperation getTableRowView__GetSelector();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableRowView#setSelector(java.lang.String) <em>Set Selector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Selector</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableRowView#setSelector(java.lang.String)
	 * @generated
	 */
	EOperation getTableRowView__SetSelector__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableRowView#getValue() <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableRowView#getValue()
	 * @generated
	 */
	EOperation getTableRowView__GetValue();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableRowView#setValue(java.lang.String) <em>Set Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableRowView#setValue(java.lang.String)
	 * @generated
	 */
	EOperation getTableRowView__SetValue__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableRowView#getContent() <em>Get Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Content</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableRowView#getContent()
	 * @generated
	 */
	EOperation getTableRowView__GetContent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableRowView#setContent(java.lang.String) <em>Set Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Content</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableRowView#setContent(java.lang.String)
	 * @generated
	 */
	EOperation getTableRowView__SetContent__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.usersequence.usersequence.views.TableBodyView <em>Table Body View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Body View</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableBodyView
	 * @generated
	 */
	EClass getTableBodyView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.usersequence.usersequence.views.TableBodyView#getInternalTableBody <em>Internal Table Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Table Body</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableBodyView#getInternalTableBody()
	 * @see #getTableBodyView()
	 * @generated
	 */
	EReference getTableBodyView_InternalTableBody();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableBodyView#isHighlighted() <em>Is Highlighted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Highlighted</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableBodyView#isHighlighted()
	 * @generated
	 */
	EOperation getTableBodyView__IsHighlighted();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableBodyView#setHighlighted(boolean) <em>Set Highlighted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Highlighted</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableBodyView#setHighlighted(boolean)
	 * @generated
	 */
	EOperation getTableBodyView__SetHighlighted__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableBodyView#getSelector() <em>Get Selector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Selector</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableBodyView#getSelector()
	 * @generated
	 */
	EOperation getTableBodyView__GetSelector();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableBodyView#setSelector(java.lang.String) <em>Set Selector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Selector</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableBodyView#setSelector(java.lang.String)
	 * @generated
	 */
	EOperation getTableBodyView__SetSelector__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableBodyView#getValue() <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableBodyView#getValue()
	 * @generated
	 */
	EOperation getTableBodyView__GetValue();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableBodyView#setValue(java.lang.String) <em>Set Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableBodyView#setValue(java.lang.String)
	 * @generated
	 */
	EOperation getTableBodyView__SetValue__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableBodyView#getContent() <em>Get Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Content</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableBodyView#getContent()
	 * @generated
	 */
	EOperation getTableBodyView__GetContent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableBodyView#setContent(java.lang.String) <em>Set Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Content</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableBodyView#setContent(java.lang.String)
	 * @generated
	 */
	EOperation getTableBodyView__SetContent__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.usersequence.usersequence.views.TableDataView <em>Table Data View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Data View</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableDataView
	 * @generated
	 */
	EClass getTableDataView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.usersequence.usersequence.views.TableDataView#getInternalTableData <em>Internal Table Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Table Data</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableDataView#getInternalTableData()
	 * @see #getTableDataView()
	 * @generated
	 */
	EReference getTableDataView_InternalTableData();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableDataView#isHighlighted() <em>Is Highlighted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Highlighted</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableDataView#isHighlighted()
	 * @generated
	 */
	EOperation getTableDataView__IsHighlighted();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableDataView#setHighlighted(boolean) <em>Set Highlighted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Highlighted</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableDataView#setHighlighted(boolean)
	 * @generated
	 */
	EOperation getTableDataView__SetHighlighted__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableDataView#getSelector() <em>Get Selector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Selector</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableDataView#getSelector()
	 * @generated
	 */
	EOperation getTableDataView__GetSelector();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableDataView#setSelector(java.lang.String) <em>Set Selector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Selector</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableDataView#setSelector(java.lang.String)
	 * @generated
	 */
	EOperation getTableDataView__SetSelector__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableDataView#getValue() <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableDataView#getValue()
	 * @generated
	 */
	EOperation getTableDataView__GetValue();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableDataView#setValue(java.lang.String) <em>Set Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableDataView#setValue(java.lang.String)
	 * @generated
	 */
	EOperation getTableDataView__SetValue__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableDataView#getContent() <em>Get Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Content</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableDataView#getContent()
	 * @generated
	 */
	EOperation getTableDataView__GetContent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.TableDataView#setContent(java.lang.String) <em>Set Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Content</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TableDataView#setContent(java.lang.String)
	 * @generated
	 */
	EOperation getTableDataView__SetContent__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.usersequence.usersequence.views.SectionView <em>Section View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section View</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SectionView
	 * @generated
	 */
	EClass getSectionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.usersequence.usersequence.views.SectionView#getInternalSection <em>Internal Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Section</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SectionView#getInternalSection()
	 * @see #getSectionView()
	 * @generated
	 */
	EReference getSectionView_InternalSection();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.SectionView#isHighlighted() <em>Is Highlighted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Highlighted</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SectionView#isHighlighted()
	 * @generated
	 */
	EOperation getSectionView__IsHighlighted();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.SectionView#setHighlighted(boolean) <em>Set Highlighted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Highlighted</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SectionView#setHighlighted(boolean)
	 * @generated
	 */
	EOperation getSectionView__SetHighlighted__boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.SectionView#getTitle() <em>Get Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Title</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SectionView#getTitle()
	 * @generated
	 */
	EOperation getSectionView__GetTitle();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.SectionView#setTitle(java.lang.String) <em>Set Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Title</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.SectionView#setTitle(java.lang.String)
	 * @generated
	 */
	EOperation getSectionView__SetTitle__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.usersequence.usersequence.views.CommentView <em>Comment View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment View</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.CommentView
	 * @generated
	 */
	EClass getCommentView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.usersequence.usersequence.views.CommentView#getInternalComment <em>Internal Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Comment</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.CommentView#getInternalComment()
	 * @see #getCommentView()
	 * @generated
	 */
	EReference getCommentView_InternalComment();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.CommentView#getContent() <em>Get Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Content</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.CommentView#getContent()
	 * @generated
	 */
	EOperation getCommentView__GetContent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.CommentView#setContent(java.lang.String) <em>Set Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Content</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.CommentView#setContent(java.lang.String)
	 * @generated
	 */
	EOperation getCommentView__SetContent__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.CommentView#getReferenceTo() <em>Get Reference To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Reference To</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.CommentView#getReferenceTo()
	 * @generated
	 */
	EOperation getCommentView__GetReferenceTo();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.CommentView#setReferenceTo(info.scce.cinco.product.usersequence.usersequence.Screenshot) <em>Set Reference To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Reference To</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.CommentView#setReferenceTo(info.scce.cinco.product.usersequence.usersequence.Screenshot)
	 * @generated
	 */
	EOperation getCommentView__SetReferenceTo__Screenshot();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.usersequence.usersequence.views.TransitionView <em>Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition View</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TransitionView
	 * @generated
	 */
	EClass getTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.usersequence.usersequence.views.TransitionView#getInternalTransition <em>Internal Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Transition</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.TransitionView#getInternalTransition()
	 * @see #getTransitionView()
	 * @generated
	 */
	EReference getTransitionView_InternalTransition();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.usersequence.usersequence.views.LabeledTransitionView <em>Labeled Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labeled Transition View</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.LabeledTransitionView
	 * @generated
	 */
	EClass getLabeledTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.usersequence.usersequence.views.LabeledTransitionView#getInternalLabeledTransition <em>Internal Labeled Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Labeled Transition</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.LabeledTransitionView#getInternalLabeledTransition()
	 * @see #getLabeledTransitionView()
	 * @generated
	 */
	EReference getLabeledTransitionView_InternalLabeledTransition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.LabeledTransitionView#getLabel() <em>Get Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Label</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.LabeledTransitionView#getLabel()
	 * @generated
	 */
	EOperation getLabeledTransitionView__GetLabel();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.LabeledTransitionView#setLabel(java.lang.String) <em>Set Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Label</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.LabeledTransitionView#setLabel(java.lang.String)
	 * @generated
	 */
	EOperation getLabeledTransitionView__SetLabel__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.usersequence.usersequence.views.AnchorView <em>Anchor View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anchor View</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.AnchorView
	 * @generated
	 */
	EClass getAnchorView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.usersequence.usersequence.views.AnchorView#getInternalAnchor <em>Internal Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Anchor</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.AnchorView#getInternalAnchor()
	 * @see #getAnchorView()
	 * @generated
	 */
	EReference getAnchorView_InternalAnchor();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.usersequence.usersequence.views.UserSequenceGraphModelView <em>User Sequence Graph Model View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Sequence Graph Model View</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.UserSequenceGraphModelView
	 * @generated
	 */
	EClass getUserSequenceGraphModelView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.usersequence.usersequence.views.UserSequenceGraphModelView#getInternalUserSequenceGraphModel <em>Internal User Sequence Graph Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal User Sequence Graph Model</em>'.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.UserSequenceGraphModelView#getInternalUserSequenceGraphModel()
	 * @see #getUserSequenceGraphModelView()
	 * @generated
	 */
	EReference getUserSequenceGraphModelView_InternalUserSequenceGraphModel();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.UserSequenceGraphModelView#getModelName() <em>Get Model Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Model Name</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.UserSequenceGraphModelView#getModelName()
	 * @generated
	 */
	EOperation getUserSequenceGraphModelView__GetModelName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.usersequence.usersequence.views.UserSequenceGraphModelView#setModelName(java.lang.String) <em>Set Model Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Model Name</em>' operation.
	 * @see info.scce.cinco.product.usersequence.usersequence.views.UserSequenceGraphModelView#setModelName(java.lang.String)
	 * @generated
	 */
	EOperation getUserSequenceGraphModelView__SetModelName__String();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ViewsFactory getViewsFactory();

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
		 * The meta object literal for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.StartViewImpl <em>Start View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.StartViewImpl
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getStartView()
		 * @generated
		 */
		EClass START_VIEW = eINSTANCE.getStartView();

		/**
		 * The meta object literal for the '<em><b>Internal Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_VIEW__INTERNAL_START = eINSTANCE.getStartView_InternalStart();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.StopViewImpl <em>Stop View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.StopViewImpl
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getStopView()
		 * @generated
		 */
		EClass STOP_VIEW = eINSTANCE.getStopView();

		/**
		 * The meta object literal for the '<em><b>Internal Stop</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_VIEW__INTERNAL_STOP = eINSTANCE.getStopView_InternalStop();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.SubSequenceViewImpl <em>Sub Sequence View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.SubSequenceViewImpl
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getSubSequenceView()
		 * @generated
		 */
		EClass SUB_SEQUENCE_VIEW = eINSTANCE.getSubSequenceView();

		/**
		 * The meta object literal for the '<em><b>Internal Sub Sequence</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_SEQUENCE_VIEW__INTERNAL_SUB_SEQUENCE = eINSTANCE.getSubSequenceView_InternalSubSequence();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.BaseURLViewImpl <em>Base URL View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.BaseURLViewImpl
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getBaseURLView()
		 * @generated
		 */
		EClass BASE_URL_VIEW = eINSTANCE.getBaseURLView();

		/**
		 * The meta object literal for the '<em><b>Internal Base URL</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_URL_VIEW__INTERNAL_BASE_URL = eINSTANCE.getBaseURLView_InternalBaseURL();

		/**
		 * The meta object literal for the '<em><b>Get Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BASE_URL_VIEW___GET_CONTENT = eINSTANCE.getBaseURLView__GetContent();

		/**
		 * The meta object literal for the '<em><b>Set Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BASE_URL_VIEW___SET_CONTENT__STRING = eINSTANCE.getBaseURLView__SetContent__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.DomainViewImpl <em>Domain View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.DomainViewImpl
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getDomainView()
		 * @generated
		 */
		EClass DOMAIN_VIEW = eINSTANCE.getDomainView();

		/**
		 * The meta object literal for the '<em><b>Internal Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_VIEW__INTERNAL_DOMAIN = eINSTANCE.getDomainView_InternalDomain();

		/**
		 * The meta object literal for the '<em><b>Get Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOMAIN_VIEW___GET_CONTENT = eINSTANCE.getDomainView__GetContent();

		/**
		 * The meta object literal for the '<em><b>Set Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOMAIN_VIEW___SET_CONTENT__STRING = eINSTANCE.getDomainView__SetContent__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.KeyValueViewImpl <em>Key Value View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.KeyValueViewImpl
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getKeyValueView()
		 * @generated
		 */
		EClass KEY_VALUE_VIEW = eINSTANCE.getKeyValueView();

		/**
		 * The meta object literal for the '<em><b>Internal Key Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_VALUE_VIEW__INTERNAL_KEY_VALUE = eINSTANCE.getKeyValueView_InternalKeyValue();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KEY_VALUE_VIEW___GET_VALUE = eINSTANCE.getKeyValueView__GetValue();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KEY_VALUE_VIEW___SET_VALUE__STRING = eINSTANCE.getKeyValueView__SetValue__String();

		/**
		 * The meta object literal for the '<em><b>Get Key</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KEY_VALUE_VIEW___GET_KEY = eINSTANCE.getKeyValueView__GetKey();

		/**
		 * The meta object literal for the '<em><b>Set Key</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KEY_VALUE_VIEW___SET_KEY__STRING = eINSTANCE.getKeyValueView__SetKey__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.ScreenshotViewImpl <em>Screenshot View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ScreenshotViewImpl
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getScreenshotView()
		 * @generated
		 */
		EClass SCREENSHOT_VIEW = eINSTANCE.getScreenshotView();

		/**
		 * The meta object literal for the '<em><b>Internal Screenshot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCREENSHOT_VIEW__INTERNAL_SCREENSHOT = eINSTANCE.getScreenshotView_InternalScreenshot();

		/**
		 * The meta object literal for the '<em><b>Get Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCREENSHOT_VIEW___GET_DESCRIPTION = eINSTANCE.getScreenshotView__GetDescription();

		/**
		 * The meta object literal for the '<em><b>Set Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCREENSHOT_VIEW___SET_DESCRIPTION__COMMENT = eINSTANCE.getScreenshotView__SetDescription__Comment();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.SectionNodeViewImpl <em>Section Node View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.SectionNodeViewImpl
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getSectionNodeView()
		 * @generated
		 */
		EClass SECTION_NODE_VIEW = eINSTANCE.getSectionNodeView();

		/**
		 * The meta object literal for the '<em><b>Internal Section Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_NODE_VIEW__INTERNAL_SECTION_NODE = eINSTANCE.getSectionNodeView_InternalSectionNode();

		/**
		 * The meta object literal for the '<em><b>Get Title</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SECTION_NODE_VIEW___GET_TITLE = eINSTANCE.getSectionNodeView__GetTitle();

		/**
		 * The meta object literal for the '<em><b>Set Title</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SECTION_NODE_VIEW___SET_TITLE__STRING = eINSTANCE.getSectionNodeView__SetTitle__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.NavigationViewImpl <em>Navigation View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.NavigationViewImpl
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getNavigationView()
		 * @generated
		 */
		EClass NAVIGATION_VIEW = eINSTANCE.getNavigationView();

		/**
		 * The meta object literal for the '<em><b>Internal Navigation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION_VIEW__INTERNAL_NAVIGATION = eINSTANCE.getNavigationView_InternalNavigation();

		/**
		 * The meta object literal for the '<em><b>Get Link</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAVIGATION_VIEW___GET_LINK = eINSTANCE.getNavigationView__GetLink();

		/**
		 * The meta object literal for the '<em><b>Set Link</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAVIGATION_VIEW___SET_LINK__STRING = eINSTANCE.getNavigationView__SetLink__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.WebElementViewImpl <em>Web Element View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.WebElementViewImpl
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getWebElementView()
		 * @generated
		 */
		EClass WEB_ELEMENT_VIEW = eINSTANCE.getWebElementView();

		/**
		 * The meta object literal for the '<em><b>Internal Web Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_ELEMENT_VIEW__INTERNAL_WEB_ELEMENT = eINSTANCE.getWebElementView_InternalWebElement();

		/**
		 * The meta object literal for the '<em><b>Is Is Highlighted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WEB_ELEMENT_VIEW___IS_IS_HIGHLIGHTED = eINSTANCE.getWebElementView__IsIsHighlighted();

		/**
		 * The meta object literal for the '<em><b>Set Is Highlighted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WEB_ELEMENT_VIEW___SET_IS_HIGHLIGHTED__BOOLEAN = eINSTANCE.getWebElementView__SetIsHighlighted__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Content Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WEB_ELEMENT_VIEW___GET_CONTENT_TEXT = eINSTANCE.getWebElementView__GetContentText();

		/**
		 * The meta object literal for the '<em><b>Set Content Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WEB_ELEMENT_VIEW___SET_CONTENT_TEXT__STRING = eINSTANCE.getWebElementView__SetContentText__String();

		/**
		 * The meta object literal for the '<em><b>Get Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WEB_ELEMENT_VIEW___GET_ATTRIBUTE = eINSTANCE.getWebElementView__GetAttribute();

		/**
		 * The meta object literal for the '<em><b>Set Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WEB_ELEMENT_VIEW___SET_ATTRIBUTE__STRING = eINSTANCE.getWebElementView__SetAttribute__String();

		/**
		 * The meta object literal for the '<em><b>Get Attr Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WEB_ELEMENT_VIEW___GET_ATTR_VALUE = eINSTANCE.getWebElementView__GetAttrValue();

		/**
		 * The meta object literal for the '<em><b>Set Attr Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WEB_ELEMENT_VIEW___SET_ATTR_VALUE__STRING = eINSTANCE.getWebElementView__SetAttrValue__String();

		/**
		 * The meta object literal for the '<em><b>Get Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WEB_ELEMENT_VIEW___GET_TAG_NAME = eINSTANCE.getWebElementView__GetTagName();

		/**
		 * The meta object literal for the '<em><b>Set Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WEB_ELEMENT_VIEW___SET_TAG_NAME__STRING = eINSTANCE.getWebElementView__SetTagName__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.DivViewImpl <em>Div View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.DivViewImpl
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getDivView()
		 * @generated
		 */
		EClass DIV_VIEW = eINSTANCE.getDivView();

		/**
		 * The meta object literal for the '<em><b>Internal Div</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIV_VIEW__INTERNAL_DIV = eINSTANCE.getDivView_InternalDiv();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.HViewImpl <em>HView</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.HViewImpl
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getHView()
		 * @generated
		 */
		EClass HVIEW = eINSTANCE.getHView();

		/**
		 * The meta object literal for the '<em><b>Internal H</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HVIEW__INTERNAL_H = eINSTANCE.getHView_InternalH();

		/**
		 * The meta object literal for the '<em><b>Is Highlighted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HVIEW___IS_HIGHLIGHTED = eINSTANCE.getHView__IsHighlighted();

		/**
		 * The meta object literal for the '<em><b>Set Highlighted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HVIEW___SET_HIGHLIGHTED__BOOLEAN = eINSTANCE.getHView__SetHighlighted__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Ranking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HVIEW___GET_RANKING = eINSTANCE.getHView__GetRanking();

		/**
		 * The meta object literal for the '<em><b>Set Ranking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HVIEW___SET_RANKING__INT = eINSTANCE.getHView__SetRanking__int();

		/**
		 * The meta object literal for the '<em><b>Get Selector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HVIEW___GET_SELECTOR = eINSTANCE.getHView__GetSelector();

		/**
		 * The meta object literal for the '<em><b>Set Selector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HVIEW___SET_SELECTOR__STRING = eINSTANCE.getHView__SetSelector__String();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HVIEW___GET_VALUE = eINSTANCE.getHView__GetValue();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HVIEW___SET_VALUE__STRING = eINSTANCE.getHView__SetValue__String();

		/**
		 * The meta object literal for the '<em><b>Get Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HVIEW___GET_CONTENT = eINSTANCE.getHView__GetContent();

		/**
		 * The meta object literal for the '<em><b>Set Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HVIEW___SET_CONTENT__STRING = eINSTANCE.getHView__SetContent__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.PViewImpl <em>PView</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.PViewImpl
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getPView()
		 * @generated
		 */
		EClass PVIEW = eINSTANCE.getPView();

		/**
		 * The meta object literal for the '<em><b>Internal P</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVIEW__INTERNAL_P = eINSTANCE.getPView_InternalP();

		/**
		 * The meta object literal for the '<em><b>Is Highlighted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PVIEW___IS_HIGHLIGHTED = eINSTANCE.getPView__IsHighlighted();

		/**
		 * The meta object literal for the '<em><b>Set Highlighted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PVIEW___SET_HIGHLIGHTED__BOOLEAN = eINSTANCE.getPView__SetHighlighted__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Selector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PVIEW___GET_SELECTOR = eINSTANCE.getPView__GetSelector();

		/**
		 * The meta object literal for the '<em><b>Set Selector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PVIEW___SET_SELECTOR__STRING = eINSTANCE.getPView__SetSelector__String();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PVIEW___GET_VALUE = eINSTANCE.getPView__GetValue();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PVIEW___SET_VALUE__STRING = eINSTANCE.getPView__SetValue__String();

		/**
		 * The meta object literal for the '<em><b>Get Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PVIEW___GET_CONTENT = eINSTANCE.getPView__GetContent();

		/**
		 * The meta object literal for the '<em><b>Set Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PVIEW___SET_CONTENT__STRING = eINSTANCE.getPView__SetContent__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.SpanViewImpl <em>Span View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.SpanViewImpl
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getSpanView()
		 * @generated
		 */
		EClass SPAN_VIEW = eINSTANCE.getSpanView();

		/**
		 * The meta object literal for the '<em><b>Internal Span</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPAN_VIEW__INTERNAL_SPAN = eINSTANCE.getSpanView_InternalSpan();

		/**
		 * The meta object literal for the '<em><b>Is Highlighted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPAN_VIEW___IS_HIGHLIGHTED = eINSTANCE.getSpanView__IsHighlighted();

		/**
		 * The meta object literal for the '<em><b>Set Highlighted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPAN_VIEW___SET_HIGHLIGHTED__BOOLEAN = eINSTANCE.getSpanView__SetHighlighted__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Selector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPAN_VIEW___GET_SELECTOR = eINSTANCE.getSpanView__GetSelector();

		/**
		 * The meta object literal for the '<em><b>Set Selector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPAN_VIEW___SET_SELECTOR__STRING = eINSTANCE.getSpanView__SetSelector__String();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPAN_VIEW___GET_VALUE = eINSTANCE.getSpanView__GetValue();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPAN_VIEW___SET_VALUE__STRING = eINSTANCE.getSpanView__SetValue__String();

		/**
		 * The meta object literal for the '<em><b>Get Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPAN_VIEW___GET_CONTENT = eINSTANCE.getSpanView__GetContent();

		/**
		 * The meta object literal for the '<em><b>Set Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPAN_VIEW___SET_CONTENT__STRING = eINSTANCE.getSpanView__SetContent__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.LabelViewImpl <em>Label View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.LabelViewImpl
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getLabelView()
		 * @generated
		 */
		EClass LABEL_VIEW = eINSTANCE.getLabelView();

		/**
		 * The meta object literal for the '<em><b>Internal Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL_VIEW__INTERNAL_LABEL = eINSTANCE.getLabelView_InternalLabel();

		/**
		 * The meta object literal for the '<em><b>Is Highlighted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LABEL_VIEW___IS_HIGHLIGHTED = eINSTANCE.getLabelView__IsHighlighted();

		/**
		 * The meta object literal for the '<em><b>Set Highlighted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LABEL_VIEW___SET_HIGHLIGHTED__BOOLEAN = eINSTANCE.getLabelView__SetHighlighted__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Selector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LABEL_VIEW___GET_SELECTOR = eINSTANCE.getLabelView__GetSelector();

		/**
		 * The meta object literal for the '<em><b>Set Selector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LABEL_VIEW___SET_SELECTOR__STRING = eINSTANCE.getLabelView__SetSelector__String();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LABEL_VIEW___GET_VALUE = eINSTANCE.getLabelView__GetValue();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LABEL_VIEW___SET_VALUE__STRING = eINSTANCE.getLabelView__SetValue__String();

		/**
		 * The meta object literal for the '<em><b>Get Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LABEL_VIEW___GET_CONTENT = eINSTANCE.getLabelView__GetContent();

		/**
		 * The meta object literal for the '<em><b>Set Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LABEL_VIEW___SET_CONTENT__STRING = eINSTANCE.getLabelView__SetContent__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.FormViewImpl <em>Form View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.FormViewImpl
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getFormView()
		 * @generated
		 */
		EClass FORM_VIEW = eINSTANCE.getFormView();

		/**
		 * The meta object literal for the '<em><b>Internal Form</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_VIEW__INTERNAL_FORM = eINSTANCE.getFormView_InternalForm();

		/**
		 * The meta object literal for the '<em><b>Get Method</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORM_VIEW___GET_METHOD = eINSTANCE.getFormView__GetMethod();

		/**
		 * The meta object literal for the '<em><b>Set Method</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORM_VIEW___SET_METHOD__STRING = eINSTANCE.getFormView__SetMethod__String();

		/**
		 * The meta object literal for the '<em><b>Get Field</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORM_VIEW___GET_FIELD = eINSTANCE.getFormView__GetField();

		/**
		 * The meta object literal for the '<em><b>Set Field</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORM_VIEW___SET_FIELD__ELIST = eINSTANCE.getFormView__SetField__EList();

		/**
		 * The meta object literal for the '<em><b>Add Field</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORM_VIEW___ADD_FIELD__INPUT = eINSTANCE.getFormView__AddField__Input();

		/**
		 * The meta object literal for the '<em><b>Remove Field</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORM_VIEW___REMOVE_FIELD__INPUT = eINSTANCE.getFormView__RemoveField__Input();

		/**
		 * The meta object literal for the '<em><b>Is Highlighted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORM_VIEW___IS_HIGHLIGHTED = eINSTANCE.getFormView__IsHighlighted();

		/**
		 * The meta object literal for the '<em><b>Set Highlighted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORM_VIEW___SET_HIGHLIGHTED__BOOLEAN = eINSTANCE.getFormView__SetHighlighted__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORM_VIEW___GET_ACTION = eINSTANCE.getFormView__GetAction();

		/**
		 * The meta object literal for the '<em><b>Set Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORM_VIEW___SET_ACTION__STRING = eINSTANCE.getFormView__SetAction__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.InputViewImpl <em>Input View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.InputViewImpl
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getInputView()
		 * @generated
		 */
		EClass INPUT_VIEW = eINSTANCE.getInputView();

		/**
		 * The meta object literal for the '<em><b>Internal Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_VIEW__INTERNAL_INPUT = eINSTANCE.getInputView_InternalInput();

		/**
		 * The meta object literal for the '<em><b>Is Highlighted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INPUT_VIEW___IS_HIGHLIGHTED = eINSTANCE.getInputView__IsHighlighted();

		/**
		 * The meta object literal for the '<em><b>Set Highlighted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INPUT_VIEW___SET_HIGHLIGHTED__BOOLEAN = eINSTANCE.getInputView__SetHighlighted__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Selector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INPUT_VIEW___GET_SELECTOR = eINSTANCE.getInputView__GetSelector();

		/**
		 * The meta object literal for the '<em><b>Set Selector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INPUT_VIEW___SET_SELECTOR__STRING = eINSTANCE.getInputView__SetSelector__String();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INPUT_VIEW___GET_VALUE = eINSTANCE.getInputView__GetValue();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INPUT_VIEW___SET_VALUE__STRING = eINSTANCE.getInputView__SetValue__String();

		/**
		 * The meta object literal for the '<em><b>Get Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INPUT_VIEW___GET_CONTENT = eINSTANCE.getInputView__GetContent();

		/**
		 * The meta object literal for the '<em><b>Set Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INPUT_VIEW___SET_CONTENT__STRING = eINSTANCE.getInputView__SetContent__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.TextareaViewImpl <em>Textarea View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.TextareaViewImpl
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getTextareaView()
		 * @generated
		 */
		EClass TEXTAREA_VIEW = eINSTANCE.getTextareaView();

		/**
		 * The meta object literal for the '<em><b>Internal Textarea</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTAREA_VIEW__INTERNAL_TEXTAREA = eINSTANCE.getTextareaView_InternalTextarea();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.ButtonViewImpl <em>Button View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ButtonViewImpl
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getButtonView()
		 * @generated
		 */
		EClass BUTTON_VIEW = eINSTANCE.getButtonView();

		/**
		 * The meta object literal for the '<em><b>Internal Button</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON_VIEW__INTERNAL_BUTTON = eINSTANCE.getButtonView_InternalButton();

		/**
		 * The meta object literal for the '<em><b>Is Highlighted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUTTON_VIEW___IS_HIGHLIGHTED = eINSTANCE.getButtonView__IsHighlighted();

		/**
		 * The meta object literal for the '<em><b>Set Highlighted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUTTON_VIEW___SET_HIGHLIGHTED__BOOLEAN = eINSTANCE.getButtonView__SetHighlighted__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUTTON_VIEW___GET_ACTION = eINSTANCE.getButtonView__GetAction();

		/**
		 * The meta object literal for the '<em><b>Set Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUTTON_VIEW___SET_ACTION__BUTTONACTION = eINSTANCE.getButtonView__SetAction__ButtonAction();

		/**
		 * The meta object literal for the '<em><b>Get Selector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUTTON_VIEW___GET_SELECTOR = eINSTANCE.getButtonView__GetSelector();

		/**
		 * The meta object literal for the '<em><b>Set Selector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUTTON_VIEW___SET_SELECTOR__STRING = eINSTANCE.getButtonView__SetSelector__String();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUTTON_VIEW___GET_VALUE = eINSTANCE.getButtonView__GetValue();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUTTON_VIEW___SET_VALUE__STRING = eINSTANCE.getButtonView__SetValue__String();

		/**
		 * The meta object literal for the '<em><b>Get Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUTTON_VIEW___GET_CONTENT = eINSTANCE.getButtonView__GetContent();

		/**
		 * The meta object literal for the '<em><b>Set Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUTTON_VIEW___SET_CONTENT__STRING = eINSTANCE.getButtonView__SetContent__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.SelectBoxViewImpl <em>Select Box View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.SelectBoxViewImpl
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getSelectBoxView()
		 * @generated
		 */
		EClass SELECT_BOX_VIEW = eINSTANCE.getSelectBoxView();

		/**
		 * The meta object literal for the '<em><b>Internal Select Box</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_BOX_VIEW__INTERNAL_SELECT_BOX = eINSTANCE.getSelectBoxView_InternalSelectBox();

		/**
		 * The meta object literal for the '<em><b>Is Highlighted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SELECT_BOX_VIEW___IS_HIGHLIGHTED = eINSTANCE.getSelectBoxView__IsHighlighted();

		/**
		 * The meta object literal for the '<em><b>Set Highlighted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SELECT_BOX_VIEW___SET_HIGHLIGHTED__BOOLEAN = eINSTANCE.getSelectBoxView__SetHighlighted__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Selector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SELECT_BOX_VIEW___GET_SELECTOR = eINSTANCE.getSelectBoxView__GetSelector();

		/**
		 * The meta object literal for the '<em><b>Set Selector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SELECT_BOX_VIEW___SET_SELECTOR__STRING = eINSTANCE.getSelectBoxView__SetSelector__String();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SELECT_BOX_VIEW___GET_VALUE = eINSTANCE.getSelectBoxView__GetValue();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SELECT_BOX_VIEW___SET_VALUE__STRING = eINSTANCE.getSelectBoxView__SetValue__String();

		/**
		 * The meta object literal for the '<em><b>Get Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SELECT_BOX_VIEW___GET_CONTENT = eINSTANCE.getSelectBoxView__GetContent();

		/**
		 * The meta object literal for the '<em><b>Set Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SELECT_BOX_VIEW___SET_CONTENT__STRING = eINSTANCE.getSelectBoxView__SetContent__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.SelectBoxOptionViewImpl <em>Select Box Option View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.SelectBoxOptionViewImpl
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getSelectBoxOptionView()
		 * @generated
		 */
		EClass SELECT_BOX_OPTION_VIEW = eINSTANCE.getSelectBoxOptionView();

		/**
		 * The meta object literal for the '<em><b>Internal Select Box Option</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_BOX_OPTION_VIEW__INTERNAL_SELECT_BOX_OPTION = eINSTANCE.getSelectBoxOptionView_InternalSelectBoxOption();

		/**
		 * The meta object literal for the '<em><b>Is Highlighted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SELECT_BOX_OPTION_VIEW___IS_HIGHLIGHTED = eINSTANCE.getSelectBoxOptionView__IsHighlighted();

		/**
		 * The meta object literal for the '<em><b>Set Highlighted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SELECT_BOX_OPTION_VIEW___SET_HIGHLIGHTED__BOOLEAN = eINSTANCE.getSelectBoxOptionView__SetHighlighted__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Selector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SELECT_BOX_OPTION_VIEW___GET_SELECTOR = eINSTANCE.getSelectBoxOptionView__GetSelector();

		/**
		 * The meta object literal for the '<em><b>Set Selector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SELECT_BOX_OPTION_VIEW___SET_SELECTOR__STRING = eINSTANCE.getSelectBoxOptionView__SetSelector__String();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SELECT_BOX_OPTION_VIEW___GET_VALUE = eINSTANCE.getSelectBoxOptionView__GetValue();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SELECT_BOX_OPTION_VIEW___SET_VALUE__STRING = eINSTANCE.getSelectBoxOptionView__SetValue__String();

		/**
		 * The meta object literal for the '<em><b>Get Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SELECT_BOX_OPTION_VIEW___GET_CONTENT = eINSTANCE.getSelectBoxOptionView__GetContent();

		/**
		 * The meta object literal for the '<em><b>Set Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SELECT_BOX_OPTION_VIEW___SET_CONTENT__STRING = eINSTANCE.getSelectBoxOptionView__SetContent__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.TableViewImpl <em>Table View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.TableViewImpl
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getTableView()
		 * @generated
		 */
		EClass TABLE_VIEW = eINSTANCE.getTableView();

		/**
		 * The meta object literal for the '<em><b>Internal Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_VIEW__INTERNAL_TABLE = eINSTANCE.getTableView_InternalTable();

		/**
		 * The meta object literal for the '<em><b>Is Highlighted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_VIEW___IS_HIGHLIGHTED = eINSTANCE.getTableView__IsHighlighted();

		/**
		 * The meta object literal for the '<em><b>Set Highlighted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_VIEW___SET_HIGHLIGHTED__BOOLEAN = eINSTANCE.getTableView__SetHighlighted__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Selector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_VIEW___GET_SELECTOR = eINSTANCE.getTableView__GetSelector();

		/**
		 * The meta object literal for the '<em><b>Set Selector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_VIEW___SET_SELECTOR__STRING = eINSTANCE.getTableView__SetSelector__String();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_VIEW___GET_VALUE = eINSTANCE.getTableView__GetValue();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_VIEW___SET_VALUE__STRING = eINSTANCE.getTableView__SetValue__String();

		/**
		 * The meta object literal for the '<em><b>Get Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_VIEW___GET_CONTENT = eINSTANCE.getTableView__GetContent();

		/**
		 * The meta object literal for the '<em><b>Set Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_VIEW___SET_CONTENT__STRING = eINSTANCE.getTableView__SetContent__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.TableHeadViewImpl <em>Table Head View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.TableHeadViewImpl
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getTableHeadView()
		 * @generated
		 */
		EClass TABLE_HEAD_VIEW = eINSTANCE.getTableHeadView();

		/**
		 * The meta object literal for the '<em><b>Internal Table Head</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_HEAD_VIEW__INTERNAL_TABLE_HEAD = eINSTANCE.getTableHeadView_InternalTableHead();

		/**
		 * The meta object literal for the '<em><b>Is Highlighted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_HEAD_VIEW___IS_HIGHLIGHTED = eINSTANCE.getTableHeadView__IsHighlighted();

		/**
		 * The meta object literal for the '<em><b>Set Highlighted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_HEAD_VIEW___SET_HIGHLIGHTED__BOOLEAN = eINSTANCE.getTableHeadView__SetHighlighted__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Selector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_HEAD_VIEW___GET_SELECTOR = eINSTANCE.getTableHeadView__GetSelector();

		/**
		 * The meta object literal for the '<em><b>Set Selector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_HEAD_VIEW___SET_SELECTOR__STRING = eINSTANCE.getTableHeadView__SetSelector__String();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_HEAD_VIEW___GET_VALUE = eINSTANCE.getTableHeadView__GetValue();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_HEAD_VIEW___SET_VALUE__STRING = eINSTANCE.getTableHeadView__SetValue__String();

		/**
		 * The meta object literal for the '<em><b>Get Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_HEAD_VIEW___GET_CONTENT = eINSTANCE.getTableHeadView__GetContent();

		/**
		 * The meta object literal for the '<em><b>Set Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_HEAD_VIEW___SET_CONTENT__STRING = eINSTANCE.getTableHeadView__SetContent__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.ThViewImpl <em>Th View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ThViewImpl
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getThView()
		 * @generated
		 */
		EClass TH_VIEW = eINSTANCE.getThView();

		/**
		 * The meta object literal for the '<em><b>Internal Th</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TH_VIEW__INTERNAL_TH = eINSTANCE.getThView_InternalTh();

		/**
		 * The meta object literal for the '<em><b>Is Highlighted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TH_VIEW___IS_HIGHLIGHTED = eINSTANCE.getThView__IsHighlighted();

		/**
		 * The meta object literal for the '<em><b>Set Highlighted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TH_VIEW___SET_HIGHLIGHTED__BOOLEAN = eINSTANCE.getThView__SetHighlighted__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Selector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TH_VIEW___GET_SELECTOR = eINSTANCE.getThView__GetSelector();

		/**
		 * The meta object literal for the '<em><b>Set Selector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TH_VIEW___SET_SELECTOR__STRING = eINSTANCE.getThView__SetSelector__String();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TH_VIEW___GET_VALUE = eINSTANCE.getThView__GetValue();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TH_VIEW___SET_VALUE__STRING = eINSTANCE.getThView__SetValue__String();

		/**
		 * The meta object literal for the '<em><b>Get Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TH_VIEW___GET_CONTENT = eINSTANCE.getThView__GetContent();

		/**
		 * The meta object literal for the '<em><b>Set Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TH_VIEW___SET_CONTENT__STRING = eINSTANCE.getThView__SetContent__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.TableRowViewImpl <em>Table Row View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.TableRowViewImpl
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getTableRowView()
		 * @generated
		 */
		EClass TABLE_ROW_VIEW = eINSTANCE.getTableRowView();

		/**
		 * The meta object literal for the '<em><b>Internal Table Row</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_ROW_VIEW__INTERNAL_TABLE_ROW = eINSTANCE.getTableRowView_InternalTableRow();

		/**
		 * The meta object literal for the '<em><b>Is Highlighted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_ROW_VIEW___IS_HIGHLIGHTED = eINSTANCE.getTableRowView__IsHighlighted();

		/**
		 * The meta object literal for the '<em><b>Set Highlighted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_ROW_VIEW___SET_HIGHLIGHTED__BOOLEAN = eINSTANCE.getTableRowView__SetHighlighted__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Selector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_ROW_VIEW___GET_SELECTOR = eINSTANCE.getTableRowView__GetSelector();

		/**
		 * The meta object literal for the '<em><b>Set Selector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_ROW_VIEW___SET_SELECTOR__STRING = eINSTANCE.getTableRowView__SetSelector__String();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_ROW_VIEW___GET_VALUE = eINSTANCE.getTableRowView__GetValue();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_ROW_VIEW___SET_VALUE__STRING = eINSTANCE.getTableRowView__SetValue__String();

		/**
		 * The meta object literal for the '<em><b>Get Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_ROW_VIEW___GET_CONTENT = eINSTANCE.getTableRowView__GetContent();

		/**
		 * The meta object literal for the '<em><b>Set Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_ROW_VIEW___SET_CONTENT__STRING = eINSTANCE.getTableRowView__SetContent__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.TableBodyViewImpl <em>Table Body View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.TableBodyViewImpl
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getTableBodyView()
		 * @generated
		 */
		EClass TABLE_BODY_VIEW = eINSTANCE.getTableBodyView();

		/**
		 * The meta object literal for the '<em><b>Internal Table Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_BODY_VIEW__INTERNAL_TABLE_BODY = eINSTANCE.getTableBodyView_InternalTableBody();

		/**
		 * The meta object literal for the '<em><b>Is Highlighted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_BODY_VIEW___IS_HIGHLIGHTED = eINSTANCE.getTableBodyView__IsHighlighted();

		/**
		 * The meta object literal for the '<em><b>Set Highlighted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_BODY_VIEW___SET_HIGHLIGHTED__BOOLEAN = eINSTANCE.getTableBodyView__SetHighlighted__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Selector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_BODY_VIEW___GET_SELECTOR = eINSTANCE.getTableBodyView__GetSelector();

		/**
		 * The meta object literal for the '<em><b>Set Selector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_BODY_VIEW___SET_SELECTOR__STRING = eINSTANCE.getTableBodyView__SetSelector__String();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_BODY_VIEW___GET_VALUE = eINSTANCE.getTableBodyView__GetValue();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_BODY_VIEW___SET_VALUE__STRING = eINSTANCE.getTableBodyView__SetValue__String();

		/**
		 * The meta object literal for the '<em><b>Get Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_BODY_VIEW___GET_CONTENT = eINSTANCE.getTableBodyView__GetContent();

		/**
		 * The meta object literal for the '<em><b>Set Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_BODY_VIEW___SET_CONTENT__STRING = eINSTANCE.getTableBodyView__SetContent__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.TableDataViewImpl <em>Table Data View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.TableDataViewImpl
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getTableDataView()
		 * @generated
		 */
		EClass TABLE_DATA_VIEW = eINSTANCE.getTableDataView();

		/**
		 * The meta object literal for the '<em><b>Internal Table Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_DATA_VIEW__INTERNAL_TABLE_DATA = eINSTANCE.getTableDataView_InternalTableData();

		/**
		 * The meta object literal for the '<em><b>Is Highlighted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_DATA_VIEW___IS_HIGHLIGHTED = eINSTANCE.getTableDataView__IsHighlighted();

		/**
		 * The meta object literal for the '<em><b>Set Highlighted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_DATA_VIEW___SET_HIGHLIGHTED__BOOLEAN = eINSTANCE.getTableDataView__SetHighlighted__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Selector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_DATA_VIEW___GET_SELECTOR = eINSTANCE.getTableDataView__GetSelector();

		/**
		 * The meta object literal for the '<em><b>Set Selector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_DATA_VIEW___SET_SELECTOR__STRING = eINSTANCE.getTableDataView__SetSelector__String();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_DATA_VIEW___GET_VALUE = eINSTANCE.getTableDataView__GetValue();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_DATA_VIEW___SET_VALUE__STRING = eINSTANCE.getTableDataView__SetValue__String();

		/**
		 * The meta object literal for the '<em><b>Get Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_DATA_VIEW___GET_CONTENT = eINSTANCE.getTableDataView__GetContent();

		/**
		 * The meta object literal for the '<em><b>Set Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_DATA_VIEW___SET_CONTENT__STRING = eINSTANCE.getTableDataView__SetContent__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.SectionViewImpl <em>Section View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.SectionViewImpl
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getSectionView()
		 * @generated
		 */
		EClass SECTION_VIEW = eINSTANCE.getSectionView();

		/**
		 * The meta object literal for the '<em><b>Internal Section</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_VIEW__INTERNAL_SECTION = eINSTANCE.getSectionView_InternalSection();

		/**
		 * The meta object literal for the '<em><b>Is Highlighted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SECTION_VIEW___IS_HIGHLIGHTED = eINSTANCE.getSectionView__IsHighlighted();

		/**
		 * The meta object literal for the '<em><b>Set Highlighted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SECTION_VIEW___SET_HIGHLIGHTED__BOOLEAN = eINSTANCE.getSectionView__SetHighlighted__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Title</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SECTION_VIEW___GET_TITLE = eINSTANCE.getSectionView__GetTitle();

		/**
		 * The meta object literal for the '<em><b>Set Title</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SECTION_VIEW___SET_TITLE__STRING = eINSTANCE.getSectionView__SetTitle__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.CommentViewImpl <em>Comment View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.CommentViewImpl
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getCommentView()
		 * @generated
		 */
		EClass COMMENT_VIEW = eINSTANCE.getCommentView();

		/**
		 * The meta object literal for the '<em><b>Internal Comment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT_VIEW__INTERNAL_COMMENT = eINSTANCE.getCommentView_InternalComment();

		/**
		 * The meta object literal for the '<em><b>Get Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMENT_VIEW___GET_CONTENT = eINSTANCE.getCommentView__GetContent();

		/**
		 * The meta object literal for the '<em><b>Set Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMENT_VIEW___SET_CONTENT__STRING = eINSTANCE.getCommentView__SetContent__String();

		/**
		 * The meta object literal for the '<em><b>Get Reference To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMENT_VIEW___GET_REFERENCE_TO = eINSTANCE.getCommentView__GetReferenceTo();

		/**
		 * The meta object literal for the '<em><b>Set Reference To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMENT_VIEW___SET_REFERENCE_TO__SCREENSHOT = eINSTANCE.getCommentView__SetReferenceTo__Screenshot();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.TransitionViewImpl <em>Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.TransitionViewImpl
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getTransitionView()
		 * @generated
		 */
		EClass TRANSITION_VIEW = eINSTANCE.getTransitionView();

		/**
		 * The meta object literal for the '<em><b>Internal Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_VIEW__INTERNAL_TRANSITION = eINSTANCE.getTransitionView_InternalTransition();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.LabeledTransitionViewImpl <em>Labeled Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.LabeledTransitionViewImpl
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getLabeledTransitionView()
		 * @generated
		 */
		EClass LABELED_TRANSITION_VIEW = eINSTANCE.getLabeledTransitionView();

		/**
		 * The meta object literal for the '<em><b>Internal Labeled Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABELED_TRANSITION_VIEW__INTERNAL_LABELED_TRANSITION = eINSTANCE.getLabeledTransitionView_InternalLabeledTransition();

		/**
		 * The meta object literal for the '<em><b>Get Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LABELED_TRANSITION_VIEW___GET_LABEL = eINSTANCE.getLabeledTransitionView__GetLabel();

		/**
		 * The meta object literal for the '<em><b>Set Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LABELED_TRANSITION_VIEW___SET_LABEL__STRING = eINSTANCE.getLabeledTransitionView__SetLabel__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.AnchorViewImpl <em>Anchor View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.AnchorViewImpl
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getAnchorView()
		 * @generated
		 */
		EClass ANCHOR_VIEW = eINSTANCE.getAnchorView();

		/**
		 * The meta object literal for the '<em><b>Internal Anchor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANCHOR_VIEW__INTERNAL_ANCHOR = eINSTANCE.getAnchorView_InternalAnchor();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.usersequence.usersequence.views.impl.UserSequenceGraphModelViewImpl <em>User Sequence Graph Model View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.UserSequenceGraphModelViewImpl
		 * @see info.scce.cinco.product.usersequence.usersequence.views.impl.ViewsPackageImpl#getUserSequenceGraphModelView()
		 * @generated
		 */
		EClass USER_SEQUENCE_GRAPH_MODEL_VIEW = eINSTANCE.getUserSequenceGraphModelView();

		/**
		 * The meta object literal for the '<em><b>Internal User Sequence Graph Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_SEQUENCE_GRAPH_MODEL_VIEW__INTERNAL_USER_SEQUENCE_GRAPH_MODEL = eINSTANCE.getUserSequenceGraphModelView_InternalUserSequenceGraphModel();

		/**
		 * The meta object literal for the '<em><b>Get Model Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_SEQUENCE_GRAPH_MODEL_VIEW___GET_MODEL_NAME = eINSTANCE.getUserSequenceGraphModelView__GetModelName();

		/**
		 * The meta object literal for the '<em><b>Set Model Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_SEQUENCE_GRAPH_MODEL_VIEW___SET_MODEL_NAME__STRING = eINSTANCE.getUserSequenceGraphModelView__SetModelName__String();

	}

} //ViewsPackage
