/**
 */
package NEsysml.Aadl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subprogram Containing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.SubprogramContaining#getOwnedSubprogramSubcomponent <em>Owned Subprogram Subcomponent</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getSubprogramContaining()
 * @model abstract="true"
 * @generated
 */
public interface SubprogramContaining extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Subprogram Subcomponent</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.Aadl.SubprogramSubcomponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Subprogram Subcomponent</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Subprogram Subcomponent</em>' reference list.
	 * @see NEsysml.Aadl.AadlPackage#getSubprogramContaining_OwnedSubprogramSubcomponent()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<SubprogramSubcomponent> getOwnedSubprogramSubcomponent();

} // SubprogramContaining
