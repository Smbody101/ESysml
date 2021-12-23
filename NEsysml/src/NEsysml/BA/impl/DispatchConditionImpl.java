/**
 */
package NEsysml.BA.impl;

import NEsysml.Aadl.EventPort;
import NEsysml.Aadl.SubprogramAccess;

import NEsysml.BA.BAPackage;
import NEsysml.BA.DispatchCondition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.uml.TimeEvent;
import org.eclipse.uml2.uml.Trigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dispatch Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.BA.impl.DispatchConditionImpl#getBase_Trigger <em>Base Trigger</em>}</li>
 *   <li>{@link NEsysml.BA.impl.DispatchConditionImpl#isTimeout <em>Is Timeout</em>}</li>
 *   <li>{@link NEsysml.BA.impl.DispatchConditionImpl#getDispatchPort <em>Dispatch Port</em>}</li>
 *   <li>{@link NEsysml.BA.impl.DispatchConditionImpl#getDispatchSubprogramAccess <em>Dispatch Subprogram Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DispatchConditionImpl extends TransitionConditionImpl implements DispatchCondition {
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
	 * The default value of the '{@link #isTimeout() <em>Is Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TIMEOUT_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DispatchConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BAPackage.Literals.DISPATCH_CONDITION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BAPackage.DISPATCH_CONDITION__BASE_TRIGGER, oldBase_Trigger, base_Trigger));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BAPackage.DISPATCH_CONDITION__BASE_TRIGGER, oldBase_Trigger, base_Trigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isTimeout() {
		// TODO: implement this method to return the 'Is Timeout' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		return this.getBase_Trigger().getEvent() != null && this.getBase_Trigger().getEvent() instanceof TimeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTimeout(boolean newIsTimeout) {
		// TODO: implement this method to set the 'Is Timeout' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<EventPort> getDispatchPort() {
		// TODO: implement this method to return the 'Dispatch Port' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<EventPort> list = new BasicEList<EventPort>();
		for(org.eclipse.uml2.uml.Port port : this.getBase_Trigger().getPorts()) {
			for(EObject object : port.getStereotypeApplications())
				if(object instanceof EventPort)
					list.add((EventPort) object);
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<SubprogramAccess> getDispatchSubprogramAccess() {
		// TODO: implement this method to return the 'Dispatch Subprogram Access' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<SubprogramAccess> list = new BasicEList<SubprogramAccess>();
		for(org.eclipse.uml2.uml.Port port : this.getBase_Trigger().getPorts()) {
			for(EObject object : port.getStereotypeApplications())
				if(object instanceof SubprogramAccess)
					list.add((SubprogramAccess) object);
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BAPackage.DISPATCH_CONDITION__BASE_TRIGGER:
				if (resolve) return getBase_Trigger();
				return basicGetBase_Trigger();
			case BAPackage.DISPATCH_CONDITION__IS_TIMEOUT:
				return isTimeout();
			case BAPackage.DISPATCH_CONDITION__DISPATCH_PORT:
				return getDispatchPort();
			case BAPackage.DISPATCH_CONDITION__DISPATCH_SUBPROGRAM_ACCESS:
				return getDispatchSubprogramAccess();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BAPackage.DISPATCH_CONDITION__BASE_TRIGGER:
				setBase_Trigger((Trigger)newValue);
				return;
			case BAPackage.DISPATCH_CONDITION__IS_TIMEOUT:
				setIsTimeout((Boolean)newValue);
				return;
			case BAPackage.DISPATCH_CONDITION__DISPATCH_PORT:
				getDispatchPort().clear();
				getDispatchPort().addAll((Collection<? extends EventPort>)newValue);
				return;
			case BAPackage.DISPATCH_CONDITION__DISPATCH_SUBPROGRAM_ACCESS:
				getDispatchSubprogramAccess().clear();
				getDispatchSubprogramAccess().addAll((Collection<? extends SubprogramAccess>)newValue);
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
			case BAPackage.DISPATCH_CONDITION__BASE_TRIGGER:
				setBase_Trigger((Trigger)null);
				return;
			case BAPackage.DISPATCH_CONDITION__IS_TIMEOUT:
				setIsTimeout(IS_TIMEOUT_EDEFAULT);
				return;
			case BAPackage.DISPATCH_CONDITION__DISPATCH_PORT:
				getDispatchPort().clear();
				return;
			case BAPackage.DISPATCH_CONDITION__DISPATCH_SUBPROGRAM_ACCESS:
				getDispatchSubprogramAccess().clear();
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
			case BAPackage.DISPATCH_CONDITION__BASE_TRIGGER:
				return base_Trigger != null;
			case BAPackage.DISPATCH_CONDITION__IS_TIMEOUT:
				return isTimeout() != IS_TIMEOUT_EDEFAULT;
			case BAPackage.DISPATCH_CONDITION__DISPATCH_PORT:
				return !getDispatchPort().isEmpty();
			case BAPackage.DISPATCH_CONDITION__DISPATCH_SUBPROGRAM_ACCESS:
				return !getDispatchSubprogramAccess().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DispatchConditionImpl
