package com.practice.tree;


/*A full Binary tree is a special type of binary tree in which every
 *  parent node/internal node has either two or no children.*/

class Node1 {
	int item;
	Node1 leftChild, rightChild;

	public Node1(int value) {
		item = value;
		leftChild = rightChild = null;
	}
}

public class FullBinaryTree {

	Node1 root;

	public FullBinaryTree() {
		root = null;
	}

	public boolean isFullBinaryTree(Node1 node) {    //checking for full BinaryTree
		
		if(node==null)
			return true;
		if(node.leftChild==null&& node.rightChild==null)
			return true;
		if(node.leftChild!=null && node.rightChild!=null)
			return isFullBinaryTree(node.leftChild) && isFullBinaryTree(node.rightChild);
		
		return false;
	}

	public static void main(String arg[]) {

		FullBinaryTree tree = new FullBinaryTree();
		tree.root = new Node1(1);
		tree.root.leftChild = new Node1(2);
		tree.root.rightChild = new Node1(3);
		tree.root.leftChild.leftChild = new Node1(4);
		tree.root.leftChild.rightChild = new Node1(5);
		tree.root.rightChild.leftChild = new Node1(6);
		tree.root.rightChild.rightChild = new Node1(7);

		if (tree.isFullBinaryTree(tree.root))
			System.out.print("The tree is a full binary tree");
		else
			System.out.print("The tree is not a full binary tree");
	}

}
