package com.springcloud.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Pengl
 * @create 2020-03-23 下午 4:33
 */
@RestController
public class ConfigClientRest {

	@Value("${spring.application.name}")
	private String applicationName;

	@Value("${eureka.client.service-url.defaultZone}")
	private String eurekaService;

	@Value("${server.port}")
	private String port;

	@RequestMapping("/config")
	private String getConfig() {
		String str = "applicationName: "+applicationName+"\t eurekaServers: "+eurekaService
				+"\t port: "+port;
		System.out.println("******str: "+str);
		return "applicationName: "+applicationName+"\t eurekaServers: "+eurekaService+"\t port: "+port;
	}

}
