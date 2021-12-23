/**
 */
package NEsysml.BA;

import NEsysml.Aadl.DataClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.PrimitiveType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.BA.Variable#getType <em>Type</em>}</li>
 *   <li>{@link NEsysml.BA.Variable#getPrimitiveType <em>Primitive Type</em>}</li>
 *   <li>{@link NEsysml.BA.Variable#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see NEsysml.BA.BAPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject {
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
	 * @see NEsysml.BA.BAPackage#getVariable_Type()
	 * @model ordered="false"
	 * @generated
	 */
	DataClassifier getType();

	/**
	 * Sets the value of the '{@link NEsysml.BA.Variable#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataClassifier value);

	/**
	 * Returns the value of the '<em><b>Primitive Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Type</em>' reference.
	 * @see #setPrimitiveType(PrimitiveType)
	 * @see NEsysml.BA.BAPackage#getVariable_PrimitiveType()
	 * @model ordered="false"
	 * @generated
	 */
	PrimitiveType getPrimitiveType();

	/**
	 * Sets the value of the '{@link NEsysml.BA.Variable#getPrimitiveType <em>Primitive Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Type</em>' reference.
	 * @see #getPrimitiveType()
	 * @generated
	 */
	void setPrimitiveType(PrimitiveType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see NEsysml.BA.BAPackage#getVariable_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link NEsysml.BA.Variable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Variable
