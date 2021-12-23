/**
 */
package NEsysml.BA;

import org.eclipse.uml2.uml.SendSignalAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.BA.SendOutput#getBase_SendSignalAction <em>Base Send Signal Action</em>}</li>
 * </ul>
 *
 * @see NEsysml.BA.BAPackage#getSendOutput()
 * @model
 * @generated
 */
public interface SendOutput extends PortAction {
	/**
	 * Returns the value of the '<em><b>Base Send Signal Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Send Signal Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Send Signal Action</em>' reference.
	 * @see #setBase_SendSignalAction(SendSignalAction)
	 * @see NEsysml.BA.BAPackage#getSendOutput_Base_SendSignalAction()
	 * @model ordered="false"
	 * @generated
	 */
	SendSignalAction getBase_SendSignalAction();

	/**
	 * Sets the value of the '{@link NEsysml.BA.SendOutput#getBase_SendSignalAction <em>Base Send Signal Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Send Signal Action</em>' reference.
	 * @see #getBase_SendSignalAction()
	 * @generated
	 */
	void setBase_SendSignalAction(SendSignalAction value);

} // SendOutput
