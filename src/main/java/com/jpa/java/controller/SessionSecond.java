package com.jpa.java.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;


@Controller
public class SessionSecond {

	@GetMapping("sr")
	public String sessFirst(
			Model model,HttpSession session) {
		
		
//	String fn =firstname;
//	model.addAttribute("firstname", fn);
//		
//	String ln =lastname;
//	model.addAttribute("lastname", ln);
		
String add=(String)	session.getAttribute("address");
model.addAttribute("address", add);

session.invalidate();
		return "session";
	}
}
