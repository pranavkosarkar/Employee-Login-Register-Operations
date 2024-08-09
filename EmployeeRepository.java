package com.example.EmployeeRegisterLoginOperations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmployeeRegisterLoginOperations.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
