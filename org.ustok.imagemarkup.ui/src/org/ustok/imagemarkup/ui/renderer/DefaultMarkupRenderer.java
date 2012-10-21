/* --------------------------------------------------------------------------
 * @author Ingo Mohr
 * @created Oct 20th 2012
 * --------------------------------------------------------------------------
 */
package org.ustok.imagemarkup.ui.renderer;

import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.ustok.imagemarkup.ui.MarkupRenderer;
import org.ustok.imagemarkup.ui.model.markupdefinition.MarkupDefinition;
import org.ustok.imagemarkup.ui.model.markupdefinition.MarkupEntry;
import org.ustok.imagemarkup.ui.util.RectangleAdapter;

/**
 * Default markup renderer implementation.
 * 
 * @author Ingo Mohr
 * @created Oct 20th 2012
 */
public class DefaultMarkupRenderer implements MarkupRenderer {

	/** transparency enabled/disabled */
	private boolean fUseTransparency = true;

	@Override
	public void render(MarkupDefinition pMarkup, Image pImage, GC pGc) {

		boolean useTransparency = isUseTransparency();

		for (MarkupEntry entry : pMarkup.getEntries()) {
			Rectangle rect = RectangleAdapter.adaptRect(entry.getMarking());

			Box box;
			if (entry.getText() != null) {
				DefaultTextBox textBox = new DefaultTextBox();
				textBox.setBounds(rect);
				textBox.setUseTransparency(useTransparency);
				textBox.setText(entry.getText());
				box = textBox;
			} else {
				box = new DefaultBox();
				box.setBounds(rect);
			}

			box.draw(pGc);
		}
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
