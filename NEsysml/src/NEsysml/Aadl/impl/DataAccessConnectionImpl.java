/**
 */
package NEsysml.Aadl.impl;

import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.DataAccess;
import NEsysml.Aadl.DataAccessConnection;
import NEsysml.Aadl.DataAccessConnectionEnd;
import NEsysml.Aadl.PortAndAccessConectionContext;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.papyrus.sysml14.blocks.internal.impl.BindingConnectorImpl;
import org.eclipse.papyrus.sysml14.portsandflows.FeatureDirection;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Access Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.DataAccessConnectionImpl#getRequire <em>Require</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.DataAccessConnectionImpl#getProvide <em>Provide</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.DataAccessConnectionImpl#getInContext <em>In Context</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.DataAccessConnectionImpl#getOutContext <em>Out Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataAccessConnectionImpl extends BindingConnectorImpl implements DataAccessConnection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataAccessConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.DATA_ACCESS_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAccessConnectionEnd getRequire() {
		DataAccessConnectionEnd require = basicGetRequire();
		return require != null && require.eIsProxy() ? (DataAccessConnectionEnd)eResolveProxy((InternalEObject)require) : require;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DataAccessConnectionEnd basicGetRequire() {
		// TODO: implement this method to return the 'Require' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		EList<org.eclipse.uml2.uml.ConnectorEnd> connectorEnds = this.getBase_Connector().getEnds();
		Property p1 = (Property)connectorEnds.get(0).getRole();
		Property p2 = (Property)connectorEnds.get(1).getRole();
		DataAccessConnectionEnd pp1 = null;
		DataAccessConnectionEnd pp2 = null;
		for(EObject object : p1.getStereotypeApplications())
			if(object instanceof DataAccessConnectionEnd) 
				pp1 = (DataAccessConnectionEnd) object;
		for(EObject object : p2.getStereotypeApplications())
			if(object instanceof DataAccessConnectionEnd) 
				pp2 = (DataAccessConnectionEnd) object;
		if(pp1 == null || pp2 == null)
			return null;
		Property part1 = connectorEnds.get(0).getPartWithPort();
		Property part2 = connectorEnds.get(1).getPartWithPort();
		if(pp1 instanceof DataAccess && pp2 instanceof DataAccess) {
			DataAccess ppp1 = (DataAccess)pp1;
			DataAccess ppp2 = (DataAccess)pp2;
			if(ppp1.getDirection() == FeatureDirection.PROVIDED && ppp2.getDirection() == FeatureDirection.PROVIDED) {
				if(part1 == null && part2 != null)
					return pp2;
				else if(part1 != null && part2 == null)
					return pp1;
			}
			else if(ppp1.getDirection() == FeatureDirection.PROVIDED && ppp2.getDirection() == FeatureDirection.REQUIRED && part1 != null && part2 != null)
				return pp1;
			else if(ppp1.getDirection() == FeatureDirection.REQUIRED && ppp2.getDirection() == FeatureDirection.PROVIDED && part1 != null && part2 != null)
				return pp2;
			else if(ppp1.getDirection() == FeatureDirection.REQUIRED && ppp2.getDirection() == FeatureDirection.REQUIRED) {
				if(part1 == null && part2 != null)
					return pp1;
				else if(part1 != null && part2 == null)
					return pp2;
			}
		}else if(pp1 instanceof DataAccess) {
			DataAccess ppp1 = (DataAccess)pp1;
			if(ppp1.getDirection() == FeatureDirection.PROVIDED && part1 != null)
				return pp1;
			else if(ppp1.getDirection() == FeatureDirection.REQUIRED && part1 == null)
				return pp2;
		}else if(pp2 instanceof DataAccess) {
			DataAccess ppp2 = (DataAccess)pp2;
			if(ppp2.getDirection() == FeatureDirection.PROVIDED && part2 != null)
				return pp2;
			else if(ppp2.getDirection() == FeatureDirection.REQUIRED && part2 == null)
				return pp1;
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequire(DataAccessConnectionEnd newRequire) {
		// TODO: implement this method to set the 'Require' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAccessConnectionEnd getProvide() {
		DataAccessConnectionEnd provide = basicGetProvide();
		return provide != null && provide.eIsProxy() ? (DataAccessConnectionEnd)eResolveProxy((InternalEObject)provide) : provide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DataAccessConnectionEnd basicGetProvide() {
		// TODO: implement this method to return the 'Provide' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		EList<org.eclipse.uml2.uml.ConnectorEnd> connectorEnds = this.getBase_Connector().getEnds();
		Property p1 = (Property)connectorEnds.get(0).getRole();
		Property p2 = (Property)connectorEnds.get(1).getRole();
		DataAccessConnectionEnd pp1 = null;
		DataAccessConnectionEnd pp2 = null;
		for(EObject object : p1.getStereotypeApplications())
			if(object instanceof DataAccessConnectionEnd) 
				pp1 = (DataAccessConnectionEnd) object;
		for(EObject object : p2.getStereotypeApplications())
			if(object instanceof DataAccessConnectionEnd) 
				pp2 = (DataAccessConnectionEnd) object;
		if(pp1 == null || pp2 == null)
			return null;
		Property part1 = connectorEnds.get(0).getPartWithPort();
		Property part2 = connectorEnds.get(1).getPartWithPort();
		if(pp1 instanceof DataAccess && pp2 instanceof DataAccess) {
			DataAccess ppp1 = (DataAccess)pp1;
			DataAccess ppp2 = (DataAccess)pp2;
			if(ppp1.getDirection() == FeatureDirection.PROVIDED && ppp2.getDirection() == FeatureDirection.PROVIDED) {
				if(part1 == null && part2 != null)
					return pp1;
				else if(part1 != null && part2 == null)
					return pp2;
			}
			else if(ppp1.getDirection() == FeatureDirection.PROVIDED && ppp2.getDirection() == FeatureDirection.REQUIRED && part1 != null && part2 != null)
				return pp2;
			else if(ppp1.getDirection() == FeatureDirection.REQUIRED && ppp2.getDirection() == FeatureDirection.PROVIDED && part1 != null && part2 != null)
				return pp1;
			else if(ppp1.getDirection() == FeatureDirection.REQUIRED && ppp2.getDirection() == FeatureDirection.REQUIRED) {
				if(part1 == null && part2 != null)
					return pp2;
				else if(part1 != null && part2 == null)
					return pp1;
			}
		}else if(pp1 instanceof DataAccess) {
			DataAccess ppp1 = (DataAccess)pp1;
			if(ppp1.getDirection() == FeatureDirection.PROVIDED && part1 != null)
				return pp2;
			else if(ppp1.getDirection() == FeatureDirection.REQUIRED && part1 == null)
				return pp1;
		}else if(pp2 instanceof DataAccess) {
			DataAccess ppp2 = (DataAccess)pp2;
			if(ppp2.getDirection() == FeatureDirection.PROVIDED && part2 != null)
				return pp1;
			else if(ppp2.getDirection() == FeatureDirection.REQUIRED && part2 == null)
				return pp2;
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvide(DataAccessConnectionEnd newProvide) {
		// TODO: implement this method to set the 'Provide' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortAndAccessConectionContext getInContext() {
		PortAndAccessConectionContext inContext = basicGetInContext();
		return inContext != null && inContext.eIsProxy() ? (PortAndAccessConectionContext)eResolveProxy((InternalEObject)inContext) : inContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PortAndAccessConectionContext basicGetInContext() {
		// TODO: implement this method to return the 'In Context' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		EList<org.eclipse.uml2.uml.ConnectorEnd> connectorEnds = this.getBase_Connector().getEnds();
		Property p1 = (Property)connectorEnds.get(0).getRole();
		Property p2 = (Property)connectorEnds.get(1).getRole();
		DataAccessConnectionEnd pp1 = null;
		DataAccessConnectionEnd pp2 = null;
		for(EObject object : p1.getStereotypeApplications())
			if(object instanceof DataAccessConnectionEnd) 
				pp1 = (DataAccessConnectionEnd) object;
		for(EObject object : p2.getStereotypeApplications())
			if(object instanceof DataAccessConnectionEnd) 
				pp2 = (DataAccessConnectionEnd) object;
		Property part = null;
		if(pp1 == null || pp2 == null)
			return null;
		Property part1 = connectorEnds.get(0).getPartWithPort();
		Property part2 = connectorEnds.get(1).getPartWithPort();
		if(pp1 instanceof DataAccess && pp2 instanceof DataAccess) {
			DataAccess ppp1 = (DataAccess)pp1;
			DataAccess ppp2 = (DataAccess)pp2;
			if(ppp1.getDirection() == FeatureDirection.PROVIDED && ppp2.getDirection() == FeatureDirection.PROVIDED) {
				if(part1 == null && part2 != null)
					part = part2;
				else if(part1 != null && part2 == null)
					part = part1;
			}
			else if(ppp1.getDirection() == FeatureDirection.PROVIDED && ppp2.getDirection() == FeatureDirection.REQUIRED && part1 != null && part2 != null)
				part = part1;
			else if(ppp1.getDirection() == FeatureDirection.REQUIRED && ppp2.getDirection() == FeatureDirection.PROVIDED && part1 != null && part2 != null)
				part = part2;
			else if(ppp1.getDirection() == FeatureDirection.REQUIRED && ppp2.getDirection() == FeatureDirection.REQUIRED) {
				if(part1 == null && part2 != null)
					part = part1;
				else if(part1 != null && part2 == null)
					part = part2;
			}
		}else if(pp1 instanceof DataAccess) {
			DataAccess ppp1 = (DataAccess)pp1;
			if(ppp1.getDirection() == FeatureDirection.PROVIDED && part1 != null)
				part = part1;
			else if(ppp1.getDirection() == FeatureDirection.REQUIRED && part1 == null)
				part = part2;
		}else if(pp2 instanceof DataAccess) {
			DataAccess ppp2 = (DataAccess)pp2;
			if(ppp2.getDirection() == FeatureDirection.PROVIDED && part2 != null)
				part = part2;
			else if(ppp2.getDirection() == FeatureDirection.REQUIRED && part2 == null)
				part = part1;
		}
		if(part == null)
			return null;
		for(EObject object : part.getStereotypeApplications())
			if(object instanceof PortAndAccessConectionContext)
				return (PortAndAccessConectionContext) object;
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInContext(PortAndAccessConectionContext newInContext) {
		// TODO: implement this method to set the 'In Context' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortAndAccessConectionContext getOutContext() {
		PortAndAccessConectionContext outContext = basicGetOutContext();
		return outContext != null && outContext.eIsProxy() ? (PortAndAccessConectionContext)eResolveProxy((InternalEObject)outContext) : outContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PortAndAccessConectionContext basicGetOutContext() {
		// TODO: implement this method to return the 'Out Context' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		EList<org.eclipse.uml2.uml.ConnectorEnd> connectorEnds = this.getBase_Connector().getEnds();
		Property p1 = (Property)connectorEnds.get(0).getRole();
		Property p2 = (Property)connectorEnds.get(1).getRole();
		DataAccessConnectionEnd pp1 = null;
		DataAccessConnectionEnd pp2 = null;
		for(EObject object : p1.getStereotypeApplications())
			if(object instanceof DataAccessConnectionEnd)
				pp1 = (DataAccessConnectionEnd) object;
		for(EObject object : p2.getStereotypeApplications())
			if(object instanceof DataAccessConnectionEnd)
				pp2 = (DataAccessConnectionEnd) object;
		Property part = null;
		if(pp1 == null || pp2 == null)
			return null;
		Property part1 = connectorEnds.get(0).getPartWithPort();
		Property part2 = connectorEnds.get(1).getPartWithPort();
		if(pp1 instanceof DataAccess && pp2 instanceof DataAccess) {
			DataAccess ppp1 = (DataAccess)pp1;
			DataAccess ppp2 = (DataAccess)pp2;
			if(ppp1.getDirection() == FeatureDirection.PROVIDED && ppp2.getDirection() == FeatureDirection.PROVIDED) {
				if(part1 == null && part2 != null)
					part = part1;
				else if(part1 != null && part2 == null)
					part = part2;
			}
			else if(ppp1.getDirection() == FeatureDirection.PROVIDED && ppp2.getDirection() == FeatureDirection.REQUIRED && part1 != null && part2 != null)
				part = part2;
			else if(ppp1.getDirection() == FeatureDirection.REQUIRED && ppp2.getDirection() == FeatureDirection.PROVIDED && part1 != null && part2 != null)
				part = part1;
			else if(ppp1.getDirection() == FeatureDirection.REQUIRED && ppp2.getDirection() == FeatureDirection.REQUIRED) {
				if(part1 == null && part2 != null)
					part = part2;
				else if(part1 != null && part2 == null)
					part = part1;
			}
		}else if(pp1 instanceof DataAccess) {
			DataAccess ppp1 = (DataAccess)pp1;
			if(ppp1.getDirection() == FeatureDirection.PROVIDED && part1 != null)
				part = part2;
			else if(ppp1.getDirection() == FeatureDirection.REQUIRED && part1 == null)
				part = part1;
		}else if(pp2 instanceof DataAccess) {
			DataAccess ppp2 = (DataAccess)pp2;
			if(ppp2.getDirection() == FeatureDirection.PROVIDED && part2 != null)
				part = part1;
			else if(ppp2.getDirection() == FeatureDirection.REQUIRED && part2 == null)
				part = part2;
		}
		if(part == null)
			return null;
		for(EObject object : part.getStereotypeApplications())
			if(object instanceof PortAndAccessConectionContext)
				return (PortAndAccessConectionContext) object;
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutContext(PortAndAccessConectionContext newOutContext) {
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
			case AadlPackage.DATA_ACCESS_CONNECTION__REQUIRE:
				if (resolve) return getRequire();
				return basicGetRequire();
			case AadlPackage.DATA_ACCESS_CONNECTION__PROVIDE:
				if (resolve) return getProvide();
				return basicGetProvide();
			case AadlPackage.DATA_ACCESS_CONNECTION__IN_CONTEXT:
				if (resolve) return getInContext();
				return basicGetInContext();
			case AadlPackage.DATA_ACCESS_CONNECTION__OUT_CONTEXT:
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
			case AadlPackage.DATA_ACCESS_CONNECTION__REQUIRE:
				setRequire((DataAccessConnectionEnd)newValue);
				return;
			case AadlPackage.DATA_ACCESS_CONNECTION__PROVIDE:
				setProvide((DataAccessConnectionEnd)newValue);
				return;
			case AadlPackage.DATA_ACCESS_CONNECTION__IN_CONTEXT:
				setInContext((PortAndAccessConectionContext)newValue);
				return;
			case AadlPackage.DATA_ACCESS_CONNECTION__OUT_CONTEXT:
				setOutContext((PortAndAccessConectionContext)newValue);
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
			case AadlPackage.DATA_ACCESS_CONNECTION__REQUIRE:
				setRequire((DataAccessConnectionEnd)null);
				return;
			case AadlPackage.DATA_ACCESS_CONNECTION__PROVIDE:
				setProvide((DataAccessConnectionEnd)null);
				return;
			case AadlPackage.DATA_ACCESS_CONNECTION__IN_CONTEXT:
				setInContext((PortAndAccessConectionContext)null);
				return;
			case AadlPackage.DATA_ACCESS_CONNECTION__OUT_CONTEXT:
				setOutContext((PortAndAccessConectionContext)null);
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
			case AadlPackage.DATA_ACCESS_CONNECTION__REQUIRE:
				return basicGetRequire() != null;
			case AadlPackage.DATA_ACCESS_CONNECTION__PROVIDE:
				return basicGetProvide() != null;
			case AadlPackage.DATA_ACCESS_CONNECTION__IN_CONTEXT:
				return basicGetInContext() != null;
			case AadlPackage.DATA_ACCESS_CONNECTION__OUT_CONTEXT:
				return basicGetOutContext() != null;
		}
		return super.eIsSet(featureID);
	}

} //DataAccessConnectionImpl
