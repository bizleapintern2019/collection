package com.bizleap.internship.common.collection.impl;

import com.bizleap.internship.common.collection.impl.test.BinaryTreeTest;

public class TreeTraversalTest extends BinaryTreeTest{
	
	public void preOrder(BinaryNode node){
     if (node != null)
       {
       System.out.println(node);
       preOrder(node.getLeft());
       preOrder(node.getRight());
       }
     }

   public void inOrder(BinaryNode node){
     if (node != null)
       {
       inOrder(node.getLeft());
       System.out.println(node.getData());
       inOrder(node.getRight());
       }
     }

public void postOrder(BinaryNode node){
     if (node != null)
       {
       postOrder(node.getLeft());
       postOrder(node.getRight());
       System.out.println(node.getData());
       }
     }
}
