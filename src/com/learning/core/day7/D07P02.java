package com.learning.core.day7;

class Node {
    double data;
    Node next;

    // Constructor
    Node(double data) {
        this.data = data;
        this.next = null;
    }
}

public class D07P02 {
    Node top;

    // Constructor
    D07P02() {
        this.top = null;
    }

    // Push operation to add elements to the stack
    void push(double data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    // Pop operation to remove elements from the stack
    double pop() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return Double.MIN_VALUE;
        } else {
            double popped = top.data;
            top = top.next;
            return popped;
        }
    }

    // Display the elements of the stack
    void display() {
        Node temp = top;
        System.out.print("The elements of the stack are: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    void display1() {
        Node temp = top;
        System.out.print("After popping twice: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        D07P02 stack = new D07P02();
        // Push elements onto the stack
        stack.push(10.0);
        stack.push(20.0);
        stack.push(30.0);
        stack.push(40.0);
        
        // Display the elements of the stack
        stack.display();
        
        // Pop twice
        stack.pop();
        stack.pop();
        
        // Display the elements of the stack after popping twice
        stack.display1();
    }
}

