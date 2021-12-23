/**
 */
package NEsysml.Aadl.impl;

import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.SubprogramCallContext;
import NEsysml.Aadl.SubprogramInterface;
import NEsysml.Aadl.SubprogramInterfaceCall;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.CallOperationAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subprogram Interface Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.SubprogramInterfaceCallImpl#getBase_CallOperationAction <em>Base Call Operation Action</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.SubprogramInterfaceCallImpl#getSubprogramInterface <em>Subprogram Interface</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.SubprogramInterfaceCallImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubprogramInterfaceCallImpl extends SubprogramCallImpl implements SubprogramInterfaceCall {
	/**
	 * The cached value of the '{@link #getBase_CallOperationAction() <em>Base Call Operation Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_CallOperationAction()
	 * @generated
	 * @ordered
	 */
	protected CallOperationAction base_CallOperationAction;

	/**
	 * The cached value of the '{@link #getSubprogramInterface() <em>Subprogram Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubprogramInterface()
	 * @generated
	 * @ordered
	 */
	protected SubprogramInterface subprogramInterface;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected SubprogramCallContext context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubprogramInterfaceCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.SUBPROGRAM_INTERFACE_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallOperationAction getBase_CallOperationAction() {
		if (base_CallOperationAction != null && base_CallOperationAction.eIsProxy()) {
			InternalEObject oldBase_CallOperationAction = (InternalEObject)base_CallOperationAction;
			base_CallOperationAction = (CallOperationAction)eResolveProxy(oldBase_CallOperationAction);
			if (base_CallOperationAction != oldBase_CallOperationAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AadlPackage.SUBPROGRAM_INTERFACE_CALL__BASE_CALL_OPERATION_ACTION, oldBase_CallOperationAction, base_CallOperationAction));
			}
		}
		return base_CallOperationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallOperationAction basicGetBase_CallOperationAction() {
		return base_CallOperationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_CallOperationAction(CallOperationAction newBase_CallOperationAction) {
		CallOperationAction oldBase_CallOperationAction = base_CallOperationAction;
		base_CallOperationAction = newBase_CallOperationAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AadlPackage.SUBPROGRAM_INTERFACE_CALL__BASE_CALL_OPERATION_ACTION, oldBase_CallOperationAction, base_CallOperationAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramInterface getSubprogramInterface() {
		if (subprogramInterface != null && subprogramInterface.eIsProxy()) {
			InternalEObject oldSubprogramInterface = (InternalEObject)subprogramInterface;
			subprogramInterface = (SubprogramInterface)eResolveProxy(oldSubprogramInterface);
			if (subprogramInterface != oldSubprogramInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AadlPackage.SUBPROGRAM_INTERFACE_CALL__SUBPROGRAM_INTERFACE, oldSubprogramInterface, subprogramInterface));
			}
		}
		return subprogramInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramInterface basicGetSubprogramInterface() {
		return subprogramInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubprogramInterface(SubprogramInterface newSubprogramInterface) {
		SubprogramInterface oldSubprogramInterface = subprogramInterface;
		subprogramInterface = newSubprogramInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AadlPackage.SUBPROGRAM_INTERFACE_CALL__SUBPROGRAM_INTERFACE, oldSubprogramInterface, subprogramInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramCallContext getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (SubprogramCallContext)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AadlPackage.SUBPROGRAM_INTERFACE_CALL__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramCallContext basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(SubprogramCallContext newContext) {
		SubprogramCallContext oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AadlPackage.SUBPROGRAM_INTERFACE_CALL__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AadlPackage.SUBPROGRAM_INTERFACE_CALL__BASE_CALL_OPERATION_ACTION:
				if (resolve) return getBase_CallOperationAction();
				return basicGetBase_CallOperationAction();
			case AadlPackage.SUBPROGRAM_INTERFACE_CALL__SUBPROGRAM_INTERFACE:
				if (resolve) return getSubprogramInterface();
				return basicGetSubprogramInterface();
			case AadlPackage.SUBPROGRAM_INTERFACE_CALL__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
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
			case AadlPackage.SUBPROGRAM_INTERFACE_CALL__BASE_CALL_OPERATION_ACTION:
				setBase_CallOperationAction((CallOperationAction)newValue);
				return;
			case AadlPackage.SUBPROGRAM_INTERFACE_CALL__SUBPROGRAM_INTERFACE:
				setSubprogramInterface((SubprogramInterface)newValue);
				return;
			case AadlPackage.SUBPROGRAM_INTERFACE_CALL__CONTEXT:
				setContext((SubprogramCallContext)newValue);
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
			case AadlPackage.SUBPROGRAM_INTERFACE_CALL__BASE_CALL_OPERATION_ACTION:
				setBase_CallOperationAction((CallOperationAction)null);
				return;
			case AadlPackage.SUBPROGRAM_INTERFACE_CALL__SUBPROGRAM_INTERFACE:
				setSubprogramInterface((SubprogramInterface)null);
				return;
			case AadlPackage.SUBPROGRAM_INTERFACE_CALL__CONTEXT:
				setContext((SubprogramCallContext)null);
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
			case AadlPackage.SUBPROGRAM_INTERFACE_CALL__BASE_CALL_OPERATION_ACTION:
				return base_CallOperationAction != null;
			case AadlPackage.SUBPROGRAM_INTERFACE_CALL__SUBPROGRAM_INTERFACE:
				return subprogramInterface != null;
			case AadlPackage.SUBPROGRAM_INTERFACE_CALL__CONTEXT:
				return context != null;
		}
		return super.eIsSet(featureID);
	}

} //SubprogramInterfaceCallImpl
