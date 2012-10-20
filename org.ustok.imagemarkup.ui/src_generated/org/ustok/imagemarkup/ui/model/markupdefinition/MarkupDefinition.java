/**
 * © 2012 www.ustok.org
 */
package org.ustok.imagemarkup.ui.model.markupdefinition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Markup Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A complete markup definition to be used to add markups to an image.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ustok.imagemarkup.ui.model.markupdefinition.MarkupDefinition#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ustok.imagemarkup.ui.model.markupdefinition.MarkupdefinitionPackage#getMarkupDefinition()
 * @model
 * @generated
 */
public interface MarkupDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link org.ustok.imagemarkup.ui.model.markupdefinition.MarkupEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The markup entries that belong to the definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see org.ustok.imagemarkup.ui.model.markupdefinition.MarkupdefinitionPackage#getMarkupDefinition_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<MarkupEntry> getEntries();

} // MarkupDefinition
