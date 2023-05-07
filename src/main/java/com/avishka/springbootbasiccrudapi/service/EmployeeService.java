package com.avishka.springbootbasiccrudapi.service;

import java.util.List;

import com.avishka.springbootbasiccrudapi.entity.Employee;

public interface EmployeeService {

	List<Employee> findAll();

	Employee findById(int id);

	Employee save(Employee employee);

	void deleteById(int id);

}
