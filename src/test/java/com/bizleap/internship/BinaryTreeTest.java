package com.bizleap.internship;


import org.junit.Test;

import com.bizleap.intenship.common.collection.Binary;
import com.bizleap.intenship.common.collection.impl.BinaryTree;

public class BinaryTreeTest {
	
	public void treeTest() {
		Binary bt = new BinaryTree();
		bt.insert(50);
		bt.insert(30);
		bt.insert(70);
		bt.insert(20);
		bt.insert(40);
		bt.insert(60);
		bt.insert(90);
		bt.insert(10);
		bt.insert(22);
		bt.insert(80);
		bt.insert(96);
		bt.insert(3);
		bt.insert(12);
		bt.insert(21);
		bt.insert(26);
		System.out.println(bt.contain(12));

		System.out.println("\n\nBinary Tree Test");
		System.out.print("\nIn order : "+bt.inorder());
		System.out.print("\nPre order : "+bt.preorder());
		System.out.print("\nPost order : "+bt.postorder());
		
		bt.delete(20);		
		System.out.println("\n\nBinary Tree Test");
		System.out.print("\nIn order : "+bt.inorder());
		System.out.print("\nPre order : "+bt.preorder());
		System.out.print("\nPost order : "+bt.postorder());
		
		bt.delete(50);
		System.out.println("\n\nBinary Tree Test");
		System.out.print("\nIn order : "+bt.inorder());
		System.out.print("\nPre order : "+bt.preorder());
		System.out.print("\nPost order : "+bt.postorder());
	}
	
	@Test
	public  void BinaryTree() {
		new BinaryTreeTest().treeTest();
	}
}
