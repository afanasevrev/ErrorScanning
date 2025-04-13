package com.example.ErrorScanning;

import com.example.ErrorScanning.db.VulnerabilityService;
import com.example.ErrorScanning.db.VulnerabilityServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ErrorScanningApplication {
	@Bean
	VulnerabilityService vulnerabilityService() {
		return new VulnerabilityServiceImpl();
	}
	public static void main(String[] args) {
		SpringApplication.run(ErrorScanningApplication.class, args);
	}
}
