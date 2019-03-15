package com.shubhangi.Annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation
{
	String name();
	int value();
}
@MyAnnotation(name="Shubhangi",value=9)
public class AnnotationClass
{
	public static void main(String args[])
	{
		AnnotationClass a=new AnnotationClass();
		Class c=a.getClass();
		Annotation an=c.getAnnotation(MyAnnotation.class);
		MyAnnotation m=(MyAnnotation)an;
		System.out.println(m.name());
	}
}
