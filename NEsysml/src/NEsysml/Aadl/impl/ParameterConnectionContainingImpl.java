/**
 */
package NEsysml.Aadl.impl;

import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.ParameterConnection;
import NEsysml.Aadl.ParameterConnectionContaining;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Connection Containing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.ParameterConnectionContainingImpl#getOwnedParameterConnection <em>Owned Parameter Connection</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ParameterConnectionContainingImpl extends MinimalEObjectImpl.Container implements ParameterConnectionContaining {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterConnectionContainingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.PARAMETER_CONNECTION_CONTAINING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterConnection> getOwnedParameterConnection() {
		// TODO: implement this method to return the 'Owned Parameter Connection' reference list
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
			case AadlPackage.PARAMETER_CONNECTION_CONTAINING__OWNED_PARAMETER_CONNECTION:
				return getOwnedParameterConnection();
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
			case AadlPackage.PARAMETER_CONNECTION_CONTAINING__OWNED_PARAMETER_CONNECTION:
				getOwnedParameterConnection().clear();
				getOwnedParameterConnection().addAll((Collection<? extends ParameterConnection>)newValue);
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
			case AadlPackage.PARAMETER_CONNECTION_CONTAINING__OWNED_PARAMETER_CONNECTION:
				getOwnedParameterConnection().clear();
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
			case AadlPackage.PARAMETER_CONNECTION_CONTAINING__OWNED_PARAMETER_CONNECTION:
				return !getOwnedParameterConnection().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ParameterConnectionContainingImpl
