/**
 */
package NEsysml.EM;

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
 * @see NEsysml.EM.EMFactory
 * @model kind="package"
 * @generated
 */
public interface EMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "EM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://smbody/esysml/2.0/ESysML/EM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "NEsysml.EM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EMPackage eINSTANCE = NEsysml.EM.impl.EMPackageImpl.init();

	/**
	 * The meta object id for the '{@link NEsysml.EM.impl.ErrorModelLibraryImpl <em>Error Model Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.EM.impl.ErrorModelLibraryImpl
	 * @see NEsysml.EM.impl.EMPackageImpl#getErrorModelLibrary()
	 * @generated
	 */
	int ERROR_MODEL_LIBRARY = 0;

	/**
	 * The feature id for the '<em><b>Owned Behaviors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_LIBRARY__OWNED_BEHAVIORS = 0;

	/**
	 * The feature id for the '<em><b>Owned Error Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_LIBRARY__OWNED_ERROR_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Import</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_LIBRARY__IMPORT = 2;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_LIBRARY__BASE_PACKAGE = 3;

	/**
	 * The number of structural features of the '<em>Error Model Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_LIBRARY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Error Model Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_LIBRARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link NEsysml.EM.impl.ErrorBehaviorImpl <em>Error Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.EM.impl.ErrorBehaviorImpl
	 * @see NEsysml.EM.impl.EMPackageImpl#getErrorBehavior()
	 * @generated
	 */
	int ERROR_BEHAVIOR = 2;

	/**
	 * The feature id for the '<em><b>Base State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR__BASE_STATE_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Owned Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR__OWNED_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Owned State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR__OWNED_STATE = 2;

	/**
	 * The feature id for the '<em><b>Owned Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR__OWNED_TRANSITION = 3;

	/**
	 * The feature id for the '<em><b>Use Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR__USE_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Error Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Error Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link NEsysml.EM.impl.ErrorBehaviorStateMachineImpl <em>Error Behavior State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.EM.impl.ErrorBehaviorStateMachineImpl
	 * @see NEsysml.EM.impl.EMPackageImpl#getErrorBehaviorStateMachine()
	 * @generated
	 */
	int ERROR_BEHAVIOR_STATE_MACHINE = 1;

	/**
	 * The feature id for the '<em><b>Base State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_STATE_MACHINE__BASE_STATE_MACHINE = ERROR_BEHAVIOR__BASE_STATE_MACHINE;

	/**
	 * The feature id for the '<em><b>Owned Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_STATE_MACHINE__OWNED_EVENT = ERROR_BEHAVIOR__OWNED_EVENT;

	/**
	 * The feature id for the '<em><b>Owned State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_STATE_MACHINE__OWNED_STATE = ERROR_BEHAVIOR__OWNED_STATE;

	/**
	 * The feature id for the '<em><b>Owned Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_STATE_MACHINE__OWNED_TRANSITION = ERROR_BEHAVIOR__OWNED_TRANSITION;

	/**
	 * The feature id for the '<em><b>Use Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_STATE_MACHINE__USE_TYPE = ERROR_BEHAVIOR__USE_TYPE;

	/**
	 * The feature id for the '<em><b>In Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_STATE_MACHINE__IN_PACKAGE = ERROR_BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Error Behavior State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_STATE_MACHINE_FEATURE_COUNT = ERROR_BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Error Behavior State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_STATE_MACHINE_OPERATION_COUNT = ERROR_BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NEsysml.EM.impl.ErrorBehaviorEventImpl <em>Error Behavior Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.EM.impl.ErrorBehaviorEventImpl
	 * @see NEsysml.EM.impl.EMPackageImpl#getErrorBehaviorEvent()
	 * @generated
	 */
	int ERROR_BEHAVIOR_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Base Change Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_EVENT__BASE_CHANGE_EVENT = 0;

	/**
	 * The number of structural features of the '<em>Error Behavior Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_EVENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Error Behavior Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link NEsysml.EM.impl.ErrorTypedElementImpl <em>Error Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.EM.impl.ErrorTypedElementImpl
	 * @see NEsysml.EM.impl.EMPackageImpl#getErrorTypedElement()
	 * @generated
	 */
	int ERROR_TYPED_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Owned Error Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPED_ELEMENT__OWNED_ERROR_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Error Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Error Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link NEsysml.EM.impl.ErrorBehaviorStateImpl <em>Error Behavior State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.EM.impl.ErrorBehaviorStateImpl
	 * @see NEsysml.EM.impl.EMPackageImpl#getErrorBehaviorState()
	 * @generated
	 */
	int ERROR_BEHAVIOR_STATE = 4;

	/**
	 * The feature id for the '<em><b>Owned Error Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_STATE__OWNED_ERROR_TYPE = ERROR_TYPED_ELEMENT__OWNED_ERROR_TYPE;

	/**
	 * The feature id for the '<em><b>Base State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_STATE__BASE_STATE = ERROR_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_STATE__IS_INITIAL = ERROR_TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Error Behavior State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_STATE_FEATURE_COUNT = ERROR_TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Error Behavior State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_STATE_OPERATION_COUNT = ERROR_TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NEsysml.EM.impl.ErrorTypeImpl <em>Error Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.EM.impl.ErrorTypeImpl
	 * @see NEsysml.EM.impl.EMPackageImpl#getErrorType()
	 * @generated
	 */
	int ERROR_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE__BASE_DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE__EXTENSION = 1;

	/**
	 * The feature id for the '<em><b>In Library</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE__IN_LIBRARY = 2;

	/**
	 * The number of structural features of the '<em>Error Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Error Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link NEsysml.EM.impl.ErrorBehaviorTransitionImpl <em>Error Behavior Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.EM.impl.ErrorBehaviorTransitionImpl
	 * @see NEsysml.EM.impl.EMPackageImpl#getErrorBehaviorTransition()
	 * @generated
	 */
	int ERROR_BEHAVIOR_TRANSITION = 7;

	/**
	 * The feature id for the '<em><b>Base Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_TRANSITION__BASE_TRANSITION = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_TRANSITION__FROM = 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_TRANSITION__TO = 2;

	/**
	 * The feature id for the '<em><b>Trans Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_TRANSITION__TRANS_CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Type Set Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_TRANSITION__TYPE_SET_CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Type Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_TRANSITION__TYPE_SET = 5;

	/**
	 * The feature id for the '<em><b>Owned Branches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_TRANSITION__OWNED_BRANCHES = 6;

	/**
	 * The number of structural features of the '<em>Error Behavior Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_TRANSITION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Error Behavior Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link NEsysml.EM.impl.ErrorBehaviorTransitionConditionImpl <em>Error Behavior Transition Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.EM.impl.ErrorBehaviorTransitionConditionImpl
	 * @see NEsysml.EM.impl.EMPackageImpl#getErrorBehaviorTransitionCondition()
	 * @generated
	 */
	int ERROR_BEHAVIOR_TRANSITION_CONDITION = 8;

	/**
	 * The feature id for the '<em><b>Base Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_TRANSITION_CONDITION__BASE_ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_TRANSITION_CONDITION__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Error Behavior Transition Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_TRANSITION_CONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Error Behavior Transition Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_TRANSITION_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link NEsysml.EM.impl.ErrorBehaviorTransitionExpressionImpl <em>Error Behavior Transition Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.EM.impl.ErrorBehaviorTransitionExpressionImpl
	 * @see NEsysml.EM.impl.EMPackageImpl#getErrorBehaviorTransitionExpression()
	 * @generated
	 */
	int ERROR_BEHAVIOR_TRANSITION_EXPRESSION = 9;

	/**
	 * The number of structural features of the '<em>Error Behavior Transition Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_TRANSITION_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Error Behavior Transition Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_TRANSITION_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link NEsysml.EM.impl.TransitionBranchImpl <em>Transition Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.EM.impl.TransitionBranchImpl
	 * @see NEsysml.EM.impl.EMPackageImpl#getTransitionBranch()
	 * @generated
	 */
	int TRANSITION_BRANCH = 10;

	/**
	 * The feature id for the '<em><b>Owned Error Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_BRANCH__OWNED_ERROR_TYPE = ERROR_TYPED_ELEMENT__OWNED_ERROR_TYPE;

	/**
	 * The feature id for the '<em><b>Base Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_BRANCH__BASE_TRANSITION = ERROR_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_BRANCH__PROBABILITY = ERROR_TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Others</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_BRANCH__IS_OTHERS = ERROR_TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_BRANCH__TARGET = ERROR_TYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Transition Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_BRANCH_FEATURE_COUNT = ERROR_TYPED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Transition Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_BRANCH_OPERATION_COUNT = ERROR_TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NEsysml.EM.impl.ErrorEventImpl <em>Error Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.EM.impl.ErrorEventImpl
	 * @see NEsysml.EM.impl.EMPackageImpl#getErrorEvent()
	 * @generated
	 */
	int ERROR_EVENT = 11;

	/**
	 * The feature id for the '<em><b>Base Change Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT__BASE_CHANGE_EVENT = ERROR_BEHAVIOR_EVENT__BASE_CHANGE_EVENT;

	/**
	 * The feature id for the '<em><b>Owned Error Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT__OWNED_ERROR_TYPE = ERROR_BEHAVIOR_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Error Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT_FEATURE_COUNT = ERROR_BEHAVIOR_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Error Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT_OPERATION_COUNT = ERROR_BEHAVIOR_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NEsysml.EM.impl.RepairEventImpl <em>Repair Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.EM.impl.RepairEventImpl
	 * @see NEsysml.EM.impl.EMPackageImpl#getRepairEvent()
	 * @generated
	 */
	int REPAIR_EVENT = 12;

	/**
	 * The feature id for the '<em><b>Base Change Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR_EVENT__BASE_CHANGE_EVENT = ERROR_BEHAVIOR_EVENT__BASE_CHANGE_EVENT;

	/**
	 * The number of structural features of the '<em>Repair Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR_EVENT_FEATURE_COUNT = ERROR_BEHAVIOR_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Repair Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR_EVENT_OPERATION_COUNT = ERROR_BEHAVIOR_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NEsysml.EM.impl.RecoverEventImpl <em>Recover Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.EM.impl.RecoverEventImpl
	 * @see NEsysml.EM.impl.EMPackageImpl#getRecoverEvent()
	 * @generated
	 */
	int RECOVER_EVENT = 13;

	/**
	 * The feature id for the '<em><b>Base Change Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVER_EVENT__BASE_CHANGE_EVENT = ERROR_BEHAVIOR_EVENT__BASE_CHANGE_EVENT;

	/**
	 * The number of structural features of the '<em>Recover Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVER_EVENT_FEATURE_COUNT = ERROR_BEHAVIOR_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Recover Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVER_EVENT_OPERATION_COUNT = ERROR_BEHAVIOR_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NEsysml.EM.impl.ErrorTransitionTriggerImpl <em>Error Transition Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.EM.impl.ErrorTransitionTriggerImpl
	 * @see NEsysml.EM.impl.EMPackageImpl#getErrorTransitionTrigger()
	 * @generated
	 */
	int ERROR_TRANSITION_TRIGGER = 15;

	/**
	 * The feature id for the '<em><b>Owned Error Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION_TRIGGER__OWNED_ERROR_TYPE = ERROR_TYPED_ELEMENT__OWNED_ERROR_TYPE;

	/**
	 * The feature id for the '<em><b>Base Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION_TRIGGER__BASE_TRIGGER = ERROR_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Error Transition Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION_TRIGGER_FEATURE_COUNT = ERROR_TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Error Transition Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION_TRIGGER_OPERATION_COUNT = ERROR_TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NEsysml.EM.impl.ErrorEventTriggerImpl <em>Error Event Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.EM.impl.ErrorEventTriggerImpl
	 * @see NEsysml.EM.impl.EMPackageImpl#getErrorEventTrigger()
	 * @generated
	 */
	int ERROR_EVENT_TRIGGER = 14;

	/**
	 * The feature id for the '<em><b>Owned Error Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT_TRIGGER__OWNED_ERROR_TYPE = ERROR_TRANSITION_TRIGGER__OWNED_ERROR_TYPE;

	/**
	 * The feature id for the '<em><b>Base Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT_TRIGGER__BASE_TRIGGER = ERROR_TRANSITION_TRIGGER__BASE_TRIGGER;

	/**
	 * The feature id for the '<em><b>Error Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT_TRIGGER__ERROR_EVENT = ERROR_TRANSITION_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Error Event Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT_TRIGGER_FEATURE_COUNT = ERROR_TRANSITION_TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Error Event Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT_TRIGGER_OPERATION_COUNT = ERROR_TRANSITION_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NEsysml.EM.impl.ErrorBehaviorTransitionOrExpressionImpl <em>Error Behavior Transition Or Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.EM.impl.ErrorBehaviorTransitionOrExpressionImpl
	 * @see NEsysml.EM.impl.EMPackageImpl#getErrorBehaviorTransitionOrExpression()
	 * @generated
	 */
	int ERROR_BEHAVIOR_TRANSITION_OR_EXPRESSION = 16;

	/**
	 * The feature id for the '<em><b>Base Accept Event Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_TRANSITION_OR_EXPRESSION__BASE_ACCEPT_EVENT_ACTION = ERROR_BEHAVIOR_TRANSITION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Oprands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_TRANSITION_OR_EXPRESSION__OPRANDS = ERROR_BEHAVIOR_TRANSITION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Error Behavior Transition Or Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_TRANSITION_OR_EXPRESSION_FEATURE_COUNT = ERROR_BEHAVIOR_TRANSITION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Error Behavior Transition Or Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_TRANSITION_OR_EXPRESSION_OPERATION_COUNT = ERROR_BEHAVIOR_TRANSITION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NEsysml.EM.impl.PropagationPointTriggerImpl <em>Propagation Point Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.EM.impl.PropagationPointTriggerImpl
	 * @see NEsysml.EM.impl.EMPackageImpl#getPropagationPointTrigger()
	 * @generated
	 */
	int PROPAGATION_POINT_TRIGGER = 17;

	/**
	 * The feature id for the '<em><b>Owned Error Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_POINT_TRIGGER__OWNED_ERROR_TYPE = ERROR_TRANSITION_TRIGGER__OWNED_ERROR_TYPE;

	/**
	 * The feature id for the '<em><b>Base Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_POINT_TRIGGER__BASE_TRIGGER = ERROR_TRANSITION_TRIGGER__BASE_TRIGGER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_POINT_TRIGGER__CONTEXT = ERROR_TRANSITION_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_POINT_TRIGGER__POINT = ERROR_TRANSITION_TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Propagation Point Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_POINT_TRIGGER_FEATURE_COUNT = ERROR_TRANSITION_TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Propagation Point Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_POINT_TRIGGER_OPERATION_COUNT = ERROR_TRANSITION_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NEsysml.EM.impl.ErrorPropagationPointImpl <em>Error Propagation Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.EM.impl.ErrorPropagationPointImpl
	 * @see NEsysml.EM.impl.EMPackageImpl#getErrorPropagationPoint()
	 * @generated
	 */
	int ERROR_PROPAGATION_POINT = 18;

	/**
	 * The feature id for the '<em><b>Owned Error Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION_POINT__OWNED_ERROR_TYPE = ERROR_TYPED_ELEMENT__OWNED_ERROR_TYPE;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION_POINT__BASE_PORT = ERROR_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bind Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION_POINT__BIND_FEATURE = ERROR_TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Error Propagation Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION_POINT_FEATURE_COUNT = ERROR_TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Error Propagation Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION_POINT_OPERATION_COUNT = ERROR_TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NEsysml.EM.impl.ErrorBehaviorTransitionAndExpressionImpl <em>Error Behavior Transition And Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.EM.impl.ErrorBehaviorTransitionAndExpressionImpl
	 * @see NEsysml.EM.impl.EMPackageImpl#getErrorBehaviorTransitionAndExpression()
	 * @generated
	 */
	int ERROR_BEHAVIOR_TRANSITION_AND_EXPRESSION = 19;

	/**
	 * The feature id for the '<em><b>Base Join Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_TRANSITION_AND_EXPRESSION__BASE_JOIN_NODE = ERROR_BEHAVIOR_TRANSITION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Expression</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_TRANSITION_AND_EXPRESSION__OWNED_EXPRESSION = ERROR_BEHAVIOR_TRANSITION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Error Behavior Transition And Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_TRANSITION_AND_EXPRESSION_FEATURE_COUNT = ERROR_BEHAVIOR_TRANSITION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Error Behavior Transition And Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_TRANSITION_AND_EXPRESSION_OPERATION_COUNT = ERROR_BEHAVIOR_TRANSITION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NEsysml.EM.impl.ComponentErrorBehaviorImpl <em>Component Error Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.EM.impl.ComponentErrorBehaviorImpl
	 * @see NEsysml.EM.impl.EMPackageImpl#getComponentErrorBehavior()
	 * @generated
	 */
	int COMPONENT_ERROR_BEHAVIOR = 20;

	/**
	 * The feature id for the '<em><b>Base State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ERROR_BEHAVIOR__BASE_STATE_MACHINE = ERROR_BEHAVIOR__BASE_STATE_MACHINE;

	/**
	 * The feature id for the '<em><b>Owned Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ERROR_BEHAVIOR__OWNED_EVENT = ERROR_BEHAVIOR__OWNED_EVENT;

	/**
	 * The feature id for the '<em><b>Owned State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ERROR_BEHAVIOR__OWNED_STATE = ERROR_BEHAVIOR__OWNED_STATE;

	/**
	 * The feature id for the '<em><b>Owned Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ERROR_BEHAVIOR__OWNED_TRANSITION = ERROR_BEHAVIOR__OWNED_TRANSITION;

	/**
	 * The feature id for the '<em><b>Use Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ERROR_BEHAVIOR__USE_TYPE = ERROR_BEHAVIOR__USE_TYPE;

	/**
	 * The feature id for the '<em><b>Import Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ERROR_BEHAVIOR__IMPORT_BEHAVIOR = ERROR_BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Error Propagation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ERROR_BEHAVIOR__OWNED_ERROR_PROPAGATION = ERROR_BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Error Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ERROR_BEHAVIOR_FEATURE_COUNT = ERROR_BEHAVIOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Component Error Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ERROR_BEHAVIOR_OPERATION_COUNT = ERROR_BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NEsysml.EM.impl.ErrorPropagationImpl <em>Error Propagation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.EM.impl.ErrorPropagationImpl
	 * @see NEsysml.EM.impl.EMPackageImpl#getErrorPropagation()
	 * @generated
	 */
	int ERROR_PROPAGATION = 21;

	/**
	 * The feature id for the '<em><b>Base Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION__BASE_TRANSITION = ERROR_BEHAVIOR_TRANSITION__BASE_TRANSITION;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION__FROM = ERROR_BEHAVIOR_TRANSITION__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION__TO = ERROR_BEHAVIOR_TRANSITION__TO;

	/**
	 * The feature id for the '<em><b>Trans Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION__TRANS_CONDITION = ERROR_BEHAVIOR_TRANSITION__TRANS_CONDITION;

	/**
	 * The feature id for the '<em><b>Type Set Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION__TYPE_SET_CONSTRAINT = ERROR_BEHAVIOR_TRANSITION__TYPE_SET_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Type Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION__TYPE_SET = ERROR_BEHAVIOR_TRANSITION__TYPE_SET;

	/**
	 * The feature id for the '<em><b>Owned Branches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION__OWNED_BRANCHES = ERROR_BEHAVIOR_TRANSITION__OWNED_BRANCHES;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION__TARGET = ERROR_BEHAVIOR_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Error Propagation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION_FEATURE_COUNT = ERROR_BEHAVIOR_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Error Propagation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION_OPERATION_COUNT = ERROR_BEHAVIOR_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NEsysml.EM.impl.ErrorModelSubclauseImpl <em>Error Model Subclause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.EM.impl.ErrorModelSubclauseImpl
	 * @see NEsysml.EM.impl.EMPackageImpl#getErrorModelSubclause()
	 * @generated
	 */
	int ERROR_MODEL_SUBCLAUSE = 22;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_SUBCLAUSE__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Owned Propagation Point</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_SUBCLAUSE__OWNED_PROPAGATION_POINT = 1;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_SUBCLAUSE__OWNED_BEHAVIOR = 2;

	/**
	 * The feature id for the '<em><b>Use Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_SUBCLAUSE__USE_TYPES = 3;

	/**
	 * The number of structural features of the '<em>Error Model Subclause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_SUBCLAUSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Error Model Subclause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_SUBCLAUSE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link NEsysml.EM.ErrorModelLibrary <em>Error Model Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Model Library</em>'.
	 * @see NEsysml.EM.ErrorModelLibrary
	 * @generated
	 */
	EClass getErrorModelLibrary();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.EM.ErrorModelLibrary#getOwnedBehaviors <em>Owned Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Behaviors</em>'.
	 * @see NEsysml.EM.ErrorModelLibrary#getOwnedBehaviors()
	 * @see #getErrorModelLibrary()
	 * @generated
	 */
	EReference getErrorModelLibrary_OwnedBehaviors();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.EM.ErrorModelLibrary#getOwnedErrorType <em>Owned Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Error Type</em>'.
	 * @see NEsysml.EM.ErrorModelLibrary#getOwnedErrorType()
	 * @see #getErrorModelLibrary()
	 * @generated
	 */
	EReference getErrorModelLibrary_OwnedErrorType();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.EM.ErrorModelLibrary#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Import</em>'.
	 * @see NEsysml.EM.ErrorModelLibrary#getImport()
	 * @see #getErrorModelLibrary()
	 * @generated
	 */
	EReference getErrorModelLibrary_Import();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.EM.ErrorModelLibrary#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see NEsysml.EM.ErrorModelLibrary#getBase_Package()
	 * @see #getErrorModelLibrary()
	 * @generated
	 */
	EReference getErrorModelLibrary_Base_Package();

	/**
	 * Returns the meta object for class '{@link NEsysml.EM.ErrorBehaviorStateMachine <em>Error Behavior State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Behavior State Machine</em>'.
	 * @see NEsysml.EM.ErrorBehaviorStateMachine
	 * @generated
	 */
	EClass getErrorBehaviorStateMachine();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.EM.ErrorBehaviorStateMachine#getInPackage <em>In Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Package</em>'.
	 * @see NEsysml.EM.ErrorBehaviorStateMachine#getInPackage()
	 * @see #getErrorBehaviorStateMachine()
	 * @generated
	 */
	EReference getErrorBehaviorStateMachine_InPackage();

	/**
	 * Returns the meta object for class '{@link NEsysml.EM.ErrorBehavior <em>Error Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Behavior</em>'.
	 * @see NEsysml.EM.ErrorBehavior
	 * @generated
	 */
	EClass getErrorBehavior();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.EM.ErrorBehavior#getBase_StateMachine <em>Base State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base State Machine</em>'.
	 * @see NEsysml.EM.ErrorBehavior#getBase_StateMachine()
	 * @see #getErrorBehavior()
	 * @generated
	 */
	EReference getErrorBehavior_Base_StateMachine();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.EM.ErrorBehavior#getOwnedEvent <em>Owned Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Event</em>'.
	 * @see NEsysml.EM.ErrorBehavior#getOwnedEvent()
	 * @see #getErrorBehavior()
	 * @generated
	 */
	EReference getErrorBehavior_OwnedEvent();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.EM.ErrorBehavior#getOwnedState <em>Owned State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned State</em>'.
	 * @see NEsysml.EM.ErrorBehavior#getOwnedState()
	 * @see #getErrorBehavior()
	 * @generated
	 */
	EReference getErrorBehavior_OwnedState();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.EM.ErrorBehavior#getOwnedTransition <em>Owned Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Transition</em>'.
	 * @see NEsysml.EM.ErrorBehavior#getOwnedTransition()
	 * @see #getErrorBehavior()
	 * @generated
	 */
	EReference getErrorBehavior_OwnedTransition();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.EM.ErrorBehavior#getUseType <em>Use Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Use Type</em>'.
	 * @see NEsysml.EM.ErrorBehavior#getUseType()
	 * @see #getErrorBehavior()
	 * @generated
	 */
	EReference getErrorBehavior_UseType();

	/**
	 * Returns the meta object for class '{@link NEsysml.EM.ErrorBehaviorEvent <em>Error Behavior Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Behavior Event</em>'.
	 * @see NEsysml.EM.ErrorBehaviorEvent
	 * @generated
	 */
	EClass getErrorBehaviorEvent();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.EM.ErrorBehaviorEvent#getBase_ChangeEvent <em>Base Change Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Change Event</em>'.
	 * @see NEsysml.EM.ErrorBehaviorEvent#getBase_ChangeEvent()
	 * @see #getErrorBehaviorEvent()
	 * @generated
	 */
	EReference getErrorBehaviorEvent_Base_ChangeEvent();

	/**
	 * Returns the meta object for class '{@link NEsysml.EM.ErrorBehaviorState <em>Error Behavior State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Behavior State</em>'.
	 * @see NEsysml.EM.ErrorBehaviorState
	 * @generated
	 */
	EClass getErrorBehaviorState();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.EM.ErrorBehaviorState#getBase_State <em>Base State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base State</em>'.
	 * @see NEsysml.EM.ErrorBehaviorState#getBase_State()
	 * @see #getErrorBehaviorState()
	 * @generated
	 */
	EReference getErrorBehaviorState_Base_State();

	/**
	 * Returns the meta object for the attribute '{@link NEsysml.EM.ErrorBehaviorState#isInitial <em>Is Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Initial</em>'.
	 * @see NEsysml.EM.ErrorBehaviorState#isInitial()
	 * @see #getErrorBehaviorState()
	 * @generated
	 */
	EAttribute getErrorBehaviorState_IsInitial();

	/**
	 * Returns the meta object for class '{@link NEsysml.EM.ErrorTypedElement <em>Error Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Typed Element</em>'.
	 * @see NEsysml.EM.ErrorTypedElement
	 * @generated
	 */
	EClass getErrorTypedElement();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.EM.ErrorTypedElement#getOwnedErrorType <em>Owned Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Error Type</em>'.
	 * @see NEsysml.EM.ErrorTypedElement#getOwnedErrorType()
	 * @see #getErrorTypedElement()
	 * @generated
	 */
	EReference getErrorTypedElement_OwnedErrorType();

	/**
	 * Returns the meta object for class '{@link NEsysml.EM.ErrorType <em>Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Type</em>'.
	 * @see NEsysml.EM.ErrorType
	 * @generated
	 */
	EClass getErrorType();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.EM.ErrorType#getBase_DataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see NEsysml.EM.ErrorType#getBase_DataType()
	 * @see #getErrorType()
	 * @generated
	 */
	EReference getErrorType_Base_DataType();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.EM.ErrorType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extension</em>'.
	 * @see NEsysml.EM.ErrorType#getExtension()
	 * @see #getErrorType()
	 * @generated
	 */
	EReference getErrorType_Extension();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.EM.ErrorType#getInLibrary <em>In Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Library</em>'.
	 * @see NEsysml.EM.ErrorType#getInLibrary()
	 * @see #getErrorType()
	 * @generated
	 */
	EReference getErrorType_InLibrary();

	/**
	 * Returns the meta object for class '{@link NEsysml.EM.ErrorBehaviorTransition <em>Error Behavior Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Behavior Transition</em>'.
	 * @see NEsysml.EM.ErrorBehaviorTransition
	 * @generated
	 */
	EClass getErrorBehaviorTransition();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.EM.ErrorBehaviorTransition#getBase_Transition <em>Base Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Transition</em>'.
	 * @see NEsysml.EM.ErrorBehaviorTransition#getBase_Transition()
	 * @see #getErrorBehaviorTransition()
	 * @generated
	 */
	EReference getErrorBehaviorTransition_Base_Transition();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.EM.ErrorBehaviorTransition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see NEsysml.EM.ErrorBehaviorTransition#getFrom()
	 * @see #getErrorBehaviorTransition()
	 * @generated
	 */
	EReference getErrorBehaviorTransition_From();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.EM.ErrorBehaviorTransition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see NEsysml.EM.ErrorBehaviorTransition#getTo()
	 * @see #getErrorBehaviorTransition()
	 * @generated
	 */
	EReference getErrorBehaviorTransition_To();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.EM.ErrorBehaviorTransition#getTransCondition <em>Trans Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trans Condition</em>'.
	 * @see NEsysml.EM.ErrorBehaviorTransition#getTransCondition()
	 * @see #getErrorBehaviorTransition()
	 * @generated
	 */
	EReference getErrorBehaviorTransition_TransCondition();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.EM.ErrorBehaviorTransition#getTypeSetConstraint <em>Type Set Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type Set Constraint</em>'.
	 * @see NEsysml.EM.ErrorBehaviorTransition#getTypeSetConstraint()
	 * @see #getErrorBehaviorTransition()
	 * @generated
	 */
	EReference getErrorBehaviorTransition_TypeSetConstraint();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.EM.ErrorBehaviorTransition#getTypeSet <em>Type Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type Set</em>'.
	 * @see NEsysml.EM.ErrorBehaviorTransition#getTypeSet()
	 * @see #getErrorBehaviorTransition()
	 * @generated
	 */
	EReference getErrorBehaviorTransition_TypeSet();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.EM.ErrorBehaviorTransition#getOwnedBranches <em>Owned Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Branches</em>'.
	 * @see NEsysml.EM.ErrorBehaviorTransition#getOwnedBranches()
	 * @see #getErrorBehaviorTransition()
	 * @generated
	 */
	EReference getErrorBehaviorTransition_OwnedBranches();

	/**
	 * Returns the meta object for class '{@link NEsysml.EM.ErrorBehaviorTransitionCondition <em>Error Behavior Transition Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Behavior Transition Condition</em>'.
	 * @see NEsysml.EM.ErrorBehaviorTransitionCondition
	 * @generated
	 */
	EClass getErrorBehaviorTransitionCondition();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.EM.ErrorBehaviorTransitionCondition#getBase_Activity <em>Base Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Activity</em>'.
	 * @see NEsysml.EM.ErrorBehaviorTransitionCondition#getBase_Activity()
	 * @see #getErrorBehaviorTransitionCondition()
	 * @generated
	 */
	EReference getErrorBehaviorTransitionCondition_Base_Activity();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.EM.ErrorBehaviorTransitionCondition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see NEsysml.EM.ErrorBehaviorTransitionCondition#getExpression()
	 * @see #getErrorBehaviorTransitionCondition()
	 * @generated
	 */
	EReference getErrorBehaviorTransitionCondition_Expression();

	/**
	 * Returns the meta object for class '{@link NEsysml.EM.ErrorBehaviorTransitionExpression <em>Error Behavior Transition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Behavior Transition Expression</em>'.
	 * @see NEsysml.EM.ErrorBehaviorTransitionExpression
	 * @generated
	 */
	EClass getErrorBehaviorTransitionExpression();

	/**
	 * Returns the meta object for class '{@link NEsysml.EM.TransitionBranch <em>Transition Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Branch</em>'.
	 * @see NEsysml.EM.TransitionBranch
	 * @generated
	 */
	EClass getTransitionBranch();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.EM.TransitionBranch#getBase_Transition <em>Base Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Transition</em>'.
	 * @see NEsysml.EM.TransitionBranch#getBase_Transition()
	 * @see #getTransitionBranch()
	 * @generated
	 */
	EReference getTransitionBranch_Base_Transition();

	/**
	 * Returns the meta object for the attribute '{@link NEsysml.EM.TransitionBranch#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see NEsysml.EM.TransitionBranch#getProbability()
	 * @see #getTransitionBranch()
	 * @generated
	 */
	EAttribute getTransitionBranch_Probability();

	/**
	 * Returns the meta object for the attribute '{@link NEsysml.EM.TransitionBranch#isOthers <em>Is Others</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Others</em>'.
	 * @see NEsysml.EM.TransitionBranch#isOthers()
	 * @see #getTransitionBranch()
	 * @generated
	 */
	EAttribute getTransitionBranch_IsOthers();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.EM.TransitionBranch#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see NEsysml.EM.TransitionBranch#getTarget()
	 * @see #getTransitionBranch()
	 * @generated
	 */
	EReference getTransitionBranch_Target();

	/**
	 * Returns the meta object for class '{@link NEsysml.EM.ErrorEvent <em>Error Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Event</em>'.
	 * @see NEsysml.EM.ErrorEvent
	 * @generated
	 */
	EClass getErrorEvent();

	/**
	 * Returns the meta object for class '{@link NEsysml.EM.RepairEvent <em>Repair Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repair Event</em>'.
	 * @see NEsysml.EM.RepairEvent
	 * @generated
	 */
	EClass getRepairEvent();

	/**
	 * Returns the meta object for class '{@link NEsysml.EM.RecoverEvent <em>Recover Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recover Event</em>'.
	 * @see NEsysml.EM.RecoverEvent
	 * @generated
	 */
	EClass getRecoverEvent();

	/**
	 * Returns the meta object for class '{@link NEsysml.EM.ErrorEventTrigger <em>Error Event Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Event Trigger</em>'.
	 * @see NEsysml.EM.ErrorEventTrigger
	 * @generated
	 */
	EClass getErrorEventTrigger();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.EM.ErrorEventTrigger#getErrorEvent <em>Error Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error Event</em>'.
	 * @see NEsysml.EM.ErrorEventTrigger#getErrorEvent()
	 * @see #getErrorEventTrigger()
	 * @generated
	 */
	EReference getErrorEventTrigger_ErrorEvent();

	/**
	 * Returns the meta object for class '{@link NEsysml.EM.ErrorTransitionTrigger <em>Error Transition Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Transition Trigger</em>'.
	 * @see NEsysml.EM.ErrorTransitionTrigger
	 * @generated
	 */
	EClass getErrorTransitionTrigger();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.EM.ErrorTransitionTrigger#getBase_Trigger <em>Base Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Trigger</em>'.
	 * @see NEsysml.EM.ErrorTransitionTrigger#getBase_Trigger()
	 * @see #getErrorTransitionTrigger()
	 * @generated
	 */
	EReference getErrorTransitionTrigger_Base_Trigger();

	/**
	 * Returns the meta object for class '{@link NEsysml.EM.ErrorBehaviorTransitionOrExpression <em>Error Behavior Transition Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Behavior Transition Or Expression</em>'.
	 * @see NEsysml.EM.ErrorBehaviorTransitionOrExpression
	 * @generated
	 */
	EClass getErrorBehaviorTransitionOrExpression();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.EM.ErrorBehaviorTransitionOrExpression#getBase_AcceptEventAction <em>Base Accept Event Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Accept Event Action</em>'.
	 * @see NEsysml.EM.ErrorBehaviorTransitionOrExpression#getBase_AcceptEventAction()
	 * @see #getErrorBehaviorTransitionOrExpression()
	 * @generated
	 */
	EReference getErrorBehaviorTransitionOrExpression_Base_AcceptEventAction();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.EM.ErrorBehaviorTransitionOrExpression#getOprands <em>Oprands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Oprands</em>'.
	 * @see NEsysml.EM.ErrorBehaviorTransitionOrExpression#getOprands()
	 * @see #getErrorBehaviorTransitionOrExpression()
	 * @generated
	 */
	EReference getErrorBehaviorTransitionOrExpression_Oprands();

	/**
	 * Returns the meta object for class '{@link NEsysml.EM.PropagationPointTrigger <em>Propagation Point Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagation Point Trigger</em>'.
	 * @see NEsysml.EM.PropagationPointTrigger
	 * @generated
	 */
	EClass getPropagationPointTrigger();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.EM.PropagationPointTrigger#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see NEsysml.EM.PropagationPointTrigger#getContext()
	 * @see #getPropagationPointTrigger()
	 * @generated
	 */
	EReference getPropagationPointTrigger_Context();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.EM.PropagationPointTrigger#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Point</em>'.
	 * @see NEsysml.EM.PropagationPointTrigger#getPoint()
	 * @see #getPropagationPointTrigger()
	 * @generated
	 */
	EReference getPropagationPointTrigger_Point();

	/**
	 * Returns the meta object for class '{@link NEsysml.EM.ErrorPropagationPoint <em>Error Propagation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Propagation Point</em>'.
	 * @see NEsysml.EM.ErrorPropagationPoint
	 * @generated
	 */
	EClass getErrorPropagationPoint();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.EM.ErrorPropagationPoint#getBindFeature <em>Bind Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bind Feature</em>'.
	 * @see NEsysml.EM.ErrorPropagationPoint#getBindFeature()
	 * @see #getErrorPropagationPoint()
	 * @generated
	 */
	EReference getErrorPropagationPoint_BindFeature();

	/**
	 * Returns the meta object for class '{@link NEsysml.EM.ErrorBehaviorTransitionAndExpression <em>Error Behavior Transition And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Behavior Transition And Expression</em>'.
	 * @see NEsysml.EM.ErrorBehaviorTransitionAndExpression
	 * @generated
	 */
	EClass getErrorBehaviorTransitionAndExpression();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.EM.ErrorBehaviorTransitionAndExpression#getBase_JoinNode <em>Base Join Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Join Node</em>'.
	 * @see NEsysml.EM.ErrorBehaviorTransitionAndExpression#getBase_JoinNode()
	 * @see #getErrorBehaviorTransitionAndExpression()
	 * @generated
	 */
	EReference getErrorBehaviorTransitionAndExpression_Base_JoinNode();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.EM.ErrorBehaviorTransitionAndExpression#getOwnedExpression <em>Owned Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Expression</em>'.
	 * @see NEsysml.EM.ErrorBehaviorTransitionAndExpression#getOwnedExpression()
	 * @see #getErrorBehaviorTransitionAndExpression()
	 * @generated
	 */
	EReference getErrorBehaviorTransitionAndExpression_OwnedExpression();

	/**
	 * Returns the meta object for class '{@link NEsysml.EM.ComponentErrorBehavior <em>Component Error Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Error Behavior</em>'.
	 * @see NEsysml.EM.ComponentErrorBehavior
	 * @generated
	 */
	EClass getComponentErrorBehavior();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.EM.ComponentErrorBehavior#getImportBehavior <em>Import Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import Behavior</em>'.
	 * @see NEsysml.EM.ComponentErrorBehavior#getImportBehavior()
	 * @see #getComponentErrorBehavior()
	 * @generated
	 */
	EReference getComponentErrorBehavior_ImportBehavior();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.EM.ComponentErrorBehavior#getOwnedErrorPropagation <em>Owned Error Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Error Propagation</em>'.
	 * @see NEsysml.EM.ComponentErrorBehavior#getOwnedErrorPropagation()
	 * @see #getComponentErrorBehavior()
	 * @generated
	 */
	EReference getComponentErrorBehavior_OwnedErrorPropagation();

	/**
	 * Returns the meta object for class '{@link NEsysml.EM.ErrorPropagation <em>Error Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Propagation</em>'.
	 * @see NEsysml.EM.ErrorPropagation
	 * @generated
	 */
	EClass getErrorPropagation();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.EM.ErrorPropagation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see NEsysml.EM.ErrorPropagation#getTarget()
	 * @see #getErrorPropagation()
	 * @generated
	 */
	EReference getErrorPropagation_Target();

	/**
	 * Returns the meta object for class '{@link NEsysml.EM.ErrorModelSubclause <em>Error Model Subclause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Model Subclause</em>'.
	 * @see NEsysml.EM.ErrorModelSubclause
	 * @generated
	 */
	EClass getErrorModelSubclause();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.EM.ErrorModelSubclause#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see NEsysml.EM.ErrorModelSubclause#getBase_Class()
	 * @see #getErrorModelSubclause()
	 * @generated
	 */
	EReference getErrorModelSubclause_Base_Class();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.EM.ErrorModelSubclause#getOwnedPropagationPoint <em>Owned Propagation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Propagation Point</em>'.
	 * @see NEsysml.EM.ErrorModelSubclause#getOwnedPropagationPoint()
	 * @see #getErrorModelSubclause()
	 * @generated
	 */
	EReference getErrorModelSubclause_OwnedPropagationPoint();

	/**
	 * Returns the meta object for the reference '{@link NEsysml.EM.ErrorModelSubclause#getOwnedBehavior <em>Owned Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owned Behavior</em>'.
	 * @see NEsysml.EM.ErrorModelSubclause#getOwnedBehavior()
	 * @see #getErrorModelSubclause()
	 * @generated
	 */
	EReference getErrorModelSubclause_OwnedBehavior();

	/**
	 * Returns the meta object for the reference list '{@link NEsysml.EM.ErrorModelSubclause#getUseTypes <em>Use Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Use Types</em>'.
	 * @see NEsysml.EM.ErrorModelSubclause#getUseTypes()
	 * @see #getErrorModelSubclause()
	 * @generated
	 */
	EReference getErrorModelSubclause_UseTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EMFactory getEMFactory();

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
		 * The meta object literal for the '{@link NEsysml.EM.impl.ErrorModelLibraryImpl <em>Error Model Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.EM.impl.ErrorModelLibraryImpl
		 * @see NEsysml.EM.impl.EMPackageImpl#getErrorModelLibrary()
		 * @generated
		 */
		EClass ERROR_MODEL_LIBRARY = eINSTANCE.getErrorModelLibrary();

		/**
		 * The meta object literal for the '<em><b>Owned Behaviors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_LIBRARY__OWNED_BEHAVIORS = eINSTANCE.getErrorModelLibrary_OwnedBehaviors();

		/**
		 * The meta object literal for the '<em><b>Owned Error Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_LIBRARY__OWNED_ERROR_TYPE = eINSTANCE.getErrorModelLibrary_OwnedErrorType();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_LIBRARY__IMPORT = eINSTANCE.getErrorModelLibrary_Import();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_LIBRARY__BASE_PACKAGE = eINSTANCE.getErrorModelLibrary_Base_Package();

		/**
		 * The meta object literal for the '{@link NEsysml.EM.impl.ErrorBehaviorStateMachineImpl <em>Error Behavior State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.EM.impl.ErrorBehaviorStateMachineImpl
		 * @see NEsysml.EM.impl.EMPackageImpl#getErrorBehaviorStateMachine()
		 * @generated
		 */
		EClass ERROR_BEHAVIOR_STATE_MACHINE = eINSTANCE.getErrorBehaviorStateMachine();

		/**
		 * The meta object literal for the '<em><b>In Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR_STATE_MACHINE__IN_PACKAGE = eINSTANCE.getErrorBehaviorStateMachine_InPackage();

		/**
		 * The meta object literal for the '{@link NEsysml.EM.impl.ErrorBehaviorImpl <em>Error Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.EM.impl.ErrorBehaviorImpl
		 * @see NEsysml.EM.impl.EMPackageImpl#getErrorBehavior()
		 * @generated
		 */
		EClass ERROR_BEHAVIOR = eINSTANCE.getErrorBehavior();

		/**
		 * The meta object literal for the '<em><b>Base State Machine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR__BASE_STATE_MACHINE = eINSTANCE.getErrorBehavior_Base_StateMachine();

		/**
		 * The meta object literal for the '<em><b>Owned Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR__OWNED_EVENT = eINSTANCE.getErrorBehavior_OwnedEvent();

		/**
		 * The meta object literal for the '<em><b>Owned State</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR__OWNED_STATE = eINSTANCE.getErrorBehavior_OwnedState();

		/**
		 * The meta object literal for the '<em><b>Owned Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR__OWNED_TRANSITION = eINSTANCE.getErrorBehavior_OwnedTransition();

		/**
		 * The meta object literal for the '<em><b>Use Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR__USE_TYPE = eINSTANCE.getErrorBehavior_UseType();

		/**
		 * The meta object literal for the '{@link NEsysml.EM.impl.ErrorBehaviorEventImpl <em>Error Behavior Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.EM.impl.ErrorBehaviorEventImpl
		 * @see NEsysml.EM.impl.EMPackageImpl#getErrorBehaviorEvent()
		 * @generated
		 */
		EClass ERROR_BEHAVIOR_EVENT = eINSTANCE.getErrorBehaviorEvent();

		/**
		 * The meta object literal for the '<em><b>Base Change Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR_EVENT__BASE_CHANGE_EVENT = eINSTANCE.getErrorBehaviorEvent_Base_ChangeEvent();

		/**
		 * The meta object literal for the '{@link NEsysml.EM.impl.ErrorBehaviorStateImpl <em>Error Behavior State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.EM.impl.ErrorBehaviorStateImpl
		 * @see NEsysml.EM.impl.EMPackageImpl#getErrorBehaviorState()
		 * @generated
		 */
		EClass ERROR_BEHAVIOR_STATE = eINSTANCE.getErrorBehaviorState();

		/**
		 * The meta object literal for the '<em><b>Base State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR_STATE__BASE_STATE = eINSTANCE.getErrorBehaviorState_Base_State();

		/**
		 * The meta object literal for the '<em><b>Is Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_BEHAVIOR_STATE__IS_INITIAL = eINSTANCE.getErrorBehaviorState_IsInitial();

		/**
		 * The meta object literal for the '{@link NEsysml.EM.impl.ErrorTypedElementImpl <em>Error Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.EM.impl.ErrorTypedElementImpl
		 * @see NEsysml.EM.impl.EMPackageImpl#getErrorTypedElement()
		 * @generated
		 */
		EClass ERROR_TYPED_ELEMENT = eINSTANCE.getErrorTypedElement();

		/**
		 * The meta object literal for the '<em><b>Owned Error Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_TYPED_ELEMENT__OWNED_ERROR_TYPE = eINSTANCE.getErrorTypedElement_OwnedErrorType();

		/**
		 * The meta object literal for the '{@link NEsysml.EM.impl.ErrorTypeImpl <em>Error Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.EM.impl.ErrorTypeImpl
		 * @see NEsysml.EM.impl.EMPackageImpl#getErrorType()
		 * @generated
		 */
		EClass ERROR_TYPE = eINSTANCE.getErrorType();

		/**
		 * The meta object literal for the '<em><b>Base Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_TYPE__BASE_DATA_TYPE = eINSTANCE.getErrorType_Base_DataType();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_TYPE__EXTENSION = eINSTANCE.getErrorType_Extension();

		/**
		 * The meta object literal for the '<em><b>In Library</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_TYPE__IN_LIBRARY = eINSTANCE.getErrorType_InLibrary();

		/**
		 * The meta object literal for the '{@link NEsysml.EM.impl.ErrorBehaviorTransitionImpl <em>Error Behavior Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.EM.impl.ErrorBehaviorTransitionImpl
		 * @see NEsysml.EM.impl.EMPackageImpl#getErrorBehaviorTransition()
		 * @generated
		 */
		EClass ERROR_BEHAVIOR_TRANSITION = eINSTANCE.getErrorBehaviorTransition();

		/**
		 * The meta object literal for the '<em><b>Base Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR_TRANSITION__BASE_TRANSITION = eINSTANCE.getErrorBehaviorTransition_Base_Transition();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR_TRANSITION__FROM = eINSTANCE.getErrorBehaviorTransition_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR_TRANSITION__TO = eINSTANCE.getErrorBehaviorTransition_To();

		/**
		 * The meta object literal for the '<em><b>Trans Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR_TRANSITION__TRANS_CONDITION = eINSTANCE.getErrorBehaviorTransition_TransCondition();

		/**
		 * The meta object literal for the '<em><b>Type Set Constraint</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR_TRANSITION__TYPE_SET_CONSTRAINT = eINSTANCE.getErrorBehaviorTransition_TypeSetConstraint();

		/**
		 * The meta object literal for the '<em><b>Type Set</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR_TRANSITION__TYPE_SET = eINSTANCE.getErrorBehaviorTransition_TypeSet();

		/**
		 * The meta object literal for the '<em><b>Owned Branches</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR_TRANSITION__OWNED_BRANCHES = eINSTANCE.getErrorBehaviorTransition_OwnedBranches();

		/**
		 * The meta object literal for the '{@link NEsysml.EM.impl.ErrorBehaviorTransitionConditionImpl <em>Error Behavior Transition Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.EM.impl.ErrorBehaviorTransitionConditionImpl
		 * @see NEsysml.EM.impl.EMPackageImpl#getErrorBehaviorTransitionCondition()
		 * @generated
		 */
		EClass ERROR_BEHAVIOR_TRANSITION_CONDITION = eINSTANCE.getErrorBehaviorTransitionCondition();

		/**
		 * The meta object literal for the '<em><b>Base Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR_TRANSITION_CONDITION__BASE_ACTIVITY = eINSTANCE.getErrorBehaviorTransitionCondition_Base_Activity();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR_TRANSITION_CONDITION__EXPRESSION = eINSTANCE.getErrorBehaviorTransitionCondition_Expression();

		/**
		 * The meta object literal for the '{@link NEsysml.EM.impl.ErrorBehaviorTransitionExpressionImpl <em>Error Behavior Transition Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.EM.impl.ErrorBehaviorTransitionExpressionImpl
		 * @see NEsysml.EM.impl.EMPackageImpl#getErrorBehaviorTransitionExpression()
		 * @generated
		 */
		EClass ERROR_BEHAVIOR_TRANSITION_EXPRESSION = eINSTANCE.getErrorBehaviorTransitionExpression();

		/**
		 * The meta object literal for the '{@link NEsysml.EM.impl.TransitionBranchImpl <em>Transition Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.EM.impl.TransitionBranchImpl
		 * @see NEsysml.EM.impl.EMPackageImpl#getTransitionBranch()
		 * @generated
		 */
		EClass TRANSITION_BRANCH = eINSTANCE.getTransitionBranch();

		/**
		 * The meta object literal for the '<em><b>Base Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_BRANCH__BASE_TRANSITION = eINSTANCE.getTransitionBranch_Base_Transition();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_BRANCH__PROBABILITY = eINSTANCE.getTransitionBranch_Probability();

		/**
		 * The meta object literal for the '<em><b>Is Others</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_BRANCH__IS_OTHERS = eINSTANCE.getTransitionBranch_IsOthers();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_BRANCH__TARGET = eINSTANCE.getTransitionBranch_Target();

		/**
		 * The meta object literal for the '{@link NEsysml.EM.impl.ErrorEventImpl <em>Error Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.EM.impl.ErrorEventImpl
		 * @see NEsysml.EM.impl.EMPackageImpl#getErrorEvent()
		 * @generated
		 */
		EClass ERROR_EVENT = eINSTANCE.getErrorEvent();

		/**
		 * The meta object literal for the '{@link NEsysml.EM.impl.RepairEventImpl <em>Repair Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.EM.impl.RepairEventImpl
		 * @see NEsysml.EM.impl.EMPackageImpl#getRepairEvent()
		 * @generated
		 */
		EClass REPAIR_EVENT = eINSTANCE.getRepairEvent();

		/**
		 * The meta object literal for the '{@link NEsysml.EM.impl.RecoverEventImpl <em>Recover Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.EM.impl.RecoverEventImpl
		 * @see NEsysml.EM.impl.EMPackageImpl#getRecoverEvent()
		 * @generated
		 */
		EClass RECOVER_EVENT = eINSTANCE.getRecoverEvent();

		/**
		 * The meta object literal for the '{@link NEsysml.EM.impl.ErrorEventTriggerImpl <em>Error Event Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.EM.impl.ErrorEventTriggerImpl
		 * @see NEsysml.EM.impl.EMPackageImpl#getErrorEventTrigger()
		 * @generated
		 */
		EClass ERROR_EVENT_TRIGGER = eINSTANCE.getErrorEventTrigger();

		/**
		 * The meta object literal for the '<em><b>Error Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_EVENT_TRIGGER__ERROR_EVENT = eINSTANCE.getErrorEventTrigger_ErrorEvent();

		/**
		 * The meta object literal for the '{@link NEsysml.EM.impl.ErrorTransitionTriggerImpl <em>Error Transition Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.EM.impl.ErrorTransitionTriggerImpl
		 * @see NEsysml.EM.impl.EMPackageImpl#getErrorTransitionTrigger()
		 * @generated
		 */
		EClass ERROR_TRANSITION_TRIGGER = eINSTANCE.getErrorTransitionTrigger();

		/**
		 * The meta object literal for the '<em><b>Base Trigger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_TRANSITION_TRIGGER__BASE_TRIGGER = eINSTANCE.getErrorTransitionTrigger_Base_Trigger();

		/**
		 * The meta object literal for the '{@link NEsysml.EM.impl.ErrorBehaviorTransitionOrExpressionImpl <em>Error Behavior Transition Or Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.EM.impl.ErrorBehaviorTransitionOrExpressionImpl
		 * @see NEsysml.EM.impl.EMPackageImpl#getErrorBehaviorTransitionOrExpression()
		 * @generated
		 */
		EClass ERROR_BEHAVIOR_TRANSITION_OR_EXPRESSION = eINSTANCE.getErrorBehaviorTransitionOrExpression();

		/**
		 * The meta object literal for the '<em><b>Base Accept Event Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR_TRANSITION_OR_EXPRESSION__BASE_ACCEPT_EVENT_ACTION = eINSTANCE.getErrorBehaviorTransitionOrExpression_Base_AcceptEventAction();

		/**
		 * The meta object literal for the '<em><b>Oprands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR_TRANSITION_OR_EXPRESSION__OPRANDS = eINSTANCE.getErrorBehaviorTransitionOrExpression_Oprands();

		/**
		 * The meta object literal for the '{@link NEsysml.EM.impl.PropagationPointTriggerImpl <em>Propagation Point Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.EM.impl.PropagationPointTriggerImpl
		 * @see NEsysml.EM.impl.EMPackageImpl#getPropagationPointTrigger()
		 * @generated
		 */
		EClass PROPAGATION_POINT_TRIGGER = eINSTANCE.getPropagationPointTrigger();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATION_POINT_TRIGGER__CONTEXT = eINSTANCE.getPropagationPointTrigger_Context();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATION_POINT_TRIGGER__POINT = eINSTANCE.getPropagationPointTrigger_Point();

		/**
		 * The meta object literal for the '{@link NEsysml.EM.impl.ErrorPropagationPointImpl <em>Error Propagation Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.EM.impl.ErrorPropagationPointImpl
		 * @see NEsysml.EM.impl.EMPackageImpl#getErrorPropagationPoint()
		 * @generated
		 */
		EClass ERROR_PROPAGATION_POINT = eINSTANCE.getErrorPropagationPoint();

		/**
		 * The meta object literal for the '<em><b>Bind Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_PROPAGATION_POINT__BIND_FEATURE = eINSTANCE.getErrorPropagationPoint_BindFeature();

		/**
		 * The meta object literal for the '{@link NEsysml.EM.impl.ErrorBehaviorTransitionAndExpressionImpl <em>Error Behavior Transition And Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.EM.impl.ErrorBehaviorTransitionAndExpressionImpl
		 * @see NEsysml.EM.impl.EMPackageImpl#getErrorBehaviorTransitionAndExpression()
		 * @generated
		 */
		EClass ERROR_BEHAVIOR_TRANSITION_AND_EXPRESSION = eINSTANCE.getErrorBehaviorTransitionAndExpression();

		/**
		 * The meta object literal for the '<em><b>Base Join Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR_TRANSITION_AND_EXPRESSION__BASE_JOIN_NODE = eINSTANCE.getErrorBehaviorTransitionAndExpression_Base_JoinNode();

		/**
		 * The meta object literal for the '<em><b>Owned Expression</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR_TRANSITION_AND_EXPRESSION__OWNED_EXPRESSION = eINSTANCE.getErrorBehaviorTransitionAndExpression_OwnedExpression();

		/**
		 * The meta object literal for the '{@link NEsysml.EM.impl.ComponentErrorBehaviorImpl <em>Component Error Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.EM.impl.ComponentErrorBehaviorImpl
		 * @see NEsysml.EM.impl.EMPackageImpl#getComponentErrorBehavior()
		 * @generated
		 */
		EClass COMPONENT_ERROR_BEHAVIOR = eINSTANCE.getComponentErrorBehavior();

		/**
		 * The meta object literal for the '<em><b>Import Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_ERROR_BEHAVIOR__IMPORT_BEHAVIOR = eINSTANCE.getComponentErrorBehavior_ImportBehavior();

		/**
		 * The meta object literal for the '<em><b>Owned Error Propagation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_ERROR_BEHAVIOR__OWNED_ERROR_PROPAGATION = eINSTANCE.getComponentErrorBehavior_OwnedErrorPropagation();

		/**
		 * The meta object literal for the '{@link NEsysml.EM.impl.ErrorPropagationImpl <em>Error Propagation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.EM.impl.ErrorPropagationImpl
		 * @see NEsysml.EM.impl.EMPackageImpl#getErrorPropagation()
		 * @generated
		 */
		EClass ERROR_PROPAGATION = eINSTANCE.getErrorPropagation();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_PROPAGATION__TARGET = eINSTANCE.getErrorPropagation_Target();

		/**
		 * The meta object literal for the '{@link NEsysml.EM.impl.ErrorModelSubclauseImpl <em>Error Model Subclause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.EM.impl.ErrorModelSubclauseImpl
		 * @see NEsysml.EM.impl.EMPackageImpl#getErrorModelSubclause()
		 * @generated
		 */
		EClass ERROR_MODEL_SUBCLAUSE = eINSTANCE.getErrorModelSubclause();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_SUBCLAUSE__BASE_CLASS = eINSTANCE.getErrorModelSubclause_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Owned Propagation Point</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_SUBCLAUSE__OWNED_PROPAGATION_POINT = eINSTANCE.getErrorModelSubclause_OwnedPropagationPoint();

		/**
		 * The meta object literal for the '<em><b>Owned Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_SUBCLAUSE__OWNED_BEHAVIOR = eINSTANCE.getErrorModelSubclause_OwnedBehavior();

		/**
		 * The meta object literal for the '<em><b>Use Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_SUBCLAUSE__USE_TYPES = eINSTANCE.getErrorModelSubclause_UseTypes();

	}

} //EMPackage
