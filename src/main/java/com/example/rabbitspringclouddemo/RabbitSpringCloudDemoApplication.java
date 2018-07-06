package com.example.rabbitspringclouddemo;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableRabbit
@Configuration
public class RabbitSpringCloudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitSpringCloudDemoApplication.class, args);
	}
}
