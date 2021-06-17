package com.practice.linkedList;

public class LinkedList {

	//creating head Node
	Node head;

	static class Node {
		int value;
		Node next;
			
		Node(int val) {
			value = val;
			next = null;
		}
	}

	public static void main(String[] args) {

		LinkedList linkedList=new LinkedList();
		
		//Assign new Values
		linkedList.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		
		//Connecting node:
		
		linkedList.head.next=second;
		second.next=third;
		
		//printing the nodes
		while(linkedList.head!=null) {
			System.out.println(linkedList.head.value+", ");
			linkedList.head = linkedList.head.next;
		}
	}

}
