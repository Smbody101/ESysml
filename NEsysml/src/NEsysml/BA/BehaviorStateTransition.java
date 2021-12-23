/**
 */
package NEsysml.BA;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior State Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.BA.BehaviorStateTransition#getBase_Transition <em>Base Transition</em>}</li>
 *   <li>{@link NEsysml.BA.BehaviorStateTransition#getFrom <em>From</em>}</li>
 *   <li>{@link NEsysml.BA.BehaviorStateTransition#getTo <em>To</em>}</li>
 *   <li>{@link NEsysml.BA.BehaviorStateTransition#getOwnedActionBlock <em>Owned Action Block</em>}</li>
 *   <li>{@link NEsysml.BA.BehaviorStateTransition#getOwnedCondition <em>Owned Condition</em>}</li>
 * </ul>
 *
 * @see NEsysml.BA.BAPackage#getBehaviorStateTransition()
 * @model
 * @generated
 */
public interface BehaviorStateTransition extends EObject {
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
	 * @see NEsysml.BA.BAPackage#getBehaviorStateTransition_Base_Transition()
	 * @model ordered="false"
	 * @generated
	 */
	Transition getBase_Transition();

	/**
	 * Sets the value of the '{@link NEsysml.BA.BehaviorStateTransition#getBase_Transition <em>Base Transition</em>}' reference.
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
	 * @see #setFrom(BehaviorState)
	 * @see NEsysml.BA.BAPackage#getBehaviorStateTransition_From()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	BehaviorState getFrom();

	/**
	 * Sets the value of the '{@link NEsysml.BA.BehaviorStateTransition#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(BehaviorState value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(BehaviorState)
	 * @see NEsysml.BA.BAPackage#getBehaviorStateTransition_To()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	BehaviorState getTo();

	/**
	 * Sets the value of the '{@link NEsysml.BA.BehaviorStateTransition#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(BehaviorState value);

	/**
	 * Returns the value of the '<em><b>Owned Action Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Action Block</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Action Block</em>' reference.
	 * @see #setOwnedActionBlock(BehaviorActionBlock)
	 * @see NEsysml.BA.BAPackage#getBehaviorStateTransition_OwnedActionBlock()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	BehaviorActionBlock getOwnedActionBlock();

	/**
	 * Sets the value of the '{@link NEsysml.BA.BehaviorStateTransition#getOwnedActionBlock <em>Owned Action Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Action Block</em>' reference.
	 * @see #getOwnedActionBlock()
	 * @generated
	 */
	void setOwnedActionBlock(BehaviorActionBlock value);

	/**
	 * Returns the value of the '<em><b>Owned Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Condition</em>' reference.
	 * @see #setOwnedCondition(TransitionCondition)
	 * @see NEsysml.BA.BAPackage#getBehaviorStateTransition_OwnedCondition()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	TransitionCondition getOwnedCondition();

	/**
	 * Sets the value of the '{@link NEsysml.BA.BehaviorStateTransition#getOwnedCondition <em>Owned Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Condition</em>' reference.
	 * @see #getOwnedCondition()
	 * @generated
	 */
	void setOwnedCondition(TransitionCondition value);

} // BehaviorStateTransition
