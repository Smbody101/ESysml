/**
 */
package NEsysml.Aadl.impl;

import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.SubprogramCall;
import NEsysml.Aadl.SubprogramInstanceCall;
import NEsysml.Aadl.SubprogramInterfaceCall;
import NEsysml.BA.GetInput;
import NEsysml.BA.SendOutput;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ControlFlow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subprogram Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.SubprogramCallImpl#getLast <em>Last</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.SubprogramCallImpl#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SubprogramCallImpl extends ParameterConnectionContextImpl implements SubprogramCall {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubprogramCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.SUBPROGRAM_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramCall getLast() {
		SubprogramCall last = basicGetLast();
		return last != null && last.eIsProxy() ? (SubprogramCall)eResolveProxy((InternalEObject)last) : last;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SubprogramCall basicGetLast() {
		// TODO: implement this method to return the 'Last' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		ActivityNode node = null;
		if(this instanceof SubprogramInstanceCall)
			node = ((SubprogramInstanceCall)this).getBase_CallBehaviorAction();
		else if(this instanceof SubprogramInterfaceCall)
			node = ((SubprogramInterfaceCall)this).getBase_CallOperationAction();
		else if(this instanceof SendOutput)
			node = ((SendOutput)this).getBase_SendSignalAction();
		else if(this instanceof GetInput)
			node = ((GetInput)this).getBase_AcceptEventAction();
		if(node == null)
			return null;
		for(ActivityEdge edge : node.getIncomings()) {
			if(edge instanceof ControlFlow)
				for(EObject object : edge.getSource().getStereotypeApplications())
					if(object instanceof SubprogramCall)
						return (SubprogramCall) object;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLast(SubprogramCall newLast) {
		// TODO: implement this method to set the 'Last' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramCall getNext() {
		SubprogramCall next = basicGetNext();
		return next != null && next.eIsProxy() ? (SubprogramCall)eResolveProxy((InternalEObject)next) : next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SubprogramCall basicGetNext() {
		// TODO: implement this method to return the 'Next' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		ActivityNode node = null;
		if(this instanceof SubprogramInstanceCall)
			node = ((SubprogramInstanceCall)this).getBase_CallBehaviorAction();
		else if(this instanceof SubprogramInterfaceCall)
			node = ((SubprogramInterfaceCall)this).getBase_CallOperationAction();
		if(node == null)
			return null;
		for(ActivityEdge edge : node.getOutgoings()) {
			if(edge instanceof ControlFlow)
				for(EObject object : edge.getTarget().getStereotypeApplications())
					if(object instanceof SubprogramCall)
						return (SubprogramCall) object;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(SubprogramCall newNext) {
		// TODO: implement this method to set the 'Next' reference
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
			case AadlPackage.SUBPROGRAM_CALL__LAST:
				if (resolve) return getLast();
				return basicGetLast();
			case AadlPackage.SUBPROGRAM_CALL__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
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
			case AadlPackage.SUBPROGRAM_CALL__LAST:
				setLast((SubprogramCall)newValue);
				return;
			case AadlPackage.SUBPROGRAM_CALL__NEXT:
				setNext((SubprogramCall)newValue);
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
			case AadlPackage.SUBPROGRAM_CALL__LAST:
				setLast((SubprogramCall)null);
				return;
			case AadlPackage.SUBPROGRAM_CALL__NEXT:
				setNext((SubprogramCall)null);
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
			case AadlPackage.SUBPROGRAM_CALL__LAST:
				return basicGetLast() != null;
			case AadlPackage.SUBPROGRAM_CALL__NEXT:
				return basicGetNext() != null;
		}
		return super.eIsSet(featureID);
	}

} //SubprogramCallImpl
