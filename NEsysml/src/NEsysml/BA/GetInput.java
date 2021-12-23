/**
 */
package NEsysml.BA;

import org.eclipse.uml2.uml.AcceptEventAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.BA.GetInput#getBase_AcceptEventAction <em>Base Accept Event Action</em>}</li>
 * </ul>
 *
 * @see NEsysml.BA.BAPackage#getGetInput()
 * @model
 * @generated
 */
public interface GetInput extends PortAction {
	/**
	 * Returns the value of the '<em><b>Base Accept Event Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Accept Event Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Accept Event Action</em>' reference.
	 * @see #setBase_AcceptEventAction(AcceptEventAction)
	 * @see NEsysml.BA.BAPackage#getGetInput_Base_AcceptEventAction()
	 * @model ordered="false"
	 * @generated
	 */
	AcceptEventAction getBase_AcceptEventAction();

	/**
	 * Sets the value of the '{@link NEsysml.BA.GetInput#getBase_AcceptEventAction <em>Base Accept Event Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Accept Event Action</em>' reference.
	 * @see #getBase_AcceptEventAction()
	 * @generated
	 */
	void setBase_AcceptEventAction(AcceptEventAction value);

} // GetInput
