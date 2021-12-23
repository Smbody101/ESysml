/**
 */
package NEsysml.Aadl.impl;

import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.SubprogramInstance;
import NEsysml.Aadl.SubprogramInstanceCall;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.CallBehaviorAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subprogram Instance Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.SubprogramInstanceCallImpl#getBase_CallBehaviorAction <em>Base Call Behavior Action</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.SubprogramInstanceCallImpl#getSubprogramInstance <em>Subprogram Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubprogramInstanceCallImpl extends SubprogramCallImpl implements SubprogramInstanceCall {
	/**
	 * The cached value of the '{@link #getBase_CallBehaviorAction() <em>Base Call Behavior Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_CallBehaviorAction()
	 * @generated
	 * @ordered
	 */
	protected CallBehaviorAction base_CallBehaviorAction;

	/**
	 * The cached value of the '{@link #getSubprogramInstance() <em>Subprogram Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubprogramInstance()
	 * @generated
	 * @ordered
	 */
	protected SubprogramInstance subprogramInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubprogramInstanceCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.SUBPROGRAM_INSTANCE_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallBehaviorAction getBase_CallBehaviorAction() {
		if (base_CallBehaviorAction != null && base_CallBehaviorAction.eIsProxy()) {
			InternalEObject oldBase_CallBehaviorAction = (InternalEObject)base_CallBehaviorAction;
			base_CallBehaviorAction = (CallBehaviorAction)eResolveProxy(oldBase_CallBehaviorAction);
			if (base_CallBehaviorAction != oldBase_CallBehaviorAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AadlPackage.SUBPROGRAM_INSTANCE_CALL__BASE_CALL_BEHAVIOR_ACTION, oldBase_CallBehaviorAction, base_CallBehaviorAction));
			}
		}
		return base_CallBehaviorAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallBehaviorAction basicGetBase_CallBehaviorAction() {
		return base_CallBehaviorAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_CallBehaviorAction(CallBehaviorAction newBase_CallBehaviorAction) {
		CallBehaviorAction oldBase_CallBehaviorAction = base_CallBehaviorAction;
		base_CallBehaviorAction = newBase_CallBehaviorAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AadlPackage.SUBPROGRAM_INSTANCE_CALL__BASE_CALL_BEHAVIOR_ACTION, oldBase_CallBehaviorAction, base_CallBehaviorAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramInstance getSubprogramInstance() {
		if (subprogramInstance != null && subprogramInstance.eIsProxy()) {
			InternalEObject oldSubprogramInstance = (InternalEObject)subprogramInstance;
			subprogramInstance = (SubprogramInstance)eResolveProxy(oldSubprogramInstance);
			if (subprogramInstance != oldSubprogramInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AadlPackage.SUBPROGRAM_INSTANCE_CALL__SUBPROGRAM_INSTANCE, oldSubprogramInstance, subprogramInstance));
			}
		}
		return subprogramInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramInstance basicGetSubprogramInstance() {
		return subprogramInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubprogramInstance(SubprogramInstance newSubprogramInstance) {
		SubprogramInstance oldSubprogramInstance = subprogramInstance;
		subprogramInstance = newSubprogramInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AadlPackage.SUBPROGRAM_INSTANCE_CALL__SUBPROGRAM_INSTANCE, oldSubprogramInstance, subprogramInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AadlPackage.SUBPROGRAM_INSTANCE_CALL__BASE_CALL_BEHAVIOR_ACTION:
				if (resolve) return getBase_CallBehaviorAction();
				return basicGetBase_CallBehaviorAction();
			case AadlPackage.SUBPROGRAM_INSTANCE_CALL__SUBPROGRAM_INSTANCE:
				if (resolve) return getSubprogramInstance();
				return basicGetSubprogramInstance();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AadlPackage.SUBPROGRAM_INSTANCE_CALL__BASE_CALL_BEHAVIOR_ACTION:
				setBase_CallBehaviorAction((CallBehaviorAction)newValue);
				return;
			case AadlPackage.SUBPROGRAM_INSTANCE_CALL__SUBPROGRAM_INSTANCE:
				setSubprogramInstance((SubprogramInstance)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AadlPackage.SUBPROGRAM_INSTANCE_CALL__BASE_CALL_BEHAVIOR_ACTION:
				setBase_CallBehaviorAction((CallBehaviorAction)null);
				return;
			case AadlPackage.SUBPROGRAM_INSTANCE_CALL__SUBPROGRAM_INSTANCE:
				setSubprogramInstance((SubprogramInstance)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AadlPackage.SUBPROGRAM_INSTANCE_CALL__BASE_CALL_BEHAVIOR_ACTION:
				return base_CallBehaviorAction != null;
			case AadlPackage.SUBPROGRAM_INSTANCE_CALL__SUBPROGRAM_INSTANCE:
				return subprogramInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //SubprogramInstanceCallImpl
