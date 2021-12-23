/**
 */
package NEsysml.EM.impl;

import NEsysml.EM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFactoryImpl extends EFactoryImpl implements EMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EMFactory init() {
		try {
			EMFactory theEMFactory = (EMFactory)EPackage.Registry.INSTANCE.getEFactory(EMPackage.eNS_URI);
			if (theEMFactory != null) {
				return theEMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EMPackage.ERROR_MODEL_LIBRARY: return createErrorModelLibrary();
			case EMPackage.ERROR_BEHAVIOR_STATE_MACHINE: return createErrorBehaviorStateMachine();
			case EMPackage.ERROR_BEHAVIOR_STATE: return createErrorBehaviorState();
			case EMPackage.ERROR_TYPE: return createErrorType();
			case EMPackage.ERROR_BEHAVIOR_TRANSITION: return createErrorBehaviorTransition();
			case EMPackage.ERROR_BEHAVIOR_TRANSITION_CONDITION: return createErrorBehaviorTransitionCondition();
			case EMPackage.TRANSITION_BRANCH: return createTransitionBranch();
			case EMPackage.ERROR_EVENT: return createErrorEvent();
			case EMPackage.REPAIR_EVENT: return createRepairEvent();
			case EMPackage.RECOVER_EVENT: return createRecoverEvent();
			case EMPackage.ERROR_EVENT_TRIGGER: return createErrorEventTrigger();
			case EMPackage.ERROR_BEHAVIOR_TRANSITION_OR_EXPRESSION: return createErrorBehaviorTransitionOrExpression();
			case EMPackage.PROPAGATION_POINT_TRIGGER: return createPropagationPointTrigger();
			case EMPackage.ERROR_PROPAGATION_POINT: return createErrorPropagationPoint();
			case EMPackage.ERROR_BEHAVIOR_TRANSITION_AND_EXPRESSION: return createErrorBehaviorTransitionAndExpression();
			case EMPackage.COMPONENT_ERROR_BEHAVIOR: return createComponentErrorBehavior();
			case EMPackage.ERROR_PROPAGATION: return createErrorPropagation();
			case EMPackage.ERROR_MODEL_SUBCLAUSE: return createErrorModelSubclause();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorModelLibrary createErrorModelLibrary() {
		ErrorModelLibraryImpl errorModelLibrary = new ErrorModelLibraryImpl();
		return errorModelLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorBehaviorStateMachine createErrorBehaviorStateMachine() {
		ErrorBehaviorStateMachineImpl errorBehaviorStateMachine = new ErrorBehaviorStateMachineImpl();
		return errorBehaviorStateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorBehaviorState createErrorBehaviorState() {
		ErrorBehaviorStateImpl errorBehaviorState = new ErrorBehaviorStateImpl();
		return errorBehaviorState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorType createErrorType() {
		ErrorTypeImpl errorType = new ErrorTypeImpl();
		return errorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorBehaviorTransition createErrorBehaviorTransition() {
		ErrorBehaviorTransitionImpl errorBehaviorTransition = new ErrorBehaviorTransitionImpl();
		return errorBehaviorTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorBehaviorTransitionCondition createErrorBehaviorTransitionCondition() {
		ErrorBehaviorTransitionConditionImpl errorBehaviorTransitionCondition = new ErrorBehaviorTransitionConditionImpl();
		return errorBehaviorTransitionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionBranch createTransitionBranch() {
		TransitionBranchImpl transitionBranch = new TransitionBranchImpl();
		return transitionBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorEvent createErrorEvent() {
		ErrorEventImpl errorEvent = new ErrorEventImpl();
		return errorEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepairEvent createRepairEvent() {
		RepairEventImpl repairEvent = new RepairEventImpl();
		return repairEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecoverEvent createRecoverEvent() {
		RecoverEventImpl recoverEvent = new RecoverEventImpl();
		return recoverEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorEventTrigger createErrorEventTrigger() {
		ErrorEventTriggerImpl errorEventTrigger = new ErrorEventTriggerImpl();
		return errorEventTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorBehaviorTransitionOrExpression createErrorBehaviorTransitionOrExpression() {
		ErrorBehaviorTransitionOrExpressionImpl errorBehaviorTransitionOrExpression = new ErrorBehaviorTransitionOrExpressionImpl();
		return errorBehaviorTransitionOrExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagationPointTrigger createPropagationPointTrigger() {
		PropagationPointTriggerImpl propagationPointTrigger = new PropagationPointTriggerImpl();
		return propagationPointTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorPropagationPoint createErrorPropagationPoint() {
		ErrorPropagationPointImpl errorPropagationPoint = new ErrorPropagationPointImpl();
		return errorPropagationPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorBehaviorTransitionAndExpression createErrorBehaviorTransitionAndExpression() {
		ErrorBehaviorTransitionAndExpressionImpl errorBehaviorTransitionAndExpression = new ErrorBehaviorTransitionAndExpressionImpl();
		return errorBehaviorTransitionAndExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentErrorBehavior createComponentErrorBehavior() {
		ComponentErrorBehaviorImpl componentErrorBehavior = new ComponentErrorBehaviorImpl();
		return componentErrorBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorPropagation createErrorPropagation() {
		ErrorPropagationImpl errorPropagation = new ErrorPropagationImpl();
		return errorPropagation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorModelSubclause createErrorModelSubclause() {
		ErrorModelSubclauseImpl errorModelSubclause = new ErrorModelSubclauseImpl();
		return errorModelSubclause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPackage getEMPackage() {
		return (EMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EMPackage getPackage() {
		return EMPackage.eINSTANCE;
	}

} //EMFactoryImpl
