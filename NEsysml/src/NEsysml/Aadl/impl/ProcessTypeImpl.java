/**
 */
package NEsysml.Aadl.impl;

import NEsysml.AadlUtil;
import NEsysml.EM.ErrorModelSubclause;
import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.Annex;
import NEsysml.Aadl.AnnexContaining;
import NEsysml.Aadl.Classifier;
import NEsysml.Aadl.ComponentClassifier;
import NEsysml.Aadl.ComponentType;
import NEsysml.Aadl.DataAccess;
import NEsysml.Aadl.DataAccessContaining;
import NEsysml.Aadl.ModeAvailable;
import NEsysml.Aadl.ModeStateMachine;
import NEsysml.Aadl.Port;
import NEsysml.Aadl.PortContaining;
import NEsysml.Aadl.ProcessClassifier;
import NEsysml.Aadl.ProcessType;
import NEsysml.Aadl.SoftwareClassifier;

import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.papyrus.sysml14.blocks.internal.impl.BlockImpl;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.ProcessTypeImpl#getOwnedErrorModel <em>Owned Error Model</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.ProcessTypeImpl#getExtended <em>Extended</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.ProcessTypeImpl#getOwnedAnnex <em>Owned Annex</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.ProcessTypeImpl#getOwnedDataAccess <em>Owned Data Access</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.ProcessTypeImpl#getOwnedport <em>Ownedport</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.ProcessTypeImpl#getOwnedMode <em>Owned Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessTypeImpl extends BlockImpl implements ProcessType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.PROCESS_TYPE;
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
		for(EObject object : this.getBase_Class().getStereotypeApplications())
			if(object instanceof ErrorModelSubclause)
				return (ErrorModelSubclause) object;
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
	 * @generated NOT
	 */
	public EList<Annex> getOwnedAnnex() {
		// TODO: implement this method to return the 'Owned Annex' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<Annex> list = new BasicEList<Annex>();
		for(Element element : this.getBase_Class().getOwnedElements()){
			for(EObject object : element.getStereotypeApplications())
				if(object instanceof Annex)
					list.add((Annex) object);
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType getExtended() {
		ComponentType extended = basicGetExtended();
		return extended != null && extended.eIsProxy() ? (ComponentType)eResolveProxy((InternalEObject)extended) : extended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ComponentType basicGetExtended() {
		// TODO: implement this method to return the 'Extended' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		EList<Generalization> generalizations = this.getBase_Class().getGeneralizations();
		for(Generalization g : generalizations)
			if(AadlUtil.eINSTANCE.isStereotypedBy(g, AadlPackage.Literals.EXTENSION))
				return (ComponentType) AadlUtil.eINSTANCE.getStereotypeApplication(g.getGeneral(), AadlPackage.Literals.PROCESS_TYPE);
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtended(ComponentType newExtended) {
		// TODO: implement this method to set the 'Extended' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<DataAccess> getOwnedDataAccess() {
		// TODO: implement this method to return the 'Owned Data Access' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<DataAccess> list = new BasicEList<DataAccess>();
		for(org.eclipse.uml2.uml.Port port : this.getBase_Class().getOwnedPorts())
			for(EObject object : port.getStereotypeApplications())
				if(object instanceof DataAccess)
					list.add((DataAccess) object);
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Port> getOwnedport() {
		// TODO: implement this method to return the 'Ownedport' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<Port> list = new BasicEList<Port>();
		for(org.eclipse.uml2.uml.Port port : this.getBase_Class().getOwnedPorts())
			for(EObject object : port.getStereotypeApplications())
				if(object instanceof Port)
					list.add((Port) object);
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeStateMachine getOwnedMode() {
		ModeStateMachine ownedMode = basicGetOwnedMode();
		return ownedMode != null && ownedMode.eIsProxy() ? (ModeStateMachine)eResolveProxy((InternalEObject)ownedMode) : ownedMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ModeStateMachine basicGetOwnedMode() {
		// TODO: implement this method to return the 'Owned Mode' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		for(Behavior behavior : this.getBase_Class().getOwnedBehaviors())
			if(AadlUtil.eINSTANCE.isStereotypedBy(behavior, AadlPackage.Literals.MODE_STATE_MACHINE))
				return (ModeStateMachine) AadlUtil.eINSTANCE.getStereotypeApplication(behavior, AadlPackage.Literals.MODE_STATE_MACHINE);
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMode(ModeStateMachine newOwnedMode) {
		// TODO: implement this method to set the 'Owned Mode' reference
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
			case AadlPackage.PROCESS_TYPE__OWNED_ERROR_MODEL:
				if (resolve) return getOwnedErrorModel();
				return basicGetOwnedErrorModel();
			case AadlPackage.PROCESS_TYPE__EXTENDED:
				if (resolve) return getExtended();
				return basicGetExtended();
			case AadlPackage.PROCESS_TYPE__OWNED_ANNEX:
				return getOwnedAnnex();
			case AadlPackage.PROCESS_TYPE__OWNED_DATA_ACCESS:
				return getOwnedDataAccess();
			case AadlPackage.PROCESS_TYPE__OWNEDPORT:
				return getOwnedport();
			case AadlPackage.PROCESS_TYPE__OWNED_MODE:
				if (resolve) return getOwnedMode();
				return basicGetOwnedMode();
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
			case AadlPackage.PROCESS_TYPE__OWNED_ERROR_MODEL:
				setOwnedErrorModel((ErrorModelSubclause)newValue);
				return;
			case AadlPackage.PROCESS_TYPE__EXTENDED:
				setExtended((ComponentType)newValue);
				return;
			case AadlPackage.PROCESS_TYPE__OWNED_ANNEX:
				getOwnedAnnex().clear();
				getOwnedAnnex().addAll((Collection<? extends Annex>)newValue);
				return;
			case AadlPackage.PROCESS_TYPE__OWNED_DATA_ACCESS:
				getOwnedDataAccess().clear();
				getOwnedDataAccess().addAll((Collection<? extends DataAccess>)newValue);
				return;
			case AadlPackage.PROCESS_TYPE__OWNEDPORT:
				getOwnedport().clear();
				getOwnedport().addAll((Collection<? extends Port>)newValue);
				return;
			case AadlPackage.PROCESS_TYPE__OWNED_MODE:
				setOwnedMode((ModeStateMachine)newValue);
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
			case AadlPackage.PROCESS_TYPE__OWNED_ERROR_MODEL:
				setOwnedErrorModel((ErrorModelSubclause)null);
				return;
			case AadlPackage.PROCESS_TYPE__EXTENDED:
				setExtended((ComponentType)null);
				return;
			case AadlPackage.PROCESS_TYPE__OWNED_ANNEX:
				getOwnedAnnex().clear();
				return;
			case AadlPackage.PROCESS_TYPE__OWNED_DATA_ACCESS:
				getOwnedDataAccess().clear();
				return;
			case AadlPackage.PROCESS_TYPE__OWNEDPORT:
				getOwnedport().clear();
				return;
			case AadlPackage.PROCESS_TYPE__OWNED_MODE:
				setOwnedMode((ModeStateMachine)null);
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
			case AadlPackage.PROCESS_TYPE__OWNED_ERROR_MODEL:
				return basicGetOwnedErrorModel() != null;
			case AadlPackage.PROCESS_TYPE__EXTENDED:
				return basicGetExtended() != null;
			case AadlPackage.PROCESS_TYPE__OWNED_ANNEX:
				return !getOwnedAnnex().isEmpty();
			case AadlPackage.PROCESS_TYPE__OWNED_DATA_ACCESS:
				return !getOwnedDataAccess().isEmpty();
			case AadlPackage.PROCESS_TYPE__OWNEDPORT:
				return !getOwnedport().isEmpty();
			case AadlPackage.PROCESS_TYPE__OWNED_MODE:
				return basicGetOwnedMode() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Classifier.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ComponentClassifier.class) {
			switch (derivedFeatureID) {
				case AadlPackage.PROCESS_TYPE__OWNED_ERROR_MODEL: return AadlPackage.COMPONENT_CLASSIFIER__OWNED_ERROR_MODEL;
				default: return -1;
			}
		}
		if (baseClass == ComponentType.class) {
			switch (derivedFeatureID) {
				case AadlPackage.PROCESS_TYPE__EXTENDED: return AadlPackage.COMPONENT_TYPE__EXTENDED;
				default: return -1;
			}
		}
		if (baseClass == AnnexContaining.class) {
			switch (derivedFeatureID) {
				case AadlPackage.PROCESS_TYPE__OWNED_ANNEX: return AadlPackage.ANNEX_CONTAINING__OWNED_ANNEX;
				default: return -1;
			}
		}
		if (baseClass == DataAccessContaining.class) {
			switch (derivedFeatureID) {
				case AadlPackage.PROCESS_TYPE__OWNED_DATA_ACCESS: return AadlPackage.DATA_ACCESS_CONTAINING__OWNED_DATA_ACCESS;
				default: return -1;
			}
		}
		if (baseClass == PortContaining.class) {
			switch (derivedFeatureID) {
				case AadlPackage.PROCESS_TYPE__OWNEDPORT: return AadlPackage.PORT_CONTAINING__OWNEDPORT;
				default: return -1;
			}
		}
		if (baseClass == ModeAvailable.class) {
			switch (derivedFeatureID) {
				case AadlPackage.PROCESS_TYPE__OWNED_MODE: return AadlPackage.MODE_AVAILABLE__OWNED_MODE;
				default: return -1;
			}
		}
		if (baseClass == SoftwareClassifier.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ProcessClassifier.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Classifier.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ComponentClassifier.class) {
			switch (baseFeatureID) {
				case AadlPackage.COMPONENT_CLASSIFIER__OWNED_ERROR_MODEL: return AadlPackage.PROCESS_TYPE__OWNED_ERROR_MODEL;
				default: return -1;
			}
		}
		if (baseClass == ComponentType.class) {
			switch (baseFeatureID) {
				case AadlPackage.COMPONENT_TYPE__EXTENDED: return AadlPackage.PROCESS_TYPE__EXTENDED;
				default: return -1;
			}
		}
		if (baseClass == AnnexContaining.class) {
			switch (baseFeatureID) {
				case AadlPackage.ANNEX_CONTAINING__OWNED_ANNEX: return AadlPackage.PROCESS_TYPE__OWNED_ANNEX;
				default: return -1;
			}
		}
		if (baseClass == DataAccessContaining.class) {
			switch (baseFeatureID) {
				case AadlPackage.DATA_ACCESS_CONTAINING__OWNED_DATA_ACCESS: return AadlPackage.PROCESS_TYPE__OWNED_DATA_ACCESS;
				default: return -1;
			}
		}
		if (baseClass == PortContaining.class) {
			switch (baseFeatureID) {
				case AadlPackage.PORT_CONTAINING__OWNEDPORT: return AadlPackage.PROCESS_TYPE__OWNEDPORT;
				default: return -1;
			}
		}
		if (baseClass == ModeAvailable.class) {
			switch (baseFeatureID) {
				case AadlPackage.MODE_AVAILABLE__OWNED_MODE: return AadlPackage.PROCESS_TYPE__OWNED_MODE;
				default: return -1;
			}
		}
		if (baseClass == SoftwareClassifier.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ProcessClassifier.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ProcessTypeImpl
