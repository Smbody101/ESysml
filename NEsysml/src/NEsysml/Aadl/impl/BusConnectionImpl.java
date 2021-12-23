/**
 */
package NEsysml.Aadl.impl;

import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.BusAccessConnectionEnd;
import NEsysml.Aadl.BusConnection;
import NEsysml.Aadl.BusAccess;
import NEsysml.Aadl.PortAndAccessConectionContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.papyrus.sysml14.portsandflows.FeatureDirection;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bus Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.BusConnectionImpl#getBase_Connector <em>Base Connector</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.BusConnectionImpl#getRequire <em>Require</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.BusConnectionImpl#getProvide <em>Provide</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.BusConnectionImpl#getInContext <em>In Context</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.BusConnectionImpl#getOutContext <em>Out Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusConnectionImpl extends MinimalEObjectImpl.Container implements BusConnection {
	/**
	 * The cached value of the '{@link #getBase_Connector() <em>Base Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Connector()
	 * @generated
	 * @ordered
	 */
	protected Connector base_Connector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.BUS_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getBase_Connector() {
		if (base_Connector != null && base_Connector.eIsProxy()) {
			InternalEObject oldBase_Connector = (InternalEObject)base_Connector;
			base_Connector = (Connector)eResolveProxy(oldBase_Connector);
			if (base_Connector != oldBase_Connector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AadlPackage.BUS_CONNECTION__BASE_CONNECTOR, oldBase_Connector, base_Connector));
			}
		}
		return base_Connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetBase_Connector() {
		return base_Connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Connector(Connector newBase_Connector) {
		Connector oldBase_Connector = base_Connector;
		base_Connector = newBase_Connector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AadlPackage.BUS_CONNECTION__BASE_CONNECTOR, oldBase_Connector, base_Connector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusAccessConnectionEnd getRequire() {
		BusAccessConnectionEnd require = basicGetRequire();
		return require != null && require.eIsProxy() ? (BusAccessConnectionEnd)eResolveProxy((InternalEObject)require) : require;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BusAccessConnectionEnd basicGetRequire() {
		// TODO: implement this method to return the 'Require' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		EList<org.eclipse.uml2.uml.ConnectorEnd> connectorEnds = this.getBase_Connector().getEnds();
		Property p1 = (Property)connectorEnds.get(0).getRole();
		Property p2 = (Property)connectorEnds.get(1).getRole();
		BusAccessConnectionEnd pp1 = null;
		BusAccessConnectionEnd pp2 = null;
		for(EObject object : p1.getStereotypeApplications())
			if(object instanceof BusAccessConnectionEnd) 
				pp1 = (BusAccessConnectionEnd) object;
		for(EObject object : p2.getStereotypeApplications())
			if(object instanceof BusAccessConnectionEnd) 
				pp2 = (BusAccessConnectionEnd) object;
		if(pp1 == null || pp2 == null)
			return null;
		Property part1 = connectorEnds.get(0).getPartWithPort();
		Property part2 = connectorEnds.get(1).getPartWithPort();
		if(pp1 instanceof BusAccess && pp2 instanceof BusAccess) {
			BusAccess ppp1 = (BusAccess)pp1;
			BusAccess ppp2 = (BusAccess)pp2;
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
		}else if(pp1 instanceof BusAccess) {
			BusAccess ppp1 = (BusAccess)pp1;
			if(ppp1.getDirection() == FeatureDirection.PROVIDED && part1 != null)
				return pp1;
			else if(ppp1.getDirection() == FeatureDirection.REQUIRED && part1 == null)
				return pp2;
		}else if(pp2 instanceof BusAccess) {
			BusAccess ppp2 = (BusAccess)pp2;
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
	public void setRequire(BusAccessConnectionEnd newRequire) {
		// TODO: implement this method to set the 'Require' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusAccessConnectionEnd getProvide() {
		BusAccessConnectionEnd provide = basicGetProvide();
		return provide != null && provide.eIsProxy() ? (BusAccessConnectionEnd)eResolveProxy((InternalEObject)provide) : provide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BusAccessConnectionEnd basicGetProvide() {
		// TODO: implement this method to return the 'Provide' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		EList<org.eclipse.uml2.uml.ConnectorEnd> connectorEnds = this.getBase_Connector().getEnds();
		Property p1 = (Property)connectorEnds.get(0).getRole();
		Property p2 = (Property)connectorEnds.get(1).getRole();
		BusAccessConnectionEnd pp1 = null;
		BusAccessConnectionEnd pp2 = null;
		for(EObject object : p1.getStereotypeApplications())
			if(object instanceof BusAccessConnectionEnd) 
				pp1 = (BusAccessConnectionEnd) object;
		for(EObject object : p2.getStereotypeApplications())
			if(object instanceof BusAccessConnectionEnd) 
				pp2 = (BusAccessConnectionEnd) object;
		if(pp1 == null || pp2 == null)
			return null;
		Property part1 = connectorEnds.get(0).getPartWithPort();
		Property part2 = connectorEnds.get(1).getPartWithPort();
		if(pp1 instanceof BusAccess && pp2 instanceof BusAccess) {
			BusAccess ppp1 = (BusAccess)pp1;
			BusAccess ppp2 = (BusAccess)pp2;
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
		}else if(pp1 instanceof BusAccess) {
			BusAccess ppp1 = (BusAccess)pp1;
			if(ppp1.getDirection() == FeatureDirection.PROVIDED && part1 != null)
				return pp2;
			else if(ppp1.getDirection() == FeatureDirection.REQUIRED && part1 == null)
				return pp1;
		}else if(pp2 instanceof BusAccess) {
			BusAccess ppp2 = (BusAccess)pp2;
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
	public void setProvide(BusAccessConnectionEnd newProvide) {
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
		BusAccessConnectionEnd pp1 = null;
		BusAccessConnectionEnd pp2 = null;
		for(EObject object : p1.getStereotypeApplications())
			if(object instanceof BusAccessConnectionEnd) 
				pp1 = (BusAccessConnectionEnd) object;
		for(EObject object : p2.getStereotypeApplications())
			if(object instanceof BusAccessConnectionEnd) 
				pp2 = (BusAccessConnectionEnd) object;
		Property part = null;
		if(pp1 == null || pp2 == null)
			return null;
		Property part1 = connectorEnds.get(0).getPartWithPort();
		Property part2 = connectorEnds.get(1).getPartWithPort();
		if(pp1 instanceof BusAccess && pp2 instanceof BusAccess) {
			BusAccess ppp1 = (BusAccess)pp1;
			BusAccess ppp2 = (BusAccess)pp2;
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
		}else if(pp1 instanceof BusAccess) {
			BusAccess ppp1 = (BusAccess)pp1;
			if(ppp1.getDirection() == FeatureDirection.PROVIDED && part1 != null)
				part = part1;
			else if(ppp1.getDirection() == FeatureDirection.REQUIRED && part1 == null)
				part = part2;
		}else if(pp2 instanceof BusAccess) {
			BusAccess ppp2 = (BusAccess)pp2;
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
		BusAccessConnectionEnd pp1 = null;
		BusAccessConnectionEnd pp2 = null;
		for(EObject object : p1.getStereotypeApplications())
			if(object instanceof BusAccessConnectionEnd)
				pp1 = (BusAccessConnectionEnd) object;
		for(EObject object : p2.getStereotypeApplications())
			if(object instanceof BusAccessConnectionEnd)
				pp2 = (BusAccessConnectionEnd) object;
		Property part = null;
		if(pp1 == null || pp2 == null)
			return null;
		Property part1 = connectorEnds.get(0).getPartWithPort();
		Property part2 = connectorEnds.get(1).getPartWithPort();
		if(pp1 instanceof BusAccess && pp2 instanceof BusAccess) {
			BusAccess ppp1 = (BusAccess)pp1;
			BusAccess ppp2 = (BusAccess)pp2;
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
		}else if(pp1 instanceof BusAccess) {
			BusAccess ppp1 = (BusAccess)pp1;
			if(ppp1.getDirection() == FeatureDirection.PROVIDED && part1 != null)
				part = part2;
			else if(ppp1.getDirection() == FeatureDirection.REQUIRED && part1 == null)
				part = part1;
		}else if(pp2 instanceof BusAccess) {
			BusAccess ppp2 = (BusAccess)pp2;
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
			case AadlPackage.BUS_CONNECTION__BASE_CONNECTOR:
				if (resolve) return getBase_Connector();
				return basicGetBase_Connector();
			case AadlPackage.BUS_CONNECTION__REQUIRE:
				if (resolve) return getRequire();
				return basicGetRequire();
			case AadlPackage.BUS_CONNECTION__PROVIDE:
				if (resolve) return getProvide();
				return basicGetProvide();
			case AadlPackage.BUS_CONNECTION__IN_CONTEXT:
				if (resolve) return getInContext();
				return basicGetInContext();
			case AadlPackage.BUS_CONNECTION__OUT_CONTEXT:
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
			case AadlPackage.BUS_CONNECTION__BASE_CONNECTOR:
				setBase_Connector((Connector)newValue);
				return;
			case AadlPackage.BUS_CONNECTION__REQUIRE:
				setRequire((BusAccessConnectionEnd)newValue);
				return;
			case AadlPackage.BUS_CONNECTION__PROVIDE:
				setProvide((BusAccessConnectionEnd)newValue);
				return;
			case AadlPackage.BUS_CONNECTION__IN_CONTEXT:
				setInContext((PortAndAccessConectionContext)newValue);
				return;
			case AadlPackage.BUS_CONNECTION__OUT_CONTEXT:
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
			case AadlPackage.BUS_CONNECTION__BASE_CONNECTOR:
				setBase_Connector((Connector)null);
				return;
			case AadlPackage.BUS_CONNECTION__REQUIRE:
				setRequire((BusAccessConnectionEnd)null);
				return;
			case AadlPackage.BUS_CONNECTION__PROVIDE:
				setProvide((BusAccessConnectionEnd)null);
				return;
			case AadlPackage.BUS_CONNECTION__IN_CONTEXT:
				setInContext((PortAndAccessConectionContext)null);
				return;
			case AadlPackage.BUS_CONNECTION__OUT_CONTEXT:
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
			case AadlPackage.BUS_CONNECTION__BASE_CONNECTOR:
				return base_Connector != null;
			case AadlPackage.BUS_CONNECTION__REQUIRE:
				return basicGetRequire() != null;
			case AadlPackage.BUS_CONNECTION__PROVIDE:
				return basicGetProvide() != null;
			case AadlPackage.BUS_CONNECTION__IN_CONTEXT:
				return basicGetInContext() != null;
			case AadlPackage.BUS_CONNECTION__OUT_CONTEXT:
				return basicGetOutContext() != null;
		}
		return super.eIsSet(featureID);
	}

} //BusConnectionImpl
