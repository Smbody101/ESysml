/**
 */
package NEsysml.Aadl.impl;

import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.MemoryContaining;
import NEsysml.Aadl.MemorySubcomponent;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Containing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.MemoryContainingImpl#getOwnedMemorySubcomponent <em>Owned Memory Subcomponent</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MemoryContainingImpl extends MinimalEObjectImpl.Container implements MemoryContaining {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryContainingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.MEMORY_CONTAINING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MemorySubcomponent> getOwnedMemorySubcomponent() {
		// TODO: implement this method to return the 'Owned Memory Subcomponent' reference list
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
			case AadlPackage.MEMORY_CONTAINING__OWNED_MEMORY_SUBCOMPONENT:
				return getOwnedMemorySubcomponent();
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
			case AadlPackage.MEMORY_CONTAINING__OWNED_MEMORY_SUBCOMPONENT:
				getOwnedMemorySubcomponent().clear();
				getOwnedMemorySubcomponent().addAll((Collection<? extends MemorySubcomponent>)newValue);
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
			case AadlPackage.MEMORY_CONTAINING__OWNED_MEMORY_SUBCOMPONENT:
				getOwnedMemorySubcomponent().clear();
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
			case AadlPackage.MEMORY_CONTAINING__OWNED_MEMORY_SUBCOMPONENT:
				return !getOwnedMemorySubcomponent().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MemoryContainingImpl
