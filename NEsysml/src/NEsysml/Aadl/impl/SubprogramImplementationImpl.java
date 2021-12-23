/**
 */
package NEsysml.Aadl.impl;

import NEsysml.AadlUtil;
import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.Annex;
import NEsysml.Aadl.AnnexContaining;
import NEsysml.Aadl.CallSequence;
import NEsysml.Aadl.CallSequenceDescribable;
import NEsysml.Aadl.DataAccessConnection;
import NEsysml.Aadl.DataAccessConnectionContaining;
import NEsysml.Aadl.DataContaining;
import NEsysml.Aadl.DataSubcomponent;
import NEsysml.Aadl.ModeAvailable;
import NEsysml.Aadl.ModeStateMachine;
import NEsysml.Aadl.ParameterConnection;
import NEsysml.Aadl.ParameterConnectionContaining;
import NEsysml.Aadl.PortConnection;
import NEsysml.Aadl.PortConnectionContaining;
import NEsysml.Aadl.SoftwareClassifier;
import NEsysml.Aadl.SubprogramAccessConnection;
import NEsysml.Aadl.SubprogramAccessConnectionContaining;
import NEsysml.Aadl.SubprogramClassifier;
import NEsysml.Aadl.SubprogramContaining;
import NEsysml.Aadl.SubprogramImplementation;
import NEsysml.Aadl.SubprogramInstance;
import NEsysml.Aadl.SubprogramSubcomponent;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subprogram Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.SubprogramImplementationImpl#getOwnedAnnex <em>Owned Annex</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.SubprogramImplementationImpl#getOwnedCallSequence <em>Owned Call Sequence</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.SubprogramImplementationImpl#getOwnedDataAccessConnection <em>Owned Data Access Connection</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.SubprogramImplementationImpl#getOwnedDataSubcomponent <em>Owned Data Subcomponent</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.SubprogramImplementationImpl#getOwnedParameterConnection <em>Owned Parameter Connection</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.SubprogramImplementationImpl#getOwnedPortConnection <em>Owned Port Connection</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.SubprogramImplementationImpl#getOwnedSubprogramAccessConnection <em>Owned Subprogram Access Connection</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.SubprogramImplementationImpl#getOwnedMode <em>Owned Mode</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.SubprogramImplementationImpl#getOwnedSubprogramSubcomponent <em>Owned Subprogram Subcomponent</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.SubprogramImplementationImpl#getBase_Activity <em>Base Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubprogramImplementationImpl extends ComponentImplementationImpl implements SubprogramImplementation {
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
	protected SubprogramImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.SUBPROGRAM_IMPLEMENTATION;
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
	public EList<CallSequence> getOwnedCallSequence() {
		// TODO: implement this method to return the 'Owned Call Sequence' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<CallSequence> list = new BasicEList<CallSequence>();
		for(Behavior behavior : this.getBase_Activity().getOwnedBehaviors())
			if(AadlUtil.eINSTANCE.isStereotypedBy(behavior, AadlPackage.Literals.CALL_SEQUENCE))
				list.add((CallSequence) AadlUtil.eINSTANCE.getStereotypeApplication(behavior, AadlPackage.Literals.CALL_SEQUENCE));
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<DataAccessConnection> getOwnedDataAccessConnection() {
		// TODO: implement this method to return the 'Owned Data Access Connection' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<DataAccessConnection> list = new BasicEList<DataAccessConnection>();
		for(Connector connector : this.getBase_Activity().getOwnedConnectors())
			if(AadlUtil.eINSTANCE.isStereotypedBy(connector, AadlPackage.Literals.DATA_ACCESS_CONNECTION))
				list.add((DataAccessConnection) AadlUtil.eINSTANCE.getStereotypeApplication(connector, AadlPackage.Literals.DATA_ACCESS_CONNECTION));
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<DataSubcomponent> getOwnedDataSubcomponent() {
		// TODO: implement this method to return the 'Owned Data Subcomponent' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<DataSubcomponent> list = new BasicEList<DataSubcomponent>();
		for(Property property : this.getBase_Activity().getAttributes())
			for(EObject object : property.getStereotypeApplications())
				if(object instanceof DataSubcomponent)
					list.add((DataSubcomponent) object);
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ParameterConnection> getOwnedParameterConnection() {
		// TODO: implement this method to return the 'Owned Parameter Connection' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<ParameterConnection> list = new BasicEList<ParameterConnection>();
		for(CallSequence sequence : this.getOwnedCallSequence())
			for(ActivityEdge edge : sequence.getBase_Activity().getEdges())
				if(AadlUtil.eINSTANCE.isStereotypedBy(edge, AadlPackage.Literals.PARAMETER_CONNECTION))
					list.add((ParameterConnection) AadlUtil.eINSTANCE.getStereotypeApplication(edge, AadlPackage.Literals.PARAMETER_CONNECTION));
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<PortConnection> getOwnedPortConnection() {
		// TODO: implement this method to return the 'Owned Port Connection' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<PortConnection> list = new BasicEList<PortConnection>();
		for(Connector connector : this.getBase_Activity().getOwnedConnectors())
			if(AadlUtil.eINSTANCE.isStereotypedBy(connector, AadlPackage.Literals.PORT_CONNECTION))
				list.add((PortConnection) AadlUtil.eINSTANCE.getStereotypeApplication(connector, AadlPackage.Literals.PORT_CONNECTION));
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<SubprogramAccessConnection> getOwnedSubprogramAccessConnection() {
		// TODO: implement this method to return the 'Owned Subprogram Access Connection' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<SubprogramAccessConnection> list = new BasicEList<SubprogramAccessConnection>();
		for(Connector connector : this.getBase_Activity().getOwnedConnectors())
			if(AadlUtil.eINSTANCE.isStereotypedBy(connector, AadlPackage.Literals.SUBPROGRAM_ACCESS_CONNECTION))
				list.add((SubprogramAccessConnection) AadlUtil.eINSTANCE.getStereotypeApplication(connector, AadlPackage.Literals.SUBPROGRAM_ACCESS_CONNECTION));
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
	 * @generated NOT
	 */
	public EList<SubprogramSubcomponent> getOwnedSubprogramSubcomponent() {
		// TODO: implement this method to return the 'Owned Subprogram Subcomponent' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<SubprogramSubcomponent> list = new BasicEList<SubprogramSubcomponent>();
		for(Property property : this.getBase_Activity().getAttributes())
			for(EObject object : property.getStereotypeApplications())
				if(object instanceof SubprogramSubcomponent)
					list.add((SubprogramSubcomponent) object);
		return list;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AadlPackage.SUBPROGRAM_IMPLEMENTATION__BASE_ACTIVITY, oldBase_Activity, base_Activity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AadlPackage.SUBPROGRAM_IMPLEMENTATION__BASE_ACTIVITY, oldBase_Activity, base_Activity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_ANNEX:
				return getOwnedAnnex();
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_CALL_SEQUENCE:
				return getOwnedCallSequence();
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_DATA_ACCESS_CONNECTION:
				return getOwnedDataAccessConnection();
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT:
				return getOwnedDataSubcomponent();
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_PARAMETER_CONNECTION:
				return getOwnedParameterConnection();
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_PORT_CONNECTION:
				return getOwnedPortConnection();
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_SUBPROGRAM_ACCESS_CONNECTION:
				return getOwnedSubprogramAccessConnection();
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_MODE:
				if (resolve) return getOwnedMode();
				return basicGetOwnedMode();
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT:
				return getOwnedSubprogramSubcomponent();
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__BASE_ACTIVITY:
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
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_ANNEX:
				getOwnedAnnex().clear();
				getOwnedAnnex().addAll((Collection<? extends Annex>)newValue);
				return;
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_CALL_SEQUENCE:
				getOwnedCallSequence().clear();
				getOwnedCallSequence().addAll((Collection<? extends CallSequence>)newValue);
				return;
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_DATA_ACCESS_CONNECTION:
				getOwnedDataAccessConnection().clear();
				getOwnedDataAccessConnection().addAll((Collection<? extends DataAccessConnection>)newValue);
				return;
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT:
				getOwnedDataSubcomponent().clear();
				getOwnedDataSubcomponent().addAll((Collection<? extends DataSubcomponent>)newValue);
				return;
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_PARAMETER_CONNECTION:
				getOwnedParameterConnection().clear();
				getOwnedParameterConnection().addAll((Collection<? extends ParameterConnection>)newValue);
				return;
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_PORT_CONNECTION:
				getOwnedPortConnection().clear();
				getOwnedPortConnection().addAll((Collection<? extends PortConnection>)newValue);
				return;
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_SUBPROGRAM_ACCESS_CONNECTION:
				getOwnedSubprogramAccessConnection().clear();
				getOwnedSubprogramAccessConnection().addAll((Collection<? extends SubprogramAccessConnection>)newValue);
				return;
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_MODE:
				setOwnedMode((ModeStateMachine)newValue);
				return;
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT:
				getOwnedSubprogramSubcomponent().clear();
				getOwnedSubprogramSubcomponent().addAll((Collection<? extends SubprogramSubcomponent>)newValue);
				return;
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__BASE_ACTIVITY:
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
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_ANNEX:
				getOwnedAnnex().clear();
				return;
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_CALL_SEQUENCE:
				getOwnedCallSequence().clear();
				return;
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_DATA_ACCESS_CONNECTION:
				getOwnedDataAccessConnection().clear();
				return;
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT:
				getOwnedDataSubcomponent().clear();
				return;
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_PARAMETER_CONNECTION:
				getOwnedParameterConnection().clear();
				return;
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_PORT_CONNECTION:
				getOwnedPortConnection().clear();
				return;
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_SUBPROGRAM_ACCESS_CONNECTION:
				getOwnedSubprogramAccessConnection().clear();
				return;
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_MODE:
				setOwnedMode((ModeStateMachine)null);
				return;
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT:
				getOwnedSubprogramSubcomponent().clear();
				return;
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__BASE_ACTIVITY:
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
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_ANNEX:
				return !getOwnedAnnex().isEmpty();
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_CALL_SEQUENCE:
				return !getOwnedCallSequence().isEmpty();
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_DATA_ACCESS_CONNECTION:
				return !getOwnedDataAccessConnection().isEmpty();
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT:
				return !getOwnedDataSubcomponent().isEmpty();
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_PARAMETER_CONNECTION:
				return !getOwnedParameterConnection().isEmpty();
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_PORT_CONNECTION:
				return !getOwnedPortConnection().isEmpty();
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_SUBPROGRAM_ACCESS_CONNECTION:
				return !getOwnedSubprogramAccessConnection().isEmpty();
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_MODE:
				return basicGetOwnedMode() != null;
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT:
				return !getOwnedSubprogramSubcomponent().isEmpty();
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION__BASE_ACTIVITY:
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
				case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_ANNEX: return AadlPackage.ANNEX_CONTAINING__OWNED_ANNEX;
				default: return -1;
			}
		}
		if (baseClass == CallSequenceDescribable.class) {
			switch (derivedFeatureID) {
				case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_CALL_SEQUENCE: return AadlPackage.CALL_SEQUENCE_DESCRIBABLE__OWNED_CALL_SEQUENCE;
				default: return -1;
			}
		}
		if (baseClass == DataAccessConnectionContaining.class) {
			switch (derivedFeatureID) {
				case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_DATA_ACCESS_CONNECTION: return AadlPackage.DATA_ACCESS_CONNECTION_CONTAINING__OWNED_DATA_ACCESS_CONNECTION;
				default: return -1;
			}
		}
		if (baseClass == DataContaining.class) {
			switch (derivedFeatureID) {
				case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT: return AadlPackage.DATA_CONTAINING__OWNED_DATA_SUBCOMPONENT;
				default: return -1;
			}
		}
		if (baseClass == ParameterConnectionContaining.class) {
			switch (derivedFeatureID) {
				case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_PARAMETER_CONNECTION: return AadlPackage.PARAMETER_CONNECTION_CONTAINING__OWNED_PARAMETER_CONNECTION;
				default: return -1;
			}
		}
		if (baseClass == PortConnectionContaining.class) {
			switch (derivedFeatureID) {
				case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_PORT_CONNECTION: return AadlPackage.PORT_CONNECTION_CONTAINING__OWNED_PORT_CONNECTION;
				default: return -1;
			}
		}
		if (baseClass == SubprogramAccessConnectionContaining.class) {
			switch (derivedFeatureID) {
				case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_SUBPROGRAM_ACCESS_CONNECTION: return AadlPackage.SUBPROGRAM_ACCESS_CONNECTION_CONTAINING__OWNED_SUBPROGRAM_ACCESS_CONNECTION;
				default: return -1;
			}
		}
		if (baseClass == ModeAvailable.class) {
			switch (derivedFeatureID) {
				case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_MODE: return AadlPackage.MODE_AVAILABLE__OWNED_MODE;
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
		if (baseClass == SubprogramContaining.class) {
			switch (derivedFeatureID) {
				case AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT: return AadlPackage.SUBPROGRAM_CONTAINING__OWNED_SUBPROGRAM_SUBCOMPONENT;
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
				case AadlPackage.ANNEX_CONTAINING__OWNED_ANNEX: return AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_ANNEX;
				default: return -1;
			}
		}
		if (baseClass == CallSequenceDescribable.class) {
			switch (baseFeatureID) {
				case AadlPackage.CALL_SEQUENCE_DESCRIBABLE__OWNED_CALL_SEQUENCE: return AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_CALL_SEQUENCE;
				default: return -1;
			}
		}
		if (baseClass == DataAccessConnectionContaining.class) {
			switch (baseFeatureID) {
				case AadlPackage.DATA_ACCESS_CONNECTION_CONTAINING__OWNED_DATA_ACCESS_CONNECTION: return AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_DATA_ACCESS_CONNECTION;
				default: return -1;
			}
		}
		if (baseClass == DataContaining.class) {
			switch (baseFeatureID) {
				case AadlPackage.DATA_CONTAINING__OWNED_DATA_SUBCOMPONENT: return AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT;
				default: return -1;
			}
		}
		if (baseClass == ParameterConnectionContaining.class) {
			switch (baseFeatureID) {
				case AadlPackage.PARAMETER_CONNECTION_CONTAINING__OWNED_PARAMETER_CONNECTION: return AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_PARAMETER_CONNECTION;
				default: return -1;
			}
		}
		if (baseClass == PortConnectionContaining.class) {
			switch (baseFeatureID) {
				case AadlPackage.PORT_CONNECTION_CONTAINING__OWNED_PORT_CONNECTION: return AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_PORT_CONNECTION;
				default: return -1;
			}
		}
		if (baseClass == SubprogramAccessConnectionContaining.class) {
			switch (baseFeatureID) {
				case AadlPackage.SUBPROGRAM_ACCESS_CONNECTION_CONTAINING__OWNED_SUBPROGRAM_ACCESS_CONNECTION: return AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_SUBPROGRAM_ACCESS_CONNECTION;
				default: return -1;
			}
		}
		if (baseClass == ModeAvailable.class) {
			switch (baseFeatureID) {
				case AadlPackage.MODE_AVAILABLE__OWNED_MODE: return AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_MODE;
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
		if (baseClass == SubprogramContaining.class) {
			switch (baseFeatureID) {
				case AadlPackage.SUBPROGRAM_CONTAINING__OWNED_SUBPROGRAM_SUBCOMPONENT: return AadlPackage.SUBPROGRAM_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SubprogramImplementationImpl
