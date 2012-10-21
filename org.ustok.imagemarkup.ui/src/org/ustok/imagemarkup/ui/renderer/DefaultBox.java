/* --------------------------------------------------------------------------
 * @author Ingo Mohr
 * @created Oct 21th 2012
 * --------------------------------------------------------------------------
 */
package org.ustok.imagemarkup.ui.renderer;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;

/**
 * Default implementation of a box.
 * 
 * @author Ingo Mohr
 * @created Oct 21th 2012
 */
public class DefaultBox extends AbstractBox {

	@Override
	public void draw(GC pGc) {
		final Color oldForeGround = pGc.getForeground();
		final int oldLineWidth = pGc.getLineWidth();
		final int oldAlias = pGc.getAntialias();

		Color colorRed = new Color(Display.getDefault(), 230, 20, 20);
		final int lineWidth = 2;

		pGc.setForeground(colorRed);
		pGc.setLineWidth(lineWidth);
		pGc.setAntialias(SWT.ON);

		Rectangle bounds = getBounds();
		pGc.drawRectangle(bounds);

		colorRed.dispose();

		pGc.setForeground(oldForeGround);
		pGc.setLineWidth(oldLineWidth);
		pGc.setAntialias(oldAlias);
	}

}
