/**
 */
package NEsysml.BA;

import NEsysml.Aadl.SubprogramCall;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.BA.BehaviorAction#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see NEsysml.BA.BAPackage#getBehaviorAction()
 * @model abstract="true"
 * @generated
 */
public interface BehaviorAction extends SubprogramCall {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' attribute list.
	 * @see NEsysml.BA.BAPackage#getBehaviorAction_Parameter()
	 * @model dataType="org.eclipse.uml2.types.String" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<String> getParameter();

} // BehaviorAction
