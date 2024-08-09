package com.example.EmployeeRegisterLoginOperations.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeRegisterLoginOperations.model.Employee;
import com.example.EmployeeRegisterLoginOperations.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository repo;

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub

		return repo.findAll();
	}

	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return repo.save(emp);
	}

	@Override
	public Object get(int login_id, String password) {
		// TODO Auto-generated method stub
		
		 if(repo.findById(login_id).isPresent())
			 {
			 if(repo.findById(login_id).get().getPassword().equals(password))
					 return repo.findById(login_id).get();
			 else
				 return "Password Incorrect";
			 }
		 else 
			 return "ID does not exists";
	}
}
