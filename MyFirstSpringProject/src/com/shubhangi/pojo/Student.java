package com.shubhangi.pojo;

public class Student 
{
	private String studentName;
	private String studentAge;
	private String studentDepartment;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentAge() {
		return studentAge;
	}



	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}



	public String getStudentDepartment() {
		return studentDepartment;
	}



	public void setStudentDepartment(String studentDepartment) {
		this.studentDepartment = studentDepartment;
	}

	public void showStudentInfo(){  
	    System.out.println("Hello: "+studentName);
	    System.out.println("Your Age: "+studentAge);
	    System.out.println("Youe Department: "+studentDepartment);
	}  
}
