package com.springBootWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 
{
	
	@RequestMapping("/home")
	public String home()
	{
		
		return "home"; // In order to display jsp page , as spring boot doesn't support jsp we need to add one dependencies i.e tomcat Jasper(of the same version of the embeded tomcat. 
	}

}