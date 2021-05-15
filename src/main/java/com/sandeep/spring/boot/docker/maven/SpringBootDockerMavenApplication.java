package com.sandeep.spring.boot.docker.maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sandeep.spring.boot.*")
public class SpringBootDockerMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerMavenApplication.class, args);
	}

}
