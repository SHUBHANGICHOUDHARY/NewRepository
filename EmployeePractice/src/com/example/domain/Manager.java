package com.example.domain;

public class Manager extends Employee
{	
	private String deptName;
	private static Employee staff[]=new Employee[8];
	private int employeeCount=0;
	
	
	
	public Manager(int employeeId, String employeeName, String employeeSSN, double salary,String deptName)
	{
		//what is super method
		super(employeeId, employeeName, employeeSSN, salary);
		this.deptName=deptName;
		Manager.staff[0] = new Employee(301,"simmy","108-23-6504",65034.90);
		Manager.staff[1] = new Employee(302,"seshu","108-23-6505",75020.84);
		Manager.staff[2] = new Employee(303,"mouni","108-23-6506",65034.90);
		Manager.staff[3] = new Employee(304,"sudha","108-23-6507",45034.90);
		Manager.staff[4] = new Employee(305,"vani","108-23-6508",68034.90);
		Manager.staff[5] = new Employee(306,"harshita","108-23-6509",665034.90);
		Manager.staff[6] = new Employee(307,"venktaesh","108-23-6510",56034.90);
		Manager.staff[7] = new Employee(308,"revanth","108-23-6511",78034.90);
	}
	
	public String getDeptName() 
	{
		return deptName;
	}
	
}
