package com.li.day08_springboot_emp.service.impl;


import com.li.day08_springboot_emp.dao.EmployeeDao;
import com.li.day08_springboot_emp.entity.Employee;
import com.li.day08_springboot_emp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resources;
import java.util.List;

@Service
//@Transactional//开启事务：在使用事务的类上
public class EmployeeServieImpl implements EmployeeService {
	// 数据访问层对象
	@Autowired
	private EmployeeDao empDao;
	
	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		// 添加前，先判断是否有同名的员工，如果有，不能添加
		Employee employee = empDao.findByName(emp.getName());
		if(employee != null){
			throw new RuntimeException("存在同名员工，不能添加");
		}
		// 添加数据
		empDao.add(emp);
	}

	@Override
	public List<Employee> findAllEemployee() {
		// TODO Auto-generated method stub
		List<Employee> list = null;
		try {
			list = empDao.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			throw new RuntimeException("查询所用用户数据异常");
		}
		return list;
	}

	@Override
	public void deleteEmpById(Integer id) {
		// TODO Auto-generated method stub
		
		// 判断删除的数据是否存在
		
		// 删除
		empDao.deleteById(id);
		
	}

	@Override
	public Employee findEmpById(Integer id) {
		// TODO Auto-generated method stub
		return empDao.findById(id);
	}

	@Override
	public void updateEmp(Employee emp) {
		// TODO Auto-generated method stub
		
		// 判断是否是否存在
		
		// 更新
		empDao.update(emp);
		
	}

}
