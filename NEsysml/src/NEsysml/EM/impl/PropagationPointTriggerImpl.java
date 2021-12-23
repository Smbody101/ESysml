/**
 */
package NEsysml.EM.impl;

import NEsysml.AadlUtil;
import NEsysml.EM.EMPackage;
import NEsysml.EM.ErrorPropagationPoint;
import NEsysml.EM.PropagationPointTrigger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.uml.Port;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagation Point Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.impl.PropagationPointTriggerImpl#getContext <em>Context</em>}</li>
 *   <li>{@link NEsysml.EM.impl.PropagationPointTriggerImpl#getPoint <em>Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropagationPointTriggerImpl extends ErrorTransitionTriggerImpl implements PropagationPointTrigger {
	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected EObject context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropagationPointTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMPackage.Literals.PROPAGATION_POINT_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMPackage.PROPAGATION_POINT_TRIGGER__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(EObject newContext) {
		EObject oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMPackage.PROPAGATION_POINT_TRIGGER__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorPropagationPoint getPoint() {
		ErrorPropagationPoint point = basicGetPoint();
		return point != null && point.eIsProxy() ? (ErrorPropagationPoint)eResolveProxy((InternalEObject)point) : point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ErrorPropagationPoint basicGetPoint() {
		// TODO: implement this method to return the 'Point' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		if(this.getBase_Trigger() == null)
			return null;
		for(Port port : this.getBase_Trigger().getPorts()) {
			if(AadlUtil.eINSTANCE.isStereotypedBy(port, EMPackage.Literals.ERROR_PROPAGATION_POINT))
				return (ErrorPropagationPoint) AadlUtil.eINSTANCE.getStereotypeApplication(port, EMPackage.Literals.ERROR_PROPAGATION_POINT);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoint(ErrorPropagationPoint newPoint) {
		// TODO: implement this method to set the 'Point' reference
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
			case EMPackage.PROPAGATION_POINT_TRIGGER__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case EMPackage.PROPAGATION_POINT_TRIGGER__POINT:
				if (resolve) return getPoint();
				return basicGetPoint();
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
			case EMPackage.PROPAGATION_POINT_TRIGGER__CONTEXT:
				setContext((EObject)newValue);
				return;
			case EMPackage.PROPAGATION_POINT_TRIGGER__POINT:
				setPoint((ErrorPropagationPoint)newValue);
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
			case EMPackage.PROPAGATION_POINT_TRIGGER__CONTEXT:
				setContext((EObject)null);
				return;
			case EMPackage.PROPAGATION_POINT_TRIGGER__POINT:
				setPoint((ErrorPropagationPoint)null);
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
			case EMPackage.PROPAGATION_POINT_TRIGGER__CONTEXT:
				return context != null;
			case EMPackage.PROPAGATION_POINT_TRIGGER__POINT:
				return basicGetPoint() != null;
		}
		return super.eIsSet(featureID);
	}

} //PropagationPointTriggerImpl
