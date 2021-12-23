/**
 */
package NEsysml.EM;

import org.eclipse.uml2.uml.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.TransitionBranch#getBase_Transition <em>Base Transition</em>}</li>
 *   <li>{@link NEsysml.EM.TransitionBranch#getProbability <em>Probability</em>}</li>
 *   <li>{@link NEsysml.EM.TransitionBranch#isOthers <em>Is Others</em>}</li>
 *   <li>{@link NEsysml.EM.TransitionBranch#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see NEsysml.EM.EMPackage#getTransitionBranch()
 * @model
 * @generated
 */
public interface TransitionBranch extends ErrorTypedElement {
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
	 * @see NEsysml.EM.EMPackage#getTransitionBranch_Base_Transition()
	 * @model ordered="false"
	 * @generated
	 */
	Transition getBase_Transition();

	/**
	 * Sets the value of the '{@link NEsysml.EM.TransitionBranch#getBase_Transition <em>Base Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Transition</em>' reference.
	 * @see #getBase_Transition()
	 * @generated
	 */
	void setBase_Transition(Transition value);

	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @see NEsysml.EM.EMPackage#getTransitionBranch_Probability()
	 * @model dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getProbability();

	/**
	 * Sets the value of the '{@link NEsysml.EM.TransitionBranch#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(double value);

	/**
	 * Returns the value of the '<em><b>Is Others</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Others</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Others</em>' attribute.
	 * @see #setIsOthers(boolean)
	 * @see NEsysml.EM.EMPackage#getTransitionBranch_IsOthers()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isOthers();

	/**
	 * Sets the value of the '{@link NEsysml.EM.TransitionBranch#isOthers <em>Is Others</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Others</em>' attribute.
	 * @see #isOthers()
	 * @generated
	 */
	void setIsOthers(boolean value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ErrorBehaviorState)
	 * @see NEsysml.EM.EMPackage#getTransitionBranch_Target()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ErrorBehaviorState getTarget();

	/**
	 * Sets the value of the '{@link NEsysml.EM.TransitionBranch#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ErrorBehaviorState value);

} // TransitionBranch
