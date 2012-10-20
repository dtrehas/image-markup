/**
 * © 2012 www.ustok.org
 */
package org.ustok.imagemarkup.ui.model.markupdefinition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rectangle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A rectangle defined by an uppper left location, width and height.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ustok.imagemarkup.ui.model.markupdefinition.Rectangle#getX <em>X</em>}</li>
 *   <li>{@link org.ustok.imagemarkup.ui.model.markupdefinition.Rectangle#getY <em>Y</em>}</li>
 *   <li>{@link org.ustok.imagemarkup.ui.model.markupdefinition.Rectangle#getWidth <em>Width</em>}</li>
 *   <li>{@link org.ustok.imagemarkup.ui.model.markupdefinition.Rectangle#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ustok.imagemarkup.ui.model.markupdefinition.MarkupdefinitionPackage#getRectangle()
 * @model
 * @generated
 */
public interface Rectangle extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The x value of the upper left point that describes the location of the rectangle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(int)
	 * @see org.ustok.imagemarkup.ui.model.markupdefinition.MarkupdefinitionPackage#getRectangle_X()
	 * @model
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link org.ustok.imagemarkup.ui.model.markupdefinition.Rectangle#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The y value of the upper left point that describes the location of the rectangle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(int)
	 * @see org.ustok.imagemarkup.ui.model.markupdefinition.MarkupdefinitionPackage#getRectangle_Y()
	 * @model
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link org.ustok.imagemarkup.ui.model.markupdefinition.Rectangle#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The width of the rectangle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see org.ustok.imagemarkup.ui.model.markupdefinition.MarkupdefinitionPackage#getRectangle_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link org.ustok.imagemarkup.ui.model.markupdefinition.Rectangle#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The height of the rectangle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see org.ustok.imagemarkup.ui.model.markupdefinition.MarkupdefinitionPackage#getRectangle_Height()
	 * @model
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link org.ustok.imagemarkup.ui.model.markupdefinition.Rectangle#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

} // Rectangle
