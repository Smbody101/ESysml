/**
 */
package NEsysml.Aadl.impl;

import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.PortConnection;
import NEsysml.Aadl.PortConnectionContaining;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Connection Containing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.PortConnectionContainingImpl#getOwnedPortConnection <em>Owned Port Connection</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PortConnectionContainingImpl extends MinimalEObjectImpl.Container implements PortConnectionContaining {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortConnectionContainingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.PORT_CONNECTION_CONTAINING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortConnection> getOwnedPortConnection() {
		// TODO: implement this method to return the 'Owned Port Connection' reference list
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
			case AadlPackage.PORT_CONNECTION_CONTAINING__OWNED_PORT_CONNECTION:
				return getOwnedPortConnection();
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
			case AadlPackage.PORT_CONNECTION_CONTAINING__OWNED_PORT_CONNECTION:
				getOwnedPortConnection().clear();
				getOwnedPortConnection().addAll((Collection<? extends PortConnection>)newValue);
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
			case AadlPackage.PORT_CONNECTION_CONTAINING__OWNED_PORT_CONNECTION:
				getOwnedPortConnection().clear();
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
			case AadlPackage.PORT_CONNECTION_CONTAINING__OWNED_PORT_CONNECTION:
				return !getOwnedPortConnection().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PortConnectionContainingImpl
