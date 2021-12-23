/**
 */
package NEsysml.Aadl.impl;

import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.DeviceContaining;
import NEsysml.Aadl.DeviceSubcomponent;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Containing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.DeviceContainingImpl#getOwnedDeviceSubcomponent <em>Owned Device Subcomponent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceContainingImpl extends MinimalEObjectImpl.Container implements DeviceContaining {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceContainingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.DEVICE_CONTAINING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceSubcomponent> getOwnedDeviceSubcomponent() {
		// TODO: implement this method to return the 'Owned Device Subcomponent' reference list
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
			case AadlPackage.DEVICE_CONTAINING__OWNED_DEVICE_SUBCOMPONENT:
				return getOwnedDeviceSubcomponent();
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
			case AadlPackage.DEVICE_CONTAINING__OWNED_DEVICE_SUBCOMPONENT:
				getOwnedDeviceSubcomponent().clear();
				getOwnedDeviceSubcomponent().addAll((Collection<? extends DeviceSubcomponent>)newValue);
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
			case AadlPackage.DEVICE_CONTAINING__OWNED_DEVICE_SUBCOMPONENT:
				getOwnedDeviceSubcomponent().clear();
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
			case AadlPackage.DEVICE_CONTAINING__OWNED_DEVICE_SUBCOMPONENT:
				return !getOwnedDeviceSubcomponent().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeviceContainingImpl
