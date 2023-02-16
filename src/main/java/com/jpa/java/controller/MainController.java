package com.jpa.java.controller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes({"firstname","lastname"})
public class MainController {
	

	
	@GetMapping("first")
	public String first1(Model model,HttpServletRequest request){
		
		model.addAttribute("firstname", "piya");
		model.addAttribute("lastname", "mzn");
model.addAttribute("next", "/second");



HttpSession session = request.getSession();

session.setAttribute("address", "blr");
		return"index";
}
	
	
	
	
	@GetMapping("second")
	public String first12(Model m,SessionStatus status)
{
	String first=	(String)m.getAttribute("firstname");
		System.out.println(first);
		
		String last =(String)m.getAttribute("lastname");
		System.out.println(last);
		
		m.addAttribute("firstname", first);
		m.addAttribute("lastname", last);
		
		
		return"index";
}
	
	@GetMapping("third")
	public String handlingmodel3(Model m,HttpSession session,SessionStatus status)
{
String lastname =(String)	m.getAttribute("lastname");
System.out.println(lastname);
m.addAttribute("lastname", lastname);

 String add =(String) session.getAttribute("address");
 
 String newAdd =add + " my home";
 m.addAttribute("address", newAdd);
 
		return"index";
}
	
	
	
	
	
}
