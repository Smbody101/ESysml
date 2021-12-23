/**
 */
package NEsysml.EM.impl;

import NEsysml.AadlUtil;
import NEsysml.EM.EMPackage;
import NEsysml.EM.ErrorModelLibrary;
import NEsysml.EM.ErrorType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.DataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.impl.ErrorTypeImpl#getBase_DataType <em>Base Data Type</em>}</li>
 *   <li>{@link NEsysml.EM.impl.ErrorTypeImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link NEsysml.EM.impl.ErrorTypeImpl#getInLibrary <em>In Library</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorTypeImpl extends MinimalEObjectImpl.Container implements ErrorType {
	/**
	 * The cached value of the '{@link #getBase_DataType() <em>Base Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_DataType()
	 * @generated
	 * @ordered
	 */
	protected DataType base_DataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMPackage.Literals.ERROR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getBase_DataType() {
		if (base_DataType != null && base_DataType.eIsProxy()) {
			InternalEObject oldBase_DataType = (InternalEObject)base_DataType;
			base_DataType = (DataType)eResolveProxy(oldBase_DataType);
			if (base_DataType != oldBase_DataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMPackage.ERROR_TYPE__BASE_DATA_TYPE, oldBase_DataType, base_DataType));
			}
		}
		return base_DataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetBase_DataType() {
		return base_DataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_DataType(DataType newBase_DataType) {
		DataType oldBase_DataType = base_DataType;
		base_DataType = newBase_DataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMPackage.ERROR_TYPE__BASE_DATA_TYPE, oldBase_DataType, base_DataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorType getExtension() {
		ErrorType extension = basicGetExtension();
		return extension != null && extension.eIsProxy() ? (ErrorType)eResolveProxy((InternalEObject)extension) : extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ErrorType basicGetExtension() {
		// TODO: implement this method to return the 'Extension' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		if(this.getBase_DataType() == null)
			return null;
		for(Classifier classifier : this.getBase_DataType().getGenerals())
			if(AadlUtil.eINSTANCE.isStereotypedBy(classifier, EMPackage.Literals.ERROR_TYPE))
				return (ErrorType) AadlUtil.eINSTANCE.getStereotypeApplication(classifier, EMPackage.Literals.ERROR_TYPE);
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtension(ErrorType newExtension) {
		// TODO: implement this method to set the 'Extension' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorModelLibrary getInLibrary() {
		ErrorModelLibrary inLibrary = basicGetInLibrary();
		return inLibrary != null && inLibrary.eIsProxy() ? (ErrorModelLibrary)eResolveProxy((InternalEObject)inLibrary) : inLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ErrorModelLibrary basicGetInLibrary() {
		// TODO: implement this method to return the 'In Library' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		if(this.getBase_DataType() == null)
			return null;
		if(AadlUtil.eINSTANCE.isStereotypedBy(this.getBase_DataType().getPackage(), EMPackage.Literals.ERROR_MODEL_LIBRARY))
			return (ErrorModelLibrary) AadlUtil.eINSTANCE.getStereotypeApplication(this.getBase_DataType().getPackage(), EMPackage.Literals.ERROR_MODEL_LIBRARY);
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInLibrary(ErrorModelLibrary newInLibrary) {
		// TODO: implement this method to set the 'In Library' reference
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
			case EMPackage.ERROR_TYPE__BASE_DATA_TYPE:
				if (resolve) return getBase_DataType();
				return basicGetBase_DataType();
			case EMPackage.ERROR_TYPE__EXTENSION:
				if (resolve) return getExtension();
				return basicGetExtension();
			case EMPackage.ERROR_TYPE__IN_LIBRARY:
				if (resolve) return getInLibrary();
				return basicGetInLibrary();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EMPackage.ERROR_TYPE__BASE_DATA_TYPE:
				setBase_DataType((DataType)newValue);
				return;
			case EMPackage.ERROR_TYPE__EXTENSION:
				setExtension((ErrorType)newValue);
				return;
			case EMPackage.ERROR_TYPE__IN_LIBRARY:
				setInLibrary((ErrorModelLibrary)newValue);
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
			case EMPackage.ERROR_TYPE__BASE_DATA_TYPE:
				setBase_DataType((DataType)null);
				return;
			case EMPackage.ERROR_TYPE__EXTENSION:
				setExtension((ErrorType)null);
				return;
			case EMPackage.ERROR_TYPE__IN_LIBRARY:
				setInLibrary((ErrorModelLibrary)null);
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
			case EMPackage.ERROR_TYPE__BASE_DATA_TYPE:
				return base_DataType != null;
			case EMPackage.ERROR_TYPE__EXTENSION:
				return basicGetExtension() != null;
			case EMPackage.ERROR_TYPE__IN_LIBRARY:
				return basicGetInLibrary() != null;
		}
		return super.eIsSet(featureID);
	}

} //ErrorTypeImpl
