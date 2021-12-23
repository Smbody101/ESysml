/**
 */
package NEsysml.Aadl.impl;

import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.Port;
import NEsysml.Aadl.PortAndAccessConectionContext;
import NEsysml.Aadl.PortConnection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.sysml14.portsandflows.FlowDirection;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.PortConnectionImpl#getBase_Connector <em>Base Connector</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.PortConnectionImpl#getIn <em>In</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.PortConnectionImpl#getOut <em>Out</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.PortConnectionImpl#getInContext <em>In Context</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.PortConnectionImpl#getOutContext <em>Out Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortConnectionImpl extends ConnectionImpl implements PortConnection {
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
	protected PortConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.PORT_CONNECTION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AadlPackage.PORT_CONNECTION__BASE_CONNECTOR, oldBase_Connector, base_Connector));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AadlPackage.PORT_CONNECTION__BASE_CONNECTOR, oldBase_Connector, base_Connector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getIn() {
		Port in = basicGetIn();
		return in != null && in.eIsProxy() ? (Port)eResolveProxy((InternalEObject)in) : in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Port basicGetIn() {
		// TODO: implement this method to return the 'In' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		EList<org.eclipse.uml2.uml.ConnectorEnd> connectorEnds = this.getBase_Connector().getEnds();
		org.eclipse.uml2.uml.Port p1 = (org.eclipse.uml2.uml.Port)connectorEnds.get(0).getRole();
		org.eclipse.uml2.uml.Port p2 = (org.eclipse.uml2.uml.Port)connectorEnds.get(1).getRole();
		Port pp1 = null;
		Port pp2 = null;
		for(EObject object : p1.getStereotypeApplications())
			if(object instanceof Port) 
				pp1 = (Port) object;
		for(EObject object : p2.getStereotypeApplications())
			if(object instanceof Port) 
				pp2 = (Port) object;
		if(pp1 == null || pp2 == null)
			return null;
		Property part1 = connectorEnds.get(0).getPartWithPort();
		Property part2 = connectorEnds.get(1).getPartWithPort();
		if(pp1.getDirection() == FlowDirection.OUT && pp2.getDirection() == FlowDirection.OUT) {
			if(part1 == null && part2 != null)
				return pp2;
			else if(part1 != null && part2 == null)
				return pp1;
		}
		else if(pp1.getDirection() == FlowDirection.OUT && pp2.getDirection() == FlowDirection.IN && part1 != null && part2 != null)
			return pp1;
		else if(pp1.getDirection() == FlowDirection.IN && pp2.getDirection() == FlowDirection.OUT && part1 != null && part2 != null)
			return pp2;
		else if(pp1.getDirection() == FlowDirection.IN && pp2.getDirection() == FlowDirection.IN) {
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
	public void setIn(Port newIn) {
		// TODO: implement this method to set the 'In' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getOut() {
		Port out = basicGetOut();
		return out != null && out.eIsProxy() ? (Port)eResolveProxy((InternalEObject)out) : out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Port basicGetOut() {
		// TODO: implement this method to return the 'Out' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		EList<org.eclipse.uml2.uml.ConnectorEnd> connectorEnds = this.getBase_Connector().getEnds();
		org.eclipse.uml2.uml.Port p1 = (org.eclipse.uml2.uml.Port)connectorEnds.get(0).getRole();
		org.eclipse.uml2.uml.Port p2 = (org.eclipse.uml2.uml.Port)connectorEnds.get(1).getRole();
		Port pp1 = null;
		Port pp2 = null;
		for(EObject object : p1.getStereotypeApplications())
			if(object instanceof Port) 
				pp1 = (Port) object;
		for(EObject object : p2.getStereotypeApplications())
			if(object instanceof Port) 
				pp2 = (Port) object;
		if(pp1 == null || pp2 == null)
			return null;
		Property part1 = connectorEnds.get(0).getPartWithPort();
		Property part2 = connectorEnds.get(1).getPartWithPort();
		if(pp1.getDirection() == FlowDirection.OUT && pp2.getDirection() == FlowDirection.OUT) {
			if(part1 == null && part2 != null)
				return pp1;
			else if(part1 != null && part2 == null)
				return pp2;
		}
		else if(pp1.getDirection() == FlowDirection.OUT && pp2.getDirection() == FlowDirection.IN && part1 != null && part2 != null)
			return pp2;
		else if(pp1.getDirection() == FlowDirection.IN && pp2.getDirection() == FlowDirection.OUT && part1 != null && part2 != null)
			return pp1;
		else if(pp1.getDirection() == FlowDirection.IN && pp2.getDirection() == FlowDirection.IN) {
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
	public void setOut(Port newOut) {
		// TODO: implement this method to set the 'Out' reference
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
		Port pp1 = null;
		Port pp2 = null;
		for(EObject object : p1.getStereotypeApplications())
			if(object instanceof Port) 
				pp1 = (Port) object;
		for(EObject object : p2.getStereotypeApplications())
			if(object instanceof Port) 
				pp2 = (Port) object;
		Property part = null;
		if(pp1 == null || pp2 == null)
			return null;
		Property part1 = connectorEnds.get(0).getPartWithPort();
		Property part2 = connectorEnds.get(1).getPartWithPort();
		if(pp1.getDirection() == FlowDirection.OUT && pp2.getDirection() == FlowDirection.OUT) {
			if(part1 == null && part2 != null)
				part = part2;
			else if(part1 != null && part2 == null)
				part = part1;
		}
		else if(pp1.getDirection() == FlowDirection.OUT && pp2.getDirection() == FlowDirection.IN && part1 != null && part2 != null)
			part = part1;
		else if(pp1.getDirection() == FlowDirection.IN && pp2.getDirection() == FlowDirection.OUT && part1 != null && part2 != null)
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
		Port pp1 = null;
		Port pp2 = null;
		for(EObject object : p1.getStereotypeApplications())
			if(object instanceof Port) 
				pp1 = (Port) object;
		for(EObject object : p2.getStereotypeApplications())
			if(object instanceof Port) 
				pp2 = (Port) object;
		Property part = null;
		if(pp1 == null || pp2 == null)
			return null;
		Property part1 = connectorEnds.get(0).getPartWithPort();
		Property part2 = connectorEnds.get(1).getPartWithPort();
		if(pp1.getDirection() == FlowDirection.OUT && pp2.getDirection() == FlowDirection.IN && part1 != null && part2 != null)
			part = part2;
		else if(pp1.getDirection() == FlowDirection.IN && pp2.getDirection() == FlowDirection.OUT && part1 != null && part2 != null)
			part = part1;
		else if(pp1.getDirection() == FlowDirection.IN && pp2.getDirection() == FlowDirection.IN) {
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
			case AadlPackage.PORT_CONNECTION__BASE_CONNECTOR:
				if (resolve) return getBase_Connector();
				return basicGetBase_Connector();
			case AadlPackage.PORT_CONNECTION__IN:
				if (resolve) return getIn();
				return basicGetIn();
			case AadlPackage.PORT_CONNECTION__OUT:
				if (resolve) return getOut();
				return basicGetOut();
			case AadlPackage.PORT_CONNECTION__IN_CONTEXT:
				if (resolve) return getInContext();
				return basicGetInContext();
			case AadlPackage.PORT_CONNECTION__OUT_CONTEXT:
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
			case AadlPackage.PORT_CONNECTION__BASE_CONNECTOR:
				setBase_Connector((Connector)newValue);
				return;
			case AadlPackage.PORT_CONNECTION__IN:
				setIn((Port)newValue);
				return;
			case AadlPackage.PORT_CONNECTION__OUT:
				setOut((Port)newValue);
				return;
			case AadlPackage.PORT_CONNECTION__IN_CONTEXT:
				setInContext((PortAndAccessConectionContext)newValue);
				return;
			case AadlPackage.PORT_CONNECTION__OUT_CONTEXT:
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
			case AadlPackage.PORT_CONNECTION__BASE_CONNECTOR:
				setBase_Connector((Connector)null);
				return;
			case AadlPackage.PORT_CONNECTION__IN:
				setIn((Port)null);
				return;
			case AadlPackage.PORT_CONNECTION__OUT:
				setOut((Port)null);
				return;
			case AadlPackage.PORT_CONNECTION__IN_CONTEXT:
				setInContext((PortAndAccessConectionContext)null);
				return;
			case AadlPackage.PORT_CONNECTION__OUT_CONTEXT:
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
			case AadlPackage.PORT_CONNECTION__BASE_CONNECTOR:
				return base_Connector != null;
			case AadlPackage.PORT_CONNECTION__IN:
				return basicGetIn() != null;
			case AadlPackage.PORT_CONNECTION__OUT:
				return basicGetOut() != null;
			case AadlPackage.PORT_CONNECTION__IN_CONTEXT:
				return basicGetInContext() != null;
			case AadlPackage.PORT_CONNECTION__OUT_CONTEXT:
				return basicGetOutContext() != null;
		}
		return super.eIsSet(featureID);
	}

} //PortConnectionImpl
