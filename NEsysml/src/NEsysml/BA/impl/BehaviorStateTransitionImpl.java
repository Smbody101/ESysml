/**
 */
package NEsysml.BA.impl;

import NEsysml.AadlUtil;
import NEsysml.BA.BAPackage;
import NEsysml.BA.BehaviorActionBlock;
import NEsysml.BA.BehaviorState;
import NEsysml.BA.BehaviorStateTransition;
import NEsysml.BA.TransitionCondition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Trigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior State Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.BA.impl.BehaviorStateTransitionImpl#getBase_Transition <em>Base Transition</em>}</li>
 *   <li>{@link NEsysml.BA.impl.BehaviorStateTransitionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link NEsysml.BA.impl.BehaviorStateTransitionImpl#getTo <em>To</em>}</li>
 *   <li>{@link NEsysml.BA.impl.BehaviorStateTransitionImpl#getOwnedActionBlock <em>Owned Action Block</em>}</li>
 *   <li>{@link NEsysml.BA.impl.BehaviorStateTransitionImpl#getOwnedCondition <em>Owned Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviorStateTransitionImpl extends MinimalEObjectImpl.Container implements BehaviorStateTransition {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorStateTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BAPackage.Literals.BEHAVIOR_STATE_TRANSITION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BAPackage.BEHAVIOR_STATE_TRANSITION__BASE_TRANSITION, oldBase_Transition, base_Transition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BAPackage.BEHAVIOR_STATE_TRANSITION__BASE_TRANSITION, oldBase_Transition, base_Transition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorState getFrom() {
		BehaviorState from = basicGetFrom();
		return from != null && from.eIsProxy() ? (BehaviorState)eResolveProxy((InternalEObject)from) : from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BehaviorState basicGetFrom() {
		// TODO: implement this method to return the 'From' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		if(AadlUtil.eINSTANCE.isStereotypedBy(this.getBase_Transition().getSource(), BAPackage.Literals.BEHAVIOR_STATE))
			return (BehaviorState) AadlUtil.eINSTANCE.getStereotypeApplication(this.getBase_Transition().getSource(), BAPackage.Literals.BEHAVIOR_STATE);
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(BehaviorState newFrom) {
		// TODO: implement this method to set the 'From' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorState getTo() {
		BehaviorState to = basicGetTo();
		return to != null && to.eIsProxy() ? (BehaviorState)eResolveProxy((InternalEObject)to) : to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BehaviorState basicGetTo() {
		// TODO: implement this method to return the 'To' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		if(AadlUtil.eINSTANCE.isStereotypedBy(this.getBase_Transition().getTarget(), BAPackage.Literals.BEHAVIOR_STATE))
			return (BehaviorState) AadlUtil.eINSTANCE.getStereotypeApplication(this.getBase_Transition().getTarget(), BAPackage.Literals.BEHAVIOR_STATE);
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(BehaviorState newTo) {
		// TODO: implement this method to set the 'To' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorActionBlock getOwnedActionBlock() {
		BehaviorActionBlock ownedActionBlock = basicGetOwnedActionBlock();
		return ownedActionBlock != null && ownedActionBlock.eIsProxy() ? (BehaviorActionBlock)eResolveProxy((InternalEObject)ownedActionBlock) : ownedActionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BehaviorActionBlock basicGetOwnedActionBlock() {
		// TODO: implement this method to return the 'Owned Action Block' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		if(this.getBase_Transition().getEffect() == null)
			return null;
		if(AadlUtil.eINSTANCE.isStereotypedBy(this.getBase_Transition().getEffect(), BAPackage.Literals.BEHAVIOR_ACTION_BLOCK))
			return (BehaviorActionBlock) AadlUtil.eINSTANCE.getStereotypeApplication(this.getBase_Transition().getEffect(), BAPackage.Literals.BEHAVIOR_ACTION_BLOCK);
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedActionBlock(BehaviorActionBlock newOwnedActionBlock) {
		// TODO: implement this method to set the 'Owned Action Block' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionCondition getOwnedCondition() {
		TransitionCondition ownedCondition = basicGetOwnedCondition();
		return ownedCondition != null && ownedCondition.eIsProxy() ? (TransitionCondition)eResolveProxy((InternalEObject)ownedCondition) : ownedCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TransitionCondition basicGetOwnedCondition() {
		// TODO: implement this method to return the 'Owned Condition' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		if(this.getBase_Transition().getGuard() != null && AadlUtil.eINSTANCE.isStereotypedBy(this.getBase_Transition().getGuard(), BAPackage.Literals.TEXT_CONDITION))
			return (TransitionCondition) AadlUtil.eINSTANCE.getStereotypeApplication(this.getBase_Transition().getGuard(), BAPackage.Literals.TEXT_CONDITION);
		for(Trigger trigger : this.getBase_Transition().getTriggers()) {
			if(AadlUtil.eINSTANCE.isStereotypedBy(trigger, BAPackage.Literals.DISPATCH_CONDITION))
				return (TransitionCondition) AadlUtil.eINSTANCE.getStereotypeApplication(trigger, BAPackage.Literals.DISPATCH_CONDITION);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedCondition(TransitionCondition newOwnedCondition) {
		// TODO: implement this method to set the 'Owned Condition' reference
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
			case BAPackage.BEHAVIOR_STATE_TRANSITION__BASE_TRANSITION:
				if (resolve) return getBase_Transition();
				return basicGetBase_Transition();
			case BAPackage.BEHAVIOR_STATE_TRANSITION__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case BAPackage.BEHAVIOR_STATE_TRANSITION__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case BAPackage.BEHAVIOR_STATE_TRANSITION__OWNED_ACTION_BLOCK:
				if (resolve) return getOwnedActionBlock();
				return basicGetOwnedActionBlock();
			case BAPackage.BEHAVIOR_STATE_TRANSITION__OWNED_CONDITION:
				if (resolve) return getOwnedCondition();
				return basicGetOwnedCondition();
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
			case BAPackage.BEHAVIOR_STATE_TRANSITION__BASE_TRANSITION:
				setBase_Transition((Transition)newValue);
				return;
			case BAPackage.BEHAVIOR_STATE_TRANSITION__FROM:
				setFrom((BehaviorState)newValue);
				return;
			case BAPackage.BEHAVIOR_STATE_TRANSITION__TO:
				setTo((BehaviorState)newValue);
				return;
			case BAPackage.BEHAVIOR_STATE_TRANSITION__OWNED_ACTION_BLOCK:
				setOwnedActionBlock((BehaviorActionBlock)newValue);
				return;
			case BAPackage.BEHAVIOR_STATE_TRANSITION__OWNED_CONDITION:
				setOwnedCondition((TransitionCondition)newValue);
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
			case BAPackage.BEHAVIOR_STATE_TRANSITION__BASE_TRANSITION:
				setBase_Transition((Transition)null);
				return;
			case BAPackage.BEHAVIOR_STATE_TRANSITION__FROM:
				setFrom((BehaviorState)null);
				return;
			case BAPackage.BEHAVIOR_STATE_TRANSITION__TO:
				setTo((BehaviorState)null);
				return;
			case BAPackage.BEHAVIOR_STATE_TRANSITION__OWNED_ACTION_BLOCK:
				setOwnedActionBlock((BehaviorActionBlock)null);
				return;
			case BAPackage.BEHAVIOR_STATE_TRANSITION__OWNED_CONDITION:
				setOwnedCondition((TransitionCondition)null);
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
			case BAPackage.BEHAVIOR_STATE_TRANSITION__BASE_TRANSITION:
				return base_Transition != null;
			case BAPackage.BEHAVIOR_STATE_TRANSITION__FROM:
				return basicGetFrom() != null;
			case BAPackage.BEHAVIOR_STATE_TRANSITION__TO:
				return basicGetTo() != null;
			case BAPackage.BEHAVIOR_STATE_TRANSITION__OWNED_ACTION_BLOCK:
				return basicGetOwnedActionBlock() != null;
			case BAPackage.BEHAVIOR_STATE_TRANSITION__OWNED_CONDITION:
				return basicGetOwnedCondition() != null;
		}
		return super.eIsSet(featureID);
	}

} //BehaviorStateTransitionImpl
