package com.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.jpa.model.Student;
import com.jpa.service.StudentService;

@Controller
public class StudentController {
@Autowired
private StudentService service;

@GetMapping("/Home")
public String viewHomePage(Model model) {
	model.addAttribute("ListOfStudents",service.getAllStudents());
	return "index";
}
@GetMapping("/showNewStudentForm")
public String showNewStudent(Model model) {
	Student student=new Student();
	model.addAttribute("student",student);
	return "NewStudent";
}
@PostMapping("/saveStudent")
public String saveStudents(@ModelAttribute("student") Student student){
	//Save New Student
service.saveStudents(student);
return "redirect:/Home";
	
}
@GetMapping("/showUpdateForm/{id}")
public String showUpdateForm(@PathVariable(value="id") int id,Model model) {
	//get Student from the service
	Student student=service.getStudentById(id);
	model.addAttribute("student",student);
	
	return "UpdateStudent";
	
}
@GetMapping("/deleteStudent/{id}")
public String deleteStudent(@PathVariable(value="id") int id) {
	this.service.deleteStudent(id);
	return "redirect:/Home";
}

}


	

