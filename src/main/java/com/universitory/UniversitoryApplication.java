package com.universitory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
/*@EnableConfigurationProperties({
		FileStorageProperties.class
})*/
public class UniversitoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversitoryApplication.class, args);
	}

/*
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Application.class);
	}*/
}
