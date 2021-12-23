/**
 */
package NEsysml.Aadl;

import org.eclipse.uml2.uml.CallBehaviorAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subprogram Instance Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.SubprogramInstanceCall#getBase_CallBehaviorAction <em>Base Call Behavior Action</em>}</li>
 *   <li>{@link NEsysml.Aadl.SubprogramInstanceCall#getSubprogramInstance <em>Subprogram Instance</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getSubprogramInstanceCall()
 * @model
 * @generated
 */
public interface SubprogramInstanceCall extends SubprogramCall {
	/**
	 * Returns the value of the '<em><b>Base Call Behavior Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Call Behavior Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Call Behavior Action</em>' reference.
	 * @see #setBase_CallBehaviorAction(CallBehaviorAction)
	 * @see NEsysml.Aadl.AadlPackage#getSubprogramInstanceCall_Base_CallBehaviorAction()
	 * @model ordered="false"
	 * @generated
	 */
	CallBehaviorAction getBase_CallBehaviorAction();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.SubprogramInstanceCall#getBase_CallBehaviorAction <em>Base Call Behavior Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Call Behavior Action</em>' reference.
	 * @see #getBase_CallBehaviorAction()
	 * @generated
	 */
	void setBase_CallBehaviorAction(CallBehaviorAction value);

	/**
	 * Returns the value of the '<em><b>Subprogram Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subprogram Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subprogram Instance</em>' reference.
	 * @see #setSubprogramInstance(SubprogramInstance)
	 * @see NEsysml.Aadl.AadlPackage#getSubprogramInstanceCall_SubprogramInstance()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SubprogramInstance getSubprogramInstance();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.SubprogramInstanceCall#getSubprogramInstance <em>Subprogram Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subprogram Instance</em>' reference.
	 * @see #getSubprogramInstance()
	 * @generated
	 */
	void setSubprogramInstance(SubprogramInstance value);

} // SubprogramInstanceCall
