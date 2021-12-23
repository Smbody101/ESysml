/**
 */
package NEsysml.Aadl;

import org.eclipse.uml2.uml.Connector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.PortConnection#getBase_Connector <em>Base Connector</em>}</li>
 *   <li>{@link NEsysml.Aadl.PortConnection#getIn <em>In</em>}</li>
 *   <li>{@link NEsysml.Aadl.PortConnection#getOut <em>Out</em>}</li>
 *   <li>{@link NEsysml.Aadl.PortConnection#getInContext <em>In Context</em>}</li>
 *   <li>{@link NEsysml.Aadl.PortConnection#getOutContext <em>Out Context</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getPortConnection()
 * @model
 * @generated
 */
public interface PortConnection extends Connection {
	/**
	 * Returns the value of the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Connector</em>' reference.
	 * @see #setBase_Connector(Connector)
	 * @see NEsysml.Aadl.AadlPackage#getPortConnection_Base_Connector()
	 * @model ordered="false"
	 * @generated
	 */
	Connector getBase_Connector();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.PortConnection#getBase_Connector <em>Base Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Connector</em>' reference.
	 * @see #getBase_Connector()
	 * @generated
	 */
	void setBase_Connector(Connector value);

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference.
	 * @see #setIn(Port)
	 * @see NEsysml.Aadl.AadlPackage#getPortConnection_In()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Port getIn();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.PortConnection#getIn <em>In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' reference.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(Port value);

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference.
	 * @see #setOut(Port)
	 * @see NEsysml.Aadl.AadlPackage#getPortConnection_Out()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Port getOut();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.PortConnection#getOut <em>Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out</em>' reference.
	 * @see #getOut()
	 * @generated
	 */
	void setOut(Port value);

	/**
	 * Returns the value of the '<em><b>In Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Context</em>' reference.
	 * @see #setInContext(PortAndAccessConectionContext)
	 * @see NEsysml.Aadl.AadlPackage#getPortConnection_InContext()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	PortAndAccessConectionContext getInContext();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.PortConnection#getInContext <em>In Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Context</em>' reference.
	 * @see #getInContext()
	 * @generated
	 */
	void setInContext(PortAndAccessConectionContext value);

	/**
	 * Returns the value of the '<em><b>Out Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Context</em>' reference.
	 * @see #setOutContext(PortAndAccessConectionContext)
	 * @see NEsysml.Aadl.AadlPackage#getPortConnection_OutContext()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	PortAndAccessConectionContext getOutContext();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.PortConnection#getOutContext <em>Out Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Context</em>' reference.
	 * @see #getOutContext()
	 * @generated
	 */
	void setOutContext(PortAndAccessConectionContext value);

} // PortConnection
