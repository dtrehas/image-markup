/* --------------------------------------------------------------------------
 * @author Ingo Mohr
 * @created Oct 20th 2012
 * --------------------------------------------------------------------------
 */
package org.ustok.imagemarkup.ui;

import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.ustok.imagemarkup.ui.model.markupdefinition.MarkupDefinition;
import org.ustok.imagemarkup.ui.model.markupdefinition.MarkupEntry;
import org.ustok.imagemarkup.ui.model.markupdefinition.MarkupdefinitionFactory;
import org.ustok.imagemarkup.ui.model.markupdefinition.Rectangle;
import org.ustok.imagemarkup.ui.renderer.DefaultMarkupRenderer;

/**
 * Image Markup main class.
 * 
 * @author Ingo Mohr
 * @created Oct 20th 2012
 */
public class ImageMarkup {

	/** renderer to use */
	private MarkupRenderer fRenderer;

	/**
	 * Creates a new ImageMarkup with the default renderer.
	 */
	public ImageMarkup() {
		this(new DefaultMarkupRenderer());
	}

	/**
	 * Creates a new ImageMarkup with a certain markup renderer. The renderer
	 * can be replaced using method <code>setRenderer</code>.
	 * 
	 * @param pRenderer
	 *            the renderer to set.
	 */
	public ImageMarkup(MarkupRenderer pRenderer) {
		setRenderer(pRenderer);
	}

	/**
	 * Applies the given markup to the given image.
	 * 
	 * @param pImage
	 *            the image to apply the markup to.
	 * @param pX1
	 *            the x value of the upper/left corner of the marking area.
	 * @param pY1
	 *            the y value of the upper/left corner of the marking area.
	 * @param pX2
	 *            the x value of the lower/right corner of the marking area.
	 * @param pY2
	 *            the y value of the lower/right corner of the marking area.
	 * @param pText
	 *            the description text for the marking area. May be
	 *            <code>null</code>.
	 */
	public synchronized void applyMarkup(Image pImage, int pX1, int pY1,
			int pX2, int pY2, String pText) {
		MarkupDefinition definition = MarkupdefinitionFactory.eINSTANCE
				.createMarkupDefinition();
		definition.setIgnoreDescriptions(false);

		MarkupEntry entry = MarkupdefinitionFactory.eINSTANCE
				.createMarkupEntry();
		definition.getEntries().add(entry);

		Rectangle bounds = MarkupdefinitionFactory.eINSTANCE.createRectangle();
		bounds.setX(pX1);
		bounds.setY(pY1);
		bounds.setWidth(pX2 - pX1);
		bounds.setHeight(pY2 - pY1);
		entry.setMarking(bounds);

		entry.setText(pText);

		applyMarkup(pImage, definition);
	}

	/**
	 * Applies the given markup definition to the given image.
	 * <p>
	 * The markup will be drawn onto the image using the current renderer.
	 * </p>
	 * <p>
	 * This methods does nothing if one of the parameters is <code>null</code>.
	 * </p>
	 * 
	 * @param pImage
	 *            the image to apply the markup to.
	 * @param pMarkup
	 *            the markup to apply to the image.
	 * @return given image.
	 */
	public synchronized Image applyMarkup(Image pImage, MarkupDefinition pMarkup) {
		if (pMarkup != null && pImage != null) {
			MarkupRenderer renderer = getRenderer();
			if (renderer == null) {
				throw new RuntimeException("No renderer is set.");
			}

			GC gc = new GC(pImage);
			renderer.render(pMarkup, pImage, gc);
			if (!gc.isDisposed()) {
				gc.dispose();
			}
		}
		return pImage;
	}

	/**
	 * Returns the renderer to be used to draw the markup onto images.
	 * 
	 * @return the renderer. <code>null</code> if not set.
	 */
	public MarkupRenderer getRenderer() {
		return fRenderer;
	}

	/**
	 * Sets the renderer to be used to draw the markup onto images.
	 * 
	 * @param pRenderer
	 *            the renderer to set.
	 */
	public void setRenderer(MarkupRenderer pRenderer) {
		fRenderer = pRenderer;
	}

}
