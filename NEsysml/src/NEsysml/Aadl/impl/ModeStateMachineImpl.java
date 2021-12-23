/**
 */
package NEsysml.Aadl.impl;

import NEsysml.AadlUtil;
import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.Mode;
import NEsysml.Aadl.ModeStateMachine;
import NEsysml.Aadl.ModeTransition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mode State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.ModeStateMachineImpl#getBase_StateMachine <em>Base State Machine</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.ModeStateMachineImpl#getOwnedMode <em>Owned Mode</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.ModeStateMachineImpl#getOwnedTransition <em>Owned Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModeStateMachineImpl extends MinimalEObjectImpl.Container implements ModeStateMachine {
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
	protected ModeStateMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.MODE_STATE_MACHINE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AadlPackage.MODE_STATE_MACHINE__BASE_STATE_MACHINE, oldBase_StateMachine, base_StateMachine));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AadlPackage.MODE_STATE_MACHINE__BASE_STATE_MACHINE, oldBase_StateMachine, base_StateMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Mode> getOwnedMode() {
		// TODO: implement this method to return the 'Owned Mode' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<Mode> list = new BasicEList<Mode>();
		for(Region region : this.getBase_StateMachine().getRegions())
			for(Vertex vertex : region.getSubvertices())
				for(EObject object : vertex.getStereotypeApplications())
					if(object instanceof Mode)
						list.add((Mode) object);
		
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ModeTransition> getOwnedTransition() {
		// TODO: implement this method to return the 'Owned Transition' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<ModeTransition> list = new BasicEList<ModeTransition>();
		for(Region region : this.getBase_StateMachine().getRegions())
			for(Transition transition : region.getTransitions())
				if(AadlUtil.eINSTANCE.isStereotypedBy(transition, AadlPackage.Literals.MODE_TRANSITION))
					list.add((ModeTransition) AadlUtil.eINSTANCE.getStereotypeApplication(transition, AadlPackage.Literals.MODE_TRANSITION));
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
			case AadlPackage.MODE_STATE_MACHINE__BASE_STATE_MACHINE:
				if (resolve) return getBase_StateMachine();
				return basicGetBase_StateMachine();
			case AadlPackage.MODE_STATE_MACHINE__OWNED_MODE:
				return getOwnedMode();
			case AadlPackage.MODE_STATE_MACHINE__OWNED_TRANSITION:
				return getOwnedTransition();
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
			case AadlPackage.MODE_STATE_MACHINE__BASE_STATE_MACHINE:
				setBase_StateMachine((StateMachine)newValue);
				return;
			case AadlPackage.MODE_STATE_MACHINE__OWNED_MODE:
				getOwnedMode().clear();
				getOwnedMode().addAll((Collection<? extends Mode>)newValue);
				return;
			case AadlPackage.MODE_STATE_MACHINE__OWNED_TRANSITION:
				getOwnedTransition().clear();
				getOwnedTransition().addAll((Collection<? extends ModeTransition>)newValue);
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
			case AadlPackage.MODE_STATE_MACHINE__BASE_STATE_MACHINE:
				setBase_StateMachine((StateMachine)null);
				return;
			case AadlPackage.MODE_STATE_MACHINE__OWNED_MODE:
				getOwnedMode().clear();
				return;
			case AadlPackage.MODE_STATE_MACHINE__OWNED_TRANSITION:
				getOwnedTransition().clear();
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
			case AadlPackage.MODE_STATE_MACHINE__BASE_STATE_MACHINE:
				return base_StateMachine != null;
			case AadlPackage.MODE_STATE_MACHINE__OWNED_MODE:
				return !getOwnedMode().isEmpty();
			case AadlPackage.MODE_STATE_MACHINE__OWNED_TRANSITION:
				return !getOwnedTransition().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModeStateMachineImpl
