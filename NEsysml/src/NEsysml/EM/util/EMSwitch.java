/**
 */
package NEsysml.EM.util;

import NEsysml.EM.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.papyrus.sysml14.portsandflows.ProxyPort;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see NEsysml.EM.EMPackage
 * @generated
 */
public class EMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSwitch() {
		if (modelPackage == null) {
			modelPackage = EMPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EMPackage.ERROR_MODEL_LIBRARY: {
				ErrorModelLibrary errorModelLibrary = (ErrorModelLibrary)theEObject;
				T result = caseErrorModelLibrary(errorModelLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMPackage.ERROR_BEHAVIOR_STATE_MACHINE: {
				ErrorBehaviorStateMachine errorBehaviorStateMachine = (ErrorBehaviorStateMachine)theEObject;
				T result = caseErrorBehaviorStateMachine(errorBehaviorStateMachine);
				if (result == null) result = caseErrorBehavior(errorBehaviorStateMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMPackage.ERROR_BEHAVIOR: {
				ErrorBehavior errorBehavior = (ErrorBehavior)theEObject;
				T result = caseErrorBehavior(errorBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMPackage.ERROR_BEHAVIOR_EVENT: {
				ErrorBehaviorEvent errorBehaviorEvent = (ErrorBehaviorEvent)theEObject;
				T result = caseErrorBehaviorEvent(errorBehaviorEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMPackage.ERROR_BEHAVIOR_STATE: {
				ErrorBehaviorState errorBehaviorState = (ErrorBehaviorState)theEObject;
				T result = caseErrorBehaviorState(errorBehaviorState);
				if (result == null) result = caseErrorTypedElement(errorBehaviorState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMPackage.ERROR_TYPED_ELEMENT: {
				ErrorTypedElement errorTypedElement = (ErrorTypedElement)theEObject;
				T result = caseErrorTypedElement(errorTypedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMPackage.ERROR_TYPE: {
				ErrorType errorType = (ErrorType)theEObject;
				T result = caseErrorType(errorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMPackage.ERROR_BEHAVIOR_TRANSITION: {
				ErrorBehaviorTransition errorBehaviorTransition = (ErrorBehaviorTransition)theEObject;
				T result = caseErrorBehaviorTransition(errorBehaviorTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMPackage.ERROR_BEHAVIOR_TRANSITION_CONDITION: {
				ErrorBehaviorTransitionCondition errorBehaviorTransitionCondition = (ErrorBehaviorTransitionCondition)theEObject;
				T result = caseErrorBehaviorTransitionCondition(errorBehaviorTransitionCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMPackage.ERROR_BEHAVIOR_TRANSITION_EXPRESSION: {
				ErrorBehaviorTransitionExpression errorBehaviorTransitionExpression = (ErrorBehaviorTransitionExpression)theEObject;
				T result = caseErrorBehaviorTransitionExpression(errorBehaviorTransitionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMPackage.TRANSITION_BRANCH: {
				TransitionBranch transitionBranch = (TransitionBranch)theEObject;
				T result = caseTransitionBranch(transitionBranch);
				if (result == null) result = caseErrorTypedElement(transitionBranch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMPackage.ERROR_EVENT: {
				ErrorEvent errorEvent = (ErrorEvent)theEObject;
				T result = caseErrorEvent(errorEvent);
				if (result == null) result = caseErrorBehaviorEvent(errorEvent);
				if (result == null) result = caseErrorTypedElement(errorEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMPackage.REPAIR_EVENT: {
				RepairEvent repairEvent = (RepairEvent)theEObject;
				T result = caseRepairEvent(repairEvent);
				if (result == null) result = caseErrorBehaviorEvent(repairEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMPackage.RECOVER_EVENT: {
				RecoverEvent recoverEvent = (RecoverEvent)theEObject;
				T result = caseRecoverEvent(recoverEvent);
				if (result == null) result = caseErrorBehaviorEvent(recoverEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMPackage.ERROR_EVENT_TRIGGER: {
				ErrorEventTrigger errorEventTrigger = (ErrorEventTrigger)theEObject;
				T result = caseErrorEventTrigger(errorEventTrigger);
				if (result == null) result = caseErrorTransitionTrigger(errorEventTrigger);
				if (result == null) result = caseErrorTypedElement(errorEventTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMPackage.ERROR_TRANSITION_TRIGGER: {
				ErrorTransitionTrigger errorTransitionTrigger = (ErrorTransitionTrigger)theEObject;
				T result = caseErrorTransitionTrigger(errorTransitionTrigger);
				if (result == null) result = caseErrorTypedElement(errorTransitionTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMPackage.ERROR_BEHAVIOR_TRANSITION_OR_EXPRESSION: {
				ErrorBehaviorTransitionOrExpression errorBehaviorTransitionOrExpression = (ErrorBehaviorTransitionOrExpression)theEObject;
				T result = caseErrorBehaviorTransitionOrExpression(errorBehaviorTransitionOrExpression);
				if (result == null) result = caseErrorBehaviorTransitionExpression(errorBehaviorTransitionOrExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMPackage.PROPAGATION_POINT_TRIGGER: {
				PropagationPointTrigger propagationPointTrigger = (PropagationPointTrigger)theEObject;
				T result = casePropagationPointTrigger(propagationPointTrigger);
				if (result == null) result = caseErrorTransitionTrigger(propagationPointTrigger);
				if (result == null) result = caseErrorTypedElement(propagationPointTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMPackage.ERROR_PROPAGATION_POINT: {
				ErrorPropagationPoint errorPropagationPoint = (ErrorPropagationPoint)theEObject;
				T result = caseErrorPropagationPoint(errorPropagationPoint);
				if (result == null) result = caseErrorTypedElement(errorPropagationPoint);
				if (result == null) result = caseProxyPort(errorPropagationPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMPackage.ERROR_BEHAVIOR_TRANSITION_AND_EXPRESSION: {
				ErrorBehaviorTransitionAndExpression errorBehaviorTransitionAndExpression = (ErrorBehaviorTransitionAndExpression)theEObject;
				T result = caseErrorBehaviorTransitionAndExpression(errorBehaviorTransitionAndExpression);
				if (result == null) result = caseErrorBehaviorTransitionExpression(errorBehaviorTransitionAndExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMPackage.COMPONENT_ERROR_BEHAVIOR: {
				ComponentErrorBehavior componentErrorBehavior = (ComponentErrorBehavior)theEObject;
				T result = caseComponentErrorBehavior(componentErrorBehavior);
				if (result == null) result = caseErrorBehavior(componentErrorBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMPackage.ERROR_PROPAGATION: {
				ErrorPropagation errorPropagation = (ErrorPropagation)theEObject;
				T result = caseErrorPropagation(errorPropagation);
				if (result == null) result = caseErrorBehaviorTransition(errorPropagation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMPackage.ERROR_MODEL_SUBCLAUSE: {
				ErrorModelSubclause errorModelSubclause = (ErrorModelSubclause)theEObject;
				T result = caseErrorModelSubclause(errorModelSubclause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Model Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Model Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorModelLibrary(ErrorModelLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Behavior State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Behavior State Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorBehaviorStateMachine(ErrorBehaviorStateMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorBehavior(ErrorBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Behavior Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Behavior Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorBehaviorEvent(ErrorBehaviorEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Behavior State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Behavior State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorBehaviorState(ErrorBehaviorState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorTypedElement(ErrorTypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorType(ErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Behavior Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Behavior Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorBehaviorTransition(ErrorBehaviorTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Behavior Transition Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Behavior Transition Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorBehaviorTransitionCondition(ErrorBehaviorTransitionCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Behavior Transition Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Behavior Transition Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorBehaviorTransitionExpression(ErrorBehaviorTransitionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Branch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Branch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionBranch(TransitionBranch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorEvent(ErrorEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repair Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repair Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepairEvent(RepairEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recover Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recover Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecoverEvent(RecoverEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Event Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Event Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorEventTrigger(ErrorEventTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Transition Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Transition Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorTransitionTrigger(ErrorTransitionTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Behavior Transition Or Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Behavior Transition Or Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorBehaviorTransitionOrExpression(ErrorBehaviorTransitionOrExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagation Point Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagation Point Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagationPointTrigger(PropagationPointTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Propagation Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Propagation Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorPropagationPoint(ErrorPropagationPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Behavior Transition And Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Behavior Transition And Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorBehaviorTransitionAndExpression(ErrorBehaviorTransitionAndExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Error Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Error Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentErrorBehavior(ComponentErrorBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Propagation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Propagation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorPropagation(ErrorPropagation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Model Subclause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Model Subclause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorModelSubclause(ErrorModelSubclause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proxy Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proxy Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProxyPort(ProxyPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EMSwitch
