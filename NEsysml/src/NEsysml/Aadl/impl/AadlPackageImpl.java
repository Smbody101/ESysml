/**
 */
package NEsysml.Aadl.impl;

import NEsysml.BA.BAPackage;
import NEsysml.BA.impl.BAPackageImpl;
import NEsysml.EM.EMPackage;
import NEsysml.EM.impl.EMPackageImpl;
import NEsysml.NEsysmlPackage;
import NEsysml.Aadl.*;
import NEsysml.impl.NEsysmlPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.papyrus.sysml14.blocks.BlocksPackage;
import org.eclipse.papyrus.sysml14.portsandflows.PortsandflowsPackage;
import org.eclipse.papyrus.sysml14.sysmlPackage;
import org.eclipse.uml2.types.TypesPackage;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.profile.standard.StandardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AadlPackageImpl extends EPackageImpl implements AadlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentTypeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentClassifierEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annexEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busAccessConnectionContainingEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busConnectionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busAccessConnectionEndEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busAccessEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busFlowSpecificationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentImplementationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busClassifierEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformClassifierEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeAvailableEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeStateMachineEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeTransitionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeTransitionTriggerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventPortEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portDataFlowSpecificationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFlowSpecificationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataClassifierEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareClassifierEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeTransitionTriggerContextEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceClassifierEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryClassifierEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processClassifierEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorClassifierEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramClassifierEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramInstanceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemClassifierEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadClassifierEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busImplementationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portConnectionContainingEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portConnectionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portAndAccessConectionContextEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annexContainingEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busTypeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portContainingEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busAccessContainingEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataImplementationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataContainingEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSubcomponentEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subcomponentClassifierEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAccessConnectionEndEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramContainingEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramSubcomponentEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAccessConnectionContainingEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAccessConnectionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramAccessConnectionContainingEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramAccessConnectionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramAccessEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramInterfaceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramSpecificationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramAccessContainingEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAccessContainingEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAccessEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramCallContextEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceImplementationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busContainingEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busSubcomponentEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceTypeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryImplementationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryContainingEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memorySubcomponentEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryTypeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processImplementationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadContainingEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadSubcomponentEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorImplementationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorTypeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processTypeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramImplementationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterConnectionContainingEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterConnectionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterConnectionEndEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterConnectionContextEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callSequenceDescribableEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callSequenceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramCallEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramTypeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterContainingEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemImplementationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processContainingEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processSubcomponentEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorContainingEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorSubcomponentEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemContainingEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemSubcomponentEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceContainingEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceSubcomponentEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemTypeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadImplementationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadTypeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPortEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventDataPortEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalModeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialModeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramInstanceCallEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramInterfaceCallEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aadlModelEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see NEsysml.Aadl.AadlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AadlPackageImpl() {
		super(eNS_URI, AadlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AadlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AadlPackage init() {
		if (isInited) return (AadlPackage)EPackage.Registry.INSTANCE.getEPackage(AadlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAadlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AadlPackageImpl theAadlPackage = registeredAadlPackage instanceof AadlPackageImpl ? (AadlPackageImpl)registeredAadlPackage : new AadlPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		StandardPackage.eINSTANCE.eClass();
		sysmlPackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NEsysmlPackage.eNS_URI);
		NEsysmlPackageImpl theNEsysmlPackage = (NEsysmlPackageImpl)(registeredPackage instanceof NEsysmlPackageImpl ? registeredPackage : NEsysmlPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EMPackage.eNS_URI);
		EMPackageImpl theEMPackage = (EMPackageImpl)(registeredPackage instanceof EMPackageImpl ? registeredPackage : EMPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BAPackage.eNS_URI);
		BAPackageImpl theBAPackage = (BAPackageImpl)(registeredPackage instanceof BAPackageImpl ? registeredPackage : BAPackage.eINSTANCE);

		// Create package meta-data objects
		theAadlPackage.createPackageContents();
		theNEsysmlPackage.createPackageContents();
		theEMPackage.createPackageContents();
		theBAPackage.createPackageContents();

		// Initialize created meta-data
		theAadlPackage.initializePackageContents();
		theNEsysmlPackage.initializePackageContents();
		theEMPackage.initializePackageContents();
		theBAPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAadlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AadlPackage.eNS_URI, theAadlPackage);
		return theAadlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtension() {
		return extensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_Base_Generalization() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementation() {
		return implementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementation_Base_Generalization() {
		return (EReference)implementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentType() {
		return componentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentType_Extended() {
		return (EReference)componentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentClassifier() {
		return componentClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentClassifier_OwnedErrorModel() {
		return (EReference)componentClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifier() {
		return classifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnex() {
		return annexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusAccessConnectionContaining() {
		return busAccessConnectionContainingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusAccessConnectionContaining_OwnedBusConnection() {
		return (EReference)busAccessConnectionContainingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusConnection() {
		return busConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusConnection_Base_Connector() {
		return (EReference)busConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusConnection_Require() {
		return (EReference)busConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusConnection_Provide() {
		return (EReference)busConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusConnection_InContext() {
		return (EReference)busConnectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusConnection_OutContext() {
		return (EReference)busConnectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusAccessConnectionEnd() {
		return busAccessConnectionEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusAccess() {
		return busAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusAccess_Specification() {
		return (EReference)busAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusAccess_Direction() {
		return (EAttribute)busAccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusFlowSpecification() {
		return busFlowSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusFlowSpecification_Type() {
		return (EReference)busFlowSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentImplementation() {
		return componentImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentImplementation_Type() {
		return (EReference)componentImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentImplementation_Extended() {
		return (EReference)componentImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusClassifier() {
		return busClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlatformClassifier() {
		return platformClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeAvailable() {
		return modeAvailableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeAvailable_OwnedMode() {
		return (EReference)modeAvailableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeStateMachine() {
		return modeStateMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeStateMachine_Base_StateMachine() {
		return (EReference)modeStateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeStateMachine_OwnedMode() {
		return (EReference)modeStateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeStateMachine_OwnedTransition() {
		return (EReference)modeStateMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMode() {
		return modeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeTransition() {
		return modeTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeTransition_Base_Transition() {
		return (EReference)modeTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeTransition_Trigger() {
		return (EReference)modeTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeTransition_From() {
		return (EReference)modeTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeTransition_To() {
		return (EReference)modeTransitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeTransitionTrigger() {
		return modeTransitionTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeTransitionTrigger_Base_Trigger() {
		return (EReference)modeTransitionTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeTransitionTrigger_Port() {
		return (EReference)modeTransitionTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeTransitionTrigger_Context() {
		return (EReference)modeTransitionTriggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventPort() {
		return eventPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Specification() {
		return (EReference)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Direction() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortDataFlowSpecification() {
		return portDataFlowSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortDataFlowSpecification_EventGate() {
		return (EReference)portDataFlowSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFlowSpecification() {
		return dataFlowSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFlowSpecification_Type() {
		return (EReference)dataFlowSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataClassifier() {
		return dataClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareClassifier() {
		return softwareClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeTransitionTriggerContext() {
		return modeTransitionTriggerContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceClassifier() {
		return deviceClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryClassifier() {
		return memoryClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessClassifier() {
		return processClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessorClassifier() {
		return processorClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubprogramClassifier() {
		return subprogramClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubprogramInstance() {
		return subprogramInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemClassifier() {
		return systemClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThreadClassifier() {
		return threadClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusImplementation() {
		return busImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortConnectionContaining() {
		return portConnectionContainingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortConnectionContaining_OwnedPortConnection() {
		return (EReference)portConnectionContainingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortConnection() {
		return portConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortConnection_Base_Connector() {
		return (EReference)portConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortConnection_In() {
		return (EReference)portConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortConnection_Out() {
		return (EReference)portConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortConnection_InContext() {
		return (EReference)portConnectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortConnection_OutContext() {
		return (EReference)portConnectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortAndAccessConectionContext() {
		return portAndAccessConectionContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnexContaining() {
		return annexContainingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnexContaining_OwnedAnnex() {
		return (EReference)annexContainingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusType() {
		return busTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortContaining() {
		return portContainingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortContaining_Ownedport() {
		return (EReference)portContainingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusAccessContaining() {
		return busAccessContainingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusAccessContaining_OwnedBusAccess() {
		return (EReference)busAccessContainingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataImplementation() {
		return dataImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataContaining() {
		return dataContainingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataContaining_OwnedDataSubcomponent() {
		return (EReference)dataContainingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSubcomponent() {
		return dataSubcomponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSubcomponent_Type() {
		return (EReference)dataSubcomponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubcomponentClassifier() {
		return subcomponentClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubcomponentClassifier_Base_Property() {
		return (EReference)subcomponentClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAccessConnectionEnd() {
		return dataAccessConnectionEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubprogramContaining() {
		return subprogramContainingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubprogramContaining_OwnedSubprogramSubcomponent() {
		return (EReference)subprogramContainingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubprogramSubcomponent() {
		return subprogramSubcomponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubprogramSubcomponent_Type() {
		return (EReference)subprogramSubcomponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAccessConnectionContaining() {
		return dataAccessConnectionContainingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAccessConnectionContaining_OwnedDataAccessConnection() {
		return (EReference)dataAccessConnectionContainingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAccessConnection() {
		return dataAccessConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAccessConnection_Require() {
		return (EReference)dataAccessConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAccessConnection_Provide() {
		return (EReference)dataAccessConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAccessConnection_InContext() {
		return (EReference)dataAccessConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAccessConnection_OutContext() {
		return (EReference)dataAccessConnectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubprogramAccessConnectionContaining() {
		return subprogramAccessConnectionContainingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubprogramAccessConnectionContaining_OwnedSubprogramAccessConnection() {
		return (EReference)subprogramAccessConnectionContainingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubprogramAccessConnection() {
		return subprogramAccessConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubprogramAccessConnection_Base_Connector() {
		return (EReference)subprogramAccessConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubprogramAccessConnection_Require() {
		return (EReference)subprogramAccessConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubprogramAccessConnection_Provide() {
		return (EReference)subprogramAccessConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubprogramAccessConnection_InContext() {
		return (EReference)subprogramAccessConnectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubprogramAccessConnection_OutContext() {
		return (EReference)subprogramAccessConnectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubprogramAccess() {
		return subprogramAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubprogramAccess_Specification() {
		return (EReference)subprogramAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubprogramAccess_Direction() {
		return (EAttribute)subprogramAccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubprogramAccess_Type() {
		return (EReference)subprogramAccessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubprogramInterface() {
		return subprogramInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubprogramSpecification() {
		return subprogramSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubprogramAccessContaining() {
		return subprogramAccessContainingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubprogramAccessContaining_OwnedSubprogramAccess() {
		return (EReference)subprogramAccessContainingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAccessContaining() {
		return dataAccessContainingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAccessContaining_OwnedDataAccess() {
		return (EReference)dataAccessContainingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAccess() {
		return dataAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAccess_Specification() {
		return (EReference)dataAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataAccess_Direction() {
		return (EAttribute)dataAccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubprogramCallContext() {
		return subprogramCallContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceImplementation() {
		return deviceImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusContaining() {
		return busContainingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusContaining_OwnedBusSubcomponent() {
		return (EReference)busContainingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusSubcomponent() {
		return busSubcomponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusSubcomponent_Type() {
		return (EReference)busSubcomponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceType() {
		return deviceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryImplementation() {
		return memoryImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryContaining() {
		return memoryContainingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryContaining_OwnedMemorySubcomponent() {
		return (EReference)memoryContainingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemorySubcomponent() {
		return memorySubcomponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemorySubcomponent_Type() {
		return (EReference)memorySubcomponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryType() {
		return memoryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessImplementation() {
		return processImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThreadContaining() {
		return threadContainingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThreadContaining_OwnedThreadSubcomponent() {
		return (EReference)threadContainingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThreadSubcomponent() {
		return threadSubcomponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThreadSubcomponent_Type() {
		return (EReference)threadSubcomponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessorImplementation() {
		return processorImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessorType() {
		return processorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessType() {
		return processTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubprogramImplementation() {
		return subprogramImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubprogramImplementation_Base_Activity() {
		return (EReference)subprogramImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterConnectionContaining() {
		return parameterConnectionContainingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterConnectionContaining_OwnedParameterConnection() {
		return (EReference)parameterConnectionContainingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterConnection() {
		return parameterConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterConnection_Base_ObjectFlow() {
		return (EReference)parameterConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterConnection_In() {
		return (EReference)parameterConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterConnection_Out() {
		return (EReference)parameterConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterConnection_InContext() {
		return (EReference)parameterConnectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterConnection_OutContext() {
		return (EReference)parameterConnectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterConnectionEnd() {
		return parameterConnectionEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterConnectionContext() {
		return parameterConnectionContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallSequenceDescribable() {
		return callSequenceDescribableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallSequenceDescribable_OwnedCallSequence() {
		return (EReference)callSequenceDescribableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallSequence() {
		return callSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallSequence_Base_Activity() {
		return (EReference)callSequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallSequence_OwnedSubprogramCall() {
		return (EReference)callSequenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallSequence_First() {
		return (EReference)callSequenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubprogramCall() {
		return subprogramCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubprogramCall_Last() {
		return (EReference)subprogramCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubprogramCall_Next() {
		return (EReference)subprogramCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubprogramType() {
		return subprogramTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubprogramType_Base_Activity() {
		return (EReference)subprogramTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterContaining() {
		return parameterContainingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterContaining_OwnedParameter() {
		return (EReference)parameterContainingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Direction() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Base_Parameter() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Type() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemImplementation() {
		return systemImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessContaining() {
		return processContainingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessContaining_OwnedProcessSubcomponent() {
		return (EReference)processContainingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessSubcomponent() {
		return processSubcomponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessSubcomponent_Type() {
		return (EReference)processSubcomponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessorContaining() {
		return processorContainingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessorContaining_OwnedProcessorSubcomponent() {
		return (EReference)processorContainingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessorSubcomponent() {
		return processorSubcomponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessorSubcomponent_Type() {
		return (EReference)processorSubcomponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemContaining() {
		return systemContainingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemContaining_OwnedSystemSubcomponent() {
		return (EReference)systemContainingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemSubcomponent() {
		return systemSubcomponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemSubcomponent_Type() {
		return (EReference)systemSubcomponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceContaining() {
		return deviceContainingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceContaining_OwnedDeviceSubcomponent() {
		return (EReference)deviceContainingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceSubcomponent() {
		return deviceSubcomponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceSubcomponent_Type() {
		return (EReference)deviceSubcomponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemType() {
		return systemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThreadImplementation() {
		return threadImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThreadType() {
		return threadTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPort() {
		return dataPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPort_Type() {
		return (EReference)dataPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventDataPort() {
		return eventDataPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormalMode() {
		return normalModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNormalMode_Base_State() {
		return (EReference)normalModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialMode() {
		return initialModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialMode_Base_Pseudostate() {
		return (EReference)initialModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubprogramInstanceCall() {
		return subprogramInstanceCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubprogramInstanceCall_Base_CallBehaviorAction() {
		return (EReference)subprogramInstanceCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubprogramInstanceCall_SubprogramInstance() {
		return (EReference)subprogramInstanceCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubprogramInterfaceCall() {
		return subprogramInterfaceCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubprogramInterfaceCall_Base_CallOperationAction() {
		return (EReference)subprogramInterfaceCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubprogramInterfaceCall_SubprogramInterface() {
		return (EReference)subprogramInterfaceCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubprogramInterfaceCall_Context() {
		return (EReference)subprogramInterfaceCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAadlModel() {
		return aadlModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAadlModel_OwnedClassifier() {
		return (EReference)aadlModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAadlModel_Base_Package() {
		return (EReference)aadlModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAadlModel_ImportEMLibrary() {
		return (EReference)aadlModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AadlFactory getAadlFactory() {
		return (AadlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		extensionEClass = createEClass(EXTENSION);
		createEReference(extensionEClass, EXTENSION__BASE_GENERALIZATION);

		implementationEClass = createEClass(IMPLEMENTATION);
		createEReference(implementationEClass, IMPLEMENTATION__BASE_GENERALIZATION);

		componentTypeEClass = createEClass(COMPONENT_TYPE);
		createEReference(componentTypeEClass, COMPONENT_TYPE__EXTENDED);

		componentClassifierEClass = createEClass(COMPONENT_CLASSIFIER);
		createEReference(componentClassifierEClass, COMPONENT_CLASSIFIER__OWNED_ERROR_MODEL);

		classifierEClass = createEClass(CLASSIFIER);

		componentImplementationEClass = createEClass(COMPONENT_IMPLEMENTATION);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__TYPE);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__EXTENDED);

		busClassifierEClass = createEClass(BUS_CLASSIFIER);

		platformClassifierEClass = createEClass(PLATFORM_CLASSIFIER);

		modeAvailableEClass = createEClass(MODE_AVAILABLE);
		createEReference(modeAvailableEClass, MODE_AVAILABLE__OWNED_MODE);

		modeStateMachineEClass = createEClass(MODE_STATE_MACHINE);
		createEReference(modeStateMachineEClass, MODE_STATE_MACHINE__BASE_STATE_MACHINE);
		createEReference(modeStateMachineEClass, MODE_STATE_MACHINE__OWNED_MODE);
		createEReference(modeStateMachineEClass, MODE_STATE_MACHINE__OWNED_TRANSITION);

		modeEClass = createEClass(MODE);

		modeTransitionEClass = createEClass(MODE_TRANSITION);
		createEReference(modeTransitionEClass, MODE_TRANSITION__BASE_TRANSITION);
		createEReference(modeTransitionEClass, MODE_TRANSITION__TRIGGER);
		createEReference(modeTransitionEClass, MODE_TRANSITION__FROM);
		createEReference(modeTransitionEClass, MODE_TRANSITION__TO);

		modeTransitionTriggerEClass = createEClass(MODE_TRANSITION_TRIGGER);
		createEReference(modeTransitionTriggerEClass, MODE_TRANSITION_TRIGGER__BASE_TRIGGER);
		createEReference(modeTransitionTriggerEClass, MODE_TRANSITION_TRIGGER__PORT);
		createEReference(modeTransitionTriggerEClass, MODE_TRANSITION_TRIGGER__CONTEXT);

		eventPortEClass = createEClass(EVENT_PORT);

		portEClass = createEClass(PORT);
		createEReference(portEClass, PORT__SPECIFICATION);
		createEAttribute(portEClass, PORT__DIRECTION);

		featureEClass = createEClass(FEATURE);

		portDataFlowSpecificationEClass = createEClass(PORT_DATA_FLOW_SPECIFICATION);
		createEReference(portDataFlowSpecificationEClass, PORT_DATA_FLOW_SPECIFICATION__EVENT_GATE);

		dataFlowSpecificationEClass = createEClass(DATA_FLOW_SPECIFICATION);
		createEReference(dataFlowSpecificationEClass, DATA_FLOW_SPECIFICATION__TYPE);

		dataClassifierEClass = createEClass(DATA_CLASSIFIER);

		softwareClassifierEClass = createEClass(SOFTWARE_CLASSIFIER);

		modeTransitionTriggerContextEClass = createEClass(MODE_TRANSITION_TRIGGER_CONTEXT);

		deviceClassifierEClass = createEClass(DEVICE_CLASSIFIER);

		memoryClassifierEClass = createEClass(MEMORY_CLASSIFIER);

		processClassifierEClass = createEClass(PROCESS_CLASSIFIER);

		processorClassifierEClass = createEClass(PROCESSOR_CLASSIFIER);

		subprogramClassifierEClass = createEClass(SUBPROGRAM_CLASSIFIER);

		subprogramInstanceEClass = createEClass(SUBPROGRAM_INSTANCE);

		systemClassifierEClass = createEClass(SYSTEM_CLASSIFIER);

		threadClassifierEClass = createEClass(THREAD_CLASSIFIER);

		busImplementationEClass = createEClass(BUS_IMPLEMENTATION);

		portConnectionContainingEClass = createEClass(PORT_CONNECTION_CONTAINING);
		createEReference(portConnectionContainingEClass, PORT_CONNECTION_CONTAINING__OWNED_PORT_CONNECTION);

		portConnectionEClass = createEClass(PORT_CONNECTION);
		createEReference(portConnectionEClass, PORT_CONNECTION__BASE_CONNECTOR);
		createEReference(portConnectionEClass, PORT_CONNECTION__IN);
		createEReference(portConnectionEClass, PORT_CONNECTION__OUT);
		createEReference(portConnectionEClass, PORT_CONNECTION__IN_CONTEXT);
		createEReference(portConnectionEClass, PORT_CONNECTION__OUT_CONTEXT);

		connectionEClass = createEClass(CONNECTION);

		portAndAccessConectionContextEClass = createEClass(PORT_AND_ACCESS_CONECTION_CONTEXT);

		annexContainingEClass = createEClass(ANNEX_CONTAINING);
		createEReference(annexContainingEClass, ANNEX_CONTAINING__OWNED_ANNEX);

		annexEClass = createEClass(ANNEX);

		busAccessConnectionContainingEClass = createEClass(BUS_ACCESS_CONNECTION_CONTAINING);
		createEReference(busAccessConnectionContainingEClass, BUS_ACCESS_CONNECTION_CONTAINING__OWNED_BUS_CONNECTION);

		busConnectionEClass = createEClass(BUS_CONNECTION);
		createEReference(busConnectionEClass, BUS_CONNECTION__BASE_CONNECTOR);
		createEReference(busConnectionEClass, BUS_CONNECTION__REQUIRE);
		createEReference(busConnectionEClass, BUS_CONNECTION__PROVIDE);
		createEReference(busConnectionEClass, BUS_CONNECTION__IN_CONTEXT);
		createEReference(busConnectionEClass, BUS_CONNECTION__OUT_CONTEXT);

		busAccessConnectionEndEClass = createEClass(BUS_ACCESS_CONNECTION_END);

		busTypeEClass = createEClass(BUS_TYPE);

		portContainingEClass = createEClass(PORT_CONTAINING);
		createEReference(portContainingEClass, PORT_CONTAINING__OWNEDPORT);

		busAccessContainingEClass = createEClass(BUS_ACCESS_CONTAINING);
		createEReference(busAccessContainingEClass, BUS_ACCESS_CONTAINING__OWNED_BUS_ACCESS);

		busAccessEClass = createEClass(BUS_ACCESS);
		createEReference(busAccessEClass, BUS_ACCESS__SPECIFICATION);
		createEAttribute(busAccessEClass, BUS_ACCESS__DIRECTION);

		busFlowSpecificationEClass = createEClass(BUS_FLOW_SPECIFICATION);
		createEReference(busFlowSpecificationEClass, BUS_FLOW_SPECIFICATION__TYPE);

		dataImplementationEClass = createEClass(DATA_IMPLEMENTATION);

		dataContainingEClass = createEClass(DATA_CONTAINING);
		createEReference(dataContainingEClass, DATA_CONTAINING__OWNED_DATA_SUBCOMPONENT);

		dataSubcomponentEClass = createEClass(DATA_SUBCOMPONENT);
		createEReference(dataSubcomponentEClass, DATA_SUBCOMPONENT__TYPE);

		subcomponentClassifierEClass = createEClass(SUBCOMPONENT_CLASSIFIER);
		createEReference(subcomponentClassifierEClass, SUBCOMPONENT_CLASSIFIER__BASE_PROPERTY);

		dataAccessConnectionEndEClass = createEClass(DATA_ACCESS_CONNECTION_END);

		subprogramContainingEClass = createEClass(SUBPROGRAM_CONTAINING);
		createEReference(subprogramContainingEClass, SUBPROGRAM_CONTAINING__OWNED_SUBPROGRAM_SUBCOMPONENT);

		subprogramSubcomponentEClass = createEClass(SUBPROGRAM_SUBCOMPONENT);
		createEReference(subprogramSubcomponentEClass, SUBPROGRAM_SUBCOMPONENT__TYPE);

		dataAccessConnectionContainingEClass = createEClass(DATA_ACCESS_CONNECTION_CONTAINING);
		createEReference(dataAccessConnectionContainingEClass, DATA_ACCESS_CONNECTION_CONTAINING__OWNED_DATA_ACCESS_CONNECTION);

		dataAccessConnectionEClass = createEClass(DATA_ACCESS_CONNECTION);
		createEReference(dataAccessConnectionEClass, DATA_ACCESS_CONNECTION__REQUIRE);
		createEReference(dataAccessConnectionEClass, DATA_ACCESS_CONNECTION__PROVIDE);
		createEReference(dataAccessConnectionEClass, DATA_ACCESS_CONNECTION__IN_CONTEXT);
		createEReference(dataAccessConnectionEClass, DATA_ACCESS_CONNECTION__OUT_CONTEXT);

		subprogramAccessConnectionContainingEClass = createEClass(SUBPROGRAM_ACCESS_CONNECTION_CONTAINING);
		createEReference(subprogramAccessConnectionContainingEClass, SUBPROGRAM_ACCESS_CONNECTION_CONTAINING__OWNED_SUBPROGRAM_ACCESS_CONNECTION);

		subprogramAccessConnectionEClass = createEClass(SUBPROGRAM_ACCESS_CONNECTION);
		createEReference(subprogramAccessConnectionEClass, SUBPROGRAM_ACCESS_CONNECTION__BASE_CONNECTOR);
		createEReference(subprogramAccessConnectionEClass, SUBPROGRAM_ACCESS_CONNECTION__REQUIRE);
		createEReference(subprogramAccessConnectionEClass, SUBPROGRAM_ACCESS_CONNECTION__PROVIDE);
		createEReference(subprogramAccessConnectionEClass, SUBPROGRAM_ACCESS_CONNECTION__IN_CONTEXT);
		createEReference(subprogramAccessConnectionEClass, SUBPROGRAM_ACCESS_CONNECTION__OUT_CONTEXT);

		subprogramAccessEClass = createEClass(SUBPROGRAM_ACCESS);
		createEReference(subprogramAccessEClass, SUBPROGRAM_ACCESS__SPECIFICATION);
		createEAttribute(subprogramAccessEClass, SUBPROGRAM_ACCESS__DIRECTION);
		createEReference(subprogramAccessEClass, SUBPROGRAM_ACCESS__TYPE);

		subprogramInterfaceEClass = createEClass(SUBPROGRAM_INTERFACE);

		subprogramSpecificationEClass = createEClass(SUBPROGRAM_SPECIFICATION);

		dataTypeEClass = createEClass(DATA_TYPE);

		subprogramAccessContainingEClass = createEClass(SUBPROGRAM_ACCESS_CONTAINING);
		createEReference(subprogramAccessContainingEClass, SUBPROGRAM_ACCESS_CONTAINING__OWNED_SUBPROGRAM_ACCESS);

		dataAccessContainingEClass = createEClass(DATA_ACCESS_CONTAINING);
		createEReference(dataAccessContainingEClass, DATA_ACCESS_CONTAINING__OWNED_DATA_ACCESS);

		dataAccessEClass = createEClass(DATA_ACCESS);
		createEReference(dataAccessEClass, DATA_ACCESS__SPECIFICATION);
		createEAttribute(dataAccessEClass, DATA_ACCESS__DIRECTION);

		subprogramCallContextEClass = createEClass(SUBPROGRAM_CALL_CONTEXT);

		deviceImplementationEClass = createEClass(DEVICE_IMPLEMENTATION);

		busContainingEClass = createEClass(BUS_CONTAINING);
		createEReference(busContainingEClass, BUS_CONTAINING__OWNED_BUS_SUBCOMPONENT);

		busSubcomponentEClass = createEClass(BUS_SUBCOMPONENT);
		createEReference(busSubcomponentEClass, BUS_SUBCOMPONENT__TYPE);

		deviceTypeEClass = createEClass(DEVICE_TYPE);

		memoryImplementationEClass = createEClass(MEMORY_IMPLEMENTATION);

		memoryContainingEClass = createEClass(MEMORY_CONTAINING);
		createEReference(memoryContainingEClass, MEMORY_CONTAINING__OWNED_MEMORY_SUBCOMPONENT);

		memorySubcomponentEClass = createEClass(MEMORY_SUBCOMPONENT);
		createEReference(memorySubcomponentEClass, MEMORY_SUBCOMPONENT__TYPE);

		memoryTypeEClass = createEClass(MEMORY_TYPE);

		processImplementationEClass = createEClass(PROCESS_IMPLEMENTATION);

		threadContainingEClass = createEClass(THREAD_CONTAINING);
		createEReference(threadContainingEClass, THREAD_CONTAINING__OWNED_THREAD_SUBCOMPONENT);

		threadSubcomponentEClass = createEClass(THREAD_SUBCOMPONENT);
		createEReference(threadSubcomponentEClass, THREAD_SUBCOMPONENT__TYPE);

		processorImplementationEClass = createEClass(PROCESSOR_IMPLEMENTATION);

		processorTypeEClass = createEClass(PROCESSOR_TYPE);

		processTypeEClass = createEClass(PROCESS_TYPE);

		subprogramImplementationEClass = createEClass(SUBPROGRAM_IMPLEMENTATION);
		createEReference(subprogramImplementationEClass, SUBPROGRAM_IMPLEMENTATION__BASE_ACTIVITY);

		parameterConnectionContainingEClass = createEClass(PARAMETER_CONNECTION_CONTAINING);
		createEReference(parameterConnectionContainingEClass, PARAMETER_CONNECTION_CONTAINING__OWNED_PARAMETER_CONNECTION);

		parameterConnectionEClass = createEClass(PARAMETER_CONNECTION);
		createEReference(parameterConnectionEClass, PARAMETER_CONNECTION__BASE_OBJECT_FLOW);
		createEReference(parameterConnectionEClass, PARAMETER_CONNECTION__IN);
		createEReference(parameterConnectionEClass, PARAMETER_CONNECTION__OUT);
		createEReference(parameterConnectionEClass, PARAMETER_CONNECTION__IN_CONTEXT);
		createEReference(parameterConnectionEClass, PARAMETER_CONNECTION__OUT_CONTEXT);

		parameterConnectionEndEClass = createEClass(PARAMETER_CONNECTION_END);

		parameterConnectionContextEClass = createEClass(PARAMETER_CONNECTION_CONTEXT);

		callSequenceDescribableEClass = createEClass(CALL_SEQUENCE_DESCRIBABLE);
		createEReference(callSequenceDescribableEClass, CALL_SEQUENCE_DESCRIBABLE__OWNED_CALL_SEQUENCE);

		callSequenceEClass = createEClass(CALL_SEQUENCE);
		createEReference(callSequenceEClass, CALL_SEQUENCE__BASE_ACTIVITY);
		createEReference(callSequenceEClass, CALL_SEQUENCE__OWNED_SUBPROGRAM_CALL);
		createEReference(callSequenceEClass, CALL_SEQUENCE__FIRST);

		subprogramCallEClass = createEClass(SUBPROGRAM_CALL);
		createEReference(subprogramCallEClass, SUBPROGRAM_CALL__LAST);
		createEReference(subprogramCallEClass, SUBPROGRAM_CALL__NEXT);

		subprogramTypeEClass = createEClass(SUBPROGRAM_TYPE);
		createEReference(subprogramTypeEClass, SUBPROGRAM_TYPE__BASE_ACTIVITY);

		parameterContainingEClass = createEClass(PARAMETER_CONTAINING);
		createEReference(parameterContainingEClass, PARAMETER_CONTAINING__OWNED_PARAMETER);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__DIRECTION);
		createEReference(parameterEClass, PARAMETER__BASE_PARAMETER);
		createEReference(parameterEClass, PARAMETER__TYPE);

		systemImplementationEClass = createEClass(SYSTEM_IMPLEMENTATION);

		processContainingEClass = createEClass(PROCESS_CONTAINING);
		createEReference(processContainingEClass, PROCESS_CONTAINING__OWNED_PROCESS_SUBCOMPONENT);

		processSubcomponentEClass = createEClass(PROCESS_SUBCOMPONENT);
		createEReference(processSubcomponentEClass, PROCESS_SUBCOMPONENT__TYPE);

		processorContainingEClass = createEClass(PROCESSOR_CONTAINING);
		createEReference(processorContainingEClass, PROCESSOR_CONTAINING__OWNED_PROCESSOR_SUBCOMPONENT);

		processorSubcomponentEClass = createEClass(PROCESSOR_SUBCOMPONENT);
		createEReference(processorSubcomponentEClass, PROCESSOR_SUBCOMPONENT__TYPE);

		systemContainingEClass = createEClass(SYSTEM_CONTAINING);
		createEReference(systemContainingEClass, SYSTEM_CONTAINING__OWNED_SYSTEM_SUBCOMPONENT);

		systemSubcomponentEClass = createEClass(SYSTEM_SUBCOMPONENT);
		createEReference(systemSubcomponentEClass, SYSTEM_SUBCOMPONENT__TYPE);

		deviceContainingEClass = createEClass(DEVICE_CONTAINING);
		createEReference(deviceContainingEClass, DEVICE_CONTAINING__OWNED_DEVICE_SUBCOMPONENT);

		deviceSubcomponentEClass = createEClass(DEVICE_SUBCOMPONENT);
		createEReference(deviceSubcomponentEClass, DEVICE_SUBCOMPONENT__TYPE);

		systemTypeEClass = createEClass(SYSTEM_TYPE);

		threadImplementationEClass = createEClass(THREAD_IMPLEMENTATION);

		threadTypeEClass = createEClass(THREAD_TYPE);

		dataPortEClass = createEClass(DATA_PORT);
		createEReference(dataPortEClass, DATA_PORT__TYPE);

		eventDataPortEClass = createEClass(EVENT_DATA_PORT);

		normalModeEClass = createEClass(NORMAL_MODE);
		createEReference(normalModeEClass, NORMAL_MODE__BASE_STATE);

		initialModeEClass = createEClass(INITIAL_MODE);
		createEReference(initialModeEClass, INITIAL_MODE__BASE_PSEUDOSTATE);

		subprogramInstanceCallEClass = createEClass(SUBPROGRAM_INSTANCE_CALL);
		createEReference(subprogramInstanceCallEClass, SUBPROGRAM_INSTANCE_CALL__BASE_CALL_BEHAVIOR_ACTION);
		createEReference(subprogramInstanceCallEClass, SUBPROGRAM_INSTANCE_CALL__SUBPROGRAM_INSTANCE);

		subprogramInterfaceCallEClass = createEClass(SUBPROGRAM_INTERFACE_CALL);
		createEReference(subprogramInterfaceCallEClass, SUBPROGRAM_INTERFACE_CALL__BASE_CALL_OPERATION_ACTION);
		createEReference(subprogramInterfaceCallEClass, SUBPROGRAM_INTERFACE_CALL__SUBPROGRAM_INTERFACE);
		createEReference(subprogramInterfaceCallEClass, SUBPROGRAM_INTERFACE_CALL__CONTEXT);

		aadlModelEClass = createEClass(AADL_MODEL);
		createEReference(aadlModelEClass, AADL_MODEL__OWNED_CLASSIFIER);
		createEReference(aadlModelEClass, AADL_MODEL__BASE_PACKAGE);
		createEReference(aadlModelEClass, AADL_MODEL__IMPORT_EM_LIBRARY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		EMPackage theEMPackage = (EMPackage)EPackage.Registry.INSTANCE.getEPackage(EMPackage.eNS_URI);
		PortsandflowsPackage thePortsandflowsPackage = (PortsandflowsPackage)EPackage.Registry.INSTANCE.getEPackage(PortsandflowsPackage.eNS_URI);
		BlocksPackage theBlocksPackage = (BlocksPackage)EPackage.Registry.INSTANCE.getEPackage(BlocksPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentTypeEClass.getESuperTypes().add(this.getComponentClassifier());
		componentClassifierEClass.getESuperTypes().add(this.getClassifier());
		componentImplementationEClass.getESuperTypes().add(this.getComponentClassifier());
		busClassifierEClass.getESuperTypes().add(this.getModeAvailable());
		busClassifierEClass.getESuperTypes().add(this.getPlatformClassifier());
		platformClassifierEClass.getESuperTypes().add(this.getClassifier());
		eventPortEClass.getESuperTypes().add(this.getPort());
		portEClass.getESuperTypes().add(thePortsandflowsPackage.getProxyPort());
		portEClass.getESuperTypes().add(this.getFeature());
		featureEClass.getESuperTypes().add(this.getClassifier());
		portDataFlowSpecificationEClass.getESuperTypes().add(this.getDataFlowSpecification());
		dataFlowSpecificationEClass.getESuperTypes().add(thePortsandflowsPackage.getInterfaceBlock());
		dataClassifierEClass.getESuperTypes().add(this.getSoftwareClassifier());
		softwareClassifierEClass.getESuperTypes().add(this.getClassifier());
		deviceClassifierEClass.getESuperTypes().add(this.getModeAvailable());
		deviceClassifierEClass.getESuperTypes().add(this.getPlatformClassifier());
		memoryClassifierEClass.getESuperTypes().add(this.getModeAvailable());
		memoryClassifierEClass.getESuperTypes().add(this.getPlatformClassifier());
		processClassifierEClass.getESuperTypes().add(this.getModeAvailable());
		processClassifierEClass.getESuperTypes().add(this.getSoftwareClassifier());
		processorClassifierEClass.getESuperTypes().add(this.getModeAvailable());
		processorClassifierEClass.getESuperTypes().add(this.getPlatformClassifier());
		subprogramClassifierEClass.getESuperTypes().add(this.getModeAvailable());
		subprogramClassifierEClass.getESuperTypes().add(this.getSoftwareClassifier());
		subprogramClassifierEClass.getESuperTypes().add(this.getSubprogramInstance());
		systemClassifierEClass.getESuperTypes().add(this.getModeAvailable());
		systemClassifierEClass.getESuperTypes().add(this.getClassifier());
		threadClassifierEClass.getESuperTypes().add(this.getModeAvailable());
		threadClassifierEClass.getESuperTypes().add(this.getSoftwareClassifier());
		busImplementationEClass.getESuperTypes().add(this.getComponentImplementation());
		busImplementationEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		busImplementationEClass.getESuperTypes().add(this.getAnnexContaining());
		busImplementationEClass.getESuperTypes().add(this.getBusAccessConnectionContaining());
		busImplementationEClass.getESuperTypes().add(this.getBusClassifier());
		busImplementationEClass.getESuperTypes().add(this.getPortConnectionContaining());
		portConnectionEClass.getESuperTypes().add(this.getConnection());
		connectionEClass.getESuperTypes().add(this.getClassifier());
		busTypeEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		busTypeEClass.getESuperTypes().add(this.getComponentType());
		busTypeEClass.getESuperTypes().add(this.getAnnexContaining());
		busTypeEClass.getESuperTypes().add(this.getBusAccessContaining());
		busTypeEClass.getESuperTypes().add(this.getBusClassifier());
		busTypeEClass.getESuperTypes().add(this.getPortContaining());
		busAccessEClass.getESuperTypes().add(thePortsandflowsPackage.getProxyPort());
		busAccessEClass.getESuperTypes().add(this.getBusAccessConnectionEnd());
		busFlowSpecificationEClass.getESuperTypes().add(thePortsandflowsPackage.getInterfaceBlock());
		dataImplementationEClass.getESuperTypes().add(this.getComponentImplementation());
		dataImplementationEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		dataImplementationEClass.getESuperTypes().add(this.getAnnexContaining());
		dataImplementationEClass.getESuperTypes().add(this.getDataAccessConnectionContaining());
		dataImplementationEClass.getESuperTypes().add(this.getDataContaining());
		dataImplementationEClass.getESuperTypes().add(this.getSubprogramAccessConnectionContaining());
		dataImplementationEClass.getESuperTypes().add(this.getSubprogramContaining());
		dataImplementationEClass.getESuperTypes().add(this.getDataClassifier());
		dataSubcomponentEClass.getESuperTypes().add(this.getSubcomponentClassifier());
		dataSubcomponentEClass.getESuperTypes().add(this.getDataAccessConnectionEnd());
		subcomponentClassifierEClass.getESuperTypes().add(this.getClassifier());
		subcomponentClassifierEClass.getESuperTypes().add(this.getModeTransitionTriggerContext());
		subcomponentClassifierEClass.getESuperTypes().add(this.getPortAndAccessConectionContext());
		subprogramSubcomponentEClass.getESuperTypes().add(this.getSubcomponentClassifier());
		subprogramSubcomponentEClass.getESuperTypes().add(this.getSubprogramInstance());
		dataAccessConnectionEClass.getESuperTypes().add(theBlocksPackage.getBindingConnector());
		dataAccessConnectionEClass.getESuperTypes().add(this.getConnection());
		subprogramAccessConnectionEClass.getESuperTypes().add(this.getConnection());
		subprogramAccessEClass.getESuperTypes().add(thePortsandflowsPackage.getProxyPort());
		subprogramAccessEClass.getESuperTypes().add(this.getFeature());
		subprogramAccessEClass.getESuperTypes().add(this.getSubprogramInterface());
		subprogramSpecificationEClass.getESuperTypes().add(thePortsandflowsPackage.getInterfaceBlock());
		dataTypeEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		dataTypeEClass.getESuperTypes().add(this.getComponentType());
		dataTypeEClass.getESuperTypes().add(this.getAnnexContaining());
		dataTypeEClass.getESuperTypes().add(this.getDataAccessContaining());
		dataTypeEClass.getESuperTypes().add(this.getSubprogramAccessContaining());
		dataTypeEClass.getESuperTypes().add(this.getDataClassifier());
		dataTypeEClass.getESuperTypes().add(this.getSubprogramCallContext());
		dataAccessEClass.getESuperTypes().add(thePortsandflowsPackage.getProxyPort());
		dataAccessEClass.getESuperTypes().add(this.getDataAccessConnectionEnd());
		dataAccessEClass.getESuperTypes().add(this.getFeature());
		deviceImplementationEClass.getESuperTypes().add(this.getComponentImplementation());
		deviceImplementationEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		deviceImplementationEClass.getESuperTypes().add(this.getAnnexContaining());
		deviceImplementationEClass.getESuperTypes().add(this.getBusAccessConnectionContaining());
		deviceImplementationEClass.getESuperTypes().add(this.getBusContaining());
		deviceImplementationEClass.getESuperTypes().add(this.getDataContaining());
		deviceImplementationEClass.getESuperTypes().add(this.getDeviceClassifier());
		deviceImplementationEClass.getESuperTypes().add(this.getPortConnectionContaining());
		deviceImplementationEClass.getESuperTypes().add(this.getSubprogramAccessConnectionContaining());
		busSubcomponentEClass.getESuperTypes().add(this.getSubcomponentClassifier());
		busSubcomponentEClass.getESuperTypes().add(this.getBusAccessConnectionEnd());
		deviceTypeEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		deviceTypeEClass.getESuperTypes().add(this.getComponentType());
		deviceTypeEClass.getESuperTypes().add(this.getAnnexContaining());
		deviceTypeEClass.getESuperTypes().add(this.getBusAccessContaining());
		deviceTypeEClass.getESuperTypes().add(this.getDeviceClassifier());
		deviceTypeEClass.getESuperTypes().add(this.getPortContaining());
		deviceTypeEClass.getESuperTypes().add(this.getSubprogramAccessContaining());
		memoryImplementationEClass.getESuperTypes().add(this.getComponentImplementation());
		memoryImplementationEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		memoryImplementationEClass.getESuperTypes().add(this.getAnnexContaining());
		memoryImplementationEClass.getESuperTypes().add(this.getBusAccessConnectionContaining());
		memoryImplementationEClass.getESuperTypes().add(this.getBusContaining());
		memoryImplementationEClass.getESuperTypes().add(this.getMemoryClassifier());
		memoryImplementationEClass.getESuperTypes().add(this.getMemoryContaining());
		memoryImplementationEClass.getESuperTypes().add(this.getPortConnectionContaining());
		memorySubcomponentEClass.getESuperTypes().add(this.getSubcomponentClassifier());
		memoryTypeEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		memoryTypeEClass.getESuperTypes().add(this.getComponentType());
		memoryTypeEClass.getESuperTypes().add(this.getAnnexContaining());
		memoryTypeEClass.getESuperTypes().add(this.getBusAccessContaining());
		memoryTypeEClass.getESuperTypes().add(this.getMemoryClassifier());
		memoryTypeEClass.getESuperTypes().add(this.getPortContaining());
		processImplementationEClass.getESuperTypes().add(this.getComponentImplementation());
		processImplementationEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		processImplementationEClass.getESuperTypes().add(this.getAnnexContaining());
		processImplementationEClass.getESuperTypes().add(this.getDataAccessConnectionContaining());
		processImplementationEClass.getESuperTypes().add(this.getDataContaining());
		processImplementationEClass.getESuperTypes().add(this.getPortConnectionContaining());
		processImplementationEClass.getESuperTypes().add(this.getProcessClassifier());
		processImplementationEClass.getESuperTypes().add(this.getSubprogramAccessConnectionContaining());
		processImplementationEClass.getESuperTypes().add(this.getSubprogramContaining());
		processImplementationEClass.getESuperTypes().add(this.getThreadContaining());
		threadSubcomponentEClass.getESuperTypes().add(this.getSubcomponentClassifier());
		processorImplementationEClass.getESuperTypes().add(this.getComponentImplementation());
		processorImplementationEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		processorImplementationEClass.getESuperTypes().add(this.getAnnexContaining());
		processorImplementationEClass.getESuperTypes().add(this.getBusAccessConnectionContaining());
		processorImplementationEClass.getESuperTypes().add(this.getBusContaining());
		processorImplementationEClass.getESuperTypes().add(this.getMemoryContaining());
		processorImplementationEClass.getESuperTypes().add(this.getPortConnectionContaining());
		processorImplementationEClass.getESuperTypes().add(this.getProcessorClassifier());
		processorImplementationEClass.getESuperTypes().add(this.getSubprogramAccessConnectionContaining());
		processorTypeEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		processorTypeEClass.getESuperTypes().add(this.getComponentType());
		processorTypeEClass.getESuperTypes().add(this.getAnnexContaining());
		processorTypeEClass.getESuperTypes().add(this.getBusAccessContaining());
		processorTypeEClass.getESuperTypes().add(this.getPortContaining());
		processorTypeEClass.getESuperTypes().add(this.getProcessorClassifier());
		processorTypeEClass.getESuperTypes().add(this.getSubprogramAccessContaining());
		processTypeEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		processTypeEClass.getESuperTypes().add(this.getComponentType());
		processTypeEClass.getESuperTypes().add(this.getAnnexContaining());
		processTypeEClass.getESuperTypes().add(this.getDataAccessContaining());
		processTypeEClass.getESuperTypes().add(this.getPortContaining());
		processTypeEClass.getESuperTypes().add(this.getProcessClassifier());
		subprogramImplementationEClass.getESuperTypes().add(this.getComponentImplementation());
		subprogramImplementationEClass.getESuperTypes().add(this.getAnnexContaining());
		subprogramImplementationEClass.getESuperTypes().add(this.getCallSequenceDescribable());
		subprogramImplementationEClass.getESuperTypes().add(this.getDataAccessConnectionContaining());
		subprogramImplementationEClass.getESuperTypes().add(this.getDataContaining());
		subprogramImplementationEClass.getESuperTypes().add(this.getParameterConnectionContaining());
		subprogramImplementationEClass.getESuperTypes().add(this.getPortConnectionContaining());
		subprogramImplementationEClass.getESuperTypes().add(this.getSubprogramAccessConnectionContaining());
		subprogramImplementationEClass.getESuperTypes().add(this.getSubprogramClassifier());
		subprogramImplementationEClass.getESuperTypes().add(this.getSubprogramContaining());
		parameterConnectionEClass.getESuperTypes().add(this.getConnection());
		subprogramCallEClass.getESuperTypes().add(this.getParameterConnectionContext());
		subprogramTypeEClass.getESuperTypes().add(this.getComponentType());
		subprogramTypeEClass.getESuperTypes().add(this.getAnnexContaining());
		subprogramTypeEClass.getESuperTypes().add(this.getDataAccessContaining());
		subprogramTypeEClass.getESuperTypes().add(this.getParameterContaining());
		subprogramTypeEClass.getESuperTypes().add(this.getPortContaining());
		subprogramTypeEClass.getESuperTypes().add(this.getSubprogramAccessContaining());
		subprogramTypeEClass.getESuperTypes().add(this.getSubprogramClassifier());
		parameterEClass.getESuperTypes().add(this.getFeature());
		parameterEClass.getESuperTypes().add(this.getParameterConnectionEnd());
		systemImplementationEClass.getESuperTypes().add(this.getComponentImplementation());
		systemImplementationEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		systemImplementationEClass.getESuperTypes().add(this.getAnnexContaining());
		systemImplementationEClass.getESuperTypes().add(this.getBusAccessConnectionContaining());
		systemImplementationEClass.getESuperTypes().add(this.getBusContaining());
		systemImplementationEClass.getESuperTypes().add(this.getDataAccessConnectionContaining());
		systemImplementationEClass.getESuperTypes().add(this.getDataContaining());
		systemImplementationEClass.getESuperTypes().add(this.getDeviceContaining());
		systemImplementationEClass.getESuperTypes().add(this.getMemoryContaining());
		systemImplementationEClass.getESuperTypes().add(this.getPortConnectionContaining());
		systemImplementationEClass.getESuperTypes().add(this.getProcessContaining());
		systemImplementationEClass.getESuperTypes().add(this.getProcessorContaining());
		systemImplementationEClass.getESuperTypes().add(this.getSubprogramAccessConnectionContaining());
		systemImplementationEClass.getESuperTypes().add(this.getSubprogramContaining());
		systemImplementationEClass.getESuperTypes().add(this.getSystemClassifier());
		systemImplementationEClass.getESuperTypes().add(this.getSystemContaining());
		processSubcomponentEClass.getESuperTypes().add(this.getSubcomponentClassifier());
		processorSubcomponentEClass.getESuperTypes().add(this.getSubcomponentClassifier());
		systemSubcomponentEClass.getESuperTypes().add(this.getSubcomponentClassifier());
		deviceSubcomponentEClass.getESuperTypes().add(this.getSubcomponentClassifier());
		systemTypeEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		systemTypeEClass.getESuperTypes().add(this.getComponentType());
		systemTypeEClass.getESuperTypes().add(this.getAnnexContaining());
		systemTypeEClass.getESuperTypes().add(this.getBusAccessContaining());
		systemTypeEClass.getESuperTypes().add(this.getDataAccessContaining());
		systemTypeEClass.getESuperTypes().add(this.getPortContaining());
		systemTypeEClass.getESuperTypes().add(this.getSubprogramAccessContaining());
		systemTypeEClass.getESuperTypes().add(this.getSystemClassifier());
		threadImplementationEClass.getESuperTypes().add(this.getComponentImplementation());
		threadImplementationEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		threadImplementationEClass.getESuperTypes().add(this.getAnnexContaining());
		threadImplementationEClass.getESuperTypes().add(this.getCallSequenceDescribable());
		threadImplementationEClass.getESuperTypes().add(this.getDataAccessConnectionContaining());
		threadImplementationEClass.getESuperTypes().add(this.getDataContaining());
		threadImplementationEClass.getESuperTypes().add(this.getParameterConnectionContaining());
		threadImplementationEClass.getESuperTypes().add(this.getPortConnectionContaining());
		threadImplementationEClass.getESuperTypes().add(this.getSubprogramAccessConnectionContaining());
		threadImplementationEClass.getESuperTypes().add(this.getSubprogramContaining());
		threadImplementationEClass.getESuperTypes().add(this.getThreadClassifier());
		threadTypeEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		threadTypeEClass.getESuperTypes().add(this.getComponentType());
		threadTypeEClass.getESuperTypes().add(this.getAnnexContaining());
		threadTypeEClass.getESuperTypes().add(this.getDataAccessContaining());
		threadTypeEClass.getESuperTypes().add(this.getPortContaining());
		threadTypeEClass.getESuperTypes().add(this.getSubprogramAccessContaining());
		threadTypeEClass.getESuperTypes().add(this.getThreadClassifier());
		dataPortEClass.getESuperTypes().add(this.getPort());
		dataPortEClass.getESuperTypes().add(this.getParameterConnectionEnd());
		eventDataPortEClass.getESuperTypes().add(this.getDataPort());
		eventDataPortEClass.getESuperTypes().add(this.getEventPort());
		normalModeEClass.getESuperTypes().add(this.getMode());
		initialModeEClass.getESuperTypes().add(this.getMode());
		subprogramInstanceCallEClass.getESuperTypes().add(this.getSubprogramCall());
		subprogramInterfaceCallEClass.getESuperTypes().add(this.getSubprogramCall());

		// Initialize classes, features, and operations; add parameters
		initEClass(extensionEClass, Extension.class, "Extension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtension_Base_Generalization(), theUMLPackage.getGeneralization(), null, "base_Generalization", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(implementationEClass, Implementation.class, "Implementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplementation_Base_Generalization(), theUMLPackage.getGeneralization(), null, "base_Generalization", null, 0, 1, Implementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(componentTypeEClass, ComponentType.class, "ComponentType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentType_Extended(), this.getComponentType(), null, "extended", null, 0, 1, ComponentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(componentClassifierEClass, ComponentClassifier.class, "ComponentClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentClassifier_OwnedErrorModel(), theEMPackage.getErrorModelSubclause(), null, "ownedErrorModel", null, 0, 1, ComponentClassifier.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(classifierEClass, Classifier.class, "Classifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentImplementationEClass, ComponentImplementation.class, "ComponentImplementation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentImplementation_Type(), this.getComponentType(), null, "type", null, 1, 1, ComponentImplementation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getComponentImplementation_Extended(), this.getComponentImplementation(), null, "extended", null, 0, 1, ComponentImplementation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(busClassifierEClass, BusClassifier.class, "BusClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(platformClassifierEClass, PlatformClassifier.class, "PlatformClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modeAvailableEClass, ModeAvailable.class, "ModeAvailable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeAvailable_OwnedMode(), this.getModeStateMachine(), null, "ownedMode", null, 0, 1, ModeAvailable.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(modeStateMachineEClass, ModeStateMachine.class, "ModeStateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeStateMachine_Base_StateMachine(), theUMLPackage.getStateMachine(), null, "base_StateMachine", null, 0, 1, ModeStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModeStateMachine_OwnedMode(), this.getMode(), null, "ownedMode", null, 1, -1, ModeStateMachine.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getModeStateMachine_OwnedTransition(), this.getModeTransition(), null, "ownedTransition", null, 0, -1, ModeStateMachine.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(modeEClass, Mode.class, "Mode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modeTransitionEClass, ModeTransition.class, "ModeTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeTransition_Base_Transition(), theUMLPackage.getTransition(), null, "base_Transition", null, 0, 1, ModeTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModeTransition_Trigger(), this.getModeTransitionTrigger(), null, "trigger", null, 0, -1, ModeTransition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getModeTransition_From(), this.getMode(), null, "from", null, 1, 1, ModeTransition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getModeTransition_To(), this.getMode(), null, "to", null, 1, 1, ModeTransition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(modeTransitionTriggerEClass, ModeTransitionTrigger.class, "ModeTransitionTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeTransitionTrigger_Base_Trigger(), theUMLPackage.getTrigger(), null, "base_Trigger", null, 0, 1, ModeTransitionTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModeTransitionTrigger_Port(), this.getEventPort(), null, "port", null, 1, 1, ModeTransitionTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModeTransitionTrigger_Context(), this.getModeTransitionTriggerContext(), null, "context", null, 0, 1, ModeTransitionTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(eventPortEClass, EventPort.class, "EventPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portEClass, Port.class, "Port", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Specification(), this.getPortDataFlowSpecification(), null, "specification", null, 1, 1, Port.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPort_Direction(), thePortsandflowsPackage.getFlowDirection(), "direction", null, 1, 1, Port.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portDataFlowSpecificationEClass, PortDataFlowSpecification.class, "PortDataFlowSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortDataFlowSpecification_EventGate(), theUMLPackage.getInterface(), null, "eventGate", null, 1, 1, PortDataFlowSpecification.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(dataFlowSpecificationEClass, DataFlowSpecification.class, "DataFlowSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataFlowSpecification_Type(), this.getDataClassifier(), null, "type", null, 0, 1, DataFlowSpecification.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(dataClassifierEClass, DataClassifier.class, "DataClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(softwareClassifierEClass, SoftwareClassifier.class, "SoftwareClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modeTransitionTriggerContextEClass, ModeTransitionTriggerContext.class, "ModeTransitionTriggerContext", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deviceClassifierEClass, DeviceClassifier.class, "DeviceClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(memoryClassifierEClass, MemoryClassifier.class, "MemoryClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processClassifierEClass, ProcessClassifier.class, "ProcessClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processorClassifierEClass, ProcessorClassifier.class, "ProcessorClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subprogramClassifierEClass, SubprogramClassifier.class, "SubprogramClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subprogramInstanceEClass, SubprogramInstance.class, "SubprogramInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemClassifierEClass, SystemClassifier.class, "SystemClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(threadClassifierEClass, ThreadClassifier.class, "ThreadClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(busImplementationEClass, BusImplementation.class, "BusImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portConnectionContainingEClass, PortConnectionContaining.class, "PortConnectionContaining", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortConnectionContaining_OwnedPortConnection(), this.getPortConnection(), null, "ownedPortConnection", null, 0, -1, PortConnectionContaining.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(portConnectionEClass, PortConnection.class, "PortConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortConnection_Base_Connector(), theUMLPackage.getConnector(), null, "base_Connector", null, 0, 1, PortConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPortConnection_In(), this.getPort(), null, "in", null, 1, 1, PortConnection.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getPortConnection_Out(), this.getPort(), null, "out", null, 1, 1, PortConnection.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getPortConnection_InContext(), this.getPortAndAccessConectionContext(), null, "inContext", null, 0, 1, PortConnection.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getPortConnection_OutContext(), this.getPortAndAccessConectionContext(), null, "outContext", null, 0, 1, PortConnection.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portAndAccessConectionContextEClass, PortAndAccessConectionContext.class, "PortAndAccessConectionContext", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(annexContainingEClass, AnnexContaining.class, "AnnexContaining", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnexContaining_OwnedAnnex(), this.getAnnex(), null, "ownedAnnex", null, 0, -1, AnnexContaining.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(annexEClass, Annex.class, "Annex", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(busAccessConnectionContainingEClass, BusAccessConnectionContaining.class, "BusAccessConnectionContaining", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusAccessConnectionContaining_OwnedBusConnection(), this.getBusConnection(), null, "ownedBusConnection", null, 0, -1, BusAccessConnectionContaining.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(busConnectionEClass, BusConnection.class, "BusConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusConnection_Base_Connector(), theUMLPackage.getConnector(), null, "base_Connector", null, 1, 1, BusConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBusConnection_Require(), this.getBusAccessConnectionEnd(), null, "require", null, 1, 1, BusConnection.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getBusConnection_Provide(), this.getBusAccessConnectionEnd(), null, "provide", null, 1, 1, BusConnection.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getBusConnection_InContext(), this.getPortAndAccessConectionContext(), null, "inContext", null, 0, 1, BusConnection.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getBusConnection_OutContext(), this.getPortAndAccessConectionContext(), null, "outContext", null, 0, 1, BusConnection.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(busAccessConnectionEndEClass, BusAccessConnectionEnd.class, "BusAccessConnectionEnd", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(busTypeEClass, BusType.class, "BusType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portContainingEClass, PortContaining.class, "PortContaining", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortContaining_Ownedport(), this.getPort(), null, "ownedport", null, 0, -1, PortContaining.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(busAccessContainingEClass, BusAccessContaining.class, "BusAccessContaining", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusAccessContaining_OwnedBusAccess(), this.getBusAccess(), null, "ownedBusAccess", null, 0, -1, BusAccessContaining.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(busAccessEClass, BusAccess.class, "BusAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusAccess_Specification(), this.getBusFlowSpecification(), null, "specification", null, 1, 1, BusAccess.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBusAccess_Direction(), thePortsandflowsPackage.getFeatureDirection(), "direction", null, 1, 1, BusAccess.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(busFlowSpecificationEClass, BusFlowSpecification.class, "BusFlowSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusFlowSpecification_Type(), this.getBusClassifier(), null, "type", null, 1, 1, BusFlowSpecification.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(dataImplementationEClass, DataImplementation.class, "DataImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataContainingEClass, DataContaining.class, "DataContaining", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataContaining_OwnedDataSubcomponent(), this.getDataSubcomponent(), null, "ownedDataSubcomponent", null, 0, -1, DataContaining.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(dataSubcomponentEClass, DataSubcomponent.class, "DataSubcomponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSubcomponent_Type(), this.getDataClassifier(), null, "type", null, 1, 1, DataSubcomponent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(subcomponentClassifierEClass, SubcomponentClassifier.class, "SubcomponentClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubcomponentClassifier_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 0, 1, SubcomponentClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataAccessConnectionEndEClass, DataAccessConnectionEnd.class, "DataAccessConnectionEnd", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subprogramContainingEClass, SubprogramContaining.class, "SubprogramContaining", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubprogramContaining_OwnedSubprogramSubcomponent(), this.getSubprogramSubcomponent(), null, "ownedSubprogramSubcomponent", null, 0, -1, SubprogramContaining.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(subprogramSubcomponentEClass, SubprogramSubcomponent.class, "SubprogramSubcomponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubprogramSubcomponent_Type(), this.getSubprogramClassifier(), null, "type", null, 1, 1, SubprogramSubcomponent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(dataAccessConnectionContainingEClass, DataAccessConnectionContaining.class, "DataAccessConnectionContaining", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataAccessConnectionContaining_OwnedDataAccessConnection(), this.getDataAccessConnection(), null, "ownedDataAccessConnection", null, 0, -1, DataAccessConnectionContaining.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(dataAccessConnectionEClass, DataAccessConnection.class, "DataAccessConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataAccessConnection_Require(), this.getDataAccessConnectionEnd(), null, "require", null, 1, 1, DataAccessConnection.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getDataAccessConnection_Provide(), this.getDataAccessConnectionEnd(), null, "provide", null, 1, 1, DataAccessConnection.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getDataAccessConnection_InContext(), this.getPortAndAccessConectionContext(), null, "inContext", null, 0, 1, DataAccessConnection.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getDataAccessConnection_OutContext(), this.getPortAndAccessConectionContext(), null, "outContext", null, 0, 1, DataAccessConnection.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(subprogramAccessConnectionContainingEClass, SubprogramAccessConnectionContaining.class, "SubprogramAccessConnectionContaining", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubprogramAccessConnectionContaining_OwnedSubprogramAccessConnection(), this.getSubprogramAccessConnection(), null, "ownedSubprogramAccessConnection", null, 0, -1, SubprogramAccessConnectionContaining.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(subprogramAccessConnectionEClass, SubprogramAccessConnection.class, "SubprogramAccessConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubprogramAccessConnection_Base_Connector(), theUMLPackage.getConnector(), null, "base_Connector", null, 0, 1, SubprogramAccessConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubprogramAccessConnection_Require(), this.getSubprogramAccess(), null, "require", null, 1, 1, SubprogramAccessConnection.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getSubprogramAccessConnection_Provide(), this.getSubprogramAccess(), null, "provide", null, 1, 1, SubprogramAccessConnection.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getSubprogramAccessConnection_InContext(), this.getPortAndAccessConectionContext(), null, "inContext", null, 0, 1, SubprogramAccessConnection.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getSubprogramAccessConnection_OutContext(), this.getPortAndAccessConectionContext(), null, "outContext", null, 0, 1, SubprogramAccessConnection.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(subprogramAccessEClass, SubprogramAccess.class, "SubprogramAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubprogramAccess_Specification(), this.getSubprogramSpecification(), null, "specification", null, 1, 1, SubprogramAccess.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubprogramAccess_Direction(), thePortsandflowsPackage.getFeatureDirection(), "direction", null, 1, 1, SubprogramAccess.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getSubprogramAccess_Type(), this.getSubprogramClassifier(), null, "type", null, 1, 1, SubprogramAccess.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(subprogramInterfaceEClass, SubprogramInterface.class, "SubprogramInterface", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subprogramSpecificationEClass, SubprogramSpecification.class, "SubprogramSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subprogramAccessContainingEClass, SubprogramAccessContaining.class, "SubprogramAccessContaining", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubprogramAccessContaining_OwnedSubprogramAccess(), this.getSubprogramAccess(), null, "ownedSubprogramAccess", null, 0, -1, SubprogramAccessContaining.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(dataAccessContainingEClass, DataAccessContaining.class, "DataAccessContaining", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataAccessContaining_OwnedDataAccess(), this.getDataAccess(), null, "ownedDataAccess", null, 0, -1, DataAccessContaining.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(dataAccessEClass, DataAccess.class, "DataAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataAccess_Specification(), this.getDataFlowSpecification(), null, "specification", null, 1, 1, DataAccess.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataAccess_Direction(), thePortsandflowsPackage.getFeatureDirection(), "direction", null, 1, 1, DataAccess.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(subprogramCallContextEClass, SubprogramCallContext.class, "SubprogramCallContext", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deviceImplementationEClass, DeviceImplementation.class, "DeviceImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(busContainingEClass, BusContaining.class, "BusContaining", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusContaining_OwnedBusSubcomponent(), this.getBusSubcomponent(), null, "ownedBusSubcomponent", null, 0, -1, BusContaining.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(busSubcomponentEClass, BusSubcomponent.class, "BusSubcomponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusSubcomponent_Type(), this.getBusClassifier(), null, "type", null, 1, 1, BusSubcomponent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(deviceTypeEClass, DeviceType.class, "DeviceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(memoryImplementationEClass, MemoryImplementation.class, "MemoryImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(memoryContainingEClass, MemoryContaining.class, "MemoryContaining", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemoryContaining_OwnedMemorySubcomponent(), this.getMemorySubcomponent(), null, "ownedMemorySubcomponent", null, 0, -1, MemoryContaining.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(memorySubcomponentEClass, MemorySubcomponent.class, "MemorySubcomponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemorySubcomponent_Type(), this.getMemoryClassifier(), null, "type", null, 1, 1, MemorySubcomponent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(memoryTypeEClass, MemoryType.class, "MemoryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processImplementationEClass, ProcessImplementation.class, "ProcessImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(threadContainingEClass, ThreadContaining.class, "ThreadContaining", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThreadContaining_OwnedThreadSubcomponent(), this.getThreadSubcomponent(), null, "ownedThreadSubcomponent", null, 0, -1, ThreadContaining.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(threadSubcomponentEClass, ThreadSubcomponent.class, "ThreadSubcomponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThreadSubcomponent_Type(), this.getThreadClassifier(), null, "type", null, 1, 1, ThreadSubcomponent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(processorImplementationEClass, ProcessorImplementation.class, "ProcessorImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processorTypeEClass, ProcessorType.class, "ProcessorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processTypeEClass, ProcessType.class, "ProcessType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subprogramImplementationEClass, SubprogramImplementation.class, "SubprogramImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubprogramImplementation_Base_Activity(), theUMLPackage.getActivity(), null, "base_Activity", null, 0, 1, SubprogramImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(parameterConnectionContainingEClass, ParameterConnectionContaining.class, "ParameterConnectionContaining", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterConnectionContaining_OwnedParameterConnection(), this.getParameterConnection(), null, "ownedParameterConnection", null, 0, -1, ParameterConnectionContaining.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(parameterConnectionEClass, ParameterConnection.class, "ParameterConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterConnection_Base_ObjectFlow(), theUMLPackage.getObjectFlow(), null, "base_ObjectFlow", null, 0, 1, ParameterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameterConnection_In(), this.getParameterConnectionEnd(), null, "in", null, 1, 1, ParameterConnection.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getParameterConnection_Out(), this.getParameterConnectionEnd(), null, "out", null, 1, 1, ParameterConnection.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getParameterConnection_InContext(), this.getParameterConnectionContext(), null, "inContext", null, 0, 1, ParameterConnection.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getParameterConnection_OutContext(), this.getParameterConnectionContext(), null, "outContext", null, 0, 1, ParameterConnection.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(parameterConnectionEndEClass, ParameterConnectionEnd.class, "ParameterConnectionEnd", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterConnectionContextEClass, ParameterConnectionContext.class, "ParameterConnectionContext", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(callSequenceDescribableEClass, CallSequenceDescribable.class, "CallSequenceDescribable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallSequenceDescribable_OwnedCallSequence(), this.getCallSequence(), null, "ownedCallSequence", null, 0, -1, CallSequenceDescribable.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(callSequenceEClass, CallSequence.class, "CallSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallSequence_Base_Activity(), theUMLPackage.getActivity(), null, "base_Activity", null, 0, 1, CallSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCallSequence_OwnedSubprogramCall(), this.getSubprogramCall(), null, "ownedSubprogramCall", null, 1, -1, CallSequence.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getCallSequence_First(), this.getSubprogramCall(), null, "first", null, 1, 1, CallSequence.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(subprogramCallEClass, SubprogramCall.class, "SubprogramCall", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubprogramCall_Last(), this.getSubprogramCall(), this.getSubprogramCall_Next(), "last", null, 0, 1, SubprogramCall.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getSubprogramCall_Next(), this.getSubprogramCall(), this.getSubprogramCall_Last(), "next", null, 0, 1, SubprogramCall.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(subprogramTypeEClass, SubprogramType.class, "SubprogramType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubprogramType_Base_Activity(), theUMLPackage.getActivity(), null, "base_Activity", null, 0, 1, SubprogramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(parameterContainingEClass, ParameterContaining.class, "ParameterContaining", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterContaining_OwnedParameter(), this.getParameter(), null, "ownedParameter", null, 0, -1, ParameterContaining.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Direction(), theUMLPackage.getParameterDirectionKind(), "direction", null, 1, 1, Parameter.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getParameter_Base_Parameter(), theUMLPackage.getParameter(), null, "base_Parameter", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameter_Type(), this.getDataClassifier(), null, "type", null, 1, 1, Parameter.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(systemImplementationEClass, SystemImplementation.class, "SystemImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processContainingEClass, ProcessContaining.class, "ProcessContaining", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessContaining_OwnedProcessSubcomponent(), this.getProcessSubcomponent(), null, "ownedProcessSubcomponent", null, 0, -1, ProcessContaining.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(processSubcomponentEClass, ProcessSubcomponent.class, "ProcessSubcomponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessSubcomponent_Type(), this.getProcessClassifier(), null, "type", null, 1, 1, ProcessSubcomponent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(processorContainingEClass, ProcessorContaining.class, "ProcessorContaining", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessorContaining_OwnedProcessorSubcomponent(), this.getProcessorSubcomponent(), null, "ownedProcessorSubcomponent", null, 0, -1, ProcessorContaining.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(processorSubcomponentEClass, ProcessorSubcomponent.class, "ProcessorSubcomponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessorSubcomponent_Type(), this.getProcessorClassifier(), null, "type", null, 1, 1, ProcessorSubcomponent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(systemContainingEClass, SystemContaining.class, "SystemContaining", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemContaining_OwnedSystemSubcomponent(), this.getSystemSubcomponent(), null, "ownedSystemSubcomponent", null, 0, -1, SystemContaining.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(systemSubcomponentEClass, SystemSubcomponent.class, "SystemSubcomponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemSubcomponent_Type(), this.getSystemClassifier(), null, "type", null, 1, 1, SystemSubcomponent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(deviceContainingEClass, DeviceContaining.class, "DeviceContaining", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceContaining_OwnedDeviceSubcomponent(), this.getDeviceSubcomponent(), null, "ownedDeviceSubcomponent", null, 0, -1, DeviceContaining.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(deviceSubcomponentEClass, DeviceSubcomponent.class, "DeviceSubcomponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceSubcomponent_Type(), this.getDeviceClassifier(), null, "type", null, 1, 1, DeviceSubcomponent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(systemTypeEClass, SystemType.class, "SystemType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(threadImplementationEClass, ThreadImplementation.class, "ThreadImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(threadTypeEClass, ThreadType.class, "ThreadType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataPortEClass, DataPort.class, "DataPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataPort_Type(), this.getDataClassifier(), null, "type", null, 1, 1, DataPort.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(eventDataPortEClass, EventDataPort.class, "EventDataPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(normalModeEClass, NormalMode.class, "NormalMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNormalMode_Base_State(), theUMLPackage.getState(), null, "base_State", null, 0, 1, NormalMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(initialModeEClass, InitialMode.class, "InitialMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInitialMode_Base_Pseudostate(), theUMLPackage.getPseudostate(), null, "base_Pseudostate", null, 1, 1, InitialMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subprogramInstanceCallEClass, SubprogramInstanceCall.class, "SubprogramInstanceCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubprogramInstanceCall_Base_CallBehaviorAction(), theUMLPackage.getCallBehaviorAction(), null, "base_CallBehaviorAction", null, 0, 1, SubprogramInstanceCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubprogramInstanceCall_SubprogramInstance(), this.getSubprogramInstance(), null, "subprogramInstance", null, 1, 1, SubprogramInstanceCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subprogramInterfaceCallEClass, SubprogramInterfaceCall.class, "SubprogramInterfaceCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubprogramInterfaceCall_Base_CallOperationAction(), theUMLPackage.getCallOperationAction(), null, "base_CallOperationAction", null, 0, 1, SubprogramInterfaceCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubprogramInterfaceCall_SubprogramInterface(), this.getSubprogramInterface(), null, "subprogramInterface", null, 1, 1, SubprogramInterfaceCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubprogramInterfaceCall_Context(), this.getSubprogramCallContext(), null, "context", null, 0, 1, SubprogramInterfaceCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(aadlModelEClass, AadlModel.class, "AadlModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAadlModel_OwnedClassifier(), this.getClassifier(), null, "ownedClassifier", null, 0, -1, AadlModel.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getAadlModel_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 0, 1, AadlModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAadlModel_ImportEMLibrary(), theEcorePackage.getEObject(), null, "importEMLibrary", null, 0, -1, AadlModel.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
	}

} //AadlPackageImpl
