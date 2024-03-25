package com.thymeleaf.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.thymeleaf.entity.User;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home( Model m){
		m.addAttribute("today",new Date());
		
		User u1 = new User( 48,"gaurav","Kolgaon");
		User u2 = new User( 37,"Avi","Sangamner");
		
		m.addAttribute("user1",u1);		
		return "index";
	}
	
	@GetMapping("/profile")
	public String profile(Model m) {
		
		return "profile";
	}

}
