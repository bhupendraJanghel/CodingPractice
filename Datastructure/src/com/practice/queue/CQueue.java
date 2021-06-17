package com.practice.queue;

public class CQueue {

	private int SIZE = 5;
	private int[] items = new int[SIZE];
	private int front, rear;

	CQueue() {
		front = -1;
		rear = -1;
	}

	boolean isFull() {
		return rear == SIZE - 1 && front == 0;
	}

	boolean isEmpty() {
		return front == -1; // rear never set to -1;
	}

	void enQueue(int item) {
		if (!isFull()) {
			if (front == -1)
				front = 0;
			rear = (rear + 1) % SIZE;        //rear value again set to 0 after value 4
			items[rear] = item;
			System.out.println("Inserted:" + item);
		} else {
			System.out.println("Queue is Full");
		}
	}
	
	int deQueue(){
		int element;
		if(!isEmpty()) {
			element=items[front];
			if(front==rear) {
				front=-1;
				rear=-1;
			}else {
				front=(front+1)%SIZE;
			}
			return element;
		}else {
			System.out.println("Queue is Empty");
			return -1;
		}
		
	}

	void display() {
		/* Function to display status of Circular Queue */
		int i;
		if (isEmpty()) {
			System.out.println("Empty Queue");
		} else {
			System.out.println("Front -> " + front);
			System.out.println("Items -> ");
			for (i = front; i != rear; i = (i + 1) % SIZE)
				System.out.print(items[i] + " ");
			System.out.println(items[i]);
			System.out.println("Rear -> " + rear);
		}
	}

	public static void main(String[] args) {

		CQueue q = new CQueue();

		// Fails because front = -1
		q.deQueue();

		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);

		// Fails to enqueue because front == 0 && rear == SIZE - 1
		q.enQueue(6);

		q.display();

		int elem = q.deQueue();

		if (elem != -1) {
			System.out.println("Deleted Element is " + elem);
		}
		q.display();

		q.enQueue(7);

		q.display();

		// Fails to enqueue because front == rear + 1
		q.enQueue(8);
	}

}

/*
 * Applications of Circular Queue 
 * CPU scheduling 
 * Memory management 
 * Traffic Management
 */