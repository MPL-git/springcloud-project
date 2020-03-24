package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Pengl
 * @create 2020-03-12 上午 11:55
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.springcloud"})
@ComponentScan("com.springcloud")
public class DeptConsumer80_Feign_App {

	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer80_Feign_App.class, args);
	}

}
