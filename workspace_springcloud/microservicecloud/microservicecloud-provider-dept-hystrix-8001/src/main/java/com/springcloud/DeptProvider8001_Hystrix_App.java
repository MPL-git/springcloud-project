package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Pengl
 * @create 2020-03-12 上午 10:43
 * 本服务启动后会自动注册进eureka服务中
 * 服务发现
 * 对hystrix熔断机制的支持
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableCircuitBreaker
public class DeptProvider8001_Hystrix_App {

	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8001_Hystrix_App.class, args);
	}

}
