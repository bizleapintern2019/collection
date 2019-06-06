package com.bizleap.internship;

import com.bizleap.internship.common.collections.impl.BinaryTree;

public class BinaryTreeTest {

	public static void main(String[] args) {            

		BinaryTree bt = new BinaryTree(); 

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
		bt.insert(92);
		bt.insert(3);
		bt.insert(12);
		bt.insert(21);
		bt.insert(26);

		System.out.println("Search 50: " + bt.contains(50));
		System.out.println("Search 12: " + bt.contains(12));
		System.out.println("Search 3: " + bt.contains(3));
		System.out.println("Search 26: " + bt.contains(26));
		System.out.println("Search 100: " + bt.contains(100));

		System.out.print("\nPost order : ");
		bt.postOrder();
		System.out.print("\nPre order : ");
		bt.preOrder();
		System.out.print("\nIn order : ");
		bt.inOrder();
		
		System.out.println("\n");
		bt.delete(50);
		System.out.println("Search 50: " + bt.contains(50));
		
		System.out.print("\nPost order : ");
		bt.postOrder();
		System.out.print("\nPre order : ");
		bt.preOrder();
		System.out.print("\nIn order : ");
		bt.inOrder();
	}
}