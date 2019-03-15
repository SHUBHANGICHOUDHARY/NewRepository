package com.shubhangi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class IndexContoller
{
	@RequestMapping("/index")
	public ModelAndView index()
	{
		System.out.println("shubh");
		ModelAndView modelAndView=new ModelAndView("index");
		return modelAndView;
	}
	
	@RequestMapping("/login")
	public ModelAndView login()
	{
		ModelAndView modelAndView=new ModelAndView("login");
		return modelAndView;
	}	
	
	@RequestMapping("/mobiles")
	public ModelAndView mobiles()
	{
		ModelAndView modelAndView=new ModelAndView("mobiles");
		return modelAndView;
	}
}
