package com.Person.Student.Teacher;

public class PersonMain 
{
	public static void main(String[] args) {
		Person p = new Person("Pavan","Guntur");
		Student s4 = new Student("Simmy","MP");
		Teacher t = new Teacher("Venkatesh","AP");
		System.out.println(t.addCourse("Maths"));
		System.out.println(s4.addCourseGrade("Hindi",89));
		//System.out.println(t);*/
		
	}

}
s