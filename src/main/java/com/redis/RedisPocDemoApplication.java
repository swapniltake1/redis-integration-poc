package com.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.redis.repo","com.redis.controllers"} )
public class RedisPocDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisPocDemoApplication.class, args);
	}

}
