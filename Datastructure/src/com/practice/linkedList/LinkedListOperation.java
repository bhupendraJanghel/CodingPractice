package com.practice.linkedList;

public class LinkedListOperation {

	Node head;

	 class Node {
		int value;
		Node next;

		 Node(int val) {
			value = val;
			next = null;
		}
	}

	public void insertAtBeginning(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;
	}

	public void insertAtEnd(int val) {
		Node new_node = new Node(val);
		if (head == null) {
			head = new Node(val);
			return;
		}
		new_node.next = null;
		Node last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = new_node;
		return;
	}

	public void insertAfter(Node prev_node, int data) {
		if (prev_node == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}
		Node new_node = new Node(data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}

	public void deleteNode(int pos) {
		if (head == null)
			return;
		Node node = head; // create a node which pointing the head

		if (pos == 0) {
			head = node.next;
			return;
		}
		for (int i = 0; i < pos - 1 && node != null; i++) {
			node = node.next; // we will get the node which is having position 2
		}
		if (node == null || node.next == null)
			return;
		Node next = node.next.next; // create next node which is at position 4 and skip the position 3(deleted node)
		node.next = next; // assign node at position 2 to position 4

	}

	public void printList() {
		Node node = head;
		while (node != null) {
			System.out.print(node.value + "->");
			node=node.next;
		}
	}

	public static void main(String[] args) {

		LinkedListOperation llist = new LinkedListOperation();

		llist.insertAtEnd(1);
		llist.insertAtBeginning(2);
		llist.insertAtBeginning(3);
		llist.insertAtEnd(4);
		llist.insertAfter(llist.head.next, 5);

		System.out.println("Linked list: ");
		llist.printList();

		System.out.println("\nAfter deleting an element: ");
		llist.deleteNode(3);
		llist.printList();
	}

}
