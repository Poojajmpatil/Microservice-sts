package com.cts.adb.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Stage03AdbContactServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Stage03AdbContactServiceApplication.class, args);
	}

}