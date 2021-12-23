/**
 */
package NEsysml.Aadl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subprogram Access Containing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.SubprogramAccessContaining#getOwnedSubprogramAccess <em>Owned Subprogram Access</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getSubprogramAccessContaining()
 * @model abstract="true"
 * @generated
 */
public interface SubprogramAccessContaining extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Subprogram Access</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.Aadl.SubprogramAccess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Subprogram Access</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Subprogram Access</em>' reference list.
	 * @see NEsysml.Aadl.AadlPackage#getSubprogramAccessContaining_OwnedSubprogramAccess()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<SubprogramAccess> getOwnedSubprogramAccess();

} // SubprogramAccessContaining
