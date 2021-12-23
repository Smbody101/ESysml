/**
 */
package NEsysml.Aadl.impl;

import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.CallSequence;
import NEsysml.Aadl.SubprogramCall;

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
 * An implementation of the model object '<em><b>Call Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.CallSequenceImpl#getBase_Activity <em>Base Activity</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.CallSequenceImpl#getOwnedSubprogramCall <em>Owned Subprogram Call</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.CallSequenceImpl#getFirst <em>First</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallSequenceImpl extends MinimalEObjectImpl.Container implements CallSequence {
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
	protected CallSequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.CALL_SEQUENCE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AadlPackage.CALL_SEQUENCE__BASE_ACTIVITY, oldBase_Activity, base_Activity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AadlPackage.CALL_SEQUENCE__BASE_ACTIVITY, oldBase_Activity, base_Activity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<SubprogramCall> getOwnedSubprogramCall() {
		// TODO: implement this method to return the 'Owned Subprogram Call' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<SubprogramCall> list = new BasicEList<SubprogramCall>();
		for(ActivityNode node : this.getBase_Activity().getOwnedNodes())
			for(EObject object : node.getStereotypeApplications())
				if(object instanceof SubprogramCall)
					list.add((SubprogramCall) object);
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramCall getFirst() {
		SubprogramCall first = basicGetFirst();
		return first != null && first.eIsProxy() ? (SubprogramCall)eResolveProxy((InternalEObject)first) : first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SubprogramCall basicGetFirst() {
		// TODO: implement this method to return the 'First' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		for(ActivityNode node : this.getBase_Activity().getOwnedNodes())
			for(EObject object : node.getStereotypeApplications())
				if(object instanceof SubprogramCall && node.getIncomings().isEmpty())
					return (SubprogramCall) object;
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirst(SubprogramCall newFirst) {
		// TODO: implement this method to set the 'First' reference
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
			case AadlPackage.CALL_SEQUENCE__BASE_ACTIVITY:
				if (resolve) return getBase_Activity();
				return basicGetBase_Activity();
			case AadlPackage.CALL_SEQUENCE__OWNED_SUBPROGRAM_CALL:
				return getOwnedSubprogramCall();
			case AadlPackage.CALL_SEQUENCE__FIRST:
				if (resolve) return getFirst();
				return basicGetFirst();
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
			case AadlPackage.CALL_SEQUENCE__BASE_ACTIVITY:
				setBase_Activity((Activity)newValue);
				return;
			case AadlPackage.CALL_SEQUENCE__OWNED_SUBPROGRAM_CALL:
				getOwnedSubprogramCall().clear();
				getOwnedSubprogramCall().addAll((Collection<? extends SubprogramCall>)newValue);
				return;
			case AadlPackage.CALL_SEQUENCE__FIRST:
				setFirst((SubprogramCall)newValue);
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
			case AadlPackage.CALL_SEQUENCE__BASE_ACTIVITY:
				setBase_Activity((Activity)null);
				return;
			case AadlPackage.CALL_SEQUENCE__OWNED_SUBPROGRAM_CALL:
				getOwnedSubprogramCall().clear();
				return;
			case AadlPackage.CALL_SEQUENCE__FIRST:
				setFirst((SubprogramCall)null);
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
			case AadlPackage.CALL_SEQUENCE__BASE_ACTIVITY:
				return base_Activity != null;
			case AadlPackage.CALL_SEQUENCE__OWNED_SUBPROGRAM_CALL:
				return !getOwnedSubprogramCall().isEmpty();
			case AadlPackage.CALL_SEQUENCE__FIRST:
				return basicGetFirst() != null;
		}
		return super.eIsSet(featureID);
	}

} //CallSequenceImpl
