/**
 */
package NEsysml.EM.util;

import NEsysml.EM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.papyrus.sysml14.portsandflows.ProxyPort;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see NEsysml.EM.EMPackage
 * @generated
 */
public class EMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSwitch<Adapter> modelSwitch =
		new EMSwitch<Adapter>() {
			@Override
			public Adapter caseErrorModelLibrary(ErrorModelLibrary object) {
				return createErrorModelLibraryAdapter();
			}
			@Override
			public Adapter caseErrorBehaviorStateMachine(ErrorBehaviorStateMachine object) {
				return createErrorBehaviorStateMachineAdapter();
			}
			@Override
			public Adapter caseErrorBehavior(ErrorBehavior object) {
				return createErrorBehaviorAdapter();
			}
			@Override
			public Adapter caseErrorBehaviorEvent(ErrorBehaviorEvent object) {
				return createErrorBehaviorEventAdapter();
			}
			@Override
			public Adapter caseErrorBehaviorState(ErrorBehaviorState object) {
				return createErrorBehaviorStateAdapter();
			}
			@Override
			public Adapter caseErrorTypedElement(ErrorTypedElement object) {
				return createErrorTypedElementAdapter();
			}
			@Override
			public Adapter caseErrorType(ErrorType object) {
				return createErrorTypeAdapter();
			}
			@Override
			public Adapter caseErrorBehaviorTransition(ErrorBehaviorTransition object) {
				return createErrorBehaviorTransitionAdapter();
			}
			@Override
			public Adapter caseErrorBehaviorTransitionCondition(ErrorBehaviorTransitionCondition object) {
				return createErrorBehaviorTransitionConditionAdapter();
			}
			@Override
			public Adapter caseErrorBehaviorTransitionExpression(ErrorBehaviorTransitionExpression object) {
				return createErrorBehaviorTransitionExpressionAdapter();
			}
			@Override
			public Adapter caseTransitionBranch(TransitionBranch object) {
				return createTransitionBranchAdapter();
			}
			@Override
			public Adapter caseErrorEvent(ErrorEvent object) {
				return createErrorEventAdapter();
			}
			@Override
			public Adapter caseRepairEvent(RepairEvent object) {
				return createRepairEventAdapter();
			}
			@Override
			public Adapter caseRecoverEvent(RecoverEvent object) {
				return createRecoverEventAdapter();
			}
			@Override
			public Adapter caseErrorEventTrigger(ErrorEventTrigger object) {
				return createErrorEventTriggerAdapter();
			}
			@Override
			public Adapter caseErrorTransitionTrigger(ErrorTransitionTrigger object) {
				return createErrorTransitionTriggerAdapter();
			}
			@Override
			public Adapter caseErrorBehaviorTransitionOrExpression(ErrorBehaviorTransitionOrExpression object) {
				return createErrorBehaviorTransitionOrExpressionAdapter();
			}
			@Override
			public Adapter casePropagationPointTrigger(PropagationPointTrigger object) {
				return createPropagationPointTriggerAdapter();
			}
			@Override
			public Adapter caseErrorPropagationPoint(ErrorPropagationPoint object) {
				return createErrorPropagationPointAdapter();
			}
			@Override
			public Adapter caseErrorBehaviorTransitionAndExpression(ErrorBehaviorTransitionAndExpression object) {
				return createErrorBehaviorTransitionAndExpressionAdapter();
			}
			@Override
			public Adapter caseComponentErrorBehavior(ComponentErrorBehavior object) {
				return createComponentErrorBehaviorAdapter();
			}
			@Override
			public Adapter caseErrorPropagation(ErrorPropagation object) {
				return createErrorPropagationAdapter();
			}
			@Override
			public Adapter caseErrorModelSubclause(ErrorModelSubclause object) {
				return createErrorModelSubclauseAdapter();
			}
			@Override
			public Adapter caseProxyPort(ProxyPort object) {
				return createProxyPortAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.EM.ErrorModelLibrary <em>Error Model Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.EM.ErrorModelLibrary
	 * @generated
	 */
	public Adapter createErrorModelLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.EM.ErrorBehaviorStateMachine <em>Error Behavior State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.EM.ErrorBehaviorStateMachine
	 * @generated
	 */
	public Adapter createErrorBehaviorStateMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.EM.ErrorBehavior <em>Error Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.EM.ErrorBehavior
	 * @generated
	 */
	public Adapter createErrorBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.EM.ErrorBehaviorEvent <em>Error Behavior Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.EM.ErrorBehaviorEvent
	 * @generated
	 */
	public Adapter createErrorBehaviorEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.EM.ErrorBehaviorState <em>Error Behavior State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.EM.ErrorBehaviorState
	 * @generated
	 */
	public Adapter createErrorBehaviorStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.EM.ErrorTypedElement <em>Error Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.EM.ErrorTypedElement
	 * @generated
	 */
	public Adapter createErrorTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.EM.ErrorType <em>Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.EM.ErrorType
	 * @generated
	 */
	public Adapter createErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.EM.ErrorBehaviorTransition <em>Error Behavior Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.EM.ErrorBehaviorTransition
	 * @generated
	 */
	public Adapter createErrorBehaviorTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.EM.ErrorBehaviorTransitionCondition <em>Error Behavior Transition Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.EM.ErrorBehaviorTransitionCondition
	 * @generated
	 */
	public Adapter createErrorBehaviorTransitionConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.EM.ErrorBehaviorTransitionExpression <em>Error Behavior Transition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.EM.ErrorBehaviorTransitionExpression
	 * @generated
	 */
	public Adapter createErrorBehaviorTransitionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.EM.TransitionBranch <em>Transition Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.EM.TransitionBranch
	 * @generated
	 */
	public Adapter createTransitionBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.EM.ErrorEvent <em>Error Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.EM.ErrorEvent
	 * @generated
	 */
	public Adapter createErrorEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.EM.RepairEvent <em>Repair Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.EM.RepairEvent
	 * @generated
	 */
	public Adapter createRepairEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.EM.RecoverEvent <em>Recover Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.EM.RecoverEvent
	 * @generated
	 */
	public Adapter createRecoverEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.EM.ErrorEventTrigger <em>Error Event Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.EM.ErrorEventTrigger
	 * @generated
	 */
	public Adapter createErrorEventTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.EM.ErrorTransitionTrigger <em>Error Transition Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.EM.ErrorTransitionTrigger
	 * @generated
	 */
	public Adapter createErrorTransitionTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.EM.ErrorBehaviorTransitionOrExpression <em>Error Behavior Transition Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.EM.ErrorBehaviorTransitionOrExpression
	 * @generated
	 */
	public Adapter createErrorBehaviorTransitionOrExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.EM.PropagationPointTrigger <em>Propagation Point Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.EM.PropagationPointTrigger
	 * @generated
	 */
	public Adapter createPropagationPointTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.EM.ErrorPropagationPoint <em>Error Propagation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.EM.ErrorPropagationPoint
	 * @generated
	 */
	public Adapter createErrorPropagationPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.EM.ErrorBehaviorTransitionAndExpression <em>Error Behavior Transition And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.EM.ErrorBehaviorTransitionAndExpression
	 * @generated
	 */
	public Adapter createErrorBehaviorTransitionAndExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.EM.ComponentErrorBehavior <em>Component Error Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.EM.ComponentErrorBehavior
	 * @generated
	 */
	public Adapter createComponentErrorBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.EM.ErrorPropagation <em>Error Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.EM.ErrorPropagation
	 * @generated
	 */
	public Adapter createErrorPropagationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.EM.ErrorModelSubclause <em>Error Model Subclause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.EM.ErrorModelSubclause
	 * @generated
	 */
	public Adapter createErrorModelSubclauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.sysml14.portsandflows.ProxyPort <em>Proxy Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.sysml14.portsandflows.ProxyPort
	 * @generated
	 */
	public Adapter createProxyPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EMAdapterFactory
