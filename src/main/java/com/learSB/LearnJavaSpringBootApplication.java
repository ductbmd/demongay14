package com.learSB;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.learSB.storage.StorageProperties;
import com.learSB.storage.StorageService;



@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class LearnJavaSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnJavaSpringBootApplication.class, args);
	}
	 @Bean
	    CommandLineRunner init(StorageService storageService) {
	        return (args) -> {
	            storageService.deleteAll();
	            storageService.init();
	        };
	    }
}
