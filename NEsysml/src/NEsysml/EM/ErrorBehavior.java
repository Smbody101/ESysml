/**
 */
package NEsysml.EM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.StateMachine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.ErrorBehavior#getBase_StateMachine <em>Base State Machine</em>}</li>
 *   <li>{@link NEsysml.EM.ErrorBehavior#getOwnedEvent <em>Owned Event</em>}</li>
 *   <li>{@link NEsysml.EM.ErrorBehavior#getOwnedState <em>Owned State</em>}</li>
 *   <li>{@link NEsysml.EM.ErrorBehavior#getOwnedTransition <em>Owned Transition</em>}</li>
 *   <li>{@link NEsysml.EM.ErrorBehavior#getUseType <em>Use Type</em>}</li>
 * </ul>
 *
 * @see NEsysml.EM.EMPackage#getErrorBehavior()
 * @model abstract="true"
 * @generated
 */
public interface ErrorBehavior extends EObject {
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
	 * @see NEsysml.EM.EMPackage#getErrorBehavior_Base_StateMachine()
	 * @model ordered="false"
	 * @generated
	 */
	StateMachine getBase_StateMachine();

	/**
	 * Sets the value of the '{@link NEsysml.EM.ErrorBehavior#getBase_StateMachine <em>Base State Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base State Machine</em>' reference.
	 * @see #getBase_StateMachine()
	 * @generated
	 */
	void setBase_StateMachine(StateMachine value);

	/**
	 * Returns the value of the '<em><b>Owned Event</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.EM.ErrorBehaviorEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Event</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Event</em>' reference list.
	 * @see NEsysml.EM.EMPackage#getErrorBehavior_OwnedEvent()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ErrorBehaviorEvent> getOwnedEvent();

	/**
	 * Returns the value of the '<em><b>Owned State</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.EM.ErrorBehaviorState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned State</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned State</em>' reference list.
	 * @see NEsysml.EM.EMPackage#getErrorBehavior_OwnedState()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ErrorBehaviorState> getOwnedState();

	/**
	 * Returns the value of the '<em><b>Owned Transition</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.EM.ErrorBehaviorTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Transition</em>' reference list.
	 * @see NEsysml.EM.EMPackage#getErrorBehavior_OwnedTransition()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ErrorBehaviorTransition> getOwnedTransition();

	/**
	 * Returns the value of the '<em><b>Use Type</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.EM.ErrorModelLibrary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Type</em>' reference list.
	 * @see NEsysml.EM.EMPackage#getErrorBehavior_UseType()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ErrorModelLibrary> getUseType();

} // ErrorBehavior
