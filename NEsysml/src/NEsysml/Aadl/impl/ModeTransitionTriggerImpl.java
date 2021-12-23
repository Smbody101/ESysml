/**
 */
package NEsysml.Aadl.impl;

import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.EventPort;
import NEsysml.Aadl.ModeTransitionTrigger;
import NEsysml.Aadl.ModeTransitionTriggerContext;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Trigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mode Transition Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.ModeTransitionTriggerImpl#getBase_Trigger <em>Base Trigger</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.ModeTransitionTriggerImpl#getPort <em>Port</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.ModeTransitionTriggerImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModeTransitionTriggerImpl extends MinimalEObjectImpl.Container implements ModeTransitionTrigger {
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
	 * The cached value of the '{@link #getPort() <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EventPort port;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected ModeTransitionTriggerContext context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeTransitionTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.MODE_TRANSITION_TRIGGER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AadlPackage.MODE_TRANSITION_TRIGGER__BASE_TRIGGER, oldBase_Trigger, base_Trigger));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AadlPackage.MODE_TRANSITION_TRIGGER__BASE_TRIGGER, oldBase_Trigger, base_Trigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventPort getPort() {
		if (port != null && port.eIsProxy()) {
			InternalEObject oldPort = (InternalEObject)port;
			port = (EventPort)eResolveProxy(oldPort);
			if (port != oldPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AadlPackage.MODE_TRANSITION_TRIGGER__PORT, oldPort, port));
			}
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventPort basicGetPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(EventPort newPort) {
		EventPort oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AadlPackage.MODE_TRANSITION_TRIGGER__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeTransitionTriggerContext getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (ModeTransitionTriggerContext)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AadlPackage.MODE_TRANSITION_TRIGGER__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeTransitionTriggerContext basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(ModeTransitionTriggerContext newContext) {
		ModeTransitionTriggerContext oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AadlPackage.MODE_TRANSITION_TRIGGER__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AadlPackage.MODE_TRANSITION_TRIGGER__BASE_TRIGGER:
				if (resolve) return getBase_Trigger();
				return basicGetBase_Trigger();
			case AadlPackage.MODE_TRANSITION_TRIGGER__PORT:
				if (resolve) return getPort();
				return basicGetPort();
			case AadlPackage.MODE_TRANSITION_TRIGGER__CONTEXT:
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
			case AadlPackage.MODE_TRANSITION_TRIGGER__BASE_TRIGGER:
				setBase_Trigger((Trigger)newValue);
				return;
			case AadlPackage.MODE_TRANSITION_TRIGGER__PORT:
				setPort((EventPort)newValue);
				return;
			case AadlPackage.MODE_TRANSITION_TRIGGER__CONTEXT:
				setContext((ModeTransitionTriggerContext)newValue);
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
			case AadlPackage.MODE_TRANSITION_TRIGGER__BASE_TRIGGER:
				setBase_Trigger((Trigger)null);
				return;
			case AadlPackage.MODE_TRANSITION_TRIGGER__PORT:
				setPort((EventPort)null);
				return;
			case AadlPackage.MODE_TRANSITION_TRIGGER__CONTEXT:
				setContext((ModeTransitionTriggerContext)null);
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
			case AadlPackage.MODE_TRANSITION_TRIGGER__BASE_TRIGGER:
				return base_Trigger != null;
			case AadlPackage.MODE_TRANSITION_TRIGGER__PORT:
				return port != null;
			case AadlPackage.MODE_TRANSITION_TRIGGER__CONTEXT:
				return context != null;
		}
		return super.eIsSet(featureID);
	}

} //ModeTransitionTriggerImpl
