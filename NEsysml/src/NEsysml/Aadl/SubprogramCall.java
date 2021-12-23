/**
 */
package NEsysml.Aadl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subprogram Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.SubprogramCall#getLast <em>Last</em>}</li>
 *   <li>{@link NEsysml.Aadl.SubprogramCall#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getSubprogramCall()
 * @model abstract="true"
 * @generated
 */
public interface SubprogramCall extends ParameterConnectionContext {
	/**
	 * Returns the value of the '<em><b>Last</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link NEsysml.Aadl.SubprogramCall#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last</em>' reference.
	 * @see #setLast(SubprogramCall)
	 * @see NEsysml.Aadl.AadlPackage#getSubprogramCall_Last()
	 * @see NEsysml.Aadl.SubprogramCall#getNext
	 * @model opposite="next" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	SubprogramCall getLast();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.SubprogramCall#getLast <em>Last</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last</em>' reference.
	 * @see #getLast()
	 * @generated
	 */
	void setLast(SubprogramCall value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link NEsysml.Aadl.SubprogramCall#getLast <em>Last</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(SubprogramCall)
	 * @see NEsysml.Aadl.AadlPackage#getSubprogramCall_Next()
	 * @see NEsysml.Aadl.SubprogramCall#getLast
	 * @model opposite="last" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	SubprogramCall getNext();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.SubprogramCall#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(SubprogramCall value);

} // SubprogramCall
