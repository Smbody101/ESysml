/**
 */
package NEsysml.EM;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.ChangeEvent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Behavior Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.ErrorBehaviorEvent#getBase_ChangeEvent <em>Base Change Event</em>}</li>
 * </ul>
 *
 * @see NEsysml.EM.EMPackage#getErrorBehaviorEvent()
 * @model abstract="true"
 * @generated
 */
public interface ErrorBehaviorEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Change Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Change Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Change Event</em>' reference.
	 * @see #setBase_ChangeEvent(ChangeEvent)
	 * @see NEsysml.EM.EMPackage#getErrorBehaviorEvent_Base_ChangeEvent()
	 * @model ordered="false"
	 * @generated
	 */
	ChangeEvent getBase_ChangeEvent();

	/**
	 * Sets the value of the '{@link NEsysml.EM.ErrorBehaviorEvent#getBase_ChangeEvent <em>Base Change Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Change Event</em>' reference.
	 * @see #getBase_ChangeEvent()
	 * @generated
	 */
	void setBase_ChangeEvent(ChangeEvent value);

} // ErrorBehaviorEvent
