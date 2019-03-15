package com.employee.aspect;

import org.aspectj.lang.annotation.Before;

public class LoggingAspects
{
	@Before("execution(public * get*())") 
	public void loggingAdvice() 
	{
		  System.out.println("advice run"); 
	}
}
