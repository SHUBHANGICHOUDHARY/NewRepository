package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.AbstractController;
//
//public class JavaController extends AbstractController{
//
//	@Override
//	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) 
//			throws Exception {		
//		
//		ModelAndView mv=new ModelAndView("HelloPage");
//		mv.addObject("welcomeMessage", "Hi user");
//		
//		return mv;
//	}
//
//}
@Controller
public class HelloController{
	@RequestMapping("/welcome")
//	public ModelAndView helloWorld(@PathVariable("username") String name,@PathVariable("country") String c)
	public ModelAndView helloWorld()
	{
		
		
		ModelAndView mv=new ModelAndView("index");
	
	return mv;
	}
	@RequestMapping("/login")
	public ModelAndView login()
	{
		
		
		ModelAndView login=new ModelAndView("login");
	
	return login;
	}
	
	@RequestMapping("/register")
	public ModelAndView register()
	{
		
		
		ModelAndView register=new ModelAndView("registration");
	
	return register;
	}
	
	
//	@RequestMapping("/hi")
//	public ModelAndView hihelloWorld()
//	{
//		ModelAndView mv=new ModelAndView("HelloPage");
//	mv.addObject("msg", "Hi  akshay R");
//	return mv;
//	}
}