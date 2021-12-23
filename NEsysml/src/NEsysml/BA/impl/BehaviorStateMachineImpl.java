/**
 */
package NEsysml.BA.impl;

import NEsysml.AadlUtil;
import NEsysml.Aadl.DataClassifier;
import NEsysml.Aadl.impl.AnnexImpl;
import NEsysml.BA.BAFactory;
import NEsysml.BA.BAPackage;
import NEsysml.BA.BehaviorAction;
import NEsysml.BA.BehaviorState;
import NEsysml.BA.BehaviorStateMachine;
import NEsysml.BA.BehaviorStateTransition;
import NEsysml.BA.Variable;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.Pin;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.BA.impl.BehaviorStateMachineImpl#getBase_StateMachine <em>Base State Machine</em>}</li>
 *   <li>{@link NEsysml.BA.impl.BehaviorStateMachineImpl#getOwnedState <em>Owned State</em>}</li>
 *   <li>{@link NEsysml.BA.impl.BehaviorStateMachineImpl#getOwnedTransition <em>Owned Transition</em>}</li>
 *   <li>{@link NEsysml.BA.impl.BehaviorStateMachineImpl#getOwnedVariable <em>Owned Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviorStateMachineImpl extends AnnexImpl implements BehaviorStateMachine {
	/**
	 * The cached value of the '{@link #getBase_StateMachine() <em>Base State Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_StateMachine()
	 * @generated
	 * @ordered
	 */
	protected StateMachine base_StateMachine;
	
	private EList<Variable> variableList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BehaviorStateMachineImpl() {
		super();
		variableList = new BasicEList<Variable>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BAPackage.Literals.BEHAVIOR_STATE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getBase_StateMachine() {
		if (base_StateMachine != null && base_StateMachine.eIsProxy()) {
			InternalEObject oldBase_StateMachine = (InternalEObject)base_StateMachine;
			base_StateMachine = (StateMachine)eResolveProxy(oldBase_StateMachine);
			if (base_StateMachine != oldBase_StateMachine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BAPackage.BEHAVIOR_STATE_MACHINE__BASE_STATE_MACHINE, oldBase_StateMachine, base_StateMachine));
			}
		}
		return base_StateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine basicGetBase_StateMachine() {
		return base_StateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_StateMachine(StateMachine newBase_StateMachine) {
		StateMachine oldBase_StateMachine = base_StateMachine;
		base_StateMachine = newBase_StateMachine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BAPackage.BEHAVIOR_STATE_MACHINE__BASE_STATE_MACHINE, oldBase_StateMachine, base_StateMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<BehaviorState> getOwnedState() {
		// TODO: implement this method to return the 'Owned State' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<BehaviorState> list = new BasicEList<BehaviorState>();
		for(Region region : this.getBase_StateMachine().getRegions())
			for(Vertex vertex : region.getSubvertices())
				if(AadlUtil.eINSTANCE.isStereotypedBy(vertex, BAPackage.Literals.BEHAVIOR_STATE))
					list.add((BehaviorState) AadlUtil.eINSTANCE.getStereotypeApplication(vertex, BAPackage.Literals.BEHAVIOR_STATE));
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<BehaviorStateTransition> getOwnedTransition() {
		// TODO: implement this method to return the 'Owned Transition' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<BehaviorStateTransition> list = new BasicEList<BehaviorStateTransition>();
		for(Region region : this.getBase_StateMachine().getRegions())
			for(Transition transition : region.getTransitions())
				if(AadlUtil.eINSTANCE.isStereotypedBy(transition, BAPackage.Literals.BEHAVIOR_STATE_TRANSITION))
					list.add((BehaviorStateTransition) AadlUtil.eINSTANCE.getStereotypeApplication(transition, BAPackage.Literals.BEHAVIOR_STATE_TRANSITION));
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Variable> getOwnedVariable() {
		// TODO: implement this method to return the 'Owned Variable' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<OutputPin> pinList = new BasicEList<OutputPin>();
		for(BehaviorStateTransition transition : this.getOwnedTransition()) {
			if(transition.getOwnedActionBlock() != null) {
				for(ActivityNode node : transition.getOwnedActionBlock().getBase_Activity().getNodes()) {
					if(isStereotypeByBehaviorAction(node)) {
						for(OutputPin pin : ((Action)node).getOutputs()) {
							DataClassifier souredc = getDataClassifier(pin);
							PrimitiveType sourcept = getPrimitiveType(pin);
							String name = transition.getOwnedActionBlock().getBase_Activity().getName() + "_" + node.getName() + "_" + pin.getName();
							boolean has = false;
							for(Variable variable : variableList) {
								if(variable.getName().equals(name)) {
									has = true;
									break;
								}
							}
							if(has)
								continue;
							Variable variable = BAFactory.eINSTANCE.createVariable();
							variable.setName(name);
							variable.setType(souredc);
							variable.setPrimitiveType(sourcept);
							variableList.add(variable);
						}
					}
				}
			}
		}
		
		return variableList;
	}
	
	private boolean isStereotypeByBehaviorAction(Element e) {
		for(EObject object : e.getStereotypeApplications())
			if(object instanceof BehaviorAction)
				return true;
		return false;
	}
	
	private BehaviorAction getBehaviorAction(Element e) {
		for(EObject object : e.getStereotypeApplications())
			if(object instanceof BehaviorAction)
				return (BehaviorAction) object;
		return null;
	}
	
	private int getParameterIndex(BehaviorAction ba, String name) {
		EList<String> list = ba.getParameter();
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).equals(name))
				return i + 1;
		}
		return -1;
	}
	
	private DataClassifier getDataClassifier(ActivityNode node) {
		Type type = null;
		if(node instanceof Pin) {
			Pin pin = (Pin) node;
			type = pin.getType();
		}
		if(type == null)
			return null;
		for(EObject object : type.getStereotypeApplications())
			if(object instanceof DataClassifier)
				return (DataClassifier) object;
		return null;
	}
	
	private PrimitiveType getPrimitiveType(ActivityNode node) {
		Type type = null;
		if(node instanceof Pin) {
			Pin pin = (Pin) node;
			type = pin.getType();
		}
		if(type == null)
			return null;
		if(type instanceof PrimitiveType)
			return (PrimitiveType) type;
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
			case BAPackage.BEHAVIOR_STATE_MACHINE__BASE_STATE_MACHINE:
				if (resolve) return getBase_StateMachine();
				return basicGetBase_StateMachine();
			case BAPackage.BEHAVIOR_STATE_MACHINE__OWNED_STATE:
				return getOwnedState();
			case BAPackage.BEHAVIOR_STATE_MACHINE__OWNED_TRANSITION:
				return getOwnedTransition();
			case BAPackage.BEHAVIOR_STATE_MACHINE__OWNED_VARIABLE:
				return getOwnedVariable();
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
			case BAPackage.BEHAVIOR_STATE_MACHINE__BASE_STATE_MACHINE:
				setBase_StateMachine((StateMachine)newValue);
				return;
			case BAPackage.BEHAVIOR_STATE_MACHINE__OWNED_STATE:
				getOwnedState().clear();
				getOwnedState().addAll((Collection<? extends BehaviorState>)newValue);
				return;
			case BAPackage.BEHAVIOR_STATE_MACHINE__OWNED_TRANSITION:
				getOwnedTransition().clear();
				getOwnedTransition().addAll((Collection<? extends BehaviorStateTransition>)newValue);
				return;
			case BAPackage.BEHAVIOR_STATE_MACHINE__OWNED_VARIABLE:
				getOwnedVariable().clear();
				getOwnedVariable().addAll((Collection<? extends Variable>)newValue);
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
			case BAPackage.BEHAVIOR_STATE_MACHINE__BASE_STATE_MACHINE:
				setBase_StateMachine((StateMachine)null);
				return;
			case BAPackage.BEHAVIOR_STATE_MACHINE__OWNED_STATE:
				getOwnedState().clear();
				return;
			case BAPackage.BEHAVIOR_STATE_MACHINE__OWNED_TRANSITION:
				getOwnedTransition().clear();
				return;
			case BAPackage.BEHAVIOR_STATE_MACHINE__OWNED_VARIABLE:
				getOwnedVariable().clear();
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
			case BAPackage.BEHAVIOR_STATE_MACHINE__BASE_STATE_MACHINE:
				return base_StateMachine != null;
			case BAPackage.BEHAVIOR_STATE_MACHINE__OWNED_STATE:
				return !getOwnedState().isEmpty();
			case BAPackage.BEHAVIOR_STATE_MACHINE__OWNED_TRANSITION:
				return !getOwnedTransition().isEmpty();
			case BAPackage.BEHAVIOR_STATE_MACHINE__OWNED_VARIABLE:
				return !getOwnedVariable().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BehaviorStateMachineImpl
