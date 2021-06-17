package com.practice.stack;

public class Stack {
	
	private int arr[];
	private int top;
	private int capacity;
	
	Stack(int size){
		arr=new int[size];
		capacity=size;
		top=-1;
	}
	
	private void push(int x) {
		if(isFull()) {
			System.out.println("stack is full");
			System.exit(1);
		}
		System.out.println("Inserting " + x);
		arr[++top]=x;
	}
	private int pop() {
		if(isEmpty()) {
			System.out.println("stack is Empty");
			System.exit(1);
		}
		return arr[top--];
	}	
	
	private boolean isFull() {
		return top == capacity-1;
	}
	private  boolean isEmpty() {
		return top== -1;
	}
	private void printStack() {
		for(int i=0;i<=top;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
	
		 Stack stack = new Stack(5);

		    stack.push(1);
		    stack.push(2);
		    stack.push(3);
		    stack.push(4);

		    stack.pop();
		    stack.pop();
		  
		    System.out.println("\nAfter popping out");

		    stack.printStack();

		
	}

}
