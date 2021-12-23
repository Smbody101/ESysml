/**
 */
package NEsysml.EM.impl;

import NEsysml.EM.EMPackage;
import NEsysml.EM.ErrorEvent;
import NEsysml.EM.ErrorEventTrigger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Event Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.impl.ErrorEventTriggerImpl#getErrorEvent <em>Error Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorEventTriggerImpl extends ErrorTransitionTriggerImpl implements ErrorEventTrigger {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorEventTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMPackage.Literals.ERROR_EVENT_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorEvent getErrorEvent() {
		ErrorEvent errorEvent = basicGetErrorEvent();
		return errorEvent != null && errorEvent.eIsProxy() ? (ErrorEvent)eResolveProxy((InternalEObject)errorEvent) : errorEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ErrorEvent basicGetErrorEvent() {
		// TODO: implement this method to return the 'Error Event' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		if(this.getBase_Trigger() == null)
			return null;
		if(this.getBase_Trigger().getEvent() != null)
			for(EObject object : this.getBase_Trigger().getEvent().getStereotypeApplications())
				if(object instanceof ErrorEvent)
					return (ErrorEvent) object;
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorEvent(ErrorEvent newErrorEvent) {
		// TODO: implement this method to set the 'Error Event' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EMPackage.ERROR_EVENT_TRIGGER__ERROR_EVENT:
				if (resolve) return getErrorEvent();
				return basicGetErrorEvent();
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
			case EMPackage.ERROR_EVENT_TRIGGER__ERROR_EVENT:
				setErrorEvent((ErrorEvent)newValue);
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
			case EMPackage.ERROR_EVENT_TRIGGER__ERROR_EVENT:
				setErrorEvent((ErrorEvent)null);
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
			case EMPackage.ERROR_EVENT_TRIGGER__ERROR_EVENT:
				return basicGetErrorEvent() != null;
		}
		return super.eIsSet(featureID);
	}

} //ErrorEventTriggerImpl
