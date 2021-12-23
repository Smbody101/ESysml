/**
 */
package NEsysml.Aadl;

import org.eclipse.uml2.uml.CallOperationAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subprogram Interface Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.SubprogramInterfaceCall#getBase_CallOperationAction <em>Base Call Operation Action</em>}</li>
 *   <li>{@link NEsysml.Aadl.SubprogramInterfaceCall#getSubprogramInterface <em>Subprogram Interface</em>}</li>
 *   <li>{@link NEsysml.Aadl.SubprogramInterfaceCall#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getSubprogramInterfaceCall()
 * @model
 * @generated
 */
public interface SubprogramInterfaceCall extends SubprogramCall {
	/**
	 * Returns the value of the '<em><b>Base Call Operation Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Call Operation Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Call Operation Action</em>' reference.
	 * @see #setBase_CallOperationAction(CallOperationAction)
	 * @see NEsysml.Aadl.AadlPackage#getSubprogramInterfaceCall_Base_CallOperationAction()
	 * @model ordered="false"
	 * @generated
	 */
	CallOperationAction getBase_CallOperationAction();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.SubprogramInterfaceCall#getBase_CallOperationAction <em>Base Call Operation Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Call Operation Action</em>' reference.
	 * @see #getBase_CallOperationAction()
	 * @generated
	 */
	void setBase_CallOperationAction(CallOperationAction value);

	/**
	 * Returns the value of the '<em><b>Subprogram Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subprogram Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subprogram Interface</em>' reference.
	 * @see #setSubprogramInterface(SubprogramInterface)
	 * @see NEsysml.Aadl.AadlPackage#getSubprogramInterfaceCall_SubprogramInterface()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SubprogramInterface getSubprogramInterface();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.SubprogramInterfaceCall#getSubprogramInterface <em>Subprogram Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subprogram Interface</em>' reference.
	 * @see #getSubprogramInterface()
	 * @generated
	 */
	void setSubprogramInterface(SubprogramInterface value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(SubprogramCallContext)
	 * @see NEsysml.Aadl.AadlPackage#getSubprogramInterfaceCall_Context()
	 * @model ordered="false"
	 * @generated
	 */
	SubprogramCallContext getContext();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.SubprogramInterfaceCall#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(SubprogramCallContext value);

} // SubprogramInterfaceCall
