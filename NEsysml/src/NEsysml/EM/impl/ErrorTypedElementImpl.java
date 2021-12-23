/**
 */
package NEsysml.EM.impl;

import NEsysml.EM.EMPackage;
import NEsysml.EM.ErrorType;
import NEsysml.EM.ErrorTypedElement;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Typed Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.impl.ErrorTypedElementImpl#getOwnedErrorType <em>Owned Error Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ErrorTypedElementImpl extends MinimalEObjectImpl.Container implements ErrorTypedElement {
	/**
	 * The cached value of the '{@link #getOwnedErrorType() <em>Owned Error Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedErrorType()
	 * @generated
	 * @ordered
	 */
	protected EList<ErrorType> ownedErrorType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorTypedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMPackage.Literals.ERROR_TYPED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErrorType> getOwnedErrorType() {
		if (ownedErrorType == null) {
			ownedErrorType = new EObjectResolvingEList<ErrorType>(ErrorType.class, this, EMPackage.ERROR_TYPED_ELEMENT__OWNED_ERROR_TYPE);
		}
		return ownedErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EMPackage.ERROR_TYPED_ELEMENT__OWNED_ERROR_TYPE:
				return getOwnedErrorType();
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
			case EMPackage.ERROR_TYPED_ELEMENT__OWNED_ERROR_TYPE:
				getOwnedErrorType().clear();
				getOwnedErrorType().addAll((Collection<? extends ErrorType>)newValue);
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
			case EMPackage.ERROR_TYPED_ELEMENT__OWNED_ERROR_TYPE:
				getOwnedErrorType().clear();
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
			case EMPackage.ERROR_TYPED_ELEMENT__OWNED_ERROR_TYPE:
				return ownedErrorType != null && !ownedErrorType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ErrorTypedElementImpl
