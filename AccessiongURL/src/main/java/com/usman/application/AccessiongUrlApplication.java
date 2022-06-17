package com.usman.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = com.usman.controller.RedirectController.class )
public class AccessiongUrlApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccessiongUrlApplication.class, args);
	}

}
