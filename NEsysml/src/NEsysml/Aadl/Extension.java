/**
 */
package NEsysml.Aadl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Generalization;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.Extension#getBase_Generalization <em>Base Generalization</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getExtension()
 * @model
 * @generated
 */
public interface Extension extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Generalization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Generalization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Generalization</em>' reference.
	 * @see #setBase_Generalization(Generalization)
	 * @see NEsysml.Aadl.AadlPackage#getExtension_Base_Generalization()
	 * @model ordered="false"
	 * @generated
	 */
	Generalization getBase_Generalization();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.Extension#getBase_Generalization <em>Base Generalization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Generalization</em>' reference.
	 * @see #getBase_Generalization()
	 * @generated
	 */
	void setBase_Generalization(Generalization value);

} // Extension
