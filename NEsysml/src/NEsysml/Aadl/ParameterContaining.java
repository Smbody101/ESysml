/**
 */
package NEsysml.Aadl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Containing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.ParameterContaining#getOwnedParameter <em>Owned Parameter</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getParameterContaining()
 * @model abstract="true"
 * @generated
 */
public interface ParameterContaining extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Parameter</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.Aadl.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parameter</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameter</em>' reference list.
	 * @see NEsysml.Aadl.AadlPackage#getParameterContaining_OwnedParameter()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Parameter> getOwnedParameter();

} // ParameterContaining
