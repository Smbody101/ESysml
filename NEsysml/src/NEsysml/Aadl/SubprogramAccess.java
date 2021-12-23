/**
 */
package NEsysml.Aadl;

import org.eclipse.papyrus.sysml14.portsandflows.FeatureDirection;
import org.eclipse.papyrus.sysml14.portsandflows.ProxyPort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subprogram Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.SubprogramAccess#getSpecification <em>Specification</em>}</li>
 *   <li>{@link NEsysml.Aadl.SubprogramAccess#getDirection <em>Direction</em>}</li>
 *   <li>{@link NEsysml.Aadl.SubprogramAccess#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getSubprogramAccess()
 * @model
 * @generated
 */
public interface SubprogramAccess extends ProxyPort, Feature, SubprogramInterface {
	/**
	 * Returns the value of the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' reference.
	 * @see #setSpecification(SubprogramSpecification)
	 * @see NEsysml.Aadl.AadlPackage#getSubprogramAccess_Specification()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	SubprogramSpecification getSpecification();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.SubprogramAccess#getSpecification <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(SubprogramSpecification value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.sysml14.portsandflows.FeatureDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.papyrus.sysml14.portsandflows.FeatureDirection
	 * @see #setDirection(FeatureDirection)
	 * @see NEsysml.Aadl.AadlPackage#getSubprogramAccess_Direction()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	FeatureDirection getDirection();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.SubprogramAccess#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.papyrus.sysml14.portsandflows.FeatureDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(FeatureDirection value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(SubprogramClassifier)
	 * @see NEsysml.Aadl.AadlPackage#getSubprogramAccess_Type()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	SubprogramClassifier getType();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.SubprogramAccess#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(SubprogramClassifier value);

} // SubprogramAccess
