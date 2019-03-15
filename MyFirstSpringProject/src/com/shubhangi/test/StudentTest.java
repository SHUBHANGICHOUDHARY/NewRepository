package com.shubhangi.test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.shubhangi.pojo.Student;

public class StudentTest {

	public static void main(String[] args)
	{
		Resource resource=new ClassPathResource("spring.xml");  
	    BeanFactory bean=new XmlBeanFactory(resource);  
	      
	    Student student=(Student)bean.getBean("student");  
	    student.showStudentInfo();  
	}

}
