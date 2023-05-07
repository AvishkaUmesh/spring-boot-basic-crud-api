package com.avishka.springbootbasiccrudapi.dao;

import java.util.List;

import com.avishka.springbootbasiccrudapi.entity.Employee;

public interface EmployeeDAO {
	public List<Employee> findAll();

	public Employee findById(int id);

	public void save(Employee employee);

	public void update(Employee employee);

	public void deleteById(int id);
}
