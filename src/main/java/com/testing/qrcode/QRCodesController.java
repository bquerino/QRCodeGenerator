package com.testing.qrcode;

import java.awt.image.BufferedImage;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class QRCodesController {
	
	@PostMapping(value="/qrcodes", produces= MediaType.IMAGE_PNG_VALUE)
	public ResponseEntity<BufferedImage> zxingQRCode(@RequestBody String barcode) throws Exception{
		return okResponse(QRCodeGenerator.generateQRCodeImage(barcode));
	}
	
	private ResponseEntity<BufferedImage> okResponse(BufferedImage image){
		return new ResponseEntity<>(image, HttpStatus.OK);
	}

}