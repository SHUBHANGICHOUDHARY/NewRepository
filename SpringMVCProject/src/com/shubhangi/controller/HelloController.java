package com.shubhangi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greet")
public class HelloController 
{
	@RequestMapping("/welcome")
	public ModelAndView helloWorld()
	{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("welcomeMessage","helloworld");
		return modelAndView;
	}
}
