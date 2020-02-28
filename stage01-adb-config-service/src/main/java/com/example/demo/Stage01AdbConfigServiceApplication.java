package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Stage01AdbConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Stage01AdbConfigServiceApplication.class, args);
	}

}
