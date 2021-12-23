/**
 */
package NEsysml.EM;

import org.eclipse.uml2.uml.Trigger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Transition Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.ErrorTransitionTrigger#getBase_Trigger <em>Base Trigger</em>}</li>
 * </ul>
 *
 * @see NEsysml.EM.EMPackage#getErrorTransitionTrigger()
 * @model abstract="true"
 * @generated
 */
public interface ErrorTransitionTrigger extends ErrorTypedElement {
	/**
	 * Returns the value of the '<em><b>Base Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Trigger</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Trigger</em>' reference.
	 * @see #setBase_Trigger(Trigger)
	 * @see NEsysml.EM.EMPackage#getErrorTransitionTrigger_Base_Trigger()
	 * @model ordered="false"
	 * @generated
	 */
	Trigger getBase_Trigger();

	/**
	 * Sets the value of the '{@link NEsysml.EM.ErrorTransitionTrigger#getBase_Trigger <em>Base Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Trigger</em>' reference.
	 * @see #getBase_Trigger()
	 * @generated
	 */
	void setBase_Trigger(Trigger value);

} // ErrorTransitionTrigger
