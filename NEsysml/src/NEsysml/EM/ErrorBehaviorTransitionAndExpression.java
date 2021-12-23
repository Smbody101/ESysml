/**
 */
package NEsysml.EM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.JoinNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Behavior Transition And Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.ErrorBehaviorTransitionAndExpression#getBase_JoinNode <em>Base Join Node</em>}</li>
 *   <li>{@link NEsysml.EM.ErrorBehaviorTransitionAndExpression#getOwnedExpression <em>Owned Expression</em>}</li>
 * </ul>
 *
 * @see NEsysml.EM.EMPackage#getErrorBehaviorTransitionAndExpression()
 * @model
 * @generated
 */
public interface ErrorBehaviorTransitionAndExpression extends ErrorBehaviorTransitionExpression {
	/**
	 * Returns the value of the '<em><b>Base Join Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Join Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Join Node</em>' reference.
	 * @see #setBase_JoinNode(JoinNode)
	 * @see NEsysml.EM.EMPackage#getErrorBehaviorTransitionAndExpression_Base_JoinNode()
	 * @model ordered="false"
	 * @generated
	 */
	JoinNode getBase_JoinNode();

	/**
	 * Sets the value of the '{@link NEsysml.EM.ErrorBehaviorTransitionAndExpression#getBase_JoinNode <em>Base Join Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Join Node</em>' reference.
	 * @see #getBase_JoinNode()
	 * @generated
	 */
	void setBase_JoinNode(JoinNode value);

	/**
	 * Returns the value of the '<em><b>Owned Expression</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.EM.ErrorBehaviorTransitionExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Expression</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Expression</em>' reference list.
	 * @see NEsysml.EM.EMPackage#getErrorBehaviorTransitionAndExpression_OwnedExpression()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ErrorBehaviorTransitionExpression> getOwnedExpression();

} // ErrorBehaviorTransitionAndExpression
