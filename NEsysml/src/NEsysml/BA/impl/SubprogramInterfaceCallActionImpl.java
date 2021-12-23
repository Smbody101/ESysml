/**
 */
package NEsysml.BA.impl;

import NEsysml.Aadl.impl.SubprogramInterfaceCallImpl;

import NEsysml.BA.BAPackage;
import NEsysml.BA.BehaviorAction;
import NEsysml.BA.SubprogramCallAction;
import NEsysml.BA.SubprogramInterfaceCallAction;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subprogram Interface Call Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.BA.impl.SubprogramInterfaceCallActionImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubprogramInterfaceCallActionImpl extends SubprogramInterfaceCallImpl implements SubprogramInterfaceCallAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubprogramInterfaceCallActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BAPackage.Literals.SUBPROGRAM_INTERFACE_CALL_ACTION;
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
			case BAPackage.SUBPROGRAM_INTERFACE_CALL_ACTION__PARAMETER:
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
			case BAPackage.SUBPROGRAM_INTERFACE_CALL_ACTION__PARAMETER:
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
			case BAPackage.SUBPROGRAM_INTERFACE_CALL_ACTION__PARAMETER:
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
			case BAPackage.SUBPROGRAM_INTERFACE_CALL_ACTION__PARAMETER:
				return !getParameter().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == BehaviorAction.class) {
			switch (derivedFeatureID) {
				case BAPackage.SUBPROGRAM_INTERFACE_CALL_ACTION__PARAMETER: return BAPackage.BEHAVIOR_ACTION__PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == SubprogramCallAction.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == BehaviorAction.class) {
			switch (baseFeatureID) {
				case BAPackage.BEHAVIOR_ACTION__PARAMETER: return BAPackage.SUBPROGRAM_INTERFACE_CALL_ACTION__PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == SubprogramCallAction.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SubprogramInterfaceCallActionImpl
