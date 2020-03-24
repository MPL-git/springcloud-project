package com.springcloud.controller;

import com.springcloud.entities.Dept;
import com.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Pengl
 * @create 2020-03-12 上午 11:41
 */
@RestController
public class DeptController_Feign {

	@Autowired
	private DeptClientService service;

	@RequestMapping(value = "/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return this.service.get(id);
	}

	@RequestMapping(value = "/consumer/dept/list")
	public List<Dept> list() {
		return this.service.list();
	}

	@RequestMapping(value = "/consumer/dept/add")
	public Object add(Dept dept) {
		return this.service.add(dept);
	}
}

