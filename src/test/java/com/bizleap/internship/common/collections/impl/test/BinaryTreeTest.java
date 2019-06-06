package com.bizleap.internship.common.collections.impl.test;

import org.junit.Test;

import com.bizleap.internship.common.collections.impl.BinarySearchTree;

public class BinaryTreeTest {
	@Test
	public void binaryTreeTest() {
		BinarySearchTree bt = new BinarySearchTree();

		/*bt.add(50);
		bt.add(30);
		bt.add(70);
		bt.add(20);
		bt.add(40);
		bt.add(60);
		bt.add(90);
    	bt.add(10);
		bt.add(26);
		bt.add(80);
		bt.add(92);*/
		
		bt.add2(3);
		bt.add2(12);
		bt.add2(21);
		bt.add2(28);
		bt.add2(24);

		System.out.println(bt.containsNode(60));
		System.out.println(bt.containsNode(40));
		System.out.println(bt.containsNode(11));
		System.out.println(bt.search(10));

		bt.delete(24);
		
		System.out.println(bt.inorder());
		System.out.println(bt.preorder());
		System.out.println(bt.postorder());
	}
}
