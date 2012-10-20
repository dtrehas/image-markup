/* --------------------------------------------------------------------------
 * @author Ingo Mohr
 * @created Oct 20th 2012
 * --------------------------------------------------------------------------
 */
package org.ustok.imagemarkup.ui.renderer;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.ustok.imagemarkup.ui.MarkupRenderer;
import org.ustok.imagemarkup.ui.model.markupdefinition.MarkupDefinition;
import org.ustok.imagemarkup.ui.model.markupdefinition.MarkupEntry;
import org.ustok.imagemarkup.ui.renderer.util.RectangleAdapter;

/**
 * Default markup renderer implementation.
 * 
 * @author Ingo Mohr
 * @created Oct 20th 2012
 */
public class DefaultMarkupRenderer implements MarkupRenderer {

	@Override
	public void render(MarkupDefinition pMarkup, Image pImage, GC pGc) {
		final int imgWidth = pImage.getBounds().width;
		final int imgHeight = pImage.getBounds().height;

		Color colorRed = new Color(Display.getDefault(), 230, 20, 20);
		Color colorBackground = new Color(Display.getDefault(), 253, 249, 234);
		final int lineWidth = 2;

		pGc.setForeground(colorRed);
		pGc.setBackground(colorBackground);
		pGc.setLineWidth(lineWidth);
		pGc.setAntialias(SWT.ON);

		for (MarkupEntry entry : pMarkup.getEntries()) {
			Rectangle rect = RectangleAdapter.adaptRect(entry.getMarking());
			pGc.drawRectangle(rect);

			if (!pMarkup.isIgnoreDescriptions()) {

			}
		}

		colorRed.dispose();
	}

}
