package com.pagination.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pagination.entity.Employee;
import com.pagination.service.IEmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	IEmployeeService service;
	//http://localhost:2024/pagination/emps
	@GetMapping(value="emps")
	public String getEmployees(@RequestParam(defaultValue="0") int pageIndex,ModelMap modelMap)
	{
		Page<Employee> page=service.findEmployees(pageIndex);
		List<Employee> empList=page.getContent();
		modelMap.addAttribute("employees",empList);
		modelMap.addAttribute("next",page.hasNext());
		modelMap.addAttribute("back",page.hasPrevious());
		modelMap.addAttribute("currentPage",page.getNumber());
		return "ShowEmployees";
	}
	
	@GetMapping("/error")
	public String getMethodName() {
		return "error";
	}
	

}
