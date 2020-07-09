package com.testing.qrcode;

import java.awt.image.BufferedImage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class QRCodeGenerator {
	
	
	/**
	 * This method is the core of QRCode generator, in this example i sets a 200x200 format.
	 * @param qrcodeText
	 * @return Quick response code rendered with MatrixToImageWriter.
	 * @throws Exception
	 */
	public static BufferedImage generateQRCodeImage(String qrcodeText) throws Exception{
		
		QRCodeWriter barcodeWriter = new QRCodeWriter();
		BitMatrix bitMatrix = barcodeWriter.encode(qrcodeText, BarcodeFormat.QR_CODE, 200, 200); //Image formats 200x200
		
		return MatrixToImageWriter.toBufferedImage(bitMatrix);
	}

}