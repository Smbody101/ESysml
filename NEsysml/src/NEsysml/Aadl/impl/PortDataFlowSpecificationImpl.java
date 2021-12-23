/**
 */
package NEsysml.Aadl.impl;

import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.PortDataFlowSpecification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Realization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Data Flow Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.PortDataFlowSpecificationImpl#getEventGate <em>Event Gate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortDataFlowSpecificationImpl extends DataFlowSpecificationImpl implements PortDataFlowSpecification {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortDataFlowSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.PORT_DATA_FLOW_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getEventGate() {
		Interface eventGate = basicGetEventGate();
		return eventGate != null && eventGate.eIsProxy() ? (Interface)eResolveProxy((InternalEObject)eventGate) : eventGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Interface basicGetEventGate() {
		// TODO: implement this method to return the 'Event Gate' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		EList<DirectedRelationship> realizations = this.getBase_Class().getSourceDirectedRelationships();
		for(DirectedRelationship realization : realizations)
			if(realization instanceof Realization)
				for(Element e : realization.getTargets())
					if(e instanceof Interface)
						return (Interface) e;
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventGate(Interface newEventGate) {
		// TODO: implement this method to set the 'Event Gate' reference
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
			case AadlPackage.PORT_DATA_FLOW_SPECIFICATION__EVENT_GATE:
				if (resolve) return getEventGate();
				return basicGetEventGate();
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
			case AadlPackage.PORT_DATA_FLOW_SPECIFICATION__EVENT_GATE:
				setEventGate((Interface)newValue);
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
			case AadlPackage.PORT_DATA_FLOW_SPECIFICATION__EVENT_GATE:
				setEventGate((Interface)null);
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
			case AadlPackage.PORT_DATA_FLOW_SPECIFICATION__EVENT_GATE:
				return basicGetEventGate() != null;
		}
		return super.eIsSet(featureID);
	}

} //PortDataFlowSpecificationImpl
