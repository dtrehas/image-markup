/* --------------------------------------------------------------------------
 * @author Ingo Mohr
 * @created Oct 20th 2012
 * --------------------------------------------------------------------------
 */
package org.ustok.imagemarkup.ui.renderer.util;

import org.eclipse.swt.graphics.Rectangle;

/**
 * Adapter for ImageMarking rectangles.
 * 
 * @author Ingo Mohr
 * @created Oct 20th 2012
 */
public final class RectangleAdapter {

	/**
	 * Hidden constructor.
	 */
	private RectangleAdapter() {
	}

	/**
	 * Adapts the given Image Marking rectangle to an SWT rectangle.
	 * 
	 * @param pRect
	 *            the rectangle to adapt.
	 * @return adaption - or <code>null</code> if parameter was
	 *         <code>null</code>.
	 */
	public static Rectangle adaptRect(
			org.ustok.imagemarkup.ui.model.markupdefinition.Rectangle pRect) {
		if (pRect != null) {
			int x = pRect.getX();
			int y = pRect.getY();
			int width = pRect.getWidth();
			int height = pRect.getHeight();

			Rectangle rect = new Rectangle(x, y, width, height);
			return rect;
		}
		return null;
	}

}
