/**
 */
package NEsysml.Aadl;

import org.eclipse.uml2.uml.ObjectFlow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.ParameterConnection#getBase_ObjectFlow <em>Base Object Flow</em>}</li>
 *   <li>{@link NEsysml.Aadl.ParameterConnection#getIn <em>In</em>}</li>
 *   <li>{@link NEsysml.Aadl.ParameterConnection#getOut <em>Out</em>}</li>
 *   <li>{@link NEsysml.Aadl.ParameterConnection#getInContext <em>In Context</em>}</li>
 *   <li>{@link NEsysml.Aadl.ParameterConnection#getOutContext <em>Out Context</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getParameterConnection()
 * @model
 * @generated
 */
public interface ParameterConnection extends Connection {
	/**
	 * Returns the value of the '<em><b>Base Object Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Object Flow</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Object Flow</em>' reference.
	 * @see #setBase_ObjectFlow(ObjectFlow)
	 * @see NEsysml.Aadl.AadlPackage#getParameterConnection_Base_ObjectFlow()
	 * @model ordered="false"
	 * @generated
	 */
	ObjectFlow getBase_ObjectFlow();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.ParameterConnection#getBase_ObjectFlow <em>Base Object Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Object Flow</em>' reference.
	 * @see #getBase_ObjectFlow()
	 * @generated
	 */
	void setBase_ObjectFlow(ObjectFlow value);

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference.
	 * @see #setIn(ParameterConnectionEnd)
	 * @see NEsysml.Aadl.AadlPackage#getParameterConnection_In()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ParameterConnectionEnd getIn();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.ParameterConnection#getIn <em>In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' reference.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(ParameterConnectionEnd value);

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference.
	 * @see #setOut(ParameterConnectionEnd)
	 * @see NEsysml.Aadl.AadlPackage#getParameterConnection_Out()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ParameterConnectionEnd getOut();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.ParameterConnection#getOut <em>Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out</em>' reference.
	 * @see #getOut()
	 * @generated
	 */
	void setOut(ParameterConnectionEnd value);

	/**
	 * Returns the value of the '<em><b>In Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Context</em>' reference.
	 * @see #setInContext(ParameterConnectionContext)
	 * @see NEsysml.Aadl.AadlPackage#getParameterConnection_InContext()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ParameterConnectionContext getInContext();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.ParameterConnection#getInContext <em>In Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Context</em>' reference.
	 * @see #getInContext()
	 * @generated
	 */
	void setInContext(ParameterConnectionContext value);

	/**
	 * Returns the value of the '<em><b>Out Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Context</em>' reference.
	 * @see #setOutContext(ParameterConnectionContext)
	 * @see NEsysml.Aadl.AadlPackage#getParameterConnection_OutContext()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ParameterConnectionContext getOutContext();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.ParameterConnection#getOutContext <em>Out Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Context</em>' reference.
	 * @see #getOutContext()
	 * @generated
	 */
	void setOutContext(ParameterConnectionContext value);

} // ParameterConnection
