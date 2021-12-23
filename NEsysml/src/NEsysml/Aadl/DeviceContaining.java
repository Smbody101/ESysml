/**
 */
package NEsysml.Aadl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Containing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.DeviceContaining#getOwnedDeviceSubcomponent <em>Owned Device Subcomponent</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getDeviceContaining()
 * @model
 * @generated
 */
public interface DeviceContaining extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Device Subcomponent</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.Aadl.DeviceSubcomponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Device Subcomponent</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Device Subcomponent</em>' reference list.
	 * @see NEsysml.Aadl.AadlPackage#getDeviceContaining_OwnedDeviceSubcomponent()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<DeviceSubcomponent> getOwnedDeviceSubcomponent();

} // DeviceContaining
