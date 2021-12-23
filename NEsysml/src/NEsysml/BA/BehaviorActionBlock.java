/**
 */
package NEsysml.BA;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Activity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Action Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.BA.BehaviorActionBlock#getBase_Activity <em>Base Activity</em>}</li>
 *   <li>{@link NEsysml.BA.BehaviorActionBlock#getOwnedAction <em>Owned Action</em>}</li>
 *   <li>{@link NEsysml.BA.BehaviorActionBlock#getFirstAction <em>First Action</em>}</li>
 * </ul>
 *
 * @see NEsysml.BA.BAPackage#getBehaviorActionBlock()
 * @model
 * @generated
 */
public interface BehaviorActionBlock extends EObject {
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
	 * @see NEsysml.BA.BAPackage#getBehaviorActionBlock_Base_Activity()
	 * @model ordered="false"
	 * @generated
	 */
	Activity getBase_Activity();

	/**
	 * Sets the value of the '{@link NEsysml.BA.BehaviorActionBlock#getBase_Activity <em>Base Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Activity</em>' reference.
	 * @see #getBase_Activity()
	 * @generated
	 */
	void setBase_Activity(Activity value);

	/**
	 * Returns the value of the '<em><b>Owned Action</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.BA.BehaviorAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Action</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Action</em>' reference list.
	 * @see NEsysml.BA.BAPackage#getBehaviorActionBlock_OwnedAction()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<BehaviorAction> getOwnedAction();

	/**
	 * Returns the value of the '<em><b>First Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Action</em>' reference.
	 * @see #setFirstAction(BehaviorAction)
	 * @see NEsysml.BA.BAPackage#getBehaviorActionBlock_FirstAction()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	BehaviorAction getFirstAction();

	/**
	 * Sets the value of the '{@link NEsysml.BA.BehaviorActionBlock#getFirstAction <em>First Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Action</em>' reference.
	 * @see #getFirstAction()
	 * @generated
	 */
	void setFirstAction(BehaviorAction value);

} // BehaviorActionBlock
