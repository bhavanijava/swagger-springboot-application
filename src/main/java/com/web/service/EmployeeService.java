package com.web.service;

import java.util.*;

import com.web.model.Employee;

public interface EmployeeService {

	public Employee save(Employee e);
	public List<Employee> findAll();
	public Employee getOne(Integer id);
	public void delete(Integer id);
	public Employee updateEmp(Employee employee,Integer id);
}
