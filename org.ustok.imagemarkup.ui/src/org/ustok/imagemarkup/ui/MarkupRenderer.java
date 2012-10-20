/* --------------------------------------------------------------------------
 * @author Ingo Mohr
 * @created Oct 20th 2012
 * --------------------------------------------------------------------------
 */
package org.ustok.imagemarkup.ui;

import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.ustok.imagemarkup.ui.model.markupdefinition.MarkupDefinition;

/**
 * A MarkupRenderer is used to draw markup definitions entries.
 * 
 * @author Ingo Mohr
 * @created Oct 20th 2012
 */
public interface MarkupRenderer {

	/**
	 * Renders the given markup according to the given definition to the given
	 * image.
	 * 
	 * @param pMarkup
	 *            the markup definition model.
	 * @param pImage
	 *            the image to draw on.
	 * @param pGc
	 *            the graphics context to use.
	 */
	public void render(MarkupDefinition pMarkup, Image pImage, GC pGc);

}
