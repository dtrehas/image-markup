/**
 * © 2012 www.ustok.org
 */
package org.ustok.imagemarkup.ui.model.markupdefinition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.ustok.imagemarkup.ui.model.markupdefinition.MarkupdefinitionFactory
 * @model kind="package"
 * @generated
 */
public interface MarkupdefinitionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "markupdefinition";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ustok.org/imagemarkup/ui/markupdefinition";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "markupdefinition";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MarkupdefinitionPackage eINSTANCE = org.ustok.imagemarkup.ui.model.markupdefinition.impl.MarkupdefinitionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.ustok.imagemarkup.ui.model.markupdefinition.impl.MarkupDefinitionImpl <em>Markup Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ustok.imagemarkup.ui.model.markupdefinition.impl.MarkupDefinitionImpl
	 * @see org.ustok.imagemarkup.ui.model.markupdefinition.impl.MarkupdefinitionPackageImpl#getMarkupDefinition()
	 * @generated
	 */
	int MARKUP_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_DEFINITION__ENTRIES = 0;

	/**
	 * The feature id for the '<em><b>Ignore Descriptions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_DEFINITION__IGNORE_DESCRIPTIONS = 1;

	/**
	 * The number of structural features of the '<em>Markup Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.ustok.imagemarkup.ui.model.markupdefinition.impl.MarkupEntryImpl <em>Markup Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ustok.imagemarkup.ui.model.markupdefinition.impl.MarkupEntryImpl
	 * @see org.ustok.imagemarkup.ui.model.markupdefinition.impl.MarkupdefinitionPackageImpl#getMarkupEntry()
	 * @generated
	 */
	int MARKUP_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_ENTRY__MARKING = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_ENTRY__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_ENTRY__PARENT = 2;

	/**
	 * The number of structural features of the '<em>Markup Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_ENTRY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.ustok.imagemarkup.ui.model.markupdefinition.impl.RectangleImpl <em>Rectangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ustok.imagemarkup.ui.model.markupdefinition.impl.RectangleImpl
	 * @see org.ustok.imagemarkup.ui.model.markupdefinition.impl.MarkupdefinitionPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__Y = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__HEIGHT = 3;

	/**
	 * The number of structural features of the '<em>Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link org.ustok.imagemarkup.ui.model.markupdefinition.MarkupDefinition <em>Markup Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Markup Definition</em>'.
	 * @see org.ustok.imagemarkup.ui.model.markupdefinition.MarkupDefinition
	 * @generated
	 */
	EClass getMarkupDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ustok.imagemarkup.ui.model.markupdefinition.MarkupDefinition#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.ustok.imagemarkup.ui.model.markupdefinition.MarkupDefinition#getEntries()
	 * @see #getMarkupDefinition()
	 * @generated
	 */
	EReference getMarkupDefinition_Entries();

	/**
	 * Returns the meta object for the attribute '{@link org.ustok.imagemarkup.ui.model.markupdefinition.MarkupDefinition#isIgnoreDescriptions <em>Ignore Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Descriptions</em>'.
	 * @see org.ustok.imagemarkup.ui.model.markupdefinition.MarkupDefinition#isIgnoreDescriptions()
	 * @see #getMarkupDefinition()
	 * @generated
	 */
	EAttribute getMarkupDefinition_IgnoreDescriptions();

	/**
	 * Returns the meta object for class '{@link org.ustok.imagemarkup.ui.model.markupdefinition.MarkupEntry <em>Markup Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Markup Entry</em>'.
	 * @see org.ustok.imagemarkup.ui.model.markupdefinition.MarkupEntry
	 * @generated
	 */
	EClass getMarkupEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.ustok.imagemarkup.ui.model.markupdefinition.MarkupEntry#getMarking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Marking</em>'.
	 * @see org.ustok.imagemarkup.ui.model.markupdefinition.MarkupEntry#getMarking()
	 * @see #getMarkupEntry()
	 * @generated
	 */
	EReference getMarkupEntry_Marking();

	/**
	 * Returns the meta object for the attribute '{@link org.ustok.imagemarkup.ui.model.markupdefinition.MarkupEntry#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.ustok.imagemarkup.ui.model.markupdefinition.MarkupEntry#getText()
	 * @see #getMarkupEntry()
	 * @generated
	 */
	EAttribute getMarkupEntry_Text();

	/**
	 * Returns the meta object for the container reference '{@link org.ustok.imagemarkup.ui.model.markupdefinition.MarkupEntry#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.ustok.imagemarkup.ui.model.markupdefinition.MarkupEntry#getParent()
	 * @see #getMarkupEntry()
	 * @generated
	 */
	EReference getMarkupEntry_Parent();

	/**
	 * Returns the meta object for class '{@link org.ustok.imagemarkup.ui.model.markupdefinition.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangle</em>'.
	 * @see org.ustok.imagemarkup.ui.model.markupdefinition.Rectangle
	 * @generated
	 */
	EClass getRectangle();

	/**
	 * Returns the meta object for the attribute '{@link org.ustok.imagemarkup.ui.model.markupdefinition.Rectangle#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.ustok.imagemarkup.ui.model.markupdefinition.Rectangle#getX()
	 * @see #getRectangle()
	 * @generated
	 */
	EAttribute getRectangle_X();

	/**
	 * Returns the meta object for the attribute '{@link org.ustok.imagemarkup.ui.model.markupdefinition.Rectangle#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.ustok.imagemarkup.ui.model.markupdefinition.Rectangle#getY()
	 * @see #getRectangle()
	 * @generated
	 */
	EAttribute getRectangle_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.ustok.imagemarkup.ui.model.markupdefinition.Rectangle#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.ustok.imagemarkup.ui.model.markupdefinition.Rectangle#getWidth()
	 * @see #getRectangle()
	 * @generated
	 */
	EAttribute getRectangle_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.ustok.imagemarkup.ui.model.markupdefinition.Rectangle#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.ustok.imagemarkup.ui.model.markupdefinition.Rectangle#getHeight()
	 * @see #getRectangle()
	 * @generated
	 */
	EAttribute getRectangle_Height();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MarkupdefinitionFactory getMarkupdefinitionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.ustok.imagemarkup.ui.model.markupdefinition.impl.MarkupDefinitionImpl <em>Markup Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ustok.imagemarkup.ui.model.markupdefinition.impl.MarkupDefinitionImpl
		 * @see org.ustok.imagemarkup.ui.model.markupdefinition.impl.MarkupdefinitionPackageImpl#getMarkupDefinition()
		 * @generated
		 */
		EClass MARKUP_DEFINITION = eINSTANCE.getMarkupDefinition();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKUP_DEFINITION__ENTRIES = eINSTANCE.getMarkupDefinition_Entries();

		/**
		 * The meta object literal for the '<em><b>Ignore Descriptions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKUP_DEFINITION__IGNORE_DESCRIPTIONS = eINSTANCE.getMarkupDefinition_IgnoreDescriptions();

		/**
		 * The meta object literal for the '{@link org.ustok.imagemarkup.ui.model.markupdefinition.impl.MarkupEntryImpl <em>Markup Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ustok.imagemarkup.ui.model.markupdefinition.impl.MarkupEntryImpl
		 * @see org.ustok.imagemarkup.ui.model.markupdefinition.impl.MarkupdefinitionPackageImpl#getMarkupEntry()
		 * @generated
		 */
		EClass MARKUP_ENTRY = eINSTANCE.getMarkupEntry();

		/**
		 * The meta object literal for the '<em><b>Marking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKUP_ENTRY__MARKING = eINSTANCE.getMarkupEntry_Marking();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKUP_ENTRY__TEXT = eINSTANCE.getMarkupEntry_Text();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKUP_ENTRY__PARENT = eINSTANCE.getMarkupEntry_Parent();

		/**
		 * The meta object literal for the '{@link org.ustok.imagemarkup.ui.model.markupdefinition.impl.RectangleImpl <em>Rectangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ustok.imagemarkup.ui.model.markupdefinition.impl.RectangleImpl
		 * @see org.ustok.imagemarkup.ui.model.markupdefinition.impl.MarkupdefinitionPackageImpl#getRectangle()
		 * @generated
		 */
		EClass RECTANGLE = eINSTANCE.getRectangle();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE__X = eINSTANCE.getRectangle_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE__Y = eINSTANCE.getRectangle_Y();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE__WIDTH = eINSTANCE.getRectangle_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE__HEIGHT = eINSTANCE.getRectangle_Height();

	}

} //MarkupdefinitionPackage
