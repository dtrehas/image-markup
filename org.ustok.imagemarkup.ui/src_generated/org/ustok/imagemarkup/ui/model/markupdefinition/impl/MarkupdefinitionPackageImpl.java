/**
 * © 2012 www.ustok.org
 */
package org.ustok.imagemarkup.ui.model.markupdefinition.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ustok.imagemarkup.ui.model.markupdefinition.MarkupDefinition;
import org.ustok.imagemarkup.ui.model.markupdefinition.MarkupEntry;
import org.ustok.imagemarkup.ui.model.markupdefinition.MarkupdefinitionFactory;
import org.ustok.imagemarkup.ui.model.markupdefinition.MarkupdefinitionPackage;
import org.ustok.imagemarkup.ui.model.markupdefinition.Rectangle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MarkupdefinitionPackageImpl extends EPackageImpl implements MarkupdefinitionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markupDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markupEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectangleEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.ustok.imagemarkup.ui.model.markupdefinition.MarkupdefinitionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MarkupdefinitionPackageImpl() {
		super(eNS_URI, MarkupdefinitionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MarkupdefinitionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MarkupdefinitionPackage init() {
		if (isInited) return (MarkupdefinitionPackage)EPackage.Registry.INSTANCE.getEPackage(MarkupdefinitionPackage.eNS_URI);

		// Obtain or create and register package
		MarkupdefinitionPackageImpl theMarkupdefinitionPackage = (MarkupdefinitionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MarkupdefinitionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MarkupdefinitionPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMarkupdefinitionPackage.createPackageContents();

		// Initialize created meta-data
		theMarkupdefinitionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMarkupdefinitionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MarkupdefinitionPackage.eNS_URI, theMarkupdefinitionPackage);
		return theMarkupdefinitionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarkupDefinition() {
		return markupDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMarkupDefinition_Entries() {
		return (EReference)markupDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarkupDefinition_IgnoreDescriptions() {
		return (EAttribute)markupDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarkupEntry() {
		return markupEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMarkupEntry_Marking() {
		return (EReference)markupEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarkupEntry_Text() {
		return (EAttribute)markupEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMarkupEntry_Parent() {
		return (EReference)markupEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRectangle() {
		return rectangleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangle_X() {
		return (EAttribute)rectangleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangle_Y() {
		return (EAttribute)rectangleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangle_Width() {
		return (EAttribute)rectangleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangle_Height() {
		return (EAttribute)rectangleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkupdefinitionFactory getMarkupdefinitionFactory() {
		return (MarkupdefinitionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		markupDefinitionEClass = createEClass(MARKUP_DEFINITION);
		createEReference(markupDefinitionEClass, MARKUP_DEFINITION__ENTRIES);
		createEAttribute(markupDefinitionEClass, MARKUP_DEFINITION__IGNORE_DESCRIPTIONS);

		markupEntryEClass = createEClass(MARKUP_ENTRY);
		createEReference(markupEntryEClass, MARKUP_ENTRY__MARKING);
		createEAttribute(markupEntryEClass, MARKUP_ENTRY__TEXT);
		createEReference(markupEntryEClass, MARKUP_ENTRY__PARENT);

		rectangleEClass = createEClass(RECTANGLE);
		createEAttribute(rectangleEClass, RECTANGLE__X);
		createEAttribute(rectangleEClass, RECTANGLE__Y);
		createEAttribute(rectangleEClass, RECTANGLE__WIDTH);
		createEAttribute(rectangleEClass, RECTANGLE__HEIGHT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(markupDefinitionEClass, MarkupDefinition.class, "MarkupDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarkupDefinition_Entries(), this.getMarkupEntry(), this.getMarkupEntry_Parent(), "entries", null, 0, -1, MarkupDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarkupDefinition_IgnoreDescriptions(), ecorePackage.getEBoolean(), "ignoreDescriptions", null, 0, 1, MarkupDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markupEntryEClass, MarkupEntry.class, "MarkupEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarkupEntry_Marking(), this.getRectangle(), null, "marking", null, 0, 1, MarkupEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarkupEntry_Text(), ecorePackage.getEString(), "text", null, 0, 1, MarkupEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMarkupEntry_Parent(), this.getMarkupDefinition(), this.getMarkupDefinition_Entries(), "parent", null, 0, 1, MarkupEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rectangleEClass, Rectangle.class, "Rectangle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRectangle_X(), ecorePackage.getEInt(), "x", null, 0, 1, Rectangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangle_Y(), ecorePackage.getEInt(), "y", null, 0, 1, Rectangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangle_Width(), ecorePackage.getEInt(), "width", null, 0, 1, Rectangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangle_Height(), ecorePackage.getEInt(), "height", null, 0, 1, Rectangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MarkupdefinitionPackageImpl
