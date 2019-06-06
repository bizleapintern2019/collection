package com.bizleap.internship.assignments.common.collections.impl.test;
import org.junit.Test;
import com.bizleap.internship.assignments.common.collections.impl.BinaryNode;
import com.bizleap.internship.assignments.common.collections.impl.BinarySearchLargestNode;
import com.bizleap.internship.assignments.common.collections.impl.BinaryTree;
public class BinaryTreeSearchTest {

	private void insertNodes(BinarySearchLargestNode binaryTree) {
//		for(int i=10; i<=100; i+=10) {
			binaryTree.insert(50);
			binaryTree.insert(30);
			binaryTree.insert(70);
			binaryTree.insert(20);
			binaryTree.insert(40);
			binaryTree.insert(60);
			binaryTree.insert(90);
			binaryTree.insert(10);
			binaryTree.insert(22);
			binaryTree.insert(3);
			binaryTree.insert(12);
			binaryTree.insert(21);
			binaryTree.insert(26);
//		}
	}
	
	@Test
	public void binaryTreeSearchTest() {
//		BinaryTree binaryTree = new BinaryTree();
//		insertNodes(binaryTree);
		
		BinarySearchLargestNode binarySearchLargestNode = new BinarySearchLargestNode();
		insertNodes(binarySearchLargestNode);
		
//		System.out.println(binaryTree.contains(30));
		binarySearchLargestNode.deleteNode(20);
//		System.out.println(binaryTree);
		
		BinaryNode searchNode = binarySearchLargestNode.search(21);
		System.out.println("Searching node: " + searchNode.getValue() + " Left: " + searchNode.getLeft() + " Right: " + searchNode.getRight() + "\n");
		
		System.out.print("Inorder tree traversal:");
		binarySearchLargestNode.inOrder();
		System.out.print("\nPreorder tree traversal:");
		binarySearchLargestNode.preOrder();
		System.out.print("\nPostorder tree traversal:");
		binarySearchLargestNode.postOrder();
	}
}