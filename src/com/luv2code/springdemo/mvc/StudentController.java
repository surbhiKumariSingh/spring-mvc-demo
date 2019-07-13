package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	@RequestMapping("/showForm")
	public String showform(Model theModel) {
		
		Student thestudent= new Student();
		theModel.addAttribute("student", thestudent);
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student  thestudent) {
		System.out.println("theStudent"+ thestudent.getFirstname()+ thestudent.getLastname()+thestudent.getOperatingSystems());
		return "student-confirmation";
		
	}
}
