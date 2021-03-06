package com.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Pengl
 * @create 2020-03-12 上午 11:33
 * 注解版配置 ConfigBean = applicationContext.xml
 */
@Configuration
public class ConfigBean {

	@Bean
	@LoadBalanced	//Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端负载均衡的工具。
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Bean
	public IRule myRule() {
//		return new RandomRule();	//达到的目的，用我们重新选择的随机算法代替默认的轮询
		return new RetryRule();
	}

}
