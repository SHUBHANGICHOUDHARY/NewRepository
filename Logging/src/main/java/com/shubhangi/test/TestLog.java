package com.shubhangi.test;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shubhangi.log.HelloWorld;

public class TestLog 
{
	static Logger log =Logger.getLogger(TestLog.class.getName());
	public static void main(String[] args)
	{
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		log.info("Going to create hello world ");
		HelloWorld obj=context.getBean("helloworld",HelloWorld.class);
		obj.getMessage();
		log.info("Exit");
		
	}

}
