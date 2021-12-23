/**
 */
package NEsysml.EM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Error Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.ComponentErrorBehavior#getImportBehavior <em>Import Behavior</em>}</li>
 *   <li>{@link NEsysml.EM.ComponentErrorBehavior#getOwnedErrorPropagation <em>Owned Error Propagation</em>}</li>
 * </ul>
 *
 * @see NEsysml.EM.EMPackage#getComponentErrorBehavior()
 * @model
 * @generated
 */
public interface ComponentErrorBehavior extends ErrorBehavior {
	/**
	 * Returns the value of the '<em><b>Import Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import Behavior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import Behavior</em>' reference.
	 * @see #setImportBehavior(ErrorBehaviorStateMachine)
	 * @see NEsysml.EM.EMPackage#getComponentErrorBehavior_ImportBehavior()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ErrorBehaviorStateMachine getImportBehavior();

	/**
	 * Sets the value of the '{@link NEsysml.EM.ComponentErrorBehavior#getImportBehavior <em>Import Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import Behavior</em>' reference.
	 * @see #getImportBehavior()
	 * @generated
	 */
	void setImportBehavior(ErrorBehaviorStateMachine value);

	/**
	 * Returns the value of the '<em><b>Owned Error Propagation</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.EM.ErrorPropagation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Error Propagation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Error Propagation</em>' reference list.
	 * @see NEsysml.EM.EMPackage#getComponentErrorBehavior_OwnedErrorPropagation()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ErrorPropagation> getOwnedErrorPropagation();

} // ComponentErrorBehavior
