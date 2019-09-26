package com.li.day08_springboot_emp.service;

import com.li.day08_springboot_emp.entity.Employee;

import java.util.List;



// 业务层的方法名体现的是功能
public interface EmployeeService {

	public void addEmployee(Employee emp);
	
	public List<Employee> findAllEemployee();
	
	public void deleteEmpById(Integer id);
	
	public Employee findEmpById(Integer id);
	
	public void updateEmp(Employee emp);
}
