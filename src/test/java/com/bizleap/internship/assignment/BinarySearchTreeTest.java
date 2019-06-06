package com.bizleap.internship.assignment;

public class BinarySearchTreeTest {
	public static void main(String[] args) 
	{ 
		BinarySearchTreeMax tree = new BinarySearchTreeMax(); 
		tree.insert(50);  
		tree.insert(60); 
		tree.insert(20);
		tree.insert(55);
		tree.insert(25);
		tree.insert(10);
		tree.insert(30);
		tree.delete(50);
		System.out.println(tree.getRoot());
		tree.inorder();
		/*
		System.out.println("Inorder traversal of the given tree"); 
		tree.inorder();
		System.out.println("");
		tree.preorder();
		System.out.println("");
		tree.postorder();*/
		//System.out.println(tree.search(50));
		/*System.out.println("\nDelete 50"); 
		tree.delete(50); 
		System.out.println("Inorder traversal of the modified tree"); 
		tree.inorder(); 
		System.out.println("");
		System.out.println("Root Node is Now : "+tree.getRoot());
		
		System.out.println("\nDelete 90"); 
		tree.delete(90); 
		System.out.println("Inorder traversal of the modified tree"); 
		tree.inorder(); 
		System.out.println("");
		System.out.println("Root Node is Now : "+tree.getRoot());
		*/
	} 
}
