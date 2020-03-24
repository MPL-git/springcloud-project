package com.springcloud.dao;

import com.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Pengl
 * @create 2020-03-11 下午 5:56
 */
@Mapper
public interface DeptDao {

	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();

}
