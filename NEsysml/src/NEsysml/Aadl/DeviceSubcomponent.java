/**
 */
package NEsysml.Aadl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.DeviceSubcomponent#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getDeviceSubcomponent()
 * @model
 * @generated
 */
public interface DeviceSubcomponent extends SubcomponentClassifier {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DeviceClassifier)
	 * @see NEsysml.Aadl.AadlPackage#getDeviceSubcomponent_Type()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	DeviceClassifier getType();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.DeviceSubcomponent#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DeviceClassifier value);

} // DeviceSubcomponent
