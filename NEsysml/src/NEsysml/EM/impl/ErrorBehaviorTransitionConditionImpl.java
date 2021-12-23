/**
 */
package NEsysml.EM.impl;

import NEsysml.EM.EMPackage;
import NEsysml.EM.ErrorBehaviorTransitionAndExpression;
import NEsysml.EM.ErrorBehaviorTransitionCondition;
import NEsysml.EM.ErrorBehaviorTransitionExpression;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Behavior Transition Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.impl.ErrorBehaviorTransitionConditionImpl#getBase_Activity <em>Base Activity</em>}</li>
 *   <li>{@link NEsysml.EM.impl.ErrorBehaviorTransitionConditionImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorBehaviorTransitionConditionImpl extends MinimalEObjectImpl.Container implements ErrorBehaviorTransitionCondition {
	/**
	 * The cached value of the '{@link #getBase_Activity() <em>Base Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Activity()
	 * @generated
	 * @ordered
	 */
	protected Activity base_Activity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorBehaviorTransitionConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMPackage.Literals.ERROR_BEHAVIOR_TRANSITION_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getBase_Activity() {
		if (base_Activity != null && base_Activity.eIsProxy()) {
			InternalEObject oldBase_Activity = (InternalEObject)base_Activity;
			base_Activity = (Activity)eResolveProxy(oldBase_Activity);
			if (base_Activity != oldBase_Activity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMPackage.ERROR_BEHAVIOR_TRANSITION_CONDITION__BASE_ACTIVITY, oldBase_Activity, base_Activity));
			}
		}
		return base_Activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetBase_Activity() {
		return base_Activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Activity(Activity newBase_Activity) {
		Activity oldBase_Activity = base_Activity;
		base_Activity = newBase_Activity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMPackage.ERROR_BEHAVIOR_TRANSITION_CONDITION__BASE_ACTIVITY, oldBase_Activity, base_Activity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorBehaviorTransitionExpression getExpression() {
		ErrorBehaviorTransitionExpression expression = basicGetExpression();
		return expression != null && expression.eIsProxy() ? (ErrorBehaviorTransitionExpression)eResolveProxy((InternalEObject)expression) : expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ErrorBehaviorTransitionExpression basicGetExpression() {
		// TODO: implement this method to return the 'Expression' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		if(this.getBase_Activity() == null)
			return null;
		for(ActivityNode node : this.getBase_Activity().getNodes()) {
			for(EObject object : node.getStereotypeApplications())
				if(object instanceof ErrorBehaviorTransitionAndExpression)
					return (ErrorBehaviorTransitionExpression) object;
		}
		for(ActivityNode node : this.getBase_Activity().getNodes()) {
			for(EObject object : node.getStereotypeApplications())
				if(object instanceof ErrorBehaviorTransitionExpression)
					return (ErrorBehaviorTransitionExpression) object;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(ErrorBehaviorTransitionExpression newExpression) {
		// TODO: implement this method to set the 'Expression' reference
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
			case EMPackage.ERROR_BEHAVIOR_TRANSITION_CONDITION__BASE_ACTIVITY:
				if (resolve) return getBase_Activity();
				return basicGetBase_Activity();
			case EMPackage.ERROR_BEHAVIOR_TRANSITION_CONDITION__EXPRESSION:
				if (resolve) return getExpression();
				return basicGetExpression();
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
			case EMPackage.ERROR_BEHAVIOR_TRANSITION_CONDITION__BASE_ACTIVITY:
				setBase_Activity((Activity)newValue);
				return;
			case EMPackage.ERROR_BEHAVIOR_TRANSITION_CONDITION__EXPRESSION:
				setExpression((ErrorBehaviorTransitionExpression)newValue);
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
			case EMPackage.ERROR_BEHAVIOR_TRANSITION_CONDITION__BASE_ACTIVITY:
				setBase_Activity((Activity)null);
				return;
			case EMPackage.ERROR_BEHAVIOR_TRANSITION_CONDITION__EXPRESSION:
				setExpression((ErrorBehaviorTransitionExpression)null);
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
			case EMPackage.ERROR_BEHAVIOR_TRANSITION_CONDITION__BASE_ACTIVITY:
				return base_Activity != null;
			case EMPackage.ERROR_BEHAVIOR_TRANSITION_CONDITION__EXPRESSION:
				return basicGetExpression() != null;
		}
		return super.eIsSet(featureID);
	}

} //ErrorBehaviorTransitionConditionImpl
