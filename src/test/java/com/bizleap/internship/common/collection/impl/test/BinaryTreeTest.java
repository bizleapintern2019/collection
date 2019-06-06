package com.bizleap.internship.common.collection.impl.test;

import com.bizleap.internship.common.collection.impl.BinarySearchTree;
import com.bizleap.internship.common.collection.impl.BinaryTree;
import com.bizleap.internship.common.collection.impl.Orders;
import com.bizleap.internship.common.collections.BTree;
public class BinaryTreeTest {
	
	public static void main (String [] Args){
		
		BTree bTree = new BinaryTree();                
		Orders orders = new Orders();
		BTree bSTree= new BinarySearchTree();
		bSTree.insert(12,"A");
		bSTree.insert(4,"B");
		bSTree.insert(3,"C");
		bSTree.insert(1,"D");
		bSTree.insert(5,"E");
		bSTree.insert(15,"F");
		bSTree.insert(18,"G");
		bSTree.insert(11,"H");
		bSTree.insert(16,"I");
		bSTree.insert(20,"J");
	//	System.out.println("Root:"+bTree.getRoot());
		bSTree.delete(12);
		orders.preOrder(bSTree.getRoot()); 
		Object Node = bSTree.search(1);

		if(Node !=null)
			System.out.println("Data in Node with Key 1 = " + Node);
		System.exit(0);

	}
}
