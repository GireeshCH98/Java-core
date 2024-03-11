package com.learning.core.day6;

import java.util.Hashtable;
import java.util.Scanner;

public class D06P11 {

	public static void main(String[] args) 
	{
		Hashtable<Integer,Employee> emp= new Hashtable<>();
		
		Employee e1 = new Employee(1001,"Daniel","Analyst","L&D");
		Employee e2 = new Employee(1002,"Thomas","Tester","Testing");
		Employee e3 = new Employee(1003,"Robert","Product Manager","Development");
		Employee e4 = new Employee(1004,"Grace","Tech Support","HR");
		
		emp.put(e1.getId(), e1);
		emp.put(e2.getId(), e2);
		emp.put(e3.getId(), e3);
		emp.put(e4.getId(), e4);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Employee ID to be searched:");
		int emid= sc.nextInt();
		
		System.out.println(emp.get(emid));
	}

}