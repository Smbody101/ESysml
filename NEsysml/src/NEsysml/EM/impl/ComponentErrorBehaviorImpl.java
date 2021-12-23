/**
 */
package NEsysml.EM.impl;

import NEsysml.AadlUtil;
import NEsysml.EM.ComponentErrorBehavior;
import NEsysml.EM.EMPackage;
import NEsysml.EM.ErrorBehaviorStateMachine;
import NEsysml.EM.ErrorPropagation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Error Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.EM.impl.ComponentErrorBehaviorImpl#getImportBehavior <em>Import Behavior</em>}</li>
 *   <li>{@link NEsysml.EM.impl.ComponentErrorBehaviorImpl#getOwnedErrorPropagation <em>Owned Error Propagation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentErrorBehaviorImpl extends ErrorBehaviorImpl implements ComponentErrorBehavior {
	/**
	 * The cached value of the '{@link #getImportBehavior() <em>Import Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportBehavior()
	 * @generated
	 * @ordered
	 */
	protected ErrorBehaviorStateMachine importBehavior;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentErrorBehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMPackage.Literals.COMPONENT_ERROR_BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorBehaviorStateMachine getImportBehavior() {
		if (importBehavior != null && importBehavior.eIsProxy()) {
			InternalEObject oldImportBehavior = (InternalEObject)importBehavior;
			importBehavior = (ErrorBehaviorStateMachine)eResolveProxy(oldImportBehavior);
			if (importBehavior != oldImportBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMPackage.COMPONENT_ERROR_BEHAVIOR__IMPORT_BEHAVIOR, oldImportBehavior, importBehavior));
			}
		}
		return importBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorBehaviorStateMachine basicGetImportBehavior() {
		return importBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportBehavior(ErrorBehaviorStateMachine newImportBehavior) {
		ErrorBehaviorStateMachine oldImportBehavior = importBehavior;
		importBehavior = newImportBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMPackage.COMPONENT_ERROR_BEHAVIOR__IMPORT_BEHAVIOR, oldImportBehavior, importBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ErrorPropagation> getOwnedErrorPropagation() {
		// TODO: implement this method to return the 'Owned Error Propagation' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		EList<ErrorPropagation> list = new BasicEList<ErrorPropagation>();
		if(this.getBase_StateMachine() == null)
			return list;
		for(Region region : this.getBase_StateMachine().getRegions())
			for(Transition transition : region.getTransitions()) {
				if(AadlUtil.eINSTANCE.isStereotypedBy(transition, EMPackage.Literals.ERROR_PROPAGATION))
					list.add((ErrorPropagation) AadlUtil.eINSTANCE.getStereotypeApplication(transition, EMPackage.Literals.ERROR_PROPAGATION));
			}
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
			case EMPackage.COMPONENT_ERROR_BEHAVIOR__IMPORT_BEHAVIOR:
				if (resolve) return getImportBehavior();
				return basicGetImportBehavior();
			case EMPackage.COMPONENT_ERROR_BEHAVIOR__OWNED_ERROR_PROPAGATION:
				return getOwnedErrorPropagation();
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
			case EMPackage.COMPONENT_ERROR_BEHAVIOR__IMPORT_BEHAVIOR:
				setImportBehavior((ErrorBehaviorStateMachine)newValue);
				return;
			case EMPackage.COMPONENT_ERROR_BEHAVIOR__OWNED_ERROR_PROPAGATION:
				getOwnedErrorPropagation().clear();
				getOwnedErrorPropagation().addAll((Collection<? extends ErrorPropagation>)newValue);
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
			case EMPackage.COMPONENT_ERROR_BEHAVIOR__IMPORT_BEHAVIOR:
				setImportBehavior((ErrorBehaviorStateMachine)null);
				return;
			case EMPackage.COMPONENT_ERROR_BEHAVIOR__OWNED_ERROR_PROPAGATION:
				getOwnedErrorPropagation().clear();
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
			case EMPackage.COMPONENT_ERROR_BEHAVIOR__IMPORT_BEHAVIOR:
				return importBehavior != null;
			case EMPackage.COMPONENT_ERROR_BEHAVIOR__OWNED_ERROR_PROPAGATION:
				return !getOwnedErrorPropagation().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentErrorBehaviorImpl
