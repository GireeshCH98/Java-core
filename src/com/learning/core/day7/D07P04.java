package com.learning.core.day7;

import java.util.*;
 
public class D07P04 
{
    public static void main(String[] args)
    { 
        Scanner scan = new Scanner(System.in);
        Stack<Integer> op  = new Stack<Integer>();
        Stack<Integer> val = new Stack<Integer>();
        Stack<Integer> optmp  = new Stack<Integer>();
        Stack<Integer> valtmp = new Stack<Integer>();
        System.out.println("Enter expression");
        String input = scan.next();
        input = "0" + input;
        input = input.replaceAll("-","+-");
        String temp = "";
        for (int i = 0;i < input.length();i++)
        {
            char ch = input.charAt(i);
            if (ch == '-')
                temp = "-" + temp;
            else if (ch != '+' &&  ch != '*' && ch != '/')
               temp = temp + ch;
            else
            {
                val.push(Integer.parseInt(temp));
                op.push((int)ch);
                temp = "";
            }
        }
        val.push(Integer.parseInt(temp));
        char operators[] = {'/','*','+'};
        for (int i = 0; i < 3; i++)
        {
            boolean it = false;
            while (!op.isEmpty())
            {
                int optr = op.pop();
                Integer v1 = val.pop();
                Integer v2 = val.pop();
                if (optr == operators[i])
                {
                    if (i == 0)
                    {
                        valtmp.push(v2 / v1);
                        it = true;
                        break;
                    }
                    else if (i == 1)
                    {
                        valtmp.push(v2 * v1);
                        it = true;
                        break;
                    }
                    else if (i == 2)
                    {
                        valtmp.push(v2 + v1);
                        it = true;
                        break;
                    }                                        
                }
                else
                {
                    valtmp.push(v1);
                    val.push(v2);
                    optmp.push(optr);
                }                
            }              
            while (!valtmp.isEmpty())
                val.push(valtmp.pop());
            while (!optmp.isEmpty())
                op.push(optmp.pop());
            if (it)
                i--;                            
        }    
        System.out.println("Result = "+val.pop());        
    }
}