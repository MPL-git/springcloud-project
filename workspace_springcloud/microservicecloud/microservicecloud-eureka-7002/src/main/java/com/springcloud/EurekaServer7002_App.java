package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Pengl
 * @create 2020-03-12 下午 2:16
 * EurekaServer服务器端启动类,接受其它微服务注册进来
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7002_App {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer7002_App.class, args);
	}

}