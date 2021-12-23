/**
 */
package NEsysml.Aadl.impl;

import NEsysml.AadlUtil;
import NEsysml.EM.ErrorModelSubclause;
import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.Annex;
import NEsysml.Aadl.AnnexContaining;
import NEsysml.Aadl.BusAccess;
import NEsysml.Aadl.BusAccessContaining;
import NEsysml.Aadl.Classifier;
import NEsysml.Aadl.ComponentClassifier;
import NEsysml.Aadl.ComponentType;
import NEsysml.Aadl.DeviceClassifier;
import NEsysml.Aadl.DeviceType;
import NEsysml.Aadl.ModeAvailable;
import NEsysml.Aadl.ModeStateMachine;
import NEsysml.Aadl.PlatformClassifier;
import NEsysml.Aadl.Port;
import NEsysml.Aadl.PortContaining;
import NEsysml.Aadl.SubprogramAccess;
import NEsysml.Aadl.SubprogramAccessContaining;

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
 * An implementation of the model object '<em><b>Device Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.DeviceTypeImpl#getOwnedErrorModel <em>Owned Error Model</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.DeviceTypeImpl#getExtended <em>Extended</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.DeviceTypeImpl#getOwnedAnnex <em>Owned Annex</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.DeviceTypeImpl#getOwnedBusAccess <em>Owned Bus Access</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.DeviceTypeImpl#getOwnedMode <em>Owned Mode</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.DeviceTypeImpl#getOwnedport <em>Ownedport</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.DeviceTypeImpl#getOwnedSubprogramAccess <em>Owned Subprogram Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceTypeImpl extends BlockImpl implements DeviceType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.DEVICE_TYPE;
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
	 * @generated NOT
	 */
	public EList<BusAccess> getOwnedBusAccess() {
		// TODO: implement this method to return the 'Owned Bus Access' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<BusAccess> list = new BasicEList<BusAccess>();
		for(org.eclipse.uml2.uml.Port port : this.getBase_Class().getOwnedPorts())
			for(EObject object : port.getStereotypeApplications())
				if(object instanceof BusAccess)
					list.add((BusAccess) object);
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
				return (ComponentType) AadlUtil.eINSTANCE.getStereotypeApplication(g.getGeneral(), AadlPackage.Literals.DEVICE_TYPE);
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
	 * @generated NOT
	 */
	public EList<SubprogramAccess> getOwnedSubprogramAccess() {
		// TODO: implement this method to return the 'Owned Subprogram Access' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<SubprogramAccess> list = new BasicEList<SubprogramAccess>();
		for(org.eclipse.uml2.uml.Port port : this.getBase_Class().getOwnedPorts())
			for(EObject object : port.getStereotypeApplications())
				if(object instanceof SubprogramAccess)
					list.add((SubprogramAccess) object);
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AadlPackage.DEVICE_TYPE__OWNED_ERROR_MODEL:
				if (resolve) return getOwnedErrorModel();
				return basicGetOwnedErrorModel();
			case AadlPackage.DEVICE_TYPE__EXTENDED:
				if (resolve) return getExtended();
				return basicGetExtended();
			case AadlPackage.DEVICE_TYPE__OWNED_ANNEX:
				return getOwnedAnnex();
			case AadlPackage.DEVICE_TYPE__OWNED_BUS_ACCESS:
				return getOwnedBusAccess();
			case AadlPackage.DEVICE_TYPE__OWNED_MODE:
				if (resolve) return getOwnedMode();
				return basicGetOwnedMode();
			case AadlPackage.DEVICE_TYPE__OWNEDPORT:
				return getOwnedport();
			case AadlPackage.DEVICE_TYPE__OWNED_SUBPROGRAM_ACCESS:
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
			case AadlPackage.DEVICE_TYPE__OWNED_ERROR_MODEL:
				setOwnedErrorModel((ErrorModelSubclause)newValue);
				return;
			case AadlPackage.DEVICE_TYPE__EXTENDED:
				setExtended((ComponentType)newValue);
				return;
			case AadlPackage.DEVICE_TYPE__OWNED_ANNEX:
				getOwnedAnnex().clear();
				getOwnedAnnex().addAll((Collection<? extends Annex>)newValue);
				return;
			case AadlPackage.DEVICE_TYPE__OWNED_BUS_ACCESS:
				getOwnedBusAccess().clear();
				getOwnedBusAccess().addAll((Collection<? extends BusAccess>)newValue);
				return;
			case AadlPackage.DEVICE_TYPE__OWNED_MODE:
				setOwnedMode((ModeStateMachine)newValue);
				return;
			case AadlPackage.DEVICE_TYPE__OWNEDPORT:
				getOwnedport().clear();
				getOwnedport().addAll((Collection<? extends Port>)newValue);
				return;
			case AadlPackage.DEVICE_TYPE__OWNED_SUBPROGRAM_ACCESS:
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
			case AadlPackage.DEVICE_TYPE__OWNED_ERROR_MODEL:
				setOwnedErrorModel((ErrorModelSubclause)null);
				return;
			case AadlPackage.DEVICE_TYPE__EXTENDED:
				setExtended((ComponentType)null);
				return;
			case AadlPackage.DEVICE_TYPE__OWNED_ANNEX:
				getOwnedAnnex().clear();
				return;
			case AadlPackage.DEVICE_TYPE__OWNED_BUS_ACCESS:
				getOwnedBusAccess().clear();
				return;
			case AadlPackage.DEVICE_TYPE__OWNED_MODE:
				setOwnedMode((ModeStateMachine)null);
				return;
			case AadlPackage.DEVICE_TYPE__OWNEDPORT:
				getOwnedport().clear();
				return;
			case AadlPackage.DEVICE_TYPE__OWNED_SUBPROGRAM_ACCESS:
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
			case AadlPackage.DEVICE_TYPE__OWNED_ERROR_MODEL:
				return basicGetOwnedErrorModel() != null;
			case AadlPackage.DEVICE_TYPE__EXTENDED:
				return basicGetExtended() != null;
			case AadlPackage.DEVICE_TYPE__OWNED_ANNEX:
				return !getOwnedAnnex().isEmpty();
			case AadlPackage.DEVICE_TYPE__OWNED_BUS_ACCESS:
				return !getOwnedBusAccess().isEmpty();
			case AadlPackage.DEVICE_TYPE__OWNED_MODE:
				return basicGetOwnedMode() != null;
			case AadlPackage.DEVICE_TYPE__OWNEDPORT:
				return !getOwnedport().isEmpty();
			case AadlPackage.DEVICE_TYPE__OWNED_SUBPROGRAM_ACCESS:
				return !getOwnedSubprogramAccess().isEmpty();
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
				case AadlPackage.DEVICE_TYPE__OWNED_ERROR_MODEL: return AadlPackage.COMPONENT_CLASSIFIER__OWNED_ERROR_MODEL;
				default: return -1;
			}
		}
		if (baseClass == ComponentType.class) {
			switch (derivedFeatureID) {
				case AadlPackage.DEVICE_TYPE__EXTENDED: return AadlPackage.COMPONENT_TYPE__EXTENDED;
				default: return -1;
			}
		}
		if (baseClass == AnnexContaining.class) {
			switch (derivedFeatureID) {
				case AadlPackage.DEVICE_TYPE__OWNED_ANNEX: return AadlPackage.ANNEX_CONTAINING__OWNED_ANNEX;
				default: return -1;
			}
		}
		if (baseClass == BusAccessContaining.class) {
			switch (derivedFeatureID) {
				case AadlPackage.DEVICE_TYPE__OWNED_BUS_ACCESS: return AadlPackage.BUS_ACCESS_CONTAINING__OWNED_BUS_ACCESS;
				default: return -1;
			}
		}
		if (baseClass == ModeAvailable.class) {
			switch (derivedFeatureID) {
				case AadlPackage.DEVICE_TYPE__OWNED_MODE: return AadlPackage.MODE_AVAILABLE__OWNED_MODE;
				default: return -1;
			}
		}
		if (baseClass == PlatformClassifier.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DeviceClassifier.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PortContaining.class) {
			switch (derivedFeatureID) {
				case AadlPackage.DEVICE_TYPE__OWNEDPORT: return AadlPackage.PORT_CONTAINING__OWNEDPORT;
				default: return -1;
			}
		}
		if (baseClass == SubprogramAccessContaining.class) {
			switch (derivedFeatureID) {
				case AadlPackage.DEVICE_TYPE__OWNED_SUBPROGRAM_ACCESS: return AadlPackage.SUBPROGRAM_ACCESS_CONTAINING__OWNED_SUBPROGRAM_ACCESS;
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
				case AadlPackage.COMPONENT_CLASSIFIER__OWNED_ERROR_MODEL: return AadlPackage.DEVICE_TYPE__OWNED_ERROR_MODEL;
				default: return -1;
			}
		}
		if (baseClass == ComponentType.class) {
			switch (baseFeatureID) {
				case AadlPackage.COMPONENT_TYPE__EXTENDED: return AadlPackage.DEVICE_TYPE__EXTENDED;
				default: return -1;
			}
		}
		if (baseClass == AnnexContaining.class) {
			switch (baseFeatureID) {
				case AadlPackage.ANNEX_CONTAINING__OWNED_ANNEX: return AadlPackage.DEVICE_TYPE__OWNED_ANNEX;
				default: return -1;
			}
		}
		if (baseClass == BusAccessContaining.class) {
			switch (baseFeatureID) {
				case AadlPackage.BUS_ACCESS_CONTAINING__OWNED_BUS_ACCESS: return AadlPackage.DEVICE_TYPE__OWNED_BUS_ACCESS;
				default: return -1;
			}
		}
		if (baseClass == ModeAvailable.class) {
			switch (baseFeatureID) {
				case AadlPackage.MODE_AVAILABLE__OWNED_MODE: return AadlPackage.DEVICE_TYPE__OWNED_MODE;
				default: return -1;
			}
		}
		if (baseClass == PlatformClassifier.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DeviceClassifier.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PortContaining.class) {
			switch (baseFeatureID) {
				case AadlPackage.PORT_CONTAINING__OWNEDPORT: return AadlPackage.DEVICE_TYPE__OWNEDPORT;
				default: return -1;
			}
		}
		if (baseClass == SubprogramAccessContaining.class) {
			switch (baseFeatureID) {
				case AadlPackage.SUBPROGRAM_ACCESS_CONTAINING__OWNED_SUBPROGRAM_ACCESS: return AadlPackage.DEVICE_TYPE__OWNED_SUBPROGRAM_ACCESS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DeviceTypeImpl
