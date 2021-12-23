/**
 */
package NEsysml.Aadl.impl;

import NEsysml.AadlUtil;
import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.SubprogramAccess;
import NEsysml.Aadl.SubprogramClassifier;
import NEsysml.Aadl.SubprogramSpecification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.papyrus.sysml14.portsandflows.FeatureDirection;

import org.eclipse.papyrus.sysml14.portsandflows.internal.impl.ProxyPortImpl;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Realization;
import org.eclipse.uml2.uml.Reception;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subprogram Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.SubprogramAccessImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.SubprogramAccessImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.SubprogramAccessImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubprogramAccessImpl extends ProxyPortImpl implements SubprogramAccess {
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
	protected SubprogramAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.SUBPROGRAM_ACCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramSpecification getSpecification() {
		SubprogramSpecification specification = basicGetSpecification();
		return specification != null && specification.eIsProxy() ? (SubprogramSpecification)eResolveProxy((InternalEObject)specification) : specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SubprogramSpecification basicGetSpecification() {
		// TODO: implement this method to return the 'Specification' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		Element e = this.getBase_Port().getType();
		if(AadlUtil.eINSTANCE.isStereotypedBy(e, AadlPackage.Literals.SUBPROGRAM_SPECIFICATION))
			return (SubprogramSpecification) AadlUtil.eINSTANCE.getStereotypeApplication(e, AadlPackage.Literals.SUBPROGRAM_SPECIFICATION);
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(SubprogramSpecification newSpecification) {
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
		if(this.getBase_Port().isConjugated())
			return FeatureDirection.REQUIRED;
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
	public SubprogramClassifier getType() {
		SubprogramClassifier type = basicGetType();
		return type != null && type.eIsProxy() ? (SubprogramClassifier)eResolveProxy((InternalEObject)type) : type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SubprogramClassifier basicGetType() {
		// TODO: implement this method to return the 'Type' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		if(this.getSpecification() != null)
			for(DirectedRelationship dr : this.getSpecification().getBase_Class().getSourceDirectedRelationships())
				if(dr instanceof Realization)
					for(Element e : dr.getTargets())
						if(e instanceof Interface) {
							for(Operation o : ((Interface)e).getOperations())
								for(Behavior b : o.getMethods())
									if(b instanceof Activity)
										for(EObject object : b.getStereotypeApplications())
											if(object instanceof SubprogramClassifier)
												return (SubprogramClassifier) object;
							for(Reception r : ((Interface)e).getOwnedReceptions())
								for(Behavior b : r.getMethods())
									for(EObject object : b.getStereotypeApplications())
										if(object instanceof SubprogramClassifier)
											return (SubprogramClassifier) object;
						}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(SubprogramClassifier newType) {
		// TODO: implement this method to set the 'Type' reference
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
			case AadlPackage.SUBPROGRAM_ACCESS__SPECIFICATION:
				if (resolve) return getSpecification();
				return basicGetSpecification();
			case AadlPackage.SUBPROGRAM_ACCESS__DIRECTION:
				return getDirection();
			case AadlPackage.SUBPROGRAM_ACCESS__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case AadlPackage.SUBPROGRAM_ACCESS__SPECIFICATION:
				setSpecification((SubprogramSpecification)newValue);
				return;
			case AadlPackage.SUBPROGRAM_ACCESS__DIRECTION:
				setDirection((FeatureDirection)newValue);
				return;
			case AadlPackage.SUBPROGRAM_ACCESS__TYPE:
				setType((SubprogramClassifier)newValue);
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
			case AadlPackage.SUBPROGRAM_ACCESS__SPECIFICATION:
				setSpecification((SubprogramSpecification)null);
				return;
			case AadlPackage.SUBPROGRAM_ACCESS__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case AadlPackage.SUBPROGRAM_ACCESS__TYPE:
				setType((SubprogramClassifier)null);
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
			case AadlPackage.SUBPROGRAM_ACCESS__SPECIFICATION:
				return basicGetSpecification() != null;
			case AadlPackage.SUBPROGRAM_ACCESS__DIRECTION:
				return getDirection() != DIRECTION_EDEFAULT;
			case AadlPackage.SUBPROGRAM_ACCESS__TYPE:
				return basicGetType() != null;
		}
		return super.eIsSet(featureID);
	}

} //SubprogramAccessImpl
