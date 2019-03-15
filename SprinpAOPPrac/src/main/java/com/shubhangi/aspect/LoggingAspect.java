package com.shubhangi.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect 
{
	/*
	 * @Before("execution(public String getName())") public void loggingAdvice() {
	 * System.out.println("advice run"); }
	 */
	/*
	 * @Before("execution(public String com.shubhangi.shapes.Circle.getName())")
	 * public void loggingAdvice() { System.out.println("advice run"); }
	 */
	
	/*
	 * @Before("execution(public * get*())") public void loggingAdvice() {
	 * System.out.println("advice run"); }
	 */
	//to combine allGetters and allcirclegetters
	/*
	 * @Before("allGetters() && allCircleGetters()") public void loggingAdvice() {
	 * System.out.println("advice run"); }
	 */
	
	//to use join point
	/*
	 * @Before("allCircleGetters()") public void loggingAdvice(JoinPoint joinPoint)
	 * { System.out.println(joinPoint.toString()); }
	 */
	
	@Before("allGetters() && allCircleGetters()")
	public void loggingAdvice(JoinPoint joinPoint) 
	{
		System.out.println(joinPoint.getTarget());
	}
	@Before("allGetters()")
	public void secondAdvice() 
	{
		System.out.println("second   advice run");
	}
	
	  @Pointcut("execution(* get*())") public void allGetters() {}
	 
	
	
	/*
	 * @Pointcut("execution(*  *com.shubhangi.shapes.Circle.*())") public void
	 * allCircleGetters() {}
	 */
	
	@Pointcut("within(com.shubhangi.shapes.Circle.*)")
	public void  allCircleGetters() {}
	
	/*
	 * @Pointcut("within(com.shubhangi.shapes.*)") public void allGettersMethods()
	 * {}
	 */
	//to combine allGetters and allCircleGettres
	  
	
	//@Pointcut(orgs())
	
	
}
