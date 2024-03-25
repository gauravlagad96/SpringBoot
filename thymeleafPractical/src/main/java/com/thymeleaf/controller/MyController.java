package com.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/home")
public class MyController {
	
	@RequestMapping("/")
	public String home(Model model,HttpSession session) {
		session.setAttribute("msg","this is session message");
		return "home";
	}
	@RequestMapping("/about")
	public String about(){
		return "about";
	}
	@RequestMapping("/services")
	public String services() {
		return "services";
	}
}
