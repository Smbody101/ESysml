/**
 */
package NEsysml.Aadl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode Available</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.ModeAvailable#getOwnedMode <em>Owned Mode</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getModeAvailable()
 * @model abstract="true"
 * @generated
 */
public interface ModeAvailable extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Mode</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Mode</em>' reference.
	 * @see #setOwnedMode(ModeStateMachine)
	 * @see NEsysml.Aadl.AadlPackage#getModeAvailable_OwnedMode()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ModeStateMachine getOwnedMode();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.ModeAvailable#getOwnedMode <em>Owned Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Mode</em>' reference.
	 * @see #getOwnedMode()
	 * @generated
	 */
	void setOwnedMode(ModeStateMachine value);

} // ModeAvailable
