/**
 */
package NEsysml.EM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Propagation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.ErrorPropagation#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see NEsysml.EM.EMPackage#getErrorPropagation()
 * @model
 * @generated
 */
public interface ErrorPropagation extends ErrorBehaviorTransition {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ErrorPropagationPoint)
	 * @see NEsysml.EM.EMPackage#getErrorPropagation_Target()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ErrorPropagationPoint getTarget();

	/**
	 * Sets the value of the '{@link NEsysml.EM.ErrorPropagation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ErrorPropagationPoint value);

} // ErrorPropagation
