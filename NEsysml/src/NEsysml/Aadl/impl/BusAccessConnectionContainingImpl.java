/**
 */
package NEsysml.Aadl.impl;

import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.BusAccessConnectionContaining;
import NEsysml.Aadl.BusConnection;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bus Access Connection Containing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.BusAccessConnectionContainingImpl#getOwnedBusConnection <em>Owned Bus Connection</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BusAccessConnectionContainingImpl extends MinimalEObjectImpl.Container implements BusAccessConnectionContaining {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusAccessConnectionContainingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.BUS_ACCESS_CONNECTION_CONTAINING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusConnection> getOwnedBusConnection() {
		// TODO: implement this method to return the 'Owned Bus Connection' reference list
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
			case AadlPackage.BUS_ACCESS_CONNECTION_CONTAINING__OWNED_BUS_CONNECTION:
				return getOwnedBusConnection();
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
			case AadlPackage.BUS_ACCESS_CONNECTION_CONTAINING__OWNED_BUS_CONNECTION:
				getOwnedBusConnection().clear();
				getOwnedBusConnection().addAll((Collection<? extends BusConnection>)newValue);
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
			case AadlPackage.BUS_ACCESS_CONNECTION_CONTAINING__OWNED_BUS_CONNECTION:
				getOwnedBusConnection().clear();
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
			case AadlPackage.BUS_ACCESS_CONNECTION_CONTAINING__OWNED_BUS_CONNECTION:
				return !getOwnedBusConnection().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BusAccessConnectionContainingImpl
