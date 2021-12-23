/**
 */
package NEsysml.Aadl.impl;

import NEsysml.Aadl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AadlFactoryImpl extends EFactoryImpl implements AadlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AadlFactory init() {
		try {
			AadlFactory theAadlFactory = (AadlFactory)EPackage.Registry.INSTANCE.getEFactory(AadlPackage.eNS_URI);
			if (theAadlFactory != null) {
				return theAadlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AadlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AadlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AadlPackage.EXTENSION: return createExtension();
			case AadlPackage.IMPLEMENTATION: return createImplementation();
			case AadlPackage.MODE_STATE_MACHINE: return createModeStateMachine();
			case AadlPackage.MODE_TRANSITION: return createModeTransition();
			case AadlPackage.MODE_TRANSITION_TRIGGER: return createModeTransitionTrigger();
			case AadlPackage.EVENT_PORT: return createEventPort();
			case AadlPackage.PORT_DATA_FLOW_SPECIFICATION: return createPortDataFlowSpecification();
			case AadlPackage.DATA_FLOW_SPECIFICATION: return createDataFlowSpecification();
			case AadlPackage.BUS_IMPLEMENTATION: return createBusImplementation();
			case AadlPackage.PORT_CONNECTION: return createPortConnection();
			case AadlPackage.BUS_CONNECTION: return createBusConnection();
			case AadlPackage.BUS_TYPE: return createBusType();
			case AadlPackage.BUS_ACCESS: return createBusAccess();
			case AadlPackage.BUS_FLOW_SPECIFICATION: return createBusFlowSpecification();
			case AadlPackage.DATA_IMPLEMENTATION: return createDataImplementation();
			case AadlPackage.DATA_SUBCOMPONENT: return createDataSubcomponent();
			case AadlPackage.SUBPROGRAM_SUBCOMPONENT: return createSubprogramSubcomponent();
			case AadlPackage.DATA_ACCESS_CONNECTION: return createDataAccessConnection();
			case AadlPackage.SUBPROGRAM_ACCESS_CONNECTION: return createSubprogramAccessConnection();
			case AadlPackage.SUBPROGRAM_ACCESS: return createSubprogramAccess();
			case AadlPackage.SUBPROGRAM_SPECIFICATION: return createSubprogramSpecification();
			case AadlPackage.DATA_TYPE: return createDataType();
			case AadlPackage.DATA_ACCESS: return createDataAccess();
			case AadlPackage.DEVICE_IMPLEMENTATION: return createDeviceImplementation();
			case AadlPackage.BUS_SUBCOMPONENT: return createBusSubcomponent();
			case AadlPackage.DEVICE_TYPE: return createDeviceType();
			case AadlPackage.MEMORY_IMPLEMENTATION: return createMemoryImplementation();
			case AadlPackage.MEMORY_SUBCOMPONENT: return createMemorySubcomponent();
			case AadlPackage.MEMORY_TYPE: return createMemoryType();
			case AadlPackage.PROCESS_IMPLEMENTATION: return createProcessImplementation();
			case AadlPackage.THREAD_SUBCOMPONENT: return createThreadSubcomponent();
			case AadlPackage.PROCESSOR_IMPLEMENTATION: return createProcessorImplementation();
			case AadlPackage.PROCESSOR_TYPE: return createProcessorType();
			case AadlPackage.PROCESS_TYPE: return createProcessType();
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION: return createSubprogramImplementation();
			case AadlPackage.PARAMETER_CONNECTION: return createParameterConnection();
			case AadlPackage.CALL_SEQUENCE_DESCRIBABLE: return createCallSequenceDescribable();
			case AadlPackage.CALL_SEQUENCE: return createCallSequence();
			case AadlPackage.SUBPROGRAM_TYPE: return createSubprogramType();
			case AadlPackage.PARAMETER: return createParameter();
			case AadlPackage.SYSTEM_IMPLEMENTATION: return createSystemImplementation();
			case AadlPackage.PROCESS_SUBCOMPONENT: return createProcessSubcomponent();
			case AadlPackage.PROCESSOR_SUBCOMPONENT: return createProcessorSubcomponent();
			case AadlPackage.SYSTEM_SUBCOMPONENT: return createSystemSubcomponent();
			case AadlPackage.DEVICE_CONTAINING: return createDeviceContaining();
			case AadlPackage.DEVICE_SUBCOMPONENT: return createDeviceSubcomponent();
			case AadlPackage.SYSTEM_TYPE: return createSystemType();
			case AadlPackage.THREAD_IMPLEMENTATION: return createThreadImplementation();
			case AadlPackage.THREAD_TYPE: return createThreadType();
			case AadlPackage.DATA_PORT: return createDataPort();
			case AadlPackage.EVENT_DATA_PORT: return createEventDataPort();
			case AadlPackage.NORMAL_MODE: return createNormalMode();
			case AadlPackage.INITIAL_MODE: return createInitialMode();
			case AadlPackage.SUBPROGRAM_INSTANCE_CALL: return createSubprogramInstanceCall();
			case AadlPackage.SUBPROGRAM_INTERFACE_CALL: return createSubprogramInterfaceCall();
			case AadlPackage.AADL_MODEL: return createAadlModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension createExtension() {
		ExtensionImpl extension = new ExtensionImpl();
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementation createImplementation() {
		ImplementationImpl implementation = new ImplementationImpl();
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusImplementation createBusImplementation() {
		BusImplementationImpl busImplementation = new BusImplementationImpl();
		return busImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortConnection createPortConnection() {
		PortConnectionImpl portConnection = new PortConnectionImpl();
		return portConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusConnection createBusConnection() {
		BusConnectionImpl busConnection = new BusConnectionImpl();
		return busConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusAccess createBusAccess() {
		BusAccessImpl busAccess = new BusAccessImpl();
		return busAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusFlowSpecification createBusFlowSpecification() {
		BusFlowSpecificationImpl busFlowSpecification = new BusFlowSpecificationImpl();
		return busFlowSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortDataFlowSpecification createPortDataFlowSpecification() {
		PortDataFlowSpecificationImpl portDataFlowSpecification = new PortDataFlowSpecificationImpl();
		return portDataFlowSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlowSpecification createDataFlowSpecification() {
		DataFlowSpecificationImpl dataFlowSpecification = new DataFlowSpecificationImpl();
		return dataFlowSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusType createBusType() {
		BusTypeImpl busType = new BusTypeImpl();
		return busType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataImplementation createDataImplementation() {
		DataImplementationImpl dataImplementation = new DataImplementationImpl();
		return dataImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSubcomponent createDataSubcomponent() {
		DataSubcomponentImpl dataSubcomponent = new DataSubcomponentImpl();
		return dataSubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramSubcomponent createSubprogramSubcomponent() {
		SubprogramSubcomponentImpl subprogramSubcomponent = new SubprogramSubcomponentImpl();
		return subprogramSubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAccessConnection createDataAccessConnection() {
		DataAccessConnectionImpl dataAccessConnection = new DataAccessConnectionImpl();
		return dataAccessConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAccess createDataAccess() {
		DataAccessImpl dataAccess = new DataAccessImpl();
		return dataAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramAccessConnection createSubprogramAccessConnection() {
		SubprogramAccessConnectionImpl subprogramAccessConnection = new SubprogramAccessConnectionImpl();
		return subprogramAccessConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramAccess createSubprogramAccess() {
		SubprogramAccessImpl subprogramAccess = new SubprogramAccessImpl();
		return subprogramAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramSpecification createSubprogramSpecification() {
		SubprogramSpecificationImpl subprogramSpecification = new SubprogramSpecificationImpl();
		return subprogramSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceImplementation createDeviceImplementation() {
		DeviceImplementationImpl deviceImplementation = new DeviceImplementationImpl();
		return deviceImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusSubcomponent createBusSubcomponent() {
		BusSubcomponentImpl busSubcomponent = new BusSubcomponentImpl();
		return busSubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceType createDeviceType() {
		DeviceTypeImpl deviceType = new DeviceTypeImpl();
		return deviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryImplementation createMemoryImplementation() {
		MemoryImplementationImpl memoryImplementation = new MemoryImplementationImpl();
		return memoryImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemorySubcomponent createMemorySubcomponent() {
		MemorySubcomponentImpl memorySubcomponent = new MemorySubcomponentImpl();
		return memorySubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryType createMemoryType() {
		MemoryTypeImpl memoryType = new MemoryTypeImpl();
		return memoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessImplementation createProcessImplementation() {
		ProcessImplementationImpl processImplementation = new ProcessImplementationImpl();
		return processImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadSubcomponent createThreadSubcomponent() {
		ThreadSubcomponentImpl threadSubcomponent = new ThreadSubcomponentImpl();
		return threadSubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterConnection createParameterConnection() {
		ParameterConnectionImpl parameterConnection = new ParameterConnectionImpl();
		return parameterConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorImplementation createProcessorImplementation() {
		ProcessorImplementationImpl processorImplementation = new ProcessorImplementationImpl();
		return processorImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorType createProcessorType() {
		ProcessorTypeImpl processorType = new ProcessorTypeImpl();
		return processorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessType createProcessType() {
		ProcessTypeImpl processType = new ProcessTypeImpl();
		return processType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramImplementation createSubprogramImplementation() {
		SubprogramImplementationImpl subprogramImplementation = new SubprogramImplementationImpl();
		return subprogramImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallSequenceDescribable createCallSequenceDescribable() {
		CallSequenceDescribableImpl callSequenceDescribable = new CallSequenceDescribableImpl();
		return callSequenceDescribable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallSequence createCallSequence() {
		CallSequenceImpl callSequence = new CallSequenceImpl();
		return callSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramType createSubprogramType() {
		SubprogramTypeImpl subprogramType = new SubprogramTypeImpl();
		return subprogramType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemImplementation createSystemImplementation() {
		SystemImplementationImpl systemImplementation = new SystemImplementationImpl();
		return systemImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessSubcomponent createProcessSubcomponent() {
		ProcessSubcomponentImpl processSubcomponent = new ProcessSubcomponentImpl();
		return processSubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorSubcomponent createProcessorSubcomponent() {
		ProcessorSubcomponentImpl processorSubcomponent = new ProcessorSubcomponentImpl();
		return processorSubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemSubcomponent createSystemSubcomponent() {
		SystemSubcomponentImpl systemSubcomponent = new SystemSubcomponentImpl();
		return systemSubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceContaining createDeviceContaining() {
		DeviceContainingImpl deviceContaining = new DeviceContainingImpl();
		return deviceContaining;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceSubcomponent createDeviceSubcomponent() {
		DeviceSubcomponentImpl deviceSubcomponent = new DeviceSubcomponentImpl();
		return deviceSubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemType createSystemType() {
		SystemTypeImpl systemType = new SystemTypeImpl();
		return systemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadImplementation createThreadImplementation() {
		ThreadImplementationImpl threadImplementation = new ThreadImplementationImpl();
		return threadImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadType createThreadType() {
		ThreadTypeImpl threadType = new ThreadTypeImpl();
		return threadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPort createDataPort() {
		DataPortImpl dataPort = new DataPortImpl();
		return dataPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventPort createEventPort() {
		EventPortImpl eventPort = new EventPortImpl();
		return eventPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventDataPort createEventDataPort() {
		EventDataPortImpl eventDataPort = new EventDataPortImpl();
		return eventDataPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeStateMachine createModeStateMachine() {
		ModeStateMachineImpl modeStateMachine = new ModeStateMachineImpl();
		return modeStateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeTransition createModeTransition() {
		ModeTransitionImpl modeTransition = new ModeTransitionImpl();
		return modeTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeTransitionTrigger createModeTransitionTrigger() {
		ModeTransitionTriggerImpl modeTransitionTrigger = new ModeTransitionTriggerImpl();
		return modeTransitionTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalMode createNormalMode() {
		NormalModeImpl normalMode = new NormalModeImpl();
		return normalMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialMode createInitialMode() {
		InitialModeImpl initialMode = new InitialModeImpl();
		return initialMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramInstanceCall createSubprogramInstanceCall() {
		SubprogramInstanceCallImpl subprogramInstanceCall = new SubprogramInstanceCallImpl();
		return subprogramInstanceCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramInterfaceCall createSubprogramInterfaceCall() {
		SubprogramInterfaceCallImpl subprogramInterfaceCall = new SubprogramInterfaceCallImpl();
		return subprogramInterfaceCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AadlModel createAadlModel() {
		AadlModelImpl aadlModel = new AadlModelImpl();
		return aadlModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AadlPackage getAadlPackage() {
		return (AadlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AadlPackage getPackage() {
		return AadlPackage.eINSTANCE;
	}

} //AadlFactoryImpl
