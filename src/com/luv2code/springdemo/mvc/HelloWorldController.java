package com.luv2code.springdemo.mvc;

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
		return "helloworld-form";
	}

	// new controler to process the html form
	@RequestMapping("/processForm")
	public String showProcess() {
		return "helloworld";
	}

	// add a new contoller method to read from data
	// add the data to the model

	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {

		// read the request parameter from html form
		String theName = request.getParameter("studentName");
		// convert data to upper case
		theName = theName.toUpperCase();

		// create the message
		String result = "Yo!!! " + theName;
		// add data to model
		model.addAttribute("message", result);

		return "helloworld";
	}
	
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {

		// read the request parameter from html form
		//String theName = request.getParameter("studentName");
		// convert data to upper case
		theName = theName.toUpperCase();

		// create the message
		String result = "hey wasssup " + theName;
		// add data to model
		model.addAttribute("message", result);

		return "helloworld";
	}
}
