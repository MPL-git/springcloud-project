package com.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Pengl
 * @create 2020-03-14 下午 5:06
 */
@Configuration
public class MySelfRule {

	@Bean
	public IRule myRule() {
//		return new RandomRule();	//Ribbon默认是轮询，我自定义为随机

		return new RandomRuleCustom();	//我自定义为每台机器5次
	}

}
