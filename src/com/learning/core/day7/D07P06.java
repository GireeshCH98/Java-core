package com.learning.core.day7;

import java.util.Stack;

public class D07P06 
{
    static class MinStack 
    {
        Stack<Integer> stack;
        int min;

        public MinStack() 
        {
            stack = new Stack<>();
            min = Integer.MAX_VALUE;
        }
        public void push(int x) 
        {
            if (x <= min) 
            {
                stack.push(min);
                min = x;
            }
            stack.push(x);
        }
        public int pop() 
        {
            int popped = stack.pop();
            if (popped == min) 
            {
                min = stack.pop();
            }
            return popped;
        }
        public int getMin() 
        {
            return min;
        }
    }
    public static void main(String[] args) 
    {
        MinStack stack = new MinStack();
        stack.push(16);
        stack.push(15);
        stack.push(29);
        stack.push(19);
        stack.push(18);

        System.out.println(stack.getMin());
    }
}
