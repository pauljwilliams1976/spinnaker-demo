package com.starlingbank.spinnakerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.info.BuildProperties;

@SpringBootApplication
public class SpinnakerDemoApplication {

	private final BuildProperties buildProperties;

	public SpinnakerDemoApplication(BuildProperties buildProperties) {
		this.buildProperties = buildProperties;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpinnakerDemoApplication.class, args);
	}

}
