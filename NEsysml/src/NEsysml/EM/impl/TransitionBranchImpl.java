/**
 */
package NEsysml.EM.impl;

import NEsysml.EM.EMPackage;
import NEsysml.EM.ErrorBehaviorState;
import NEsysml.EM.TransitionBranch;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.impl.TransitionBranchImpl#getBase_Transition <em>Base Transition</em>}</li>
 *   <li>{@link NEsysml.EM.impl.TransitionBranchImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link NEsysml.EM.impl.TransitionBranchImpl#isOthers <em>Is Others</em>}</li>
 *   <li>{@link NEsysml.EM.impl.TransitionBranchImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionBranchImpl extends ErrorTypedElementImpl implements TransitionBranch {
	/**
	 * The cached value of the '{@link #getBase_Transition() <em>Base Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Transition()
	 * @generated
	 * @ordered
	 */
	protected Transition base_Transition;

	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double PROBABILITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected double probability = PROBABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isOthers() <em>Is Others</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOthers()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OTHERS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOthers() <em>Is Others</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOthers()
	 * @generated
	 * @ordered
	 */
	protected boolean isOthers = IS_OTHERS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionBranchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMPackage.Literals.TRANSITION_BRANCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getBase_Transition() {
		if (base_Transition != null && base_Transition.eIsProxy()) {
			InternalEObject oldBase_Transition = (InternalEObject)base_Transition;
			base_Transition = (Transition)eResolveProxy(oldBase_Transition);
			if (base_Transition != oldBase_Transition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMPackage.TRANSITION_BRANCH__BASE_TRANSITION, oldBase_Transition, base_Transition));
			}
		}
		return base_Transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetBase_Transition() {
		return base_Transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Transition(Transition newBase_Transition) {
		Transition oldBase_Transition = base_Transition;
		base_Transition = newBase_Transition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMPackage.TRANSITION_BRANCH__BASE_TRANSITION, oldBase_Transition, base_Transition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProbability() {
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(double newProbability) {
		double oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMPackage.TRANSITION_BRANCH__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOthers() {
		return isOthers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOthers(boolean newIsOthers) {
		boolean oldIsOthers = isOthers;
		isOthers = newIsOthers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMPackage.TRANSITION_BRANCH__IS_OTHERS, oldIsOthers, isOthers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorBehaviorState getTarget() {
		ErrorBehaviorState target = basicGetTarget();
		return target != null && target.eIsProxy() ? (ErrorBehaviorState)eResolveProxy((InternalEObject)target) : target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ErrorBehaviorState basicGetTarget() {
		// TODO: implement this method to return the 'Target' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		if(this.getBase_Transition() == null)
			return null;
		Vertex vertex = this.getBase_Transition().getTarget();
		for(EObject object : vertex.getStereotypeApplications())
			if(object instanceof ErrorBehaviorState)
				return (ErrorBehaviorState) object;
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ErrorBehaviorState newTarget) {
		// TODO: implement this method to set the 'Target' reference
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
			case EMPackage.TRANSITION_BRANCH__BASE_TRANSITION:
				if (resolve) return getBase_Transition();
				return basicGetBase_Transition();
			case EMPackage.TRANSITION_BRANCH__PROBABILITY:
				return getProbability();
			case EMPackage.TRANSITION_BRANCH__IS_OTHERS:
				return isOthers();
			case EMPackage.TRANSITION_BRANCH__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case EMPackage.TRANSITION_BRANCH__BASE_TRANSITION:
				setBase_Transition((Transition)newValue);
				return;
			case EMPackage.TRANSITION_BRANCH__PROBABILITY:
				setProbability((Double)newValue);
				return;
			case EMPackage.TRANSITION_BRANCH__IS_OTHERS:
				setIsOthers((Boolean)newValue);
				return;
			case EMPackage.TRANSITION_BRANCH__TARGET:
				setTarget((ErrorBehaviorState)newValue);
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
			case EMPackage.TRANSITION_BRANCH__BASE_TRANSITION:
				setBase_Transition((Transition)null);
				return;
			case EMPackage.TRANSITION_BRANCH__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
				return;
			case EMPackage.TRANSITION_BRANCH__IS_OTHERS:
				setIsOthers(IS_OTHERS_EDEFAULT);
				return;
			case EMPackage.TRANSITION_BRANCH__TARGET:
				setTarget((ErrorBehaviorState)null);
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
			case EMPackage.TRANSITION_BRANCH__BASE_TRANSITION:
				return base_Transition != null;
			case EMPackage.TRANSITION_BRANCH__PROBABILITY:
				return probability != PROBABILITY_EDEFAULT;
			case EMPackage.TRANSITION_BRANCH__IS_OTHERS:
				return isOthers != IS_OTHERS_EDEFAULT;
			case EMPackage.TRANSITION_BRANCH__TARGET:
				return basicGetTarget() != null;
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
		result.append(" (probability: ");
		result.append(probability);
		result.append(", isOthers: ");
		result.append(isOthers);
		result.append(')');
		return result.toString();
	}

} //TransitionBranchImpl
