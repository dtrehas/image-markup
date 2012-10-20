/* --------------------------------------------------------------------------
 * @author Ingo Mohr
 * @created Oct 20th 2012
 * --------------------------------------------------------------------------
 */
package org.ustok.imagemarkup.ui;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.junit.Test;
import org.ustok.imagemarkup.ui.model.markupdefinition.MarkupDefinition;
import org.ustok.imagemarkup.ui.renderer.DefaultMarkupRenderer;

/**
 * Test for {@link ImageMarkup}.
 * 
 * @author Ingo Mohr
 * @created Oct 20th 2012
 */
public class ImageMarkupTest {

	@Test
	public void testConstructor() {
		ImageMarkup markup = new ImageMarkup();
		assertTrue(markup.getRenderer() instanceof DefaultMarkupRenderer);

		markup = new ImageMarkup(null);
		assertEquals(null, markup.getRenderer());

		MarkupRenderer myRenderer = new MarkupRenderer() {
			@Override
			public void render(MarkupDefinition pMarkup, Image pImage, GC pGc) {
			}
		};
		markup = new ImageMarkup(myRenderer);
		assertSame(myRenderer, markup.getRenderer());
	}

}
