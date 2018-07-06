package com.neoris.microservicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class NetflixEurekaClienteEliminarApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixEurekaClienteEliminarApplication.class, args);
	}
}
