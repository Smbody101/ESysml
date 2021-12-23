/**
 */
package NEsysml.Aadl.impl;

import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.SystemContaining;
import NEsysml.Aadl.SystemSubcomponent;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Containing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.SystemContainingImpl#getOwnedSystemSubcomponent <em>Owned System Subcomponent</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SystemContainingImpl extends MinimalEObjectImpl.Container implements SystemContaining {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemContainingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.SYSTEM_CONTAINING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemSubcomponent> getOwnedSystemSubcomponent() {
		// TODO: implement this method to return the 'Owned System Subcomponent' reference list
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
			case AadlPackage.SYSTEM_CONTAINING__OWNED_SYSTEM_SUBCOMPONENT:
				return getOwnedSystemSubcomponent();
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
			case AadlPackage.SYSTEM_CONTAINING__OWNED_SYSTEM_SUBCOMPONENT:
				getOwnedSystemSubcomponent().clear();
				getOwnedSystemSubcomponent().addAll((Collection<? extends SystemSubcomponent>)newValue);
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
			case AadlPackage.SYSTEM_CONTAINING__OWNED_SYSTEM_SUBCOMPONENT:
				getOwnedSystemSubcomponent().clear();
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
			case AadlPackage.SYSTEM_CONTAINING__OWNED_SYSTEM_SUBCOMPONENT:
				return !getOwnedSystemSubcomponent().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemContainingImpl
