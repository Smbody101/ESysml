/**
 */
package NEsysml.EM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Propagation Point Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.PropagationPointTrigger#getContext <em>Context</em>}</li>
 *   <li>{@link NEsysml.EM.PropagationPointTrigger#getPoint <em>Point</em>}</li>
 * </ul>
 *
 * @see NEsysml.EM.EMPackage#getPropagationPointTrigger()
 * @model
 * @generated
 */
public interface PropagationPointTrigger extends ErrorTransitionTrigger {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(EObject)
	 * @see NEsysml.EM.EMPackage#getPropagationPointTrigger_Context()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EObject getContext();

	/**
	 * Sets the value of the '{@link NEsysml.EM.PropagationPointTrigger#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(EObject value);

	/**
	 * Returns the value of the '<em><b>Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point</em>' reference.
	 * @see #setPoint(ErrorPropagationPoint)
	 * @see NEsysml.EM.EMPackage#getPropagationPointTrigger_Point()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ErrorPropagationPoint getPoint();

	/**
	 * Sets the value of the '{@link NEsysml.EM.PropagationPointTrigger#getPoint <em>Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point</em>' reference.
	 * @see #getPoint()
	 * @generated
	 */
	void setPoint(ErrorPropagationPoint value);

} // PropagationPointTrigger
