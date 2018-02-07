package com.shanyuan.platform.ms.base.common.util;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageBase64 {

	public static String putImage(BufferedImage image) throws IOException {
		// Image->bufferreImage
		Graphics g = image.createGraphics();
		g.drawImage(image, 0, 0, null);
		g.dispose();

		// bufferImage->base64
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		ImageIO.write(image, "jpg", outputStream);
		sun.misc.BASE64Encoder encoder = new sun.misc.BASE64Encoder();
		String base64Img = encoder.encode(outputStream.toByteArray());
		return base64Img;
	}

}
