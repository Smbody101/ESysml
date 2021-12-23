/**
 */
package NEsysml.Aadl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Activity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.CallSequence#getBase_Activity <em>Base Activity</em>}</li>
 *   <li>{@link NEsysml.Aadl.CallSequence#getOwnedSubprogramCall <em>Owned Subprogram Call</em>}</li>
 *   <li>{@link NEsysml.Aadl.CallSequence#getFirst <em>First</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getCallSequence()
 * @model
 * @generated
 */
public interface CallSequence extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Activity</em>' reference.
	 * @see #setBase_Activity(Activity)
	 * @see NEsysml.Aadl.AadlPackage#getCallSequence_Base_Activity()
	 * @model ordered="false"
	 * @generated
	 */
	Activity getBase_Activity();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.CallSequence#getBase_Activity <em>Base Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Activity</em>' reference.
	 * @see #getBase_Activity()
	 * @generated
	 */
	void setBase_Activity(Activity value);

	/**
	 * Returns the value of the '<em><b>Owned Subprogram Call</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.Aadl.SubprogramCall}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Subprogram Call</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Subprogram Call</em>' reference list.
	 * @see NEsysml.Aadl.AadlPackage#getCallSequence_OwnedSubprogramCall()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<SubprogramCall> getOwnedSubprogramCall();

	/**
	 * Returns the value of the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' reference.
	 * @see #setFirst(SubprogramCall)
	 * @see NEsysml.Aadl.AadlPackage#getCallSequence_First()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	SubprogramCall getFirst();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.CallSequence#getFirst <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(SubprogramCall value);

} // CallSequence
