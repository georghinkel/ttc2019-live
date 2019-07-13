/**
 */
package ttc2019.live.changes.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ttc2019.live.changes.AssociationListDeletion;
import ttc2019.live.changes.ChangesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association List Deletion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ttc2019.live.changes.impl.AssociationListDeletionImpl#getDeletedElement <em>Deleted Element</em>}</li>
 *   <li>{@link ttc2019.live.changes.impl.AssociationListDeletionImpl#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationListDeletionImpl extends AssociationChangeImpl implements AssociationListDeletion {
	/**
	 * The cached value of the '{@link #getDeletedElement() <em>Deleted Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletedElement()
	 * @generated
	 * @ordered
	 */
	protected EObject deletedElement;

	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected int index = INDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationListDeletionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChangesPackage.Literals.ASSOCIATION_LIST_DELETION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getDeletedElement() {
		if (deletedElement != null && deletedElement.eIsProxy()) {
			InternalEObject oldDeletedElement = (InternalEObject)deletedElement;
			deletedElement = eResolveProxy(oldDeletedElement);
			if (deletedElement != oldDeletedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChangesPackage.ASSOCIATION_LIST_DELETION__DELETED_ELEMENT, oldDeletedElement, deletedElement));
			}
		}
		return deletedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetDeletedElement() {
		return deletedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeletedElement(EObject newDeletedElement) {
		EObject oldDeletedElement = deletedElement;
		deletedElement = newDeletedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChangesPackage.ASSOCIATION_LIST_DELETION__DELETED_ELEMENT, oldDeletedElement, deletedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndex(int newIndex) {
		int oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChangesPackage.ASSOCIATION_LIST_DELETION__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChangesPackage.ASSOCIATION_LIST_DELETION__DELETED_ELEMENT:
				if (resolve) return getDeletedElement();
				return basicGetDeletedElement();
			case ChangesPackage.ASSOCIATION_LIST_DELETION__INDEX:
				return getIndex();
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
			case ChangesPackage.ASSOCIATION_LIST_DELETION__DELETED_ELEMENT:
				setDeletedElement((EObject)newValue);
				return;
			case ChangesPackage.ASSOCIATION_LIST_DELETION__INDEX:
				setIndex((Integer)newValue);
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
			case ChangesPackage.ASSOCIATION_LIST_DELETION__DELETED_ELEMENT:
				setDeletedElement((EObject)null);
				return;
			case ChangesPackage.ASSOCIATION_LIST_DELETION__INDEX:
				setIndex(INDEX_EDEFAULT);
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
			case ChangesPackage.ASSOCIATION_LIST_DELETION__DELETED_ELEMENT:
				return deletedElement != null;
			case ChangesPackage.ASSOCIATION_LIST_DELETION__INDEX:
				return index != INDEX_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (index: ");
		result.append(index);
		result.append(')');
		return result.toString();
	}

} //AssociationListDeletionImpl
