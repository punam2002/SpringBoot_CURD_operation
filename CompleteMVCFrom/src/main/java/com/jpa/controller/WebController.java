package com.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.jpa.Service.EmployeeService;
import com.jpa.model.Employee;

@Controller
public class WebController {
@Autowired
private EmployeeService empserv;
//display list of Employees
@GetMapping("/Home")
public String viewHomePage(Model model){
	model.addAttribute("listOfEmployees",empserv.getAllEmployees());
return "index";	
}
@GetMapping("/showNewEmployeeForm")
public String showNewEmployee(Model model){
	Employee employee=new Employee();
	model.addAttribute("employee",employee);
return "New_Employee";	
}
@PostMapping("/saveEmployee")
public String saveEmployee(@ModelAttribute("employee") Employee employee) {
	//Save Employee to Database
	empserv.saveEmployee(employee);
	return "redirect:/Home";
}

@GetMapping("/showUpdateForm/{id}")
public String showUpdateForm(@PathVariable(value="id") long id,Model model) {
	//get Employee from the Service
	Employee employee=empserv.getEmployeById(id);
	//set Employee as a model attribute to pre-populate the form....
	model.addAttribute("employee",employee);
	return "Update_Employee";
}

@GetMapping("/deleteEmployee/{id}")
public String deleteEmployee(@PathVariable(value="id") long id) {
	//call delete employee Method
	this.empserv.deleteEmployeeById(id);
	return "redirect:/Home";
}

}
