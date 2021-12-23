/**
 */
package NEsysml.Aadl.impl;

import NEsysml.Aadl.AadlModel;
import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.Classifier;
import NEsysml.Aadl.ComponentClassifier;
import NEsysml.EM.ErrorModelLibrary;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.uml2.uml.Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.AadlModelImpl#getOwnedClassifier <em>Owned Classifier</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.AadlModelImpl#getBase_Package <em>Base Package</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.AadlModelImpl#getImportEMLibrary <em>Import EM Library</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AadlModelImpl extends MinimalEObjectImpl.Container implements AadlModel {
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
	protected AadlModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.AADL_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Classifier> getOwnedClassifier() {
		// TODO: implement this method to return the 'Owned Classifier' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<Classifier> list = new BasicEList<Classifier>();
		for(Element element : this.base_Package.allOwnedElements()) {
			for(EObject object : element.getStereotypeApplications()) {
				if(object instanceof Classifier) {
					list.add((Classifier) object);
				}
			}
		}
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AadlPackage.AADL_MODEL__BASE_PACKAGE, oldBase_Package, base_Package));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AadlPackage.AADL_MODEL__BASE_PACKAGE, oldBase_Package, base_Package));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<EObject> getImportEMLibrary() {
		// TODO: implement this method to return the 'Import EM Library' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<EObject> list = new BasicEList<EObject>();
		Set<EObject> libs = new HashSet<EObject>();
		for(Classifier classifier : this.getOwnedClassifier()) {
			if(classifier instanceof ComponentClassifier) {
				if(((ComponentClassifier)classifier).getOwnedErrorModel() == null)
					continue;
				for(ErrorModelLibrary lib : ((ComponentClassifier)classifier).getOwnedErrorModel().getUseTypes())
					libs.add(lib);
				libs.add(((ComponentClassifier)classifier).getOwnedErrorModel().getOwnedBehavior().getImportBehavior().getInPackage());
			}
		}
		for(EObject object : libs)
			list.add(object);
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AadlPackage.AADL_MODEL__OWNED_CLASSIFIER:
				return getOwnedClassifier();
			case AadlPackage.AADL_MODEL__BASE_PACKAGE:
				if (resolve) return getBase_Package();
				return basicGetBase_Package();
			case AadlPackage.AADL_MODEL__IMPORT_EM_LIBRARY:
				return getImportEMLibrary();
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
			case AadlPackage.AADL_MODEL__OWNED_CLASSIFIER:
				getOwnedClassifier().clear();
				getOwnedClassifier().addAll((Collection<? extends Classifier>)newValue);
				return;
			case AadlPackage.AADL_MODEL__BASE_PACKAGE:
				setBase_Package((org.eclipse.uml2.uml.Package)newValue);
				return;
			case AadlPackage.AADL_MODEL__IMPORT_EM_LIBRARY:
				getImportEMLibrary().clear();
				getImportEMLibrary().addAll((Collection<? extends EObject>)newValue);
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
			case AadlPackage.AADL_MODEL__OWNED_CLASSIFIER:
				getOwnedClassifier().clear();
				return;
			case AadlPackage.AADL_MODEL__BASE_PACKAGE:
				setBase_Package((org.eclipse.uml2.uml.Package)null);
				return;
			case AadlPackage.AADL_MODEL__IMPORT_EM_LIBRARY:
				getImportEMLibrary().clear();
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
			case AadlPackage.AADL_MODEL__OWNED_CLASSIFIER:
				return !getOwnedClassifier().isEmpty();
			case AadlPackage.AADL_MODEL__BASE_PACKAGE:
				return base_Package != null;
			case AadlPackage.AADL_MODEL__IMPORT_EM_LIBRARY:
				return !getImportEMLibrary().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AadlModelImpl
