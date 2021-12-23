/**
 */
package NEsysml.BA;

import NEsysml.Aadl.AadlPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see NEsysml.BA.BAFactory
 * @model kind="package"
 * @generated
 */
public interface BAPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BA";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://smbody/esysml/2.0/ESysML/BA";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "NEsysml.BA";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BAPackage eINSTANCE = NEsysml.BA.impl.BAPackageImpl.init();

	/**
	 * The meta object id for the '{@link NEsysml.BA.impl.BehaviorStateMachineImpl <em>Behavior State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.BA.impl.BehaviorStateMachineImpl
	 * @see NEsysml.BA.impl.BAPackageImpl#getBehaviorStateMachine()
	 * @generated
	 */
	int BEHAVIOR_STATE_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Base State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_STATE_MACHINE__BASE_STATE_MACHINE = AadlPackage.ANNEX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_STATE_MACHINE__OWNED_STATE = AadlPackage.ANNEX_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_STATE_MACHINE__OWNED_TRANSITION = AadlPackage.ANNEX_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_STATE_MACHINE__OWNED_VARIABLE = AadlPackage.ANNEX_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Behavior State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_STATE_MACHINE_FEATURE_COUNT = AadlPackage.ANNEX_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Behavior State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_STATE_MACHINE_OPERATION_COUNT = AadlPackage.ANNEX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NEsysml.BA.impl.BehaviorStateImpl <em>Behavior State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.BA.impl.BehaviorStateImpl
	 * @see NEsysml.BA.impl.BAPackageImpl#getBehaviorState()
	 * @generated
	 */
	int BEHAVIOR_STATE = 1;

	/**
	 * The feature id for the '<em><b>Base State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_STATE__BASE_STATE = 0;

	/**
	 * The feature id for the '<em><b>Is Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_STATE__IS_COMPLETE = 1;

	/**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_STATE__IS_INITIAL = 2;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_STATE__IS_FINAL = 3;

	/**
	 * The number of structural features of the '<em>Behavior State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_STATE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Behavior State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link NEsysml.BA.impl.BehaviorStateTransitionImpl <em>Behavior State Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.BA.impl.BehaviorStateTransitionImpl
	 * @see NEsysml.BA.impl.BAPackageImpl#getBehaviorStateTransition()
	 * @generated
	 */
	int BEHAVIOR_STATE_TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Base Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_STATE_TRANSITION__BASE_TRANSITION = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_STATE_TRANSITION__FROM = 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_STATE_TRANSITION__TO = 2;

	/**
	 * The feature id for the '<em><b>Owned Action Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_STATE_TRANSITION__OWNED_ACTION_BLOCK = 3;

	/**
	 * The feature id for the '<em><b>Owned Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_STATE_TRANSITION__OWNED_CONDITION = 4;

	/**
	 * The number of structural features of the '<em>Behavior State Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_STATE_TRANSITION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Behavior State Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_STATE_TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link NEsysml.BA.impl.BehaviorActionBlockImpl <em>Behavior Action Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.BA.impl.BehaviorActionBlockImpl
	 * @see NEsysml.BA.impl.BAPackageImpl#getBehaviorActionBlock()
	 * @generated
	 */
	int BEHAVIOR_ACTION_BLOCK = 3;

	/**
	 * The feature id for the '<em><b>Base Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ACTION_BLOCK__BASE_ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Owned Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ACTION_BLOCK__OWNED_ACTION = 1;

	/**
	 * The feature id for the '<em><b>First Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ACTION_BLOCK__FIRST_ACTION = 2;

	/**
	 * The number of structural features of the '<em>Behavior Action Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ACTION_BLOCK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Behavior Action Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ACTION_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link NEsysml.BA.impl.BehaviorActionImpl <em>Behavior Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.BA.impl.BehaviorActionImpl
	 * @see NEsysml.BA.impl.BAPackageImpl#getBehaviorAction()
	 * @generated
	 */
	int BEHAVIOR_ACTION = 4;

	/**
	 * The feature id for the '<em><b>Last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ACTION__LAST = AadlPackage.SUBPROGRAM_CALL__LAST;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ACTION__NEXT = AadlPackage.SUBPROGRAM_CALL__NEXT;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ACTION__PARAMETER = AadlPackage.SUBPROGRAM_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Behavior Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ACTION_FEATURE_COUNT = AadlPackage.SUBPROGRAM_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Behavior Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ACTION_OPERATION_COUNT = AadlPackage.SUBPROGRAM_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NEsysml.BA.impl.TransitionConditionImpl <em>Transition Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.BA.impl.TransitionConditionImpl
	 * @see NEsysml.BA.impl.BAPackageImpl#getTransitionCondition()
	 * @generated
	 */
	int TRANSITION_CONDITION = 5;

	/**
	 * The number of structural features of the '<em>Transition Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONDITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Transition Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link NEsysml.BA.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.BA.impl.VariableImpl
	 * @see NEsysml.BA.impl.BAPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Primitive Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__PRIMITIVE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link NEsysml.BA.impl.PortActionImpl <em>Port Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.BA.impl.PortActionImpl
	 * @see NEsysml.BA.impl.BAPackageImpl#getPortAction()
	 * @generated
	 */
	int PORT_ACTION = 7;

	/**
	 * The feature id for the '<em><b>Last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_ACTION__LAST = BEHAVIOR_ACTION__LAST;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_ACTION__NEXT = BEHAVIOR_ACTION__NEXT;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_ACTION__PARAMETER = BEHAVIOR_ACTION__PARAMETER;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_ACTION__PORT = BEHAVIOR_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_ACTION_FEATURE_COUNT = BEHAVIOR_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_ACTION_OPERATION_COUNT = BEHAVIOR_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NEsysml.BA.impl.SendOutputImpl <em>Send Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.BA.impl.SendOutputImpl
	 * @see NEsysml.BA.impl.BAPackageImpl#getSendOutput()
	 * @generated
	 */
	int SEND_OUTPUT = 8;

	/**
	 * The feature id for the '<em><b>Last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OUTPUT__LAST = PORT_ACTION__LAST;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OUTPUT__NEXT = PORT_ACTION__NEXT;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OUTPUT__PARAMETER = PORT_ACTION__PARAMETER;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OUTPUT__PORT = PORT_ACTION__PORT;

	/**
	 * The feature id for the '<em><b>Base Send Signal Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OUTPUT__BASE_SEND_SIGNAL_ACTION = PORT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Send Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OUTPUT_FEATURE_COUNT = PORT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Send Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OUTPUT_OPERATION_COUNT = PORT_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NEsysml.BA.impl.GetInputImpl <em>Get Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.BA.impl.GetInputImpl
	 * @see NEsysml.BA.impl.BAPackageImpl#getGetInput()
	 * @generated
	 */
	int GET_INPUT = 9;

	/**
	 * The feature id for the '<em><b>Last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_INPUT__LAST = PORT_ACTION__LAST;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_INPUT__NEXT = PORT_ACTION__NEXT;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_INPUT__PARAMETER = PORT_ACTION__PARAMETER;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_INPUT__PORT = PORT_ACTION__PORT;

	/**
	 * The feature id for the '<em><b>Base Accept Event Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_INPUT__BASE_ACCEPT_EVENT_ACTION = PORT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Get Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_INPUT_FEATURE_COUNT = PORT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Get Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_INPUT_OPERATION_COUNT = PORT_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NEsysml.BA.impl.SubprogramCallActionImpl <em>Subprogram Call Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.BA.impl.SubprogramCallActionImpl
	 * @see NEsysml.BA.impl.BAPackageImpl#getSubprogramCallAction()
	 * @generated
	 */
	int SUBPROGRAM_CALL_ACTION = 10;

	/**
	 * The feature id for the '<em><b>Last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_CALL_ACTION__LAST = BEHAVIOR_ACTION__LAST;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_CALL_ACTION__NEXT = BEHAVIOR_ACTION__NEXT;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_CALL_ACTION__PARAMETER = BEHAVIOR_ACTION__PARAMETER;

	/**
	 * The number of structural features of the '<em>Subprogram Call Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_CALL_ACTION_FEATURE_COUNT = BEHAVIOR_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Subprogram Call Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_CALL_ACTION_OPERATION_COUNT = BEHAVIOR_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NEsysml.BA.impl.TextConditionImpl <em>Text Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.BA.impl.TextConditionImpl
	 * @see NEsysml.BA.impl.BAPackageImpl#getTextCondition()
	 * @generated
	 */
	int TEXT_CONDITION = 11;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONDITION__BASE_CONSTRAINT = TRANSITION_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONDITION_FEATURE_COUNT = TRANSITION_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONDITION_OPERATION_COUNT = TRANSITION_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NEsysml.BA.impl.DispatchConditionImpl <em>Dispatch Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.BA.impl.DispatchConditionImpl
	 * @see NEsysml.BA.impl.BAPackageImpl#getDispatchCondition()
	 * @generated
	 */
	int DISPATCH_CONDITION = 12;

	/**
	 * The feature id for the '<em><b>Base Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCH_CONDITION__BASE_TRIGGER = TRANSITION_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCH_CONDITION__IS_TIMEOUT = TRANSITION_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dispatch Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCH_CONDITION__DISPATCH_PORT = TRANSITION_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dispatch Subprogram Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCH_CONDITION__DISPATCH_SUBPROGRAM_ACCESS = TRANSITION_CONDITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Dispatch Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCH_CONDITION_FEATURE_COUNT = TRANSITION_CONDITION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Dispatch Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCH_CONDITION_OPERATION_COUNT = TRANSITION_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NEsysml.BA.impl.SubprogramInstanceCallActionImpl <em>Subprogram Instance Call Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.BA.impl.SubprogramInstanceCallActionImpl
	 * @see NEsysml.BA.impl.BAPackageImpl#getSubprogramInstanceCallAction()
	 * @generated
	 */
	int SUBPROGRAM_INSTANCE_CALL_ACTION = 13;

	/**
	 * The feature id for the '<em><b>Last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_INSTANCE_CALL_ACTION__LAST = AadlPackage.SUBPROGRAM_INSTANCE_CALL__LAST;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_INSTANCE_CALL_ACTION__NEXT = AadlPackage.SUBPROGRAM_INSTANCE_CALL__NEXT;

	/**
	 * The feature id for the '<em><b>Base Call Behavior Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_INSTANCE_CALL_ACTION__BASE_CALL_BEHAVIOR_ACTION = AadlPackage.SUBPROGRAM_INSTANCE_CALL__BASE_CALL_BEHAVIOR_ACTION;

	/**
	 * The feature id for the '<em><b>Subprogram Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_INSTANCE_CALL_ACTION__SUBPROGRAM_INSTANCE = AadlPackage.SUBPROGRAM_INSTANCE_CALL__SUBPROGRAM_INSTANCE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_INSTANCE_CALL_ACTION__PARAMETER = AadlPackage.SUBPROGRAM_INSTANCE_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Subprogram Instance Call Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_INSTANCE_CALL_ACTION_FEATURE_COUNT = AadlPackage.SUBPROGRAM_INSTANCE_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Subprogram Instance Call Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_INSTANCE_CALL_ACTION_OPERATION_COUNT = AadlPackage.SUBPROGRAM_INSTANCE_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NEsysml.BA.impl.SubprogramInterfaceCallActionImpl <em>Subprogram Interface Call Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.BA.impl.SubprogramInterfaceCallActionImpl
	 * @see NEsysml.BA.impl.BAPackageImpl#getSubprogramInterfaceCallAction()
	 * @generated
	 */
	int SUBPROGRAM_INTERFACE_CALL_ACTION = 14;

	/**
	 * The feature id for the '<em><b>Last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_INTERFACE_CALL_ACTION__LAST = AadlPackage.SUBPROGRAM_INTERFACE_CALL__LAST;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_INTERFACE_CALL_ACTION__NEXT = AadlPackage.SUBPROGRAM_INTERFACE_CALL__NEXT;

	/**
	 * The feature id for the '<em><b>Base Call Operation Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_INTERFACE_CALL_ACTION__BASE_CALL_OPERATION_ACTION = AadlPackage.SUBPROGRAM_INTERFACE_CALL__BASE_CALL_OPERATION_ACTION;

	/**
	 * The feature id for the '<em><b>Subprogram Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_INTERFACE_CALL_ACTION__SUBPROGRAM_INTERFACE = AadlPackage.SUBPROGRAM_INTERFACE_CALL__SUBPROGRAM_INTERFACE;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_INTERFACE_CALL_ACTION__CONTEXT = AadlPackage.SUBPROGRAM_INTERFACE_CALL__CONTEXT;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_INTERFACE_CALL_ACTION__PARAMETER = AadlPackage.SUBPROGRAM_INTERFACE_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Subprogram Interface Call Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_INTERFACE_CALL_ACTION_FEATURE_COUNT = AadlPackage.SUBPROGRAM_INTERFACE_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Subprogram Interface Call Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_INTERFACE_CALL_ACTION_OPERATION_COUNT = AadlPackage.SUBPROGRAM_INTERFACE_CALL_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link NEsysml.BA.BehaviorStateMachine <em>Behavior State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior State Machine</em>'.
	 * @see NEsysml.BA.BehaviorStateMachine
	 * @generated
	 */
	EClass getBehaviorStateMachine();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.BA.BehaviorStateMachine#getBase_StateMachine <em>Base State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base State Machine</em>'.
	 * @see NEsysml.BA.BehaviorStateMachine#getBase_StateMachine()
	 * @see #getBehaviorStateMachine()
	 * @generated
	 */
	EReference getBehaviorStateMachine_Base_StateMachine();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.BA.BehaviorStateMachine#getOwnedState <em>Owned State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned State</em>'.
	 * @see NEsysml.BA.BehaviorStateMachine#getOwnedState()
	 * @see #getBehaviorStateMachine()
	 * @generated
	 */
	EReference getBehaviorStateMachine_OwnedState();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.BA.BehaviorStateMachine#getOwnedTransition <em>Owned Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Transition</em>'.
	 * @see NEsysml.BA.BehaviorStateMachine#getOwnedTransition()
	 * @see #getBehaviorStateMachine()
	 * @generated
	 */
	EReference getBehaviorStateMachine_OwnedTransition();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.BA.BehaviorStateMachine#getOwnedVariable <em>Owned Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Variable</em>'.
	 * @see NEsysml.BA.BehaviorStateMachine#getOwnedVariable()
	 * @see #getBehaviorStateMachine()
	 * @generated
	 */
	EReference getBehaviorStateMachine_OwnedVariable();

	/**
	 * Returns the meta object for class '{@link NEsysml.BA.BehaviorState <em>Behavior State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior State</em>'.
	 * @see NEsysml.BA.BehaviorState
	 * @generated
	 */
	EClass getBehaviorState();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.BA.BehaviorState#getBase_State <em>Base State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base State</em>'.
	 * @see NEsysml.BA.BehaviorState#getBase_State()
	 * @see #getBehaviorState()
	 * @generated
	 */
	EReference getBehaviorState_Base_State();

	/**
	 * Returns the meta object for the attribute '{@link NEsysml.BA.BehaviorState#isComplete <em>Is Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Complete</em>'.
	 * @see NEsysml.BA.BehaviorState#isComplete()
	 * @see #getBehaviorState()
	 * @generated
	 */
	EAttribute getBehaviorState_IsComplete();

	/**
	 * Returns the meta object for the attribute '{@link NEsysml.BA.BehaviorState#isInitial <em>Is Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Initial</em>'.
	 * @see NEsysml.BA.BehaviorState#isInitial()
	 * @see #getBehaviorState()
	 * @generated
	 */
	EAttribute getBehaviorState_IsInitial();

	/**
	 * Returns the meta object for the attribute '{@link NEsysml.BA.BehaviorState#isFinal <em>Is Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Final</em>'.
	 * @see NEsysml.BA.BehaviorState#isFinal()
	 * @see #getBehaviorState()
	 * @generated
	 */
	EAttribute getBehaviorState_IsFinal();

	/**
	 * Returns the meta object for class '{@link NEsysml.BA.BehaviorStateTransition <em>Behavior State Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior State Transition</em>'.
	 * @see NEsysml.BA.BehaviorStateTransition
	 * @generated
	 */
	EClass getBehaviorStateTransition();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.BA.BehaviorStateTransition#getBase_Transition <em>Base Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Transition</em>'.
	 * @see NEsysml.BA.BehaviorStateTransition#getBase_Transition()
	 * @see #getBehaviorStateTransition()
	 * @generated
	 */
	EReference getBehaviorStateTransition_Base_Transition();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.BA.BehaviorStateTransition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see NEsysml.BA.BehaviorStateTransition#getFrom()
	 * @see #getBehaviorStateTransition()
	 * @generated
	 */
	EReference getBehaviorStateTransition_From();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.BA.BehaviorStateTransition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see NEsysml.BA.BehaviorStateTransition#getTo()
	 * @see #getBehaviorStateTransition()
	 * @generated
	 */
	EReference getBehaviorStateTransition_To();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.BA.BehaviorStateTransition#getOwnedActionBlock <em>Owned Action Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owned Action Block</em>'.
	 * @see NEsysml.BA.BehaviorStateTransition#getOwnedActionBlock()
	 * @see #getBehaviorStateTransition()
	 * @generated
	 */
	EReference getBehaviorStateTransition_OwnedActionBlock();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.BA.BehaviorStateTransition#getOwnedCondition <em>Owned Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owned Condition</em>'.
	 * @see NEsysml.BA.BehaviorStateTransition#getOwnedCondition()
	 * @see #getBehaviorStateTransition()
	 * @generated
	 */
	EReference getBehaviorStateTransition_OwnedCondition();

	/**
	 * Returns the meta object for class '{@link NEsysml.BA.BehaviorActionBlock <em>Behavior Action Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Action Block</em>'.
	 * @see NEsysml.BA.BehaviorActionBlock
	 * @generated
	 */
	EClass getBehaviorActionBlock();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.BA.BehaviorActionBlock#getBase_Activity <em>Base Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Activity</em>'.
	 * @see NEsysml.BA.BehaviorActionBlock#getBase_Activity()
	 * @see #getBehaviorActionBlock()
	 * @generated
	 */
	EReference getBehaviorActionBlock_Base_Activity();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.BA.BehaviorActionBlock#getOwnedAction <em>Owned Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Action</em>'.
	 * @see NEsysml.BA.BehaviorActionBlock#getOwnedAction()
	 * @see #getBehaviorActionBlock()
	 * @generated
	 */
	EReference getBehaviorActionBlock_OwnedAction();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.BA.BehaviorActionBlock#getFirstAction <em>First Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Action</em>'.
	 * @see NEsysml.BA.BehaviorActionBlock#getFirstAction()
	 * @see #getBehaviorActionBlock()
	 * @generated
	 */
	EReference getBehaviorActionBlock_FirstAction();

	/**
	 * Returns the meta object for class '{@link NEsysml.BA.BehaviorAction <em>Behavior Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Action</em>'.
	 * @see NEsysml.BA.BehaviorAction
	 * @generated
	 */
	EClass getBehaviorAction();

	/**
	 * Returns the meta object for the attribute list '{@link NEsysml.BA.BehaviorAction#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameter</em>'.
	 * @see NEsysml.BA.BehaviorAction#getParameter()
	 * @see #getBehaviorAction()
	 * @generated
	 */
	EAttribute getBehaviorAction_Parameter();

	/**
	 * Returns the meta object for class '{@link NEsysml.BA.TransitionCondition <em>Transition Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Condition</em>'.
	 * @see NEsysml.BA.TransitionCondition
	 * @generated
	 */
	EClass getTransitionCondition();

	/**
	 * Returns the meta object for class '{@link NEsysml.BA.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see NEsysml.BA.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.BA.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see NEsysml.BA.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Type();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.BA.Variable#getPrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primitive Type</em>'.
	 * @see NEsysml.BA.Variable#getPrimitiveType()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_PrimitiveType();

	/**
	 * Returns the meta object for the attribute '{@link NEsysml.BA.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see NEsysml.BA.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link NEsysml.BA.PortAction <em>Port Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Action</em>'.
	 * @see NEsysml.BA.PortAction
	 * @generated
	 */
	EClass getPortAction();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.BA.PortAction#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see NEsysml.BA.PortAction#getPort()
	 * @see #getPortAction()
	 * @generated
	 */
	EReference getPortAction_Port();

	/**
	 * Returns the meta object for class '{@link NEsysml.BA.SendOutput <em>Send Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Output</em>'.
	 * @see NEsysml.BA.SendOutput
	 * @generated
	 */
	EClass getSendOutput();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.BA.SendOutput#getBase_SendSignalAction <em>Base Send Signal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Send Signal Action</em>'.
	 * @see NEsysml.BA.SendOutput#getBase_SendSignalAction()
	 * @see #getSendOutput()
	 * @generated
	 */
	EReference getSendOutput_Base_SendSignalAction();

	/**
	 * Returns the meta object for class '{@link NEsysml.BA.GetInput <em>Get Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Input</em>'.
	 * @see NEsysml.BA.GetInput
	 * @generated
	 */
	EClass getGetInput();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.BA.GetInput#getBase_AcceptEventAction <em>Base Accept Event Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Accept Event Action</em>'.
	 * @see NEsysml.BA.GetInput#getBase_AcceptEventAction()
	 * @see #getGetInput()
	 * @generated
	 */
	EReference getGetInput_Base_AcceptEventAction();

	/**
	 * Returns the meta object for class '{@link NEsysml.BA.SubprogramCallAction <em>Subprogram Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subprogram Call Action</em>'.
	 * @see NEsysml.BA.SubprogramCallAction
	 * @generated
	 */
	EClass getSubprogramCallAction();

	/**
	 * Returns the meta object for class '{@link NEsysml.BA.TextCondition <em>Text Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Condition</em>'.
	 * @see NEsysml.BA.TextCondition
	 * @generated
	 */
	EClass getTextCondition();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.BA.TextCondition#getBase_Constraint <em>Base Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Constraint</em>'.
	 * @see NEsysml.BA.TextCondition#getBase_Constraint()
	 * @see #getTextCondition()
	 * @generated
	 */
	EReference getTextCondition_Base_Constraint();

	/**
	 * Returns the meta object for class '{@link NEsysml.BA.DispatchCondition <em>Dispatch Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dispatch Condition</em>'.
	 * @see NEsysml.BA.DispatchCondition
	 * @generated
	 */
	EClass getDispatchCondition();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.BA.DispatchCondition#getBase_Trigger <em>Base Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Trigger</em>'.
	 * @see NEsysml.BA.DispatchCondition#getBase_Trigger()
	 * @see #getDispatchCondition()
	 * @generated
	 */
	EReference getDispatchCondition_Base_Trigger();

	/**
	 * Returns the meta object for the attribute '{@link NEsysml.BA.DispatchCondition#isTimeout <em>Is Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Timeout</em>'.
	 * @see NEsysml.BA.DispatchCondition#isTimeout()
	 * @see #getDispatchCondition()
	 * @generated
	 */
	EAttribute getDispatchCondition_IsTimeout();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.BA.DispatchCondition#getDispatchPort <em>Dispatch Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dispatch Port</em>'.
	 * @see NEsysml.BA.DispatchCondition#getDispatchPort()
	 * @see #getDispatchCondition()
	 * @generated
	 */
	EReference getDispatchCondition_DispatchPort();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.BA.DispatchCondition#getDispatchSubprogramAccess <em>Dispatch Subprogram Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dispatch Subprogram Access</em>'.
	 * @see NEsysml.BA.DispatchCondition#getDispatchSubprogramAccess()
	 * @see #getDispatchCondition()
	 * @generated
	 */
	EReference getDispatchCondition_DispatchSubprogramAccess();

	/**
	 * Returns the meta object for class '{@link NEsysml.BA.SubprogramInstanceCallAction <em>Subprogram Instance Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subprogram Instance Call Action</em>'.
	 * @see NEsysml.BA.SubprogramInstanceCallAction
	 * @generated
	 */
	EClass getSubprogramInstanceCallAction();

	/**
	 * Returns the meta object for class '{@link NEsysml.BA.SubprogramInterfaceCallAction <em>Subprogram Interface Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subprogram Interface Call Action</em>'.
	 * @see NEsysml.BA.SubprogramInterfaceCallAction
	 * @generated
	 */
	EClass getSubprogramInterfaceCallAction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BAFactory getBAFactory();

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
		 * The meta object literal for the '{@link NEsysml.BA.impl.BehaviorStateMachineImpl <em>Behavior State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.BA.impl.BehaviorStateMachineImpl
		 * @see NEsysml.BA.impl.BAPackageImpl#getBehaviorStateMachine()
		 * @generated
		 */
		EClass BEHAVIOR_STATE_MACHINE = eINSTANCE.getBehaviorStateMachine();

		/**
		 * The meta object literal for the '<em><b>Base State Machine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_STATE_MACHINE__BASE_STATE_MACHINE = eINSTANCE.getBehaviorStateMachine_Base_StateMachine();

		/**
		 * The meta object literal for the '<em><b>Owned State</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_STATE_MACHINE__OWNED_STATE = eINSTANCE.getBehaviorStateMachine_OwnedState();

		/**
		 * The meta object literal for the '<em><b>Owned Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_STATE_MACHINE__OWNED_TRANSITION = eINSTANCE.getBehaviorStateMachine_OwnedTransition();

		/**
		 * The meta object literal for the '<em><b>Owned Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_STATE_MACHINE__OWNED_VARIABLE = eINSTANCE.getBehaviorStateMachine_OwnedVariable();

		/**
		 * The meta object literal for the '{@link NEsysml.BA.impl.BehaviorStateImpl <em>Behavior State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.BA.impl.BehaviorStateImpl
		 * @see NEsysml.BA.impl.BAPackageImpl#getBehaviorState()
		 * @generated
		 */
		EClass BEHAVIOR_STATE = eINSTANCE.getBehaviorState();

		/**
		 * The meta object literal for the '<em><b>Base State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_STATE__BASE_STATE = eINSTANCE.getBehaviorState_Base_State();

		/**
		 * The meta object literal for the '<em><b>Is Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR_STATE__IS_COMPLETE = eINSTANCE.getBehaviorState_IsComplete();

		/**
		 * The meta object literal for the '<em><b>Is Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR_STATE__IS_INITIAL = eINSTANCE.getBehaviorState_IsInitial();

		/**
		 * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR_STATE__IS_FINAL = eINSTANCE.getBehaviorState_IsFinal();

		/**
		 * The meta object literal for the '{@link NEsysml.BA.impl.BehaviorStateTransitionImpl <em>Behavior State Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.BA.impl.BehaviorStateTransitionImpl
		 * @see NEsysml.BA.impl.BAPackageImpl#getBehaviorStateTransition()
		 * @generated
		 */
		EClass BEHAVIOR_STATE_TRANSITION = eINSTANCE.getBehaviorStateTransition();

		/**
		 * The meta object literal for the '<em><b>Base Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_STATE_TRANSITION__BASE_TRANSITION = eINSTANCE.getBehaviorStateTransition_Base_Transition();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_STATE_TRANSITION__FROM = eINSTANCE.getBehaviorStateTransition_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_STATE_TRANSITION__TO = eINSTANCE.getBehaviorStateTransition_To();

		/**
		 * The meta object literal for the '<em><b>Owned Action Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_STATE_TRANSITION__OWNED_ACTION_BLOCK = eINSTANCE.getBehaviorStateTransition_OwnedActionBlock();

		/**
		 * The meta object literal for the '<em><b>Owned Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_STATE_TRANSITION__OWNED_CONDITION = eINSTANCE.getBehaviorStateTransition_OwnedCondition();

		/**
		 * The meta object literal for the '{@link NEsysml.BA.impl.BehaviorActionBlockImpl <em>Behavior Action Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.BA.impl.BehaviorActionBlockImpl
		 * @see NEsysml.BA.impl.BAPackageImpl#getBehaviorActionBlock()
		 * @generated
		 */
		EClass BEHAVIOR_ACTION_BLOCK = eINSTANCE.getBehaviorActionBlock();

		/**
		 * The meta object literal for the '<em><b>Base Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_ACTION_BLOCK__BASE_ACTIVITY = eINSTANCE.getBehaviorActionBlock_Base_Activity();

		/**
		 * The meta object literal for the '<em><b>Owned Action</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_ACTION_BLOCK__OWNED_ACTION = eINSTANCE.getBehaviorActionBlock_OwnedAction();

		/**
		 * The meta object literal for the '<em><b>First Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_ACTION_BLOCK__FIRST_ACTION = eINSTANCE.getBehaviorActionBlock_FirstAction();

		/**
		 * The meta object literal for the '{@link NEsysml.BA.impl.BehaviorActionImpl <em>Behavior Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.BA.impl.BehaviorActionImpl
		 * @see NEsysml.BA.impl.BAPackageImpl#getBehaviorAction()
		 * @generated
		 */
		EClass BEHAVIOR_ACTION = eINSTANCE.getBehaviorAction();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR_ACTION__PARAMETER = eINSTANCE.getBehaviorAction_Parameter();

		/**
		 * The meta object literal for the '{@link NEsysml.BA.impl.TransitionConditionImpl <em>Transition Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.BA.impl.TransitionConditionImpl
		 * @see NEsysml.BA.impl.BAPackageImpl#getTransitionCondition()
		 * @generated
		 */
		EClass TRANSITION_CONDITION = eINSTANCE.getTransitionCondition();

		/**
		 * The meta object literal for the '{@link NEsysml.BA.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.BA.impl.VariableImpl
		 * @see NEsysml.BA.impl.BAPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Primitive Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__PRIMITIVE_TYPE = eINSTANCE.getVariable_PrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '{@link NEsysml.BA.impl.PortActionImpl <em>Port Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.BA.impl.PortActionImpl
		 * @see NEsysml.BA.impl.BAPackageImpl#getPortAction()
		 * @generated
		 */
		EClass PORT_ACTION = eINSTANCE.getPortAction();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_ACTION__PORT = eINSTANCE.getPortAction_Port();

		/**
		 * The meta object literal for the '{@link NEsysml.BA.impl.SendOutputImpl <em>Send Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.BA.impl.SendOutputImpl
		 * @see NEsysml.BA.impl.BAPackageImpl#getSendOutput()
		 * @generated
		 */
		EClass SEND_OUTPUT = eINSTANCE.getSendOutput();

		/**
		 * The meta object literal for the '<em><b>Base Send Signal Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_OUTPUT__BASE_SEND_SIGNAL_ACTION = eINSTANCE.getSendOutput_Base_SendSignalAction();

		/**
		 * The meta object literal for the '{@link NEsysml.BA.impl.GetInputImpl <em>Get Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.BA.impl.GetInputImpl
		 * @see NEsysml.BA.impl.BAPackageImpl#getGetInput()
		 * @generated
		 */
		EClass GET_INPUT = eINSTANCE.getGetInput();

		/**
		 * The meta object literal for the '<em><b>Base Accept Event Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_INPUT__BASE_ACCEPT_EVENT_ACTION = eINSTANCE.getGetInput_Base_AcceptEventAction();

		/**
		 * The meta object literal for the '{@link NEsysml.BA.impl.SubprogramCallActionImpl <em>Subprogram Call Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.BA.impl.SubprogramCallActionImpl
		 * @see NEsysml.BA.impl.BAPackageImpl#getSubprogramCallAction()
		 * @generated
		 */
		EClass SUBPROGRAM_CALL_ACTION = eINSTANCE.getSubprogramCallAction();

		/**
		 * The meta object literal for the '{@link NEsysml.BA.impl.TextConditionImpl <em>Text Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.BA.impl.TextConditionImpl
		 * @see NEsysml.BA.impl.BAPackageImpl#getTextCondition()
		 * @generated
		 */
		EClass TEXT_CONDITION = eINSTANCE.getTextCondition();

		/**
		 * The meta object literal for the '<em><b>Base Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_CONDITION__BASE_CONSTRAINT = eINSTANCE.getTextCondition_Base_Constraint();

		/**
		 * The meta object literal for the '{@link NEsysml.BA.impl.DispatchConditionImpl <em>Dispatch Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.BA.impl.DispatchConditionImpl
		 * @see NEsysml.BA.impl.BAPackageImpl#getDispatchCondition()
		 * @generated
		 */
		EClass DISPATCH_CONDITION = eINSTANCE.getDispatchCondition();

		/**
		 * The meta object literal for the '<em><b>Base Trigger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPATCH_CONDITION__BASE_TRIGGER = eINSTANCE.getDispatchCondition_Base_Trigger();

		/**
		 * The meta object literal for the '<em><b>Is Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPATCH_CONDITION__IS_TIMEOUT = eINSTANCE.getDispatchCondition_IsTimeout();

		/**
		 * The meta object literal for the '<em><b>Dispatch Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPATCH_CONDITION__DISPATCH_PORT = eINSTANCE.getDispatchCondition_DispatchPort();

		/**
		 * The meta object literal for the '<em><b>Dispatch Subprogram Access</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPATCH_CONDITION__DISPATCH_SUBPROGRAM_ACCESS = eINSTANCE.getDispatchCondition_DispatchSubprogramAccess();

		/**
		 * The meta object literal for the '{@link NEsysml.BA.impl.SubprogramInstanceCallActionImpl <em>Subprogram Instance Call Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.BA.impl.SubprogramInstanceCallActionImpl
		 * @see NEsysml.BA.impl.BAPackageImpl#getSubprogramInstanceCallAction()
		 * @generated
		 */
		EClass SUBPROGRAM_INSTANCE_CALL_ACTION = eINSTANCE.getSubprogramInstanceCallAction();

		/**
		 * The meta object literal for the '{@link NEsysml.BA.impl.SubprogramInterfaceCallActionImpl <em>Subprogram Interface Call Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.BA.impl.SubprogramInterfaceCallActionImpl
		 * @see NEsysml.BA.impl.BAPackageImpl#getSubprogramInterfaceCallAction()
		 * @generated
		 */
		EClass SUBPROGRAM_INTERFACE_CALL_ACTION = eINSTANCE.getSubprogramInterfaceCallAction();

	}

} //BAPackage
