/**
 */
package NEsysml.EM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Event Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.ErrorEventTrigger#getErrorEvent <em>Error Event</em>}</li>
 * </ul>
 *
 * @see NEsysml.EM.EMPackage#getErrorEventTrigger()
 * @model
 * @generated
 */
public interface ErrorEventTrigger extends ErrorTransitionTrigger {
	/**
	 * Returns the value of the '<em><b>Error Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Event</em>' reference.
	 * @see #setErrorEvent(ErrorEvent)
	 * @see NEsysml.EM.EMPackage#getErrorEventTrigger_ErrorEvent()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ErrorEvent getErrorEvent();

	/**
	 * Sets the value of the '{@link NEsysml.EM.ErrorEventTrigger#getErrorEvent <em>Error Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Event</em>' reference.
	 * @see #getErrorEvent()
	 * @generated
	 */
	void setErrorEvent(ErrorEvent value);

} // ErrorEventTrigger
