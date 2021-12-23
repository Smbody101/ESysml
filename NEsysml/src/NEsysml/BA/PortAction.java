/**
 */
package NEsysml.BA;

import NEsysml.Aadl.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.BA.PortAction#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see NEsysml.BA.BAPackage#getPortAction()
 * @model abstract="true"
 * @generated
 */
public interface PortAction extends BehaviorAction {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(Port)
	 * @see NEsysml.BA.BAPackage#getPortAction_Port()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Port getPort();

	/**
	 * Sets the value of the '{@link NEsysml.BA.PortAction#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Port value);

} // PortAction
