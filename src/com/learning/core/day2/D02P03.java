package com.learning.core.day2;
import java.util.Scanner;
//Operators
public class D02P03 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int a = in.nextInt();
		
		System.out.println("Enter the Number :");
		int b = in.nextInt();
		System.out.println("+ - Addition");
		System.out.println("- - Subtraction");
		System.out.println("* - Multiplication");
		System.out.println("/ - Division");
		System.out.println("% - Modulus");
		System.out.println("Enter operator: ");
        char op = in.next().charAt(0);
        int r = 0;
        
        switch(op) 
        {
        	case '+':
        		r = a + b;
        		System.out.println(a + " + " + b + " = " + r);
        		break;
            
            case '-':
            	r = a - b;
            	System.out.println(a + " - " + b + " = " + r);
            	break;
            
            case '*':
            	r = a * b;
            	System.out.println(a + " * " + b + " = " + r);
            	break;
            
            case '/':
            	r = a / b;
            	System.out.println(a + " / " + b + " = " + r);
            	break;
            
            case '%':
            	r = a % b;
            	System.out.println(a + " % " + b + " = " + r);
            	break;
            
            default:
            System.out.println("INVALID OPERATOR");
        }
    }
}

