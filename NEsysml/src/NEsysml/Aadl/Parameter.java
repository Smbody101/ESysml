/**
 */
package NEsysml.Aadl;

import org.eclipse.uml2.uml.ParameterDirectionKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.Parameter#getDirection <em>Direction</em>}</li>
 *   <li>{@link NEsysml.Aadl.Parameter#getBase_Parameter <em>Base Parameter</em>}</li>
 *   <li>{@link NEsysml.Aadl.Parameter#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends Feature, ParameterConnectionEnd {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.uml2.uml.ParameterDirectionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.uml2.uml.ParameterDirectionKind
	 * @see #setDirection(ParameterDirectionKind)
	 * @see NEsysml.Aadl.AadlPackage#getParameter_Direction()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ParameterDirectionKind getDirection();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.Parameter#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.uml2.uml.ParameterDirectionKind
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(ParameterDirectionKind value);

	/**
	 * Returns the value of the '<em><b>Base Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Parameter</em>' reference.
	 * @see #setBase_Parameter(org.eclipse.uml2.uml.Parameter)
	 * @see NEsysml.Aadl.AadlPackage#getParameter_Base_Parameter()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Parameter getBase_Parameter();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.Parameter#getBase_Parameter <em>Base Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Parameter</em>' reference.
	 * @see #getBase_Parameter()
	 * @generated
	 */
	void setBase_Parameter(org.eclipse.uml2.uml.Parameter value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DataClassifier)
	 * @see NEsysml.Aadl.AadlPackage#getParameter_Type()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	DataClassifier getType();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.Parameter#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataClassifier value);

} // Parameter
