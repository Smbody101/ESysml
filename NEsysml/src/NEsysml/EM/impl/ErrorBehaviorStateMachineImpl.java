/**
 */
package NEsysml.EM.impl;

import NEsysml.AadlUtil;
import NEsysml.EM.EMPackage;
import NEsysml.EM.ErrorBehaviorStateMachine;
import NEsysml.EM.ErrorModelLibrary;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Behavior State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.impl.ErrorBehaviorStateMachineImpl#getInPackage <em>In Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorBehaviorStateMachineImpl extends ErrorBehaviorImpl implements ErrorBehaviorStateMachine {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorBehaviorStateMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMPackage.Literals.ERROR_BEHAVIOR_STATE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorModelLibrary getInPackage() {
		ErrorModelLibrary inPackage = basicGetInPackage();
		return inPackage != null && inPackage.eIsProxy() ? (ErrorModelLibrary)eResolveProxy((InternalEObject)inPackage) : inPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ErrorModelLibrary basicGetInPackage() {
		// TODO: implement this method to return the 'In Package' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		if(this.getBase_StateMachine() == null)
			return null;
		if(AadlUtil.eINSTANCE.isStereotypedBy(this.getBase_StateMachine().getPackage(), EMPackage.Literals.ERROR_MODEL_LIBRARY))
			return (ErrorModelLibrary) AadlUtil.eINSTANCE.getStereotypeApplication(this.getBase_StateMachine().getPackage(), EMPackage.Literals.ERROR_MODEL_LIBRARY);
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInPackage(ErrorModelLibrary newInPackage) {
		// TODO: implement this method to set the 'In Package' reference
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
			case EMPackage.ERROR_BEHAVIOR_STATE_MACHINE__IN_PACKAGE:
				if (resolve) return getInPackage();
				return basicGetInPackage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EMPackage.ERROR_BEHAVIOR_STATE_MACHINE__IN_PACKAGE:
				setInPackage((ErrorModelLibrary)newValue);
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
			case EMPackage.ERROR_BEHAVIOR_STATE_MACHINE__IN_PACKAGE:
				setInPackage((ErrorModelLibrary)null);
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
			case EMPackage.ERROR_BEHAVIOR_STATE_MACHINE__IN_PACKAGE:
				return basicGetInPackage() != null;
		}
		return super.eIsSet(featureID);
	}

} //ErrorBehaviorStateMachineImpl
