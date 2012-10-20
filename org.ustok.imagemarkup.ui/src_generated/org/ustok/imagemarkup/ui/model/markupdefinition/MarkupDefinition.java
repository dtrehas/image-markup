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
 *   <li>{@link org.ustok.imagemarkup.ui.model.markupdefinition.MarkupDefinition#isIgnoreDescriptions <em>Ignore Descriptions</em>}</li>
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
	 * It is bidirectional and its opposite is '{@link org.ustok.imagemarkup.ui.model.markupdefinition.MarkupEntry#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The markup entries that belong to the definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see org.ustok.imagemarkup.ui.model.markupdefinition.MarkupdefinitionPackage#getMarkupDefinition_Entries()
	 * @see org.ustok.imagemarkup.ui.model.markupdefinition.MarkupEntry#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<MarkupEntry> getEntries();

	/**
	 * Returns the value of the '<em><b>Ignore Descriptions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A flag indicating whether to ignore the markup entry descriptions. If TRUE, the descriptions will be skipped and not drawn onto the image.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ignore Descriptions</em>' attribute.
	 * @see #setIgnoreDescriptions(boolean)
	 * @see org.ustok.imagemarkup.ui.model.markupdefinition.MarkupdefinitionPackage#getMarkupDefinition_IgnoreDescriptions()
	 * @model
	 * @generated
	 */
	boolean isIgnoreDescriptions();

	/**
	 * Sets the value of the '{@link org.ustok.imagemarkup.ui.model.markupdefinition.MarkupDefinition#isIgnoreDescriptions <em>Ignore Descriptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Descriptions</em>' attribute.
	 * @see #isIgnoreDescriptions()
	 * @generated
	 */
	void setIgnoreDescriptions(boolean value);

} // MarkupDefinition
