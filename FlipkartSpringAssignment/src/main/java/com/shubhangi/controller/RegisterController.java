package com.shubhangi.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shubhangi.daoImplementaion.FlipkartDaoImplementation;
import com.shubhangi.pojo.Register;

@Controller
public class RegisterController
{
	
	@Autowired
	public FlipkartDaoImplementation flipkartDaoImplementation;
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public ModelAndView register(HttpServletRequest request,HttpServletResponse response)
	{
		ModelAndView modelAndView=new ModelAndView("register");
		modelAndView.addObject("register",new Register());
		return modelAndView;	
	}
	
	//@RequestMapping 
}
