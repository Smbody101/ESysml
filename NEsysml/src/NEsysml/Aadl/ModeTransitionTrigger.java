/**
 */
package NEsysml.Aadl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Trigger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode Transition Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.ModeTransitionTrigger#getBase_Trigger <em>Base Trigger</em>}</li>
 *   <li>{@link NEsysml.Aadl.ModeTransitionTrigger#getPort <em>Port</em>}</li>
 *   <li>{@link NEsysml.Aadl.ModeTransitionTrigger#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getModeTransitionTrigger()
 * @model
 * @generated
 */
public interface ModeTransitionTrigger extends EObject {
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
	 * @see NEsysml.Aadl.AadlPackage#getModeTransitionTrigger_Base_Trigger()
	 * @model ordered="false"
	 * @generated
	 */
	Trigger getBase_Trigger();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.ModeTransitionTrigger#getBase_Trigger <em>Base Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Trigger</em>' reference.
	 * @see #getBase_Trigger()
	 * @generated
	 */
	void setBase_Trigger(Trigger value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(EventPort)
	 * @see NEsysml.Aadl.AadlPackage#getModeTransitionTrigger_Port()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EventPort getPort();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.ModeTransitionTrigger#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(EventPort value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(ModeTransitionTriggerContext)
	 * @see NEsysml.Aadl.AadlPackage#getModeTransitionTrigger_Context()
	 * @model ordered="false"
	 * @generated
	 */
	ModeTransitionTriggerContext getContext();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.ModeTransitionTrigger#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(ModeTransitionTriggerContext value);

} // ModeTransitionTrigger
