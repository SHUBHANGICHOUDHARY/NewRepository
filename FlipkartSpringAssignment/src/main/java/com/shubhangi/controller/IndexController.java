package com.shubhangi.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class IndexController 
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
	
	@RequestMapping("/laptops")
	public ModelAndView laptops()
	{
		ModelAndView modelAndView=new ModelAndView("laptops");
		return modelAndView;
	}
	
	@RequestMapping("/mobileAccessories")
	public ModelAndView  mobileAccessories()
	{
		ModelAndView modelAndView=new ModelAndView("mobileAccessories");
		return modelAndView;
	}
	
	@RequestMapping("/acer")
	public ModelAndView acer()
	{
		ModelAndView modelAndView=new ModelAndView("acer");
		return modelAndView;
	}
	
	@RequestMapping("/asus")
	public ModelAndView asus()
	{
		ModelAndView modelAndView=new ModelAndView("asus");
		return modelAndView;
	}
	
	@RequestMapping("/blutooth")
	public ModelAndView blutooth()
	{
		ModelAndView modelAndView=new ModelAndView("blutooth");
		return modelAndView;
	}
	
	@RequestMapping("/dell")
	public ModelAndView dell()
	{
		ModelAndView modelAndView=new ModelAndView("dell");
		return modelAndView;
	}
	
	@RequestMapping("/oppo")
	public ModelAndView oppo()
	{
		ModelAndView modelAndView=new ModelAndView("oppo");
		return modelAndView;
	}
	
	@RequestMapping("/powerbank")
	public ModelAndView powerbank()
	{
		ModelAndView modelAndView=new ModelAndView("powerbank");
		return modelAndView;
	}
	
	@RequestMapping("/samsung")
	public ModelAndView samsung()
	{
		ModelAndView modelAndView=new ModelAndView("samsung");
		return modelAndView;
	}
	
	@RequestMapping("/solo")
	public ModelAndView solo()
	{
		ModelAndView modelAndView=new ModelAndView("solo");
		return modelAndView;
	}
}
