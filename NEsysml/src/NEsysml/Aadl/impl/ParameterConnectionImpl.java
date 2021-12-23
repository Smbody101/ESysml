/**
 */
package NEsysml.Aadl.impl;

import NEsysml.AadlUtil;
import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.DataPort;
import NEsysml.Aadl.ParameterConnection;
import NEsysml.Aadl.ParameterConnectionContext;
import NEsysml.Aadl.ParameterConnectionEnd;
import NEsysml.Aadl.SubprogramClassifier;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.uml.AcceptEventAction;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.CallBehaviorAction;
import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.ObjectFlow;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.SendSignalAction;
import org.eclipse.uml2.uml.Trigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.ParameterConnectionImpl#getBase_ObjectFlow <em>Base Object Flow</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.ParameterConnectionImpl#getIn <em>In</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.ParameterConnectionImpl#getOut <em>Out</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.ParameterConnectionImpl#getInContext <em>In Context</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.ParameterConnectionImpl#getOutContext <em>Out Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterConnectionImpl extends ConnectionImpl implements ParameterConnection {
	/**
	 * The cached value of the '{@link #getBase_ObjectFlow() <em>Base Object Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_ObjectFlow()
	 * @generated
	 * @ordered
	 */
	protected ObjectFlow base_ObjectFlow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.PARAMETER_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectFlow getBase_ObjectFlow() {
		if (base_ObjectFlow != null && base_ObjectFlow.eIsProxy()) {
			InternalEObject oldBase_ObjectFlow = (InternalEObject)base_ObjectFlow;
			base_ObjectFlow = (ObjectFlow)eResolveProxy(oldBase_ObjectFlow);
			if (base_ObjectFlow != oldBase_ObjectFlow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AadlPackage.PARAMETER_CONNECTION__BASE_OBJECT_FLOW, oldBase_ObjectFlow, base_ObjectFlow));
			}
		}
		return base_ObjectFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectFlow basicGetBase_ObjectFlow() {
		return base_ObjectFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_ObjectFlow(ObjectFlow newBase_ObjectFlow) {
		ObjectFlow oldBase_ObjectFlow = base_ObjectFlow;
		base_ObjectFlow = newBase_ObjectFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AadlPackage.PARAMETER_CONNECTION__BASE_OBJECT_FLOW, oldBase_ObjectFlow, base_ObjectFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterConnectionEnd getIn() {
		ParameterConnectionEnd in = basicGetIn();
		return in != null && in.eIsProxy() ? (ParameterConnectionEnd)eResolveProxy((InternalEObject)in) : in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ParameterConnectionEnd basicGetIn() {
		// TODO: implement this method to return the 'In' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		OutputPin pin = null;
		if(this.getBase_ObjectFlow().getSource() instanceof OutputPin)
			pin = (OutputPin) this.getBase_ObjectFlow().getSource();
		
		if(pin == null)
			return null;
		ActivityNode node = null;
		if(pin.getOwner() instanceof ActivityNode)
			node = (ActivityNode) pin.getOwner();
		if(node instanceof CallOperationAction && AadlUtil.eINSTANCE.isStereotypedBy(node, AadlPackage.Literals.SUBPROGRAM_INTERFACE_CALL)) {
			CallOperationAction callOperation = (CallOperationAction)node;
			for(Behavior behavior : callOperation.getOperation().getMethods())
				for(EObject object : behavior.getStereotypeApplications())
					if(object instanceof SubprogramClassifier) {
						for(org.eclipse.uml2.uml.Parameter parameter : behavior.getOwnedParameters()) {
							if(AadlUtil.eINSTANCE.isStereotypedBy(parameter, AadlPackage.Literals.PARAMETER) && parameter.getName().equals(pin.getName())) {
								return (ParameterConnectionEnd) AadlUtil.eINSTANCE.getStereotypeApplication(parameter, AadlPackage.Literals.PARAMETER);
							}
						}
					}
		}else if(node instanceof CallBehaviorAction && AadlUtil.eINSTANCE.isStereotypedBy(node, AadlPackage.Literals.SUBPROGRAM_INSTANCE_CALL)) {
			CallBehaviorAction callOperation = (CallBehaviorAction)node;
			for(EObject object : callOperation.getBehavior().getStereotypeApplications())
				if(object instanceof SubprogramClassifier) {
					for(org.eclipse.uml2.uml.Parameter parameter : callOperation.getBehavior().getOwnedParameters()) {
						if(AadlUtil.eINSTANCE.isStereotypedBy(parameter, AadlPackage.Literals.PARAMETER) && parameter.getName().equals(pin.getName())) {
							return (ParameterConnectionEnd) AadlUtil.eINSTANCE.getStereotypeApplication(parameter, AadlPackage.Literals.PARAMETER);
						}
					}
				}
		}else if(node instanceof AcceptEventAction) {
			AcceptEventAction action = (AcceptEventAction)node;
			for(Trigger trigger : action.getTriggers())
				for(org.eclipse.uml2.uml.Port port : trigger.getPorts())
					for(EObject object : port.getStereotypeApplications())
						if(object instanceof DataPort && port.getName().equals(pin.getName()))
							return (ParameterConnectionEnd) object;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIn(ParameterConnectionEnd newIn) {
		// TODO: implement this method to set the 'In' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterConnectionEnd getOut() {
		ParameterConnectionEnd out = basicGetOut();
		return out != null && out.eIsProxy() ? (ParameterConnectionEnd)eResolveProxy((InternalEObject)out) : out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ParameterConnectionEnd basicGetOut() {
		// TODO: implement this method to return the 'Out' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		InputPin pin = null;
		if(this.getBase_ObjectFlow().getTarget() instanceof InputPin)
			pin = (InputPin) this.getBase_ObjectFlow().getTarget();
		if(pin == null)
			return null;
		ActivityNode node = null;
		if(pin.getOwner() instanceof ActivityNode)
			node = (ActivityNode) pin.getOwner();
		if(node instanceof CallOperationAction && AadlUtil.eINSTANCE.isStereotypedBy(node, AadlPackage.Literals.SUBPROGRAM_INTERFACE_CALL)) {
			CallOperationAction callOperation = (CallOperationAction)node;
			for(Behavior behavior : callOperation.getOperation().getMethods())
				for(EObject object : behavior.getStereotypeApplications())
					if(object instanceof SubprogramClassifier) {
						for(org.eclipse.uml2.uml.Parameter parameter : behavior.getOwnedParameters()) {
							if(AadlUtil.eINSTANCE.isStereotypedBy(parameter, AadlPackage.Literals.PARAMETER) && parameter.getName().equals(pin.getName())) {
								return (ParameterConnectionEnd) AadlUtil.eINSTANCE.getStereotypeApplication(parameter, AadlPackage.Literals.PARAMETER);
							}
						}
					}
		}else if(node instanceof CallBehaviorAction && AadlUtil.eINSTANCE.isStereotypedBy(node, AadlPackage.Literals.SUBPROGRAM_INSTANCE_CALL)) {
			CallBehaviorAction callOperation = (CallBehaviorAction)node;
			for(EObject object : callOperation.getBehavior().getStereotypeApplications())
				if(object instanceof SubprogramClassifier) {
					for(org.eclipse.uml2.uml.Parameter parameter : callOperation.getBehavior().getOwnedParameters()) {
						if(AadlUtil.eINSTANCE.isStereotypedBy(parameter, AadlPackage.Literals.PARAMETER) && parameter.getName().equals(pin.getName())) {
							return (ParameterConnectionEnd) AadlUtil.eINSTANCE.getStereotypeApplication(parameter, AadlPackage.Literals.PARAMETER);
						}
					}
				}
		}else if(node instanceof SendSignalAction) {
			SendSignalAction action = (SendSignalAction)node;
			for(EObject object : action.getOnPort().getStereotypeApplications())
				if(object instanceof DataPort && action.getOnPort().getName().equals(pin.getName()))
					return (ParameterConnectionEnd) object;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOut(ParameterConnectionEnd newOut) {
		// TODO: implement this method to set the 'Out' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterConnectionContext getInContext() {
		ParameterConnectionContext inContext = basicGetInContext();
		return inContext != null && inContext.eIsProxy() ? (ParameterConnectionContext)eResolveProxy((InternalEObject)inContext) : inContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ParameterConnectionContext basicGetInContext() {
		// TODO: implement this method to return the 'In Context' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		OutputPin pin = null;
		if(this.getBase_ObjectFlow().getSource() instanceof OutputPin)
			pin = (OutputPin) this.getBase_ObjectFlow().getSource();
		if(pin == null)
			return null;
		ActivityNode node = null;
		if(pin.getOwner() instanceof ActivityNode)
			node = (ActivityNode) pin.getOwner();
		if(node instanceof CallOperationAction && AadlUtil.eINSTANCE.isStereotypedBy(node, AadlPackage.Literals.SUBPROGRAM_INTERFACE_CALL)) {
			return (ParameterConnectionContext) AadlUtil.eINSTANCE.getStereotypeApplication(node, AadlPackage.Literals.SUBPROGRAM_INTERFACE_CALL);
		}else if(node instanceof CallBehaviorAction && AadlUtil.eINSTANCE.isStereotypedBy(node, AadlPackage.Literals.SUBPROGRAM_INSTANCE_CALL)) {
			return (ParameterConnectionContext) AadlUtil.eINSTANCE.getStereotypeApplication(node, AadlPackage.Literals.SUBPROGRAM_INSTANCE_CALL);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInContext(ParameterConnectionContext newInContext) {
		// TODO: implement this method to set the 'In Context' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterConnectionContext getOutContext() {
		ParameterConnectionContext outContext = basicGetOutContext();
		return outContext != null && outContext.eIsProxy() ? (ParameterConnectionContext)eResolveProxy((InternalEObject)outContext) : outContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ParameterConnectionContext basicGetOutContext() {
		// TODO: implement this method to return the 'Out Context' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		InputPin pin = null;
		if(this.getBase_ObjectFlow().getTarget() instanceof InputPin)
			pin = (InputPin) this.getBase_ObjectFlow().getTarget();
		if(pin == null)
			return null;
		ActivityNode node = null;
		if(pin.getOwner() instanceof ActivityNode)
			node = (ActivityNode) pin.getOwner();
		if(node instanceof CallOperationAction && AadlUtil.eINSTANCE.isStereotypedBy(node, AadlPackage.Literals.SUBPROGRAM_INTERFACE_CALL))
			return (ParameterConnectionContext) AadlUtil.eINSTANCE.getStereotypeApplication(node, AadlPackage.Literals.SUBPROGRAM_INTERFACE_CALL);
		else if(node instanceof CallBehaviorAction && ((CallBehaviorAction)node).getInputs().contains(pin) && AadlUtil.eINSTANCE.isStereotypedBy(node, AadlPackage.Literals.SUBPROGRAM_INSTANCE_CALL))
			return (ParameterConnectionContext) AadlUtil.eINSTANCE.getStereotypeApplication(node, AadlPackage.Literals.SUBPROGRAM_INSTANCE_CALL);
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutContext(ParameterConnectionContext newOutContext) {
		// TODO: implement this method to set the 'Out Context' reference
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
			case AadlPackage.PARAMETER_CONNECTION__BASE_OBJECT_FLOW:
				if (resolve) return getBase_ObjectFlow();
				return basicGetBase_ObjectFlow();
			case AadlPackage.PARAMETER_CONNECTION__IN:
				if (resolve) return getIn();
				return basicGetIn();
			case AadlPackage.PARAMETER_CONNECTION__OUT:
				if (resolve) return getOut();
				return basicGetOut();
			case AadlPackage.PARAMETER_CONNECTION__IN_CONTEXT:
				if (resolve) return getInContext();
				return basicGetInContext();
			case AadlPackage.PARAMETER_CONNECTION__OUT_CONTEXT:
				if (resolve) return getOutContext();
				return basicGetOutContext();
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
			case AadlPackage.PARAMETER_CONNECTION__BASE_OBJECT_FLOW:
				setBase_ObjectFlow((ObjectFlow)newValue);
				return;
			case AadlPackage.PARAMETER_CONNECTION__IN:
				setIn((ParameterConnectionEnd)newValue);
				return;
			case AadlPackage.PARAMETER_CONNECTION__OUT:
				setOut((ParameterConnectionEnd)newValue);
				return;
			case AadlPackage.PARAMETER_CONNECTION__IN_CONTEXT:
				setInContext((ParameterConnectionContext)newValue);
				return;
			case AadlPackage.PARAMETER_CONNECTION__OUT_CONTEXT:
				setOutContext((ParameterConnectionContext)newValue);
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
			case AadlPackage.PARAMETER_CONNECTION__BASE_OBJECT_FLOW:
				setBase_ObjectFlow((ObjectFlow)null);
				return;
			case AadlPackage.PARAMETER_CONNECTION__IN:
				setIn((ParameterConnectionEnd)null);
				return;
			case AadlPackage.PARAMETER_CONNECTION__OUT:
				setOut((ParameterConnectionEnd)null);
				return;
			case AadlPackage.PARAMETER_CONNECTION__IN_CONTEXT:
				setInContext((ParameterConnectionContext)null);
				return;
			case AadlPackage.PARAMETER_CONNECTION__OUT_CONTEXT:
				setOutContext((ParameterConnectionContext)null);
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
			case AadlPackage.PARAMETER_CONNECTION__BASE_OBJECT_FLOW:
				return base_ObjectFlow != null;
			case AadlPackage.PARAMETER_CONNECTION__IN:
				return basicGetIn() != null;
			case AadlPackage.PARAMETER_CONNECTION__OUT:
				return basicGetOut() != null;
			case AadlPackage.PARAMETER_CONNECTION__IN_CONTEXT:
				return basicGetInContext() != null;
			case AadlPackage.PARAMETER_CONNECTION__OUT_CONTEXT:
				return basicGetOutContext() != null;
		}
		return super.eIsSet(featureID);
	}

} //ParameterConnectionImpl
