/**
 */
package NEsysml.EM.impl;

import NEsysml.EM.EMPackage;
import NEsysml.EM.ErrorBehaviorTransitionAndExpression;
import NEsysml.EM.ErrorBehaviorTransitionExpression;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.JoinNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Behavior Transition And Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.impl.ErrorBehaviorTransitionAndExpressionImpl#getBase_JoinNode <em>Base Join Node</em>}</li>
 *   <li>{@link NEsysml.EM.impl.ErrorBehaviorTransitionAndExpressionImpl#getOwnedExpression <em>Owned Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorBehaviorTransitionAndExpressionImpl extends ErrorBehaviorTransitionExpressionImpl implements ErrorBehaviorTransitionAndExpression {
	/**
	 * The cached value of the '{@link #getBase_JoinNode() <em>Base Join Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_JoinNode()
	 * @generated
	 * @ordered
	 */
	protected JoinNode base_JoinNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorBehaviorTransitionAndExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMPackage.Literals.ERROR_BEHAVIOR_TRANSITION_AND_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinNode getBase_JoinNode() {
		if (base_JoinNode != null && base_JoinNode.eIsProxy()) {
			InternalEObject oldBase_JoinNode = (InternalEObject)base_JoinNode;
			base_JoinNode = (JoinNode)eResolveProxy(oldBase_JoinNode);
			if (base_JoinNode != oldBase_JoinNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMPackage.ERROR_BEHAVIOR_TRANSITION_AND_EXPRESSION__BASE_JOIN_NODE, oldBase_JoinNode, base_JoinNode));
			}
		}
		return base_JoinNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinNode basicGetBase_JoinNode() {
		return base_JoinNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_JoinNode(JoinNode newBase_JoinNode) {
		JoinNode oldBase_JoinNode = base_JoinNode;
		base_JoinNode = newBase_JoinNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMPackage.ERROR_BEHAVIOR_TRANSITION_AND_EXPRESSION__BASE_JOIN_NODE, oldBase_JoinNode, base_JoinNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ErrorBehaviorTransitionExpression> getOwnedExpression() {
		// TODO: implement this method to return the 'Owned Expression' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<ErrorBehaviorTransitionExpression> list = new BasicEList<ErrorBehaviorTransitionExpression>();
		if(this.getBase_JoinNode() == null)
			return list;
		for(ActivityEdge edge : this.getBase_JoinNode().getIncomings()) {
			for(EObject object : edge.getStereotypeApplications())
				if(object instanceof ErrorBehaviorTransitionExpression)
					list.add((ErrorBehaviorTransitionExpression) object);
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
			case EMPackage.ERROR_BEHAVIOR_TRANSITION_AND_EXPRESSION__BASE_JOIN_NODE:
				if (resolve) return getBase_JoinNode();
				return basicGetBase_JoinNode();
			case EMPackage.ERROR_BEHAVIOR_TRANSITION_AND_EXPRESSION__OWNED_EXPRESSION:
				return getOwnedExpression();
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
			case EMPackage.ERROR_BEHAVIOR_TRANSITION_AND_EXPRESSION__BASE_JOIN_NODE:
				setBase_JoinNode((JoinNode)newValue);
				return;
			case EMPackage.ERROR_BEHAVIOR_TRANSITION_AND_EXPRESSION__OWNED_EXPRESSION:
				getOwnedExpression().clear();
				getOwnedExpression().addAll((Collection<? extends ErrorBehaviorTransitionExpression>)newValue);
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
			case EMPackage.ERROR_BEHAVIOR_TRANSITION_AND_EXPRESSION__BASE_JOIN_NODE:
				setBase_JoinNode((JoinNode)null);
				return;
			case EMPackage.ERROR_BEHAVIOR_TRANSITION_AND_EXPRESSION__OWNED_EXPRESSION:
				getOwnedExpression().clear();
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
			case EMPackage.ERROR_BEHAVIOR_TRANSITION_AND_EXPRESSION__BASE_JOIN_NODE:
				return base_JoinNode != null;
			case EMPackage.ERROR_BEHAVIOR_TRANSITION_AND_EXPRESSION__OWNED_EXPRESSION:
				return !getOwnedExpression().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ErrorBehaviorTransitionAndExpressionImpl
