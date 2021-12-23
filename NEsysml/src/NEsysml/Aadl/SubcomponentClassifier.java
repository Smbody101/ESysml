/**
 */
package NEsysml.Aadl;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subcomponent Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.SubcomponentClassifier#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getSubcomponentClassifier()
 * @model abstract="true"
 * @generated
 */
public interface SubcomponentClassifier extends Classifier, ModeTransitionTriggerContext, PortAndAccessConectionContext {
	/**
	 * Returns the value of the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Property</em>' reference.
	 * @see #setBase_Property(Property)
	 * @see NEsysml.Aadl.AadlPackage#getSubcomponentClassifier_Base_Property()
	 * @model ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.SubcomponentClassifier#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

} // SubcomponentClassifier
