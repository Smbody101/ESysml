/**
 */
package NEsysml.Aadl;

import org.eclipse.papyrus.sysml14.portsandflows.InterfaceBlock;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Flow Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.DataFlowSpecification#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getDataFlowSpecification()
 * @model
 * @generated
 */
public interface DataFlowSpecification extends InterfaceBlock {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DataClassifier)
	 * @see NEsysml.Aadl.AadlPackage#getDataFlowSpecification_Type()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	DataClassifier getType();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.DataFlowSpecification#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataClassifier value);

} // DataFlowSpecification
