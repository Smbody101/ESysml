/**
 */
package NEsysml.Aadl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Connection Containing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.ParameterConnectionContaining#getOwnedParameterConnection <em>Owned Parameter Connection</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getParameterConnectionContaining()
 * @model abstract="true"
 * @generated
 */
public interface ParameterConnectionContaining extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Parameter Connection</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.Aadl.ParameterConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parameter Connection</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameter Connection</em>' reference list.
	 * @see NEsysml.Aadl.AadlPackage#getParameterConnectionContaining_OwnedParameterConnection()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ParameterConnection> getOwnedParameterConnection();

} // ParameterConnectionContaining
