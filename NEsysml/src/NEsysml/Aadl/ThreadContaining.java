/**
 */
package NEsysml.Aadl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thread Containing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.ThreadContaining#getOwnedThreadSubcomponent <em>Owned Thread Subcomponent</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getThreadContaining()
 * @model abstract="true"
 * @generated
 */
public interface ThreadContaining extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Thread Subcomponent</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.Aadl.ThreadSubcomponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Thread Subcomponent</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Thread Subcomponent</em>' reference list.
	 * @see NEsysml.Aadl.AadlPackage#getThreadContaining_OwnedThreadSubcomponent()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ThreadSubcomponent> getOwnedThreadSubcomponent();

} // ThreadContaining
