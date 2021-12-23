/**
 */
package NEsysml.Aadl.impl;

import NEsysml.AadlUtil;
import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.Annex;
import NEsysml.Aadl.AnnexContaining;
import NEsysml.Aadl.DataAccess;
import NEsysml.Aadl.DataAccessContaining;
import NEsysml.Aadl.ModeAvailable;
import NEsysml.Aadl.ModeStateMachine;
import NEsysml.Aadl.Parameter;
import NEsysml.Aadl.ParameterContaining;
import NEsysml.Aadl.Port;
import NEsysml.Aadl.PortContaining;
import NEsysml.Aadl.SoftwareClassifier;
import NEsysml.Aadl.SubprogramAccess;
import NEsysml.Aadl.SubprogramAccessContaining;
import NEsysml.Aadl.SubprogramClassifier;
import NEsysml.Aadl.SubprogramInstance;
import NEsysml.Aadl.SubprogramType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subprogram Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.SubprogramTypeImpl#getOwnedAnnex <em>Owned Annex</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.SubprogramTypeImpl#getOwnedDataAccess <em>Owned Data Access</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.SubprogramTypeImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.SubprogramTypeImpl#getOwnedport <em>Ownedport</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.SubprogramTypeImpl#getOwnedSubprogramAccess <em>Owned Subprogram Access</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.SubprogramTypeImpl#getOwnedMode <em>Owned Mode</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.SubprogramTypeImpl#getBase_Activity <em>Base Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubprogramTypeImpl extends ComponentTypeImpl implements SubprogramType {
	/**
	 * The cached value of the '{@link #getBase_Activity() <em>Base Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Activity()
	 * @generated
	 * @ordered
	 */
	protected Activity base_Activity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubprogramTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.SUBPROGRAM_TYPE;
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
		for(Element element : this.getBase_Activity().getOwnedElements()){
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
	public EList<DataAccess> getOwnedDataAccess() {
		// TODO: implement this method to return the 'Owned Data Access' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<DataAccess> list = new BasicEList<DataAccess>();
		for(org.eclipse.uml2.uml.Port port : this.getBase_Activity().getOwnedPorts())
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
	public EList<Parameter> getOwnedParameter() {
		// TODO: implement this method to return the 'Owned Parameter' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<Parameter> list = new BasicEList<Parameter>();
		for(org.eclipse.uml2.uml.Parameter parameter : this.getBase_Activity().getOwnedParameters())
			if(AadlUtil.eINSTANCE.isStereotypedBy(parameter, AadlPackage.Literals.PARAMETER))
				list.add((Parameter) AadlUtil.eINSTANCE.getStereotypeApplication(parameter, AadlPackage.Literals.PARAMETER));
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
		for(org.eclipse.uml2.uml.Port port : this.getBase_Activity().getOwnedPorts())
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
		for(org.eclipse.uml2.uml.Port port : this.getBase_Activity().getOwnedPorts())
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
		for(Behavior behavior : this.getBase_Activity().getOwnedBehaviors())
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
	public Activity getBase_Activity() {
		if (base_Activity != null && base_Activity.eIsProxy()) {
			InternalEObject oldBase_Activity = (InternalEObject)base_Activity;
			base_Activity = (Activity)eResolveProxy(oldBase_Activity);
			if (base_Activity != oldBase_Activity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AadlPackage.SUBPROGRAM_TYPE__BASE_ACTIVITY, oldBase_Activity, base_Activity));
			}
		}
		return base_Activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetBase_Activity() {
		return base_Activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Activity(Activity newBase_Activity) {
		Activity oldBase_Activity = base_Activity;
		base_Activity = newBase_Activity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AadlPackage.SUBPROGRAM_TYPE__BASE_ACTIVITY, oldBase_Activity, base_Activity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AadlPackage.SUBPROGRAM_TYPE__OWNED_ANNEX:
				return getOwnedAnnex();
			case AadlPackage.SUBPROGRAM_TYPE__OWNED_DATA_ACCESS:
				return getOwnedDataAccess();
			case AadlPackage.SUBPROGRAM_TYPE__OWNED_PARAMETER:
				return getOwnedParameter();
			case AadlPackage.SUBPROGRAM_TYPE__OWNEDPORT:
				return getOwnedport();
			case AadlPackage.SUBPROGRAM_TYPE__OWNED_SUBPROGRAM_ACCESS:
				return getOwnedSubprogramAccess();
			case AadlPackage.SUBPROGRAM_TYPE__OWNED_MODE:
				if (resolve) return getOwnedMode();
				return basicGetOwnedMode();
			case AadlPackage.SUBPROGRAM_TYPE__BASE_ACTIVITY:
				if (resolve) return getBase_Activity();
				return basicGetBase_Activity();
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
			case AadlPackage.SUBPROGRAM_TYPE__OWNED_ANNEX:
				getOwnedAnnex().clear();
				getOwnedAnnex().addAll((Collection<? extends Annex>)newValue);
				return;
			case AadlPackage.SUBPROGRAM_TYPE__OWNED_DATA_ACCESS:
				getOwnedDataAccess().clear();
				getOwnedDataAccess().addAll((Collection<? extends DataAccess>)newValue);
				return;
			case AadlPackage.SUBPROGRAM_TYPE__OWNED_PARAMETER:
				getOwnedParameter().clear();
				getOwnedParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case AadlPackage.SUBPROGRAM_TYPE__OWNEDPORT:
				getOwnedport().clear();
				getOwnedport().addAll((Collection<? extends Port>)newValue);
				return;
			case AadlPackage.SUBPROGRAM_TYPE__OWNED_SUBPROGRAM_ACCESS:
				getOwnedSubprogramAccess().clear();
				getOwnedSubprogramAccess().addAll((Collection<? extends SubprogramAccess>)newValue);
				return;
			case AadlPackage.SUBPROGRAM_TYPE__OWNED_MODE:
				setOwnedMode((ModeStateMachine)newValue);
				return;
			case AadlPackage.SUBPROGRAM_TYPE__BASE_ACTIVITY:
				setBase_Activity((Activity)newValue);
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
			case AadlPackage.SUBPROGRAM_TYPE__OWNED_ANNEX:
				getOwnedAnnex().clear();
				return;
			case AadlPackage.SUBPROGRAM_TYPE__OWNED_DATA_ACCESS:
				getOwnedDataAccess().clear();
				return;
			case AadlPackage.SUBPROGRAM_TYPE__OWNED_PARAMETER:
				getOwnedParameter().clear();
				return;
			case AadlPackage.SUBPROGRAM_TYPE__OWNEDPORT:
				getOwnedport().clear();
				return;
			case AadlPackage.SUBPROGRAM_TYPE__OWNED_SUBPROGRAM_ACCESS:
				getOwnedSubprogramAccess().clear();
				return;
			case AadlPackage.SUBPROGRAM_TYPE__OWNED_MODE:
				setOwnedMode((ModeStateMachine)null);
				return;
			case AadlPackage.SUBPROGRAM_TYPE__BASE_ACTIVITY:
				setBase_Activity((Activity)null);
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
			case AadlPackage.SUBPROGRAM_TYPE__OWNED_ANNEX:
				return !getOwnedAnnex().isEmpty();
			case AadlPackage.SUBPROGRAM_TYPE__OWNED_DATA_ACCESS:
				return !getOwnedDataAccess().isEmpty();
			case AadlPackage.SUBPROGRAM_TYPE__OWNED_PARAMETER:
				return !getOwnedParameter().isEmpty();
			case AadlPackage.SUBPROGRAM_TYPE__OWNEDPORT:
				return !getOwnedport().isEmpty();
			case AadlPackage.SUBPROGRAM_TYPE__OWNED_SUBPROGRAM_ACCESS:
				return !getOwnedSubprogramAccess().isEmpty();
			case AadlPackage.SUBPROGRAM_TYPE__OWNED_MODE:
				return basicGetOwnedMode() != null;
			case AadlPackage.SUBPROGRAM_TYPE__BASE_ACTIVITY:
				return base_Activity != null;
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
		if (baseClass == AnnexContaining.class) {
			switch (derivedFeatureID) {
				case AadlPackage.SUBPROGRAM_TYPE__OWNED_ANNEX: return AadlPackage.ANNEX_CONTAINING__OWNED_ANNEX;
				default: return -1;
			}
		}
		if (baseClass == DataAccessContaining.class) {
			switch (derivedFeatureID) {
				case AadlPackage.SUBPROGRAM_TYPE__OWNED_DATA_ACCESS: return AadlPackage.DATA_ACCESS_CONTAINING__OWNED_DATA_ACCESS;
				default: return -1;
			}
		}
		if (baseClass == ParameterContaining.class) {
			switch (derivedFeatureID) {
				case AadlPackage.SUBPROGRAM_TYPE__OWNED_PARAMETER: return AadlPackage.PARAMETER_CONTAINING__OWNED_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == PortContaining.class) {
			switch (derivedFeatureID) {
				case AadlPackage.SUBPROGRAM_TYPE__OWNEDPORT: return AadlPackage.PORT_CONTAINING__OWNEDPORT;
				default: return -1;
			}
		}
		if (baseClass == SubprogramAccessContaining.class) {
			switch (derivedFeatureID) {
				case AadlPackage.SUBPROGRAM_TYPE__OWNED_SUBPROGRAM_ACCESS: return AadlPackage.SUBPROGRAM_ACCESS_CONTAINING__OWNED_SUBPROGRAM_ACCESS;
				default: return -1;
			}
		}
		if (baseClass == ModeAvailable.class) {
			switch (derivedFeatureID) {
				case AadlPackage.SUBPROGRAM_TYPE__OWNED_MODE: return AadlPackage.MODE_AVAILABLE__OWNED_MODE;
				default: return -1;
			}
		}
		if (baseClass == SoftwareClassifier.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SubprogramInstance.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SubprogramClassifier.class) {
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
		if (baseClass == AnnexContaining.class) {
			switch (baseFeatureID) {
				case AadlPackage.ANNEX_CONTAINING__OWNED_ANNEX: return AadlPackage.SUBPROGRAM_TYPE__OWNED_ANNEX;
				default: return -1;
			}
		}
		if (baseClass == DataAccessContaining.class) {
			switch (baseFeatureID) {
				case AadlPackage.DATA_ACCESS_CONTAINING__OWNED_DATA_ACCESS: return AadlPackage.SUBPROGRAM_TYPE__OWNED_DATA_ACCESS;
				default: return -1;
			}
		}
		if (baseClass == ParameterContaining.class) {
			switch (baseFeatureID) {
				case AadlPackage.PARAMETER_CONTAINING__OWNED_PARAMETER: return AadlPackage.SUBPROGRAM_TYPE__OWNED_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == PortContaining.class) {
			switch (baseFeatureID) {
				case AadlPackage.PORT_CONTAINING__OWNEDPORT: return AadlPackage.SUBPROGRAM_TYPE__OWNEDPORT;
				default: return -1;
			}
		}
		if (baseClass == SubprogramAccessContaining.class) {
			switch (baseFeatureID) {
				case AadlPackage.SUBPROGRAM_ACCESS_CONTAINING__OWNED_SUBPROGRAM_ACCESS: return AadlPackage.SUBPROGRAM_TYPE__OWNED_SUBPROGRAM_ACCESS;
				default: return -1;
			}
		}
		if (baseClass == ModeAvailable.class) {
			switch (baseFeatureID) {
				case AadlPackage.MODE_AVAILABLE__OWNED_MODE: return AadlPackage.SUBPROGRAM_TYPE__OWNED_MODE;
				default: return -1;
			}
		}
		if (baseClass == SoftwareClassifier.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SubprogramInstance.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SubprogramClassifier.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SubprogramTypeImpl
