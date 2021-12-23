/**
 */
package NEsysml.EM.impl;

import NEsysml.AadlUtil;
import NEsysml.EM.EMPackage;
import NEsysml.EM.ErrorBehaviorStateMachine;
import NEsysml.EM.ErrorModelLibrary;
import NEsysml.EM.ErrorType;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.uml2.uml.Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Model Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.impl.ErrorModelLibraryImpl#getOwnedBehaviors <em>Owned Behaviors</em>}</li>
 *   <li>{@link NEsysml.EM.impl.ErrorModelLibraryImpl#getOwnedErrorType <em>Owned Error Type</em>}</li>
 *   <li>{@link NEsysml.EM.impl.ErrorModelLibraryImpl#getImport <em>Import</em>}</li>
 *   <li>{@link NEsysml.EM.impl.ErrorModelLibraryImpl#getBase_Package <em>Base Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorModelLibraryImpl extends MinimalEObjectImpl.Container implements ErrorModelLibrary {
	/**
	 * The cached value of the '{@link #getBase_Package() <em>Base Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Package()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Package base_Package;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorModelLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMPackage.Literals.ERROR_MODEL_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ErrorBehaviorStateMachine> getOwnedBehaviors() {
		// TODO: implement this method to return the 'Owned Behaviors' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<ErrorBehaviorStateMachine> list = new BasicEList<ErrorBehaviorStateMachine>();
		if(this.getBase_Package() == null)
			return list;
		for(Element e : this.getBase_Package().getMembers()) {
			if(AadlUtil.eINSTANCE.isStereotypedBy(e, EMPackage.Literals.ERROR_BEHAVIOR_STATE_MACHINE))
				list.add((ErrorBehaviorStateMachine) AadlUtil.eINSTANCE.getStereotypeApplication(e, EMPackage.Literals.ERROR_BEHAVIOR_STATE_MACHINE));
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ErrorType> getOwnedErrorType() {
		// TODO: implement this method to return the 'Owned Error Type' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<ErrorType> list = new BasicEList<ErrorType>();
		if(this.getBase_Package() == null)
			return list;
		for(Element e : this.getBase_Package().getMembers()) {
			if(AadlUtil.eINSTANCE.isStereotypedBy(e, EMPackage.Literals.ERROR_TYPE))
				list.add((ErrorType) AadlUtil.eINSTANCE.getStereotypeApplication(e, EMPackage.Literals.ERROR_TYPE));
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ErrorModelLibrary> getImport() {
		// TODO: implement this method to return the 'Import' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<ErrorModelLibrary> list = new BasicEList<ErrorModelLibrary>();
		Set<ErrorModelLibrary> libs = new HashSet<ErrorModelLibrary>();
		if(this.getBase_Package() == null)
			return list;
		for(Element e : this.getBase_Package().getMembers()) {
			if(e.getNearestPackage() != this.getBase_Package() && AadlUtil.eINSTANCE.isStereotypedBy(e.getNearestPackage(), EMPackage.Literals.ERROR_MODEL_LIBRARY))
				libs.add((ErrorModelLibrary) AadlUtil.eINSTANCE.getStereotypeApplication(e.getNearestPackage(), EMPackage.Literals.ERROR_MODEL_LIBRARY));
		}
		for(ErrorModelLibrary lib : libs)
			list.add(lib);
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package getBase_Package() {
		if (base_Package != null && base_Package.eIsProxy()) {
			InternalEObject oldBase_Package = (InternalEObject)base_Package;
			base_Package = (org.eclipse.uml2.uml.Package)eResolveProxy(oldBase_Package);
			if (base_Package != oldBase_Package) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMPackage.ERROR_MODEL_LIBRARY__BASE_PACKAGE, oldBase_Package, base_Package));
			}
		}
		return base_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package basicGetBase_Package() {
		return base_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Package(org.eclipse.uml2.uml.Package newBase_Package) {
		org.eclipse.uml2.uml.Package oldBase_Package = base_Package;
		base_Package = newBase_Package;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMPackage.ERROR_MODEL_LIBRARY__BASE_PACKAGE, oldBase_Package, base_Package));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EMPackage.ERROR_MODEL_LIBRARY__OWNED_BEHAVIORS:
				return getOwnedBehaviors();
			case EMPackage.ERROR_MODEL_LIBRARY__OWNED_ERROR_TYPE:
				return getOwnedErrorType();
			case EMPackage.ERROR_MODEL_LIBRARY__IMPORT:
				return getImport();
			case EMPackage.ERROR_MODEL_LIBRARY__BASE_PACKAGE:
				if (resolve) return getBase_Package();
				return basicGetBase_Package();
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
			case EMPackage.ERROR_MODEL_LIBRARY__OWNED_BEHAVIORS:
				getOwnedBehaviors().clear();
				getOwnedBehaviors().addAll((Collection<? extends ErrorBehaviorStateMachine>)newValue);
				return;
			case EMPackage.ERROR_MODEL_LIBRARY__OWNED_ERROR_TYPE:
				getOwnedErrorType().clear();
				getOwnedErrorType().addAll((Collection<? extends ErrorType>)newValue);
				return;
			case EMPackage.ERROR_MODEL_LIBRARY__IMPORT:
				getImport().clear();
				getImport().addAll((Collection<? extends ErrorModelLibrary>)newValue);
				return;
			case EMPackage.ERROR_MODEL_LIBRARY__BASE_PACKAGE:
				setBase_Package((org.eclipse.uml2.uml.Package)newValue);
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
			case EMPackage.ERROR_MODEL_LIBRARY__OWNED_BEHAVIORS:
				getOwnedBehaviors().clear();
				return;
			case EMPackage.ERROR_MODEL_LIBRARY__OWNED_ERROR_TYPE:
				getOwnedErrorType().clear();
				return;
			case EMPackage.ERROR_MODEL_LIBRARY__IMPORT:
				getImport().clear();
				return;
			case EMPackage.ERROR_MODEL_LIBRARY__BASE_PACKAGE:
				setBase_Package((org.eclipse.uml2.uml.Package)null);
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
			case EMPackage.ERROR_MODEL_LIBRARY__OWNED_BEHAVIORS:
				return !getOwnedBehaviors().isEmpty();
			case EMPackage.ERROR_MODEL_LIBRARY__OWNED_ERROR_TYPE:
				return !getOwnedErrorType().isEmpty();
			case EMPackage.ERROR_MODEL_LIBRARY__IMPORT:
				return !getImport().isEmpty();
			case EMPackage.ERROR_MODEL_LIBRARY__BASE_PACKAGE:
				return base_Package != null;
		}
		return super.eIsSet(featureID);
	}

} //ErrorModelLibraryImpl
