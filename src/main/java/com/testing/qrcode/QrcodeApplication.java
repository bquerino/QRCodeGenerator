package com.testing.qrcode;

import java.awt.image.BufferedImage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.BufferedImageHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;

@SpringBootApplication
public class QrcodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(QrcodeApplication.class, args);
	}
	
	//Message converter to send text content/type
	@Bean
	public HttpMessageConverter<BufferedImage> createImageHttpMessageConverter(){
		return new BufferedImageHttpMessageConverter();
	}

}
