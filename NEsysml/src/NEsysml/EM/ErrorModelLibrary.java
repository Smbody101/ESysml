/**
 */
package NEsysml.EM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Model Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.ErrorModelLibrary#getOwnedBehaviors <em>Owned Behaviors</em>}</li>
 *   <li>{@link NEsysml.EM.ErrorModelLibrary#getOwnedErrorType <em>Owned Error Type</em>}</li>
 *   <li>{@link NEsysml.EM.ErrorModelLibrary#getImport <em>Import</em>}</li>
 *   <li>{@link NEsysml.EM.ErrorModelLibrary#getBase_Package <em>Base Package</em>}</li>
 * </ul>
 *
 * @see NEsysml.EM.EMPackage#getErrorModelLibrary()
 * @model
 * @generated
 */
public interface ErrorModelLibrary extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Behaviors</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.EM.ErrorBehaviorStateMachine}.
	 * It is bidirectional and its opposite is '{@link NEsysml.EM.ErrorBehaviorStateMachine#getInPackage <em>In Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Behaviors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Behaviors</em>' reference list.
	 * @see NEsysml.EM.EMPackage#getErrorModelLibrary_OwnedBehaviors()
	 * @see NEsysml.EM.ErrorBehaviorStateMachine#getInPackage
	 * @model opposite="inPackage" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ErrorBehaviorStateMachine> getOwnedBehaviors();

	/**
	 * Returns the value of the '<em><b>Owned Error Type</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.EM.ErrorType}.
	 * It is bidirectional and its opposite is '{@link NEsysml.EM.ErrorType#getInLibrary <em>In Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Error Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Error Type</em>' reference list.
	 * @see NEsysml.EM.EMPackage#getErrorModelLibrary_OwnedErrorType()
	 * @see NEsysml.EM.ErrorType#getInLibrary
	 * @model opposite="inLibrary" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ErrorType> getOwnedErrorType();

	/**
	 * Returns the value of the '<em><b>Import</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.EM.ErrorModelLibrary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import</em>' reference list.
	 * @see NEsysml.EM.EMPackage#getErrorModelLibrary_Import()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ErrorModelLibrary> getImport();

	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' reference.
	 * @see #setBase_Package(org.eclipse.uml2.uml.Package)
	 * @see NEsysml.EM.EMPackage#getErrorModelLibrary_Base_Package()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Package getBase_Package();

	/**
	 * Sets the value of the '{@link NEsysml.EM.ErrorModelLibrary#getBase_Package <em>Base Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' reference.
	 * @see #getBase_Package()
	 * @generated
	 */
	void setBase_Package(org.eclipse.uml2.uml.Package value);

} // ErrorModelLibrary
