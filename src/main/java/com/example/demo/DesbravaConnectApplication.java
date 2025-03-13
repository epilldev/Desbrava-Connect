package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//INATIVANDO O DATA SOURCE POR ENQUANTO
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class DesbravaConnectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesbravaConnectApplication.class, args);

	}

}
