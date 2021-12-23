/**
 */
package NEsysml.EM.impl;

import NEsysml.AadlUtil;
import NEsysml.EM.EMPackage;
import NEsysml.EM.ErrorPropagation;
import NEsysml.EM.ErrorPropagationPoint;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.SendSignalAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Propagation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.impl.ErrorPropagationImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorPropagationImpl extends ErrorBehaviorTransitionImpl implements ErrorPropagation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorPropagationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMPackage.Literals.ERROR_PROPAGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorPropagationPoint getTarget() {
		ErrorPropagationPoint target = basicGetTarget();
		return target != null && target.eIsProxy() ? (ErrorPropagationPoint)eResolveProxy((InternalEObject)target) : target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ErrorPropagationPoint basicGetTarget() {
		// TODO: implement this method to return the 'Target' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		if(this.getBase_Transition() == null)
			return null;
		if(this.getBase_Transition().getEffect() != null && this.getBase_Transition().getEffect() instanceof Activity) {
			Activity activity = (Activity) getBase_Transition().getEffect();
			for(ActivityNode node : activity.getNodes()) {
				if(node instanceof SendSignalAction && ((SendSignalAction)node).getOnPort() != null) {
					if(AadlUtil.eINSTANCE.isStereotypedBy(((SendSignalAction)node).getOnPort(), EMPackage.Literals.ERROR_PROPAGATION_POINT))
						return (ErrorPropagationPoint) AadlUtil.eINSTANCE.getStereotypeApplication(((SendSignalAction)node).getOnPort(), EMPackage.Literals.ERROR_PROPAGATION_POINT);
				}else if(node instanceof CallOperationAction && ((CallOperationAction)node).getOnPort() != null) {
					if(AadlUtil.eINSTANCE.isStereotypedBy(((CallOperationAction)node).getOnPort(), EMPackage.Literals.ERROR_PROPAGATION_POINT))
						return (ErrorPropagationPoint) AadlUtil.eINSTANCE.getStereotypeApplication(((CallOperationAction)node).getOnPort(), EMPackage.Literals.ERROR_PROPAGATION_POINT);
				}
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ErrorPropagationPoint newTarget) {
		// TODO: implement this method to set the 'Target' reference
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
			case EMPackage.ERROR_PROPAGATION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case EMPackage.ERROR_PROPAGATION__TARGET:
				setTarget((ErrorPropagationPoint)newValue);
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
			case EMPackage.ERROR_PROPAGATION__TARGET:
				setTarget((ErrorPropagationPoint)null);
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
			case EMPackage.ERROR_PROPAGATION__TARGET:
				return basicGetTarget() != null;
		}
		return super.eIsSet(featureID);
	}

} //ErrorPropagationImpl
