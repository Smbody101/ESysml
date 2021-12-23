/**
 */
package NEsysml.EM.impl;

import NEsysml.AadlUtil;
import NEsysml.EM.EMPackage;
import NEsysml.EM.ErrorBehavior;
import NEsysml.EM.ErrorBehaviorEvent;
import NEsysml.EM.ErrorBehaviorState;
import NEsysml.EM.ErrorBehaviorStateMachine;
import NEsysml.EM.ErrorBehaviorTransition;
import NEsysml.EM.ErrorEvent;
import NEsysml.EM.ErrorModelLibrary;
import NEsysml.EM.ErrorType;
import NEsysml.EM.TransitionBranch;

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
import org.eclipse.uml2.uml.AcceptEventAction;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.impl.ErrorBehaviorImpl#getBase_StateMachine <em>Base State Machine</em>}</li>
 *   <li>{@link NEsysml.EM.impl.ErrorBehaviorImpl#getOwnedEvent <em>Owned Event</em>}</li>
 *   <li>{@link NEsysml.EM.impl.ErrorBehaviorImpl#getOwnedState <em>Owned State</em>}</li>
 *   <li>{@link NEsysml.EM.impl.ErrorBehaviorImpl#getOwnedTransition <em>Owned Transition</em>}</li>
 *   <li>{@link NEsysml.EM.impl.ErrorBehaviorImpl#getUseType <em>Use Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ErrorBehaviorImpl extends MinimalEObjectImpl.Container implements ErrorBehavior {
	/**
	 * The cached value of the '{@link #getBase_StateMachine() <em>Base State Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_StateMachine()
	 * @generated
	 * @ordered
	 */
	protected StateMachine base_StateMachine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorBehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMPackage.Literals.ERROR_BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getBase_StateMachine() {
		if (base_StateMachine != null && base_StateMachine.eIsProxy()) {
			InternalEObject oldBase_StateMachine = (InternalEObject)base_StateMachine;
			base_StateMachine = (StateMachine)eResolveProxy(oldBase_StateMachine);
			if (base_StateMachine != oldBase_StateMachine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMPackage.ERROR_BEHAVIOR__BASE_STATE_MACHINE, oldBase_StateMachine, base_StateMachine));
			}
		}
		return base_StateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine basicGetBase_StateMachine() {
		return base_StateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_StateMachine(StateMachine newBase_StateMachine) {
		StateMachine oldBase_StateMachine = base_StateMachine;
		base_StateMachine = newBase_StateMachine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMPackage.ERROR_BEHAVIOR__BASE_STATE_MACHINE, oldBase_StateMachine, base_StateMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ErrorBehaviorEvent> getOwnedEvent() {
		// TODO: implement this method to return the 'Owned Event' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<ErrorBehaviorEvent> list = new BasicEList<ErrorBehaviorEvent>();
		for(ErrorBehaviorTransition transition : this.getOwnedTransition()) {
			for(ActivityNode node : transition.getTransCondition().getBase_Activity().getNodes())
				if(node instanceof AcceptEventAction) {
					for(Trigger trigger : ((AcceptEventAction) node).getTriggers()) {
						if(AadlUtil.eINSTANCE.isStereotypedBy(trigger, EMPackage.Literals.ERROR_EVENT_TRIGGER))
							if(trigger.getEvent() != null) {
								for(EObject object : trigger.getEvent().getStereotypeApplications())
									if(object instanceof ErrorBehaviorEvent)
										list.add((ErrorBehaviorEvent) object);
							}
					}
				}
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ErrorBehaviorState> getOwnedState() {
		// TODO: implement this method to return the 'Owned State' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<ErrorBehaviorState> list = new BasicEList<ErrorBehaviorState>();
		for(Region region : this.getBase_StateMachine().getRegions())
			for(Vertex vertex : region.getSubvertices()) {
				if(AadlUtil.eINSTANCE.isStereotypedBy(vertex, EMPackage.Literals.ERROR_BEHAVIOR_STATE))
					list.add((ErrorBehaviorState) AadlUtil.eINSTANCE.getStereotypeApplication(vertex, EMPackage.Literals.ERROR_BEHAVIOR_STATE));
			}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ErrorBehaviorTransition> getOwnedTransition() {
		// TODO: implement this method to return the 'Owned Transition' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<ErrorBehaviorTransition> list = new BasicEList<ErrorBehaviorTransition>();
		if(this.getBase_StateMachine() == null)
			return list;
		for(Region region : this.getBase_StateMachine().getRegions())
			for(Transition transition : region.getTransitions()) {
				if(AadlUtil.eINSTANCE.isStereotypedBy(transition, EMPackage.Literals.ERROR_BEHAVIOR_TRANSITION))
					list.add((ErrorBehaviorTransition) AadlUtil.eINSTANCE.getStereotypeApplication(transition, EMPackage.Literals.ERROR_BEHAVIOR_TRANSITION));
			}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ErrorModelLibrary> getUseType() {
		// TODO: implement this method to return the 'Use Type' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<ErrorModelLibrary> list = new BasicEList<ErrorModelLibrary>();
		Set<ErrorType> types = new HashSet<ErrorType>();
		Set<ErrorModelLibrary> libs = new HashSet<ErrorModelLibrary>();
		for(ErrorBehaviorEvent event : this.getOwnedEvent()) {
			if(event instanceof ErrorEvent) {
				for(ErrorType type : ((ErrorEvent)event).getOwnedErrorType())
					types.add(type);
			}
		}
		for(ErrorBehaviorState state : this.getOwnedState()) {
			for(ErrorType type : state.getOwnedErrorType())
				types.add(type);
		}
		for(ErrorBehaviorTransition transition : this.getOwnedTransition()) {
			for(ErrorType type : transition.getTypeSet())
				types.add(type);
			for(ErrorType type : transition.getTypeSetConstraint())
				types.add(type);
			for(TransitionBranch branch : transition.getOwnedBranches())
				for(ErrorType type : branch.getOwnedErrorType())
					types.add(type);
		}
		if(this instanceof ErrorBehaviorStateMachine) {
			for(ErrorType type : types) {
				libs.add(type.getInLibrary());
			}
		}
		for(ErrorModelLibrary l : libs)
			list.add(l);
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
			case EMPackage.ERROR_BEHAVIOR__BASE_STATE_MACHINE:
				if (resolve) return getBase_StateMachine();
				return basicGetBase_StateMachine();
			case EMPackage.ERROR_BEHAVIOR__OWNED_EVENT:
				return getOwnedEvent();
			case EMPackage.ERROR_BEHAVIOR__OWNED_STATE:
				return getOwnedState();
			case EMPackage.ERROR_BEHAVIOR__OWNED_TRANSITION:
				return getOwnedTransition();
			case EMPackage.ERROR_BEHAVIOR__USE_TYPE:
				return getUseType();
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
			case EMPackage.ERROR_BEHAVIOR__BASE_STATE_MACHINE:
				setBase_StateMachine((StateMachine)newValue);
				return;
			case EMPackage.ERROR_BEHAVIOR__OWNED_EVENT:
				getOwnedEvent().clear();
				getOwnedEvent().addAll((Collection<? extends ErrorBehaviorEvent>)newValue);
				return;
			case EMPackage.ERROR_BEHAVIOR__OWNED_STATE:
				getOwnedState().clear();
				getOwnedState().addAll((Collection<? extends ErrorBehaviorState>)newValue);
				return;
			case EMPackage.ERROR_BEHAVIOR__OWNED_TRANSITION:
				getOwnedTransition().clear();
				getOwnedTransition().addAll((Collection<? extends ErrorBehaviorTransition>)newValue);
				return;
			case EMPackage.ERROR_BEHAVIOR__USE_TYPE:
				getUseType().clear();
				getUseType().addAll((Collection<? extends ErrorModelLibrary>)newValue);
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
			case EMPackage.ERROR_BEHAVIOR__BASE_STATE_MACHINE:
				setBase_StateMachine((StateMachine)null);
				return;
			case EMPackage.ERROR_BEHAVIOR__OWNED_EVENT:
				getOwnedEvent().clear();
				return;
			case EMPackage.ERROR_BEHAVIOR__OWNED_STATE:
				getOwnedState().clear();
				return;
			case EMPackage.ERROR_BEHAVIOR__OWNED_TRANSITION:
				getOwnedTransition().clear();
				return;
			case EMPackage.ERROR_BEHAVIOR__USE_TYPE:
				getUseType().clear();
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
			case EMPackage.ERROR_BEHAVIOR__BASE_STATE_MACHINE:
				return base_StateMachine != null;
			case EMPackage.ERROR_BEHAVIOR__OWNED_EVENT:
				return !getOwnedEvent().isEmpty();
			case EMPackage.ERROR_BEHAVIOR__OWNED_STATE:
				return !getOwnedState().isEmpty();
			case EMPackage.ERROR_BEHAVIOR__OWNED_TRANSITION:
				return !getOwnedTransition().isEmpty();
			case EMPackage.ERROR_BEHAVIOR__USE_TYPE:
				return !getUseType().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ErrorBehaviorImpl
