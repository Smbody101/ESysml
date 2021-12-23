/**
 */
package NEsysml.Aadl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.ComponentType#getExtended <em>Extended</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getComponentType()
 * @model abstract="true"
 * @generated
 */
public interface ComponentType extends ComponentClassifier {
	/**
	 * Returns the value of the '<em><b>Extended</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended</em>' reference.
	 * @see #setExtended(ComponentType)
	 * @see NEsysml.Aadl.AadlPackage#getComponentType_Extended()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ComponentType getExtended();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.ComponentType#getExtended <em>Extended</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended</em>' reference.
	 * @see #getExtended()
	 * @generated
	 */
	void setExtended(ComponentType value);

} // ComponentType
