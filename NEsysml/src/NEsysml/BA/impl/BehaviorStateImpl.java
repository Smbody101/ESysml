/**
 */
package NEsysml.BA.impl;

import NEsysml.BA.BAPackage;
import NEsysml.BA.BehaviorState;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.uml2.uml.FinalState;
import org.eclipse.uml2.uml.PseudostateKind;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.BA.impl.BehaviorStateImpl#getBase_State <em>Base State</em>}</li>
 *   <li>{@link NEsysml.BA.impl.BehaviorStateImpl#isComplete <em>Is Complete</em>}</li>
 *   <li>{@link NEsysml.BA.impl.BehaviorStateImpl#isInitial <em>Is Initial</em>}</li>
 *   <li>{@link NEsysml.BA.impl.BehaviorStateImpl#isFinal <em>Is Final</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviorStateImpl extends MinimalEObjectImpl.Container implements BehaviorState {
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
	 * The default value of the '{@link #isComplete() <em>Is Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComplete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMPLETE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isComplete() <em>Is Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComplete()
	 * @generated
	 * @ordered
	 */
	protected boolean isComplete = IS_COMPLETE_EDEFAULT;
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
	 * The default value of the '{@link #isFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FINAL_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BAPackage.Literals.BEHAVIOR_STATE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BAPackage.BEHAVIOR_STATE__BASE_STATE, oldBase_State, base_State));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BAPackage.BEHAVIOR_STATE__BASE_STATE, oldBase_State, base_State));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isComplete() {
		return isComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsComplete(boolean newIsComplete) {
		boolean oldIsComplete = isComplete;
		isComplete = newIsComplete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BAPackage.BEHAVIOR_STATE__IS_COMPLETE, oldIsComplete, isComplete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isInitial() {
		// TODO: implement this method to return the 'Is Initial' attribute
		// Ensure that you remove @generated or mark it @generated NOT
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
	 * @generated NOT
	 */
	public boolean isFinal() {
		// TODO: implement this method to return the 'Is Final' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		return this.getBase_State() instanceof FinalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFinal(boolean newIsFinal) {
		// TODO: implement this method to set the 'Is Final' attribute
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
			case BAPackage.BEHAVIOR_STATE__BASE_STATE:
				if (resolve) return getBase_State();
				return basicGetBase_State();
			case BAPackage.BEHAVIOR_STATE__IS_COMPLETE:
				return isComplete();
			case BAPackage.BEHAVIOR_STATE__IS_INITIAL:
				return isInitial();
			case BAPackage.BEHAVIOR_STATE__IS_FINAL:
				return isFinal();
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
			case BAPackage.BEHAVIOR_STATE__BASE_STATE:
				setBase_State((State)newValue);
				return;
			case BAPackage.BEHAVIOR_STATE__IS_COMPLETE:
				setIsComplete((Boolean)newValue);
				return;
			case BAPackage.BEHAVIOR_STATE__IS_INITIAL:
				setIsInitial((Boolean)newValue);
				return;
			case BAPackage.BEHAVIOR_STATE__IS_FINAL:
				setIsFinal((Boolean)newValue);
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
			case BAPackage.BEHAVIOR_STATE__BASE_STATE:
				setBase_State((State)null);
				return;
			case BAPackage.BEHAVIOR_STATE__IS_COMPLETE:
				setIsComplete(IS_COMPLETE_EDEFAULT);
				return;
			case BAPackage.BEHAVIOR_STATE__IS_INITIAL:
				setIsInitial(IS_INITIAL_EDEFAULT);
				return;
			case BAPackage.BEHAVIOR_STATE__IS_FINAL:
				setIsFinal(IS_FINAL_EDEFAULT);
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
			case BAPackage.BEHAVIOR_STATE__BASE_STATE:
				return base_State != null;
			case BAPackage.BEHAVIOR_STATE__IS_COMPLETE:
				return isComplete != IS_COMPLETE_EDEFAULT;
			case BAPackage.BEHAVIOR_STATE__IS_INITIAL:
				return isInitial() != IS_INITIAL_EDEFAULT;
			case BAPackage.BEHAVIOR_STATE__IS_FINAL:
				return isFinal() != IS_FINAL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isComplete: ");
		result.append(isComplete);
		result.append(')');
		return result.toString();
	}

} //BehaviorStateImpl
