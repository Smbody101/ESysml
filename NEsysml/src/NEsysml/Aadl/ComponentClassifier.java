/**
 */
package NEsysml.Aadl;

import NEsysml.EM.ErrorModelSubclause;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.ComponentClassifier#getOwnedErrorModel <em>Owned Error Model</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getComponentClassifier()
 * @model abstract="true"
 * @generated
 */
public interface ComponentClassifier extends Classifier {

	/**
	 * Returns the value of the '<em><b>Owned Error Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Error Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Error Model</em>' reference.
	 * @see #setOwnedErrorModel(ErrorModelSubclause)
	 * @see NEsysml.Aadl.AadlPackage#getComponentClassifier_OwnedErrorModel()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ErrorModelSubclause getOwnedErrorModel();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.ComponentClassifier#getOwnedErrorModel <em>Owned Error Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Error Model</em>' reference.
	 * @see #getOwnedErrorModel()
	 * @generated
	 */
	void setOwnedErrorModel(ErrorModelSubclause value);

} // ComponentClassifier
