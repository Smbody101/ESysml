/**
 */
package NEsysml.Aadl.impl;

import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.CallSequence;
import NEsysml.Aadl.CallSequenceDescribable;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Sequence Describable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.CallSequenceDescribableImpl#getOwnedCallSequence <em>Owned Call Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallSequenceDescribableImpl extends MinimalEObjectImpl.Container implements CallSequenceDescribable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallSequenceDescribableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.CALL_SEQUENCE_DESCRIBABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CallSequence> getOwnedCallSequence() {
		// TODO: implement this method to return the 'Owned Call Sequence' reference list
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
			case AadlPackage.CALL_SEQUENCE_DESCRIBABLE__OWNED_CALL_SEQUENCE:
				return getOwnedCallSequence();
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
			case AadlPackage.CALL_SEQUENCE_DESCRIBABLE__OWNED_CALL_SEQUENCE:
				getOwnedCallSequence().clear();
				getOwnedCallSequence().addAll((Collection<? extends CallSequence>)newValue);
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
			case AadlPackage.CALL_SEQUENCE_DESCRIBABLE__OWNED_CALL_SEQUENCE:
				getOwnedCallSequence().clear();
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
			case AadlPackage.CALL_SEQUENCE_DESCRIBABLE__OWNED_CALL_SEQUENCE:
				return !getOwnedCallSequence().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CallSequenceDescribableImpl
