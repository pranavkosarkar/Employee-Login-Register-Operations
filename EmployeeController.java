package com.example.EmployeeRegisterLoginOperations.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.EmployeeRegisterLoginOperations.model.Employee;
import com.example.EmployeeRegisterLoginOperations.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("emp", service.getAllEmployees());
		return "index";}
	
	@GetMapping("/addNewEmployee")
	public String createNewEmployeePage(Model model) {
		Employee emp = new Employee();
		model.addAttribute("emp", emp);
		return "new_employee";}
	
	@GetMapping("/loginEmployee")
	public String createloginEmployeePage(Model model) {
		Employee emp = new Employee();
		model.addAttribute("emp", emp);
		return "login_employee";}
	
	@PostMapping("/welcomePage")
	public String createWelcomeEmployeePage(@ModelAttribute("emp") Employee emp, Model model) {
		if (service.get(emp.getLogin_id(), emp.getPassword()) instanceof Employee) {
			Employee emp1 = (Employee) service.get(emp.getLogin_id(), emp.getPassword());
			model.addAttribute("emp", emp1);
			return "welcome";
		} else {
			String s = (String) service.get(emp.getLogin_id(), emp.getPassword());
			if (s.equals("Password Incorrect"))
				return "Password_incorrect";
			else
				return "UserID_incorrect";}
		}

	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("emp") Employee emp) {
		service.addEmployee(emp);
		return "redirect:/";
	}
}
