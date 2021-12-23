/**
 */
package NEsysml.EM;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.ErrorType#getBase_DataType <em>Base Data Type</em>}</li>
 *   <li>{@link NEsysml.EM.ErrorType#getExtension <em>Extension</em>}</li>
 *   <li>{@link NEsysml.EM.ErrorType#getInLibrary <em>In Library</em>}</li>
 * </ul>
 *
 * @see NEsysml.EM.EMPackage#getErrorType()
 * @model
 * @generated
 */
public interface ErrorType extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Data Type</em>' reference.
	 * @see #setBase_DataType(DataType)
	 * @see NEsysml.EM.EMPackage#getErrorType_Base_DataType()
	 * @model ordered="false"
	 * @generated
	 */
	DataType getBase_DataType();

	/**
	 * Sets the value of the '{@link NEsysml.EM.ErrorType#getBase_DataType <em>Base Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Data Type</em>' reference.
	 * @see #getBase_DataType()
	 * @generated
	 */
	void setBase_DataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' reference.
	 * @see #setExtension(ErrorType)
	 * @see NEsysml.EM.EMPackage#getErrorType_Extension()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ErrorType getExtension();

	/**
	 * Sets the value of the '{@link NEsysml.EM.ErrorType#getExtension <em>Extension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' reference.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(ErrorType value);

	/**
	 * Returns the value of the '<em><b>In Library</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link NEsysml.EM.ErrorModelLibrary#getOwnedErrorType <em>Owned Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Library</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Library</em>' reference.
	 * @see #setInLibrary(ErrorModelLibrary)
	 * @see NEsysml.EM.EMPackage#getErrorType_InLibrary()
	 * @see NEsysml.EM.ErrorModelLibrary#getOwnedErrorType
	 * @model opposite="ownedErrorType" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ErrorModelLibrary getInLibrary();

	/**
	 * Sets the value of the '{@link NEsysml.EM.ErrorType#getInLibrary <em>In Library</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Library</em>' reference.
	 * @see #getInLibrary()
	 * @generated
	 */
	void setInLibrary(ErrorModelLibrary value);

} // ErrorType
