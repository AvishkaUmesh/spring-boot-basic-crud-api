package com.avishka.springbootbasiccrudapi.dao;

import java.util.List;

import com.avishka.springbootbasiccrudapi.entity.Employee;

public interface EmployeeDAO {
	public List<Employee> findAll();

	public Employee findById(int id);

	public Employee save(Employee employee);

	public void deleteById(int id);
}
