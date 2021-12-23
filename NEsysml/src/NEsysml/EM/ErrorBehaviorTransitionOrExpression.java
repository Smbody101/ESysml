/**
 */
package NEsysml.EM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.AcceptEventAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Behavior Transition Or Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.ErrorBehaviorTransitionOrExpression#getBase_AcceptEventAction <em>Base Accept Event Action</em>}</li>
 *   <li>{@link NEsysml.EM.ErrorBehaviorTransitionOrExpression#getOprands <em>Oprands</em>}</li>
 * </ul>
 *
 * @see NEsysml.EM.EMPackage#getErrorBehaviorTransitionOrExpression()
 * @model
 * @generated
 */
public interface ErrorBehaviorTransitionOrExpression extends ErrorBehaviorTransitionExpression {
	/**
	 * Returns the value of the '<em><b>Base Accept Event Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Accept Event Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Accept Event Action</em>' reference.
	 * @see #setBase_AcceptEventAction(AcceptEventAction)
	 * @see NEsysml.EM.EMPackage#getErrorBehaviorTransitionOrExpression_Base_AcceptEventAction()
	 * @model ordered="false"
	 * @generated
	 */
	AcceptEventAction getBase_AcceptEventAction();

	/**
	 * Sets the value of the '{@link NEsysml.EM.ErrorBehaviorTransitionOrExpression#getBase_AcceptEventAction <em>Base Accept Event Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Accept Event Action</em>' reference.
	 * @see #getBase_AcceptEventAction()
	 * @generated
	 */
	void setBase_AcceptEventAction(AcceptEventAction value);

	/**
	 * Returns the value of the '<em><b>Oprands</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.EM.ErrorTransitionTrigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oprands</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oprands</em>' reference list.
	 * @see NEsysml.EM.EMPackage#getErrorBehaviorTransitionOrExpression_Oprands()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ErrorTransitionTrigger> getOprands();

} // ErrorBehaviorTransitionOrExpression
