package com.KSI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class KsiApplication {

	public static void main(String[] args) {
		SpringApplication.run(KsiApplication.class, args);
	}

}
