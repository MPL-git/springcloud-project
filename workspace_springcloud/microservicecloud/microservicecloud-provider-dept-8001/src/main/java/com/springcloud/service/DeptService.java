package com.springcloud.service;

import com.springcloud.entities.Dept;

import java.util.List;


/**
 * @author Pengl
 * @create 2020-03-11 下午 6:21
 */
public interface DeptService {

	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();

}
