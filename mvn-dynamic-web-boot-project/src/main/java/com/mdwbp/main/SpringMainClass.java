package com.mdwbp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages="com.mdwbp")
@EntityScan("com.mdwbp.entity")
@EnableJpaRepositories(basePackages="com.mdwbp.repo")
public class SpringMainClass extends SpringBootServletInitializer{
	public static void main(String[] args) {
		SpringApplication.run(SpringMainClass.class, args);
	}

}
