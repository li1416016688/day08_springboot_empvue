package com.li.day08_springboot_emp.dao;

import com.li.day08_springboot_emp.entity.Employee;

import javax.annotation.Resource;
import java.util.List;

@Resource
public interface EmployeeDao {

	// 获取所有的员工数据
	public List<Employee> findAll();
	
	// 添加员工
	public void add(Employee emp);
	
	// 更新员工数据
	public void update(Employee emp);
	
	// 根据id删除员工数据
	public void deleteById(Integer id);
	
	// 根据id查询员工数据
	public Employee findById(Integer id);
	
	// 根据员工姓名查询数据
	public Employee findByName(String name);
	
	
}
