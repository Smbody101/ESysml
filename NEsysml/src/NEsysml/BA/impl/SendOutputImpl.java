/**
 */
package NEsysml.BA.impl;

import NEsysml.BA.BAPackage;
import NEsysml.BA.SendOutput;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.SendSignalAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.BA.impl.SendOutputImpl#getBase_SendSignalAction <em>Base Send Signal Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SendOutputImpl extends PortActionImpl implements SendOutput {
	/**
	 * The cached value of the '{@link #getBase_SendSignalAction() <em>Base Send Signal Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_SendSignalAction()
	 * @generated
	 * @ordered
	 */
	protected SendSignalAction base_SendSignalAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BAPackage.Literals.SEND_OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendSignalAction getBase_SendSignalAction() {
		if (base_SendSignalAction != null && base_SendSignalAction.eIsProxy()) {
			InternalEObject oldBase_SendSignalAction = (InternalEObject)base_SendSignalAction;
			base_SendSignalAction = (SendSignalAction)eResolveProxy(oldBase_SendSignalAction);
			if (base_SendSignalAction != oldBase_SendSignalAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BAPackage.SEND_OUTPUT__BASE_SEND_SIGNAL_ACTION, oldBase_SendSignalAction, base_SendSignalAction));
			}
		}
		return base_SendSignalAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendSignalAction basicGetBase_SendSignalAction() {
		return base_SendSignalAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_SendSignalAction(SendSignalAction newBase_SendSignalAction) {
		SendSignalAction oldBase_SendSignalAction = base_SendSignalAction;
		base_SendSignalAction = newBase_SendSignalAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BAPackage.SEND_OUTPUT__BASE_SEND_SIGNAL_ACTION, oldBase_SendSignalAction, base_SendSignalAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BAPackage.SEND_OUTPUT__BASE_SEND_SIGNAL_ACTION:
				if (resolve) return getBase_SendSignalAction();
				return basicGetBase_SendSignalAction();
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
			case BAPackage.SEND_OUTPUT__BASE_SEND_SIGNAL_ACTION:
				setBase_SendSignalAction((SendSignalAction)newValue);
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
			case BAPackage.SEND_OUTPUT__BASE_SEND_SIGNAL_ACTION:
				setBase_SendSignalAction((SendSignalAction)null);
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
			case BAPackage.SEND_OUTPUT__BASE_SEND_SIGNAL_ACTION:
				return base_SendSignalAction != null;
		}
		return super.eIsSet(featureID);
	}

} //SendOutputImpl
