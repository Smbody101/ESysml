/**
 */
package NEsysml.Aadl.util;

import NEsysml.Aadl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.papyrus.sysml14.blocks.BindingConnector;
import org.eclipse.papyrus.sysml14.blocks.Block;

import org.eclipse.papyrus.sysml14.portsandflows.InterfaceBlock;
import org.eclipse.papyrus.sysml14.portsandflows.ProxyPort;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see NEsysml.Aadl.AadlPackage
 * @generated
 */
public class AadlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AadlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AadlSwitch() {
		if (modelPackage == null) {
			modelPackage = AadlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AadlPackage.EXTENSION: {
				Extension extension = (Extension)theEObject;
				T result = caseExtension(extension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.IMPLEMENTATION: {
				Implementation implementation = (Implementation)theEObject;
				T result = caseImplementation(implementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.COMPONENT_TYPE: {
				ComponentType componentType = (ComponentType)theEObject;
				T result = caseComponentType(componentType);
				if (result == null) result = caseComponentClassifier(componentType);
				if (result == null) result = caseClassifier(componentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.COMPONENT_CLASSIFIER: {
				ComponentClassifier componentClassifier = (ComponentClassifier)theEObject;
				T result = caseComponentClassifier(componentClassifier);
				if (result == null) result = caseClassifier(componentClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.CLASSIFIER: {
				Classifier classifier = (Classifier)theEObject;
				T result = caseClassifier(classifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.COMPONENT_IMPLEMENTATION: {
				ComponentImplementation componentImplementation = (ComponentImplementation)theEObject;
				T result = caseComponentImplementation(componentImplementation);
				if (result == null) result = caseComponentClassifier(componentImplementation);
				if (result == null) result = caseClassifier(componentImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.BUS_CLASSIFIER: {
				BusClassifier busClassifier = (BusClassifier)theEObject;
				T result = caseBusClassifier(busClassifier);
				if (result == null) result = caseModeAvailable(busClassifier);
				if (result == null) result = casePlatformClassifier(busClassifier);
				if (result == null) result = caseClassifier(busClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.PLATFORM_CLASSIFIER: {
				PlatformClassifier platformClassifier = (PlatformClassifier)theEObject;
				T result = casePlatformClassifier(platformClassifier);
				if (result == null) result = caseClassifier(platformClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.MODE_AVAILABLE: {
				ModeAvailable modeAvailable = (ModeAvailable)theEObject;
				T result = caseModeAvailable(modeAvailable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.MODE_STATE_MACHINE: {
				ModeStateMachine modeStateMachine = (ModeStateMachine)theEObject;
				T result = caseModeStateMachine(modeStateMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.MODE: {
				Mode mode = (Mode)theEObject;
				T result = caseMode(mode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.MODE_TRANSITION: {
				ModeTransition modeTransition = (ModeTransition)theEObject;
				T result = caseModeTransition(modeTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.MODE_TRANSITION_TRIGGER: {
				ModeTransitionTrigger modeTransitionTrigger = (ModeTransitionTrigger)theEObject;
				T result = caseModeTransitionTrigger(modeTransitionTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.EVENT_PORT: {
				EventPort eventPort = (EventPort)theEObject;
				T result = caseEventPort(eventPort);
				if (result == null) result = casePort(eventPort);
				if (result == null) result = caseProxyPort(eventPort);
				if (result == null) result = caseFeature(eventPort);
				if (result == null) result = caseClassifier(eventPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = caseProxyPort(port);
				if (result == null) result = caseFeature(port);
				if (result == null) result = caseClassifier(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseClassifier(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.PORT_DATA_FLOW_SPECIFICATION: {
				PortDataFlowSpecification portDataFlowSpecification = (PortDataFlowSpecification)theEObject;
				T result = casePortDataFlowSpecification(portDataFlowSpecification);
				if (result == null) result = caseDataFlowSpecification(portDataFlowSpecification);
				if (result == null) result = caseInterfaceBlock(portDataFlowSpecification);
				if (result == null) result = caseBlock(portDataFlowSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.DATA_FLOW_SPECIFICATION: {
				DataFlowSpecification dataFlowSpecification = (DataFlowSpecification)theEObject;
				T result = caseDataFlowSpecification(dataFlowSpecification);
				if (result == null) result = caseInterfaceBlock(dataFlowSpecification);
				if (result == null) result = caseBlock(dataFlowSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.DATA_CLASSIFIER: {
				DataClassifier dataClassifier = (DataClassifier)theEObject;
				T result = caseDataClassifier(dataClassifier);
				if (result == null) result = caseSoftwareClassifier(dataClassifier);
				if (result == null) result = caseClassifier(dataClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.SOFTWARE_CLASSIFIER: {
				SoftwareClassifier softwareClassifier = (SoftwareClassifier)theEObject;
				T result = caseSoftwareClassifier(softwareClassifier);
				if (result == null) result = caseClassifier(softwareClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.MODE_TRANSITION_TRIGGER_CONTEXT: {
				ModeTransitionTriggerContext modeTransitionTriggerContext = (ModeTransitionTriggerContext)theEObject;
				T result = caseModeTransitionTriggerContext(modeTransitionTriggerContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.DEVICE_CLASSIFIER: {
				DeviceClassifier deviceClassifier = (DeviceClassifier)theEObject;
				T result = caseDeviceClassifier(deviceClassifier);
				if (result == null) result = caseModeAvailable(deviceClassifier);
				if (result == null) result = casePlatformClassifier(deviceClassifier);
				if (result == null) result = caseClassifier(deviceClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.MEMORY_CLASSIFIER: {
				MemoryClassifier memoryClassifier = (MemoryClassifier)theEObject;
				T result = caseMemoryClassifier(memoryClassifier);
				if (result == null) result = caseModeAvailable(memoryClassifier);
				if (result == null) result = casePlatformClassifier(memoryClassifier);
				if (result == null) result = caseClassifier(memoryClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.PROCESS_CLASSIFIER: {
				ProcessClassifier processClassifier = (ProcessClassifier)theEObject;
				T result = caseProcessClassifier(processClassifier);
				if (result == null) result = caseModeAvailable(processClassifier);
				if (result == null) result = caseSoftwareClassifier(processClassifier);
				if (result == null) result = caseClassifier(processClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.PROCESSOR_CLASSIFIER: {
				ProcessorClassifier processorClassifier = (ProcessorClassifier)theEObject;
				T result = caseProcessorClassifier(processorClassifier);
				if (result == null) result = caseModeAvailable(processorClassifier);
				if (result == null) result = casePlatformClassifier(processorClassifier);
				if (result == null) result = caseClassifier(processorClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.SUBPROGRAM_CLASSIFIER: {
				SubprogramClassifier subprogramClassifier = (SubprogramClassifier)theEObject;
				T result = caseSubprogramClassifier(subprogramClassifier);
				if (result == null) result = caseModeAvailable(subprogramClassifier);
				if (result == null) result = caseSoftwareClassifier(subprogramClassifier);
				if (result == null) result = caseSubprogramInstance(subprogramClassifier);
				if (result == null) result = caseClassifier(subprogramClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.SUBPROGRAM_INSTANCE: {
				SubprogramInstance subprogramInstance = (SubprogramInstance)theEObject;
				T result = caseSubprogramInstance(subprogramInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.SYSTEM_CLASSIFIER: {
				SystemClassifier systemClassifier = (SystemClassifier)theEObject;
				T result = caseSystemClassifier(systemClassifier);
				if (result == null) result = caseModeAvailable(systemClassifier);
				if (result == null) result = caseClassifier(systemClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.THREAD_CLASSIFIER: {
				ThreadClassifier threadClassifier = (ThreadClassifier)theEObject;
				T result = caseThreadClassifier(threadClassifier);
				if (result == null) result = caseModeAvailable(threadClassifier);
				if (result == null) result = caseSoftwareClassifier(threadClassifier);
				if (result == null) result = caseClassifier(threadClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.BUS_IMPLEMENTATION: {
				BusImplementation busImplementation = (BusImplementation)theEObject;
				T result = caseBusImplementation(busImplementation);
				if (result == null) result = caseComponentImplementation(busImplementation);
				if (result == null) result = caseBlock(busImplementation);
				if (result == null) result = caseAnnexContaining(busImplementation);
				if (result == null) result = caseBusAccessConnectionContaining(busImplementation);
				if (result == null) result = caseBusClassifier(busImplementation);
				if (result == null) result = casePortConnectionContaining(busImplementation);
				if (result == null) result = caseComponentClassifier(busImplementation);
				if (result == null) result = caseModeAvailable(busImplementation);
				if (result == null) result = casePlatformClassifier(busImplementation);
				if (result == null) result = caseClassifier(busImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.PORT_CONNECTION_CONTAINING: {
				PortConnectionContaining portConnectionContaining = (PortConnectionContaining)theEObject;
				T result = casePortConnectionContaining(portConnectionContaining);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.PORT_CONNECTION: {
				PortConnection portConnection = (PortConnection)theEObject;
				T result = casePortConnection(portConnection);
				if (result == null) result = caseConnection(portConnection);
				if (result == null) result = caseClassifier(portConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = caseClassifier(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.PORT_AND_ACCESS_CONECTION_CONTEXT: {
				PortAndAccessConectionContext portAndAccessConectionContext = (PortAndAccessConectionContext)theEObject;
				T result = casePortAndAccessConectionContext(portAndAccessConectionContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.ANNEX_CONTAINING: {
				AnnexContaining annexContaining = (AnnexContaining)theEObject;
				T result = caseAnnexContaining(annexContaining);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.ANNEX: {
				Annex annex = (Annex)theEObject;
				T result = caseAnnex(annex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.BUS_ACCESS_CONNECTION_CONTAINING: {
				BusAccessConnectionContaining busAccessConnectionContaining = (BusAccessConnectionContaining)theEObject;
				T result = caseBusAccessConnectionContaining(busAccessConnectionContaining);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.BUS_CONNECTION: {
				BusConnection busConnection = (BusConnection)theEObject;
				T result = caseBusConnection(busConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.BUS_ACCESS_CONNECTION_END: {
				BusAccessConnectionEnd busAccessConnectionEnd = (BusAccessConnectionEnd)theEObject;
				T result = caseBusAccessConnectionEnd(busAccessConnectionEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.BUS_TYPE: {
				BusType busType = (BusType)theEObject;
				T result = caseBusType(busType);
				if (result == null) result = caseBlock(busType);
				if (result == null) result = caseComponentType(busType);
				if (result == null) result = caseAnnexContaining(busType);
				if (result == null) result = caseBusAccessContaining(busType);
				if (result == null) result = caseBusClassifier(busType);
				if (result == null) result = casePortContaining(busType);
				if (result == null) result = caseComponentClassifier(busType);
				if (result == null) result = caseModeAvailable(busType);
				if (result == null) result = casePlatformClassifier(busType);
				if (result == null) result = caseClassifier(busType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.PORT_CONTAINING: {
				PortContaining portContaining = (PortContaining)theEObject;
				T result = casePortContaining(portContaining);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.BUS_ACCESS_CONTAINING: {
				BusAccessContaining busAccessContaining = (BusAccessContaining)theEObject;
				T result = caseBusAccessContaining(busAccessContaining);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.BUS_ACCESS: {
				BusAccess busAccess = (BusAccess)theEObject;
				T result = caseBusAccess(busAccess);
				if (result == null) result = caseProxyPort(busAccess);
				if (result == null) result = caseBusAccessConnectionEnd(busAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.BUS_FLOW_SPECIFICATION: {
				BusFlowSpecification busFlowSpecification = (BusFlowSpecification)theEObject;
				T result = caseBusFlowSpecification(busFlowSpecification);
				if (result == null) result = caseInterfaceBlock(busFlowSpecification);
				if (result == null) result = caseBlock(busFlowSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.DATA_IMPLEMENTATION: {
				DataImplementation dataImplementation = (DataImplementation)theEObject;
				T result = caseDataImplementation(dataImplementation);
				if (result == null) result = caseComponentImplementation(dataImplementation);
				if (result == null) result = caseBlock(dataImplementation);
				if (result == null) result = caseAnnexContaining(dataImplementation);
				if (result == null) result = caseDataAccessConnectionContaining(dataImplementation);
				if (result == null) result = caseDataContaining(dataImplementation);
				if (result == null) result = caseSubprogramAccessConnectionContaining(dataImplementation);
				if (result == null) result = caseSubprogramContaining(dataImplementation);
				if (result == null) result = caseDataClassifier(dataImplementation);
				if (result == null) result = caseComponentClassifier(dataImplementation);
				if (result == null) result = caseSoftwareClassifier(dataImplementation);
				if (result == null) result = caseClassifier(dataImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.DATA_CONTAINING: {
				DataContaining dataContaining = (DataContaining)theEObject;
				T result = caseDataContaining(dataContaining);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.DATA_SUBCOMPONENT: {
				DataSubcomponent dataSubcomponent = (DataSubcomponent)theEObject;
				T result = caseDataSubcomponent(dataSubcomponent);
				if (result == null) result = caseSubcomponentClassifier(dataSubcomponent);
				if (result == null) result = caseDataAccessConnectionEnd(dataSubcomponent);
				if (result == null) result = caseClassifier(dataSubcomponent);
				if (result == null) result = caseModeTransitionTriggerContext(dataSubcomponent);
				if (result == null) result = casePortAndAccessConectionContext(dataSubcomponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.SUBCOMPONENT_CLASSIFIER: {
				SubcomponentClassifier subcomponentClassifier = (SubcomponentClassifier)theEObject;
				T result = caseSubcomponentClassifier(subcomponentClassifier);
				if (result == null) result = caseClassifier(subcomponentClassifier);
				if (result == null) result = caseModeTransitionTriggerContext(subcomponentClassifier);
				if (result == null) result = casePortAndAccessConectionContext(subcomponentClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.DATA_ACCESS_CONNECTION_END: {
				DataAccessConnectionEnd dataAccessConnectionEnd = (DataAccessConnectionEnd)theEObject;
				T result = caseDataAccessConnectionEnd(dataAccessConnectionEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.SUBPROGRAM_CONTAINING: {
				SubprogramContaining subprogramContaining = (SubprogramContaining)theEObject;
				T result = caseSubprogramContaining(subprogramContaining);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.SUBPROGRAM_SUBCOMPONENT: {
				SubprogramSubcomponent subprogramSubcomponent = (SubprogramSubcomponent)theEObject;
				T result = caseSubprogramSubcomponent(subprogramSubcomponent);
				if (result == null) result = caseSubcomponentClassifier(subprogramSubcomponent);
				if (result == null) result = caseSubprogramInstance(subprogramSubcomponent);
				if (result == null) result = caseClassifier(subprogramSubcomponent);
				if (result == null) result = caseModeTransitionTriggerContext(subprogramSubcomponent);
				if (result == null) result = casePortAndAccessConectionContext(subprogramSubcomponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.DATA_ACCESS_CONNECTION_CONTAINING: {
				DataAccessConnectionContaining dataAccessConnectionContaining = (DataAccessConnectionContaining)theEObject;
				T result = caseDataAccessConnectionContaining(dataAccessConnectionContaining);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.DATA_ACCESS_CONNECTION: {
				DataAccessConnection dataAccessConnection = (DataAccessConnection)theEObject;
				T result = caseDataAccessConnection(dataAccessConnection);
				if (result == null) result = caseBindingConnector(dataAccessConnection);
				if (result == null) result = caseConnection(dataAccessConnection);
				if (result == null) result = caseClassifier(dataAccessConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.SUBPROGRAM_ACCESS_CONNECTION_CONTAINING: {
				SubprogramAccessConnectionContaining subprogramAccessConnectionContaining = (SubprogramAccessConnectionContaining)theEObject;
				T result = caseSubprogramAccessConnectionContaining(subprogramAccessConnectionContaining);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.SUBPROGRAM_ACCESS_CONNECTION: {
				SubprogramAccessConnection subprogramAccessConnection = (SubprogramAccessConnection)theEObject;
				T result = caseSubprogramAccessConnection(subprogramAccessConnection);
				if (result == null) result = caseConnection(subprogramAccessConnection);
				if (result == null) result = caseClassifier(subprogramAccessConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.SUBPROGRAM_ACCESS: {
				SubprogramAccess subprogramAccess = (SubprogramAccess)theEObject;
				T result = caseSubprogramAccess(subprogramAccess);
				if (result == null) result = caseProxyPort(subprogramAccess);
				if (result == null) result = caseFeature(subprogramAccess);
				if (result == null) result = caseSubprogramInterface(subprogramAccess);
				if (result == null) result = caseClassifier(subprogramAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.SUBPROGRAM_INTERFACE: {
				SubprogramInterface subprogramInterface = (SubprogramInterface)theEObject;
				T result = caseSubprogramInterface(subprogramInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.SUBPROGRAM_SPECIFICATION: {
				SubprogramSpecification subprogramSpecification = (SubprogramSpecification)theEObject;
				T result = caseSubprogramSpecification(subprogramSpecification);
				if (result == null) result = caseInterfaceBlock(subprogramSpecification);
				if (result == null) result = caseBlock(subprogramSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseBlock(dataType);
				if (result == null) result = caseComponentType(dataType);
				if (result == null) result = caseAnnexContaining(dataType);
				if (result == null) result = caseDataAccessContaining(dataType);
				if (result == null) result = caseSubprogramAccessContaining(dataType);
				if (result == null) result = caseDataClassifier(dataType);
				if (result == null) result = caseSubprogramCallContext(dataType);
				if (result == null) result = caseComponentClassifier(dataType);
				if (result == null) result = caseSoftwareClassifier(dataType);
				if (result == null) result = caseClassifier(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.SUBPROGRAM_ACCESS_CONTAINING: {
				SubprogramAccessContaining subprogramAccessContaining = (SubprogramAccessContaining)theEObject;
				T result = caseSubprogramAccessContaining(subprogramAccessContaining);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.DATA_ACCESS_CONTAINING: {
				DataAccessContaining dataAccessContaining = (DataAccessContaining)theEObject;
				T result = caseDataAccessContaining(dataAccessContaining);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.DATA_ACCESS: {
				DataAccess dataAccess = (DataAccess)theEObject;
				T result = caseDataAccess(dataAccess);
				if (result == null) result = caseProxyPort(dataAccess);
				if (result == null) result = caseDataAccessConnectionEnd(dataAccess);
				if (result == null) result = caseFeature(dataAccess);
				if (result == null) result = caseClassifier(dataAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.SUBPROGRAM_CALL_CONTEXT: {
				SubprogramCallContext subprogramCallContext = (SubprogramCallContext)theEObject;
				T result = caseSubprogramCallContext(subprogramCallContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.DEVICE_IMPLEMENTATION: {
				DeviceImplementation deviceImplementation = (DeviceImplementation)theEObject;
				T result = caseDeviceImplementation(deviceImplementation);
				if (result == null) result = caseComponentImplementation(deviceImplementation);
				if (result == null) result = caseBlock(deviceImplementation);
				if (result == null) result = caseAnnexContaining(deviceImplementation);
				if (result == null) result = caseBusAccessConnectionContaining(deviceImplementation);
				if (result == null) result = caseBusContaining(deviceImplementation);
				if (result == null) result = caseDataContaining(deviceImplementation);
				if (result == null) result = caseDeviceClassifier(deviceImplementation);
				if (result == null) result = casePortConnectionContaining(deviceImplementation);
				if (result == null) result = caseSubprogramAccessConnectionContaining(deviceImplementation);
				if (result == null) result = caseComponentClassifier(deviceImplementation);
				if (result == null) result = caseModeAvailable(deviceImplementation);
				if (result == null) result = casePlatformClassifier(deviceImplementation);
				if (result == null) result = caseClassifier(deviceImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.BUS_CONTAINING: {
				BusContaining busContaining = (BusContaining)theEObject;
				T result = caseBusContaining(busContaining);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.BUS_SUBCOMPONENT: {
				BusSubcomponent busSubcomponent = (BusSubcomponent)theEObject;
				T result = caseBusSubcomponent(busSubcomponent);
				if (result == null) result = caseSubcomponentClassifier(busSubcomponent);
				if (result == null) result = caseBusAccessConnectionEnd(busSubcomponent);
				if (result == null) result = caseClassifier(busSubcomponent);
				if (result == null) result = caseModeTransitionTriggerContext(busSubcomponent);
				if (result == null) result = casePortAndAccessConectionContext(busSubcomponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.DEVICE_TYPE: {
				DeviceType deviceType = (DeviceType)theEObject;
				T result = caseDeviceType(deviceType);
				if (result == null) result = caseBlock(deviceType);
				if (result == null) result = caseComponentType(deviceType);
				if (result == null) result = caseAnnexContaining(deviceType);
				if (result == null) result = caseBusAccessContaining(deviceType);
				if (result == null) result = caseDeviceClassifier(deviceType);
				if (result == null) result = casePortContaining(deviceType);
				if (result == null) result = caseSubprogramAccessContaining(deviceType);
				if (result == null) result = caseComponentClassifier(deviceType);
				if (result == null) result = caseModeAvailable(deviceType);
				if (result == null) result = casePlatformClassifier(deviceType);
				if (result == null) result = caseClassifier(deviceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.MEMORY_IMPLEMENTATION: {
				MemoryImplementation memoryImplementation = (MemoryImplementation)theEObject;
				T result = caseMemoryImplementation(memoryImplementation);
				if (result == null) result = caseComponentImplementation(memoryImplementation);
				if (result == null) result = caseBlock(memoryImplementation);
				if (result == null) result = caseAnnexContaining(memoryImplementation);
				if (result == null) result = caseBusAccessConnectionContaining(memoryImplementation);
				if (result == null) result = caseBusContaining(memoryImplementation);
				if (result == null) result = caseMemoryClassifier(memoryImplementation);
				if (result == null) result = caseMemoryContaining(memoryImplementation);
				if (result == null) result = casePortConnectionContaining(memoryImplementation);
				if (result == null) result = caseComponentClassifier(memoryImplementation);
				if (result == null) result = caseModeAvailable(memoryImplementation);
				if (result == null) result = casePlatformClassifier(memoryImplementation);
				if (result == null) result = caseClassifier(memoryImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.MEMORY_CONTAINING: {
				MemoryContaining memoryContaining = (MemoryContaining)theEObject;
				T result = caseMemoryContaining(memoryContaining);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.MEMORY_SUBCOMPONENT: {
				MemorySubcomponent memorySubcomponent = (MemorySubcomponent)theEObject;
				T result = caseMemorySubcomponent(memorySubcomponent);
				if (result == null) result = caseSubcomponentClassifier(memorySubcomponent);
				if (result == null) result = caseClassifier(memorySubcomponent);
				if (result == null) result = caseModeTransitionTriggerContext(memorySubcomponent);
				if (result == null) result = casePortAndAccessConectionContext(memorySubcomponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.MEMORY_TYPE: {
				MemoryType memoryType = (MemoryType)theEObject;
				T result = caseMemoryType(memoryType);
				if (result == null) result = caseBlock(memoryType);
				if (result == null) result = caseComponentType(memoryType);
				if (result == null) result = caseAnnexContaining(memoryType);
				if (result == null) result = caseBusAccessContaining(memoryType);
				if (result == null) result = caseMemoryClassifier(memoryType);
				if (result == null) result = casePortContaining(memoryType);
				if (result == null) result = caseComponentClassifier(memoryType);
				if (result == null) result = caseModeAvailable(memoryType);
				if (result == null) result = casePlatformClassifier(memoryType);
				if (result == null) result = caseClassifier(memoryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.PROCESS_IMPLEMENTATION: {
				ProcessImplementation processImplementation = (ProcessImplementation)theEObject;
				T result = caseProcessImplementation(processImplementation);
				if (result == null) result = caseComponentImplementation(processImplementation);
				if (result == null) result = caseBlock(processImplementation);
				if (result == null) result = caseAnnexContaining(processImplementation);
				if (result == null) result = caseDataAccessConnectionContaining(processImplementation);
				if (result == null) result = caseDataContaining(processImplementation);
				if (result == null) result = casePortConnectionContaining(processImplementation);
				if (result == null) result = caseProcessClassifier(processImplementation);
				if (result == null) result = caseSubprogramAccessConnectionContaining(processImplementation);
				if (result == null) result = caseSubprogramContaining(processImplementation);
				if (result == null) result = caseThreadContaining(processImplementation);
				if (result == null) result = caseComponentClassifier(processImplementation);
				if (result == null) result = caseModeAvailable(processImplementation);
				if (result == null) result = caseSoftwareClassifier(processImplementation);
				if (result == null) result = caseClassifier(processImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.THREAD_CONTAINING: {
				ThreadContaining threadContaining = (ThreadContaining)theEObject;
				T result = caseThreadContaining(threadContaining);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.THREAD_SUBCOMPONENT: {
				ThreadSubcomponent threadSubcomponent = (ThreadSubcomponent)theEObject;
				T result = caseThreadSubcomponent(threadSubcomponent);
				if (result == null) result = caseSubcomponentClassifier(threadSubcomponent);
				if (result == null) result = caseClassifier(threadSubcomponent);
				if (result == null) result = caseModeTransitionTriggerContext(threadSubcomponent);
				if (result == null) result = casePortAndAccessConectionContext(threadSubcomponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.PROCESSOR_IMPLEMENTATION: {
				ProcessorImplementation processorImplementation = (ProcessorImplementation)theEObject;
				T result = caseProcessorImplementation(processorImplementation);
				if (result == null) result = caseComponentImplementation(processorImplementation);
				if (result == null) result = caseBlock(processorImplementation);
				if (result == null) result = caseAnnexContaining(processorImplementation);
				if (result == null) result = caseBusAccessConnectionContaining(processorImplementation);
				if (result == null) result = caseBusContaining(processorImplementation);
				if (result == null) result = caseMemoryContaining(processorImplementation);
				if (result == null) result = casePortConnectionContaining(processorImplementation);
				if (result == null) result = caseProcessorClassifier(processorImplementation);
				if (result == null) result = caseSubprogramAccessConnectionContaining(processorImplementation);
				if (result == null) result = caseComponentClassifier(processorImplementation);
				if (result == null) result = caseModeAvailable(processorImplementation);
				if (result == null) result = casePlatformClassifier(processorImplementation);
				if (result == null) result = caseClassifier(processorImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.PROCESSOR_TYPE: {
				ProcessorType processorType = (ProcessorType)theEObject;
				T result = caseProcessorType(processorType);
				if (result == null) result = caseBlock(processorType);
				if (result == null) result = caseComponentType(processorType);
				if (result == null) result = caseAnnexContaining(processorType);
				if (result == null) result = caseBusAccessContaining(processorType);
				if (result == null) result = casePortContaining(processorType);
				if (result == null) result = caseProcessorClassifier(processorType);
				if (result == null) result = caseSubprogramAccessContaining(processorType);
				if (result == null) result = caseComponentClassifier(processorType);
				if (result == null) result = caseModeAvailable(processorType);
				if (result == null) result = casePlatformClassifier(processorType);
				if (result == null) result = caseClassifier(processorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.PROCESS_TYPE: {
				ProcessType processType = (ProcessType)theEObject;
				T result = caseProcessType(processType);
				if (result == null) result = caseBlock(processType);
				if (result == null) result = caseComponentType(processType);
				if (result == null) result = caseAnnexContaining(processType);
				if (result == null) result = caseDataAccessContaining(processType);
				if (result == null) result = casePortContaining(processType);
				if (result == null) result = caseProcessClassifier(processType);
				if (result == null) result = caseComponentClassifier(processType);
				if (result == null) result = caseModeAvailable(processType);
				if (result == null) result = caseSoftwareClassifier(processType);
				if (result == null) result = caseClassifier(processType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.SUBPROGRAM_IMPLEMENTATION: {
				SubprogramImplementation subprogramImplementation = (SubprogramImplementation)theEObject;
				T result = caseSubprogramImplementation(subprogramImplementation);
				if (result == null) result = caseComponentImplementation(subprogramImplementation);
				if (result == null) result = caseAnnexContaining(subprogramImplementation);
				if (result == null) result = caseCallSequenceDescribable(subprogramImplementation);
				if (result == null) result = caseDataAccessConnectionContaining(subprogramImplementation);
				if (result == null) result = caseDataContaining(subprogramImplementation);
				if (result == null) result = caseParameterConnectionContaining(subprogramImplementation);
				if (result == null) result = casePortConnectionContaining(subprogramImplementation);
				if (result == null) result = caseSubprogramAccessConnectionContaining(subprogramImplementation);
				if (result == null) result = caseSubprogramClassifier(subprogramImplementation);
				if (result == null) result = caseSubprogramContaining(subprogramImplementation);
				if (result == null) result = caseComponentClassifier(subprogramImplementation);
				if (result == null) result = caseModeAvailable(subprogramImplementation);
				if (result == null) result = caseSoftwareClassifier(subprogramImplementation);
				if (result == null) result = caseSubprogramInstance(subprogramImplementation);
				if (result == null) result = caseClassifier(subprogramImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.PARAMETER_CONNECTION_CONTAINING: {
				ParameterConnectionContaining parameterConnectionContaining = (ParameterConnectionContaining)theEObject;
				T result = caseParameterConnectionContaining(parameterConnectionContaining);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.PARAMETER_CONNECTION: {
				ParameterConnection parameterConnection = (ParameterConnection)theEObject;
				T result = caseParameterConnection(parameterConnection);
				if (result == null) result = caseConnection(parameterConnection);
				if (result == null) result = caseClassifier(parameterConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.PARAMETER_CONNECTION_END: {
				ParameterConnectionEnd parameterConnectionEnd = (ParameterConnectionEnd)theEObject;
				T result = caseParameterConnectionEnd(parameterConnectionEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.PARAMETER_CONNECTION_CONTEXT: {
				ParameterConnectionContext parameterConnectionContext = (ParameterConnectionContext)theEObject;
				T result = caseParameterConnectionContext(parameterConnectionContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.CALL_SEQUENCE_DESCRIBABLE: {
				CallSequenceDescribable callSequenceDescribable = (CallSequenceDescribable)theEObject;
				T result = caseCallSequenceDescribable(callSequenceDescribable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.CALL_SEQUENCE: {
				CallSequence callSequence = (CallSequence)theEObject;
				T result = caseCallSequence(callSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.SUBPROGRAM_CALL: {
				SubprogramCall subprogramCall = (SubprogramCall)theEObject;
				T result = caseSubprogramCall(subprogramCall);
				if (result == null) result = caseParameterConnectionContext(subprogramCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.SUBPROGRAM_TYPE: {
				SubprogramType subprogramType = (SubprogramType)theEObject;
				T result = caseSubprogramType(subprogramType);
				if (result == null) result = caseComponentType(subprogramType);
				if (result == null) result = caseAnnexContaining(subprogramType);
				if (result == null) result = caseDataAccessContaining(subprogramType);
				if (result == null) result = caseParameterContaining(subprogramType);
				if (result == null) result = casePortContaining(subprogramType);
				if (result == null) result = caseSubprogramAccessContaining(subprogramType);
				if (result == null) result = caseSubprogramClassifier(subprogramType);
				if (result == null) result = caseComponentClassifier(subprogramType);
				if (result == null) result = caseModeAvailable(subprogramType);
				if (result == null) result = caseSoftwareClassifier(subprogramType);
				if (result == null) result = caseSubprogramInstance(subprogramType);
				if (result == null) result = caseClassifier(subprogramType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.PARAMETER_CONTAINING: {
				ParameterContaining parameterContaining = (ParameterContaining)theEObject;
				T result = caseParameterContaining(parameterContaining);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseFeature(parameter);
				if (result == null) result = caseParameterConnectionEnd(parameter);
				if (result == null) result = caseClassifier(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.SYSTEM_IMPLEMENTATION: {
				SystemImplementation systemImplementation = (SystemImplementation)theEObject;
				T result = caseSystemImplementation(systemImplementation);
				if (result == null) result = caseComponentImplementation(systemImplementation);
				if (result == null) result = caseBlock(systemImplementation);
				if (result == null) result = caseAnnexContaining(systemImplementation);
				if (result == null) result = caseBusAccessConnectionContaining(systemImplementation);
				if (result == null) result = caseBusContaining(systemImplementation);
				if (result == null) result = caseDataAccessConnectionContaining(systemImplementation);
				if (result == null) result = caseDataContaining(systemImplementation);
				if (result == null) result = caseDeviceContaining(systemImplementation);
				if (result == null) result = caseMemoryContaining(systemImplementation);
				if (result == null) result = casePortConnectionContaining(systemImplementation);
				if (result == null) result = caseProcessContaining(systemImplementation);
				if (result == null) result = caseProcessorContaining(systemImplementation);
				if (result == null) result = caseSubprogramAccessConnectionContaining(systemImplementation);
				if (result == null) result = caseSubprogramContaining(systemImplementation);
				if (result == null) result = caseSystemClassifier(systemImplementation);
				if (result == null) result = caseSystemContaining(systemImplementation);
				if (result == null) result = caseComponentClassifier(systemImplementation);
				if (result == null) result = caseModeAvailable(systemImplementation);
				if (result == null) result = caseClassifier(systemImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.PROCESS_CONTAINING: {
				ProcessContaining processContaining = (ProcessContaining)theEObject;
				T result = caseProcessContaining(processContaining);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.PROCESS_SUBCOMPONENT: {
				ProcessSubcomponent processSubcomponent = (ProcessSubcomponent)theEObject;
				T result = caseProcessSubcomponent(processSubcomponent);
				if (result == null) result = caseSubcomponentClassifier(processSubcomponent);
				if (result == null) result = caseClassifier(processSubcomponent);
				if (result == null) result = caseModeTransitionTriggerContext(processSubcomponent);
				if (result == null) result = casePortAndAccessConectionContext(processSubcomponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.PROCESSOR_CONTAINING: {
				ProcessorContaining processorContaining = (ProcessorContaining)theEObject;
				T result = caseProcessorContaining(processorContaining);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.PROCESSOR_SUBCOMPONENT: {
				ProcessorSubcomponent processorSubcomponent = (ProcessorSubcomponent)theEObject;
				T result = caseProcessorSubcomponent(processorSubcomponent);
				if (result == null) result = caseSubcomponentClassifier(processorSubcomponent);
				if (result == null) result = caseClassifier(processorSubcomponent);
				if (result == null) result = caseModeTransitionTriggerContext(processorSubcomponent);
				if (result == null) result = casePortAndAccessConectionContext(processorSubcomponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.SYSTEM_CONTAINING: {
				SystemContaining systemContaining = (SystemContaining)theEObject;
				T result = caseSystemContaining(systemContaining);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.SYSTEM_SUBCOMPONENT: {
				SystemSubcomponent systemSubcomponent = (SystemSubcomponent)theEObject;
				T result = caseSystemSubcomponent(systemSubcomponent);
				if (result == null) result = caseSubcomponentClassifier(systemSubcomponent);
				if (result == null) result = caseClassifier(systemSubcomponent);
				if (result == null) result = caseModeTransitionTriggerContext(systemSubcomponent);
				if (result == null) result = casePortAndAccessConectionContext(systemSubcomponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.DEVICE_CONTAINING: {
				DeviceContaining deviceContaining = (DeviceContaining)theEObject;
				T result = caseDeviceContaining(deviceContaining);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.DEVICE_SUBCOMPONENT: {
				DeviceSubcomponent deviceSubcomponent = (DeviceSubcomponent)theEObject;
				T result = caseDeviceSubcomponent(deviceSubcomponent);
				if (result == null) result = caseSubcomponentClassifier(deviceSubcomponent);
				if (result == null) result = caseClassifier(deviceSubcomponent);
				if (result == null) result = caseModeTransitionTriggerContext(deviceSubcomponent);
				if (result == null) result = casePortAndAccessConectionContext(deviceSubcomponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.SYSTEM_TYPE: {
				SystemType systemType = (SystemType)theEObject;
				T result = caseSystemType(systemType);
				if (result == null) result = caseBlock(systemType);
				if (result == null) result = caseComponentType(systemType);
				if (result == null) result = caseAnnexContaining(systemType);
				if (result == null) result = caseBusAccessContaining(systemType);
				if (result == null) result = caseDataAccessContaining(systemType);
				if (result == null) result = casePortContaining(systemType);
				if (result == null) result = caseSubprogramAccessContaining(systemType);
				if (result == null) result = caseSystemClassifier(systemType);
				if (result == null) result = caseComponentClassifier(systemType);
				if (result == null) result = caseModeAvailable(systemType);
				if (result == null) result = caseClassifier(systemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.THREAD_IMPLEMENTATION: {
				ThreadImplementation threadImplementation = (ThreadImplementation)theEObject;
				T result = caseThreadImplementation(threadImplementation);
				if (result == null) result = caseComponentImplementation(threadImplementation);
				if (result == null) result = caseBlock(threadImplementation);
				if (result == null) result = caseAnnexContaining(threadImplementation);
				if (result == null) result = caseCallSequenceDescribable(threadImplementation);
				if (result == null) result = caseDataAccessConnectionContaining(threadImplementation);
				if (result == null) result = caseDataContaining(threadImplementation);
				if (result == null) result = caseParameterConnectionContaining(threadImplementation);
				if (result == null) result = casePortConnectionContaining(threadImplementation);
				if (result == null) result = caseSubprogramAccessConnectionContaining(threadImplementation);
				if (result == null) result = caseSubprogramContaining(threadImplementation);
				if (result == null) result = caseThreadClassifier(threadImplementation);
				if (result == null) result = caseComponentClassifier(threadImplementation);
				if (result == null) result = caseModeAvailable(threadImplementation);
				if (result == null) result = caseSoftwareClassifier(threadImplementation);
				if (result == null) result = caseClassifier(threadImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.THREAD_TYPE: {
				ThreadType threadType = (ThreadType)theEObject;
				T result = caseThreadType(threadType);
				if (result == null) result = caseBlock(threadType);
				if (result == null) result = caseComponentType(threadType);
				if (result == null) result = caseAnnexContaining(threadType);
				if (result == null) result = caseDataAccessContaining(threadType);
				if (result == null) result = casePortContaining(threadType);
				if (result == null) result = caseSubprogramAccessContaining(threadType);
				if (result == null) result = caseThreadClassifier(threadType);
				if (result == null) result = caseComponentClassifier(threadType);
				if (result == null) result = caseModeAvailable(threadType);
				if (result == null) result = caseSoftwareClassifier(threadType);
				if (result == null) result = caseClassifier(threadType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.DATA_PORT: {
				DataPort dataPort = (DataPort)theEObject;
				T result = caseDataPort(dataPort);
				if (result == null) result = casePort(dataPort);
				if (result == null) result = caseParameterConnectionEnd(dataPort);
				if (result == null) result = caseProxyPort(dataPort);
				if (result == null) result = caseFeature(dataPort);
				if (result == null) result = caseClassifier(dataPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.EVENT_DATA_PORT: {
				EventDataPort eventDataPort = (EventDataPort)theEObject;
				T result = caseEventDataPort(eventDataPort);
				if (result == null) result = caseDataPort(eventDataPort);
				if (result == null) result = caseEventPort(eventDataPort);
				if (result == null) result = casePort(eventDataPort);
				if (result == null) result = caseParameterConnectionEnd(eventDataPort);
				if (result == null) result = caseProxyPort(eventDataPort);
				if (result == null) result = caseFeature(eventDataPort);
				if (result == null) result = caseClassifier(eventDataPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.NORMAL_MODE: {
				NormalMode normalMode = (NormalMode)theEObject;
				T result = caseNormalMode(normalMode);
				if (result == null) result = caseMode(normalMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.INITIAL_MODE: {
				InitialMode initialMode = (InitialMode)theEObject;
				T result = caseInitialMode(initialMode);
				if (result == null) result = caseMode(initialMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.SUBPROGRAM_INSTANCE_CALL: {
				SubprogramInstanceCall subprogramInstanceCall = (SubprogramInstanceCall)theEObject;
				T result = caseSubprogramInstanceCall(subprogramInstanceCall);
				if (result == null) result = caseSubprogramCall(subprogramInstanceCall);
				if (result == null) result = caseParameterConnectionContext(subprogramInstanceCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.SUBPROGRAM_INTERFACE_CALL: {
				SubprogramInterfaceCall subprogramInterfaceCall = (SubprogramInterfaceCall)theEObject;
				T result = caseSubprogramInterfaceCall(subprogramInterfaceCall);
				if (result == null) result = caseSubprogramCall(subprogramInterfaceCall);
				if (result == null) result = caseParameterConnectionContext(subprogramInterfaceCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AadlPackage.AADL_MODEL: {
				AadlModel aadlModel = (AadlModel)theEObject;
				T result = caseAadlModel(aadlModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtension(Extension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementation(Implementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentType(ComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentClassifier(ComponentClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifier(Classifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnex(Annex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Access Connection Containing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Access Connection Containing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusAccessConnectionContaining(BusAccessConnectionContaining object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusConnection(BusConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Access Connection End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Access Connection End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusAccessConnectionEnd(BusAccessConnectionEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusAccess(BusAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Flow Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Flow Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusFlowSpecification(BusFlowSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentImplementation(ComponentImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusClassifier(BusClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Platform Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Platform Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatformClassifier(PlatformClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Available</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Available</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeAvailable(ModeAvailable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMode(Mode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataClassifier(DataClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareClassifier(SoftwareClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceClassifier(DeviceClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryClassifier(MemoryClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessClassifier(ProcessClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processor Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processor Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessorClassifier(ProcessorClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subprogram Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subprogram Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubprogramClassifier(SubprogramClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subprogram Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subprogram Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubprogramInstance(SubprogramInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemClassifier(SystemClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thread Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thread Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreadClassifier(ThreadClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusImplementation(BusImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Connection Containing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Connection Containing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortConnectionContaining(PortConnectionContaining object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortConnection(PortConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Data Flow Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Data Flow Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortDataFlowSpecification(PortDataFlowSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Flow Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Flow Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFlowSpecification(DataFlowSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port And Access Conection Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port And Access Conection Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortAndAccessConectionContext(PortAndAccessConectionContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annex Containing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annex Containing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnexContaining(AnnexContaining object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusType(BusType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Containing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Containing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortContaining(PortContaining object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Access Containing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Access Containing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusAccessContaining(BusAccessContaining object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataImplementation(DataImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Containing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Containing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataContaining(DataContaining object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Subcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Subcomponent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSubcomponent(DataSubcomponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subcomponent Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subcomponent Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubcomponentClassifier(SubcomponentClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Transition Trigger Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Transition Trigger Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeTransitionTriggerContext(ModeTransitionTriggerContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Access Connection End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Access Connection End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAccessConnectionEnd(DataAccessConnectionEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subprogram Containing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subprogram Containing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubprogramContaining(SubprogramContaining object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subprogram Subcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subprogram Subcomponent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubprogramSubcomponent(SubprogramSubcomponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Access Connection Containing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Access Connection Containing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAccessConnectionContaining(DataAccessConnectionContaining object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Access Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Access Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAccessConnection(DataAccessConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAccess(DataAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subprogram Access Connection Containing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subprogram Access Connection Containing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubprogramAccessConnectionContaining(SubprogramAccessConnectionContaining object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subprogram Access Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subprogram Access Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubprogramAccessConnection(SubprogramAccessConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subprogram Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subprogram Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubprogramAccess(SubprogramAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subprogram Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subprogram Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubprogramInterface(SubprogramInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subprogram Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subprogram Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubprogramSpecification(SubprogramSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subprogram Access Containing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subprogram Access Containing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubprogramAccessContaining(SubprogramAccessContaining object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Access Containing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Access Containing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAccessContaining(DataAccessContaining object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subprogram Call Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subprogram Call Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubprogramCallContext(SubprogramCallContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceImplementation(DeviceImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Containing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Containing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusContaining(BusContaining object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Subcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Subcomponent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusSubcomponent(BusSubcomponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceType(DeviceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryImplementation(MemoryImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Containing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Containing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryContaining(MemoryContaining object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Subcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Subcomponent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemorySubcomponent(MemorySubcomponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryType(MemoryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessImplementation(ProcessImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thread Containing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thread Containing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreadContaining(ThreadContaining object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thread Subcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thread Subcomponent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreadSubcomponent(ThreadSubcomponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Connection Containing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Connection Containing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterConnectionContaining(ParameterConnectionContaining object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterConnection(ParameterConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Connection End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Connection End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterConnectionEnd(ParameterConnectionEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Connection Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Connection Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterConnectionContext(ParameterConnectionContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processor Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processor Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessorImplementation(ProcessorImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processor Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processor Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessorType(ProcessorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessType(ProcessType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Containing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Containing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterContaining(ParameterContaining object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subprogram Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subprogram Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubprogramImplementation(SubprogramImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Sequence Describable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Sequence Describable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallSequenceDescribable(CallSequenceDescribable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallSequence(CallSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subprogram Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subprogram Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubprogramCall(SubprogramCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subprogram Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subprogram Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubprogramType(SubprogramType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemImplementation(SystemImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Containing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Containing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessContaining(ProcessContaining object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Subcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Subcomponent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessSubcomponent(ProcessSubcomponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processor Containing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processor Containing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessorContaining(ProcessorContaining object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processor Subcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processor Subcomponent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessorSubcomponent(ProcessorSubcomponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Containing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Containing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemContaining(SystemContaining object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Subcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Subcomponent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemSubcomponent(SystemSubcomponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Containing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Containing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceContaining(DeviceContaining object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Subcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Subcomponent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceSubcomponent(DeviceSubcomponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemType(SystemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thread Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thread Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreadImplementation(ThreadImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thread Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thread Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreadType(ThreadType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPort(DataPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventPort(EventPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Data Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Data Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventDataPort(EventDataPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode State Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeStateMachine(ModeStateMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeTransition(ModeTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Transition Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Transition Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeTransitionTrigger(ModeTransitionTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normal Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normal Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormalMode(NormalMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialMode(InitialMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subprogram Instance Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subprogram Instance Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubprogramInstanceCall(SubprogramInstanceCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subprogram Interface Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subprogram Interface Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubprogramInterfaceCall(SubprogramInterfaceCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAadlModel(AadlModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proxy Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proxy Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProxyPort(ProxyPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceBlock(InterfaceBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingConnector(BindingConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AadlSwitch
