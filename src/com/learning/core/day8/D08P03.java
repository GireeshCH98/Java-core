package com.learning.core.day8;

import java.util.*;

class CircularQueue 
{
    private int front, rear, size;
    private int capacity;
    private int[] array;

    public CircularQueue(int capacity) 
    {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }

    boolean isFull() {
        return (size == capacity);
    }

    boolean isEmpty() {
        return (size == 0);
    }

    void enqueue(int item) 
    {
        if (isFull())
            return;
        rear = (rear + 1) % capacity;
        array[rear] = item;
        size++;
    }

    int dequeue() 
    {
        if (isEmpty())
            return Integer.MIN_VALUE;

        int item = array[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    void printCircularQueue() 
    {
        if (isEmpty()) {
            System.out.println("Circular Queue is empty.");
            return;
        }
        int count = 0;
        int i = front;
        while (count < size) 
        {
            System.out.print(array[i] + " ");
            i = (i + 1) % capacity;
            count++;
        }
        System.out.println();
    }
}
public class D08P03 
{
    public static void main(String[] args) 
    {
        CircularQueue circularQueue = new CircularQueue(4);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 Elements into the CircularQueue");
        for(int i=1;i<=4;i++)
        {
        	circularQueue.enqueue(sc.nextInt());
        }
       /* circularQueue.enqueue(14);
        circularQueue.enqueue(13);
        circularQueue.enqueue(22);
        circularQueue.enqueue(-8); */
        System.out.print("Elements in circular queue: ");
        circularQueue.printCircularQueue();

        int removed = circularQueue.dequeue();
        System.out.print("After removing first element: ");
        circularQueue.printCircularQueue();
    }
}

