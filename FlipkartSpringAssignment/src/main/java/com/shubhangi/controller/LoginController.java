package com.shubhangi.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shubhangi.daoImplementaion.FlipkartDaoImplementation;
import com.shubhangi.pojo.Login;
import com.shubhangi.pojo.Register;

@Controller
public class LoginController 
{
	@Autowired
	FlipkartDaoImplementation flipkartDaoImplementation;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView login(HttpServletRequest request,HttpServletResponse response)
	{
		ModelAndView modelAndView=new ModelAndView("Login");
		modelAndView.addObject("login",new Login());
		return modelAndView;	
	}
	
	@RequestMapping(value="/loginProcess",method=RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest request,HttpServletResponse response,@ModelAttribute("login") Login login)
	{
		
		System.out.println(login.getUserName()+login.getPassword());
		ModelAndView modelAndView=null;
		
		Register register= flipkartDaoImplementation.validateUser(login);
		if(register!=null)
		{
			modelAndView =new ModelAndView("Welcome");
			modelAndView.addObject("userName",register.getUserName());
			modelAndView.addObject("password",register.getPassword());
		}
		else
		{
			modelAndView = new ModelAndView("login");
			modelAndView.addObject("message","Username or password is wrong");
		}
		return modelAndView;
	}
	
}
