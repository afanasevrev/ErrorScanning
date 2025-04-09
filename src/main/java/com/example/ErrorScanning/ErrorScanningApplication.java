package com.example.ErrorScanning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class ErrorScanningApplication {
	public static void main(String[] args) {
		SpringApplication.run(ErrorScanningApplication.class, args);
	}
}
