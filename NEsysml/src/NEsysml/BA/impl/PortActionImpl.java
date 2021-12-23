/**
 */
package NEsysml.BA.impl;

import NEsysml.Aadl.Port;

import NEsysml.BA.BAPackage;
import NEsysml.BA.GetInput;
import NEsysml.BA.PortAction;
import NEsysml.BA.SendOutput;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.uml2.uml.Trigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.BA.impl.PortActionImpl#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PortActionImpl extends BehaviorActionImpl implements PortAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BAPackage.Literals.PORT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPort() {
		Port port = basicGetPort();
		return port != null && port.eIsProxy() ? (Port)eResolveProxy((InternalEObject)port) : port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Port basicGetPort() {
		// TODO: implement this method to return the 'Port' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		if(this instanceof SendOutput) {
			SendOutput action = (SendOutput) this;
			for(EObject object : action.getBase_SendSignalAction().getOnPort().getStereotypeApplications())
				if(object instanceof Port)
					return (Port) object;
		}else if(this instanceof GetInput) {
			GetInput action = (GetInput) this;
			for(Trigger trigger : action.getBase_AcceptEventAction().getTriggers())
				for(org.eclipse.uml2.uml.Port port : trigger.getPorts())
					for(EObject object : port.getStereotypeApplications())
						if(object instanceof Port)
							return (Port) object;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(Port newPort) {
		// TODO: implement this method to set the 'Port' reference
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
			case BAPackage.PORT_ACTION__PORT:
				if (resolve) return getPort();
				return basicGetPort();
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
			case BAPackage.PORT_ACTION__PORT:
				setPort((Port)newValue);
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
			case BAPackage.PORT_ACTION__PORT:
				setPort((Port)null);
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
			case BAPackage.PORT_ACTION__PORT:
				return basicGetPort() != null;
		}
		return super.eIsSet(featureID);
	}

} //PortActionImpl
