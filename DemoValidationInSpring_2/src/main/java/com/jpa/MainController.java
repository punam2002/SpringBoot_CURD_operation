package com.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;
@Controller
public class MainController{
	

	@GetMapping("/register")
	public String showFrom(Model model) {
		Student student=new Student();
		model.addAttribute("student",student);
		
		
		List<String> courseList=new ArrayList<>();
		courseList.add("Java Full Stack");
		courseList.add("Python Full Stack");
		courseList.add("Software Testing");
		courseList.add("Machine Learning");
		courseList.add("AI");
		courseList.add("UI/UX");
		model.addAttribute("courseList", courseList);
	
		return "Student_Registration";
	}
	@PostMapping("/register")
	public String clickForm(@Valid @ModelAttribute("student") Student student, BindingResult bindingresults,Model model) {
		System.out.println(student);
		
		if(bindingresults.hasErrors()) {
			List<String> courseList=new ArrayList<>();
			courseList.add("Java Full Stack");
			courseList.add("Python Full Stack");
			courseList.add("Software Testing");
			courseList.add("Machine Learning");
			courseList.add("AI");
			courseList.add("UI/UX");
			model.addAttribute("courseList", courseList);
			
			return "Student_Registration";
		}
		return "Success";
	}
}
