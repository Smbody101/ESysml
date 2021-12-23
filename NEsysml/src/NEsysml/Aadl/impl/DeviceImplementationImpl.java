/**
 */
package NEsysml.Aadl.impl;

import NEsysml.AadlUtil;
import java.lang.reflect.InvocationTargetException;
import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.Annex;
import NEsysml.Aadl.AnnexContaining;
import NEsysml.Aadl.BusAccessConnectionContaining;
import NEsysml.Aadl.BusConnection;
import NEsysml.Aadl.BusContaining;
import NEsysml.Aadl.BusSubcomponent;
import NEsysml.Aadl.ComponentType;
import NEsysml.Aadl.DataContaining;
import NEsysml.Aadl.DataSubcomponent;
import NEsysml.Aadl.DeviceClassifier;
import NEsysml.Aadl.DeviceImplementation;
import NEsysml.Aadl.ModeAvailable;
import NEsysml.Aadl.ModeStateMachine;
import NEsysml.Aadl.PlatformClassifier;
import NEsysml.Aadl.PortConnection;
import NEsysml.Aadl.PortConnectionContaining;
import NEsysml.Aadl.SubprogramAccessConnection;
import NEsysml.Aadl.SubprogramAccessConnectionContaining;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.sysml14.blocks.Block;
import org.eclipse.papyrus.sysml14.blocks.BlocksPackage;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.DeviceImplementationImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.DeviceImplementationImpl#isEncapsulated <em>Is Encapsulated</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.DeviceImplementationImpl#getOwnedAnnex <em>Owned Annex</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.DeviceImplementationImpl#getOwnedBusConnection <em>Owned Bus Connection</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.DeviceImplementationImpl#getOwnedBusSubcomponent <em>Owned Bus Subcomponent</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.DeviceImplementationImpl#getOwnedDataSubcomponent <em>Owned Data Subcomponent</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.DeviceImplementationImpl#getOwnedMode <em>Owned Mode</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.DeviceImplementationImpl#getOwnedPortConnection <em>Owned Port Connection</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.DeviceImplementationImpl#getOwnedSubprogramAccessConnection <em>Owned Subprogram Access Connection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceImplementationImpl extends ComponentImplementationImpl implements DeviceImplementation {
	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;
	/**
	 * The default value of the '{@link #isEncapsulated() <em>Is Encapsulated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEncapsulated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ENCAPSULATED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isEncapsulated() <em>Is Encapsulated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEncapsulated()
	 * @generated
	 * @ordered
	 */
	protected boolean isEncapsulated = IS_ENCAPSULATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.DEVICE_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AadlPackage.DEVICE_IMPLEMENTATION__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AadlPackage.DEVICE_IMPLEMENTATION__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEncapsulated() {
		return isEncapsulated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEncapsulated(boolean newIsEncapsulated) {
		boolean oldIsEncapsulated = isEncapsulated;
		isEncapsulated = newIsEncapsulated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AadlPackage.DEVICE_IMPLEMENTATION__IS_ENCAPSULATED, oldIsEncapsulated, isEncapsulated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ComponentType basicGetType() {
		// TODO: implement this method to return the 'Type' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		for(Generalization generalization : this.getBase_Class().getGeneralizations()) {
			if(AadlUtil.eINSTANCE.isStereotypedBy(generalization, AadlPackage.Literals.IMPLEMENTATION)) {
				if(AadlUtil.eINSTANCE.isStereotypedBy(generalization.getGeneral(), AadlPackage.Literals.DEVICE_TYPE))
					return (ComponentType) AadlUtil.eINSTANCE.getStereotypeApplication(generalization.getGeneral(), AadlPackage.Literals.DEVICE_TYPE);
			}
		}
		return null;
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
	public EList<BusConnection> getOwnedBusConnection() {
		// TODO: implement this method to return the 'Owned Bus Connection' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<BusConnection> list = new BasicEList<BusConnection>();
		for(Connector connector : this.getBase_Class().getOwnedConnectors())
			if(AadlUtil.eINSTANCE.isStereotypedBy(connector, AadlPackage.Literals.BUS_CONNECTION))
				list.add((BusConnection) AadlUtil.eINSTANCE.getStereotypeApplication(connector, AadlPackage.Literals.BUS_CONNECTION));
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<BusSubcomponent> getOwnedBusSubcomponent() {
		// TODO: implement this method to return the 'Owned Bus Subcomponent' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<BusSubcomponent> list = new BasicEList<BusSubcomponent>();
		for(Property property : this.getBase_Class().getAttributes())
			for(EObject object : property.getStereotypeApplications())
				if(object instanceof BusSubcomponent)
					list.add((BusSubcomponent) object);
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
		for(Property property : this.getBase_Class().getAttributes())
			for(EObject object : property.getStereotypeApplications())
				if(object instanceof DataSubcomponent)
					list.add((DataSubcomponent) object);
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
	 * @generated NOT
	 */
	public EList<PortConnection> getOwnedPortConnection() {
		// TODO: implement this method to return the 'Owned Port Connection' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<PortConnection> list = new BasicEList<PortConnection>();
		for(Connector connector : this.getBase_Class().getOwnedConnectors())
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
		for(Connector connector : this.getBase_Class().getOwnedConnectors())
			if(AadlUtil.eINSTANCE.isStereotypedBy(connector, AadlPackage.Literals.SUBPROGRAM_ACCESS_CONNECTION))
				list.add((SubprogramAccessConnection) AadlUtil.eINSTANCE.getStereotypeApplication(connector, AadlPackage.Literals.SUBPROGRAM_ACCESS_CONNECTION));
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getReferences() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getParts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getFlowProperties() {
		// TODO: implement this method
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
			case AadlPackage.DEVICE_IMPLEMENTATION__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case AadlPackage.DEVICE_IMPLEMENTATION__IS_ENCAPSULATED:
				return isEncapsulated();
			case AadlPackage.DEVICE_IMPLEMENTATION__OWNED_ANNEX:
				return getOwnedAnnex();
			case AadlPackage.DEVICE_IMPLEMENTATION__OWNED_BUS_CONNECTION:
				return getOwnedBusConnection();
			case AadlPackage.DEVICE_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT:
				return getOwnedBusSubcomponent();
			case AadlPackage.DEVICE_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT:
				return getOwnedDataSubcomponent();
			case AadlPackage.DEVICE_IMPLEMENTATION__OWNED_MODE:
				if (resolve) return getOwnedMode();
				return basicGetOwnedMode();
			case AadlPackage.DEVICE_IMPLEMENTATION__OWNED_PORT_CONNECTION:
				return getOwnedPortConnection();
			case AadlPackage.DEVICE_IMPLEMENTATION__OWNED_SUBPROGRAM_ACCESS_CONNECTION:
				return getOwnedSubprogramAccessConnection();
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
			case AadlPackage.DEVICE_IMPLEMENTATION__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case AadlPackage.DEVICE_IMPLEMENTATION__IS_ENCAPSULATED:
				setIsEncapsulated((Boolean)newValue);
				return;
			case AadlPackage.DEVICE_IMPLEMENTATION__OWNED_ANNEX:
				getOwnedAnnex().clear();
				getOwnedAnnex().addAll((Collection<? extends Annex>)newValue);
				return;
			case AadlPackage.DEVICE_IMPLEMENTATION__OWNED_BUS_CONNECTION:
				getOwnedBusConnection().clear();
				getOwnedBusConnection().addAll((Collection<? extends BusConnection>)newValue);
				return;
			case AadlPackage.DEVICE_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT:
				getOwnedBusSubcomponent().clear();
				getOwnedBusSubcomponent().addAll((Collection<? extends BusSubcomponent>)newValue);
				return;
			case AadlPackage.DEVICE_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT:
				getOwnedDataSubcomponent().clear();
				getOwnedDataSubcomponent().addAll((Collection<? extends DataSubcomponent>)newValue);
				return;
			case AadlPackage.DEVICE_IMPLEMENTATION__OWNED_MODE:
				setOwnedMode((ModeStateMachine)newValue);
				return;
			case AadlPackage.DEVICE_IMPLEMENTATION__OWNED_PORT_CONNECTION:
				getOwnedPortConnection().clear();
				getOwnedPortConnection().addAll((Collection<? extends PortConnection>)newValue);
				return;
			case AadlPackage.DEVICE_IMPLEMENTATION__OWNED_SUBPROGRAM_ACCESS_CONNECTION:
				getOwnedSubprogramAccessConnection().clear();
				getOwnedSubprogramAccessConnection().addAll((Collection<? extends SubprogramAccessConnection>)newValue);
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
			case AadlPackage.DEVICE_IMPLEMENTATION__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case AadlPackage.DEVICE_IMPLEMENTATION__IS_ENCAPSULATED:
				setIsEncapsulated(IS_ENCAPSULATED_EDEFAULT);
				return;
			case AadlPackage.DEVICE_IMPLEMENTATION__OWNED_ANNEX:
				getOwnedAnnex().clear();
				return;
			case AadlPackage.DEVICE_IMPLEMENTATION__OWNED_BUS_CONNECTION:
				getOwnedBusConnection().clear();
				return;
			case AadlPackage.DEVICE_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT:
				getOwnedBusSubcomponent().clear();
				return;
			case AadlPackage.DEVICE_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT:
				getOwnedDataSubcomponent().clear();
				return;
			case AadlPackage.DEVICE_IMPLEMENTATION__OWNED_MODE:
				setOwnedMode((ModeStateMachine)null);
				return;
			case AadlPackage.DEVICE_IMPLEMENTATION__OWNED_PORT_CONNECTION:
				getOwnedPortConnection().clear();
				return;
			case AadlPackage.DEVICE_IMPLEMENTATION__OWNED_SUBPROGRAM_ACCESS_CONNECTION:
				getOwnedSubprogramAccessConnection().clear();
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
			case AadlPackage.DEVICE_IMPLEMENTATION__BASE_CLASS:
				return base_Class != null;
			case AadlPackage.DEVICE_IMPLEMENTATION__IS_ENCAPSULATED:
				return isEncapsulated != IS_ENCAPSULATED_EDEFAULT;
			case AadlPackage.DEVICE_IMPLEMENTATION__OWNED_ANNEX:
				return !getOwnedAnnex().isEmpty();
			case AadlPackage.DEVICE_IMPLEMENTATION__OWNED_BUS_CONNECTION:
				return !getOwnedBusConnection().isEmpty();
			case AadlPackage.DEVICE_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT:
				return !getOwnedBusSubcomponent().isEmpty();
			case AadlPackage.DEVICE_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT:
				return !getOwnedDataSubcomponent().isEmpty();
			case AadlPackage.DEVICE_IMPLEMENTATION__OWNED_MODE:
				return basicGetOwnedMode() != null;
			case AadlPackage.DEVICE_IMPLEMENTATION__OWNED_PORT_CONNECTION:
				return !getOwnedPortConnection().isEmpty();
			case AadlPackage.DEVICE_IMPLEMENTATION__OWNED_SUBPROGRAM_ACCESS_CONNECTION:
				return !getOwnedSubprogramAccessConnection().isEmpty();
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
		if (baseClass == Block.class) {
			switch (derivedFeatureID) {
				case AadlPackage.DEVICE_IMPLEMENTATION__BASE_CLASS: return BlocksPackage.BLOCK__BASE_CLASS;
				case AadlPackage.DEVICE_IMPLEMENTATION__IS_ENCAPSULATED: return BlocksPackage.BLOCK__IS_ENCAPSULATED;
				default: return -1;
			}
		}
		if (baseClass == AnnexContaining.class) {
			switch (derivedFeatureID) {
				case AadlPackage.DEVICE_IMPLEMENTATION__OWNED_ANNEX: return AadlPackage.ANNEX_CONTAINING__OWNED_ANNEX;
				default: return -1;
			}
		}
		if (baseClass == BusAccessConnectionContaining.class) {
			switch (derivedFeatureID) {
				case AadlPackage.DEVICE_IMPLEMENTATION__OWNED_BUS_CONNECTION: return AadlPackage.BUS_ACCESS_CONNECTION_CONTAINING__OWNED_BUS_CONNECTION;
				default: return -1;
			}
		}
		if (baseClass == BusContaining.class) {
			switch (derivedFeatureID) {
				case AadlPackage.DEVICE_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT: return AadlPackage.BUS_CONTAINING__OWNED_BUS_SUBCOMPONENT;
				default: return -1;
			}
		}
		if (baseClass == DataContaining.class) {
			switch (derivedFeatureID) {
				case AadlPackage.DEVICE_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT: return AadlPackage.DATA_CONTAINING__OWNED_DATA_SUBCOMPONENT;
				default: return -1;
			}
		}
		if (baseClass == ModeAvailable.class) {
			switch (derivedFeatureID) {
				case AadlPackage.DEVICE_IMPLEMENTATION__OWNED_MODE: return AadlPackage.MODE_AVAILABLE__OWNED_MODE;
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
		if (baseClass == PortConnectionContaining.class) {
			switch (derivedFeatureID) {
				case AadlPackage.DEVICE_IMPLEMENTATION__OWNED_PORT_CONNECTION: return AadlPackage.PORT_CONNECTION_CONTAINING__OWNED_PORT_CONNECTION;
				default: return -1;
			}
		}
		if (baseClass == SubprogramAccessConnectionContaining.class) {
			switch (derivedFeatureID) {
				case AadlPackage.DEVICE_IMPLEMENTATION__OWNED_SUBPROGRAM_ACCESS_CONNECTION: return AadlPackage.SUBPROGRAM_ACCESS_CONNECTION_CONTAINING__OWNED_SUBPROGRAM_ACCESS_CONNECTION;
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
		if (baseClass == Block.class) {
			switch (baseFeatureID) {
				case BlocksPackage.BLOCK__BASE_CLASS: return AadlPackage.DEVICE_IMPLEMENTATION__BASE_CLASS;
				case BlocksPackage.BLOCK__IS_ENCAPSULATED: return AadlPackage.DEVICE_IMPLEMENTATION__IS_ENCAPSULATED;
				default: return -1;
			}
		}
		if (baseClass == AnnexContaining.class) {
			switch (baseFeatureID) {
				case AadlPackage.ANNEX_CONTAINING__OWNED_ANNEX: return AadlPackage.DEVICE_IMPLEMENTATION__OWNED_ANNEX;
				default: return -1;
			}
		}
		if (baseClass == BusAccessConnectionContaining.class) {
			switch (baseFeatureID) {
				case AadlPackage.BUS_ACCESS_CONNECTION_CONTAINING__OWNED_BUS_CONNECTION: return AadlPackage.DEVICE_IMPLEMENTATION__OWNED_BUS_CONNECTION;
				default: return -1;
			}
		}
		if (baseClass == BusContaining.class) {
			switch (baseFeatureID) {
				case AadlPackage.BUS_CONTAINING__OWNED_BUS_SUBCOMPONENT: return AadlPackage.DEVICE_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT;
				default: return -1;
			}
		}
		if (baseClass == DataContaining.class) {
			switch (baseFeatureID) {
				case AadlPackage.DATA_CONTAINING__OWNED_DATA_SUBCOMPONENT: return AadlPackage.DEVICE_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT;
				default: return -1;
			}
		}
		if (baseClass == ModeAvailable.class) {
			switch (baseFeatureID) {
				case AadlPackage.MODE_AVAILABLE__OWNED_MODE: return AadlPackage.DEVICE_IMPLEMENTATION__OWNED_MODE;
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
		if (baseClass == PortConnectionContaining.class) {
			switch (baseFeatureID) {
				case AadlPackage.PORT_CONNECTION_CONTAINING__OWNED_PORT_CONNECTION: return AadlPackage.DEVICE_IMPLEMENTATION__OWNED_PORT_CONNECTION;
				default: return -1;
			}
		}
		if (baseClass == SubprogramAccessConnectionContaining.class) {
			switch (baseFeatureID) {
				case AadlPackage.SUBPROGRAM_ACCESS_CONNECTION_CONTAINING__OWNED_SUBPROGRAM_ACCESS_CONNECTION: return AadlPackage.DEVICE_IMPLEMENTATION__OWNED_SUBPROGRAM_ACCESS_CONNECTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Block.class) {
			switch (baseOperationID) {
				case BlocksPackage.BLOCK___GET_REFERENCES: return AadlPackage.DEVICE_IMPLEMENTATION___GET_REFERENCES;
				case BlocksPackage.BLOCK___GET_PARTS: return AadlPackage.DEVICE_IMPLEMENTATION___GET_PARTS;
				case BlocksPackage.BLOCK___GET_FLOW_PROPERTIES: return AadlPackage.DEVICE_IMPLEMENTATION___GET_FLOW_PROPERTIES;
				default: return -1;
			}
		}
		if (baseClass == AnnexContaining.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == BusAccessConnectionContaining.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == BusContaining.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == DataContaining.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == ModeAvailable.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == PlatformClassifier.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == DeviceClassifier.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == PortConnectionContaining.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == SubprogramAccessConnectionContaining.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AadlPackage.DEVICE_IMPLEMENTATION___GET_REFERENCES:
				return getReferences();
			case AadlPackage.DEVICE_IMPLEMENTATION___GET_PARTS:
				return getParts();
			case AadlPackage.DEVICE_IMPLEMENTATION___GET_FLOW_PROPERTIES:
				return getFlowProperties();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isEncapsulated: ");
		result.append(isEncapsulated);
		result.append(')');
		return result.toString();
	}

} //DeviceImplementationImpl
