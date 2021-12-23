/**
 */
package NEsysml;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see NEsysml.NEsysmlFactory
 * @model kind="package"
 * @generated
 */
public interface NEsysmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "NEsysml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://smbody/esysml/2.0/ESysML";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "NEsysml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NEsysmlPackage eINSTANCE = NEsysml.impl.NEsysmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link NEsysml.Dummy <em>Dummy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NEsysml.Dummy
	 * @see NEsysml.impl.NEsysmlPackageImpl#getDummy()
	 * @generated
	 */
	int DUMMY = 0;


	/**
	 * Returns the meta object for enum '{@link NEsysml.Dummy <em>Dummy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dummy</em>'.
	 * @see NEsysml.Dummy
	 * @generated
	 */
	EEnum getDummy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NEsysmlFactory getNEsysmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link NEsysml.Dummy <em>Dummy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NEsysml.Dummy
		 * @see NEsysml.impl.NEsysmlPackageImpl#getDummy()
		 * @generated
		 */
		EEnum DUMMY = eINSTANCE.getDummy();

	}

} //NEsysmlPackage
