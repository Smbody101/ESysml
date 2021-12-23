/**
 */
package NEsysml.EM.impl;

import NEsysml.EM.EMPackage;
import NEsysml.EM.ErrorBehaviorState;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.uml.PseudostateKind;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Behavior State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.impl.ErrorBehaviorStateImpl#getBase_State <em>Base State</em>}</li>
 *   <li>{@link NEsysml.EM.impl.ErrorBehaviorStateImpl#isInitial <em>Is Initial</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorBehaviorStateImpl extends ErrorTypedElementImpl implements ErrorBehaviorState {
	/**
	 * The cached value of the '{@link #getBase_State() <em>Base State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_State()
	 * @generated
	 * @ordered
	 */
	protected State base_State;

	/**
	 * The default value of the '{@link #isInitial() <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INITIAL_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorBehaviorStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMPackage.Literals.ERROR_BEHAVIOR_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getBase_State() {
		if (base_State != null && base_State.eIsProxy()) {
			InternalEObject oldBase_State = (InternalEObject)base_State;
			base_State = (State)eResolveProxy(oldBase_State);
			if (base_State != oldBase_State) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMPackage.ERROR_BEHAVIOR_STATE__BASE_STATE, oldBase_State, base_State));
			}
		}
		return base_State;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetBase_State() {
		return base_State;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_State(State newBase_State) {
		State oldBase_State = base_State;
		base_State = newBase_State;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMPackage.ERROR_BEHAVIOR_STATE__BASE_STATE, oldBase_State, base_State));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isInitial() {
		// TODO: implement this method to return the 'Is Initial' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		if(this.getBase_State() == null)
			return false;
		
		for(Transition transition : this.getBase_State().getIncomings()) {
			if(transition.getSource() instanceof org.eclipse.uml2.uml.Pseudostate) {
				org.eclipse.uml2.uml.Pseudostate s = (org.eclipse.uml2.uml.Pseudostate) transition.getSource();
				if(s.getKind() == PseudostateKind.INITIAL_LITERAL)
					return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInitial(boolean newIsInitial) {
		// TODO: implement this method to set the 'Is Initial' attribute
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
			case EMPackage.ERROR_BEHAVIOR_STATE__BASE_STATE:
				if (resolve) return getBase_State();
				return basicGetBase_State();
			case EMPackage.ERROR_BEHAVIOR_STATE__IS_INITIAL:
				return isInitial();
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
			case EMPackage.ERROR_BEHAVIOR_STATE__BASE_STATE:
				setBase_State((State)newValue);
				return;
			case EMPackage.ERROR_BEHAVIOR_STATE__IS_INITIAL:
				setIsInitial((Boolean)newValue);
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
			case EMPackage.ERROR_BEHAVIOR_STATE__BASE_STATE:
				setBase_State((State)null);
				return;
			case EMPackage.ERROR_BEHAVIOR_STATE__IS_INITIAL:
				setIsInitial(IS_INITIAL_EDEFAULT);
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
			case EMPackage.ERROR_BEHAVIOR_STATE__BASE_STATE:
				return base_State != null;
			case EMPackage.ERROR_BEHAVIOR_STATE__IS_INITIAL:
				return isInitial() != IS_INITIAL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ErrorBehaviorStateImpl
