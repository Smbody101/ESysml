/**
 */
package NEsysml.BA;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see NEsysml.BA.BAPackage
 * @generated
 */
public interface BAFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BAFactory eINSTANCE = NEsysml.BA.impl.BAFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Behavior State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior State Machine</em>'.
	 * @generated
	 */
	BehaviorStateMachine createBehaviorStateMachine();

	/**
	 * Returns a new object of class '<em>Behavior State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior State</em>'.
	 * @generated
	 */
	BehaviorState createBehaviorState();

	/**
	 * Returns a new object of class '<em>Behavior State Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior State Transition</em>'.
	 * @generated
	 */
	BehaviorStateTransition createBehaviorStateTransition();

	/**
	 * Returns a new object of class '<em>Behavior Action Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior Action Block</em>'.
	 * @generated
	 */
	BehaviorActionBlock createBehaviorActionBlock();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Send Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Output</em>'.
	 * @generated
	 */
	SendOutput createSendOutput();

	/**
	 * Returns a new object of class '<em>Get Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Input</em>'.
	 * @generated
	 */
	GetInput createGetInput();

	/**
	 * Returns a new object of class '<em>Text Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Condition</em>'.
	 * @generated
	 */
	TextCondition createTextCondition();

	/**
	 * Returns a new object of class '<em>Dispatch Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dispatch Condition</em>'.
	 * @generated
	 */
	DispatchCondition createDispatchCondition();

	/**
	 * Returns a new object of class '<em>Subprogram Instance Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subprogram Instance Call Action</em>'.
	 * @generated
	 */
	SubprogramInstanceCallAction createSubprogramInstanceCallAction();

	/**
	 * Returns a new object of class '<em>Subprogram Interface Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subprogram Interface Call Action</em>'.
	 * @generated
	 */
	SubprogramInterfaceCallAction createSubprogramInterfaceCallAction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BAPackage getBAPackage();

} //BAFactory
