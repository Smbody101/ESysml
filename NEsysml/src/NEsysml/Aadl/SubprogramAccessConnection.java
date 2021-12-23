/**
 */
package NEsysml.Aadl;

import org.eclipse.uml2.uml.Connector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subprogram Access Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.SubprogramAccessConnection#getBase_Connector <em>Base Connector</em>}</li>
 *   <li>{@link NEsysml.Aadl.SubprogramAccessConnection#getRequire <em>Require</em>}</li>
 *   <li>{@link NEsysml.Aadl.SubprogramAccessConnection#getProvide <em>Provide</em>}</li>
 *   <li>{@link NEsysml.Aadl.SubprogramAccessConnection#getInContext <em>In Context</em>}</li>
 *   <li>{@link NEsysml.Aadl.SubprogramAccessConnection#getOutContext <em>Out Context</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getSubprogramAccessConnection()
 * @model
 * @generated
 */
public interface SubprogramAccessConnection extends Connection {
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
	 * @see NEsysml.Aadl.AadlPackage#getSubprogramAccessConnection_Base_Connector()
	 * @model ordered="false"
	 * @generated
	 */
	Connector getBase_Connector();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.SubprogramAccessConnection#getBase_Connector <em>Base Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Connector</em>' reference.
	 * @see #getBase_Connector()
	 * @generated
	 */
	void setBase_Connector(Connector value);

	/**
	 * Returns the value of the '<em><b>Require</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require</em>' reference.
	 * @see #setRequire(SubprogramAccess)
	 * @see NEsysml.Aadl.AadlPackage#getSubprogramAccessConnection_Require()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	SubprogramAccess getRequire();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.SubprogramAccessConnection#getRequire <em>Require</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require</em>' reference.
	 * @see #getRequire()
	 * @generated
	 */
	void setRequire(SubprogramAccess value);

	/**
	 * Returns the value of the '<em><b>Provide</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provide</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provide</em>' reference.
	 * @see #setProvide(SubprogramAccess)
	 * @see NEsysml.Aadl.AadlPackage#getSubprogramAccessConnection_Provide()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	SubprogramAccess getProvide();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.SubprogramAccessConnection#getProvide <em>Provide</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provide</em>' reference.
	 * @see #getProvide()
	 * @generated
	 */
	void setProvide(SubprogramAccess value);

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
	 * @see NEsysml.Aadl.AadlPackage#getSubprogramAccessConnection_InContext()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	PortAndAccessConectionContext getInContext();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.SubprogramAccessConnection#getInContext <em>In Context</em>}' reference.
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
	 * @see NEsysml.Aadl.AadlPackage#getSubprogramAccessConnection_OutContext()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	PortAndAccessConectionContext getOutContext();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.SubprogramAccessConnection#getOutContext <em>Out Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Context</em>' reference.
	 * @see #getOutContext()
	 * @generated
	 */
	void setOutContext(PortAndAccessConectionContext value);

} // SubprogramAccessConnection
