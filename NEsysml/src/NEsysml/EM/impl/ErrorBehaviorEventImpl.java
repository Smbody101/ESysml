/**
 */
package NEsysml.EM.impl;

import NEsysml.EM.EMPackage;
import NEsysml.EM.ErrorBehaviorEvent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.ChangeEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Behavior Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.impl.ErrorBehaviorEventImpl#getBase_ChangeEvent <em>Base Change Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ErrorBehaviorEventImpl extends MinimalEObjectImpl.Container implements ErrorBehaviorEvent {
	/**
	 * The cached value of the '{@link #getBase_ChangeEvent() <em>Base Change Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_ChangeEvent()
	 * @generated
	 * @ordered
	 */
	protected ChangeEvent base_ChangeEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorBehaviorEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMPackage.Literals.ERROR_BEHAVIOR_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeEvent getBase_ChangeEvent() {
		if (base_ChangeEvent != null && base_ChangeEvent.eIsProxy()) {
			InternalEObject oldBase_ChangeEvent = (InternalEObject)base_ChangeEvent;
			base_ChangeEvent = (ChangeEvent)eResolveProxy(oldBase_ChangeEvent);
			if (base_ChangeEvent != oldBase_ChangeEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMPackage.ERROR_BEHAVIOR_EVENT__BASE_CHANGE_EVENT, oldBase_ChangeEvent, base_ChangeEvent));
			}
		}
		return base_ChangeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeEvent basicGetBase_ChangeEvent() {
		return base_ChangeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_ChangeEvent(ChangeEvent newBase_ChangeEvent) {
		ChangeEvent oldBase_ChangeEvent = base_ChangeEvent;
		base_ChangeEvent = newBase_ChangeEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMPackage.ERROR_BEHAVIOR_EVENT__BASE_CHANGE_EVENT, oldBase_ChangeEvent, base_ChangeEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EMPackage.ERROR_BEHAVIOR_EVENT__BASE_CHANGE_EVENT:
				if (resolve) return getBase_ChangeEvent();
				return basicGetBase_ChangeEvent();
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
			case EMPackage.ERROR_BEHAVIOR_EVENT__BASE_CHANGE_EVENT:
				setBase_ChangeEvent((ChangeEvent)newValue);
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
			case EMPackage.ERROR_BEHAVIOR_EVENT__BASE_CHANGE_EVENT:
				setBase_ChangeEvent((ChangeEvent)null);
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
			case EMPackage.ERROR_BEHAVIOR_EVENT__BASE_CHANGE_EVENT:
				return base_ChangeEvent != null;
		}
		return super.eIsSet(featureID);
	}

} //ErrorBehaviorEventImpl
