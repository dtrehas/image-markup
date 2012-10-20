/**
 * © 2012 www.ustok.org
 */
package org.ustok.imagemarkup.ui.model.markupdefinition.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ustok.imagemarkup.ui.model.markupdefinition.MarkupDefinition;
import org.ustok.imagemarkup.ui.model.markupdefinition.MarkupEntry;
import org.ustok.imagemarkup.ui.model.markupdefinition.MarkupdefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Markup Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ustok.imagemarkup.ui.model.markupdefinition.impl.MarkupDefinitionImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.ustok.imagemarkup.ui.model.markupdefinition.impl.MarkupDefinitionImpl#isIgnoreDescriptions <em>Ignore Descriptions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MarkupDefinitionImpl extends EObjectImpl implements MarkupDefinition {
	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<MarkupEntry> entries;

	/**
	 * The default value of the '{@link #isIgnoreDescriptions() <em>Ignore Descriptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreDescriptions()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IGNORE_DESCRIPTIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIgnoreDescriptions() <em>Ignore Descriptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreDescriptions()
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreDescriptions = IGNORE_DESCRIPTIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarkupDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkupdefinitionPackage.Literals.MARKUP_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MarkupEntry> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentWithInverseEList<MarkupEntry>(MarkupEntry.class, this, MarkupdefinitionPackage.MARKUP_DEFINITION__ENTRIES, MarkupdefinitionPackage.MARKUP_ENTRY__PARENT);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIgnoreDescriptions() {
		return ignoreDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnoreDescriptions(boolean newIgnoreDescriptions) {
		boolean oldIgnoreDescriptions = ignoreDescriptions;
		ignoreDescriptions = newIgnoreDescriptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarkupdefinitionPackage.MARKUP_DEFINITION__IGNORE_DESCRIPTIONS, oldIgnoreDescriptions, ignoreDescriptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarkupdefinitionPackage.MARKUP_DEFINITION__ENTRIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntries()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarkupdefinitionPackage.MARKUP_DEFINITION__ENTRIES:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MarkupdefinitionPackage.MARKUP_DEFINITION__ENTRIES:
				return getEntries();
			case MarkupdefinitionPackage.MARKUP_DEFINITION__IGNORE_DESCRIPTIONS:
				return isIgnoreDescriptions();
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
			case MarkupdefinitionPackage.MARKUP_DEFINITION__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends MarkupEntry>)newValue);
				return;
			case MarkupdefinitionPackage.MARKUP_DEFINITION__IGNORE_DESCRIPTIONS:
				setIgnoreDescriptions((Boolean)newValue);
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
			case MarkupdefinitionPackage.MARKUP_DEFINITION__ENTRIES:
				getEntries().clear();
				return;
			case MarkupdefinitionPackage.MARKUP_DEFINITION__IGNORE_DESCRIPTIONS:
				setIgnoreDescriptions(IGNORE_DESCRIPTIONS_EDEFAULT);
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
			case MarkupdefinitionPackage.MARKUP_DEFINITION__ENTRIES:
				return entries != null && !entries.isEmpty();
			case MarkupdefinitionPackage.MARKUP_DEFINITION__IGNORE_DESCRIPTIONS:
				return ignoreDescriptions != IGNORE_DESCRIPTIONS_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ignoreDescriptions: ");
		result.append(ignoreDescriptions);
		result.append(')');
		return result.toString();
	}

} //MarkupDefinitionImpl
