package com.mdwbp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.mdwbp")
public class SpringMainClass {

	public static void main(String[] args) {
		SpringApplication.run(SpringMainClass.class, args);
	}

}
