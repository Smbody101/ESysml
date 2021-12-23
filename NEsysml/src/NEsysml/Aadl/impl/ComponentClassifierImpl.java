/**
 */
package NEsysml.Aadl.impl;

import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.ComponentClassifier;
import NEsysml.Aadl.SubprogramImplementation;
import NEsysml.Aadl.SubprogramType;
import NEsysml.EM.ErrorModelSubclause;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.papyrus.sysml14.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.ComponentClassifierImpl#getOwnedErrorModel <em>Owned Error Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentClassifierImpl extends ClassifierImpl implements ComponentClassifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.COMPONENT_CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorModelSubclause getOwnedErrorModel() {
		ErrorModelSubclause ownedErrorModel = basicGetOwnedErrorModel();
		return ownedErrorModel != null && ownedErrorModel.eIsProxy() ? (ErrorModelSubclause)eResolveProxy((InternalEObject)ownedErrorModel) : ownedErrorModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ErrorModelSubclause basicGetOwnedErrorModel() {
		// TODO: implement this method to return the 'Owned Error Model' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		if(this instanceof Block) {
			for(EObject object : ((Block)this).getBase_Class().getStereotypeApplications())
				if(object instanceof ErrorModelSubclause)
					return (ErrorModelSubclause) object;
		}else if(this instanceof SubprogramType) {
			for(EObject object : ((SubprogramType)this).getBase_Activity().getStereotypeApplications())
				if(object instanceof ErrorModelSubclause)
					return (ErrorModelSubclause) object;
		}else if(this instanceof SubprogramImplementation) {
			for(EObject object : ((SubprogramImplementation)this).getBase_Activity().getStereotypeApplications())
				if(object instanceof ErrorModelSubclause)
					return (ErrorModelSubclause) object;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedErrorModel(ErrorModelSubclause newOwnedErrorModel) {
		// TODO: implement this method to set the 'Owned Error Model' reference
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
			case AadlPackage.COMPONENT_CLASSIFIER__OWNED_ERROR_MODEL:
				if (resolve) return getOwnedErrorModel();
				return basicGetOwnedErrorModel();
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
			case AadlPackage.COMPONENT_CLASSIFIER__OWNED_ERROR_MODEL:
				setOwnedErrorModel((ErrorModelSubclause)newValue);
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
			case AadlPackage.COMPONENT_CLASSIFIER__OWNED_ERROR_MODEL:
				setOwnedErrorModel((ErrorModelSubclause)null);
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
			case AadlPackage.COMPONENT_CLASSIFIER__OWNED_ERROR_MODEL:
				return basicGetOwnedErrorModel() != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentClassifierImpl
