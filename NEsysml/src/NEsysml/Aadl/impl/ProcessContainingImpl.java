/**
 */
package NEsysml.Aadl.impl;

import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.ProcessContaining;
import NEsysml.Aadl.ProcessSubcomponent;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Containing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.ProcessContainingImpl#getOwnedProcessSubcomponent <em>Owned Process Subcomponent</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ProcessContainingImpl extends MinimalEObjectImpl.Container implements ProcessContaining {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessContainingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.PROCESS_CONTAINING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessSubcomponent> getOwnedProcessSubcomponent() {
		// TODO: implement this method to return the 'Owned Process Subcomponent' reference list
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
			case AadlPackage.PROCESS_CONTAINING__OWNED_PROCESS_SUBCOMPONENT:
				return getOwnedProcessSubcomponent();
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
			case AadlPackage.PROCESS_CONTAINING__OWNED_PROCESS_SUBCOMPONENT:
				getOwnedProcessSubcomponent().clear();
				getOwnedProcessSubcomponent().addAll((Collection<? extends ProcessSubcomponent>)newValue);
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
			case AadlPackage.PROCESS_CONTAINING__OWNED_PROCESS_SUBCOMPONENT:
				getOwnedProcessSubcomponent().clear();
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
			case AadlPackage.PROCESS_CONTAINING__OWNED_PROCESS_SUBCOMPONENT:
				return !getOwnedProcessSubcomponent().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcessContainingImpl
