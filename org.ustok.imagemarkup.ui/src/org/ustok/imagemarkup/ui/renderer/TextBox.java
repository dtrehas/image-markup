/* --------------------------------------------------------------------------
 * @author Ingo Mohr
 * @created Oct 21th 2012
 * --------------------------------------------------------------------------
 */
package org.ustok.imagemarkup.ui.renderer;


/**
 * A text box to visualize descriptive text for a markup entry.
 * 
 * @author Ingo Mohr
 * @created Oct 21th 2012
 */
public interface TextBox extends Box {

	/**
	 * Returns the text.
	 * 
	 * @return the text to draw.
	 */
	public String getText();

	/**
	 * Sets the text to draw.
	 * 
	 * @param pText
	 *            the text to draw.
	 */
	public void setText(String pText);

}
