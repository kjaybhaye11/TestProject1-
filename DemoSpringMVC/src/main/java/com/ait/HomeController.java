package com.ait;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String m1()
	{
		System.out.println("//////////");
		return "two.jsp";
	}
}
