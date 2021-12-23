/**
 */
package NEsysml.EM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Model Subclause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.ErrorModelSubclause#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link NEsysml.EM.ErrorModelSubclause#getOwnedPropagationPoint <em>Owned Propagation Point</em>}</li>
 *   <li>{@link NEsysml.EM.ErrorModelSubclause#getOwnedBehavior <em>Owned Behavior</em>}</li>
 *   <li>{@link NEsysml.EM.ErrorModelSubclause#getUseTypes <em>Use Types</em>}</li>
 * </ul>
 *
 * @see NEsysml.EM.EMPackage#getErrorModelSubclause()
 * @model
 * @generated
 */
public interface ErrorModelSubclause extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see NEsysml.EM.EMPackage#getErrorModelSubclause_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link NEsysml.EM.ErrorModelSubclause#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Owned Propagation Point</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.EM.ErrorPropagationPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Propagation Point</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Propagation Point</em>' reference list.
	 * @see NEsysml.EM.EMPackage#getErrorModelSubclause_OwnedPropagationPoint()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ErrorPropagationPoint> getOwnedPropagationPoint();

	/**
	 * Returns the value of the '<em><b>Owned Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Behavior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Behavior</em>' reference.
	 * @see #setOwnedBehavior(ComponentErrorBehavior)
	 * @see NEsysml.EM.EMPackage#getErrorModelSubclause_OwnedBehavior()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ComponentErrorBehavior getOwnedBehavior();

	/**
	 * Sets the value of the '{@link NEsysml.EM.ErrorModelSubclause#getOwnedBehavior <em>Owned Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Behavior</em>' reference.
	 * @see #getOwnedBehavior()
	 * @generated
	 */
	void setOwnedBehavior(ComponentErrorBehavior value);

	/**
	 * Returns the value of the '<em><b>Use Types</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.EM.ErrorModelLibrary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Types</em>' reference list.
	 * @see NEsysml.EM.EMPackage#getErrorModelSubclause_UseTypes()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ErrorModelLibrary> getUseTypes();

} // ErrorModelSubclause
