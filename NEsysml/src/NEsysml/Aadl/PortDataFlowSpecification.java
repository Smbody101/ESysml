/**
 */
package NEsysml.Aadl;

import org.eclipse.uml2.uml.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Data Flow Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.PortDataFlowSpecification#getEventGate <em>Event Gate</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getPortDataFlowSpecification()
 * @model
 * @generated
 */
public interface PortDataFlowSpecification extends DataFlowSpecification {
	/**
	 * Returns the value of the '<em><b>Event Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Gate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Gate</em>' reference.
	 * @see #setEventGate(Interface)
	 * @see NEsysml.Aadl.AadlPackage#getPortDataFlowSpecification_EventGate()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Interface getEventGate();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.PortDataFlowSpecification#getEventGate <em>Event Gate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Gate</em>' reference.
	 * @see #getEventGate()
	 * @generated
	 */
	void setEventGate(Interface value);

} // PortDataFlowSpecification
