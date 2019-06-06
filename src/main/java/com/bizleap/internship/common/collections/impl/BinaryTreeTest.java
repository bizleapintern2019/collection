package com.bizleap.internship.common.collections.impl;

import java.util.Random;

import org.junit.Test;

public class BinaryTreeTest {
	private void insertNodes(BinaryTree_LargestNode btree) {
//		Random r= new Random();
//		for(int i=0; i<20; i++){
//			btree.insert(r.nextInt(20-0+1));
//		}
		btree.insert(10);
		btree.insert(17);
		btree.insert(1);
		btree.insert(4);
		btree.insert(20);
		btree.insert(19);
		btree.insert(22);
		btree.insert(15);
		btree.insert(6);
		btree.insert(23);
		btree.insert(31);
		btree.insert(71);
		btree.insert(11);
	}

	@Test
	public void binaryTreeTest() {
		BinaryTree_LargestNode btree = new BinaryTree_LargestNode();
		insertNodes(btree);
		System.out.println(btree);
		
		BinaryNode searchedNode =btree.search(22);
		System.out.println("Searched node :"+searchedNode.getValue()+" ,left :" +searchedNode.getLeft()+" ,right :"+searchedNode.getRight().getValue());
		btree.deleteNode(17);
		System.out.println(btree);
		System.out.print("Inorder traversal : ");
		btree.inOrder();
		System.out.print("\n Preorder traversal : ");
		btree.preOrder();
		System.out.print("\n Postorder traversal : ");
		btree.postOrder();
	}

}
