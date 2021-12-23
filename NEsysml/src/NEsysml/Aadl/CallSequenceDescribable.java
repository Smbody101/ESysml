/**
 */
package NEsysml.Aadl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Sequence Describable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.CallSequenceDescribable#getOwnedCallSequence <em>Owned Call Sequence</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getCallSequenceDescribable()
 * @model
 * @generated
 */
public interface CallSequenceDescribable extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Call Sequence</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.Aadl.CallSequence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Call Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Call Sequence</em>' reference list.
	 * @see NEsysml.Aadl.AadlPackage#getCallSequenceDescribable_OwnedCallSequence()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<CallSequence> getOwnedCallSequence();

} // CallSequenceDescribable
