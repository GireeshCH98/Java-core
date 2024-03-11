package com.learning.core.day6;

import java.util.Hashtable;
import java.util.Scanner;

public class D06P14 {

	public static void main(String[] args) 
	{
		Hashtable<Integer,Employee> emp= new Hashtable<>();
		Hashtable<Integer,Employee> emp1= new Hashtable<>();
		
		Employee e1 = new Employee(1001,"Daniel","Analyst","L&D");
		Employee e2 = new Employee(1002,"Thomas","Tester","Testing");
		Employee e3 = new Employee(1003,"Robert","Product Manager","Development");
		Employee e4 = new Employee(1004,"Grace","Tech Support","HR");
		Employee e5 = new Employee(1005,"Charles","QA Lead","Testing");
		Employee e6 = new Employee(1006,"Hemry","Accountant","Finance");
		
		
		emp.put(e1.getId(), e1);
		emp.put(e2.getId(), e2);
		emp.put(e3.getId(), e3);
		emp.put(e4.getId(), e4);
		
		emp1.put(e5.getId(), e5);
		emp1.put(e6.getId(), e6);
		
		emp1.putAll(emp);
		
		for(Employee e: emp1.values())
		{
			System.out.println(e);
		}
	}

}