/**
 */
package NEsysml.Aadl.impl;

import NEsysml.AadlUtil;
import NEsysml.Aadl.AadlPackage;
import NEsysml.Aadl.ComponentImplementation;
import NEsysml.Aadl.ComponentType;
import NEsysml.Aadl.SubprogramImplementation;
import NEsysml.Aadl.SubprogramType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.papyrus.sysml14.blocks.Block;
import org.eclipse.uml2.uml.Generalization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.impl.ComponentImplementationImpl#getType <em>Type</em>}</li>
 *   <li>{@link NEsysml.Aadl.impl.ComponentImplementationImpl#getExtended <em>Extended</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentImplementationImpl extends ComponentClassifierImpl implements ComponentImplementation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlPackage.Literals.COMPONENT_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType getType() {
		ComponentType type = basicGetType();
		return type != null && type.eIsProxy() ? (ComponentType)eResolveProxy((InternalEObject)type) : type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ComponentType basicGetType() {
		// TODO: implement this method to return the 'Type' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		EList<Generalization> generalizations = null;
		if(this instanceof Block)
			generalizations = ((Block)this).getBase_Class().getGeneralizations();
		else if(this instanceof SubprogramType)
			generalizations = ((SubprogramType)this).getBase_Activity().getGeneralizations();
		else if(this instanceof SubprogramImplementation)
			generalizations = ((SubprogramImplementation)this).getBase_Activity().getGeneralizations();
		else
			return null;

		for(Generalization g : generalizations)
			if(AadlUtil.eINSTANCE.isStereotypedBy(g, AadlPackage.Literals.IMPLEMENTATION)) {
				for(EObject object : g.getGeneral().getStereotypeApplications())
					if(object instanceof ComponentType)
						return (ComponentType) object;
			}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ComponentType newType) {
		// TODO: implement this method to set the 'Type' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentImplementation getExtended() {
		ComponentImplementation extended = basicGetExtended();
		return extended != null && extended.eIsProxy() ? (ComponentImplementation)eResolveProxy((InternalEObject)extended) : extended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ComponentImplementation basicGetExtended() {
		// TODO: implement this method to return the 'Extended' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		EList<Generalization> generalizations = null;
		if(this instanceof Block)
			generalizations = ((Block)this).getBase_Class().getGeneralizations();
		else if(this instanceof SubprogramType)
			generalizations = ((SubprogramType)this).getBase_Activity().getGeneralizations();
		else if(this instanceof SubprogramImplementation)
			generalizations = ((SubprogramImplementation)this).getBase_Activity().getGeneralizations();
		else
			return null;

		for(Generalization g : generalizations)
			if(AadlUtil.eINSTANCE.isStereotypedBy(g, AadlPackage.Literals.EXTENSION)) {
				for(EObject object : g.getGeneral().getStereotypeApplications())
					if(object instanceof ComponentImplementation)
						return (ComponentImplementation) object;
			}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtended(ComponentImplementation newExtended) {
		// TODO: implement this method to set the 'Extended' reference
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
			case AadlPackage.COMPONENT_IMPLEMENTATION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case AadlPackage.COMPONENT_IMPLEMENTATION__EXTENDED:
				if (resolve) return getExtended();
				return basicGetExtended();
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
			case AadlPackage.COMPONENT_IMPLEMENTATION__TYPE:
				setType((ComponentType)newValue);
				return;
			case AadlPackage.COMPONENT_IMPLEMENTATION__EXTENDED:
				setExtended((ComponentImplementation)newValue);
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
			case AadlPackage.COMPONENT_IMPLEMENTATION__TYPE:
				setType((ComponentType)null);
				return;
			case AadlPackage.COMPONENT_IMPLEMENTATION__EXTENDED:
				setExtended((ComponentImplementation)null);
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
			case AadlPackage.COMPONENT_IMPLEMENTATION__TYPE:
				return basicGetType() != null;
			case AadlPackage.COMPONENT_IMPLEMENTATION__EXTENDED:
				return basicGetExtended() != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentImplementationImpl
