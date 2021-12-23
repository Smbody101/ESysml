/**
 */
package NEsysml.EM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.ErrorTypedElement#getOwnedErrorType <em>Owned Error Type</em>}</li>
 * </ul>
 *
 * @see NEsysml.EM.EMPackage#getErrorTypedElement()
 * @model abstract="true"
 * @generated
 */
public interface ErrorTypedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Error Type</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.EM.ErrorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Error Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Error Type</em>' reference list.
	 * @see NEsysml.EM.EMPackage#getErrorTypedElement_OwnedErrorType()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ErrorType> getOwnedErrorType();

} // ErrorTypedElement
