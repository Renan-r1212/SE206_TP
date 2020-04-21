/**
 */
package fr.tpt.mem4csd.dag.model.dag.impl;

import fr.tpt.mem4csd.dag.model.dag.Channel;
import fr.tpt.mem4csd.dag.model.dag.DagPackage;
import fr.tpt.mem4csd.dag.model.dag.NamedElement;
import fr.tpt.mem4csd.dag.model.dag.Port;
import fr.tpt.mem4csd.dag.model.dag.Task;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.mem4csd.dag.model.dag.impl.ChannelImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dag.model.dag.impl.ChannelImpl#getDestPort <em>Dest Port</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dag.model.dag.impl.ChannelImpl#getSourceTask <em>Source Task</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dag.model.dag.impl.ChannelImpl#getDestTask <em>Dest Task</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dag.model.dag.impl.ChannelImpl#getSourcePort <em>Source Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChannelImpl extends IdentifiedElementImpl implements Channel {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDestPort() <em>Dest Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestPort()
	 * @generated
	 * @ordered
	 */
	protected Port destPort;

	/**
	 * The cached value of the '{@link #getSourcePort() <em>Source Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePort()
	 * @generated
	 * @ordered
	 */
	protected Port sourcePort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DagPackage.Literals.CHANNEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DagPackage.CHANNEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Port getDestPort() {
		if (destPort != null && destPort.eIsProxy()) {
			InternalEObject oldDestPort = (InternalEObject)destPort;
			destPort = (Port)eResolveProxy(oldDestPort);
			if (destPort != oldDestPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DagPackage.CHANNEL__DEST_PORT, oldDestPort, destPort));
			}
		}
		return destPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetDestPort() {
		return destPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestPort(Port newDestPort) {
		Port oldDestPort = destPort;
		destPort = newDestPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DagPackage.CHANNEL__DEST_PORT, oldDestPort, destPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Task getSourceTask() {
		Task sourceTask = basicGetSourceTask();
		return sourceTask != null && sourceTask.eIsProxy() ? (Task)eResolveProxy((InternalEObject)sourceTask) : sourceTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetSourceTask() {
		// TODO: implement this method to return the 'Source Task' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Task getDestTask() {
		Task destTask = basicGetDestTask();
		return destTask != null && destTask.eIsProxy() ? (Task)eResolveProxy((InternalEObject)destTask) : destTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetDestTask() {
		// TODO: implement this method to return the 'Dest Task' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Port getSourcePort() {
		if (sourcePort != null && sourcePort.eIsProxy()) {
			InternalEObject oldSourcePort = (InternalEObject)sourcePort;
			sourcePort = (Port)eResolveProxy(oldSourcePort);
			if (sourcePort != oldSourcePort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DagPackage.CHANNEL__SOURCE_PORT, oldSourcePort, sourcePort));
			}
		}
		return sourcePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetSourcePort() {
		return sourcePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourcePort(Port newSourcePort) {
		Port oldSourcePort = sourcePort;
		sourcePort = newSourcePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DagPackage.CHANNEL__SOURCE_PORT, oldSourcePort, sourcePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DagPackage.CHANNEL__NAME:
				return getName();
			case DagPackage.CHANNEL__DEST_PORT:
				if (resolve) return getDestPort();
				return basicGetDestPort();
			case DagPackage.CHANNEL__SOURCE_TASK:
				if (resolve) return getSourceTask();
				return basicGetSourceTask();
			case DagPackage.CHANNEL__DEST_TASK:
				if (resolve) return getDestTask();
				return basicGetDestTask();
			case DagPackage.CHANNEL__SOURCE_PORT:
				if (resolve) return getSourcePort();
				return basicGetSourcePort();
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
			case DagPackage.CHANNEL__NAME:
				setName((String)newValue);
				return;
			case DagPackage.CHANNEL__DEST_PORT:
				setDestPort((Port)newValue);
				return;
			case DagPackage.CHANNEL__SOURCE_PORT:
				setSourcePort((Port)newValue);
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
			case DagPackage.CHANNEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DagPackage.CHANNEL__DEST_PORT:
				setDestPort((Port)null);
				return;
			case DagPackage.CHANNEL__SOURCE_PORT:
				setSourcePort((Port)null);
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
			case DagPackage.CHANNEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DagPackage.CHANNEL__DEST_PORT:
				return destPort != null;
			case DagPackage.CHANNEL__SOURCE_TASK:
				return basicGetSourceTask() != null;
			case DagPackage.CHANNEL__DEST_TASK:
				return basicGetDestTask() != null;
			case DagPackage.CHANNEL__SOURCE_PORT:
				return sourcePort != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case DagPackage.CHANNEL__NAME: return DagPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case DagPackage.NAMED_ELEMENT__NAME: return DagPackage.CHANNEL__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ChannelImpl
