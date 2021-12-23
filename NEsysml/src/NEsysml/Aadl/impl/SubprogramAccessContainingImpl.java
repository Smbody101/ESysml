/**
 */
package NEsysml.Aadl.impl;

import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.SubprogramAccess;
import NEsysml.Aadl.SubprogramAccessContaining;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subprogram Access Containing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.SubprogramAccessContainingImpl#getOwnedSubprogramAccess <em>Owned Subprogram Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SubprogramAccessContainingImpl extends MinimalEObjectImpl.Container implements SubprogramAccessContaining {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubprogramAccessContainingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.SUBPROGRAM_ACCESS_CONTAINING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubprogramAccess> getOwnedSubprogramAccess() {
		// TODO: implement this method to return the 'Owned Subprogram Access' reference list
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
			case AadlPackage.SUBPROGRAM_ACCESS_CONTAINING__OWNED_SUBPROGRAM_ACCESS:
				return getOwnedSubprogramAccess();
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
			case AadlPackage.SUBPROGRAM_ACCESS_CONTAINING__OWNED_SUBPROGRAM_ACCESS:
				getOwnedSubprogramAccess().clear();
				getOwnedSubprogramAccess().addAll((Collection<? extends SubprogramAccess>)newValue);
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
			case AadlPackage.SUBPROGRAM_ACCESS_CONTAINING__OWNED_SUBPROGRAM_ACCESS:
				getOwnedSubprogramAccess().clear();
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
			case AadlPackage.SUBPROGRAM_ACCESS_CONTAINING__OWNED_SUBPROGRAM_ACCESS:
				return !getOwnedSubprogramAccess().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubprogramAccessContainingImpl
