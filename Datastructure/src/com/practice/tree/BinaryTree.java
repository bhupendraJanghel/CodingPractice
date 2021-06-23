package com.practice.tree;

//traversal of Binary Tree
class Node {
	int item;
	Node left, right;

	public Node(int value) {
		item = value;
		left = right = null;
	}

}

public class BinaryTree {

	Node root;

	BinaryTree() {
		root = null;
	}

	// Postorder traversal
	void postOrder(Node node) {
		if (node == null)
			return;

		// traverse left
		postOrder(node.left);

		// traverse right
		postOrder(node.right);

		// traverse root
		System.out.print(node.item + "-> ");
	}

	// preorder traversal
	void preOrder(Node node) {
		if (node == null)
			return;
		// traverse root
		System.out.print(node.item + "-> ");

		// traverse left
		preOrder(node.left);

		// traverse right
		preOrder(node.right);
	}

	// inorder traversal
	void inOrder(Node node) {
		if (node == null)
			return;

		// traverse left
		inOrder(node.left);

		// traverse root
		System.out.print(node.item + "-> ");

		// traverse right
		inOrder(node.right);
	}

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.print("Post Order traversal : ");
		tree.postOrder(tree.root);
		System.out.print("\nPre Order traversal : ");
		tree.preOrder(tree.root);
		System.out.print("\nIn Order traversal : ");
		tree.inOrder(tree.root);

	}

}
