/**
 */
package NEsysml.EM.impl;

import NEsysml.AadlUtil;
import NEsysml.EM.EMPackage;
import NEsysml.EM.ErrorBehaviorState;
import NEsysml.EM.ErrorBehaviorTransition;
import NEsysml.EM.ErrorBehaviorTransitionCondition;
import NEsysml.EM.ErrorType;
import NEsysml.EM.TransitionBranch;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.PseudostateKind;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Behavior Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.impl.ErrorBehaviorTransitionImpl#getBase_Transition <em>Base Transition</em>}</li>
 *   <li>{@link NEsysml.EM.impl.ErrorBehaviorTransitionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link NEsysml.EM.impl.ErrorBehaviorTransitionImpl#getTo <em>To</em>}</li>
 *   <li>{@link NEsysml.EM.impl.ErrorBehaviorTransitionImpl#getTransCondition <em>Trans Condition</em>}</li>
 *   <li>{@link NEsysml.EM.impl.ErrorBehaviorTransitionImpl#getTypeSetConstraint <em>Type Set Constraint</em>}</li>
 *   <li>{@link NEsysml.EM.impl.ErrorBehaviorTransitionImpl#getTypeSet <em>Type Set</em>}</li>
 *   <li>{@link NEsysml.EM.impl.ErrorBehaviorTransitionImpl#getOwnedBranches <em>Owned Branches</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorBehaviorTransitionImpl extends MinimalEObjectImpl.Container implements ErrorBehaviorTransition {
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
	 * The cached value of the '{@link #getTypeSetConstraint() <em>Type Set Constraint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSetConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<ErrorType> typeSetConstraint;

	/**
	 * The cached value of the '{@link #getTypeSet() <em>Type Set</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSet()
	 * @generated
	 * @ordered
	 */
	protected EList<ErrorType> typeSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorBehaviorTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMPackage.Literals.ERROR_BEHAVIOR_TRANSITION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMPackage.ERROR_BEHAVIOR_TRANSITION__BASE_TRANSITION, oldBase_Transition, base_Transition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMPackage.ERROR_BEHAVIOR_TRANSITION__BASE_TRANSITION, oldBase_Transition, base_Transition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorBehaviorState getFrom() {
		ErrorBehaviorState from = basicGetFrom();
		return from != null && from.eIsProxy() ? (ErrorBehaviorState)eResolveProxy((InternalEObject)from) : from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ErrorBehaviorState basicGetFrom() {
		// TODO: implement this method to return the 'From' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		if(this.getBase_Transition() == null)
			return null;
		Vertex vertex = this.getBase_Transition().getSource();
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
	public void setFrom(ErrorBehaviorState newFrom) {
		// TODO: implement this method to set the 'From' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorBehaviorState getTo() {
		ErrorBehaviorState to = basicGetTo();
		return to != null && to.eIsProxy() ? (ErrorBehaviorState)eResolveProxy((InternalEObject)to) : to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ErrorBehaviorState basicGetTo() {
		// TODO: implement this method to return the 'To' reference
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
	public void setTo(ErrorBehaviorState newTo) {
		// TODO: implement this method to set the 'To' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorBehaviorTransitionCondition getTransCondition() {
		ErrorBehaviorTransitionCondition transCondition = basicGetTransCondition();
		return transCondition != null && transCondition.eIsProxy() ? (ErrorBehaviorTransitionCondition)eResolveProxy((InternalEObject)transCondition) : transCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ErrorBehaviorTransitionCondition basicGetTransCondition() {
		// TODO: implement this method to return the 'Trans Condition' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		if(this.getBase_Transition() == null)
			return null;
		if(this.getBase_Transition().getGuard() != null && this.getBase_Transition().getGuard().getSpecification() instanceof OpaqueExpression) {
			OpaqueExpression expression = (OpaqueExpression) this.getBase_Transition().getGuard().getSpecification();
			if(AadlUtil.eINSTANCE.isStereotypedBy(expression.getBehavior(), EMPackage.Literals.ERROR_BEHAVIOR_TRANSITION_CONDITION)){
				return (ErrorBehaviorTransitionCondition) AadlUtil.eINSTANCE.getStereotypeApplication(expression.getBehavior(), EMPackage.Literals.ERROR_BEHAVIOR_TRANSITION_CONDITION);
			}
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransCondition(ErrorBehaviorTransitionCondition newTransCondition) {
		// TODO: implement this method to set the 'Trans Condition' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErrorType> getTypeSetConstraint() {
		if (typeSetConstraint == null) {
			typeSetConstraint = new EObjectResolvingEList<ErrorType>(ErrorType.class, this, EMPackage.ERROR_BEHAVIOR_TRANSITION__TYPE_SET_CONSTRAINT);
		}
		return typeSetConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErrorType> getTypeSet() {
		if (typeSet == null) {
			typeSet = new EObjectResolvingEList<ErrorType>(ErrorType.class, this, EMPackage.ERROR_BEHAVIOR_TRANSITION__TYPE_SET);
		}
		return typeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<TransitionBranch> getOwnedBranches() {
		// TODO: implement this method to return the 'Owned Branches' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<TransitionBranch> list = new BasicEList<TransitionBranch>();
		if(this.getBase_Transition() == null)
			return list;
		Vertex vertex = this.getBase_Transition().getTarget();
		if(vertex instanceof Pseudostate && ((Pseudostate)vertex).getKind() == PseudostateKind.JUNCTION_LITERAL) {
			for(Transition transition : vertex.getOutgoings()) {
				for(EObject object : transition.getStereotypeApplications())
					if(object instanceof TransitionBranch)
						list.add((TransitionBranch) object);
				}
		}
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
			case EMPackage.ERROR_BEHAVIOR_TRANSITION__BASE_TRANSITION:
				if (resolve) return getBase_Transition();
				return basicGetBase_Transition();
			case EMPackage.ERROR_BEHAVIOR_TRANSITION__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case EMPackage.ERROR_BEHAVIOR_TRANSITION__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case EMPackage.ERROR_BEHAVIOR_TRANSITION__TRANS_CONDITION:
				if (resolve) return getTransCondition();
				return basicGetTransCondition();
			case EMPackage.ERROR_BEHAVIOR_TRANSITION__TYPE_SET_CONSTRAINT:
				return getTypeSetConstraint();
			case EMPackage.ERROR_BEHAVIOR_TRANSITION__TYPE_SET:
				return getTypeSet();
			case EMPackage.ERROR_BEHAVIOR_TRANSITION__OWNED_BRANCHES:
				return getOwnedBranches();
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
			case EMPackage.ERROR_BEHAVIOR_TRANSITION__BASE_TRANSITION:
				setBase_Transition((Transition)newValue);
				return;
			case EMPackage.ERROR_BEHAVIOR_TRANSITION__FROM:
				setFrom((ErrorBehaviorState)newValue);
				return;
			case EMPackage.ERROR_BEHAVIOR_TRANSITION__TO:
				setTo((ErrorBehaviorState)newValue);
				return;
			case EMPackage.ERROR_BEHAVIOR_TRANSITION__TRANS_CONDITION:
				setTransCondition((ErrorBehaviorTransitionCondition)newValue);
				return;
			case EMPackage.ERROR_BEHAVIOR_TRANSITION__TYPE_SET_CONSTRAINT:
				getTypeSetConstraint().clear();
				getTypeSetConstraint().addAll((Collection<? extends ErrorType>)newValue);
				return;
			case EMPackage.ERROR_BEHAVIOR_TRANSITION__TYPE_SET:
				getTypeSet().clear();
				getTypeSet().addAll((Collection<? extends ErrorType>)newValue);
				return;
			case EMPackage.ERROR_BEHAVIOR_TRANSITION__OWNED_BRANCHES:
				getOwnedBranches().clear();
				getOwnedBranches().addAll((Collection<? extends TransitionBranch>)newValue);
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
			case EMPackage.ERROR_BEHAVIOR_TRANSITION__BASE_TRANSITION:
				setBase_Transition((Transition)null);
				return;
			case EMPackage.ERROR_BEHAVIOR_TRANSITION__FROM:
				setFrom((ErrorBehaviorState)null);
				return;
			case EMPackage.ERROR_BEHAVIOR_TRANSITION__TO:
				setTo((ErrorBehaviorState)null);
				return;
			case EMPackage.ERROR_BEHAVIOR_TRANSITION__TRANS_CONDITION:
				setTransCondition((ErrorBehaviorTransitionCondition)null);
				return;
			case EMPackage.ERROR_BEHAVIOR_TRANSITION__TYPE_SET_CONSTRAINT:
				getTypeSetConstraint().clear();
				return;
			case EMPackage.ERROR_BEHAVIOR_TRANSITION__TYPE_SET:
				getTypeSet().clear();
				return;
			case EMPackage.ERROR_BEHAVIOR_TRANSITION__OWNED_BRANCHES:
				getOwnedBranches().clear();
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
			case EMPackage.ERROR_BEHAVIOR_TRANSITION__BASE_TRANSITION:
				return base_Transition != null;
			case EMPackage.ERROR_BEHAVIOR_TRANSITION__FROM:
				return basicGetFrom() != null;
			case EMPackage.ERROR_BEHAVIOR_TRANSITION__TO:
				return basicGetTo() != null;
			case EMPackage.ERROR_BEHAVIOR_TRANSITION__TRANS_CONDITION:
				return basicGetTransCondition() != null;
			case EMPackage.ERROR_BEHAVIOR_TRANSITION__TYPE_SET_CONSTRAINT:
				return typeSetConstraint != null && !typeSetConstraint.isEmpty();
			case EMPackage.ERROR_BEHAVIOR_TRANSITION__TYPE_SET:
				return typeSet != null && !typeSet.isEmpty();
			case EMPackage.ERROR_BEHAVIOR_TRANSITION__OWNED_BRANCHES:
				return !getOwnedBranches().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ErrorBehaviorTransitionImpl
