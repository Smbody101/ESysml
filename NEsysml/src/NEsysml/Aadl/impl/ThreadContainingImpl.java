/**
 */
package NEsysml.Aadl.impl;

import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.ThreadContaining;
import NEsysml.Aadl.ThreadSubcomponent;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thread Containing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.ThreadContainingImpl#getOwnedThreadSubcomponent <em>Owned Thread Subcomponent</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ThreadContainingImpl extends MinimalEObjectImpl.Container implements ThreadContaining {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreadContainingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.THREAD_CONTAINING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThreadSubcomponent> getOwnedThreadSubcomponent() {
		// TODO: implement this method to return the 'Owned Thread Subcomponent' reference list
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
			case AadlPackage.THREAD_CONTAINING__OWNED_THREAD_SUBCOMPONENT:
				return getOwnedThreadSubcomponent();
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
			case AadlPackage.THREAD_CONTAINING__OWNED_THREAD_SUBCOMPONENT:
				getOwnedThreadSubcomponent().clear();
				getOwnedThreadSubcomponent().addAll((Collection<? extends ThreadSubcomponent>)newValue);
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
			case AadlPackage.THREAD_CONTAINING__OWNED_THREAD_SUBCOMPONENT:
				getOwnedThreadSubcomponent().clear();
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
			case AadlPackage.THREAD_CONTAINING__OWNED_THREAD_SUBCOMPONENT:
				return !getOwnedThreadSubcomponent().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ThreadContainingImpl
