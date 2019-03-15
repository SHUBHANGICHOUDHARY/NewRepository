package com.shubhangi.autoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {

	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring3.xml");
		Triangle triangle=(Triangle)context.getBean("triangle");
		triangle.draw();
	}

}
