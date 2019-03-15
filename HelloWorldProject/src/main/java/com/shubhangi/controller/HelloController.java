package com.shubhangi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/Welcomemessage")
public class HelloController {
	@RequestMapping(method=RequestMethod.POST)
		
 public ModelAndView welcome(@RequestParam(value="username") String username) 
	{
		ModelAndView mv=new ModelAndView("welcomePage");
		mv.addObject("msg", "hello"+username);
		return mv;
	}
	
	@RequestMapping("/new")
	public ModelAndView newPage()
	{
		return new ModelAndView("new");
	}
}
