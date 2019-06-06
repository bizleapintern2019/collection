package com.bizleap.internship.assignments.common.collections.impl.test;

import com.bizleap.intern.assignment.collections.impl.BinaryTree;
import com.bizleap.internship.assignments.common.collection.BinaryTreeInterface;

public class BinaryTreeTest {

	public static void main(String[] args) {
		BinaryTreeInterface b=new BinaryTree();
		b.insert(50);
		b.insert(30);
		b.insert(70);
		b.insert(20);
		b.insert(40);
		b.insert(60);
		b.insert(90);
		b.insert(10);
		b.insert(22);
		b.insert(80);
		b.insert(92);
		b.insert(3);
		b.insert(12);
		b.insert(21);
		b.insert(26);
		System.out.println("");
		System.out.println("***********************************");
		System.out.println("In order: "+b.inorder());
		System.out.println(" Pre order "+b.preorder());
		System.out.println(" Post order "+b.postorder());
		System.out.println(" ");
		System.out.println("Contain whether Node with value  exists : " + b.contains(70));
		b.delete(20);
		//b.delete(11);
		System.out.println("Contain value 20 :"+b.contains(20));
		//System.out.println("Contain value 11 :"+b.contains(11));
		System.out.println("In order: "+b.inorder());
		System.out.println(" Pre order "+b.preorder());
		System.out.println(" Post order "+b.postorder());
		System.out.println();
	}
}
