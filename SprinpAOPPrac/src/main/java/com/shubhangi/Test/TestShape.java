package com.shubhangi.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shubhangi.service.ShapeService;

public class TestShape {

		public static void main(String[] args) 
		{
			ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
			ShapeService shapeService=context.getBean("shape",ShapeService.class);
			System.out.println(shapeService.getCircle().getName());
			System.out.println(shapeService.getTriangle().getName());
		}
	}









