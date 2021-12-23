/**
 */
package NEsysml.BA.impl;

import NEsysml.BA.*;

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
public class BAFactoryImpl extends EFactoryImpl implements BAFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BAFactory init() {
		try {
			BAFactory theBAFactory = (BAFactory)EPackage.Registry.INSTANCE.getEFactory(BAPackage.eNS_URI);
			if (theBAFactory != null) {
				return theBAFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BAFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BAFactoryImpl() {
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
			case BAPackage.BEHAVIOR_STATE_MACHINE: return createBehaviorStateMachine();
			case BAPackage.BEHAVIOR_STATE: return createBehaviorState();
			case BAPackage.BEHAVIOR_STATE_TRANSITION: return createBehaviorStateTransition();
			case BAPackage.BEHAVIOR_ACTION_BLOCK: return createBehaviorActionBlock();
			case BAPackage.VARIABLE: return createVariable();
			case BAPackage.SEND_OUTPUT: return createSendOutput();
			case BAPackage.GET_INPUT: return createGetInput();
			case BAPackage.TEXT_CONDITION: return createTextCondition();
			case BAPackage.DISPATCH_CONDITION: return createDispatchCondition();
			case BAPackage.SUBPROGRAM_INSTANCE_CALL_ACTION: return createSubprogramInstanceCallAction();
			case BAPackage.SUBPROGRAM_INTERFACE_CALL_ACTION: return createSubprogramInterfaceCallAction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorStateMachine createBehaviorStateMachine() {
		BehaviorStateMachineImpl behaviorStateMachine = new BehaviorStateMachineImpl();
		return behaviorStateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorState createBehaviorState() {
		BehaviorStateImpl behaviorState = new BehaviorStateImpl();
		return behaviorState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorStateTransition createBehaviorStateTransition() {
		BehaviorStateTransitionImpl behaviorStateTransition = new BehaviorStateTransitionImpl();
		return behaviorStateTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorActionBlock createBehaviorActionBlock() {
		BehaviorActionBlockImpl behaviorActionBlock = new BehaviorActionBlockImpl();
		return behaviorActionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendOutput createSendOutput() {
		SendOutputImpl sendOutput = new SendOutputImpl();
		return sendOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetInput createGetInput() {
		GetInputImpl getInput = new GetInputImpl();
		return getInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextCondition createTextCondition() {
		TextConditionImpl textCondition = new TextConditionImpl();
		return textCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispatchCondition createDispatchCondition() {
		DispatchConditionImpl dispatchCondition = new DispatchConditionImpl();
		return dispatchCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramInstanceCallAction createSubprogramInstanceCallAction() {
		SubprogramInstanceCallActionImpl subprogramInstanceCallAction = new SubprogramInstanceCallActionImpl();
		return subprogramInstanceCallAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramInterfaceCallAction createSubprogramInterfaceCallAction() {
		SubprogramInterfaceCallActionImpl subprogramInterfaceCallAction = new SubprogramInterfaceCallActionImpl();
		return subprogramInterfaceCallAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BAPackage getBAPackage() {
		return (BAPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BAPackage getPackage() {
		return BAPackage.eINSTANCE;
	}

} //BAFactoryImpl
