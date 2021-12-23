/**
 */
package NEsysml.EM.impl;

import NEsysml.AadlUtil;
import NEsysml.EM.ComponentErrorBehavior;
import NEsysml.EM.EMPackage;
import NEsysml.EM.ErrorModelLibrary;
import NEsysml.EM.ErrorModelSubclause;
import NEsysml.EM.ErrorPropagationPoint;
import NEsysml.EM.ErrorType;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Port;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Model Subclause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.impl.ErrorModelSubclauseImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link NEsysml.EM.impl.ErrorModelSubclauseImpl#getOwnedPropagationPoint <em>Owned Propagation Point</em>}</li>
 *   <li>{@link NEsysml.EM.impl.ErrorModelSubclauseImpl#getOwnedBehavior <em>Owned Behavior</em>}</li>
 *   <li>{@link NEsysml.EM.impl.ErrorModelSubclauseImpl#getUseTypes <em>Use Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorModelSubclauseImpl extends MinimalEObjectImpl.Container implements ErrorModelSubclause {
	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorModelSubclauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMPackage.Literals.ERROR_MODEL_SUBCLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMPackage.ERROR_MODEL_SUBCLAUSE__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMPackage.ERROR_MODEL_SUBCLAUSE__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ErrorPropagationPoint> getOwnedPropagationPoint() {
		// TODO: implement this method to return the 'Owned Propagation Point' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<ErrorPropagationPoint> list = new BasicEList<ErrorPropagationPoint>();
		if(this.getBase_Class() == null)
			return list;
		for(Port port : this.getBase_Class().getOwnedPorts()) {
			if(AadlUtil.eINSTANCE.isStereotypedBy(port, EMPackage.Literals.ERROR_PROPAGATION_POINT))
				list.add((ErrorPropagationPoint) AadlUtil.eINSTANCE.getStereotypeApplication(port, EMPackage.Literals.ERROR_PROPAGATION_POINT));
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentErrorBehavior getOwnedBehavior() {
		ComponentErrorBehavior ownedBehavior = basicGetOwnedBehavior();
		return ownedBehavior != null && ownedBehavior.eIsProxy() ? (ComponentErrorBehavior)eResolveProxy((InternalEObject)ownedBehavior) : ownedBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ComponentErrorBehavior basicGetOwnedBehavior() {
		// TODO: implement this method to return the 'Owned Behavior' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		if(this.getBase_Class() == null)
			return null;
		for(Behavior behavior : this.getBase_Class().getOwnedBehaviors()) {
			for(EObject object : behavior.getStereotypeApplications())
				if(object instanceof ComponentErrorBehavior)
					return (ComponentErrorBehavior) object;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedBehavior(ComponentErrorBehavior newOwnedBehavior) {
		// TODO: implement this method to set the 'Owned Behavior' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ErrorModelLibrary> getUseTypes() {
		// TODO: implement this method to return the 'Use Types' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		Set<ErrorModelLibrary> libs = new HashSet<ErrorModelLibrary>();
		for(ErrorPropagationPoint points : this.getOwnedPropagationPoint()) {
			for(ErrorType type : points.getOwnedErrorType())
				libs.add(type.getInLibrary());
		}
		for(ErrorModelLibrary lib : this.getOwnedBehavior().getUseType())
			libs.add(lib);
		EList<ErrorModelLibrary> list = new BasicEList<ErrorModelLibrary>();
		for(ErrorModelLibrary lib : libs)
			list.add(lib);
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EMPackage.ERROR_MODEL_SUBCLAUSE__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case EMPackage.ERROR_MODEL_SUBCLAUSE__OWNED_PROPAGATION_POINT:
				return getOwnedPropagationPoint();
			case EMPackage.ERROR_MODEL_SUBCLAUSE__OWNED_BEHAVIOR:
				if (resolve) return getOwnedBehavior();
				return basicGetOwnedBehavior();
			case EMPackage.ERROR_MODEL_SUBCLAUSE__USE_TYPES:
				return getUseTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EMPackage.ERROR_MODEL_SUBCLAUSE__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case EMPackage.ERROR_MODEL_SUBCLAUSE__OWNED_PROPAGATION_POINT:
				getOwnedPropagationPoint().clear();
				getOwnedPropagationPoint().addAll((Collection<? extends ErrorPropagationPoint>)newValue);
				return;
			case EMPackage.ERROR_MODEL_SUBCLAUSE__OWNED_BEHAVIOR:
				setOwnedBehavior((ComponentErrorBehavior)newValue);
				return;
			case EMPackage.ERROR_MODEL_SUBCLAUSE__USE_TYPES:
				getUseTypes().clear();
				getUseTypes().addAll((Collection<? extends ErrorModelLibrary>)newValue);
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
			case EMPackage.ERROR_MODEL_SUBCLAUSE__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case EMPackage.ERROR_MODEL_SUBCLAUSE__OWNED_PROPAGATION_POINT:
				getOwnedPropagationPoint().clear();
				return;
			case EMPackage.ERROR_MODEL_SUBCLAUSE__OWNED_BEHAVIOR:
				setOwnedBehavior((ComponentErrorBehavior)null);
				return;
			case EMPackage.ERROR_MODEL_SUBCLAUSE__USE_TYPES:
				getUseTypes().clear();
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
			case EMPackage.ERROR_MODEL_SUBCLAUSE__BASE_CLASS:
				return base_Class != null;
			case EMPackage.ERROR_MODEL_SUBCLAUSE__OWNED_PROPAGATION_POINT:
				return !getOwnedPropagationPoint().isEmpty();
			case EMPackage.ERROR_MODEL_SUBCLAUSE__OWNED_BEHAVIOR:
				return basicGetOwnedBehavior() != null;
			case EMPackage.ERROR_MODEL_SUBCLAUSE__USE_TYPES:
				return !getUseTypes().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ErrorModelSubclauseImpl
