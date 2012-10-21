/* --------------------------------------------------------------------------
 * @author Ingo Mohr
 * @created Oct 21th 2012
 * --------------------------------------------------------------------------
 */
package org.ustok.imagemarkup.ui.renderer;


/**
 * Base implementation of a text box.
 * 
 * @author Ingo Mohr
 * @created Oct 21th 2012
 */
public abstract class AbstractTextBox extends AbstractBox implements TextBox {

	/** text */
	private String fText;

	@Override
	public String getText() {
		return fText;
	}

	@Override
	public void setText(String pText) {
		fText = pText;
	}

}
