/**
 */
package NEsysml.EM;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.papyrus.sysml14.portsandflows.ProxyPort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Propagation Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.ErrorPropagationPoint#getBindFeature <em>Bind Feature</em>}</li>
 * </ul>
 *
 * @see NEsysml.EM.EMPackage#getErrorPropagationPoint()
 * @model
 * @generated
 */
public interface ErrorPropagationPoint extends ErrorTypedElement, ProxyPort {
	/**
	 * Returns the value of the '<em><b>Bind Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bind Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bind Feature</em>' reference.
	 * @see #setBindFeature(EObject)
	 * @see NEsysml.EM.EMPackage#getErrorPropagationPoint_BindFeature()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EObject getBindFeature();

	/**
	 * Sets the value of the '{@link NEsysml.EM.ErrorPropagationPoint#getBindFeature <em>Bind Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bind Feature</em>' reference.
	 * @see #getBindFeature()
	 * @generated
	 */
	void setBindFeature(EObject value);

} // ErrorPropagationPoint
