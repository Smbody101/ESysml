/**
 */
package NEsysml.Aadl.impl;

import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.ProcessorClassifier;
import NEsysml.Aadl.ProcessorSubcomponent;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processor Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.ProcessorSubcomponentImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessorSubcomponentImpl extends SubcomponentClassifierImpl implements ProcessorSubcomponent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessorSubcomponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.PROCESSOR_SUBCOMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorClassifier getType() {
		ProcessorClassifier type = basicGetType();
		return type != null && type.eIsProxy() ? (ProcessorClassifier)eResolveProxy((InternalEObject)type) : type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ProcessorClassifier basicGetType() {
		// TODO: implement this method to return the 'Type' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		for(EObject object : this.getBase_Property().getType().getStereotypeApplications())
			if(object instanceof ProcessorClassifier)
				return (ProcessorClassifier) object;
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ProcessorClassifier newType) {
		// TODO: implement this method to set the 'Type' reference
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
			case AadlPackage.PROCESSOR_SUBCOMPONENT__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case AadlPackage.PROCESSOR_SUBCOMPONENT__TYPE:
				setType((ProcessorClassifier)newValue);
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
			case AadlPackage.PROCESSOR_SUBCOMPONENT__TYPE:
				setType((ProcessorClassifier)null);
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
			case AadlPackage.PROCESSOR_SUBCOMPONENT__TYPE:
				return basicGetType() != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcessorSubcomponentImpl
