package com.example.EmployeeRegisterLoginOperations.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.EmployeeRegisterLoginOperations.model.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();
	public Employee addEmployee(Employee emp);
	public Object get(int login_id, String password);
}
