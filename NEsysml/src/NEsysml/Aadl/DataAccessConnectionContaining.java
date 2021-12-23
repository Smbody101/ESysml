/**
 */
package NEsysml.Aadl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Access Connection Containing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.DataAccessConnectionContaining#getOwnedDataAccessConnection <em>Owned Data Access Connection</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getDataAccessConnectionContaining()
 * @model abstract="true"
 * @generated
 */
public interface DataAccessConnectionContaining extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Data Access Connection</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.Aadl.DataAccessConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Data Access Connection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Data Access Connection</em>' reference list.
	 * @see NEsysml.Aadl.AadlPackage#getDataAccessConnectionContaining_OwnedDataAccessConnection()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<DataAccessConnection> getOwnedDataAccessConnection();

} // DataAccessConnectionContaining
