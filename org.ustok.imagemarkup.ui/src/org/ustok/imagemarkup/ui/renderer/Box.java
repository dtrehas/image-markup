/* --------------------------------------------------------------------------
 * @author Ingo Mohr
 * @created Oct 21th 2012
 * --------------------------------------------------------------------------
 */
package org.ustok.imagemarkup.ui.renderer;

import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;

/**
 * A box with a rectangular boundary.
 * 
 * @author Ingo Mohr
 * @created Oct 21th 2012
 */
public interface Box {

	/**
	 * Draws the box using the given graphics context.
	 * 
	 * @param pGc
	 *            the graphics context to use. If invoked by
	 *            {@link DefaultMarkupRenderer}, the GC will be disposed by the
	 *            renderer.
	 */
	public void draw(GC pGc);

	/**
	 * Returns the boundaries of the box.
	 * 
	 * @return boundaries.
	 */
	public Rectangle getBounds();

	/**
	 * Sets the boundaries of the box.
	 * 
	 * @param pBounds
	 *            the boundaries to set.
	 */
	public void setBounds(Rectangle pBounds);

}
