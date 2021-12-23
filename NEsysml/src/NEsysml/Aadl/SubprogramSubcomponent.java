/**
 */
package NEsysml.Aadl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subprogram Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.SubprogramSubcomponent#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getSubprogramSubcomponent()
 * @model
 * @generated
 */
public interface SubprogramSubcomponent extends SubcomponentClassifier, SubprogramInstance {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(SubprogramClassifier)
	 * @see NEsysml.Aadl.AadlPackage#getSubprogramSubcomponent_Type()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	SubprogramClassifier getType();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.SubprogramSubcomponent#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(SubprogramClassifier value);

} // SubprogramSubcomponent
