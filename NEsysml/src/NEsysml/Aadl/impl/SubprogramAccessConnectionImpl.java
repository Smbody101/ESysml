/**
 */
package NEsysml.Aadl.impl;

import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.PortAndAccessConectionContext;
import NEsysml.Aadl.SubprogramAccess;
import NEsysml.Aadl.SubprogramAccessConnection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.sysml14.portsandflows.FeatureDirection;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subprogram Access Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.SubprogramAccessConnectionImpl#getBase_Connector <em>Base Connector</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.SubprogramAccessConnectionImpl#getRequire <em>Require</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.SubprogramAccessConnectionImpl#getProvide <em>Provide</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.SubprogramAccessConnectionImpl#getInContext <em>In Context</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.SubprogramAccessConnectionImpl#getOutContext <em>Out Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubprogramAccessConnectionImpl extends ConnectionImpl implements SubprogramAccessConnection {
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
	protected SubprogramAccessConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.SUBPROGRAM_ACCESS_CONNECTION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AadlPackage.SUBPROGRAM_ACCESS_CONNECTION__BASE_CONNECTOR, oldBase_Connector, base_Connector));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AadlPackage.SUBPROGRAM_ACCESS_CONNECTION__BASE_CONNECTOR, oldBase_Connector, base_Connector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramAccess getRequire() {
		SubprogramAccess require = basicGetRequire();
		return require != null && require.eIsProxy() ? (SubprogramAccess)eResolveProxy((InternalEObject)require) : require;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SubprogramAccess basicGetRequire() {
		// TODO: implement this method to return the 'Require' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		EList<org.eclipse.uml2.uml.ConnectorEnd> connectorEnds = this.getBase_Connector().getEnds();
		org.eclipse.uml2.uml.Port p1 = (org.eclipse.uml2.uml.Port)connectorEnds.get(0).getRole();
		org.eclipse.uml2.uml.Port p2 = (org.eclipse.uml2.uml.Port)connectorEnds.get(1).getRole();
		SubprogramAccess pp1 = null;
		SubprogramAccess pp2 = null;
		for(EObject object : p1.getStereotypeApplications())
			if(object instanceof SubprogramAccess) 
				pp1 = (SubprogramAccess) object;
		for(EObject object : p2.getStereotypeApplications())
			if(object instanceof SubprogramAccess) 
				pp2 = (SubprogramAccess) object;
		if(pp1 == null || pp2 == null)
			return null;
		Property part1 = connectorEnds.get(0).getPartWithPort();
		Property part2 = connectorEnds.get(1).getPartWithPort();
		if(pp1.getDirection() == FeatureDirection.PROVIDED && pp2.getDirection() == FeatureDirection.PROVIDED) {
			if(part1 == null && part2 != null)
				return pp2;
			else if(part1 != null && part2 == null)
				return pp1;
		}
		else if(pp1.getDirection() == FeatureDirection.PROVIDED && pp2.getDirection() == FeatureDirection.REQUIRED && part1 != null && part2 != null)
			return pp1;
		else if(pp1.getDirection() == FeatureDirection.REQUIRED && pp2.getDirection() == FeatureDirection.PROVIDED && part1 != null && part2 != null)
			return pp2;
		else if(pp1.getDirection() == FeatureDirection.REQUIRED && pp2.getDirection() == FeatureDirection.REQUIRED) {
			if(part1 == null && part2 != null)
				return pp1;
			else if(part1 != null && part2 == null)
				return pp2;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequire(SubprogramAccess newRequire) {
		// TODO: implement this method to set the 'Require' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramAccess getProvide() {
		SubprogramAccess provide = basicGetProvide();
		return provide != null && provide.eIsProxy() ? (SubprogramAccess)eResolveProxy((InternalEObject)provide) : provide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SubprogramAccess basicGetProvide() {
		// TODO: implement this method to return the 'Provide' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		EList<org.eclipse.uml2.uml.ConnectorEnd> connectorEnds = this.getBase_Connector().getEnds();
		org.eclipse.uml2.uml.Port p1 = (org.eclipse.uml2.uml.Port)connectorEnds.get(0).getRole();
		org.eclipse.uml2.uml.Port p2 = (org.eclipse.uml2.uml.Port)connectorEnds.get(1).getRole();
		SubprogramAccess pp1 = null;
		SubprogramAccess pp2 = null;
		for(EObject object : p1.getStereotypeApplications())
			if(object instanceof SubprogramAccess) 
				pp1 = (SubprogramAccess) object;
		for(EObject object : p2.getStereotypeApplications())
			if(object instanceof SubprogramAccess) 
				pp2 = (SubprogramAccess) object;
		if(pp1 == null || pp2 == null)
			return null;
		Property part1 = connectorEnds.get(0).getPartWithPort();
		Property part2 = connectorEnds.get(1).getPartWithPort();
		if(pp1.getDirection() == FeatureDirection.PROVIDED && pp2.getDirection() == FeatureDirection.PROVIDED) {
			if(part1 == null && part2 != null)
				return pp1;
			else if(part1 != null && part2 == null)
				return pp2;
		}
		else if(pp1.getDirection() == FeatureDirection.PROVIDED && pp2.getDirection() == FeatureDirection.REQUIRED && part1 != null && part2 != null)
			return pp2;
		else if(pp1.getDirection() == FeatureDirection.REQUIRED && pp2.getDirection() == FeatureDirection.PROVIDED && part1 != null && part2 != null)
			return pp1;
		else if(pp1.getDirection() == FeatureDirection.REQUIRED && pp2.getDirection() == FeatureDirection.REQUIRED) {
			if(part1 == null && part2 != null)
				return pp2;
			else if(part1 != null && part2 == null)
				return pp1;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvide(SubprogramAccess newProvide) {
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
		org.eclipse.uml2.uml.Port p1 = (org.eclipse.uml2.uml.Port)connectorEnds.get(0).getRole();
		org.eclipse.uml2.uml.Port p2 = (org.eclipse.uml2.uml.Port)connectorEnds.get(1).getRole();
		SubprogramAccess pp1 = null;
		SubprogramAccess pp2 = null;
		for(EObject object : p1.getStereotypeApplications())
			if(object instanceof SubprogramAccess) 
				pp1 = (SubprogramAccess) object;
		for(EObject object : p2.getStereotypeApplications())
			if(object instanceof SubprogramAccess) 
				pp2 = (SubprogramAccess) object;
		Property part = null;
		if(pp1 == null || pp2 == null)
			return null;
		Property part1 = connectorEnds.get(0).getPartWithPort();
		Property part2 = connectorEnds.get(1).getPartWithPort();
		if(pp1.getDirection() == FeatureDirection.PROVIDED && pp2.getDirection() == FeatureDirection.PROVIDED) {
			if(part1 == null && part2 != null)
				part = part2;
			else if(part1 != null && part2 == null)
				part = part1;
		}
		else if(pp1.getDirection() == FeatureDirection.PROVIDED && pp2.getDirection() == FeatureDirection.REQUIRED && part1 != null && part2 != null)
			part = part1;
		else if(pp1.getDirection() == FeatureDirection.REQUIRED && pp2.getDirection() == FeatureDirection.PROVIDED && part1 != null && part2 != null)
			part = part2;
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
		org.eclipse.uml2.uml.Port p1 = (org.eclipse.uml2.uml.Port)connectorEnds.get(0).getRole();
		org.eclipse.uml2.uml.Port p2 = (org.eclipse.uml2.uml.Port)connectorEnds.get(1).getRole();
		SubprogramAccess pp1 = null;
		SubprogramAccess pp2 = null;
		for(EObject object : p1.getStereotypeApplications())
			if(object instanceof SubprogramAccess) 
				pp1 = (SubprogramAccess) object;
		for(EObject object : p2.getStereotypeApplications())
			if(object instanceof SubprogramAccess) 
				pp2 = (SubprogramAccess) object;
		Property part = null;
		if(pp1 == null || pp2 == null)
			return null;
		Property part1 = connectorEnds.get(0).getPartWithPort();
		Property part2 = connectorEnds.get(1).getPartWithPort();
		if(pp1.getDirection() == FeatureDirection.PROVIDED && pp2.getDirection() == FeatureDirection.REQUIRED && part1 != null && part2 != null)
			part = part2;
		else if(pp1.getDirection() == FeatureDirection.REQUIRED && pp2.getDirection() == FeatureDirection.PROVIDED && part1 != null && part2 != null)
			part = part1;
		else if(pp1.getDirection() == FeatureDirection.REQUIRED && pp2.getDirection() == FeatureDirection.REQUIRED) {
			if(part1 == null && part2 != null)
				part = part2;
			else if(part1 != null && part2 == null)
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
			case AadlPackage.SUBPROGRAM_ACCESS_CONNECTION__BASE_CONNECTOR:
				if (resolve) return getBase_Connector();
				return basicGetBase_Connector();
			case AadlPackage.SUBPROGRAM_ACCESS_CONNECTION__REQUIRE:
				if (resolve) return getRequire();
				return basicGetRequire();
			case AadlPackage.SUBPROGRAM_ACCESS_CONNECTION__PROVIDE:
				if (resolve) return getProvide();
				return basicGetProvide();
			case AadlPackage.SUBPROGRAM_ACCESS_CONNECTION__IN_CONTEXT:
				if (resolve) return getInContext();
				return basicGetInContext();
			case AadlPackage.SUBPROGRAM_ACCESS_CONNECTION__OUT_CONTEXT:
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
			case AadlPackage.SUBPROGRAM_ACCESS_CONNECTION__BASE_CONNECTOR:
				setBase_Connector((Connector)newValue);
				return;
			case AadlPackage.SUBPROGRAM_ACCESS_CONNECTION__REQUIRE:
				setRequire((SubprogramAccess)newValue);
				return;
			case AadlPackage.SUBPROGRAM_ACCESS_CONNECTION__PROVIDE:
				setProvide((SubprogramAccess)newValue);
				return;
			case AadlPackage.SUBPROGRAM_ACCESS_CONNECTION__IN_CONTEXT:
				setInContext((PortAndAccessConectionContext)newValue);
				return;
			case AadlPackage.SUBPROGRAM_ACCESS_CONNECTION__OUT_CONTEXT:
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
			case AadlPackage.SUBPROGRAM_ACCESS_CONNECTION__BASE_CONNECTOR:
				setBase_Connector((Connector)null);
				return;
			case AadlPackage.SUBPROGRAM_ACCESS_CONNECTION__REQUIRE:
				setRequire((SubprogramAccess)null);
				return;
			case AadlPackage.SUBPROGRAM_ACCESS_CONNECTION__PROVIDE:
				setProvide((SubprogramAccess)null);
				return;
			case AadlPackage.SUBPROGRAM_ACCESS_CONNECTION__IN_CONTEXT:
				setInContext((PortAndAccessConectionContext)null);
				return;
			case AadlPackage.SUBPROGRAM_ACCESS_CONNECTION__OUT_CONTEXT:
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
			case AadlPackage.SUBPROGRAM_ACCESS_CONNECTION__BASE_CONNECTOR:
				return base_Connector != null;
			case AadlPackage.SUBPROGRAM_ACCESS_CONNECTION__REQUIRE:
				return basicGetRequire() != null;
			case AadlPackage.SUBPROGRAM_ACCESS_CONNECTION__PROVIDE:
				return basicGetProvide() != null;
			case AadlPackage.SUBPROGRAM_ACCESS_CONNECTION__IN_CONTEXT:
				return basicGetInContext() != null;
			case AadlPackage.SUBPROGRAM_ACCESS_CONNECTION__OUT_CONTEXT:
				return basicGetOutContext() != null;
		}
		return super.eIsSet(featureID);
	}

} //SubprogramAccessConnectionImpl
