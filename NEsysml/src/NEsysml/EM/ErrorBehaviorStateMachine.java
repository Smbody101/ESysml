/**
 */
package NEsysml.EM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Behavior State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.ErrorBehaviorStateMachine#getInPackage <em>In Package</em>}</li>
 * </ul>
 *
 * @see NEsysml.EM.EMPackage#getErrorBehaviorStateMachine()
 * @model
 * @generated
 */
public interface ErrorBehaviorStateMachine extends ErrorBehavior {
	/**
	 * Returns the value of the '<em><b>In Package</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link NEsysml.EM.ErrorModelLibrary#getOwnedBehaviors <em>Owned Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Package</em>' reference.
	 * @see #setInPackage(ErrorModelLibrary)
	 * @see NEsysml.EM.EMPackage#getErrorBehaviorStateMachine_InPackage()
	 * @see NEsysml.EM.ErrorModelLibrary#getOwnedBehaviors
	 * @model opposite="ownedBehaviors" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ErrorModelLibrary getInPackage();

	/**
	 * Sets the value of the '{@link NEsysml.EM.ErrorBehaviorStateMachine#getInPackage <em>In Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Package</em>' reference.
	 * @see #getInPackage()
	 * @generated
	 */
	void setInPackage(ErrorModelLibrary value);

} // ErrorBehaviorStateMachine
