/**
 */
package NEsysml.Aadl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.StateMachine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.ModeStateMachine#getBase_StateMachine <em>Base State Machine</em>}</li>
 *   <li>{@link NEsysml.Aadl.ModeStateMachine#getOwnedMode <em>Owned Mode</em>}</li>
 *   <li>{@link NEsysml.Aadl.ModeStateMachine#getOwnedTransition <em>Owned Transition</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getModeStateMachine()
 * @model
 * @generated
 */
public interface ModeStateMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>Base State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base State Machine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base State Machine</em>' reference.
	 * @see #setBase_StateMachine(StateMachine)
	 * @see NEsysml.Aadl.AadlPackage#getModeStateMachine_Base_StateMachine()
	 * @model ordered="false"
	 * @generated
	 */
	StateMachine getBase_StateMachine();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.ModeStateMachine#getBase_StateMachine <em>Base State Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base State Machine</em>' reference.
	 * @see #getBase_StateMachine()
	 * @generated
	 */
	void setBase_StateMachine(StateMachine value);

	/**
	 * Returns the value of the '<em><b>Owned Mode</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.Aadl.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Mode</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Mode</em>' reference list.
	 * @see NEsysml.Aadl.AadlPackage#getModeStateMachine_OwnedMode()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Mode> getOwnedMode();

	/**
	 * Returns the value of the '<em><b>Owned Transition</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.Aadl.ModeTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Transition</em>' reference list.
	 * @see NEsysml.Aadl.AadlPackage#getModeStateMachine_OwnedTransition()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ModeTransition> getOwnedTransition();

} // ModeStateMachine
