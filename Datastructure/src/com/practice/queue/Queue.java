package com.practice.queue;
public class Queue {

	private int arr[];
	private int size;
	private int front, rear;

	Queue(int size) {
		arr = new int[size];
		front = rear = -1;
	}

	private void enQueue(int item) {
		if (isFull()) {
			System.out.println("Queue is Full");
		} else {
			if (front == -1)
				front = 0;
			rear++;
			arr[rear] = item;
			System.out.println("Inserted : " + item);
		}
	}

	private int deQueue() {
		int item;
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return (-1);
		} else {
			item = arr[front];
			if (front >= rear) {
				front = rear = -1;
			} else {
				front++;
			}
			System.out.println("Deleted:" + item);
			return item;
		}
	}

	private boolean isFull() {
		return front == 0 && rear == size - 1;
	}

	private boolean isEmpty() {
		return front == -1 && rear == -1;
	}

	void display() {
		/* Function to display elements of Queue */
		int i;
		if (isEmpty()) {
			System.out.println("Empty Queue");
		} else {
			System.out.println("\nFront index-> " + front);
			System.out.println("Items -> ");
			for (i = front; i <= rear; i++)
				System.out.print(arr[i] + "  ");

			System.out.println("\nRear index-> " + rear);
		}
	}

	public static void main(String[] args) {
		  Queue q = new Queue(10);

		    // deQueue is not possible on empty queue
		    q.deQueue();

		    // enQueue 5 elements
		    q.enQueue(1);
		    q.enQueue(2);
		    q.enQueue(3);
		    q.enQueue(4);
		    q.enQueue(5);

		    // 6th element can't be added to because the queue is full
		    q.enQueue(6);

		    q.display();

		    // deQueue removes element entered first i.e. 1
		    q.deQueue();

		    // Now we have just 4 elements
		    q.display();

	}

}
