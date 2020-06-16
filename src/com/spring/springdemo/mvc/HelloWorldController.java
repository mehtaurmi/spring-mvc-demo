package com.spring.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloWorld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloWorld";
	}
	
	@RequestMapping("/fetchIntoModel")
	public String sendDataToModel(HttpServletRequest request,Model model) {
		
		String name = request.getParameter("studentName");
		
		name= name.toUpperCase();
		
		String message= "Yo "+name;
		
		model.addAttribute("message", message);
		
		return "helloWorld";
	}
	
	@RequestMapping("/fetchIntoModelTwo")
	public String sendDataToModelTwo(@RequestParam("studentName") String name,Model model) {
		
		name= name.toUpperCase();
		
		String message= "Welcome "+name;
		
		model.addAttribute("message", message);
		
		return "helloWorld";
	}
}
