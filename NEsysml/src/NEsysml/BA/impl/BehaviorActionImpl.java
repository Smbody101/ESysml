/**
 */
package NEsysml.BA.impl;

import NEsysml.Aadl.impl.SubprogramCallImpl;
import NEsysml.BA.BAPackage;
import NEsysml.BA.BehaviorAction;
import NEsysml.BA.GetInput;
import NEsysml.BA.SendOutput;
import NEsysml.BA.SubprogramInstanceCallAction;
import NEsysml.BA.SubprogramInterfaceCallAction;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.AcceptEventAction;
import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.CallBehaviorAction;
import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.ControlFlow;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.SendSignalAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.BA.impl.BehaviorActionImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BehaviorActionImpl extends SubprogramCallImpl implements BehaviorAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BAPackage.Literals.BEHAVIOR_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getParameter() {
		// TODO: implement this method to return the 'Parameter' attribute list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<OutputPin> orderedPinList = new BasicEList<OutputPin>();
		EList<String> list = new BasicEList<String>();
		EList<OutputPin> allPin = new BasicEList<OutputPin>();
		Map<InputPin, OutputPin> m = new HashMap<InputPin, OutputPin>();

		if(this instanceof SendOutput) {
			SendSignalAction action = ((SendOutput)this).getBase_SendSignalAction();
			String activityName = action.getActivity().getName();
			for(InputPin pin : action.getInputs()) {
				for(ActivityEdge edge : pin.getIncomings())
					if(edge.getSource() instanceof OutputPin) {
						m.put(pin, (OutputPin) edge.getSource());
						list.add(activityName + "_" + ((NamedElement)edge.getSource().getOwner()).getName() + "_" + edge.getSource().getName());
						break;
					}
			}
		}
		else if(this instanceof GetInput) {
			AcceptEventAction action = ((GetInput)this).getBase_AcceptEventAction();
			String activityName = action.getActivity().getName();
			for(OutputPin pin : action.getOutputs()) {
				list.add(activityName + "_" + action.getName() + "_" + pin.getName());
			}
		}
		else if(this instanceof SubprogramInterfaceCallAction) {
			CallOperationAction action = ((SubprogramInterfaceCallAction)this).getBase_CallOperationAction();
			String activityName = action.getActivity().getName();
			for(OutputPin pin : action.getOutputs())
				allPin.add(pin);
			for(InputPin pin : action.getInputs()) {
				for(ActivityEdge edge : pin.getIncomings())
					if(edge.getSource() instanceof OutputPin) {
						m.put(pin, (OutputPin) edge.getSource());
						break;
					}
			}
			for(Parameter parameter : action.getOperation().getMethods().get(0).getOwnedParameters()) {
				boolean hasFound = false;
				for(OutputPin pin : allPin) {
					if(pin.getName().equals(parameter.getName())) {
						hasFound = true;
						orderedPinList.add(pin);
						break;
					}
				}
				if(!hasFound) {
					for(InputPin pin : m.keySet()) {
						if(pin.getName().equals(parameter.getName())) {
							orderedPinList.add(m.get(pin));
							break;
						}
					}
				}
			}
			for(OutputPin pin : orderedPinList)
				list.add(activityName + "_" + ((NamedElement)pin.getOwner()).getName() + "_" + pin.getName());
		}
		else if(this instanceof SubprogramInstanceCallAction) {
			CallBehaviorAction action = ((SubprogramInstanceCallAction)this).getBase_CallBehaviorAction();
			String activityName = action.getActivity().getName();
			for(OutputPin pin : action.getOutputs())
				allPin.add(pin);
			for(InputPin pin : action.getInputs()) {
				for(ActivityEdge edge : pin.getIncomings())
					if(edge.getSource() instanceof OutputPin) {
						m.put(pin, (OutputPin) edge.getSource());
						break;
					}
			}
			for(Parameter parameter : action.getBehavior().getOwnedParameters()) {
				boolean hasFound = false;
				for(OutputPin pin : allPin) {
					if(pin.getName().equals(parameter.getName())) {
						hasFound = true;
						orderedPinList.add(pin);
						break;
					}
				}
				if(!hasFound) {
					for(InputPin pin : m.keySet()) {
						if(pin.getName().equals(parameter.getName())) {
							orderedPinList.add(m.get(pin));
							break;
						}
					}
				}
			}
			for(OutputPin pin : orderedPinList)
				list.add(activityName + "_" + ((NamedElement)pin.getOwner()).getName() + "_" + pin.getName());
		}
		
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BehaviorAction basicGetNext() {
		// TODO: implement this method to return the 'Next' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		Action action = null;
		if(this instanceof SendOutput)
			action = ((SendOutput)this).getBase_SendSignalAction();
		else if(this instanceof GetInput)
			action = ((GetInput)this).getBase_AcceptEventAction();
		else if(this instanceof SubprogramInterfaceCallAction)
			action = ((SubprogramInterfaceCallAction)this).getBase_CallOperationAction();
		else if(this instanceof SubprogramInstanceCallAction)
			action = ((SubprogramInstanceCallAction)this).getBase_CallBehaviorAction();
		if(action == null)
			return null;
		for(ActivityEdge edge : action.getOutgoings()) {
			if(edge instanceof ControlFlow)
				for(EObject object : edge.getTarget().getStereotypeApplications())
					if(object instanceof BehaviorAction)
						return (BehaviorAction) object;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BAPackage.BEHAVIOR_ACTION__PARAMETER:
				return getParameter();
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
			case BAPackage.BEHAVIOR_ACTION__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends String>)newValue);
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
			case BAPackage.BEHAVIOR_ACTION__PARAMETER:
				getParameter().clear();
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
			case BAPackage.BEHAVIOR_ACTION__PARAMETER:
				return !getParameter().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BehaviorActionImpl
