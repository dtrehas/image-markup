/**
 * © 2012 www.ustok.org
 */
package org.ustok.imagemarkup.ui.model.markupdefinition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Markup Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A single markup entry with a markup area (marking) and an optional description text to be displayed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ustok.imagemarkup.ui.model.markupdefinition.MarkupEntry#getMarking <em>Marking</em>}</li>
 *   <li>{@link org.ustok.imagemarkup.ui.model.markupdefinition.MarkupEntry#getText <em>Text</em>}</li>
 *   <li>{@link org.ustok.imagemarkup.ui.model.markupdefinition.MarkupEntry#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ustok.imagemarkup.ui.model.markupdefinition.MarkupdefinitionPackage#getMarkupEntry()
 * @model
 * @generated
 */
public interface MarkupEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The marking area.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Marking</em>' containment reference.
	 * @see #setMarking(Rectangle)
	 * @see org.ustok.imagemarkup.ui.model.markupdefinition.MarkupdefinitionPackage#getMarkupEntry_Marking()
	 * @model containment="true"
	 * @generated
	 */
	Rectangle getMarking();

	/**
	 * Sets the value of the '{@link org.ustok.imagemarkup.ui.model.markupdefinition.MarkupEntry#getMarking <em>Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marking</em>' containment reference.
	 * @see #getMarking()
	 * @generated
	 */
	void setMarking(Rectangle value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The description text to draw for the marking.
	 * <!-- end-model-doc -->
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

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.ustok.imagemarkup.ui.model.markupdefinition.MarkupDefinition#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parent definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(MarkupDefinition)
	 * @see org.ustok.imagemarkup.ui.model.markupdefinition.MarkupdefinitionPackage#getMarkupEntry_Parent()
	 * @see org.ustok.imagemarkup.ui.model.markupdefinition.MarkupDefinition#getEntries
	 * @model opposite="entries" transient="false"
	 * @generated
	 */
	MarkupDefinition getParent();

	/**
	 * Sets the value of the '{@link org.ustok.imagemarkup.ui.model.markupdefinition.MarkupEntry#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(MarkupDefinition value);

} // MarkupEntry
