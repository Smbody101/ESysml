/**
 */
package NEsysml.EM;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Activity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Behavior Transition Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.ErrorBehaviorTransitionCondition#getBase_Activity <em>Base Activity</em>}</li>
 *   <li>{@link NEsysml.EM.ErrorBehaviorTransitionCondition#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see NEsysml.EM.EMPackage#getErrorBehaviorTransitionCondition()
 * @model
 * @generated
 */
public interface ErrorBehaviorTransitionCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Activity</em>' reference.
	 * @see #setBase_Activity(Activity)
	 * @see NEsysml.EM.EMPackage#getErrorBehaviorTransitionCondition_Base_Activity()
	 * @model ordered="false"
	 * @generated
	 */
	Activity getBase_Activity();

	/**
	 * Sets the value of the '{@link NEsysml.EM.ErrorBehaviorTransitionCondition#getBase_Activity <em>Base Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Activity</em>' reference.
	 * @see #getBase_Activity()
	 * @generated
	 */
	void setBase_Activity(Activity value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference.
	 * @see #setExpression(ErrorBehaviorTransitionExpression)
	 * @see NEsysml.EM.EMPackage#getErrorBehaviorTransitionCondition_Expression()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ErrorBehaviorTransitionExpression getExpression();

	/**
	 * Sets the value of the '{@link NEsysml.EM.ErrorBehaviorTransitionCondition#getExpression <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(ErrorBehaviorTransitionExpression value);

} // ErrorBehaviorTransitionCondition
