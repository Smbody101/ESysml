/**
 */
package NEsysml.Aadl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.AadlModel#getOwnedClassifier <em>Owned Classifier</em>}</li>
 *   <li>{@link NEsysml.Aadl.AadlModel#getBase_Package <em>Base Package</em>}</li>
 *   <li>{@link NEsysml.Aadl.AadlModel#getImportEMLibrary <em>Import EM Library</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getAadlModel()
 * @model
 * @generated
 */
public interface AadlModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Classifier</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.Aadl.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Classifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Classifier</em>' reference list.
	 * @see NEsysml.Aadl.AadlPackage#getAadlModel_OwnedClassifier()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Classifier> getOwnedClassifier();

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
	 * @see NEsysml.Aadl.AadlPackage#getAadlModel_Base_Package()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Package getBase_Package();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.AadlModel#getBase_Package <em>Base Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' reference.
	 * @see #getBase_Package()
	 * @generated
	 */
	void setBase_Package(org.eclipse.uml2.uml.Package value);

	/**
	 * Returns the value of the '<em><b>Import EM Library</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import EM Library</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import EM Library</em>' reference list.
	 * @see NEsysml.Aadl.AadlPackage#getAadlModel_ImportEMLibrary()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<EObject> getImportEMLibrary();

} // AadlModel
