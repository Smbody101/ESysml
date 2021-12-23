/**
 */
package NEsysml.Aadl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.ComponentImplementation#getType <em>Type</em>}</li>
 *   <li>{@link NEsysml.Aadl.ComponentImplementation#getExtended <em>Extended</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getComponentImplementation()
 * @model abstract="true"
 * @generated
 */
public interface ComponentImplementation extends ComponentClassifier {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ComponentType)
	 * @see NEsysml.Aadl.AadlPackage#getComponentImplementation_Type()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ComponentType getType();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.ComponentImplementation#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ComponentType value);

	/**
	 * Returns the value of the '<em><b>Extended</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended</em>' reference.
	 * @see #setExtended(ComponentImplementation)
	 * @see NEsysml.Aadl.AadlPackage#getComponentImplementation_Extended()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ComponentImplementation getExtended();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.ComponentImplementation#getExtended <em>Extended</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended</em>' reference.
	 * @see #getExtended()
	 * @generated
	 */
	void setExtended(ComponentImplementation value);

} // ComponentImplementation
