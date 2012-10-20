/**
 * © 2012 www.ustok.org
 */
package org.ustok.imagemarkup.ui.model.markupdefinition;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ustok.imagemarkup.ui.model.markupdefinition.MarkupdefinitionPackage
 * @generated
 */
public interface MarkupdefinitionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MarkupdefinitionFactory eINSTANCE = org.ustok.imagemarkup.ui.model.markupdefinition.impl.MarkupdefinitionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Markup Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Markup Definition</em>'.
	 * @generated
	 */
	MarkupDefinition createMarkupDefinition();

	/**
	 * Returns a new object of class '<em>Markup Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Markup Entry</em>'.
	 * @generated
	 */
	MarkupEntry createMarkupEntry();

	/**
	 * Returns a new object of class '<em>Rectangle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rectangle</em>'.
	 * @generated
	 */
	Rectangle createRectangle();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MarkupdefinitionPackage getMarkupdefinitionPackage();

} //MarkupdefinitionFactory
