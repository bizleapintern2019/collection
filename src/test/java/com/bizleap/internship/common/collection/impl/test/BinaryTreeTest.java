package com.bizleap.internship.common.collection.impl.test;

import org.junit.Test;

import com.bizleap.internship.common.collection.Binary;
import com.bizleap.internship.common.collection.impl.BinaryTree;
import com.bizleap.internship.common.collection.impl.BinaryTreeImplMax;

public class BinaryTreeTest {

	@Test
	public void TreeNode() {

		Binary binaryTree = new BinaryTreeImplMax();

		binaryTree.insert(50);
		binaryTree.insert(30);
		binaryTree.insert(70);
		binaryTree.insert(20);
		binaryTree.insert(40);
		binaryTree.insert(60);
		binaryTree.insert(90);
		binaryTree.insert(10);
		binaryTree.insert(22);
		binaryTree.insert(80);
		binaryTree.insert(96);
		binaryTree.insert(3);
		binaryTree.insert(12);
		binaryTree.insert(21);
		binaryTree.insert(26);
		binaryTree.insert(15);

		binaryTree.delete(21);
		System.out.println("Search Key is "+binaryTree.search(10));
		System.out.println("Binary Tree Test\n");
		System.out.println(binaryTree.countNodes());
		System.out.println(binaryTree.isEmpty());
		System.out.println(binaryTree.search(30) + "\n");

		System.out.println("inOrder\n" + binaryTree.inorder());
		System.out.println();
		System.out.println("preOrder\n" + binaryTree.preorder());
		System.out.println();
		System.out.println("postOrder\n" + binaryTree.postorder());
	}
}