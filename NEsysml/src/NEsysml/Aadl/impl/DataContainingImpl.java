/**
 */
package NEsysml.Aadl.impl;

import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.DataContaining;
import NEsysml.Aadl.DataSubcomponent;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Containing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.DataContainingImpl#getOwnedDataSubcomponent <em>Owned Data Subcomponent</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DataContainingImpl extends MinimalEObjectImpl.Container implements DataContaining {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataContainingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.DATA_CONTAINING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSubcomponent> getOwnedDataSubcomponent() {
		// TODO: implement this method to return the 'Owned Data Subcomponent' reference list
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
			case AadlPackage.DATA_CONTAINING__OWNED_DATA_SUBCOMPONENT:
				return getOwnedDataSubcomponent();
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
			case AadlPackage.DATA_CONTAINING__OWNED_DATA_SUBCOMPONENT:
				getOwnedDataSubcomponent().clear();
				getOwnedDataSubcomponent().addAll((Collection<? extends DataSubcomponent>)newValue);
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
			case AadlPackage.DATA_CONTAINING__OWNED_DATA_SUBCOMPONENT:
				getOwnedDataSubcomponent().clear();
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
			case AadlPackage.DATA_CONTAINING__OWNED_DATA_SUBCOMPONENT:
				return !getOwnedDataSubcomponent().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataContainingImpl
