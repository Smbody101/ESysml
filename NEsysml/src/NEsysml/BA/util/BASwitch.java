/**
 */
package NEsysml.BA.util;

import NEsysml.Aadl.Annex;
import NEsysml.Aadl.ParameterConnectionContext;
import NEsysml.Aadl.SubprogramCall;
import NEsysml.Aadl.SubprogramInstanceCall;
import NEsysml.Aadl.SubprogramInterfaceCall;
import NEsysml.BA.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see NEsysml.BA.BAPackage
 * @generated
 */
public class BASwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BAPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BASwitch() {
		if (modelPackage == null) {
			modelPackage = BAPackage.eINSTANCE;
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
			case BAPackage.BEHAVIOR_STATE_MACHINE: {
				BehaviorStateMachine behaviorStateMachine = (BehaviorStateMachine)theEObject;
				T result = caseBehaviorStateMachine(behaviorStateMachine);
				if (result == null) result = caseAnnex(behaviorStateMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BAPackage.BEHAVIOR_STATE: {
				BehaviorState behaviorState = (BehaviorState)theEObject;
				T result = caseBehaviorState(behaviorState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BAPackage.BEHAVIOR_STATE_TRANSITION: {
				BehaviorStateTransition behaviorStateTransition = (BehaviorStateTransition)theEObject;
				T result = caseBehaviorStateTransition(behaviorStateTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BAPackage.BEHAVIOR_ACTION_BLOCK: {
				BehaviorActionBlock behaviorActionBlock = (BehaviorActionBlock)theEObject;
				T result = caseBehaviorActionBlock(behaviorActionBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BAPackage.BEHAVIOR_ACTION: {
				BehaviorAction behaviorAction = (BehaviorAction)theEObject;
				T result = caseBehaviorAction(behaviorAction);
				if (result == null) result = caseSubprogramCall(behaviorAction);
				if (result == null) result = caseParameterConnectionContext(behaviorAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BAPackage.TRANSITION_CONDITION: {
				TransitionCondition transitionCondition = (TransitionCondition)theEObject;
				T result = caseTransitionCondition(transitionCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BAPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BAPackage.PORT_ACTION: {
				PortAction portAction = (PortAction)theEObject;
				T result = casePortAction(portAction);
				if (result == null) result = caseBehaviorAction(portAction);
				if (result == null) result = caseSubprogramCall(portAction);
				if (result == null) result = caseParameterConnectionContext(portAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BAPackage.SEND_OUTPUT: {
				SendOutput sendOutput = (SendOutput)theEObject;
				T result = caseSendOutput(sendOutput);
				if (result == null) result = casePortAction(sendOutput);
				if (result == null) result = caseBehaviorAction(sendOutput);
				if (result == null) result = caseSubprogramCall(sendOutput);
				if (result == null) result = caseParameterConnectionContext(sendOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BAPackage.GET_INPUT: {
				GetInput getInput = (GetInput)theEObject;
				T result = caseGetInput(getInput);
				if (result == null) result = casePortAction(getInput);
				if (result == null) result = caseBehaviorAction(getInput);
				if (result == null) result = caseSubprogramCall(getInput);
				if (result == null) result = caseParameterConnectionContext(getInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BAPackage.SUBPROGRAM_CALL_ACTION: {
				SubprogramCallAction subprogramCallAction = (SubprogramCallAction)theEObject;
				T result = caseSubprogramCallAction(subprogramCallAction);
				if (result == null) result = caseBehaviorAction(subprogramCallAction);
				if (result == null) result = caseSubprogramCall(subprogramCallAction);
				if (result == null) result = caseParameterConnectionContext(subprogramCallAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BAPackage.TEXT_CONDITION: {
				TextCondition textCondition = (TextCondition)theEObject;
				T result = caseTextCondition(textCondition);
				if (result == null) result = caseTransitionCondition(textCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BAPackage.DISPATCH_CONDITION: {
				DispatchCondition dispatchCondition = (DispatchCondition)theEObject;
				T result = caseDispatchCondition(dispatchCondition);
				if (result == null) result = caseTransitionCondition(dispatchCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BAPackage.SUBPROGRAM_INSTANCE_CALL_ACTION: {
				SubprogramInstanceCallAction subprogramInstanceCallAction = (SubprogramInstanceCallAction)theEObject;
				T result = caseSubprogramInstanceCallAction(subprogramInstanceCallAction);
				if (result == null) result = caseSubprogramInstanceCall(subprogramInstanceCallAction);
				if (result == null) result = caseSubprogramCallAction(subprogramInstanceCallAction);
				if (result == null) result = caseBehaviorAction(subprogramInstanceCallAction);
				if (result == null) result = caseSubprogramCall(subprogramInstanceCallAction);
				if (result == null) result = caseParameterConnectionContext(subprogramInstanceCallAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BAPackage.SUBPROGRAM_INTERFACE_CALL_ACTION: {
				SubprogramInterfaceCallAction subprogramInterfaceCallAction = (SubprogramInterfaceCallAction)theEObject;
				T result = caseSubprogramInterfaceCallAction(subprogramInterfaceCallAction);
				if (result == null) result = caseSubprogramInterfaceCall(subprogramInterfaceCallAction);
				if (result == null) result = caseSubprogramCallAction(subprogramInterfaceCallAction);
				if (result == null) result = caseBehaviorAction(subprogramInterfaceCallAction);
				if (result == null) result = caseSubprogramCall(subprogramInterfaceCallAction);
				if (result == null) result = caseParameterConnectionContext(subprogramInterfaceCallAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior State Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorStateMachine(BehaviorStateMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorState(BehaviorState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior State Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior State Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorStateTransition(BehaviorStateTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Action Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Action Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorActionBlock(BehaviorActionBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorAction(BehaviorAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionCondition(TransitionCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortAction(PortAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendOutput(SendOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetInput(GetInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subprogram Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subprogram Call Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubprogramCallAction(SubprogramCallAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextCondition(TextCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dispatch Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dispatch Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDispatchCondition(DispatchCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subprogram Instance Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subprogram Instance Call Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubprogramInstanceCallAction(SubprogramInstanceCallAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subprogram Interface Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subprogram Interface Call Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubprogramInterfaceCallAction(SubprogramInterfaceCallAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subprogram Interface Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subprogram Interface Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubprogramInterfaceCall(SubprogramInterfaceCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnex(Annex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Connection Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Connection Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterConnectionContext(ParameterConnectionContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subprogram Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subprogram Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubprogramCall(SubprogramCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subprogram Instance Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subprogram Instance Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubprogramInstanceCall(SubprogramInstanceCall object) {
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

} //BASwitch
