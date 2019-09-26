package com.li.day08_springboot_emp.controller;

import com.li.day08_springboot_emp.common.JsonBean;
import com.li.day08_springboot_emp.entity.Employee;
import com.li.day08_springboot_emp.service.EmployeeService;
import com.li.day08_springboot_emp.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.misc.Request;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
//@ResponseBody
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	@RequestMapping("/add")
	public String add(Employee emp){
		return "add";
	}

	@RequestMapping("/add.do")
	public String addEmp(Employee emp){
		empService.addEmployee(emp);
		System.out.println("333");
		return "forward:/list.do";
	}

	@RequestMapping("/list.do")
	public String listEmp(Model model){
		List<Employee> list = empService.findAllEemployee();
		model.addAttribute("emplist" ,list);
		return "list";
	}

	@RequestMapping("/delete.do")
	public String deleteEmp(int id){
		System.out.println(id);
		empService.deleteEmpById(id);
		return "forward:/list.do";
	}

	@RequestMapping("/query.do")
	public String queryById(int id ,Model model){
		System.out.println("5");
		Employee emp = empService.findEmpById(id);
		model.addAttribute("emp",emp);
		return "update";
	}

	@RequestMapping("/update.do")
	public String updateEmp(Employee emp){
		empService.updateEmp(emp);
//		return "forward:/list.do";
		return "redirect:/list.do";
	}

}
