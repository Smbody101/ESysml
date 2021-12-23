/**
 */
package NEsysml.Aadl.impl;

import NEsysml.AadlUtil;
import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.Mode;
import NEsysml.Aadl.ModeTransition;
import NEsysml.Aadl.ModeTransitionTrigger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mode Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.ModeTransitionImpl#getBase_Transition <em>Base Transition</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.ModeTransitionImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.ModeTransitionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.ModeTransitionImpl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModeTransitionImpl extends MinimalEObjectImpl.Container implements ModeTransition {
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
	protected ModeTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.MODE_TRANSITION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AadlPackage.MODE_TRANSITION__BASE_TRANSITION, oldBase_Transition, base_Transition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AadlPackage.MODE_TRANSITION__BASE_TRANSITION, oldBase_Transition, base_Transition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ModeTransitionTrigger> getTrigger() {
		// TODO: implement this method to return the 'Trigger' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<ModeTransitionTrigger> list = new BasicEList<ModeTransitionTrigger>();
		for(Trigger trigger : this.getBase_Transition().getTriggers())
			if(AadlUtil.eINSTANCE.isStereotypedBy(trigger, AadlPackage.Literals.MODE_TRANSITION_TRIGGER))
				list.add((ModeTransitionTrigger) AadlUtil.eINSTANCE.getStereotypeApplication(trigger, AadlPackage.Literals.MODE_TRANSITION_TRIGGER));
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode getFrom() {
		Mode from = basicGetFrom();
		return from != null && from.eIsProxy() ? (Mode)eResolveProxy((InternalEObject)from) : from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Mode basicGetFrom() {
		// TODO: implement this method to return the 'From' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		Vertex vertex = this.getBase_Transition().getSource();
		for(EObject object : vertex.getStereotypeApplications())
			if(object instanceof Mode)
				return (Mode) object;
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Mode newFrom) {
		// TODO: implement this method to set the 'From' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode getTo() {
		Mode to = basicGetTo();
		return to != null && to.eIsProxy() ? (Mode)eResolveProxy((InternalEObject)to) : to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Mode basicGetTo() {
		// TODO: implement this method to return the 'To' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		Vertex vertex = this.getBase_Transition().getTarget();
		for(EObject object : vertex.getStereotypeApplications())
			if(object instanceof Mode)
				return (Mode) object;
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(Mode newTo) {
		// TODO: implement this method to set the 'To' reference
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
			case AadlPackage.MODE_TRANSITION__BASE_TRANSITION:
				if (resolve) return getBase_Transition();
				return basicGetBase_Transition();
			case AadlPackage.MODE_TRANSITION__TRIGGER:
				return getTrigger();
			case AadlPackage.MODE_TRANSITION__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case AadlPackage.MODE_TRANSITION__TO:
				if (resolve) return getTo();
				return basicGetTo();
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
			case AadlPackage.MODE_TRANSITION__BASE_TRANSITION:
				setBase_Transition((Transition)newValue);
				return;
			case AadlPackage.MODE_TRANSITION__TRIGGER:
				getTrigger().clear();
				getTrigger().addAll((Collection<? extends ModeTransitionTrigger>)newValue);
				return;
			case AadlPackage.MODE_TRANSITION__FROM:
				setFrom((Mode)newValue);
				return;
			case AadlPackage.MODE_TRANSITION__TO:
				setTo((Mode)newValue);
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
			case AadlPackage.MODE_TRANSITION__BASE_TRANSITION:
				setBase_Transition((Transition)null);
				return;
			case AadlPackage.MODE_TRANSITION__TRIGGER:
				getTrigger().clear();
				return;
			case AadlPackage.MODE_TRANSITION__FROM:
				setFrom((Mode)null);
				return;
			case AadlPackage.MODE_TRANSITION__TO:
				setTo((Mode)null);
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
			case AadlPackage.MODE_TRANSITION__BASE_TRANSITION:
				return base_Transition != null;
			case AadlPackage.MODE_TRANSITION__TRIGGER:
				return !getTrigger().isEmpty();
			case AadlPackage.MODE_TRANSITION__FROM:
				return basicGetFrom() != null;
			case AadlPackage.MODE_TRANSITION__TO:
				return basicGetTo() != null;
		}
		return super.eIsSet(featureID);
	}

} //ModeTransitionImpl
