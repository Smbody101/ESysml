/**
 */
package NEsysml.Aadl.impl;

import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.ProcessorContaining;
import NEsysml.Aadl.ProcessorSubcomponent;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processor Containing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.ProcessorContainingImpl#getOwnedProcessorSubcomponent <em>Owned Processor Subcomponent</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ProcessorContainingImpl extends MinimalEObjectImpl.Container implements ProcessorContaining {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessorContainingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.PROCESSOR_CONTAINING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessorSubcomponent> getOwnedProcessorSubcomponent() {
		// TODO: implement this method to return the 'Owned Processor Subcomponent' reference list
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
			case AadlPackage.PROCESSOR_CONTAINING__OWNED_PROCESSOR_SUBCOMPONENT:
				return getOwnedProcessorSubcomponent();
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
			case AadlPackage.PROCESSOR_CONTAINING__OWNED_PROCESSOR_SUBCOMPONENT:
				getOwnedProcessorSubcomponent().clear();
				getOwnedProcessorSubcomponent().addAll((Collection<? extends ProcessorSubcomponent>)newValue);
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
			case AadlPackage.PROCESSOR_CONTAINING__OWNED_PROCESSOR_SUBCOMPONENT:
				getOwnedProcessorSubcomponent().clear();
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
			case AadlPackage.PROCESSOR_CONTAINING__OWNED_PROCESSOR_SUBCOMPONENT:
				return !getOwnedProcessorSubcomponent().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcessorContainingImpl
