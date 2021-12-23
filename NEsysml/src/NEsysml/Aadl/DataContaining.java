/**
 */
package NEsysml.Aadl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Containing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.DataContaining#getOwnedDataSubcomponent <em>Owned Data Subcomponent</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getDataContaining()
 * @model abstract="true"
 * @generated
 */
public interface DataContaining extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Data Subcomponent</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.Aadl.DataSubcomponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Data Subcomponent</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Data Subcomponent</em>' reference list.
	 * @see NEsysml.Aadl.AadlPackage#getDataContaining_OwnedDataSubcomponent()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<DataSubcomponent> getOwnedDataSubcomponent();

} // DataContaining
