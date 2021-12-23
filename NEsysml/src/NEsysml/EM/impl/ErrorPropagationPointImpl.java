/**
 */
package NEsysml.EM.impl;

import NEsysml.Aadl.Feature;
import NEsysml.EM.EMPackage;
import NEsysml.EM.ErrorPropagationPoint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.sysml14.portsandflows.PortsandflowsPackage;
import org.eclipse.papyrus.sysml14.portsandflows.ProxyPort;

import org.eclipse.uml2.uml.Port;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Propagation Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.impl.ErrorPropagationPointImpl#getBase_Port <em>Base Port</em>}</li>
 *   <li>{@link NEsysml.EM.impl.ErrorPropagationPointImpl#getBindFeature <em>Bind Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorPropagationPointImpl extends ErrorTypedElementImpl implements ErrorPropagationPoint {
	/**
	 * The cached value of the '{@link #getBase_Port() <em>Base Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Port()
	 * @generated
	 * @ordered
	 */
	protected Port base_Port;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorPropagationPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMPackage.Literals.ERROR_PROPAGATION_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getBase_Port() {
		if (base_Port != null && base_Port.eIsProxy()) {
			InternalEObject oldBase_Port = (InternalEObject)base_Port;
			base_Port = (Port)eResolveProxy(oldBase_Port);
			if (base_Port != oldBase_Port) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMPackage.ERROR_PROPAGATION_POINT__BASE_PORT, oldBase_Port, base_Port));
			}
		}
		return base_Port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetBase_Port() {
		return base_Port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Port(Port newBase_Port) {
		Port oldBase_Port = base_Port;
		base_Port = newBase_Port;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMPackage.ERROR_PROPAGATION_POINT__BASE_PORT, oldBase_Port, base_Port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getBindFeature() {
		EObject bindFeature = basicGetBindFeature();
		return bindFeature != null && bindFeature.eIsProxy() ? eResolveProxy((InternalEObject)bindFeature) : bindFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EObject basicGetBindFeature() {
		// TODO: implement this method to return the 'Bind Feature' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		if(this.getBase_Port() == null)
			return null;
		for(EObject object : this.getBase_Port().getStereotypeApplications()) {
			if(object instanceof Feature)
				return object;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindFeature(EObject newBindFeature) {
		// TODO: implement this method to set the 'Bind Feature' reference
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
			case EMPackage.ERROR_PROPAGATION_POINT__BASE_PORT:
				if (resolve) return getBase_Port();
				return basicGetBase_Port();
			case EMPackage.ERROR_PROPAGATION_POINT__BIND_FEATURE:
				if (resolve) return getBindFeature();
				return basicGetBindFeature();
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
			case EMPackage.ERROR_PROPAGATION_POINT__BASE_PORT:
				setBase_Port((Port)newValue);
				return;
			case EMPackage.ERROR_PROPAGATION_POINT__BIND_FEATURE:
				setBindFeature((EObject)newValue);
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
			case EMPackage.ERROR_PROPAGATION_POINT__BASE_PORT:
				setBase_Port((Port)null);
				return;
			case EMPackage.ERROR_PROPAGATION_POINT__BIND_FEATURE:
				setBindFeature((EObject)null);
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
			case EMPackage.ERROR_PROPAGATION_POINT__BASE_PORT:
				return base_Port != null;
			case EMPackage.ERROR_PROPAGATION_POINT__BIND_FEATURE:
				return basicGetBindFeature() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ProxyPort.class) {
			switch (derivedFeatureID) {
				case EMPackage.ERROR_PROPAGATION_POINT__BASE_PORT: return PortsandflowsPackage.PROXY_PORT__BASE_PORT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ProxyPort.class) {
			switch (baseFeatureID) {
				case PortsandflowsPackage.PROXY_PORT__BASE_PORT: return EMPackage.ERROR_PROPAGATION_POINT__BASE_PORT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ErrorPropagationPointImpl
