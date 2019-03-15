package com.employee.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.employee.dao.EmployeeDaoImpl;
import com.employee.pojo.Employee;

public class EmpTest {

	public static void main(String[] args) {
		
		ApplicationContext c=new ClassPathXmlApplicationContext("Spring.xml");
		
		EmployeeDaoImpl d=(EmployeeDaoImpl)c.getBean("edao");
		EmployeeServiceImp s=new EmployeeServiceImp();
        Employee e1=new Employee();
        e1.setEmpNo(8463);
		
		  e1.setSal(3000); e1.setEname("Simmy"); e1.setJob("Manager"); e1.setMgr(3269);
		  e1.setSal(6000); e1.setComm(600); e1.setDeptno(30);
		 
		 
      	//d.insert(e1);
      	s.addEmp(e1);
      	List<Employee> list2=d.orderBy(); for(Employee emp2:list2) {
   		  System.out.println(emp2); }
		//s.deleteEmp(e1);
		/*
		 * System.out.println( d.update(e2)); List<Employee> list1= d.getAll();
		 * for(Employee emp1:list1) { System.out.println(emp1); } System.out.println(
		 * "***********************************************************************************"
		 * ); List<Employee> list2=d.orderBy(); for(Employee emp2:list2) {
		 * System.out.println(emp2); } System.out.println(
		 * "**********************************************************************************"
		 * ); List<Employee> list3=d.groupBy(); for(Employee emp3:list3) {
		 * System.out.println(emp3); }
		 */
		//e1.setSal(9000);
		//s.getMaxSalary();
      	e1.setSal(7000);
		s.updateEmpSal(e1);
		s.getEmp(e1);
	}

}
