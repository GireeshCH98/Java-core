package com.learning.core.day8;

class Queue {
    private int front, rear, size;
    private int capacity;
    private int[] array;

    public Queue(int capacity) {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }

    boolean isFull(Queue queue) {
        return (queue.size == queue.capacity);
    }

    boolean isEmpty(Queue queue) {
        return (queue.size == 0);
    }

    void enqueue(int item) {
        if (isFull(this))
            return;
        this.rear = (this.rear + 1) % this.capacity;
        this.array[this.rear] = item;
        this.size = this.size + 1;
    }

    int dequeue() 
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        int item = this.array[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size = this.size - 1;
        return item;
    }

    void printQueue()
    {
        if (isEmpty(this)) {
            System.out.println("Queue is empty.");
            return;
        }

        for (int i = 0; i < this.size; i++) {
            int index = (front + i) % capacity;
            System.out.print(this.array[index] + " ");
        }
        System.out.println();
    }
}

public class D08P02 
{
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(89);
        queue.enqueue(99);
        queue.enqueue(109);
        queue.enqueue(209);
        queue.enqueue(309);

        System.out.print("Elements in queue: ");
        queue.printQueue();

        int removed = queue.dequeue();
        int removed1 = queue.dequeue();
        System.out.print("After removing first element: ");
        queue.printQueue();
    }
}
