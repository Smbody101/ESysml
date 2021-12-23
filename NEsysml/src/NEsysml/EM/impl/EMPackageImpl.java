/**
 */
package NEsysml.EM.impl;

import NEsysml.Aadl.AadlPackage;

import NEsysml.Aadl.impl.AadlPackageImpl;

import NEsysml.BA.BAPackage;

import NEsysml.BA.impl.BAPackageImpl;

import NEsysml.EM.ComponentErrorBehavior;
import NEsysml.EM.EMFactory;
import NEsysml.EM.EMPackage;
import NEsysml.EM.ErrorBehavior;
import NEsysml.EM.ErrorBehaviorEvent;
import NEsysml.EM.ErrorBehaviorState;
import NEsysml.EM.ErrorBehaviorStateMachine;
import NEsysml.EM.ErrorBehaviorTransition;
import NEsysml.EM.ErrorBehaviorTransitionAndExpression;
import NEsysml.EM.ErrorBehaviorTransitionCondition;
import NEsysml.EM.ErrorBehaviorTransitionExpression;
import NEsysml.EM.ErrorBehaviorTransitionOrExpression;
import NEsysml.EM.ErrorEvent;
import NEsysml.EM.ErrorEventTrigger;
import NEsysml.EM.ErrorModelLibrary;
import NEsysml.EM.ErrorModelSubclause;
import NEsysml.EM.ErrorPropagation;
import NEsysml.EM.ErrorPropagationPoint;
import NEsysml.EM.ErrorTransitionTrigger;
import NEsysml.EM.ErrorType;
import NEsysml.EM.ErrorTypedElement;
import NEsysml.EM.PropagationPointTrigger;
import NEsysml.EM.RecoverEvent;
import NEsysml.EM.RepairEvent;
import NEsysml.EM.TransitionBranch;

import NEsysml.NEsysmlPackage;

import NEsysml.impl.NEsysmlPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.sysml14.portsandflows.PortsandflowsPackage;

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
public class EMPackageImpl extends EPackageImpl implements EMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorModelLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorBehaviorStateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorBehaviorEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorBehaviorStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorTypedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorBehaviorTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorBehaviorTransitionConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorBehaviorTransitionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionBranchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repairEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recoverEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorEventTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorTransitionTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorBehaviorTransitionOrExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagationPointTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorPropagationPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorBehaviorTransitionAndExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentErrorBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorPropagationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorModelSubclauseEClass = null;

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
	 * @see NEsysml.EM.EMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EMPackageImpl() {
		super(eNS_URI, EMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EMPackage init() {
		if (isInited) return (EMPackage)EPackage.Registry.INSTANCE.getEPackage(EMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EMPackageImpl theEMPackage = registeredEMPackage instanceof EMPackageImpl ? (EMPackageImpl)registeredEMPackage : new EMPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BAPackage.eNS_URI);
		BAPackageImpl theBAPackage = (BAPackageImpl)(registeredPackage instanceof BAPackageImpl ? registeredPackage : BAPackage.eINSTANCE);

		// Create package meta-data objects
		theEMPackage.createPackageContents();
		theNEsysmlPackage.createPackageContents();
		theAadlPackage.createPackageContents();
		theBAPackage.createPackageContents();

		// Initialize created meta-data
		theEMPackage.initializePackageContents();
		theNEsysmlPackage.initializePackageContents();
		theAadlPackage.initializePackageContents();
		theBAPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EMPackage.eNS_URI, theEMPackage);
		return theEMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorModelLibrary() {
		return errorModelLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorModelLibrary_OwnedBehaviors() {
		return (EReference)errorModelLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorModelLibrary_OwnedErrorType() {
		return (EReference)errorModelLibraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorModelLibrary_Import() {
		return (EReference)errorModelLibraryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorModelLibrary_Base_Package() {
		return (EReference)errorModelLibraryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorBehaviorStateMachine() {
		return errorBehaviorStateMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorBehaviorStateMachine_InPackage() {
		return (EReference)errorBehaviorStateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorBehavior() {
		return errorBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorBehavior_Base_StateMachine() {
		return (EReference)errorBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorBehavior_OwnedEvent() {
		return (EReference)errorBehaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorBehavior_OwnedState() {
		return (EReference)errorBehaviorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorBehavior_OwnedTransition() {
		return (EReference)errorBehaviorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorBehavior_UseType() {
		return (EReference)errorBehaviorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorBehaviorEvent() {
		return errorBehaviorEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorBehaviorEvent_Base_ChangeEvent() {
		return (EReference)errorBehaviorEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorBehaviorState() {
		return errorBehaviorStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorBehaviorState_Base_State() {
		return (EReference)errorBehaviorStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorBehaviorState_IsInitial() {
		return (EAttribute)errorBehaviorStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorTypedElement() {
		return errorTypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorTypedElement_OwnedErrorType() {
		return (EReference)errorTypedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorType() {
		return errorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorType_Base_DataType() {
		return (EReference)errorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorType_Extension() {
		return (EReference)errorTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorType_InLibrary() {
		return (EReference)errorTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorBehaviorTransition() {
		return errorBehaviorTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorBehaviorTransition_Base_Transition() {
		return (EReference)errorBehaviorTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorBehaviorTransition_From() {
		return (EReference)errorBehaviorTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorBehaviorTransition_To() {
		return (EReference)errorBehaviorTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorBehaviorTransition_TransCondition() {
		return (EReference)errorBehaviorTransitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorBehaviorTransition_TypeSetConstraint() {
		return (EReference)errorBehaviorTransitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorBehaviorTransition_TypeSet() {
		return (EReference)errorBehaviorTransitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorBehaviorTransition_OwnedBranches() {
		return (EReference)errorBehaviorTransitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorBehaviorTransitionCondition() {
		return errorBehaviorTransitionConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorBehaviorTransitionCondition_Base_Activity() {
		return (EReference)errorBehaviorTransitionConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorBehaviorTransitionCondition_Expression() {
		return (EReference)errorBehaviorTransitionConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorBehaviorTransitionExpression() {
		return errorBehaviorTransitionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionBranch() {
		return transitionBranchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitionBranch_Base_Transition() {
		return (EReference)transitionBranchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionBranch_Probability() {
		return (EAttribute)transitionBranchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionBranch_IsOthers() {
		return (EAttribute)transitionBranchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitionBranch_Target() {
		return (EReference)transitionBranchEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorEvent() {
		return errorEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepairEvent() {
		return repairEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecoverEvent() {
		return recoverEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorEventTrigger() {
		return errorEventTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorEventTrigger_ErrorEvent() {
		return (EReference)errorEventTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorTransitionTrigger() {
		return errorTransitionTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorTransitionTrigger_Base_Trigger() {
		return (EReference)errorTransitionTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorBehaviorTransitionOrExpression() {
		return errorBehaviorTransitionOrExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorBehaviorTransitionOrExpression_Base_AcceptEventAction() {
		return (EReference)errorBehaviorTransitionOrExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorBehaviorTransitionOrExpression_Oprands() {
		return (EReference)errorBehaviorTransitionOrExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagationPointTrigger() {
		return propagationPointTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagationPointTrigger_Context() {
		return (EReference)propagationPointTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagationPointTrigger_Point() {
		return (EReference)propagationPointTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorPropagationPoint() {
		return errorPropagationPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorPropagationPoint_BindFeature() {
		return (EReference)errorPropagationPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorBehaviorTransitionAndExpression() {
		return errorBehaviorTransitionAndExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorBehaviorTransitionAndExpression_Base_JoinNode() {
		return (EReference)errorBehaviorTransitionAndExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorBehaviorTransitionAndExpression_OwnedExpression() {
		return (EReference)errorBehaviorTransitionAndExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentErrorBehavior() {
		return componentErrorBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentErrorBehavior_ImportBehavior() {
		return (EReference)componentErrorBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentErrorBehavior_OwnedErrorPropagation() {
		return (EReference)componentErrorBehaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorPropagation() {
		return errorPropagationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorPropagation_Target() {
		return (EReference)errorPropagationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorModelSubclause() {
		return errorModelSubclauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorModelSubclause_Base_Class() {
		return (EReference)errorModelSubclauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorModelSubclause_OwnedPropagationPoint() {
		return (EReference)errorModelSubclauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorModelSubclause_OwnedBehavior() {
		return (EReference)errorModelSubclauseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorModelSubclause_UseTypes() {
		return (EReference)errorModelSubclauseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFactory getEMFactory() {
		return (EMFactory)getEFactoryInstance();
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
		errorModelLibraryEClass = createEClass(ERROR_MODEL_LIBRARY);
		createEReference(errorModelLibraryEClass, ERROR_MODEL_LIBRARY__OWNED_BEHAVIORS);
		createEReference(errorModelLibraryEClass, ERROR_MODEL_LIBRARY__OWNED_ERROR_TYPE);
		createEReference(errorModelLibraryEClass, ERROR_MODEL_LIBRARY__IMPORT);
		createEReference(errorModelLibraryEClass, ERROR_MODEL_LIBRARY__BASE_PACKAGE);

		errorBehaviorStateMachineEClass = createEClass(ERROR_BEHAVIOR_STATE_MACHINE);
		createEReference(errorBehaviorStateMachineEClass, ERROR_BEHAVIOR_STATE_MACHINE__IN_PACKAGE);

		errorBehaviorEClass = createEClass(ERROR_BEHAVIOR);
		createEReference(errorBehaviorEClass, ERROR_BEHAVIOR__BASE_STATE_MACHINE);
		createEReference(errorBehaviorEClass, ERROR_BEHAVIOR__OWNED_EVENT);
		createEReference(errorBehaviorEClass, ERROR_BEHAVIOR__OWNED_STATE);
		createEReference(errorBehaviorEClass, ERROR_BEHAVIOR__OWNED_TRANSITION);
		createEReference(errorBehaviorEClass, ERROR_BEHAVIOR__USE_TYPE);

		errorBehaviorEventEClass = createEClass(ERROR_BEHAVIOR_EVENT);
		createEReference(errorBehaviorEventEClass, ERROR_BEHAVIOR_EVENT__BASE_CHANGE_EVENT);

		errorBehaviorStateEClass = createEClass(ERROR_BEHAVIOR_STATE);
		createEReference(errorBehaviorStateEClass, ERROR_BEHAVIOR_STATE__BASE_STATE);
		createEAttribute(errorBehaviorStateEClass, ERROR_BEHAVIOR_STATE__IS_INITIAL);

		errorTypedElementEClass = createEClass(ERROR_TYPED_ELEMENT);
		createEReference(errorTypedElementEClass, ERROR_TYPED_ELEMENT__OWNED_ERROR_TYPE);

		errorTypeEClass = createEClass(ERROR_TYPE);
		createEReference(errorTypeEClass, ERROR_TYPE__BASE_DATA_TYPE);
		createEReference(errorTypeEClass, ERROR_TYPE__EXTENSION);
		createEReference(errorTypeEClass, ERROR_TYPE__IN_LIBRARY);

		errorBehaviorTransitionEClass = createEClass(ERROR_BEHAVIOR_TRANSITION);
		createEReference(errorBehaviorTransitionEClass, ERROR_BEHAVIOR_TRANSITION__BASE_TRANSITION);
		createEReference(errorBehaviorTransitionEClass, ERROR_BEHAVIOR_TRANSITION__FROM);
		createEReference(errorBehaviorTransitionEClass, ERROR_BEHAVIOR_TRANSITION__TO);
		createEReference(errorBehaviorTransitionEClass, ERROR_BEHAVIOR_TRANSITION__TRANS_CONDITION);
		createEReference(errorBehaviorTransitionEClass, ERROR_BEHAVIOR_TRANSITION__TYPE_SET_CONSTRAINT);
		createEReference(errorBehaviorTransitionEClass, ERROR_BEHAVIOR_TRANSITION__TYPE_SET);
		createEReference(errorBehaviorTransitionEClass, ERROR_BEHAVIOR_TRANSITION__OWNED_BRANCHES);

		errorBehaviorTransitionConditionEClass = createEClass(ERROR_BEHAVIOR_TRANSITION_CONDITION);
		createEReference(errorBehaviorTransitionConditionEClass, ERROR_BEHAVIOR_TRANSITION_CONDITION__BASE_ACTIVITY);
		createEReference(errorBehaviorTransitionConditionEClass, ERROR_BEHAVIOR_TRANSITION_CONDITION__EXPRESSION);

		errorBehaviorTransitionExpressionEClass = createEClass(ERROR_BEHAVIOR_TRANSITION_EXPRESSION);

		transitionBranchEClass = createEClass(TRANSITION_BRANCH);
		createEReference(transitionBranchEClass, TRANSITION_BRANCH__BASE_TRANSITION);
		createEAttribute(transitionBranchEClass, TRANSITION_BRANCH__PROBABILITY);
		createEAttribute(transitionBranchEClass, TRANSITION_BRANCH__IS_OTHERS);
		createEReference(transitionBranchEClass, TRANSITION_BRANCH__TARGET);

		errorEventEClass = createEClass(ERROR_EVENT);

		repairEventEClass = createEClass(REPAIR_EVENT);

		recoverEventEClass = createEClass(RECOVER_EVENT);

		errorEventTriggerEClass = createEClass(ERROR_EVENT_TRIGGER);
		createEReference(errorEventTriggerEClass, ERROR_EVENT_TRIGGER__ERROR_EVENT);

		errorTransitionTriggerEClass = createEClass(ERROR_TRANSITION_TRIGGER);
		createEReference(errorTransitionTriggerEClass, ERROR_TRANSITION_TRIGGER__BASE_TRIGGER);

		errorBehaviorTransitionOrExpressionEClass = createEClass(ERROR_BEHAVIOR_TRANSITION_OR_EXPRESSION);
		createEReference(errorBehaviorTransitionOrExpressionEClass, ERROR_BEHAVIOR_TRANSITION_OR_EXPRESSION__BASE_ACCEPT_EVENT_ACTION);
		createEReference(errorBehaviorTransitionOrExpressionEClass, ERROR_BEHAVIOR_TRANSITION_OR_EXPRESSION__OPRANDS);

		propagationPointTriggerEClass = createEClass(PROPAGATION_POINT_TRIGGER);
		createEReference(propagationPointTriggerEClass, PROPAGATION_POINT_TRIGGER__CONTEXT);
		createEReference(propagationPointTriggerEClass, PROPAGATION_POINT_TRIGGER__POINT);

		errorPropagationPointEClass = createEClass(ERROR_PROPAGATION_POINT);
		createEReference(errorPropagationPointEClass, ERROR_PROPAGATION_POINT__BIND_FEATURE);

		errorBehaviorTransitionAndExpressionEClass = createEClass(ERROR_BEHAVIOR_TRANSITION_AND_EXPRESSION);
		createEReference(errorBehaviorTransitionAndExpressionEClass, ERROR_BEHAVIOR_TRANSITION_AND_EXPRESSION__BASE_JOIN_NODE);
		createEReference(errorBehaviorTransitionAndExpressionEClass, ERROR_BEHAVIOR_TRANSITION_AND_EXPRESSION__OWNED_EXPRESSION);

		componentErrorBehaviorEClass = createEClass(COMPONENT_ERROR_BEHAVIOR);
		createEReference(componentErrorBehaviorEClass, COMPONENT_ERROR_BEHAVIOR__IMPORT_BEHAVIOR);
		createEReference(componentErrorBehaviorEClass, COMPONENT_ERROR_BEHAVIOR__OWNED_ERROR_PROPAGATION);

		errorPropagationEClass = createEClass(ERROR_PROPAGATION);
		createEReference(errorPropagationEClass, ERROR_PROPAGATION__TARGET);

		errorModelSubclauseEClass = createEClass(ERROR_MODEL_SUBCLAUSE);
		createEReference(errorModelSubclauseEClass, ERROR_MODEL_SUBCLAUSE__BASE_CLASS);
		createEReference(errorModelSubclauseEClass, ERROR_MODEL_SUBCLAUSE__OWNED_PROPAGATION_POINT);
		createEReference(errorModelSubclauseEClass, ERROR_MODEL_SUBCLAUSE__OWNED_BEHAVIOR);
		createEReference(errorModelSubclauseEClass, ERROR_MODEL_SUBCLAUSE__USE_TYPES);
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
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		PortsandflowsPackage thePortsandflowsPackage = (PortsandflowsPackage)EPackage.Registry.INSTANCE.getEPackage(PortsandflowsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		errorBehaviorStateMachineEClass.getESuperTypes().add(this.getErrorBehavior());
		errorBehaviorStateEClass.getESuperTypes().add(this.getErrorTypedElement());
		transitionBranchEClass.getESuperTypes().add(this.getErrorTypedElement());
		errorEventEClass.getESuperTypes().add(this.getErrorBehaviorEvent());
		errorEventEClass.getESuperTypes().add(this.getErrorTypedElement());
		repairEventEClass.getESuperTypes().add(this.getErrorBehaviorEvent());
		recoverEventEClass.getESuperTypes().add(this.getErrorBehaviorEvent());
		errorEventTriggerEClass.getESuperTypes().add(this.getErrorTransitionTrigger());
		errorTransitionTriggerEClass.getESuperTypes().add(this.getErrorTypedElement());
		errorBehaviorTransitionOrExpressionEClass.getESuperTypes().add(this.getErrorBehaviorTransitionExpression());
		propagationPointTriggerEClass.getESuperTypes().add(this.getErrorTransitionTrigger());
		errorPropagationPointEClass.getESuperTypes().add(this.getErrorTypedElement());
		errorPropagationPointEClass.getESuperTypes().add(thePortsandflowsPackage.getProxyPort());
		errorBehaviorTransitionAndExpressionEClass.getESuperTypes().add(this.getErrorBehaviorTransitionExpression());
		componentErrorBehaviorEClass.getESuperTypes().add(this.getErrorBehavior());
		errorPropagationEClass.getESuperTypes().add(this.getErrorBehaviorTransition());

		// Initialize classes, features, and operations; add parameters
		initEClass(errorModelLibraryEClass, ErrorModelLibrary.class, "ErrorModelLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorModelLibrary_OwnedBehaviors(), this.getErrorBehaviorStateMachine(), this.getErrorBehaviorStateMachine_InPackage(), "ownedBehaviors", null, 0, -1, ErrorModelLibrary.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getErrorModelLibrary_OwnedErrorType(), this.getErrorType(), this.getErrorType_InLibrary(), "ownedErrorType", null, 0, -1, ErrorModelLibrary.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getErrorModelLibrary_Import(), this.getErrorModelLibrary(), null, "import", null, 0, -1, ErrorModelLibrary.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getErrorModelLibrary_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 0, 1, ErrorModelLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(errorBehaviorStateMachineEClass, ErrorBehaviorStateMachine.class, "ErrorBehaviorStateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorBehaviorStateMachine_InPackage(), this.getErrorModelLibrary(), this.getErrorModelLibrary_OwnedBehaviors(), "inPackage", null, 1, 1, ErrorBehaviorStateMachine.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(errorBehaviorEClass, ErrorBehavior.class, "ErrorBehavior", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorBehavior_Base_StateMachine(), theUMLPackage.getStateMachine(), null, "base_StateMachine", null, 0, 1, ErrorBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getErrorBehavior_OwnedEvent(), this.getErrorBehaviorEvent(), null, "ownedEvent", null, 0, -1, ErrorBehavior.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getErrorBehavior_OwnedState(), this.getErrorBehaviorState(), null, "ownedState", null, 0, -1, ErrorBehavior.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getErrorBehavior_OwnedTransition(), this.getErrorBehaviorTransition(), null, "ownedTransition", null, 0, -1, ErrorBehavior.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getErrorBehavior_UseType(), this.getErrorModelLibrary(), null, "useType", null, 0, -1, ErrorBehavior.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(errorBehaviorEventEClass, ErrorBehaviorEvent.class, "ErrorBehaviorEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorBehaviorEvent_Base_ChangeEvent(), theUMLPackage.getChangeEvent(), null, "base_ChangeEvent", null, 0, 1, ErrorBehaviorEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(errorBehaviorStateEClass, ErrorBehaviorState.class, "ErrorBehaviorState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorBehaviorState_Base_State(), theUMLPackage.getState(), null, "base_State", null, 0, 1, ErrorBehaviorState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getErrorBehaviorState_IsInitial(), theTypesPackage.getBoolean(), "isInitial", null, 1, 1, ErrorBehaviorState.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(errorTypedElementEClass, ErrorTypedElement.class, "ErrorTypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorTypedElement_OwnedErrorType(), this.getErrorType(), null, "ownedErrorType", null, 0, -1, ErrorTypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(errorTypeEClass, ErrorType.class, "ErrorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorType_Base_DataType(), theUMLPackage.getDataType(), null, "base_DataType", null, 0, 1, ErrorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getErrorType_Extension(), this.getErrorType(), null, "extension", null, 0, 1, ErrorType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getErrorType_InLibrary(), this.getErrorModelLibrary(), this.getErrorModelLibrary_OwnedErrorType(), "inLibrary", null, 1, 1, ErrorType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(errorBehaviorTransitionEClass, ErrorBehaviorTransition.class, "ErrorBehaviorTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorBehaviorTransition_Base_Transition(), theUMLPackage.getTransition(), null, "base_Transition", null, 0, 1, ErrorBehaviorTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getErrorBehaviorTransition_From(), this.getErrorBehaviorState(), null, "from", null, 1, 1, ErrorBehaviorTransition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getErrorBehaviorTransition_To(), this.getErrorBehaviorState(), null, "to", null, 1, 1, ErrorBehaviorTransition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getErrorBehaviorTransition_TransCondition(), this.getErrorBehaviorTransitionCondition(), null, "transCondition", null, 0, 1, ErrorBehaviorTransition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getErrorBehaviorTransition_TypeSetConstraint(), this.getErrorType(), null, "typeSetConstraint", null, 0, -1, ErrorBehaviorTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getErrorBehaviorTransition_TypeSet(), this.getErrorType(), null, "typeSet", null, 0, -1, ErrorBehaviorTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getErrorBehaviorTransition_OwnedBranches(), this.getTransitionBranch(), null, "ownedBranches", null, 0, -1, ErrorBehaviorTransition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(errorBehaviorTransitionConditionEClass, ErrorBehaviorTransitionCondition.class, "ErrorBehaviorTransitionCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorBehaviorTransitionCondition_Base_Activity(), theUMLPackage.getActivity(), null, "base_Activity", null, 0, 1, ErrorBehaviorTransitionCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getErrorBehaviorTransitionCondition_Expression(), this.getErrorBehaviorTransitionExpression(), null, "expression", null, 0, 1, ErrorBehaviorTransitionCondition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(errorBehaviorTransitionExpressionEClass, ErrorBehaviorTransitionExpression.class, "ErrorBehaviorTransitionExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionBranchEClass, TransitionBranch.class, "TransitionBranch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransitionBranch_Base_Transition(), theUMLPackage.getTransition(), null, "base_Transition", null, 0, 1, TransitionBranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTransitionBranch_Probability(), theTypesPackage.getReal(), "probability", null, 1, 1, TransitionBranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTransitionBranch_IsOthers(), theTypesPackage.getBoolean(), "isOthers", null, 1, 1, TransitionBranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransitionBranch_Target(), this.getErrorBehaviorState(), null, "target", null, 1, 1, TransitionBranch.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(errorEventEClass, ErrorEvent.class, "ErrorEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(repairEventEClass, RepairEvent.class, "RepairEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(recoverEventEClass, RecoverEvent.class, "RecoverEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(errorEventTriggerEClass, ErrorEventTrigger.class, "ErrorEventTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorEventTrigger_ErrorEvent(), this.getErrorEvent(), null, "errorEvent", null, 1, 1, ErrorEventTrigger.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(errorTransitionTriggerEClass, ErrorTransitionTrigger.class, "ErrorTransitionTrigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorTransitionTrigger_Base_Trigger(), theUMLPackage.getTrigger(), null, "base_Trigger", null, 0, 1, ErrorTransitionTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(errorBehaviorTransitionOrExpressionEClass, ErrorBehaviorTransitionOrExpression.class, "ErrorBehaviorTransitionOrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorBehaviorTransitionOrExpression_Base_AcceptEventAction(), theUMLPackage.getAcceptEventAction(), null, "base_AcceptEventAction", null, 0, 1, ErrorBehaviorTransitionOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getErrorBehaviorTransitionOrExpression_Oprands(), this.getErrorTransitionTrigger(), null, "oprands", null, 0, -1, ErrorBehaviorTransitionOrExpression.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(propagationPointTriggerEClass, PropagationPointTrigger.class, "PropagationPointTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropagationPointTrigger_Context(), theEcorePackage.getEObject(), null, "context", null, 1, 1, PropagationPointTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPropagationPointTrigger_Point(), this.getErrorPropagationPoint(), null, "point", null, 1, 1, PropagationPointTrigger.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(errorPropagationPointEClass, ErrorPropagationPoint.class, "ErrorPropagationPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorPropagationPoint_BindFeature(), theEcorePackage.getEObject(), null, "bindFeature", null, 1, 1, ErrorPropagationPoint.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(errorBehaviorTransitionAndExpressionEClass, ErrorBehaviorTransitionAndExpression.class, "ErrorBehaviorTransitionAndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorBehaviorTransitionAndExpression_Base_JoinNode(), theUMLPackage.getJoinNode(), null, "base_JoinNode", null, 0, 1, ErrorBehaviorTransitionAndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getErrorBehaviorTransitionAndExpression_OwnedExpression(), this.getErrorBehaviorTransitionExpression(), null, "ownedExpression", null, 0, -1, ErrorBehaviorTransitionAndExpression.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(componentErrorBehaviorEClass, ComponentErrorBehavior.class, "ComponentErrorBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentErrorBehavior_ImportBehavior(), this.getErrorBehaviorStateMachine(), null, "importBehavior", null, 1, 1, ComponentErrorBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComponentErrorBehavior_OwnedErrorPropagation(), this.getErrorPropagation(), null, "ownedErrorPropagation", null, 0, -1, ComponentErrorBehavior.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(errorPropagationEClass, ErrorPropagation.class, "ErrorPropagation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorPropagation_Target(), this.getErrorPropagationPoint(), null, "target", null, 1, 1, ErrorPropagation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(errorModelSubclauseEClass, ErrorModelSubclause.class, "ErrorModelSubclause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorModelSubclause_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, ErrorModelSubclause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getErrorModelSubclause_OwnedPropagationPoint(), this.getErrorPropagationPoint(), null, "ownedPropagationPoint", null, 0, -1, ErrorModelSubclause.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getErrorModelSubclause_OwnedBehavior(), this.getComponentErrorBehavior(), null, "ownedBehavior", null, 1, 1, ErrorModelSubclause.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getErrorModelSubclause_UseTypes(), this.getErrorModelLibrary(), null, "useTypes", null, 0, -1, ErrorModelSubclause.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
	}

} //EMPackageImpl
