package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.Model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	
	
	
	@ModelAttribute
	public void commonDataForModel(Model m)
	{ 
		m.addAttribute("Header", "Learn with Code");
		m.addAttribute("Desc", "Home for Programmer");
		System.out.println("Add data for Model");
		
		
	}

	@RequestMapping("/contact")
	public String ShowForm(Model m)
	{
		
		System.out.println("Show form");
		return "contact";
     }
	
	
	@RequestMapping(path ="/processform", method= RequestMethod.POST)
	public String handleForm(@ModelAttribute("user") User user,Model model)
			              
	{
		System.out.println(user);
	//process 
		
		
		this.userService.createUser(user);
	//model.addAttribute("user",user);
		
		return"success" ;
	
	}
}
/*
 	
	@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String ShowForm()
	{
		return "contact";
     }
	
	
	@RequestMapping(path ="/processform", method= RequestMethod.POST)
	public String handleForm(
			               @RequestParam(name="email", required =false )String userEmail, Model model,
	                       @RequestParam("userName") String userName,
                           @RequestParam("password") String userPassword)
	{
		
		
		User user = new User();
		user.setEmail(userEmail);
		user.setUserName(userName);
		user.setPassword(userPassword);
		
		
		System.out.println(user);
		/*System.out.println("User Email:-"+userEmail);
		System.out.println("User Name:-"+userName);
		System.out.println("User Password:-"+userPassword);*/
		
		
		
		//process
		//model.addAttribute("name",userName);
		//model.addAttribute("email",userEmail);
		//model.addAttribute("password",userPassword);
		
		//model.addAttribute("user",user);
		//
		//return"success" ;
	
	
	
	
	
	/*@RequestMapping(path ="/processform", method= RequestMethod.POST)
	public String handleForm(HttpServletRequest request)
	{
		String email=request.getParameter("email");
		System.out.println("User email is:- "+email);
		
		return"" ;
}	}*/
	
	
	

