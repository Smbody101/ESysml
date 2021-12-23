/**
 */
package NEsysml.BA.impl;

import NEsysml.BA.BAPackage;
import NEsysml.BA.BehaviorAction;
import NEsysml.BA.BehaviorActionBlock;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Action Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.BA.impl.BehaviorActionBlockImpl#getBase_Activity <em>Base Activity</em>}</li>
 *   <li>{@link NEsysml.BA.impl.BehaviorActionBlockImpl#getOwnedAction <em>Owned Action</em>}</li>
 *   <li>{@link NEsysml.BA.impl.BehaviorActionBlockImpl#getFirstAction <em>First Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviorActionBlockImpl extends MinimalEObjectImpl.Container implements BehaviorActionBlock {
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
	protected BehaviorActionBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BAPackage.Literals.BEHAVIOR_ACTION_BLOCK;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BAPackage.BEHAVIOR_ACTION_BLOCK__BASE_ACTIVITY, oldBase_Activity, base_Activity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BAPackage.BEHAVIOR_ACTION_BLOCK__BASE_ACTIVITY, oldBase_Activity, base_Activity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<BehaviorAction> getOwnedAction() {
		// TODO: implement this method to return the 'Owned Action' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<BehaviorAction> list = new BasicEList<BehaviorAction>();
		for(ActivityNode node : this.getBase_Activity().getNodes()) {
			for(EObject object : node.getStereotypeApplications())
				if(object instanceof BehaviorAction)
					list.add((BehaviorAction) object);
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorAction getFirstAction() {
		BehaviorAction firstAction = basicGetFirstAction();
		return firstAction != null && firstAction.eIsProxy() ? (BehaviorAction)eResolveProxy((InternalEObject)firstAction) : firstAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BehaviorAction basicGetFirstAction() {
		// TODO: implement this method to return the 'First Action' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		for(BehaviorAction ba : this.getOwnedAction()) {
			if(ba.getLast() == null)
				return ba;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstAction(BehaviorAction newFirstAction) {
		// TODO: implement this method to set the 'First Action' reference
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
			case BAPackage.BEHAVIOR_ACTION_BLOCK__BASE_ACTIVITY:
				if (resolve) return getBase_Activity();
				return basicGetBase_Activity();
			case BAPackage.BEHAVIOR_ACTION_BLOCK__OWNED_ACTION:
				return getOwnedAction();
			case BAPackage.BEHAVIOR_ACTION_BLOCK__FIRST_ACTION:
				if (resolve) return getFirstAction();
				return basicGetFirstAction();
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
			case BAPackage.BEHAVIOR_ACTION_BLOCK__BASE_ACTIVITY:
				setBase_Activity((Activity)newValue);
				return;
			case BAPackage.BEHAVIOR_ACTION_BLOCK__OWNED_ACTION:
				getOwnedAction().clear();
				getOwnedAction().addAll((Collection<? extends BehaviorAction>)newValue);
				return;
			case BAPackage.BEHAVIOR_ACTION_BLOCK__FIRST_ACTION:
				setFirstAction((BehaviorAction)newValue);
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
			case BAPackage.BEHAVIOR_ACTION_BLOCK__BASE_ACTIVITY:
				setBase_Activity((Activity)null);
				return;
			case BAPackage.BEHAVIOR_ACTION_BLOCK__OWNED_ACTION:
				getOwnedAction().clear();
				return;
			case BAPackage.BEHAVIOR_ACTION_BLOCK__FIRST_ACTION:
				setFirstAction((BehaviorAction)null);
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
			case BAPackage.BEHAVIOR_ACTION_BLOCK__BASE_ACTIVITY:
				return base_Activity != null;
			case BAPackage.BEHAVIOR_ACTION_BLOCK__OWNED_ACTION:
				return !getOwnedAction().isEmpty();
			case BAPackage.BEHAVIOR_ACTION_BLOCK__FIRST_ACTION:
				return basicGetFirstAction() != null;
		}
		return super.eIsSet(featureID);
	}

} //BehaviorActionBlockImpl
