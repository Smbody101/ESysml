/**
 */
package NEsysml.Aadl;

import org.eclipse.uml2.uml.Activity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subprogram Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.SubprogramType#getBase_Activity <em>Base Activity</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getSubprogramType()
 * @model
 * @generated
 */
public interface SubprogramType extends ComponentType, AnnexContaining, DataAccessContaining, ParameterContaining, PortContaining, SubprogramAccessContaining, SubprogramClassifier {
	/**
	 * Returns the value of the '<em><b>Base Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Activity</em>' reference.
	 * @see #setBase_Activity(Activity)
	 * @see NEsysml.Aadl.AadlPackage#getSubprogramType_Base_Activity()
	 * @model ordered="false"
	 * @generated
	 */
	Activity getBase_Activity();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.SubprogramType#getBase_Activity <em>Base Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Activity</em>' reference.
	 * @see #getBase_Activity()
	 * @generated
	 */
	void setBase_Activity(Activity value);

} // SubprogramType
