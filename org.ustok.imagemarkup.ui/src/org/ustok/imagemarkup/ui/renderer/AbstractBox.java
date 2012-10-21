/* --------------------------------------------------------------------------
 * @author Ingo Mohr
 * @created Oct 21th 2012
 * --------------------------------------------------------------------------
 */
package org.ustok.imagemarkup.ui.renderer;

import org.eclipse.swt.graphics.Rectangle;

/**
 * Base implementation of a box.
 * 
 * @author Ingo Mohr
 * @created Oct 21th 2012
 */
public abstract class AbstractBox implements Box {

	/** bounds */
	private Rectangle fBounds = new Rectangle(0, 0, 0, 0);

	@Override
	public Rectangle getBounds() {
		return fBounds;
	}

	@Override
	public void setBounds(Rectangle pBounds) {
		if (!getBounds().equals(pBounds)) {
			if (pBounds != null) {
				fBounds = pBounds;
			} else {
				fBounds = new Rectangle(0, 0, 0, 0);
			}
		}
	}

}
