/**
 * © 2012 www.ustok.org
 */
package org.ustok.imagemarkup.ui.model.markupdefinition.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ustok.imagemarkup.ui.model.markupdefinition.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MarkupdefinitionFactoryImpl extends EFactoryImpl implements MarkupdefinitionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MarkupdefinitionFactory init() {
		try {
			MarkupdefinitionFactory theMarkupdefinitionFactory = (MarkupdefinitionFactory)EPackage.Registry.INSTANCE.getEFactory("ustok.org/imagemarkup/ui/markupdefinition"); 
			if (theMarkupdefinitionFactory != null) {
				return theMarkupdefinitionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MarkupdefinitionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkupdefinitionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MarkupdefinitionPackage.MARKUP_DEFINITION: return createMarkupDefinition();
			case MarkupdefinitionPackage.MARKUP_ENTRY: return createMarkupEntry();
			case MarkupdefinitionPackage.RECTANGLE: return createRectangle();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkupDefinition createMarkupDefinition() {
		MarkupDefinitionImpl markupDefinition = new MarkupDefinitionImpl();
		return markupDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkupEntry createMarkupEntry() {
		MarkupEntryImpl markupEntry = new MarkupEntryImpl();
		return markupEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rectangle createRectangle() {
		RectangleImpl rectangle = new RectangleImpl();
		return rectangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkupdefinitionPackage getMarkupdefinitionPackage() {
		return (MarkupdefinitionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MarkupdefinitionPackage getPackage() {
		return MarkupdefinitionPackage.eINSTANCE;
	}

} //MarkupdefinitionFactoryImpl
