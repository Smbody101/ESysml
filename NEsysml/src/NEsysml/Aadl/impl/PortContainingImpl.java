/**
 */
package NEsysml.Aadl.impl;

import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.Port;
import NEsysml.Aadl.PortContaining;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Containing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.PortContainingImpl#getOwnedport <em>Ownedport</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PortContainingImpl extends MinimalEObjectImpl.Container implements PortContaining {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortContainingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.PORT_CONTAINING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getOwnedport() {
		// TODO: implement this method to return the 'Ownedport' reference list
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
			case AadlPackage.PORT_CONTAINING__OWNEDPORT:
				return getOwnedport();
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
			case AadlPackage.PORT_CONTAINING__OWNEDPORT:
				getOwnedport().clear();
				getOwnedport().addAll((Collection<? extends Port>)newValue);
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
			case AadlPackage.PORT_CONTAINING__OWNEDPORT:
				getOwnedport().clear();
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
			case AadlPackage.PORT_CONTAINING__OWNEDPORT:
				return !getOwnedport().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PortContainingImpl
