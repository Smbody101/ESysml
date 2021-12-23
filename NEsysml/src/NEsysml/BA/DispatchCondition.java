/**
 */
package NEsysml.BA;

import NEsysml.Aadl.EventPort;
import NEsysml.Aadl.SubprogramAccess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Trigger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dispatch Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.BA.DispatchCondition#getBase_Trigger <em>Base Trigger</em>}</li>
 *   <li>{@link NEsysml.BA.DispatchCondition#isTimeout <em>Is Timeout</em>}</li>
 *   <li>{@link NEsysml.BA.DispatchCondition#getDispatchPort <em>Dispatch Port</em>}</li>
 *   <li>{@link NEsysml.BA.DispatchCondition#getDispatchSubprogramAccess <em>Dispatch Subprogram Access</em>}</li>
 * </ul>
 *
 * @see NEsysml.BA.BAPackage#getDispatchCondition()
 * @model
 * @generated
 */
public interface DispatchCondition extends TransitionCondition {
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
	 * @see NEsysml.BA.BAPackage#getDispatchCondition_Base_Trigger()
	 * @model ordered="false"
	 * @generated
	 */
	Trigger getBase_Trigger();

	/**
	 * Sets the value of the '{@link NEsysml.BA.DispatchCondition#getBase_Trigger <em>Base Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Trigger</em>' reference.
	 * @see #getBase_Trigger()
	 * @generated
	 */
	void setBase_Trigger(Trigger value);

	/**
	 * Returns the value of the '<em><b>Is Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Timeout</em>' attribute.
	 * @see #setIsTimeout(boolean)
	 * @see NEsysml.BA.BAPackage#getDispatchCondition_IsTimeout()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	boolean isTimeout();

	/**
	 * Sets the value of the '{@link NEsysml.BA.DispatchCondition#isTimeout <em>Is Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Timeout</em>' attribute.
	 * @see #isTimeout()
	 * @generated
	 */
	void setIsTimeout(boolean value);

	/**
	 * Returns the value of the '<em><b>Dispatch Port</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.Aadl.EventPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dispatch Port</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dispatch Port</em>' reference list.
	 * @see NEsysml.BA.BAPackage#getDispatchCondition_DispatchPort()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<EventPort> getDispatchPort();

	/**
	 * Returns the value of the '<em><b>Dispatch Subprogram Access</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.Aadl.SubprogramAccess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dispatch Subprogram Access</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dispatch Subprogram Access</em>' reference list.
	 * @see NEsysml.BA.BAPackage#getDispatchCondition_DispatchSubprogramAccess()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<SubprogramAccess> getDispatchSubprogramAccess();

} // DispatchCondition
