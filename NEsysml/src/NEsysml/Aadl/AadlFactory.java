/**
 */
package NEsysml.Aadl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see NEsysml.Aadl.AadlPackage
 * @generated
 */
public interface AadlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AadlFactory eINSTANCE = NEsysml.Aadl.impl.AadlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extension</em>'.
	 * @generated
	 */
	Extension createExtension();

	/**
	 * Returns a new object of class '<em>Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation</em>'.
	 * @generated
	 */
	Implementation createImplementation();

	/**
	 * Returns a new object of class '<em>Bus Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus Implementation</em>'.
	 * @generated
	 */
	BusImplementation createBusImplementation();

	/**
	 * Returns a new object of class '<em>Port Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Connection</em>'.
	 * @generated
	 */
	PortConnection createPortConnection();

	/**
	 * Returns a new object of class '<em>Bus Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus Connection</em>'.
	 * @generated
	 */
	BusConnection createBusConnection();

	/**
	 * Returns a new object of class '<em>Bus Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus Access</em>'.
	 * @generated
	 */
	BusAccess createBusAccess();

	/**
	 * Returns a new object of class '<em>Bus Flow Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus Flow Specification</em>'.
	 * @generated
	 */
	BusFlowSpecification createBusFlowSpecification();

	/**
	 * Returns a new object of class '<em>Port Data Flow Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Data Flow Specification</em>'.
	 * @generated
	 */
	PortDataFlowSpecification createPortDataFlowSpecification();

	/**
	 * Returns a new object of class '<em>Data Flow Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Flow Specification</em>'.
	 * @generated
	 */
	DataFlowSpecification createDataFlowSpecification();

	/**
	 * Returns a new object of class '<em>Bus Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus Type</em>'.
	 * @generated
	 */
	BusType createBusType();

	/**
	 * Returns a new object of class '<em>Data Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Implementation</em>'.
	 * @generated
	 */
	DataImplementation createDataImplementation();

	/**
	 * Returns a new object of class '<em>Data Subcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Subcomponent</em>'.
	 * @generated
	 */
	DataSubcomponent createDataSubcomponent();

	/**
	 * Returns a new object of class '<em>Subprogram Subcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subprogram Subcomponent</em>'.
	 * @generated
	 */
	SubprogramSubcomponent createSubprogramSubcomponent();

	/**
	 * Returns a new object of class '<em>Data Access Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Access Connection</em>'.
	 * @generated
	 */
	DataAccessConnection createDataAccessConnection();

	/**
	 * Returns a new object of class '<em>Data Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Access</em>'.
	 * @generated
	 */
	DataAccess createDataAccess();

	/**
	 * Returns a new object of class '<em>Subprogram Access Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subprogram Access Connection</em>'.
	 * @generated
	 */
	SubprogramAccessConnection createSubprogramAccessConnection();

	/**
	 * Returns a new object of class '<em>Subprogram Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subprogram Access</em>'.
	 * @generated
	 */
	SubprogramAccess createSubprogramAccess();

	/**
	 * Returns a new object of class '<em>Subprogram Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subprogram Specification</em>'.
	 * @generated
	 */
	SubprogramSpecification createSubprogramSpecification();

	/**
	 * Returns a new object of class '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type</em>'.
	 * @generated
	 */
	DataType createDataType();

	/**
	 * Returns a new object of class '<em>Device Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Implementation</em>'.
	 * @generated
	 */
	DeviceImplementation createDeviceImplementation();

	/**
	 * Returns a new object of class '<em>Bus Subcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus Subcomponent</em>'.
	 * @generated
	 */
	BusSubcomponent createBusSubcomponent();

	/**
	 * Returns a new object of class '<em>Device Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Type</em>'.
	 * @generated
	 */
	DeviceType createDeviceType();

	/**
	 * Returns a new object of class '<em>Memory Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory Implementation</em>'.
	 * @generated
	 */
	MemoryImplementation createMemoryImplementation();

	/**
	 * Returns a new object of class '<em>Memory Subcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory Subcomponent</em>'.
	 * @generated
	 */
	MemorySubcomponent createMemorySubcomponent();

	/**
	 * Returns a new object of class '<em>Memory Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory Type</em>'.
	 * @generated
	 */
	MemoryType createMemoryType();

	/**
	 * Returns a new object of class '<em>Process Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Implementation</em>'.
	 * @generated
	 */
	ProcessImplementation createProcessImplementation();

	/**
	 * Returns a new object of class '<em>Thread Subcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thread Subcomponent</em>'.
	 * @generated
	 */
	ThreadSubcomponent createThreadSubcomponent();

	/**
	 * Returns a new object of class '<em>Parameter Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Connection</em>'.
	 * @generated
	 */
	ParameterConnection createParameterConnection();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Processor Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processor Implementation</em>'.
	 * @generated
	 */
	ProcessorImplementation createProcessorImplementation();

	/**
	 * Returns a new object of class '<em>Processor Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processor Type</em>'.
	 * @generated
	 */
	ProcessorType createProcessorType();

	/**
	 * Returns a new object of class '<em>Process Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Type</em>'.
	 * @generated
	 */
	ProcessType createProcessType();

	/**
	 * Returns a new object of class '<em>Subprogram Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subprogram Implementation</em>'.
	 * @generated
	 */
	SubprogramImplementation createSubprogramImplementation();

	/**
	 * Returns a new object of class '<em>Call Sequence Describable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Sequence Describable</em>'.
	 * @generated
	 */
	CallSequenceDescribable createCallSequenceDescribable();

	/**
	 * Returns a new object of class '<em>Call Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Sequence</em>'.
	 * @generated
	 */
	CallSequence createCallSequence();

	/**
	 * Returns a new object of class '<em>Subprogram Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subprogram Type</em>'.
	 * @generated
	 */
	SubprogramType createSubprogramType();

	/**
	 * Returns a new object of class '<em>System Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Implementation</em>'.
	 * @generated
	 */
	SystemImplementation createSystemImplementation();

	/**
	 * Returns a new object of class '<em>Process Subcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Subcomponent</em>'.
	 * @generated
	 */
	ProcessSubcomponent createProcessSubcomponent();

	/**
	 * Returns a new object of class '<em>Processor Subcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processor Subcomponent</em>'.
	 * @generated
	 */
	ProcessorSubcomponent createProcessorSubcomponent();

	/**
	 * Returns a new object of class '<em>System Subcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Subcomponent</em>'.
	 * @generated
	 */
	SystemSubcomponent createSystemSubcomponent();

	/**
	 * Returns a new object of class '<em>Device Containing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Containing</em>'.
	 * @generated
	 */
	DeviceContaining createDeviceContaining();

	/**
	 * Returns a new object of class '<em>Device Subcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Subcomponent</em>'.
	 * @generated
	 */
	DeviceSubcomponent createDeviceSubcomponent();

	/**
	 * Returns a new object of class '<em>System Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Type</em>'.
	 * @generated
	 */
	SystemType createSystemType();

	/**
	 * Returns a new object of class '<em>Thread Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thread Implementation</em>'.
	 * @generated
	 */
	ThreadImplementation createThreadImplementation();

	/**
	 * Returns a new object of class '<em>Thread Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thread Type</em>'.
	 * @generated
	 */
	ThreadType createThreadType();

	/**
	 * Returns a new object of class '<em>Data Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Port</em>'.
	 * @generated
	 */
	DataPort createDataPort();

	/**
	 * Returns a new object of class '<em>Event Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Port</em>'.
	 * @generated
	 */
	EventPort createEventPort();

	/**
	 * Returns a new object of class '<em>Event Data Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Data Port</em>'.
	 * @generated
	 */
	EventDataPort createEventDataPort();

	/**
	 * Returns a new object of class '<em>Mode State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode State Machine</em>'.
	 * @generated
	 */
	ModeStateMachine createModeStateMachine();

	/**
	 * Returns a new object of class '<em>Mode Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode Transition</em>'.
	 * @generated
	 */
	ModeTransition createModeTransition();

	/**
	 * Returns a new object of class '<em>Mode Transition Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode Transition Trigger</em>'.
	 * @generated
	 */
	ModeTransitionTrigger createModeTransitionTrigger();

	/**
	 * Returns a new object of class '<em>Normal Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normal Mode</em>'.
	 * @generated
	 */
	NormalMode createNormalMode();

	/**
	 * Returns a new object of class '<em>Initial Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial Mode</em>'.
	 * @generated
	 */
	InitialMode createInitialMode();

	/**
	 * Returns a new object of class '<em>Subprogram Instance Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subprogram Instance Call</em>'.
	 * @generated
	 */
	SubprogramInstanceCall createSubprogramInstanceCall();

	/**
	 * Returns a new object of class '<em>Subprogram Interface Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subprogram Interface Call</em>'.
	 * @generated
	 */
	SubprogramInterfaceCall createSubprogramInterfaceCall();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	AadlModel createAadlModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AadlPackage getAadlPackage();

} //AadlFactory
