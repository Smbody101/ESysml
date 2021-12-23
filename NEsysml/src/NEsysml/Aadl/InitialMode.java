/**
 */
package NEsysml.Aadl;

import org.eclipse.uml2.uml.Pseudostate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initial Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.InitialMode#getBase_Pseudostate <em>Base Pseudostate</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getInitialMode()
 * @model
 * @generated
 */
public interface InitialMode extends Mode {
	/**
	 * Returns the value of the '<em><b>Base Pseudostate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Pseudostate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Pseudostate</em>' reference.
	 * @see #setBase_Pseudostate(Pseudostate)
	 * @see NEsysml.Aadl.AadlPackage#getInitialMode_Base_Pseudostate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Pseudostate getBase_Pseudostate();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.InitialMode#getBase_Pseudostate <em>Base Pseudostate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Pseudostate</em>' reference.
	 * @see #getBase_Pseudostate()
	 * @generated
	 */
	void setBase_Pseudostate(Pseudostate value);

} // InitialMode
