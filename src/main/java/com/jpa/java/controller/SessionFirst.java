package com.jpa.java.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({"firstname","lastname"})
public class SessionFirst {
	
	@GetMapping("firstsession")
	public String firstSession(Model model,HttpServletRequest request) {
		model.addAttribute("firstname", "rohanjali");
		model.addAttribute("lastname", "maharjan");
		
	HttpSession session=	request.getSession();
		session.setAttribute("address", "harisiddhi,lalitpur");
		return"session";
		
	}
	
	@GetMapping("secondsession")
	public String secondSession(Model model) {
	
	String fn=(String)	model.getAttribute("firstname");
	System.out.println(fn);
	
	String ln =(String)	model.getAttribute("lastname");
		System.out.println(ln);
		
		return"session";
		
	}
	
	@GetMapping("thirdsessionn")
	public String thirdSession(Model model,HttpSession session) {
	
	String fn=(String)	model.getAttribute("firstname");
	System.out.println(fn);
	
	String ln =(String)	model.getAttribute("lastname");
		System.out.println(ln);
		
String add=(String)		session.getAttribute("address");
model.addAttribute("address", add);
		return"session";
		
	}
	
	

}
