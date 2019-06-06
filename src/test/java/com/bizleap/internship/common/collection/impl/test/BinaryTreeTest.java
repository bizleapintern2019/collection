package com.bizleap.internship.common.collection.impl.test;

import org.junit.Test;

import com.bizleap.internship.common.collection.BTree;
import com.bizleap.internship.common.collection.impl.BinaryTreeMax;

public class BinaryTreeTest
{
	@Test
	public void testBinaryTree()
	{
		BTree bt = new BinaryTreeMax();
		
		bt.insert2(50);
		bt.insert2(30);
		bt.insert2(70);
		bt.insert2(20);
		bt.insert2(40);
		bt.insert2(60);
		bt.insert2(90);
//		bt.insert2(10);
//		bt.insert2(22);
//		bt.insert2(80);
//		bt.insert2(96);
//		bt.insert2(3);
//		bt.insert2(12);
//		bt.insert2(21);
//		bt.insert2(26);

		System.out.println(bt.contains(3));
		System.out.println(bt.search(12));
		
		System.out.println("In order : "+bt.inorder());
		System.out.println("Pre order : "+bt.preorder());
		System.out.println("Post order : "+bt.postorder());
		
		bt.delete(20);
		
		System.out.println("\nIn order : "+bt.inorder());
		System.out.println("Pre order : "+bt.preorder());
		System.out.println("Post order : "+bt.postorder());
	}
}