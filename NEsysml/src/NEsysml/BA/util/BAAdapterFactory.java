/**
 */
package NEsysml.BA.util;

import NEsysml.Aadl.Annex;
import NEsysml.Aadl.ParameterConnectionContext;
import NEsysml.Aadl.SubprogramCall;
import NEsysml.Aadl.SubprogramInstanceCall;
import NEsysml.Aadl.SubprogramInterfaceCall;
import NEsysml.BA.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see NEsysml.BA.BAPackage
 * @generated
 */
public class BAAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BAPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BAAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BAPackage.eINSTANCE;
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
	protected BASwitch<Adapter> modelSwitch =
		new BASwitch<Adapter>() {
			@Override
			public Adapter caseBehaviorStateMachine(BehaviorStateMachine object) {
				return createBehaviorStateMachineAdapter();
			}
			@Override
			public Adapter caseBehaviorState(BehaviorState object) {
				return createBehaviorStateAdapter();
			}
			@Override
			public Adapter caseBehaviorStateTransition(BehaviorStateTransition object) {
				return createBehaviorStateTransitionAdapter();
			}
			@Override
			public Adapter caseBehaviorActionBlock(BehaviorActionBlock object) {
				return createBehaviorActionBlockAdapter();
			}
			@Override
			public Adapter caseBehaviorAction(BehaviorAction object) {
				return createBehaviorActionAdapter();
			}
			@Override
			public Adapter caseTransitionCondition(TransitionCondition object) {
				return createTransitionConditionAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter casePortAction(PortAction object) {
				return createPortActionAdapter();
			}
			@Override
			public Adapter caseSendOutput(SendOutput object) {
				return createSendOutputAdapter();
			}
			@Override
			public Adapter caseGetInput(GetInput object) {
				return createGetInputAdapter();
			}
			@Override
			public Adapter caseSubprogramCallAction(SubprogramCallAction object) {
				return createSubprogramCallActionAdapter();
			}
			@Override
			public Adapter caseTextCondition(TextCondition object) {
				return createTextConditionAdapter();
			}
			@Override
			public Adapter caseDispatchCondition(DispatchCondition object) {
				return createDispatchConditionAdapter();
			}
			@Override
			public Adapter caseSubprogramInstanceCallAction(SubprogramInstanceCallAction object) {
				return createSubprogramInstanceCallActionAdapter();
			}
			@Override
			public Adapter caseSubprogramInterfaceCallAction(SubprogramInterfaceCallAction object) {
				return createSubprogramInterfaceCallActionAdapter();
			}
			@Override
			public Adapter caseAnnex(Annex object) {
				return createAnnexAdapter();
			}
			@Override
			public Adapter caseParameterConnectionContext(ParameterConnectionContext object) {
				return createParameterConnectionContextAdapter();
			}
			@Override
			public Adapter caseSubprogramCall(SubprogramCall object) {
				return createSubprogramCallAdapter();
			}
			@Override
			public Adapter caseSubprogramInstanceCall(SubprogramInstanceCall object) {
				return createSubprogramInstanceCallAdapter();
			}
			@Override
			public Adapter caseSubprogramInterfaceCall(SubprogramInterfaceCall object) {
				return createSubprogramInterfaceCallAdapter();
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
	 * Creates a new adapter for an object of class '{@link NEsysml.BA.BehaviorStateMachine <em>Behavior State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.BA.BehaviorStateMachine
	 * @generated
	 */
	public Adapter createBehaviorStateMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.BA.BehaviorState <em>Behavior State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.BA.BehaviorState
	 * @generated
	 */
	public Adapter createBehaviorStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.BA.BehaviorStateTransition <em>Behavior State Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.BA.BehaviorStateTransition
	 * @generated
	 */
	public Adapter createBehaviorStateTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.BA.BehaviorActionBlock <em>Behavior Action Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.BA.BehaviorActionBlock
	 * @generated
	 */
	public Adapter createBehaviorActionBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.BA.BehaviorAction <em>Behavior Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.BA.BehaviorAction
	 * @generated
	 */
	public Adapter createBehaviorActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.BA.TransitionCondition <em>Transition Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.BA.TransitionCondition
	 * @generated
	 */
	public Adapter createTransitionConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.BA.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.BA.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.BA.PortAction <em>Port Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.BA.PortAction
	 * @generated
	 */
	public Adapter createPortActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.BA.SendOutput <em>Send Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.BA.SendOutput
	 * @generated
	 */
	public Adapter createSendOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.BA.GetInput <em>Get Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.BA.GetInput
	 * @generated
	 */
	public Adapter createGetInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.BA.SubprogramCallAction <em>Subprogram Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.BA.SubprogramCallAction
	 * @generated
	 */
	public Adapter createSubprogramCallActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.BA.TextCondition <em>Text Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.BA.TextCondition
	 * @generated
	 */
	public Adapter createTextConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.BA.DispatchCondition <em>Dispatch Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.BA.DispatchCondition
	 * @generated
	 */
	public Adapter createDispatchConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.BA.SubprogramInstanceCallAction <em>Subprogram Instance Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.BA.SubprogramInstanceCallAction
	 * @generated
	 */
	public Adapter createSubprogramInstanceCallActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.BA.SubprogramInterfaceCallAction <em>Subprogram Interface Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.BA.SubprogramInterfaceCallAction
	 * @generated
	 */
	public Adapter createSubprogramInterfaceCallActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.SubprogramInterfaceCall <em>Subprogram Interface Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.SubprogramInterfaceCall
	 * @generated
	 */
	public Adapter createSubprogramInterfaceCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.Annex <em>Annex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.Annex
	 * @generated
	 */
	public Adapter createAnnexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.ParameterConnectionContext <em>Parameter Connection Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.ParameterConnectionContext
	 * @generated
	 */
	public Adapter createParameterConnectionContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.SubprogramCall <em>Subprogram Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.SubprogramCall
	 * @generated
	 */
	public Adapter createSubprogramCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.SubprogramInstanceCall <em>Subprogram Instance Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.SubprogramInstanceCall
	 * @generated
	 */
	public Adapter createSubprogramInstanceCallAdapter() {
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

} //BAAdapterFactory
