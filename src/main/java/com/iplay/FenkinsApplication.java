package com.iplay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(initializers = ConfigFileApplicationContextInitializer.class)
@SpringBootApplication
public class FenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FenkinsApplication.class, args);
	}
}
