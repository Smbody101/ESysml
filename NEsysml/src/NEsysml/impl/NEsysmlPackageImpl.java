/**
 */
package NEsysml.impl;

import NEsysml.Aadl.AadlPackage;

import NEsysml.Aadl.impl.AadlPackageImpl;

import NEsysml.BA.BAPackage;
import NEsysml.BA.impl.BAPackageImpl;
import NEsysml.Dummy;
import NEsysml.EM.EMPackage;
import NEsysml.EM.impl.EMPackageImpl;
import NEsysml.NEsysmlFactory;
import NEsysml.NEsysmlPackage;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
public class NEsysmlPackageImpl extends EPackageImpl implements NEsysmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dummyEEnum = null;

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
	 * @see NEsysml.NEsysmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NEsysmlPackageImpl() {
		super(eNS_URI, NEsysmlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link NEsysmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NEsysmlPackage init() {
		if (isInited) return (NEsysmlPackage)EPackage.Registry.INSTANCE.getEPackage(NEsysmlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredNEsysmlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		NEsysmlPackageImpl theNEsysmlPackage = registeredNEsysmlPackage instanceof NEsysmlPackageImpl ? (NEsysmlPackageImpl)registeredNEsysmlPackage : new NEsysmlPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		StandardPackage.eINSTANCE.eClass();
		sysmlPackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AadlPackage.eNS_URI);
		AadlPackageImpl theAadlPackage = (AadlPackageImpl)(registeredPackage instanceof AadlPackageImpl ? registeredPackage : AadlPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EMPackage.eNS_URI);
		EMPackageImpl theEMPackage = (EMPackageImpl)(registeredPackage instanceof EMPackageImpl ? registeredPackage : EMPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BAPackage.eNS_URI);
		BAPackageImpl theBAPackage = (BAPackageImpl)(registeredPackage instanceof BAPackageImpl ? registeredPackage : BAPackage.eINSTANCE);

		// Create package meta-data objects
		theNEsysmlPackage.createPackageContents();
		theAadlPackage.createPackageContents();
		theEMPackage.createPackageContents();
		theBAPackage.createPackageContents();

		// Initialize created meta-data
		theNEsysmlPackage.initializePackageContents();
		theAadlPackage.initializePackageContents();
		theEMPackage.initializePackageContents();
		theBAPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNEsysmlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NEsysmlPackage.eNS_URI, theNEsysmlPackage);
		return theNEsysmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDummy() {
		return dummyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NEsysmlFactory getNEsysmlFactory() {
		return (NEsysmlFactory)getEFactoryInstance();
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

		// Create enums
		dummyEEnum = createEEnum(DUMMY);
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
		AadlPackage theAadlPackage = (AadlPackage)EPackage.Registry.INSTANCE.getEPackage(AadlPackage.eNS_URI);
		EMPackage theEMPackage = (EMPackage)EPackage.Registry.INSTANCE.getEPackage(EMPackage.eNS_URI);
		BAPackage theBAPackage = (BAPackage)EPackage.Registry.INSTANCE.getEPackage(BAPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theAadlPackage);
		getESubpackages().add(theEMPackage);
		getESubpackages().add(theBAPackage);

		// Initialize enums and add enum literals
		initEEnum(dummyEEnum, Dummy.class, "Dummy");

		// Create resource
		createResource(eNS_URI);
	}

} //NEsysmlPackageImpl
