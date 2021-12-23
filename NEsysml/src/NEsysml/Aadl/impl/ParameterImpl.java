/**
 */
package NEsysml.Aadl.impl;

import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.DataClassifier;
import NEsysml.Aadl.Parameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.ParameterDirectionKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.ParameterImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.ParameterImpl#getBase_Parameter <em>Base Parameter</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.ParameterImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends FeatureImpl implements Parameter {
	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterDirectionKind DIRECTION_EDEFAULT = ParameterDirectionKind.IN_LITERAL;

	/**
	 * The cached value of the '{@link #getBase_Parameter() <em>Base Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Parameter()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Parameter base_Parameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ParameterDirectionKind getDirection() {
		// TODO: implement this method to return the 'Direction' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		return this.getBase_Parameter().getDirection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(ParameterDirectionKind newDirection) {
		// TODO: implement this method to set the 'Direction' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Parameter getBase_Parameter() {
		if (base_Parameter != null && base_Parameter.eIsProxy()) {
			InternalEObject oldBase_Parameter = (InternalEObject)base_Parameter;
			base_Parameter = (org.eclipse.uml2.uml.Parameter)eResolveProxy(oldBase_Parameter);
			if (base_Parameter != oldBase_Parameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AadlPackage.PARAMETER__BASE_PARAMETER, oldBase_Parameter, base_Parameter));
			}
		}
		return base_Parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Parameter basicGetBase_Parameter() {
		return base_Parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Parameter(org.eclipse.uml2.uml.Parameter newBase_Parameter) {
		org.eclipse.uml2.uml.Parameter oldBase_Parameter = base_Parameter;
		base_Parameter = newBase_Parameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AadlPackage.PARAMETER__BASE_PARAMETER, oldBase_Parameter, base_Parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataClassifier getType() {
		DataClassifier type = basicGetType();
		return type != null && type.eIsProxy() ? (DataClassifier)eResolveProxy((InternalEObject)type) : type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DataClassifier basicGetType() {
		// TODO: implement this method to return the 'Type' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		for(EObject object : this.getBase_Parameter().getType().getStereotypeApplications())
			if(object instanceof DataClassifier)
				return (DataClassifier) object;
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DataClassifier newType) {
		// TODO: implement this method to set the 'Type' reference
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
			case AadlPackage.PARAMETER__DIRECTION:
				return getDirection();
			case AadlPackage.PARAMETER__BASE_PARAMETER:
				if (resolve) return getBase_Parameter();
				return basicGetBase_Parameter();
			case AadlPackage.PARAMETER__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case AadlPackage.PARAMETER__DIRECTION:
				setDirection((ParameterDirectionKind)newValue);
				return;
			case AadlPackage.PARAMETER__BASE_PARAMETER:
				setBase_Parameter((org.eclipse.uml2.uml.Parameter)newValue);
				return;
			case AadlPackage.PARAMETER__TYPE:
				setType((DataClassifier)newValue);
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
			case AadlPackage.PARAMETER__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case AadlPackage.PARAMETER__BASE_PARAMETER:
				setBase_Parameter((org.eclipse.uml2.uml.Parameter)null);
				return;
			case AadlPackage.PARAMETER__TYPE:
				setType((DataClassifier)null);
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
			case AadlPackage.PARAMETER__DIRECTION:
				return getDirection() != DIRECTION_EDEFAULT;
			case AadlPackage.PARAMETER__BASE_PARAMETER:
				return base_Parameter != null;
			case AadlPackage.PARAMETER__TYPE:
				return basicGetType() != null;
		}
		return super.eIsSet(featureID);
	}

} //ParameterImpl
