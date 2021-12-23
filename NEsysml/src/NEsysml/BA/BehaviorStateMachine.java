/**
 */
package NEsysml.BA;

import NEsysml.Aadl.Annex;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.StateMachine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.BA.BehaviorStateMachine#getBase_StateMachine <em>Base State Machine</em>}</li>
 *   <li>{@link NEsysml.BA.BehaviorStateMachine#getOwnedState <em>Owned State</em>}</li>
 *   <li>{@link NEsysml.BA.BehaviorStateMachine#getOwnedTransition <em>Owned Transition</em>}</li>
 *   <li>{@link NEsysml.BA.BehaviorStateMachine#getOwnedVariable <em>Owned Variable</em>}</li>
 * </ul>
 *
 * @see NEsysml.BA.BAPackage#getBehaviorStateMachine()
 * @model
 * @generated
 */
public interface BehaviorStateMachine extends Annex {
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
	 * @see NEsysml.BA.BAPackage#getBehaviorStateMachine_Base_StateMachine()
	 * @model ordered="false"
	 * @generated
	 */
	StateMachine getBase_StateMachine();

	/**
	 * Sets the value of the '{@link NEsysml.BA.BehaviorStateMachine#getBase_StateMachine <em>Base State Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base State Machine</em>' reference.
	 * @see #getBase_StateMachine()
	 * @generated
	 */
	void setBase_StateMachine(StateMachine value);

	/**
	 * Returns the value of the '<em><b>Owned State</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.BA.BehaviorState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned State</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned State</em>' reference list.
	 * @see NEsysml.BA.BAPackage#getBehaviorStateMachine_OwnedState()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<BehaviorState> getOwnedState();

	/**
	 * Returns the value of the '<em><b>Owned Transition</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.BA.BehaviorStateTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Transition</em>' reference list.
	 * @see NEsysml.BA.BAPackage#getBehaviorStateMachine_OwnedTransition()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<BehaviorStateTransition> getOwnedTransition();

	/**
	 * Returns the value of the '<em><b>Owned Variable</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.BA.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Variable</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Variable</em>' reference list.
	 * @see NEsysml.BA.BAPackage#getBehaviorStateMachine_OwnedVariable()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Variable> getOwnedVariable();

} // BehaviorStateMachine
