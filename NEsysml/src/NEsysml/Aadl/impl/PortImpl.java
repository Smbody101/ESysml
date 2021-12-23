 /**
 */
package NEsysml.Aadl.impl;

import NEsysml.AadlUtil;
import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.Port;
import NEsysml.Aadl.PortDataFlowSpecification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.papyrus.sysml14.portsandflows.FlowDirection;
import org.eclipse.papyrus.sysml14.portsandflows.FlowProperty;
import org.eclipse.papyrus.sysml14.portsandflows.internal.impl.ProxyPortImpl;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.PortImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.PortImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PortImpl extends ProxyPortImpl implements Port {
	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final FlowDirection DIRECTION_EDEFAULT = FlowDirection.IN;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortDataFlowSpecification getSpecification() {
		PortDataFlowSpecification specification = basicGetSpecification();
		return specification != null && specification.eIsProxy() ? (PortDataFlowSpecification)eResolveProxy((InternalEObject)specification) : specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PortDataFlowSpecification basicGetSpecification() {
		Element e = this.getBase_Port().getType();
		if(AadlUtil.eINSTANCE.isStereotypedBy(e, AadlPackage.Literals.PORT_DATA_FLOW_SPECIFICATION))
			return (PortDataFlowSpecification) AadlUtil.eINSTANCE.getStereotypeApplication(e, AadlPackage.Literals.PORT_DATA_FLOW_SPECIFICATION);
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(PortDataFlowSpecification newSpecification) {
		// TODO: implement this method to set the 'Specification' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public FlowDirection getDirection() {
		// TODO: implement this method to return the 'Direction' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		
		EList<Property> properties = this.getSpecification().getBase_Class().getAttributes();
		for(Property p : properties) {
			Stereotype s = p.getApplicableStereotype("SysML::PortsAndFlows::FlowProperty");
			if(p.isStereotypeApplied(s))
				return ((FlowProperty)p.getStereotypeApplication(s)).getDirection();
		}
		return FlowDirection.INOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(FlowDirection newDirection) {
		// TODO: implement this method to set the 'Direction' attribute
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
			case AadlPackage.PORT__SPECIFICATION:
				if (resolve) return getSpecification();
				return basicGetSpecification();
			case AadlPackage.PORT__DIRECTION:
				return getDirection();
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
			case AadlPackage.PORT__SPECIFICATION:
				setSpecification((PortDataFlowSpecification)newValue);
				return;
			case AadlPackage.PORT__DIRECTION:
				setDirection((FlowDirection)newValue);
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
			case AadlPackage.PORT__SPECIFICATION:
				setSpecification((PortDataFlowSpecification)null);
				return;
			case AadlPackage.PORT__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
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
			case AadlPackage.PORT__SPECIFICATION:
				return basicGetSpecification() != null;
			case AadlPackage.PORT__DIRECTION:
				return getDirection() != DIRECTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //PortImpl
