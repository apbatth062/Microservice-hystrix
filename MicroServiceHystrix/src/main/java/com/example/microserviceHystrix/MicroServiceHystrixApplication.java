package com.example.microserviceHystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard
public class MicroServiceHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceHystrixApplication.class, args);
	}

}
