/**
 */
package NEsysml.Aadl.util;

import NEsysml.Aadl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.papyrus.sysml14.blocks.BindingConnector;
import org.eclipse.papyrus.sysml14.blocks.Block;

import org.eclipse.papyrus.sysml14.portsandflows.InterfaceBlock;
import org.eclipse.papyrus.sysml14.portsandflows.ProxyPort;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see NEsysml.Aadl.AadlPackage
 * @generated
 */
public class AadlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AadlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AadlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AadlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AadlSwitch<Adapter> modelSwitch =
		new AadlSwitch<Adapter>() {
			@Override
			public Adapter caseExtension(Extension object) {
				return createExtensionAdapter();
			}
			@Override
			public Adapter caseImplementation(Implementation object) {
				return createImplementationAdapter();
			}
			@Override
			public Adapter caseComponentType(ComponentType object) {
				return createComponentTypeAdapter();
			}
			@Override
			public Adapter caseComponentClassifier(ComponentClassifier object) {
				return createComponentClassifierAdapter();
			}
			@Override
			public Adapter caseClassifier(Classifier object) {
				return createClassifierAdapter();
			}
			@Override
			public Adapter caseComponentImplementation(ComponentImplementation object) {
				return createComponentImplementationAdapter();
			}
			@Override
			public Adapter caseBusClassifier(BusClassifier object) {
				return createBusClassifierAdapter();
			}
			@Override
			public Adapter casePlatformClassifier(PlatformClassifier object) {
				return createPlatformClassifierAdapter();
			}
			@Override
			public Adapter caseModeAvailable(ModeAvailable object) {
				return createModeAvailableAdapter();
			}
			@Override
			public Adapter caseModeStateMachine(ModeStateMachine object) {
				return createModeStateMachineAdapter();
			}
			@Override
			public Adapter caseMode(Mode object) {
				return createModeAdapter();
			}
			@Override
			public Adapter caseModeTransition(ModeTransition object) {
				return createModeTransitionAdapter();
			}
			@Override
			public Adapter caseModeTransitionTrigger(ModeTransitionTrigger object) {
				return createModeTransitionTriggerAdapter();
			}
			@Override
			public Adapter caseEventPort(EventPort object) {
				return createEventPortAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter casePortDataFlowSpecification(PortDataFlowSpecification object) {
				return createPortDataFlowSpecificationAdapter();
			}
			@Override
			public Adapter caseDataFlowSpecification(DataFlowSpecification object) {
				return createDataFlowSpecificationAdapter();
			}
			@Override
			public Adapter caseDataClassifier(DataClassifier object) {
				return createDataClassifierAdapter();
			}
			@Override
			public Adapter caseSoftwareClassifier(SoftwareClassifier object) {
				return createSoftwareClassifierAdapter();
			}
			@Override
			public Adapter caseModeTransitionTriggerContext(ModeTransitionTriggerContext object) {
				return createModeTransitionTriggerContextAdapter();
			}
			@Override
			public Adapter caseDeviceClassifier(DeviceClassifier object) {
				return createDeviceClassifierAdapter();
			}
			@Override
			public Adapter caseMemoryClassifier(MemoryClassifier object) {
				return createMemoryClassifierAdapter();
			}
			@Override
			public Adapter caseProcessClassifier(ProcessClassifier object) {
				return createProcessClassifierAdapter();
			}
			@Override
			public Adapter caseProcessorClassifier(ProcessorClassifier object) {
				return createProcessorClassifierAdapter();
			}
			@Override
			public Adapter caseSubprogramClassifier(SubprogramClassifier object) {
				return createSubprogramClassifierAdapter();
			}
			@Override
			public Adapter caseSubprogramInstance(SubprogramInstance object) {
				return createSubprogramInstanceAdapter();
			}
			@Override
			public Adapter caseSystemClassifier(SystemClassifier object) {
				return createSystemClassifierAdapter();
			}
			@Override
			public Adapter caseThreadClassifier(ThreadClassifier object) {
				return createThreadClassifierAdapter();
			}
			@Override
			public Adapter caseBusImplementation(BusImplementation object) {
				return createBusImplementationAdapter();
			}
			@Override
			public Adapter casePortConnectionContaining(PortConnectionContaining object) {
				return createPortConnectionContainingAdapter();
			}
			@Override
			public Adapter casePortConnection(PortConnection object) {
				return createPortConnectionAdapter();
			}
			@Override
			public Adapter caseConnection(Connection object) {
				return createConnectionAdapter();
			}
			@Override
			public Adapter casePortAndAccessConectionContext(PortAndAccessConectionContext object) {
				return createPortAndAccessConectionContextAdapter();
			}
			@Override
			public Adapter caseAnnexContaining(AnnexContaining object) {
				return createAnnexContainingAdapter();
			}
			@Override
			public Adapter caseAnnex(Annex object) {
				return createAnnexAdapter();
			}
			@Override
			public Adapter caseBusAccessConnectionContaining(BusAccessConnectionContaining object) {
				return createBusAccessConnectionContainingAdapter();
			}
			@Override
			public Adapter caseBusConnection(BusConnection object) {
				return createBusConnectionAdapter();
			}
			@Override
			public Adapter caseBusAccessConnectionEnd(BusAccessConnectionEnd object) {
				return createBusAccessConnectionEndAdapter();
			}
			@Override
			public Adapter caseBusType(BusType object) {
				return createBusTypeAdapter();
			}
			@Override
			public Adapter casePortContaining(PortContaining object) {
				return createPortContainingAdapter();
			}
			@Override
			public Adapter caseBusAccessContaining(BusAccessContaining object) {
				return createBusAccessContainingAdapter();
			}
			@Override
			public Adapter caseBusAccess(BusAccess object) {
				return createBusAccessAdapter();
			}
			@Override
			public Adapter caseBusFlowSpecification(BusFlowSpecification object) {
				return createBusFlowSpecificationAdapter();
			}
			@Override
			public Adapter caseDataImplementation(DataImplementation object) {
				return createDataImplementationAdapter();
			}
			@Override
			public Adapter caseDataContaining(DataContaining object) {
				return createDataContainingAdapter();
			}
			@Override
			public Adapter caseDataSubcomponent(DataSubcomponent object) {
				return createDataSubcomponentAdapter();
			}
			@Override
			public Adapter caseSubcomponentClassifier(SubcomponentClassifier object) {
				return createSubcomponentClassifierAdapter();
			}
			@Override
			public Adapter caseDataAccessConnectionEnd(DataAccessConnectionEnd object) {
				return createDataAccessConnectionEndAdapter();
			}
			@Override
			public Adapter caseSubprogramContaining(SubprogramContaining object) {
				return createSubprogramContainingAdapter();
			}
			@Override
			public Adapter caseSubprogramSubcomponent(SubprogramSubcomponent object) {
				return createSubprogramSubcomponentAdapter();
			}
			@Override
			public Adapter caseDataAccessConnectionContaining(DataAccessConnectionContaining object) {
				return createDataAccessConnectionContainingAdapter();
			}
			@Override
			public Adapter caseDataAccessConnection(DataAccessConnection object) {
				return createDataAccessConnectionAdapter();
			}
			@Override
			public Adapter caseSubprogramAccessConnectionContaining(SubprogramAccessConnectionContaining object) {
				return createSubprogramAccessConnectionContainingAdapter();
			}
			@Override
			public Adapter caseSubprogramAccessConnection(SubprogramAccessConnection object) {
				return createSubprogramAccessConnectionAdapter();
			}
			@Override
			public Adapter caseSubprogramAccess(SubprogramAccess object) {
				return createSubprogramAccessAdapter();
			}
			@Override
			public Adapter caseSubprogramInterface(SubprogramInterface object) {
				return createSubprogramInterfaceAdapter();
			}
			@Override
			public Adapter caseSubprogramSpecification(SubprogramSpecification object) {
				return createSubprogramSpecificationAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseSubprogramAccessContaining(SubprogramAccessContaining object) {
				return createSubprogramAccessContainingAdapter();
			}
			@Override
			public Adapter caseDataAccessContaining(DataAccessContaining object) {
				return createDataAccessContainingAdapter();
			}
			@Override
			public Adapter caseDataAccess(DataAccess object) {
				return createDataAccessAdapter();
			}
			@Override
			public Adapter caseSubprogramCallContext(SubprogramCallContext object) {
				return createSubprogramCallContextAdapter();
			}
			@Override
			public Adapter caseDeviceImplementation(DeviceImplementation object) {
				return createDeviceImplementationAdapter();
			}
			@Override
			public Adapter caseBusContaining(BusContaining object) {
				return createBusContainingAdapter();
			}
			@Override
			public Adapter caseBusSubcomponent(BusSubcomponent object) {
				return createBusSubcomponentAdapter();
			}
			@Override
			public Adapter caseDeviceType(DeviceType object) {
				return createDeviceTypeAdapter();
			}
			@Override
			public Adapter caseMemoryImplementation(MemoryImplementation object) {
				return createMemoryImplementationAdapter();
			}
			@Override
			public Adapter caseMemoryContaining(MemoryContaining object) {
				return createMemoryContainingAdapter();
			}
			@Override
			public Adapter caseMemorySubcomponent(MemorySubcomponent object) {
				return createMemorySubcomponentAdapter();
			}
			@Override
			public Adapter caseMemoryType(MemoryType object) {
				return createMemoryTypeAdapter();
			}
			@Override
			public Adapter caseProcessImplementation(ProcessImplementation object) {
				return createProcessImplementationAdapter();
			}
			@Override
			public Adapter caseThreadContaining(ThreadContaining object) {
				return createThreadContainingAdapter();
			}
			@Override
			public Adapter caseThreadSubcomponent(ThreadSubcomponent object) {
				return createThreadSubcomponentAdapter();
			}
			@Override
			public Adapter caseProcessorImplementation(ProcessorImplementation object) {
				return createProcessorImplementationAdapter();
			}
			@Override
			public Adapter caseProcessorType(ProcessorType object) {
				return createProcessorTypeAdapter();
			}
			@Override
			public Adapter caseProcessType(ProcessType object) {
				return createProcessTypeAdapter();
			}
			@Override
			public Adapter caseSubprogramImplementation(SubprogramImplementation object) {
				return createSubprogramImplementationAdapter();
			}
			@Override
			public Adapter caseParameterConnectionContaining(ParameterConnectionContaining object) {
				return createParameterConnectionContainingAdapter();
			}
			@Override
			public Adapter caseParameterConnection(ParameterConnection object) {
				return createParameterConnectionAdapter();
			}
			@Override
			public Adapter caseParameterConnectionEnd(ParameterConnectionEnd object) {
				return createParameterConnectionEndAdapter();
			}
			@Override
			public Adapter caseParameterConnectionContext(ParameterConnectionContext object) {
				return createParameterConnectionContextAdapter();
			}
			@Override
			public Adapter caseCallSequenceDescribable(CallSequenceDescribable object) {
				return createCallSequenceDescribableAdapter();
			}
			@Override
			public Adapter caseCallSequence(CallSequence object) {
				return createCallSequenceAdapter();
			}
			@Override
			public Adapter caseSubprogramCall(SubprogramCall object) {
				return createSubprogramCallAdapter();
			}
			@Override
			public Adapter caseSubprogramType(SubprogramType object) {
				return createSubprogramTypeAdapter();
			}
			@Override
			public Adapter caseParameterContaining(ParameterContaining object) {
				return createParameterContainingAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseSystemImplementation(SystemImplementation object) {
				return createSystemImplementationAdapter();
			}
			@Override
			public Adapter caseProcessContaining(ProcessContaining object) {
				return createProcessContainingAdapter();
			}
			@Override
			public Adapter caseProcessSubcomponent(ProcessSubcomponent object) {
				return createProcessSubcomponentAdapter();
			}
			@Override
			public Adapter caseProcessorContaining(ProcessorContaining object) {
				return createProcessorContainingAdapter();
			}
			@Override
			public Adapter caseProcessorSubcomponent(ProcessorSubcomponent object) {
				return createProcessorSubcomponentAdapter();
			}
			@Override
			public Adapter caseSystemContaining(SystemContaining object) {
				return createSystemContainingAdapter();
			}
			@Override
			public Adapter caseSystemSubcomponent(SystemSubcomponent object) {
				return createSystemSubcomponentAdapter();
			}
			@Override
			public Adapter caseDeviceContaining(DeviceContaining object) {
				return createDeviceContainingAdapter();
			}
			@Override
			public Adapter caseDeviceSubcomponent(DeviceSubcomponent object) {
				return createDeviceSubcomponentAdapter();
			}
			@Override
			public Adapter caseSystemType(SystemType object) {
				return createSystemTypeAdapter();
			}
			@Override
			public Adapter caseThreadImplementation(ThreadImplementation object) {
				return createThreadImplementationAdapter();
			}
			@Override
			public Adapter caseThreadType(ThreadType object) {
				return createThreadTypeAdapter();
			}
			@Override
			public Adapter caseDataPort(DataPort object) {
				return createDataPortAdapter();
			}
			@Override
			public Adapter caseEventDataPort(EventDataPort object) {
				return createEventDataPortAdapter();
			}
			@Override
			public Adapter caseNormalMode(NormalMode object) {
				return createNormalModeAdapter();
			}
			@Override
			public Adapter caseInitialMode(InitialMode object) {
				return createInitialModeAdapter();
			}
			@Override
			public Adapter caseSubprogramInstanceCall(SubprogramInstanceCall object) {
				return createSubprogramInstanceCallAdapter();
			}
			@Override
			public Adapter caseSubprogramInterfaceCall(SubprogramInterfaceCall object) {
				return createSubprogramInterfaceCallAdapter();
			}
			@Override
			public Adapter caseAadlModel(AadlModel object) {
				return createAadlModelAdapter();
			}
			@Override
			public Adapter caseProxyPort(ProxyPort object) {
				return createProxyPortAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter caseInterfaceBlock(InterfaceBlock object) {
				return createInterfaceBlockAdapter();
			}
			@Override
			public Adapter caseBindingConnector(BindingConnector object) {
				return createBindingConnectorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.Extension
	 * @generated
	 */
	public Adapter createExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.Implementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.Implementation
	 * @generated
	 */
	public Adapter createImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.ComponentType
	 * @generated
	 */
	public Adapter createComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.ComponentClassifier <em>Component Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.ComponentClassifier
	 * @generated
	 */
	public Adapter createComponentClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.Classifier
	 * @generated
	 */
	public Adapter createClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.Annex <em>Annex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.Annex
	 * @generated
	 */
	public Adapter createAnnexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.BusAccessConnectionContaining <em>Bus Access Connection Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.BusAccessConnectionContaining
	 * @generated
	 */
	public Adapter createBusAccessConnectionContainingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.BusConnection <em>Bus Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.BusConnection
	 * @generated
	 */
	public Adapter createBusConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.BusAccessConnectionEnd <em>Bus Access Connection End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.BusAccessConnectionEnd
	 * @generated
	 */
	public Adapter createBusAccessConnectionEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.BusAccess <em>Bus Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.BusAccess
	 * @generated
	 */
	public Adapter createBusAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.BusFlowSpecification <em>Bus Flow Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.BusFlowSpecification
	 * @generated
	 */
	public Adapter createBusFlowSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.ComponentImplementation <em>Component Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.ComponentImplementation
	 * @generated
	 */
	public Adapter createComponentImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.BusClassifier <em>Bus Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.BusClassifier
	 * @generated
	 */
	public Adapter createBusClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.PlatformClassifier <em>Platform Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.PlatformClassifier
	 * @generated
	 */
	public Adapter createPlatformClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.ModeAvailable <em>Mode Available</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.ModeAvailable
	 * @generated
	 */
	public Adapter createModeAvailableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.Mode
	 * @generated
	 */
	public Adapter createModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.DataClassifier <em>Data Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.DataClassifier
	 * @generated
	 */
	public Adapter createDataClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.SoftwareClassifier <em>Software Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.SoftwareClassifier
	 * @generated
	 */
	public Adapter createSoftwareClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.DeviceClassifier <em>Device Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.DeviceClassifier
	 * @generated
	 */
	public Adapter createDeviceClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.MemoryClassifier <em>Memory Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.MemoryClassifier
	 * @generated
	 */
	public Adapter createMemoryClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.ProcessClassifier <em>Process Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.ProcessClassifier
	 * @generated
	 */
	public Adapter createProcessClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.ProcessorClassifier <em>Processor Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.ProcessorClassifier
	 * @generated
	 */
	public Adapter createProcessorClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.SubprogramClassifier <em>Subprogram Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.SubprogramClassifier
	 * @generated
	 */
	public Adapter createSubprogramClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.SubprogramInstance <em>Subprogram Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.SubprogramInstance
	 * @generated
	 */
	public Adapter createSubprogramInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.SystemClassifier <em>System Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.SystemClassifier
	 * @generated
	 */
	public Adapter createSystemClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.ThreadClassifier <em>Thread Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.ThreadClassifier
	 * @generated
	 */
	public Adapter createThreadClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.BusImplementation <em>Bus Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.BusImplementation
	 * @generated
	 */
	public Adapter createBusImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.PortConnectionContaining <em>Port Connection Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.PortConnectionContaining
	 * @generated
	 */
	public Adapter createPortConnectionContainingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.PortConnection <em>Port Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.PortConnection
	 * @generated
	 */
	public Adapter createPortConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.PortDataFlowSpecification <em>Port Data Flow Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.PortDataFlowSpecification
	 * @generated
	 */
	public Adapter createPortDataFlowSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.DataFlowSpecification <em>Data Flow Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.DataFlowSpecification
	 * @generated
	 */
	public Adapter createDataFlowSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.PortAndAccessConectionContext <em>Port And Access Conection Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.PortAndAccessConectionContext
	 * @generated
	 */
	public Adapter createPortAndAccessConectionContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.AnnexContaining <em>Annex Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.AnnexContaining
	 * @generated
	 */
	public Adapter createAnnexContainingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.BusType <em>Bus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.BusType
	 * @generated
	 */
	public Adapter createBusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.PortContaining <em>Port Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.PortContaining
	 * @generated
	 */
	public Adapter createPortContainingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.BusAccessContaining <em>Bus Access Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.BusAccessContaining
	 * @generated
	 */
	public Adapter createBusAccessContainingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.DataImplementation <em>Data Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.DataImplementation
	 * @generated
	 */
	public Adapter createDataImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.DataContaining <em>Data Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.DataContaining
	 * @generated
	 */
	public Adapter createDataContainingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.DataSubcomponent <em>Data Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.DataSubcomponent
	 * @generated
	 */
	public Adapter createDataSubcomponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.SubcomponentClassifier <em>Subcomponent Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.SubcomponentClassifier
	 * @generated
	 */
	public Adapter createSubcomponentClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.ModeTransitionTriggerContext <em>Mode Transition Trigger Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.ModeTransitionTriggerContext
	 * @generated
	 */
	public Adapter createModeTransitionTriggerContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.DataAccessConnectionEnd <em>Data Access Connection End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.DataAccessConnectionEnd
	 * @generated
	 */
	public Adapter createDataAccessConnectionEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.SubprogramContaining <em>Subprogram Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.SubprogramContaining
	 * @generated
	 */
	public Adapter createSubprogramContainingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.SubprogramSubcomponent <em>Subprogram Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.SubprogramSubcomponent
	 * @generated
	 */
	public Adapter createSubprogramSubcomponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.DataAccessConnectionContaining <em>Data Access Connection Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.DataAccessConnectionContaining
	 * @generated
	 */
	public Adapter createDataAccessConnectionContainingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.DataAccessConnection <em>Data Access Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.DataAccessConnection
	 * @generated
	 */
	public Adapter createDataAccessConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.DataAccess <em>Data Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.DataAccess
	 * @generated
	 */
	public Adapter createDataAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.SubprogramAccessConnectionContaining <em>Subprogram Access Connection Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.SubprogramAccessConnectionContaining
	 * @generated
	 */
	public Adapter createSubprogramAccessConnectionContainingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.SubprogramAccessConnection <em>Subprogram Access Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.SubprogramAccessConnection
	 * @generated
	 */
	public Adapter createSubprogramAccessConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.SubprogramAccess <em>Subprogram Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.SubprogramAccess
	 * @generated
	 */
	public Adapter createSubprogramAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.SubprogramInterface <em>Subprogram Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.SubprogramInterface
	 * @generated
	 */
	public Adapter createSubprogramInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.SubprogramSpecification <em>Subprogram Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.SubprogramSpecification
	 * @generated
	 */
	public Adapter createSubprogramSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.SubprogramAccessContaining <em>Subprogram Access Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.SubprogramAccessContaining
	 * @generated
	 */
	public Adapter createSubprogramAccessContainingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.DataAccessContaining <em>Data Access Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.DataAccessContaining
	 * @generated
	 */
	public Adapter createDataAccessContainingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.SubprogramCallContext <em>Subprogram Call Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.SubprogramCallContext
	 * @generated
	 */
	public Adapter createSubprogramCallContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.DeviceImplementation <em>Device Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.DeviceImplementation
	 * @generated
	 */
	public Adapter createDeviceImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.BusContaining <em>Bus Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.BusContaining
	 * @generated
	 */
	public Adapter createBusContainingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.BusSubcomponent <em>Bus Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.BusSubcomponent
	 * @generated
	 */
	public Adapter createBusSubcomponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.DeviceType <em>Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.DeviceType
	 * @generated
	 */
	public Adapter createDeviceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.MemoryImplementation <em>Memory Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.MemoryImplementation
	 * @generated
	 */
	public Adapter createMemoryImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.MemoryContaining <em>Memory Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.MemoryContaining
	 * @generated
	 */
	public Adapter createMemoryContainingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.MemorySubcomponent <em>Memory Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.MemorySubcomponent
	 * @generated
	 */
	public Adapter createMemorySubcomponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.MemoryType <em>Memory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.MemoryType
	 * @generated
	 */
	public Adapter createMemoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.ProcessImplementation <em>Process Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.ProcessImplementation
	 * @generated
	 */
	public Adapter createProcessImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.ThreadContaining <em>Thread Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.ThreadContaining
	 * @generated
	 */
	public Adapter createThreadContainingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.ThreadSubcomponent <em>Thread Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.ThreadSubcomponent
	 * @generated
	 */
	public Adapter createThreadSubcomponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.ParameterConnectionContaining <em>Parameter Connection Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.ParameterConnectionContaining
	 * @generated
	 */
	public Adapter createParameterConnectionContainingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.ParameterConnection <em>Parameter Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.ParameterConnection
	 * @generated
	 */
	public Adapter createParameterConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.ParameterConnectionEnd <em>Parameter Connection End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.ParameterConnectionEnd
	 * @generated
	 */
	public Adapter createParameterConnectionEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.ParameterConnectionContext <em>Parameter Connection Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.ParameterConnectionContext
	 * @generated
	 */
	public Adapter createParameterConnectionContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.ProcessorImplementation <em>Processor Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.ProcessorImplementation
	 * @generated
	 */
	public Adapter createProcessorImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.ProcessorType <em>Processor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.ProcessorType
	 * @generated
	 */
	public Adapter createProcessorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.ProcessType <em>Process Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.ProcessType
	 * @generated
	 */
	public Adapter createProcessTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.ParameterContaining <em>Parameter Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.ParameterContaining
	 * @generated
	 */
	public Adapter createParameterContainingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.SubprogramImplementation <em>Subprogram Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.SubprogramImplementation
	 * @generated
	 */
	public Adapter createSubprogramImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.CallSequenceDescribable <em>Call Sequence Describable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.CallSequenceDescribable
	 * @generated
	 */
	public Adapter createCallSequenceDescribableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.CallSequence <em>Call Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.CallSequence
	 * @generated
	 */
	public Adapter createCallSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.SubprogramCall <em>Subprogram Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.SubprogramCall
	 * @generated
	 */
	public Adapter createSubprogramCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.SubprogramType <em>Subprogram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.SubprogramType
	 * @generated
	 */
	public Adapter createSubprogramTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.SystemImplementation <em>System Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.SystemImplementation
	 * @generated
	 */
	public Adapter createSystemImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.ProcessContaining <em>Process Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.ProcessContaining
	 * @generated
	 */
	public Adapter createProcessContainingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.ProcessSubcomponent <em>Process Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.ProcessSubcomponent
	 * @generated
	 */
	public Adapter createProcessSubcomponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.ProcessorContaining <em>Processor Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.ProcessorContaining
	 * @generated
	 */
	public Adapter createProcessorContainingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.ProcessorSubcomponent <em>Processor Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.ProcessorSubcomponent
	 * @generated
	 */
	public Adapter createProcessorSubcomponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.SystemContaining <em>System Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.SystemContaining
	 * @generated
	 */
	public Adapter createSystemContainingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.SystemSubcomponent <em>System Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.SystemSubcomponent
	 * @generated
	 */
	public Adapter createSystemSubcomponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.DeviceContaining <em>Device Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.DeviceContaining
	 * @generated
	 */
	public Adapter createDeviceContainingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.DeviceSubcomponent <em>Device Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.DeviceSubcomponent
	 * @generated
	 */
	public Adapter createDeviceSubcomponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.SystemType <em>System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.SystemType
	 * @generated
	 */
	public Adapter createSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.ThreadImplementation <em>Thread Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.ThreadImplementation
	 * @generated
	 */
	public Adapter createThreadImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.ThreadType <em>Thread Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.ThreadType
	 * @generated
	 */
	public Adapter createThreadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.DataPort <em>Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.DataPort
	 * @generated
	 */
	public Adapter createDataPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.EventPort <em>Event Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.EventPort
	 * @generated
	 */
	public Adapter createEventPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.EventDataPort <em>Event Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.EventDataPort
	 * @generated
	 */
	public Adapter createEventDataPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.ModeStateMachine <em>Mode State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.ModeStateMachine
	 * @generated
	 */
	public Adapter createModeStateMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.ModeTransition <em>Mode Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.ModeTransition
	 * @generated
	 */
	public Adapter createModeTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.ModeTransitionTrigger <em>Mode Transition Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.ModeTransitionTrigger
	 * @generated
	 */
	public Adapter createModeTransitionTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.NormalMode <em>Normal Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.NormalMode
	 * @generated
	 */
	public Adapter createNormalModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.InitialMode <em>Initial Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.InitialMode
	 * @generated
	 */
	public Adapter createInitialModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.SubprogramInstanceCall <em>Subprogram Instance Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.SubprogramInstanceCall
	 * @generated
	 */
	public Adapter createSubprogramInstanceCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.SubprogramInterfaceCall <em>Subprogram Interface Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.SubprogramInterfaceCall
	 * @generated
	 */
	public Adapter createSubprogramInterfaceCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NEsysml.Aadl.AadlModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NEsysml.Aadl.AadlModel
	 * @generated
	 */
	public Adapter createAadlModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.sysml14.portsandflows.ProxyPort <em>Proxy Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.sysml14.portsandflows.ProxyPort
	 * @generated
	 */
	public Adapter createProxyPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.sysml14.blocks.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.sysml14.blocks.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.sysml14.portsandflows.InterfaceBlock <em>Interface Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.sysml14.portsandflows.InterfaceBlock
	 * @generated
	 */
	public Adapter createInterfaceBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.sysml14.blocks.BindingConnector <em>Binding Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.sysml14.blocks.BindingConnector
	 * @generated
	 */
	public Adapter createBindingConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AadlAdapterFactory
