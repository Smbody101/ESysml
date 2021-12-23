/**
 */
package NEsysml.Aadl;

import org.eclipse.papyrus.sysml14.portsandflows.FeatureDirection;
import org.eclipse.papyrus.sysml14.portsandflows.ProxyPort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.DataAccess#getSpecification <em>Specification</em>}</li>
 *   <li>{@link NEsysml.Aadl.DataAccess#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getDataAccess()
 * @model
 * @generated
 */
public interface DataAccess extends ProxyPort, DataAccessConnectionEnd, Feature {
	/**
	 * Returns the value of the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' reference.
	 * @see #setSpecification(DataFlowSpecification)
	 * @see NEsysml.Aadl.AadlPackage#getDataAccess_Specification()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	DataFlowSpecification getSpecification();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.DataAccess#getSpecification <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(DataFlowSpecification value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.sysml14.portsandflows.FeatureDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.papyrus.sysml14.portsandflows.FeatureDirection
	 * @see #setDirection(FeatureDirection)
	 * @see NEsysml.Aadl.AadlPackage#getDataAccess_Direction()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	FeatureDirection getDirection();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.DataAccess#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.papyrus.sysml14.portsandflows.FeatureDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(FeatureDirection value);

} // DataAccess
