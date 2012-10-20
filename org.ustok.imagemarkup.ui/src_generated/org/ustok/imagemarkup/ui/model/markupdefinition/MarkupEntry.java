/**
 * © 2012 www.ustok.org
 */
package org.ustok.imagemarkup.ui.model.markupdefinition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Markup Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A single markup entry with a number of markup areas (markings) and an optional description text to be displayed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ustok.imagemarkup.ui.model.markupdefinition.MarkupEntry#getMarkings <em>Markings</em>}</li>
 *   <li>{@link org.ustok.imagemarkup.ui.model.markupdefinition.MarkupEntry#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ustok.imagemarkup.ui.model.markupdefinition.MarkupdefinitionPackage#getMarkupEntry()
 * @model
 * @generated
 */
public interface MarkupEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Markings</b></em>' containment reference list.
	 * The list contents are of type {@link org.ustok.imagemarkup.ui.model.markupdefinition.Rectangle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Markings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Markings</em>' containment reference list.
	 * @see org.ustok.imagemarkup.ui.model.markupdefinition.MarkupdefinitionPackage#getMarkupEntry_Markings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rectangle> getMarkings();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.ustok.imagemarkup.ui.model.markupdefinition.MarkupdefinitionPackage#getMarkupEntry_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.ustok.imagemarkup.ui.model.markupdefinition.MarkupEntry#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // MarkupEntry
