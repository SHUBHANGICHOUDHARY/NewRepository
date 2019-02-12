package com.Student.Java;
public class StudentMain 
{
	public static void main(String[] args) {
	      Student s1 = new Student("Shubhangi", "SLV Pg");
	      s1.getName();
	      s1.getAddress();
	      s1.setAddress("Kundalhalli");
	      System.out.println(s1.toString());  
	      s1.addCourseGrade("IM100", 79);
	      s1.addCourseGrade("IM200", 93);
	      s1.addCourseGrade("IM300", 85);
	      s1.printGrades();
	      System.out.printf("The average grade = %f", s1.getAverageGrade());
	   }
}
