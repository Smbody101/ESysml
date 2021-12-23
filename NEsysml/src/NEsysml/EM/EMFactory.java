/**
 */
package NEsysml.EM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see NEsysml.EM.EMPackage
 * @generated
 */
public interface EMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EMFactory eINSTANCE = NEsysml.EM.impl.EMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Error Model Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Model Library</em>'.
	 * @generated
	 */
	ErrorModelLibrary createErrorModelLibrary();

	/**
	 * Returns a new object of class '<em>Error Behavior State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Behavior State Machine</em>'.
	 * @generated
	 */
	ErrorBehaviorStateMachine createErrorBehaviorStateMachine();

	/**
	 * Returns a new object of class '<em>Error Behavior State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Behavior State</em>'.
	 * @generated
	 */
	ErrorBehaviorState createErrorBehaviorState();

	/**
	 * Returns a new object of class '<em>Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Type</em>'.
	 * @generated
	 */
	ErrorType createErrorType();

	/**
	 * Returns a new object of class '<em>Error Behavior Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Behavior Transition</em>'.
	 * @generated
	 */
	ErrorBehaviorTransition createErrorBehaviorTransition();

	/**
	 * Returns a new object of class '<em>Error Behavior Transition Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Behavior Transition Condition</em>'.
	 * @generated
	 */
	ErrorBehaviorTransitionCondition createErrorBehaviorTransitionCondition();

	/**
	 * Returns a new object of class '<em>Transition Branch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition Branch</em>'.
	 * @generated
	 */
	TransitionBranch createTransitionBranch();

	/**
	 * Returns a new object of class '<em>Error Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Event</em>'.
	 * @generated
	 */
	ErrorEvent createErrorEvent();

	/**
	 * Returns a new object of class '<em>Repair Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repair Event</em>'.
	 * @generated
	 */
	RepairEvent createRepairEvent();

	/**
	 * Returns a new object of class '<em>Recover Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recover Event</em>'.
	 * @generated
	 */
	RecoverEvent createRecoverEvent();

	/**
	 * Returns a new object of class '<em>Error Event Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Event Trigger</em>'.
	 * @generated
	 */
	ErrorEventTrigger createErrorEventTrigger();

	/**
	 * Returns a new object of class '<em>Error Behavior Transition Or Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Behavior Transition Or Expression</em>'.
	 * @generated
	 */
	ErrorBehaviorTransitionOrExpression createErrorBehaviorTransitionOrExpression();

	/**
	 * Returns a new object of class '<em>Propagation Point Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Propagation Point Trigger</em>'.
	 * @generated
	 */
	PropagationPointTrigger createPropagationPointTrigger();

	/**
	 * Returns a new object of class '<em>Error Propagation Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Propagation Point</em>'.
	 * @generated
	 */
	ErrorPropagationPoint createErrorPropagationPoint();

	/**
	 * Returns a new object of class '<em>Error Behavior Transition And Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Behavior Transition And Expression</em>'.
	 * @generated
	 */
	ErrorBehaviorTransitionAndExpression createErrorBehaviorTransitionAndExpression();

	/**
	 * Returns a new object of class '<em>Component Error Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Error Behavior</em>'.
	 * @generated
	 */
	ComponentErrorBehavior createComponentErrorBehavior();

	/**
	 * Returns a new object of class '<em>Error Propagation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Propagation</em>'.
	 * @generated
	 */
	ErrorPropagation createErrorPropagation();

	/**
	 * Returns a new object of class '<em>Error Model Subclause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Model Subclause</em>'.
	 * @generated
	 */
	ErrorModelSubclause createErrorModelSubclause();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EMPackage getEMPackage();

} //EMFactory
