/**
 */
package NEsysml.Aadl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.DataSubcomponent#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getDataSubcomponent()
 * @model
 * @generated
 */
public interface DataSubcomponent extends SubcomponentClassifier, DataAccessConnectionEnd {
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
	 * @see NEsysml.Aadl.AadlPackage#getDataSubcomponent_Type()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	DataClassifier getType();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.DataSubcomponent#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataClassifier value);

} // DataSubcomponent
