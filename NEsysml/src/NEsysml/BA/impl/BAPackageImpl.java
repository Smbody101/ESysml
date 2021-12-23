/**
 */
package NEsysml.BA.impl;

import NEsysml.Aadl.AadlPackage;

import NEsysml.Aadl.impl.AadlPackageImpl;

import NEsysml.BA.BAFactory;
import NEsysml.BA.BAPackage;
import NEsysml.BA.BehaviorAction;
import NEsysml.BA.BehaviorActionBlock;
import NEsysml.BA.BehaviorState;
import NEsysml.BA.BehaviorStateMachine;
import NEsysml.BA.BehaviorStateTransition;
import NEsysml.BA.DispatchCondition;
import NEsysml.BA.GetInput;
import NEsysml.BA.PortAction;
import NEsysml.BA.SendOutput;
import NEsysml.BA.SubprogramCallAction;
import NEsysml.BA.SubprogramInstanceCallAction;
import NEsysml.BA.SubprogramInterfaceCallAction;
import NEsysml.BA.TextCondition;
import NEsysml.BA.TransitionCondition;
import NEsysml.BA.Variable;
import NEsysml.EM.EMPackage;
import NEsysml.EM.impl.EMPackageImpl;
import NEsysml.NEsysmlPackage;

import NEsysml.impl.NEsysmlPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.sysml14.sysmlPackage;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.profile.standard.StandardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BAPackageImpl extends EPackageImpl implements BAPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorStateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorStateTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorActionBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramCallActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dispatchConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramInstanceCallActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramInterfaceCallActionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see NEsysml.BA.BAPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BAPackageImpl() {
		super(eNS_URI, BAFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link BAPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BAPackage init() {
		if (isInited) return (BAPackage)EPackage.Registry.INSTANCE.getEPackage(BAPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBAPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BAPackageImpl theBAPackage = registeredBAPackage instanceof BAPackageImpl ? (BAPackageImpl)registeredBAPackage : new BAPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		StandardPackage.eINSTANCE.eClass();
		sysmlPackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NEsysmlPackage.eNS_URI);
		NEsysmlPackageImpl theNEsysmlPackage = (NEsysmlPackageImpl)(registeredPackage instanceof NEsysmlPackageImpl ? registeredPackage : NEsysmlPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AadlPackage.eNS_URI);
		AadlPackageImpl theAadlPackage = (AadlPackageImpl)(registeredPackage instanceof AadlPackageImpl ? registeredPackage : AadlPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EMPackage.eNS_URI);
		EMPackageImpl theEMPackage = (EMPackageImpl)(registeredPackage instanceof EMPackageImpl ? registeredPackage : EMPackage.eINSTANCE);

		// Create package meta-data objects
		theBAPackage.createPackageContents();
		theNEsysmlPackage.createPackageContents();
		theAadlPackage.createPackageContents();
		theEMPackage.createPackageContents();

		// Initialize created meta-data
		theBAPackage.initializePackageContents();
		theNEsysmlPackage.initializePackageContents();
		theAadlPackage.initializePackageContents();
		theEMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBAPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BAPackage.eNS_URI, theBAPackage);
		return theBAPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviorStateMachine() {
		return behaviorStateMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorStateMachine_Base_StateMachine() {
		return (EReference)behaviorStateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorStateMachine_OwnedState() {
		return (EReference)behaviorStateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorStateMachine_OwnedTransition() {
		return (EReference)behaviorStateMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorStateMachine_OwnedVariable() {
		return (EReference)behaviorStateMachineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviorState() {
		return behaviorStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorState_Base_State() {
		return (EReference)behaviorStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehaviorState_IsComplete() {
		return (EAttribute)behaviorStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehaviorState_IsInitial() {
		return (EAttribute)behaviorStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehaviorState_IsFinal() {
		return (EAttribute)behaviorStateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviorStateTransition() {
		return behaviorStateTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorStateTransition_Base_Transition() {
		return (EReference)behaviorStateTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorStateTransition_From() {
		return (EReference)behaviorStateTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorStateTransition_To() {
		return (EReference)behaviorStateTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorStateTransition_OwnedActionBlock() {
		return (EReference)behaviorStateTransitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorStateTransition_OwnedCondition() {
		return (EReference)behaviorStateTransitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviorActionBlock() {
		return behaviorActionBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorActionBlock_Base_Activity() {
		return (EReference)behaviorActionBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorActionBlock_OwnedAction() {
		return (EReference)behaviorActionBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorActionBlock_FirstAction() {
		return (EReference)behaviorActionBlockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviorAction() {
		return behaviorActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehaviorAction_Parameter() {
		return (EAttribute)behaviorActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionCondition() {
		return transitionConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Type() {
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_PrimitiveType() {
		return (EReference)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortAction() {
		return portActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortAction_Port() {
		return (EReference)portActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendOutput() {
		return sendOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendOutput_Base_SendSignalAction() {
		return (EReference)sendOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetInput() {
		return getInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGetInput_Base_AcceptEventAction() {
		return (EReference)getInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubprogramCallAction() {
		return subprogramCallActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextCondition() {
		return textConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextCondition_Base_Constraint() {
		return (EReference)textConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDispatchCondition() {
		return dispatchConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDispatchCondition_Base_Trigger() {
		return (EReference)dispatchConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDispatchCondition_IsTimeout() {
		return (EAttribute)dispatchConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDispatchCondition_DispatchPort() {
		return (EReference)dispatchConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDispatchCondition_DispatchSubprogramAccess() {
		return (EReference)dispatchConditionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubprogramInstanceCallAction() {
		return subprogramInstanceCallActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubprogramInterfaceCallAction() {
		return subprogramInterfaceCallActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BAFactory getBAFactory() {
		return (BAFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		behaviorStateMachineEClass = createEClass(BEHAVIOR_STATE_MACHINE);
		createEReference(behaviorStateMachineEClass, BEHAVIOR_STATE_MACHINE__BASE_STATE_MACHINE);
		createEReference(behaviorStateMachineEClass, BEHAVIOR_STATE_MACHINE__OWNED_STATE);
		createEReference(behaviorStateMachineEClass, BEHAVIOR_STATE_MACHINE__OWNED_TRANSITION);
		createEReference(behaviorStateMachineEClass, BEHAVIOR_STATE_MACHINE__OWNED_VARIABLE);

		behaviorStateEClass = createEClass(BEHAVIOR_STATE);
		createEReference(behaviorStateEClass, BEHAVIOR_STATE__BASE_STATE);
		createEAttribute(behaviorStateEClass, BEHAVIOR_STATE__IS_COMPLETE);
		createEAttribute(behaviorStateEClass, BEHAVIOR_STATE__IS_INITIAL);
		createEAttribute(behaviorStateEClass, BEHAVIOR_STATE__IS_FINAL);

		behaviorStateTransitionEClass = createEClass(BEHAVIOR_STATE_TRANSITION);
		createEReference(behaviorStateTransitionEClass, BEHAVIOR_STATE_TRANSITION__BASE_TRANSITION);
		createEReference(behaviorStateTransitionEClass, BEHAVIOR_STATE_TRANSITION__FROM);
		createEReference(behaviorStateTransitionEClass, BEHAVIOR_STATE_TRANSITION__TO);
		createEReference(behaviorStateTransitionEClass, BEHAVIOR_STATE_TRANSITION__OWNED_ACTION_BLOCK);
		createEReference(behaviorStateTransitionEClass, BEHAVIOR_STATE_TRANSITION__OWNED_CONDITION);

		behaviorActionBlockEClass = createEClass(BEHAVIOR_ACTION_BLOCK);
		createEReference(behaviorActionBlockEClass, BEHAVIOR_ACTION_BLOCK__BASE_ACTIVITY);
		createEReference(behaviorActionBlockEClass, BEHAVIOR_ACTION_BLOCK__OWNED_ACTION);
		createEReference(behaviorActionBlockEClass, BEHAVIOR_ACTION_BLOCK__FIRST_ACTION);

		behaviorActionEClass = createEClass(BEHAVIOR_ACTION);
		createEAttribute(behaviorActionEClass, BEHAVIOR_ACTION__PARAMETER);

		transitionConditionEClass = createEClass(TRANSITION_CONDITION);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__TYPE);
		createEReference(variableEClass, VARIABLE__PRIMITIVE_TYPE);
		createEAttribute(variableEClass, VARIABLE__NAME);

		portActionEClass = createEClass(PORT_ACTION);
		createEReference(portActionEClass, PORT_ACTION__PORT);

		sendOutputEClass = createEClass(SEND_OUTPUT);
		createEReference(sendOutputEClass, SEND_OUTPUT__BASE_SEND_SIGNAL_ACTION);

		getInputEClass = createEClass(GET_INPUT);
		createEReference(getInputEClass, GET_INPUT__BASE_ACCEPT_EVENT_ACTION);

		subprogramCallActionEClass = createEClass(SUBPROGRAM_CALL_ACTION);

		textConditionEClass = createEClass(TEXT_CONDITION);
		createEReference(textConditionEClass, TEXT_CONDITION__BASE_CONSTRAINT);

		dispatchConditionEClass = createEClass(DISPATCH_CONDITION);
		createEReference(dispatchConditionEClass, DISPATCH_CONDITION__BASE_TRIGGER);
		createEAttribute(dispatchConditionEClass, DISPATCH_CONDITION__IS_TIMEOUT);
		createEReference(dispatchConditionEClass, DISPATCH_CONDITION__DISPATCH_PORT);
		createEReference(dispatchConditionEClass, DISPATCH_CONDITION__DISPATCH_SUBPROGRAM_ACCESS);

		subprogramInstanceCallActionEClass = createEClass(SUBPROGRAM_INSTANCE_CALL_ACTION);

		subprogramInterfaceCallActionEClass = createEClass(SUBPROGRAM_INTERFACE_CALL_ACTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AadlPackage theAadlPackage = (AadlPackage)EPackage.Registry.INSTANCE.getEPackage(AadlPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		behaviorStateMachineEClass.getESuperTypes().add(theAadlPackage.getAnnex());
		behaviorActionEClass.getESuperTypes().add(theAadlPackage.getSubprogramCall());
		portActionEClass.getESuperTypes().add(this.getBehaviorAction());
		sendOutputEClass.getESuperTypes().add(this.getPortAction());
		getInputEClass.getESuperTypes().add(this.getPortAction());
		subprogramCallActionEClass.getESuperTypes().add(this.getBehaviorAction());
		textConditionEClass.getESuperTypes().add(this.getTransitionCondition());
		dispatchConditionEClass.getESuperTypes().add(this.getTransitionCondition());
		subprogramInstanceCallActionEClass.getESuperTypes().add(theAadlPackage.getSubprogramInstanceCall());
		subprogramInstanceCallActionEClass.getESuperTypes().add(this.getSubprogramCallAction());
		subprogramInterfaceCallActionEClass.getESuperTypes().add(theAadlPackage.getSubprogramInterfaceCall());
		subprogramInterfaceCallActionEClass.getESuperTypes().add(this.getSubprogramCallAction());

		// Initialize classes, features, and operations; add parameters
		initEClass(behaviorStateMachineEClass, BehaviorStateMachine.class, "BehaviorStateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviorStateMachine_Base_StateMachine(), theUMLPackage.getStateMachine(), null, "base_StateMachine", null, 0, 1, BehaviorStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBehaviorStateMachine_OwnedState(), this.getBehaviorState(), null, "ownedState", null, 1, -1, BehaviorStateMachine.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getBehaviorStateMachine_OwnedTransition(), this.getBehaviorStateTransition(), null, "ownedTransition", null, 0, -1, BehaviorStateMachine.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getBehaviorStateMachine_OwnedVariable(), this.getVariable(), null, "ownedVariable", null, 0, -1, BehaviorStateMachine.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(behaviorStateEClass, BehaviorState.class, "BehaviorState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviorState_Base_State(), theUMLPackage.getState(), null, "base_State", null, 0, 1, BehaviorState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBehaviorState_IsComplete(), theTypesPackage.getBoolean(), "isComplete", null, 1, 1, BehaviorState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBehaviorState_IsInitial(), theTypesPackage.getBoolean(), "isInitial", null, 1, 1, BehaviorState.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBehaviorState_IsFinal(), theTypesPackage.getBoolean(), "isFinal", null, 1, 1, BehaviorState.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(behaviorStateTransitionEClass, BehaviorStateTransition.class, "BehaviorStateTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviorStateTransition_Base_Transition(), theUMLPackage.getTransition(), null, "base_Transition", null, 0, 1, BehaviorStateTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBehaviorStateTransition_From(), this.getBehaviorState(), null, "from", null, 1, 1, BehaviorStateTransition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getBehaviorStateTransition_To(), this.getBehaviorState(), null, "to", null, 1, 1, BehaviorStateTransition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getBehaviorStateTransition_OwnedActionBlock(), this.getBehaviorActionBlock(), null, "ownedActionBlock", null, 1, 1, BehaviorStateTransition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getBehaviorStateTransition_OwnedCondition(), this.getTransitionCondition(), null, "ownedCondition", null, 1, 1, BehaviorStateTransition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(behaviorActionBlockEClass, BehaviorActionBlock.class, "BehaviorActionBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviorActionBlock_Base_Activity(), theUMLPackage.getActivity(), null, "base_Activity", null, 0, 1, BehaviorActionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBehaviorActionBlock_OwnedAction(), this.getBehaviorAction(), null, "ownedAction", null, 0, -1, BehaviorActionBlock.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getBehaviorActionBlock_FirstAction(), this.getBehaviorAction(), null, "firstAction", null, 1, 1, BehaviorActionBlock.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(behaviorActionEClass, BehaviorAction.class, "BehaviorAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBehaviorAction_Parameter(), theTypesPackage.getString(), "parameter", null, 0, -1, BehaviorAction.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(transitionConditionEClass, TransitionCondition.class, "TransitionCondition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_Type(), theAadlPackage.getDataClassifier(), null, "type", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVariable_PrimitiveType(), theUMLPackage.getPrimitiveType(), null, "primitiveType", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVariable_Name(), theTypesPackage.getString(), "name", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(portActionEClass, PortAction.class, "PortAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortAction_Port(), theAadlPackage.getPort(), null, "port", null, 1, 1, PortAction.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(sendOutputEClass, SendOutput.class, "SendOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendOutput_Base_SendSignalAction(), theUMLPackage.getSendSignalAction(), null, "base_SendSignalAction", null, 0, 1, SendOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(getInputEClass, GetInput.class, "GetInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetInput_Base_AcceptEventAction(), theUMLPackage.getAcceptEventAction(), null, "base_AcceptEventAction", null, 0, 1, GetInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subprogramCallActionEClass, SubprogramCallAction.class, "SubprogramCallAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textConditionEClass, TextCondition.class, "TextCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTextCondition_Base_Constraint(), theUMLPackage.getConstraint(), null, "base_Constraint", null, 0, 1, TextCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dispatchConditionEClass, DispatchCondition.class, "DispatchCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDispatchCondition_Base_Trigger(), theUMLPackage.getTrigger(), null, "base_Trigger", null, 0, 1, DispatchCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDispatchCondition_IsTimeout(), theTypesPackage.getBoolean(), "isTimeout", null, 1, 1, DispatchCondition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getDispatchCondition_DispatchPort(), theAadlPackage.getEventPort(), null, "dispatchPort", null, 0, -1, DispatchCondition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getDispatchCondition_DispatchSubprogramAccess(), theAadlPackage.getSubprogramAccess(), null, "dispatchSubprogramAccess", null, 0, -1, DispatchCondition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(subprogramInstanceCallActionEClass, SubprogramInstanceCallAction.class, "SubprogramInstanceCallAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subprogramInterfaceCallActionEClass, SubprogramInterfaceCallAction.class, "SubprogramInterfaceCallAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //BAPackageImpl
