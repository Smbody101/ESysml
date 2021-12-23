/**
 */
package NEsysml.Aadl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Access Containing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.DataAccessContaining#getOwnedDataAccess <em>Owned Data Access</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getDataAccessContaining()
 * @model abstract="true"
 * @generated
 */
public interface DataAccessContaining extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Data Access</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.Aadl.DataAccess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Data Access</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Data Access</em>' reference list.
	 * @see NEsysml.Aadl.AadlPackage#getDataAccessContaining_OwnedDataAccess()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<DataAccess> getOwnedDataAccess();

} // DataAccessContaining
