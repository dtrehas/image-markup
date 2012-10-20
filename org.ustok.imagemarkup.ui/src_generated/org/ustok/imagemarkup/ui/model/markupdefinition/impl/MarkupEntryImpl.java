/**
 * © 2012 www.ustok.org
 */
package org.ustok.imagemarkup.ui.model.markupdefinition.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.ustok.imagemarkup.ui.model.markupdefinition.MarkupDefinition;
import org.ustok.imagemarkup.ui.model.markupdefinition.MarkupEntry;
import org.ustok.imagemarkup.ui.model.markupdefinition.MarkupdefinitionPackage;
import org.ustok.imagemarkup.ui.model.markupdefinition.Rectangle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Markup Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ustok.imagemarkup.ui.model.markupdefinition.impl.MarkupEntryImpl#getMarking <em>Marking</em>}</li>
 *   <li>{@link org.ustok.imagemarkup.ui.model.markupdefinition.impl.MarkupEntryImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.ustok.imagemarkup.ui.model.markupdefinition.impl.MarkupEntryImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MarkupEntryImpl extends EObjectImpl implements MarkupEntry {
	/**
	 * The cached value of the '{@link #getMarking() <em>Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarking()
	 * @generated
	 * @ordered
	 */
	protected Rectangle marking;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarkupEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkupdefinitionPackage.Literals.MARKUP_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rectangle getMarking() {
		return marking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMarking(Rectangle newMarking, NotificationChain msgs) {
		Rectangle oldMarking = marking;
		marking = newMarking;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarkupdefinitionPackage.MARKUP_ENTRY__MARKING, oldMarking, newMarking);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarking(Rectangle newMarking) {
		if (newMarking != marking) {
			NotificationChain msgs = null;
			if (marking != null)
				msgs = ((InternalEObject)marking).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MarkupdefinitionPackage.MARKUP_ENTRY__MARKING, null, msgs);
			if (newMarking != null)
				msgs = ((InternalEObject)newMarking).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MarkupdefinitionPackage.MARKUP_ENTRY__MARKING, null, msgs);
			msgs = basicSetMarking(newMarking, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarkupdefinitionPackage.MARKUP_ENTRY__MARKING, newMarking, newMarking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarkupdefinitionPackage.MARKUP_ENTRY__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkupDefinition getParent() {
		if (eContainerFeatureID() != MarkupdefinitionPackage.MARKUP_ENTRY__PARENT) return null;
		return (MarkupDefinition)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(MarkupDefinition newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, MarkupdefinitionPackage.MARKUP_ENTRY__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(MarkupDefinition newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != MarkupdefinitionPackage.MARKUP_ENTRY__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, MarkupdefinitionPackage.MARKUP_DEFINITION__ENTRIES, MarkupDefinition.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarkupdefinitionPackage.MARKUP_ENTRY__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarkupdefinitionPackage.MARKUP_ENTRY__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((MarkupDefinition)otherEnd, msgs);
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
			case MarkupdefinitionPackage.MARKUP_ENTRY__MARKING:
				return basicSetMarking(null, msgs);
			case MarkupdefinitionPackage.MARKUP_ENTRY__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MarkupdefinitionPackage.MARKUP_ENTRY__PARENT:
				return eInternalContainer().eInverseRemove(this, MarkupdefinitionPackage.MARKUP_DEFINITION__ENTRIES, MarkupDefinition.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MarkupdefinitionPackage.MARKUP_ENTRY__MARKING:
				return getMarking();
			case MarkupdefinitionPackage.MARKUP_ENTRY__TEXT:
				return getText();
			case MarkupdefinitionPackage.MARKUP_ENTRY__PARENT:
				return getParent();
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
			case MarkupdefinitionPackage.MARKUP_ENTRY__MARKING:
				setMarking((Rectangle)newValue);
				return;
			case MarkupdefinitionPackage.MARKUP_ENTRY__TEXT:
				setText((String)newValue);
				return;
			case MarkupdefinitionPackage.MARKUP_ENTRY__PARENT:
				setParent((MarkupDefinition)newValue);
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
			case MarkupdefinitionPackage.MARKUP_ENTRY__MARKING:
				setMarking((Rectangle)null);
				return;
			case MarkupdefinitionPackage.MARKUP_ENTRY__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case MarkupdefinitionPackage.MARKUP_ENTRY__PARENT:
				setParent((MarkupDefinition)null);
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
			case MarkupdefinitionPackage.MARKUP_ENTRY__MARKING:
				return marking != null;
			case MarkupdefinitionPackage.MARKUP_ENTRY__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case MarkupdefinitionPackage.MARKUP_ENTRY__PARENT:
				return getParent() != null;
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
		result.append(" (text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //MarkupEntryImpl
