/**
 */
package NEsysml.EM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Behavior Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.ErrorBehaviorTransition#getBase_Transition <em>Base Transition</em>}</li>
 *   <li>{@link NEsysml.EM.ErrorBehaviorTransition#getFrom <em>From</em>}</li>
 *   <li>{@link NEsysml.EM.ErrorBehaviorTransition#getTo <em>To</em>}</li>
 *   <li>{@link NEsysml.EM.ErrorBehaviorTransition#getTransCondition <em>Trans Condition</em>}</li>
 *   <li>{@link NEsysml.EM.ErrorBehaviorTransition#getTypeSetConstraint <em>Type Set Constraint</em>}</li>
 *   <li>{@link NEsysml.EM.ErrorBehaviorTransition#getTypeSet <em>Type Set</em>}</li>
 *   <li>{@link NEsysml.EM.ErrorBehaviorTransition#getOwnedBranches <em>Owned Branches</em>}</li>
 * </ul>
 *
 * @see NEsysml.EM.EMPackage#getErrorBehaviorTransition()
 * @model
 * @generated
 */
public interface ErrorBehaviorTransition extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Transition</em>' reference.
	 * @see #setBase_Transition(Transition)
	 * @see NEsysml.EM.EMPackage#getErrorBehaviorTransition_Base_Transition()
	 * @model ordered="false"
	 * @generated
	 */
	Transition getBase_Transition();

	/**
	 * Sets the value of the '{@link NEsysml.EM.ErrorBehaviorTransition#getBase_Transition <em>Base Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Transition</em>' reference.
	 * @see #getBase_Transition()
	 * @generated
	 */
	void setBase_Transition(Transition value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(ErrorBehaviorState)
	 * @see NEsysml.EM.EMPackage#getErrorBehaviorTransition_From()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ErrorBehaviorState getFrom();

	/**
	 * Sets the value of the '{@link NEsysml.EM.ErrorBehaviorTransition#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(ErrorBehaviorState value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(ErrorBehaviorState)
	 * @see NEsysml.EM.EMPackage#getErrorBehaviorTransition_To()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ErrorBehaviorState getTo();

	/**
	 * Sets the value of the '{@link NEsysml.EM.ErrorBehaviorTransition#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(ErrorBehaviorState value);

	/**
	 * Returns the value of the '<em><b>Trans Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trans Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trans Condition</em>' reference.
	 * @see #setTransCondition(ErrorBehaviorTransitionCondition)
	 * @see NEsysml.EM.EMPackage#getErrorBehaviorTransition_TransCondition()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ErrorBehaviorTransitionCondition getTransCondition();

	/**
	 * Sets the value of the '{@link NEsysml.EM.ErrorBehaviorTransition#getTransCondition <em>Trans Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trans Condition</em>' reference.
	 * @see #getTransCondition()
	 * @generated
	 */
	void setTransCondition(ErrorBehaviorTransitionCondition value);

	/**
	 * Returns the value of the '<em><b>Type Set Constraint</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.EM.ErrorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Set Constraint</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Set Constraint</em>' reference list.
	 * @see NEsysml.EM.EMPackage#getErrorBehaviorTransition_TypeSetConstraint()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ErrorType> getTypeSetConstraint();

	/**
	 * Returns the value of the '<em><b>Type Set</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.EM.ErrorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Set</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Set</em>' reference list.
	 * @see NEsysml.EM.EMPackage#getErrorBehaviorTransition_TypeSet()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ErrorType> getTypeSet();

	/**
	 * Returns the value of the '<em><b>Owned Branches</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.EM.TransitionBranch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Branches</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Branches</em>' reference list.
	 * @see NEsysml.EM.EMPackage#getErrorBehaviorTransition_OwnedBranches()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<TransitionBranch> getOwnedBranches();

} // ErrorBehaviorTransition
