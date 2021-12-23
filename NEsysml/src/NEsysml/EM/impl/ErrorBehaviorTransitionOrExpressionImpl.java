/**
 */
package NEsysml.EM.impl;

import NEsysml.EM.EMPackage;
import NEsysml.EM.ErrorBehaviorTransitionOrExpression;
import NEsysml.EM.ErrorTransitionTrigger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.AcceptEventAction;
import org.eclipse.uml2.uml.Trigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Behavior Transition Or Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.impl.ErrorBehaviorTransitionOrExpressionImpl#getBase_AcceptEventAction <em>Base Accept Event Action</em>}</li>
 *   <li>{@link NEsysml.EM.impl.ErrorBehaviorTransitionOrExpressionImpl#getOprands <em>Oprands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorBehaviorTransitionOrExpressionImpl extends ErrorBehaviorTransitionExpressionImpl implements ErrorBehaviorTransitionOrExpression {
	/**
	 * The cached value of the '{@link #getBase_AcceptEventAction() <em>Base Accept Event Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_AcceptEventAction()
	 * @generated
	 * @ordered
	 */
	protected AcceptEventAction base_AcceptEventAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorBehaviorTransitionOrExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMPackage.Literals.ERROR_BEHAVIOR_TRANSITION_OR_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptEventAction getBase_AcceptEventAction() {
		if (base_AcceptEventAction != null && base_AcceptEventAction.eIsProxy()) {
			InternalEObject oldBase_AcceptEventAction = (InternalEObject)base_AcceptEventAction;
			base_AcceptEventAction = (AcceptEventAction)eResolveProxy(oldBase_AcceptEventAction);
			if (base_AcceptEventAction != oldBase_AcceptEventAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMPackage.ERROR_BEHAVIOR_TRANSITION_OR_EXPRESSION__BASE_ACCEPT_EVENT_ACTION, oldBase_AcceptEventAction, base_AcceptEventAction));
			}
		}
		return base_AcceptEventAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptEventAction basicGetBase_AcceptEventAction() {
		return base_AcceptEventAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_AcceptEventAction(AcceptEventAction newBase_AcceptEventAction) {
		AcceptEventAction oldBase_AcceptEventAction = base_AcceptEventAction;
		base_AcceptEventAction = newBase_AcceptEventAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMPackage.ERROR_BEHAVIOR_TRANSITION_OR_EXPRESSION__BASE_ACCEPT_EVENT_ACTION, oldBase_AcceptEventAction, base_AcceptEventAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ErrorTransitionTrigger> getOprands() {
		// TODO: implement this method to return the 'Oprands' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<ErrorTransitionTrigger> list = new BasicEList<ErrorTransitionTrigger>();
		if(this.getBase_AcceptEventAction() == null)
			return null;
		for(Trigger trigger : this.getBase_AcceptEventAction().getTriggers()) {
			for(EObject object : trigger.getStereotypeApplications())
				if(object instanceof ErrorTransitionTrigger)
					list.add((ErrorTransitionTrigger) object);
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
			case EMPackage.ERROR_BEHAVIOR_TRANSITION_OR_EXPRESSION__BASE_ACCEPT_EVENT_ACTION:
				if (resolve) return getBase_AcceptEventAction();
				return basicGetBase_AcceptEventAction();
			case EMPackage.ERROR_BEHAVIOR_TRANSITION_OR_EXPRESSION__OPRANDS:
				return getOprands();
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
			case EMPackage.ERROR_BEHAVIOR_TRANSITION_OR_EXPRESSION__BASE_ACCEPT_EVENT_ACTION:
				setBase_AcceptEventAction((AcceptEventAction)newValue);
				return;
			case EMPackage.ERROR_BEHAVIOR_TRANSITION_OR_EXPRESSION__OPRANDS:
				getOprands().clear();
				getOprands().addAll((Collection<? extends ErrorTransitionTrigger>)newValue);
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
			case EMPackage.ERROR_BEHAVIOR_TRANSITION_OR_EXPRESSION__BASE_ACCEPT_EVENT_ACTION:
				setBase_AcceptEventAction((AcceptEventAction)null);
				return;
			case EMPackage.ERROR_BEHAVIOR_TRANSITION_OR_EXPRESSION__OPRANDS:
				getOprands().clear();
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
			case EMPackage.ERROR_BEHAVIOR_TRANSITION_OR_EXPRESSION__BASE_ACCEPT_EVENT_ACTION:
				return base_AcceptEventAction != null;
			case EMPackage.ERROR_BEHAVIOR_TRANSITION_OR_EXPRESSION__OPRANDS:
				return !getOprands().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ErrorBehaviorTransitionOrExpressionImpl
