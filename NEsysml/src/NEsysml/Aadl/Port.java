/**
 */
package NEsysml.Aadl;

import org.eclipse.papyrus.sysml14.portsandflows.FlowDirection;
import org.eclipse.papyrus.sysml14.portsandflows.ProxyPort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.Port#getSpecification <em>Specification</em>}</li>
 *   <li>{@link NEsysml.Aadl.Port#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getPort()
 * @model abstract="true"
 * @generated
 */
public interface Port extends ProxyPort, Feature {
	/**
	 * Returns the value of the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' reference.
	 * @see #setSpecification(PortDataFlowSpecification)
	 * @see NEsysml.Aadl.AadlPackage#getPort_Specification()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	PortDataFlowSpecification getSpecification();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.Port#getSpecification <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(PortDataFlowSpecification value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.sysml14.portsandflows.FlowDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.papyrus.sysml14.portsandflows.FlowDirection
	 * @see #setDirection(FlowDirection)
	 * @see NEsysml.Aadl.AadlPackage#getPort_Direction()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	FlowDirection getDirection();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.Port#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.papyrus.sysml14.portsandflows.FlowDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(FlowDirection value);

} // Port
