/**
 */
package NEsysml.Aadl;

import org.eclipse.papyrus.sysml14.blocks.BindingConnector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Access Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.DataAccessConnection#getRequire <em>Require</em>}</li>
 *   <li>{@link NEsysml.Aadl.DataAccessConnection#getProvide <em>Provide</em>}</li>
 *   <li>{@link NEsysml.Aadl.DataAccessConnection#getInContext <em>In Context</em>}</li>
 *   <li>{@link NEsysml.Aadl.DataAccessConnection#getOutContext <em>Out Context</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getDataAccessConnection()
 * @model
 * @generated
 */
public interface DataAccessConnection extends BindingConnector, Connection {
	/**
	 * Returns the value of the '<em><b>Require</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require</em>' reference.
	 * @see #setRequire(DataAccessConnectionEnd)
	 * @see NEsysml.Aadl.AadlPackage#getDataAccessConnection_Require()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	DataAccessConnectionEnd getRequire();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.DataAccessConnection#getRequire <em>Require</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require</em>' reference.
	 * @see #getRequire()
	 * @generated
	 */
	void setRequire(DataAccessConnectionEnd value);

	/**
	 * Returns the value of the '<em><b>Provide</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provide</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provide</em>' reference.
	 * @see #setProvide(DataAccessConnectionEnd)
	 * @see NEsysml.Aadl.AadlPackage#getDataAccessConnection_Provide()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	DataAccessConnectionEnd getProvide();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.DataAccessConnection#getProvide <em>Provide</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provide</em>' reference.
	 * @see #getProvide()
	 * @generated
	 */
	void setProvide(DataAccessConnectionEnd value);

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
	 * @see NEsysml.Aadl.AadlPackage#getDataAccessConnection_InContext()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	PortAndAccessConectionContext getInContext();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.DataAccessConnection#getInContext <em>In Context</em>}' reference.
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
	 * @see NEsysml.Aadl.AadlPackage#getDataAccessConnection_OutContext()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	PortAndAccessConectionContext getOutContext();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.DataAccessConnection#getOutContext <em>Out Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Context</em>' reference.
	 * @see #getOutContext()
	 * @generated
	 */
	void setOutContext(PortAndAccessConectionContext value);

} // DataAccessConnection
