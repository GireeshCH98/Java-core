package com.learning.core.day6;

import java.util.Hashtable;
import java.util.Scanner;

public class D06P12 {

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
		System.out.println("Enter the Employee details:");
		int emid= sc.nextInt();
		String na= sc.next();
		String de= sc.next();
		String dn= sc.next();
		
		if(!emp.containsKey(emid))
		{
			emp.put(emid, new Employee(emid,na,de,dn));
		}
		else
		{
			System.out.println("The Employee already exists:");
		}
		for(Employee e: emp.values())
		{
			System.out.println(e);
		}
	}

}