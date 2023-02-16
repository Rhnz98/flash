package com.jpa.java.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SessionController {

	@GetMapping("sess")
	public String showSession(Model model,HttpSession session) {
	String res =(String)	model.getAttribute("firstname");
	System.out.println("inside  ew con " +res);
	
	String address =(String)session.getAttribute("address");
	String newAddress =address + "new second conteoller";
	model.addAttribute("address", newAddress);
		return "index";
		
	}
}
