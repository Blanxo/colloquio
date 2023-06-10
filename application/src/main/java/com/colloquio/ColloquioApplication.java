package com.colloquio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication(scanBasePackages = "com.colloquio")
@EnableAutoConfiguration(exclude = { ErrorMvcAutoConfiguration.class })
public class ColloquioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ColloquioApplication.class, args);
	}

}
