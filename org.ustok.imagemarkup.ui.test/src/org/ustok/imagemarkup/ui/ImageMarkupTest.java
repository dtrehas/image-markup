/* --------------------------------------------------------------------------
 * @author Ingo Mohr
 * @created Oct 20th 2012
 * --------------------------------------------------------------------------
 */
package org.ustok.imagemarkup.ui;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.graphics.PaletteData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;
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

	/** debug option */
	private static final boolean DEBUG = true;

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

	@Test
	public void testApply() throws IOException {
		Display.getDefault().asyncExec(new Runnable() {

			@Override
			public void run() {
				final RGB defaultMarkupColor = new RGB(230, 20, 20);

				try {
					URL resource = Platform.getBundle(
							"org.ustok.imagemarkup.ui").getResource(
							"res/sampleImg.png");
					InputStream inputStream = resource.openStream();
					Image image = new Image(Display.getDefault(), inputStream);
					inputStream.close();
					assertNotNull(image);

					// check no markup color is not on image test pixel before
					// applying
					// marking
					int pixel = image.getImageData().getPixel(204, 4);
					PaletteData palette = image.getImageData().palette;
					RGB rgb = palette.getRGB(pixel);
					assertFalse(defaultMarkupColor.equals(rgb));

					ImageMarkup markup = new ImageMarkup();
					markup.applyMarkup(image, 204, 4, 254, 55, null);

					// check markup color is on image test pixel after applying
					// marking
					pixel = image.getImageData().getPixel(204, 4);
					palette = image.getImageData().palette;
					rgb = palette.getRGB(pixel);
					assertEquals(defaultMarkupColor, rgb);

					// TODO instead of testing one pixel please test the
					// expected
					// marking
					// completely.

					if (DEBUG) {
						String outputFilePath = "/Users/IMore/Desktop/testWithMarking.png";
						OutputStream outputStream = new BufferedOutputStream(
								new FileOutputStream(outputFilePath));
						ImageLoader loader = new ImageLoader();
						loader.data = new ImageData[] { image.getImageData() };
						loader.save(outputStream, SWT.IMAGE_PNG);
						outputStream.close();
					}
				} catch (IOException ex) {
					fail("Error reading test file: " + ex.getMessage());
				}
			}
		});
	}

}
