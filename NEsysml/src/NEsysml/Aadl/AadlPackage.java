/**
 */
package NEsysml.Aadl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.papyrus.sysml14.blocks.BlocksPackage;
import org.eclipse.papyrus.sysml14.portsandflows.PortsandflowsPackage;

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
 * @see NEsysml.Aadl.AadlFactory
 * @model kind="package"
 * @generated
 */
public interface AadlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Aadl";
	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://smbody/esysml/2.0/ESysML/Aadl";
	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "NEsysml.Aadl";
	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AadlPackage eINSTANCE = NEsysml.Aadl.impl.AadlPackageImpl.init();
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.ExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.ExtensionImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 0;
	/**
	 * The feature id for the '<em><b>Base Generalization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__BASE_GENERALIZATION = 0;
	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = 1;
	/**
	 * The number of operations of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.ImplementationImpl <em>Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.ImplementationImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getImplementation()
	 * @generated
	 */
	int IMPLEMENTATION = 1;
	/**
	 * The feature id for the '<em><b>Base Generalization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__BASE_GENERALIZATION = 0;
	/**
	 * The number of structural features of the '<em>Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_FEATURE_COUNT = 1;
	/**
	 * The number of operations of the '<em>Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.ClassifierImpl <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.ClassifierImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 4;
	/**
	 * The number of structural features of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = 0;
	/**
	 * The number of operations of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.ComponentClassifierImpl <em>Component Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.ComponentClassifierImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getComponentClassifier()
	 * @generated
	 */
	int COMPONENT_CLASSIFIER = 3;
	/**
	 * The feature id for the '<em><b>Owned Error Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLASSIFIER__OWNED_ERROR_MODEL = CLASSIFIER_FEATURE_COUNT + 0;
	/**
	 * The number of structural features of the '<em>Component Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLASSIFIER_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 1;
	/**
	 * The number of operations of the '<em>Component Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLASSIFIER_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.ComponentTypeImpl <em>Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.ComponentTypeImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getComponentType()
	 * @generated
	 */
	int COMPONENT_TYPE = 2;
	/**
	 * The feature id for the '<em><b>Owned Error Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__OWNED_ERROR_MODEL = COMPONENT_CLASSIFIER__OWNED_ERROR_MODEL;
	/**
	 * The feature id for the '<em><b>Extended</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__EXTENDED = COMPONENT_CLASSIFIER_FEATURE_COUNT + 0;
	/**
	 * The number of structural features of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_FEATURE_COUNT = COMPONENT_CLASSIFIER_FEATURE_COUNT + 1;
	/**
	 * The number of operations of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_OPERATION_COUNT = COMPONENT_CLASSIFIER_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.AnnexImpl <em>Annex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.AnnexImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getAnnex()
	 * @generated
	 */
	int ANNEX = 35;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.ComponentImplementationImpl <em>Component Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.ComponentImplementationImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getComponentImplementation()
	 * @generated
	 */
	int COMPONENT_IMPLEMENTATION = 5;
	/**
	 * The feature id for the '<em><b>Owned Error Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__OWNED_ERROR_MODEL = COMPONENT_CLASSIFIER__OWNED_ERROR_MODEL;
	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__TYPE = COMPONENT_CLASSIFIER_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Extended</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__EXTENDED = COMPONENT_CLASSIFIER_FEATURE_COUNT + 1;
	/**
	 * The number of structural features of the '<em>Component Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION_FEATURE_COUNT = COMPONENT_CLASSIFIER_FEATURE_COUNT + 2;
	/**
	 * The number of operations of the '<em>Component Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION_OPERATION_COUNT = COMPONENT_CLASSIFIER_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.ModeAvailableImpl <em>Mode Available</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.ModeAvailableImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getModeAvailable()
	 * @generated
	 */
	int MODE_AVAILABLE = 8;
	/**
	 * The feature id for the '<em><b>Owned Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_AVAILABLE__OWNED_MODE = 0;
	/**
	 * The number of structural features of the '<em>Mode Available</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_AVAILABLE_FEATURE_COUNT = 1;
	/**
	 * The number of operations of the '<em>Mode Available</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_AVAILABLE_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.BusClassifierImpl <em>Bus Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.BusClassifierImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getBusClassifier()
	 * @generated
	 */
	int BUS_CLASSIFIER = 6;
	/**
	 * The feature id for the '<em><b>Owned Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CLASSIFIER__OWNED_MODE = MODE_AVAILABLE__OWNED_MODE;
	/**
	 * The number of structural features of the '<em>Bus Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CLASSIFIER_FEATURE_COUNT = MODE_AVAILABLE_FEATURE_COUNT + 0;
	/**
	 * The number of operations of the '<em>Bus Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CLASSIFIER_OPERATION_COUNT = MODE_AVAILABLE_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.PlatformClassifierImpl <em>Platform Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.PlatformClassifierImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getPlatformClassifier()
	 * @generated
	 */
	int PLATFORM_CLASSIFIER = 7;
	/**
	 * The number of structural features of the '<em>Platform Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_CLASSIFIER_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 0;
	/**
	 * The number of operations of the '<em>Platform Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_CLASSIFIER_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.ModeStateMachineImpl <em>Mode State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.ModeStateMachineImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getModeStateMachine()
	 * @generated
	 */
	int MODE_STATE_MACHINE = 9;
	/**
	 * The feature id for the '<em><b>Base State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_STATE_MACHINE__BASE_STATE_MACHINE = 0;
	/**
	 * The feature id for the '<em><b>Owned Mode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_STATE_MACHINE__OWNED_MODE = 1;
	/**
	 * The feature id for the '<em><b>Owned Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_STATE_MACHINE__OWNED_TRANSITION = 2;
	/**
	 * The number of structural features of the '<em>Mode State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_STATE_MACHINE_FEATURE_COUNT = 3;
	/**
	 * The number of operations of the '<em>Mode State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_STATE_MACHINE_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.ModeImpl <em>Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.ModeImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getMode()
	 * @generated
	 */
	int MODE = 10;
	/**
	 * The number of structural features of the '<em>Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_FEATURE_COUNT = 0;
	/**
	 * The number of operations of the '<em>Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.ModeTransitionImpl <em>Mode Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.ModeTransitionImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getModeTransition()
	 * @generated
	 */
	int MODE_TRANSITION = 11;
	/**
	 * The feature id for the '<em><b>Base Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION__BASE_TRANSITION = 0;
	/**
	 * The feature id for the '<em><b>Trigger</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION__TRIGGER = 1;
	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION__FROM = 2;
	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION__TO = 3;
	/**
	 * The number of structural features of the '<em>Mode Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_FEATURE_COUNT = 4;
	/**
	 * The number of operations of the '<em>Mode Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.ModeTransitionTriggerImpl <em>Mode Transition Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.ModeTransitionTriggerImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getModeTransitionTrigger()
	 * @generated
	 */
	int MODE_TRANSITION_TRIGGER = 12;
	/**
	 * The feature id for the '<em><b>Base Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_TRIGGER__BASE_TRIGGER = 0;
	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_TRIGGER__PORT = 1;
	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_TRIGGER__CONTEXT = 2;
	/**
	 * The number of structural features of the '<em>Mode Transition Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_TRIGGER_FEATURE_COUNT = 3;
	/**
	 * The number of operations of the '<em>Mode Transition Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_TRIGGER_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.PortImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 14;
	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__BASE_PORT = PortsandflowsPackage.PROXY_PORT__BASE_PORT;
	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__SPECIFICATION = PortsandflowsPackage.PROXY_PORT_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DIRECTION = PortsandflowsPackage.PROXY_PORT_FEATURE_COUNT + 1;
	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = PortsandflowsPackage.PROXY_PORT_FEATURE_COUNT + 2;
	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = PortsandflowsPackage.PROXY_PORT_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.EventPortImpl <em>Event Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.EventPortImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getEventPort()
	 * @generated
	 */
	int EVENT_PORT = 13;
	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT__BASE_PORT = PORT__BASE_PORT;
	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT__SPECIFICATION = PORT__SPECIFICATION;
	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT__DIRECTION = PORT__DIRECTION;
	/**
	 * The number of structural features of the '<em>Event Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;
	/**
	 * The number of operations of the '<em>Event Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.FeatureImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 15;
	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 0;
	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.DataFlowSpecificationImpl <em>Data Flow Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.DataFlowSpecificationImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getDataFlowSpecification()
	 * @generated
	 */
	int DATA_FLOW_SPECIFICATION = 17;
	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_SPECIFICATION__BASE_CLASS = PortsandflowsPackage.INTERFACE_BLOCK__BASE_CLASS;
	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_SPECIFICATION__IS_ENCAPSULATED = PortsandflowsPackage.INTERFACE_BLOCK__IS_ENCAPSULATED;
	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_SPECIFICATION__TYPE = PortsandflowsPackage.INTERFACE_BLOCK_FEATURE_COUNT + 0;
	/**
	 * The number of structural features of the '<em>Data Flow Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_SPECIFICATION_FEATURE_COUNT = PortsandflowsPackage.INTERFACE_BLOCK_FEATURE_COUNT + 1;
	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_SPECIFICATION___GET_REFERENCES = PortsandflowsPackage.INTERFACE_BLOCK___GET_REFERENCES;
	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_SPECIFICATION___GET_PARTS = PortsandflowsPackage.INTERFACE_BLOCK___GET_PARTS;
	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_SPECIFICATION___GET_FLOW_PROPERTIES = PortsandflowsPackage.INTERFACE_BLOCK___GET_FLOW_PROPERTIES;
	/**
	 * The number of operations of the '<em>Data Flow Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_SPECIFICATION_OPERATION_COUNT = PortsandflowsPackage.INTERFACE_BLOCK_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.PortDataFlowSpecificationImpl <em>Port Data Flow Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.PortDataFlowSpecificationImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getPortDataFlowSpecification()
	 * @generated
	 */
	int PORT_DATA_FLOW_SPECIFICATION = 16;
	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DATA_FLOW_SPECIFICATION__BASE_CLASS = DATA_FLOW_SPECIFICATION__BASE_CLASS;
	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DATA_FLOW_SPECIFICATION__IS_ENCAPSULATED = DATA_FLOW_SPECIFICATION__IS_ENCAPSULATED;
	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DATA_FLOW_SPECIFICATION__TYPE = DATA_FLOW_SPECIFICATION__TYPE;
	/**
	 * The feature id for the '<em><b>Event Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DATA_FLOW_SPECIFICATION__EVENT_GATE = DATA_FLOW_SPECIFICATION_FEATURE_COUNT + 0;
	/**
	 * The number of structural features of the '<em>Port Data Flow Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DATA_FLOW_SPECIFICATION_FEATURE_COUNT = DATA_FLOW_SPECIFICATION_FEATURE_COUNT + 1;
	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DATA_FLOW_SPECIFICATION___GET_REFERENCES = DATA_FLOW_SPECIFICATION___GET_REFERENCES;
	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DATA_FLOW_SPECIFICATION___GET_PARTS = DATA_FLOW_SPECIFICATION___GET_PARTS;
	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DATA_FLOW_SPECIFICATION___GET_FLOW_PROPERTIES = DATA_FLOW_SPECIFICATION___GET_FLOW_PROPERTIES;
	/**
	 * The number of operations of the '<em>Port Data Flow Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DATA_FLOW_SPECIFICATION_OPERATION_COUNT = DATA_FLOW_SPECIFICATION_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.SoftwareClassifierImpl <em>Software Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.SoftwareClassifierImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSoftwareClassifier()
	 * @generated
	 */
	int SOFTWARE_CLASSIFIER = 19;
	/**
	 * The number of structural features of the '<em>Software Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CLASSIFIER_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 0;
	/**
	 * The number of operations of the '<em>Software Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CLASSIFIER_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.DataClassifierImpl <em>Data Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.DataClassifierImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getDataClassifier()
	 * @generated
	 */
	int DATA_CLASSIFIER = 18;
	/**
	 * The number of structural features of the '<em>Data Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASSIFIER_FEATURE_COUNT = SOFTWARE_CLASSIFIER_FEATURE_COUNT + 0;
	/**
	 * The number of operations of the '<em>Data Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASSIFIER_OPERATION_COUNT = SOFTWARE_CLASSIFIER_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.ModeTransitionTriggerContextImpl <em>Mode Transition Trigger Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.ModeTransitionTriggerContextImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getModeTransitionTriggerContext()
	 * @generated
	 */
	int MODE_TRANSITION_TRIGGER_CONTEXT = 20;
	/**
	 * The number of structural features of the '<em>Mode Transition Trigger Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_TRIGGER_CONTEXT_FEATURE_COUNT = 0;
	/**
	 * The number of operations of the '<em>Mode Transition Trigger Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_TRIGGER_CONTEXT_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.DeviceClassifierImpl <em>Device Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.DeviceClassifierImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getDeviceClassifier()
	 * @generated
	 */
	int DEVICE_CLASSIFIER = 21;
	/**
	 * The feature id for the '<em><b>Owned Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CLASSIFIER__OWNED_MODE = MODE_AVAILABLE__OWNED_MODE;
	/**
	 * The number of structural features of the '<em>Device Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CLASSIFIER_FEATURE_COUNT = MODE_AVAILABLE_FEATURE_COUNT + 0;
	/**
	 * The number of operations of the '<em>Device Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CLASSIFIER_OPERATION_COUNT = MODE_AVAILABLE_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.MemoryClassifierImpl <em>Memory Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.MemoryClassifierImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getMemoryClassifier()
	 * @generated
	 */
	int MEMORY_CLASSIFIER = 22;
	/**
	 * The feature id for the '<em><b>Owned Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_CLASSIFIER__OWNED_MODE = MODE_AVAILABLE__OWNED_MODE;
	/**
	 * The number of structural features of the '<em>Memory Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_CLASSIFIER_FEATURE_COUNT = MODE_AVAILABLE_FEATURE_COUNT + 0;
	/**
	 * The number of operations of the '<em>Memory Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_CLASSIFIER_OPERATION_COUNT = MODE_AVAILABLE_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.ProcessClassifierImpl <em>Process Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.ProcessClassifierImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getProcessClassifier()
	 * @generated
	 */
	int PROCESS_CLASSIFIER = 23;
	/**
	 * The feature id for the '<em><b>Owned Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CLASSIFIER__OWNED_MODE = MODE_AVAILABLE__OWNED_MODE;
	/**
	 * The number of structural features of the '<em>Process Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CLASSIFIER_FEATURE_COUNT = MODE_AVAILABLE_FEATURE_COUNT + 0;
	/**
	 * The number of operations of the '<em>Process Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CLASSIFIER_OPERATION_COUNT = MODE_AVAILABLE_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.ProcessorClassifierImpl <em>Processor Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.ProcessorClassifierImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getProcessorClassifier()
	 * @generated
	 */
	int PROCESSOR_CLASSIFIER = 24;
	/**
	 * The feature id for the '<em><b>Owned Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_CLASSIFIER__OWNED_MODE = MODE_AVAILABLE__OWNED_MODE;
	/**
	 * The number of structural features of the '<em>Processor Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_CLASSIFIER_FEATURE_COUNT = MODE_AVAILABLE_FEATURE_COUNT + 0;
	/**
	 * The number of operations of the '<em>Processor Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_CLASSIFIER_OPERATION_COUNT = MODE_AVAILABLE_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.SubprogramClassifierImpl <em>Subprogram Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.SubprogramClassifierImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSubprogramClassifier()
	 * @generated
	 */
	int SUBPROGRAM_CLASSIFIER = 25;
	/**
	 * The feature id for the '<em><b>Owned Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_CLASSIFIER__OWNED_MODE = MODE_AVAILABLE__OWNED_MODE;
	/**
	 * The number of structural features of the '<em>Subprogram Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_CLASSIFIER_FEATURE_COUNT = MODE_AVAILABLE_FEATURE_COUNT + 0;
	/**
	 * The number of operations of the '<em>Subprogram Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_CLASSIFIER_OPERATION_COUNT = MODE_AVAILABLE_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.SubprogramInstanceImpl <em>Subprogram Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.SubprogramInstanceImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSubprogramInstance()
	 * @generated
	 */
	int SUBPROGRAM_INSTANCE = 26;
	/**
	 * The number of structural features of the '<em>Subprogram Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_INSTANCE_FEATURE_COUNT = 0;
	/**
	 * The number of operations of the '<em>Subprogram Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_INSTANCE_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.SystemClassifierImpl <em>System Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.SystemClassifierImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSystemClassifier()
	 * @generated
	 */
	int SYSTEM_CLASSIFIER = 27;
	/**
	 * The feature id for the '<em><b>Owned Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CLASSIFIER__OWNED_MODE = MODE_AVAILABLE__OWNED_MODE;
	/**
	 * The number of structural features of the '<em>System Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CLASSIFIER_FEATURE_COUNT = MODE_AVAILABLE_FEATURE_COUNT + 0;
	/**
	 * The number of operations of the '<em>System Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CLASSIFIER_OPERATION_COUNT = MODE_AVAILABLE_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.ThreadClassifierImpl <em>Thread Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.ThreadClassifierImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getThreadClassifier()
	 * @generated
	 */
	int THREAD_CLASSIFIER = 28;
	/**
	 * The feature id for the '<em><b>Owned Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_CLASSIFIER__OWNED_MODE = MODE_AVAILABLE__OWNED_MODE;
	/**
	 * The number of structural features of the '<em>Thread Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_CLASSIFIER_FEATURE_COUNT = MODE_AVAILABLE_FEATURE_COUNT + 0;
	/**
	 * The number of operations of the '<em>Thread Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_CLASSIFIER_OPERATION_COUNT = MODE_AVAILABLE_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.BusImplementationImpl <em>Bus Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.BusImplementationImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getBusImplementation()
	 * @generated
	 */
	int BUS_IMPLEMENTATION = 29;
	/**
	 * The feature id for the '<em><b>Owned Error Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_IMPLEMENTATION__OWNED_ERROR_MODEL = COMPONENT_IMPLEMENTATION__OWNED_ERROR_MODEL;
	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_IMPLEMENTATION__TYPE = COMPONENT_IMPLEMENTATION__TYPE;
	/**
	 * The feature id for the '<em><b>Extended</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_IMPLEMENTATION__EXTENDED = COMPONENT_IMPLEMENTATION__EXTENDED;
	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_IMPLEMENTATION__BASE_CLASS = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_IMPLEMENTATION__IS_ENCAPSULATED = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Owned Annex</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_IMPLEMENTATION__OWNED_ANNEX = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>Owned Bus Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_IMPLEMENTATION__OWNED_BUS_CONNECTION = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 3;
	/**
	 * The feature id for the '<em><b>Owned Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_IMPLEMENTATION__OWNED_MODE = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 4;
	/**
	 * The feature id for the '<em><b>Owned Port Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_IMPLEMENTATION__OWNED_PORT_CONNECTION = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 5;
	/**
	 * The number of structural features of the '<em>Bus Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_IMPLEMENTATION_FEATURE_COUNT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 6;
	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_IMPLEMENTATION___GET_REFERENCES = COMPONENT_IMPLEMENTATION_OPERATION_COUNT + 0;
	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_IMPLEMENTATION___GET_PARTS = COMPONENT_IMPLEMENTATION_OPERATION_COUNT + 1;
	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_IMPLEMENTATION___GET_FLOW_PROPERTIES = COMPONENT_IMPLEMENTATION_OPERATION_COUNT + 2;
	/**
	 * The number of operations of the '<em>Bus Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_IMPLEMENTATION_OPERATION_COUNT = COMPONENT_IMPLEMENTATION_OPERATION_COUNT + 3;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.PortConnectionContainingImpl <em>Port Connection Containing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.PortConnectionContainingImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getPortConnectionContaining()
	 * @generated
	 */
	int PORT_CONNECTION_CONTAINING = 30;
	/**
	 * The feature id for the '<em><b>Owned Port Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION_CONTAINING__OWNED_PORT_CONNECTION = 0;
	/**
	 * The number of structural features of the '<em>Port Connection Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION_CONTAINING_FEATURE_COUNT = 1;
	/**
	 * The number of operations of the '<em>Port Connection Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION_CONTAINING_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.ConnectionImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 32;
	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 0;
	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.PortConnectionImpl <em>Port Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.PortConnectionImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getPortConnection()
	 * @generated
	 */
	int PORT_CONNECTION = 31;
	/**
	 * The feature id for the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION__BASE_CONNECTOR = CONNECTION_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION__IN = CONNECTION_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION__OUT = CONNECTION_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>In Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION__IN_CONTEXT = CONNECTION_FEATURE_COUNT + 3;
	/**
	 * The feature id for the '<em><b>Out Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION__OUT_CONTEXT = CONNECTION_FEATURE_COUNT + 4;
	/**
	 * The number of structural features of the '<em>Port Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 5;
	/**
	 * The number of operations of the '<em>Port Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION_OPERATION_COUNT = CONNECTION_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.PortAndAccessConectionContextImpl <em>Port And Access Conection Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.PortAndAccessConectionContextImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getPortAndAccessConectionContext()
	 * @generated
	 */
	int PORT_AND_ACCESS_CONECTION_CONTEXT = 33;
	/**
	 * The number of structural features of the '<em>Port And Access Conection Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_AND_ACCESS_CONECTION_CONTEXT_FEATURE_COUNT = 0;
	/**
	 * The number of operations of the '<em>Port And Access Conection Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_AND_ACCESS_CONECTION_CONTEXT_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.AnnexContainingImpl <em>Annex Containing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.AnnexContainingImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getAnnexContaining()
	 * @generated
	 */
	int ANNEX_CONTAINING = 34;
	/**
	 * The feature id for the '<em><b>Owned Annex</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_CONTAINING__OWNED_ANNEX = 0;
	/**
	 * The number of structural features of the '<em>Annex Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_CONTAINING_FEATURE_COUNT = 1;
	/**
	 * The number of operations of the '<em>Annex Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_CONTAINING_OPERATION_COUNT = 0;
	/**
	 * The number of structural features of the '<em>Annex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_FEATURE_COUNT = 0;
	/**
	 * The number of operations of the '<em>Annex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.BusAccessConnectionContainingImpl <em>Bus Access Connection Containing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.BusAccessConnectionContainingImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getBusAccessConnectionContaining()
	 * @generated
	 */
	int BUS_ACCESS_CONNECTION_CONTAINING = 36;
	/**
	 * The feature id for the '<em><b>Owned Bus Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS_CONNECTION_CONTAINING__OWNED_BUS_CONNECTION = 0;
	/**
	 * The number of structural features of the '<em>Bus Access Connection Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS_CONNECTION_CONTAINING_FEATURE_COUNT = 1;
	/**
	 * The number of operations of the '<em>Bus Access Connection Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS_CONNECTION_CONTAINING_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.BusConnectionImpl <em>Bus Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.BusConnectionImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getBusConnection()
	 * @generated
	 */
	int BUS_CONNECTION = 37;
	/**
	 * The feature id for the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTION__BASE_CONNECTOR = 0;
	/**
	 * The feature id for the '<em><b>Require</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTION__REQUIRE = 1;
	/**
	 * The feature id for the '<em><b>Provide</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTION__PROVIDE = 2;
	/**
	 * The feature id for the '<em><b>In Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTION__IN_CONTEXT = 3;
	/**
	 * The feature id for the '<em><b>Out Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTION__OUT_CONTEXT = 4;
	/**
	 * The number of structural features of the '<em>Bus Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTION_FEATURE_COUNT = 5;
	/**
	 * The number of operations of the '<em>Bus Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTION_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.BusAccessConnectionEndImpl <em>Bus Access Connection End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.BusAccessConnectionEndImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getBusAccessConnectionEnd()
	 * @generated
	 */
	int BUS_ACCESS_CONNECTION_END = 38;
	/**
	 * The number of structural features of the '<em>Bus Access Connection End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS_CONNECTION_END_FEATURE_COUNT = 0;
	/**
	 * The number of operations of the '<em>Bus Access Connection End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS_CONNECTION_END_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.BusAccessImpl <em>Bus Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.BusAccessImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getBusAccess()
	 * @generated
	 */
	int BUS_ACCESS = 42;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.BusFlowSpecificationImpl <em>Bus Flow Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.BusFlowSpecificationImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getBusFlowSpecification()
	 * @generated
	 */
	int BUS_FLOW_SPECIFICATION = 43;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.BusTypeImpl <em>Bus Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.BusTypeImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getBusType()
	 * @generated
	 */
	int BUS_TYPE = 39;
	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_TYPE__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;
	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_TYPE__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;
	/**
	 * The feature id for the '<em><b>Owned Error Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_TYPE__OWNED_ERROR_MODEL = BlocksPackage.BLOCK_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Extended</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_TYPE__EXTENDED = BlocksPackage.BLOCK_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Owned Annex</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_TYPE__OWNED_ANNEX = BlocksPackage.BLOCK_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>Owned Bus Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_TYPE__OWNED_BUS_ACCESS = BlocksPackage.BLOCK_FEATURE_COUNT + 3;
	/**
	 * The feature id for the '<em><b>Owned Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_TYPE__OWNED_MODE = BlocksPackage.BLOCK_FEATURE_COUNT + 4;
	/**
	 * The feature id for the '<em><b>Ownedport</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_TYPE__OWNEDPORT = BlocksPackage.BLOCK_FEATURE_COUNT + 5;
	/**
	 * The number of structural features of the '<em>Bus Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_TYPE_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 6;
	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_TYPE___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;
	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_TYPE___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;
	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_TYPE___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;
	/**
	 * The number of operations of the '<em>Bus Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_TYPE_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.PortContainingImpl <em>Port Containing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.PortContainingImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getPortContaining()
	 * @generated
	 */
	int PORT_CONTAINING = 40;
	/**
	 * The feature id for the '<em><b>Ownedport</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONTAINING__OWNEDPORT = 0;
	/**
	 * The number of structural features of the '<em>Port Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONTAINING_FEATURE_COUNT = 1;
	/**
	 * The number of operations of the '<em>Port Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONTAINING_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.BusAccessContainingImpl <em>Bus Access Containing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.BusAccessContainingImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getBusAccessContaining()
	 * @generated
	 */
	int BUS_ACCESS_CONTAINING = 41;
	/**
	 * The feature id for the '<em><b>Owned Bus Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS_CONTAINING__OWNED_BUS_ACCESS = 0;
	/**
	 * The number of structural features of the '<em>Bus Access Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS_CONTAINING_FEATURE_COUNT = 1;
	/**
	 * The number of operations of the '<em>Bus Access Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS_CONTAINING_OPERATION_COUNT = 0;
	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS__BASE_PORT = PortsandflowsPackage.PROXY_PORT__BASE_PORT;
	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS__SPECIFICATION = PortsandflowsPackage.PROXY_PORT_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS__DIRECTION = PortsandflowsPackage.PROXY_PORT_FEATURE_COUNT + 1;
	/**
	 * The number of structural features of the '<em>Bus Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS_FEATURE_COUNT = PortsandflowsPackage.PROXY_PORT_FEATURE_COUNT + 2;
	/**
	 * The number of operations of the '<em>Bus Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS_OPERATION_COUNT = PortsandflowsPackage.PROXY_PORT_OPERATION_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_FLOW_SPECIFICATION__BASE_CLASS = PortsandflowsPackage.INTERFACE_BLOCK__BASE_CLASS;
	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_FLOW_SPECIFICATION__IS_ENCAPSULATED = PortsandflowsPackage.INTERFACE_BLOCK__IS_ENCAPSULATED;
	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_FLOW_SPECIFICATION__TYPE = PortsandflowsPackage.INTERFACE_BLOCK_FEATURE_COUNT + 0;
	/**
	 * The number of structural features of the '<em>Bus Flow Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_FLOW_SPECIFICATION_FEATURE_COUNT = PortsandflowsPackage.INTERFACE_BLOCK_FEATURE_COUNT + 1;
	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_FLOW_SPECIFICATION___GET_REFERENCES = PortsandflowsPackage.INTERFACE_BLOCK___GET_REFERENCES;
	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_FLOW_SPECIFICATION___GET_PARTS = PortsandflowsPackage.INTERFACE_BLOCK___GET_PARTS;
	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_FLOW_SPECIFICATION___GET_FLOW_PROPERTIES = PortsandflowsPackage.INTERFACE_BLOCK___GET_FLOW_PROPERTIES;
	/**
	 * The number of operations of the '<em>Bus Flow Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_FLOW_SPECIFICATION_OPERATION_COUNT = PortsandflowsPackage.INTERFACE_BLOCK_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.DataImplementationImpl <em>Data Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.DataImplementationImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getDataImplementation()
	 * @generated
	 */
	int DATA_IMPLEMENTATION = 44;
	/**
	 * The feature id for the '<em><b>Owned Error Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IMPLEMENTATION__OWNED_ERROR_MODEL = COMPONENT_IMPLEMENTATION__OWNED_ERROR_MODEL;
	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IMPLEMENTATION__TYPE = COMPONENT_IMPLEMENTATION__TYPE;
	/**
	 * The feature id for the '<em><b>Extended</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IMPLEMENTATION__EXTENDED = COMPONENT_IMPLEMENTATION__EXTENDED;
	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IMPLEMENTATION__BASE_CLASS = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IMPLEMENTATION__IS_ENCAPSULATED = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Owned Annex</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IMPLEMENTATION__OWNED_ANNEX = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>Owned Data Access Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IMPLEMENTATION__OWNED_DATA_ACCESS_CONNECTION = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 3;
	/**
	 * The feature id for the '<em><b>Owned Data Subcomponent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 4;
	/**
	 * The feature id for the '<em><b>Owned Subprogram Access Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IMPLEMENTATION__OWNED_SUBPROGRAM_ACCESS_CONNECTION = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 5;
	/**
	 * The feature id for the '<em><b>Owned Subprogram Subcomponent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 6;
	/**
	 * The number of structural features of the '<em>Data Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IMPLEMENTATION_FEATURE_COUNT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 7;
	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IMPLEMENTATION___GET_REFERENCES = COMPONENT_IMPLEMENTATION_OPERATION_COUNT + 0;
	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IMPLEMENTATION___GET_PARTS = COMPONENT_IMPLEMENTATION_OPERATION_COUNT + 1;
	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IMPLEMENTATION___GET_FLOW_PROPERTIES = COMPONENT_IMPLEMENTATION_OPERATION_COUNT + 2;
	/**
	 * The number of operations of the '<em>Data Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IMPLEMENTATION_OPERATION_COUNT = COMPONENT_IMPLEMENTATION_OPERATION_COUNT + 3;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.DataContainingImpl <em>Data Containing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.DataContainingImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getDataContaining()
	 * @generated
	 */
	int DATA_CONTAINING = 45;
	/**
	 * The feature id for the '<em><b>Owned Data Subcomponent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTAINING__OWNED_DATA_SUBCOMPONENT = 0;
	/**
	 * The number of structural features of the '<em>Data Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTAINING_FEATURE_COUNT = 1;
	/**
	 * The number of operations of the '<em>Data Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTAINING_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.SubcomponentClassifierImpl <em>Subcomponent Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.SubcomponentClassifierImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSubcomponentClassifier()
	 * @generated
	 */
	int SUBCOMPONENT_CLASSIFIER = 47;
	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT_CLASSIFIER__BASE_PROPERTY = CLASSIFIER_FEATURE_COUNT + 0;
	/**
	 * The number of structural features of the '<em>Subcomponent Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT_CLASSIFIER_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 1;
	/**
	 * The number of operations of the '<em>Subcomponent Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT_CLASSIFIER_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.DataSubcomponentImpl <em>Data Subcomponent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.DataSubcomponentImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getDataSubcomponent()
	 * @generated
	 */
	int DATA_SUBCOMPONENT = 46;
	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SUBCOMPONENT__BASE_PROPERTY = SUBCOMPONENT_CLASSIFIER__BASE_PROPERTY;
	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SUBCOMPONENT__TYPE = SUBCOMPONENT_CLASSIFIER_FEATURE_COUNT + 0;
	/**
	 * The number of structural features of the '<em>Data Subcomponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SUBCOMPONENT_FEATURE_COUNT = SUBCOMPONENT_CLASSIFIER_FEATURE_COUNT + 1;
	/**
	 * The number of operations of the '<em>Data Subcomponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SUBCOMPONENT_OPERATION_COUNT = SUBCOMPONENT_CLASSIFIER_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.DataAccessConnectionEndImpl <em>Data Access Connection End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.DataAccessConnectionEndImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getDataAccessConnectionEnd()
	 * @generated
	 */
	int DATA_ACCESS_CONNECTION_END = 48;
	/**
	 * The number of structural features of the '<em>Data Access Connection End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_CONNECTION_END_FEATURE_COUNT = 0;
	/**
	 * The number of operations of the '<em>Data Access Connection End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_CONNECTION_END_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.SubprogramContainingImpl <em>Subprogram Containing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.SubprogramContainingImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSubprogramContaining()
	 * @generated
	 */
	int SUBPROGRAM_CONTAINING = 49;
	/**
	 * The feature id for the '<em><b>Owned Subprogram Subcomponent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_CONTAINING__OWNED_SUBPROGRAM_SUBCOMPONENT = 0;
	/**
	 * The number of structural features of the '<em>Subprogram Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_CONTAINING_FEATURE_COUNT = 1;
	/**
	 * The number of operations of the '<em>Subprogram Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_CONTAINING_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.SubprogramSubcomponentImpl <em>Subprogram Subcomponent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.SubprogramSubcomponentImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSubprogramSubcomponent()
	 * @generated
	 */
	int SUBPROGRAM_SUBCOMPONENT = 50;
	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_SUBCOMPONENT__BASE_PROPERTY = SUBCOMPONENT_CLASSIFIER__BASE_PROPERTY;
	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_SUBCOMPONENT__TYPE = SUBCOMPONENT_CLASSIFIER_FEATURE_COUNT + 0;
	/**
	 * The number of structural features of the '<em>Subprogram Subcomponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_SUBCOMPONENT_FEATURE_COUNT = SUBCOMPONENT_CLASSIFIER_FEATURE_COUNT + 1;
	/**
	 * The number of operations of the '<em>Subprogram Subcomponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_SUBCOMPONENT_OPERATION_COUNT = SUBCOMPONENT_CLASSIFIER_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.DataAccessConnectionContainingImpl <em>Data Access Connection Containing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.DataAccessConnectionContainingImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getDataAccessConnectionContaining()
	 * @generated
	 */
	int DATA_ACCESS_CONNECTION_CONTAINING = 51;
	/**
	 * The feature id for the '<em><b>Owned Data Access Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_CONNECTION_CONTAINING__OWNED_DATA_ACCESS_CONNECTION = 0;
	/**
	 * The number of structural features of the '<em>Data Access Connection Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_CONNECTION_CONTAINING_FEATURE_COUNT = 1;
	/**
	 * The number of operations of the '<em>Data Access Connection Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_CONNECTION_CONTAINING_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.DataAccessConnectionImpl <em>Data Access Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.DataAccessConnectionImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getDataAccessConnection()
	 * @generated
	 */
	int DATA_ACCESS_CONNECTION = 52;
	/**
	 * The feature id for the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_CONNECTION__BASE_CONNECTOR = BlocksPackage.BINDING_CONNECTOR__BASE_CONNECTOR;
	/**
	 * The feature id for the '<em><b>Require</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_CONNECTION__REQUIRE = BlocksPackage.BINDING_CONNECTOR_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Provide</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_CONNECTION__PROVIDE = BlocksPackage.BINDING_CONNECTOR_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>In Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_CONNECTION__IN_CONTEXT = BlocksPackage.BINDING_CONNECTOR_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>Out Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_CONNECTION__OUT_CONTEXT = BlocksPackage.BINDING_CONNECTOR_FEATURE_COUNT + 3;
	/**
	 * The number of structural features of the '<em>Data Access Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_CONNECTION_FEATURE_COUNT = BlocksPackage.BINDING_CONNECTOR_FEATURE_COUNT + 4;
	/**
	 * The number of operations of the '<em>Data Access Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_CONNECTION_OPERATION_COUNT = BlocksPackage.BINDING_CONNECTOR_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.SubprogramAccessConnectionContainingImpl <em>Subprogram Access Connection Containing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.SubprogramAccessConnectionContainingImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSubprogramAccessConnectionContaining()
	 * @generated
	 */
	int SUBPROGRAM_ACCESS_CONNECTION_CONTAINING = 53;
	/**
	 * The feature id for the '<em><b>Owned Subprogram Access Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS_CONNECTION_CONTAINING__OWNED_SUBPROGRAM_ACCESS_CONNECTION = 0;
	/**
	 * The number of structural features of the '<em>Subprogram Access Connection Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS_CONNECTION_CONTAINING_FEATURE_COUNT = 1;
	/**
	 * The number of operations of the '<em>Subprogram Access Connection Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS_CONNECTION_CONTAINING_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.SubprogramAccessConnectionImpl <em>Subprogram Access Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.SubprogramAccessConnectionImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSubprogramAccessConnection()
	 * @generated
	 */
	int SUBPROGRAM_ACCESS_CONNECTION = 54;
	/**
	 * The feature id for the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS_CONNECTION__BASE_CONNECTOR = CONNECTION_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Require</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS_CONNECTION__REQUIRE = CONNECTION_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Provide</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS_CONNECTION__PROVIDE = CONNECTION_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>In Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS_CONNECTION__IN_CONTEXT = CONNECTION_FEATURE_COUNT + 3;
	/**
	 * The feature id for the '<em><b>Out Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS_CONNECTION__OUT_CONTEXT = CONNECTION_FEATURE_COUNT + 4;
	/**
	 * The number of structural features of the '<em>Subprogram Access Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 5;
	/**
	 * The number of operations of the '<em>Subprogram Access Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS_CONNECTION_OPERATION_COUNT = CONNECTION_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.SubprogramAccessImpl <em>Subprogram Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.SubprogramAccessImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSubprogramAccess()
	 * @generated
	 */
	int SUBPROGRAM_ACCESS = 55;
	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS__BASE_PORT = PortsandflowsPackage.PROXY_PORT__BASE_PORT;
	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS__SPECIFICATION = PortsandflowsPackage.PROXY_PORT_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS__DIRECTION = PortsandflowsPackage.PROXY_PORT_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS__TYPE = PortsandflowsPackage.PROXY_PORT_FEATURE_COUNT + 2;
	/**
	 * The number of structural features of the '<em>Subprogram Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS_FEATURE_COUNT = PortsandflowsPackage.PROXY_PORT_FEATURE_COUNT + 3;
	/**
	 * The number of operations of the '<em>Subprogram Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS_OPERATION_COUNT = PortsandflowsPackage.PROXY_PORT_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.SubprogramInterfaceImpl <em>Subprogram Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.SubprogramInterfaceImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSubprogramInterface()
	 * @generated
	 */
	int SUBPROGRAM_INTERFACE = 56;
	/**
	 * The number of structural features of the '<em>Subprogram Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_INTERFACE_FEATURE_COUNT = 0;
	/**
	 * The number of operations of the '<em>Subprogram Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_INTERFACE_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.SubprogramSpecificationImpl <em>Subprogram Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.SubprogramSpecificationImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSubprogramSpecification()
	 * @generated
	 */
	int SUBPROGRAM_SPECIFICATION = 57;
	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_SPECIFICATION__BASE_CLASS = PortsandflowsPackage.INTERFACE_BLOCK__BASE_CLASS;
	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_SPECIFICATION__IS_ENCAPSULATED = PortsandflowsPackage.INTERFACE_BLOCK__IS_ENCAPSULATED;
	/**
	 * The number of structural features of the '<em>Subprogram Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_SPECIFICATION_FEATURE_COUNT = PortsandflowsPackage.INTERFACE_BLOCK_FEATURE_COUNT + 0;
	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_SPECIFICATION___GET_REFERENCES = PortsandflowsPackage.INTERFACE_BLOCK___GET_REFERENCES;
	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_SPECIFICATION___GET_PARTS = PortsandflowsPackage.INTERFACE_BLOCK___GET_PARTS;
	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_SPECIFICATION___GET_FLOW_PROPERTIES = PortsandflowsPackage.INTERFACE_BLOCK___GET_FLOW_PROPERTIES;
	/**
	 * The number of operations of the '<em>Subprogram Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_SPECIFICATION_OPERATION_COUNT = PortsandflowsPackage.INTERFACE_BLOCK_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.DataTypeImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 58;
	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;
	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;
	/**
	 * The feature id for the '<em><b>Owned Error Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OWNED_ERROR_MODEL = BlocksPackage.BLOCK_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Extended</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__EXTENDED = BlocksPackage.BLOCK_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Owned Annex</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OWNED_ANNEX = BlocksPackage.BLOCK_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>Owned Data Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OWNED_DATA_ACCESS = BlocksPackage.BLOCK_FEATURE_COUNT + 3;
	/**
	 * The feature id for the '<em><b>Owned Subprogram Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OWNED_SUBPROGRAM_ACCESS = BlocksPackage.BLOCK_FEATURE_COUNT + 4;
	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 5;
	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;
	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;
	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;
	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.SubprogramAccessContainingImpl <em>Subprogram Access Containing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.SubprogramAccessContainingImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSubprogramAccessContaining()
	 * @generated
	 */
	int SUBPROGRAM_ACCESS_CONTAINING = 59;
	/**
	 * The feature id for the '<em><b>Owned Subprogram Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS_CONTAINING__OWNED_SUBPROGRAM_ACCESS = 0;
	/**
	 * The number of structural features of the '<em>Subprogram Access Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS_CONTAINING_FEATURE_COUNT = 1;
	/**
	 * The number of operations of the '<em>Subprogram Access Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS_CONTAINING_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.DataAccessContainingImpl <em>Data Access Containing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.DataAccessContainingImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getDataAccessContaining()
	 * @generated
	 */
	int DATA_ACCESS_CONTAINING = 60;
	/**
	 * The feature id for the '<em><b>Owned Data Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_CONTAINING__OWNED_DATA_ACCESS = 0;
	/**
	 * The number of structural features of the '<em>Data Access Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_CONTAINING_FEATURE_COUNT = 1;
	/**
	 * The number of operations of the '<em>Data Access Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_CONTAINING_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.DataAccessImpl <em>Data Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.DataAccessImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getDataAccess()
	 * @generated
	 */
	int DATA_ACCESS = 61;
	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS__BASE_PORT = PortsandflowsPackage.PROXY_PORT__BASE_PORT;
	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS__SPECIFICATION = PortsandflowsPackage.PROXY_PORT_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS__DIRECTION = PortsandflowsPackage.PROXY_PORT_FEATURE_COUNT + 1;
	/**
	 * The number of structural features of the '<em>Data Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_FEATURE_COUNT = PortsandflowsPackage.PROXY_PORT_FEATURE_COUNT + 2;
	/**
	 * The number of operations of the '<em>Data Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_OPERATION_COUNT = PortsandflowsPackage.PROXY_PORT_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.SubprogramCallContextImpl <em>Subprogram Call Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.SubprogramCallContextImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSubprogramCallContext()
	 * @generated
	 */
	int SUBPROGRAM_CALL_CONTEXT = 62;
	/**
	 * The number of structural features of the '<em>Subprogram Call Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_CALL_CONTEXT_FEATURE_COUNT = 0;
	/**
	 * The number of operations of the '<em>Subprogram Call Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_CALL_CONTEXT_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.DeviceImplementationImpl <em>Device Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.DeviceImplementationImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getDeviceImplementation()
	 * @generated
	 */
	int DEVICE_IMPLEMENTATION = 63;
	/**
	 * The feature id for the '<em><b>Owned Error Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IMPLEMENTATION__OWNED_ERROR_MODEL = COMPONENT_IMPLEMENTATION__OWNED_ERROR_MODEL;
	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IMPLEMENTATION__TYPE = COMPONENT_IMPLEMENTATION__TYPE;
	/**
	 * The feature id for the '<em><b>Extended</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IMPLEMENTATION__EXTENDED = COMPONENT_IMPLEMENTATION__EXTENDED;
	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IMPLEMENTATION__BASE_CLASS = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IMPLEMENTATION__IS_ENCAPSULATED = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Owned Annex</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IMPLEMENTATION__OWNED_ANNEX = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>Owned Bus Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IMPLEMENTATION__OWNED_BUS_CONNECTION = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 3;
	/**
	 * The feature id for the '<em><b>Owned Bus Subcomponent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 4;
	/**
	 * The feature id for the '<em><b>Owned Data Subcomponent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 5;
	/**
	 * The feature id for the '<em><b>Owned Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IMPLEMENTATION__OWNED_MODE = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 6;
	/**
	 * The feature id for the '<em><b>Owned Port Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IMPLEMENTATION__OWNED_PORT_CONNECTION = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 7;
	/**
	 * The feature id for the '<em><b>Owned Subprogram Access Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IMPLEMENTATION__OWNED_SUBPROGRAM_ACCESS_CONNECTION = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 8;
	/**
	 * The number of structural features of the '<em>Device Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IMPLEMENTATION_FEATURE_COUNT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 9;
	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IMPLEMENTATION___GET_REFERENCES = COMPONENT_IMPLEMENTATION_OPERATION_COUNT + 0;
	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IMPLEMENTATION___GET_PARTS = COMPONENT_IMPLEMENTATION_OPERATION_COUNT + 1;
	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IMPLEMENTATION___GET_FLOW_PROPERTIES = COMPONENT_IMPLEMENTATION_OPERATION_COUNT + 2;
	/**
	 * The number of operations of the '<em>Device Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IMPLEMENTATION_OPERATION_COUNT = COMPONENT_IMPLEMENTATION_OPERATION_COUNT + 3;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.BusContainingImpl <em>Bus Containing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.BusContainingImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getBusContaining()
	 * @generated
	 */
	int BUS_CONTAINING = 64;
	/**
	 * The feature id for the '<em><b>Owned Bus Subcomponent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONTAINING__OWNED_BUS_SUBCOMPONENT = 0;
	/**
	 * The number of structural features of the '<em>Bus Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONTAINING_FEATURE_COUNT = 1;
	/**
	 * The number of operations of the '<em>Bus Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONTAINING_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.BusSubcomponentImpl <em>Bus Subcomponent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.BusSubcomponentImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getBusSubcomponent()
	 * @generated
	 */
	int BUS_SUBCOMPONENT = 65;
	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SUBCOMPONENT__BASE_PROPERTY = SUBCOMPONENT_CLASSIFIER__BASE_PROPERTY;
	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SUBCOMPONENT__TYPE = SUBCOMPONENT_CLASSIFIER_FEATURE_COUNT + 0;
	/**
	 * The number of structural features of the '<em>Bus Subcomponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SUBCOMPONENT_FEATURE_COUNT = SUBCOMPONENT_CLASSIFIER_FEATURE_COUNT + 1;
	/**
	 * The number of operations of the '<em>Bus Subcomponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SUBCOMPONENT_OPERATION_COUNT = SUBCOMPONENT_CLASSIFIER_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.DeviceTypeImpl <em>Device Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.DeviceTypeImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getDeviceType()
	 * @generated
	 */
	int DEVICE_TYPE = 66;
	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;
	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;
	/**
	 * The feature id for the '<em><b>Owned Error Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__OWNED_ERROR_MODEL = BlocksPackage.BLOCK_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Extended</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__EXTENDED = BlocksPackage.BLOCK_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Owned Annex</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__OWNED_ANNEX = BlocksPackage.BLOCK_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>Owned Bus Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__OWNED_BUS_ACCESS = BlocksPackage.BLOCK_FEATURE_COUNT + 3;
	/**
	 * The feature id for the '<em><b>Owned Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__OWNED_MODE = BlocksPackage.BLOCK_FEATURE_COUNT + 4;
	/**
	 * The feature id for the '<em><b>Ownedport</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__OWNEDPORT = BlocksPackage.BLOCK_FEATURE_COUNT + 5;
	/**
	 * The feature id for the '<em><b>Owned Subprogram Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__OWNED_SUBPROGRAM_ACCESS = BlocksPackage.BLOCK_FEATURE_COUNT + 6;
	/**
	 * The number of structural features of the '<em>Device Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 7;
	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;
	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;
	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;
	/**
	 * The number of operations of the '<em>Device Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.MemoryImplementationImpl <em>Memory Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.MemoryImplementationImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getMemoryImplementation()
	 * @generated
	 */
	int MEMORY_IMPLEMENTATION = 67;
	/**
	 * The feature id for the '<em><b>Owned Error Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_IMPLEMENTATION__OWNED_ERROR_MODEL = COMPONENT_IMPLEMENTATION__OWNED_ERROR_MODEL;
	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_IMPLEMENTATION__TYPE = COMPONENT_IMPLEMENTATION__TYPE;
	/**
	 * The feature id for the '<em><b>Extended</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_IMPLEMENTATION__EXTENDED = COMPONENT_IMPLEMENTATION__EXTENDED;
	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_IMPLEMENTATION__BASE_CLASS = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_IMPLEMENTATION__IS_ENCAPSULATED = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Owned Annex</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_IMPLEMENTATION__OWNED_ANNEX = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>Owned Bus Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_IMPLEMENTATION__OWNED_BUS_CONNECTION = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 3;
	/**
	 * The feature id for the '<em><b>Owned Bus Subcomponent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 4;
	/**
	 * The feature id for the '<em><b>Owned Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_IMPLEMENTATION__OWNED_MODE = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 5;
	/**
	 * The feature id for the '<em><b>Owned Memory Subcomponent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_IMPLEMENTATION__OWNED_MEMORY_SUBCOMPONENT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 6;
	/**
	 * The feature id for the '<em><b>Owned Port Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_IMPLEMENTATION__OWNED_PORT_CONNECTION = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 7;
	/**
	 * The number of structural features of the '<em>Memory Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_IMPLEMENTATION_FEATURE_COUNT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 8;
	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_IMPLEMENTATION___GET_REFERENCES = COMPONENT_IMPLEMENTATION_OPERATION_COUNT + 0;
	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_IMPLEMENTATION___GET_PARTS = COMPONENT_IMPLEMENTATION_OPERATION_COUNT + 1;
	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_IMPLEMENTATION___GET_FLOW_PROPERTIES = COMPONENT_IMPLEMENTATION_OPERATION_COUNT + 2;
	/**
	 * The number of operations of the '<em>Memory Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_IMPLEMENTATION_OPERATION_COUNT = COMPONENT_IMPLEMENTATION_OPERATION_COUNT + 3;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.MemoryContainingImpl <em>Memory Containing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.MemoryContainingImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getMemoryContaining()
	 * @generated
	 */
	int MEMORY_CONTAINING = 68;
	/**
	 * The feature id for the '<em><b>Owned Memory Subcomponent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_CONTAINING__OWNED_MEMORY_SUBCOMPONENT = 0;
	/**
	 * The number of structural features of the '<em>Memory Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_CONTAINING_FEATURE_COUNT = 1;
	/**
	 * The number of operations of the '<em>Memory Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_CONTAINING_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.MemorySubcomponentImpl <em>Memory Subcomponent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.MemorySubcomponentImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getMemorySubcomponent()
	 * @generated
	 */
	int MEMORY_SUBCOMPONENT = 69;
	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_SUBCOMPONENT__BASE_PROPERTY = SUBCOMPONENT_CLASSIFIER__BASE_PROPERTY;
	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_SUBCOMPONENT__TYPE = SUBCOMPONENT_CLASSIFIER_FEATURE_COUNT + 0;
	/**
	 * The number of structural features of the '<em>Memory Subcomponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_SUBCOMPONENT_FEATURE_COUNT = SUBCOMPONENT_CLASSIFIER_FEATURE_COUNT + 1;
	/**
	 * The number of operations of the '<em>Memory Subcomponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_SUBCOMPONENT_OPERATION_COUNT = SUBCOMPONENT_CLASSIFIER_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.MemoryTypeImpl <em>Memory Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.MemoryTypeImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getMemoryType()
	 * @generated
	 */
	int MEMORY_TYPE = 70;
	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TYPE__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;
	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TYPE__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;
	/**
	 * The feature id for the '<em><b>Owned Error Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TYPE__OWNED_ERROR_MODEL = BlocksPackage.BLOCK_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Extended</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TYPE__EXTENDED = BlocksPackage.BLOCK_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Owned Annex</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TYPE__OWNED_ANNEX = BlocksPackage.BLOCK_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>Owned Bus Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TYPE__OWNED_BUS_ACCESS = BlocksPackage.BLOCK_FEATURE_COUNT + 3;
	/**
	 * The feature id for the '<em><b>Owned Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TYPE__OWNED_MODE = BlocksPackage.BLOCK_FEATURE_COUNT + 4;
	/**
	 * The feature id for the '<em><b>Ownedport</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TYPE__OWNEDPORT = BlocksPackage.BLOCK_FEATURE_COUNT + 5;
	/**
	 * The number of structural features of the '<em>Memory Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TYPE_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 6;
	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TYPE___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;
	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TYPE___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;
	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TYPE___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;
	/**
	 * The number of operations of the '<em>Memory Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TYPE_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.ProcessImplementationImpl <em>Process Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.ProcessImplementationImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getProcessImplementation()
	 * @generated
	 */
	int PROCESS_IMPLEMENTATION = 71;
	/**
	 * The feature id for the '<em><b>Owned Error Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_IMPLEMENTATION__OWNED_ERROR_MODEL = COMPONENT_IMPLEMENTATION__OWNED_ERROR_MODEL;
	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_IMPLEMENTATION__TYPE = COMPONENT_IMPLEMENTATION__TYPE;
	/**
	 * The feature id for the '<em><b>Extended</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_IMPLEMENTATION__EXTENDED = COMPONENT_IMPLEMENTATION__EXTENDED;
	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_IMPLEMENTATION__BASE_CLASS = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_IMPLEMENTATION__IS_ENCAPSULATED = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Owned Annex</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_IMPLEMENTATION__OWNED_ANNEX = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>Owned Data Access Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_IMPLEMENTATION__OWNED_DATA_ACCESS_CONNECTION = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 3;
	/**
	 * The feature id for the '<em><b>Owned Data Subcomponent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 4;
	/**
	 * The feature id for the '<em><b>Owned Port Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_IMPLEMENTATION__OWNED_PORT_CONNECTION = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 5;
	/**
	 * The feature id for the '<em><b>Owned Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_IMPLEMENTATION__OWNED_MODE = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 6;
	/**
	 * The feature id for the '<em><b>Owned Subprogram Access Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_IMPLEMENTATION__OWNED_SUBPROGRAM_ACCESS_CONNECTION = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 7;
	/**
	 * The feature id for the '<em><b>Owned Subprogram Subcomponent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 8;
	/**
	 * The feature id for the '<em><b>Owned Thread Subcomponent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_IMPLEMENTATION__OWNED_THREAD_SUBCOMPONENT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 9;
	/**
	 * The number of structural features of the '<em>Process Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_IMPLEMENTATION_FEATURE_COUNT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 10;
	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_IMPLEMENTATION___GET_REFERENCES = COMPONENT_IMPLEMENTATION_OPERATION_COUNT + 0;
	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_IMPLEMENTATION___GET_PARTS = COMPONENT_IMPLEMENTATION_OPERATION_COUNT + 1;
	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_IMPLEMENTATION___GET_FLOW_PROPERTIES = COMPONENT_IMPLEMENTATION_OPERATION_COUNT + 2;
	/**
	 * The number of operations of the '<em>Process Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_IMPLEMENTATION_OPERATION_COUNT = COMPONENT_IMPLEMENTATION_OPERATION_COUNT + 3;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.ThreadContainingImpl <em>Thread Containing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.ThreadContainingImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getThreadContaining()
	 * @generated
	 */
	int THREAD_CONTAINING = 72;
	/**
	 * The feature id for the '<em><b>Owned Thread Subcomponent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_CONTAINING__OWNED_THREAD_SUBCOMPONENT = 0;
	/**
	 * The number of structural features of the '<em>Thread Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_CONTAINING_FEATURE_COUNT = 1;
	/**
	 * The number of operations of the '<em>Thread Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_CONTAINING_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.ThreadSubcomponentImpl <em>Thread Subcomponent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.ThreadSubcomponentImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getThreadSubcomponent()
	 * @generated
	 */
	int THREAD_SUBCOMPONENT = 73;
	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_SUBCOMPONENT__BASE_PROPERTY = SUBCOMPONENT_CLASSIFIER__BASE_PROPERTY;
	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_SUBCOMPONENT__TYPE = SUBCOMPONENT_CLASSIFIER_FEATURE_COUNT + 0;
	/**
	 * The number of structural features of the '<em>Thread Subcomponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_SUBCOMPONENT_FEATURE_COUNT = SUBCOMPONENT_CLASSIFIER_FEATURE_COUNT + 1;
	/**
	 * The number of operations of the '<em>Thread Subcomponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_SUBCOMPONENT_OPERATION_COUNT = SUBCOMPONENT_CLASSIFIER_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.ProcessorImplementationImpl <em>Processor Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.ProcessorImplementationImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getProcessorImplementation()
	 * @generated
	 */
	int PROCESSOR_IMPLEMENTATION = 74;
	/**
	 * The feature id for the '<em><b>Owned Error Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_IMPLEMENTATION__OWNED_ERROR_MODEL = COMPONENT_IMPLEMENTATION__OWNED_ERROR_MODEL;
	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_IMPLEMENTATION__TYPE = COMPONENT_IMPLEMENTATION__TYPE;
	/**
	 * The feature id for the '<em><b>Extended</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_IMPLEMENTATION__EXTENDED = COMPONENT_IMPLEMENTATION__EXTENDED;
	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_IMPLEMENTATION__BASE_CLASS = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_IMPLEMENTATION__IS_ENCAPSULATED = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Owned Annex</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_IMPLEMENTATION__OWNED_ANNEX = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>Owned Bus Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_IMPLEMENTATION__OWNED_BUS_CONNECTION = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 3;
	/**
	 * The feature id for the '<em><b>Owned Bus Subcomponent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 4;
	/**
	 * The feature id for the '<em><b>Owned Memory Subcomponent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_IMPLEMENTATION__OWNED_MEMORY_SUBCOMPONENT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 5;
	/**
	 * The feature id for the '<em><b>Owned Port Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_IMPLEMENTATION__OWNED_PORT_CONNECTION = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 6;
	/**
	 * The feature id for the '<em><b>Owned Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_IMPLEMENTATION__OWNED_MODE = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 7;
	/**
	 * The feature id for the '<em><b>Owned Subprogram Access Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_IMPLEMENTATION__OWNED_SUBPROGRAM_ACCESS_CONNECTION = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 8;
	/**
	 * The number of structural features of the '<em>Processor Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_IMPLEMENTATION_FEATURE_COUNT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 9;
	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_IMPLEMENTATION___GET_REFERENCES = COMPONENT_IMPLEMENTATION_OPERATION_COUNT + 0;
	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_IMPLEMENTATION___GET_PARTS = COMPONENT_IMPLEMENTATION_OPERATION_COUNT + 1;
	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_IMPLEMENTATION___GET_FLOW_PROPERTIES = COMPONENT_IMPLEMENTATION_OPERATION_COUNT + 2;
	/**
	 * The number of operations of the '<em>Processor Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_IMPLEMENTATION_OPERATION_COUNT = COMPONENT_IMPLEMENTATION_OPERATION_COUNT + 3;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.ProcessorTypeImpl <em>Processor Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.ProcessorTypeImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getProcessorType()
	 * @generated
	 */
	int PROCESSOR_TYPE = 75;
	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;
	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;
	/**
	 * The feature id for the '<em><b>Owned Error Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE__OWNED_ERROR_MODEL = BlocksPackage.BLOCK_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Extended</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE__EXTENDED = BlocksPackage.BLOCK_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Owned Annex</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE__OWNED_ANNEX = BlocksPackage.BLOCK_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>Owned Bus Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE__OWNED_BUS_ACCESS = BlocksPackage.BLOCK_FEATURE_COUNT + 3;
	/**
	 * The feature id for the '<em><b>Ownedport</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE__OWNEDPORT = BlocksPackage.BLOCK_FEATURE_COUNT + 4;
	/**
	 * The feature id for the '<em><b>Owned Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE__OWNED_MODE = BlocksPackage.BLOCK_FEATURE_COUNT + 5;
	/**
	 * The feature id for the '<em><b>Owned Subprogram Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE__OWNED_SUBPROGRAM_ACCESS = BlocksPackage.BLOCK_FEATURE_COUNT + 6;
	/**
	 * The number of structural features of the '<em>Processor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 7;
	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;
	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;
	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;
	/**
	 * The number of operations of the '<em>Processor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.ProcessTypeImpl <em>Process Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.ProcessTypeImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getProcessType()
	 * @generated
	 */
	int PROCESS_TYPE = 76;
	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TYPE__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;
	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TYPE__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;
	/**
	 * The feature id for the '<em><b>Owned Error Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TYPE__OWNED_ERROR_MODEL = BlocksPackage.BLOCK_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Extended</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TYPE__EXTENDED = BlocksPackage.BLOCK_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Owned Annex</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TYPE__OWNED_ANNEX = BlocksPackage.BLOCK_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>Owned Data Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TYPE__OWNED_DATA_ACCESS = BlocksPackage.BLOCK_FEATURE_COUNT + 3;
	/**
	 * The feature id for the '<em><b>Ownedport</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TYPE__OWNEDPORT = BlocksPackage.BLOCK_FEATURE_COUNT + 4;
	/**
	 * The feature id for the '<em><b>Owned Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TYPE__OWNED_MODE = BlocksPackage.BLOCK_FEATURE_COUNT + 5;
	/**
	 * The number of structural features of the '<em>Process Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TYPE_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 6;
	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TYPE___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;
	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TYPE___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;
	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TYPE___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;
	/**
	 * The number of operations of the '<em>Process Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TYPE_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.SubprogramImplementationImpl <em>Subprogram Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.SubprogramImplementationImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSubprogramImplementation()
	 * @generated
	 */
	int SUBPROGRAM_IMPLEMENTATION = 77;
	/**
	 * The feature id for the '<em><b>Owned Error Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_IMPLEMENTATION__OWNED_ERROR_MODEL = COMPONENT_IMPLEMENTATION__OWNED_ERROR_MODEL;
	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_IMPLEMENTATION__TYPE = COMPONENT_IMPLEMENTATION__TYPE;
	/**
	 * The feature id for the '<em><b>Extended</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_IMPLEMENTATION__EXTENDED = COMPONENT_IMPLEMENTATION__EXTENDED;
	/**
	 * The feature id for the '<em><b>Owned Annex</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_IMPLEMENTATION__OWNED_ANNEX = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Owned Call Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_IMPLEMENTATION__OWNED_CALL_SEQUENCE = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Owned Data Access Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_IMPLEMENTATION__OWNED_DATA_ACCESS_CONNECTION = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>Owned Data Subcomponent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 3;
	/**
	 * The feature id for the '<em><b>Owned Parameter Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_IMPLEMENTATION__OWNED_PARAMETER_CONNECTION = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 4;
	/**
	 * The feature id for the '<em><b>Owned Port Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_IMPLEMENTATION__OWNED_PORT_CONNECTION = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 5;
	/**
	 * The feature id for the '<em><b>Owned Subprogram Access Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_IMPLEMENTATION__OWNED_SUBPROGRAM_ACCESS_CONNECTION = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 6;
	/**
	 * The feature id for the '<em><b>Owned Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_IMPLEMENTATION__OWNED_MODE = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 7;
	/**
	 * The feature id for the '<em><b>Owned Subprogram Subcomponent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 8;
	/**
	 * The feature id for the '<em><b>Base Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_IMPLEMENTATION__BASE_ACTIVITY = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 9;
	/**
	 * The number of structural features of the '<em>Subprogram Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_IMPLEMENTATION_FEATURE_COUNT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 10;
	/**
	 * The number of operations of the '<em>Subprogram Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_IMPLEMENTATION_OPERATION_COUNT = COMPONENT_IMPLEMENTATION_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.ParameterConnectionContainingImpl <em>Parameter Connection Containing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.ParameterConnectionContainingImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getParameterConnectionContaining()
	 * @generated
	 */
	int PARAMETER_CONNECTION_CONTAINING = 78;
	/**
	 * The feature id for the '<em><b>Owned Parameter Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONNECTION_CONTAINING__OWNED_PARAMETER_CONNECTION = 0;
	/**
	 * The number of structural features of the '<em>Parameter Connection Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONNECTION_CONTAINING_FEATURE_COUNT = 1;
	/**
	 * The number of operations of the '<em>Parameter Connection Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONNECTION_CONTAINING_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.ParameterConnectionImpl <em>Parameter Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.ParameterConnectionImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getParameterConnection()
	 * @generated
	 */
	int PARAMETER_CONNECTION = 79;
	/**
	 * The feature id for the '<em><b>Base Object Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONNECTION__BASE_OBJECT_FLOW = CONNECTION_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONNECTION__IN = CONNECTION_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONNECTION__OUT = CONNECTION_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>In Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONNECTION__IN_CONTEXT = CONNECTION_FEATURE_COUNT + 3;
	/**
	 * The feature id for the '<em><b>Out Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONNECTION__OUT_CONTEXT = CONNECTION_FEATURE_COUNT + 4;
	/**
	 * The number of structural features of the '<em>Parameter Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 5;
	/**
	 * The number of operations of the '<em>Parameter Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONNECTION_OPERATION_COUNT = CONNECTION_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.ParameterConnectionEndImpl <em>Parameter Connection End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.ParameterConnectionEndImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getParameterConnectionEnd()
	 * @generated
	 */
	int PARAMETER_CONNECTION_END = 80;
	/**
	 * The number of structural features of the '<em>Parameter Connection End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONNECTION_END_FEATURE_COUNT = 0;
	/**
	 * The number of operations of the '<em>Parameter Connection End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONNECTION_END_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.ParameterConnectionContextImpl <em>Parameter Connection Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.ParameterConnectionContextImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getParameterConnectionContext()
	 * @generated
	 */
	int PARAMETER_CONNECTION_CONTEXT = 81;
	/**
	 * The number of structural features of the '<em>Parameter Connection Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONNECTION_CONTEXT_FEATURE_COUNT = 0;
	/**
	 * The number of operations of the '<em>Parameter Connection Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONNECTION_CONTEXT_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.CallSequenceDescribableImpl <em>Call Sequence Describable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.CallSequenceDescribableImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getCallSequenceDescribable()
	 * @generated
	 */
	int CALL_SEQUENCE_DESCRIBABLE = 82;
	/**
	 * The feature id for the '<em><b>Owned Call Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SEQUENCE_DESCRIBABLE__OWNED_CALL_SEQUENCE = 0;
	/**
	 * The number of structural features of the '<em>Call Sequence Describable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SEQUENCE_DESCRIBABLE_FEATURE_COUNT = 1;
	/**
	 * The number of operations of the '<em>Call Sequence Describable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SEQUENCE_DESCRIBABLE_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.CallSequenceImpl <em>Call Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.CallSequenceImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getCallSequence()
	 * @generated
	 */
	int CALL_SEQUENCE = 83;
	/**
	 * The feature id for the '<em><b>Base Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SEQUENCE__BASE_ACTIVITY = 0;
	/**
	 * The feature id for the '<em><b>Owned Subprogram Call</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SEQUENCE__OWNED_SUBPROGRAM_CALL = 1;
	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SEQUENCE__FIRST = 2;
	/**
	 * The number of structural features of the '<em>Call Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SEQUENCE_FEATURE_COUNT = 3;
	/**
	 * The number of operations of the '<em>Call Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SEQUENCE_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.SubprogramCallImpl <em>Subprogram Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.SubprogramCallImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSubprogramCall()
	 * @generated
	 */
	int SUBPROGRAM_CALL = 84;
	/**
	 * The feature id for the '<em><b>Last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_CALL__LAST = PARAMETER_CONNECTION_CONTEXT_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_CALL__NEXT = PARAMETER_CONNECTION_CONTEXT_FEATURE_COUNT + 1;
	/**
	 * The number of structural features of the '<em>Subprogram Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_CALL_FEATURE_COUNT = PARAMETER_CONNECTION_CONTEXT_FEATURE_COUNT + 2;
	/**
	 * The number of operations of the '<em>Subprogram Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_CALL_OPERATION_COUNT = PARAMETER_CONNECTION_CONTEXT_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.SubprogramTypeImpl <em>Subprogram Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.SubprogramTypeImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSubprogramType()
	 * @generated
	 */
	int SUBPROGRAM_TYPE = 85;
	/**
	 * The feature id for the '<em><b>Owned Error Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_TYPE__OWNED_ERROR_MODEL = COMPONENT_TYPE__OWNED_ERROR_MODEL;
	/**
	 * The feature id for the '<em><b>Extended</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_TYPE__EXTENDED = COMPONENT_TYPE__EXTENDED;
	/**
	 * The feature id for the '<em><b>Owned Annex</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_TYPE__OWNED_ANNEX = COMPONENT_TYPE_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Owned Data Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_TYPE__OWNED_DATA_ACCESS = COMPONENT_TYPE_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_TYPE__OWNED_PARAMETER = COMPONENT_TYPE_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>Ownedport</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_TYPE__OWNEDPORT = COMPONENT_TYPE_FEATURE_COUNT + 3;
	/**
	 * The feature id for the '<em><b>Owned Subprogram Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_TYPE__OWNED_SUBPROGRAM_ACCESS = COMPONENT_TYPE_FEATURE_COUNT + 4;
	/**
	 * The feature id for the '<em><b>Owned Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_TYPE__OWNED_MODE = COMPONENT_TYPE_FEATURE_COUNT + 5;
	/**
	 * The feature id for the '<em><b>Base Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_TYPE__BASE_ACTIVITY = COMPONENT_TYPE_FEATURE_COUNT + 6;
	/**
	 * The number of structural features of the '<em>Subprogram Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_TYPE_FEATURE_COUNT = COMPONENT_TYPE_FEATURE_COUNT + 7;
	/**
	 * The number of operations of the '<em>Subprogram Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_TYPE_OPERATION_COUNT = COMPONENT_TYPE_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.ParameterContainingImpl <em>Parameter Containing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.ParameterContainingImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getParameterContaining()
	 * @generated
	 */
	int PARAMETER_CONTAINING = 86;
	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONTAINING__OWNED_PARAMETER = 0;
	/**
	 * The number of structural features of the '<em>Parameter Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONTAINING_FEATURE_COUNT = 1;
	/**
	 * The number of operations of the '<em>Parameter Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONTAINING_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.ParameterImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 87;
	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DIRECTION = FEATURE_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Base Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__BASE_PARAMETER = FEATURE_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = FEATURE_FEATURE_COUNT + 2;
	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 3;
	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.SystemImplementationImpl <em>System Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.SystemImplementationImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSystemImplementation()
	 * @generated
	 */
	int SYSTEM_IMPLEMENTATION = 88;
	/**
	 * The feature id for the '<em><b>Owned Error Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__OWNED_ERROR_MODEL = COMPONENT_IMPLEMENTATION__OWNED_ERROR_MODEL;
	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__TYPE = COMPONENT_IMPLEMENTATION__TYPE;
	/**
	 * The feature id for the '<em><b>Extended</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__EXTENDED = COMPONENT_IMPLEMENTATION__EXTENDED;
	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__BASE_CLASS = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__IS_ENCAPSULATED = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Owned Annex</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__OWNED_ANNEX = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>Owned Bus Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__OWNED_BUS_CONNECTION = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 3;
	/**
	 * The feature id for the '<em><b>Owned Bus Subcomponent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 4;
	/**
	 * The feature id for the '<em><b>Owned Data Access Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__OWNED_DATA_ACCESS_CONNECTION = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 5;
	/**
	 * The feature id for the '<em><b>Owned Data Subcomponent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 6;
	/**
	 * The feature id for the '<em><b>Owned Device Subcomponent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__OWNED_DEVICE_SUBCOMPONENT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 7;
	/**
	 * The feature id for the '<em><b>Owned Memory Subcomponent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__OWNED_MEMORY_SUBCOMPONENT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 8;
	/**
	 * The feature id for the '<em><b>Owned Port Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__OWNED_PORT_CONNECTION = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 9;
	/**
	 * The feature id for the '<em><b>Owned Process Subcomponent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__OWNED_PROCESS_SUBCOMPONENT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 10;
	/**
	 * The feature id for the '<em><b>Owned Processor Subcomponent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__OWNED_PROCESSOR_SUBCOMPONENT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 11;
	/**
	 * The feature id for the '<em><b>Owned Subprogram Access Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__OWNED_SUBPROGRAM_ACCESS_CONNECTION = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 12;
	/**
	 * The feature id for the '<em><b>Owned Subprogram Subcomponent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 13;
	/**
	 * The feature id for the '<em><b>Owned Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__OWNED_MODE = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 14;
	/**
	 * The feature id for the '<em><b>Owned System Subcomponent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__OWNED_SYSTEM_SUBCOMPONENT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 15;
	/**
	 * The number of structural features of the '<em>System Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION_FEATURE_COUNT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 16;
	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION___GET_REFERENCES = COMPONENT_IMPLEMENTATION_OPERATION_COUNT + 0;
	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION___GET_PARTS = COMPONENT_IMPLEMENTATION_OPERATION_COUNT + 1;
	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION___GET_FLOW_PROPERTIES = COMPONENT_IMPLEMENTATION_OPERATION_COUNT + 2;
	/**
	 * The number of operations of the '<em>System Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION_OPERATION_COUNT = COMPONENT_IMPLEMENTATION_OPERATION_COUNT + 3;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.ProcessContainingImpl <em>Process Containing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.ProcessContainingImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getProcessContaining()
	 * @generated
	 */
	int PROCESS_CONTAINING = 89;
	/**
	 * The feature id for the '<em><b>Owned Process Subcomponent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CONTAINING__OWNED_PROCESS_SUBCOMPONENT = 0;
	/**
	 * The number of structural features of the '<em>Process Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CONTAINING_FEATURE_COUNT = 1;
	/**
	 * The number of operations of the '<em>Process Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CONTAINING_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.ProcessSubcomponentImpl <em>Process Subcomponent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.ProcessSubcomponentImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getProcessSubcomponent()
	 * @generated
	 */
	int PROCESS_SUBCOMPONENT = 90;
	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SUBCOMPONENT__BASE_PROPERTY = SUBCOMPONENT_CLASSIFIER__BASE_PROPERTY;
	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SUBCOMPONENT__TYPE = SUBCOMPONENT_CLASSIFIER_FEATURE_COUNT + 0;
	/**
	 * The number of structural features of the '<em>Process Subcomponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SUBCOMPONENT_FEATURE_COUNT = SUBCOMPONENT_CLASSIFIER_FEATURE_COUNT + 1;
	/**
	 * The number of operations of the '<em>Process Subcomponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SUBCOMPONENT_OPERATION_COUNT = SUBCOMPONENT_CLASSIFIER_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.ProcessorContainingImpl <em>Processor Containing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.ProcessorContainingImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getProcessorContaining()
	 * @generated
	 */
	int PROCESSOR_CONTAINING = 91;
	/**
	 * The feature id for the '<em><b>Owned Processor Subcomponent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_CONTAINING__OWNED_PROCESSOR_SUBCOMPONENT = 0;
	/**
	 * The number of structural features of the '<em>Processor Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_CONTAINING_FEATURE_COUNT = 1;
	/**
	 * The number of operations of the '<em>Processor Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_CONTAINING_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.ProcessorSubcomponentImpl <em>Processor Subcomponent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.ProcessorSubcomponentImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getProcessorSubcomponent()
	 * @generated
	 */
	int PROCESSOR_SUBCOMPONENT = 92;
	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_SUBCOMPONENT__BASE_PROPERTY = SUBCOMPONENT_CLASSIFIER__BASE_PROPERTY;
	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_SUBCOMPONENT__TYPE = SUBCOMPONENT_CLASSIFIER_FEATURE_COUNT + 0;
	/**
	 * The number of structural features of the '<em>Processor Subcomponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_SUBCOMPONENT_FEATURE_COUNT = SUBCOMPONENT_CLASSIFIER_FEATURE_COUNT + 1;
	/**
	 * The number of operations of the '<em>Processor Subcomponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_SUBCOMPONENT_OPERATION_COUNT = SUBCOMPONENT_CLASSIFIER_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.SystemContainingImpl <em>System Containing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.SystemContainingImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSystemContaining()
	 * @generated
	 */
	int SYSTEM_CONTAINING = 93;
	/**
	 * The feature id for the '<em><b>Owned System Subcomponent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTAINING__OWNED_SYSTEM_SUBCOMPONENT = 0;
	/**
	 * The number of structural features of the '<em>System Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTAINING_FEATURE_COUNT = 1;
	/**
	 * The number of operations of the '<em>System Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTAINING_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.SystemSubcomponentImpl <em>System Subcomponent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.SystemSubcomponentImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSystemSubcomponent()
	 * @generated
	 */
	int SYSTEM_SUBCOMPONENT = 94;
	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SUBCOMPONENT__BASE_PROPERTY = SUBCOMPONENT_CLASSIFIER__BASE_PROPERTY;
	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SUBCOMPONENT__TYPE = SUBCOMPONENT_CLASSIFIER_FEATURE_COUNT + 0;
	/**
	 * The number of structural features of the '<em>System Subcomponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SUBCOMPONENT_FEATURE_COUNT = SUBCOMPONENT_CLASSIFIER_FEATURE_COUNT + 1;
	/**
	 * The number of operations of the '<em>System Subcomponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SUBCOMPONENT_OPERATION_COUNT = SUBCOMPONENT_CLASSIFIER_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.DeviceContainingImpl <em>Device Containing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.DeviceContainingImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getDeviceContaining()
	 * @generated
	 */
	int DEVICE_CONTAINING = 95;
	/**
	 * The feature id for the '<em><b>Owned Device Subcomponent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONTAINING__OWNED_DEVICE_SUBCOMPONENT = 0;
	/**
	 * The number of structural features of the '<em>Device Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONTAINING_FEATURE_COUNT = 1;
	/**
	 * The number of operations of the '<em>Device Containing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONTAINING_OPERATION_COUNT = 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.DeviceSubcomponentImpl <em>Device Subcomponent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.DeviceSubcomponentImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getDeviceSubcomponent()
	 * @generated
	 */
	int DEVICE_SUBCOMPONENT = 96;
	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SUBCOMPONENT__BASE_PROPERTY = SUBCOMPONENT_CLASSIFIER__BASE_PROPERTY;
	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SUBCOMPONENT__TYPE = SUBCOMPONENT_CLASSIFIER_FEATURE_COUNT + 0;
	/**
	 * The number of structural features of the '<em>Device Subcomponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SUBCOMPONENT_FEATURE_COUNT = SUBCOMPONENT_CLASSIFIER_FEATURE_COUNT + 1;
	/**
	 * The number of operations of the '<em>Device Subcomponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SUBCOMPONENT_OPERATION_COUNT = SUBCOMPONENT_CLASSIFIER_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.SystemTypeImpl <em>System Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.SystemTypeImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSystemType()
	 * @generated
	 */
	int SYSTEM_TYPE = 97;
	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;
	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;
	/**
	 * The feature id for the '<em><b>Owned Error Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE__OWNED_ERROR_MODEL = BlocksPackage.BLOCK_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Extended</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE__EXTENDED = BlocksPackage.BLOCK_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Owned Annex</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE__OWNED_ANNEX = BlocksPackage.BLOCK_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>Owned Bus Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE__OWNED_BUS_ACCESS = BlocksPackage.BLOCK_FEATURE_COUNT + 3;
	/**
	 * The feature id for the '<em><b>Owned Data Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE__OWNED_DATA_ACCESS = BlocksPackage.BLOCK_FEATURE_COUNT + 4;
	/**
	 * The feature id for the '<em><b>Ownedport</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE__OWNEDPORT = BlocksPackage.BLOCK_FEATURE_COUNT + 5;
	/**
	 * The feature id for the '<em><b>Owned Subprogram Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE__OWNED_SUBPROGRAM_ACCESS = BlocksPackage.BLOCK_FEATURE_COUNT + 6;
	/**
	 * The feature id for the '<em><b>Owned Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE__OWNED_MODE = BlocksPackage.BLOCK_FEATURE_COUNT + 7;
	/**
	 * The number of structural features of the '<em>System Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 8;
	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;
	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;
	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;
	/**
	 * The number of operations of the '<em>System Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.ThreadImplementationImpl <em>Thread Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.ThreadImplementationImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getThreadImplementation()
	 * @generated
	 */
	int THREAD_IMPLEMENTATION = 98;
	/**
	 * The feature id for the '<em><b>Owned Error Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_IMPLEMENTATION__OWNED_ERROR_MODEL = COMPONENT_IMPLEMENTATION__OWNED_ERROR_MODEL;
	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_IMPLEMENTATION__TYPE = COMPONENT_IMPLEMENTATION__TYPE;
	/**
	 * The feature id for the '<em><b>Extended</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_IMPLEMENTATION__EXTENDED = COMPONENT_IMPLEMENTATION__EXTENDED;
	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_IMPLEMENTATION__BASE_CLASS = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_IMPLEMENTATION__IS_ENCAPSULATED = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Owned Annex</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_IMPLEMENTATION__OWNED_ANNEX = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>Owned Call Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_IMPLEMENTATION__OWNED_CALL_SEQUENCE = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 3;
	/**
	 * The feature id for the '<em><b>Owned Data Access Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_IMPLEMENTATION__OWNED_DATA_ACCESS_CONNECTION = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 4;
	/**
	 * The feature id for the '<em><b>Owned Data Subcomponent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 5;
	/**
	 * The feature id for the '<em><b>Owned Parameter Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_IMPLEMENTATION__OWNED_PARAMETER_CONNECTION = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 6;
	/**
	 * The feature id for the '<em><b>Owned Port Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_IMPLEMENTATION__OWNED_PORT_CONNECTION = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 7;
	/**
	 * The feature id for the '<em><b>Owned Subprogram Access Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_IMPLEMENTATION__OWNED_SUBPROGRAM_ACCESS_CONNECTION = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 8;
	/**
	 * The feature id for the '<em><b>Owned Subprogram Subcomponent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 9;
	/**
	 * The feature id for the '<em><b>Owned Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_IMPLEMENTATION__OWNED_MODE = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 10;
	/**
	 * The number of structural features of the '<em>Thread Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_IMPLEMENTATION_FEATURE_COUNT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 11;
	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_IMPLEMENTATION___GET_REFERENCES = COMPONENT_IMPLEMENTATION_OPERATION_COUNT + 0;
	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_IMPLEMENTATION___GET_PARTS = COMPONENT_IMPLEMENTATION_OPERATION_COUNT + 1;
	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_IMPLEMENTATION___GET_FLOW_PROPERTIES = COMPONENT_IMPLEMENTATION_OPERATION_COUNT + 2;
	/**
	 * The number of operations of the '<em>Thread Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_IMPLEMENTATION_OPERATION_COUNT = COMPONENT_IMPLEMENTATION_OPERATION_COUNT + 3;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.ThreadTypeImpl <em>Thread Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.ThreadTypeImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getThreadType()
	 * @generated
	 */
	int THREAD_TYPE = 99;
	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_TYPE__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;
	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_TYPE__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;
	/**
	 * The feature id for the '<em><b>Owned Error Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_TYPE__OWNED_ERROR_MODEL = BlocksPackage.BLOCK_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Extended</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_TYPE__EXTENDED = BlocksPackage.BLOCK_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Owned Annex</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_TYPE__OWNED_ANNEX = BlocksPackage.BLOCK_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>Owned Data Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_TYPE__OWNED_DATA_ACCESS = BlocksPackage.BLOCK_FEATURE_COUNT + 3;
	/**
	 * The feature id for the '<em><b>Ownedport</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_TYPE__OWNEDPORT = BlocksPackage.BLOCK_FEATURE_COUNT + 4;
	/**
	 * The feature id for the '<em><b>Owned Subprogram Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_TYPE__OWNED_SUBPROGRAM_ACCESS = BlocksPackage.BLOCK_FEATURE_COUNT + 5;
	/**
	 * The feature id for the '<em><b>Owned Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_TYPE__OWNED_MODE = BlocksPackage.BLOCK_FEATURE_COUNT + 6;
	/**
	 * The number of structural features of the '<em>Thread Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_TYPE_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 7;
	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_TYPE___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;
	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_TYPE___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;
	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_TYPE___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;
	/**
	 * The number of operations of the '<em>Thread Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_TYPE_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.DataPortImpl <em>Data Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.DataPortImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getDataPort()
	 * @generated
	 */
	int DATA_PORT = 100;
	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__BASE_PORT = PORT__BASE_PORT;
	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__SPECIFICATION = PORT__SPECIFICATION;
	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__DIRECTION = PORT__DIRECTION;
	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__TYPE = PORT_FEATURE_COUNT + 0;
	/**
	 * The number of structural features of the '<em>Data Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;
	/**
	 * The number of operations of the '<em>Data Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.EventDataPortImpl <em>Event Data Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.EventDataPortImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getEventDataPort()
	 * @generated
	 */
	int EVENT_DATA_PORT = 101;
	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT__BASE_PORT = DATA_PORT__BASE_PORT;
	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT__SPECIFICATION = DATA_PORT__SPECIFICATION;
	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT__DIRECTION = DATA_PORT__DIRECTION;
	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT__TYPE = DATA_PORT__TYPE;
	/**
	 * The number of structural features of the '<em>Event Data Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT_FEATURE_COUNT = DATA_PORT_FEATURE_COUNT + 0;
	/**
	 * The number of operations of the '<em>Event Data Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT_OPERATION_COUNT = DATA_PORT_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.NormalModeImpl <em>Normal Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.NormalModeImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getNormalMode()
	 * @generated
	 */
	int NORMAL_MODE = 102;
	/**
	 * The feature id for the '<em><b>Base State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_MODE__BASE_STATE = MODE_FEATURE_COUNT + 0;
	/**
	 * The number of structural features of the '<em>Normal Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_MODE_FEATURE_COUNT = MODE_FEATURE_COUNT + 1;
	/**
	 * The number of operations of the '<em>Normal Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_MODE_OPERATION_COUNT = MODE_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.InitialModeImpl <em>Initial Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.InitialModeImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getInitialMode()
	 * @generated
	 */
	int INITIAL_MODE = 103;
	/**
	 * The feature id for the '<em><b>Base Pseudostate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODE__BASE_PSEUDOSTATE = MODE_FEATURE_COUNT + 0;
	/**
	 * The number of structural features of the '<em>Initial Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODE_FEATURE_COUNT = MODE_FEATURE_COUNT + 1;
	/**
	 * The number of operations of the '<em>Initial Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODE_OPERATION_COUNT = MODE_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.SubprogramInstanceCallImpl <em>Subprogram Instance Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.SubprogramInstanceCallImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSubprogramInstanceCall()
	 * @generated
	 */
	int SUBPROGRAM_INSTANCE_CALL = 104;
	/**
	 * The feature id for the '<em><b>Last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_INSTANCE_CALL__LAST = SUBPROGRAM_CALL__LAST;
	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_INSTANCE_CALL__NEXT = SUBPROGRAM_CALL__NEXT;
	/**
	 * The feature id for the '<em><b>Base Call Behavior Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_INSTANCE_CALL__BASE_CALL_BEHAVIOR_ACTION = SUBPROGRAM_CALL_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Subprogram Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_INSTANCE_CALL__SUBPROGRAM_INSTANCE = SUBPROGRAM_CALL_FEATURE_COUNT + 1;
	/**
	 * The number of structural features of the '<em>Subprogram Instance Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_INSTANCE_CALL_FEATURE_COUNT = SUBPROGRAM_CALL_FEATURE_COUNT + 2;
	/**
	 * The number of operations of the '<em>Subprogram Instance Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_INSTANCE_CALL_OPERATION_COUNT = SUBPROGRAM_CALL_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.SubprogramInterfaceCallImpl <em>Subprogram Interface Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.SubprogramInterfaceCallImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSubprogramInterfaceCall()
	 * @generated
	 */
	int SUBPROGRAM_INTERFACE_CALL = 105;
	/**
	 * The feature id for the '<em><b>Last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_INTERFACE_CALL__LAST = SUBPROGRAM_CALL__LAST;
	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_INTERFACE_CALL__NEXT = SUBPROGRAM_CALL__NEXT;
	/**
	 * The feature id for the '<em><b>Base Call Operation Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_INTERFACE_CALL__BASE_CALL_OPERATION_ACTION = SUBPROGRAM_CALL_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Subprogram Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_INTERFACE_CALL__SUBPROGRAM_INTERFACE = SUBPROGRAM_CALL_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_INTERFACE_CALL__CONTEXT = SUBPROGRAM_CALL_FEATURE_COUNT + 2;
	/**
	 * The number of structural features of the '<em>Subprogram Interface Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_INTERFACE_CALL_FEATURE_COUNT = SUBPROGRAM_CALL_FEATURE_COUNT + 3;
	/**
	 * The number of operations of the '<em>Subprogram Interface Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_INTERFACE_CALL_OPERATION_COUNT = SUBPROGRAM_CALL_OPERATION_COUNT + 0;
	/**
	 * The meta object id for the '{@link NEsysml.Aadl.impl.AadlModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Aadl.impl.AadlModelImpl
	 * @see NEsysml.Aadl.impl.AadlPackageImpl#getAadlModel()
	 * @generated
	 */
	int AADL_MODEL = 106;
	/**
	 * The feature id for the '<em><b>Owned Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AADL_MODEL__OWNED_CLASSIFIER = 0;
	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AADL_MODEL__BASE_PACKAGE = 1;
	/**
	 * The feature id for the '<em><b>Import EM Library</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AADL_MODEL__IMPORT_EM_LIBRARY = 2;
	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AADL_MODEL_FEATURE_COUNT = 3;
	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AADL_MODEL_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see NEsysml.Aadl.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.Extension#getBase_Generalization <em>Base Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Generalization</em>'.
	 * @see NEsysml.Aadl.Extension#getBase_Generalization()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Base_Generalization();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.Implementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation</em>'.
	 * @see NEsysml.Aadl.Implementation
	 * @generated
	 */
	EClass getImplementation();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.Implementation#getBase_Generalization <em>Base Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Generalization</em>'.
	 * @see NEsysml.Aadl.Implementation#getBase_Generalization()
	 * @see #getImplementation()
	 * @generated
	 */
	EReference getImplementation_Base_Generalization();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type</em>'.
	 * @see NEsysml.Aadl.ComponentType
	 * @generated
	 */
	EClass getComponentType();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.ComponentType#getExtended <em>Extended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extended</em>'.
	 * @see NEsysml.Aadl.ComponentType#getExtended()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Extended();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.ComponentClassifier <em>Component Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Classifier</em>'.
	 * @see NEsysml.Aadl.ComponentClassifier
	 * @generated
	 */
	EClass getComponentClassifier();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.ComponentClassifier#getOwnedErrorModel <em>Owned Error Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owned Error Model</em>'.
	 * @see NEsysml.Aadl.ComponentClassifier#getOwnedErrorModel()
	 * @see #getComponentClassifier()
	 * @generated
	 */
	EReference getComponentClassifier_OwnedErrorModel();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see NEsysml.Aadl.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.Annex <em>Annex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annex</em>'.
	 * @see NEsysml.Aadl.Annex
	 * @generated
	 */
	EClass getAnnex();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.BusAccessConnectionContaining <em>Bus Access Connection Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Access Connection Containing</em>'.
	 * @see NEsysml.Aadl.BusAccessConnectionContaining
	 * @generated
	 */
	EClass getBusAccessConnectionContaining();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.Aadl.BusAccessConnectionContaining#getOwnedBusConnection <em>Owned Bus Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Bus Connection</em>'.
	 * @see NEsysml.Aadl.BusAccessConnectionContaining#getOwnedBusConnection()
	 * @see #getBusAccessConnectionContaining()
	 * @generated
	 */
	EReference getBusAccessConnectionContaining_OwnedBusConnection();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.BusConnection <em>Bus Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Connection</em>'.
	 * @see NEsysml.Aadl.BusConnection
	 * @generated
	 */
	EClass getBusConnection();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.BusConnection#getBase_Connector <em>Base Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Connector</em>'.
	 * @see NEsysml.Aadl.BusConnection#getBase_Connector()
	 * @see #getBusConnection()
	 * @generated
	 */
	EReference getBusConnection_Base_Connector();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.BusConnection#getRequire <em>Require</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Require</em>'.
	 * @see NEsysml.Aadl.BusConnection#getRequire()
	 * @see #getBusConnection()
	 * @generated
	 */
	EReference getBusConnection_Require();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.BusConnection#getProvide <em>Provide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provide</em>'.
	 * @see NEsysml.Aadl.BusConnection#getProvide()
	 * @see #getBusConnection()
	 * @generated
	 */
	EReference getBusConnection_Provide();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.BusConnection#getInContext <em>In Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Context</em>'.
	 * @see NEsysml.Aadl.BusConnection#getInContext()
	 * @see #getBusConnection()
	 * @generated
	 */
	EReference getBusConnection_InContext();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.BusConnection#getOutContext <em>Out Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out Context</em>'.
	 * @see NEsysml.Aadl.BusConnection#getOutContext()
	 * @see #getBusConnection()
	 * @generated
	 */
	EReference getBusConnection_OutContext();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.BusAccessConnectionEnd <em>Bus Access Connection End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Access Connection End</em>'.
	 * @see NEsysml.Aadl.BusAccessConnectionEnd
	 * @generated
	 */
	EClass getBusAccessConnectionEnd();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.BusAccess <em>Bus Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Access</em>'.
	 * @see NEsysml.Aadl.BusAccess
	 * @generated
	 */
	EClass getBusAccess();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.BusAccess#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specification</em>'.
	 * @see NEsysml.Aadl.BusAccess#getSpecification()
	 * @see #getBusAccess()
	 * @generated
	 */
	EReference getBusAccess_Specification();

	/**
	 * Returns the meta object for the attribute '{@link NEsysml.Aadl.BusAccess#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see NEsysml.Aadl.BusAccess#getDirection()
	 * @see #getBusAccess()
	 * @generated
	 */
	EAttribute getBusAccess_Direction();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.BusFlowSpecification <em>Bus Flow Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Flow Specification</em>'.
	 * @see NEsysml.Aadl.BusFlowSpecification
	 * @generated
	 */
	EClass getBusFlowSpecification();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.BusFlowSpecification#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see NEsysml.Aadl.BusFlowSpecification#getType()
	 * @see #getBusFlowSpecification()
	 * @generated
	 */
	EReference getBusFlowSpecification_Type();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.ComponentImplementation <em>Component Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Implementation</em>'.
	 * @see NEsysml.Aadl.ComponentImplementation
	 * @generated
	 */
	EClass getComponentImplementation();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.ComponentImplementation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see NEsysml.Aadl.ComponentImplementation#getType()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_Type();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.ComponentImplementation#getExtended <em>Extended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extended</em>'.
	 * @see NEsysml.Aadl.ComponentImplementation#getExtended()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_Extended();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.BusClassifier <em>Bus Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Classifier</em>'.
	 * @see NEsysml.Aadl.BusClassifier
	 * @generated
	 */
	EClass getBusClassifier();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.PlatformClassifier <em>Platform Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform Classifier</em>'.
	 * @see NEsysml.Aadl.PlatformClassifier
	 * @generated
	 */
	EClass getPlatformClassifier();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.ModeAvailable <em>Mode Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode Available</em>'.
	 * @see NEsysml.Aadl.ModeAvailable
	 * @generated
	 */
	EClass getModeAvailable();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.ModeAvailable#getOwnedMode <em>Owned Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owned Mode</em>'.
	 * @see NEsysml.Aadl.ModeAvailable#getOwnedMode()
	 * @see #getModeAvailable()
	 * @generated
	 */
	EReference getModeAvailable_OwnedMode();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.ModeStateMachine <em>Mode State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode State Machine</em>'.
	 * @see NEsysml.Aadl.ModeStateMachine
	 * @generated
	 */
	EClass getModeStateMachine();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.ModeStateMachine#getBase_StateMachine <em>Base State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base State Machine</em>'.
	 * @see NEsysml.Aadl.ModeStateMachine#getBase_StateMachine()
	 * @see #getModeStateMachine()
	 * @generated
	 */
	EReference getModeStateMachine_Base_StateMachine();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.Aadl.ModeStateMachine#getOwnedMode <em>Owned Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Mode</em>'.
	 * @see NEsysml.Aadl.ModeStateMachine#getOwnedMode()
	 * @see #getModeStateMachine()
	 * @generated
	 */
	EReference getModeStateMachine_OwnedMode();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.Aadl.ModeStateMachine#getOwnedTransition <em>Owned Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Transition</em>'.
	 * @see NEsysml.Aadl.ModeStateMachine#getOwnedTransition()
	 * @see #getModeStateMachine()
	 * @generated
	 */
	EReference getModeStateMachine_OwnedTransition();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode</em>'.
	 * @see NEsysml.Aadl.Mode
	 * @generated
	 */
	EClass getMode();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.ModeTransition <em>Mode Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode Transition</em>'.
	 * @see NEsysml.Aadl.ModeTransition
	 * @generated
	 */
	EClass getModeTransition();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.ModeTransition#getBase_Transition <em>Base Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Transition</em>'.
	 * @see NEsysml.Aadl.ModeTransition#getBase_Transition()
	 * @see #getModeTransition()
	 * @generated
	 */
	EReference getModeTransition_Base_Transition();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.Aadl.ModeTransition#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trigger</em>'.
	 * @see NEsysml.Aadl.ModeTransition#getTrigger()
	 * @see #getModeTransition()
	 * @generated
	 */
	EReference getModeTransition_Trigger();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.ModeTransition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see NEsysml.Aadl.ModeTransition#getFrom()
	 * @see #getModeTransition()
	 * @generated
	 */
	EReference getModeTransition_From();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.ModeTransition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see NEsysml.Aadl.ModeTransition#getTo()
	 * @see #getModeTransition()
	 * @generated
	 */
	EReference getModeTransition_To();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.ModeTransitionTrigger <em>Mode Transition Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode Transition Trigger</em>'.
	 * @see NEsysml.Aadl.ModeTransitionTrigger
	 * @generated
	 */
	EClass getModeTransitionTrigger();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.ModeTransitionTrigger#getBase_Trigger <em>Base Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Trigger</em>'.
	 * @see NEsysml.Aadl.ModeTransitionTrigger#getBase_Trigger()
	 * @see #getModeTransitionTrigger()
	 * @generated
	 */
	EReference getModeTransitionTrigger_Base_Trigger();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.ModeTransitionTrigger#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see NEsysml.Aadl.ModeTransitionTrigger#getPort()
	 * @see #getModeTransitionTrigger()
	 * @generated
	 */
	EReference getModeTransitionTrigger_Port();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.ModeTransitionTrigger#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see NEsysml.Aadl.ModeTransitionTrigger#getContext()
	 * @see #getModeTransitionTrigger()
	 * @generated
	 */
	EReference getModeTransitionTrigger_Context();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.EventPort <em>Event Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Port</em>'.
	 * @see NEsysml.Aadl.EventPort
	 * @generated
	 */
	EClass getEventPort();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see NEsysml.Aadl.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.Port#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specification</em>'.
	 * @see NEsysml.Aadl.Port#getSpecification()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Specification();

	/**
	 * Returns the meta object for the attribute '{@link NEsysml.Aadl.Port#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see NEsysml.Aadl.Port#getDirection()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Direction();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see NEsysml.Aadl.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.PortDataFlowSpecification <em>Port Data Flow Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Data Flow Specification</em>'.
	 * @see NEsysml.Aadl.PortDataFlowSpecification
	 * @generated
	 */
	EClass getPortDataFlowSpecification();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.PortDataFlowSpecification#getEventGate <em>Event Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Gate</em>'.
	 * @see NEsysml.Aadl.PortDataFlowSpecification#getEventGate()
	 * @see #getPortDataFlowSpecification()
	 * @generated
	 */
	EReference getPortDataFlowSpecification_EventGate();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.DataFlowSpecification <em>Data Flow Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow Specification</em>'.
	 * @see NEsysml.Aadl.DataFlowSpecification
	 * @generated
	 */
	EClass getDataFlowSpecification();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.DataFlowSpecification#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see NEsysml.Aadl.DataFlowSpecification#getType()
	 * @see #getDataFlowSpecification()
	 * @generated
	 */
	EReference getDataFlowSpecification_Type();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.DataClassifier <em>Data Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Classifier</em>'.
	 * @see NEsysml.Aadl.DataClassifier
	 * @generated
	 */
	EClass getDataClassifier();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.SoftwareClassifier <em>Software Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Classifier</em>'.
	 * @see NEsysml.Aadl.SoftwareClassifier
	 * @generated
	 */
	EClass getSoftwareClassifier();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.ModeTransitionTriggerContext <em>Mode Transition Trigger Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode Transition Trigger Context</em>'.
	 * @see NEsysml.Aadl.ModeTransitionTriggerContext
	 * @generated
	 */
	EClass getModeTransitionTriggerContext();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.DeviceClassifier <em>Device Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Classifier</em>'.
	 * @see NEsysml.Aadl.DeviceClassifier
	 * @generated
	 */
	EClass getDeviceClassifier();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.MemoryClassifier <em>Memory Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Classifier</em>'.
	 * @see NEsysml.Aadl.MemoryClassifier
	 * @generated
	 */
	EClass getMemoryClassifier();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.ProcessClassifier <em>Process Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Classifier</em>'.
	 * @see NEsysml.Aadl.ProcessClassifier
	 * @generated
	 */
	EClass getProcessClassifier();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.ProcessorClassifier <em>Processor Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor Classifier</em>'.
	 * @see NEsysml.Aadl.ProcessorClassifier
	 * @generated
	 */
	EClass getProcessorClassifier();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.SubprogramClassifier <em>Subprogram Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subprogram Classifier</em>'.
	 * @see NEsysml.Aadl.SubprogramClassifier
	 * @generated
	 */
	EClass getSubprogramClassifier();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.SubprogramInstance <em>Subprogram Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subprogram Instance</em>'.
	 * @see NEsysml.Aadl.SubprogramInstance
	 * @generated
	 */
	EClass getSubprogramInstance();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.SystemClassifier <em>System Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Classifier</em>'.
	 * @see NEsysml.Aadl.SystemClassifier
	 * @generated
	 */
	EClass getSystemClassifier();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.ThreadClassifier <em>Thread Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thread Classifier</em>'.
	 * @see NEsysml.Aadl.ThreadClassifier
	 * @generated
	 */
	EClass getThreadClassifier();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.BusImplementation <em>Bus Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Implementation</em>'.
	 * @see NEsysml.Aadl.BusImplementation
	 * @generated
	 */
	EClass getBusImplementation();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.PortConnectionContaining <em>Port Connection Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Connection Containing</em>'.
	 * @see NEsysml.Aadl.PortConnectionContaining
	 * @generated
	 */
	EClass getPortConnectionContaining();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.Aadl.PortConnectionContaining#getOwnedPortConnection <em>Owned Port Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Port Connection</em>'.
	 * @see NEsysml.Aadl.PortConnectionContaining#getOwnedPortConnection()
	 * @see #getPortConnectionContaining()
	 * @generated
	 */
	EReference getPortConnectionContaining_OwnedPortConnection();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.PortConnection <em>Port Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Connection</em>'.
	 * @see NEsysml.Aadl.PortConnection
	 * @generated
	 */
	EClass getPortConnection();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.PortConnection#getBase_Connector <em>Base Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Connector</em>'.
	 * @see NEsysml.Aadl.PortConnection#getBase_Connector()
	 * @see #getPortConnection()
	 * @generated
	 */
	EReference getPortConnection_Base_Connector();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.PortConnection#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In</em>'.
	 * @see NEsysml.Aadl.PortConnection#getIn()
	 * @see #getPortConnection()
	 * @generated
	 */
	EReference getPortConnection_In();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.PortConnection#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out</em>'.
	 * @see NEsysml.Aadl.PortConnection#getOut()
	 * @see #getPortConnection()
	 * @generated
	 */
	EReference getPortConnection_Out();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.PortConnection#getInContext <em>In Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Context</em>'.
	 * @see NEsysml.Aadl.PortConnection#getInContext()
	 * @see #getPortConnection()
	 * @generated
	 */
	EReference getPortConnection_InContext();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.PortConnection#getOutContext <em>Out Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out Context</em>'.
	 * @see NEsysml.Aadl.PortConnection#getOutContext()
	 * @see #getPortConnection()
	 * @generated
	 */
	EReference getPortConnection_OutContext();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see NEsysml.Aadl.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.PortAndAccessConectionContext <em>Port And Access Conection Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port And Access Conection Context</em>'.
	 * @see NEsysml.Aadl.PortAndAccessConectionContext
	 * @generated
	 */
	EClass getPortAndAccessConectionContext();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.AnnexContaining <em>Annex Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annex Containing</em>'.
	 * @see NEsysml.Aadl.AnnexContaining
	 * @generated
	 */
	EClass getAnnexContaining();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.Aadl.AnnexContaining#getOwnedAnnex <em>Owned Annex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Annex</em>'.
	 * @see NEsysml.Aadl.AnnexContaining#getOwnedAnnex()
	 * @see #getAnnexContaining()
	 * @generated
	 */
	EReference getAnnexContaining_OwnedAnnex();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.BusType <em>Bus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Type</em>'.
	 * @see NEsysml.Aadl.BusType
	 * @generated
	 */
	EClass getBusType();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.PortContaining <em>Port Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Containing</em>'.
	 * @see NEsysml.Aadl.PortContaining
	 * @generated
	 */
	EClass getPortContaining();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.Aadl.PortContaining#getOwnedport <em>Ownedport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ownedport</em>'.
	 * @see NEsysml.Aadl.PortContaining#getOwnedport()
	 * @see #getPortContaining()
	 * @generated
	 */
	EReference getPortContaining_Ownedport();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.BusAccessContaining <em>Bus Access Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Access Containing</em>'.
	 * @see NEsysml.Aadl.BusAccessContaining
	 * @generated
	 */
	EClass getBusAccessContaining();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.Aadl.BusAccessContaining#getOwnedBusAccess <em>Owned Bus Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Bus Access</em>'.
	 * @see NEsysml.Aadl.BusAccessContaining#getOwnedBusAccess()
	 * @see #getBusAccessContaining()
	 * @generated
	 */
	EReference getBusAccessContaining_OwnedBusAccess();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.DataImplementation <em>Data Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Implementation</em>'.
	 * @see NEsysml.Aadl.DataImplementation
	 * @generated
	 */
	EClass getDataImplementation();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.DataContaining <em>Data Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Containing</em>'.
	 * @see NEsysml.Aadl.DataContaining
	 * @generated
	 */
	EClass getDataContaining();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.Aadl.DataContaining#getOwnedDataSubcomponent <em>Owned Data Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Data Subcomponent</em>'.
	 * @see NEsysml.Aadl.DataContaining#getOwnedDataSubcomponent()
	 * @see #getDataContaining()
	 * @generated
	 */
	EReference getDataContaining_OwnedDataSubcomponent();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.DataSubcomponent <em>Data Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Subcomponent</em>'.
	 * @see NEsysml.Aadl.DataSubcomponent
	 * @generated
	 */
	EClass getDataSubcomponent();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.DataSubcomponent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see NEsysml.Aadl.DataSubcomponent#getType()
	 * @see #getDataSubcomponent()
	 * @generated
	 */
	EReference getDataSubcomponent_Type();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.SubcomponentClassifier <em>Subcomponent Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subcomponent Classifier</em>'.
	 * @see NEsysml.Aadl.SubcomponentClassifier
	 * @generated
	 */
	EClass getSubcomponentClassifier();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.SubcomponentClassifier#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see NEsysml.Aadl.SubcomponentClassifier#getBase_Property()
	 * @see #getSubcomponentClassifier()
	 * @generated
	 */
	EReference getSubcomponentClassifier_Base_Property();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.DataAccessConnectionEnd <em>Data Access Connection End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Access Connection End</em>'.
	 * @see NEsysml.Aadl.DataAccessConnectionEnd
	 * @generated
	 */
	EClass getDataAccessConnectionEnd();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.SubprogramContaining <em>Subprogram Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subprogram Containing</em>'.
	 * @see NEsysml.Aadl.SubprogramContaining
	 * @generated
	 */
	EClass getSubprogramContaining();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.Aadl.SubprogramContaining#getOwnedSubprogramSubcomponent <em>Owned Subprogram Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Subprogram Subcomponent</em>'.
	 * @see NEsysml.Aadl.SubprogramContaining#getOwnedSubprogramSubcomponent()
	 * @see #getSubprogramContaining()
	 * @generated
	 */
	EReference getSubprogramContaining_OwnedSubprogramSubcomponent();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.SubprogramSubcomponent <em>Subprogram Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subprogram Subcomponent</em>'.
	 * @see NEsysml.Aadl.SubprogramSubcomponent
	 * @generated
	 */
	EClass getSubprogramSubcomponent();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.SubprogramSubcomponent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see NEsysml.Aadl.SubprogramSubcomponent#getType()
	 * @see #getSubprogramSubcomponent()
	 * @generated
	 */
	EReference getSubprogramSubcomponent_Type();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.DataAccessConnectionContaining <em>Data Access Connection Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Access Connection Containing</em>'.
	 * @see NEsysml.Aadl.DataAccessConnectionContaining
	 * @generated
	 */
	EClass getDataAccessConnectionContaining();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.Aadl.DataAccessConnectionContaining#getOwnedDataAccessConnection <em>Owned Data Access Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Data Access Connection</em>'.
	 * @see NEsysml.Aadl.DataAccessConnectionContaining#getOwnedDataAccessConnection()
	 * @see #getDataAccessConnectionContaining()
	 * @generated
	 */
	EReference getDataAccessConnectionContaining_OwnedDataAccessConnection();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.DataAccessConnection <em>Data Access Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Access Connection</em>'.
	 * @see NEsysml.Aadl.DataAccessConnection
	 * @generated
	 */
	EClass getDataAccessConnection();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.DataAccessConnection#getRequire <em>Require</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Require</em>'.
	 * @see NEsysml.Aadl.DataAccessConnection#getRequire()
	 * @see #getDataAccessConnection()
	 * @generated
	 */
	EReference getDataAccessConnection_Require();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.DataAccessConnection#getProvide <em>Provide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provide</em>'.
	 * @see NEsysml.Aadl.DataAccessConnection#getProvide()
	 * @see #getDataAccessConnection()
	 * @generated
	 */
	EReference getDataAccessConnection_Provide();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.DataAccessConnection#getInContext <em>In Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Context</em>'.
	 * @see NEsysml.Aadl.DataAccessConnection#getInContext()
	 * @see #getDataAccessConnection()
	 * @generated
	 */
	EReference getDataAccessConnection_InContext();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.DataAccessConnection#getOutContext <em>Out Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out Context</em>'.
	 * @see NEsysml.Aadl.DataAccessConnection#getOutContext()
	 * @see #getDataAccessConnection()
	 * @generated
	 */
	EReference getDataAccessConnection_OutContext();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.SubprogramAccessConnectionContaining <em>Subprogram Access Connection Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subprogram Access Connection Containing</em>'.
	 * @see NEsysml.Aadl.SubprogramAccessConnectionContaining
	 * @generated
	 */
	EClass getSubprogramAccessConnectionContaining();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.Aadl.SubprogramAccessConnectionContaining#getOwnedSubprogramAccessConnection <em>Owned Subprogram Access Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Subprogram Access Connection</em>'.
	 * @see NEsysml.Aadl.SubprogramAccessConnectionContaining#getOwnedSubprogramAccessConnection()
	 * @see #getSubprogramAccessConnectionContaining()
	 * @generated
	 */
	EReference getSubprogramAccessConnectionContaining_OwnedSubprogramAccessConnection();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.SubprogramAccessConnection <em>Subprogram Access Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subprogram Access Connection</em>'.
	 * @see NEsysml.Aadl.SubprogramAccessConnection
	 * @generated
	 */
	EClass getSubprogramAccessConnection();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.SubprogramAccessConnection#getBase_Connector <em>Base Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Connector</em>'.
	 * @see NEsysml.Aadl.SubprogramAccessConnection#getBase_Connector()
	 * @see #getSubprogramAccessConnection()
	 * @generated
	 */
	EReference getSubprogramAccessConnection_Base_Connector();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.SubprogramAccessConnection#getRequire <em>Require</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Require</em>'.
	 * @see NEsysml.Aadl.SubprogramAccessConnection#getRequire()
	 * @see #getSubprogramAccessConnection()
	 * @generated
	 */
	EReference getSubprogramAccessConnection_Require();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.SubprogramAccessConnection#getProvide <em>Provide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provide</em>'.
	 * @see NEsysml.Aadl.SubprogramAccessConnection#getProvide()
	 * @see #getSubprogramAccessConnection()
	 * @generated
	 */
	EReference getSubprogramAccessConnection_Provide();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.SubprogramAccessConnection#getInContext <em>In Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Context</em>'.
	 * @see NEsysml.Aadl.SubprogramAccessConnection#getInContext()
	 * @see #getSubprogramAccessConnection()
	 * @generated
	 */
	EReference getSubprogramAccessConnection_InContext();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.SubprogramAccessConnection#getOutContext <em>Out Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out Context</em>'.
	 * @see NEsysml.Aadl.SubprogramAccessConnection#getOutContext()
	 * @see #getSubprogramAccessConnection()
	 * @generated
	 */
	EReference getSubprogramAccessConnection_OutContext();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.SubprogramAccess <em>Subprogram Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subprogram Access</em>'.
	 * @see NEsysml.Aadl.SubprogramAccess
	 * @generated
	 */
	EClass getSubprogramAccess();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.SubprogramAccess#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specification</em>'.
	 * @see NEsysml.Aadl.SubprogramAccess#getSpecification()
	 * @see #getSubprogramAccess()
	 * @generated
	 */
	EReference getSubprogramAccess_Specification();

	/**
	 * Returns the meta object for the attribute '{@link NEsysml.Aadl.SubprogramAccess#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see NEsysml.Aadl.SubprogramAccess#getDirection()
	 * @see #getSubprogramAccess()
	 * @generated
	 */
	EAttribute getSubprogramAccess_Direction();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.SubprogramAccess#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see NEsysml.Aadl.SubprogramAccess#getType()
	 * @see #getSubprogramAccess()
	 * @generated
	 */
	EReference getSubprogramAccess_Type();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.SubprogramInterface <em>Subprogram Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subprogram Interface</em>'.
	 * @see NEsysml.Aadl.SubprogramInterface
	 * @generated
	 */
	EClass getSubprogramInterface();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.SubprogramSpecification <em>Subprogram Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subprogram Specification</em>'.
	 * @see NEsysml.Aadl.SubprogramSpecification
	 * @generated
	 */
	EClass getSubprogramSpecification();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see NEsysml.Aadl.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.SubprogramAccessContaining <em>Subprogram Access Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subprogram Access Containing</em>'.
	 * @see NEsysml.Aadl.SubprogramAccessContaining
	 * @generated
	 */
	EClass getSubprogramAccessContaining();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.Aadl.SubprogramAccessContaining#getOwnedSubprogramAccess <em>Owned Subprogram Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Subprogram Access</em>'.
	 * @see NEsysml.Aadl.SubprogramAccessContaining#getOwnedSubprogramAccess()
	 * @see #getSubprogramAccessContaining()
	 * @generated
	 */
	EReference getSubprogramAccessContaining_OwnedSubprogramAccess();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.DataAccessContaining <em>Data Access Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Access Containing</em>'.
	 * @see NEsysml.Aadl.DataAccessContaining
	 * @generated
	 */
	EClass getDataAccessContaining();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.Aadl.DataAccessContaining#getOwnedDataAccess <em>Owned Data Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Data Access</em>'.
	 * @see NEsysml.Aadl.DataAccessContaining#getOwnedDataAccess()
	 * @see #getDataAccessContaining()
	 * @generated
	 */
	EReference getDataAccessContaining_OwnedDataAccess();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.DataAccess <em>Data Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Access</em>'.
	 * @see NEsysml.Aadl.DataAccess
	 * @generated
	 */
	EClass getDataAccess();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.DataAccess#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specification</em>'.
	 * @see NEsysml.Aadl.DataAccess#getSpecification()
	 * @see #getDataAccess()
	 * @generated
	 */
	EReference getDataAccess_Specification();

	/**
	 * Returns the meta object for the attribute '{@link NEsysml.Aadl.DataAccess#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see NEsysml.Aadl.DataAccess#getDirection()
	 * @see #getDataAccess()
	 * @generated
	 */
	EAttribute getDataAccess_Direction();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.SubprogramCallContext <em>Subprogram Call Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subprogram Call Context</em>'.
	 * @see NEsysml.Aadl.SubprogramCallContext
	 * @generated
	 */
	EClass getSubprogramCallContext();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.DeviceImplementation <em>Device Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Implementation</em>'.
	 * @see NEsysml.Aadl.DeviceImplementation
	 * @generated
	 */
	EClass getDeviceImplementation();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.BusContaining <em>Bus Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Containing</em>'.
	 * @see NEsysml.Aadl.BusContaining
	 * @generated
	 */
	EClass getBusContaining();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.Aadl.BusContaining#getOwnedBusSubcomponent <em>Owned Bus Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Bus Subcomponent</em>'.
	 * @see NEsysml.Aadl.BusContaining#getOwnedBusSubcomponent()
	 * @see #getBusContaining()
	 * @generated
	 */
	EReference getBusContaining_OwnedBusSubcomponent();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.BusSubcomponent <em>Bus Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Subcomponent</em>'.
	 * @see NEsysml.Aadl.BusSubcomponent
	 * @generated
	 */
	EClass getBusSubcomponent();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.BusSubcomponent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see NEsysml.Aadl.BusSubcomponent#getType()
	 * @see #getBusSubcomponent()
	 * @generated
	 */
	EReference getBusSubcomponent_Type();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.DeviceType <em>Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Type</em>'.
	 * @see NEsysml.Aadl.DeviceType
	 * @generated
	 */
	EClass getDeviceType();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.MemoryImplementation <em>Memory Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Implementation</em>'.
	 * @see NEsysml.Aadl.MemoryImplementation
	 * @generated
	 */
	EClass getMemoryImplementation();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.MemoryContaining <em>Memory Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Containing</em>'.
	 * @see NEsysml.Aadl.MemoryContaining
	 * @generated
	 */
	EClass getMemoryContaining();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.Aadl.MemoryContaining#getOwnedMemorySubcomponent <em>Owned Memory Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Memory Subcomponent</em>'.
	 * @see NEsysml.Aadl.MemoryContaining#getOwnedMemorySubcomponent()
	 * @see #getMemoryContaining()
	 * @generated
	 */
	EReference getMemoryContaining_OwnedMemorySubcomponent();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.MemorySubcomponent <em>Memory Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Subcomponent</em>'.
	 * @see NEsysml.Aadl.MemorySubcomponent
	 * @generated
	 */
	EClass getMemorySubcomponent();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.MemorySubcomponent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see NEsysml.Aadl.MemorySubcomponent#getType()
	 * @see #getMemorySubcomponent()
	 * @generated
	 */
	EReference getMemorySubcomponent_Type();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.MemoryType <em>Memory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Type</em>'.
	 * @see NEsysml.Aadl.MemoryType
	 * @generated
	 */
	EClass getMemoryType();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.ProcessImplementation <em>Process Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Implementation</em>'.
	 * @see NEsysml.Aadl.ProcessImplementation
	 * @generated
	 */
	EClass getProcessImplementation();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.ThreadContaining <em>Thread Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thread Containing</em>'.
	 * @see NEsysml.Aadl.ThreadContaining
	 * @generated
	 */
	EClass getThreadContaining();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.Aadl.ThreadContaining#getOwnedThreadSubcomponent <em>Owned Thread Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Thread Subcomponent</em>'.
	 * @see NEsysml.Aadl.ThreadContaining#getOwnedThreadSubcomponent()
	 * @see #getThreadContaining()
	 * @generated
	 */
	EReference getThreadContaining_OwnedThreadSubcomponent();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.ThreadSubcomponent <em>Thread Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thread Subcomponent</em>'.
	 * @see NEsysml.Aadl.ThreadSubcomponent
	 * @generated
	 */
	EClass getThreadSubcomponent();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.ThreadSubcomponent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see NEsysml.Aadl.ThreadSubcomponent#getType()
	 * @see #getThreadSubcomponent()
	 * @generated
	 */
	EReference getThreadSubcomponent_Type();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.ProcessorImplementation <em>Processor Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor Implementation</em>'.
	 * @see NEsysml.Aadl.ProcessorImplementation
	 * @generated
	 */
	EClass getProcessorImplementation();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.ProcessorType <em>Processor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor Type</em>'.
	 * @see NEsysml.Aadl.ProcessorType
	 * @generated
	 */
	EClass getProcessorType();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.ProcessType <em>Process Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Type</em>'.
	 * @see NEsysml.Aadl.ProcessType
	 * @generated
	 */
	EClass getProcessType();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.SubprogramImplementation <em>Subprogram Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subprogram Implementation</em>'.
	 * @see NEsysml.Aadl.SubprogramImplementation
	 * @generated
	 */
	EClass getSubprogramImplementation();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.SubprogramImplementation#getBase_Activity <em>Base Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Activity</em>'.
	 * @see NEsysml.Aadl.SubprogramImplementation#getBase_Activity()
	 * @see #getSubprogramImplementation()
	 * @generated
	 */
	EReference getSubprogramImplementation_Base_Activity();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.ParameterConnectionContaining <em>Parameter Connection Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Connection Containing</em>'.
	 * @see NEsysml.Aadl.ParameterConnectionContaining
	 * @generated
	 */
	EClass getParameterConnectionContaining();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.Aadl.ParameterConnectionContaining#getOwnedParameterConnection <em>Owned Parameter Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Parameter Connection</em>'.
	 * @see NEsysml.Aadl.ParameterConnectionContaining#getOwnedParameterConnection()
	 * @see #getParameterConnectionContaining()
	 * @generated
	 */
	EReference getParameterConnectionContaining_OwnedParameterConnection();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.ParameterConnection <em>Parameter Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Connection</em>'.
	 * @see NEsysml.Aadl.ParameterConnection
	 * @generated
	 */
	EClass getParameterConnection();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.ParameterConnection#getBase_ObjectFlow <em>Base Object Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Object Flow</em>'.
	 * @see NEsysml.Aadl.ParameterConnection#getBase_ObjectFlow()
	 * @see #getParameterConnection()
	 * @generated
	 */
	EReference getParameterConnection_Base_ObjectFlow();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.ParameterConnection#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In</em>'.
	 * @see NEsysml.Aadl.ParameterConnection#getIn()
	 * @see #getParameterConnection()
	 * @generated
	 */
	EReference getParameterConnection_In();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.ParameterConnection#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out</em>'.
	 * @see NEsysml.Aadl.ParameterConnection#getOut()
	 * @see #getParameterConnection()
	 * @generated
	 */
	EReference getParameterConnection_Out();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.ParameterConnection#getInContext <em>In Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Context</em>'.
	 * @see NEsysml.Aadl.ParameterConnection#getInContext()
	 * @see #getParameterConnection()
	 * @generated
	 */
	EReference getParameterConnection_InContext();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.ParameterConnection#getOutContext <em>Out Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out Context</em>'.
	 * @see NEsysml.Aadl.ParameterConnection#getOutContext()
	 * @see #getParameterConnection()
	 * @generated
	 */
	EReference getParameterConnection_OutContext();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.ParameterConnectionEnd <em>Parameter Connection End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Connection End</em>'.
	 * @see NEsysml.Aadl.ParameterConnectionEnd
	 * @generated
	 */
	EClass getParameterConnectionEnd();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.ParameterConnectionContext <em>Parameter Connection Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Connection Context</em>'.
	 * @see NEsysml.Aadl.ParameterConnectionContext
	 * @generated
	 */
	EClass getParameterConnectionContext();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.CallSequenceDescribable <em>Call Sequence Describable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Sequence Describable</em>'.
	 * @see NEsysml.Aadl.CallSequenceDescribable
	 * @generated
	 */
	EClass getCallSequenceDescribable();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.Aadl.CallSequenceDescribable#getOwnedCallSequence <em>Owned Call Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Call Sequence</em>'.
	 * @see NEsysml.Aadl.CallSequenceDescribable#getOwnedCallSequence()
	 * @see #getCallSequenceDescribable()
	 * @generated
	 */
	EReference getCallSequenceDescribable_OwnedCallSequence();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.CallSequence <em>Call Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Sequence</em>'.
	 * @see NEsysml.Aadl.CallSequence
	 * @generated
	 */
	EClass getCallSequence();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.CallSequence#getBase_Activity <em>Base Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Activity</em>'.
	 * @see NEsysml.Aadl.CallSequence#getBase_Activity()
	 * @see #getCallSequence()
	 * @generated
	 */
	EReference getCallSequence_Base_Activity();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.Aadl.CallSequence#getOwnedSubprogramCall <em>Owned Subprogram Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Subprogram Call</em>'.
	 * @see NEsysml.Aadl.CallSequence#getOwnedSubprogramCall()
	 * @see #getCallSequence()
	 * @generated
	 */
	EReference getCallSequence_OwnedSubprogramCall();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.CallSequence#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First</em>'.
	 * @see NEsysml.Aadl.CallSequence#getFirst()
	 * @see #getCallSequence()
	 * @generated
	 */
	EReference getCallSequence_First();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.SubprogramCall <em>Subprogram Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subprogram Call</em>'.
	 * @see NEsysml.Aadl.SubprogramCall
	 * @generated
	 */
	EClass getSubprogramCall();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.SubprogramCall#getLast <em>Last</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last</em>'.
	 * @see NEsysml.Aadl.SubprogramCall#getLast()
	 * @see #getSubprogramCall()
	 * @generated
	 */
	EReference getSubprogramCall_Last();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.SubprogramCall#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see NEsysml.Aadl.SubprogramCall#getNext()
	 * @see #getSubprogramCall()
	 * @generated
	 */
	EReference getSubprogramCall_Next();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.SubprogramType <em>Subprogram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subprogram Type</em>'.
	 * @see NEsysml.Aadl.SubprogramType
	 * @generated
	 */
	EClass getSubprogramType();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.SubprogramType#getBase_Activity <em>Base Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Activity</em>'.
	 * @see NEsysml.Aadl.SubprogramType#getBase_Activity()
	 * @see #getSubprogramType()
	 * @generated
	 */
	EReference getSubprogramType_Base_Activity();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.ParameterContaining <em>Parameter Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Containing</em>'.
	 * @see NEsysml.Aadl.ParameterContaining
	 * @generated
	 */
	EClass getParameterContaining();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.Aadl.ParameterContaining#getOwnedParameter <em>Owned Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Parameter</em>'.
	 * @see NEsysml.Aadl.ParameterContaining#getOwnedParameter()
	 * @see #getParameterContaining()
	 * @generated
	 */
	EReference getParameterContaining_OwnedParameter();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see NEsysml.Aadl.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link NEsysml.Aadl.Parameter#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see NEsysml.Aadl.Parameter#getDirection()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Direction();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.Parameter#getBase_Parameter <em>Base Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Parameter</em>'.
	 * @see NEsysml.Aadl.Parameter#getBase_Parameter()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Base_Parameter();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see NEsysml.Aadl.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Type();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.SystemImplementation <em>System Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Implementation</em>'.
	 * @see NEsysml.Aadl.SystemImplementation
	 * @generated
	 */
	EClass getSystemImplementation();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.ProcessContaining <em>Process Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Containing</em>'.
	 * @see NEsysml.Aadl.ProcessContaining
	 * @generated
	 */
	EClass getProcessContaining();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.Aadl.ProcessContaining#getOwnedProcessSubcomponent <em>Owned Process Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Process Subcomponent</em>'.
	 * @see NEsysml.Aadl.ProcessContaining#getOwnedProcessSubcomponent()
	 * @see #getProcessContaining()
	 * @generated
	 */
	EReference getProcessContaining_OwnedProcessSubcomponent();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.ProcessSubcomponent <em>Process Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Subcomponent</em>'.
	 * @see NEsysml.Aadl.ProcessSubcomponent
	 * @generated
	 */
	EClass getProcessSubcomponent();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.ProcessSubcomponent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see NEsysml.Aadl.ProcessSubcomponent#getType()
	 * @see #getProcessSubcomponent()
	 * @generated
	 */
	EReference getProcessSubcomponent_Type();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.ProcessorContaining <em>Processor Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor Containing</em>'.
	 * @see NEsysml.Aadl.ProcessorContaining
	 * @generated
	 */
	EClass getProcessorContaining();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.Aadl.ProcessorContaining#getOwnedProcessorSubcomponent <em>Owned Processor Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Processor Subcomponent</em>'.
	 * @see NEsysml.Aadl.ProcessorContaining#getOwnedProcessorSubcomponent()
	 * @see #getProcessorContaining()
	 * @generated
	 */
	EReference getProcessorContaining_OwnedProcessorSubcomponent();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.ProcessorSubcomponent <em>Processor Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor Subcomponent</em>'.
	 * @see NEsysml.Aadl.ProcessorSubcomponent
	 * @generated
	 */
	EClass getProcessorSubcomponent();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.ProcessorSubcomponent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see NEsysml.Aadl.ProcessorSubcomponent#getType()
	 * @see #getProcessorSubcomponent()
	 * @generated
	 */
	EReference getProcessorSubcomponent_Type();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.SystemContaining <em>System Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Containing</em>'.
	 * @see NEsysml.Aadl.SystemContaining
	 * @generated
	 */
	EClass getSystemContaining();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.Aadl.SystemContaining#getOwnedSystemSubcomponent <em>Owned System Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned System Subcomponent</em>'.
	 * @see NEsysml.Aadl.SystemContaining#getOwnedSystemSubcomponent()
	 * @see #getSystemContaining()
	 * @generated
	 */
	EReference getSystemContaining_OwnedSystemSubcomponent();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.SystemSubcomponent <em>System Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Subcomponent</em>'.
	 * @see NEsysml.Aadl.SystemSubcomponent
	 * @generated
	 */
	EClass getSystemSubcomponent();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.SystemSubcomponent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see NEsysml.Aadl.SystemSubcomponent#getType()
	 * @see #getSystemSubcomponent()
	 * @generated
	 */
	EReference getSystemSubcomponent_Type();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.DeviceContaining <em>Device Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Containing</em>'.
	 * @see NEsysml.Aadl.DeviceContaining
	 * @generated
	 */
	EClass getDeviceContaining();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.Aadl.DeviceContaining#getOwnedDeviceSubcomponent <em>Owned Device Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Device Subcomponent</em>'.
	 * @see NEsysml.Aadl.DeviceContaining#getOwnedDeviceSubcomponent()
	 * @see #getDeviceContaining()
	 * @generated
	 */
	EReference getDeviceContaining_OwnedDeviceSubcomponent();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.DeviceSubcomponent <em>Device Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Subcomponent</em>'.
	 * @see NEsysml.Aadl.DeviceSubcomponent
	 * @generated
	 */
	EClass getDeviceSubcomponent();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.DeviceSubcomponent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see NEsysml.Aadl.DeviceSubcomponent#getType()
	 * @see #getDeviceSubcomponent()
	 * @generated
	 */
	EReference getDeviceSubcomponent_Type();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.SystemType <em>System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Type</em>'.
	 * @see NEsysml.Aadl.SystemType
	 * @generated
	 */
	EClass getSystemType();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.ThreadImplementation <em>Thread Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thread Implementation</em>'.
	 * @see NEsysml.Aadl.ThreadImplementation
	 * @generated
	 */
	EClass getThreadImplementation();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.ThreadType <em>Thread Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thread Type</em>'.
	 * @see NEsysml.Aadl.ThreadType
	 * @generated
	 */
	EClass getThreadType();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.DataPort <em>Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Port</em>'.
	 * @see NEsysml.Aadl.DataPort
	 * @generated
	 */
	EClass getDataPort();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.DataPort#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see NEsysml.Aadl.DataPort#getType()
	 * @see #getDataPort()
	 * @generated
	 */
	EReference getDataPort_Type();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.EventDataPort <em>Event Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Data Port</em>'.
	 * @see NEsysml.Aadl.EventDataPort
	 * @generated
	 */
	EClass getEventDataPort();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.NormalMode <em>Normal Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Mode</em>'.
	 * @see NEsysml.Aadl.NormalMode
	 * @generated
	 */
	EClass getNormalMode();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.NormalMode#getBase_State <em>Base State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base State</em>'.
	 * @see NEsysml.Aadl.NormalMode#getBase_State()
	 * @see #getNormalMode()
	 * @generated
	 */
	EReference getNormalMode_Base_State();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.InitialMode <em>Initial Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Mode</em>'.
	 * @see NEsysml.Aadl.InitialMode
	 * @generated
	 */
	EClass getInitialMode();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.InitialMode#getBase_Pseudostate <em>Base Pseudostate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Pseudostate</em>'.
	 * @see NEsysml.Aadl.InitialMode#getBase_Pseudostate()
	 * @see #getInitialMode()
	 * @generated
	 */
	EReference getInitialMode_Base_Pseudostate();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.SubprogramInstanceCall <em>Subprogram Instance Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subprogram Instance Call</em>'.
	 * @see NEsysml.Aadl.SubprogramInstanceCall
	 * @generated
	 */
	EClass getSubprogramInstanceCall();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.SubprogramInstanceCall#getBase_CallBehaviorAction <em>Base Call Behavior Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Call Behavior Action</em>'.
	 * @see NEsysml.Aadl.SubprogramInstanceCall#getBase_CallBehaviorAction()
	 * @see #getSubprogramInstanceCall()
	 * @generated
	 */
	EReference getSubprogramInstanceCall_Base_CallBehaviorAction();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.SubprogramInstanceCall#getSubprogramInstance <em>Subprogram Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subprogram Instance</em>'.
	 * @see NEsysml.Aadl.SubprogramInstanceCall#getSubprogramInstance()
	 * @see #getSubprogramInstanceCall()
	 * @generated
	 */
	EReference getSubprogramInstanceCall_SubprogramInstance();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.SubprogramInterfaceCall <em>Subprogram Interface Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subprogram Interface Call</em>'.
	 * @see NEsysml.Aadl.SubprogramInterfaceCall
	 * @generated
	 */
	EClass getSubprogramInterfaceCall();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.SubprogramInterfaceCall#getBase_CallOperationAction <em>Base Call Operation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Call Operation Action</em>'.
	 * @see NEsysml.Aadl.SubprogramInterfaceCall#getBase_CallOperationAction()
	 * @see #getSubprogramInterfaceCall()
	 * @generated
	 */
	EReference getSubprogramInterfaceCall_Base_CallOperationAction();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.SubprogramInterfaceCall#getSubprogramInterface <em>Subprogram Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subprogram Interface</em>'.
	 * @see NEsysml.Aadl.SubprogramInterfaceCall#getSubprogramInterface()
	 * @see #getSubprogramInterfaceCall()
	 * @generated
	 */
	EReference getSubprogramInterfaceCall_SubprogramInterface();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.SubprogramInterfaceCall#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see NEsysml.Aadl.SubprogramInterfaceCall#getContext()
	 * @see #getSubprogramInterfaceCall()
	 * @generated
	 */
	EReference getSubprogramInterfaceCall_Context();

	/**
	 * Returns the meta object for class '{@link NEsysml.Aadl.AadlModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see NEsysml.Aadl.AadlModel
	 * @generated
	 */
	EClass getAadlModel();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.Aadl.AadlModel#getOwnedClassifier <em>Owned Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Classifier</em>'.
	 * @see NEsysml.Aadl.AadlModel#getOwnedClassifier()
	 * @see #getAadlModel()
	 * @generated
	 */
	EReference getAadlModel_OwnedClassifier();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.Aadl.AadlModel#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see NEsysml.Aadl.AadlModel#getBase_Package()
	 * @see #getAadlModel()
	 * @generated
	 */
	EReference getAadlModel_Base_Package();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.Aadl.AadlModel#getImportEMLibrary <em>Import EM Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Import EM Library</em>'.
	 * @see NEsysml.Aadl.AadlModel#getImportEMLibrary()
	 * @see #getAadlModel()
	 * @generated
	 */
	EReference getAadlModel_ImportEMLibrary();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AadlFactory getAadlFactory();

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
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.ExtensionImpl <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.ExtensionImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getExtension()
		 * @generated
		 */
		EClass EXTENSION = eINSTANCE.getExtension();

		/**
		 * The meta object literal for the '<em><b>Base Generalization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__BASE_GENERALIZATION = eINSTANCE.getExtension_Base_Generalization();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.ImplementationImpl <em>Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.ImplementationImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getImplementation()
		 * @generated
		 */
		EClass IMPLEMENTATION = eINSTANCE.getImplementation();

		/**
		 * The meta object literal for the '<em><b>Base Generalization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION__BASE_GENERALIZATION = eINSTANCE.getImplementation_Base_Generalization();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.ComponentTypeImpl <em>Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.ComponentTypeImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getComponentType()
		 * @generated
		 */
		EClass COMPONENT_TYPE = eINSTANCE.getComponentType();

		/**
		 * The meta object literal for the '<em><b>Extended</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__EXTENDED = eINSTANCE.getComponentType_Extended();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.ComponentClassifierImpl <em>Component Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.ComponentClassifierImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getComponentClassifier()
		 * @generated
		 */
		EClass COMPONENT_CLASSIFIER = eINSTANCE.getComponentClassifier();

		/**
		 * The meta object literal for the '<em><b>Owned Error Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_CLASSIFIER__OWNED_ERROR_MODEL = eINSTANCE.getComponentClassifier_OwnedErrorModel();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.ClassifierImpl <em>Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.ClassifierImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getClassifier()
		 * @generated
		 */
		EClass CLASSIFIER = eINSTANCE.getClassifier();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.AnnexImpl <em>Annex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.AnnexImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getAnnex()
		 * @generated
		 */
		EClass ANNEX = eINSTANCE.getAnnex();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.BusAccessConnectionContainingImpl <em>Bus Access Connection Containing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.BusAccessConnectionContainingImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getBusAccessConnectionContaining()
		 * @generated
		 */
		EClass BUS_ACCESS_CONNECTION_CONTAINING = eINSTANCE.getBusAccessConnectionContaining();

		/**
		 * The meta object literal for the '<em><b>Owned Bus Connection</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_ACCESS_CONNECTION_CONTAINING__OWNED_BUS_CONNECTION = eINSTANCE.getBusAccessConnectionContaining_OwnedBusConnection();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.BusConnectionImpl <em>Bus Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.BusConnectionImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getBusConnection()
		 * @generated
		 */
		EClass BUS_CONNECTION = eINSTANCE.getBusConnection();

		/**
		 * The meta object literal for the '<em><b>Base Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_CONNECTION__BASE_CONNECTOR = eINSTANCE.getBusConnection_Base_Connector();

		/**
		 * The meta object literal for the '<em><b>Require</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_CONNECTION__REQUIRE = eINSTANCE.getBusConnection_Require();

		/**
		 * The meta object literal for the '<em><b>Provide</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_CONNECTION__PROVIDE = eINSTANCE.getBusConnection_Provide();

		/**
		 * The meta object literal for the '<em><b>In Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_CONNECTION__IN_CONTEXT = eINSTANCE.getBusConnection_InContext();

		/**
		 * The meta object literal for the '<em><b>Out Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_CONNECTION__OUT_CONTEXT = eINSTANCE.getBusConnection_OutContext();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.BusAccessConnectionEndImpl <em>Bus Access Connection End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.BusAccessConnectionEndImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getBusAccessConnectionEnd()
		 * @generated
		 */
		EClass BUS_ACCESS_CONNECTION_END = eINSTANCE.getBusAccessConnectionEnd();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.BusAccessImpl <em>Bus Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.BusAccessImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getBusAccess()
		 * @generated
		 */
		EClass BUS_ACCESS = eINSTANCE.getBusAccess();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_ACCESS__SPECIFICATION = eINSTANCE.getBusAccess_Specification();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUS_ACCESS__DIRECTION = eINSTANCE.getBusAccess_Direction();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.BusFlowSpecificationImpl <em>Bus Flow Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.BusFlowSpecificationImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getBusFlowSpecification()
		 * @generated
		 */
		EClass BUS_FLOW_SPECIFICATION = eINSTANCE.getBusFlowSpecification();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_FLOW_SPECIFICATION__TYPE = eINSTANCE.getBusFlowSpecification_Type();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.ComponentImplementationImpl <em>Component Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.ComponentImplementationImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getComponentImplementation()
		 * @generated
		 */
		EClass COMPONENT_IMPLEMENTATION = eINSTANCE.getComponentImplementation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__TYPE = eINSTANCE.getComponentImplementation_Type();

		/**
		 * The meta object literal for the '<em><b>Extended</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__EXTENDED = eINSTANCE.getComponentImplementation_Extended();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.BusClassifierImpl <em>Bus Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.BusClassifierImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getBusClassifier()
		 * @generated
		 */
		EClass BUS_CLASSIFIER = eINSTANCE.getBusClassifier();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.PlatformClassifierImpl <em>Platform Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.PlatformClassifierImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getPlatformClassifier()
		 * @generated
		 */
		EClass PLATFORM_CLASSIFIER = eINSTANCE.getPlatformClassifier();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.ModeAvailableImpl <em>Mode Available</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.ModeAvailableImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getModeAvailable()
		 * @generated
		 */
		EClass MODE_AVAILABLE = eINSTANCE.getModeAvailable();

		/**
		 * The meta object literal for the '<em><b>Owned Mode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_AVAILABLE__OWNED_MODE = eINSTANCE.getModeAvailable_OwnedMode();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.ModeStateMachineImpl <em>Mode State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.ModeStateMachineImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getModeStateMachine()
		 * @generated
		 */
		EClass MODE_STATE_MACHINE = eINSTANCE.getModeStateMachine();

		/**
		 * The meta object literal for the '<em><b>Base State Machine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_STATE_MACHINE__BASE_STATE_MACHINE = eINSTANCE.getModeStateMachine_Base_StateMachine();

		/**
		 * The meta object literal for the '<em><b>Owned Mode</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_STATE_MACHINE__OWNED_MODE = eINSTANCE.getModeStateMachine_OwnedMode();

		/**
		 * The meta object literal for the '<em><b>Owned Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_STATE_MACHINE__OWNED_TRANSITION = eINSTANCE.getModeStateMachine_OwnedTransition();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.ModeImpl <em>Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.ModeImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getMode()
		 * @generated
		 */
		EClass MODE = eINSTANCE.getMode();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.ModeTransitionImpl <em>Mode Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.ModeTransitionImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getModeTransition()
		 * @generated
		 */
		EClass MODE_TRANSITION = eINSTANCE.getModeTransition();

		/**
		 * The meta object literal for the '<em><b>Base Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_TRANSITION__BASE_TRANSITION = eINSTANCE.getModeTransition_Base_Transition();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_TRANSITION__TRIGGER = eINSTANCE.getModeTransition_Trigger();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_TRANSITION__FROM = eINSTANCE.getModeTransition_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_TRANSITION__TO = eINSTANCE.getModeTransition_To();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.ModeTransitionTriggerImpl <em>Mode Transition Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.ModeTransitionTriggerImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getModeTransitionTrigger()
		 * @generated
		 */
		EClass MODE_TRANSITION_TRIGGER = eINSTANCE.getModeTransitionTrigger();

		/**
		 * The meta object literal for the '<em><b>Base Trigger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_TRANSITION_TRIGGER__BASE_TRIGGER = eINSTANCE.getModeTransitionTrigger_Base_Trigger();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_TRANSITION_TRIGGER__PORT = eINSTANCE.getModeTransitionTrigger_Port();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_TRANSITION_TRIGGER__CONTEXT = eINSTANCE.getModeTransitionTrigger_Context();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.EventPortImpl <em>Event Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.EventPortImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getEventPort()
		 * @generated
		 */
		EClass EVENT_PORT = eINSTANCE.getEventPort();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.PortImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__SPECIFICATION = eINSTANCE.getPort_Specification();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__DIRECTION = eINSTANCE.getPort_Direction();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.FeatureImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.PortDataFlowSpecificationImpl <em>Port Data Flow Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.PortDataFlowSpecificationImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getPortDataFlowSpecification()
		 * @generated
		 */
		EClass PORT_DATA_FLOW_SPECIFICATION = eINSTANCE.getPortDataFlowSpecification();

		/**
		 * The meta object literal for the '<em><b>Event Gate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_DATA_FLOW_SPECIFICATION__EVENT_GATE = eINSTANCE.getPortDataFlowSpecification_EventGate();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.DataFlowSpecificationImpl <em>Data Flow Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.DataFlowSpecificationImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getDataFlowSpecification()
		 * @generated
		 */
		EClass DATA_FLOW_SPECIFICATION = eINSTANCE.getDataFlowSpecification();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW_SPECIFICATION__TYPE = eINSTANCE.getDataFlowSpecification_Type();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.DataClassifierImpl <em>Data Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.DataClassifierImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getDataClassifier()
		 * @generated
		 */
		EClass DATA_CLASSIFIER = eINSTANCE.getDataClassifier();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.SoftwareClassifierImpl <em>Software Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.SoftwareClassifierImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSoftwareClassifier()
		 * @generated
		 */
		EClass SOFTWARE_CLASSIFIER = eINSTANCE.getSoftwareClassifier();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.ModeTransitionTriggerContextImpl <em>Mode Transition Trigger Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.ModeTransitionTriggerContextImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getModeTransitionTriggerContext()
		 * @generated
		 */
		EClass MODE_TRANSITION_TRIGGER_CONTEXT = eINSTANCE.getModeTransitionTriggerContext();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.DeviceClassifierImpl <em>Device Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.DeviceClassifierImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getDeviceClassifier()
		 * @generated
		 */
		EClass DEVICE_CLASSIFIER = eINSTANCE.getDeviceClassifier();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.MemoryClassifierImpl <em>Memory Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.MemoryClassifierImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getMemoryClassifier()
		 * @generated
		 */
		EClass MEMORY_CLASSIFIER = eINSTANCE.getMemoryClassifier();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.ProcessClassifierImpl <em>Process Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.ProcessClassifierImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getProcessClassifier()
		 * @generated
		 */
		EClass PROCESS_CLASSIFIER = eINSTANCE.getProcessClassifier();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.ProcessorClassifierImpl <em>Processor Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.ProcessorClassifierImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getProcessorClassifier()
		 * @generated
		 */
		EClass PROCESSOR_CLASSIFIER = eINSTANCE.getProcessorClassifier();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.SubprogramClassifierImpl <em>Subprogram Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.SubprogramClassifierImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSubprogramClassifier()
		 * @generated
		 */
		EClass SUBPROGRAM_CLASSIFIER = eINSTANCE.getSubprogramClassifier();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.SubprogramInstanceImpl <em>Subprogram Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.SubprogramInstanceImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSubprogramInstance()
		 * @generated
		 */
		EClass SUBPROGRAM_INSTANCE = eINSTANCE.getSubprogramInstance();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.SystemClassifierImpl <em>System Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.SystemClassifierImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSystemClassifier()
		 * @generated
		 */
		EClass SYSTEM_CLASSIFIER = eINSTANCE.getSystemClassifier();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.ThreadClassifierImpl <em>Thread Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.ThreadClassifierImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getThreadClassifier()
		 * @generated
		 */
		EClass THREAD_CLASSIFIER = eINSTANCE.getThreadClassifier();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.BusImplementationImpl <em>Bus Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.BusImplementationImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getBusImplementation()
		 * @generated
		 */
		EClass BUS_IMPLEMENTATION = eINSTANCE.getBusImplementation();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.PortConnectionContainingImpl <em>Port Connection Containing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.PortConnectionContainingImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getPortConnectionContaining()
		 * @generated
		 */
		EClass PORT_CONNECTION_CONTAINING = eINSTANCE.getPortConnectionContaining();

		/**
		 * The meta object literal for the '<em><b>Owned Port Connection</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_CONNECTION_CONTAINING__OWNED_PORT_CONNECTION = eINSTANCE.getPortConnectionContaining_OwnedPortConnection();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.PortConnectionImpl <em>Port Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.PortConnectionImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getPortConnection()
		 * @generated
		 */
		EClass PORT_CONNECTION = eINSTANCE.getPortConnection();

		/**
		 * The meta object literal for the '<em><b>Base Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_CONNECTION__BASE_CONNECTOR = eINSTANCE.getPortConnection_Base_Connector();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_CONNECTION__IN = eINSTANCE.getPortConnection_In();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_CONNECTION__OUT = eINSTANCE.getPortConnection_Out();

		/**
		 * The meta object literal for the '<em><b>In Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_CONNECTION__IN_CONTEXT = eINSTANCE.getPortConnection_InContext();

		/**
		 * The meta object literal for the '<em><b>Out Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_CONNECTION__OUT_CONTEXT = eINSTANCE.getPortConnection_OutContext();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.ConnectionImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.PortAndAccessConectionContextImpl <em>Port And Access Conection Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.PortAndAccessConectionContextImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getPortAndAccessConectionContext()
		 * @generated
		 */
		EClass PORT_AND_ACCESS_CONECTION_CONTEXT = eINSTANCE.getPortAndAccessConectionContext();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.AnnexContainingImpl <em>Annex Containing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.AnnexContainingImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getAnnexContaining()
		 * @generated
		 */
		EClass ANNEX_CONTAINING = eINSTANCE.getAnnexContaining();

		/**
		 * The meta object literal for the '<em><b>Owned Annex</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNEX_CONTAINING__OWNED_ANNEX = eINSTANCE.getAnnexContaining_OwnedAnnex();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.BusTypeImpl <em>Bus Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.BusTypeImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getBusType()
		 * @generated
		 */
		EClass BUS_TYPE = eINSTANCE.getBusType();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.PortContainingImpl <em>Port Containing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.PortContainingImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getPortContaining()
		 * @generated
		 */
		EClass PORT_CONTAINING = eINSTANCE.getPortContaining();

		/**
		 * The meta object literal for the '<em><b>Ownedport</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_CONTAINING__OWNEDPORT = eINSTANCE.getPortContaining_Ownedport();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.BusAccessContainingImpl <em>Bus Access Containing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.BusAccessContainingImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getBusAccessContaining()
		 * @generated
		 */
		EClass BUS_ACCESS_CONTAINING = eINSTANCE.getBusAccessContaining();

		/**
		 * The meta object literal for the '<em><b>Owned Bus Access</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_ACCESS_CONTAINING__OWNED_BUS_ACCESS = eINSTANCE.getBusAccessContaining_OwnedBusAccess();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.DataImplementationImpl <em>Data Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.DataImplementationImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getDataImplementation()
		 * @generated
		 */
		EClass DATA_IMPLEMENTATION = eINSTANCE.getDataImplementation();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.DataContainingImpl <em>Data Containing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.DataContainingImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getDataContaining()
		 * @generated
		 */
		EClass DATA_CONTAINING = eINSTANCE.getDataContaining();

		/**
		 * The meta object literal for the '<em><b>Owned Data Subcomponent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONTAINING__OWNED_DATA_SUBCOMPONENT = eINSTANCE.getDataContaining_OwnedDataSubcomponent();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.DataSubcomponentImpl <em>Data Subcomponent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.DataSubcomponentImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getDataSubcomponent()
		 * @generated
		 */
		EClass DATA_SUBCOMPONENT = eINSTANCE.getDataSubcomponent();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SUBCOMPONENT__TYPE = eINSTANCE.getDataSubcomponent_Type();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.SubcomponentClassifierImpl <em>Subcomponent Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.SubcomponentClassifierImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSubcomponentClassifier()
		 * @generated
		 */
		EClass SUBCOMPONENT_CLASSIFIER = eINSTANCE.getSubcomponentClassifier();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBCOMPONENT_CLASSIFIER__BASE_PROPERTY = eINSTANCE.getSubcomponentClassifier_Base_Property();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.DataAccessConnectionEndImpl <em>Data Access Connection End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.DataAccessConnectionEndImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getDataAccessConnectionEnd()
		 * @generated
		 */
		EClass DATA_ACCESS_CONNECTION_END = eINSTANCE.getDataAccessConnectionEnd();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.SubprogramContainingImpl <em>Subprogram Containing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.SubprogramContainingImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSubprogramContaining()
		 * @generated
		 */
		EClass SUBPROGRAM_CONTAINING = eINSTANCE.getSubprogramContaining();

		/**
		 * The meta object literal for the '<em><b>Owned Subprogram Subcomponent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPROGRAM_CONTAINING__OWNED_SUBPROGRAM_SUBCOMPONENT = eINSTANCE.getSubprogramContaining_OwnedSubprogramSubcomponent();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.SubprogramSubcomponentImpl <em>Subprogram Subcomponent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.SubprogramSubcomponentImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSubprogramSubcomponent()
		 * @generated
		 */
		EClass SUBPROGRAM_SUBCOMPONENT = eINSTANCE.getSubprogramSubcomponent();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPROGRAM_SUBCOMPONENT__TYPE = eINSTANCE.getSubprogramSubcomponent_Type();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.DataAccessConnectionContainingImpl <em>Data Access Connection Containing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.DataAccessConnectionContainingImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getDataAccessConnectionContaining()
		 * @generated
		 */
		EClass DATA_ACCESS_CONNECTION_CONTAINING = eINSTANCE.getDataAccessConnectionContaining();

		/**
		 * The meta object literal for the '<em><b>Owned Data Access Connection</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ACCESS_CONNECTION_CONTAINING__OWNED_DATA_ACCESS_CONNECTION = eINSTANCE.getDataAccessConnectionContaining_OwnedDataAccessConnection();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.DataAccessConnectionImpl <em>Data Access Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.DataAccessConnectionImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getDataAccessConnection()
		 * @generated
		 */
		EClass DATA_ACCESS_CONNECTION = eINSTANCE.getDataAccessConnection();

		/**
		 * The meta object literal for the '<em><b>Require</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ACCESS_CONNECTION__REQUIRE = eINSTANCE.getDataAccessConnection_Require();

		/**
		 * The meta object literal for the '<em><b>Provide</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ACCESS_CONNECTION__PROVIDE = eINSTANCE.getDataAccessConnection_Provide();

		/**
		 * The meta object literal for the '<em><b>In Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ACCESS_CONNECTION__IN_CONTEXT = eINSTANCE.getDataAccessConnection_InContext();

		/**
		 * The meta object literal for the '<em><b>Out Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ACCESS_CONNECTION__OUT_CONTEXT = eINSTANCE.getDataAccessConnection_OutContext();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.SubprogramAccessConnectionContainingImpl <em>Subprogram Access Connection Containing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.SubprogramAccessConnectionContainingImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSubprogramAccessConnectionContaining()
		 * @generated
		 */
		EClass SUBPROGRAM_ACCESS_CONNECTION_CONTAINING = eINSTANCE.getSubprogramAccessConnectionContaining();

		/**
		 * The meta object literal for the '<em><b>Owned Subprogram Access Connection</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPROGRAM_ACCESS_CONNECTION_CONTAINING__OWNED_SUBPROGRAM_ACCESS_CONNECTION = eINSTANCE.getSubprogramAccessConnectionContaining_OwnedSubprogramAccessConnection();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.SubprogramAccessConnectionImpl <em>Subprogram Access Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.SubprogramAccessConnectionImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSubprogramAccessConnection()
		 * @generated
		 */
		EClass SUBPROGRAM_ACCESS_CONNECTION = eINSTANCE.getSubprogramAccessConnection();

		/**
		 * The meta object literal for the '<em><b>Base Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPROGRAM_ACCESS_CONNECTION__BASE_CONNECTOR = eINSTANCE.getSubprogramAccessConnection_Base_Connector();

		/**
		 * The meta object literal for the '<em><b>Require</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPROGRAM_ACCESS_CONNECTION__REQUIRE = eINSTANCE.getSubprogramAccessConnection_Require();

		/**
		 * The meta object literal for the '<em><b>Provide</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPROGRAM_ACCESS_CONNECTION__PROVIDE = eINSTANCE.getSubprogramAccessConnection_Provide();

		/**
		 * The meta object literal for the '<em><b>In Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPROGRAM_ACCESS_CONNECTION__IN_CONTEXT = eINSTANCE.getSubprogramAccessConnection_InContext();

		/**
		 * The meta object literal for the '<em><b>Out Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPROGRAM_ACCESS_CONNECTION__OUT_CONTEXT = eINSTANCE.getSubprogramAccessConnection_OutContext();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.SubprogramAccessImpl <em>Subprogram Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.SubprogramAccessImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSubprogramAccess()
		 * @generated
		 */
		EClass SUBPROGRAM_ACCESS = eINSTANCE.getSubprogramAccess();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPROGRAM_ACCESS__SPECIFICATION = eINSTANCE.getSubprogramAccess_Specification();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBPROGRAM_ACCESS__DIRECTION = eINSTANCE.getSubprogramAccess_Direction();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPROGRAM_ACCESS__TYPE = eINSTANCE.getSubprogramAccess_Type();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.SubprogramInterfaceImpl <em>Subprogram Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.SubprogramInterfaceImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSubprogramInterface()
		 * @generated
		 */
		EClass SUBPROGRAM_INTERFACE = eINSTANCE.getSubprogramInterface();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.SubprogramSpecificationImpl <em>Subprogram Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.SubprogramSpecificationImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSubprogramSpecification()
		 * @generated
		 */
		EClass SUBPROGRAM_SPECIFICATION = eINSTANCE.getSubprogramSpecification();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.DataTypeImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.SubprogramAccessContainingImpl <em>Subprogram Access Containing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.SubprogramAccessContainingImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSubprogramAccessContaining()
		 * @generated
		 */
		EClass SUBPROGRAM_ACCESS_CONTAINING = eINSTANCE.getSubprogramAccessContaining();

		/**
		 * The meta object literal for the '<em><b>Owned Subprogram Access</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPROGRAM_ACCESS_CONTAINING__OWNED_SUBPROGRAM_ACCESS = eINSTANCE.getSubprogramAccessContaining_OwnedSubprogramAccess();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.DataAccessContainingImpl <em>Data Access Containing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.DataAccessContainingImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getDataAccessContaining()
		 * @generated
		 */
		EClass DATA_ACCESS_CONTAINING = eINSTANCE.getDataAccessContaining();

		/**
		 * The meta object literal for the '<em><b>Owned Data Access</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ACCESS_CONTAINING__OWNED_DATA_ACCESS = eINSTANCE.getDataAccessContaining_OwnedDataAccess();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.DataAccessImpl <em>Data Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.DataAccessImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getDataAccess()
		 * @generated
		 */
		EClass DATA_ACCESS = eINSTANCE.getDataAccess();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ACCESS__SPECIFICATION = eINSTANCE.getDataAccess_Specification();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ACCESS__DIRECTION = eINSTANCE.getDataAccess_Direction();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.SubprogramCallContextImpl <em>Subprogram Call Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.SubprogramCallContextImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSubprogramCallContext()
		 * @generated
		 */
		EClass SUBPROGRAM_CALL_CONTEXT = eINSTANCE.getSubprogramCallContext();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.DeviceImplementationImpl <em>Device Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.DeviceImplementationImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getDeviceImplementation()
		 * @generated
		 */
		EClass DEVICE_IMPLEMENTATION = eINSTANCE.getDeviceImplementation();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.BusContainingImpl <em>Bus Containing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.BusContainingImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getBusContaining()
		 * @generated
		 */
		EClass BUS_CONTAINING = eINSTANCE.getBusContaining();

		/**
		 * The meta object literal for the '<em><b>Owned Bus Subcomponent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_CONTAINING__OWNED_BUS_SUBCOMPONENT = eINSTANCE.getBusContaining_OwnedBusSubcomponent();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.BusSubcomponentImpl <em>Bus Subcomponent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.BusSubcomponentImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getBusSubcomponent()
		 * @generated
		 */
		EClass BUS_SUBCOMPONENT = eINSTANCE.getBusSubcomponent();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_SUBCOMPONENT__TYPE = eINSTANCE.getBusSubcomponent_Type();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.DeviceTypeImpl <em>Device Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.DeviceTypeImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getDeviceType()
		 * @generated
		 */
		EClass DEVICE_TYPE = eINSTANCE.getDeviceType();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.MemoryImplementationImpl <em>Memory Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.MemoryImplementationImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getMemoryImplementation()
		 * @generated
		 */
		EClass MEMORY_IMPLEMENTATION = eINSTANCE.getMemoryImplementation();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.MemoryContainingImpl <em>Memory Containing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.MemoryContainingImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getMemoryContaining()
		 * @generated
		 */
		EClass MEMORY_CONTAINING = eINSTANCE.getMemoryContaining();

		/**
		 * The meta object literal for the '<em><b>Owned Memory Subcomponent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_CONTAINING__OWNED_MEMORY_SUBCOMPONENT = eINSTANCE.getMemoryContaining_OwnedMemorySubcomponent();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.MemorySubcomponentImpl <em>Memory Subcomponent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.MemorySubcomponentImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getMemorySubcomponent()
		 * @generated
		 */
		EClass MEMORY_SUBCOMPONENT = eINSTANCE.getMemorySubcomponent();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_SUBCOMPONENT__TYPE = eINSTANCE.getMemorySubcomponent_Type();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.MemoryTypeImpl <em>Memory Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.MemoryTypeImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getMemoryType()
		 * @generated
		 */
		EClass MEMORY_TYPE = eINSTANCE.getMemoryType();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.ProcessImplementationImpl <em>Process Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.ProcessImplementationImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getProcessImplementation()
		 * @generated
		 */
		EClass PROCESS_IMPLEMENTATION = eINSTANCE.getProcessImplementation();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.ThreadContainingImpl <em>Thread Containing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.ThreadContainingImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getThreadContaining()
		 * @generated
		 */
		EClass THREAD_CONTAINING = eINSTANCE.getThreadContaining();

		/**
		 * The meta object literal for the '<em><b>Owned Thread Subcomponent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAD_CONTAINING__OWNED_THREAD_SUBCOMPONENT = eINSTANCE.getThreadContaining_OwnedThreadSubcomponent();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.ThreadSubcomponentImpl <em>Thread Subcomponent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.ThreadSubcomponentImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getThreadSubcomponent()
		 * @generated
		 */
		EClass THREAD_SUBCOMPONENT = eINSTANCE.getThreadSubcomponent();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAD_SUBCOMPONENT__TYPE = eINSTANCE.getThreadSubcomponent_Type();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.ProcessorImplementationImpl <em>Processor Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.ProcessorImplementationImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getProcessorImplementation()
		 * @generated
		 */
		EClass PROCESSOR_IMPLEMENTATION = eINSTANCE.getProcessorImplementation();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.ProcessorTypeImpl <em>Processor Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.ProcessorTypeImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getProcessorType()
		 * @generated
		 */
		EClass PROCESSOR_TYPE = eINSTANCE.getProcessorType();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.ProcessTypeImpl <em>Process Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.ProcessTypeImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getProcessType()
		 * @generated
		 */
		EClass PROCESS_TYPE = eINSTANCE.getProcessType();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.SubprogramImplementationImpl <em>Subprogram Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.SubprogramImplementationImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSubprogramImplementation()
		 * @generated
		 */
		EClass SUBPROGRAM_IMPLEMENTATION = eINSTANCE.getSubprogramImplementation();

		/**
		 * The meta object literal for the '<em><b>Base Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPROGRAM_IMPLEMENTATION__BASE_ACTIVITY = eINSTANCE.getSubprogramImplementation_Base_Activity();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.ParameterConnectionContainingImpl <em>Parameter Connection Containing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.ParameterConnectionContainingImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getParameterConnectionContaining()
		 * @generated
		 */
		EClass PARAMETER_CONNECTION_CONTAINING = eINSTANCE.getParameterConnectionContaining();

		/**
		 * The meta object literal for the '<em><b>Owned Parameter Connection</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_CONNECTION_CONTAINING__OWNED_PARAMETER_CONNECTION = eINSTANCE.getParameterConnectionContaining_OwnedParameterConnection();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.ParameterConnectionImpl <em>Parameter Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.ParameterConnectionImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getParameterConnection()
		 * @generated
		 */
		EClass PARAMETER_CONNECTION = eINSTANCE.getParameterConnection();

		/**
		 * The meta object literal for the '<em><b>Base Object Flow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_CONNECTION__BASE_OBJECT_FLOW = eINSTANCE.getParameterConnection_Base_ObjectFlow();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_CONNECTION__IN = eINSTANCE.getParameterConnection_In();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_CONNECTION__OUT = eINSTANCE.getParameterConnection_Out();

		/**
		 * The meta object literal for the '<em><b>In Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_CONNECTION__IN_CONTEXT = eINSTANCE.getParameterConnection_InContext();

		/**
		 * The meta object literal for the '<em><b>Out Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_CONNECTION__OUT_CONTEXT = eINSTANCE.getParameterConnection_OutContext();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.ParameterConnectionEndImpl <em>Parameter Connection End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.ParameterConnectionEndImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getParameterConnectionEnd()
		 * @generated
		 */
		EClass PARAMETER_CONNECTION_END = eINSTANCE.getParameterConnectionEnd();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.ParameterConnectionContextImpl <em>Parameter Connection Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.ParameterConnectionContextImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getParameterConnectionContext()
		 * @generated
		 */
		EClass PARAMETER_CONNECTION_CONTEXT = eINSTANCE.getParameterConnectionContext();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.CallSequenceDescribableImpl <em>Call Sequence Describable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.CallSequenceDescribableImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getCallSequenceDescribable()
		 * @generated
		 */
		EClass CALL_SEQUENCE_DESCRIBABLE = eINSTANCE.getCallSequenceDescribable();

		/**
		 * The meta object literal for the '<em><b>Owned Call Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_SEQUENCE_DESCRIBABLE__OWNED_CALL_SEQUENCE = eINSTANCE.getCallSequenceDescribable_OwnedCallSequence();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.CallSequenceImpl <em>Call Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.CallSequenceImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getCallSequence()
		 * @generated
		 */
		EClass CALL_SEQUENCE = eINSTANCE.getCallSequence();

		/**
		 * The meta object literal for the '<em><b>Base Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_SEQUENCE__BASE_ACTIVITY = eINSTANCE.getCallSequence_Base_Activity();

		/**
		 * The meta object literal for the '<em><b>Owned Subprogram Call</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_SEQUENCE__OWNED_SUBPROGRAM_CALL = eINSTANCE.getCallSequence_OwnedSubprogramCall();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_SEQUENCE__FIRST = eINSTANCE.getCallSequence_First();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.SubprogramCallImpl <em>Subprogram Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.SubprogramCallImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSubprogramCall()
		 * @generated
		 */
		EClass SUBPROGRAM_CALL = eINSTANCE.getSubprogramCall();

		/**
		 * The meta object literal for the '<em><b>Last</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPROGRAM_CALL__LAST = eINSTANCE.getSubprogramCall_Last();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPROGRAM_CALL__NEXT = eINSTANCE.getSubprogramCall_Next();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.SubprogramTypeImpl <em>Subprogram Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.SubprogramTypeImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSubprogramType()
		 * @generated
		 */
		EClass SUBPROGRAM_TYPE = eINSTANCE.getSubprogramType();

		/**
		 * The meta object literal for the '<em><b>Base Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPROGRAM_TYPE__BASE_ACTIVITY = eINSTANCE.getSubprogramType_Base_Activity();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.ParameterContainingImpl <em>Parameter Containing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.ParameterContainingImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getParameterContaining()
		 * @generated
		 */
		EClass PARAMETER_CONTAINING = eINSTANCE.getParameterContaining();

		/**
		 * The meta object literal for the '<em><b>Owned Parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_CONTAINING__OWNED_PARAMETER = eINSTANCE.getParameterContaining_OwnedParameter();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.ParameterImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DIRECTION = eINSTANCE.getParameter_Direction();

		/**
		 * The meta object literal for the '<em><b>Base Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__BASE_PARAMETER = eINSTANCE.getParameter_Base_Parameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.SystemImplementationImpl <em>System Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.SystemImplementationImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSystemImplementation()
		 * @generated
		 */
		EClass SYSTEM_IMPLEMENTATION = eINSTANCE.getSystemImplementation();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.ProcessContainingImpl <em>Process Containing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.ProcessContainingImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getProcessContaining()
		 * @generated
		 */
		EClass PROCESS_CONTAINING = eINSTANCE.getProcessContaining();

		/**
		 * The meta object literal for the '<em><b>Owned Process Subcomponent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_CONTAINING__OWNED_PROCESS_SUBCOMPONENT = eINSTANCE.getProcessContaining_OwnedProcessSubcomponent();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.ProcessSubcomponentImpl <em>Process Subcomponent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.ProcessSubcomponentImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getProcessSubcomponent()
		 * @generated
		 */
		EClass PROCESS_SUBCOMPONENT = eINSTANCE.getProcessSubcomponent();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_SUBCOMPONENT__TYPE = eINSTANCE.getProcessSubcomponent_Type();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.ProcessorContainingImpl <em>Processor Containing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.ProcessorContainingImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getProcessorContaining()
		 * @generated
		 */
		EClass PROCESSOR_CONTAINING = eINSTANCE.getProcessorContaining();

		/**
		 * The meta object literal for the '<em><b>Owned Processor Subcomponent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR_CONTAINING__OWNED_PROCESSOR_SUBCOMPONENT = eINSTANCE.getProcessorContaining_OwnedProcessorSubcomponent();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.ProcessorSubcomponentImpl <em>Processor Subcomponent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.ProcessorSubcomponentImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getProcessorSubcomponent()
		 * @generated
		 */
		EClass PROCESSOR_SUBCOMPONENT = eINSTANCE.getProcessorSubcomponent();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR_SUBCOMPONENT__TYPE = eINSTANCE.getProcessorSubcomponent_Type();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.SystemContainingImpl <em>System Containing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.SystemContainingImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSystemContaining()
		 * @generated
		 */
		EClass SYSTEM_CONTAINING = eINSTANCE.getSystemContaining();

		/**
		 * The meta object literal for the '<em><b>Owned System Subcomponent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_CONTAINING__OWNED_SYSTEM_SUBCOMPONENT = eINSTANCE.getSystemContaining_OwnedSystemSubcomponent();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.SystemSubcomponentImpl <em>System Subcomponent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.SystemSubcomponentImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSystemSubcomponent()
		 * @generated
		 */
		EClass SYSTEM_SUBCOMPONENT = eINSTANCE.getSystemSubcomponent();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_SUBCOMPONENT__TYPE = eINSTANCE.getSystemSubcomponent_Type();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.DeviceContainingImpl <em>Device Containing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.DeviceContainingImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getDeviceContaining()
		 * @generated
		 */
		EClass DEVICE_CONTAINING = eINSTANCE.getDeviceContaining();

		/**
		 * The meta object literal for the '<em><b>Owned Device Subcomponent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_CONTAINING__OWNED_DEVICE_SUBCOMPONENT = eINSTANCE.getDeviceContaining_OwnedDeviceSubcomponent();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.DeviceSubcomponentImpl <em>Device Subcomponent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.DeviceSubcomponentImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getDeviceSubcomponent()
		 * @generated
		 */
		EClass DEVICE_SUBCOMPONENT = eINSTANCE.getDeviceSubcomponent();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_SUBCOMPONENT__TYPE = eINSTANCE.getDeviceSubcomponent_Type();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.SystemTypeImpl <em>System Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.SystemTypeImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSystemType()
		 * @generated
		 */
		EClass SYSTEM_TYPE = eINSTANCE.getSystemType();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.ThreadImplementationImpl <em>Thread Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.ThreadImplementationImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getThreadImplementation()
		 * @generated
		 */
		EClass THREAD_IMPLEMENTATION = eINSTANCE.getThreadImplementation();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.ThreadTypeImpl <em>Thread Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.ThreadTypeImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getThreadType()
		 * @generated
		 */
		EClass THREAD_TYPE = eINSTANCE.getThreadType();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.DataPortImpl <em>Data Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.DataPortImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getDataPort()
		 * @generated
		 */
		EClass DATA_PORT = eINSTANCE.getDataPort();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PORT__TYPE = eINSTANCE.getDataPort_Type();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.EventDataPortImpl <em>Event Data Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.EventDataPortImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getEventDataPort()
		 * @generated
		 */
		EClass EVENT_DATA_PORT = eINSTANCE.getEventDataPort();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.NormalModeImpl <em>Normal Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.NormalModeImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getNormalMode()
		 * @generated
		 */
		EClass NORMAL_MODE = eINSTANCE.getNormalMode();

		/**
		 * The meta object literal for the '<em><b>Base State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORMAL_MODE__BASE_STATE = eINSTANCE.getNormalMode_Base_State();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.InitialModeImpl <em>Initial Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.InitialModeImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getInitialMode()
		 * @generated
		 */
		EClass INITIAL_MODE = eINSTANCE.getInitialMode();

		/**
		 * The meta object literal for the '<em><b>Base Pseudostate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODE__BASE_PSEUDOSTATE = eINSTANCE.getInitialMode_Base_Pseudostate();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.SubprogramInstanceCallImpl <em>Subprogram Instance Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.SubprogramInstanceCallImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSubprogramInstanceCall()
		 * @generated
		 */
		EClass SUBPROGRAM_INSTANCE_CALL = eINSTANCE.getSubprogramInstanceCall();

		/**
		 * The meta object literal for the '<em><b>Base Call Behavior Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPROGRAM_INSTANCE_CALL__BASE_CALL_BEHAVIOR_ACTION = eINSTANCE.getSubprogramInstanceCall_Base_CallBehaviorAction();

		/**
		 * The meta object literal for the '<em><b>Subprogram Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPROGRAM_INSTANCE_CALL__SUBPROGRAM_INSTANCE = eINSTANCE.getSubprogramInstanceCall_SubprogramInstance();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.SubprogramInterfaceCallImpl <em>Subprogram Interface Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.SubprogramInterfaceCallImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getSubprogramInterfaceCall()
		 * @generated
		 */
		EClass SUBPROGRAM_INTERFACE_CALL = eINSTANCE.getSubprogramInterfaceCall();

		/**
		 * The meta object literal for the '<em><b>Base Call Operation Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPROGRAM_INTERFACE_CALL__BASE_CALL_OPERATION_ACTION = eINSTANCE.getSubprogramInterfaceCall_Base_CallOperationAction();

		/**
		 * The meta object literal for the '<em><b>Subprogram Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPROGRAM_INTERFACE_CALL__SUBPROGRAM_INTERFACE = eINSTANCE.getSubprogramInterfaceCall_SubprogramInterface();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPROGRAM_INTERFACE_CALL__CONTEXT = eINSTANCE.getSubprogramInterfaceCall_Context();

		/**
		 * The meta object literal for the '{@link NEsysml.Aadl.impl.AadlModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Aadl.impl.AadlModelImpl
		 * @see NEsysml.Aadl.impl.AadlPackageImpl#getAadlModel()
		 * @generated
		 */
		EClass AADL_MODEL = eINSTANCE.getAadlModel();

		/**
		 * The meta object literal for the '<em><b>Owned Classifier</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AADL_MODEL__OWNED_CLASSIFIER = eINSTANCE.getAadlModel_OwnedClassifier();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AADL_MODEL__BASE_PACKAGE = eINSTANCE.getAadlModel_Base_Package();

		/**
		 * The meta object literal for the '<em><b>Import EM Library</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AADL_MODEL__IMPORT_EM_LIBRARY = eINSTANCE.getAadlModel_ImportEMLibrary();

	}

} //AadlPackage
