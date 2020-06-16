package com.spring.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel)
	{
		//create an object of student
		Student student=new Student();
		
		//add object into model and send it to student-reg.jsp
		theModel.addAttribute("Student",student);
		return "student-reg";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("Student") Student newStudent) {
		
		System.out.println("Student:"+ newStudent.getFirstName()+"   "+newStudent.getLastName());
		return "student-confirm";
	}
}
