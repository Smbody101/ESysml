/**
 */
package NEsysml.EM.impl;

import NEsysml.EM.EMPackage;
import NEsysml.EM.ErrorTransitionTrigger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Trigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Transition Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.impl.ErrorTransitionTriggerImpl#getBase_Trigger <em>Base Trigger</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ErrorTransitionTriggerImpl extends ErrorTypedElementImpl implements ErrorTransitionTrigger {
	/**
	 * The cached value of the '{@link #getBase_Trigger() <em>Base Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Trigger()
	 * @generated
	 * @ordered
	 */
	protected Trigger base_Trigger;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorTransitionTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMPackage.Literals.ERROR_TRANSITION_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger getBase_Trigger() {
		if (base_Trigger != null && base_Trigger.eIsProxy()) {
			InternalEObject oldBase_Trigger = (InternalEObject)base_Trigger;
			base_Trigger = (Trigger)eResolveProxy(oldBase_Trigger);
			if (base_Trigger != oldBase_Trigger) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMPackage.ERROR_TRANSITION_TRIGGER__BASE_TRIGGER, oldBase_Trigger, base_Trigger));
			}
		}
		return base_Trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger basicGetBase_Trigger() {
		return base_Trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Trigger(Trigger newBase_Trigger) {
		Trigger oldBase_Trigger = base_Trigger;
		base_Trigger = newBase_Trigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMPackage.ERROR_TRANSITION_TRIGGER__BASE_TRIGGER, oldBase_Trigger, base_Trigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EMPackage.ERROR_TRANSITION_TRIGGER__BASE_TRIGGER:
				if (resolve) return getBase_Trigger();
				return basicGetBase_Trigger();
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
			case EMPackage.ERROR_TRANSITION_TRIGGER__BASE_TRIGGER:
				setBase_Trigger((Trigger)newValue);
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
			case EMPackage.ERROR_TRANSITION_TRIGGER__BASE_TRIGGER:
				setBase_Trigger((Trigger)null);
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
			case EMPackage.ERROR_TRANSITION_TRIGGER__BASE_TRIGGER:
				return base_Trigger != null;
		}
		return super.eIsSet(featureID);
	}

} //ErrorTransitionTriggerImpl
