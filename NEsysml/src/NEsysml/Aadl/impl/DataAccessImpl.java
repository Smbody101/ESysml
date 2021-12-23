/**
 */
package NEsysml.Aadl.impl;

import NEsysml.AadlUtil;
import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.DataAccess;
import NEsysml.Aadl.DataFlowSpecification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.papyrus.sysml14.portsandflows.DirectedFeature;
import org.eclipse.papyrus.sysml14.portsandflows.FeatureDirection;
import org.eclipse.papyrus.sysml14.portsandflows.internal.impl.ProxyPortImpl;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.DataAccessImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.DataAccessImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataAccessImpl extends ProxyPortImpl implements DataAccess {
	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final FeatureDirection DIRECTION_EDEFAULT = FeatureDirection.PROVIDED;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.DATA_ACCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlowSpecification getSpecification() {
		DataFlowSpecification specification = basicGetSpecification();
		return specification != null && specification.eIsProxy() ? (DataFlowSpecification)eResolveProxy((InternalEObject)specification) : specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DataFlowSpecification basicGetSpecification() {
		// TODO: implement this method to return the 'Specification' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		Element e = this.getBase_Port().getType();
		if(AadlUtil.eINSTANCE.isStereotypedBy(e, AadlPackage.Literals.DATA_FLOW_SPECIFICATION))
			return (DataFlowSpecification) AadlUtil.eINSTANCE.getStereotypeApplication(e, AadlPackage.Literals.DATA_FLOW_SPECIFICATION);
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(DataFlowSpecification newSpecification) {
		// TODO: implement this method to set the 'Specification' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public FeatureDirection getDirection() {
		// TODO: implement this method to return the 'Direction' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		EList<Property> properties = this.getSpecification().getBase_Class().getOwnedAttributes();
		for(Property p : properties) {
			Stereotype s = p.getApplicableStereotype("SysML::PortsAndFlows::DirectedFeature");
			if(p.isStereotypeApplied(s))
				return ((DirectedFeature)p.getStereotypeApplication(s)).getFeatureDirection();
		}
		return FeatureDirection.PROVIDED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(FeatureDirection newDirection) {
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
			case AadlPackage.DATA_ACCESS__SPECIFICATION:
				if (resolve) return getSpecification();
				return basicGetSpecification();
			case AadlPackage.DATA_ACCESS__DIRECTION:
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
			case AadlPackage.DATA_ACCESS__SPECIFICATION:
				setSpecification((DataFlowSpecification)newValue);
				return;
			case AadlPackage.DATA_ACCESS__DIRECTION:
				setDirection((FeatureDirection)newValue);
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
			case AadlPackage.DATA_ACCESS__SPECIFICATION:
				setSpecification((DataFlowSpecification)null);
				return;
			case AadlPackage.DATA_ACCESS__DIRECTION:
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
			case AadlPackage.DATA_ACCESS__SPECIFICATION:
				return basicGetSpecification() != null;
			case AadlPackage.DATA_ACCESS__DIRECTION:
				return getDirection() != DIRECTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //DataAccessImpl
