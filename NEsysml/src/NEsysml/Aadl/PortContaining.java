/**
 */
package NEsysml.Aadl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Containing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.PortContaining#getOwnedport <em>Ownedport</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getPortContaining()
 * @model abstract="true"
 * @generated
 */
public interface PortContaining extends EObject {
	/**
	 * Returns the value of the '<em><b>Ownedport</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.Aadl.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ownedport</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ownedport</em>' reference list.
	 * @see NEsysml.Aadl.AadlPackage#getPortContaining_Ownedport()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Port> getOwnedport();

} // PortContaining
