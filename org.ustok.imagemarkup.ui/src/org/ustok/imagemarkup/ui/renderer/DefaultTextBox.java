/* --------------------------------------------------------------------------
 * @author Ingo Mohr
 * @created Oct 21th 2012
 * --------------------------------------------------------------------------
 */
package org.ustok.imagemarkup.ui.renderer;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;

/**
 * The default implementation of a text box.
 * <p>
 * Text is drawing with alignment CENTER for both horizontal and vertical
 * alignment.
 * </p>
 * 
 * @author Ingo Mohr
 * @created Oct 21th 2012
 */
public class DefaultTextBox extends AbstractTextBox {

	/** transparency enabled/disabled */
	private boolean fUseTransparency = true;

	@Override
	public void draw(GC pGc) {
		final Color oldForeGround = pGc.getForeground();
		final Color oldBackGround = pGc.getBackground();
		final int oldAntiAlias = pGc.getAntialias();
		final int oldAlpha = pGc.getAlpha();
		final int oldLineWidth = pGc.getLineWidth();

		doDraw(pGc);

		pGc.setForeground(oldForeGround);
		pGc.setBackground(oldBackGround);
		pGc.setAntialias(oldAntiAlias);
		pGc.setAlpha(oldAlpha);
		pGc.setLineWidth(oldLineWidth);
	}

	private void doDraw(GC pGc) {
		Color colorRed = new Color(Display.getDefault(), 230, 20, 20);
		Color colorText = new Color(Display.getDefault(), 30, 30, 30);
		Color colorBackground = new Color(Display.getDefault(), 253, 249, 234);
		final int lineWidth = 1;

		pGc.setForeground(colorRed);
		pGc.setBackground(colorBackground);
		pGc.setAntialias(SWT.ON);
		if (isUseTransparency()) {
			pGc.setAlpha(240);
		} else {
			pGc.setAlpha(255);
		}

		Rectangle bounds = getBounds();
		pGc.fillRectangle(bounds);

		pGc.setLineWidth(lineWidth);
		pGc.setAlpha(255);
		pGc.drawRectangle(bounds);

		String text = getText();
		if (text != null) {
			pGc.setForeground(colorText);

			Point xtent = pGc.textExtent(text);
			int textWidth = xtent.x;
			int textHeight = xtent.y;

			int remainingWidth = getBounds().width - textWidth;
			int remainingHeight = getBounds().height - textHeight;

			int xOffset = Math.round(remainingWidth / 2f);
			int yOffset = Math.round(remainingHeight / 2f);

			int x = bounds.x + xOffset;
			int y = bounds.y + yOffset;

			pGc.drawText(text, x, y, true);
		}

		colorRed.dispose();
		colorText.dispose();
		colorBackground.dispose();
	}

	/**
	 * Returns <code>true</code> if transparency is supported.
	 * <p>
	 * Clients can set the flag to <code>false</code> if they don't want to have
	 * markups with transparent backgrounds.
	 * </p>
	 * <p>
	 * Default value is <code>true</code>.
	 * </p>
	 * 
	 * @return the useTransparency.
	 */
	public boolean isUseTransparency() {
		return fUseTransparency;
	}

	/**
	 * Sets whether transparent markup backgrounds are supported.
	 * <p>
	 * Clients can set the flag to <code>false</code> if they don't want to have
	 * markups with transparent backgrounds.
	 * </p>
	 * <p>
	 * Default value is <code>true</code>.
	 * </p>
	 * 
	 * @param pUseTransparency
	 *            the useTransparency to set.
	 */
	public void setUseTransparency(boolean pUseTransparency) {
		fUseTransparency = pUseTransparency;
	}

}
