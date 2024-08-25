package com.pagination.service;

import org.springframework.data.domain.Page;

import com.pagination.entity.Employee;

public interface IEmployeeService {
	Page<Employee> findEmployees(int pageIndex);

}
